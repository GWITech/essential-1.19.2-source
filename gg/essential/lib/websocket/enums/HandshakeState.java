package gg.essential.lib.websocket.enums;

public enum HandshakeState
{
    MATCHED, 
    NOT_MATCHED;
    
    private static final /* synthetic */ HandshakeState[] $VALUES;
    
    public static HandshakeState[] values() {
        return HandshakeState.$VALUES.clone();
    }
    
    public static HandshakeState valueOf(final String name) {
        return Enum.valueOf(HandshakeState.class, name);
    }
    
    static {
        $VALUES = new HandshakeState[] { HandshakeState.MATCHED, HandshakeState.NOT_MATCHED };
    }
}
