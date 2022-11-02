package gg.essential.elementa.effects;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "Lgg/essential/elementa/effects/OutlineEffect$Side;", "", "(Ljava/lang/String;I)V", "Left", "Top", "Right", "Bottom", "Elementa" })
public enum Side
{
    Left("Left", 0), 
    Top("Top", 1), 
    Right("Right", 2), 
    Bottom("Bottom", 3);
    
    private static final /* synthetic */ Side[] $VALUES;
    
    private Side(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static Side[] values() {
        return Side.$VALUES.clone();
    }
    
    public static Side valueOf(final String value) {
        return Enum.valueOf(Side.class, value);
    }
    
    private static final /* synthetic */ Side[] $values() {
        return new Side[] { Side.Left, Side.Top, Side.Right, Side.Bottom };
    }
    
    static {
        $VALUES = $values();
    }
}
