package gg.essential.network.connectionmanager.media;

import gg.essential.util.lwjgl3.api.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.gui.screenshot.concurrent.*;
import gg.essential.gui.screenshot.providers.*;
import gg.essential.gui.screenshot.handler.*;
import gg.essential.lib.gson.*;
import gg.essential.handlers.io.*;
import gg.essential.util.lwjgl3.*;
import com.google.common.collect.*;
import gg.essential.network.connectionmanager.handler.screenshot.*;
import gg.essential.network.connectionmanager.handler.*;
import gg.essential.*;
import java.nio.file.attribute.*;
import io.netty.buffer.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.connectionmanager.common.packet.*;
import java.nio.file.*;
import gg.essential.gui.screenshot.*;
import java.util.function.*;
import gg.essential.universal.*;
import net.minecraft.client.*;
import org.apache.commons.io.*;
import java.time.temporal.*;
import gg.essential.media.model.*;
import gg.essential.connectionmanager.common.packet.media.*;
import com.sparkuniverse.toolbox.util.*;
import gg.essential.util.*;
import net.minecraft.client.gui.screen.*;
import java.util.concurrent.*;
import javax.imageio.*;
import java.io.*;
import org.apache.commons.codec.digest.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.screenshot.image.*;
import gg.essential.gui.notification.*;
import gg.essential.gui.screenshot.components.*;
import gg.essential.handlers.screenshot.*;
import java.awt.image.*;
import java.nio.charset.*;
import gg.essential.event.render.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.config.*;
import gg.essential.handlers.*;
import net.minecraft.client.util.*;
import net.minecraft.text.*;
import java.util.*;
import java.lang.reflect.*;
import java.lang.invoke.*;

public class ScreenshotManager implements NetworkedManager
{
    private final NativeImageReader nativeImageReader;
    private final File screenshotFolder;
    private final File editorStateFile;
    private final Set<Media> uploadedScreenshots;
    private final ConnectionManager connectionManager;
    private final ScreenshotMetadataManager screenshotMetadataManager;
    private final Set<String> screenshotFiles;
    private final PriorityThreadPoolExecutor backgroundExecutor;
    private final FileCachedWindowedImageProvider minResolutionProvider;
    private int frameCounter;
    private HSBColor[] screenshotColors;
    private final ScreenshotChecksumManager screenshotChecksumManager;
    @NotNull
    private final Gson gson;
    private final DirectoryWatcher screenshotFolderWatcher;
    
    public ScreenshotManager(final ConnectionManager connectionManager, final File baseDir, final Lwjgl3Loader lwjgl3) {
        super();
        this.uploadedScreenshots = new HashSet<Media>();
        this.screenshotFiles = Sets.newConcurrentHashSet();
        this.backgroundExecutor = new PriorityThreadPoolExecutor(1);
        this.frameCounter = -1;
        this.gson = new Gson();
        (this.connectionManager = connectionManager).registerPacketHandler(ServerMediaPopulatePacket.class, new ServerScreenshotListPacketHandler(this));
        File screenshotFolder = new File(UMinecraft.getMinecraft().runDirectory, "screenshots");
        if (!screenshotFolder.exists()) {
            Essential.logger.debug("Screenshot directory not found. Creating...");
            try {
                Files.createDirectories(screenshotFolder.toPath(), (FileAttribute<?>[])new FileAttribute[0]);
                Essential.logger.debug("Created screenshot directory.");
            }
            catch (final IOException e) {
                Essential.logger.error("Failed to create screenshot directory.", (Throwable)e);
            }
        }
        try {
            screenshotFolder = screenshotFolder.getCanonicalFile();
        }
        catch (final IOException e) {
            Essential.logger.error("Failed to resolve screenshot directory.", (Throwable)e);
        }
        this.screenshotFolder = screenshotFolder;
        final File metadataFolder = new File(baseDir, "screenshot-metadata");
        if (!metadataFolder.exists()) {
            Essential.logger.debug("Screenshot metadata directory not found. Creating...");
            try {
                Files.createDirectories(metadataFolder.toPath(), (FileAttribute<?>[])new FileAttribute[0]);
                Essential.logger.debug("Created screenshot metadata directory.");
            }
            catch (final IOException e2) {
                Essential.logger.error("Failed to create screenshot metadata directory.", (Throwable)e2);
            }
        }
        this.nativeImageReader = lwjgl3.get(NativeImageReader.class);
        this.editorStateFile = new File(baseDir, "screenshot-editor.json");
        this.screenshotChecksumManager = new ScreenshotChecksumManager(new File(baseDir, "screenshot-checksum-caches.json"));
        this.screenshotMetadataManager = new ScreenshotMetadataManager(metadataFolder, this.screenshotChecksumManager);
        Essential.EVENT_BUS.register(this);
        this.minResolutionProvider = ScreenshotProviderManager.Companion.createFileCachedBicubicProvider(ScreenshotProviderManager.minResolutionTargetResolution, this.backgroundExecutor, (ByteBufAllocator)UnpooledByteBufAllocator.DEFAULT, baseDir, this.nativeImageReader, true);
        Multithreading.runAsync(this::preloadScreenshots);
        (this.screenshotFolderWatcher = new DirectoryWatcher(screenshotFolder.toPath(), TimeUnit.SECONDS)).onBatchUpdate((Function1<? super List<FileSystemEvent>, Unit>)this::flushFilesystemOperationsQueue);
    }
    
    @Override
    public void onConnected() {
        this.connectionManager.send(new ClientMediaRequestPacket(null));
    }
    
    private void preloadScreenshots() {
        final File[] files = this.screenshotFolder.listFiles();
        if (files != null) {
            for (final File file : files) {
                if (this.fileNameMatchesImage(file.getName())) {
                    this.screenshotFiles.add(file.getName());
                    this.precompute(file);
                    this.getScreenshotMetadataManager().getMetadata(file);
                }
            }
        }
    }
    
    private boolean fileNameMatchesImage(final String fileName) {
        return fileName.endsWith(".png") && fileName.length() > 4;
    }
    
    public NativeImageReader getNativeImageReader() {
        return this.nativeImageReader;
    }
    
    public CompletableFuture<Media> uploadAndCopyLinkToClipboard(final Path path) {
        return this.uploadAndCopyLinkToClipboard(path, this.screenshotMetadataManager.getOrCreateMetadata(path));
    }
    
    public CompletableFuture<Media> uploadAndCopyLinkToClipboard(final Path path, final ClientScreenshotMetadata metadata) {
        final Media existingMediaIfPresent = this.getUploadedMedia(path);
        if (existingMediaIfPresent != null) {
            return CompletableFuture.completedFuture(existingMediaIfPresent);
        }
        final CompletableFuture<Media> uploadFuture = new CompletableFuture<Media>();
        final Consumer<ScreenshotUploadToast.ToastProgress> progressConsumer = ScreenshotOverlay.INSTANCE.pushUpload();
        this.connectionManager.send(new ClientMediaGetUploadUrlPacket(), packetOptional -> {
            final Packet packet = packetOptional.orElse(null);
            if (!(packet instanceof ServerMediaUploadUrlPacket)) {
                if (packet == null) {
                    uploadFuture.completeExceptionally(new ScreenshotUploadException("No response"));
                }
                else {
                    uploadFuture.completeExceptionally(new ScreenshotUploadException("Unexpected response: " + packet));
                }
            }
            else {
                progressConsumer.accept(new ScreenshotUploadToast.ToastProgress.Step(25));
                Multithreading.runAsync(() -> this.upload(path, metadata, (ServerMediaUploadUrlPacket)packet, progressConsumer, uploadFuture));
            }
            return;
        });
        uploadFuture.whenCompleteAsync((media, throwable) -> {
            if (throwable != null) {
                throwable.printStackTrace();
                if (throwable instanceof ScreenshotUploadException) {
                    progressConsumer.accept(new ScreenshotUploadToast.ToastProgress.Complete("Failed: " + throwable.getMessage(), false));
                }
                else {
                    progressConsumer.accept(new ScreenshotUploadToast.ToastProgress.Complete("Failed: An unknown error occurred", false));
                }
            }
            else if (media != null) {
                final MediaVariant embed = media.getVariants().get("embed");
                if (embed == null) {
                    progressConsumer.accept(new ScreenshotUploadToast.ToastProgress.Complete("Error: Media link not supplied", false));
                }
                else {
                    UDesktop.setClipboardString(embed.getUrl());
                    progressConsumer.accept(new ScreenshotUploadToast.ToastProgress.Complete("Link copied to clipboard.", true));
                }
            }
            return;
        }, ExtensionsKt.getExecutor(MinecraftClient.getInstance()));
        return uploadFuture;
    }
    
    public void screenshotsReceived(final List<Media> screenshots) {
        if (screenshots == null) {
            return;
        }
        this.uploadedScreenshots.addAll(screenshots);
    }
    
    private void upload(final Path path, @NotNull final ClientScreenshotMetadata metadata, final ServerMediaUploadUrlPacket packet, final Consumer<ScreenshotUploadToast.ToastProgress> progressConsumer, final CompletableFuture<Media> uploadFuture) {
        try {
            if (ScreenshotUploadUtil.INSTANCE.httpUpload(packet.getUploadUrl(), FileUtils.readFileToByteArray(path.toFile()))) {
                progressConsumer.accept((ScreenshotUploadToast.ToastProgress)new ScreenshotUploadToast.ToastProgress.Step(50));
                UUIDUtil.getName(metadata.getAuthorId()).whenCompleteAsync((username, throwable) -> {
                    if (throwable != null) {
                        UUIDUtil.getName(UUIDUtil.getClientUUID()).whenCompleteAsync((username1, throwable1) -> {
                            if (throwable1 != null) {
                                uploadFuture.completeExceptionally(new ScreenshotUploadException("Unable to resolve current users username", throwable1));
                            }
                            else {
                                this.completeUpload(metadata, packet, progressConsumer, uploadFuture, username1);
                            }
                        }, ExtensionsKt.getExecutor(MinecraftClient.getInstance()));
                    }
                    else {
                        this.completeUpload(metadata, packet, progressConsumer, uploadFuture, username);
                    }
                }, ExtensionsKt.getExecutor(MinecraftClient.getInstance()));
            }
            else {
                uploadFuture.completeExceptionally(new ScreenshotUploadException("Unable to upload file to Cloudflare Images"));
            }
        }
        catch (final IOException e) {
            uploadFuture.completeExceptionally(new ScreenshotUploadException("Unable to upload file to Cloudflare Images", e));
        }
    }
    
    private void completeUpload(@NotNull final ClientScreenshotMetadata metadata, final ServerMediaUploadUrlPacket packet, final Consumer<ScreenshotUploadToast.ToastProgress> progressConsumer, final CompletableFuture<Media> uploadFuture, final String username) {
        progressConsumer.accept((ScreenshotUploadToast.ToastProgress)new ScreenshotUploadToast.ToastProgress.Step(75));
        final DateTime time = (metadata.getEditTime() != null) ? metadata.getEditTime() : metadata.getTime();
        final String identifier = metadata.getLocationMetadata().getIdentifier();
        this.connectionManager.send(new ClientMediaCreatePacket(packet.getMediaId(), username + "'s Screenshot", "Captured " + HelpersKt.formatDateAndTime(time.toInstant()), new MediaMetadata(metadata.getAuthorId(), time, new MediaLocationMetadata(metadata.getLocationMetadata().getType().toNetworkType(), identifier, (identifier == null) ? null : this.connectionManager.getSpsManager().getHostFromSpsAddress(identifier)), metadata.getFavorite(), metadata.getEdited())), packetOptional -> {
            final Packet packet2 = packetOptional.orElse(null);
            if (!(packet2 instanceof ServerMediaPopulatePacket)) {
                uploadFuture.completeExceptionally(new ScreenshotUploadException("Server gave unexpected response"));
            }
            else {
                uploadFuture.complete(((ServerMediaPopulatePacket)packet2).getMedias().get(0));
            }
            metadata.setMediaId(packet.getMediaId());
            Multithreading.runAsync(() -> this.screenshotMetadataManager.updateMetadata(metadata));
        });
    }
    
    public ClientScreenshotMetadata getCurrentMetadata() {
        String identifier = "Unknown";
        ClientScreenshotMetadata.Location.Type type = ClientScreenshotMetadata.Location.Type.UNKNOWN;
        if (MinecraftClient.getInstance().getCurrentServerEntry() != null) {
            final String address = MinecraftClient.getInstance().getCurrentServerEntry().address;
            if (this.connectionManager.getSpsManager().isSpsAddress(address)) {
                final UUID spsHost = this.connectionManager.getSpsManager().getHostFromSpsAddress(address);
                if (spsHost != null) {
                    identifier = address;
                    type = ClientScreenshotMetadata.Location.Type.SHARED_WORLD;
                }
            }
            if ("Unknown".equals(identifier)) {
                type = ClientScreenshotMetadata.Location.Type.MULTIPLAYER;
                identifier = MinecraftClient.getInstance().getCurrentServerEntry().address;
            }
        }
        else {
            final String currentWorldFile = MinecraftUtils.INSTANCE.getWorldName();
            if (currentWorldFile != null) {
                identifier = currentWorldFile;
                type = ClientScreenshotMetadata.Location.Type.SINGLE_PLAYER;
            }
            else {
                final Screen guiScreen = GuiUtil.INSTANCE.openedScreen();
                if (guiScreen != null) {
                    identifier = GuiUtil.INSTANCE.getScreenName(guiScreen);
                    type = ClientScreenshotMetadata.Location.Type.MENU;
                }
            }
        }
        return new ClientScreenshotMetadata(UUIDUtil.getClientUUID(), new DateTime(System.currentTimeMillis()), "checksum", null, new ClientScreenshotMetadata.Location(type, identifier), false, false, null);
    }
    
    private void precompute(final File source) {
        this.backgroundExecutor.submit((Callable<Object>)new ScreenshotManager.PrecomputeTask(source, this.minResolutionProvider));
    }
    
    public void handleNewScreenshot(final File imgFile, final ClientScreenshotMetadata metadata, final boolean showOverlay) {
        this.screenshotChecksumManager.set(imgFile, metadata.getChecksum());
        this.screenshotMetadataManager.updateMetadata(metadata);
        this.screenshotFiles.add(imgFile.getName());
        this.precompute(imgFile);
        if (showOverlay) {
            ExtensionsKt.getExecutor(MinecraftClient.getInstance()).execute(() -> ScreenshotOverlay.INSTANCE.push(imgFile));
        }
        ExtensionsKt.getExecutor(MinecraftClient.getInstance()).execute(() -> {
            final Screen currentScreen = MinecraftClient.getInstance().currentScreen;
            if (currentScreen instanceof final ScreenshotBrowser browser) {
                browser.getProviderManager().reloadItems();
                browser.getListViewComponent().reload();
            }
        });
    }
    
    private String saveScreenshot(final RenderedImage image, final File destination) throws IOException {
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        ImageIO.write(image, "png", os);
        final byte[] data = os.toByteArray();
        FileUtils.writeByteArrayToFile(destination, data);
        return DigestUtils.md5Hex(data);
    }
    
    @Nullable
    public String getChecksum(final File file) {
        return this.screenshotChecksumManager.get(file);
    }
    
    public Media getUploadedMedia(final String mediaId) {
        if (mediaId == null) {
            return null;
        }
        for (final Media uploadedScreenshot : this.uploadedScreenshots) {
            if (uploadedScreenshot.getId().equals(mediaId)) {
                return uploadedScreenshot;
            }
        }
        return null;
    }
    
    public Media getUploadedMedia(final Path path) {
        return this.getUploadedMedia(this.screenshotMetadataManager.getOrCreateMetadata(path).getMediaId());
    }
    
    public void copyScreenshotToClipboard(final File screenshot) {
        this.copyScreenshotToClipboard(screenshot, "Successfully copied " + screenshot.getName() + " to clipboard.");
    }
    
    public void copyScreenshotToClipboard(final File screenshot, final String successMessage) {
        try (final ForkedImageClipboard clipboard = new ForkedImageClipboard()) {
            if (clipboard.copy(screenshot)) {
                Notifications.INSTANCE.push("Copied Screenshot", successMessage);
            }
            else {
                Notifications.INSTANCE.push("Error Copying Screenshot", "An unknown error occurred. Check logs for details");
            }
        }
    }
    
    public File getScreenshotFolder() {
        return this.screenshotFolder;
    }
    
    public ClientScreenshotMetadata setFavorite(final Path path, final boolean favorite) {
        final ClientScreenshotMetadata metadata = this.screenshotMetadataManager.getOrCreateMetadata(path);
        metadata.setFavorite(favorite);
        this.screenshotMetadataManager.updateMetadata(metadata);
        return metadata;
    }
    
    public static DateTime getImageTime(final Path path, @Nullable final ClientScreenshotMetadata metadata, final boolean includeEditTime) {
        return HelpersKt.getImageTime(new ScreenshotProperties(path, metadata), includeEditTime);
    }
    
    public ScreenshotMetadataManager getScreenshotMetadataManager() {
        return this.screenshotMetadataManager;
    }
    
    private Unit flushFilesystemOperationsQueue(final List<FileSystemEvent> events) {
        final List<FileSystemEvent> items = FileSystemEventKt.filterRedundancy((List)events);
        final Set<Path> deletedPaths = new HashSet<Path>();
        boolean anyNewItems = false;
        for (final FileSystemEvent event : items) {
            if (!this.fileNameMatchesImage(event.getPath().getFileName().toString())) {
                continue;
            }
            switch (ScreenshotManager.ScreenshotManager$1.$SwitchMap$gg$essential$handlers$screenshot$FileEventType[event.getEventType().ordinal()]) {
                case 1: {
                    if (this.screenshotFiles.add(event.getPath().getFileName().toString())) {
                        anyNewItems = true;
                        continue;
                    }
                    continue;
                }
                case 2: {
                    if (this.handleDelete(event.getPath().toFile(), true)) {
                        deletedPaths.add(event.getPath());
                        continue;
                    }
                    continue;
                }
                case 3: {
                    throw new AssertionError((Object)"MODIFY should have been replaced with DELETE+CREATE");
                }
            }
        }
        final Screen currentScreen = MinecraftClient.getInstance().currentScreen;
        if (currentScreen instanceof final ScreenshotBrowser browser) {
            if (!deletedPaths.isEmpty()) {
                browser.externalDelete(deletedPaths);
            }
            else if (anyNewItems) {
                browser.getProviderManager().reloadItems();
                browser.getListViewComponent().reload();
            }
        }
        return Unit.INSTANCE;
    }
    
    public boolean handleDelete(@NotNull final File file, final boolean external) {
        final File screenshot_cache = new File(Essential.getInstance().getBaseDir(), "screenshot-cache");
        if (screenshot_cache.exists()) {
            final File[] files = screenshot_cache.listFiles();
            if (files != null) {
                for (final File directory : files) {
                    if (directory.isDirectory()) {
                        final File downsampledCache = new File(directory, file.getName());
                        downsampledCache.delete();
                    }
                }
            }
        }
        final boolean mutated = this.screenshotFiles.remove(file.getName());
        ScreenshotOverlay.INSTANCE.delete(file);
        if (external) {
            this.getScreenshotMetadataManager().handleExternalDelete(file.getName());
        }
        else {
            this.getScreenshotMetadataManager().deleteMetadata(file);
            file.delete();
        }
        return mutated;
    }
    
    @NotNull
    public List<Path> getOrderedPaths() {
        return HelpersKt.getOrderedPaths(this.screenshotFiles, this.screenshotFolder.toPath(), (Function1<? super Path, ? extends DateTime>)(path -> getImageTime(path, this.screenshotMetadataManager.getMetadata(path), true)));
    }
    
    private File getEditedName(final ScreenshotProperties source) {
        final String base = source.getPath().getFileName().toString().replaceFirst("(_edited(_\\d+)?)?\\.png", "");
        int i = 1;
        File file1;
        while (true) {
            file1 = new File(this.screenshotFolder, base + "_edited" + ((i == 1) ? "" : /* invokedynamic(!) */ProcyonInvokeDynamicHelper_1.invoke(i)) + ".png");
            if (!file1.exists()) {
                break;
            }
            ++i;
        }
        return file1;
    }
    
    public File handleScreenshotEdited(@NotNull final ScreenshotProperties source, @NotNull final BufferedImage screenshot, @NotNull final ScreenshotBrowser browser, final boolean favorite, final boolean viewAfter) {
        final File output = this.getEditedName(source);
        final ClientScreenshotMetadata originalMetadata = this.screenshotMetadataManager.getOrCreateMetadata(source.getPath());
        try {
            final String checksum = this.saveScreenshot(screenshot, output);
            this.screenshotMetadataManager.updateMetadata(new ClientScreenshotMetadata(originalMetadata.getAuthorId(), originalMetadata.getTime(), checksum, new DateTime(System.currentTimeMillis()), originalMetadata.getLocationMetadata(), favorite, true, null));
            this.screenshotFiles.add(output.getName());
            ExtensionsKt.getExecutor(MinecraftClient.getInstance()).execute(() -> {
                Notifications.INSTANCE.push("Screenshot saved", "Saved changes as copy.");
                browser.editCallback(output.toPath(), viewAfter);
                return;
            });
            return output;
        }
        catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void updateEditorColors(final HSBColor[] colors) {
        if (Arrays.equals(this.screenshotColors, colors)) {
            return;
        }
        this.screenshotColors = colors;
        try {
            FileUtils.write(this.editorStateFile, this.gson.toJson(colors), StandardCharsets.UTF_8);
        }
        catch (final IOException e) {
            e.printStackTrace();
        }
    }
    
    public HSBColor[] getEditorColors() {
        if (this.screenshotColors == null) {
            if (this.editorStateFile.exists()) {
                try {
                    this.screenshotColors = this.gson.fromJson(FileUtils.readFileToString(this.editorStateFile, StandardCharsets.UTF_8), HSBColor[].class);
                }
                catch (final IOException e) {
                    e.printStackTrace();
                }
            }
            if (this.screenshotColors == null || this.screenshotColors.length != 5) {
                this.screenshotColors = new HSBColor[] { new HSBColor(13836577), new HSBColor(15382016), new HSBColor(3901999), new HSBColor(34303), new HSBColor(0) };
            }
        }
        return this.screenshotColors;
    }
    
    private boolean hasOverlay() {
        return Notifications.INSTANCE.hasActiveNotifications() || ScreenshotOverlay.INSTANCE.hasActiveNotifications();
    }
    
    public void handleScreenshotKeyPressed() {
        if (this.hasOverlay()) {
            Notifications.INSTANCE.hide();
            ScreenshotOverlay.INSTANCE.hide();
            this.frameCounter = 2;
        }
        else {
            this.takeNow();
        }
    }
    
    @Subscribe
    public void tick(final RenderTickEvent event) {
        if (!event.isPre()) {
            return;
        }
        if (this.frameCounter > 0) {
            --this.frameCounter;
        }
        if (this.frameCounter == 0) {
            this.frameCounter = -1;
            this.takeNow();
            Notifications.INSTANCE.show();
            ScreenshotOverlay.INSTANCE.show();
        }
    }
    
    public boolean suppressBufferSwap() {
        return this.frameCounter == 1;
    }
    
    private void takeNow() {
        final MinecraftClient mc = MinecraftClient.getInstance();
        if (EssentialConfig.INSTANCE.getScreenshotSounds()) {
            EssentialSoundManager.INSTANCE.playScreenshotSound();
        }
        ScreenshotRecorder.saveScreenshot(mc.runDirectory, mc.getFramebuffer(), message -> this.screenshotMessageCallback(message));
    }
    
    private void screenshotMessageCallback(final Text component) {
        if (EssentialConfig.INSTANCE.getEnableVanillaScreenshotMessage()) {
            MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(component);
        }
    }
    
    private /* synthetic */ void lambda$takeNow$12(final Text message) {
        this.screenshotMessageCallback(message);
    }
    
    private static /* synthetic */ void lambda$handleScreenshotEdited$11(final ScreenshotBrowser browser, final File output, final boolean viewAfter) {
        Notifications.INSTANCE.push("Screenshot saved", "Saved changes as copy.");
        browser.editCallback(output.toPath(), viewAfter);
    }
    
    private /* synthetic */ DateTime lambda$getOrderedPaths$10(final Path path) {
        return getImageTime(path, this.screenshotMetadataManager.getMetadata(path), true);
    }
    
    private static /* synthetic */ void lambda$handleNewScreenshot$9() {
        final Screen currentScreen = MinecraftClient.getInstance().currentScreen;
        if (currentScreen instanceof final ScreenshotBrowser browser) {
            browser.getProviderManager().reloadItems();
            browser.getListViewComponent().reload();
        }
    }
    
    private static /* synthetic */ void lambda$handleNewScreenshot$8(final File imgFile) {
        ScreenshotOverlay.INSTANCE.push(imgFile);
    }
    
    private /* synthetic */ void lambda$completeUpload$6(final CompletableFuture uploadFuture, final ClientScreenshotMetadata metadata, final ServerMediaUploadUrlPacket packet, final Optional packetOptional) {
        final Packet packet2 = packetOptional.orElse(null);
        if (!(packet2 instanceof ServerMediaPopulatePacket)) {
            uploadFuture.completeExceptionally(new ScreenshotUploadException("Server gave unexpected response"));
        }
        else {
            uploadFuture.complete(((ServerMediaPopulatePacket)packet2).getMedias().get(0));
        }
        metadata.setMediaId(packet.getMediaId());
        Multithreading.runAsync(() -> this.screenshotMetadataManager.updateMetadata(metadata));
    }
    
    private /* synthetic */ void lambda$completeUpload$5(final ClientScreenshotMetadata metadata) {
        this.screenshotMetadataManager.updateMetadata(metadata);
    }
    
    private /* synthetic */ void lambda$upload$4(final CompletableFuture uploadFuture, final ClientScreenshotMetadata metadata, final ServerMediaUploadUrlPacket packet, final Consumer progressConsumer, final String username, final Throwable throwable) {
        if (throwable != null) {
            UUIDUtil.getName(UUIDUtil.getClientUUID()).whenCompleteAsync((username1, throwable1) -> {
                if (throwable1 != null) {
                    uploadFuture.completeExceptionally(new ScreenshotUploadException("Unable to resolve current users username", throwable1));
                }
                else {
                    this.completeUpload(metadata, packet, progressConsumer, uploadFuture, username1);
                }
            }, ExtensionsKt.getExecutor(MinecraftClient.getInstance()));
        }
        else {
            this.completeUpload(metadata, packet, progressConsumer, uploadFuture, username);
        }
    }
    
    private /* synthetic */ void lambda$upload$3(final CompletableFuture uploadFuture, final ClientScreenshotMetadata metadata, final ServerMediaUploadUrlPacket packet, final Consumer progressConsumer, final String username1, final Throwable throwable1) {
        if (throwable1 != null) {
            uploadFuture.completeExceptionally(new ScreenshotUploadException("Unable to resolve current users username", throwable1));
        }
        else {
            this.completeUpload(metadata, packet, progressConsumer, uploadFuture, username1);
        }
    }
    
    private static /* synthetic */ void lambda$uploadAndCopyLinkToClipboard$2(final Consumer progressConsumer, final Media media, final Throwable throwable) {
        if (throwable != null) {
            throwable.printStackTrace();
            if (throwable instanceof ScreenshotUploadException) {
                progressConsumer.accept(new ScreenshotUploadToast.ToastProgress.Complete("Failed: " + throwable.getMessage(), false));
            }
            else {
                progressConsumer.accept(new ScreenshotUploadToast.ToastProgress.Complete("Failed: An unknown error occurred", false));
            }
        }
        else if (media != null) {
            final MediaVariant embed = media.getVariants().get("embed");
            if (embed == null) {
                progressConsumer.accept(new ScreenshotUploadToast.ToastProgress.Complete("Error: Media link not supplied", false));
                return;
            }
            UDesktop.setClipboardString(embed.getUrl());
            progressConsumer.accept(new ScreenshotUploadToast.ToastProgress.Complete("Link copied to clipboard.", true));
        }
    }
    
    private /* synthetic */ void lambda$uploadAndCopyLinkToClipboard$1(final CompletableFuture uploadFuture, final Consumer progressConsumer, final Path path, final ClientScreenshotMetadata metadata, final Optional packetOptional) {
        final Packet packet = packetOptional.orElse(null);
        if (!(packet instanceof ServerMediaUploadUrlPacket)) {
            if (packet == null) {
                uploadFuture.completeExceptionally(new ScreenshotUploadException("No response"));
            }
            else {
                uploadFuture.completeExceptionally(new ScreenshotUploadException("Unexpected response: " + packet));
            }
        }
        else {
            progressConsumer.accept(new ScreenshotUploadToast.ToastProgress.Step(25));
            Multithreading.runAsync(() -> this.upload(path, metadata, (ServerMediaUploadUrlPacket)packet, progressConsumer, uploadFuture));
        }
    }
    
    private /* synthetic */ void lambda$uploadAndCopyLinkToClipboard$0(final Path path, final ClientScreenshotMetadata metadata, final Packet packet, final Consumer progressConsumer, final CompletableFuture uploadFuture) {
        this.upload(path, metadata, (ServerMediaUploadUrlPacket)packet, progressConsumer, uploadFuture);
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_1
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_1.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_1.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_1.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_1.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_1.LOOKUP;
                try {
                    handle = ((CallSite)StringConcatFactory.makeConcatWithConstants(lookup, "makeConcatWithConstants", MethodType.methodType(String.class, int.class), "_\u0001")).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_1.fence = 1;
                ProcyonInvokeDynamicHelper_1.handle = handle;
                ProcyonInvokeDynamicHelper_1.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0) {
            try {
                return ProcyonInvokeDynamicHelper_1.handle().invokeExact(p0);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
