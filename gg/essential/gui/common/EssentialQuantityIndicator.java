package gg.essential.gui.common;

import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.reflect.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import gg.essential.gui.common.shadow.*;
import kotlin.jvm.functions.*;
import gg.essential.util.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\bR\u001b\u0010	\u001a\u00020
                                                   8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f""" }, d2 = { "Lgg/essential/gui/common/EssentialQuantityIndicator;", "Lgg/essential/elementa/components/UIBlock;", "quantity", "", "color", "Lgg/essential/elementa/state/State;", "Ljava/awt/Color;", "(ILgg/essential/elementa/state/State;)V", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "text", "Lgg/essential/elementa/components/UIText;", "getText", "()Lgg/essential/elementa/components/UIText;", "text$delegate", "Lkotlin/properties/ReadWriteProperty;", "essential" })
public final class EssentialQuantityIndicator extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    
    public EssentialQuantityIndicator(@NotNull final State<Integer> quantity, @NotNull final State<Color> color) {
        Intrinsics.checkNotNullParameter((Object)quantity, "quantity");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        super(color);
        ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf((T)ExtensionsKt.centered((T)new EssentialUIText(null, false, null, false, false, false, 63).bindText((State<String>)quantity.map((kotlin.jvm.functions.Function1<? super Integer, ?>)EssentialQuantityIndicator$text.EssentialQuantityIndicator$text$2.INSTANCE))), this), this, EssentialQuantityIndicator.$$delegatedProperties[0]);
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setWidth(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(12)));
        $this$_init__u24lambda_u2d0.setHeight(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(8)));
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialQuantityIndicator.class, "text", "getText()Lgg/essential/elementa/components/UIText;", 0)) };
    }
}
