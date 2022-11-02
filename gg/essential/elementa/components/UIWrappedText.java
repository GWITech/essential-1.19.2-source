package gg.essential.elementa.components;

import java.awt.*;
import gg.essential.elementa.font.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.utils.*;
import gg.essential.elementa.dsl.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import kotlin.jvm.*;
import gg.essential.universal.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001BO\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rB_\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eJ\u0016\u0010\u001f\u001a\u00020\u00002\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eJ\u0014\u0010!\u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0002J\u0006\u0010)\u001a\u00020\u0005J\b\u0010*\u001a\u0004\u0018\u00010\u0007J\u0015\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eH\u0007¢\u0006\u0002\b*J\u0006\u0010,\u001a\u00020\u0003J\u0006\u0010-\u001a\u00020\u000bJ\u000e\u0010.\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u00100\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J1\u00101\u001a\b\u0012\u0004\u0012\u0002H20\u0016\"\u0004\b\u0000\u00102*\u0002032\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002H205¢\u0006\u0002\b6H\u0002R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0011\u001a&\u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u0013\u0012\u0004\u0012\u00020\u00050\u0013\u0012\u0004\u0012\u00020\u000b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u001b\u001a&\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\u00130\u0013\u0012\u0004\u0012\u00020\u000b0\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067" }, d2 = { "Lgg/essential/elementa/components/UIWrappedText;", "Lgg/essential/elementa/UIComponent;", "text", "", "shadow", "", "shadowColor", "Ljava/awt/Color;", "centered", "trimText", "lineSpacing", "", "trimmedTextSuffix", "(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;ZZFLjava/lang/String;)V", "charWidth", "extraHeightState", "Lgg/essential/elementa/state/MappedState;", "Lkotlin/Pair;", "Lgg/essential/elementa/font/FontProvider;", "fontProviderState", "Lgg/essential/elementa/state/BasicState;", "shadowColorState", "shadowState", "textScaleState", "textState", "textWidthState", "verticallyCenteredState", "bindShadow", "newShadowState", "bindShadowColor", "newShadowColorState", "bindText", "newTextState", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "getMaxLines", "", "getShadow", "getShadowColor", "getShadowColorState", "getText", "getTextWidth", "setShadow", "setShadowColor", "setText", "asState", "T", "Lgg/essential/elementa/UIConstraints;", "selector", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Elementa" })
public class UIWrappedText extends UIComponent
{
    private boolean centered;
    private final boolean trimText;
    private final float lineSpacing;
    @NotNull
    private final String trimmedTextSuffix;
    @NotNull
    private final MappedState<String, String> textState;
    @NotNull
    private final MappedState<Boolean, Boolean> shadowState;
    @NotNull
    private final MappedState<Color, Color> shadowColorState;
    @NotNull
    private final BasicState<Float> textScaleState;
    @NotNull
    private final BasicState<FontProvider> fontProviderState;
    @NotNull
    private MappedState<Pair<String, Pair<Float, FontProvider>>, Float> textWidthState;
    private final float charWidth;
    @NotNull
    private final BasicState<Boolean> verticallyCenteredState;
    @NotNull
    private final MappedState<Pair<Pair<FontProvider, Boolean>, Boolean>, Float> extraHeightState;
    
    @JvmOverloads
    public UIWrappedText(@NotNull final State<String> text, @NotNull final State<Boolean> shadow, @NotNull final State<Color> shadowColor, final boolean centered, final boolean trimText, final float lineSpacing, @NotNull final String trimmedTextSuffix) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)shadow, "shadow");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        Intrinsics.checkNotNullParameter((Object)trimmedTextSuffix, "trimmedTextSuffix");
        super();
        this.centered = centered;
        this.trimText = trimText;
        this.lineSpacing = lineSpacing;
        this.trimmedTextSuffix = trimmedTextSuffix;
        this.textState = text.map((kotlin.jvm.functions.Function1<? super String, ? extends String>)UIWrappedText$textState.UIWrappedText$textState$1.INSTANCE);
        this.shadowState = shadow.map((kotlin.jvm.functions.Function1<? super Boolean, ? extends Boolean>)UIWrappedText$shadowState.UIWrappedText$shadowState$1.INSTANCE);
        this.shadowColorState = shadowColor.map((kotlin.jvm.functions.Function1<? super Color, ? extends Color>)UIWrappedText$shadowColorState.UIWrappedText$shadowColorState$1.INSTANCE);
        this.textScaleState = this.asState(this.getConstraints(), (kotlin.jvm.functions.Function1<? super UIConstraints, ? extends Float>)UIWrappedText$textScaleState.UIWrappedText$textScaleState$1.INSTANCE);
        this.fontProviderState = this.asState(this.getConstraints(), (kotlin.jvm.functions.Function1<? super UIConstraints, ? extends FontProvider>)UIWrappedText$fontProviderState.UIWrappedText$fontProviderState$1.INSTANCE);
        this.textWidthState = (MappedState<Pair<String, Pair<Float, FontProvider>>, Float>)this.textState.zip(this.textScaleState.zip((State<Object>)this.fontProviderState)).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Object, kotlin.Pair<Object, Object>>, ? extends Float>)UIWrappedText$textWidthState.UIWrappedText$textWidthState$1.INSTANCE);
        this.charWidth = UGraphics.getCharWidth('x');
        this.verticallyCenteredState = this.asState(this.getConstraints(), (kotlin.jvm.functions.Function1<? super UIConstraints, ? extends Boolean>)UIWrappedText$verticallyCenteredState.UIWrappedText$verticallyCenteredState$1.INSTANCE);
        this.extraHeightState = (MappedState<Pair<Pair<FontProvider, Boolean>, Boolean>, Float>)this.fontProviderState.zip((State<Object>)this.verticallyCenteredState).zip((State<Object>)this.shadowState).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<kotlin.Pair<Object, Object>, Object>, ? extends Float>)UIWrappedText$extraHeightState.UIWrappedText$extraHeightState$1.INSTANCE);
        this.setWidth(ExtensionsKt.pixels$default(this.textWidthState, false, false, 3, null));
        this.setHeight(BasicConstraintsKt.basicHeightConstraint((Function1<? super UIComponent, Float>)new Function1<UIComponent, Float>() {
            final /* synthetic */ UIWrappedText this$0;
            
            UIWrappedText$1() {
                this.this$0 = $receiver;
                super(1);
            }
            
            @NotNull
            public final Float invoke(@NotNull final UIComponent it) {
                Intrinsics.checkNotNullParameter((Object)it, "it");
                final FontProvider fontProvider = UIComponent.this.getFontProvider();
                final List lines = TextKt.getStringSplitToWidth$default(this.this$0.getText(), this.this$0.getWidth(), this.this$0.getTextScale(), false, false, fontProvider, 16, null);
                if (lines.isEmpty()) {
                    return 0.0f;
                }
                return ((lines.size() - 1) * UIWrappedText.access$getLineSpacing$p(this.this$0) + ((Number)UIWrappedText.access$getExtraHeightState$p(this.this$0).get()).floatValue() + (fontProvider.getBaseLineHeight() + fontProvider.getBelowLineHeight() + fontProvider.getShadowHeight())) * this.this$0.getTextScale();
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((UIComponent)p1);
            }
        }));
    }
    
    public UIWrappedText(final State text, State shadow, State shadowColor, boolean centered, boolean trimText, float lineSpacing, String trimmedTextSuffix, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            shadow = new BasicState(true);
        }
        if ((n & 0x4) != 0x0) {
            shadowColor = new BasicState(null);
        }
        if ((n & 0x8) != 0x0) {
            centered = false;
        }
        if ((n & 0x10) != 0x0) {
            trimText = false;
        }
        if ((n & 0x20) != 0x0) {
            lineSpacing = 9.0f;
        }
        if ((n & 0x40) != 0x0) {
            trimmedTextSuffix = "...";
        }
        this(text, shadow, shadowColor, centered, trimText, lineSpacing, trimmedTextSuffix);
    }
    
    @JvmOverloads
    public UIWrappedText(@NotNull final String text, final boolean shadow, @Nullable final Color shadowColor, final boolean centered, final boolean trimText, final float lineSpacing, @NotNull final String trimmedTextSuffix) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)trimmedTextSuffix, "trimmedTextSuffix");
        this(new BasicState<String>(text), new BasicState<Boolean>(shadow), new BasicState<Color>(shadowColor), centered, trimText, lineSpacing, trimmedTextSuffix);
    }
    
    public UIWrappedText(String text, boolean shadow, Color shadowColor, boolean centered, boolean trimText, float lineSpacing, String trimmedTextSuffix, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            text = "";
        }
        if ((n & 0x2) != 0x0) {
            shadow = true;
        }
        if ((n & 0x4) != 0x0) {
            shadowColor = null;
        }
        if ((n & 0x8) != 0x0) {
            centered = false;
        }
        if ((n & 0x10) != 0x0) {
            trimText = false;
        }
        if ((n & 0x20) != 0x0) {
            lineSpacing = 9.0f;
        }
        if ((n & 0x40) != 0x0) {
            trimmedTextSuffix = "...";
        }
        this(text, shadow, shadowColor, centered, trimText, lineSpacing, trimmedTextSuffix);
    }
    
    private final <T> BasicState<T> asState(final UIConstraints $this$asState, final Function1<? super UIConstraints, ? extends T> selector) {
        final BasicState it = new BasicState((T)selector.invoke((Object)this.getConstraints()));
        final int n = 0;
        this.getConstraints().addObserver(UIWrappedText::asState$lambda-1$lambda-0);
        return it;
    }
    
    @NotNull
    public final UIWrappedText bindText(@NotNull final State<String> newTextState) {
        Intrinsics.checkNotNullParameter((Object)newTextState, "newTextState");
        final UIWrappedText $this$bindText_u24lambda_u2d2 = this;
        final int n = 0;
        $this$bindText_u24lambda_u2d2.textState.rebind(newTextState);
        return this;
    }
    
    @NotNull
    public final UIWrappedText bindShadow(@NotNull final State<Boolean> newShadowState) {
        Intrinsics.checkNotNullParameter((Object)newShadowState, "newShadowState");
        final UIWrappedText $this$bindShadow_u24lambda_u2d3 = this;
        final int n = 0;
        $this$bindShadow_u24lambda_u2d3.shadowState.rebind(newShadowState);
        return this;
    }
    
    @NotNull
    public final UIWrappedText bindShadowColor(@NotNull final State<Color> newShadowColorState) {
        Intrinsics.checkNotNullParameter((Object)newShadowColorState, "newShadowColorState");
        final UIWrappedText $this$bindShadowColor_u24lambda_u2d4 = this;
        final int n = 0;
        $this$bindShadowColor_u24lambda_u2d4.shadowColorState.rebind(newShadowColorState);
        return this;
    }
    
    @NotNull
    public final String getText() {
        return this.textState.get();
    }
    
    @NotNull
    public final UIWrappedText setText(@NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        final UIWrappedText $this$setText_u24lambda_u2d5 = this;
        final int n = 0;
        $this$setText_u24lambda_u2d5.textState.set(text);
        return this;
    }
    
    public final boolean getShadow() {
        return this.shadowState.get();
    }
    
    @NotNull
    public final UIWrappedText setShadow(final boolean shadow) {
        final UIWrappedText $this$setShadow_u24lambda_u2d6 = this;
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
    public final UIWrappedText setShadowColor(@Nullable final Color shadowColor) {
        final UIWrappedText $this$setShadowColor_u24lambda_u2d7 = this;
        final int n = 0;
        $this$setShadowColor_u24lambda_u2d7.shadowColorState.set(shadowColor);
        return this;
    }
    
    public final float getTextWidth() {
        return this.textWidthState.get().floatValue();
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "matrixStack"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* this */
        //     8: aload_1         /* matrixStack */
        //     9: invokevirtual   gg/essential/elementa/components/UIWrappedText.beforeDrawCompat:(Lgg/essential/universal/UMatrixStack;)V
        //    12: aload_0         /* this */
        //    13: invokevirtual   gg/essential/elementa/components/UIWrappedText.getTextScale:()F
        //    16: fstore_2        /* textScale */
        //    17: aload_0         /* this */
        //    18: invokevirtual   gg/essential/elementa/components/UIWrappedText.getLeft:()F
        //    21: fstore_3        /* x */
        //    22: aload_0         /* this */
        //    23: invokevirtual   gg/essential/elementa/components/UIWrappedText.getTop:()F
        //    26: aload_0         /* this */
        //    27: getfield        gg/essential/elementa/components/UIWrappedText.verticallyCenteredState:Lgg/essential/elementa/state/BasicState;
        //    30: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
        //    33: checkcast       Ljava/lang/Boolean;
        //    36: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    39: ifeq            62
        //    42: aload_0         /* this */
        //    43: getfield        gg/essential/elementa/components/UIWrappedText.fontProviderState:Lgg/essential/elementa/state/BasicState;
        //    46: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
        //    49: checkcast       Lgg/essential/elementa/font/FontProvider;
        //    52: invokeinterface gg/essential/elementa/font/FontProvider.getBelowLineHeight:()F
        //    57: fload_2         /* textScale */
        //    58: fmul           
        //    59: goto            63
        //    62: fconst_0       
        //    63: fadd           
        //    64: fstore          y
        //    66: aload_0         /* this */
        //    67: invokevirtual   gg/essential/elementa/components/UIWrappedText.getWidth:()F
        //    70: fstore          width
        //    72: aload_0         /* this */
        //    73: invokevirtual   gg/essential/elementa/components/UIWrappedText.getColor:()Ljava/awt/Color;
        //    76: astore          color
        //    78: aload           color
        //    80: invokevirtual   java/awt/Color.getAlpha:()I
        //    83: bipush          10
        //    85: if_icmpgt       94
        //    88: aload_0         /* this */
        //    89: aload_1         /* matrixStack */
        //    90: invokespecial   gg/essential/elementa/UIComponent.draw:(Lgg/essential/universal/UMatrixStack;)V
        //    93: return         
        //    94: fload           width
        //    96: fload_2         /* textScale */
        //    97: fdiv           
        //    98: aload_0         /* this */
        //    99: getfield        gg/essential/elementa/components/UIWrappedText.charWidth:F
        //   102: fcmpg          
        //   103: ifgt            112
        //   106: aload_0         /* this */
        //   107: aload_1         /* matrixStack */
        //   108: invokespecial   gg/essential/elementa/UIComponent.draw:(Lgg/essential/universal/UMatrixStack;)V
        //   111: return         
        //   112: invokestatic    gg/essential/universal/UGraphics.enableBlend:()V
        //   115: aload_0         /* this */
        //   116: getfield        gg/essential/elementa/components/UIWrappedText.trimText:Z
        //   119: ifeq            158
        //   122: aload_0         /* this */
        //   123: getfield        gg/essential/elementa/components/UIWrappedText.textState:Lgg/essential/elementa/state/MappedState;
        //   126: invokevirtual   gg/essential/elementa/state/MappedState.get:()Ljava/lang/Object;
        //   129: checkcast       Ljava/lang/String;
        //   132: fload           width
        //   134: fload_2         /* textScale */
        //   135: aload_0         /* this */
        //   136: invokespecial   gg/essential/elementa/components/UIWrappedText.getMaxLines:()I
        //   139: iconst_0       
        //   140: iconst_0       
        //   141: aload_0         /* this */
        //   142: invokevirtual   gg/essential/elementa/components/UIWrappedText.getFontProvider:()Lgg/essential/elementa/font/FontProvider;
        //   145: aload_0         /* this */
        //   146: getfield        gg/essential/elementa/components/UIWrappedText.trimmedTextSuffix:Ljava/lang/String;
        //   149: bipush          32
        //   151: aconst_null    
        //   152: invokestatic    gg/essential/elementa/utils/TextKt.getStringSplitToWidthTruncated$default:(Ljava/lang/String;FFIZZLgg/essential/elementa/font/FontProvider;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;
        //   155: goto            183
        //   158: aload_0         /* this */
        //   159: getfield        gg/essential/elementa/components/UIWrappedText.textState:Lgg/essential/elementa/state/MappedState;
        //   162: invokevirtual   gg/essential/elementa/state/MappedState.get:()Ljava/lang/Object;
        //   165: checkcast       Ljava/lang/String;
        //   168: fload           width
        //   170: fload_2         /* textScale */
        //   171: iconst_0       
        //   172: iconst_0       
        //   173: aload_0         /* this */
        //   174: invokevirtual   gg/essential/elementa/components/UIWrappedText.getFontProvider:()Lgg/essential/elementa/font/FontProvider;
        //   177: bipush          16
        //   179: aconst_null    
        //   180: invokestatic    gg/essential/elementa/utils/TextKt.getStringSplitToWidth$default:(Ljava/lang/String;FFZZLgg/essential/elementa/font/FontProvider;ILjava/lang/Object;)Ljava/util/List;
        //   183: checkcast       Ljava/lang/Iterable;
        //   186: astore          8
        //   188: nop            
        //   189: iconst_0       
        //   190: istore          $i$f$map
        //   192: aload           $this$map$iv
        //   194: astore          10
        //   196: new             Ljava/util/ArrayList;
        //   199: dup            
        //   200: aload           $this$map$iv
        //   202: bipush          10
        //   204: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   207: invokespecial   java/util/ArrayList.<init>:(I)V
        //   210: checkcast       Ljava/util/Collection;
        //   213: astore          destination$iv$iv
        //   215: iconst_0       
        //   216: istore          $i$f$mapTo
        //   218: aload           $this$mapTo$iv$iv
        //   220: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   225: astore          13
        //   227: aload           13
        //   229: invokeinterface java/util/Iterator.hasNext:()Z
        //   234: ifeq            299
        //   237: aload           13
        //   239: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   244: astore          item$iv$iv
        //   246: aload           destination$iv$iv
        //   248: aload           item$iv$iv
        //   250: checkcast       Ljava/lang/String;
        //   253: astore          15
        //   255: astore          21
        //   257: iconst_0       
        //   258: istore          $i$a$-map-UIWrappedText$draw$lines$1
        //   260: aload           it
        //   262: dup            
        //   263: ifnonnull       277
        //   266: new             Ljava/lang/NullPointerException;
        //   269: dup            
        //   270: ldc_w           "null cannot be cast to non-null type kotlin.CharSequence"
        //   273: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   276: athrow         
        //   277: checkcast       Ljava/lang/CharSequence;
        //   280: invokestatic    kotlin/text/StringsKt.trimEnd:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
        //   283: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   286: nop            
        //   287: aload           21
        //   289: swap           
        //   290: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   295: pop            
        //   296: goto            227
        //   299: aload           destination$iv$iv
        //   301: checkcast       Ljava/util/List;
        //   304: nop            
        //   305: astore          lines
        //   307: aload_0         /* this */
        //   308: getfield        gg/essential/elementa/components/UIWrappedText.shadowState:Lgg/essential/elementa/state/MappedState;
        //   311: invokevirtual   gg/essential/elementa/state/MappedState.get:()Ljava/lang/Object;
        //   314: checkcast       Ljava/lang/Boolean;
        //   317: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   320: istore          shadow
        //   322: aload_0         /* this */
        //   323: getfield        gg/essential/elementa/components/UIWrappedText.shadowColorState:Lgg/essential/elementa/state/MappedState;
        //   326: invokevirtual   gg/essential/elementa/state/MappedState.get:()Ljava/lang/Object;
        //   329: checkcast       Ljava/awt/Color;
        //   332: astore          shadowColor
        //   334: aload           lines
        //   336: checkcast       Ljava/lang/Iterable;
        //   339: astore          $this$forEachIndexed$iv
        //   341: iconst_0       
        //   342: istore          $i$f$forEachIndexed
        //   344: iconst_0       
        //   345: istore          index$iv
        //   347: aload           $this$forEachIndexed$iv
        //   349: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   354: astore          13
        //   356: aload           13
        //   358: invokeinterface java/util/Iterator.hasNext:()Z
        //   363: ifeq            483
        //   366: aload           13
        //   368: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   373: astore          item$iv
        //   375: iload           index$iv
        //   377: iinc            index$iv, 1
        //   380: istore          15
        //   382: iload           15
        //   384: ifge            390
        //   387: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        //   390: iload           15
        //   392: aload           item$iv
        //   394: checkcast       Ljava/lang/String;
        //   397: astore          17
        //   399: istore          i
        //   401: iconst_0       
        //   402: istore          $i$a$-forEachIndexed-UIWrappedText$draw$1
        //   404: aload_0         /* this */
        //   405: getfield        gg/essential/elementa/components/UIWrappedText.centered:Z
        //   408: ifeq            428
        //   411: fload           width
        //   413: aload           line
        //   415: fload_2         /* textScale */
        //   416: aconst_null    
        //   417: iconst_2       
        //   418: aconst_null    
        //   419: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.width$default:(Ljava/lang/String;FLgg/essential/elementa/font/FontProvider;ILjava/lang/Object;)F
        //   422: fsub           
        //   423: fconst_2       
        //   424: fdiv           
        //   425: goto            429
        //   428: fconst_0       
        //   429: fstore          xOffset
        //   431: aload_0         /* this */
        //   432: invokevirtual   gg/essential/elementa/components/UIWrappedText.getFontProvider:()Lgg/essential/elementa/font/FontProvider;
        //   435: aload_1         /* matrixStack */
        //   436: aload           line
        //   438: aload           color
        //   440: fload_3         /* x */
        //   441: fload           xOffset
        //   443: fadd           
        //   444: fload           y
        //   446: iload           i
        //   448: i2f            
        //   449: aload_0         /* this */
        //   450: getfield        gg/essential/elementa/components/UIWrappedText.lineSpacing:F
        //   453: fmul           
        //   454: fload_2         /* textScale */
        //   455: fmul           
        //   456: fadd           
        //   457: ldc_w           10.0
        //   460: fload_2         /* textScale */
        //   461: iload           shadow
        //   463: iload           shadow
        //   465: ifeq            473
        //   468: aload           shadowColor
        //   470: goto            474
        //   473: aconst_null    
        //   474: invokeinterface gg/essential/elementa/font/FontProvider.drawString:(Lgg/essential/universal/UMatrixStack;Ljava/lang/String;Ljava/awt/Color;FFFFZLjava/awt/Color;)V
        //   479: nop            
        //   480: goto            356
        //   483: nop            
        //   484: aload_0         /* this */
        //   485: aload_1         /* matrixStack */
        //   486: invokespecial   gg/essential/elementa/UIComponent.draw:(Lgg/essential/universal/UMatrixStack;)V
        //   489: return         
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  matrixStack  
        //    StackMapTable: 00 10 FF 00 3E 00 04 07 00 02 07 01 64 02 02 00 01 02 FF 00 00 00 04 07 00 02 07 01 64 02 02 00 02 02 02 FE 00 1E 02 02 07 01 45 11 2D 58 07 01 85 FF 00 2B 00 0E 07 00 02 07 01 64 02 02 02 02 07 01 45 00 07 01 87 01 07 01 87 07 01 94 01 07 01 9A 00 00 FF 00 31 00 16 07 00 02 07 01 64 02 02 02 02 07 01 45 00 07 01 87 01 07 01 87 07 01 94 01 07 01 9A 07 01 A9 07 01 2C 01 00 00 00 00 07 01 94 00 01 07 01 2C FF 00 15 00 0E 07 00 02 07 01 64 02 02 02 02 07 01 45 00 07 01 87 01 07 01 87 07 01 94 01 07 01 9A 00 00 FF 00 38 00 0E 07 00 02 07 01 64 02 02 02 02 07 01 45 07 01 85 01 07 01 45 07 01 87 01 01 07 01 9A 00 00 FD 00 21 07 01 A9 01 FF 00 25 00 14 07 00 02 07 01 64 02 02 02 02 07 01 45 07 01 85 01 07 01 45 07 01 87 01 01 07 01 9A 07 01 A9 01 00 07 01 2C 01 01 00 00 40 02 FF 00 2B 00 15 07 00 02 07 01 64 02 02 02 02 07 01 45 07 01 85 01 07 01 45 07 01 87 01 01 07 01 9A 07 01 A9 01 00 07 01 2C 01 01 02 00 09 07 01 5F 07 01 64 07 01 2C 07 01 45 02 02 02 02 01 FF 00 00 00 15 07 00 02 07 01 64 02 02 02 02 07 01 45 07 01 85 01 07 01 45 07 01 87 01 01 07 01 9A 07 01 A9 01 00 07 01 2C 01 01 02 00 0A 07 01 5F 07 01 64 07 01 2C 07 01 45 02 02 02 02 01 07 01 45 FF 00 08 00 0E 07 00 02 07 01 64 02 02 02 02 07 01 45 07 01 85 01 07 01 45 07 01 87 01 01 07 01 9A 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final int getMaxLines() {
        final FontProvider fontProvider = this.getFontProvider();
        final float height = this.getHeight() / this.getTextScale() - this.extraHeightState.get().floatValue();
        final float baseLineHeight = fontProvider.getBaseLineHeight() + fontProvider.getBelowLineHeight() + fontProvider.getShadowHeight();
        if (height < baseLineHeight) {
            return 0;
        }
        return 1 + (int)((height - baseLineHeight) / this.lineSpacing);
    }
    
    @JvmOverloads
    public UIWrappedText(@NotNull final State<String> text, @NotNull final State<Boolean> shadow, @NotNull final State<Color> shadowColor, final boolean centered, final boolean trimText, final float lineSpacing) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)shadow, "shadow");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        this(text, shadow, shadowColor, centered, trimText, lineSpacing, null, 64, null);
    }
    
    @JvmOverloads
    public UIWrappedText(@NotNull final State<String> text, @NotNull final State<Boolean> shadow, @NotNull final State<Color> shadowColor, final boolean centered, final boolean trimText) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)shadow, "shadow");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        this(text, shadow, shadowColor, centered, trimText, 0.0f, null, 96, null);
    }
    
    @JvmOverloads
    public UIWrappedText(@NotNull final State<String> text, @NotNull final State<Boolean> shadow, @NotNull final State<Color> shadowColor, final boolean centered) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)shadow, "shadow");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        this(text, shadow, shadowColor, centered, false, 0.0f, null, 112, null);
    }
    
    @JvmOverloads
    public UIWrappedText(@NotNull final State<String> text, @NotNull final State<Boolean> shadow, @NotNull final State<Color> shadowColor) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)shadow, "shadow");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        this(text, shadow, shadowColor, false, false, 0.0f, null, 120, null);
    }
    
    @JvmOverloads
    public UIWrappedText(@NotNull final State<String> text, @NotNull final State<Boolean> shadow) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)shadow, "shadow");
        this(text, shadow, null, false, false, 0.0f, null, 124, null);
    }
    
    @JvmOverloads
    public UIWrappedText(@NotNull final State<String> text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this(text, null, null, false, false, 0.0f, null, 126, null);
    }
    
    @JvmOverloads
    public UIWrappedText(@NotNull final String text, final boolean shadow, @Nullable final Color shadowColor, final boolean centered, final boolean trimText, final float lineSpacing) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this(text, shadow, shadowColor, centered, trimText, lineSpacing, null, 64, null);
    }
    
    @JvmOverloads
    public UIWrappedText(@NotNull final String text, final boolean shadow, @Nullable final Color shadowColor, final boolean centered, final boolean trimText) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this(text, shadow, shadowColor, centered, trimText, 0.0f, null, 96, null);
    }
    
    @JvmOverloads
    public UIWrappedText(@NotNull final String text, final boolean shadow, @Nullable final Color shadowColor, final boolean centered) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this(text, shadow, shadowColor, centered, false, 0.0f, null, 112, null);
    }
    
    @JvmOverloads
    public UIWrappedText(@NotNull final String text, final boolean shadow, @Nullable final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this(text, shadow, shadowColor, false, false, 0.0f, null, 120, null);
    }
    
    @JvmOverloads
    public UIWrappedText(@NotNull final String text, final boolean shadow) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this(text, shadow, null, false, false, 0.0f, null, 124, null);
    }
    
    @JvmOverloads
    public UIWrappedText(@NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this(text, false, null, false, false, 0.0f, null, 126, null);
    }
    
    @JvmOverloads
    public UIWrappedText() {
        this(null, false, null, false, false, 0.0f, null, 127, null);
    }
    
    private static final void asState$lambda-1$lambda-0(final BasicState $it, final Function1 $selector, final UIWrappedText this$0, final Observable $noName_0, final Object $noName_1) {
        Intrinsics.checkNotNullParameter((Object)$it, "$it");
        Intrinsics.checkNotNullParameter((Object)$selector, "$selector");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        $it.set($selector.invoke((Object)this$0.getConstraints()));
    }
    
    public static final /* synthetic */ FontProvider access$getFontProvider$s1021434057(final UIWrappedText $this) {
        return $this.getFontProvider();
    }
    
    public static final /* synthetic */ float access$getLineSpacing$p(final UIWrappedText $this) {
        return $this.lineSpacing;
    }
    
    public static final /* synthetic */ MappedState access$getExtraHeightState$p(final UIWrappedText $this) {
        return $this.extraHeightState;
    }
}
