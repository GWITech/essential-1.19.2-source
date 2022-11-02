package gg.essential.elementa.constraints.animation;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u001a\u0010\r\u001a\u00020\u0002X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\n\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017" }, d2 = { "Lgg/essential/elementa/constraints/animation/FloatFieldAnimationComponent;", "Lgg/essential/elementa/constraints/animation/FieldAnimationComponent;", "", "field", "Lkotlin/reflect/KMutableProperty0;", "strategy", "Lgg/essential/elementa/constraints/animation/AnimationStrategy;", "totalFrames", "", "oldValue", "newValue", "delay", "(Lkotlin/reflect/KMutableProperty0;Lgg/essential/elementa/constraints/animation/AnimationStrategy;IFFI)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "getField", "()Lkotlin/reflect/KMutableProperty0;", "setValue", "", "percentComplete", "Elementa" })
public final class FloatFieldAnimationComponent extends FieldAnimationComponent<Float>
{
    @NotNull
    private final KMutableProperty0<Float> field;
    private final float oldValue;
    private final float newValue;
    private float cachedValue;
    
    public FloatFieldAnimationComponent(@NotNull final KMutableProperty0<Float> field, @NotNull final AnimationStrategy strategy, final int totalFrames, final float oldValue, final float newValue, final int delay) {
        Intrinsics.checkNotNullParameter((Object)field, "field");
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        super(strategy, totalFrames, delay, null);
        this.field = field;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }
    
    @NotNull
    @Override
    public KMutableProperty0<Float> getField() {
        return this.field;
    }
    
    @NotNull
    @Override
    public Float getCachedValue() {
        return this.cachedValue;
    }
    
    public void setCachedValue(final float <set-?>) {
        this.cachedValue = <set-?>;
    }
    
    @Override
    public void setValue(final float percentComplete) {
        this.getField().set((Object)(this.oldValue + percentComplete * (this.newValue - this.oldValue)));
    }
    
    @Override
    public /* bridge */ Object getCachedValue() {
        return this.getCachedValue();
    }
    
    @Override
    public /* bridge */ void setCachedValue(final Object <set-?>) {
        this.setCachedValue(((Number)<set-?>).floatValue());
    }
}
