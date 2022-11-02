package gg.essential.lib.gson.internal;

class ConstructorConstructor$16 implements ObjectConstructor<T> {
    private final UnsafeAllocator unsafeAllocator = UnsafeAllocator.create();
    final /* synthetic */ Class val$rawType;
    
    ConstructorConstructor$16(final Class val$rawType) {
        this.val$rawType = val$rawType;
        super();
    }
    
    @Override
    public T construct() {
        try {
            final T newInstance = this.unsafeAllocator.newInstance((Class<T>)this.val$rawType);
            return newInstance;
        }
        catch (final Exception e) {
            throw new RuntimeException("Unable to create instance of " + this.val$rawType + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }
}