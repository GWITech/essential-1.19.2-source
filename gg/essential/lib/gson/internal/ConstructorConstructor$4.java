package gg.essential.lib.gson.internal;

import java.lang.reflect.*;

class ConstructorConstructor$4 implements ObjectConstructor<T> {
    final /* synthetic */ Constructor val$constructor;
    
    ConstructorConstructor$4(final Constructor val$constructor) {
        this.val$constructor = val$constructor;
        super();
    }
    
    @Override
    public T construct() {
        try {
            final T newInstance = this.val$constructor.newInstance(new Object[0]);
            return newInstance;
        }
        catch (final InstantiationException e) {
            throw new RuntimeException("Failed to invoke " + this.val$constructor + " with no args", e);
        }
        catch (final InvocationTargetException e2) {
            throw new RuntimeException("Failed to invoke " + this.val$constructor + " with no args", e2.getTargetException());
        }
        catch (final IllegalAccessException e3) {
            throw new AssertionError((Object)e3);
        }
    }
}