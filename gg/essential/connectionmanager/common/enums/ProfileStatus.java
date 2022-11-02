package gg.essential.connectionmanager.common.enums;

public enum ProfileStatus
{
    ONLINE, 
    OFFLINE;
    
    private static final /* synthetic */ ProfileStatus[] $VALUES;
    
    public static ProfileStatus[] values() {
        return ProfileStatus.$VALUES.clone();
    }
    
    public static ProfileStatus valueOf(final String name) {
        return Enum.valueOf(ProfileStatus.class, name);
    }
    
    private static /* synthetic */ ProfileStatus[] $values() {
        return new ProfileStatus[] { ProfileStatus.ONLINE, ProfileStatus.OFFLINE };
    }
    
    static {
        $VALUES = $values();
    }
}
