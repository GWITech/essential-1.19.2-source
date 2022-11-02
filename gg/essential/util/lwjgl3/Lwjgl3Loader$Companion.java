package gg.essential.util.lwjgl3;

import kotlin.*;
import java.net.*;
import java.nio.file.attribute.*;
import java.io.*;
import kotlin.io.*;
import java.nio.file.*;

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
