package gg.essential.util.lwjgl3;

import java.net.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import java.nio.file.attribute.*;
import java.io.*;
import java.nio.file.*;
import kotlin.io.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\u0002H\u000b\"\u0006\b\u0000\u0010\u000b\u0018\u0001H\u0086\b¢\u0006\u0002\u0010\fJ\u001f\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e¢\u0006\u0002\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011" }, d2 = { "Lgg/essential/util/lwjgl3/Lwjgl3Loader;", "", "nativesDir", "Ljava/nio/file/Path;", "gl3", "Lkotlin/Lazy;", "", "(Ljava/nio/file/Path;Lkotlin/Lazy;)V", "loader", "Lgg/essential/util/lwjgl3/RelaunchClassLoader;", "get", "T", "()Ljava/lang/Object;", "cls", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "Companion", "lwjgl3" })
public final class Lwjgl3Loader
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final RelaunchClassLoader loader;
    @Nullable
    private static URL extractedBundleJar;
    
    public Lwjgl3Loader(@NotNull final Path nativesDir, @NotNull final Lazy<Boolean> gl3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "nativesDir"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* gl3 */
        //     7: ldc             "gl3"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   java/lang/Object.<init>:()V
        //    16: aload_0         /* this */
        //    17: new             Lgg/essential/util/lwjgl3/RelaunchClassLoader;
        //    20: dup            
        //    21: iconst_1       
        //    22: anewarray       Ljava/net/URL;
        //    25: astore_3       
        //    26: aload_3        
        //    27: iconst_0       
        //    28: getstatic       gg/essential/util/lwjgl3/Lwjgl3Loader.Companion:Lgg/essential/util/lwjgl3/Lwjgl3Loader$Companion;
        //    31: invokestatic    gg/essential/util/lwjgl3/Lwjgl3Loader$Companion.access$findExtractedBundleJar:(Lgg/essential/util/lwjgl3/Lwjgl3Loader$Companion;)Ljava/net/URL;
        //    34: aastore        
        //    35: aload_3        
        //    36: aload_0         /* this */
        //    37: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    40: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    43: invokespecial   gg/essential/util/lwjgl3/RelaunchClassLoader.<init>:([Ljava/net/URL;Ljava/lang/ClassLoader;)V
        //    46: astore_3       
        //    47: aload_3        
        //    48: astore          4
        //    50: astore          6
        //    52: aload           $this$loader_u24lambda_u2d0
        //    54: ldc             "gg.essential.util.lwjgl3.api."
        //    56: invokevirtual   gg/essential/util/lwjgl3/RelaunchClassLoader.addExclusion:(Ljava/lang/String;)V
        //    59: aload           $this$loader_u24lambda_u2d0
        //    61: ldc             "kotlin."
        //    63: invokevirtual   gg/essential/util/lwjgl3/RelaunchClassLoader.addExclusion:(Ljava/lang/String;)V
        //    66: aload           $this$loader_u24lambda_u2d0
        //    68: ldc             "kotlinx."
        //    70: invokevirtual   gg/essential/util/lwjgl3/RelaunchClassLoader.addExclusion:(Ljava/lang/String;)V
        //    73: aload           $this$loader_u24lambda_u2d0
        //    75: ldc             "io.netty."
        //    77: invokevirtual   gg/essential/util/lwjgl3/RelaunchClassLoader.addExclusion:(Ljava/lang/String;)V
        //    80: aload           $this$loader_u24lambda_u2d0
        //    82: ldc             "gg.essential.util.lwjgl3.impl.Bootstrap"
        //    84: invokevirtual   gg/essential/util/lwjgl3/RelaunchClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //    87: ldc             "init"
        //    89: iconst_2       
        //    90: anewarray       Ljava/lang/Class;
        //    93: astore          5
        //    95: aload           5
        //    97: iconst_0       
        //    98: ldc             Ljava/nio/file/Path;.class
        //   100: aastore        
        //   101: aload           5
        //   103: iconst_1       
        //   104: ldc             Lkotlin/Lazy;.class
        //   106: aastore        
        //   107: aload           5
        //   109: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   112: aconst_null    
        //   113: iconst_2       
        //   114: anewarray       Ljava/lang/Object;
        //   117: astore          5
        //   119: aload           5
        //   121: iconst_0       
        //   122: aload_1         /* nativesDir */
        //   123: aastore        
        //   124: aload           5
        //   126: iconst_1       
        //   127: aload_2         /* gl3 */
        //   128: aastore        
        //   129: aload           5
        //   131: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   134: pop            
        //   135: aload           6
        //   137: aload_3        
        //   138: putfield        gg/essential/util/lwjgl3/Lwjgl3Loader.loader:Lgg/essential/util/lwjgl3/RelaunchClassLoader;
        //   141: return         
        //    Signature:
        //  (Ljava/nio/file/Path;Lkotlin/Lazy<Ljava/lang/Boolean;>;)V
        //    MethodParameters:
        //  Name        Flags  
        //  ----------  -----
        //  nativesDir  
        //  gl3         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final <T> T get(@NotNull final Class<T> cls) {
        Intrinsics.checkNotNullParameter((Object)cls, "cls");
        final String name = cls.getName();
        Intrinsics.checkNotNullExpressionValue((Object)name, "cls.name");
        if (!StringsKt.startsWith$default(name, "gg.essential.util.lwjgl3.api", false, 2, (Object)null)) {
            throw new IllegalArgumentException("Can only provide implementations for interfaces from gg.essential.util.lwjgl3.api.");
        }
        final StringBuilder append = new StringBuilder().append("gg.essential.util.lwjgl3.impl");
        final String name2 = cls.getName();
        Intrinsics.checkNotNullExpressionValue((Object)name2, "cls.name");
        final String implName = append.append(StringsKt.removePrefix(name2, (CharSequence)"gg.essential.util.lwjgl3.api")).append("Impl").toString();
        final Class implCls = this.loader.loadClass(implName);
        final Object impl = implCls.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        return (T)cls.cast(impl);
    }
    
    public static final /* synthetic */ URL access$getExtractedBundleJar$cp() {
        return Lwjgl3Loader.extractedBundleJar;
    }
    
    public static final /* synthetic */ void access$setExtractedBundleJar$cp(final URL <set-?>) {
        Lwjgl3Loader.extractedBundleJar = <set-?>;
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\n \n*\u0004\u0018\u00010\b0\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b" }, d2 = { "Lgg/essential/util/lwjgl3/Lwjgl3Loader$Companion;", "", "()V", "PKG", "", "PKG_API", "PKG_IMPL", "extractedBundleJar", "Ljava/net/URL;", "findExtractedBundleJar", "kotlin.jvm.PlatformType", "lwjgl3" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        private final URL findExtractedBundleJar() {
            URL access$getExtractedBundleJar$cp;
            if ((access$getExtractedBundleJar$cp = Lwjgl3Loader.access$getExtractedBundleJar$cp()) == null) {
                final URL resource = Lwjgl3Loader.class.getResource("bundle.jar");
                if (resource == null) {
                    throw new IllegalStateException("Failed to find lwjgl3 bundle jar");
                }
                final URL bundleJarResource = resource;
                final Path tmpFile = Files.createTempFile("essential-lwjgl3", ".jar", (FileAttribute<?>[])new FileAttribute[0]);
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
                Lwjgl3Loader.access$setExtractedBundleJar$cp(it2);
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
