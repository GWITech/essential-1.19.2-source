package gg.essential.model;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.model.molang.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u009c\u0001\u0010\u0000\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003\u001a.\u0010\u0000\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002\u001a>\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003*\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0001j\u0002`\u000b2\u0006\u0010\f\u001a\u00020\r\u001a\\\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003*\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u0010\u001a\u00020\u0002\u001a\u001a\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002*.\u0010\u0011\"\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*.\u0010\u0012\"\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0001¨\u0006\u0013" }, d2 = { "catmullRom", "Lkotlin/Triple;", "", "Lgg/essential/model/FloatVector;", "t", "a", "b", "c", "d", "eval", "Lgg/essential/model/molang/MolangExpression;", "Lgg/essential/model/MolangVector;", "context", "Lgg/essential/model/molang/MolangContext;", "lerp", "other", "alpha", "FloatVector", "MolangVector", "cosmetics" })
public final class AnimationKt
{
    @NotNull
    public static final Triple<Float, Float, Float> eval(@NotNull final Triple<? extends MolangExpression, ? extends MolangExpression, ? extends MolangExpression> $this$eval, @NotNull final MolangContext context) {
        Intrinsics.checkNotNullParameter((Object)$this$eval, "<this>");
        Intrinsics.checkNotNullParameter((Object)context, "context");
        return (Triple<Float, Float, Float>)new Triple((Object)((MolangExpression)$this$eval.getFirst()).eval(context), (Object)((MolangExpression)$this$eval.getSecond()).eval(context), (Object)((MolangExpression)$this$eval.getThird()).eval(context));
    }
    
    @NotNull
    public static final Triple<Float, Float, Float> lerp(@NotNull final Triple<Float, Float, Float> $this$lerp, @NotNull final Triple<Float, Float, Float> other, final float alpha) {
        Intrinsics.checkNotNullParameter((Object)$this$lerp, "<this>");
        Intrinsics.checkNotNullParameter((Object)other, "other");
        return (Triple<Float, Float, Float>)new Triple((Object)lerp(((Number)$this$lerp.getFirst()).floatValue(), ((Number)other.getFirst()).floatValue(), alpha), (Object)lerp(((Number)$this$lerp.getSecond()).floatValue(), ((Number)other.getSecond()).floatValue(), alpha), (Object)lerp(((Number)$this$lerp.getThird()).floatValue(), ((Number)other.getThird()).floatValue(), alpha));
    }
    
    public static final float lerp(final float $this$lerp, final float other, final float alpha) {
        return $this$lerp + (other - $this$lerp) * alpha;
    }
    
    @NotNull
    public static final Triple<Float, Float, Float> catmullRom(final float t, @NotNull final Triple<Float, Float, Float> a, @NotNull final Triple<Float, Float, Float> b, @NotNull final Triple<Float, Float, Float> c, @NotNull final Triple<Float, Float, Float> d) {
        Intrinsics.checkNotNullParameter((Object)a, "a");
        Intrinsics.checkNotNullParameter((Object)b, "b");
        Intrinsics.checkNotNullParameter((Object)c, "c");
        Intrinsics.checkNotNullParameter((Object)d, "d");
        final float ax = ((Number)a.component1()).floatValue();
        final float ay = ((Number)a.component2()).floatValue();
        final float az = ((Number)a.component3()).floatValue();
        final float bx = ((Number)b.component1()).floatValue();
        final float by = ((Number)b.component2()).floatValue();
        final float bz = ((Number)b.component3()).floatValue();
        final float cx = ((Number)c.component1()).floatValue();
        final float cy = ((Number)c.component2()).floatValue();
        final float cz = ((Number)c.component3()).floatValue();
        final float dx = ((Number)d.component1()).floatValue();
        final float dy = ((Number)d.component2()).floatValue();
        final float dz = ((Number)d.component3()).floatValue();
        return (Triple<Float, Float, Float>)new Triple((Object)catmullRom(t, ax, bx, cx, dx), (Object)catmullRom(t, ay, by, cy, dy), (Object)catmullRom(t, az, bz, cz, dz));
    }
    
    public static final float catmullRom(final float t, final float a, final float b, final float c, final float d) {
        final float v0 = -0.5f * a + 1.5f * b - 1.5f * c + 0.5f * d;
        final float v2 = a - 2.5f * b + 2.0f * c - 0.5f * d;
        final float v3 = -0.5f * a + 0.5f * c;
        final float tt = t * t;
        return v0 * t * tt + v2 * tt + v3 * t + b;
    }
}
