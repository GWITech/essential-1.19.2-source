package gg.essential.connectionmanager.common.enums;

public enum ActivityType
{
    PLAYING;
    
    private static final /* synthetic */ ActivityType[] $VALUES;
    
    public static ActivityType[] values() {
        return ActivityType.$VALUES.clone();
    }
    
    public static ActivityType valueOf(final String name) {
        return Enum.valueOf(ActivityType.class, name);
    }
    
    private static /* synthetic */ ActivityType[] $values() {
        return new ActivityType[] { ActivityType.PLAYING };
    }
    
    static {
        $VALUES = $values();
    }
}
