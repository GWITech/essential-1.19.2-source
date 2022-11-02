package gg.essential.connectionmanager.common.packet.mod;

public enum Platform
{
    FORGE, 
    FABRIC;
    
    private static final /* synthetic */ Platform[] $VALUES;
    
    public static Platform[] values() {
        return Platform.$VALUES.clone();
    }
    
    public static Platform valueOf(final String name) {
        return Enum.valueOf(Platform.class, name);
    }
    
    private static /* synthetic */ Platform[] $values() {
        return new Platform[] { Platform.FORGE, Platform.FABRIC };
    }
    
    static {
        $VALUES = $values();
    }
}
