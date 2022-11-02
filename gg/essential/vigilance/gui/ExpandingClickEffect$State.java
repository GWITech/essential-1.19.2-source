package gg.essential.vigilance.gui;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lgg/essential/vigilance/gui/ExpandingClickEffect$State;", "", "(Ljava/lang/String;I)V", "NotActive", "Expanding", "Expanded", "Vigilance" })
public enum State
{
    NotActive("NotActive", 0), 
    Expanding("Expanding", 1), 
    Expanded("Expanded", 2);
    
    private static final /* synthetic */ State[] $VALUES;
    
    private State(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static State[] values() {
        return State.$VALUES.clone();
    }
    
    public static State valueOf(final String value) {
        return Enum.valueOf(State.class, value);
    }
    
    private static final /* synthetic */ State[] $values() {
        return new State[] { State.NotActive, State.Expanding, State.Expanded };
    }
    
    static {
        $VALUES = $values();
    }
}
