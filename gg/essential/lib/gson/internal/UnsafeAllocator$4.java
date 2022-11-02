package gg.essential.lib.gson.internal;

class UnsafeAllocator$4 extends UnsafeAllocator {
    UnsafeAllocator$4() {
        super();
    }
    
    @Override
    public <T> T newInstance(final Class<T> c) {
        throw new UnsupportedOperationException("Cannot allocate " + c + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    }
}