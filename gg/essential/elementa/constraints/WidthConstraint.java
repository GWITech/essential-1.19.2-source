package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.utils.*;
import gg.essential.elementa.constraints.debug.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/constraints/WidthConstraint;", "Lgg/essential/elementa/constraints/SuperConstraint;", "", "getWidth", "component", "Lgg/essential/elementa/UIComponent;", "getWidthImpl", "Elementa" })
public interface WidthConstraint extends SuperConstraint<Float>
{
    float getWidthImpl(@NotNull final UIComponent p0);
    
    default float getWidth(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ConstraintDebugger debugger = ConstraintDebuggerKt.getConstraintDebugger();
        if (debugger != null) {
            return debugger.evaluate(this, ConstraintType.WIDTH, component);
        }
        if (this.getRecalculate()) {
            this.setCachedValue(ExtensionsKt.roundToRealPixels(this.getWidthImpl(component)));
            this.setRecalculate(false);
        }
        return ((SuperConstraint<Number>)this).getCachedValue().floatValue();
    }
    
    default /* synthetic */ float access$getWidth$jd(final WidthConstraint $this, final UIComponent component) {
        return $this.getWidth(component);
    }
    
    default /* synthetic */ void access$animationFrame$jd(final WidthConstraint $this) {
        $this.animationFrame();
    }
    
    default /* synthetic */ SuperConstraint access$to$jd(final WidthConstraint $this, final UIComponent component) {
        return $this.to(component);
    }
    
    default /* synthetic */ void access$pauseIfSupported$jd(final WidthConstraint $this) {
        $this.pauseIfSupported();
    }
    
    default /* synthetic */ void access$resumeIfSupported$jd(final WidthConstraint $this) {
        $this.resumeIfSupported();
    }
    
    default /* synthetic */ void access$stopIfSupported$jd(final WidthConstraint $this) {
        $this.stopIfSupported();
    }
    
    default /* synthetic */ void access$visit$jd(final WidthConstraint $this, final ConstraintVisitor visitor, final ConstraintType type, final boolean setNewConstraint) {
        $this.visit(visitor, type, setNewConstraint);
    }
}
