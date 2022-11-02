package gg.essential.gui.common;

import kotlin.reflect.*;
import gg.essential.gui.image.*;
import java.awt.*;
import gg.essential.elementa.state.*;
import kotlin.properties.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.elementa.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.events.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000|
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\r
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002CDBA\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010	\u001a\u00020\b\u0012\b\b\u0002\u0010
                                                   \u001a\u00020\b¢\u0006\u0002\u0010\u000bB\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\u0010\rBa\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\f\u0010	\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0006\u0010
                                                   \u001a\u00020\b¢\u0006\u0002\u0010\u0010J\u0014\u00101\u001a\u00020\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020403J\u0014\u00105\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u0014\u00106\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\fJ\u0014\u00107\u001a\u00020\u00002\f\u00108\u001a\b\u0012\u0004\u0012\u00020,0\fJ\u0014\u00109\u001a\u00020\u00002\f\u00108\u001a\b\u0012\u0004\u0012\u00020,0\fJ\u0014\u0010:\u001a\u00020\u00002\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u0014\u0010<\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020*J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020BR\u001b\u0010\u0004\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0017X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0017X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010!\u001a\u00020"8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b%\u0010\u0015\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0017X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0017X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,0\u0017X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0017X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0017X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006E""" }, d2 = { "Lgg/essential/gui/common/IconButton;", "Lgg/essential/elementa/components/UIBlock;", "imageFactory", "Lgg/essential/gui/image/ImageFactory;", "buttonText", "", "tooltipText", "buttonShadow", "", "textShadow", "tooltipBelowComponent", "(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/gui/image/ImageFactory;Lgg/essential/elementa/state/State;)V", "enabled", "iconShadow", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Z)V", "Lgg/essential/elementa/UIComponent;", "getButtonText", "()Lgg/essential/elementa/UIComponent;", "buttonText$delegate", "Lkotlin/properties/ReadWriteProperty;", "buttonTextState", "Lgg/essential/elementa/state/MappedState;", "content", "Lgg/essential/elementa/components/UIContainer;", "getContent", "()Lgg/essential/elementa/components/UIContainer;", "content$delegate", "dimension", "Lgg/essential/gui/common/IconButton$Dimension;", "enabledState", "hovered", "icon", "Lgg/essential/gui/common/shadow/ShadowIcon;", "getIcon", "()Lgg/essential/gui/common/shadow/ShadowIcon;", "icon$delegate", "iconShadowState", "iconState", "layoutState", "Lgg/essential/elementa/state/BasicState;", "Lgg/essential/gui/common/IconButton$Layout;", "textColor", "Ljava/awt/Color;", "textShadowState", "tooltip", "Lgg/essential/gui/common/Tooltip;", "tooltipState", "onActiveClick", "action", "Lkotlin/Function0;", "", "rebindEnabled", "rebindIcon", "rebindIconColor", "color", "rebindTextColor", "rebindTextShadow", "shadow", "rebindTooltipText", "setDimension", "setLayout", "layout", "setTooltipPadding", "padding", "", "Dimension", "Layout", "essential" })
public final class IconButton extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final State<Boolean> hovered;
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
    private final MappedState<Color, Color> textColor;
    @NotNull
    private final BasicState<Layout> layoutState;
    @NotNull
    private final State<Dimension> dimension;
    @NotNull
    private final ReadWriteProperty content$delegate;
    @NotNull
    private final ReadWriteProperty icon$delegate;
    @NotNull
    private final Tooltip tooltip;
    @NotNull
    private final ReadWriteProperty buttonText$delegate;
    
    public IconButton(@NotNull final State<ImageFactory> imageFactory, @NotNull final State<String> tooltipText, @NotNull final State<Boolean> enabled, @NotNull final State<String> buttonText, @NotNull final State<Boolean> iconShadow, @NotNull final State<Boolean> textShadow, final boolean tooltipBelowComponent) {
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
        //    47: aload_0         /* this */
        //    48: checkcast       Lgg/essential/elementa/UIComponent;
        //    51: iconst_0       
        //    52: iconst_0       
        //    53: iconst_3       
        //    54: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //    57: putfield        gg/essential/gui/common/IconButton.hovered:Lgg/essential/elementa/state/State;
        //    60: aload_0         /* this */
        //    61: aload_1         /* imageFactory */
        //    62: getstatic       gg/essential/gui/common/IconButton$iconState$1.INSTANCE:Lgg/essential/gui/common/IconButton$iconState$1;
        //    65: checkcast       Lkotlin/jvm/functions/Function1;
        //    68: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    71: putfield        gg/essential/gui/common/IconButton.iconState:Lgg/essential/elementa/state/MappedState;
        //    74: aload_0         /* this */
        //    75: aload           iconShadow
        //    77: getstatic       gg/essential/gui/common/IconButton$iconShadowState$1.INSTANCE:Lgg/essential/gui/common/IconButton$iconShadowState$1;
        //    80: checkcast       Lkotlin/jvm/functions/Function1;
        //    83: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    86: putfield        gg/essential/gui/common/IconButton.iconShadowState:Lgg/essential/elementa/state/MappedState;
        //    89: aload_0         /* this */
        //    90: aload_2         /* tooltipText */
        //    91: getstatic       gg/essential/gui/common/IconButton$tooltipState$1.INSTANCE:Lgg/essential/gui/common/IconButton$tooltipState$1;
        //    94: checkcast       Lkotlin/jvm/functions/Function1;
        //    97: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   100: putfield        gg/essential/gui/common/IconButton.tooltipState:Lgg/essential/elementa/state/MappedState;
        //   103: aload_0         /* this */
        //   104: aload_3         /* enabled */
        //   105: getstatic       gg/essential/gui/common/IconButton$enabledState$1.INSTANCE:Lgg/essential/gui/common/IconButton$enabledState$1;
        //   108: checkcast       Lkotlin/jvm/functions/Function1;
        //   111: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   114: putfield        gg/essential/gui/common/IconButton.enabledState:Lgg/essential/elementa/state/MappedState;
        //   117: aload_0         /* this */
        //   118: aload           buttonText
        //   120: getstatic       gg/essential/gui/common/IconButton$buttonTextState$1.INSTANCE:Lgg/essential/gui/common/IconButton$buttonTextState$1;
        //   123: checkcast       Lkotlin/jvm/functions/Function1;
        //   126: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   129: putfield        gg/essential/gui/common/IconButton.buttonTextState:Lgg/essential/elementa/state/MappedState;
        //   132: aload_0         /* this */
        //   133: aload           textShadow
        //   135: getstatic       gg/essential/gui/common/IconButton$textShadowState$1.INSTANCE:Lgg/essential/gui/common/IconButton$textShadowState$1;
        //   138: checkcast       Lkotlin/jvm/functions/Function1;
        //   141: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   144: putfield        gg/essential/gui/common/IconButton.textShadowState:Lgg/essential/elementa/state/MappedState;
        //   147: aload_0         /* this */
        //   148: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   151: aload_0         /* this */
        //   152: getfield        gg/essential/gui/common/IconButton.hovered:Lgg/essential/elementa/state/State;
        //   155: aload_0         /* this */
        //   156: getfield        gg/essential/gui/common/IconButton.enabledState:Lgg/essential/elementa/state/MappedState;
        //   159: checkcast       Lgg/essential/elementa/state/State;
        //   162: invokevirtual   gg/essential/gui/EssentialPalette.getTextColor:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   165: getstatic       gg/essential/gui/common/IconButton$textColor$1.INSTANCE:Lgg/essential/gui/common/IconButton$textColor$1;
        //   168: checkcast       Lkotlin/jvm/functions/Function1;
        //   171: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   174: putfield        gg/essential/gui/common/IconButton.textColor:Lgg/essential/elementa/state/MappedState;
        //   177: aload_0         /* this */
        //   178: new             Lgg/essential/elementa/state/BasicState;
        //   181: dup            
        //   182: getstatic       gg/essential/gui/common/IconButton$Layout.ICON_FIRST:Lgg/essential/gui/common/IconButton$Layout;
        //   185: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   188: putfield        gg/essential/gui/common/IconButton.layoutState:Lgg/essential/elementa/state/BasicState;
        //   191: aload_0         /* this */
        //   192: new             Lgg/essential/elementa/state/BasicState;
        //   195: dup            
        //   196: new             Lgg/essential/gui/common/IconButton$Dimension$FitWithPadding;
        //   199: dup            
        //   200: invokespecial   gg/essential/gui/common/IconButton$Dimension$FitWithPadding.<init>:()V
        //   203: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   206: checkcast       Lgg/essential/elementa/state/State;
        //   209: putfield        gg/essential/gui/common/IconButton.dimension:Lgg/essential/elementa/state/State;
        //   212: aload_0         /* this */
        //   213: new             Lgg/essential/elementa/components/UIContainer;
        //   216: dup            
        //   217: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   220: checkcast       Lgg/essential/elementa/UIComponent;
        //   223: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   226: astore          $this$constrain$iv
        //   228: aload           $this$constrain$iv
        //   230: astore          9
        //   232: aload           9
        //   234: astore          $this$constrain_u24lambda_u2d0$iv
        //   236: aload           $this$constrain_u24lambda_u2d0$iv
        //   238: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   241: astore          11
        //   243: astore          12
        //   245: aload           $this$content_delegate_u24lambda_u2d0
        //   247: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   250: dup            
        //   251: fconst_0       
        //   252: iconst_1       
        //   253: aconst_null    
        //   254: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   257: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   260: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   263: aload           $this$content_delegate_u24lambda_u2d0
        //   265: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   268: dup            
        //   269: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   272: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   275: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   278: aload           12
        //   280: aload           9
        //   282: aload_0         /* this */
        //   283: checkcast       Lgg/essential/elementa/UIComponent;
        //   286: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   289: aload_0         /* this */
        //   290: getstatic       gg/essential/gui/common/IconButton.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   293: iconst_0       
        //   294: aaload         
        //   295: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   298: putfield        gg/essential/gui/common/IconButton.content$delegate:Lkotlin/properties/ReadWriteProperty;
        //   301: aload_0         /* this */
        //   302: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //   305: dup            
        //   306: aload_0         /* this */
        //   307: getfield        gg/essential/gui/common/IconButton.iconState:Lgg/essential/elementa/state/MappedState;
        //   310: checkcast       Lgg/essential/elementa/state/State;
        //   313: aload_0         /* this */
        //   314: getfield        gg/essential/gui/common/IconButton.iconShadowState:Lgg/essential/elementa/state/MappedState;
        //   317: checkcast       Lgg/essential/elementa/state/State;
        //   320: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V
        //   323: checkcast       Lgg/essential/elementa/UIComponent;
        //   326: astore          $this$constrain$iv
        //   328: aload           $this$constrain$iv
        //   330: astore          9
        //   332: aload           9
        //   334: astore          $this$constrain_u24lambda_u2d0$iv
        //   336: aload           $this$constrain_u24lambda_u2d0$iv
        //   338: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   341: astore          11
        //   343: astore          12
        //   345: aload           $this$icon_delegate_u24lambda_u2d1
        //   347: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   350: dup            
        //   351: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   354: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   357: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   360: aload           12
        //   362: aload           9
        //   364: checkcast       Lgg/essential/gui/common/shadow/ShadowIcon;
        //   367: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   370: aload_0         /* this */
        //   371: getfield        gg/essential/gui/common/IconButton.hovered:Lgg/essential/elementa/state/State;
        //   374: aload_0         /* this */
        //   375: getfield        gg/essential/gui/common/IconButton.enabledState:Lgg/essential/elementa/state/MappedState;
        //   378: checkcast       Lgg/essential/elementa/state/State;
        //   381: invokevirtual   gg/essential/gui/EssentialPalette.getTextColor:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   384: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
        //   387: checkcast       Lgg/essential/elementa/UIComponent;
        //   390: aload_0         /* this */
        //   391: invokespecial   gg/essential/gui/common/IconButton.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   394: checkcast       Lgg/essential/elementa/UIComponent;
        //   397: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   400: aload_0         /* this */
        //   401: getstatic       gg/essential/gui/common/IconButton.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   404: iconst_1       
        //   405: aaload         
        //   406: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   409: putfield        gg/essential/gui/common/IconButton.icon$delegate:Lkotlin/properties/ReadWriteProperty;
        //   412: aload_0         /* this */
        //   413: new             Lgg/essential/gui/common/EssentialTooltip;
        //   416: dup            
        //   417: aload_0         /* this */
        //   418: checkcast       Lgg/essential/elementa/UIComponent;
        //   421: iload           tooltipBelowComponent
        //   423: ifeq            432
        //   426: getstatic       gg/essential/gui/common/EssentialTooltip$Position.BELOW:Lgg/essential/gui/common/EssentialTooltip$Position;
        //   429: goto            435
        //   432: getstatic       gg/essential/gui/common/EssentialTooltip$Position.ABOVE:Lgg/essential/gui/common/EssentialTooltip$Position;
        //   435: iconst_0       
        //   436: iconst_0       
        //   437: bipush          12
        //   439: invokespecial   gg/essential/gui/common/EssentialTooltip.<init>:(Lgg/essential/elementa/UIComponent;Lgg/essential/gui/common/EssentialTooltip$Position;IZI)V
        //   442: checkcast       Lgg/essential/elementa/UIComponent;
        //   445: astore          $this$constrain$iv
        //   447: aload           $this$constrain$iv
        //   449: astore          9
        //   451: aload           9
        //   453: astore          $this$constrain_u24lambda_u2d0$iv
        //   455: aload           $this$constrain_u24lambda_u2d0$iv
        //   457: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   460: astore          11
        //   462: astore          12
        //   464: aload           $this$tooltip_u24lambda_u2d2
        //   466: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   469: dup            
        //   470: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   473: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   476: aload_0         /* this */
        //   477: checkcast       Lgg/essential/elementa/UIComponent;
        //   480: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   483: iconst_4       
        //   484: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   487: checkcast       Ljava/lang/Number;
        //   490: iconst_1       
        //   491: iconst_0       
        //   492: iconst_2       
        //   493: aconst_null    
        //   494: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   497: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   500: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtMost:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtMostConstraint;
        //   503: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   506: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   509: aload           $this$tooltip_u24lambda_u2d2
        //   511: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   514: dup            
        //   515: ldc_w           5.0
        //   518: iload           tooltipBelowComponent
        //   520: ifne            527
        //   523: iconst_1       
        //   524: goto            528
        //   527: iconst_0       
        //   528: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   531: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   534: aload_0         /* this */
        //   535: checkcast       Lgg/essential/elementa/UIComponent;
        //   538: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   541: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   544: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   547: aload           12
        //   549: aload           9
        //   551: checkcast       Lgg/essential/gui/common/EssentialTooltip;
        //   554: aload_0         /* this */
        //   555: getfield        gg/essential/gui/common/IconButton.hovered:Lgg/essential/elementa/state/State;
        //   558: aload_0         /* this */
        //   559: getfield        gg/essential/gui/common/IconButton.tooltipState:Lgg/essential/elementa/state/MappedState;
        //   562: checkcast       Lgg/essential/elementa/state/State;
        //   565: invokestatic    gg/essential/gui/common/StateExtensionsKt.empty:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   568: checkcast       Lgg/essential/elementa/state/State;
        //   571: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   574: checkcast       Lgg/essential/elementa/state/State;
        //   577: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   580: checkcast       Lgg/essential/elementa/state/State;
        //   583: invokevirtual   gg/essential/gui/common/EssentialTooltip.bindVisibility:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/Tooltip;
        //   586: putfield        gg/essential/gui/common/IconButton.tooltip:Lgg/essential/gui/common/Tooltip;
        //   589: aload_0         /* this */
        //   590: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   593: dup            
        //   594: aconst_null    
        //   595: iconst_0       
        //   596: aconst_null    
        //   597: iconst_0       
        //   598: iconst_0       
        //   599: iconst_0       
        //   600: bipush          55
        //   602: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   605: aload_0         /* this */
        //   606: getfield        gg/essential/gui/common/IconButton.buttonTextState:Lgg/essential/elementa/state/MappedState;
        //   609: checkcast       Lgg/essential/elementa/state/State;
        //   612: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   615: aload_0         /* this */
        //   616: getfield        gg/essential/gui/common/IconButton.textShadowState:Lgg/essential/elementa/state/MappedState;
        //   619: checkcast       Lgg/essential/elementa/state/State;
        //   622: invokevirtual   gg/essential/elementa/components/UIText.bindShadow:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   625: new             Lgg/essential/elementa/state/BasicState;
        //   628: dup            
        //   629: getstatic       gg/essential/gui/EssentialPalette.TEXT_SHADOW:Ljava/awt/Color;
        //   632: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   635: checkcast       Lgg/essential/elementa/state/State;
        //   638: invokevirtual   gg/essential/elementa/components/UIText.bindShadowColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   641: aload_0         /* this */
        //   642: getfield        gg/essential/gui/common/IconButton.textColor:Lgg/essential/elementa/state/MappedState;
        //   645: checkcast       Lgg/essential/elementa/state/State;
        //   648: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   651: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   654: invokevirtual   gg/essential/elementa/components/UIText.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   657: aload_0         /* this */
        //   658: getfield        gg/essential/gui/common/IconButton.layoutState:Lgg/essential/elementa/state/BasicState;
        //   661: checkcast       Lgg/essential/elementa/state/State;
        //   664: getstatic       gg/essential/gui/common/IconButton$buttonText$2.INSTANCE:Lgg/essential/gui/common/IconButton$buttonText$2;
        //   667: checkcast       Lkotlin/jvm/functions/Function2;
        //   670: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   673: aload_0         /* this */
        //   674: invokespecial   gg/essential/gui/common/IconButton.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   677: checkcast       Lgg/essential/elementa/UIComponent;
        //   680: aload           buttonText
        //   682: invokestatic    gg/essential/gui/common/StateExtensionsKt.empty:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   685: checkcast       Lgg/essential/elementa/state/State;
        //   688: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   691: checkcast       Lgg/essential/elementa/state/State;
        //   694: iconst_0       
        //   695: aconst_null    
        //   696: bipush          12
        //   698: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   701: aload_0         /* this */
        //   702: getstatic       gg/essential/gui/common/IconButton.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   705: iconst_2       
        //   706: aaload         
        //   707: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   710: putfield        gg/essential/gui/common/IconButton.buttonText$delegate:Lkotlin/properties/ReadWriteProperty;
        //   713: aload_0         /* this */
        //   714: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   717: aload_0         /* this */
        //   718: getfield        gg/essential/gui/common/IconButton.hovered:Lgg/essential/elementa/state/State;
        //   721: aload_0         /* this */
        //   722: getfield        gg/essential/gui/common/IconButton.enabledState:Lgg/essential/elementa/state/MappedState;
        //   725: checkcast       Lgg/essential/elementa/state/State;
        //   728: invokevirtual   gg/essential/gui/EssentialPalette.getButtonColor:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   731: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   734: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   737: invokevirtual   gg/essential/gui/common/IconButton.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   740: pop            
        //   741: aload_0         /* this */
        //   742: checkcast       Lgg/essential/elementa/UIComponent;
        //   745: aload_0         /* this */
        //   746: getfield        gg/essential/gui/common/IconButton.dimension:Lgg/essential/elementa/state/State;
        //   749: getstatic       gg/essential/gui/common/IconButton$1.INSTANCE:Lgg/essential/gui/common/IconButton$1;
        //   752: checkcast       Lkotlin/jvm/functions/Function2;
        //   755: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   758: pop            
        //   759: aload_0         /* this */
        //   760: checkcast       Lgg/essential/elementa/UIComponent;
        //   763: astore          $this$onLeftClick$iv
        //   765: aload           $this$onLeftClick$iv
        //   767: new             Lgg/essential/gui/common/IconButton$special$$inlined$onLeftClick$1;
        //   770: dup            
        //   771: aload_0         /* this */
        //   772: invokespecial   gg/essential/gui/common/IconButton$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/common/IconButton;)V
        //   775: checkcast       Lkotlin/jvm/functions/Function2;
        //   778: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   781: pop            
        //   782: aload_0         /* this */
        //   783: getfield        gg/essential/gui/common/IconButton.layoutState:Lgg/essential/elementa/state/BasicState;
        //   786: aload_0         /* this */
        //   787: getfield        gg/essential/gui/common/IconButton.buttonTextState:Lgg/essential/elementa/state/MappedState;
        //   790: checkcast       Lgg/essential/elementa/state/State;
        //   793: invokestatic    gg/essential/gui/common/StateExtensionsKt.empty:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   796: checkcast       Lgg/essential/elementa/state/State;
        //   799: invokevirtual   gg/essential/elementa/state/BasicState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   802: new             Lgg/essential/gui/common/IconButton$3;
        //   805: dup            
        //   806: aload_0         /* this */
        //   807: invokespecial   gg/essential/gui/common/IconButton$3.<init>:(Lgg/essential/gui/common/IconButton;)V
        //   810: checkcast       Lkotlin/jvm/functions/Function1;
        //   813: invokestatic    gg/essential/gui/common/StateExtensionsKt.onSetValueAndNow:(Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   816: pop            
        //   817: aload_0         /* this */
        //   818: getfield        gg/essential/gui/common/IconButton.tooltip:Lgg/essential/gui/common/Tooltip;
        //   821: aload_0         /* this */
        //   822: getfield        gg/essential/gui/common/IconButton.tooltipState:Lgg/essential/elementa/state/MappedState;
        //   825: checkcast       Lgg/essential/elementa/state/State;
        //   828: aconst_null    
        //   829: invokestatic    gg/essential/gui/common/Tooltip.bindLine$default$e129f13:(Lgg/essential/gui/common/Tooltip;Lgg/essential/elementa/state/State;Ljava/lang/Object;)Lgg/essential/gui/common/Tooltip;
        //   832: pop            
        //   833: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/State<Lgg/essential/gui/image/ImageFactory;>;Lgg/essential/elementa/state/State<Ljava/lang/String;>;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;Lgg/essential/elementa/state/State<Ljava/lang/String;>;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;Z)V
        //    MethodParameters:
        //  Name                   Flags  
        //  ---------------------  -----
        //  imageFactory           
        //  tooltipText            
        //  enabled                
        //  buttonText             
        //  iconShadow             
        //  textShadow             
        //  tooltipBelowComponent  
        //    StackMapTable: 00 04 FF 01 B0 00 08 07 00 02 00 00 00 07 00 99 00 00 01 00 04 07 00 02 08 01 9D 08 01 9D 07 00 89 FF 00 02 00 08 07 00 02 00 00 00 07 00 99 00 00 01 00 05 07 00 02 08 01 9D 08 01 9D 07 00 89 07 01 20 FF 00 5B 00 0D 07 00 02 00 00 00 07 00 99 00 00 00 00 07 00 89 00 00 07 00 02 00 04 07 00 EB 08 01 FF 08 01 FF 02 FF 00 00 00 0D 07 00 02 00 00 00 07 00 99 00 00 00 00 07 00 89 00 00 07 00 02 00 05 07 00 EB 08 01 FF 08 01 FF 02 01
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public IconButton(@NotNull final ImageFactory imageFactory, @NotNull final String buttonText, @NotNull final String tooltipText, final boolean buttonShadow, final boolean textShadow, final boolean tooltipBelowComponent) {
        Intrinsics.checkNotNullParameter((Object)imageFactory, "imageFactory");
        Intrinsics.checkNotNullParameter((Object)buttonText, "buttonText");
        Intrinsics.checkNotNullParameter((Object)tooltipText, "tooltipText");
        this(new BasicState<ImageFactory>(imageFactory), new BasicState<String>(tooltipText), new BasicState<Boolean>(true), new BasicState<String>(buttonText), new BasicState<Boolean>(buttonShadow), new BasicState<Boolean>(textShadow), tooltipBelowComponent);
    }
    
    public IconButton(final ImageFactory imageFactory, String buttonText, String tooltipText, boolean buttonShadow, boolean textShadow, boolean tooltipBelowComponent, final int n) {
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
        if ((n & 0x20) != 0x0) {
            tooltipBelowComponent = true;
        }
        this(imageFactory, buttonText, tooltipText, buttonShadow, textShadow, tooltipBelowComponent);
    }
    
    public IconButton(@NotNull final ImageFactory imageFactory, @NotNull final State<String> buttonText) {
        Intrinsics.checkNotNullParameter((Object)imageFactory, "imageFactory");
        Intrinsics.checkNotNullParameter((Object)buttonText, "buttonText");
        this(new BasicState<ImageFactory>(imageFactory), new BasicState<String>(""), new BasicState<Boolean>(true), buttonText, new BasicState<Boolean>(true), new BasicState<Boolean>(true), true);
    }
    
    private final UIContainer getContent() {
        return (UIContainer)this.content$delegate.getValue((Object)this, (KProperty)IconButton.$$delegatedProperties[0]);
    }
    
    private final ShadowIcon getIcon() {
        return (ShadowIcon)this.icon$delegate.getValue((Object)this, (KProperty)IconButton.$$delegatedProperties[1]);
    }
    
    private final UIComponent getButtonText() {
        return (UIComponent)this.buttonText$delegate.getValue((Object)this, (KProperty)IconButton.$$delegatedProperties[2]);
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
    public final IconButton rebindIconColor(@NotNull final State<Color> color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this.getIcon().rebindPrimaryColor(color);
        return this;
    }
    
    @NotNull
    public final IconButton rebindTextColor(@NotNull final State<Color> color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this.textColor.rebind(color);
        return this;
    }
    
    @NotNull
    public final IconButton setLayout(@NotNull final Layout layout) {
        Intrinsics.checkNotNullParameter((Object)layout, "layout");
        this.layoutState.set(layout);
        return this;
    }
    
    @NotNull
    public final IconButton setDimension(@NotNull final Dimension dimension) {
        Intrinsics.checkNotNullParameter((Object)dimension, "dimension");
        this.dimension.set(dimension);
        return this;
    }
    
    @NotNull
    public final IconButton onActiveClick(@NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter((Object)action, "action");
        final UIComponent $this$onLeftClick$iv = this;
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
                if (it.getMouseButton() == 0 && (boolean)IconButton.access$getEnabledState$p(this.this$0).get()) {
                    this.$action$inlined.invoke();
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
    
    public static final /* synthetic */ UIComponent access$getButtonText(final IconButton $this) {
        return $this.getButtonText();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)IconButton.class, "content", "getContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)IconButton.class, "icon", "getIcon()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)IconButton.class, "buttonText", "getButtonText()Lgg/essential/elementa/UIComponent;", 0)) };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0016
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/common/IconButton$Dimension;", "", "()V", "FitWithPadding", "Fixed", "Lgg/essential/gui/common/IconButton$Dimension$FitWithPadding;", "Lgg/essential/gui/common/IconButton$Dimension$Fixed;", "essential" })
    public abstract static class Dimension
    {
        private Dimension() {
            super();
        }
        
        public Dimension(final byte b) {
            this();
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000*
                                                           \u0002\u0018\u0002
                                                           \u0002\u0018\u0002
                                                           \u0000
                                                           \u0002\u0010\u0007
                                                           \u0002\b\u0006
                                                           \u0002\u0010\u000b
                                                           \u0000
                                                           \u0002\u0010\u0000
                                                           \u0000
                                                           \u0002\u0010\b
                                                           \u0000
                                                           \u0002\u0010\u000e
                                                           \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010	\u001a\u00020
                                                           2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J	\u0010\r\u001a\u00020\u000eH\u00d6\u0001J	\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                           \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011""" }, d2 = { "Lgg/essential/gui/common/IconButton$Dimension$FitWithPadding;", "Lgg/essential/gui/common/IconButton$Dimension;", "padding", "", "(F)V", "getPadding", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "essential" })
        public static final class FitWithPadding extends Dimension
        {
            public FitWithPadding() {
                super((byte)0);
            }
            
            @NotNull
            @Override
            public String toString() {
                return "FitWithPadding(padding=" + 10.0f;
            }
            
            @Override
            public int hashCode() {
                return Float.hashCode(10.0f);
            }
            
            @Override
            public boolean equals(@Nullable final Object other) {
                return this == other || (other instanceof FitWithPadding && Intrinsics.areEqual((Object)10.0f, (Object)10.0f));
            }
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000*
                                                           \u0002\u0018\u0002
                                                           \u0002\u0018\u0002
                                                           \u0000
                                                           \u0002\u0010\u0007
                                                           \u0002\b	
                                                           \u0002\u0010\u000b
                                                           \u0000
                                                           \u0002\u0010\u0000
                                                           \u0000
                                                           \u0002\u0010\b
                                                           \u0000
                                                           \u0002\u0010\u000e
                                                           \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J	\u0010	\u001a\u00020\u0003H\u00c6\u0003J	\u0010
                                                           \u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J	\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J	\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                           \u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                           \u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014""" }, d2 = { "Lgg/essential/gui/common/IconButton$Dimension$Fixed;", "Lgg/essential/gui/common/IconButton$Dimension;", "width", "", "height", "(FF)V", "getHeight", "()F", "getWidth", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "essential" })
        public static final class Fixed extends Dimension
        {
            private final float width;
            private final float height;
            
            public Fixed(final float width, final float height) {
                super((byte)0);
                this.width = width;
                this.height = 17.0f;
            }
            
            public final float getWidth() {
                return this.width;
            }
            
            public final float getHeight() {
                return this.height;
            }
            
            @NotNull
            @Override
            public String toString() {
                return "Fixed(width=" + this.width + ", height=" + this.height;
            }
            
            @Override
            public int hashCode() {
                int result = Float.hashCode(this.width);
                result = result * 31 + Float.hashCode(this.height);
                return result;
            }
            
            @Override
            public boolean equals(@Nullable final Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Fixed)) {
                    return false;
                }
                final Fixed fixed = (Fixed)other;
                return Intrinsics.areEqual((Object)this.width, (Object)fixed.width) && Intrinsics.areEqual((Object)this.height, (Object)fixed.height);
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0010
                                                       \u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/gui/common/IconButton$Layout;", "", "(Ljava/lang/String;I)V", "ICON_FIRST", "TEXT_FIRST", "essential" })
    public enum Layout
    {
        ICON_FIRST("ICON_FIRST", 0), 
        TEXT_FIRST("TEXT_FIRST", 1);
        
        private static final /* synthetic */ Layout[] $VALUES;
        
        private Layout(final String $enum$name, final int $enum$ordinal) {
        }
        
        public static Layout[] values() {
            return Layout.$VALUES.clone();
        }
        
        public static Layout valueOf(final String value) {
            return Enum.valueOf(Layout.class, value);
        }
        
        private static final /* synthetic */ Layout[] $values() {
            return new Layout[] { Layout.ICON_FIRST, Layout.TEXT_FIRST };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
