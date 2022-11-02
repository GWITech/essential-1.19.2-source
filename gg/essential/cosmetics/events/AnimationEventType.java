package gg.essential.cosmetics.events;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015" }, d2 = { "Lgg/essential/cosmetics/events/AnimationEventType;", "", "(Ljava/lang/String;I)V", "EQUIP", "JOIN_WORLD", "LEAVE_WORLD", "JUMP_START", "JUMP_END", "WALK_START", "WALK_END", "SWING", "SNEAK_START", "SNEAK_END", "FLY_ON", "FLY_OFF", "FLY_MOVE_START", "FLY_MOVE_END", "ON_DAMAGE", "TICK", "IDLE", "TEXTURE_ANIMATION_START", "cosmetics" })
public enum AnimationEventType
{
    EQUIP("EQUIP", 0), 
    JOIN_WORLD("JOIN_WORLD", 1), 
    LEAVE_WORLD("LEAVE_WORLD", 2), 
    JUMP_START("JUMP_START", 3), 
    JUMP_END("JUMP_END", 4), 
    WALK_START("WALK_START", 5), 
    WALK_END("WALK_END", 6), 
    SWING("SWING", 7), 
    SNEAK_START("SNEAK_START", 8), 
    SNEAK_END("SNEAK_END", 9), 
    FLY_ON("FLY_ON", 10), 
    FLY_OFF("FLY_OFF", 11), 
    FLY_MOVE_START("FLY_MOVE_START", 12), 
    FLY_MOVE_END("FLY_MOVE_END", 13), 
    ON_DAMAGE("ON_DAMAGE", 14), 
    TICK("TICK", 15), 
    IDLE("IDLE", 16), 
    TEXTURE_ANIMATION_START("TEXTURE_ANIMATION_START", 17);
    
    private static final /* synthetic */ AnimationEventType[] $VALUES;
    
    private AnimationEventType(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static AnimationEventType[] values() {
        return AnimationEventType.$VALUES.clone();
    }
    
    public static AnimationEventType valueOf(final String value) {
        return Enum.valueOf(AnimationEventType.class, value);
    }
    
    private static final /* synthetic */ AnimationEventType[] $values() {
        return new AnimationEventType[] { AnimationEventType.EQUIP, AnimationEventType.JOIN_WORLD, AnimationEventType.LEAVE_WORLD, AnimationEventType.JUMP_START, AnimationEventType.JUMP_END, AnimationEventType.WALK_START, AnimationEventType.WALK_END, AnimationEventType.SWING, AnimationEventType.SNEAK_START, AnimationEventType.SNEAK_END, AnimationEventType.FLY_ON, AnimationEventType.FLY_OFF, AnimationEventType.FLY_MOVE_START, AnimationEventType.FLY_MOVE_END, AnimationEventType.ON_DAMAGE, AnimationEventType.TICK, AnimationEventType.IDLE, AnimationEventType.TEXTURE_ANIMATION_START };
    }
    
    static {
        $VALUES = $values();
    }
}
