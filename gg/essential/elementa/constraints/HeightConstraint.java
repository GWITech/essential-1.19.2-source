package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.utils.*;
import gg.essential.elementa.constraints.debug.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/constraints/HeightConstraint;", "Lgg/essential/elementa/constraints/SuperConstraint;", "", "getHeight", "component", "Lgg/essential/elementa/UIComponent;", "getHeightImpl", "getTextScale", "Elementa" })
public interface HeightConstraint extends SuperConstraint<Float>
{
    float getHeightImpl(@NotNull final UIComponent p0);
    
    default float getHeight(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ConstraintDebugger debugger = ConstraintDebuggerKt.getConstraintDebugger();
        if (debugger != null) {
            return debugger.evaluate(this, ConstraintType.HEIGHT, component);
        }
        if (this.getRecalculate()) {
            this.setCachedValue(ExtensionsKt.roundToRealPixels(this.getHeightImpl(component)));
            this.setRecalculate(false);
        }
        return ((SuperConstraint<Number>)this).getCachedValue().floatValue();
    }
    
    default float getTextScale(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return this.getHeight(component);
    }
    
    default /* synthetic */ float access$getHeight$jd(final HeightConstraint $this, final UIComponent component) {
        return $this.getHeight(component);
    }
    
    default /* synthetic */ float access$getTextScale$jd(final HeightConstraint $this, final UIComponent component) {
        return $this.getTextScale(component);
    }
    
    default /* synthetic */ void access$animationFrame$jd(final HeightConstraint $this) {
        $this.animationFrame();
    }
    
    default /* synthetic */ SuperConstraint access$to$jd(final HeightConstraint $this, final UIComponent component) {
        return $this.to(component);
    }
    
    default /* synthetic */ void access$pauseIfSupported$jd(final HeightConstraint $this) {
        $this.pauseIfSupported();
    }
    
    default /* synthetic */ void access$resumeIfSupported$jd(final HeightConstraint $this) {
        $this.resumeIfSupported();
    }
    
    default /* synthetic */ void access$stopIfSupported$jd(final HeightConstraint $this) {
        $this.stopIfSupported();
    }
    
    default /* synthetic */ void access$visit$jd(final HeightConstraint $this, final ConstraintVisitor visitor, final ConstraintType type, final boolean setNewConstraint) {
        $this.visit(visitor, type, setNewConstraint);
    }
}
