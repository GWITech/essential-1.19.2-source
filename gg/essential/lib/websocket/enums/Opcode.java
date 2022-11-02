package gg.essential.lib.websocket.enums;

public enum Opcode
{
    CONTINUOUS, 
    TEXT, 
    BINARY, 
    PING, 
    PONG, 
    CLOSING;
    
    private static final /* synthetic */ Opcode[] $VALUES;
    
    public static Opcode[] values() {
        return Opcode.$VALUES.clone();
    }
    
    public static Opcode valueOf(final String name) {
        return Enum.valueOf(Opcode.class, name);
    }
    
    static {
        $VALUES = new Opcode[] { Opcode.CONTINUOUS, Opcode.TEXT, Opcode.BINARY, Opcode.PING, Opcode.PONG, Opcode.CLOSING };
    }
}
