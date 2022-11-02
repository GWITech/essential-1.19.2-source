package gg.essential.gui.elementa;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import gg.essential.universal.*;
import kotlin.ranges.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0010\u000b
                                                   \u0002\b\f
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020
                                                   H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020
                                                   H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020
                                                   H\u0016J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020
                                                   H\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020
                                                   H\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010"\u001a\u00020#H\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007"\u0004\b\b\u0010\u0004R\u001c\u0010	\u001a\u0004\u0018\u00010
                                                   X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u000b\u0010\f"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0013\u0010\u0014"\u0004\b\u0015\u0010\u0016¨\u0006$""" }, d2 = { "Lgg/essential/gui/elementa/GuiScaleOffsetConstraint;", "Lgg/essential/elementa/constraints/MasterConstraint;", "offset", "", "(F)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "getOffset", "()F", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getHeightImpl", "component", "getRadiusImpl", "getValue", "getWidthImpl", "getXPositionImpl", "getYPositionImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "essential" })
public final class GuiScaleOffsetConstraint implements MasterConstraint
{
    private final float offset;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public GuiScaleOffsetConstraint(final float offset) {
        super();
        this.offset = offset;
        this.recalculate = true;
    }
    
    public GuiScaleOffsetConstraint(final byte b) {
        this(-1.0f);
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
    
    private final float getValue() {
        final double scaleFactor = UResolution.getScaleFactor();
        return (float)(RangesKt.coerceAtLeast(scaleFactor + this.offset, 1.0) / scaleFactor);
    }
    
    @Override
    public float getXPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return component.getParent().getLeft() + this.getValue();
    }
    
    @Override
    public float getYPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return component.getParent().getTop() + this.getValue();
    }
    
    @Override
    public float getWidthImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return this.getValue();
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return this.getValue();
    }
    
    @Override
    public float getRadiusImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return this.getValue();
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
    }
    
    public GuiScaleOffsetConstraint() {
        this((byte)0);
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
