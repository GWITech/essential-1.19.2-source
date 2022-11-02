package gg.essential.util.lwjgl3;

import java.net.*;
import java.util.concurrent.*;
import com.google.common.collect.*;
import java.io.*;
import java.util.*;

public class IsolatedClassLoader extends URLClassLoader
{
    private final List<String> exclusions;
    private final Map<String, Class<?>> classes;
    private final ClassLoader delegateParent;
    
    public IsolatedClassLoader(final URL[] urls, final ClassLoader parent) {
        super(urls, new EmptyClassLoader((byte)0));
        this.exclusions = new ArrayList<String>(Arrays.asList("java.", "javax.", "sun.", "jdk.", "org.apache.logging."));
        this.classes = new ConcurrentHashMap<String, Class<?>>();
        this.delegateParent = parent;
    }
    
    public void addExclusion(final String packagePrefix) {
        this.exclusions.add(packagePrefix);
    }
    
    @Override
    public Class<?> loadClass(final String name) throws ClassNotFoundException {
        Class<?> cls = this.classes.get(name);
        if (cls != null) {
            return cls;
        }
        for (final String exclusion : this.exclusions) {
            if (name.startsWith(exclusion)) {
                cls = this.delegateParent.loadClass(name);
                this.classes.put(name, cls);
                return cls;
            }
        }
        synchronized (this.getClassLoadingLock(name)) {
            cls = this.findLoadedClass(name);
            if (cls == null) {
                cls = this.findClassImpl(name);
            }
            this.classes.put(name, cls);
            return cls;
        }
    }
    
    @Override
    protected final Class<?> findClass(final String name) throws ClassNotFoundException {
        return this.loadClass(name);
    }
    
    protected Class<?> findClassImpl(final String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
    
    @Override
    public URL getResource(final String name) {
        final URL url = this.findResource(name);
        if (url != null) {
            return url;
        }
        return this.delegateParent.getResource(name);
    }
    
    @Override
    public Enumeration<URL> getResources(final String name) throws IOException {
        if (name.endsWith(".sha1")) {
            return super.getResources(name);
        }
        return Iterators.asEnumeration(Iterators.concat((Iterator<? extends URL>)Iterators.forEnumeration(super.getResources(name)), (Iterator<? extends URL>)Iterators.forEnumeration(this.delegateParent.getResources(name))));
    }
    
    static {
        registerAsParallelCapable();
    }
    
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
}
