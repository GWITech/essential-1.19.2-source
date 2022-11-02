package gg.essential.elementa.constraints;

import kotlin.*;
import java.awt.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.resolution.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u001c\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016R\u001a\u0010\u0007\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u0004R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'" }, d2 = { "Lgg/essential/elementa/constraints/ConstantColorConstraint;", "Lgg/essential/elementa/constraints/ColorConstraint;", "color", "Ljava/awt/Color;", "(Ljava/awt/Color;)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;)V", "cachedValue", "getCachedValue", "()Ljava/awt/Color;", "setCachedValue", "value", "getColor", "setColor", "colorState", "Lgg/essential/elementa/state/MappedState;", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "bindColor", "newState", "getColorImpl", "component", "to", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class ConstantColorConstraint implements ColorConstraint
{
    @NotNull
    private Color cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    @NotNull
    private final MappedState<Color, Color> colorState;
    
    public ConstantColorConstraint(@NotNull final State<Color> color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        super();
        final Color white = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
        this.cachedValue = white;
        this.recalculate = true;
        this.colorState = color.map((kotlin.jvm.functions.Function1<? super Color, ? extends Color>)ConstantColorConstraint$colorState.ConstantColorConstraint$colorState$1.INSTANCE);
    }
    
    @JvmOverloads
    public ConstantColorConstraint(@NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this(new BasicState<Color>(color));
    }
    
    public ConstantColorConstraint(Color color, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            color = white;
        }
        this(color);
    }
    
    @NotNull
    @Override
    public Color getCachedValue() {
        return this.cachedValue;
    }
    
    @Override
    public void setCachedValue(@NotNull final Color <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
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
    public final Color getColor() {
        return this.colorState.get();
    }
    
    public final void setColor(@NotNull final Color value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.colorState.set(value);
    }
    
    @NotNull
    public final ConstantColorConstraint bindColor(@NotNull final State<Color> newState) {
        Intrinsics.checkNotNullParameter((Object)newState, "newState");
        final ConstantColorConstraint $this$bindColor_u24lambda_u2d0 = this;
        final int n = 0;
        $this$bindColor_u24lambda_u2d0.colorState.rebind(newState);
        return this;
    }
    
    @NotNull
    @Override
    public Color getColorImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return this.colorState.get();
    }
    
    @NotNull
    @Override
    public ConstantColorConstraint to(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ConstantColorConstraint $this$to_u24lambda_u2d1 = this;
        final int n = 0;
        throw new UnsupportedOperationException("Constraint.to(UIComponent) is not available in this context!");
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
    }
    
    @JvmOverloads
    public ConstantColorConstraint() {
        this(null, 1, null);
    }
    
    @Override
    public /* bridge */ Object getCachedValue() {
        return this.getCachedValue();
    }
    
    @Override
    public /* bridge */ void setCachedValue(final Object <set-?>) {
        this.setCachedValue((Color)<set-?>);
    }
    
    @Override
    public /* bridge */ SuperConstraint to(final UIComponent component) {
        return this.to(component);
    }
}
