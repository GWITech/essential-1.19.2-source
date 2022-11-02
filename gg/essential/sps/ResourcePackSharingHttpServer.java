package gg.essential.sps;

import gg.essential.network.connectionmanager.sps.*;
import org.jetbrains.annotations.*;
import java.net.*;
import net.minecraft.util.profiler.*;
import java.util.concurrent.*;
import kotlin.jvm.internal.*;
import gg.essential.api.utils.*;
import com.sun.net.httpserver.*;
import net.minecraft.client.*;
import kotlin.collections.*;
import gg.essential.mixins.transformers.resources.*;
import gg.essential.*;
import kotlin.io.*;
import org.apache.commons.codec.digest.*;
import java.io.*;
import kotlin.*;
import java.nio.file.*;
import kotlin.io.path.*;
import java.util.zip.*;
import java.util.*;
import net.minecraft.resource.*;
import gg.essential.universal.*;
import gg.essential.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0082\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u00013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J
                                                   \u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0002JJ\u0010\u001e\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010 0\u001f2\u0006\u0010!\u001a\u00020"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-H\u0002J\u0006\u0010.\u001a\u00020\u000fJ\u0006\u0010/\u001a\u00020\u000fJ\b\u00100\u001a\u00020\u000fH\u0002J\u0018\u00101\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001aH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010	\u001a\u0004\u0018\u00010
                                                   X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0013\u0010\u000b\u001a\u00070\f¢\u0006\u0002\b\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u00064""" }, d2 = { "Lgg/essential/sps/ResourcePackSharingHttpServer;", "Lnet/minecraft/resource/ResourceReloader;", "()V", "packInfo", "Lgg/essential/sps/ResourcePackSharingHttpServer$PackInfo;", "port", "", "getPort", "()Ljava/lang/Integer;", "server", "Lcom/sun/net/httpserver/HttpServer;", "spsManager", "Lgg/essential/network/connectionmanager/sps/SPSManager;", "Lorg/jetbrains/annotations/NotNull;", "addFileToZip", "", "rootPath", "Ljava/nio/file/Path;", "srcFile", "zip", "Ljava/util/zip/ZipOutputStream;", "addFolderToZip", "srcFolder", "getChecksum", "", "file", "Ljava/io/File;", "getPrimaryResourcePack", "Lnet/minecraft/resource/ResourcePack;", "recomputePrimaryPack", "reload", "Ljava/util/concurrent/CompletableFuture;", "Ljava/lang/Void;", "stage", "Lnet/minecraft/resource/ResourceReloader$Synchronizer;", "resourceManager", "Lnet/minecraft/resource/ResourceManager;", "preparationsProfiler", "Lnet/minecraft/util/profiler/Profiler;", "reloadProfiler", "backgroundExecutor", "Ljava/util/concurrent/Executor;", "gameExecutor", "sendFile", "exchange", "Lcom/sun/net/httpserver/HttpExchange;", "startServer", "stopServer", "updateResourcePack", "zipFolder", "destZipFile", "PackInfo", "essential" })
public final class ResourcePackSharingHttpServer implements ResourceReloader
{
    @NotNull
    public static final ResourcePackSharingHttpServer INSTANCE;
    @NotNull
    private static final SPSManager spsManager;
    @Nullable
    private static HttpServer server;
    @Nullable
    private static PackInfo packInfo;
    
    private ResourcePackSharingHttpServer() {
        super();
    }
    
    @Nullable
    public final Integer getPort() {
        final HttpServer server = ResourcePackSharingHttpServer.server;
        if (server != null) {
            final InetSocketAddress address = server.getAddress();
            if (address != null) {
                return address.getPort();
            }
        }
        return null;
    }
    
    @NotNull
    public CompletableFuture<Void> reload(@NotNull final ResourceReloader$Synchronizer stage, @Nullable final ResourceManager resourceManager, @Nullable final Profiler preparationsProfiler, @Nullable final Profiler reloadProfiler, @Nullable final Executor backgroundExecutor, @Nullable final Executor gameExecutor) {
        Intrinsics.checkNotNullParameter((Object)stage, "stage");
        this.updateResourcePack();
        final CompletableFuture whenPrepared = stage.whenPrepared((Object)null);
        Intrinsics.checkNotNullExpressionValue((Object)whenPrepared, "stage.whenPrepared(null)");
        return whenPrepared;
    }
    
    public final void startServer() {
        final HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 0), 0);
        server.createContext("/", ResourcePackSharingHttpServer::startServer$lambda-1);
        server.setExecutor(Multithreading.getPool());
        server.start();
        ResourcePackSharingHttpServer.server = server;
    }
    
    public final void stopServer() {
        final HttpServer server = ResourcePackSharingHttpServer.server;
        if (server != null) {
            server.stop(0);
        }
        ResourcePackSharingHttpServer.server = null;
    }
    
    private final void sendFile(final File file, final HttpExchange exchange) {
        exchange.sendResponseHeaders(200, file.length());
        final Closeable closeable = new FileInputStream(file);
        Throwable t = null;
        try {
            final FileInputStream it = (FileInputStream)closeable;
            final InputStream inputStream = it;
            final OutputStream responseBody = exchange.getResponseBody();
            Intrinsics.checkNotNullExpressionValue((Object)responseBody, "exchange.responseBody");
            ByteStreamsKt.copyTo$default(inputStream, responseBody, 0, 2, (Object)null);
        }
        catch (final Throwable t2) {
            t = t2;
            throw t2;
        }
        finally {
            CloseableKt.closeFinally(closeable, t);
        }
        exchange.getResponseBody().close();
    }
    
    private final ResourcePack getPrimaryResourcePack() {
        final ResourcePackManager resourcePackRepository = MinecraftClient.getInstance().getResourcePackManager();
        final Collection repositoryEntries = resourcePackRepository.getEnabledProfiles();
        if (repositoryEntries.isEmpty()) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue((Object)repositoryEntries, "repositoryEntries");
        return ((ResourcePackProfile)CollectionsKt.last((Iterable)repositoryEntries)).createResourcePack();
    }
    
    private final void updateResourcePack() {
        this.recomputePrimaryPack();
        ResourcePackSharingHttpServer.spsManager.updateResourcePack(ResourcePackSharingHttpServer.packInfo);
    }
    
    private final void recomputePrimaryPack() {
        final PackInfo packInfo2;
        final PackInfo packInfo = packInfo2 = ResourcePackSharingHttpServer.packInfo;
        if (packInfo2 != null && packInfo2.isTemp()) {
            packInfo.getFile().delete();
        }
        final ResourcePack resourcePack = this.getPrimaryResourcePack();
        if (resourcePack == null) {
            ResourcePackSharingHttpServer.packInfo = null;
            return;
        }
        if (resourcePack instanceof final AbstractResourcePackAccessor abstractResourcePackAccessor) {
            final File file = abstractResourcePackAccessor.getResourcePackFile();
            if (file == null) {
                ResourcePackSharingHttpServer.packInfo = null;
                return;
            }
            if (file.isDirectory()) {
                final File tempFile = File.createTempFile("resource-pack", ".zip");
                Essential.logger.info("Zipping host resource pack to " + tempFile);
                final File srcFolder = file;
                Intrinsics.checkNotNullExpressionValue((Object)tempFile, "tempFile");
                this.zipFolder(srcFolder, tempFile);
                ResourcePackSharingHttpServer.packInfo = new PackInfo(tempFile, this.getChecksum(tempFile), true);
            }
            else if (file.exists()) {
                ResourcePackSharingHttpServer.packInfo = new PackInfo(file, this.getChecksum(file), false);
            }
            else {
                ResourcePackSharingHttpServer.packInfo = null;
                Essential.logger.error("Unable to determine primary resource pack: " + resourcePack.getName() + " " + resourcePack.getClass().getName() + " " + file);
            }
        }
        else {
            ResourcePackSharingHttpServer.packInfo = null;
            Essential.logger.error("Unable to determine primary resource pack: " + resourcePack.getName() + " " + resourcePack.getClass().getName());
        }
    }
    
    private final String getChecksum(final File file) {
        final String sha1Hex = DigestUtils.sha1Hex(FilesKt.readBytes(file));
        Intrinsics.checkNotNullExpressionValue((Object)sha1Hex, "sha1Hex(file.readBytes())");
        return sha1Hex;
    }
    
    private final void zipFolder(final File srcFolder, final File destZipFile) throws Exception {
        final Closeable closeable = new FileOutputStream(destZipFile);
        Throwable t = null;
        try {
            final FileOutputStream fileWriter = (FileOutputStream)closeable;
            final Closeable closeable2 = new ZipOutputStream(fileWriter);
            Throwable t2 = null;
            try {
                final ZipOutputStream zip = (ZipOutputStream)closeable2;
                final ResourcePackSharingHttpServer instance = ResourcePackSharingHttpServer.INSTANCE;
                final Path path = srcFolder.toPath();
                Intrinsics.checkNotNullExpressionValue((Object)path, "srcFolder.toPath()");
                final Path path2 = srcFolder.toPath();
                Intrinsics.checkNotNullExpressionValue((Object)path2, "srcFolder.toPath()");
                instance.addFolderToZip(path, path2, zip);
                final Unit instance2 = Unit.INSTANCE;
            }
            catch (final Throwable t3) {
                t2 = t3;
                throw t3;
            }
            finally {
                CloseableKt.closeFinally(closeable2, t2);
            }
            final Unit instance3 = Unit.INSTANCE;
        }
        catch (final Throwable t4) {
            t = t4;
            throw t4;
        }
        finally {
            CloseableKt.closeFinally(closeable, t);
        }
    }
    
    private final void addFileToZip(final Path rootPath, final Path srcFile, final ZipOutputStream zip) throws Exception {
        if (Files.isDirectory(srcFile, (LinkOption[])Arrays.copyOf(new LinkOption[0], 0))) {
            this.addFolderToZip(rootPath, srcFile, zip);
        }
        else {
            final byte[] buf = new byte[1024];
            final Closeable closeable = new FileInputStream(srcFile.toFile());
            Throwable t = null;
            try {
                final FileInputStream in = (FileInputStream)closeable;
                final String name = PathsKt.relativeTo(srcFile, rootPath).toString();
                zip.putNextEntry(new ZipEntry(name));
                while (true) {
                    final int len = in.read(buf);
                    if (len <= 0) {
                        break;
                    }
                    zip.write(buf, 0, len);
                }
                final Unit instance = Unit.INSTANCE;
            }
            catch (final Throwable t2) {
                t = t2;
                throw t2;
            }
            finally {
                CloseableKt.closeFinally(closeable, t);
            }
        }
    }
    
    private final void addFolderToZip(final Path rootPath, final Path srcFolder, final ZipOutputStream zip) throws Exception {
        for (final Path fileName : PathsKt.listDirectoryEntries$default(srcFolder, (String)null, 1, (Object)null)) {
            this.addFileToZip(rootPath, fileName, zip);
        }
    }
    
    private static final void _init_$lambda-0() {
        ResourcePackSharingHttpServer.INSTANCE.updateResourcePack();
        final ResourceManager resourceManager = MinecraftClient.getInstance().getResourceManager();
        if (resourceManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type net.minecraft.resource.ReloadableResourceManagerImpl");
        }
        ((ReloadableResourceManagerImpl)resourceManager).registerReloader((ResourceReloader)ResourcePackSharingHttpServer.INSTANCE);
    }
    
    private static final void startServer$lambda-1(final HttpExchange it) {
        if (ResourcePackSharingHttpServer.spsManager.getLocalSession() == null || !ResourcePackSharingHttpServer.spsManager.isShareResourcePack()) {
            it.sendResponseHeaders(403, 0L);
            it.getResponseBody().close();
            return;
        }
        final PackInfo packInfo = ResourcePackSharingHttpServer.packInfo;
        if (packInfo == null) {
            it.sendResponseHeaders(404, 0L);
            it.getResponseBody().close();
        }
        else {
            try {
                final ResourcePackSharingHttpServer instance = ResourcePackSharingHttpServer.INSTANCE;
                final File file = packInfo.getFile();
                Intrinsics.checkNotNullExpressionValue((Object)it, "it");
                instance.sendFile(file, it);
            }
            catch (final Exception e) {
                e.printStackTrace();
                it.getResponseBody().close();
            }
        }
    }
    
    static {
        INSTANCE = new ResourcePackSharingHttpServer();
        final SPSManager spsManager2 = Essential.getInstance().getConnectionManager().getSpsManager();
        Intrinsics.checkNotNullExpressionValue((Object)spsManager2, "getInstance().connectionManager.spsManager");
        spsManager = spsManager2;
        ExtensionsKt.getExecutor(UMinecraft.getMinecraft()).execute(ResourcePackSharingHttpServer::_init_$lambda-0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000&
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000
                                                       \u0002\u0010\u000b
                                                       \u0002\b\r
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ	\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J	\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J	\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                       \u0000\u001a\u0004\b	\u0010
                                                       R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0006\u0010¨\u0006\u0017""" }, d2 = { "Lgg/essential/sps/ResourcePackSharingHttpServer$PackInfo;", "", "file", "Ljava/io/File;", "checksum", "", "isTemp", "", "(Ljava/io/File;Ljava/lang/String;Z)V", "getChecksum", "()Ljava/lang/String;", "getFile", "()Ljava/io/File;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "essential" })
    public static final class PackInfo
    {
        @NotNull
        private final File file;
        @NotNull
        private final String checksum;
        private final boolean isTemp;
        
        public PackInfo(@NotNull final File file, @NotNull final String checksum, final boolean isTemp) {
            Intrinsics.checkNotNullParameter((Object)file, "file");
            Intrinsics.checkNotNullParameter((Object)checksum, "checksum");
            super();
            this.file = file;
            this.checksum = checksum;
            this.isTemp = isTemp;
        }
        
        @NotNull
        public final File getFile() {
            return this.file;
        }
        
        @NotNull
        public final String getChecksum() {
            return this.checksum;
        }
        
        public final boolean isTemp() {
            return this.isTemp;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "PackInfo(file=" + this.file + ", checksum=" + this.checksum + ", isTemp=" + this.isTemp;
        }
        
        @Override
        public int hashCode() {
            int result = this.file.hashCode();
            result = result * 31 + this.checksum.hashCode();
            final int n = result * 31;
            int isTemp;
            if ((isTemp = (this.isTemp ? 1 : 0)) != 0) {
                isTemp = 1;
            }
            result = n + isTemp;
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackInfo)) {
                return false;
            }
            final PackInfo packInfo = (PackInfo)other;
            return Intrinsics.areEqual((Object)this.file, (Object)packInfo.file) && Intrinsics.areEqual((Object)this.checksum, (Object)packInfo.checksum) && this.isTemp == packInfo.isTemp;
        }
    }
}
