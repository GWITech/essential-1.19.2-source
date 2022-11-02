package gg.essential.gui.common;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "Lgg/essential/gui/common/HighlightedBlock$ClickBehavior;", "", "(Ljava/lang/String;I)V", "UNHIGHLIGHT", "STAY_HIGHLIGHTED", "NONE", "essential" })
public enum ClickBehavior
{
    UNHIGHLIGHT("UNHIGHLIGHT", 0), 
    STAY_HIGHLIGHTED("STAY_HIGHLIGHTED", 1), 
    NONE("NONE", 2);
    
    private static final /* synthetic */ ClickBehavior[] $VALUES;
    
    private ClickBehavior(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static ClickBehavior[] values() {
        return ClickBehavior.$VALUES.clone();
    }
    
    public static ClickBehavior valueOf(final String value) {
        return Enum.valueOf(ClickBehavior.class, value);
    }
    
    private static final /* synthetic */ ClickBehavior[] $values() {
        return new ClickBehavior[] { ClickBehavior.UNHIGHLIGHT, ClickBehavior.STAY_HIGHLIGHTED, ClickBehavior.NONE };
    }
    
    static {
        $VALUES = $values();
    }
}
