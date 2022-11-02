package gg.essential.lib.gson.internal;

import java.lang.reflect.*;

class UnsafeAllocator$1 extends UnsafeAllocator {
    final /* synthetic */ Method val$allocateInstance;
    final /* synthetic */ Object val$unsafe;
    
    UnsafeAllocator$1(final Method val$allocateInstance, final Object val$unsafe) {
        this.val$allocateInstance = val$allocateInstance;
        this.val$unsafe = val$unsafe;
        super();
    }
    
    @Override
    public <T> T newInstance(final Class<T> c) throws Exception {
        UnsafeAllocator.assertInstantiable(c);
        return (T)this.val$allocateInstance.invoke(this.val$unsafe, c);
    }
}