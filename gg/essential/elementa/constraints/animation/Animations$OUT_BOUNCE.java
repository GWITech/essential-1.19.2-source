package gg.essential.elementa.constraints.animation;

import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$OUT_BOUNCE;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
static final class OUT_BOUNCE extends Animations
{
    OUT_BOUNCE(final String $enum$name, final int $enum$ordinal) {
        super($enum$name, $enum$ordinal, null);
    }
    
    @Override
    public float getValue(final float percentComplete) {
        float t = percentComplete;
        float n;
        if (t < 0.36363637f) {
            n = 7.5625f * t * t;
        }
        else if (t < 0.72727275f) {
            t -= 0.54545456f;
            n = 7.5625f * t * t + 0.75f;
        }
        else if (t < 0.9090909090909091) {
            t -= 0.8181818f;
            n = 7.5625f * t * t + 0.9375f;
        }
        else {
            t -= 0.95454544f;
            n = 7.5625f * t * t + 0.984375f;
        }
        return n;
    }
}
