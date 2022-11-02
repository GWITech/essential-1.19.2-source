package gg.essential.elementa.constraints;

import java.awt.*;
import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/constraints/ColorConstraint;", "Lgg/essential/elementa/constraints/SuperConstraint;", "Ljava/awt/Color;", "getColor", "component", "Lgg/essential/elementa/UIComponent;", "getColorImpl", "Elementa" })
public interface ColorConstraint extends SuperConstraint<Color>
{
    @NotNull
    Color getColorImpl(@NotNull final UIComponent p0);
    
    @NotNull
    default Color getColor(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        if (this.getRecalculate()) {
            this.setCachedValue(this.getColorImpl(component));
            this.setRecalculate(false);
        }
        return this.getCachedValue();
    }
    
    default /* synthetic */ Color access$getColor$jd(final ColorConstraint $this, final UIComponent component) {
        return $this.getColor(component);
    }
    
    default /* synthetic */ void access$animationFrame$jd(final ColorConstraint $this) {
        $this.animationFrame();
    }
    
    default /* synthetic */ SuperConstraint access$to$jd(final ColorConstraint $this, final UIComponent component) {
        return $this.to(component);
    }
    
    default /* synthetic */ void access$pauseIfSupported$jd(final ColorConstraint $this) {
        $this.pauseIfSupported();
    }
    
    default /* synthetic */ void access$resumeIfSupported$jd(final ColorConstraint $this) {
        $this.resumeIfSupported();
    }
    
    default /* synthetic */ void access$stopIfSupported$jd(final ColorConstraint $this) {
        $this.stopIfSupported();
    }
    
    default /* synthetic */ void access$visit$jd(final ColorConstraint $this, final ConstraintVisitor visitor, final ConstraintType type, final boolean setNewConstraint) {
        $this.visit(visitor, type, setNewConstraint);
    }
}
