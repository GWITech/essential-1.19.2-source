package gg.essential.vigilance.gui.common;

import gg.essential.elementa.components.*;
import kotlin.reflect.*;
import gg.essential.vigilance.utils.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.elementa.state.*;
import gg.essential.vigilance.gui.common.shadow.*;
import gg.essential.elementa.*;
import java.awt.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.events.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nBY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\u0010\u000eJ\u0014\u0010#\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%J\u0014\u0010'\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\u0014\u0010(\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bJ\u0014\u0010)\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u000bJ\u0014\u0010,\u001a\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\u0014\u0010.\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bR\u001b\u0010\u0004\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/" }, d2 = { "Lgg/essential/vigilance/gui/common/IconButton;", "Lgg/essential/elementa/components/UIBlock;", "imageFactory", "Lgg/essential/vigilance/utils/ImageFactory;", "buttonText", "", "tooltipText", "buttonShadow", "", "textShadow", "(Lgg/essential/vigilance/utils/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZ)V", "Lgg/essential/elementa/state/State;", "enabled", "iconShadow", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "Lgg/essential/elementa/UIComponent;", "getButtonText", "()Lgg/essential/elementa/UIComponent;", "buttonText$delegate", "Lkotlin/properties/ReadWriteProperty;", "buttonTextState", "Lgg/essential/elementa/state/MappedState;", "enabledState", "hovered", "icon", "Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;", "getIcon", "()Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;", "icon$delegate", "iconShadowState", "iconState", "textShadowState", "tooltip", "Lgg/essential/vigilance/gui/common/Tooltip;", "tooltipState", "onActiveClick", "action", "Lkotlin/Function0;", "", "rebindEnabled", "rebindIcon", "rebindIconColor", "color", "Ljava/awt/Color;", "rebindTextShadow", "shadow", "rebindTooltipText", "Vigilance" })
public final class IconButton extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final MappedState<ImageFactory, ImageFactory> iconState;
    @NotNull
    private final MappedState<Boolean, Boolean> iconShadowState;
    @NotNull
    private final MappedState<String, String> tooltipState;
    @NotNull
    private final MappedState<Boolean, Boolean> enabledState;
    @NotNull
    private final MappedState<String, String> buttonTextState;
    @NotNull
    private final MappedState<Boolean, Boolean> textShadowState;
    @NotNull
    private final State<Boolean> hovered;
    @NotNull
    private final ReadWriteProperty icon$delegate;
    @NotNull
    private final Tooltip tooltip;
    @NotNull
    private final ReadWriteProperty buttonText$delegate;
    
    public IconButton(@NotNull final State<ImageFactory> imageFactory, @NotNull final State<String> tooltipText, @NotNull final State<Boolean> enabled, @NotNull final State<String> buttonText, @NotNull final State<Boolean> iconShadow, @NotNull final State<Boolean> textShadow) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "imageFactory"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* tooltipText */
        //     7: ldc             "tooltipText"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* enabled */
        //    13: ldc             "enabled"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload           buttonText
        //    20: ldc             "buttonText"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: aload           iconShadow
        //    27: ldc             "iconShadow"
        //    29: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    32: aload           textShadow
        //    34: ldc             "textShadow"
        //    36: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    39: aload_0         /* this */
        //    40: aconst_null    
        //    41: iconst_1       
        //    42: aconst_null    
        //    43: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    46: aload_0         /* this */
        //    47: aload_1         /* imageFactory */
        //    48: getstatic       gg/essential/vigilance/gui/common/IconButton$iconState$1.INSTANCE:Lgg/essential/vigilance/gui/common/IconButton$iconState$1;
        //    51: checkcast       Lkotlin/jvm/functions/Function1;
        //    54: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    57: putfield        gg/essential/vigilance/gui/common/IconButton.iconState:Lgg/essential/elementa/state/MappedState;
        //    60: aload_0         /* this */
        //    61: aload           iconShadow
        //    63: getstatic       gg/essential/vigilance/gui/common/IconButton$iconShadowState$1.INSTANCE:Lgg/essential/vigilance/gui/common/IconButton$iconShadowState$1;
        //    66: checkcast       Lkotlin/jvm/functions/Function1;
        //    69: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    72: putfield        gg/essential/vigilance/gui/common/IconButton.iconShadowState:Lgg/essential/elementa/state/MappedState;
        //    75: aload_0         /* this */
        //    76: aload_2         /* tooltipText */
        //    77: getstatic       gg/essential/vigilance/gui/common/IconButton$tooltipState$1.INSTANCE:Lgg/essential/vigilance/gui/common/IconButton$tooltipState$1;
        //    80: checkcast       Lkotlin/jvm/functions/Function1;
        //    83: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    86: putfield        gg/essential/vigilance/gui/common/IconButton.tooltipState:Lgg/essential/elementa/state/MappedState;
        //    89: aload_0         /* this */
        //    90: aload_3         /* enabled */
        //    91: getstatic       gg/essential/vigilance/gui/common/IconButton$enabledState$1.INSTANCE:Lgg/essential/vigilance/gui/common/IconButton$enabledState$1;
        //    94: checkcast       Lkotlin/jvm/functions/Function1;
        //    97: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   100: putfield        gg/essential/vigilance/gui/common/IconButton.enabledState:Lgg/essential/elementa/state/MappedState;
        //   103: aload_0         /* this */
        //   104: aload           buttonText
        //   106: getstatic       gg/essential/vigilance/gui/common/IconButton$buttonTextState$1.INSTANCE:Lgg/essential/vigilance/gui/common/IconButton$buttonTextState$1;
        //   109: checkcast       Lkotlin/jvm/functions/Function1;
        //   112: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   115: putfield        gg/essential/vigilance/gui/common/IconButton.buttonTextState:Lgg/essential/elementa/state/MappedState;
        //   118: aload_0         /* this */
        //   119: aload           textShadow
        //   121: getstatic       gg/essential/vigilance/gui/common/IconButton$textShadowState$1.INSTANCE:Lgg/essential/vigilance/gui/common/IconButton$textShadowState$1;
        //   124: checkcast       Lkotlin/jvm/functions/Function1;
        //   127: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   130: putfield        gg/essential/vigilance/gui/common/IconButton.textShadowState:Lgg/essential/elementa/state/MappedState;
        //   133: aload_0         /* this */
        //   134: aload_0         /* this */
        //   135: checkcast       Lgg/essential/elementa/UIComponent;
        //   138: iconst_0       
        //   139: iconst_0       
        //   140: iconst_3       
        //   141: aconst_null    
        //   142: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.hoveredState$default:(Lgg/essential/elementa/UIComponent;ZZILjava/lang/Object;)Lgg/essential/elementa/state/State;
        //   145: putfield        gg/essential/vigilance/gui/common/IconButton.hovered:Lgg/essential/elementa/state/State;
        //   148: aload_0         /* this */
        //   149: new             Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;
        //   152: dup            
        //   153: aload_0         /* this */
        //   154: getfield        gg/essential/vigilance/gui/common/IconButton.iconState:Lgg/essential/elementa/state/MappedState;
        //   157: checkcast       Lgg/essential/elementa/state/State;
        //   160: aload_0         /* this */
        //   161: getfield        gg/essential/vigilance/gui/common/IconButton.iconShadowState:Lgg/essential/elementa/state/MappedState;
        //   164: checkcast       Lgg/essential/elementa/state/State;
        //   167: invokespecial   gg/essential/vigilance/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V
        //   170: checkcast       Lgg/essential/elementa/UIComponent;
        //   173: astore          $this$constrain$iv
        //   175: iconst_0       
        //   176: istore          $i$f$constrain
        //   178: aload           $this$constrain$iv
        //   180: astore          9
        //   182: aload           9
        //   184: astore          $this$constrain_u24lambda_u2d0$iv
        //   186: iconst_0       
        //   187: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   189: aload           $this$constrain_u24lambda_u2d0$iv
        //   191: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   194: astore          12
        //   196: astore          14
        //   198: iconst_0       
        //   199: istore          $i$a$-constrain-IconButton$icon$2
        //   201: aload           $this$icon_delegate_u24lambda_u2d0
        //   203: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   206: dup            
        //   207: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   210: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   213: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   216: nop            
        //   217: aload           14
        //   219: nop            
        //   220: aload           9
        //   222: nop            
        //   223: checkcast       Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;
        //   226: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   229: aload_0         /* this */
        //   230: getfield        gg/essential/vigilance/gui/common/IconButton.hovered:Lgg/essential/elementa/state/State;
        //   233: aload_0         /* this */
        //   234: getfield        gg/essential/vigilance/gui/common/IconButton.enabledState:Lgg/essential/elementa/state/MappedState;
        //   237: checkcast       Lgg/essential/elementa/state/State;
        //   240: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTextColor$Vigilance:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   243: invokevirtual   gg/essential/vigilance/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;
        //   246: checkcast       Lgg/essential/elementa/UIComponent;
        //   249: aload_0         /* this */
        //   250: checkcast       Lgg/essential/elementa/UIComponent;
        //   253: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   256: aload_0         /* this */
        //   257: getstatic       gg/essential/vigilance/gui/common/IconButton.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   260: iconst_0       
        //   261: aaload         
        //   262: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   265: putfield        gg/essential/vigilance/gui/common/IconButton.icon$delegate:Lkotlin/properties/ReadWriteProperty;
        //   268: aload_0         /* this */
        //   269: new             Lgg/essential/vigilance/gui/common/EssentialTooltip;
        //   272: dup            
        //   273: aload_0         /* this */
        //   274: checkcast       Lgg/essential/elementa/UIComponent;
        //   277: iconst_1       
        //   278: iconst_0       
        //   279: iconst_0       
        //   280: bipush          12
        //   282: aconst_null    
        //   283: invokespecial   gg/essential/vigilance/gui/common/EssentialTooltip.<init>:(Lgg/essential/elementa/UIComponent;ZIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   286: checkcast       Lgg/essential/elementa/UIComponent;
        //   289: astore          $this$constrain$iv
        //   291: iconst_0       
        //   292: istore          $i$f$constrain
        //   294: aload           $this$constrain$iv
        //   296: astore          9
        //   298: aload           9
        //   300: astore          $this$constrain_u24lambda_u2d0$iv
        //   302: iconst_0       
        //   303: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   305: aload           $this$constrain_u24lambda_u2d0$iv
        //   307: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   310: astore          12
        //   312: astore          14
        //   314: iconst_0       
        //   315: istore          $i$a$-constrain-IconButton$tooltip$1
        //   317: aload           $this$tooltip_u24lambda_u2d1
        //   319: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   322: dup            
        //   323: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   326: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   329: aload_0         /* this */
        //   330: checkcast       Lgg/essential/elementa/UIComponent;
        //   333: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   336: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   339: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   342: aload           $this$tooltip_u24lambda_u2d1
        //   344: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   347: dup            
        //   348: ldc             5.0
        //   350: iconst_0       
        //   351: iconst_2       
        //   352: aconst_null    
        //   353: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   356: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   359: aload_0         /* this */
        //   360: checkcast       Lgg/essential/elementa/UIComponent;
        //   363: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   366: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   369: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   372: nop            
        //   373: aload           14
        //   375: nop            
        //   376: aload           9
        //   378: nop            
        //   379: checkcast       Lgg/essential/vigilance/gui/common/EssentialTooltip;
        //   382: aload_0         /* this */
        //   383: getfield        gg/essential/vigilance/gui/common/IconButton.hovered:Lgg/essential/elementa/state/State;
        //   386: aload_2         /* tooltipText */
        //   387: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.empty:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   390: checkcast       Lgg/essential/elementa/state/State;
        //   393: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   396: checkcast       Lgg/essential/elementa/state/State;
        //   399: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   402: checkcast       Lgg/essential/elementa/state/State;
        //   405: invokevirtual   gg/essential/vigilance/gui/common/EssentialTooltip.bindVisibility:(Lgg/essential/elementa/state/State;)Lgg/essential/vigilance/gui/common/Tooltip;
        //   408: putfield        gg/essential/vigilance/gui/common/IconButton.tooltip:Lgg/essential/vigilance/gui/common/Tooltip;
        //   411: aload_0         /* this */
        //   412: new             Lgg/essential/elementa/components/UIText;
        //   415: dup            
        //   416: aconst_null    
        //   417: iconst_0       
        //   418: aconst_null    
        //   419: bipush          7
        //   421: aconst_null    
        //   422: invokespecial   gg/essential/elementa/components/UIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   425: aload_0         /* this */
        //   426: getfield        gg/essential/vigilance/gui/common/IconButton.buttonTextState:Lgg/essential/elementa/state/MappedState;
        //   429: checkcast       Lgg/essential/elementa/state/State;
        //   432: invokevirtual   gg/essential/elementa/components/UIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   435: aload_0         /* this */
        //   436: getfield        gg/essential/vigilance/gui/common/IconButton.textShadowState:Lgg/essential/elementa/state/MappedState;
        //   439: checkcast       Lgg/essential/elementa/state/State;
        //   442: invokevirtual   gg/essential/elementa/components/UIText.bindShadow:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   445: new             Lgg/essential/elementa/state/BasicState;
        //   448: dup            
        //   449: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   452: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTextShadow:()Ljava/awt/Color;
        //   455: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   458: checkcast       Lgg/essential/elementa/state/State;
        //   461: invokevirtual   gg/essential/elementa/components/UIText.bindShadowColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   464: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   467: aload_0         /* this */
        //   468: getfield        gg/essential/vigilance/gui/common/IconButton.hovered:Lgg/essential/elementa/state/State;
        //   471: aload_0         /* this */
        //   472: getfield        gg/essential/vigilance/gui/common/IconButton.enabledState:Lgg/essential/elementa/state/MappedState;
        //   475: checkcast       Lgg/essential/elementa/state/State;
        //   478: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTextColor$Vigilance:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   481: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   484: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   487: invokevirtual   gg/essential/elementa/components/UIText.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   490: astore          7
        //   492: nop            
        //   493: iconst_0       
        //   494: istore          $i$f$constrain
        //   496: aload           $this$constrain$iv
        //   498: astore          9
        //   500: aload           9
        //   502: astore          $this$constrain_u24lambda_u2d0$iv
        //   504: iconst_0       
        //   505: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   507: aload           $this$constrain_u24lambda_u2d0$iv
        //   509: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   512: astore          12
        //   514: astore          14
        //   516: iconst_0       
        //   517: istore          $i$a$-constrain-IconButton$buttonText$2
        //   519: aload           $this$buttonText_delegate_u24lambda_u2d2
        //   521: bipush          9
        //   523: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   526: checkcast       Ljava/lang/Number;
        //   529: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   532: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   535: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   538: aload           $this$buttonText_delegate_u24lambda_u2d2
        //   540: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   543: dup            
        //   544: ldc             5.0
        //   546: iconst_0       
        //   547: iconst_2       
        //   548: aconst_null    
        //   549: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   552: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   555: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   558: aload           $this$buttonText_delegate_u24lambda_u2d2
        //   560: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   563: dup            
        //   564: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   567: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   570: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   573: nop            
        //   574: aload           14
        //   576: nop            
        //   577: aload           9
        //   579: nop            
        //   580: aload_0         /* this */
        //   581: checkcast       Lgg/essential/elementa/UIComponent;
        //   584: aload           buttonText
        //   586: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.empty:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   589: checkcast       Lgg/essential/elementa/state/State;
        //   592: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   595: checkcast       Lgg/essential/elementa/state/State;
        //   598: iconst_0       
        //   599: aconst_null    
        //   600: bipush          12
        //   602: aconst_null    
        //   603: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.bindParent$default:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;ILjava/lang/Object;)Lgg/essential/elementa/UIComponent;
        //   606: aload_0         /* this */
        //   607: getstatic       gg/essential/vigilance/gui/common/IconButton.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   610: iconst_1       
        //   611: aaload         
        //   612: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   615: putfield        gg/essential/vigilance/gui/common/IconButton.buttonText$delegate:Lkotlin/properties/ReadWriteProperty;
        //   618: nop            
        //   619: aload_0         /* this */
        //   620: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   623: aload_0         /* this */
        //   624: getfield        gg/essential/vigilance/gui/common/IconButton.hovered:Lgg/essential/elementa/state/State;
        //   627: aload_0         /* this */
        //   628: getfield        gg/essential/vigilance/gui/common/IconButton.enabledState:Lgg/essential/elementa/state/MappedState;
        //   631: checkcast       Lgg/essential/elementa/state/State;
        //   634: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getButtonColor$Vigilance:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   637: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   640: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   643: invokevirtual   gg/essential/vigilance/gui/common/IconButton.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   646: pop            
        //   647: aload_0         /* this */
        //   648: checkcast       Lgg/essential/elementa/UIComponent;
        //   651: astore          $this$constrain$iv
        //   653: iconst_0       
        //   654: istore          $i$f$constrain
        //   656: aload           $this$constrain$iv
        //   658: astore          9
        //   660: aload           9
        //   662: astore          $this$constrain_u24lambda_u2d0$iv
        //   664: iconst_0       
        //   665: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   667: aload           $this$constrain_u24lambda_u2d0$iv
        //   669: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   672: astore          $this$_init__u24lambda_u2d3
        //   674: iconst_0       
        //   675: istore          $i$a$-constrain-IconButton$1
        //   677: aload           $this$_init__u24lambda_u2d3
        //   679: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   682: dup            
        //   683: fconst_0       
        //   684: iconst_1       
        //   685: aconst_null    
        //   686: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   689: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   692: bipush          10
        //   694: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   697: checkcast       Ljava/lang/Number;
        //   700: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   703: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   706: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   709: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   712: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   715: aload           $this$_init__u24lambda_u2d3
        //   717: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   720: dup            
        //   721: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   724: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   727: bipush          10
        //   729: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   732: checkcast       Ljava/lang/Number;
        //   735: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   738: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   741: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   744: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   747: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   750: nop            
        //   751: nop            
        //   752: nop            
        //   753: nop            
        //   754: aload_0         /* this */
        //   755: checkcast       Lgg/essential/elementa/UIComponent;
        //   758: astore          $this$onLeftClick$iv
        //   760: iconst_0       
        //   761: istore          $i$f$onLeftClick
        //   763: aload           $this$onLeftClick$iv
        //   765: new             Lgg/essential/vigilance/gui/common/IconButton$special$$inlined$onLeftClick$1;
        //   768: dup            
        //   769: aload_0         /* this */
        //   770: invokespecial   gg/essential/vigilance/gui/common/IconButton$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/vigilance/gui/common/IconButton;)V
        //   773: checkcast       Lkotlin/jvm/functions/Function2;
        //   776: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   779: nop            
        //   780: pop            
        //   781: aload_0         /* this */
        //   782: getfield        gg/essential/vigilance/gui/common/IconButton.buttonTextState:Lgg/essential/elementa/state/MappedState;
        //   785: checkcast       Lgg/essential/elementa/state/State;
        //   788: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.empty:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   791: checkcast       Lgg/essential/elementa/state/State;
        //   794: new             Lgg/essential/vigilance/gui/common/IconButton$3;
        //   797: dup            
        //   798: aload_0         /* this */
        //   799: invokespecial   gg/essential/vigilance/gui/common/IconButton$3.<init>:(Lgg/essential/vigilance/gui/common/IconButton;)V
        //   802: checkcast       Lkotlin/jvm/functions/Function1;
        //   805: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.onSetValueAndNow:(Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   808: pop            
        //   809: aload_0         /* this */
        //   810: getfield        gg/essential/vigilance/gui/common/IconButton.tooltip:Lgg/essential/vigilance/gui/common/Tooltip;
        //   813: aload_0         /* this */
        //   814: getfield        gg/essential/vigilance/gui/common/IconButton.tooltipState:Lgg/essential/elementa/state/MappedState;
        //   817: checkcast       Lgg/essential/elementa/state/State;
        //   820: aconst_null    
        //   821: iconst_2       
        //   822: aconst_null    
        //   823: invokestatic    gg/essential/vigilance/gui/common/Tooltip.bindLine$default:(Lgg/essential/vigilance/gui/common/Tooltip;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lgg/essential/vigilance/gui/common/Tooltip;
        //   826: pop            
        //   827: nop            
        //   828: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/State<Lgg/essential/vigilance/utils/ImageFactory;>;Lgg/essential/elementa/state/State<Ljava/lang/String;>;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;Lgg/essential/elementa/state/State<Ljava/lang/String;>;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;)V
        //    MethodParameters:
        //  Name          Flags  
        //  ------------  -----
        //  imageFactory  
        //  tooltipText   
        //  enabled       
        //  buttonText    
        //  iconShadow    
        //  textShadow    
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public IconButton(@NotNull final ImageFactory imageFactory, @NotNull final String buttonText, @NotNull final String tooltipText, final boolean buttonShadow, final boolean textShadow) {
        Intrinsics.checkNotNullParameter((Object)imageFactory, "imageFactory");
        Intrinsics.checkNotNullParameter((Object)buttonText, "buttonText");
        Intrinsics.checkNotNullParameter((Object)tooltipText, "tooltipText");
        this(new BasicState<ImageFactory>(imageFactory), new BasicState<String>(tooltipText), new BasicState<Boolean>(true), new BasicState<String>(buttonText), new BasicState<Boolean>(buttonShadow), new BasicState<Boolean>(textShadow));
    }
    
    public IconButton(final ImageFactory imageFactory, String buttonText, String tooltipText, boolean buttonShadow, boolean textShadow, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            buttonText = "";
        }
        if ((n & 0x4) != 0x0) {
            tooltipText = "";
        }
        if ((n & 0x8) != 0x0) {
            buttonShadow = true;
        }
        if ((n & 0x10) != 0x0) {
            textShadow = true;
        }
        this(imageFactory, buttonText, tooltipText, buttonShadow, textShadow);
    }
    
    private final ShadowIcon getIcon() {
        return (ShadowIcon)this.icon$delegate.getValue((Object)this, (KProperty)IconButton.$$delegatedProperties[0]);
    }
    
    private final UIComponent getButtonText() {
        return (UIComponent)this.buttonText$delegate.getValue((Object)this, (KProperty)IconButton.$$delegatedProperties[1]);
    }
    
    @NotNull
    public final IconButton rebindIcon(@NotNull final State<ImageFactory> imageFactory) {
        Intrinsics.checkNotNullParameter((Object)imageFactory, "imageFactory");
        this.iconState.rebind(imageFactory);
        return this;
    }
    
    @NotNull
    public final IconButton rebindTooltipText(@NotNull final State<String> tooltipText) {
        Intrinsics.checkNotNullParameter((Object)tooltipText, "tooltipText");
        this.tooltipState.rebind(tooltipText);
        return this;
    }
    
    @NotNull
    public final IconButton rebindEnabled(@NotNull final State<Boolean> enabled) {
        Intrinsics.checkNotNullParameter((Object)enabled, "enabled");
        this.enabledState.rebind(enabled);
        return this;
    }
    
    @NotNull
    public final IconButton rebindTextShadow(@NotNull final State<Boolean> shadow) {
        Intrinsics.checkNotNullParameter((Object)shadow, "shadow");
        this.textShadowState.rebind(shadow);
        return this;
    }
    
    @NotNull
    public final IconButton rebindIconColor(@NotNull final State<Color> color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this.getIcon().rebindPrimaryColor(color);
        return this;
    }
    
    @NotNull
    public final IconButton onActiveClick(@NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter((Object)action, "action");
        final UIComponent $this$onLeftClick$iv = this;
        final int $i$f$onLeftClick = 0;
        $this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>(this, action) {
            final /* synthetic */ IconButton this$0;
            final /* synthetic */ Function0 $action$inlined;
            
            public IconButton$onActiveClick$$inlined$onLeftClick$1(final IconButton this$0, final Function0 $action$inlined) {
                this.this$0 = this$0;
                this.$action$inlined = $action$inlined;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                if (it.getMouseButton() == 0) {
                    final UIComponent $this$onActiveClick_u24lambda_u2d5 = $this$onMouseClick;
                    final int n = 0;
                    if (IconButton.access$getEnabledState$p(this.this$0).get()) {
                        this.$action$inlined.invoke();
                    }
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        });
        return this;
    }
    
    public static final /* synthetic */ MappedState access$getEnabledState$p(final IconButton $this) {
        return $this.enabledState;
    }
    
    public static final /* synthetic */ ShadowIcon access$getIcon(final IconButton $this) {
        return $this.getIcon();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)IconButton.class, "icon", "getIcon()Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)IconButton.class, "buttonText", "getButtonText()Lgg/essential/elementa/UIComponent;", 0)) };
    }
}
