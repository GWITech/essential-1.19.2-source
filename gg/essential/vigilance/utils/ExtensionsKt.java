package gg.essential.vigilance.utils;

import gg.essential.elementa.events.*;
import gg.essential.elementa.effects.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.*;
import java.awt.*;
import gg.essential.elementa.components.*;
import gg.essential.vigilance.gui.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.state.*;
import kotlin.*;
import kotlin.reflect.*;
import gg.essential.universal.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0080\u0004\u001a)\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u0002*\u0002H\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0000¢\u0006\u0002\u0010\r\u001aG\u0010\u000e\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u0002*\u0002H\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\u0010\u0013\u001aA\u0010\u000e\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u0002*\u0002H\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\u0010\u0014\u001a\u001b\u0010\u0015\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u0002*\u0002H\u000bH\u0000¢\u0006\u0002\u0010\u0016\u001a0\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0012H\u0000\u001a\u001e\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\u0006*\b\u0012\u0004\u0012\u00020!0\bH\u0000\u001a2\u0010\"\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010#\u001a\u00020$2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030&H\u0080\u0002¢\u0006\u0002\u0010'\u001a&\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00012\b\b\u0002\u0010*\u001a\u00020\u0001H\u0000\u001a\u0014\u0010+\u001a\u00020\u0001*\u00020\u00022\u0006\u0010,\u001a\u00020\u0002H\u0002\u001a\u001f\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00010\bH\u0080\u0002\u001a\u001a\u0010.\u001a\u00020\u0002*\u00020\u00022\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0000\u001a@\u00102\u001a\u00020\u0002*\u00020\u00022.\b\u0004\u00103\u001a(\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u001105¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020104¢\u0006\u0002\b9H\u0086\b\u00f8\u0001\u0000\u001a2\u0010:\u001a\b\u0012\u0004\u0012\u00020100\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002010<H\u0000\u001a9\u0010=\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0080\u0004\u001a7\u0010>\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b\"\u0004\b\u0000\u0010\u000b*\u00020\u00022\n\b\u0002\u0010?\u001a\u0004\u0018\u0001H\u000b2\f\u0010@\u001a\b\u0012\u0004\u0012\u0002H\u000b00H\u0000¢\u0006\u0002\u0010A\u001a\u0015\u0010B\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0080\u0004\u001a:\u0010C\u001a\u000201\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010#\u001a\u00020$2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030&2\u0006\u0010D\u001a\u0002H\u000bH\u0080\u0002¢\u0006\u0002\u0010E\u001a\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0F\"\u0004\b\u0000\u0010\u000b*\u0002H\u000bH\u0000¢\u0006\u0002\u0010G\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006H" }, d2 = { "hasWindow", "", "Lgg/essential/elementa/UIComponent;", "getHasWindow", "(Lgg/essential/elementa/UIComponent;)Z", "and", "Lgg/essential/elementa/state/MappedState;", "Lkotlin/Pair;", "Lgg/essential/elementa/state/State;", "other", "bindFloating", "T", "state", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/UIComponent;", "bindParent", "parent", "delayed", "index", "", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;)Lgg/essential/elementa/UIComponent;", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;)Lgg/essential/elementa/UIComponent;", "centered", "(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;", "createScrollGradient", "Lgg/essential/elementa/components/GradientComponent;", "Lgg/essential/elementa/components/ScrollComponent;", "top", "heightSize", "Lgg/essential/elementa/constraints/HeightConstraint;", "color", "Ljava/awt/Color;", "maxGradient", "empty", "", "getValue", "obj", "", "property", "Lkotlin/reflect/KProperty;", "(Lgg/essential/elementa/state/State;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "hoveredState", "hitTest", "layoutSafe", "isComponentInParentChain", "target", "not", "onAnimationFrame", "block", "Lkotlin/Function0;", "", "onLeftClick", "method", "Lkotlin/Function2;", "Lgg/essential/elementa/events/UIClickEvent;", "Lkotlin/ParameterName;", "name", "event", "Lkotlin/ExtensionFunctionType;", "onSetValueAndNow", "listener", "Lkotlin/Function1;", "or", "pollingState", "initialValue", "getter", "(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;", "scrollGradient", "setValue", "value", "(Lgg/essential/elementa/state/State;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Lgg/essential/elementa/state/BasicState;", "(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;", "Vigilance" })
public final class ExtensionsKt
{
    @NotNull
    public static final UIComponent onLeftClick(@NotNull final UIComponent $this$onLeftClick, @NotNull final Function2<? super UIComponent, ? super UIClickEvent, Unit> method) {
        Intrinsics.checkNotNullParameter((Object)$this$onLeftClick, "<this>");
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final int $i$f$onLeftClick = 0;
        return $this$onLeftClick.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new ExtensionsKt$onLeftClick.ExtensionsKt$onLeftClick$1((Function2)method));
    }
    
    private static final boolean isComponentInParentChain(final UIComponent $this$isComponentInParentChain, final UIComponent target) {
        UIComponent component = $this$isComponentInParentChain;
        while (component.getHasParent() && !(component instanceof Window)) {
            component = component.getParent();
            if (Intrinsics.areEqual((Object)component, (Object)target)) {
                return true;
            }
        }
        return false;
    }
    
    @NotNull
    public static final UIComponent onAnimationFrame(@NotNull final UIComponent $this$onAnimationFrame, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter((Object)$this$onAnimationFrame, "<this>");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        return $this$onAnimationFrame.enableEffect((Effect)new ExtensionsKt$onAnimationFrame.ExtensionsKt$onAnimationFrame$1((Function0)block));
    }
    
    @NotNull
    public static final State<Boolean> hoveredState(@NotNull final UIComponent $this$hoveredState, final boolean hitTest, final boolean layoutSafe) {
        Intrinsics.checkNotNullParameter((Object)$this$hoveredState, "<this>");
        final BasicState unsafeHovered = new BasicState((T)false);
        final BasicState safeHovered = new BasicState((T)false);
        if (hitTest) {
            final Ref$BooleanRef registerHitTest = new Ref$BooleanRef();
            registerHitTest.element = true;
            onAnimationFrame($this$hoveredState, (Function0<Unit>)new ExtensionsKt$hoveredState.ExtensionsKt$hoveredState$1(registerHitTest, unsafeHovered, $this$hoveredState));
        }
        $this$hoveredState.onMouseEnter((Function1<? super UIComponent, Unit>)new ExtensionsKt$hoveredState.ExtensionsKt$hoveredState$2(hitTest, unsafeHovered, $this$hoveredState));
        $this$hoveredState.onMouseLeave((Function1<? super UIComponent, Unit>)new ExtensionsKt$hoveredState.ExtensionsKt$hoveredState$3(unsafeHovered));
        State state;
        if (layoutSafe) {
            unsafeHovered.onSetValue((Function1)new ExtensionsKt$hoveredState.ExtensionsKt$hoveredState$4(safeHovered));
            state = safeHovered;
        }
        else {
            state = unsafeHovered;
        }
        return state;
    }
    
    public static /* synthetic */ State hoveredState$default(final UIComponent $this$hoveredState, boolean hitTest, boolean layoutSafe, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            hitTest = true;
        }
        if ((n & 0x2) != 0x0) {
            layoutSafe = true;
        }
        return hoveredState($this$hoveredState, hitTest, layoutSafe);
    }
    
    @NotNull
    public static final <T extends UIComponent> T bindParent(@NotNull final T $this$bindParent, @NotNull final UIComponent parent, @NotNull final State<Boolean> state, final boolean delayed, @Nullable final Integer index) {
        Intrinsics.checkNotNullParameter((Object)$this$bindParent, "<this>");
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        return bindParent($this$bindParent, (State<UIComponent>)state.map((kotlin.jvm.functions.Function1<? super Boolean, ?>)new ExtensionsKt$bindParent.ExtensionsKt$bindParent$1(parent)), delayed, index);
    }
    
    public static /* synthetic */ UIComponent bindParent$default(final UIComponent $this$bindParent, final UIComponent parent, final State state, boolean delayed, Integer index, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            delayed = false;
        }
        if ((n & 0x8) != 0x0) {
            index = null;
        }
        return bindParent($this$bindParent, parent, state, delayed, index);
    }
    
    @NotNull
    public static final <T extends UIComponent> T bindParent(@NotNull final T $this$bindParent, @NotNull final State<UIComponent> state, final boolean delayed, @Nullable final Integer index) {
        Intrinsics.checkNotNullParameter((Object)$this$bindParent, "<this>");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final UIComponent $this$bindParent_u24lambda_u2d0 = $this$bindParent;
        final int n = 0;
        onSetValueAndNow((State<Object>)state, (kotlin.jvm.functions.Function1<? super Object, Unit>)new ExtensionsKt$bindParent$2.ExtensionsKt$bindParent$2$1(delayed, $this$bindParent_u24lambda_u2d0, index));
        return $this$bindParent;
    }
    
    public static /* synthetic */ UIComponent bindParent$default(final UIComponent $this$bindParent, final State state, boolean delayed, Integer index, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            delayed = false;
        }
        if ((n & 0x4) != 0x0) {
            index = null;
        }
        return bindParent($this$bindParent, state, delayed, index);
    }
    
    @NotNull
    public static final <T extends UIComponent> T bindFloating(@NotNull final T $this$bindFloating, @NotNull final State<Boolean> state) {
        Intrinsics.checkNotNullParameter((Object)$this$bindFloating, "<this>");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final UIComponent $this$bindFloating_u24lambda_u2d1 = $this$bindFloating;
        final int n = 0;
        onSetValueAndNow((State<Object>)state, (kotlin.jvm.functions.Function1<? super Object, Unit>)new ExtensionsKt$bindFloating$1.ExtensionsKt$bindFloating$1$1($this$bindFloating_u24lambda_u2d1));
        return $this$bindFloating;
    }
    
    public static final boolean getHasWindow(@NotNull final UIComponent $this$hasWindow) {
        Intrinsics.checkNotNullParameter((Object)$this$hasWindow, "<this>");
        return $this$hasWindow instanceof Window || ($this$hasWindow.getHasParent() && getHasWindow($this$hasWindow.getParent()));
    }
    
    @NotNull
    public static final <T extends UIComponent> T centered(@NotNull final T $this$centered) {
        Intrinsics.checkNotNullParameter((Object)$this$centered, "<this>");
        final UIComponent $this$centered_u24lambda_u2d3 = $this$centered;
        final int n = 0;
        final UIComponent $this$constrain$iv = $this$centered_u24lambda_u2d3;
        final int $i$f$constrain = 0;
        final UIComponent $this$constrain_u24lambda_u2d0$iv = $this$constrain$iv;
        final int n2 = 0;
        final UIConstraints $this$centered_u24lambda_u2d3_u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        final int n3 = 0;
        $this$centered_u24lambda_u2d3_u24lambda_u2d2.setX(new CenterConstraint());
        $this$centered_u24lambda_u2d3_u24lambda_u2d2.setY(new CenterConstraint());
        return $this$centered;
    }
    
    @NotNull
    public static final GradientComponent createScrollGradient(@NotNull final ScrollComponent $this$createScrollGradient, final boolean top, @NotNull final HeightConstraint heightSize, @NotNull final Color color, final int maxGradient) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* heightSize */
        //     7: ldc_w           "heightSize"
        //    10: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    13: aload_3         /* color */
        //    14: ldc_w           "color"
        //    17: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    20: new             Lgg/essential/elementa/state/BasicState;
        //    23: dup            
        //    24: fconst_0       
        //    25: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    28: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    31: astore          percentState
        //    33: aload_0         /* $this$createScrollGradient */
        //    34: iconst_0       
        //    35: new             Lgg/essential/vigilance/utils/ExtensionsKt$createScrollGradient$1;
        //    38: dup            
        //    39: aload           percentState
        //    41: invokespecial   gg/essential/vigilance/utils/ExtensionsKt$createScrollGradient$1.<init>:(Lgg/essential/elementa/state/BasicState;)V
        //    44: checkcast       Lkotlin/jvm/functions/Function2;
        //    47: invokevirtual   gg/essential/elementa/components/ScrollComponent.addScrollAdjustEvent:(ZLkotlin/jvm/functions/Function2;)V
        //    50: aload_3         /* color */
        //    51: iconst_0       
        //    52: invokestatic    gg/essential/elementa/utils/ExtensionsKt.withAlpha:(Ljava/awt/Color;I)Ljava/awt/Color;
        //    55: astore          7
        //    57: aload_3         /* color */
        //    58: iconst_0       
        //    59: invokestatic    gg/essential/elementa/utils/ExtensionsKt.withAlpha:(Ljava/awt/Color;I)Ljava/awt/Color;
        //    62: astore          8
        //    64: new             Lgg/essential/vigilance/utils/ExtensionsKt$createScrollGradient$gradient$1;
        //    67: dup            
        //    68: aload           7
        //    70: aload           8
        //    72: invokespecial   gg/essential/vigilance/utils/ExtensionsKt$createScrollGradient$gradient$1.<init>:(Ljava/awt/Color;Ljava/awt/Color;)V
        //    75: aload           percentState
        //    77: new             Lgg/essential/vigilance/utils/ExtensionsKt$createScrollGradient$gradient$2;
        //    80: dup            
        //    81: iload_1         /* top */
        //    82: aload_3         /* color */
        //    83: iload           maxGradient
        //    85: invokespecial   gg/essential/vigilance/utils/ExtensionsKt$createScrollGradient$gradient$2.<init>:(ZLjava/awt/Color;I)V
        //    88: checkcast       Lkotlin/jvm/functions/Function1;
        //    91: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    94: checkcast       Lgg/essential/elementa/state/State;
        //    97: invokevirtual   gg/essential/vigilance/utils/ExtensionsKt$createScrollGradient$gradient$1.bindStartColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/GradientComponent;
        //   100: aload           percentState
        //   102: new             Lgg/essential/vigilance/utils/ExtensionsKt$createScrollGradient$gradient$3;
        //   105: dup            
        //   106: iload_1         /* top */
        //   107: aload_3         /* color */
        //   108: iload           maxGradient
        //   110: invokespecial   gg/essential/vigilance/utils/ExtensionsKt$createScrollGradient$gradient$3.<init>:(ZLjava/awt/Color;I)V
        //   113: checkcast       Lkotlin/jvm/functions/Function1;
        //   116: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   119: checkcast       Lgg/essential/elementa/state/State;
        //   122: invokevirtual   gg/essential/elementa/components/GradientComponent.bindEndColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/GradientComponent;
        //   125: checkcast       Lgg/essential/elementa/UIComponent;
        //   128: astore          7
        //   130: nop            
        //   131: iconst_0       
        //   132: istore          $i$f$constrain
        //   134: aload           $this$constrain$iv
        //   136: astore          9
        //   138: aload           9
        //   140: astore          $this$constrain_u24lambda_u2d0$iv
        //   142: iconst_0       
        //   143: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   145: aload           $this$constrain_u24lambda_u2d0$iv
        //   147: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   150: astore          $this$createScrollGradient_u24lambda_u2d4
        //   152: iconst_0       
        //   153: istore          $i$a$-constrain-ExtensionsKt$createScrollGradient$gradient$4
        //   155: aload           $this$createScrollGradient_u24lambda_u2d4
        //   157: iconst_0       
        //   158: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   161: checkcast       Ljava/lang/Number;
        //   164: iload_1         /* top */
        //   165: ifne            172
        //   168: iconst_1       
        //   169: goto            173
        //   172: iconst_0       
        //   173: iconst_0       
        //   174: iconst_2       
        //   175: aconst_null    
        //   176: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   179: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   182: aload_0         /* $this$createScrollGradient */
        //   183: checkcast       Lgg/essential/elementa/UIComponent;
        //   186: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   189: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   192: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   195: aload           $this$createScrollGradient_u24lambda_u2d4
        //   197: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   200: dup            
        //   201: iconst_0       
        //   202: iconst_1       
        //   203: aconst_null    
        //   204: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   207: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   210: aload_0         /* $this$createScrollGradient */
        //   211: checkcast       Lgg/essential/elementa/UIComponent;
        //   214: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   217: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   220: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   223: aload           $this$createScrollGradient_u24lambda_u2d4
        //   225: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   228: dup            
        //   229: iconst_0       
        //   230: iconst_1       
        //   231: aconst_null    
        //   232: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   235: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   238: aload_0         /* $this$createScrollGradient */
        //   239: checkcast       Lgg/essential/elementa/UIComponent;
        //   242: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   245: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   248: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   251: aload           $this$createScrollGradient_u24lambda_u2d4
        //   253: aload_2         /* heightSize */
        //   254: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   257: nop            
        //   258: nop            
        //   259: aload           9
        //   261: nop            
        //   262: aload_0         /* $this$createScrollGradient */
        //   263: invokevirtual   gg/essential/elementa/components/ScrollComponent.getParent:()Lgg/essential/elementa/UIComponent;
        //   266: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   269: checkcast       Lgg/essential/elementa/components/GradientComponent;
        //   272: astore          gradient
        //   274: aload           gradient
        //   276: areturn        
        //    MethodParameters:
        //  Name                        Flags  
        //  --------------------------  -----
        //  $this$createScrollGradient  
        //  top                         
        //  heightSize                  
        //  color                       
        //  maxGradient                 
        //    StackMapTable: 00 02 FF 00 AC 00 0E 07 01 42 01 07 01 66 07 01 68 01 07 00 BA 00 07 00 8F 01 07 00 8F 07 00 8F 01 07 01 23 01 00 02 07 01 23 07 01 64 FF 00 00 00 0E 07 01 42 01 07 01 66 07 01 68 01 07 00 BA 00 07 00 8F 01 07 00 8F 07 00 8F 01 07 01 23 01 00 03 07 01 23 07 01 64 01
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static /* synthetic */ GradientComponent createScrollGradient$default(final ScrollComponent $this$createScrollGradient, final boolean top, final HeightConstraint heightSize, Color textShadow, int maxGradient, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            textShadow = VigilancePalette.INSTANCE.getTextShadow();
        }
        if ((n & 0x8) != 0x0) {
            maxGradient = 204;
        }
        return createScrollGradient($this$createScrollGradient, top, heightSize, textShadow, maxGradient);
    }
    
    @NotNull
    public static final ScrollComponent scrollGradient(@NotNull final ScrollComponent $this$scrollGradient, @NotNull final HeightConstraint heightSize) {
        Intrinsics.checkNotNullParameter((Object)$this$scrollGradient, "<this>");
        Intrinsics.checkNotNullParameter((Object)heightSize, "heightSize");
        final ScrollComponent $this$scrollGradient_u24lambda_u2d5 = $this$scrollGradient;
        final int n = 0;
        final GradientComponent topGradient = createScrollGradient$default($this$scrollGradient_u24lambda_u2d5, true, heightSize, null, 0, 12, null);
        createScrollGradient$default($this$scrollGradient_u24lambda_u2d5, false, ConstraintsKt.boundTo((HeightConstraint)UtilitiesKt.getPercent(100), topGradient), null, 0, 12, null);
        return $this$scrollGradient;
    }
    
    @NotNull
    public static final <T> Function0<Unit> onSetValueAndNow(@NotNull final State<T> $this$onSetValueAndNow, @NotNull final Function1<? super T, Unit> listener) {
        Intrinsics.checkNotNullParameter((Object)$this$onSetValueAndNow, "<this>");
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        final Function0 it;
        final Function0 function0 = it = $this$onSetValueAndNow.onSetValue(listener);
        final int n = 0;
        listener.invoke((Object)$this$onSetValueAndNow.get());
        return (Function0<Unit>)function0;
    }
    
    @NotNull
    public static final MappedState<Boolean, Boolean> not(@NotNull final State<Boolean> $this$not) {
        Intrinsics.checkNotNullParameter((Object)$this$not, "<this>");
        return $this$not.map((kotlin.jvm.functions.Function1<? super Boolean, ? extends Boolean>)ExtensionsKt$not.ExtensionsKt$not$1.INSTANCE);
    }
    
    @NotNull
    public static final MappedState<String, Boolean> empty(@NotNull final State<String> $this$empty) {
        Intrinsics.checkNotNullParameter((Object)$this$empty, "<this>");
        return $this$empty.map((kotlin.jvm.functions.Function1<? super String, ? extends Boolean>)ExtensionsKt$empty.ExtensionsKt$empty$1.INSTANCE);
    }
    
    @NotNull
    public static final MappedState<Pair<Boolean, Boolean>, Boolean> and(@NotNull final State<Boolean> $this$and, @NotNull final State<Boolean> other) {
        Intrinsics.checkNotNullParameter((Object)$this$and, "<this>");
        Intrinsics.checkNotNullParameter((Object)other, "other");
        return (MappedState<Pair<Boolean, Boolean>, Boolean>)$this$and.zip((State<Object>)other).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Boolean, Object>, ? extends Boolean>)ExtensionsKt$and.ExtensionsKt$and$1.INSTANCE);
    }
    
    @NotNull
    public static final MappedState<Pair<Boolean, Boolean>, Boolean> or(@NotNull final State<Boolean> $this$or, @NotNull final State<Boolean> other) {
        Intrinsics.checkNotNullParameter((Object)$this$or, "<this>");
        Intrinsics.checkNotNullParameter((Object)other, "other");
        return (MappedState<Pair<Boolean, Boolean>, Boolean>)$this$or.zip((State<Object>)other).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Boolean, Object>, ? extends Boolean>)ExtensionsKt$or.ExtensionsKt$or$1.INSTANCE);
    }
    
    public static final <T> T getValue(@NotNull final State<T> $this$getValue, @NotNull final Object obj, @NotNull final KProperty<?> property) {
        Intrinsics.checkNotNullParameter((Object)$this$getValue, "<this>");
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter((Object)property, "property");
        return $this$getValue.get();
    }
    
    public static final <T> void setValue(@NotNull final State<T> $this$setValue, @NotNull final Object obj, @NotNull final KProperty<?> property, final T value) {
        Intrinsics.checkNotNullParameter((Object)$this$setValue, "<this>");
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter((Object)property, "property");
        $this$setValue.set(value);
    }
    
    @NotNull
    public static final <T> BasicState<T> state(final T $this$state) {
        return new BasicState<T>($this$state);
    }
    
    @NotNull
    public static final <T> State<T> pollingState(@NotNull final UIComponent $this$pollingState, @Nullable final T initialValue, @NotNull final Function0<? extends T> getter) {
        Intrinsics.checkNotNullParameter((Object)$this$pollingState, "<this>");
        Intrinsics.checkNotNullParameter((Object)getter, "getter");
        Object invoke = initialValue;
        if (initialValue == null) {
            invoke = getter.invoke();
        }
        final BasicState state = new BasicState(invoke);
        $this$pollingState.enableEffect((Effect)new ExtensionsKt$pollingState.ExtensionsKt$pollingState$1(state, (Function0)getter));
        return state;
    }
    
    public static /* synthetic */ State pollingState$default(final UIComponent $this$pollingState, Object initialValue, final Function0 getter, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            initialValue = null;
        }
        return pollingState($this$pollingState, initialValue, (kotlin.jvm.functions.Function0<?>)getter);
    }
    
    private static final boolean hoveredState$hitTestHovered(final UIComponent $this_hoveredState) {
        final float halfPixel = 0.5f / (float)UResolution.getScaleFactor();
        final float mouseX = (float)UMouse.Scaled.getX() + halfPixel;
        final float mouseY = (float)UMouse.Scaled.getY() + halfPixel;
        boolean b;
        if ($this_hoveredState.isPointInside(mouseX, mouseY)) {
            final Window window = Window.Companion.of($this_hoveredState);
            final UIComponent hoveredFloatingComponent = window.getHoveredFloatingComponent();
            UIComponent hitTest = (hoveredFloatingComponent == null) ? null : hoveredFloatingComponent.hitTest(mouseX, mouseY);
            if (hitTest == null) {
                hitTest = window.hitTest(mouseX, mouseY);
            }
            final UIComponent hit = hitTest;
            b = (isComponentInParentChain(hit, $this_hoveredState) || Intrinsics.areEqual((Object)hit, (Object)$this_hoveredState));
        }
        else {
            b = false;
        }
        return b;
    }
    
    public static final /* synthetic */ boolean access$hoveredState$hitTestHovered(final UIComponent $this_hoveredState) {
        return hoveredState$hitTestHovered($this_hoveredState);
    }
}
