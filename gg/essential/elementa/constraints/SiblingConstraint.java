package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0004J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0010H\u0016J \u0010\"\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0004J \u0010#\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0004J \u0010$\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0004J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0010H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0010H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0010H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u001a¨\u0006." }, d2 = { "Lgg/essential/elementa/constraints/SiblingConstraint;", "Lgg/essential/elementa/constraints/PositionConstraint;", "Lgg/essential/elementa/constraints/PaddingConstraint;", "padding", "", "alignOpposite", "", "(FZ)V", "getAlignOpposite", "()Z", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "getPadding", "()F", "recalculate", "getRecalculate", "setRecalculate", "(Z)V", "getHighestPoint", "sibling", "parent", "index", "", "getHorizontalPadding", "component", "getLeftmostPoint", "getLowestPoint", "getRightmostPoint", "getVerticalPadding", "getXPositionImpl", "getYPositionImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public class SiblingConstraint implements PositionConstraint, PaddingConstraint
{
    private final float padding;
    private final boolean alignOpposite;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    @JvmOverloads
    public SiblingConstraint(final float padding, final boolean alignOpposite) {
        super();
        this.padding = padding;
        this.alignOpposite = alignOpposite;
        this.recalculate = true;
    }
    
    public SiblingConstraint(float padding, boolean alignOpposite, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            padding = 0.0f;
        }
        if ((n & 0x2) != 0x0) {
            alignOpposite = false;
        }
        this(padding, alignOpposite);
    }
    
    public final float getPadding() {
        return this.padding;
    }
    
    public final boolean getAlignOpposite() {
        return this.alignOpposite;
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
    public float getXPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final UIComponent constrainTo = this.getConstrainTo();
        if (constrainTo != null) {
            final UIComponent it = constrainTo;
            final int n = 0;
            return this.getAlignOpposite() ? (it.getLeft() - component.getWidth() - this.getPadding()) : (it.getRight() + this.getPadding());
        }
        final int index = component.getParent().getChildren().indexOf(component);
        if (this.alignOpposite) {
            if (index == 0) {
                return component.getParent().getRight() - component.getWidth();
            }
            final UIComponent sibling = component.getParent().getChildren().get(index - 1);
            Intrinsics.checkNotNullExpressionValue((Object)sibling, "sibling");
            return this.getLeftmostPoint(sibling, component.getParent(), index) - component.getWidth() - this.padding;
        }
        else {
            if (index == 0) {
                return component.getParent().getLeft();
            }
            final UIComponent sibling = component.getParent().getChildren().get(index - 1);
            Intrinsics.checkNotNullExpressionValue((Object)sibling, "sibling");
            return this.getRightmostPoint(sibling, component.getParent(), index) + this.padding;
        }
    }
    
    @Override
    public float getYPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final UIComponent constrainTo = this.getConstrainTo();
        if (constrainTo != null) {
            final UIComponent it = constrainTo;
            final int n = 0;
            return this.getAlignOpposite() ? (it.getTop() - component.getHeight() - this.getPadding()) : (it.getBottom() + this.getPadding());
        }
        final int index = component.getParent().getChildren().indexOf(component);
        if (this.alignOpposite) {
            if (index == 0) {
                return component.getParent().getBottom() - component.getHeight();
            }
            final UIComponent sibling = component.getParent().getChildren().get(index - 1);
            Intrinsics.checkNotNullExpressionValue((Object)sibling, "sibling");
            return this.getHighestPoint(sibling, component.getParent(), index) - component.getHeight() - this.padding;
        }
        else {
            if (index == 0) {
                return component.getParent().getTop();
            }
            final UIComponent sibling = component.getParent().getChildren().get(index - 1);
            Intrinsics.checkNotNullExpressionValue((Object)sibling, "sibling");
            return this.getLowestPoint(sibling, component.getParent(), index) + this.padding;
        }
    }
    
    protected final float getLowestPoint(@NotNull final UIComponent sibling, @NotNull final UIComponent parent, final int index) {
        Intrinsics.checkNotNullParameter((Object)sibling, "sibling");
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        float lowestPoint = sibling.getBottom();
        int n2 = index - 1;
        if (0 <= n2) {
            do {
                final int n = n2;
                --n2;
                final UIComponent child = parent.getChildren().get(n);
                if (child.getTop() != sibling.getTop()) {
                    break;
                }
                if (child.getBottom() <= lowestPoint) {
                    continue;
                }
                lowestPoint = child.getBottom();
            } while (0 <= n2);
        }
        return lowestPoint;
    }
    
    protected final float getHighestPoint(@NotNull final UIComponent sibling, @NotNull final UIComponent parent, final int index) {
        Intrinsics.checkNotNullParameter((Object)sibling, "sibling");
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        float highestPoint = sibling.getTop();
        int n2 = index - 1;
        if (0 <= n2) {
            do {
                final int n = n2;
                --n2;
                final UIComponent child = parent.getChildren().get(n);
                if (child.getBottom() != sibling.getBottom()) {
                    break;
                }
                if (child.getTop() >= highestPoint) {
                    continue;
                }
                highestPoint = child.getTop();
            } while (0 <= n2);
        }
        return highestPoint;
    }
    
    protected final float getRightmostPoint(@NotNull final UIComponent sibling, @NotNull final UIComponent parent, final int index) {
        Intrinsics.checkNotNullParameter((Object)sibling, "sibling");
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        float rightmostPoint = sibling.getRight();
        int n2 = index - 1;
        if (0 <= n2) {
            do {
                final int n = n2;
                --n2;
                final UIComponent child = parent.getChildren().get(n);
                if (child.getLeft() != sibling.getLeft()) {
                    break;
                }
                if (child.getRight() <= rightmostPoint) {
                    continue;
                }
                rightmostPoint = child.getRight();
            } while (0 <= n2);
        }
        return rightmostPoint;
    }
    
    protected final float getLeftmostPoint(@NotNull final UIComponent sibling, @NotNull final UIComponent parent, final int index) {
        Intrinsics.checkNotNullParameter((Object)sibling, "sibling");
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        float leftmostPoint = sibling.getLeft();
        int n2 = index - 1;
        if (0 <= n2) {
            do {
                final int n = n2;
                --n2;
                final UIComponent child = parent.getChildren().get(n);
                if (child.getRight() != sibling.getRight()) {
                    break;
                }
                if (child.getLeft() >= leftmostPoint) {
                    continue;
                }
                leftmostPoint = child.getLeft();
            } while (0 <= n2);
        }
        return leftmostPoint;
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        final UIComponent it = visitor.getComponent();
        final int n2 = 0;
        final int indexInParent = it.getParent().getChildren().indexOf(it);
        switch (SiblingConstraint.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: {
                if (this.alignOpposite) {
                    visitor.visitSelf(ConstraintType.WIDTH);
                    if (indexInParent <= 0) {
                        visitor.visitParent(ConstraintType.X);
                        visitor.visitParent(ConstraintType.WIDTH);
                        return;
                    }
                    int n3 = indexInParent - 1;
                    if (0 <= n3) {
                        do {
                            final int n = n3;
                            --n3;
                            visitor.visitSibling(ConstraintType.X, n);
                            visitor.visitSibling(ConstraintType.WIDTH, n);
                        } while (0 <= n3);
                        break;
                    }
                    break;
                }
                else {
                    if (indexInParent <= 0) {
                        visitor.visitParent(ConstraintType.X);
                        return;
                    }
                    int n4 = indexInParent - 1;
                    if (0 <= n4) {
                        do {
                            final int n = n4;
                            --n4;
                            visitor.visitSibling(ConstraintType.X, n);
                            visitor.visitSibling(ConstraintType.WIDTH, n);
                        } while (0 <= n4);
                        break;
                    }
                    break;
                }
                break;
            }
            case 2: {
                if (this.alignOpposite) {
                    visitor.visitSelf(ConstraintType.HEIGHT);
                    if (indexInParent <= 0) {
                        visitor.visitParent(ConstraintType.Y);
                        visitor.visitParent(ConstraintType.HEIGHT);
                        return;
                    }
                    int n5 = indexInParent - 1;
                    if (0 <= n5) {
                        do {
                            final int n = n5;
                            --n5;
                            visitor.visitSibling(ConstraintType.Y, n);
                            visitor.visitSibling(ConstraintType.HEIGHT, n);
                        } while (0 <= n5);
                        break;
                    }
                    break;
                }
                else {
                    if (indexInParent <= 0) {
                        visitor.visitParent(ConstraintType.Y);
                        return;
                    }
                    int n6 = indexInParent - 1;
                    if (0 <= n6) {
                        do {
                            final int n = n6;
                            --n6;
                            visitor.visitSibling(ConstraintType.Y, n);
                            visitor.visitSibling(ConstraintType.HEIGHT, n);
                        } while (0 <= n6);
                        break;
                    }
                    break;
                }
                break;
            }
            default: {
                throw new IllegalArgumentException(type.getPrettyName());
            }
        }
    }
    
    @Override
    public float getVerticalPadding(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final int index = component.getParent().getChildren().indexOf(component);
        return (index == 0 && this.getConstrainTo() == null) ? 0.0f : this.padding;
    }
    
    @Override
    public float getHorizontalPadding(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final int index = component.getParent().getChildren().indexOf(component);
        return (index == 0 && this.getConstrainTo() == null) ? 0.0f : this.padding;
    }
    
    @JvmOverloads
    public SiblingConstraint(final float padding) {
        this(padding, false, 2, null);
    }
    
    @JvmOverloads
    public SiblingConstraint() {
        this(0.0f, false, 3, null);
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
