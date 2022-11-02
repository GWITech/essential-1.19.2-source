package gg.essential.handlers;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "Lgg/essential/handlers/PauseMenuDisplay$MenuType;", "", "(Ljava/lang/String;I)V", "MAIN", "SINGLEPLAYER", "SERVER", "essential" })
public enum MenuType
{
    MAIN("MAIN", 0), 
    SINGLEPLAYER("SINGLEPLAYER", 1), 
    SERVER("SERVER", 2);
    
    private static final /* synthetic */ MenuType[] $VALUES;
    
    private MenuType(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static MenuType[] values() {
        return MenuType.$VALUES.clone();
    }
    
    public static MenuType valueOf(final String value) {
        return Enum.valueOf(MenuType.class, value);
    }
    
    private static final /* synthetic */ MenuType[] $values() {
        return new MenuType[] { MenuType.MAIN, MenuType.SINGLEPLAYER, MenuType.SERVER };
    }
    
    static {
        $VALUES = $values();
    }
}
