package gg.essential.gui.friends.message.v2;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.util.*;
import gg.essential.gui.*;
import gg.essential.gui.friends.*;
import gg.essential.gui.about.components.*;
import java.awt.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import java.time.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b	\u0010
                                                   \u001a\u0004\b\u0007\u0010\b¨\u0006\u000b""" }, d2 = { "Lgg/essential/gui/friends/message/v2/DateDividerImpl;", "Lgg/essential/gui/friends/message/v2/DateDivider;", "timeStamp", "Ljava/time/Instant;", "(Ljava/time/Instant;)V", "divider", "Lgg/essential/gui/about/components/ColoredDivider;", "getDivider", "()Lgg/essential/gui/about/components/ColoredDivider;", "divider$delegate", "Lkotlin/properties/ReadWriteProperty;", "essential" })
public final class DateDividerImpl extends DateDivider
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    
    public DateDividerImpl(@NotNull final Instant timeStamp) {
        Intrinsics.checkNotNullParameter((Object)timeStamp, "timeStamp");
        super(timeStamp);
        final LocalDate localDate = timeStamp.atZone(ZoneId.systemDefault()).toLocalDate();
        Intrinsics.checkNotNullExpressionValue((Object)localDate, "timeStamp.atZone(ZoneId.\u2026mDefault()).toLocalDate()");
        UIComponent $this$constrain_u24lambda_u2d0$iv;
        UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new ColoredDivider(HelpersKt.formatDate(localDate), EssentialPalette.TEXT_DISABLED, false, null, EssentialPalette.TEXT_DISABLED, 0.0f, SocialMenu.Companion.getGuiScaleOffset(), 40);
        final UIConstraints $this$divider_delegate_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$divider_delegate_u24lambda_u2d0.setY(UtilitiesKt.getPixels(12));
        ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this), this, DateDividerImpl.$$delegatedProperties[0]);
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = this);
        final UIConstraints $this$_init__u24lambda_u2d1 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d1.setX(new CenterConstraint());
        $this$_init__u24lambda_u2d1.setY(new SiblingConstraint(0.0f, false, 3, null));
        $this$_init__u24lambda_u2d1.setWidth(ConstraintsKt.minus(UtilitiesKt.getPercent(100), UtilitiesKt.getPixels(14)));
        $this$_init__u24lambda_u2d1.setHeight(UtilitiesKt.getPixels(20));
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DateDividerImpl.class, "divider", "getDivider()Lgg/essential/gui/about/components/ColoredDivider;", 0)) };
    }
}
