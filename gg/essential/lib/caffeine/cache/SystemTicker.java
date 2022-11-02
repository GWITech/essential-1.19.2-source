package gg.essential.lib.caffeine.cache;

enum SystemTicker implements Ticker
{
    INSTANCE;
    
    private static final /* synthetic */ SystemTicker[] $VALUES;
    
    public static SystemTicker[] values() {
        return SystemTicker.$VALUES.clone();
    }
    
    public static SystemTicker valueOf(final String name) {
        return Enum.valueOf(SystemTicker.class, name);
    }
    
    @Override
    public long read() {
        return System.nanoTime();
    }
    
    static {
        $VALUES = new SystemTicker[] { SystemTicker.INSTANCE };
    }
}
