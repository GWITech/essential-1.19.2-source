package gg.essential.elementa.constraints;

import kotlin.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\"\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e" }, d2 = { "Lgg/essential/elementa/constraints/CopyConstraintColor;", "Lgg/essential/elementa/constraints/ColorConstraint;", "()V", "cachedValue", "Ljava/awt/Color;", "kotlin.jvm.PlatformType", "getCachedValue", "()Ljava/awt/Color;", "setCachedValue", "(Ljava/awt/Color;)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getColorImpl", "component", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class CopyConstraintColor implements ColorConstraint
{
    private Color cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public CopyConstraintColor() {
        super();
        this.cachedValue = Color.WHITE;
        this.recalculate = true;
    }
    
    @Override
    public Color getCachedValue() {
        return this.cachedValue;
    }
    
    @Override
    public void setCachedValue(final Color <set-?>) {
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
    
    @NotNull
    @Override
    public Color getColorImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final UIComponent constrainTo = this.getConstrainTo();
        Color color;
        if (constrainTo == null) {
            color = null;
        }
        else {
            final UIConstraints constraints = constrainTo.getConstraints();
            color = ((constraints == null) ? null : constraints.getColor());
        }
        final Color color2 = color;
        if (color2 == null) {
            throw new IllegalStateException("CopyConstraint must be applied to another component.");
        }
        return color2;
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
    }
    
    @Override
    public /* bridge */ Object getCachedValue() {
        return this.getCachedValue();
    }
    
    @Override
    public /* bridge */ void setCachedValue(final Object <set-?>) {
        this.setCachedValue((Color)<set-?>);
    }
}
