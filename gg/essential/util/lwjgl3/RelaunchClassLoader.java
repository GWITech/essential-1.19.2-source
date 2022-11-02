package gg.essential.util.lwjgl3;

import java.util.function.*;
import gg.essential.util.lwjgl3.asm.*;
import com.google.common.io.*;
import java.security.*;
import java.net.*;
import java.util.jar.*;
import java.io.*;

class RelaunchClassLoader extends IsolatedClassLoader
{
    private final BiFunction<String, byte[], byte[]> transformer;
    
    public RelaunchClassLoader(final URL[] urls, final ClassLoader parent) {
        super(urls, parent);
        this.transformer = new GLBridgeTransformer();
    }
    
    @Override
    protected Class<?> findClassImpl(final String name) throws ClassNotFoundException {
        URL jarUrl;
        Manifest jarManifest;
        byte[] bytes;
        try {
            final URL url = this.getResource(name.replace('.', '/') + ".class");
            if (url == null) {
                throw new ClassNotFoundException(name);
            }
            final URLConnection urlConnection = url.openConnection();
            if (urlConnection instanceof JarURLConnection) {
                final JarURLConnection jarConnection = (JarURLConnection)urlConnection;
                jarUrl = jarConnection.getJarFileURL();
                jarManifest = jarConnection.getManifest();
            }
            else {
                jarUrl = url;
                jarManifest = null;
            }
            try (final InputStream in = urlConnection.getInputStream()) {
                bytes = ByteStreams.toByteArray(in);
            }
        }
        catch (final Exception e) {
            throw new ClassNotFoundException(name, e);
        }
        final int pkgIndex = name.lastIndexOf(46);
        if (pkgIndex > 0) {
            final String pkgName = name.substring(0, pkgIndex);
            if (this.getPackage(pkgName) == null) {
                try {
                    if (jarManifest != null) {
                        this.definePackage(pkgName, jarManifest, jarUrl);
                    }
                    else {
                        this.definePackage(pkgName, null, null, null, null, null, null, jarUrl);
                    }
                }
                catch (final IllegalArgumentException ex) {}
            }
        }
        bytes = this.transformer.apply(name, bytes);
        return this.defineClass(name, bytes, 0, bytes.length, new CodeSource(jarUrl, (CodeSigner[])null));
    }
    
    static {
        registerAsParallelCapable();
    }
}
