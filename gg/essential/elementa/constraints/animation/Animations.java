package gg.essential.elementa.constraints.animation;

import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 " }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations;", "", "Lgg/essential/elementa/constraints/animation/AnimationStrategy;", "(Ljava/lang/String;I)V", "LINEAR", "IN_QUAD", "OUT_QUAD", "IN_OUT_QUAD", "IN_CUBIC", "OUT_CUBIC", "IN_OUT_CUBIC", "IN_QUART", "OUT_QUART", "IN_OUT_QUART", "IN_QUINT", "OUT_QUINT", "IN_OUT_QUINT", "IN_SIN", "OUT_SIN", "IN_OUT_SIN", "IN_EXP", "OUT_EXP", "IN_OUT_EXP", "IN_CIRCULAR", "OUT_CIRCULAR", "IN_OUT_CIRCULAR", "IN_ELASTIC", "OUT_ELASTIC", "IN_OUT_ELASTIC", "IN_BOUNCE", "OUT_BOUNCE", "IN_OUT_BOUNCE", "Elementa" })
public enum Animations implements AnimationStrategy
{
    LINEAR("LINEAR", 0), 
    IN_QUAD("IN_QUAD", 1), 
    OUT_QUAD("OUT_QUAD", 2), 
    IN_OUT_QUAD("IN_OUT_QUAD", 3), 
    IN_CUBIC("IN_CUBIC", 4), 
    OUT_CUBIC("OUT_CUBIC", 5), 
    IN_OUT_CUBIC("IN_OUT_CUBIC", 6), 
    IN_QUART("IN_QUART", 7), 
    OUT_QUART("OUT_QUART", 8), 
    IN_OUT_QUART("IN_OUT_QUART", 9), 
    IN_QUINT("IN_QUINT", 10), 
    OUT_QUINT("OUT_QUINT", 11), 
    IN_OUT_QUINT("IN_OUT_QUINT", 12), 
    IN_SIN("IN_SIN", 13), 
    OUT_SIN("OUT_SIN", 14), 
    IN_OUT_SIN("IN_OUT_SIN", 15), 
    IN_EXP("IN_EXP", 16), 
    OUT_EXP("OUT_EXP", 17), 
    IN_OUT_EXP("IN_OUT_EXP", 18), 
    IN_CIRCULAR("IN_CIRCULAR", 19), 
    OUT_CIRCULAR("OUT_CIRCULAR", 20), 
    IN_OUT_CIRCULAR("IN_OUT_CIRCULAR", 21), 
    IN_ELASTIC("IN_ELASTIC", 22), 
    OUT_ELASTIC("OUT_ELASTIC", 23), 
    IN_OUT_ELASTIC("IN_OUT_ELASTIC", 24), 
    IN_BOUNCE("IN_BOUNCE", 25), 
    OUT_BOUNCE("OUT_BOUNCE", 26), 
    IN_OUT_BOUNCE("IN_OUT_BOUNCE", 27);
    
    private static final /* synthetic */ Animations[] $VALUES;
    
    private Animations(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static Animations[] values() {
        return Animations.$VALUES.clone();
    }
    
    public static Animations valueOf(final String value) {
        return Enum.valueOf(Animations.class, value);
    }
    
    private static final /* synthetic */ Animations[] $values() {
        return new Animations[] { Animations.LINEAR, Animations.IN_QUAD, Animations.OUT_QUAD, Animations.IN_OUT_QUAD, Animations.IN_CUBIC, Animations.OUT_CUBIC, Animations.IN_OUT_CUBIC, Animations.IN_QUART, Animations.OUT_QUART, Animations.IN_OUT_QUART, Animations.IN_QUINT, Animations.OUT_QUINT, Animations.IN_OUT_QUINT, Animations.IN_SIN, Animations.OUT_SIN, Animations.IN_OUT_SIN, Animations.IN_EXP, Animations.OUT_EXP, Animations.IN_OUT_EXP, Animations.IN_CIRCULAR, Animations.OUT_CIRCULAR, Animations.IN_OUT_CIRCULAR, Animations.IN_ELASTIC, Animations.OUT_ELASTIC, Animations.IN_OUT_ELASTIC, Animations.IN_BOUNCE, Animations.OUT_BOUNCE, Animations.IN_OUT_BOUNCE };
    }
    
    public Animations(final String $enum$name, final int $enum$ordinal, final DefaultConstructorMarker $constructor_marker) {
        this($enum$name, $enum$ordinal);
    }
    
    static {
        $VALUES = $values();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$LINEAR;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class LINEAR extends Animations
    {
        LINEAR(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            return percentComplete;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_QUAD;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_QUAD extends Animations
    {
        IN_QUAD(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            return (float)Math.pow(percentComplete, 2);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$OUT_QUAD;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class OUT_QUAD extends Animations
    {
        OUT_QUAD(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            return -percentComplete * (percentComplete - 2);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_OUT_QUAD;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_OUT_QUAD extends Animations
    {
        IN_OUT_QUAD(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            float t = percentComplete * 2;
            if (t < 1.0f) {
                return 0.5f * (float)Math.pow(t, 2);
            }
            --t;
            return -0.5f * (t * (t - 2) - 1);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_CUBIC;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_CUBIC extends Animations
    {
        IN_CUBIC(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            return (float)Math.pow(percentComplete, 3);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$OUT_CUBIC;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class OUT_CUBIC extends Animations
    {
        OUT_CUBIC(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            final float t = percentComplete - 1;
            return (float)Math.pow(t, 3) + 1;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_OUT_CUBIC;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_OUT_CUBIC extends Animations
    {
        IN_OUT_CUBIC(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            float t = percentComplete * 2;
            if (t < 1.0f) {
                return 0.5f * (float)Math.pow(t, 3);
            }
            t -= 2;
            return 0.5f * ((float)Math.pow(t, 3) + 2);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_QUART;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_QUART extends Animations
    {
        IN_QUART(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            return (float)Math.pow(percentComplete, 4);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$OUT_QUART;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class OUT_QUART extends Animations
    {
        OUT_QUART(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            final float t = percentComplete - 1;
            return -((float)Math.pow(t, 4) - 1);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_OUT_QUART;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_OUT_QUART extends Animations
    {
        IN_OUT_QUART(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            float t = percentComplete * 2;
            if (t < 1.0f) {
                return 0.5f * (float)Math.pow(t, 4);
            }
            t -= 2;
            return -0.5f * ((float)Math.pow(t, 4) - 2);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_QUINT;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_QUINT extends Animations
    {
        IN_QUINT(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            return (float)Math.pow(percentComplete, 5);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$OUT_QUINT;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class OUT_QUINT extends Animations
    {
        OUT_QUINT(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            final float t = percentComplete - 1;
            return (float)Math.pow(t, 5) + 1;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_OUT_QUINT;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_OUT_QUINT extends Animations
    {
        IN_OUT_QUINT(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            float t = percentComplete * 2;
            if (t < 1.0f) {
                return 0.5f * (float)Math.pow(t, 5);
            }
            t -= 2;
            return 0.5f * ((float)Math.pow(t, 5) + 2);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_SIN;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_SIN extends Animations
    {
        IN_SIN(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            return (float)(-Math.cos(percentComplete * 1.5707963267948966) + 1);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$OUT_SIN;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class OUT_SIN extends Animations
    {
        OUT_SIN(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            return (float)Math.sin(percentComplete * 1.5707963267948966);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_OUT_SIN;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
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
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_EXP;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_EXP extends Animations
    {
        IN_EXP(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            return (float)Math.pow(2.0f, 10 * (percentComplete - 1));
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$OUT_EXP;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class OUT_EXP extends Animations
    {
        OUT_EXP(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            return -(float)Math.pow(2.0f, -10 * percentComplete) + 1;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_OUT_EXP;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_OUT_EXP extends Animations
    {
        IN_OUT_EXP(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            float t = percentComplete * 2;
            if (t < 1.0f) {
                return 0.5f * (float)Math.pow(2.0f, 10 * (t - 1));
            }
            --t;
            return 0.5f * (-(float)Math.pow(2.0f, -10 * t) + 2);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_CIRCULAR;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_CIRCULAR extends Animations
    {
        IN_CIRCULAR(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            return -((float)Math.sqrt(1 - (float)Math.pow(percentComplete, 2)) - 1);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$OUT_CIRCULAR;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class OUT_CIRCULAR extends Animations
    {
        OUT_CIRCULAR(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            final float t = percentComplete - 1;
            return (float)Math.sqrt(1 - (float)Math.pow(t, 2));
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_OUT_CIRCULAR;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_OUT_CIRCULAR extends Animations
    {
        IN_OUT_CIRCULAR(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            float t = percentComplete * 2;
            if (t < 1.0f) {
                return -0.5f * ((float)Math.sqrt(1 - (float)Math.pow(t, 2)) - 1);
            }
            t -= 2;
            return 0.5f * ((float)Math.sqrt(1 - (float)Math.pow(t, 2)) + 1);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_ELASTIC;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_ELASTIC extends Animations
    {
        IN_ELASTIC(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            final float t = percentComplete - 1;
            return -(float)Math.pow(2.0f, 10 * t) * (float)Math.sin((t - 0.075f) * 6.2831855f / 0.3f);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$OUT_ELASTIC;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class OUT_ELASTIC extends Animations
    {
        OUT_ELASTIC(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            return (float)Math.pow(2.0f, -10 * percentComplete) * (float)Math.sin((percentComplete - 0.075f) * 6.2831855f / 0.3f) + 1;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_OUT_ELASTIC;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_OUT_ELASTIC extends Animations
    {
        IN_OUT_ELASTIC(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            final float t = percentComplete * 2.0f - 1;
            if (t < 0.0f) {
                return 0.5f * -(float)Math.pow(2.0f, 10 * t) * (float)Math.sin((t - 0.1125f) * 6.2831855f / 0.45f);
            }
            return 0.5f * (float)Math.pow(2.0f, -10 * t) * (float)Math.sin((t - 0.1125f) * 6.2831855f / 0.45f) + 1;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_BOUNCE;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_BOUNCE extends Animations
    {
        IN_BOUNCE(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            return 1 - Animations.OUT_BOUNCE.getValue(1 - percentComplete);
        }
    }
    
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
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/constraints/animation/Animations$IN_OUT_BOUNCE;", "Lgg/essential/elementa/constraints/animation/Animations;", "getValue", "", "percentComplete", "Elementa" })
    static final class IN_OUT_BOUNCE extends Animations
    {
        IN_OUT_BOUNCE(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @Override
        public float getValue(final float percentComplete) {
            if (percentComplete < 0.5f) {
                return Animations.IN_BOUNCE.getValue(percentComplete * 2) * 0.5f;
            }
            return Animations.OUT_BOUNCE.getValue(percentComplete * 2 - 1) * 0.5f + 0.5f;
        }
    }
}
