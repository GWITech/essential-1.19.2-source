package gg.essential.lib.websocket.enums;

public enum Role
{
    CLIENT, 
    SERVER;
    
    private static final /* synthetic */ Role[] $VALUES;
    
    public static Role[] values() {
        return Role.$VALUES.clone();
    }
    
    public static Role valueOf(final String name) {
        return Enum.valueOf(Role.class, name);
    }
    
    static {
        $VALUES = new Role[] { Role.CLIENT, Role.SERVER };
    }
}
