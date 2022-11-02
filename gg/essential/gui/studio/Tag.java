package gg.essential.gui.studio;

import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.reflect.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010	R\u001b\u0010\u0005\u001a\u00020
                                                   8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f""" }, d2 = { "Lgg/essential/gui/studio/Tag;", "Lgg/essential/elementa/components/UIBlock;", "backgroundColor", "Ljava/awt/Color;", "textColor", "text", "", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "Lgg/essential/elementa/components/UIText;", "getText", "()Lgg/essential/elementa/components/UIText;", "text$delegate", "Lkotlin/properties/ReadWriteProperty;", "essential" })
public final class Tag extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    
    public Tag(@NotNull final State<Color> backgroundColor, @NotNull final State<Color> textColor, @NotNull final State<String> text) {
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)textColor, "textColor");
        Intrinsics.checkNotNullParameter((Object)text, "text");
        super(backgroundColor);
        UIComponent $this$constrain_u24lambda_u2d0$iv;
        UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new EssentialUIText(null, false, null, false, false, false, 61).bindText(text);
        final UIConstraints $this$text_delegate_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$text_delegate_u24lambda_u2d0.setX(new CenterConstraint());
        $this$text_delegate_u24lambda_u2d0.setY(new CenterConstraint());
        $this$text_delegate_u24lambda_u2d0.setColor(ExtensionsKt.toConstraint(textColor));
        ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this), this, Tag.$$delegatedProperties[0]);
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = this);
        final UIConstraints $this$_init__u24lambda_u2d1 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d1.setWidth(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(6)));
        $this$_init__u24lambda_u2d1.setHeight(UtilitiesKt.getPixels(13));
    }
    
    public Tag(@NotNull final Color backgroundColor, @NotNull final Color textColor, @NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)textColor, "textColor");
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this(new BasicState<Color>(backgroundColor), new BasicState<Color>(textColor), new BasicState<String>(text));
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Tag.class, "text", "getText()Lgg/essential/elementa/components/UIText;", 0)) };
    }
}
