package gg.essential.util.kdiscordipc;

import kotlin.*;
import java.net.*;
import org.jetbrains.annotations.*;
import gg.essential.lib.kdiscordipc.core.socket.*;
import java.lang.reflect.*;
import java.nio.file.attribute.*;
import java.io.*;
import kotlin.io.*;
import java.nio.file.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b" }, d2 = { "Lgg/essential/util/kdiscordipc/KDiscordIPCLoader;", "", "()V", "loader", "Lgg/essential/util/kdiscordipc/RelaunchClassLoader;", "getPlatformSocket", "Lgg/essential/lib/kdiscordipc/core/socket/Socket;", "Companion", "kdiscordipc" })
public final class KDiscordIPCLoader
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final RelaunchClassLoader loader;
    @Nullable
    private static URL extractedBundleJar;
    
    public KDiscordIPCLoader() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0         /* this */
        //     5: new             Lgg/essential/util/kdiscordipc/RelaunchClassLoader;
        //     8: dup            
        //     9: iconst_1       
        //    10: anewarray       Ljava/net/URL;
        //    13: astore_1       
        //    14: aload_1        
        //    15: iconst_0       
        //    16: getstatic       gg/essential/util/kdiscordipc/KDiscordIPCLoader.Companion:Lgg/essential/util/kdiscordipc/KDiscordIPCLoader$Companion;
        //    19: invokestatic    gg/essential/util/kdiscordipc/KDiscordIPCLoader$Companion.access$findExtractedBundleJar:(Lgg/essential/util/kdiscordipc/KDiscordIPCLoader$Companion;)Ljava/net/URL;
        //    22: aastore        
        //    23: aload_1        
        //    24: aload_0         /* this */
        //    25: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    28: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    31: invokespecial   gg/essential/util/kdiscordipc/RelaunchClassLoader.<init>:([Ljava/net/URL;Ljava/lang/ClassLoader;)V
        //    34: astore_1       
        //    35: aload_1        
        //    36: astore_2       
        //    37: astore_3       
        //    38: aload_2        
        //    39: ldc             Lgg/essential/lib/kdiscordipc/core/socket/Socket;.class
        //    41: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    44: invokevirtual   gg/essential/util/kdiscordipc/RelaunchClassLoader.addClassExclusion:(Ljava/lang/String;)V
        //    47: aload_2        
        //    48: ldc             Lgg/essential/lib/kdiscordipc/core/socket/RawPacket;.class
        //    50: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    53: invokevirtual   gg/essential/util/kdiscordipc/RelaunchClassLoader.addClassExclusion:(Ljava/lang/String;)V
        //    56: aload_2        
        //    57: ldc             "kotlin."
        //    59: invokevirtual   gg/essential/util/kdiscordipc/RelaunchClassLoader.addPackageExclusion:(Ljava/lang/String;)V
        //    62: aload_2        
        //    63: ldc             "kotlinx."
        //    65: invokevirtual   gg/essential/util/kdiscordipc/RelaunchClassLoader.addPackageExclusion:(Ljava/lang/String;)V
        //    68: aload_3        
        //    69: aload_1        
        //    70: putfield        gg/essential/util/kdiscordipc/KDiscordIPCLoader.loader:Lgg/essential/util/kdiscordipc/RelaunchClassLoader;
        //    73: return         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final Socket getPlatformSocket() {
        final Class providerClass = this.loader.loadClass(SocketProvider.class.getName());
        final Method method = providerClass.getDeclaredMethod("systemDefault", (Class[])new Class[0]);
        final Object invoke = method.invoke(null, new Object[0]);
        if (invoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type dev.cbyrne.kdiscordipc.core.socket.Socket");
        }
        return (Socket)invoke;
    }
    
    public static final /* synthetic */ URL access$getExtractedBundleJar$cp() {
        return KDiscordIPCLoader.extractedBundleJar;
    }
    
    public static final /* synthetic */ void access$setExtractedBundleJar$cp(final URL <set-?>) {
        KDiscordIPCLoader.extractedBundleJar = <set-?>;
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lgg/essential/util/kdiscordipc/KDiscordIPCLoader$Companion;", "", "()V", "extractedBundleJar", "Ljava/net/URL;", "findExtractedBundleJar", "kotlin.jvm.PlatformType", "kdiscordipc" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        private final URL findExtractedBundleJar() {
            URL access$getExtractedBundleJar$cp;
            if ((access$getExtractedBundleJar$cp = KDiscordIPCLoader.access$getExtractedBundleJar$cp()) == null) {
                final URL resource = KDiscordIPCLoader.class.getResource("bundle.jar");
                if (resource == null) {
                    throw new IllegalStateException("Failed to find kdiscordipc bundle jar");
                }
                final URL bundleJarResource = resource;
                final Path tmpFile = Files.createTempFile("essential-kdiscordipc", ".jar", (FileAttribute<?>[])new FileAttribute[0]);
                tmpFile.toFile().deleteOnExit();
                final Closeable closeable = bundleJarResource.openStream();
                Throwable t = null;
                try {
                    final InputStream it = (InputStream)closeable;
                    Files.copy(it, tmpFile, StandardCopyOption.REPLACE_EXISTING);
                }
                catch (final Throwable t2) {
                    t = t2;
                    throw t2;
                }
                finally {
                    CloseableKt.closeFinally(closeable, t);
                }
                final URL it2 = tmpFile.toUri().toURL();
                KDiscordIPCLoader.access$setExtractedBundleJar$cp(it2);
                access$getExtractedBundleJar$cp = it2;
            }
            return access$getExtractedBundleJar$cp;
        }
        
        public static final /* synthetic */ URL access$findExtractedBundleJar(final Companion $this) {
            return $this.findExtractedBundleJar();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
