package gg.essential.lib.caffeine.cache;

public interface Ticker
{
    long read();
    
    default Ticker systemTicker() {
        return SystemTicker.INSTANCE;
    }
    
    default Ticker disabledTicker() {
        return DisabledTicker.INSTANCE;
    }
}
