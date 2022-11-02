package gg.essential.lib.gson.internal;

import java.lang.reflect.*;

class UnsafeAllocator$3 extends UnsafeAllocator {
    final /* synthetic */ Method val$newInstance;
    
    UnsafeAllocator$3(final Method val$newInstance) {
        this.val$newInstance = val$newInstance;
        super();
    }
    
    @Override
    public <T> T newInstance(final Class<T> c) throws Exception {
        UnsafeAllocator.assertInstantiable(c);
        return (T)this.val$newInstance.invoke(null, c, Object.class);
    }
}