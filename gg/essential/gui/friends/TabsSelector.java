package gg.essential.gui.friends;

import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.reflect.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000"
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b	\u0010
                                                   \u001a\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006
                                                   \u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006
                                                   \u0010\u000e\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006
                                                   \u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/friends/TabsSelector;", "Lgg/essential/elementa/components/UIContainer;", "selectedTab", "Lgg/essential/elementa/state/State;", "Lgg/essential/gui/friends/Tab;", "(Lgg/essential/elementa/state/State;)V", "tabContainer", "getTabContainer", "()Lgg/essential/elementa/components/UIContainer;", "tabContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "essential", "wrapper", "Lgg/essential/elementa/UIComponent;", "content", "unseenFriendRequestIndicator", "Lgg/essential/gui/studio/Tag;" })
public final class TabsSelector extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ReadWriteProperty tabContainer$delegate;
    
    public TabsSelector(@NotNull final State<Tab> selectedTab) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "selectedTab"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    10: aload_0         /* this */
        //    11: new             Lgg/essential/elementa/components/UIContainer;
        //    14: dup            
        //    15: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    18: checkcast       Lgg/essential/elementa/UIComponent;
        //    21: astore_2        /* $this$constrain$iv */
        //    22: aload_2         /* $this$constrain$iv */
        //    23: astore_3       
        //    24: aload_3        
        //    25: astore          $this$constrain_u24lambda_u2d0$iv
        //    27: aload           $this$constrain_u24lambda_u2d0$iv
        //    29: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    32: astore          6
        //    34: astore          17
        //    36: aload           $this$tabContainer_delegate_u24lambda_u2d0
        //    38: iconst_4       
        //    39: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    42: checkcast       Ljava/lang/Number;
        //    45: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    48: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //    51: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //    54: aload           $this$tabContainer_delegate_u24lambda_u2d0
        //    56: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //    59: dup            
        //    60: fconst_0       
        //    61: iconst_1       
        //    62: aconst_null    
        //    63: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    66: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    69: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    72: aload           $this$tabContainer_delegate_u24lambda_u2d0
        //    74: new             Lgg/essential/elementa/constraints/FillConstraint;
        //    77: dup            
        //    78: iconst_0       
        //    79: iconst_1       
        //    80: aconst_null    
        //    81: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    84: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //    87: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //    90: aload           17
        //    92: aload_3        
        //    93: aload_0         /* this */
        //    94: checkcast       Lgg/essential/elementa/UIComponent;
        //    97: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   100: aload_0         /* this */
        //   101: getstatic       gg/essential/gui/friends/TabsSelector.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   104: iconst_0       
        //   105: aaload         
        //   106: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   109: putfield        gg/essential/gui/friends/TabsSelector.tabContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   112: invokestatic    gg/essential/gui/friends/Tab.values:()[Lgg/essential/gui/friends/Tab;
        //   115: astore_2        /* $this$forEach$iv */
        //   116: iconst_0       
        //   117: istore_3       
        //   118: aload_2         /* $this$forEach$iv */
        //   119: arraylength    
        //   120: istore          4
        //   122: iload_3        
        //   123: iload           4
        //   125: if_icmpge       747
        //   128: aload_2         /* $this$forEach$iv */
        //   129: iload_3        
        //   130: aaload         
        //   131: astore          element$iv
        //   133: aload           element$iv
        //   135: astore          tab
        //   137: new             Lgg/essential/elementa/components/UIContainer;
        //   140: dup            
        //   141: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   144: checkcast       Lgg/essential/elementa/UIComponent;
        //   147: astore          $this$constrain$iv
        //   149: aload           $this$constrain$iv
        //   151: astore          9
        //   153: aload           9
        //   155: astore          $this$constrain_u24lambda_u2d0$iv
        //   157: aload           $this$constrain_u24lambda_u2d0$iv
        //   159: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   162: astore          $this$lambda_u2d9_u24lambda_u2d1
        //   164: aload           $this$lambda_u2d9_u24lambda_u2d1
        //   166: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   169: dup            
        //   170: fconst_1       
        //   171: iconst_0       
        //   172: iconst_2       
        //   173: aconst_null    
        //   174: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   177: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   180: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   183: aload           $this$lambda_u2d9_u24lambda_u2d1
        //   185: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   188: dup            
        //   189: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   192: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   195: bipush          12
        //   197: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   200: checkcast       Ljava/lang/Number;
        //   203: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   206: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   209: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   212: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   215: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   218: aload           $this$lambda_u2d9_u24lambda_u2d1
        //   220: bipush          100
        //   222: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   225: checkcast       Ljava/lang/Number;
        //   228: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   231: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   234: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   237: aload           9
        //   239: astore          $this$onLeftClick$iv
        //   241: aload           $this$onLeftClick$iv
        //   243: new             Lgg/essential/gui/friends/TabsSelector$_init_$lambda-9$$inlined$onLeftClick$1;
        //   246: dup            
        //   247: aload_1         /* selectedTab */
        //   248: aload           tab
        //   250: invokespecial   gg/essential/gui/friends/TabsSelector$_init_$lambda-9$$inlined$onLeftClick$1.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/gui/friends/Tab;)V
        //   253: checkcast       Lkotlin/jvm/functions/Function2;
        //   256: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   259: aload_0         /* this */
        //   260: invokespecial   gg/essential/gui/friends/TabsSelector.getTabContainer:()Lgg/essential/elementa/components/UIContainer;
        //   263: checkcast       Lgg/essential/elementa/UIComponent;
        //   266: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   269: aconst_null    
        //   270: getstatic       gg/essential/gui/friends/TabsSelector.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   273: iconst_1       
        //   274: aaload         
        //   275: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   278: astore          wrapper$delegate
        //   280: new             Lgg/essential/elementa/components/UIContainer;
        //   283: dup            
        //   284: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   287: checkcast       Lgg/essential/elementa/UIComponent;
        //   290: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   293: astore          $this$constrain$iv
        //   295: aload           $this$constrain$iv
        //   297: astore          10
        //   299: aload           10
        //   301: astore          $this$constrain_u24lambda_u2d0$iv
        //   303: aload           $this$constrain_u24lambda_u2d0$iv
        //   305: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   308: astore          $this$lambda_u2d9_u24lambda_u2d4
        //   310: aload           $this$lambda_u2d9_u24lambda_u2d4
        //   312: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   315: dup            
        //   316: fconst_0       
        //   317: iconst_1       
        //   318: aconst_null    
        //   319: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   322: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   325: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   328: aload           $this$lambda_u2d9_u24lambda_u2d4
        //   330: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   333: dup            
        //   334: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   337: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   340: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   343: aload           10
        //   345: aload           wrapper$delegate
        //   347: invokestatic    gg/essential/gui/friends/TabsSelector.lambda-9$lambda-3:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //   350: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   353: aconst_null    
        //   354: getstatic       gg/essential/gui/friends/TabsSelector.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   357: iconst_2       
        //   358: aaload         
        //   359: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   362: astore          content$delegate
        //   364: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   367: dup            
        //   368: aload           tab
        //   370: invokevirtual   gg/essential/gui/friends/Tab.getDisplay:()Ljava/lang/String;
        //   373: iconst_0       
        //   374: aconst_null    
        //   375: iconst_0       
        //   376: iconst_0       
        //   377: iconst_0       
        //   378: bipush          62
        //   380: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   383: checkcast       Lgg/essential/elementa/UIComponent;
        //   386: astore          $this$constrain$iv
        //   388: aload           $this$constrain$iv
        //   390: astore          11
        //   392: aload           11
        //   394: astore          $this$constrain_u24lambda_u2d0$iv
        //   396: aload           $this$constrain_u24lambda_u2d0$iv
        //   398: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   401: astore          $this$lambda_u2d9_u24lambda_u2d6
        //   403: aload           $this$lambda_u2d9_u24lambda_u2d6
        //   405: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   408: dup            
        //   409: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   412: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   415: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   418: aload           $this$lambda_u2d9_u24lambda_u2d6
        //   420: aload_1         /* selectedTab */
        //   421: new             Lgg/essential/gui/friends/TabsSelector$1$text$1$1;
        //   424: dup            
        //   425: aload           tab
        //   427: invokespecial   gg/essential/gui/friends/TabsSelector$1$text$1$1.<init>:(Lgg/essential/gui/friends/Tab;)V
        //   430: checkcast       Lkotlin/jvm/functions/Function1;
        //   433: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   436: aload           wrapper$delegate
        //   438: invokestatic    gg/essential/gui/friends/TabsSelector.lambda-9$lambda-3:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //   441: iconst_0       
        //   442: iconst_0       
        //   443: iconst_3       
        //   444: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   447: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   450: getstatic       gg/essential/gui/friends/TabsSelector$1$text$1$2.INSTANCE:Lgg/essential/gui/friends/TabsSelector$1$text$1$2;
        //   453: checkcast       Lkotlin/jvm/functions/Function1;
        //   456: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   459: checkcast       Lgg/essential/elementa/state/State;
        //   462: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   465: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   468: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   471: aload           11
        //   473: aload           content$delegate
        //   475: invokestatic    gg/essential/gui/friends/TabsSelector.lambda-9$lambda-5:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //   478: checkcast       Lgg/essential/elementa/UIComponent;
        //   481: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   484: pop            
        //   485: aload           tab
        //   487: getstatic       gg/essential/gui/friends/Tab.FRIENDS:Lgg/essential/gui/friends/Tab;
        //   490: if_acmpne       741
        //   493: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //   496: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //   499: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getNoticesManager:()Lgg/essential/network/connectionmanager/notices/NoticesManager;
        //   502: invokevirtual   gg/essential/network/connectionmanager/notices/NoticesManager.getSocialMenuNewFriendRequestNoticeManager:()Lgg/essential/network/connectionmanager/notices/SocialMenuNewFriendRequestNoticeManager;
        //   505: invokevirtual   gg/essential/network/connectionmanager/notices/SocialMenuNewFriendRequestNoticeManager.unseenFriendRequestCount:()Lgg/essential/gui/common/WeakState;
        //   508: astore          count
        //   510: new             Lgg/essential/gui/studio/Tag;
        //   513: dup            
        //   514: new             Lgg/essential/elementa/state/BasicState;
        //   517: dup            
        //   518: getstatic       gg/essential/gui/EssentialPalette.RED:Ljava/awt/Color;
        //   521: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   524: checkcast       Lgg/essential/elementa/state/State;
        //   527: new             Lgg/essential/elementa/state/BasicState;
        //   530: dup            
        //   531: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //   534: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   537: checkcast       Lgg/essential/elementa/state/State;
        //   540: aload           count
        //   542: checkcast       Lgg/essential/elementa/state/State;
        //   545: invokestatic    gg/essential/gui/common/StateExtensionsKt.mapToString:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   548: checkcast       Lgg/essential/elementa/state/State;
        //   551: invokespecial   gg/essential/gui/studio/Tag.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V
        //   554: checkcast       Lgg/essential/elementa/UIComponent;
        //   557: astore          $this$constrain$iv
        //   559: aload           $this$constrain$iv
        //   561: astore          13
        //   563: aload           13
        //   565: astore          $this$constrain_u24lambda_u2d0$iv
        //   567: aload           $this$constrain_u24lambda_u2d0$iv
        //   569: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   572: astore          $this$lambda_u2d9_u24lambda_u2d7
        //   574: aload           $this$lambda_u2d9_u24lambda_u2d7
        //   576: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   579: dup            
        //   580: ldc_w           5.0
        //   583: iconst_0       
        //   584: iconst_2       
        //   585: aconst_null    
        //   586: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   589: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   592: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   595: aload           $this$lambda_u2d9_u24lambda_u2d7
        //   597: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   600: dup            
        //   601: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   604: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   607: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   610: aload           $this$lambda_u2d9_u24lambda_u2d7
        //   612: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   615: dup            
        //   616: fconst_0       
        //   617: iconst_1       
        //   618: aconst_null    
        //   619: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   622: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   625: iconst_4       
        //   626: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   629: checkcast       Ljava/lang/Number;
        //   632: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   635: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   638: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   641: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   644: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   647: aload           $this$lambda_u2d9_u24lambda_u2d7
        //   649: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   652: dup            
        //   653: fconst_0       
        //   654: iconst_1       
        //   655: aconst_null    
        //   656: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   659: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   662: iconst_4       
        //   663: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   666: checkcast       Ljava/lang/Number;
        //   669: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   672: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   675: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   678: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   681: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   684: aload           13
        //   686: aload           content$delegate
        //   688: invokestatic    gg/essential/gui/friends/TabsSelector.lambda-9$lambda-5:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //   691: checkcast       Lgg/essential/elementa/UIComponent;
        //   694: aload           count
        //   696: getstatic       gg/essential/gui/friends/TabsSelector$1$unseenFriendRequestIndicator$3.INSTANCE:Lgg/essential/gui/friends/TabsSelector$1$unseenFriendRequestIndicator$3;
        //   699: checkcast       Lkotlin/jvm/functions/Function1;
        //   702: invokevirtual   gg/essential/gui/common/WeakState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   705: checkcast       Lgg/essential/elementa/state/State;
        //   708: iconst_0       
        //   709: aconst_null    
        //   710: bipush          12
        //   712: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   715: new             Lgg/essential/gui/common/shadow/ShadowEffect;
        //   718: dup            
        //   719: getstatic       gg/essential/gui/EssentialPalette.BLACK:Ljava/awt/Color;
        //   722: invokespecial   gg/essential/gui/common/shadow/ShadowEffect.<init>:(Ljava/awt/Color;)V
        //   725: checkcast       Lgg/essential/elementa/effects/Effect;
        //   728: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   731: aconst_null    
        //   732: getstatic       gg/essential/gui/friends/TabsSelector.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   735: iconst_3       
        //   736: aaload         
        //   737: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   740: pop            
        //   741: iinc            3, 1
        //   744: goto            122
        //   747: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/State<Lgg/essential/gui/friends/Tab;>;)V
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  selectedTab  
        //    StackMapTable: 00 03 FF 00 7A 00 05 07 00 02 07 00 7F 07 00 81 01 01 00 00 FB 02 6A FF 00 05 00 00 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIContainer getTabContainer() {
        return (UIContainer)this.tabContainer$delegate.getValue((Object)this, (KProperty)TabsSelector.$$delegatedProperties[0]);
    }
    
    private static final UIComponent lambda-9$lambda-3(final ReadWriteProperty<Object, UIComponent> $wrapper$delegate) {
        return (UIComponent)$wrapper$delegate.getValue((Object)null, (KProperty)TabsSelector.$$delegatedProperties[1]);
    }
    
    private static final UIContainer lambda-9$lambda-5(final ReadWriteProperty<Object, UIContainer> $content$delegate) {
        return (UIContainer)$content$delegate.getValue((Object)null, (KProperty)TabsSelector.$$delegatedProperties[2]);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TabsSelector.class, "tabContainer", "getTabContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)TabsSelector.class, "wrapper", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)TabsSelector.class, "content", "<v#1>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)TabsSelector.class, "unseenFriendRequestIndicator", "<v#2>", 0)) };
    }
}
