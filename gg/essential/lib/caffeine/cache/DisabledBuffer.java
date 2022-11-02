package gg.essential.lib.caffeine.cache;

import java.util.function.*;

enum DisabledBuffer implements Buffer<Object>
{
    INSTANCE;
    
    private static final /* synthetic */ DisabledBuffer[] $VALUES;
    
    public static DisabledBuffer[] values() {
        return DisabledBuffer.$VALUES.clone();
    }
    
    public static DisabledBuffer valueOf(final String name) {
        return Enum.valueOf(DisabledBuffer.class, name);
    }
    
    @Override
    public int offer(final Object e) {
        return 0;
    }
    
    @Override
    public void drainTo(final Consumer<Object> consumer) {
    }
    
    @Override
    public int size() {
        return 0;
    }
    
    @Override
    public int reads() {
        return 0;
    }
    
    @Override
    public int writes() {
        return 0;
    }
    
    static {
        $VALUES = new DisabledBuffer[] { DisabledBuffer.INSTANCE };
    }
}
