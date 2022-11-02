package gg.essential.gui.elementa;

import org.jetbrains.annotations.*;
import net.minecraft.client.gui.widget.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;
import gg.essential.util.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.*;

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
