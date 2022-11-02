package gg.essential.elementa.components;

import java.awt.*;
import gg.essential.elementa.font.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import kotlin.jvm.*;
import gg.essential.universal.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B'\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u0017\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u0016\u0010\u0019\u001a\u00020\u00002\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tJ\u0014\u0010\u001b\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\tJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0012H\u0016J\u0006\u0010\"\u001a\u00020\u0005J\b\u0010#\u001a\u0004\u0018\u00010\u0007J\u0015\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tH\u0007¢\u0006\u0002\b#J\u0006\u0010%\u001a\u00020\u0003J\u0006\u0010&\u001a\u00020\u0012J\b\u0010'\u001a\u00020\u0012H\u0016J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J1\u0010+\u001a\b\u0012\u0004\u0012\u0002H,0\f\"\u0004\b\u0000\u0010,*\u00020-2\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u0002H,0/¢\u0006\u0002\b0H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0014\u001a&\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00150\u0015\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061" }, d2 = { "Lgg/essential/elementa/components/UIText;", "Lgg/essential/elementa/UIComponent;", "text", "", "shadow", "", "shadowColor", "Ljava/awt/Color;", "(Ljava/lang/String;ZLjava/awt/Color;)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "fontProviderState", "Lgg/essential/elementa/state/BasicState;", "Lgg/essential/elementa/font/FontProvider;", "shadowColorState", "Lgg/essential/elementa/state/MappedState;", "shadowState", "textScaleState", "", "textState", "textWidthState", "Lkotlin/Pair;", "verticallyCenteredState", "bindShadow", "newShadowState", "bindShadowColor", "newShadowColorState", "bindText", "newTextState", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "getHeight", "getShadow", "getShadowColor", "getShadowColorState", "getText", "getTextWidth", "getWidth", "setShadow", "setShadowColor", "setText", "asState", "T", "Lgg/essential/elementa/UIConstraints;", "selector", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Elementa" })
public class UIText extends UIComponent
{
    @NotNull
    private final MappedState<String, String> textState;
    @NotNull
    private final MappedState<Boolean, Boolean> shadowState;
    @NotNull
    private final MappedState<Color, Color> shadowColorState;
    @NotNull
    private final BasicState<Float> textScaleState;
    @NotNull
    private final BasicState<Boolean> verticallyCenteredState;
    @NotNull
    private final BasicState<FontProvider> fontProviderState;
    @NotNull
    private MappedState<Pair<String, Pair<Float, FontProvider>>, Float> textWidthState;
    
    public UIText(@NotNull final State<String> text, @NotNull final State<Boolean> shadow, @NotNull final State<Color> shadowColor) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)shadow, "shadow");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        super();
        this.textState = text.map((kotlin.jvm.functions.Function1<? super String, ? extends String>)UIText$textState.UIText$textState$1.INSTANCE);
        this.shadowState = shadow.map((kotlin.jvm.functions.Function1<? super Boolean, ? extends Boolean>)UIText$shadowState.UIText$shadowState$1.INSTANCE);
        this.shadowColorState = shadowColor.map((kotlin.jvm.functions.Function1<? super Color, ? extends Color>)UIText$shadowColorState.UIText$shadowColorState$1.INSTANCE);
        this.textScaleState = this.asState(this.getConstraints(), (kotlin.jvm.functions.Function1<? super UIConstraints, ? extends Float>)UIText$textScaleState.UIText$textScaleState$1.INSTANCE);
        this.verticallyCenteredState = this.asState(this.getConstraints(), (kotlin.jvm.functions.Function1<? super UIConstraints, ? extends Boolean>)UIText$verticallyCenteredState.UIText$verticallyCenteredState$1.INSTANCE);
        this.fontProviderState = this.asState(this.getConstraints(), (kotlin.jvm.functions.Function1<? super UIConstraints, ? extends FontProvider>)UIText$fontProviderState.UIText$fontProviderState$1.INSTANCE);
        this.textWidthState = (MappedState<Pair<String, Pair<Float, FontProvider>>, Float>)this.textState.zip(this.textScaleState.zip((State<Object>)this.fontProviderState)).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Object, kotlin.Pair<Object, Object>>, ? extends Float>)UIText$textWidthState.UIText$textWidthState$1.INSTANCE);
        this.setWidth(ExtensionsKt.pixels$default(this.textWidthState, false, false, 3, null));
        this.setHeight(ExtensionsKt.pixels$default(this.shadowState.zip(this.verticallyCenteredState.zip((State<Object>)this.fontProviderState)).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Object, kotlin.Pair<Object, Object>>, ?>)UIText$1.INSTANCE), false, false, 3, null));
    }
    
    public UIText(final State text, State shadow, State shadowColor, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            shadow = new BasicState(true);
        }
        if ((n & 0x4) != 0x0) {
            shadowColor = new BasicState(null);
        }
        this(text, shadow, shadowColor);
    }
    
    @JvmOverloads
    public UIText(@NotNull final String text, final boolean shadow, @Nullable final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this(new BasicState<String>(text), new BasicState<Boolean>(shadow), new BasicState<Color>(shadowColor));
    }
    
    public UIText(String text, boolean shadow, Color shadowColor, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            text = "";
        }
        if ((n & 0x2) != 0x0) {
            shadow = true;
        }
        if ((n & 0x4) != 0x0) {
            shadowColor = null;
        }
        this(text, shadow, shadowColor);
    }
    
    private final <T> BasicState<T> asState(final UIConstraints $this$asState, final Function1<? super UIConstraints, ? extends T> selector) {
        final BasicState it = new BasicState((T)selector.invoke((Object)this.getConstraints()));
        final int n = 0;
        this.getConstraints().addObserver(UIText::asState$lambda-1$lambda-0);
        return it;
    }
    
    @NotNull
    public final UIText bindText(@NotNull final State<String> newTextState) {
        Intrinsics.checkNotNullParameter((Object)newTextState, "newTextState");
        final UIText $this$bindText_u24lambda_u2d2 = this;
        final int n = 0;
        $this$bindText_u24lambda_u2d2.textState.rebind(newTextState);
        return this;
    }
    
    @NotNull
    public final UIText bindShadow(@NotNull final State<Boolean> newShadowState) {
        Intrinsics.checkNotNullParameter((Object)newShadowState, "newShadowState");
        final UIText $this$bindShadow_u24lambda_u2d3 = this;
        final int n = 0;
        $this$bindShadow_u24lambda_u2d3.shadowState.rebind(newShadowState);
        return this;
    }
    
    @NotNull
    public final UIText bindShadowColor(@NotNull final State<Color> newShadowColorState) {
        Intrinsics.checkNotNullParameter((Object)newShadowColorState, "newShadowColorState");
        final UIText $this$bindShadowColor_u24lambda_u2d4 = this;
        final int n = 0;
        $this$bindShadowColor_u24lambda_u2d4.shadowColorState.rebind(newShadowColorState);
        return this;
    }
    
    @NotNull
    public final String getText() {
        return this.textState.get();
    }
    
    @NotNull
    public final UIText setText(@NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        final UIText $this$setText_u24lambda_u2d5 = this;
        final int n = 0;
        $this$setText_u24lambda_u2d5.textState.set(text);
        return this;
    }
    
    public final boolean getShadow() {
        return this.shadowState.get();
    }
    
    @NotNull
    public final UIText setShadow(final boolean shadow) {
        final UIText $this$setShadow_u24lambda_u2d6 = this;
        final int n = 0;
        $this$setShadow_u24lambda_u2d6.shadowState.set(Boolean.valueOf(shadow));
        return this;
    }
    
    @Deprecated(message = "Wrong return type", level = DeprecationLevel.HIDDEN)
    @JvmName(name = "getShadowColor")
    @java.lang.Deprecated
    public final /* synthetic */ State getShadowColor() {
        return this.shadowColorState;
    }
    
    @Nullable
    public final Color getShadowColor() {
        return this.shadowColorState.get();
    }
    
    @NotNull
    public final UIText setShadowColor(@Nullable final Color shadowColor) {
        final UIText $this$setShadowColor_u24lambda_u2d7 = this;
        final int n = 0;
        $this$setShadowColor_u24lambda_u2d7.shadowColorState.set(shadowColor);
        return this;
    }
    
    public final float getTextWidth() {
        return this.textWidthState.get().floatValue();
    }
    
    @Override
    public float getWidth() {
        return super.getWidth() * this.getTextScale();
    }
    
    @Override
    public float getHeight() {
        return super.getHeight() * this.getTextScale();
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final String text = this.textState.get();
        if (text.length() == 0) {
            return;
        }
        this.beforeDrawCompat(matrixStack);
        final float scale = this.getWidth() / this.textWidthState.get().floatValue();
        final float x = this.getLeft();
        final float y = this.getTop() + (this.verticallyCenteredState.get() ? (this.fontProviderState.get().getBelowLineHeight() * scale) : 0.0f);
        final Color color = this.getColor();
        if (color.getAlpha() <= 10) {
            super.draw(matrixStack);
            return;
        }
        UGraphics.enableBlend();
        final boolean shadow = this.shadowState.get();
        final Color shadowColor = this.shadowColorState.get();
        this.getFontProvider().drawString(matrixStack, this.textState.get(), color, x, y, 10.0f, scale, shadow, shadowColor);
        super.draw(matrixStack);
    }
    
    @JvmOverloads
    public UIText(@NotNull final String text, final boolean shadow) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this(text, shadow, null, 4, null);
    }
    
    @JvmOverloads
    public UIText(@NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this(text, false, null, 6, null);
    }
    
    @JvmOverloads
    public UIText() {
        this(null, false, null, 7, null);
    }
    
    private static final void asState$lambda-1$lambda-0(final BasicState $it, final Function1 $selector, final UIText this$0, final Observable $noName_0, final Object $noName_1) {
        Intrinsics.checkNotNullParameter((Object)$it, "$it");
        Intrinsics.checkNotNullParameter((Object)$selector, "$selector");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        $it.set($selector.invoke((Object)this$0.getConstraints()));
    }
}
