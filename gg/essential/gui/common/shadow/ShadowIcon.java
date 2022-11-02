package gg.essential.gui.common.shadow;

import gg.essential.gui.image.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.components.image.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.effects.*;
import gg.essential.elementa.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   \u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B#\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bB=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010	\u001a\b\u0012\u0004\u0012\u00020
                                                   0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020
                                                   0\u0007¢\u0006\u0002\u0010\fJ\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020
                                                   0\u0007J\u0014\u0010\u0015\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u0014\u0010\u0017\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020
                                                   0\u0007R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020
                                                   \u0012\u0004\u0012\u00020
                                                   0\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020
                                                   \u0012\u0004\u0012\u00020
                                                   0\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0018""" }, d2 = { "Lgg/essential/gui/common/shadow/ShadowIcon;", "Lgg/essential/elementa/components/UIContainer;", "imageFactory", "Lgg/essential/gui/image/ImageFactory;", "buttonShadow", "", "(Lgg/essential/gui/image/ImageFactory;Z)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "primaryColor", "Ljava/awt/Color;", "shadowColor", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "buttonShadowState", "Lgg/essential/elementa/state/MappedState;", "iconState", "primaryColorState", "shadowColorState", "rebindIcon", "rebindPrimaryColor", "color", "rebindShadow", "shadow", "rebindShadowColor", "essential" })
public final class ShadowIcon extends UIContainer
{
    @NotNull
    private final MappedState<ImageFactory, ImageFactory> iconState;
    @NotNull
    private final MappedState<Boolean, Boolean> buttonShadowState;
    @NotNull
    private final MappedState<Color, Color> primaryColorState;
    @NotNull
    private final MappedState<Color, Color> shadowColorState;
    
    public ShadowIcon(@NotNull final State<ImageFactory> imageFactory, @NotNull final State<Boolean> buttonShadow, @NotNull final State<Color> primaryColor, @NotNull final State<Color> shadowColor) {
        Intrinsics.checkNotNullParameter((Object)imageFactory, "imageFactory");
        Intrinsics.checkNotNullParameter((Object)buttonShadow, "buttonShadow");
        Intrinsics.checkNotNullParameter((Object)primaryColor, "primaryColor");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        super();
        this.iconState = imageFactory.map((kotlin.jvm.functions.Function1<? super ImageFactory, ? extends ImageFactory>)ShadowIcon$iconState.ShadowIcon$iconState$1.INSTANCE);
        this.buttonShadowState = buttonShadow.map((kotlin.jvm.functions.Function1<? super Boolean, ? extends Boolean>)ShadowIcon$buttonShadowState.ShadowIcon$buttonShadowState$1.INSTANCE);
        this.primaryColorState = primaryColor.map((kotlin.jvm.functions.Function1<? super Color, ? extends Color>)ShadowIcon$primaryColorState.ShadowIcon$primaryColorState$1.INSTANCE);
        this.shadowColorState = shadowColor.map((kotlin.jvm.functions.Function1<? super Color, ? extends Color>)ShadowIcon$shadowColorState.ShadowIcon$shadowColorState$1.INSTANCE);
        StateExtensionsKt.onSetValueAndNow(this.iconState.zip((State<Object>)this.buttonShadowState), (kotlin.jvm.functions.Function1<? super kotlin.Pair<Object, Object>, Unit>)new Function1<Pair<? extends ImageFactory, ? extends Boolean>, Unit>() {
            final /* synthetic */ ShadowIcon this$0;
            
            ShadowIcon$1() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke(@NotNull final Pair<? extends ImageFactory, Boolean> pair) {
                Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
                final ImageFactory icon = (ImageFactory)pair.component1();
                final boolean shadow = (boolean)pair.component2();
                this.this$0.clearChildren();
                final UIComponent $this$constrain_u24lambda_u2d0$iv;
                final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = icon.create();
                final UIConstraints $this$invoke_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
                $this$invoke_u24lambda_u2d0.setWidth(UtilitiesKt.getPercent(100));
                $this$invoke_u24lambda_u2d0.setHeight(UtilitiesKt.getPercent(100));
                final UIComponent uiComponent = $this$constrain_u24lambda_u2d0$iv;
                final ShadowIcon this$0 = this.this$0;
                final UIImage it = (UIImage)uiComponent;
                it.supply(new AutoImageSize(this$0));
                final UIComponent image = ComponentsKt.childOf(((UIImage)uiComponent).setColor(ExtensionsKt.toConstraint(ShadowIcon.access$getPrimaryColorState$p(this.this$0))), this.this$0);
                if (shadow) {
                    ComponentsKt.effect(image, new ShadowEffect((byte)0).rebindColor(ShadowIcon.access$getShadowColorState$p(this.this$0)));
                }
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke((Pair<? extends ImageFactory, Boolean>)p1);
                return Unit.INSTANCE;
            }
        });
    }
    
    public ShadowIcon(@NotNull final ImageFactory imageFactory) {
        Intrinsics.checkNotNullParameter((Object)imageFactory, "imageFactory");
        this(new BasicState<ImageFactory>(imageFactory), new BasicState<Boolean>(true));
    }
    
    public ShadowIcon(@NotNull final State<ImageFactory> imageFactory, @NotNull final State<Boolean> buttonShadow) {
        Intrinsics.checkNotNullParameter((Object)imageFactory, "imageFactory");
        Intrinsics.checkNotNullParameter((Object)buttonShadow, "buttonShadow");
        final Color black = Color.BLACK;
        Intrinsics.checkNotNullExpressionValue((Object)black, "BLACK");
        this(imageFactory, buttonShadow, new BasicState<Color>(black), new BasicState<Color>(EssentialPalette.TEXT_SHADOW));
        this.rebindPrimaryColor(EssentialPalette.INSTANCE.getTextColor(gg.essential.util.ExtensionsKt.hoveredState$default$56721d26(this, false, false, 3)));
    }
    
    @NotNull
    public final ShadowIcon rebindShadowColor(@NotNull final State<Color> color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        final ShadowIcon $this$rebindShadowColor_u24lambda_u2d0 = this;
        $this$rebindShadowColor_u24lambda_u2d0.shadowColorState.rebind(color);
        return this;
    }
    
    @NotNull
    public final ShadowIcon rebindPrimaryColor(@NotNull final State<Color> color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        final ShadowIcon $this$rebindPrimaryColor_u24lambda_u2d1 = this;
        $this$rebindPrimaryColor_u24lambda_u2d1.primaryColorState.rebind(color);
        return $this$rebindPrimaryColor_u24lambda_u2d1;
    }
    
    @NotNull
    public final ShadowIcon rebindIcon(@NotNull final State<ImageFactory> imageFactory) {
        Intrinsics.checkNotNullParameter((Object)imageFactory, "imageFactory");
        final ShadowIcon $this$rebindIcon_u24lambda_u2d2 = this;
        $this$rebindIcon_u24lambda_u2d2.iconState.rebind(imageFactory);
        return this;
    }
    
    public static final /* synthetic */ MappedState access$getPrimaryColorState$p(final ShadowIcon $this) {
        return $this.primaryColorState;
    }
    
    public static final /* synthetic */ MappedState access$getShadowColorState$p(final ShadowIcon $this) {
        return $this.shadowColorState;
    }
}
