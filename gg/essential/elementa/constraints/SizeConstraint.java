package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/constraints/SizeConstraint;", "Lgg/essential/elementa/constraints/WidthConstraint;", "Lgg/essential/elementa/constraints/HeightConstraint;", "Lgg/essential/elementa/constraints/RadiusConstraint;", "Elementa" })
public interface SizeConstraint extends WidthConstraint, HeightConstraint, RadiusConstraint
{
    default /* synthetic */ float access$getWidth$jd(final SizeConstraint $this, final UIComponent component) {
        return $this.getWidth(component);
    }
    
    default /* synthetic */ void access$animationFrame$jd(final SizeConstraint $this) {
        $this.animationFrame();
    }
    
    default /* synthetic */ SuperConstraint access$to$jd(final SizeConstraint $this, final UIComponent component) {
        return $this.to(component);
    }
    
    default /* synthetic */ void access$pauseIfSupported$jd(final SizeConstraint $this) {
        $this.pauseIfSupported();
    }
    
    default /* synthetic */ void access$resumeIfSupported$jd(final SizeConstraint $this) {
        $this.resumeIfSupported();
    }
    
    default /* synthetic */ void access$stopIfSupported$jd(final SizeConstraint $this) {
        $this.stopIfSupported();
    }
    
    default /* synthetic */ void access$visit$jd(final SizeConstraint $this, final ConstraintVisitor visitor, final ConstraintType type, final boolean setNewConstraint) {
        $this.visit(visitor, type, setNewConstraint);
    }
    
    default /* synthetic */ float access$getHeight$jd(final SizeConstraint $this, final UIComponent component) {
        return $this.getHeight(component);
    }
    
    default /* synthetic */ float access$getTextScale$jd(final SizeConstraint $this, final UIComponent component) {
        return $this.getTextScale(component);
    }
    
    default /* synthetic */ float access$getRadius$jd(final SizeConstraint $this, final UIComponent component) {
        return $this.getRadius(component);
    }
}
