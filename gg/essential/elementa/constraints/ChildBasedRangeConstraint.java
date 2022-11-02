package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;
import java.util.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f" }, d2 = { "Lgg/essential/elementa/constraints/ChildBasedRangeConstraint;", "Lgg/essential/elementa/constraints/WidthConstraint;", "Lgg/essential/elementa/constraints/HeightConstraint;", "()V", "cachedValue", "", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getHeightImpl", "component", "getWidthImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class ChildBasedRangeConstraint implements WidthConstraint, HeightConstraint
{
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public ChildBasedRangeConstraint() {
        super();
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
        final Iterator iterator = component.getChildren().iterator();
        Float value;
        Float n;
        if (!iterator.hasNext()) {
            n = (value = null);
        }
        else {
            final UIComponent it = (UIComponent)iterator.next();
            final int n2 = 0;
            float n3 = it.getLeft();
            while (iterator.hasNext()) {
                final UIComponent it2 = (UIComponent)iterator.next();
                final int n4 = 0;
                n3 = Math.min(n3, it2.getLeft());
            }
            n = (value = n3);
        }
        if (value == null) {
            return 0.0f;
        }
        final float leftMostPoint = n;
        final Iterator iterator2 = component.getChildren().iterator();
        Float value2;
        Float n5;
        if (!iterator2.hasNext()) {
            n5 = (value2 = null);
        }
        else {
            final UIComponent it2 = (UIComponent)iterator2.next();
            final int n6 = 0;
            float n7 = it2.getRight();
            while (iterator2.hasNext()) {
                final UIComponent it3 = (UIComponent)iterator2.next();
                final int n8 = 0;
                n7 = Math.max(n7, it3.getRight());
            }
            n5 = (value2 = n7);
        }
        if (value2 == null) {
            return 0.0f;
        }
        final float rightMostPoint = n5;
        return RangesKt.coerceAtLeast(rightMostPoint - leftMostPoint, 0.0f);
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final Iterator iterator = component.getChildren().iterator();
        Float value;
        Float n;
        if (!iterator.hasNext()) {
            n = (value = null);
        }
        else {
            final UIComponent it = (UIComponent)iterator.next();
            final int n2 = 0;
            float n3 = it.getTop();
            while (iterator.hasNext()) {
                final UIComponent it2 = (UIComponent)iterator.next();
                final int n4 = 0;
                n3 = Math.min(n3, it2.getTop());
            }
            n = (value = n3);
        }
        if (value == null) {
            return 0.0f;
        }
        final float topMostPoint = n;
        final Iterator iterator2 = component.getChildren().iterator();
        Float value2;
        Float n5;
        if (!iterator2.hasNext()) {
            n5 = (value2 = null);
        }
        else {
            final UIComponent it2 = (UIComponent)iterator2.next();
            final int n6 = 0;
            float n7 = it2.getBottom();
            while (iterator2.hasNext()) {
                final UIComponent it3 = (UIComponent)iterator2.next();
                final int n8 = 0;
                n7 = Math.max(n7, it3.getBottom());
            }
            n5 = (value2 = n7);
        }
        if (value2 == null) {
            return 0.0f;
        }
        final float bottomMostPoint = n5;
        return RangesKt.coerceAtLeast(bottomMostPoint - topMostPoint, 0.0f);
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        switch (ChildBasedRangeConstraint.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: {
                visitor.visitChildren(ConstraintType.X);
                visitor.visitChildren(ConstraintType.WIDTH);
                break;
            }
            case 2: {
                visitor.visitChildren(ConstraintType.Y);
                visitor.visitChildren(ConstraintType.HEIGHT);
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
