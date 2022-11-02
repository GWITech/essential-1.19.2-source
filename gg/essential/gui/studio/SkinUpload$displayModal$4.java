package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.dsl.*;
import java.awt.*;
import gg.essential.gui.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import kotlin.properties.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/components/UIContainer;", "invoke" })
static final class SkinUpload$displayModal$4 extends Lambda implements Function1<UIContainer, Unit> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    final /* synthetic */ BasicState<Boolean> $locked;
    
    SkinUpload$displayModal$4(final BasicState<Boolean> $locked) {
        this.$locked = $locked;
        super(1);
    }
    
    public final void invoke(@NotNull final UIContainer it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIContainer();
        final UIConstraints $this$invoke_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$invoke_u24lambda_u2d0.setX(UtilitiesKt.getPixels(7));
        $this$invoke_u24lambda_u2d0.setY(UtilitiesKt.getPixels(16));
        $this$invoke_u24lambda_u2d0.setWidth(ConstraintsKt.minus(UtilitiesKt.getPercent(100), UtilitiesKt.getPixels(16)));
        $this$invoke_u24lambda_u2d0.setHeight(new ChildBasedMaxSizeConstraint());
        final ReadWriteProperty row$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, it), null, (KProperty<?>)SkinUpload$displayModal$4.$$delegatedProperties[0]);
        final UIComponent $this$constrain_u24lambda_u2d0$iv2;
        final UIComponent $this$constrain$iv2 = $this$constrain_u24lambda_u2d0$iv2 = new EssentialUIText("Lock Skin on outfit", false, null, false, false, false, 62);
        final UIConstraints $this$invoke_u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$invoke_u24lambda_u2d2.setColor(UtilitiesKt.toConstraint(EssentialPalette.TEXT_HIGHLIGHT));
        $this$invoke_u24lambda_u2d2.setY(new CenterConstraint());
        ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv2, invoke$lambda-1(row$delegate)), null, (KProperty<?>)SkinUpload$displayModal$4.$$delegatedProperties[1]);
        final UIComponent $this$constrain_u24lambda_u2d0$iv3;
        final UIComponent $this$constrain$iv3 = $this$constrain_u24lambda_u2d0$iv3 = new FullEssentialToggle(this.$locked, EssentialPalette.MODAL_BACKGROUND);
        final UIConstraints $this$invoke_u24lambda_u2d3 = $this$constrain_u24lambda_u2d0$iv3.getConstraints();
        $this$invoke_u24lambda_u2d3.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        $this$invoke_u24lambda_u2d3.setY(new CenterConstraint());
        ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv3, invoke$lambda-1(row$delegate)), null, (KProperty<?>)SkinUpload$displayModal$4.$$delegatedProperties[2]);
        final UIComponent $this$constrain_u24lambda_u2d0$iv4;
        final UIComponent $this$constrain$iv4 = $this$constrain_u24lambda_u2d0$iv4 = new EssentialUIWrappedText("Outfits with locked skins will not change if you update your skin externally.", false, null, false, null, 0.0f, 126);
        final UIConstraints $this$invoke_u24lambda_u2d4 = $this$constrain_u24lambda_u2d0$iv4.getConstraints();
        $this$invoke_u24lambda_u2d4.setX(ConstraintsKt.boundTo((XConstraint)UtilitiesKt.getPixels(0), invoke$lambda-1(row$delegate)));
        $this$invoke_u24lambda_u2d4.setY(new SiblingConstraint(13.0f, false, 2, null));
        $this$invoke_u24lambda_u2d4.setWidth(ConstraintsKt.boundTo((WidthConstraint)UtilitiesKt.getPercent(100), invoke$lambda-1(row$delegate)));
        $this$invoke_u24lambda_u2d4.setColor(UtilitiesKt.toConstraint(EssentialPalette.TEXT_DISABLED));
        ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv4, it), null, (KProperty<?>)SkinUpload$displayModal$4.$$delegatedProperties[3]);
        final UIConstraints constraints = it.getConstraints();
        constraints.setHeight(ConstraintsKt.plus(constraints.getHeight(), UtilitiesKt.getPixels(23)));
    }
    
    private static final UIContainer invoke$lambda-1(final ReadWriteProperty<Object, UIContainer> $row$delegate) {
        return (UIContainer)$row$delegate.getValue((Object)null, SkinUpload$displayModal$4.$$delegatedProperties[0]);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIContainer)p1);
        return Unit.INSTANCE;
    }
    
    static {
        SkinUpload$displayModal$4.$$delegatedProperties = new KProperty[] { (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)SkinUpload.class, "row", "<v#2>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)SkinUpload.class, "text", "<v#3>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)SkinUpload.class, "switch", "<v#4>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)SkinUpload.class, "extraText", "<v#5>", 0)) };
    }
}