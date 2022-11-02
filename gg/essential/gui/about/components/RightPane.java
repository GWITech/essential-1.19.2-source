package gg.essential.gui.about.components;

import kotlin.*;
import kotlin.reflect.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.gui.about.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00008
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070	¢\u0006\u0002\u0010
                                                   R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006
                                                   \u0010\u0012\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006
                                                   \u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006
                                                   \u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/about/components/RightPane;", "Lgg/essential/elementa/components/UIContainer;", "aboutMenu", "Lgg/essential/gui/about/AboutMenu;", "pages", "", "Lgg/essential/gui/about/Category;", "Lgg/essential/gui/about/components/Page;", "selectedPage", "Lgg/essential/elementa/state/BasicState;", "(Lgg/essential/gui/about/AboutMenu;Ljava/util/Map;Lgg/essential/elementa/state/BasicState;)V", "scroller", "Lgg/essential/elementa/components/ScrollComponent;", "getScroller", "()Lgg/essential/elementa/components/ScrollComponent;", "scroller$delegate", "Lkotlin/properties/ReadWriteProperty;", "essential", "scrollContainer", "scrollBar", "Lgg/essential/elementa/components/UIBlock;", "scrollToTopButton", "Lgg/essential/elementa/UIComponent;" })
public final class RightPane extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ReadWriteProperty scroller$delegate;
    
    public RightPane(@NotNull final AboutMenu aboutMenu, @NotNull final Map<Category, ? extends Page> pages, @NotNull final BasicState<Page> selectedPage) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "aboutMenu"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* pages */
        //     7: ldc             "pages"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* selectedPage */
        //    13: ldc             "selectedPage"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload_0         /* this */
        //    19: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    22: aload_0         /* this */
        //    23: new             Lgg/essential/elementa/components/ScrollComponent;
        //    26: dup            
        //    27: ldc             "Something went wrong. Please check your connection and try again."
        //    29: ldc             10.0
        //    31: aconst_null    
        //    32: iconst_0       
        //    33: iconst_0       
        //    34: iconst_0       
        //    35: iconst_0       
        //    36: ldc             25.0
        //    38: fconst_0       
        //    39: aconst_null    
        //    40: sipush          892
        //    43: aconst_null    
        //    44: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    47: checkcast       Lgg/essential/elementa/UIComponent;
        //    50: astore          $this$constrain$iv
        //    52: aload           $this$constrain$iv
        //    54: astore          6
        //    56: aload           6
        //    58: astore          $this$constrain_u24lambda_u2d0$iv
        //    60: aload           $this$constrain_u24lambda_u2d0$iv
        //    62: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    65: astore          9
        //    67: astore          13
        //    69: aload           $this$scroller_delegate_u24lambda_u2d0
        //    71: iconst_5       
        //    72: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    75: checkcast       Ljava/lang/Number;
        //    78: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    81: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    84: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    87: aload           $this$scroller_delegate_u24lambda_u2d0
        //    89: bipush          100
        //    91: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    94: checkcast       Ljava/lang/Number;
        //    97: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   100: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   103: bipush          10
        //   105: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   108: checkcast       Ljava/lang/Number;
        //   111: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   114: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   117: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   120: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   123: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   126: aload           $this$scroller_delegate_u24lambda_u2d0
        //   128: bipush          100
        //   130: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   133: checkcast       Ljava/lang/Number;
        //   136: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   139: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   142: iconst_5       
        //   143: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   146: checkcast       Ljava/lang/Number;
        //   149: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   152: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   155: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   158: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   161: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   164: aload           13
        //   166: aload           6
        //   168: aload_0         /* this */
        //   169: checkcast       Lgg/essential/elementa/UIComponent;
        //   172: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   175: checkcast       Lgg/essential/elementa/components/ScrollComponent;
        //   178: bipush          20
        //   180: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   183: checkcast       Ljava/lang/Number;
        //   186: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   189: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   192: invokestatic    gg/essential/util/ExtensionsKt.scrollGradient:(Lgg/essential/elementa/components/ScrollComponent;Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/components/ScrollComponent;
        //   195: checkcast       Lgg/essential/elementa/UIComponent;
        //   198: aload_0         /* this */
        //   199: getstatic       gg/essential/gui/about/components/RightPane.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   202: iconst_0       
        //   203: aaload         
        //   204: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   207: putfield        gg/essential/gui/about/components/RightPane.scroller$delegate:Lkotlin/properties/ReadWriteProperty;
        //   210: aload_0         /* this */
        //   211: checkcast       Lgg/essential/elementa/UIComponent;
        //   214: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   217: dup            
        //   218: aconst_null    
        //   219: iconst_0       
        //   220: iconst_3       
        //   221: aconst_null    
        //   222: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   225: checkcast       Lgg/essential/elementa/effects/Effect;
        //   228: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   231: pop            
        //   232: new             Lgg/essential/elementa/components/UIContainer;
        //   235: dup            
        //   236: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   239: checkcast       Lgg/essential/elementa/UIComponent;
        //   242: astore          $this$constrain$iv
        //   244: aload           $this$constrain$iv
        //   246: astore          7
        //   248: aload           7
        //   250: astore          $this$constrain_u24lambda_u2d0$iv
        //   252: aload           $this$constrain_u24lambda_u2d0$iv
        //   254: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   257: astore          $this$_init__u24lambda_u2d1
        //   259: aload           $this$_init__u24lambda_u2d1
        //   261: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   264: dup            
        //   265: iconst_0       
        //   266: iconst_1       
        //   267: aconst_null    
        //   268: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   271: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   274: aload_1         /* aboutMenu */
        //   275: invokevirtual   gg/essential/gui/about/AboutMenu.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   278: checkcast       Lgg/essential/elementa/UIComponent;
        //   281: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   284: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   287: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   290: aload           $this$_init__u24lambda_u2d1
        //   292: bipush          100
        //   294: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   297: checkcast       Ljava/lang/Number;
        //   300: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   303: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   306: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   309: aload           $this$_init__u24lambda_u2d1
        //   311: bipush          100
        //   313: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   316: checkcast       Ljava/lang/Number;
        //   319: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   322: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   325: aload_1         /* aboutMenu */
        //   326: invokevirtual   gg/essential/gui/about/AboutMenu.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   329: checkcast       Lgg/essential/elementa/UIComponent;
        //   332: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   335: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   338: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   341: aload           7
        //   343: aload_1         /* aboutMenu */
        //   344: invokevirtual   gg/essential/gui/about/AboutMenu.getRightDivider:()Lgg/essential/elementa/components/UIBlock;
        //   347: checkcast       Lgg/essential/elementa/UIComponent;
        //   350: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   353: aconst_null    
        //   354: getstatic       gg/essential/gui/about/components/RightPane.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   357: iconst_1       
        //   358: aaload         
        //   359: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   362: astore          scrollContainer$delegate
        //   364: new             Lgg/essential/elementa/components/UIBlock;
        //   367: dup            
        //   368: getstatic       gg/essential/gui/EssentialPalette.SCROLLBAR:Ljava/awt/Color;
        //   371: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   374: checkcast       Lgg/essential/elementa/UIComponent;
        //   377: astore          $this$constrain$iv
        //   379: aload           $this$constrain$iv
        //   381: astore          8
        //   383: aload           8
        //   385: astore          $this$constrain_u24lambda_u2d0$iv
        //   387: aload           $this$constrain_u24lambda_u2d0$iv
        //   389: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   392: astore          $this$_init__u24lambda_u2d3
        //   394: aload           $this$_init__u24lambda_u2d3
        //   396: bipush          100
        //   398: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   401: checkcast       Ljava/lang/Number;
        //   404: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   407: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   410: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   413: aload           8
        //   415: aload           scrollContainer$delegate
        //   417: invokestatic    gg/essential/gui/about/components/RightPane._init_$lambda-2:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //   420: checkcast       Lgg/essential/elementa/UIComponent;
        //   423: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   426: aconst_null    
        //   427: getstatic       gg/essential/gui/about/components/RightPane.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   430: iconst_2       
        //   431: aaload         
        //   432: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   435: astore          scrollBar$delegate
        //   437: aload_0         /* this */
        //   438: invokespecial   gg/essential/gui/about/components/RightPane.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   441: aload           scrollBar$delegate
        //   443: invokestatic    gg/essential/gui/about/components/RightPane._init_$lambda-4:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIBlock;
        //   446: checkcast       Lgg/essential/elementa/UIComponent;
        //   449: iconst_1       
        //   450: invokevirtual   gg/essential/elementa/components/ScrollComponent.setVerticalScrollBarComponent:(Lgg/essential/elementa/UIComponent;Z)V
        //   453: aload_2         /* pages */
        //   454: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   459: checkcast       Ljava/lang/Iterable;
        //   462: astore          $this$forEach$iv
        //   464: aload           $this$forEach$iv
        //   466: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   471: astore          8
        //   473: aload           8
        //   475: invokeinterface java/util/Iterator.hasNext:()Z
        //   480: ifeq            541
        //   483: aload           8
        //   485: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   490: astore          element$iv
        //   492: aload           element$iv
        //   494: checkcast       Lgg/essential/gui/about/components/Page;
        //   497: astore          page
        //   499: aload           page
        //   501: checkcast       Lgg/essential/elementa/UIComponent;
        //   504: aload_0         /* this */
        //   505: invokespecial   gg/essential/gui/about/components/RightPane.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   508: checkcast       Lgg/essential/elementa/UIComponent;
        //   511: aload_3         /* selectedPage */
        //   512: new             Lgg/essential/gui/about/components/RightPane$1$1;
        //   515: dup            
        //   516: aload           page
        //   518: invokespecial   gg/essential/gui/about/components/RightPane$1$1.<init>:(Lgg/essential/gui/about/components/Page;)V
        //   521: checkcast       Lkotlin/jvm/functions/Function1;
        //   524: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   527: checkcast       Lgg/essential/elementa/state/State;
        //   530: iconst_0       
        //   531: aconst_null    
        //   532: bipush          12
        //   534: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   537: pop            
        //   538: goto            473
        //   541: aload_3         /* selectedPage */
        //   542: new             Lgg/essential/gui/about/components/RightPane$2;
        //   545: dup            
        //   546: aload_0         /* this */
        //   547: invokespecial   gg/essential/gui/about/components/RightPane$2.<init>:(Lgg/essential/gui/about/components/RightPane;)V
        //   550: checkcast       Lkotlin/jvm/functions/Function1;
        //   553: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   556: pop            
        //   557: new             Lgg/essential/gui/common/IconButton;
        //   560: dup            
        //   561: getstatic       gg/essential/gui/EssentialPalette.ARROW_UP_7X5:Lgg/essential/gui/image/ImageFactory;
        //   564: aconst_null    
        //   565: aconst_null    
        //   566: iconst_0       
        //   567: iconst_0       
        //   568: iconst_0       
        //   569: bipush          62
        //   571: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   574: checkcast       Lgg/essential/elementa/UIComponent;
        //   577: astore          $this$constrain$iv
        //   579: aload           $this$constrain$iv
        //   581: astore          9
        //   583: aload           9
        //   585: astore          $this$constrain_u24lambda_u2d0$iv
        //   587: aload           $this$constrain_u24lambda_u2d0$iv
        //   589: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   592: astore          $this$_init__u24lambda_u2d6
        //   594: aload           $this$_init__u24lambda_u2d6
        //   596: iconst_0       
        //   597: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   600: checkcast       Ljava/lang/Number;
        //   603: iconst_1       
        //   604: iconst_0       
        //   605: iconst_2       
        //   606: aconst_null    
        //   607: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   610: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   613: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   616: aload           $this$_init__u24lambda_u2d6
        //   618: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   621: dup            
        //   622: fconst_0       
        //   623: iconst_0       
        //   624: iconst_3       
        //   625: aconst_null    
        //   626: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   629: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   632: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   635: aload           $this$_init__u24lambda_u2d6
        //   637: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   640: dup            
        //   641: fconst_0       
        //   642: iconst_1       
        //   643: aconst_null    
        //   644: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   647: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   650: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   653: aload           9
        //   655: astore          $this$onLeftClick$iv
        //   657: aload           $this$onLeftClick$iv
        //   659: new             Lgg/essential/gui/about/components/RightPane$special$$inlined$onLeftClick$1;
        //   662: dup            
        //   663: aload_0         /* this */
        //   664: invokespecial   gg/essential/gui/about/components/RightPane$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/about/components/RightPane;)V
        //   667: checkcast       Lkotlin/jvm/functions/Function2;
        //   670: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   673: new             Lgg/essential/elementa/state/BasicState;
        //   676: dup            
        //   677: ldc_w           "Scroll to top"
        //   680: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   683: checkcast       Lgg/essential/elementa/state/State;
        //   686: getstatic       gg/essential/gui/common/EssentialTooltip$Position.ABOVE:Lgg/essential/gui/common/EssentialTooltip$Position;
        //   689: fconst_0       
        //   690: aconst_null    
        //   691: aconst_null    
        //   692: bipush          28
        //   694: invokestatic    gg/essential/util/ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //   697: aload_0         /* this */
        //   698: checkcast       Lgg/essential/elementa/UIComponent;
        //   701: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   704: aconst_null    
        //   705: getstatic       gg/essential/gui/about/components/RightPane.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   708: iconst_3       
        //   709: aaload         
        //   710: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   713: astore          scrollToTopButton$delegate
        //   715: new             Lkotlin/jvm/internal/Ref$BooleanRef;
        //   718: dup            
        //   719: invokespecial   kotlin/jvm/internal/Ref$BooleanRef.<init>:()V
        //   722: astore          scrollTopVisible
        //   724: aload_0         /* this */
        //   725: invokespecial   gg/essential/gui/about/components/RightPane.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   728: iconst_0       
        //   729: new             Lgg/essential/gui/about/components/RightPane$3;
        //   732: dup            
        //   733: aload           scrollTopVisible
        //   735: aload           scrollToTopButton$delegate
        //   737: invokespecial   gg/essential/gui/about/components/RightPane$3.<init>:(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/properties/ReadWriteProperty;)V
        //   740: checkcast       Lkotlin/jvm/functions/Function2;
        //   743: invokevirtual   gg/essential/elementa/components/ScrollComponent.addScrollAdjustEvent:(ZLkotlin/jvm/functions/Function2;)V
        //   746: return         
        //    Signature:
        //  (Lgg/essential/gui/about/AboutMenu;Ljava/util/Map<Lgg/essential/gui/about/Category;+Lgg/essential/gui/about/components/Page;>;Lgg/essential/elementa/state/BasicState<Lgg/essential/gui/about/components/Page;>;)V
        //    MethodParameters:
        //  Name          Flags  
        //  ------------  -----
        //  aboutMenu     
        //  pages         
        //  selectedPage  
        //    StackMapTable: 00 02 FF 01 D9 00 09 07 00 02 00 00 07 00 D5 00 00 00 00 07 00 D7 00 00 FF 00 43 00 04 07 00 02 00 00 07 00 D5 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final ScrollComponent getScroller() {
        return (ScrollComponent)this.scroller$delegate.getValue((Object)this, (KProperty)RightPane.$$delegatedProperties[0]);
    }
    
    private static final UIContainer _init_$lambda-2(final ReadWriteProperty<Object, UIContainer> $scrollContainer$delegate) {
        return (UIContainer)$scrollContainer$delegate.getValue((Object)null, (KProperty)RightPane.$$delegatedProperties[1]);
    }
    
    private static final UIBlock _init_$lambda-4(final ReadWriteProperty<Object, UIBlock> $scrollBar$delegate) {
        return (UIBlock)$scrollBar$delegate.getValue((Object)null, (KProperty)RightPane.$$delegatedProperties[2]);
    }
    
    private static final UIComponent _init_$lambda-8(final ReadWriteProperty<Object, UIComponent> $scrollToTopButton$delegate) {
        return (UIComponent)$scrollToTopButton$delegate.getValue((Object)null, (KProperty)RightPane.$$delegatedProperties[3]);
    }
    
    public static final /* synthetic */ ScrollComponent access$getScroller(final RightPane $this) {
        return $this.getScroller();
    }
    
    public static final /* synthetic */ UIComponent access$_init_$lambda-8(final ReadWriteProperty $scrollToTopButton$delegate) {
        return _init_$lambda-8((ReadWriteProperty<Object, UIComponent>)$scrollToTopButton$delegate);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)RightPane.class, "scroller", "getScroller()Lgg/essential/elementa/components/ScrollComponent;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)RightPane.class, "scrollContainer", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)RightPane.class, "scrollBar", "<v#1>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)RightPane.class, "scrollToTopButton", "<v#2>", 0)) };
    }
}
