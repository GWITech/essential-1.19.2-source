package gg.essential.elementa.constraints.animation;

import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016?\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_OUT_SIN;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
static final class IN_OUT_SIN extends Animations
{
    IN_OUT_SIN(final String $enum$name, final int $enum$ordinal) {
        super($enum$name, $enum$ordinal, null);
    }
    
    @Override
    public float getValue(final float percentComplete) {
        return (float)(-0.5 * (Math.cos(3.141592653589793 * percentComplete) - 1));
    }
}
