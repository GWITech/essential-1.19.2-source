package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/constraints/MasterConstraint;", "Lgg/essential/elementa/constraints/PositionConstraint;", "Lgg/essential/elementa/constraints/SizeConstraint;", "Elementa" })
public interface MasterConstraint extends PositionConstraint, SizeConstraint
{
    default /* synthetic */ float access$getXPosition$jd(final MasterConstraint $this, final UIComponent component) {
        return $this.getXPosition(component);
    }
    
    default /* synthetic */ void access$animationFrame$jd(final MasterConstraint $this) {
        $this.animationFrame();
    }
    
    default /* synthetic */ SuperConstraint access$to$jd(final MasterConstraint $this, final UIComponent component) {
        return $this.to(component);
    }
    
    default /* synthetic */ void access$pauseIfSupported$jd(final MasterConstraint $this) {
        $this.pauseIfSupported();
    }
    
    default /* synthetic */ void access$resumeIfSupported$jd(final MasterConstraint $this) {
        $this.resumeIfSupported();
    }
    
    default /* synthetic */ void access$stopIfSupported$jd(final MasterConstraint $this) {
        $this.stopIfSupported();
    }
    
    default /* synthetic */ void access$visit$jd(final MasterConstraint $this, final ConstraintVisitor visitor, final ConstraintType type, final boolean setNewConstraint) {
        $this.visit(visitor, type, setNewConstraint);
    }
    
    default /* synthetic */ float access$getYPosition$jd(final MasterConstraint $this, final UIComponent component) {
        return $this.getYPosition(component);
    }
    
    default /* synthetic */ float access$getWidth$jd(final MasterConstraint $this, final UIComponent component) {
        return $this.getWidth(component);
    }
    
    default /* synthetic */ float access$getHeight$jd(final MasterConstraint $this, final UIComponent component) {
        return $this.getHeight(component);
    }
    
    default /* synthetic */ float access$getTextScale$jd(final MasterConstraint $this, final UIComponent component) {
        return $this.getTextScale(component);
    }
    
    default /* synthetic */ float access$getRadius$jd(final MasterConstraint $this, final UIComponent component) {
        return $this.getRadius(component);
    }
}
