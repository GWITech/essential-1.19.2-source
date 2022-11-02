package gg.essential.vigilance.gui.settings;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.elementa.state.*;
import gg.essential.vigilance.utils.*;
import gg.essential.vigilance.gui.common.shadow.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import gg.essential.elementa.font.*;
import java.util.*;
import gg.essential.elementa.constraints.*;
import kotlin.ranges.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.animation.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0018\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\"2\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010J\u001a\u00020F2\b\b\u0002\u0010G\u001a\u00020\"J\u0010\u0010K\u001a\u00020F2\b\b\u0002\u0010G\u001a\u00020\"J\b\u0010L\u001a\u00020MH\u0002J\u000e\u0010N\u001a\u00020F2\u0006\u0010O\u001a\u00020\u0003R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u000e\u001a\u0004\b+\u0010\u0016R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u000e\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u000e\u001a\u0004\b4\u00105R\u001b\u00107\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u000e\u001a\u0004\b8\u0010\u001bR\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\"0;X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010<\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u000e\u001a\u0004\b=\u0010\u001bR\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030;¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060;¢\u0006\b\n\u0000\u001a\u0004\bC\u0010AR\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020\"0;X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006P²\u0006\n\u0010Q\u001a\u00020.X\u008a\u0084\u0002²\u0006\n\u0010R\u001a\u00020\nX\u008a\u0084\u0002" }, d2 = { "Lgg/essential/vigilance/gui/settings/DropDownComponent;", "Lgg/essential/elementa/components/UIBlock;", "initialSelection", "", "options", "", "", "maxDisplayOptions", "(ILjava/util/List;I)V", "currentSelectionText", "Lgg/essential/elementa/components/UIText;", "getCurrentSelectionText", "()Lgg/essential/elementa/components/UIText;", "currentSelectionText$delegate", "Lkotlin/properties/ReadWriteProperty;", "downArrow", "Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;", "getDownArrow", "()Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;", "downArrow$delegate", "expandedBlock", "getExpandedBlock", "()Lgg/essential/elementa/components/UIBlock;", "expandedBlock$delegate", "expandedContent", "Lgg/essential/elementa/components/UIContainer;", "getExpandedContent", "()Lgg/essential/elementa/components/UIContainer;", "expandedContent$delegate", "expandedContentArea", "getExpandedContentArea", "expandedContentArea$delegate", "expandedState", "Lgg/essential/vigilance/utils/ReadOnlyState;", "", "getExpandedState", "()Lgg/essential/vigilance/utils/ReadOnlyState;", "iconState", "Lgg/essential/elementa/state/MappedState;", "Lgg/essential/vigilance/utils/ImageFactory;", "optionContainerHeight", "scrollable", "scrollbar", "getScrollbar", "scrollbar$delegate", "scrollbarContainer", "Lgg/essential/elementa/UIComponent;", "getScrollbarContainer", "()Lgg/essential/elementa/UIComponent;", "scrollbarContainer$delegate", "scroller", "Lgg/essential/elementa/components/ScrollComponent;", "getScroller", "()Lgg/essential/elementa/components/ScrollComponent;", "scroller$delegate", "scrollerContainer", "getScrollerContainer", "scrollerContainer$delegate", "selectAreaHovered", "Lgg/essential/elementa/state/State;", "selectedArea", "getSelectedArea", "selectedArea$delegate", "selectedIndex", "getSelectedIndex", "()Lgg/essential/elementa/state/State;", "selectedText", "getSelectedText", "writableExpandedState", "applyExpandedBlockHeight", "", "instantly", "heightConstraint", "Lgg/essential/elementa/constraints/HeightConstraint;", "collapse", "expand", "getMaxItemWidth", "", "select", "index", "Vigilance", "optionContainer", "text" })
public final class DropDownComponent extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final List<String> options;
    private final int maxDisplayOptions;
    @NotNull
    private final State<Boolean> writableExpandedState;
    private final int optionContainerHeight;
    @NotNull
    private final State<Integer> selectedIndex;
    @NotNull
    private final State<String> selectedText;
    @NotNull
    private final ReadOnlyState<Boolean> expandedState;
    @NotNull
    private final ReadWriteProperty selectedArea$delegate;
    @NotNull
    private final State<Boolean> selectAreaHovered;
    @NotNull
    private final ReadWriteProperty currentSelectionText$delegate;
    @NotNull
    private final MappedState<Boolean, ImageFactory> iconState;
    @NotNull
    private final ReadWriteProperty downArrow$delegate;
    @NotNull
    private final ReadWriteProperty expandedBlock$delegate;
    @NotNull
    private final ReadWriteProperty scrollerContainer$delegate;
    @NotNull
    private final ReadWriteProperty scroller$delegate;
    @NotNull
    private final ReadWriteProperty expandedContentArea$delegate;
    @NotNull
    private final ReadWriteProperty expandedContent$delegate;
    @NotNull
    private final ReadWriteProperty scrollbarContainer$delegate;
    @NotNull
    private final ReadWriteProperty scrollbar$delegate;
    private final boolean scrollable;
    
    public DropDownComponent(final int initialSelection, @NotNull final List<String> options, final int maxDisplayOptions) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "options"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: aconst_null    
        //     8: iconst_1       
        //     9: aconst_null    
        //    10: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    13: aload_0         /* this */
        //    14: aload_2         /* options */
        //    15: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.options:Ljava/util/List;
        //    18: aload_0         /* this */
        //    19: iload_3         /* maxDisplayOptions */
        //    20: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.maxDisplayOptions:I
        //    23: aload_0         /* this */
        //    24: new             Lgg/essential/elementa/state/BasicState;
        //    27: dup            
        //    28: iconst_0       
        //    29: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    32: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    35: checkcast       Lgg/essential/elementa/state/State;
        //    38: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.writableExpandedState:Lgg/essential/elementa/state/State;
        //    41: aload_0         /* this */
        //    42: bipush          18
        //    44: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.optionContainerHeight:I
        //    47: aload_0         /* this */
        //    48: new             Lgg/essential/elementa/state/BasicState;
        //    51: dup            
        //    52: iload_1         /* initialSelection */
        //    53: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    56: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    59: checkcast       Lgg/essential/elementa/state/State;
        //    62: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.selectedIndex:Lgg/essential/elementa/state/State;
        //    65: aload_0         /* this */
        //    66: aload_0         /* this */
        //    67: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.selectedIndex:Lgg/essential/elementa/state/State;
        //    70: new             Lgg/essential/vigilance/gui/settings/DropDownComponent$selectedText$1;
        //    73: dup            
        //    74: aload_0         /* this */
        //    75: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent$selectedText$1.<init>:(Lgg/essential/vigilance/gui/settings/DropDownComponent;)V
        //    78: checkcast       Lkotlin/jvm/functions/Function1;
        //    81: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    84: checkcast       Lgg/essential/elementa/state/State;
        //    87: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.selectedText:Lgg/essential/elementa/state/State;
        //    90: aload_0         /* this */
        //    91: new             Lgg/essential/vigilance/utils/ReadOnlyState;
        //    94: dup            
        //    95: aload_0         /* this */
        //    96: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.writableExpandedState:Lgg/essential/elementa/state/State;
        //    99: invokespecial   gg/essential/vigilance/utils/ReadOnlyState.<init>:(Lgg/essential/elementa/state/State;)V
        //   102: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.expandedState:Lgg/essential/vigilance/utils/ReadOnlyState;
        //   105: aload_0         /* this */
        //   106: new             Lgg/essential/elementa/components/UIContainer;
        //   109: dup            
        //   110: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   113: checkcast       Lgg/essential/elementa/UIComponent;
        //   116: astore          $this$constrain$iv
        //   118: iconst_0       
        //   119: istore          $i$f$constrain
        //   121: aload           $this$constrain$iv
        //   123: astore          6
        //   125: aload           6
        //   127: astore          $this$constrain_u24lambda_u2d0$iv
        //   129: iconst_0       
        //   130: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   132: aload           $this$constrain_u24lambda_u2d0$iv
        //   134: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   137: astore          9
        //   139: astore          22
        //   141: iconst_0       
        //   142: istore          $i$a$-constrain-DropDownComponent$selectedArea$2
        //   144: aload           $this$selectedArea_delegate_u24lambda_u2d0
        //   146: bipush          100
        //   148: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   151: checkcast       Ljava/lang/Number;
        //   154: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   157: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   160: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   163: aload           $this$selectedArea_delegate_u24lambda_u2d0
        //   165: bipush          17
        //   167: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   170: checkcast       Ljava/lang/Number;
        //   173: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   176: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   179: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   182: nop            
        //   183: aload           22
        //   185: nop            
        //   186: aload           6
        //   188: nop            
        //   189: aload_0         /* this */
        //   190: checkcast       Lgg/essential/elementa/UIComponent;
        //   193: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   196: aload_0         /* this */
        //   197: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   200: iconst_0       
        //   201: aaload         
        //   202: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   205: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.selectedArea$delegate:Lkotlin/properties/ReadWriteProperty;
        //   208: aload_0         /* this */
        //   209: aload_0         /* this */
        //   210: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getSelectedArea:()Lgg/essential/elementa/components/UIContainer;
        //   213: checkcast       Lgg/essential/elementa/UIComponent;
        //   216: iconst_0       
        //   217: iconst_0       
        //   218: iconst_3       
        //   219: aconst_null    
        //   220: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.hoveredState$default:(Lgg/essential/elementa/UIComponent;ZZILjava/lang/Object;)Lgg/essential/elementa/state/State;
        //   223: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.selectAreaHovered:Lgg/essential/elementa/state/State;
        //   226: aload_0         /* this */
        //   227: new             Lgg/essential/elementa/components/UIText;
        //   230: dup            
        //   231: aconst_null    
        //   232: iconst_0       
        //   233: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   236: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTextShadow:()Ljava/awt/Color;
        //   239: iconst_3       
        //   240: aconst_null    
        //   241: invokespecial   gg/essential/elementa/components/UIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   244: aload_0         /* this */
        //   245: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.selectedText:Lgg/essential/elementa/state/State;
        //   248: invokevirtual   gg/essential/elementa/components/UIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   251: checkcast       Lgg/essential/elementa/UIComponent;
        //   254: astore          $this$constrain$iv
        //   256: iconst_0       
        //   257: istore          $i$f$constrain
        //   259: aload           $this$constrain$iv
        //   261: astore          6
        //   263: aload           6
        //   265: astore          $this$constrain_u24lambda_u2d0$iv
        //   267: iconst_0       
        //   268: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   270: aload           $this$constrain_u24lambda_u2d0$iv
        //   272: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   275: astore          9
        //   277: astore          22
        //   279: iconst_0       
        //   280: istore          $i$a$-constrain-DropDownComponent$currentSelectionText$2
        //   282: aload           $this$currentSelectionText_delegate_u24lambda_u2d1
        //   284: iconst_5       
        //   285: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   288: checkcast       Ljava/lang/Number;
        //   291: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   294: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   297: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   300: aload           $this$currentSelectionText_delegate_u24lambda_u2d1
        //   302: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   305: dup            
        //   306: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   309: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   312: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   315: aload           $this$currentSelectionText_delegate_u24lambda_u2d1
        //   317: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   320: aload_0         /* this */
        //   321: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.selectAreaHovered:Lgg/essential/elementa/state/State;
        //   324: aload_0         /* this */
        //   325: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.writableExpandedState:Lgg/essential/elementa/state/State;
        //   328: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   331: checkcast       Lgg/essential/elementa/state/State;
        //   334: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTextColor$Vigilance:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   337: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   340: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   343: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   346: nop            
        //   347: aload           22
        //   349: nop            
        //   350: aload           6
        //   352: nop            
        //   353: aload_0         /* this */
        //   354: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getSelectedArea:()Lgg/essential/elementa/components/UIContainer;
        //   357: checkcast       Lgg/essential/elementa/UIComponent;
        //   360: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   363: aload_0         /* this */
        //   364: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   367: iconst_1       
        //   368: aaload         
        //   369: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   372: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.currentSelectionText$delegate:Lkotlin/properties/ReadWriteProperty;
        //   375: aload_0         /* this */
        //   376: aload_0         /* this */
        //   377: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.writableExpandedState:Lgg/essential/elementa/state/State;
        //   380: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent$iconState$1.INSTANCE:Lgg/essential/vigilance/gui/settings/DropDownComponent$iconState$1;
        //   383: checkcast       Lkotlin/jvm/functions/Function1;
        //   386: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   389: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.iconState:Lgg/essential/elementa/state/MappedState;
        //   392: aload_0         /* this */
        //   393: new             Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;
        //   396: dup            
        //   397: aload_0         /* this */
        //   398: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.iconState:Lgg/essential/elementa/state/MappedState;
        //   401: checkcast       Lgg/essential/elementa/state/State;
        //   404: new             Lgg/essential/elementa/state/BasicState;
        //   407: dup            
        //   408: iconst_1       
        //   409: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   412: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   415: checkcast       Lgg/essential/elementa/state/State;
        //   418: invokespecial   gg/essential/vigilance/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V
        //   421: checkcast       Lgg/essential/elementa/UIComponent;
        //   424: astore          $this$constrain$iv
        //   426: iconst_0       
        //   427: istore          $i$f$constrain
        //   429: aload           $this$constrain$iv
        //   431: astore          6
        //   433: aload           6
        //   435: astore          $this$constrain_u24lambda_u2d0$iv
        //   437: iconst_0       
        //   438: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   440: aload           $this$constrain_u24lambda_u2d0$iv
        //   442: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   445: astore          9
        //   447: astore          22
        //   449: iconst_0       
        //   450: istore          $i$a$-constrain-DropDownComponent$downArrow$2
        //   452: aload           $this$downArrow_delegate_u24lambda_u2d2
        //   454: iconst_5       
        //   455: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   458: checkcast       Ljava/lang/Number;
        //   461: iconst_1       
        //   462: iconst_0       
        //   463: iconst_2       
        //   464: aconst_null    
        //   465: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   468: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   471: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   474: aload           $this$downArrow_delegate_u24lambda_u2d2
        //   476: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   479: dup            
        //   480: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   483: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   486: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   489: nop            
        //   490: aload           22
        //   492: nop            
        //   493: aload           6
        //   495: nop            
        //   496: checkcast       Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;
        //   499: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   502: aload_0         /* this */
        //   503: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.selectAreaHovered:Lgg/essential/elementa/state/State;
        //   506: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTextColor$Vigilance:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   509: invokevirtual   gg/essential/vigilance/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;
        //   512: checkcast       Lgg/essential/elementa/UIComponent;
        //   515: aload_0         /* this */
        //   516: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getSelectedArea:()Lgg/essential/elementa/components/UIContainer;
        //   519: checkcast       Lgg/essential/elementa/UIComponent;
        //   522: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   525: aload_0         /* this */
        //   526: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   529: iconst_2       
        //   530: aaload         
        //   531: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   534: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.downArrow$delegate:Lkotlin/properties/ReadWriteProperty;
        //   537: aload_0         /* this */
        //   538: new             Lgg/essential/elementa/components/UIBlock;
        //   541: dup            
        //   542: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   545: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getButtonHighlight$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   548: checkcast       Lgg/essential/elementa/state/State;
        //   551: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   554: checkcast       Lgg/essential/elementa/UIComponent;
        //   557: astore          $this$constrain$iv
        //   559: iconst_0       
        //   560: istore          $i$f$constrain
        //   562: aload           $this$constrain$iv
        //   564: astore          6
        //   566: aload           6
        //   568: astore          $this$constrain_u24lambda_u2d0$iv
        //   570: iconst_0       
        //   571: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   573: aload           $this$constrain_u24lambda_u2d0$iv
        //   575: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   578: astore          9
        //   580: astore          22
        //   582: iconst_0       
        //   583: istore          $i$a$-constrain-DropDownComponent$expandedBlock$2
        //   585: aload           $this$expandedBlock_delegate_u24lambda_u2d3
        //   587: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   590: dup            
        //   591: fconst_0       
        //   592: iconst_0       
        //   593: iconst_3       
        //   594: aconst_null    
        //   595: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   598: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   601: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   604: aload           $this$expandedBlock_delegate_u24lambda_u2d3
        //   606: bipush          100
        //   608: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   611: checkcast       Ljava/lang/Number;
        //   614: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   617: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   620: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   623: aload           $this$expandedBlock_delegate_u24lambda_u2d3
        //   625: iconst_0       
        //   626: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   629: checkcast       Ljava/lang/Number;
        //   632: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   635: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   638: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   641: nop            
        //   642: aload           22
        //   644: nop            
        //   645: aload           6
        //   647: nop            
        //   648: aload_0         /* this */
        //   649: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.writableExpandedState:Lgg/essential/elementa/state/State;
        //   652: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.bindFloating:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/UIComponent;
        //   655: aload_0         /* this */
        //   656: checkcast       Lgg/essential/elementa/UIComponent;
        //   659: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   662: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   665: dup            
        //   666: aconst_null    
        //   667: iconst_0       
        //   668: iconst_3       
        //   669: aconst_null    
        //   670: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   673: checkcast       Lgg/essential/elementa/effects/Effect;
        //   676: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   679: aload_0         /* this */
        //   680: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   683: iconst_3       
        //   684: aaload         
        //   685: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   688: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.expandedBlock$delegate:Lkotlin/properties/ReadWriteProperty;
        //   691: aload_0         /* this */
        //   692: new             Lgg/essential/elementa/components/UIContainer;
        //   695: dup            
        //   696: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   699: checkcast       Lgg/essential/elementa/UIComponent;
        //   702: astore          $this$constrain$iv
        //   704: iconst_0       
        //   705: istore          $i$f$constrain
        //   707: aload           $this$constrain$iv
        //   709: astore          6
        //   711: aload           6
        //   713: astore          $this$constrain_u24lambda_u2d0$iv
        //   715: iconst_0       
        //   716: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   718: aload           $this$constrain_u24lambda_u2d0$iv
        //   720: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   723: astore          9
        //   725: astore          22
        //   727: iconst_0       
        //   728: istore          $i$a$-constrain-DropDownComponent$scrollerContainer$2
        //   730: aload           $this$scrollerContainer_delegate_u24lambda_u2d4
        //   732: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   735: dup            
        //   736: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   739: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   742: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   745: aload           $this$scrollerContainer_delegate_u24lambda_u2d4
        //   747: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   750: dup            
        //   751: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   754: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   757: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   760: aload           $this$scrollerContainer_delegate_u24lambda_u2d4
        //   762: bipush          100
        //   764: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   767: checkcast       Ljava/lang/Number;
        //   770: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   773: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   776: iconst_4       
        //   777: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   780: checkcast       Ljava/lang/Number;
        //   783: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   786: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   789: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   792: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   795: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   798: aload           $this$scrollerContainer_delegate_u24lambda_u2d4
        //   800: bipush          100
        //   802: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   805: checkcast       Ljava/lang/Number;
        //   808: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   811: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   814: iconst_4       
        //   815: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   818: checkcast       Ljava/lang/Number;
        //   821: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   824: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   827: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   830: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   833: iconst_0       
        //   834: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   837: checkcast       Ljava/lang/Number;
        //   840: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   843: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   846: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtLeast:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtLeastConstraint;
        //   849: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   852: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   855: nop            
        //   856: aload           22
        //   858: nop            
        //   859: aload           6
        //   861: nop            
        //   862: aload_0         /* this */
        //   863: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getExpandedBlock:()Lgg/essential/elementa/components/UIBlock;
        //   866: checkcast       Lgg/essential/elementa/UIComponent;
        //   869: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   872: aload_0         /* this */
        //   873: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   876: iconst_4       
        //   877: aaload         
        //   878: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   881: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.scrollerContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   884: aload_0         /* this */
        //   885: new             Lgg/essential/elementa/components/ScrollComponent;
        //   888: dup            
        //   889: aconst_null    
        //   890: fconst_0       
        //   891: aconst_null    
        //   892: iconst_0       
        //   893: iconst_0       
        //   894: iconst_0       
        //   895: iconst_0       
        //   896: fconst_0       
        //   897: fconst_0       
        //   898: aconst_null    
        //   899: sipush          1023
        //   902: aconst_null    
        //   903: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   906: checkcast       Lgg/essential/elementa/UIComponent;
        //   909: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   912: astore          $this$constrain$iv
        //   914: iconst_0       
        //   915: istore          $i$f$constrain
        //   917: aload           $this$constrain$iv
        //   919: astore          6
        //   921: aload           6
        //   923: astore          $this$constrain_u24lambda_u2d0$iv
        //   925: iconst_0       
        //   926: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   928: aload           $this$constrain_u24lambda_u2d0$iv
        //   930: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   933: astore          9
        //   935: astore          22
        //   937: iconst_0       
        //   938: istore          $i$a$-constrain-DropDownComponent$scroller$2
        //   940: aload           $this$scroller_delegate_u24lambda_u2d5
        //   942: bipush          100
        //   944: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   947: checkcast       Ljava/lang/Number;
        //   950: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   953: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   956: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   959: aload           $this$scroller_delegate_u24lambda_u2d5
        //   961: bipush          100
        //   963: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   966: checkcast       Ljava/lang/Number;
        //   969: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   972: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   975: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   978: nop            
        //   979: aload           22
        //   981: nop            
        //   982: aload           6
        //   984: nop            
        //   985: aload_0         /* this */
        //   986: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getScrollerContainer:()Lgg/essential/elementa/components/UIContainer;
        //   989: checkcast       Lgg/essential/elementa/UIComponent;
        //   992: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   995: aload_0         /* this */
        //   996: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   999: iconst_5       
        //  1000: aaload         
        //  1001: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1004: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.scroller$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1007: aload_0         /* this */
        //  1008: new             Lgg/essential/elementa/components/UIBlock;
        //  1011: dup            
        //  1012: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //  1015: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getComponentBackground$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //  1018: checkcast       Lgg/essential/elementa/state/State;
        //  1021: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //  1024: checkcast       Lgg/essential/elementa/UIComponent;
        //  1027: astore          $this$constrain$iv
        //  1029: iconst_0       
        //  1030: istore          $i$f$constrain
        //  1032: aload           $this$constrain$iv
        //  1034: astore          6
        //  1036: aload           6
        //  1038: astore          $this$constrain_u24lambda_u2d0$iv
        //  1040: iconst_0       
        //  1041: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1043: aload           $this$constrain_u24lambda_u2d0$iv
        //  1045: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1048: astore          9
        //  1050: astore          22
        //  1052: iconst_0       
        //  1053: istore          $i$a$-constrain-DropDownComponent$expandedContentArea$2
        //  1055: aload           $this$expandedContentArea_delegate_u24lambda_u2d6
        //  1057: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1060: dup            
        //  1061: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1064: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1067: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1070: aload           $this$expandedContentArea_delegate_u24lambda_u2d6
        //  1072: bipush          100
        //  1074: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1077: checkcast       Ljava/lang/Number;
        //  1080: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1083: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1086: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1089: aload           $this$expandedContentArea_delegate_u24lambda_u2d6
        //  1091: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1094: dup            
        //  1095: fconst_0       
        //  1096: iconst_1       
        //  1097: aconst_null    
        //  1098: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1101: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1104: bipush          6
        //  1106: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1109: checkcast       Ljava/lang/Number;
        //  1112: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1115: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1118: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1121: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1124: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1127: nop            
        //  1128: aload           22
        //  1130: nop            
        //  1131: aload           6
        //  1133: nop            
        //  1134: aload_0         /* this */
        //  1135: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //  1138: checkcast       Lgg/essential/elementa/UIComponent;
        //  1141: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1144: aload_0         /* this */
        //  1145: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1148: bipush          6
        //  1150: aaload         
        //  1151: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1154: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.expandedContentArea$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1157: aload_0         /* this */
        //  1158: new             Lgg/essential/elementa/components/UIContainer;
        //  1161: dup            
        //  1162: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1165: checkcast       Lgg/essential/elementa/UIComponent;
        //  1168: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1171: astore          $this$constrain$iv
        //  1173: iconst_0       
        //  1174: istore          $i$f$constrain
        //  1176: aload           $this$constrain$iv
        //  1178: astore          6
        //  1180: aload           6
        //  1182: astore          $this$constrain_u24lambda_u2d0$iv
        //  1184: iconst_0       
        //  1185: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1187: aload           $this$constrain_u24lambda_u2d0$iv
        //  1189: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1192: astore          9
        //  1194: astore          22
        //  1196: iconst_0       
        //  1197: istore          $i$a$-constrain-DropDownComponent$expandedContent$2
        //  1199: aload           $this$expandedContent_delegate_u24lambda_u2d7
        //  1201: bipush          100
        //  1203: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1206: checkcast       Ljava/lang/Number;
        //  1209: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1212: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1215: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1218: aload           $this$expandedContent_delegate_u24lambda_u2d7
        //  1220: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1223: dup            
        //  1224: fconst_0       
        //  1225: iconst_1       
        //  1226: aconst_null    
        //  1227: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1230: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1233: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1236: nop            
        //  1237: aload           22
        //  1239: nop            
        //  1240: aload           6
        //  1242: nop            
        //  1243: aload_0         /* this */
        //  1244: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getExpandedContentArea:()Lgg/essential/elementa/components/UIBlock;
        //  1247: checkcast       Lgg/essential/elementa/UIComponent;
        //  1250: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1253: aload_0         /* this */
        //  1254: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1257: bipush          7
        //  1259: aaload         
        //  1260: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1263: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.expandedContent$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1266: aload_0         /* this */
        //  1267: new             Lgg/essential/elementa/components/UIContainer;
        //  1270: dup            
        //  1271: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1274: checkcast       Lgg/essential/elementa/UIComponent;
        //  1277: astore          $this$constrain$iv
        //  1279: iconst_0       
        //  1280: istore          $i$f$constrain
        //  1282: aload           $this$constrain$iv
        //  1284: astore          6
        //  1286: aload           6
        //  1288: astore          $this$constrain_u24lambda_u2d0$iv
        //  1290: iconst_0       
        //  1291: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1293: aload           $this$constrain_u24lambda_u2d0$iv
        //  1295: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1298: astore          9
        //  1300: astore          22
        //  1302: iconst_0       
        //  1303: istore          $i$a$-constrain-DropDownComponent$scrollbarContainer$2
        //  1305: aload           $this$scrollbarContainer_delegate_u24lambda_u2d8
        //  1307: iconst_0       
        //  1308: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1311: checkcast       Ljava/lang/Number;
        //  1314: iconst_1       
        //  1315: iconst_0       
        //  1316: iconst_2       
        //  1317: aconst_null    
        //  1318: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1321: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1324: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1327: aload           $this$scrollbarContainer_delegate_u24lambda_u2d8
        //  1329: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1332: dup            
        //  1333: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1336: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1339: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1342: aload           $this$scrollbarContainer_delegate_u24lambda_u2d8
        //  1344: iconst_2       
        //  1345: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1348: checkcast       Ljava/lang/Number;
        //  1351: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1354: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1357: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1360: aload           $this$scrollbarContainer_delegate_u24lambda_u2d8
        //  1362: bipush          100
        //  1364: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1367: checkcast       Ljava/lang/Number;
        //  1370: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1373: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1376: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1379: nop            
        //  1380: aload           22
        //  1382: nop            
        //  1383: aload           6
        //  1385: nop            
        //  1386: astore          null
        //  1388: nop            
        //  1389: iconst_0       
        //  1390: istore          $i$f$onLeftClick
        //  1392: aload           $this$onLeftClick$iv
        //  1394: new             Lgg/essential/vigilance/gui/settings/DropDownComponent$special$$inlined$onLeftClick$1;
        //  1397: dup            
        //  1398: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent$special$$inlined$onLeftClick$1.<init>:()V
        //  1401: checkcast       Lkotlin/jvm/functions/Function2;
        //  1404: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1407: nop            
        //  1408: aload_0         /* this */
        //  1409: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getScrollerContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1412: checkcast       Lgg/essential/elementa/UIComponent;
        //  1415: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1418: aload_0         /* this */
        //  1419: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1422: bipush          8
        //  1424: aaload         
        //  1425: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1428: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.scrollbarContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1431: aload_0         /* this */
        //  1432: new             Lgg/essential/elementa/components/UIBlock;
        //  1435: dup            
        //  1436: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //  1439: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getMidGray$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //  1442: checkcast       Lgg/essential/elementa/state/State;
        //  1445: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //  1448: checkcast       Lgg/essential/elementa/UIComponent;
        //  1451: astore          $this$constrain$iv
        //  1453: iconst_0       
        //  1454: istore          $i$f$constrain
        //  1456: aload           $this$constrain$iv
        //  1458: astore          6
        //  1460: aload           6
        //  1462: astore          $this$constrain_u24lambda_u2d0$iv
        //  1464: iconst_0       
        //  1465: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1467: aload           $this$constrain_u24lambda_u2d0$iv
        //  1469: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1472: astore          9
        //  1474: astore          22
        //  1476: iconst_0       
        //  1477: istore          $i$a$-constrain-DropDownComponent$scrollbar$2
        //  1479: aload           $this$scrollbar_delegate_u24lambda_u2d10
        //  1481: bipush          100
        //  1483: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1486: checkcast       Ljava/lang/Number;
        //  1489: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1492: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1495: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1498: nop            
        //  1499: aload           22
        //  1501: nop            
        //  1502: aload           6
        //  1504: nop            
        //  1505: aload_0         /* this */
        //  1506: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getScrollbarContainer:()Lgg/essential/elementa/UIComponent;
        //  1509: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1512: aload_0         /* this */
        //  1513: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1516: bipush          9
        //  1518: aaload         
        //  1519: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1522: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.scrollbar$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1525: aload_0         /* this */
        //  1526: aload_0         /* this */
        //  1527: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.options:Ljava/util/List;
        //  1530: invokeinterface java/util/List.size:()I
        //  1535: aload_0         /* this */
        //  1536: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.maxDisplayOptions:I
        //  1539: if_icmple       1546
        //  1542: iconst_1       
        //  1543: goto            1547
        //  1546: iconst_0       
        //  1547: putfield        gg/essential/vigilance/gui/settings/DropDownComponent.scrollable:Z
        //  1550: nop            
        //  1551: aload_0         /* this */
        //  1552: checkcast       Lgg/essential/elementa/UIComponent;
        //  1555: astore          $this$constrain$iv
        //  1557: iconst_0       
        //  1558: istore          $i$f$constrain
        //  1560: aload           $this$constrain$iv
        //  1562: astore          6
        //  1564: aload           6
        //  1566: astore          $this$constrain_u24lambda_u2d0$iv
        //  1568: iconst_0       
        //  1569: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1571: aload           $this$constrain_u24lambda_u2d0$iv
        //  1573: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1576: astore          $this$_init__u24lambda_u2d12
        //  1578: iconst_0       
        //  1579: istore          $i$a$-constrain-DropDownComponent$1
        //  1581: aload           $this$_init__u24lambda_u2d12
        //  1583: aload_0         /* this */
        //  1584: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getMaxItemWidth:()F
        //  1587: bipush          25
        //  1589: i2f            
        //  1590: fadd           
        //  1591: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1594: checkcast       Ljava/lang/Number;
        //  1597: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1600: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1603: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1606: aload           $this$_init__u24lambda_u2d12
        //  1608: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1611: dup            
        //  1612: fconst_0       
        //  1613: iconst_1       
        //  1614: aconst_null    
        //  1615: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1618: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1621: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1624: nop            
        //  1625: nop            
        //  1626: aload           6
        //  1628: nop            
        //  1629: pop            
        //  1630: aload_0         /* this */
        //  1631: aload_0         /* this */
        //  1632: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.selectAreaHovered:Lgg/essential/elementa/state/State;
        //  1635: aload_0         /* this */
        //  1636: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.expandedState:Lgg/essential/vigilance/utils/ReadOnlyState;
        //  1639: checkcast       Lgg/essential/elementa/state/State;
        //  1642: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1645: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent$2.INSTANCE:Lgg/essential/vigilance/gui/settings/DropDownComponent$2;
        //  1648: checkcast       Lkotlin/jvm/functions/Function1;
        //  1651: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1654: checkcast       Lgg/essential/elementa/state/State;
        //  1657: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1660: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1663: invokevirtual   gg/essential/vigilance/gui/settings/DropDownComponent.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //  1666: pop            
        //  1667: aload_0         /* this */
        //  1668: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.scrollable:Z
        //  1671: ifeq            1689
        //  1674: aload_0         /* this */
        //  1675: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //  1678: aload_0         /* this */
        //  1679: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getScrollbar:()Lgg/essential/elementa/components/UIBlock;
        //  1682: checkcast       Lgg/essential/elementa/UIComponent;
        //  1685: iconst_0       
        //  1686: invokevirtual   gg/essential/elementa/components/ScrollComponent.setVerticalScrollBarComponent:(Lgg/essential/elementa/UIComponent;Z)V
        //  1689: aload_0         /* this */
        //  1690: getfield        gg/essential/vigilance/gui/settings/DropDownComponent.options:Ljava/util/List;
        //  1693: checkcast       Ljava/lang/Iterable;
        //  1696: invokestatic    kotlin/collections/CollectionsKt.withIndex:(Ljava/lang/Iterable;)Ljava/lang/Iterable;
        //  1699: astore          $this$forEach$iv
        //  1701: iconst_0       
        //  1702: istore          $i$f$forEach
        //  1704: aload           $this$forEach$iv
        //  1706: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1711: astore          6
        //  1713: aload           6
        //  1715: invokeinterface java/util/Iterator.hasNext:()Z
        //  1720: ifeq            2074
        //  1723: aload           6
        //  1725: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1730: astore          element$iv
        //  1732: aload           element$iv
        //  1734: checkcast       Lkotlin/collections/IndexedValue;
        //  1737: astore          $dstr$index$value
        //  1739: iconst_0       
        //  1740: istore          $i$a$-forEach-DropDownComponent$3
        //  1742: aload           $dstr$index$value
        //  1744: invokevirtual   kotlin/collections/IndexedValue.component1:()I
        //  1747: istore          index
        //  1749: aload           $dstr$index$value
        //  1751: invokevirtual   kotlin/collections/IndexedValue.component2:()Ljava/lang/Object;
        //  1754: checkcast       Ljava/lang/String;
        //  1757: astore          value
        //  1759: new             Lgg/essential/elementa/components/UIBlock;
        //  1762: dup            
        //  1763: aconst_null    
        //  1764: iconst_1       
        //  1765: aconst_null    
        //  1766: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1769: checkcast       Lgg/essential/elementa/UIComponent;
        //  1772: astore          $this$constrain$iv
        //  1774: iconst_0       
        //  1775: istore          $i$f$constrain
        //  1777: aload           $this$constrain$iv
        //  1779: astore          14
        //  1781: aload           14
        //  1783: astore          $this$constrain_u24lambda_u2d0$iv
        //  1785: iconst_0       
        //  1786: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1788: aload           $this$constrain_u24lambda_u2d0$iv
        //  1790: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1793: astore          $this$lambda_u2d18_u24lambda_u2d13
        //  1795: iconst_0       
        //  1796: istore          $i$a$-constrain-DropDownComponent$3$optionContainer$2
        //  1798: aload           $this$lambda_u2d18_u24lambda_u2d13
        //  1800: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1803: dup            
        //  1804: fconst_0       
        //  1805: iconst_0       
        //  1806: iconst_3       
        //  1807: aconst_null    
        //  1808: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1811: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1814: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1817: aload           $this$lambda_u2d18_u24lambda_u2d13
        //  1819: bipush          100
        //  1821: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1824: checkcast       Ljava/lang/Number;
        //  1827: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1830: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1833: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1836: aload           $this$lambda_u2d18_u24lambda_u2d13
        //  1838: bipush          20
        //  1840: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1843: checkcast       Ljava/lang/Number;
        //  1846: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1849: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1852: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1855: nop            
        //  1856: nop            
        //  1857: aload           14
        //  1859: nop            
        //  1860: astore          null
        //  1862: nop            
        //  1863: iconst_0       
        //  1864: istore          $i$f$onLeftClick
        //  1866: aload           $this$onLeftClick$iv
        //  1868: new             Lgg/essential/vigilance/gui/settings/DropDownComponent$_init_$lambda-18$$inlined$onLeftClick$1;
        //  1871: dup            
        //  1872: aload_0         /* this */
        //  1873: iload           index
        //  1875: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent$_init_$lambda-18$$inlined$onLeftClick$1.<init>:(Lgg/essential/vigilance/gui/settings/DropDownComponent;I)V
        //  1878: checkcast       Lkotlin/jvm/functions/Function2;
        //  1881: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1884: nop            
        //  1885: aload_0         /* this */
        //  1886: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getExpandedContent:()Lgg/essential/elementa/components/UIContainer;
        //  1889: checkcast       Lgg/essential/elementa/UIComponent;
        //  1892: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1895: aconst_null    
        //  1896: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1899: bipush          10
        //  1901: aaload         
        //  1902: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1905: astore          optionContainer$delegate
        //  1907: aload           optionContainer$delegate
        //  1909: invokestatic    gg/essential/vigilance/gui/settings/DropDownComponent.lambda-18$lambda-15:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //  1912: iconst_0       
        //  1913: iconst_0       
        //  1914: iconst_3       
        //  1915: aconst_null    
        //  1916: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.hoveredState$default:(Lgg/essential/elementa/UIComponent;ZZILjava/lang/Object;)Lgg/essential/elementa/state/State;
        //  1919: astore          hovered
        //  1921: aload           optionContainer$delegate
        //  1923: invokestatic    gg/essential/vigilance/gui/settings/DropDownComponent.lambda-18$lambda-15:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //  1926: aload           hovered
        //  1928: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent$3$1.INSTANCE:Lgg/essential/vigilance/gui/settings/DropDownComponent$3$1;
        //  1931: checkcast       Lkotlin/jvm/functions/Function1;
        //  1934: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1937: checkcast       Lgg/essential/elementa/state/State;
        //  1940: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1943: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1946: invokevirtual   gg/essential/elementa/UIComponent.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //  1949: pop            
        //  1950: new             Lgg/essential/elementa/components/UIText;
        //  1953: dup            
        //  1954: aload           value
        //  1956: iconst_0       
        //  1957: aconst_null    
        //  1958: bipush          6
        //  1960: aconst_null    
        //  1961: invokespecial   gg/essential/elementa/components/UIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1964: checkcast       Lgg/essential/elementa/UIComponent;
        //  1967: astore          $this$constrain$iv
        //  1969: iconst_0       
        //  1970: istore          $i$f$constrain
        //  1972: aload           $this$constrain$iv
        //  1974: astore          16
        //  1976: aload           16
        //  1978: astore          $this$constrain_u24lambda_u2d0$iv
        //  1980: iconst_0       
        //  1981: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1983: aload           $this$constrain_u24lambda_u2d0$iv
        //  1985: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1988: astore          $this$lambda_u2d18_u24lambda_u2d16
        //  1990: iconst_0       
        //  1991: istore          $i$a$-constrain-DropDownComponent$3$text$2
        //  1993: aload           $this$lambda_u2d18_u24lambda_u2d16
        //  1995: iconst_5       
        //  1996: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1999: checkcast       Ljava/lang/Number;
        //  2002: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2005: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2008: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2011: aload           $this$lambda_u2d18_u24lambda_u2d16
        //  2013: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  2016: dup            
        //  2017: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  2020: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  2023: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  2026: aload           $this$lambda_u2d18_u24lambda_u2d16
        //  2028: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //  2031: aload           hovered
        //  2033: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTextColor$Vigilance:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //  2036: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  2039: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  2042: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  2045: nop            
        //  2046: nop            
        //  2047: aload           16
        //  2049: nop            
        //  2050: aload           optionContainer$delegate
        //  2052: invokestatic    gg/essential/vigilance/gui/settings/DropDownComponent.lambda-18$lambda-15:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //  2055: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2058: aconst_null    
        //  2059: getstatic       gg/essential/vigilance/gui/settings/DropDownComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2062: bipush          11
        //  2064: aaload         
        //  2065: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2068: astore          text$delegate
        //  2070: nop            
        //  2071: goto            1713
        //  2074: nop            
        //  2075: aload_0         /* this */
        //  2076: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.getSelectedArea:()Lgg/essential/elementa/components/UIContainer;
        //  2079: checkcast       Lgg/essential/elementa/UIComponent;
        //  2082: astore          $this$onLeftClick$iv
        //  2084: iconst_0       
        //  2085: istore          $i$f$onLeftClick
        //  2087: aload           $this$onLeftClick$iv
        //  2089: new             Lgg/essential/vigilance/gui/settings/DropDownComponent$special$$inlined$onLeftClick$2;
        //  2092: dup            
        //  2093: aload_0         /* this */
        //  2094: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent$special$$inlined$onLeftClick$2.<init>:(Lgg/essential/vigilance/gui/settings/DropDownComponent;)V
        //  2097: checkcast       Lkotlin/jvm/functions/Function2;
        //  2100: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  2103: nop            
        //  2104: pop            
        //  2105: nop            
        //  2106: return         
        //    Signature:
        //  (ILjava/util/List<Ljava/lang/String;>;I)V
        //    MethodParameters:
        //  Name               Flags  
        //  -----------------  -----
        //  initialSelection   
        //  options            
        //  maxDisplayOptions  
        //    StackMapTable: 00 05 FF 06 0A 00 17 07 00 02 01 07 01 96 01 07 00 B4 01 07 00 B4 07 00 B4 01 07 00 C4 01 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 01 07 00 02 FF 00 00 00 17 07 00 02 01 07 01 96 01 07 00 B4 01 07 00 B4 07 00 B4 01 07 00 C4 01 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 02 07 00 02 01 FB 00 8D FF 00 17 00 17 07 00 02 01 07 01 96 01 07 01 B8 01 07 01 C4 07 01 C6 00 00 01 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FB 01 68
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public DropDownComponent(final int initialSelection, final List options, int maxDisplayOptions, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x4) != 0x0) {
            maxDisplayOptions = 6;
        }
        this(initialSelection, options, maxDisplayOptions);
    }
    
    @NotNull
    public final State<Integer> getSelectedIndex() {
        return this.selectedIndex;
    }
    
    @NotNull
    public final State<String> getSelectedText() {
        return this.selectedText;
    }
    
    @NotNull
    public final ReadOnlyState<Boolean> getExpandedState() {
        return this.expandedState;
    }
    
    private final UIContainer getSelectedArea() {
        return (UIContainer)this.selectedArea$delegate.getValue((Object)this, (KProperty)DropDownComponent.$$delegatedProperties[0]);
    }
    
    private final UIText getCurrentSelectionText() {
        return (UIText)this.currentSelectionText$delegate.getValue((Object)this, (KProperty)DropDownComponent.$$delegatedProperties[1]);
    }
    
    private final ShadowIcon getDownArrow() {
        return (ShadowIcon)this.downArrow$delegate.getValue((Object)this, (KProperty)DropDownComponent.$$delegatedProperties[2]);
    }
    
    private final UIBlock getExpandedBlock() {
        return (UIBlock)this.expandedBlock$delegate.getValue((Object)this, (KProperty)DropDownComponent.$$delegatedProperties[3]);
    }
    
    private final UIContainer getScrollerContainer() {
        return (UIContainer)this.scrollerContainer$delegate.getValue((Object)this, (KProperty)DropDownComponent.$$delegatedProperties[4]);
    }
    
    private final ScrollComponent getScroller() {
        return (ScrollComponent)this.scroller$delegate.getValue((Object)this, (KProperty)DropDownComponent.$$delegatedProperties[5]);
    }
    
    private final UIBlock getExpandedContentArea() {
        return (UIBlock)this.expandedContentArea$delegate.getValue((Object)this, (KProperty)DropDownComponent.$$delegatedProperties[6]);
    }
    
    private final UIContainer getExpandedContent() {
        return (UIContainer)this.expandedContent$delegate.getValue((Object)this, (KProperty)DropDownComponent.$$delegatedProperties[7]);
    }
    
    private final UIComponent getScrollbarContainer() {
        return (UIComponent)this.scrollbarContainer$delegate.getValue((Object)this, (KProperty)DropDownComponent.$$delegatedProperties[8]);
    }
    
    private final UIBlock getScrollbar() {
        return (UIBlock)this.scrollbar$delegate.getValue((Object)this, (KProperty)DropDownComponent.$$delegatedProperties[9]);
    }
    
    private final float getMaxItemWidth() {
        final Iterator iterator = this.options.iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        final String it = (String)iterator.next();
        final int n = 0;
        float a = UtilitiesKt.width$default(it, 0.0f, null, 3, null);
        while (iterator.hasNext()) {
            final String it2 = (String)iterator.next();
            final int n2 = 0;
            a = Math.max(a, UtilitiesKt.width$default(it2, 0.0f, null, 3, null));
        }
        return a;
    }
    
    public final void select(final int index) {
        if (0 <= index && index < this.options.size()) {
            this.selectedIndex.set(index);
            collapse$default(this, false, 1, null);
        }
    }
    
    public final void expand(final boolean instantly) {
        this.writableExpandedState.set(true);
        this.applyExpandedBlockHeight(instantly, ConstraintsKt.plus(UtilitiesKt.getPixels(RangesKt.coerceAtMost(this.options.size(), this.maxDisplayOptions) * 20), UtilitiesKt.getPixels(10)));
    }
    
    public static /* synthetic */ void expand$default(final DropDownComponent dropDownComponent, boolean instantly, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            instantly = false;
        }
        dropDownComponent.expand(instantly);
    }
    
    public final void collapse(final boolean instantly) {
        this.writableExpandedState.set(false);
        this.applyExpandedBlockHeight(instantly, UtilitiesKt.getPixels(0));
    }
    
    public static /* synthetic */ void collapse$default(final DropDownComponent dropDownComponent, boolean instantly, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            instantly = false;
        }
        dropDownComponent.collapse(instantly);
    }
    
    private final void applyExpandedBlockHeight(final boolean instantly, final HeightConstraint heightConstraint) {
        if (instantly) {
            this.getExpandedBlock().setHeight(heightConstraint);
        }
        else {
            final UIComponent $this$animate$iv = this.getExpandedBlock();
            final int $i$f$animate = 0;
            final UIComponent $this$animate_u24lambda_u2d0$iv = $this$animate$iv;
            final int n = 0;
            final AnimatingConstraints $this$applyExpandedBlockHeight_u24lambda_u2d20;
            final AnimatingConstraints anim$iv = $this$applyExpandedBlockHeight_u24lambda_u2d20 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
            final int n2 = 0;
            AnimatingConstraints.setHeightAnimation$default($this$applyExpandedBlockHeight_u24lambda_u2d20, Animations.OUT_EXP, 0.25f, heightConstraint, 0.0f, 8, null);
            $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
        }
    }
    
    private static final UIComponent lambda-18$lambda-15(final ReadWriteProperty<Object, UIComponent> $optionContainer$delegate) {
        return (UIComponent)$optionContainer$delegate.getValue((Object)null, (KProperty)DropDownComponent.$$delegatedProperties[10]);
    }
    
    private static final UIText lambda-18$lambda-17(final ReadWriteProperty<Object, UIText> $text$delegate) {
        return (UIText)$text$delegate.getValue((Object)null, (KProperty)DropDownComponent.$$delegatedProperties[11]);
    }
    
    public static final /* synthetic */ State access$getWritableExpandedState$p(final DropDownComponent $this) {
        return $this.writableExpandedState;
    }
    
    public static final /* synthetic */ List access$getOptions$p(final DropDownComponent $this) {
        return $this.options;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DropDownComponent.class, "selectedArea", "getSelectedArea()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DropDownComponent.class, "currentSelectionText", "getCurrentSelectionText()Lgg/essential/elementa/components/UIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DropDownComponent.class, "downArrow", "getDownArrow()Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DropDownComponent.class, "expandedBlock", "getExpandedBlock()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DropDownComponent.class, "scrollerContainer", "getScrollerContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DropDownComponent.class, "scroller", "getScroller()Lgg/essential/elementa/components/ScrollComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DropDownComponent.class, "expandedContentArea", "getExpandedContentArea()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DropDownComponent.class, "expandedContent", "getExpandedContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DropDownComponent.class, "scrollbarContainer", "getScrollbarContainer()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DropDownComponent.class, "scrollbar", "getScrollbar()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)DropDownComponent.class, "optionContainer", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)DropDownComponent.class, "text", "<v#1>", 0)) };
    }
}
