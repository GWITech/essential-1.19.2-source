package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/constraints/PositionConstraint;", "Lgg/essential/elementa/constraints/XConstraint;", "Lgg/essential/elementa/constraints/YConstraint;", "Elementa" })
public interface PositionConstraint extends XConstraint, YConstraint
{
    default /* synthetic */ float access$getXPosition$jd(final PositionConstraint $this, final UIComponent component) {
        return $this.getXPosition(component);
    }
    
    default /* synthetic */ void access$animationFrame$jd(final PositionConstraint $this) {
        $this.animationFrame();
    }
    
    default /* synthetic */ SuperConstraint access$to$jd(final PositionConstraint $this, final UIComponent component) {
        return $this.to(component);
    }
    
    default /* synthetic */ void access$pauseIfSupported$jd(final PositionConstraint $this) {
        $this.pauseIfSupported();
    }
    
    default /* synthetic */ void access$resumeIfSupported$jd(final PositionConstraint $this) {
        $this.resumeIfSupported();
    }
    
    default /* synthetic */ void access$stopIfSupported$jd(final PositionConstraint $this) {
        $this.stopIfSupported();
    }
    
    default /* synthetic */ void access$visit$jd(final PositionConstraint $this, final ConstraintVisitor visitor, final ConstraintType type, final boolean setNewConstraint) {
        $this.visit(visitor, type, setNewConstraint);
    }
    
    default /* synthetic */ float access$getYPosition$jd(final PositionConstraint $this, final UIComponent component) {
        return $this.getYPosition(component);
    }
}
