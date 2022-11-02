package gg.essential.gui.about.components;

import kotlin.*;
import kotlin.reflect.*;
import java.awt.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.dsl.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.gui.elementa.*;
import kotlin.properties.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001BO\b\u0016\u0012
                                                   \b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010	\u001a\u00020\u0005\u0012\b\b\u0002\u0010
                                                   \u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rB_\u0012\u0010\b\u0002\u0010\u0002\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010	\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u0012\b\b\u0002\u0010
                                                   \u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006
                                                   \u0010\u0011\u001a\u00020\u0001X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/about/components/ColoredDivider;", "Lgg/essential/elementa/components/UIContainer;", "text", "", "textColor", "Ljava/awt/Color;", "hasShadow", "", "shadowColor", "dividerColor", "textPadding", "", "scaleOffset", "(Ljava/lang/String;Ljava/awt/Color;ZLjava/awt/Color;Ljava/awt/Color;FF)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;ZLjava/awt/Color;Lgg/essential/elementa/state/State;FF)V", "essential", "textContainer" })
public final class ColoredDivider extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    
    public ColoredDivider(@NotNull final State<String> text, @NotNull final State<Color> textColor, final boolean hasShadow, @NotNull final Color shadowColor, @NotNull final State<Color> dividerColor, final float textPadding, final float scaleOffset) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)textColor, "textColor");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        Intrinsics.checkNotNullParameter((Object)dividerColor, "dividerColor");
        super();
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setHeight(new ChildBasedMaxSizeConstraint());
        $this$_init__u24lambda_u2d0.setWidth(UtilitiesKt.getPercent(100));
        final MappedState hasText = text.map((kotlin.jvm.functions.Function1<? super String, ?>)ColoredDivider$hasText.ColoredDivider$hasText$1.INSTANCE);
        UIComponent $this$constrain_u24lambda_u2d0$iv2;
        UIComponent $this$constrain$iv2 = $this$constrain_u24lambda_u2d0$iv2 = new UIContainer();
        final UIConstraints $this$_init__u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d2.setX(new CenterConstraint());
        $this$_init__u24lambda_u2d2.setY(new CenterConstraint());
        $this$_init__u24lambda_u2d2.setWidth(ConstraintsKt.plus(new ChildBasedMaxSizeConstraint(), ConstraintsKt.times(UtilitiesKt.getPixels(textPadding), 2)));
        $this$_init__u24lambda_u2d2.setHeight(new ChildBasedMaxSizeConstraint());
        final ReadWriteProperty textContainer$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv2, this), null, ColoredDivider.$$delegatedProperties[0]);
        $this$constrain$iv2 = ($this$constrain_u24lambda_u2d0$iv2 = new EssentialUIText(null, hasShadow, shadowColor, false, false, false, 57).bindText((State<String>)text.map((kotlin.jvm.functions.Function1<? super String, ?>)ColoredDivider$2.INSTANCE)));
        final UIConstraints $this$_init__u24lambda_u2d3 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d3.setX(new CenterConstraint());
        $this$_init__u24lambda_u2d3.setColor(ExtensionsKt.toConstraint(textColor));
        $this$_init__u24lambda_u2d3.setTextScale(new GuiScaleOffsetConstraint(scaleOffset));
        ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv2, _init_$lambda-2((ReadWriteProperty<Object, UIContainer>)textContainer$delegate));
        $this$constrain$iv2 = ($this$constrain_u24lambda_u2d0$iv2 = new UIBlock(dividerColor));
        final UIConstraints $this$_init__u24lambda_u2d4 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d4.setY(new CenterConstraint());
        $this$_init__u24lambda_u2d4.setWidth(ConstraintsKt.minus(UtilitiesKt.getPercent(50), ConstraintsKt.div(ConstraintsKt.boundTo((SuperConstraint<Float>)UtilitiesKt.getPercent(100), _init_$lambda-2((ReadWriteProperty<Object, UIContainer>)textContainer$delegate)), 2)));
        $this$_init__u24lambda_u2d4.setHeight(new GuiScaleOffsetConstraint(scaleOffset));
        ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv2, this);
        $this$constrain$iv2 = ($this$constrain_u24lambda_u2d0$iv2 = new UIBlock(dividerColor));
        final UIConstraints $this$_init__u24lambda_u2d5 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d5.setX(ConstraintsKt.boundTo((XConstraint)UtilitiesKt.getPixels(0), _init_$lambda-2((ReadWriteProperty<Object, UIContainer>)textContainer$delegate)));
        $this$_init__u24lambda_u2d5.setY(new CenterConstraint());
        $this$_init__u24lambda_u2d5.setWidth(UtilitiesKt.getPercent(100));
        $this$_init__u24lambda_u2d5.setHeight(new GuiScaleOffsetConstraint(scaleOffset));
        StateExtensionsKt.bindParent$default$6fcd5b6b($this$constrain_u24lambda_u2d0$iv2, _init_$lambda-2((ReadWriteProperty<Object, UIContainer>)textContainer$delegate), StateExtensionsKt.not(hasText), false, null, 12);
        $this$constrain$iv2 = ($this$constrain_u24lambda_u2d0$iv2 = new UIBlock(dividerColor));
        final UIConstraints $this$_init__u24lambda_u2d6 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d6.setX(ConstraintsKt.boundTo((XConstraint)new SiblingConstraint(0.0f, false, 3, null), _init_$lambda-2((ReadWriteProperty<Object, UIContainer>)textContainer$delegate)));
        $this$_init__u24lambda_u2d6.setY(new CenterConstraint());
        $this$_init__u24lambda_u2d6.setWidth(new FillConstraint(false, 1, null));
        $this$_init__u24lambda_u2d6.setHeight(new GuiScaleOffsetConstraint(scaleOffset));
        ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv2, this);
    }
    
    public ColoredDivider(final byte b) {
        this(new BasicState<String>(null), new BasicState<Color>(EssentialPalette.TEXT), true, EssentialPalette.TEXT_SHADOW, new BasicState<Color>(EssentialPalette.LIGHT_DIVIDER), 6.0f, 0.0f);
    }
    
    public ColoredDivider(@Nullable final String text, @NotNull final Color textColor, final boolean hasShadow, @NotNull final Color shadowColor, @NotNull final Color dividerColor, final float textPadding, final float scaleOffset) {
        Intrinsics.checkNotNullParameter((Object)textColor, "textColor");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        Intrinsics.checkNotNullParameter((Object)dividerColor, "dividerColor");
        this(new BasicState<String>(text), new BasicState<Color>(textColor), hasShadow, shadowColor, new BasicState<Color>(dividerColor), textPadding, scaleOffset);
    }
    
    public ColoredDivider(String text, Color text2, boolean hasShadow, Color text_SHADOW, Color light_DIVIDER, float textPadding, float scaleOffset, final int n) {
        if ((n & 0x1) != 0x0) {
            text = null;
        }
        if ((n & 0x2) != 0x0) {
            text2 = EssentialPalette.TEXT;
        }
        if ((n & 0x4) != 0x0) {
            hasShadow = true;
        }
        if ((n & 0x8) != 0x0) {
            text_SHADOW = EssentialPalette.TEXT_SHADOW;
        }
        if ((n & 0x10) != 0x0) {
            light_DIVIDER = EssentialPalette.LIGHT_DIVIDER;
        }
        if ((n & 0x20) != 0x0) {
            textPadding = 6.0f;
        }
        if ((n & 0x40) != 0x0) {
            scaleOffset = 0.0f;
        }
        this(text, text2, hasShadow, text_SHADOW, light_DIVIDER, textPadding, scaleOffset);
    }
    
    private static final UIContainer _init_$lambda-2(final ReadWriteProperty<Object, UIContainer> $textContainer$delegate) {
        return (UIContainer)$textContainer$delegate.getValue((Object)null, (KProperty)ColoredDivider.$$delegatedProperties[0]);
    }
    
    public ColoredDivider() {
        this((byte)0);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ColoredDivider.class, "textContainer", "<v#0>", 0)) };
    }
}
