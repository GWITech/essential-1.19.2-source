package gg.essential.lib.caffeine.cache;

enum DisabledWriter implements CacheWriter<Object, Object>
{
    INSTANCE;
    
    private static final /* synthetic */ DisabledWriter[] $VALUES;
    
    public static DisabledWriter[] values() {
        return DisabledWriter.$VALUES.clone();
    }
    
    public static DisabledWriter valueOf(final String name) {
        return Enum.valueOf(DisabledWriter.class, name);
    }
    
    @Override
    public void write(final Object key, final Object value) {
    }
    
    @Override
    public void delete(final Object key, final Object value, final RemovalCause cause) {
    }
    
    static {
        $VALUES = new DisabledWriter[] { DisabledWriter.INSTANCE };
    }
}
