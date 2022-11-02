package gg.essential.network.connectionmanager.queue;

public enum TimeoutPolicy
{
    RETRANSMIT, 
    SKIP;
    
    private static final /* synthetic */ TimeoutPolicy[] $VALUES;
    
    public static TimeoutPolicy[] values() {
        return TimeoutPolicy.$VALUES.clone();
    }
    
    public static TimeoutPolicy valueOf(final String name) {
        return Enum.valueOf(TimeoutPolicy.class, name);
    }
    
    private static /* synthetic */ TimeoutPolicy[] $values() {
        return new TimeoutPolicy[] { TimeoutPolicy.RETRANSMIT, TimeoutPolicy.SKIP };
    }
    
    static {
        $VALUES = $values();
    }
}
