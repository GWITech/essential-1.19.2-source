package gg.essential.util.lwjgl3;

import java.net.*;
import java.util.*;

private static class EmptyClassLoader extends ClassLoader
{
    private EmptyClassLoader() {
        super();
    }
    
    @Override
    protected Package getPackage(final String name) {
        return null;
    }
    
    @Override
    protected Package[] getPackages() {
        return null;
    }
    
    @Override
    protected Class<?> loadClass(final String name, final boolean resolve) throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
    
    @Override
    public URL getResource(final String name) {
        return null;
    }
    
    @Override
    public Enumeration<URL> getResources(final String name) {
        return Collections.emptyEnumeration();
    }
    
    EmptyClassLoader(final byte b) {
        this();
    }
}
