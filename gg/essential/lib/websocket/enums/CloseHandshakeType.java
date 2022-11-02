package gg.essential.lib.websocket.enums;

public enum CloseHandshakeType
{
    NONE, 
    ONEWAY, 
    TWOWAY;
    
    private static final /* synthetic */ CloseHandshakeType[] $VALUES;
    
    public static CloseHandshakeType[] values() {
        return CloseHandshakeType.$VALUES.clone();
    }
    
    public static CloseHandshakeType valueOf(final String name) {
        return Enum.valueOf(CloseHandshakeType.class, name);
    }
    
    static {
        $VALUES = new CloseHandshakeType[] { CloseHandshakeType.NONE, CloseHandshakeType.ONEWAY, CloseHandshakeType.TWOWAY };
    }
}
