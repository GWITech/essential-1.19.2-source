package gg.essential.gui.common;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/common/EssentialTooltip$Position;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "ABOVE", "BELOW", "essential" })
public enum Position
{
    LEFT("LEFT", 0), 
    RIGHT("RIGHT", 1), 
    ABOVE("ABOVE", 2), 
    BELOW("BELOW", 3);
    
    private static final /* synthetic */ Position[] $VALUES;
    
    private Position(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static Position[] values() {
        return Position.$VALUES.clone();
    }
    
    public static Position valueOf(final String value) {
        return Enum.valueOf(Position.class, value);
    }
    
    private static final /* synthetic */ Position[] $values() {
        return new Position[] { Position.LEFT, Position.RIGHT, Position.ABOVE, Position.BELOW };
    }
    
    static {
        $VALUES = $values();
    }
}
