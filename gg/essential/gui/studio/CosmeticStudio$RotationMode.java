package gg.essential.gui.studio;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$RotationMode;", "", "(Ljava/lang/String;I)V", "NONE", "CLOCKWISE", "COUNTER_CLOCKWISE", "essential" })
public enum RotationMode
{
    NONE("NONE", 0), 
    CLOCKWISE("CLOCKWISE", 1), 
    COUNTER_CLOCKWISE("COUNTER_CLOCKWISE", 2);
    
    private static final /* synthetic */ RotationMode[] $VALUES;
    
    private RotationMode(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static RotationMode[] values() {
        return RotationMode.$VALUES.clone();
    }
    
    public static RotationMode valueOf(final String value) {
        return Enum.valueOf(RotationMode.class, value);
    }
    
    private static final /* synthetic */ RotationMode[] $values() {
        return new RotationMode[] { RotationMode.NONE, RotationMode.CLOCKWISE, RotationMode.COUNTER_CLOCKWISE };
    }
    
    static {
        $VALUES = $values();
    }
}
