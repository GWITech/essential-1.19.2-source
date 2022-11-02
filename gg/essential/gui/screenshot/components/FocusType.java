package gg.essential.gui.screenshot.components;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/gui/screenshot/components/FocusType;", "", "(Ljava/lang/String;I)V", "VIEW", "EDIT", "essential" })
public enum FocusType
{
    VIEW("VIEW", 0), 
    EDIT("EDIT", 1);
    
    private static final /* synthetic */ FocusType[] $VALUES;
    
    private FocusType(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static FocusType[] values() {
        return FocusType.$VALUES.clone();
    }
    
    public static FocusType valueOf(final String value) {
        return Enum.valueOf(FocusType.class, value);
    }
    
    private static final /* synthetic */ FocusType[] $values() {
        return new FocusType[] { FocusType.VIEW, FocusType.EDIT };
    }
    
    static {
        $VALUES = $values();
    }
}
