package gg.essential.gui.elementa;

import net.minecraft.client.gui.widget.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.resolution.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.util.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000L
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u000b
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u001d\u0012\u000e\u0010\u0003\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0012H\u0016J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0012H\u0016J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0012H\u0016J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0012H\u0016J\u0010\u0010"\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0012H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016R\u0019\u0010\u0003\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\r\u0010\u000e"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0013\u0010\u0014"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0019\u0010\u001a"\u0004\b\u001b\u0010\u001c¨\u0006*""" }, d2 = { "Lgg/essential/gui/elementa/VanillaButtonConstraint;", "Lgg/essential/elementa/constraints/PositionConstraint;", "Lgg/essential/elementa/constraints/SizeConstraint;", "button", "Lkotlin/Function0;", "Lnet/minecraft/client/gui/widget/ButtonWidget;", "fallback", "Lgg/essential/elementa/UIConstraints;", "(Lkotlin/jvm/functions/Function0;Lgg/essential/elementa/UIConstraints;)V", "getButton", "()Lkotlin/jvm/functions/Function0;", "cachedValue", "", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getHeightImpl", "component", "getRadiusImpl", "getWidthImpl", "getXPositionImpl", "getYPositionImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Companion", "essential" })
public final class VanillaButtonConstraint implements PositionConstraint, SizeConstraint
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Function0<ButtonWidget> button;
    @NotNull
    private final UIConstraints fallback;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public VanillaButtonConstraint(@NotNull final Function0<? extends ButtonWidget> button, @NotNull final UIConstraints fallback) {
        Intrinsics.checkNotNullParameter((Object)button, "button");
        Intrinsics.checkNotNullParameter((Object)fallback, "fallback");
        super();
        this.button = (Function0<ButtonWidget>)button;
        this.fallback = fallback;
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
    public float getXPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ButtonWidget buttonWidget = (ButtonWidget)this.button.invoke();
        return (buttonWidget != null) ? ((float)buttonWidget.field_22760) : this.fallback.getX().getXPositionImpl(component);
    }
    
    @Override
    public float getYPositionImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ButtonWidget buttonWidget = (ButtonWidget)this.button.invoke();
        return (buttonWidget != null) ? ((float)buttonWidget.field_22761) : this.fallback.getY().getYPositionImpl(component);
    }
    
    @Override
    public float getWidthImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ButtonWidget buttonWidget = (ButtonWidget)this.button.invoke();
        return (buttonWidget != null) ? ((float)buttonWidget.method_25368()) : this.fallback.getWidth().getWidthImpl(component);
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ButtonWidget buttonWidget = (ButtonWidget)this.button.invoke();
        return (buttonWidget != null) ? ((float)buttonWidget.method_25364()) : this.fallback.getHeight().getHeightImpl(component);
    }
    
    @Override
    public float getRadiusImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        return this.getWidthImpl(component) / 2.0f;
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
        this.setCachedValue(((Number)<set-?>).floatValue());
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u0002H\u0004"\b\b\u0000\u0010\u0004*\u00020\u0005*\u0002H\u00042\u000e\u0010\u0006\u001a
                                                       \u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0019\b\u0002\u0010	\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0
                                                       ¢\u0006\u0002\bH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f""" }, d2 = { "Lgg/essential/gui/elementa/VanillaButtonConstraint$Companion;", "", "()V", "constrainTo", "T", "Lgg/essential/elementa/UIComponent;", "button", "Lkotlin/Function0;", "Lnet/minecraft/client/gui/widget/ButtonWidget;", "fallback", "Lkotlin/Function1;", "Lgg/essential/elementa/UIConstraints;", "", "Lkotlin/ExtensionFunctionType;", "(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @JvmOverloads
        @NotNull
        public final <T extends UIComponent> T constrainTo(@NotNull final T $this$constrainTo, @NotNull final Function0<? extends ButtonWidget> button, @NotNull final Function1<? super UIConstraints, Unit> fallback) {
            Intrinsics.checkNotNullParameter((Object)$this$constrainTo, "<this>");
            Intrinsics.checkNotNullParameter((Object)button, "button");
            Intrinsics.checkNotNullParameter((Object)fallback, "fallback");
            final UIComponent $this$constrain_u24lambda_u2d0$iv;
            final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = $this$constrainTo;
            final UIConstraints $this$constrainTo_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            final UIConstraints fallbackConstraint = new UIConstraints($this$constrainTo);
            fallback.invoke((Object)fallbackConstraint);
            ExtensionsKt.onAnimationFrame($this$constrainTo, (Function0<Unit>)new VanillaButtonConstraint$Companion$constrainTo$2.VanillaButtonConstraint$Companion$constrainTo$2$1(fallbackConstraint));
            $this$constrainTo_u24lambda_u2d0.setX(new VanillaButtonConstraint(button, fallbackConstraint));
            $this$constrainTo_u24lambda_u2d0.setY(new VanillaButtonConstraint(button, fallbackConstraint));
            $this$constrainTo_u24lambda_u2d0.setWidth(new VanillaButtonConstraint(button, fallbackConstraint));
            $this$constrainTo_u24lambda_u2d0.setHeight(new VanillaButtonConstraint(button, fallbackConstraint));
            return (T)$this$constrain_u24lambda_u2d0$iv;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
