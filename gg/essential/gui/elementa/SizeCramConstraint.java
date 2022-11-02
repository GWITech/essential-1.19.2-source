package gg.essential.gui.elementa;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.*;
import gg.essential.elementa.utils.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000<
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000b
                                                   \u0002\b	
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0002\u0010	J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020"2\u0006\u0010#\u001a\u00020$H\u0016R\u001a\u0010
                                                   \u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u000b\u0010\f"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0011\u0010\u0012"\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0017\u0010\u0018"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006%""" }, d2 = { "Lgg/essential/gui/elementa/SizeCramConstraint;", "Lgg/essential/elementa/constraints/SizeConstraint;", "value", "", "minPixelSize", "maxPixelSize", "minSeparation", "Lgg/essential/elementa/constraints/WidthConstraint;", "margins", "(FFFLgg/essential/elementa/constraints/WidthConstraint;Lgg/essential/elementa/constraints/SizeConstraint;)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getHeightImpl", "component", "getRadiusImpl", "getWidthImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "essential" })
public final class SizeCramConstraint implements SizeConstraint
{
    @NotNull
    private final WidthConstraint minSeparation;
    @NotNull
    private final SizeConstraint margins;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    @JvmOverloads
    public SizeCramConstraint(@NotNull final WidthConstraint minSeparation, @NotNull final SizeConstraint margins) {
        Intrinsics.checkNotNullParameter((Object)minSeparation, "minSeparation");
        Intrinsics.checkNotNullParameter((Object)margins, "margins");
        super();
        this.minSeparation = minSeparation;
        this.margins = margins;
        this.recalculate = true;
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
    public boolean getRecalculate() {
        return this.recalculate;
    }
    
    @Override
    public void setRecalculate(final boolean <set-?>) {
        this.recalculate = <set-?>;
    }
    
    @Nullable
    @Override
    public UIComponent getConstrainTo() {
        return this.constrainTo;
    }
    
    @Override
    public void setConstrainTo(@Nullable final UIComponent <set-?>) {
        this.constrainTo = <set-?>;
    }
    
    @Override
    public float getWidthImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        UIComponent uiComponent;
        if ((uiComponent = this.getConstrainTo()) == null) {
            uiComponent = component.getParent();
        }
        float fl = uiComponent.getWidth() * 0.084375f;
        if (fl < 81.0f) {
            fl = 81.0f;
        }
        if (fl > 125.0f) {
            fl = 125.0f;
        }
        final float totalWidth = component.getParent().getWidth() - this.margins.getWidth(component) * 2.0f;
        int perRow = (int)(totalWidth / fl);
        if (perRow < (int)(totalWidth / 81.0f)) {
            perRow = (int)(totalWidth / 81.0f);
        }
        if (perRow * 81.0f + (perRow - 1) * this.minSeparation.getWidth(component) > totalWidth) {
            --perRow;
        }
        if (perRow == 1) {
            return totalWidth;
        }
        return ExtensionsKt.guiHint((totalWidth - this.minSeparation.getWidth(component) * perRow) / perRow, true);
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        UIComponent uiComponent;
        if ((uiComponent = this.getConstrainTo()) == null) {
            uiComponent = component.getParent();
        }
        return uiComponent.getHeight() * 0.084375f;
    }
    
    @Override
    public float getRadiusImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        UIComponent uiComponent;
        if ((uiComponent = this.getConstrainTo()) == null) {
            uiComponent = component.getParent();
        }
        return uiComponent.getWidth() * 0.084375f / 2.0f;
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        switch (SizeCramConstraint.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: {
                visitor.visitParent(ConstraintType.WIDTH);
                break;
            }
            case 2: {
                visitor.visitParent(ConstraintType.HEIGHT);
                break;
            }
            case 3: {
                visitor.visitParent(ConstraintType.WIDTH);
                break;
            }
            default: {
                throw new IllegalArgumentException(type.getPrettyName());
            }
        }
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
