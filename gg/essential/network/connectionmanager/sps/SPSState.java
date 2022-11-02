package gg.essential.network.connectionmanager.sps;

public enum SPSState
{
    INACTIVE, 
    OPENING, 
    ACTIVE, 
    FAILED;
    
    private static final /* synthetic */ SPSState[] $VALUES;
    
    public static SPSState[] values() {
        return SPSState.$VALUES.clone();
    }
    
    public static SPSState valueOf(final String name) {
        return Enum.valueOf(SPSState.class, name);
    }
    
    private static /* synthetic */ SPSState[] $values() {
        return new SPSState[] { SPSState.INACTIVE, SPSState.OPENING, SPSState.ACTIVE, SPSState.FAILED };
    }
    
    static {
        $VALUES = $values();
    }
}
