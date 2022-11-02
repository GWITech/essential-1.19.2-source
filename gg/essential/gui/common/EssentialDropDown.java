package gg.essential.gui.common;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.image.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import gg.essential.elementa.font.*;
import java.util.*;
import gg.essential.elementa.constraints.*;
import kotlin.ranges.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.animation.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0084\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0018\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00172\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010L\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020\u0017J\u0010\u0010M\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020\u0017J\u0006\u0010N\u001a\u00020OJ\b\u0010P\u001a\u00020OH\u0002J\u000e\u0010Q\u001a\u00020H2\u0006\u0010R\u001a\u00020\u0003R\u000e\u0010	\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u001b\u0010
                                                   \u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0018\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b#\u0010\u000f\u001a\u0004\b"\u0010\u001aR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170%¢\u0006\b
                                                   \u0000\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010+\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010,\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b.\u0010\u000f\u001a\u0004\b-\u0010\u001aR\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b3\u0010\u000f\u001a\u0004\b1\u00102R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b8\u0010\u000f\u001a\u0004\b6\u00107R\u001b\u00109\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b;\u0010\u000f\u001a\u0004\b:\u0010\u001fR\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00170=X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010>\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b@\u0010\u000f\u001a\u0004\b?\u0010\u001fR\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030=¢\u0006\b
                                                   \u0000\u001a\u0004\bB\u0010CR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060=¢\u0006\b
                                                   \u0000\u001a\u0004\bE\u0010CR\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00170=X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006S²\u0006
                                                   \u0010T\u001a\u000200X\u008a\u0084\u0002²\u0006
                                                   \u0010U\u001a\u00020\u000bX\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/common/EssentialDropDown;", "Lgg/essential/elementa/components/UIBlock;", "initialSelection", "", "options", "", "", "maxDisplayOptions", "(ILjava/util/List;I)V", "animationCounter", "currentSelectionText", "Lgg/essential/elementa/components/UIText;", "getCurrentSelectionText", "()Lgg/essential/elementa/components/UIText;", "currentSelectionText$delegate", "Lkotlin/properties/ReadWriteProperty;", "downArrow", "Lgg/essential/gui/common/shadow/ShadowIcon;", "getDownArrow", "()Lgg/essential/gui/common/shadow/ShadowIcon;", "downArrow$delegate", "dropdownAnimating", "Lgg/essential/elementa/state/BasicState;", "", "expandedBlock", "getExpandedBlock", "()Lgg/essential/elementa/components/UIBlock;", "expandedBlock$delegate", "expandedContent", "Lgg/essential/elementa/components/UIContainer;", "getExpandedContent", "()Lgg/essential/elementa/components/UIContainer;", "expandedContent$delegate", "expandedContentArea", "getExpandedContentArea", "expandedContentArea$delegate", "expandedState", "Lgg/essential/gui/common/ReadOnlyState;", "getExpandedState", "()Lgg/essential/gui/common/ReadOnlyState;", "iconState", "Lgg/essential/elementa/state/MappedState;", "Lgg/essential/gui/image/ImageFactory;", "scrollable", "scrollbar", "getScrollbar", "scrollbar$delegate", "scrollbarContainer", "Lgg/essential/elementa/UIComponent;", "getScrollbarContainer", "()Lgg/essential/elementa/UIComponent;", "scrollbarContainer$delegate", "scroller", "Lgg/essential/elementa/components/ScrollComponent;", "getScroller", "()Lgg/essential/elementa/components/ScrollComponent;", "scroller$delegate", "scrollerContainer", "getScrollerContainer", "scrollerContainer$delegate", "selectAreaHovered", "Lgg/essential/elementa/state/State;", "selectedArea", "getSelectedArea", "selectedArea$delegate", "selectedIndex", "getSelectedIndex", "()Lgg/essential/elementa/state/State;", "selectedText", "getSelectedText", "writableExpandedState", "applyExpandedBlockHeight", "", "instantly", "heightConstraint", "Lgg/essential/elementa/constraints/HeightConstraint;", "collapse", "expand", "getDefaultWidth", "", "getMaxItemWidth", "select", "index", "essential", "optionContainer", "text" })
public final class EssentialDropDown extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final List<String> options;
    private final int maxDisplayOptions;
    @NotNull
    private final State<Boolean> writableExpandedState;
    @NotNull
    private final BasicState<Boolean> dropdownAnimating;
    private int animationCounter;
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
    private final MappedState<Boolean, ImageFactory> iconState;
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
    
    public EssentialDropDown(final int initialSelection, @NotNull final List<String> options, final byte maxDisplayOptions) {
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
        //    15: putfield        gg/essential/gui/common/EssentialDropDown.options:Ljava/util/List;
        //    18: aload_0         /* this */
        //    19: bipush          6
        //    21: putfield        gg/essential/gui/common/EssentialDropDown.maxDisplayOptions:I
        //    24: aload_0         /* this */
        //    25: new             Lgg/essential/elementa/state/BasicState;
        //    28: dup            
        //    29: iconst_0       
        //    30: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    33: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    36: checkcast       Lgg/essential/elementa/state/State;
        //    39: putfield        gg/essential/gui/common/EssentialDropDown.writableExpandedState:Lgg/essential/elementa/state/State;
        //    42: aload_0         /* this */
        //    43: new             Lgg/essential/elementa/state/BasicState;
        //    46: dup            
        //    47: iconst_0       
        //    48: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    51: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    54: putfield        gg/essential/gui/common/EssentialDropDown.dropdownAnimating:Lgg/essential/elementa/state/BasicState;
        //    57: aload_0         /* this */
        //    58: new             Lgg/essential/elementa/state/BasicState;
        //    61: dup            
        //    62: iload_1         /* initialSelection */
        //    63: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    66: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    69: checkcast       Lgg/essential/elementa/state/State;
        //    72: putfield        gg/essential/gui/common/EssentialDropDown.selectedIndex:Lgg/essential/elementa/state/State;
        //    75: aload_0         /* this */
        //    76: aload_0         /* this */
        //    77: getfield        gg/essential/gui/common/EssentialDropDown.selectedIndex:Lgg/essential/elementa/state/State;
        //    80: new             Lgg/essential/gui/common/EssentialDropDown$selectedText$1;
        //    83: dup            
        //    84: aload_0         /* this */
        //    85: invokespecial   gg/essential/gui/common/EssentialDropDown$selectedText$1.<init>:(Lgg/essential/gui/common/EssentialDropDown;)V
        //    88: checkcast       Lkotlin/jvm/functions/Function1;
        //    91: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    94: checkcast       Lgg/essential/elementa/state/State;
        //    97: putfield        gg/essential/gui/common/EssentialDropDown.selectedText:Lgg/essential/elementa/state/State;
        //   100: aload_0         /* this */
        //   101: new             Lgg/essential/gui/common/ReadOnlyState;
        //   104: dup            
        //   105: aload_0         /* this */
        //   106: getfield        gg/essential/gui/common/EssentialDropDown.writableExpandedState:Lgg/essential/elementa/state/State;
        //   109: invokespecial   gg/essential/gui/common/ReadOnlyState.<init>:(Lgg/essential/elementa/state/State;)V
        //   112: putfield        gg/essential/gui/common/EssentialDropDown.expandedState:Lgg/essential/gui/common/ReadOnlyState;
        //   115: aload_0         /* this */
        //   116: new             Lgg/essential/elementa/components/UIContainer;
        //   119: dup            
        //   120: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   123: checkcast       Lgg/essential/elementa/UIComponent;
        //   126: astore          $this$constrain$iv
        //   128: aload           $this$constrain$iv
        //   130: astore          5
        //   132: aload           5
        //   134: astore          $this$constrain_u24lambda_u2d0$iv
        //   136: aload           $this$constrain_u24lambda_u2d0$iv
        //   138: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   141: astore          8
        //   143: astore          18
        //   145: aload           $this$selectedArea_delegate_u24lambda_u2d0
        //   147: bipush          100
        //   149: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   152: checkcast       Ljava/lang/Number;
        //   155: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   158: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   161: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   164: aload           $this$selectedArea_delegate_u24lambda_u2d0
        //   166: bipush          17
        //   168: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   171: checkcast       Ljava/lang/Number;
        //   174: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   177: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   180: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   183: aload           18
        //   185: aload           5
        //   187: aload_0         /* this */
        //   188: checkcast       Lgg/essential/elementa/UIComponent;
        //   191: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   194: aload_0         /* this */
        //   195: getstatic       gg/essential/gui/common/EssentialDropDown.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   198: iconst_0       
        //   199: aaload         
        //   200: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   203: putfield        gg/essential/gui/common/EssentialDropDown.selectedArea$delegate:Lkotlin/properties/ReadWriteProperty;
        //   206: aload_0         /* this */
        //   207: aload_0         /* this */
        //   208: invokespecial   gg/essential/gui/common/EssentialDropDown.getSelectedArea:()Lgg/essential/elementa/components/UIContainer;
        //   211: checkcast       Lgg/essential/elementa/UIComponent;
        //   214: iconst_0       
        //   215: iconst_0       
        //   216: iconst_3       
        //   217: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   220: putfield        gg/essential/gui/common/EssentialDropDown.selectAreaHovered:Lgg/essential/elementa/state/State;
        //   223: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   226: dup            
        //   227: aconst_null    
        //   228: iconst_0       
        //   229: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //   232: iconst_0       
        //   233: iconst_0       
        //   234: iconst_0       
        //   235: bipush          59
        //   237: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   240: aload_0         /* this */
        //   241: getfield        gg/essential/gui/common/EssentialDropDown.selectedText:Lgg/essential/elementa/state/State;
        //   244: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   247: checkcast       Lgg/essential/elementa/UIComponent;
        //   250: astore          $this$constrain$iv
        //   252: aload           $this$constrain$iv
        //   254: astore          5
        //   256: aload           5
        //   258: astore          $this$constrain_u24lambda_u2d0$iv
        //   260: aload           $this$constrain_u24lambda_u2d0$iv
        //   262: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   265: astore          $this$currentSelectionText_delegate_u24lambda_u2d1
        //   267: aload           $this$currentSelectionText_delegate_u24lambda_u2d1
        //   269: iconst_5       
        //   270: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   273: checkcast       Ljava/lang/Number;
        //   276: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   279: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   282: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   285: aload           $this$currentSelectionText_delegate_u24lambda_u2d1
        //   287: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   290: dup            
        //   291: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   294: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   297: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   300: aload           $this$currentSelectionText_delegate_u24lambda_u2d1
        //   302: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   305: aload_0         /* this */
        //   306: getfield        gg/essential/gui/common/EssentialDropDown.selectAreaHovered:Lgg/essential/elementa/state/State;
        //   309: aload_0         /* this */
        //   310: getfield        gg/essential/gui/common/EssentialDropDown.writableExpandedState:Lgg/essential/elementa/state/State;
        //   313: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   316: checkcast       Lgg/essential/elementa/state/State;
        //   319: invokevirtual   gg/essential/gui/EssentialPalette.getTextColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   322: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   325: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   328: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   331: aload           5
        //   333: aload_0         /* this */
        //   334: invokespecial   gg/essential/gui/common/EssentialDropDown.getSelectedArea:()Lgg/essential/elementa/components/UIContainer;
        //   337: checkcast       Lgg/essential/elementa/UIComponent;
        //   340: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   343: aload_0         /* this */
        //   344: getstatic       gg/essential/gui/common/EssentialDropDown.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   347: iconst_1       
        //   348: aaload         
        //   349: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   352: pop            
        //   353: aload_0         /* this */
        //   354: aload_0         /* this */
        //   355: getfield        gg/essential/gui/common/EssentialDropDown.writableExpandedState:Lgg/essential/elementa/state/State;
        //   358: getstatic       gg/essential/gui/common/EssentialDropDown$iconState$1.INSTANCE:Lgg/essential/gui/common/EssentialDropDown$iconState$1;
        //   361: checkcast       Lkotlin/jvm/functions/Function1;
        //   364: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   367: putfield        gg/essential/gui/common/EssentialDropDown.iconState:Lgg/essential/elementa/state/MappedState;
        //   370: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //   373: dup            
        //   374: aload_0         /* this */
        //   375: getfield        gg/essential/gui/common/EssentialDropDown.iconState:Lgg/essential/elementa/state/MappedState;
        //   378: checkcast       Lgg/essential/elementa/state/State;
        //   381: new             Lgg/essential/elementa/state/BasicState;
        //   384: dup            
        //   385: iconst_1       
        //   386: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   389: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   392: checkcast       Lgg/essential/elementa/state/State;
        //   395: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V
        //   398: checkcast       Lgg/essential/elementa/UIComponent;
        //   401: astore          $this$constrain$iv
        //   403: aload           $this$constrain$iv
        //   405: astore          5
        //   407: aload           5
        //   409: astore          $this$constrain_u24lambda_u2d0$iv
        //   411: aload           $this$constrain_u24lambda_u2d0$iv
        //   413: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   416: astore          $this$downArrow_delegate_u24lambda_u2d2
        //   418: aload           $this$downArrow_delegate_u24lambda_u2d2
        //   420: iconst_5       
        //   421: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   424: checkcast       Ljava/lang/Number;
        //   427: iconst_1       
        //   428: iconst_0       
        //   429: iconst_2       
        //   430: aconst_null    
        //   431: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   434: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   437: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   440: aload           $this$downArrow_delegate_u24lambda_u2d2
        //   442: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   445: dup            
        //   446: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   449: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   452: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   455: aload           5
        //   457: checkcast       Lgg/essential/gui/common/shadow/ShadowIcon;
        //   460: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   463: aload_0         /* this */
        //   464: getfield        gg/essential/gui/common/EssentialDropDown.selectAreaHovered:Lgg/essential/elementa/state/State;
        //   467: invokevirtual   gg/essential/gui/EssentialPalette.getTextColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   470: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
        //   473: new             Lgg/essential/elementa/state/BasicState;
        //   476: dup            
        //   477: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //   480: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   483: checkcast       Lgg/essential/elementa/state/State;
        //   486: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindShadowColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
        //   489: checkcast       Lgg/essential/elementa/UIComponent;
        //   492: aload_0         /* this */
        //   493: invokespecial   gg/essential/gui/common/EssentialDropDown.getSelectedArea:()Lgg/essential/elementa/components/UIContainer;
        //   496: checkcast       Lgg/essential/elementa/UIComponent;
        //   499: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   502: aload_0         /* this */
        //   503: getstatic       gg/essential/gui/common/EssentialDropDown.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   506: iconst_2       
        //   507: aaload         
        //   508: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   511: pop            
        //   512: aload_0         /* this */
        //   513: new             Lgg/essential/elementa/components/UIBlock;
        //   516: dup            
        //   517: getstatic       gg/essential/gui/EssentialPalette.BUTTON_HIGHLIGHT:Ljava/awt/Color;
        //   520: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   523: checkcast       Lgg/essential/elementa/UIComponent;
        //   526: astore          $this$constrain$iv
        //   528: aload           $this$constrain$iv
        //   530: astore          5
        //   532: aload           5
        //   534: astore          $this$constrain_u24lambda_u2d0$iv
        //   536: aload           $this$constrain_u24lambda_u2d0$iv
        //   538: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   541: astore          8
        //   543: astore          18
        //   545: aload           $this$expandedBlock_delegate_u24lambda_u2d3
        //   547: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   550: dup            
        //   551: fconst_0       
        //   552: iconst_0       
        //   553: iconst_3       
        //   554: aconst_null    
        //   555: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   558: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   561: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   564: aload           $this$expandedBlock_delegate_u24lambda_u2d3
        //   566: bipush          100
        //   568: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   571: checkcast       Ljava/lang/Number;
        //   574: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   577: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   580: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   583: aload           $this$expandedBlock_delegate_u24lambda_u2d3
        //   585: iconst_0       
        //   586: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   589: checkcast       Ljava/lang/Number;
        //   592: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   595: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   598: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   601: aload           18
        //   603: aload           5
        //   605: aload_0         /* this */
        //   606: getfield        gg/essential/gui/common/EssentialDropDown.writableExpandedState:Lgg/essential/elementa/state/State;
        //   609: aload_0         /* this */
        //   610: getfield        gg/essential/gui/common/EssentialDropDown.dropdownAnimating:Lgg/essential/elementa/state/BasicState;
        //   613: checkcast       Lgg/essential/elementa/state/State;
        //   616: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   619: checkcast       Lgg/essential/elementa/state/State;
        //   622: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindFloating:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/UIComponent;
        //   625: aload_0         /* this */
        //   626: checkcast       Lgg/essential/elementa/UIComponent;
        //   629: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   632: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   635: dup            
        //   636: aconst_null    
        //   637: iconst_0       
        //   638: iconst_3       
        //   639: aconst_null    
        //   640: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   643: checkcast       Lgg/essential/elementa/effects/Effect;
        //   646: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   649: aload_0         /* this */
        //   650: getstatic       gg/essential/gui/common/EssentialDropDown.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   653: iconst_3       
        //   654: aaload         
        //   655: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   658: putfield        gg/essential/gui/common/EssentialDropDown.expandedBlock$delegate:Lkotlin/properties/ReadWriteProperty;
        //   661: aload_0         /* this */
        //   662: new             Lgg/essential/elementa/components/UIContainer;
        //   665: dup            
        //   666: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   669: checkcast       Lgg/essential/elementa/UIComponent;
        //   672: astore          $this$constrain$iv
        //   674: aload           $this$constrain$iv
        //   676: astore          5
        //   678: aload           5
        //   680: astore          $this$constrain_u24lambda_u2d0$iv
        //   682: aload           $this$constrain_u24lambda_u2d0$iv
        //   684: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   687: astore          8
        //   689: astore          18
        //   691: aload           $this$scrollerContainer_delegate_u24lambda_u2d4
        //   693: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   696: dup            
        //   697: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   700: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   703: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   706: aload           $this$scrollerContainer_delegate_u24lambda_u2d4
        //   708: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   711: dup            
        //   712: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   715: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   718: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   721: aload           $this$scrollerContainer_delegate_u24lambda_u2d4
        //   723: bipush          100
        //   725: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   728: checkcast       Ljava/lang/Number;
        //   731: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   734: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   737: iconst_4       
        //   738: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   741: checkcast       Ljava/lang/Number;
        //   744: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   747: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   750: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   753: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   756: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   759: aload           $this$scrollerContainer_delegate_u24lambda_u2d4
        //   761: bipush          100
        //   763: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   766: checkcast       Ljava/lang/Number;
        //   769: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   772: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   775: iconst_4       
        //   776: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   779: checkcast       Ljava/lang/Number;
        //   782: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   785: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   788: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   791: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   794: iconst_0       
        //   795: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   798: checkcast       Ljava/lang/Number;
        //   801: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   804: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   807: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtLeast:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtLeastConstraint;
        //   810: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   813: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   816: aload           18
        //   818: aload           5
        //   820: aload_0         /* this */
        //   821: invokespecial   gg/essential/gui/common/EssentialDropDown.getExpandedBlock:()Lgg/essential/elementa/components/UIBlock;
        //   824: checkcast       Lgg/essential/elementa/UIComponent;
        //   827: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   830: aload_0         /* this */
        //   831: getstatic       gg/essential/gui/common/EssentialDropDown.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   834: iconst_4       
        //   835: aaload         
        //   836: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   839: putfield        gg/essential/gui/common/EssentialDropDown.scrollerContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   842: aload_0         /* this */
        //   843: new             Lgg/essential/elementa/components/ScrollComponent;
        //   846: dup            
        //   847: aconst_null    
        //   848: fconst_0       
        //   849: aconst_null    
        //   850: iconst_0       
        //   851: iconst_0       
        //   852: iconst_0       
        //   853: iconst_0       
        //   854: fconst_0       
        //   855: fconst_0       
        //   856: aconst_null    
        //   857: sipush          1023
        //   860: aconst_null    
        //   861: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   864: checkcast       Lgg/essential/elementa/UIComponent;
        //   867: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   870: astore          $this$constrain$iv
        //   872: aload           $this$constrain$iv
        //   874: astore          5
        //   876: aload           5
        //   878: astore          $this$constrain_u24lambda_u2d0$iv
        //   880: aload           $this$constrain_u24lambda_u2d0$iv
        //   882: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   885: astore          8
        //   887: astore          18
        //   889: aload           $this$scroller_delegate_u24lambda_u2d5
        //   891: bipush          100
        //   893: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   896: checkcast       Ljava/lang/Number;
        //   899: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   902: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   905: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   908: aload           $this$scroller_delegate_u24lambda_u2d5
        //   910: bipush          100
        //   912: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   915: checkcast       Ljava/lang/Number;
        //   918: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   921: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   924: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   927: aload           18
        //   929: aload           5
        //   931: aload_0         /* this */
        //   932: invokespecial   gg/essential/gui/common/EssentialDropDown.getScrollerContainer:()Lgg/essential/elementa/components/UIContainer;
        //   935: checkcast       Lgg/essential/elementa/UIComponent;
        //   938: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   941: aload_0         /* this */
        //   942: getstatic       gg/essential/gui/common/EssentialDropDown.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   945: iconst_5       
        //   946: aaload         
        //   947: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   950: putfield        gg/essential/gui/common/EssentialDropDown.scroller$delegate:Lkotlin/properties/ReadWriteProperty;
        //   953: aload_0         /* this */
        //   954: new             Lgg/essential/elementa/components/UIBlock;
        //   957: dup            
        //   958: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //   961: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   964: checkcast       Lgg/essential/elementa/UIComponent;
        //   967: astore          $this$constrain$iv
        //   969: aload           $this$constrain$iv
        //   971: astore          5
        //   973: aload           5
        //   975: astore          $this$constrain_u24lambda_u2d0$iv
        //   977: aload           $this$constrain_u24lambda_u2d0$iv
        //   979: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   982: astore          8
        //   984: astore          18
        //   986: aload           $this$expandedContentArea_delegate_u24lambda_u2d6
        //   988: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   991: dup            
        //   992: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   995: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   998: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1001: aload           $this$expandedContentArea_delegate_u24lambda_u2d6
        //  1003: bipush          100
        //  1005: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1008: checkcast       Ljava/lang/Number;
        //  1011: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1014: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1017: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1020: aload           $this$expandedContentArea_delegate_u24lambda_u2d6
        //  1022: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1025: dup            
        //  1026: fconst_0       
        //  1027: iconst_1       
        //  1028: aconst_null    
        //  1029: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1032: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1035: bipush          6
        //  1037: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1040: checkcast       Ljava/lang/Number;
        //  1043: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1046: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1049: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1052: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1055: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1058: aload           18
        //  1060: aload           5
        //  1062: aload_0         /* this */
        //  1063: invokespecial   gg/essential/gui/common/EssentialDropDown.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //  1066: checkcast       Lgg/essential/elementa/UIComponent;
        //  1069: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1072: aload_0         /* this */
        //  1073: getstatic       gg/essential/gui/common/EssentialDropDown.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1076: bipush          6
        //  1078: aaload         
        //  1079: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1082: putfield        gg/essential/gui/common/EssentialDropDown.expandedContentArea$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1085: aload_0         /* this */
        //  1086: new             Lgg/essential/elementa/components/UIContainer;
        //  1089: dup            
        //  1090: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1093: checkcast       Lgg/essential/elementa/UIComponent;
        //  1096: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1099: astore          $this$constrain$iv
        //  1101: aload           $this$constrain$iv
        //  1103: astore          5
        //  1105: aload           5
        //  1107: astore          $this$constrain_u24lambda_u2d0$iv
        //  1109: aload           $this$constrain_u24lambda_u2d0$iv
        //  1111: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1114: astore          8
        //  1116: astore          18
        //  1118: aload           $this$expandedContent_delegate_u24lambda_u2d7
        //  1120: bipush          100
        //  1122: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1125: checkcast       Ljava/lang/Number;
        //  1128: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1131: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1134: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1137: aload           $this$expandedContent_delegate_u24lambda_u2d7
        //  1139: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1142: dup            
        //  1143: fconst_0       
        //  1144: iconst_1       
        //  1145: aconst_null    
        //  1146: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1149: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1152: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1155: aload           18
        //  1157: aload           5
        //  1159: aload_0         /* this */
        //  1160: invokespecial   gg/essential/gui/common/EssentialDropDown.getExpandedContentArea:()Lgg/essential/elementa/components/UIBlock;
        //  1163: checkcast       Lgg/essential/elementa/UIComponent;
        //  1166: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1169: aload_0         /* this */
        //  1170: getstatic       gg/essential/gui/common/EssentialDropDown.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1173: bipush          7
        //  1175: aaload         
        //  1176: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1179: putfield        gg/essential/gui/common/EssentialDropDown.expandedContent$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1182: aload_0         /* this */
        //  1183: new             Lgg/essential/elementa/components/UIContainer;
        //  1186: dup            
        //  1187: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1190: checkcast       Lgg/essential/elementa/UIComponent;
        //  1193: astore          $this$constrain$iv
        //  1195: aload           $this$constrain$iv
        //  1197: astore          5
        //  1199: aload           5
        //  1201: astore          $this$constrain_u24lambda_u2d0$iv
        //  1203: aload           $this$constrain_u24lambda_u2d0$iv
        //  1205: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1208: astore          8
        //  1210: astore          18
        //  1212: aload           $this$scrollbarContainer_delegate_u24lambda_u2d8
        //  1214: iconst_0       
        //  1215: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1218: checkcast       Ljava/lang/Number;
        //  1221: iconst_1       
        //  1222: iconst_0       
        //  1223: iconst_2       
        //  1224: aconst_null    
        //  1225: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1228: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1231: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1234: aload           $this$scrollbarContainer_delegate_u24lambda_u2d8
        //  1236: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1239: dup            
        //  1240: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1243: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1246: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1249: aload           $this$scrollbarContainer_delegate_u24lambda_u2d8
        //  1251: iconst_2       
        //  1252: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1255: checkcast       Ljava/lang/Number;
        //  1258: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1261: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1264: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1267: aload           $this$scrollbarContainer_delegate_u24lambda_u2d8
        //  1269: bipush          100
        //  1271: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1274: checkcast       Ljava/lang/Number;
        //  1277: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1280: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1283: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1286: aload           18
        //  1288: aload           5
        //  1290: astore          $this$onLeftClick$iv
        //  1292: aload           $this$onLeftClick$iv
        //  1294: new             Lgg/essential/gui/common/EssentialDropDown$special$$inlined$onLeftClick$1;
        //  1297: dup            
        //  1298: invokespecial   gg/essential/gui/common/EssentialDropDown$special$$inlined$onLeftClick$1.<init>:()V
        //  1301: checkcast       Lkotlin/jvm/functions/Function2;
        //  1304: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1307: aload_0         /* this */
        //  1308: invokespecial   gg/essential/gui/common/EssentialDropDown.getScrollerContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1311: checkcast       Lgg/essential/elementa/UIComponent;
        //  1314: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1317: aload_0         /* this */
        //  1318: getstatic       gg/essential/gui/common/EssentialDropDown.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1321: bipush          8
        //  1323: aaload         
        //  1324: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1327: putfield        gg/essential/gui/common/EssentialDropDown.scrollbarContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1330: aload_0         /* this */
        //  1331: new             Lgg/essential/elementa/components/UIBlock;
        //  1334: dup            
        //  1335: getstatic       gg/essential/gui/EssentialPalette.SCROLLBAR:Ljava/awt/Color;
        //  1338: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  1341: checkcast       Lgg/essential/elementa/UIComponent;
        //  1344: astore          $this$constrain$iv
        //  1346: aload           $this$constrain$iv
        //  1348: astore          5
        //  1350: aload           5
        //  1352: astore          $this$constrain_u24lambda_u2d0$iv
        //  1354: aload           $this$constrain_u24lambda_u2d0$iv
        //  1356: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1359: astore          8
        //  1361: astore          18
        //  1363: aload           $this$scrollbar_delegate_u24lambda_u2d10
        //  1365: bipush          100
        //  1367: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1370: checkcast       Ljava/lang/Number;
        //  1373: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1376: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1379: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1382: aload           18
        //  1384: aload           5
        //  1386: aload_0         /* this */
        //  1387: invokespecial   gg/essential/gui/common/EssentialDropDown.getScrollbarContainer:()Lgg/essential/elementa/UIComponent;
        //  1390: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1393: aload_0         /* this */
        //  1394: getstatic       gg/essential/gui/common/EssentialDropDown.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1397: bipush          9
        //  1399: aaload         
        //  1400: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1403: putfield        gg/essential/gui/common/EssentialDropDown.scrollbar$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1406: aload_0         /* this */
        //  1407: aload_0         /* this */
        //  1408: getfield        gg/essential/gui/common/EssentialDropDown.options:Ljava/util/List;
        //  1411: invokeinterface java/util/List.size:()I
        //  1416: bipush          6
        //  1418: if_icmple       1425
        //  1421: iconst_1       
        //  1422: goto            1426
        //  1425: iconst_0       
        //  1426: putfield        gg/essential/gui/common/EssentialDropDown.scrollable:Z
        //  1429: aload_0         /* this */
        //  1430: checkcast       Lgg/essential/elementa/UIComponent;
        //  1433: astore          $this$constrain$iv
        //  1435: aload           $this$constrain$iv
        //  1437: astore          5
        //  1439: aload           5
        //  1441: astore          $this$constrain_u24lambda_u2d0$iv
        //  1443: aload           $this$constrain_u24lambda_u2d0$iv
        //  1445: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1448: astore          $this$_init__u24lambda_u2d12
        //  1450: aload           $this$_init__u24lambda_u2d12
        //  1452: aload_0         /* this */
        //  1453: invokevirtual   gg/essential/gui/common/EssentialDropDown.getDefaultWidth:()F
        //  1456: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1459: checkcast       Ljava/lang/Number;
        //  1462: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1465: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1468: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1471: aload           $this$_init__u24lambda_u2d12
        //  1473: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1476: dup            
        //  1477: fconst_0       
        //  1478: iconst_1       
        //  1479: aconst_null    
        //  1480: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1483: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1486: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1489: aload_0         /* this */
        //  1490: aload_0         /* this */
        //  1491: getfield        gg/essential/gui/common/EssentialDropDown.selectAreaHovered:Lgg/essential/elementa/state/State;
        //  1494: aload_0         /* this */
        //  1495: getfield        gg/essential/gui/common/EssentialDropDown.expandedState:Lgg/essential/gui/common/ReadOnlyState;
        //  1498: checkcast       Lgg/essential/elementa/state/State;
        //  1501: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1504: getstatic       gg/essential/gui/common/EssentialDropDown$2.INSTANCE:Lgg/essential/gui/common/EssentialDropDown$2;
        //  1507: checkcast       Lkotlin/jvm/functions/Function1;
        //  1510: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1513: checkcast       Lgg/essential/elementa/state/State;
        //  1516: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1519: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1522: invokevirtual   gg/essential/gui/common/EssentialDropDown.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //  1525: pop            
        //  1526: aload_0         /* this */
        //  1527: getfield        gg/essential/gui/common/EssentialDropDown.scrollable:Z
        //  1530: ifeq            1548
        //  1533: aload_0         /* this */
        //  1534: invokespecial   gg/essential/gui/common/EssentialDropDown.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //  1537: aload_0         /* this */
        //  1538: invokespecial   gg/essential/gui/common/EssentialDropDown.getScrollbar:()Lgg/essential/elementa/components/UIBlock;
        //  1541: checkcast       Lgg/essential/elementa/UIComponent;
        //  1544: iconst_0       
        //  1545: invokevirtual   gg/essential/elementa/components/ScrollComponent.setVerticalScrollBarComponent:(Lgg/essential/elementa/UIComponent;Z)V
        //  1548: aload_0         /* this */
        //  1549: getfield        gg/essential/gui/common/EssentialDropDown.options:Ljava/util/List;
        //  1552: checkcast       Ljava/lang/Iterable;
        //  1555: invokestatic    kotlin/collections/CollectionsKt.withIndex:(Ljava/lang/Iterable;)Ljava/lang/Iterable;
        //  1558: astore          $this$forEach$iv
        //  1560: aload           $this$forEach$iv
        //  1562: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1567: astore          5
        //  1569: aload           5
        //  1571: invokeinterface java/util/Iterator.hasNext:()Z
        //  1576: ifeq            1920
        //  1579: aload           5
        //  1581: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1586: astore          element$iv
        //  1588: aload           element$iv
        //  1590: checkcast       Lkotlin/collections/IndexedValue;
        //  1593: astore          7
        //  1595: aload           7
        //  1597: invokevirtual   kotlin/collections/IndexedValue.component1:()I
        //  1600: istore          index
        //  1602: aload           7
        //  1604: invokevirtual   kotlin/collections/IndexedValue.component2:()Ljava/lang/Object;
        //  1607: checkcast       Ljava/lang/String;
        //  1610: astore          value
        //  1612: new             Lgg/essential/elementa/components/UIBlock;
        //  1615: dup            
        //  1616: aconst_null    
        //  1617: iconst_1       
        //  1618: aconst_null    
        //  1619: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1622: checkcast       Lgg/essential/elementa/UIComponent;
        //  1625: astore          $this$constrain$iv
        //  1627: aload           $this$constrain$iv
        //  1629: astore          12
        //  1631: aload           12
        //  1633: astore          $this$constrain_u24lambda_u2d0$iv
        //  1635: aload           $this$constrain_u24lambda_u2d0$iv
        //  1637: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1640: astore          $this$lambda_u2d18_u24lambda_u2d13
        //  1642: aload           $this$lambda_u2d18_u24lambda_u2d13
        //  1644: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1647: dup            
        //  1648: fconst_0       
        //  1649: iconst_0       
        //  1650: iconst_3       
        //  1651: aconst_null    
        //  1652: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1655: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1658: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1661: aload           $this$lambda_u2d18_u24lambda_u2d13
        //  1663: bipush          100
        //  1665: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1668: checkcast       Ljava/lang/Number;
        //  1671: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1674: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1677: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1680: aload           $this$lambda_u2d18_u24lambda_u2d13
        //  1682: bipush          20
        //  1684: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1687: checkcast       Ljava/lang/Number;
        //  1690: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1693: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1696: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1699: aload           12
        //  1701: astore          $this$onLeftClick$iv
        //  1703: aload           $this$onLeftClick$iv
        //  1705: new             Lgg/essential/gui/common/EssentialDropDown$_init_$lambda-18$$inlined$onLeftClick$1;
        //  1708: dup            
        //  1709: aload_0         /* this */
        //  1710: iload           index
        //  1712: invokespecial   gg/essential/gui/common/EssentialDropDown$_init_$lambda-18$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/common/EssentialDropDown;I)V
        //  1715: checkcast       Lkotlin/jvm/functions/Function2;
        //  1718: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1721: aload_0         /* this */
        //  1722: invokespecial   gg/essential/gui/common/EssentialDropDown.getExpandedContent:()Lgg/essential/elementa/components/UIContainer;
        //  1725: checkcast       Lgg/essential/elementa/UIComponent;
        //  1728: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1731: aconst_null    
        //  1732: getstatic       gg/essential/gui/common/EssentialDropDown.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1735: bipush          10
        //  1737: aaload         
        //  1738: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1741: astore          optionContainer$delegate
        //  1743: aload           optionContainer$delegate
        //  1745: invokestatic    gg/essential/gui/common/EssentialDropDown.lambda-18$lambda-15:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //  1748: iconst_0       
        //  1749: iconst_0       
        //  1750: iconst_3       
        //  1751: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //  1754: astore          hovered
        //  1756: aload           optionContainer$delegate
        //  1758: invokestatic    gg/essential/gui/common/EssentialDropDown.lambda-18$lambda-15:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //  1761: aload           hovered
        //  1763: getstatic       gg/essential/gui/common/EssentialDropDown$3$1.INSTANCE:Lgg/essential/gui/common/EssentialDropDown$3$1;
        //  1766: checkcast       Lkotlin/jvm/functions/Function1;
        //  1769: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1772: checkcast       Lgg/essential/elementa/state/State;
        //  1775: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1778: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1781: invokevirtual   gg/essential/elementa/UIComponent.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //  1784: pop            
        //  1785: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1788: dup            
        //  1789: aload           value
        //  1791: iconst_0       
        //  1792: aconst_null    
        //  1793: iconst_0       
        //  1794: iconst_0       
        //  1795: iconst_0       
        //  1796: bipush          62
        //  1798: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  1801: checkcast       Lgg/essential/elementa/UIComponent;
        //  1804: astore          $this$constrain$iv
        //  1806: aload           $this$constrain$iv
        //  1808: astore          14
        //  1810: aload           14
        //  1812: astore          $this$constrain_u24lambda_u2d0$iv
        //  1814: aload           $this$constrain_u24lambda_u2d0$iv
        //  1816: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1819: astore          $this$lambda_u2d18_u24lambda_u2d16
        //  1821: aload           $this$lambda_u2d18_u24lambda_u2d16
        //  1823: iconst_5       
        //  1824: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1827: checkcast       Ljava/lang/Number;
        //  1830: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1833: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1836: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1839: aload           $this$lambda_u2d18_u24lambda_u2d16
        //  1841: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1844: dup            
        //  1845: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1848: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1851: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1854: aload           $this$lambda_u2d18_u24lambda_u2d16
        //  1856: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //  1859: aload           hovered
        //  1861: invokevirtual   gg/essential/gui/EssentialPalette.getTextColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //  1864: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1867: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1870: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1873: aload           14
        //  1875: checkcast       Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1878: aload           hovered
        //  1880: getstatic       gg/essential/gui/common/EssentialDropDown$3$text$3.INSTANCE:Lgg/essential/gui/common/EssentialDropDown$3$text$3;
        //  1883: checkcast       Lkotlin/jvm/functions/Function1;
        //  1886: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1889: checkcast       Lgg/essential/elementa/state/State;
        //  1892: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindShadowColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //  1895: checkcast       Lgg/essential/elementa/UIComponent;
        //  1898: aload           optionContainer$delegate
        //  1900: invokestatic    gg/essential/gui/common/EssentialDropDown.lambda-18$lambda-15:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //  1903: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1906: aconst_null    
        //  1907: getstatic       gg/essential/gui/common/EssentialDropDown.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1910: bipush          11
        //  1912: aaload         
        //  1913: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1916: pop            
        //  1917: goto            1569
        //  1920: aload_0         /* this */
        //  1921: invokespecial   gg/essential/gui/common/EssentialDropDown.getSelectedArea:()Lgg/essential/elementa/components/UIContainer;
        //  1924: checkcast       Lgg/essential/elementa/UIComponent;
        //  1927: astore          $this$onLeftClick$iv
        //  1929: aload           $this$onLeftClick$iv
        //  1931: new             Lgg/essential/gui/common/EssentialDropDown$special$$inlined$onLeftClick$2;
        //  1934: dup            
        //  1935: aload_0         /* this */
        //  1936: invokespecial   gg/essential/gui/common/EssentialDropDown$special$$inlined$onLeftClick$2.<init>:(Lgg/essential/gui/common/EssentialDropDown;)V
        //  1939: checkcast       Lkotlin/jvm/functions/Function2;
        //  1942: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1945: pop            
        //  1946: return         
        //    Signature:
        //  (ILjava/util/List<Ljava/lang/String;>;B)V
        //    MethodParameters:
        //  Name               Flags  
        //  -----------------  -----
        //  initialSelection   
        //  options            
        //  maxDisplayOptions  
        //    StackMapTable: 00 05 FF 05 91 00 01 07 00 02 00 01 07 00 02 FF 00 00 00 01 07 00 02 00 02 07 00 02 01 FB 00 79 FF 00 14 00 06 07 00 02 00 00 00 00 07 01 CC 00 00 FF 01 5E 00 01 07 00 02 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public EssentialDropDown(final int initialSelection, final List options) {
        this(initialSelection, options, (byte)0);
    }
    
    @NotNull
    public final State<Integer> getSelectedIndex() {
        return this.selectedIndex;
    }
    
    private final UIContainer getSelectedArea() {
        return (UIContainer)this.selectedArea$delegate.getValue((Object)this, (KProperty)EssentialDropDown.$$delegatedProperties[0]);
    }
    
    private final UIBlock getExpandedBlock() {
        return (UIBlock)this.expandedBlock$delegate.getValue((Object)this, (KProperty)EssentialDropDown.$$delegatedProperties[3]);
    }
    
    private final UIContainer getScrollerContainer() {
        return (UIContainer)this.scrollerContainer$delegate.getValue((Object)this, (KProperty)EssentialDropDown.$$delegatedProperties[4]);
    }
    
    private final ScrollComponent getScroller() {
        return (ScrollComponent)this.scroller$delegate.getValue((Object)this, (KProperty)EssentialDropDown.$$delegatedProperties[5]);
    }
    
    private final UIBlock getExpandedContentArea() {
        return (UIBlock)this.expandedContentArea$delegate.getValue((Object)this, (KProperty)EssentialDropDown.$$delegatedProperties[6]);
    }
    
    private final UIContainer getExpandedContent() {
        return (UIContainer)this.expandedContent$delegate.getValue((Object)this, (KProperty)EssentialDropDown.$$delegatedProperties[7]);
    }
    
    private final UIComponent getScrollbarContainer() {
        return (UIComponent)this.scrollbarContainer$delegate.getValue((Object)this, (KProperty)EssentialDropDown.$$delegatedProperties[8]);
    }
    
    private final UIBlock getScrollbar() {
        return (UIBlock)this.scrollbar$delegate.getValue((Object)this, (KProperty)EssentialDropDown.$$delegatedProperties[9]);
    }
    
    private final float getMaxItemWidth() {
        final Iterator iterator = this.options.iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        final String it = (String)iterator.next();
        float a = UtilitiesKt.width$default(it, 0.0f, null, 3, null);
        while (iterator.hasNext()) {
            final String it2 = (String)iterator.next();
            a = Math.max(a, UtilitiesKt.width$default(it2, 0.0f, null, 3, null));
        }
        return a;
    }
    
    public final float getDefaultWidth() {
        return this.getMaxItemWidth() + 25.0f;
    }
    
    public final void select(final int index) {
        if (0 <= index && index < this.options.size()) {
            this.selectedIndex.set(index);
            this.collapse$1385ff();
        }
    }
    
    public final void expand$1385ff() {
        this.writableExpandedState.set(true);
        this.applyExpandedBlockHeight(false, ConstraintsKt.plus(UtilitiesKt.getPixels(RangesKt.coerceAtMost(this.options.size(), 6) * 20), UtilitiesKt.getPixels(10)));
    }
    
    public static /* synthetic */ void expand$default$9b419f8$5d69b91c(final EssentialDropDown essentialDropDown) {
        essentialDropDown.expand$1385ff();
    }
    
    public final void collapse$1385ff() {
        this.writableExpandedState.set(false);
        this.applyExpandedBlockHeight(false, UtilitiesKt.getPixels(0));
    }
    
    public static /* synthetic */ void collapse$default$9b419f8$5d69b91c(final EssentialDropDown essentialDropDown) {
        essentialDropDown.collapse$1385ff();
    }
    
    private final void applyExpandedBlockHeight(final boolean instantly, final HeightConstraint heightConstraint) {
        ++this.animationCounter;
        final int counterInstance = this.animationCounter;
        this.dropdownAnimating.set(true);
        final UIComponent $this$animate_u24lambda_u2d0$iv;
        final UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this.getExpandedBlock();
        final AnimatingConstraints $this$applyExpandedBlockHeight_u24lambda_u2d20;
        final AnimatingConstraints anim$iv = $this$applyExpandedBlockHeight_u24lambda_u2d20 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        AnimatingConstraints.setHeightAnimation$default($this$applyExpandedBlockHeight_u24lambda_u2d20, Animations.OUT_EXP, 0.25f, heightConstraint, 0.0f, 8, null);
        $this$applyExpandedBlockHeight_u24lambda_u2d20.onComplete((Function0<Unit>)new EssentialDropDown$applyExpandedBlockHeight$1.EssentialDropDown$applyExpandedBlockHeight$1$1(counterInstance, this));
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    private static final UIComponent lambda-18$lambda-15(final ReadWriteProperty<Object, UIComponent> $optionContainer$delegate) {
        return (UIComponent)$optionContainer$delegate.getValue((Object)null, (KProperty)EssentialDropDown.$$delegatedProperties[10]);
    }
    
    public static final /* synthetic */ State access$getWritableExpandedState$p(final EssentialDropDown $this) {
        return $this.writableExpandedState;
    }
    
    public static final /* synthetic */ int access$getAnimationCounter$p(final EssentialDropDown $this) {
        return $this.animationCounter;
    }
    
    public static final /* synthetic */ BasicState access$getDropdownAnimating$p(final EssentialDropDown $this) {
        return $this.dropdownAnimating;
    }
    
    public static final /* synthetic */ List access$getOptions$p(final EssentialDropDown $this) {
        return $this.options;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialDropDown.class, "selectedArea", "getSelectedArea()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialDropDown.class, "currentSelectionText", "getCurrentSelectionText()Lgg/essential/elementa/components/UIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialDropDown.class, "downArrow", "getDownArrow()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialDropDown.class, "expandedBlock", "getExpandedBlock()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialDropDown.class, "scrollerContainer", "getScrollerContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialDropDown.class, "scroller", "getScroller()Lgg/essential/elementa/components/ScrollComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialDropDown.class, "expandedContentArea", "getExpandedContentArea()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialDropDown.class, "expandedContent", "getExpandedContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialDropDown.class, "scrollbarContainer", "getScrollbarContainer()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialDropDown.class, "scrollbar", "getScrollbar()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)EssentialDropDown.class, "optionContainer", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)EssentialDropDown.class, "text", "<v#1>", 0)) };
    }
}
