package gg.essential.handlers;

public enum UPnPCompatibility
{
    UNCHECKED, 
    CHECKING, 
    INCOMPATIBLE, 
    COMPATIBLE;
    
    private static final /* synthetic */ UPnPCompatibility[] $VALUES;
    
    public static UPnPCompatibility[] values() {
        return UPnPCompatibility.$VALUES.clone();
    }
    
    public static UPnPCompatibility valueOf(final String name) {
        return Enum.valueOf(UPnPCompatibility.class, name);
    }
    
    private static /* synthetic */ UPnPCompatibility[] $values() {
        return new UPnPCompatibility[] { UPnPCompatibility.UNCHECKED, UPnPCompatibility.CHECKING, UPnPCompatibility.INCOMPATIBLE, UPnPCompatibility.COMPATIBLE };
    }
    
    static {
        $VALUES = $values();
    }
}
