package gg.essential.lib.gson.internal;

import java.io.*;
import java.lang.reflect.*;

public abstract class UnsafeAllocator
{
    public UnsafeAllocator() {
        super();
    }
    
    public abstract <T> T newInstance(final Class<T> p0) throws Exception;
    
    public static UnsafeAllocator create() {
        try {
            final Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
            final Field f = unsafeClass.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            final Object unsafe = f.get(null);
            final Method allocateInstance = unsafeClass.getMethod("allocateInstance", Class.class);
            return new UnsafeAllocator() {
                final /* synthetic */ Method val$allocateInstance;
                final /* synthetic */ Object val$unsafe;
                
                UnsafeAllocator$1() {
                    super();
                }
                
                @Override
                public <T> T newInstance(final Class<T> c) throws Exception {
                    UnsafeAllocator.assertInstantiable(c);
                    return (T)allocateInstance.invoke(unsafe, c);
                }
            };
        }
        catch (final Exception ex) {
            try {
                final Method getConstructorId = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                getConstructorId.setAccessible(true);
                final int constructorId = (int)getConstructorId.invoke(null, Object.class);
                final Method newInstance = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                newInstance.setAccessible(true);
                return new UnsafeAllocator() {
                    final /* synthetic */ Method val$newInstance;
                    final /* synthetic */ int val$constructorId;
                    
                    UnsafeAllocator$2() {
                        super();
                    }
                    
                    @Override
                    public <T> T newInstance(final Class<T> c) throws Exception {
                        UnsafeAllocator.assertInstantiable(c);
                        return (T)newInstance.invoke(null, c, constructorId);
                    }
                };
            }
            catch (final Exception ex2) {
                try {
                    final Method newInstance2 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    newInstance2.setAccessible(true);
                    return new UnsafeAllocator() {
                        final /* synthetic */ Method val$newInstance;
                        
                        UnsafeAllocator$3() {
                            super();
                        }
                        
                        @Override
                        public <T> T newInstance(final Class<T> c) throws Exception {
                            UnsafeAllocator.assertInstantiable(c);
                            return (T)newInstance2.invoke(null, c, Object.class);
                        }
                    };
                }
                catch (final Exception ex3) {
                    return new UnsafeAllocator() {
                        UnsafeAllocator$4() {
                            super();
                        }
                        
                        @Override
                        public <T> T newInstance(final Class<T> c) {
                            throw new UnsupportedOperationException("Cannot allocate " + c + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
                        }
                    };
                }
            }
        }
    }
    
    static void assertInstantiable(final Class<?> c) {
        final int modifiers = c.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + c.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + c.getName());
        }
    }
}
