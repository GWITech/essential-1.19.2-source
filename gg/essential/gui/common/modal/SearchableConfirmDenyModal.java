package gg.essential.gui.common.modal;

import kotlin.*;
import kotlin.reflect.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import gg.essential.gui.common.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000P
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000203R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000b\u0010\f\u001a\u0004\b	\u0010
                                                   R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010
                                                   R\u001b\u0010\u0010\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010
                                                   R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001c\u0010\f\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b!\u0010\f\u001a\u0004\b\u001f\u0010 R\u001b\u0010"\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b$\u0010\f\u001a\u0004\b#\u0010 R\u001b\u0010%\u001a\u00020&8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b)\u0010\f\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b,\u0010\f\u001a\u0004\b+\u0010 R\u001b\u0010-\u001a\u00020.8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b1\u0010\f\u001a\u0004\b/\u00100¨\u00065""" }, d2 = { "Lgg/essential/gui/common/modal/SearchableConfirmDenyModal;", "Lgg/essential/gui/common/modal/ConfirmDenyModal;", "requiresButtonPress", "", "fadeTime", "", "(ZF)V", "bottomSpacer", "Lgg/essential/gui/common/Spacer;", "getBottomSpacer", "()Lgg/essential/gui/common/Spacer;", "bottomSpacer$delegate", "Lkotlin/properties/ReadWriteProperty;", "hiddenSpacer", "getHiddenSpacer", "hiddenSpacer$delegate", "middleSpacer", "getMiddleSpacer", "middleSpacer$delegate", "scrollBar", "Lgg/essential/elementa/UIComponent;", "getScrollBar", "()Lgg/essential/elementa/UIComponent;", "scrollBar$delegate", "scrollBarBackground", "Lgg/essential/elementa/components/UIBlock;", "getScrollBarBackground", "()Lgg/essential/elementa/components/UIBlock;", "scrollBarBackground$delegate", "scrollContainer", "Lgg/essential/elementa/components/UIContainer;", "getScrollContainer", "()Lgg/essential/elementa/components/UIContainer;", "scrollContainer$delegate", "scrollbarContainer", "getScrollbarContainer", "scrollbarContainer$delegate", "scroller", "Lgg/essential/elementa/components/ScrollComponent;", "getScroller", "()Lgg/essential/elementa/components/ScrollComponent;", "scroller$delegate", "searchContainer", "getSearchContainer", "searchContainer$delegate", "searchbar", "Lgg/essential/gui/common/EssentialSearchbar;", "getSearchbar", "()Lgg/essential/gui/common/EssentialSearchbar;", "searchbar$delegate", "hideSearchbar", "", "showSearchbar", "essential" })
public class SearchableConfirmDenyModal extends ConfirmDenyModal
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ReadWriteProperty searchContainer$delegate;
    @NotNull
    private final ReadWriteProperty searchbar$delegate;
    @NotNull
    private final ReadWriteProperty scrollContainer$delegate;
    @NotNull
    private final ReadWriteProperty scroller$delegate;
    @NotNull
    private final ReadWriteProperty scrollbarContainer$delegate;
    @NotNull
    private final ReadWriteProperty scrollBarBackground$delegate;
    @NotNull
    private final ReadWriteProperty scrollBar$delegate;
    @NotNull
    private final ReadWriteProperty hiddenSpacer$delegate;
    
    public SearchableConfirmDenyModal(final float fadeTime) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_0       
        //     2: fload_1         /* fadeTime */
        //     3: invokespecial   gg/essential/gui/common/modal/ConfirmDenyModal.<init>:(ZF)V
        //     6: aload_0         /* this */
        //     7: new             Lgg/essential/elementa/components/UIContainer;
        //    10: dup            
        //    11: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    14: checkcast       Lgg/essential/elementa/UIComponent;
        //    17: astore_2        /* $this$constrain$iv */
        //    18: aload_2         /* $this$constrain$iv */
        //    19: astore_3       
        //    20: aload_3        
        //    21: astore          $this$constrain_u24lambda_u2d0$iv
        //    23: aload           $this$constrain_u24lambda_u2d0$iv
        //    25: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    28: astore          5
        //    30: astore          6
        //    32: aload           $this$searchContainer_delegate_u24lambda_u2d0
        //    34: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //    37: dup            
        //    38: fconst_0       
        //    39: iconst_0       
        //    40: iconst_3       
        //    41: aconst_null    
        //    42: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    45: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    48: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    51: aload           $this$searchContainer_delegate_u24lambda_u2d0
        //    53: bipush          100
        //    55: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    58: checkcast       Ljava/lang/Number;
        //    61: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    64: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    67: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    70: aload           $this$searchContainer_delegate_u24lambda_u2d0
        //    72: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //    75: dup            
        //    76: fconst_0       
        //    77: iconst_1       
        //    78: aconst_null    
        //    79: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    82: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //    85: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //    88: aload           6
        //    90: aload_3        
        //    91: aload_0         /* this */
        //    92: invokevirtual   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getCustomContent:()Lgg/essential/elementa/components/UIContainer;
        //    95: checkcast       Lgg/essential/elementa/UIComponent;
        //    98: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   101: aload_0         /* this */
        //   102: getstatic       gg/essential/gui/common/modal/SearchableConfirmDenyModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   105: iconst_0       
        //   106: aaload         
        //   107: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   110: putfield        gg/essential/gui/common/modal/SearchableConfirmDenyModal.searchContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   113: aload_0         /* this */
        //   114: new             Lgg/essential/gui/common/EssentialSearchbar;
        //   117: dup            
        //   118: iconst_0       
        //   119: invokespecial   gg/essential/gui/common/EssentialSearchbar.<init>:(B)V
        //   122: checkcast       Lgg/essential/elementa/UIComponent;
        //   125: aload_0         /* this */
        //   126: invokespecial   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getSearchContainer:()Lgg/essential/elementa/components/UIContainer;
        //   129: checkcast       Lgg/essential/elementa/UIComponent;
        //   132: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   135: aload_0         /* this */
        //   136: getstatic       gg/essential/gui/common/modal/SearchableConfirmDenyModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   139: iconst_1       
        //   140: aaload         
        //   141: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   144: putfield        gg/essential/gui/common/modal/SearchableConfirmDenyModal.searchbar$delegate:Lkotlin/properties/ReadWriteProperty;
        //   147: new             Lgg/essential/gui/common/Spacer;
        //   150: dup            
        //   151: ldc             13.0
        //   153: invokespecial   gg/essential/gui/common/Spacer.<init>:(F)V
        //   156: checkcast       Lgg/essential/elementa/UIComponent;
        //   159: aload_0         /* this */
        //   160: invokespecial   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getSearchContainer:()Lgg/essential/elementa/components/UIContainer;
        //   163: checkcast       Lgg/essential/elementa/UIComponent;
        //   166: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   169: aload_0         /* this */
        //   170: getstatic       gg/essential/gui/common/modal/SearchableConfirmDenyModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   173: iconst_2       
        //   174: aaload         
        //   175: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   178: pop            
        //   179: aload_0         /* this */
        //   180: new             Lgg/essential/elementa/components/UIContainer;
        //   183: dup            
        //   184: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   187: checkcast       Lgg/essential/elementa/UIComponent;
        //   190: astore_2        /* $this$constrain$iv */
        //   191: aload_2         /* $this$constrain$iv */
        //   192: astore_3       
        //   193: aload_3        
        //   194: astore          $this$constrain_u24lambda_u2d0$iv
        //   196: aload           $this$constrain_u24lambda_u2d0$iv
        //   198: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   201: astore          5
        //   203: astore          6
        //   205: aload           $this$scrollContainer_delegate_u24lambda_u2d1
        //   207: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   210: dup            
        //   211: fconst_0       
        //   212: iconst_0       
        //   213: iconst_3       
        //   214: aconst_null    
        //   215: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   218: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   221: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   224: aload           $this$scrollContainer_delegate_u24lambda_u2d1
        //   226: bipush          100
        //   228: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   231: checkcast       Ljava/lang/Number;
        //   234: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   237: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   240: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   243: aload           $this$scrollContainer_delegate_u24lambda_u2d1
        //   245: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   248: dup            
        //   249: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   252: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   255: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   258: aload           6
        //   260: aload_3        
        //   261: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   264: dup            
        //   265: aconst_null    
        //   266: iconst_0       
        //   267: iconst_3       
        //   268: aconst_null    
        //   269: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   272: checkcast       Lgg/essential/elementa/effects/Effect;
        //   275: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   278: aload_0         /* this */
        //   279: invokevirtual   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getCustomContent:()Lgg/essential/elementa/components/UIContainer;
        //   282: checkcast       Lgg/essential/elementa/UIComponent;
        //   285: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   288: aload_0         /* this */
        //   289: getstatic       gg/essential/gui/common/modal/SearchableConfirmDenyModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   292: iconst_3       
        //   293: aaload         
        //   294: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   297: putfield        gg/essential/gui/common/modal/SearchableConfirmDenyModal.scrollContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   300: aload_0         /* this */
        //   301: new             Lgg/essential/elementa/components/ScrollComponent;
        //   304: dup            
        //   305: ldc             "Nothing Found"
        //   307: fconst_0       
        //   308: aconst_null    
        //   309: iconst_0       
        //   310: iconst_0       
        //   311: iconst_0       
        //   312: iconst_0       
        //   313: fconst_0       
        //   314: fconst_0       
        //   315: aconst_null    
        //   316: sipush          1022
        //   319: aconst_null    
        //   320: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   323: checkcast       Lgg/essential/elementa/UIComponent;
        //   326: astore_2        /* $this$constrain$iv */
        //   327: aload_2         /* $this$constrain$iv */
        //   328: astore_3       
        //   329: aload_3        
        //   330: astore          $this$constrain_u24lambda_u2d0$iv
        //   332: aload           $this$constrain_u24lambda_u2d0$iv
        //   334: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   337: astore          5
        //   339: astore          6
        //   341: aload           $this$scroller_delegate_u24lambda_u2d2
        //   343: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   346: dup            
        //   347: iconst_0       
        //   348: iconst_1       
        //   349: aconst_null    
        //   350: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   353: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   356: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   359: aload           $this$scroller_delegate_u24lambda_u2d2
        //   361: sipush          148
        //   364: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   367: checkcast       Ljava/lang/Number;
        //   370: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   373: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   376: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   379: aload           6
        //   381: aload_3        
        //   382: aload_0         /* this */
        //   383: invokespecial   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getScrollContainer:()Lgg/essential/elementa/components/UIContainer;
        //   386: checkcast       Lgg/essential/elementa/UIComponent;
        //   389: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   392: checkcast       Lgg/essential/elementa/components/ScrollComponent;
        //   395: bipush          30
        //   397: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   400: checkcast       Ljava/lang/Number;
        //   403: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   406: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   409: invokestatic    gg/essential/util/ExtensionsKt.scrollGradient:(Lgg/essential/elementa/components/ScrollComponent;Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/components/ScrollComponent;
        //   412: checkcast       Lgg/essential/elementa/UIComponent;
        //   415: aload_0         /* this */
        //   416: getstatic       gg/essential/gui/common/modal/SearchableConfirmDenyModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   419: iconst_4       
        //   420: aaload         
        //   421: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   424: putfield        gg/essential/gui/common/modal/SearchableConfirmDenyModal.scroller$delegate:Lkotlin/properties/ReadWriteProperty;
        //   427: aload_0         /* this */
        //   428: new             Lgg/essential/elementa/components/UIContainer;
        //   431: dup            
        //   432: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   435: checkcast       Lgg/essential/elementa/UIComponent;
        //   438: astore_2        /* $this$constrain$iv */
        //   439: aload_2         /* $this$constrain$iv */
        //   440: astore_3       
        //   441: aload_3        
        //   442: astore          $this$constrain_u24lambda_u2d0$iv
        //   444: aload           $this$constrain_u24lambda_u2d0$iv
        //   446: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   449: astore          5
        //   451: astore          6
        //   453: aload           $this$scrollbarContainer_delegate_u24lambda_u2d3
        //   455: iconst_0       
        //   456: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   459: checkcast       Ljava/lang/Number;
        //   462: iconst_1       
        //   463: iconst_0       
        //   464: iconst_2       
        //   465: aconst_null    
        //   466: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   469: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   472: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   475: aload           $this$scrollbarContainer_delegate_u24lambda_u2d3
        //   477: iconst_0       
        //   478: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   481: checkcast       Ljava/lang/Number;
        //   484: iconst_1       
        //   485: iconst_0       
        //   486: iconst_2       
        //   487: aconst_null    
        //   488: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   491: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   494: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   497: aload           $this$scrollbarContainer_delegate_u24lambda_u2d3
        //   499: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   502: dup            
        //   503: fconst_0       
        //   504: iconst_1       
        //   505: aconst_null    
        //   506: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   509: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   512: iconst_2       
        //   513: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   516: checkcast       Ljava/lang/Number;
        //   519: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.times:(Lgg/essential/elementa/constraints/SuperConstraint;Ljava/lang/Number;)Lgg/essential/elementa/constraints/ScaleConstraint;
        //   522: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   525: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   528: aload           $this$scrollbarContainer_delegate_u24lambda_u2d3
        //   530: bipush          100
        //   532: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   535: checkcast       Ljava/lang/Number;
        //   538: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   541: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   544: aload_0         /* this */
        //   545: invokevirtual   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   548: checkcast       Lgg/essential/elementa/UIComponent;
        //   551: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   554: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   557: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   560: aload           6
        //   562: aload_3        
        //   563: aload_0         /* this */
        //   564: invokespecial   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getScrollContainer:()Lgg/essential/elementa/components/UIContainer;
        //   567: checkcast       Lgg/essential/elementa/UIComponent;
        //   570: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   573: aload_0         /* this */
        //   574: getstatic       gg/essential/gui/common/modal/SearchableConfirmDenyModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   577: iconst_5       
        //   578: aaload         
        //   579: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   582: putfield        gg/essential/gui/common/modal/SearchableConfirmDenyModal.scrollbarContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   585: aload_0         /* this */
        //   586: new             Lgg/essential/elementa/components/UIBlock;
        //   589: dup            
        //   590: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //   593: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   596: checkcast       Lgg/essential/elementa/UIComponent;
        //   599: astore_2        /* $this$constrain$iv */
        //   600: aload_2         /* $this$constrain$iv */
        //   601: astore_3       
        //   602: aload_3        
        //   603: astore          $this$constrain_u24lambda_u2d0$iv
        //   605: aload           $this$constrain_u24lambda_u2d0$iv
        //   607: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   610: astore          5
        //   612: astore          6
        //   614: aload           $this$scrollBarBackground_delegate_u24lambda_u2d4
        //   616: iconst_0       
        //   617: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   620: checkcast       Ljava/lang/Number;
        //   623: iconst_1       
        //   624: iconst_0       
        //   625: iconst_2       
        //   626: aconst_null    
        //   627: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   630: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   633: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   636: aload           $this$scrollBarBackground_delegate_u24lambda_u2d4
        //   638: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   641: dup            
        //   642: fconst_0       
        //   643: iconst_1       
        //   644: aconst_null    
        //   645: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   648: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   651: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   654: aload           $this$scrollBarBackground_delegate_u24lambda_u2d4
        //   656: bipush          100
        //   658: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   661: checkcast       Ljava/lang/Number;
        //   664: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   667: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   670: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   673: aload           6
        //   675: aload_3        
        //   676: aload_0         /* this */
        //   677: invokevirtual   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getScrollbarContainer:()Lgg/essential/elementa/components/UIContainer;
        //   680: checkcast       Lgg/essential/elementa/UIComponent;
        //   683: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   686: aload_0         /* this */
        //   687: getstatic       gg/essential/gui/common/modal/SearchableConfirmDenyModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   690: bipush          6
        //   692: aaload         
        //   693: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   696: putfield        gg/essential/gui/common/modal/SearchableConfirmDenyModal.scrollBarBackground$delegate:Lkotlin/properties/ReadWriteProperty;
        //   699: aload_0         /* this */
        //   700: new             Lgg/essential/elementa/components/UIBlock;
        //   703: dup            
        //   704: getstatic       gg/essential/gui/EssentialPalette.SCROLLBAR:Ljava/awt/Color;
        //   707: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   710: iconst_2       
        //   711: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   714: checkcast       Ljava/lang/Number;
        //   717: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   720: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   723: invokevirtual   gg/essential/elementa/components/UIBlock.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)Lgg/essential/elementa/UIComponent;
        //   726: aload_0         /* this */
        //   727: invokespecial   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getScrollBarBackground:()Lgg/essential/elementa/components/UIBlock;
        //   730: checkcast       Lgg/essential/elementa/UIComponent;
        //   733: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   736: aload_0         /* this */
        //   737: getstatic       gg/essential/gui/common/modal/SearchableConfirmDenyModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   740: bipush          7
        //   742: aaload         
        //   743: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   746: putfield        gg/essential/gui/common/modal/SearchableConfirmDenyModal.scrollBar$delegate:Lkotlin/properties/ReadWriteProperty;
        //   749: aload_0         /* this */
        //   750: new             Lgg/essential/gui/common/Spacer;
        //   753: dup            
        //   754: aconst_null    
        //   755: aconst_null    
        //   756: iconst_3       
        //   757: invokespecial   gg/essential/gui/common/Spacer.<init>:(Lgg/essential/elementa/constraints/WidthConstraint;Lgg/essential/elementa/constraints/HeightConstraint;I)V
        //   760: checkcast       Lgg/essential/elementa/UIComponent;
        //   763: astore_2        /* $this$constrain$iv */
        //   764: aload_2         /* $this$constrain$iv */
        //   765: astore_3       
        //   766: aload_3        
        //   767: astore          $this$constrain_u24lambda_u2d0$iv
        //   769: aload           $this$constrain_u24lambda_u2d0$iv
        //   771: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   774: astore          5
        //   776: astore          6
        //   778: aload           $this$hiddenSpacer_delegate_u24lambda_u2d5
        //   780: bipush          100
        //   782: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   785: checkcast       Ljava/lang/Number;
        //   788: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   791: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   794: aload_0         /* this */
        //   795: invokespecial   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getSearchContainer:()Lgg/essential/elementa/components/UIContainer;
        //   798: checkcast       Lgg/essential/elementa/UIComponent;
        //   801: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   804: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   807: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   810: aload           6
        //   812: aload_3        
        //   813: aload_0         /* this */
        //   814: invokevirtual   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getCustomContent:()Lgg/essential/elementa/components/UIContainer;
        //   817: checkcast       Lgg/essential/elementa/UIComponent;
        //   820: invokestatic    gg/essential/util/ExtensionsKt.hiddenChildOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   823: aload_0         /* this */
        //   824: getstatic       gg/essential/gui/common/modal/SearchableConfirmDenyModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   827: bipush          8
        //   829: aaload         
        //   830: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   833: putfield        gg/essential/gui/common/modal/SearchableConfirmDenyModal.hiddenSpacer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   836: new             Lgg/essential/gui/common/Spacer;
        //   839: dup            
        //   840: ldc_w           8.0
        //   843: invokespecial   gg/essential/gui/common/Spacer.<init>:(F)V
        //   846: checkcast       Lgg/essential/elementa/UIComponent;
        //   849: aload_0         /* this */
        //   850: invokevirtual   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getCustomContent:()Lgg/essential/elementa/components/UIContainer;
        //   853: checkcast       Lgg/essential/elementa/UIComponent;
        //   856: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   859: aload_0         /* this */
        //   860: getstatic       gg/essential/gui/common/modal/SearchableConfirmDenyModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   863: bipush          9
        //   865: aaload         
        //   866: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   869: pop            
        //   870: aload_0         /* this */
        //   871: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //   874: astore_2        /* $this$configure$iv */
        //   875: aload_2         /* $this$configure$iv */
        //   876: astore_3       
        //   877: aload_3        
        //   878: astore          $this$configure_u24lambda_u2d0$iv
        //   880: aload           $this$configure_u24lambda_u2d0$iv
        //   882: checkcast       Lgg/essential/gui/common/modal/SearchableConfirmDenyModal;
        //   885: astore          $this$_init__u24lambda_u2d6
        //   887: aload           $this$_init__u24lambda_u2d6
        //   889: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //   892: invokevirtual   gg/essential/gui/common/modal/SearchableConfirmDenyModal.setTitleTextColor:(Ljava/awt/Color;)V
        //   895: aload_0         /* this */
        //   896: invokevirtual   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   899: invokevirtual   gg/essential/elementa/components/ScrollComponent.getEmptyText:()Lgg/essential/elementa/components/UIWrappedText;
        //   902: checkcast       Lgg/essential/elementa/UIComponent;
        //   905: astore_2        /* $this$constrain$iv */
        //   906: aload_2         /* $this$constrain$iv */
        //   907: astore_3       
        //   908: aload_3        
        //   909: astore          $this$constrain_u24lambda_u2d0$iv
        //   911: aload           $this$constrain_u24lambda_u2d0$iv
        //   913: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   916: astore          $this$_init__u24lambda_u2d7
        //   918: aload           $this$_init__u24lambda_u2d7
        //   920: aload           $this$_init__u24lambda_u2d7
        //   922: invokevirtual   gg/essential/elementa/UIConstraints.getY:()Lgg/essential/elementa/constraints/YConstraint;
        //   925: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   928: iconst_2       
        //   929: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   932: checkcast       Ljava/lang/Number;
        //   935: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   938: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   941: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   944: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   947: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   950: aload           $this$_init__u24lambda_u2d7
        //   952: getstatic       gg/essential/gui/EssentialPalette.TEXT_DISABLED:Ljava/awt/Color;
        //   955: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   958: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   961: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   964: aload_3        
        //   965: checkcast       Lgg/essential/elementa/components/UIWrappedText;
        //   968: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //   971: invokevirtual   gg/essential/elementa/components/UIWrappedText.setShadowColor:(Ljava/awt/Color;)Lgg/essential/elementa/components/UIWrappedText;
        //   974: pop            
        //   975: aload_0         /* this */
        //   976: invokevirtual   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   979: aload_0         /* this */
        //   980: invokespecial   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getScrollBar:()Lgg/essential/elementa/UIComponent;
        //   983: iconst_1       
        //   984: invokevirtual   gg/essential/elementa/components/ScrollComponent.setVerticalScrollBarComponent:(Lgg/essential/elementa/UIComponent;Z)V
        //   987: aload_0         /* this */
        //   988: invokevirtual   gg/essential/gui/common/modal/SearchableConfirmDenyModal.getSpacer:()Lgg/essential/gui/common/Spacer;
        //   991: bipush          10
        //   993: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   996: checkcast       Ljava/lang/Number;
        //   999: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1002: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1005: invokevirtual   gg/essential/gui/common/Spacer.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/UIComponent;
        //  1008: pop            
        //  1009: return         
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  fadeTime  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIContainer getSearchContainer() {
        return (UIContainer)this.searchContainer$delegate.getValue((Object)this, (KProperty)SearchableConfirmDenyModal.$$delegatedProperties[0]);
    }
    
    @NotNull
    public final EssentialSearchbar getSearchbar() {
        return (EssentialSearchbar)this.searchbar$delegate.getValue((Object)this, (KProperty)SearchableConfirmDenyModal.$$delegatedProperties[1]);
    }
    
    private final UIContainer getScrollContainer() {
        return (UIContainer)this.scrollContainer$delegate.getValue((Object)this, (KProperty)SearchableConfirmDenyModal.$$delegatedProperties[3]);
    }
    
    @NotNull
    public final ScrollComponent getScroller() {
        return (ScrollComponent)this.scroller$delegate.getValue((Object)this, (KProperty)SearchableConfirmDenyModal.$$delegatedProperties[4]);
    }
    
    @NotNull
    public final UIContainer getScrollbarContainer() {
        return (UIContainer)this.scrollbarContainer$delegate.getValue((Object)this, (KProperty)SearchableConfirmDenyModal.$$delegatedProperties[5]);
    }
    
    private final UIBlock getScrollBarBackground() {
        return (UIBlock)this.scrollBarBackground$delegate.getValue((Object)this, (KProperty)SearchableConfirmDenyModal.$$delegatedProperties[6]);
    }
    
    private final UIComponent getScrollBar() {
        return (UIComponent)this.scrollBar$delegate.getValue((Object)this, (KProperty)SearchableConfirmDenyModal.$$delegatedProperties[7]);
    }
    
    private final Spacer getHiddenSpacer() {
        return (Spacer)this.hiddenSpacer$delegate.getValue((Object)this, (KProperty)SearchableConfirmDenyModal.$$delegatedProperties[8]);
    }
    
    public final void hideSearchbar() {
        this.getSearchContainer().hide(true);
        UIComponent.unhide$default(this.getHiddenSpacer(), false, 1, null);
    }
    
    public final void showSearchbar() {
        UIComponent.unhide$default(this.getSearchContainer(), false, 1, null);
        this.getHiddenSpacer().hide(true);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SearchableConfirmDenyModal.class, "searchContainer", "getSearchContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SearchableConfirmDenyModal.class, "searchbar", "getSearchbar()Lgg/essential/gui/common/EssentialSearchbar;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SearchableConfirmDenyModal.class, "middleSpacer", "getMiddleSpacer()Lgg/essential/gui/common/Spacer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SearchableConfirmDenyModal.class, "scrollContainer", "getScrollContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SearchableConfirmDenyModal.class, "scroller", "getScroller()Lgg/essential/elementa/components/ScrollComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SearchableConfirmDenyModal.class, "scrollbarContainer", "getScrollbarContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SearchableConfirmDenyModal.class, "scrollBarBackground", "getScrollBarBackground()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SearchableConfirmDenyModal.class, "scrollBar", "getScrollBar()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SearchableConfirmDenyModal.class, "hiddenSpacer", "getHiddenSpacer()Lgg/essential/gui/common/Spacer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SearchableConfirmDenyModal.class, "bottomSpacer", "getBottomSpacer()Lgg/essential/gui/common/Spacer;", 0)) };
    }
}
