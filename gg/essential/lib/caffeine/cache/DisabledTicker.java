package gg.essential.lib.caffeine.cache;

enum DisabledTicker implements Ticker
{
    INSTANCE;
    
    private static final /* synthetic */ DisabledTicker[] $VALUES;
    
    public static DisabledTicker[] values() {
        return DisabledTicker.$VALUES.clone();
    }
    
    public static DisabledTicker valueOf(final String name) {
        return Enum.valueOf(DisabledTicker.class, name);
    }
    
    @Override
    public long read() {
        return 0L;
    }
    
    static {
        $VALUES = new DisabledTicker[] { DisabledTicker.INSTANCE };
    }
}
