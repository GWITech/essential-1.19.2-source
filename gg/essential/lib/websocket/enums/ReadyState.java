package gg.essential.lib.websocket.enums;

public enum ReadyState
{
    NOT_YET_CONNECTED, 
    OPEN, 
    CLOSING, 
    CLOSED;
    
    private static final /* synthetic */ ReadyState[] $VALUES;
    
    public static ReadyState[] values() {
        return ReadyState.$VALUES.clone();
    }
    
    public static ReadyState valueOf(final String name) {
        return Enum.valueOf(ReadyState.class, name);
    }
    
    static {
        $VALUES = new ReadyState[] { ReadyState.NOT_YET_CONNECTED, ReadyState.OPEN, ReadyState.CLOSING, ReadyState.CLOSED };
    }
}
