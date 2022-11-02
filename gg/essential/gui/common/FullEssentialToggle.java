package gg.essential.gui.common;

import kotlin.reflect.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import gg.essential.gui.*;
import gg.essential.util.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001b\u0010\b\u001a\u00020	8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\f\u0010\r\u001a\u0004\b
                                                   \u0010\u000bR\u001b\u0010\u000e\u001a\u00020	8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR&\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0004\u0012\u00020\u00040\u0012X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0014""" }, d2 = { "Lgg/essential/gui/common/FullEssentialToggle;", "Lgg/essential/gui/common/EssentialToggle;", "enabled", "Lgg/essential/elementa/state/State;", "", "backgroundColor", "Ljava/awt/Color;", "(Lgg/essential/elementa/state/State;Ljava/awt/Color;)V", "offIndicator", "Lgg/essential/elementa/components/UIContainer;", "getOffIndicator", "()Lgg/essential/elementa/components/UIContainer;", "offIndicator$delegate", "Lkotlin/properties/ReadWriteProperty;", "onIndicator", "getOnIndicator", "onIndicator$delegate", "showToggleIndicators", "Lgg/essential/elementa/state/MappedState;", "Lkotlin/Pair;", "essential" })
public final class FullEssentialToggle extends EssentialToggle
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final MappedState<Pair<Boolean, Boolean>, Boolean> showToggleIndicators;
    
    public FullEssentialToggle(@NotNull final State<Boolean> enabled, @NotNull final Color backgroundColor) {
        Intrinsics.checkNotNullParameter((Object)enabled, "enabled");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        super(enabled, EssentialPalette.TEXT, EssentialPalette.ACCENT_BLUE, 1);
        this.showToggleIndicators = StateExtensionsKt.and(ExtensionsKt.pollingState$default$a9b5a09$5bde5825(this, (Function0)FullEssentialToggle$showToggleIndicators.FullEssentialToggle$showToggleIndicators$1.INSTANCE), new BasicState<Boolean>(true));
        UIComponent $this$constrain_u24lambda_u2d0$iv;
        UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIContainer();
        final UIConstraints $this$onIndicator_delegate_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$onIndicator_delegate_u24lambda_u2d0.setHeight(UtilitiesKt.getPercent(100));
        $this$onIndicator_delegate_u24lambda_u2d0.setWidth(UtilitiesKt.getPercent(50));
        UIComponent $this$addChild_u24lambda_u2d1$iv;
        UIComponent $this$addChild$iv = $this$addChild_u24lambda_u2d1$iv = $this$constrain_u24lambda_u2d0$iv;
        $this$addChild_u24lambda_u2d1$iv.addChild(ExtensionsKt.centered((UIComponent)EssentialPalette.TOGGLE_ON.withColor(backgroundColor).create()));
        ComponentsKt.provideDelegate(StateExtensionsKt.bindParent$default$6fcd5b6b($this$addChild_u24lambda_u2d1$iv, this, StateExtensionsKt.and((State<Boolean>)this.showToggleIndicators, enabled), false, 0, 4), this, FullEssentialToggle.$$delegatedProperties[0]);
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = new UIContainer());
        final UIConstraints $this$offIndicator_delegate_u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$offIndicator_delegate_u24lambda_u2d2.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        $this$offIndicator_delegate_u24lambda_u2d2.setHeight(UtilitiesKt.getPercent(100));
        $this$offIndicator_delegate_u24lambda_u2d2.setWidth(UtilitiesKt.getPercent(50));
        $this$addChild$iv = ($this$addChild_u24lambda_u2d1$iv = $this$constrain_u24lambda_u2d0$iv);
        $this$addChild_u24lambda_u2d1$iv.addChild(ExtensionsKt.centered((UIComponent)EssentialPalette.TOGGLE_OFF.withColor(EssentialPalette.TEXT_MID_GRAY).create()));
        ComponentsKt.provideDelegate(StateExtensionsKt.bindParent$default$6fcd5b6b($this$addChild_u24lambda_u2d1$iv, this, StateExtensionsKt.and((State<Boolean>)this.showToggleIndicators, (State<Boolean>)StateExtensionsKt.not(enabled)), false, 0, 4), this, FullEssentialToggle.$$delegatedProperties[1]);
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = this);
        final UIConstraints $this$_init__u24lambda_u2d4 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d4.setWidth(UtilitiesKt.getPixels(20));
        $this$_init__u24lambda_u2d4.setHeight(UtilitiesKt.getPixels(11));
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = this.getSwitchBox());
        final UIConstraints $this$_init__u24lambda_u2d5 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d5.setHeight(ConstraintsKt.minus(UtilitiesKt.getPercent(100), UtilitiesKt.getPixels(2)));
        $this$_init__u24lambda_u2d5.setColor(gg.essential.elementa.state.ExtensionsKt.toConstraint(ExtensionsKt.hoveredState$default$56721d26(this, false, false, 3).map((Function1)new FullEssentialToggle$2.FullEssentialToggle$2$1(backgroundColor))));
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FullEssentialToggle.class, "onIndicator", "getOnIndicator()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FullEssentialToggle.class, "offIndicator", "getOffIndicator()Lgg/essential/elementa/components/UIContainer;", 0)) };
    }
}
