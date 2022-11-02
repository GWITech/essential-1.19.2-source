package gg.essential.network.connectionmanager;

public enum Status
{
    NO_TOS, 
    ESSENTIAL_DISABLED, 
    ALREADY_CONNECTED, 
    NO_RESPONSE, 
    INVALID_RESPONSE, 
    MOJANG_UNAUTHORIZED, 
    GENERAL_FAILURE, 
    SUCCESS;
    
    private static final /* synthetic */ Status[] $VALUES;
    
    public static Status[] values() {
        return Status.$VALUES.clone();
    }
    
    public static Status valueOf(final String name) {
        return Enum.valueOf(Status.class, name);
    }
    
    private static /* synthetic */ Status[] $values() {
        return new Status[] { Status.NO_TOS, Status.ESSENTIAL_DISABLED, Status.ALREADY_CONNECTED, Status.NO_RESPONSE, Status.INVALID_RESPONSE, Status.MOJANG_UNAUTHORIZED, Status.GENERAL_FAILURE, Status.SUCCESS };
    }
    
    static {
        $VALUES = $values();
    }
}
