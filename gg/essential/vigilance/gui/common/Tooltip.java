package gg.essential.vigilance.gui.common;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import kotlin.properties.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.functions.*;
import gg.essential.vigilance.utils.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.utils.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J+\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0019\b\u0002\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u001e¢\u0006\u0002\b J/\u0010!\u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0#2\u0019\b\u0002\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u001e¢\u0006\u0002\b J\u0014\u0010$\u001a\u00020\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170#J\u0006\u0010&\u001a\u00020\rJ\u0010\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\u0017J\u0010\u0010)\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\u0017R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006*" }, d2 = { "Lgg/essential/vigilance/gui/common/Tooltip;", "Lgg/essential/elementa/UIComponent;", "logicalParent", "(Lgg/essential/elementa/UIComponent;)V", "content", "Lgg/essential/elementa/components/UIContainer;", "getContent", "()Lgg/essential/elementa/components/UIContainer;", "content$delegate", "Lkotlin/properties/ReadWriteProperty;", "removalListeners", "", "Lkotlin/Function0;", "", "textColorState", "Lgg/essential/elementa/state/BasicState;", "Ljava/awt/Color;", "kotlin.jvm.PlatformType", "getTextColorState", "()Lgg/essential/elementa/state/BasicState;", "setTextColorState", "(Lgg/essential/elementa/state/BasicState;)V", "textShadowState", "", "getTextShadowState", "setTextShadowState", "addLine", "text", "", "configure", "Lkotlin/Function1;", "Lgg/essential/elementa/components/UIText;", "Lkotlin/ExtensionFunctionType;", "bindLine", "state", "Lgg/essential/elementa/state/State;", "bindVisibility", "visible", "clearLines", "hideTooltip", "delayed", "showTooltip", "Vigilance" })
public abstract class Tooltip extends UIComponent
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final UIComponent logicalParent;
    @NotNull
    private BasicState<Color> textColorState;
    @NotNull
    private BasicState<Boolean> textShadowState;
    @NotNull
    private final ReadWriteProperty content$delegate;
    @NotNull
    private List<Function0<Unit>> removalListeners;
    
    public Tooltip(@NotNull final UIComponent logicalParent) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "logicalParent"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   gg/essential/elementa/UIComponent.<init>:()V
        //    10: aload_0         /* this */
        //    11: aload_1         /* logicalParent */
        //    12: putfield        gg/essential/vigilance/gui/common/Tooltip.logicalParent:Lgg/essential/elementa/UIComponent;
        //    15: aload_0         /* this */
        //    16: new             Lgg/essential/elementa/state/BasicState;
        //    19: dup            
        //    20: getstatic       java/awt/Color.WHITE:Ljava/awt/Color;
        //    23: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    26: putfield        gg/essential/vigilance/gui/common/Tooltip.textColorState:Lgg/essential/elementa/state/BasicState;
        //    29: aload_0         /* this */
        //    30: new             Lgg/essential/elementa/state/BasicState;
        //    33: dup            
        //    34: iconst_1       
        //    35: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    38: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    41: putfield        gg/essential/vigilance/gui/common/Tooltip.textShadowState:Lgg/essential/elementa/state/BasicState;
        //    44: nop            
        //    45: aload_0         /* this */
        //    46: checkcast       Lgg/essential/elementa/UIComponent;
        //    49: astore_2        /* $this$constrain$iv */
        //    50: iconst_0       
        //    51: istore_3        /* $i$f$constrain */
        //    52: aload_2         /* $this$constrain$iv */
        //    53: astore          4
        //    55: aload           4
        //    57: astore          $this$constrain_u24lambda_u2d0$iv
        //    59: iconst_0       
        //    60: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //    62: aload           $this$constrain_u24lambda_u2d0$iv
        //    64: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    67: astore          $this$_init__u24lambda_u2d0
        //    69: iconst_0       
        //    70: istore          $i$a$-constrain-Tooltip$1
        //    72: aload           $this$_init__u24lambda_u2d0
        //    74: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //    77: dup            
        //    78: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //    81: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    84: bipush          8
        //    86: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    89: checkcast       Ljava/lang/Number;
        //    92: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    95: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    98: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   101: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   104: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   107: aload           $this$_init__u24lambda_u2d0
        //   109: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   112: dup            
        //   113: fconst_0       
        //   114: iconst_1       
        //   115: aconst_null    
        //   116: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   119: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   122: bipush          8
        //   124: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   127: checkcast       Ljava/lang/Number;
        //   130: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   133: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   136: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   139: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   142: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   145: nop            
        //   146: nop            
        //   147: nop            
        //   148: nop            
        //   149: nop            
        //   150: aload_0         /* this */
        //   151: new             Lgg/essential/elementa/components/UIContainer;
        //   154: dup            
        //   155: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   158: checkcast       Lgg/essential/elementa/UIComponent;
        //   161: astore_2        /* $this$constrain$iv */
        //   162: iconst_0       
        //   163: istore_3        /* $i$f$constrain */
        //   164: aload_2         /* $this$constrain$iv */
        //   165: astore          4
        //   167: aload           4
        //   169: astore          $this$constrain_u24lambda_u2d0$iv
        //   171: iconst_0       
        //   172: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   174: aload           $this$constrain_u24lambda_u2d0$iv
        //   176: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   179: astore          7
        //   181: astore          9
        //   183: iconst_0       
        //   184: istore          $i$a$-constrain-Tooltip$content$2
        //   186: aload           $this$content_delegate_u24lambda_u2d1
        //   188: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   191: dup            
        //   192: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   195: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   198: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   201: aload           $this$content_delegate_u24lambda_u2d1
        //   203: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   206: dup            
        //   207: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   210: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   213: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   216: aload           $this$content_delegate_u24lambda_u2d1
        //   218: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   221: dup            
        //   222: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   225: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   228: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   231: aload           $this$content_delegate_u24lambda_u2d1
        //   233: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   236: dup            
        //   237: fconst_0       
        //   238: iconst_1       
        //   239: aconst_null    
        //   240: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   243: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   246: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   249: nop            
        //   250: aload           9
        //   252: nop            
        //   253: aload           4
        //   255: nop            
        //   256: aload_0         /* this */
        //   257: checkcast       Lgg/essential/elementa/UIComponent;
        //   260: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   263: aload_0         /* this */
        //   264: getstatic       gg/essential/vigilance/gui/common/Tooltip.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   267: iconst_0       
        //   268: aaload         
        //   269: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   272: putfield        gg/essential/vigilance/gui/common/Tooltip.content$delegate:Lkotlin/properties/ReadWriteProperty;
        //   275: aload_0         /* this */
        //   276: new             Ljava/util/ArrayList;
        //   279: dup            
        //   280: invokespecial   java/util/ArrayList.<init>:()V
        //   283: checkcast       Ljava/util/List;
        //   286: putfield        gg/essential/vigilance/gui/common/Tooltip.removalListeners:Ljava/util/List;
        //   289: return         
        //    MethodParameters:
        //  Name           Flags  
        //  -------------  -----
        //  logicalParent  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final BasicState<Color> getTextColorState() {
        return this.textColorState;
    }
    
    public final void setTextColorState(@NotNull final BasicState<Color> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.textColorState = <set-?>;
    }
    
    @NotNull
    public final BasicState<Boolean> getTextShadowState() {
        return this.textShadowState;
    }
    
    public final void setTextShadowState(@NotNull final BasicState<Boolean> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.textShadowState = <set-?>;
    }
    
    @NotNull
    public final UIContainer getContent() {
        return (UIContainer)this.content$delegate.getValue((Object)this, (KProperty)Tooltip.$$delegatedProperties[0]);
    }
    
    @NotNull
    public final Tooltip bindVisibility(@NotNull final State<Boolean> visible) {
        Intrinsics.checkNotNullParameter((Object)visible, "visible");
        ExtensionsKt.onSetValueAndNow((State<Object>)visible, (kotlin.jvm.functions.Function1<? super Object, Unit>)new Tooltip$bindVisibility.Tooltip$bindVisibility$1(this));
        return this;
    }
    
    public final void clearLines() {
        this.getContent().clearChildren();
    }
    
    @NotNull
    public final Tooltip addLine(@NotNull final String text, @NotNull final Function1<? super UIText, Unit> configure) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)configure, "configure");
        final Tooltip $this$addLine_u24lambda_u2d3 = this;
        final int n = 0;
        final UIComponent $this$constrain$iv = new UIText(text, false, null, 6, null).bindShadow($this$addLine_u24lambda_u2d3.getTextShadowState());
        final int $i$f$constrain = 0;
        final UIComponent $this$constrain_u24lambda_u2d0$iv = $this$constrain$iv;
        final int n2 = 0;
        final UIConstraints $this$addLine_u24lambda_u2d3_u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        final int n3 = 0;
        $this$addLine_u24lambda_u2d3_u24lambda_u2d2.setY(new SiblingConstraint(3.0f, false, 2, null));
        $this$addLine_u24lambda_u2d3_u24lambda_u2d2.setColor(gg.essential.elementa.state.ExtensionsKt.toConstraint($this$addLine_u24lambda_u2d3.getTextColorState()));
        final UIText component = ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, $this$addLine_u24lambda_u2d3.getContent());
        configure.invoke((Object)component);
        return this;
    }
    
    public static /* synthetic */ Tooltip addLine$default(final Tooltip tooltip, String text, Function1 configure, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addLine");
        }
        if ((n & 0x1) != 0x0) {
            text = "";
        }
        if ((n & 0x2) != 0x0) {
            configure = (Function1)Tooltip$addLine.Tooltip$addLine$1.INSTANCE;
        }
        return tooltip.addLine(text, (Function1<? super UIText, Unit>)configure);
    }
    
    @NotNull
    public final Tooltip bindLine(@NotNull final State<String> state, @NotNull final Function1<? super UIText, Unit> configure) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        Intrinsics.checkNotNullParameter((Object)configure, "configure");
        ExtensionsKt.onSetValueAndNow((State<Object>)state, (kotlin.jvm.functions.Function1<? super Object, Unit>)new Tooltip$bindLine.Tooltip$bindLine$2(this, (Function1)configure));
        return this;
    }
    
    public static /* synthetic */ Tooltip bindLine$default(final Tooltip tooltip, final State state, Function1 configure, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindLine");
        }
        if ((n & 0x2) != 0x0) {
            configure = (Function1)Tooltip$bindLine.Tooltip$bindLine$1.INSTANCE;
        }
        return tooltip.bindLine(state, (Function1<? super UIText, Unit>)configure);
    }
    
    public final void showTooltip(final boolean delayed) {
        if (delayed) {
            Window.Companion.enqueueRenderOperation((Function0<Unit>)new Tooltip$showTooltip.Tooltip$showTooltip$1(this));
            return;
        }
        final Window window = Window.Companion.of(this.logicalParent);
        if (window.getChildren().contains(this)) {
            return;
        }
        window.addChild(this);
        this.setFloating(true);
        showTooltip$onRemoved(this.logicalParent, this, (Function0<Unit>)new Tooltip$showTooltip.Tooltip$showTooltip$2(this));
    }
    
    public static /* synthetic */ void showTooltip$default(final Tooltip tooltip, boolean delayed, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTooltip");
        }
        if ((n & 0x1) != 0x0) {
            delayed = true;
        }
        tooltip.showTooltip(delayed);
    }
    
    public final void hideTooltip(final boolean delayed) {
        if (delayed) {
            Window.Companion.enqueueRenderOperation((Function0<Unit>)new Tooltip$hideTooltip.Tooltip$hideTooltip$1(this));
            return;
        }
        final Window ofOrNull = Window.Companion.ofOrNull(this);
        if (ofOrNull == null) {
            return;
        }
        final Window window = ofOrNull;
        this.setFloating(false);
        window.removeChild(this);
        final Iterable $this$forEach$iv = this.removalListeners;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Function0 it = (Function0)element$iv;
            final int n = 0;
            it.invoke();
        }
        this.removalListeners.clear();
    }
    
    public static /* synthetic */ void hideTooltip$default(final Tooltip tooltip, boolean delayed, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideTooltip");
        }
        if ((n & 0x1) != 0x0) {
            delayed = true;
        }
        tooltip.hideTooltip(delayed);
    }
    
    private static final void showTooltip$onRemoved$lambda-4(final UIComponent $this_onRemoved, final Function0 $listener, final Observable $noName_0, final Object event) {
        Intrinsics.checkNotNullParameter((Object)$this_onRemoved, "$this_onRemoved");
        Intrinsics.checkNotNullParameter((Object)$listener, "$listener");
        if (event instanceof ObservableClearEvent || (event instanceof ObservableRemoveEvent && Intrinsics.areEqual(((ObservableRemoveEvent)event).getElement().getValue(), (Object)$this_onRemoved))) {
            $listener.invoke();
        }
    }
    
    private static final void showTooltip$onRemoved(final UIComponent $this$showTooltip_u24onRemoved, final Tooltip this$0, final Function0<Unit> listener) {
        if (Intrinsics.areEqual((Object)$this$showTooltip_u24onRemoved.getParent(), (Object)$this$showTooltip_u24onRemoved)) {
            return;
        }
        final Observer observer = Tooltip::showTooltip$onRemoved$lambda-4;
        $this$showTooltip_u24onRemoved.getParent().getChildren().addObserver(observer);
        this$0.removalListeners.add((Function0<Unit>)new Tooltip$showTooltip$onRemoved.Tooltip$showTooltip$onRemoved$1($this$showTooltip_u24onRemoved, observer));
        showTooltip$onRemoved($this$showTooltip_u24onRemoved.getParent(), this$0, listener);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Tooltip.class, "content", "getContent()Lgg/essential/elementa/components/UIContainer;", 0)) };
    }
}
