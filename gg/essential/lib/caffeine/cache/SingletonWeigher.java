package gg.essential.lib.caffeine.cache;

enum SingletonWeigher implements Weigher<Object, Object>
{
    INSTANCE;
    
    private static final /* synthetic */ SingletonWeigher[] $VALUES;
    
    public static SingletonWeigher[] values() {
        return SingletonWeigher.$VALUES.clone();
    }
    
    public static SingletonWeigher valueOf(final String name) {
        return Enum.valueOf(SingletonWeigher.class, name);
    }
    
    @Override
    public int weigh(final Object key, final Object value) {
        return 1;
    }
    
    static {
        $VALUES = new SingletonWeigher[] { SingletonWeigher.INSTANCE };
    }
}
