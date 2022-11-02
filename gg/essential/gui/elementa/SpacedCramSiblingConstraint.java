package gg.essential.gui.elementa;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.studio.*;
import kotlin.ranges.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000<
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000b
                                                   \u0002\b	
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\b\u0010	"\u0004\b
                                                   \u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u000e\u0010\u000f"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0015"\u0004\b\u0016\u0010\u0017¨\u0006"""" }, d2 = { "Lgg/essential/gui/elementa/SpacedCramSiblingConstraint;", "Lgg/essential/elementa/constraints/SiblingConstraint;", "minSeparation", "Lgg/essential/elementa/constraints/WidthConstraint;", "margin", "(Lgg/essential/elementa/constraints/WidthConstraint;Lgg/essential/elementa/constraints/WidthConstraint;)V", "cachedValue", "", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getXPositionImpl", "component", "getYPositionImpl", "to", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "essential" })
public final class SpacedCramSiblingConstraint extends SiblingConstraint
{
    @NotNull
    private final WidthConstraint minSeparation;
    @NotNull
    private final WidthConstraint margin;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public SpacedCramSiblingConstraint(@NotNull final WidthConstraint minSeparation, @NotNull final WidthConstraint margin) {
        Intrinsics.checkNotNullParameter((Object)minSeparation, "minSeparation");
        Intrinsics.checkNotNullParameter((Object)margin, "margin");
        super(0.0f, false, 3, null);
        this.minSeparation = minSeparation;
        this.margin = margin;
        this.recalculate = true;
    }
    
    @NotNull
    @Override
    public Float getCachedValue() {
        return this.cachedValue;
    }
    
    @Override
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
    public float getXPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final int index = component.getParent().getChildren().indexOf(component);
        final int marginPixels = (int)this.margin.getWidth(component);
        final int minSeparationPixels = (int)this.minSeparation.getWidth(component);
        final float totalWidth = component.getParent().getWidth() - marginPixels * 2;
        final float itemWidth = component.getWidth();
        final int itemsPerRow = (int)((totalWidth + minSeparationPixels) / (itemWidth + minSeparationPixels));
        if (itemsPerRow <= 1) {
            return component.getParent().getLeft() + (totalWidth - itemWidth) / 2.0f;
        }
        if (index == 0) {
            return component.getParent().getLeft() + marginPixels;
        }
        final float itemSep = (totalWidth - itemsPerRow * itemWidth) / (itemsPerRow - 1);
        final UIComponent sibling = component.getParent().getChildren().get(index - 1);
        if (sibling.getRight() + component.getWidth() + minSeparationPixels < component.getParent().getRight()) {
            return sibling.getRight() + itemSep;
        }
        return component.getParent().getLeft() + marginPixels;
    }
    
    @Override
    public float getYPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final int index = component.getParent().getChildren().indexOf(component);
        final int marginPixels = (int)this.margin.getWidth(component);
        if (index == 0) {
            return component.getParent().getTop() + marginPixels;
        }
        final int minSeparationPixels = (int)this.minSeparation.getWidth(component);
        final float totalWidth = component.getParent().getWidth() - marginPixels * 2;
        final float itemWidth = component.getWidth();
        final int itemsPerRow = (int)((totalWidth + minSeparationPixels) / (itemWidth + minSeparationPixels));
        final UIComponent sibling = component.getParent().getChildren().get(index - 1);
        if (itemsPerRow <= 1) {
            return sibling.getBottom() + minSeparationPixels;
        }
        final float itemSep = (totalWidth - itemsPerRow * itemWidth) / (itemsPerRow - 1);
        if (sibling.getRight() + component.getWidth() + minSeparationPixels < component.getParent().getRight()) {
            return sibling.getTop();
        }
        if (!(sibling instanceof CosmeticOption)) {
            return sibling.getBottom();
        }
        return this.getLowestPoint(sibling, component.getParent(), index) + RangesKt.coerceAtLeast(itemSep, (float)minSeparationPixels);
    }
    
    @NotNull
    @Override
    public SpacedCramSiblingConstraint to(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        throw new UnsupportedOperationException("Constraint.to(UIComponent) is not available in this context!");
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        final UIComponent it = visitor.getComponent();
        final int indexInParent = it.getParent().getChildren().indexOf(it);
        switch (SpacedCramSiblingConstraint.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: {
                if (indexInParent == 0) {
                    visitor.visitParent(ConstraintType.X);
                    return;
                }
                visitor.visitSelf(ConstraintType.WIDTH);
                visitor.visitSibling(ConstraintType.X, indexInParent - 1);
                visitor.visitSibling(ConstraintType.WIDTH, indexInParent - 1);
                visitor.visitParent(ConstraintType.WIDTH);
                visitor.visitParent(ConstraintType.X);
                break;
            }
            case 2: {
                if (indexInParent == 0) {
                    visitor.visitParent(ConstraintType.Y);
                    return;
                }
                visitor.visitSelf(ConstraintType.WIDTH);
                visitor.visitSibling(ConstraintType.X, indexInParent - 1);
                visitor.visitSibling(ConstraintType.WIDTH, indexInParent - 1);
                visitor.visitParent(ConstraintType.WIDTH);
                visitor.visitParent(ConstraintType.X);
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
    
    @Override
    public /* bridge */ SuperConstraint to(final UIComponent component) {
        return this.to(component);
    }
}
