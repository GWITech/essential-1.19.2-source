package gg.essential.gui.screenshot.handler;

import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.gson.*;
import java.lang.reflect.*;
import java.util.*;
import com.sparkuniverse.toolbox.util.*;
import com.sparkuniverse.toolbox.serialization.*;
import java.util.concurrent.*;
import com.google.common.collect.*;
import kotlin.io.*;
import java.nio.charset.*;
import java.util.function.*;
import java.nio.file.*;
import org.jetbrains.annotations.*;
import java.io.*;
import org.apache.commons.io.*;
import gg.essential.util.*;
import gg.essential.handlers.screenshot.*;
import gg.essential.network.connectionmanager.media.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000R
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010%
                                                   \u0002\u0010\u000e
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010#
                                                   \u0002\u0010"
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b	\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\fH\u0002J\u000e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\fJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\r2\u0006\u0010 \u001a\u00020\fH\u0002J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010"\u001a\u00020\rJ\u0010\u0010#\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0002R\u0016\u0010\u0007\u001a
                                                    	*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010
                                                   \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R2\u0010\u000e\u001a&\u0012\f\u0012
                                                    	*\u0004\u0018\u00010\f0\f 	*\u0012\u0012\f\u0012
                                                    	*\u0004\u0018\u00010\f0\f\u0018\u00010\u00100\u000fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006$""" }, d2 = { "Lgg/essential/gui/screenshot/handler/ScreenshotMetadataManager;", "", "metadataFolder", "Ljava/io/File;", "screenshotChecksumManager", "Lgg/essential/gui/screenshot/handler/ScreenshotChecksumManager;", "(Ljava/io/File;Lgg/essential/gui/screenshot/handler/ScreenshotChecksumManager;)V", "gson", "Lgg/essential/lib/gson/Gson;", "kotlin.jvm.PlatformType", "metadataCache", "", "", "Lgg/essential/handlers/screenshot/ClientScreenshotMetadata;", "negativeChecksumCache", "", "", "createMetadata", "time", "Lcom/sparkuniverse/toolbox/util/DateTime;", "checksum", "deleteMetadata", "", "metadata", "file", "getMetadata", "path", "Ljava/nio/file/Path;", "getOrCreateMetadata", "handleExternalDelete", "fileName", "readMetadata", "imageChecksum", "updateMetadata", "screenshotMetadata", "writeMetadata", "essential" })
public final class ScreenshotMetadataManager
{
    @NotNull
    private final File metadataFolder;
    @NotNull
    private final ScreenshotChecksumManager screenshotChecksumManager;
    private final Gson gson;
    @NotNull
    private final Map<String, ClientScreenshotMetadata> metadataCache;
    private final Set<String> negativeChecksumCache;
    
    public ScreenshotMetadataManager(@NotNull final File metadataFolder, @NotNull final ScreenshotChecksumManager screenshotChecksumManager) {
        Intrinsics.checkNotNullParameter((Object)metadataFolder, "metadataFolder");
        Intrinsics.checkNotNullParameter((Object)screenshotChecksumManager, "screenshotChecksumManager");
        super();
        this.metadataFolder = metadataFolder;
        this.screenshotChecksumManager = screenshotChecksumManager;
        this.gson = new GsonBuilder().registerTypeAdapter(UUID.class, new UUIDTypeAdapter()).registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter()).create();
        this.metadataCache = new ConcurrentHashMap<String, ClientScreenshotMetadata>();
        this.negativeChecksumCache = Sets.newConcurrentHashSet();
    }
    
    public final void updateMetadata(@NotNull final ClientScreenshotMetadata screenshotMetadata) {
        Intrinsics.checkNotNullParameter((Object)screenshotMetadata, "screenshotMetadata");
        this.metadataCache.put(screenshotMetadata.getChecksum(), screenshotMetadata);
        this.writeMetadata(screenshotMetadata);
    }
    
    private final ClientScreenshotMetadata readMetadata(final String imageChecksum) {
        try {
            final String fileContents = FilesKt.readText$default(new File(this.metadataFolder, imageChecksum), (Charset)null, 1, (Object)null);
            return this.gson.fromJson(fileContents, ClientScreenshotMetadata.class);
        }
        catch (final FileNotFoundException ex) {
            return null;
        }
    }
    
    private final ClientScreenshotMetadata getMetadata(final String checksum) {
        if (this.negativeChecksumCache.contains(checksum)) {
            return null;
        }
        final ClientScreenshotMetadata metadata = this.metadataCache.compute(checksum, ScreenshotMetadataManager::getMetadata$lambda-0);
        if (metadata == null) {
            this.negativeChecksumCache.add(checksum);
        }
        return metadata;
    }
    
    @Nullable
    public final ClientScreenshotMetadata getMetadata(@NotNull final Path path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        final File file = path.toFile();
        Intrinsics.checkNotNullExpressionValue((Object)file, "path.toFile()");
        return this.getMetadata(file);
    }
    
    @Nullable
    public final ClientScreenshotMetadata getMetadata(@NotNull final File file) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        final String value = this.screenshotChecksumManager.get(file);
        if (value == null) {
            return null;
        }
        final String imageChecksum = value;
        return this.getMetadata(imageChecksum);
    }
    
    private final void writeMetadata(final ClientScreenshotMetadata metadata) {
        this.negativeChecksumCache.remove(metadata.getChecksum());
        try {
            final File file = new File(this.metadataFolder, metadata.getChecksum());
            final String json = this.gson.toJson(metadata);
            Intrinsics.checkNotNullExpressionValue((Object)json, "gson.toJson(metadata)");
            FilesKt.writeText$default(file, json, (Charset)null, 2, (Object)null);
        }
        catch (final IOException e) {
            e.printStackTrace();
        }
    }
    
    public final void handleExternalDelete(@NotNull final String fileName) {
        Intrinsics.checkNotNullParameter((Object)fileName, "fileName");
        final String remove = this.screenshotChecksumManager.remove(fileName);
        if (remove == null) {
            return;
        }
        final String checksum = remove;
        final ClientScreenshotMetadata metadata = this.getMetadata(checksum);
        if (metadata != null) {
            this.deleteMetadata(metadata);
        }
    }
    
    private final void deleteMetadata(final ClientScreenshotMetadata metadata) {
        final File metadataFile = new File(this.metadataFolder, metadata.getChecksum());
        this.metadataCache.remove(metadata.getChecksum());
        FileUtils.deleteQuietly(metadataFile);
    }
    
    public final void deleteMetadata(@NotNull final File file) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        final ClientScreenshotMetadata metadata = this.getMetadata(file);
        if (metadata != null) {
            this.deleteMetadata(metadata);
            this.screenshotChecksumManager.delete(file);
        }
    }
    
    @NotNull
    public final ClientScreenshotMetadata createMetadata(@NotNull final DateTime time, @NotNull final String checksum) {
        Intrinsics.checkNotNullParameter((Object)time, "time");
        Intrinsics.checkNotNullParameter((Object)checksum, "checksum");
        final UUID clientUUID = UUIDUtil.getClientUUID();
        Intrinsics.checkNotNullExpressionValue((Object)clientUUID, "getClientUUID()");
        return new ClientScreenshotMetadata(clientUUID, time, checksum, null, new ClientScreenshotMetadata$Location(ClientScreenshotMetadata$Location$Type.UNKNOWN, "Unknown"));
    }
    
    @NotNull
    public final synchronized ClientScreenshotMetadata getOrCreateMetadata(@NotNull final Path path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        final File file = path.toFile();
        Intrinsics.checkNotNullExpressionValue((Object)file, "file");
        final ClientScreenshotMetadata existingMetadata = this.getMetadata(file);
        if (existingMetadata != null) {
            return existingMetadata;
        }
        final String value = this.screenshotChecksumManager.get(file);
        if (value == null) {
            throw new IllegalStateException("No checksum for file " + file + ". Was the file deleted?");
        }
        final String checksum = value;
        final DateTime imageTime = ScreenshotManager.getImageTime(path, null, false);
        Intrinsics.checkNotNullExpressionValue((Object)imageTime, "getImageTime(path, null, false)");
        final ClientScreenshotMetadata it = this.createMetadata(imageTime, checksum);
        this.updateMetadata(it);
        return it;
    }
    
    private static final ClientScreenshotMetadata getMetadata$lambda-0(final ScreenshotMetadataManager this$0, final String $checksum, final String s, final ClientScreenshotMetadata it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$checksum, "$checksum");
        Intrinsics.checkNotNullParameter((Object)s, "<anonymous parameter 0>");
        ClientScreenshotMetadata metadata = it;
        if (it == null) {
            metadata = this$0.readMetadata($checksum);
        }
        return metadata;
    }
}
