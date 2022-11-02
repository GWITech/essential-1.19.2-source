package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f" }, d2 = { "Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;", "Lgg/essential/elementa/constraints/SizeConstraint;", "()V", "cachedValue", "", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getHeightImpl", "component", "getRadiusImpl", "getWidthImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class ChildBasedMaxSizeConstraint implements SizeConstraint
{
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public ChildBasedMaxSizeConstraint() {
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
        UIComponent constrainTo;
        if ((constrainTo = this.getConstrainTo()) == null) {
            constrainTo = component;
        }
        final Iterable $this$maxByOrNull$iv = constrainTo.getChildren();
        final int $i$f$maxByOrNull = 0;
        final Iterator iterator$iv = $this$maxByOrNull$iv.iterator();
        Object o;
        if (!iterator$iv.hasNext()) {
            o = null;
        }
        else {
            Object maxElem$iv = iterator$iv.next();
            if (!iterator$iv.hasNext()) {
                o = maxElem$iv;
            }
            else {
                final UIComponent it = (UIComponent)maxElem$iv;
                final int n = 0;
                final float width = it.getWidth();
                final XConstraint x = it.getConstraints().getX();
                final PaddingConstraint paddingConstraint = (x instanceof PaddingConstraint) ? x : null;
                float horizontalPadding;
                if (paddingConstraint == null) {
                    horizontalPadding = 0.0f;
                }
                else {
                    Intrinsics.checkNotNullExpressionValue((Object)it, "it");
                    horizontalPadding = paddingConstraint.getHorizontalPadding(it);
                }
                float maxValue$iv = width + horizontalPadding;
                do {
                    final Object e$iv = iterator$iv.next();
                    final UIComponent it2 = (UIComponent)e$iv;
                    final int n2 = 0;
                    final float width2 = it2.getWidth();
                    final XConstraint x2 = it2.getConstraints().getX();
                    final PaddingConstraint paddingConstraint2 = (x2 instanceof PaddingConstraint) ? x2 : null;
                    float horizontalPadding2;
                    if (paddingConstraint2 == null) {
                        horizontalPadding2 = 0.0f;
                    }
                    else {
                        Intrinsics.checkNotNullExpressionValue((Object)it2, "it");
                        horizontalPadding2 = paddingConstraint2.getHorizontalPadding(it2);
                    }
                    final float v$iv = width2 + horizontalPadding2;
                    if (Float.compare(maxValue$iv, v$iv) < 0) {
                        maxElem$iv = e$iv;
                        maxValue$iv = v$iv;
                    }
                } while (iterator$iv.hasNext());
                o = maxElem$iv;
            }
        }
        final UIComponent uiComponent = (UIComponent)o;
        return (uiComponent == null) ? 0.0f : uiComponent.getWidth();
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        UIComponent constrainTo;
        if ((constrainTo = this.getConstrainTo()) == null) {
            constrainTo = component;
        }
        final Iterable $this$maxByOrNull$iv = constrainTo.getChildren();
        final int $i$f$maxByOrNull = 0;
        final Iterator iterator$iv = $this$maxByOrNull$iv.iterator();
        Object o;
        if (!iterator$iv.hasNext()) {
            o = null;
        }
        else {
            Object maxElem$iv = iterator$iv.next();
            if (!iterator$iv.hasNext()) {
                o = maxElem$iv;
            }
            else {
                final UIComponent it = (UIComponent)maxElem$iv;
                final int n = 0;
                final float height = it.getHeight();
                final YConstraint y = it.getConstraints().getY();
                final PaddingConstraint paddingConstraint = (y instanceof PaddingConstraint) ? y : null;
                float verticalPadding;
                if (paddingConstraint == null) {
                    verticalPadding = 0.0f;
                }
                else {
                    Intrinsics.checkNotNullExpressionValue((Object)it, "it");
                    verticalPadding = paddingConstraint.getVerticalPadding(it);
                }
                float maxValue$iv = height + verticalPadding;
                do {
                    final Object e$iv = iterator$iv.next();
                    final UIComponent it2 = (UIComponent)e$iv;
                    final int n2 = 0;
                    final float height2 = it2.getHeight();
                    final YConstraint y2 = it2.getConstraints().getY();
                    final PaddingConstraint paddingConstraint2 = (y2 instanceof PaddingConstraint) ? y2 : null;
                    float verticalPadding2;
                    if (paddingConstraint2 == null) {
                        verticalPadding2 = 0.0f;
                    }
                    else {
                        Intrinsics.checkNotNullExpressionValue((Object)it2, "it");
                        verticalPadding2 = paddingConstraint2.getVerticalPadding(it2);
                    }
                    final float v$iv = height2 + verticalPadding2;
                    if (Float.compare(maxValue$iv, v$iv) < 0) {
                        maxElem$iv = e$iv;
                        maxValue$iv = v$iv;
                    }
                } while (iterator$iv.hasNext());
                o = maxElem$iv;
            }
        }
        final UIComponent uiComponent = (UIComponent)o;
        return (uiComponent == null) ? 0.0f : uiComponent.getHeight();
    }
    
    @Override
    public float getRadiusImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        UIComponent constrainTo;
        if ((constrainTo = this.getConstrainTo()) == null) {
            constrainTo = component;
        }
        final Iterable $this$maxByOrNull$iv = constrainTo.getChildren();
        final int $i$f$maxByOrNull = 0;
        final Iterator iterator$iv = $this$maxByOrNull$iv.iterator();
        Object o;
        if (!iterator$iv.hasNext()) {
            o = null;
        }
        else {
            Object maxElem$iv = iterator$iv.next();
            if (!iterator$iv.hasNext()) {
                o = maxElem$iv;
            }
            else {
                final UIComponent it = (UIComponent)maxElem$iv;
                final int n = 0;
                float maxValue$iv = it.getHeight();
                do {
                    final Object e$iv = iterator$iv.next();
                    final UIComponent it2 = (UIComponent)e$iv;
                    final int n2 = 0;
                    final float v$iv = it2.getHeight();
                    if (Float.compare(maxValue$iv, v$iv) < 0) {
                        maxElem$iv = e$iv;
                        maxValue$iv = v$iv;
                    }
                } while (iterator$iv.hasNext());
                o = maxElem$iv;
            }
        }
        final UIComponent uiComponent = (UIComponent)o;
        return (uiComponent == null) ? 0.0f : (uiComponent.getHeight() * 2.0f);
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        switch (ChildBasedMaxSizeConstraint.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: {
                visitor.visitChildren(ConstraintType.WIDTH);
                break;
            }
            case 2: {
                visitor.visitChildren(ConstraintType.HEIGHT);
                break;
            }
            case 3: {
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
