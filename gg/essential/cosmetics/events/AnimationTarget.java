package gg.essential.cosmetics.events;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lgg/essential/cosmetics/events/AnimationTarget;", "", "(Ljava/lang/String;I)V", "SELF", "OTHERS", "ALL", "cosmetics" })
public enum AnimationTarget
{
    SELF("SELF", 0), 
    OTHERS("OTHERS", 1), 
    ALL("ALL", 2);
    
    private static final /* synthetic */ AnimationTarget[] $VALUES;
    
    private AnimationTarget(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static AnimationTarget[] values() {
        return AnimationTarget.$VALUES.clone();
    }
    
    public static AnimationTarget valueOf(final String value) {
        return Enum.valueOf(AnimationTarget.class, value);
    }
    
    private static final /* synthetic */ AnimationTarget[] $values() {
        return new AnimationTarget[] { AnimationTarget.SELF, AnimationTarget.OTHERS, AnimationTarget.ALL };
    }
    
    static {
        $VALUES = $values();
    }
}
