package gg.essential.lib.gson.internal;

import java.lang.reflect.*;

class UnsafeAllocator$2 extends UnsafeAllocator {
    final /* synthetic */ Method val$newInstance;
    final /* synthetic */ int val$constructorId;
    
    UnsafeAllocator$2(final Method val$newInstance, final int val$constructorId) {
        this.val$newInstance = val$newInstance;
        this.val$constructorId = val$constructorId;
        super();
    }
    
    @Override
    public <T> T newInstance(final Class<T> c) throws Exception {
        UnsafeAllocator.assertInstantiable(c);
        return (T)this.val$newInstance.invoke(null, c, this.val$constructorId);
    }
}