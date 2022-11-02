package gg.essential.gui.common;

import kotlin.reflect.*;
import java.awt.*;
import kotlin.properties.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import kotlin.text.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.elementa.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.utils.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000Z
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J<\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020"2
                                                   \b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\r0&¢\u0006\u0002\b(¢\u0006\u0002\u0010)J@\u0010*\u001a\u00020\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020"0\u00172
                                                   \b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\r0&¢\u0006\u0002\b(¢\u0006\u0002\u0010,J\u0014\u0010-\u001a\u00020\u00002\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017J\u0006\u0010/\u001a\u00020\rJ\u0010\u00100\u001a\u00020\r2\b\b\u0002\u00101\u001a\u00020\u001dJ\u0010\u00102\u001a\u00020\r2\b\b\u0002\u00101\u001a\u00020\u001dR\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\b\u0010	\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010
                                                   \u001a\u000e\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u000e¢\u0006\u0002
                                                   \u0000R(\u0010\u000e\u001a\u0010\u0012\f\u0012
                                                    \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0012\u0010\u0013"\u0004\b\u0014\u0010\u0015R"\u0010\u0016\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0017X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0018\u0010\u0019"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001e\u0010\u0013"\u0004\b\u001f\u0010\u0015¨\u00063""" }, d2 = { "Lgg/essential/gui/common/Tooltip;", "Lgg/essential/elementa/UIComponent;", "logicalParent", "(Lgg/essential/elementa/UIComponent;)V", "content", "Lgg/essential/elementa/components/UIContainer;", "getContent", "()Lgg/essential/elementa/components/UIContainer;", "content$delegate", "Lkotlin/properties/ReadWriteProperty;", "removalListeners", "", "Lkotlin/Function0;", "", "textColorState", "Lgg/essential/elementa/state/BasicState;", "Ljava/awt/Color;", "kotlin.jvm.PlatformType", "getTextColorState", "()Lgg/essential/elementa/state/BasicState;", "setTextColorState", "(Lgg/essential/elementa/state/BasicState;)V", "textShadowColorState", "Lgg/essential/elementa/state/State;", "getTextShadowColorState", "()Lgg/essential/elementa/state/State;", "setTextShadowColorState", "(Lgg/essential/elementa/state/State;)V", "textShadowState", "", "getTextShadowState", "setTextShadowState", "addLine", "text", "", "wrapAtWidth", "", "configure", "Lkotlin/Function1;", "Lgg/essential/elementa/components/UIText;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/Tooltip;", "bindLine", "state", "(Lgg/essential/elementa/state/State;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/Tooltip;", "bindVisibility", "visible", "clearLines", "hideTooltip", "delayed", "showTooltip", "essential" })
public abstract class Tooltip extends UIComponent
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final UIComponent logicalParent;
    @NotNull
    private BasicState<Color> textColorState;
    @NotNull
    private State<Color> textShadowColorState;
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
        //    12: putfield        gg/essential/gui/common/Tooltip.logicalParent:Lgg/essential/elementa/UIComponent;
        //    15: aload_0         /* this */
        //    16: new             Lgg/essential/elementa/state/BasicState;
        //    19: dup            
        //    20: getstatic       java/awt/Color.WHITE:Ljava/awt/Color;
        //    23: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    26: putfield        gg/essential/gui/common/Tooltip.textColorState:Lgg/essential/elementa/state/BasicState;
        //    29: aload_0         /* this */
        //    30: new             Lgg/essential/elementa/state/BasicState;
        //    33: dup            
        //    34: getstatic       gg/essential/gui/EssentialPalette.BLACK:Ljava/awt/Color;
        //    37: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    40: checkcast       Lgg/essential/elementa/state/State;
        //    43: putfield        gg/essential/gui/common/Tooltip.textShadowColorState:Lgg/essential/elementa/state/State;
        //    46: aload_0         /* this */
        //    47: new             Lgg/essential/elementa/state/BasicState;
        //    50: dup            
        //    51: iconst_1       
        //    52: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    55: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    58: putfield        gg/essential/gui/common/Tooltip.textShadowState:Lgg/essential/elementa/state/BasicState;
        //    61: aload_0         /* this */
        //    62: checkcast       Lgg/essential/elementa/UIComponent;
        //    65: astore_2        /* $this$constrain$iv */
        //    66: aload_2         /* $this$constrain$iv */
        //    67: astore_3       
        //    68: aload_3        
        //    69: astore          $this$constrain_u24lambda_u2d0$iv
        //    71: aload           $this$constrain_u24lambda_u2d0$iv
        //    73: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    76: astore          $this$_init__u24lambda_u2d0
        //    78: aload           $this$_init__u24lambda_u2d0
        //    80: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //    83: dup            
        //    84: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //    87: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    90: bipush          8
        //    92: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    95: checkcast       Ljava/lang/Number;
        //    98: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   101: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   104: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   107: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   110: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   113: aload           $this$_init__u24lambda_u2d0
        //   115: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   118: dup            
        //   119: fconst_0       
        //   120: iconst_1       
        //   121: aconst_null    
        //   122: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   125: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   128: bipush          8
        //   130: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   133: checkcast       Ljava/lang/Number;
        //   136: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   139: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   142: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   145: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   148: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   151: aload_0         /* this */
        //   152: new             Lgg/essential/elementa/components/UIContainer;
        //   155: dup            
        //   156: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   159: checkcast       Lgg/essential/elementa/UIComponent;
        //   162: astore_2        /* $this$constrain$iv */
        //   163: aload_2         /* $this$constrain$iv */
        //   164: astore_3       
        //   165: aload_3        
        //   166: astore          $this$constrain_u24lambda_u2d0$iv
        //   168: aload           $this$constrain_u24lambda_u2d0$iv
        //   170: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   173: astore          5
        //   175: astore          6
        //   177: aload           $this$content_delegate_u24lambda_u2d1
        //   179: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   182: dup            
        //   183: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   186: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   189: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   192: aload           $this$content_delegate_u24lambda_u2d1
        //   194: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   197: dup            
        //   198: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   201: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   204: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   207: aload           $this$content_delegate_u24lambda_u2d1
        //   209: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   212: dup            
        //   213: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   216: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   219: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   222: aload           $this$content_delegate_u24lambda_u2d1
        //   224: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   227: dup            
        //   228: fconst_0       
        //   229: iconst_1       
        //   230: aconst_null    
        //   231: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   234: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   237: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   240: aload           6
        //   242: aload_3        
        //   243: aload_0         /* this */
        //   244: checkcast       Lgg/essential/elementa/UIComponent;
        //   247: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   250: aload_0         /* this */
        //   251: getstatic       gg/essential/gui/common/Tooltip.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   254: iconst_0       
        //   255: aaload         
        //   256: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   259: putfield        gg/essential/gui/common/Tooltip.content$delegate:Lkotlin/properties/ReadWriteProperty;
        //   262: aload_0         /* this */
        //   263: new             Ljava/util/ArrayList;
        //   266: dup            
        //   267: invokespecial   java/util/ArrayList.<init>:()V
        //   270: checkcast       Ljava/util/List;
        //   273: putfield        gg/essential/gui/common/Tooltip.removalListeners:Ljava/util/List;
        //   276: return         
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
    
    @NotNull
    public final UIContainer getContent() {
        return (UIContainer)this.content$delegate.getValue((Object)this, (KProperty)Tooltip.$$delegatedProperties[0]);
    }
    
    @NotNull
    public final Tooltip bindVisibility(@NotNull final State<Boolean> visible) {
        Intrinsics.checkNotNullParameter((Object)visible, "visible");
        StateExtensionsKt.onSetValueAndNow((State<Object>)visible, (kotlin.jvm.functions.Function1<? super Object, Unit>)new Tooltip$bindVisibility.Tooltip$bindVisibility$1(this));
        return this;
    }
    
    public final void clearLines() {
        this.getContent().clearChildren();
    }
    
    @NotNull
    public final Tooltip addLine(@NotNull final String text, @Nullable final Float wrapAtWidth, @NotNull final Function1<? super UIText, Unit> configure) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)configure, "configure");
        final Tooltip $this$addLine_u24lambda_u2d6 = this;
        if (wrapAtWidth != null) {
            final Iterable $this$forEach$iv = StringsKt.lines((CharSequence)text);
            for (final Object element$iv : $this$forEach$iv) {
                final String it = (String)element$iv;
                final UIComponent $this$constrain_u24lambda_u2d0$iv;
                final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new EssentialUIWrappedText(it, false, null, true, null, 0.0f, 118).bindShadow($this$addLine_u24lambda_u2d6.textShadowState).bindShadowColor($this$addLine_u24lambda_u2d6.textShadowColorState);
                final UIConstraints $this$addLine_u24lambda_u2d6_u24lambda_u2d3_u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
                $this$addLine_u24lambda_u2d6_u24lambda_u2d3_u24lambda_u2d2.setX(new CenterConstraint());
                $this$addLine_u24lambda_u2d6_u24lambda_u2d3_u24lambda_u2d2.setY((YConstraint)ConstraintsKt.max(new SiblingConstraint(0.0f, false, 3, null), UtilitiesKt.getPixels(4)));
                $this$addLine_u24lambda_u2d6_u24lambda_u2d3_u24lambda_u2d2.setWidth(UtilitiesKt.getPixels(wrapAtWidth));
                $this$addLine_u24lambda_u2d6_u24lambda_u2d3_u24lambda_u2d2.setColor(ExtensionsKt.toConstraint($this$addLine_u24lambda_u2d6.textColorState));
                ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, $this$addLine_u24lambda_u2d6.getContent());
            }
            final UIComponent $this$constrain_u24lambda_u2d0$iv2;
            final UIComponent $this$constrain$iv2 = $this$constrain_u24lambda_u2d0$iv2 = $this$addLine_u24lambda_u2d6.getContent();
            final UIConstraints $this$addLine_u24lambda_u2d6_u24lambda_u2d4 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
            $this$addLine_u24lambda_u2d6_u24lambda_u2d4.setHeight(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(4)));
        }
        else {
            final UIComponent $this$constrain_u24lambda_u2d0$iv3;
            final UIComponent $this$constrain$iv3 = $this$constrain_u24lambda_u2d0$iv3 = new EssentialUIText(text, false, null, true, false, false, 54).bindShadow($this$addLine_u24lambda_u2d6.textShadowState).bindShadowColor($this$addLine_u24lambda_u2d6.textShadowColorState);
            final UIConstraints $this$addLine_u24lambda_u2d6_u24lambda_u2d5 = $this$constrain_u24lambda_u2d0$iv3.getConstraints();
            $this$addLine_u24lambda_u2d6_u24lambda_u2d5.setY(new SiblingConstraint(3.0f, false, 2, null));
            $this$addLine_u24lambda_u2d6_u24lambda_u2d5.setColor(ExtensionsKt.toConstraint($this$addLine_u24lambda_u2d6.textColorState));
            final UIText component = ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv3, $this$addLine_u24lambda_u2d6.getContent());
            configure.invoke((Object)component);
        }
        return this;
    }
    
    @NotNull
    public final Tooltip bindLine(@NotNull final State<String> state, @Nullable final Float wrapAtWidth, @NotNull final Function1<? super UIText, Unit> configure) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        Intrinsics.checkNotNullParameter((Object)configure, "configure");
        StateExtensionsKt.onSetValueAndNow((State<Object>)state, (kotlin.jvm.functions.Function1<? super Object, Unit>)new Tooltip$bindLine.Tooltip$bindLine$2(this, wrapAtWidth, (Function1)configure));
        return this;
    }
    
    public static /* synthetic */ Tooltip bindLine$default$e129f13(final Tooltip tooltip, final State state, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindLine");
        }
        return tooltip.bindLine(state, null, (Function1<? super UIText, Unit>)Tooltip$bindLine.Tooltip$bindLine$1.INSTANCE);
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
    
    public static /* synthetic */ void showTooltip$default$4168b7ec(final Tooltip tooltip, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTooltip");
        }
        tooltip.showTooltip(true);
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
        for (final Object element$iv : $this$forEach$iv) {
            final Function0 it = (Function0)element$iv;
            it.invoke();
        }
        this.removalListeners.clear();
    }
    
    public static /* synthetic */ void hideTooltip$default$4168b7ec(final Tooltip tooltip, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideTooltip");
        }
        tooltip.hideTooltip(true);
    }
    
    private static final void showTooltip$onRemoved$lambda-7(final UIComponent $this_onRemoved, final Function0 $listener, final Observable observable, final Object event) {
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
        final Observer observer = Tooltip::showTooltip$onRemoved$lambda-7;
        $this$showTooltip_u24onRemoved.getParent().getChildren().addObserver(observer);
        this$0.removalListeners.add((Function0<Unit>)new Tooltip$showTooltip$onRemoved.Tooltip$showTooltip$onRemoved$1($this$showTooltip_u24onRemoved, observer));
        showTooltip$onRemoved($this$showTooltip_u24onRemoved.getParent(), this$0, listener);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Tooltip.class, "content", "getContent()Lgg/essential/elementa/components/UIContainer;", 0)) };
    }
}
