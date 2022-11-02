package gg.essential.vigilance.gui;

import kotlin.*;
import kotlin.reflect.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.*;
import gg.essential.vigilance.data.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007J\u0006\u0010\u0014\u001a\u00020\u0011R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015" }, d2 = { "Lgg/essential/vigilance/gui/SettingsCategory;", "Lgg/essential/elementa/components/UIContainer;", "category", "Lgg/essential/vigilance/data/Category;", "(Lgg/essential/vigilance/data/Category;)V", "scrollBar", "Lgg/essential/elementa/components/UIBlock;", "getScrollBar", "()Lgg/essential/elementa/components/UIBlock;", "scrollBar$delegate", "Lkotlin/properties/ReadWriteProperty;", "scroller", "Lgg/essential/elementa/components/ScrollComponent;", "getScroller$Vigilance", "()Lgg/essential/elementa/components/ScrollComponent;", "scroller$delegate", "closePopups", "", "instantly", "", "scrollToTop", "Vigilance" })
public final class SettingsCategory extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ReadWriteProperty scroller$delegate;
    @NotNull
    private final ReadWriteProperty scrollBar$delegate;
    
    public SettingsCategory(@NotNull final Category category) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "category"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    10: aload_0         /* this */
        //    11: new             Lgg/essential/elementa/components/ScrollComponent;
        //    14: dup            
        //    15: ldc             "No matching settings found :("
        //    17: ldc             10.0
        //    19: aconst_null    
        //    20: iconst_0       
        //    21: iconst_0       
        //    22: iconst_0       
        //    23: iconst_0       
        //    24: ldc             25.0
        //    26: fconst_0       
        //    27: aconst_null    
        //    28: sipush          892
        //    31: aconst_null    
        //    32: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    35: checkcast       Lgg/essential/elementa/UIComponent;
        //    38: astore_2       
        //    39: nop            
        //    40: iconst_0       
        //    41: istore_3        /* $i$f$constrain */
        //    42: aload_2         /* $this$constrain$iv */
        //    43: astore          4
        //    45: aload           4
        //    47: astore          $this$constrain_u24lambda_u2d0$iv
        //    49: iconst_0       
        //    50: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //    52: aload           $this$constrain_u24lambda_u2d0$iv
        //    54: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    57: astore          7
        //    59: astore          15
        //    61: iconst_0       
        //    62: istore          $i$a$-constrain-SettingsCategory$scroller$2
        //    64: aload           $this$scroller_delegate_u24lambda_u2d0
        //    66: bipush          100
        //    68: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    71: checkcast       Ljava/lang/Number;
        //    74: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    77: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    80: ldc             13.0
        //    82: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    85: checkcast       Ljava/lang/Number;
        //    88: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    91: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    94: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //    97: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   100: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   103: aload           $this$scroller_delegate_u24lambda_u2d0
        //   105: bipush          100
        //   107: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   110: checkcast       Ljava/lang/Number;
        //   113: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   116: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   119: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   122: nop            
        //   123: aload           15
        //   125: nop            
        //   126: aload           4
        //   128: nop            
        //   129: aload_0         /* this */
        //   130: checkcast       Lgg/essential/elementa/UIComponent;
        //   133: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   136: checkcast       Lgg/essential/elementa/components/ScrollComponent;
        //   139: bipush          20
        //   141: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   144: checkcast       Ljava/lang/Number;
        //   147: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   150: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   153: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.scrollGradient:(Lgg/essential/elementa/components/ScrollComponent;Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/components/ScrollComponent;
        //   156: checkcast       Lgg/essential/elementa/UIComponent;
        //   159: aload_0         /* this */
        //   160: getstatic       gg/essential/vigilance/gui/SettingsCategory.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   163: iconst_0       
        //   164: aaload         
        //   165: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   168: putfield        gg/essential/vigilance/gui/SettingsCategory.scroller$delegate:Lkotlin/properties/ReadWriteProperty;
        //   171: aload_0         /* this */
        //   172: new             Lgg/essential/elementa/components/UIBlock;
        //   175: dup            
        //   176: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   179: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getScrollbar$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   182: checkcast       Lgg/essential/elementa/state/State;
        //   185: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   188: checkcast       Lgg/essential/elementa/UIComponent;
        //   191: astore_2        /* $this$constrain$iv */
        //   192: iconst_0       
        //   193: istore_3        /* $i$f$constrain */
        //   194: aload_2         /* $this$constrain$iv */
        //   195: astore          4
        //   197: aload           4
        //   199: astore          $this$constrain_u24lambda_u2d0$iv
        //   201: iconst_0       
        //   202: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   204: aload           $this$constrain_u24lambda_u2d0$iv
        //   206: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   209: astore          7
        //   211: astore          15
        //   213: iconst_0       
        //   214: istore          $i$a$-constrain-SettingsCategory$scrollBar$2
        //   216: aload           $this$scrollBar_delegate_u24lambda_u2d1
        //   218: iconst_0       
        //   219: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   222: checkcast       Ljava/lang/Number;
        //   225: iconst_1       
        //   226: iconst_0       
        //   227: iconst_2       
        //   228: aconst_null    
        //   229: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   232: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   235: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   238: aload           $this$scrollBar_delegate_u24lambda_u2d1
        //   240: ldc             3.0
        //   242: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   245: checkcast       Ljava/lang/Number;
        //   248: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   251: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   254: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   257: nop            
        //   258: aload           15
        //   260: nop            
        //   261: aload           4
        //   263: nop            
        //   264: aload_0         /* this */
        //   265: checkcast       Lgg/essential/elementa/UIComponent;
        //   268: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   271: aload_0         /* this */
        //   272: getstatic       gg/essential/vigilance/gui/SettingsCategory.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   275: iconst_1       
        //   276: aaload         
        //   277: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   280: putfield        gg/essential/vigilance/gui/SettingsCategory.scrollBar$delegate:Lkotlin/properties/ReadWriteProperty;
        //   283: nop            
        //   284: aload_0         /* this */
        //   285: checkcast       Lgg/essential/elementa/UIComponent;
        //   288: astore_2        /* $this$constrain$iv */
        //   289: iconst_0       
        //   290: istore_3        /* $i$f$constrain */
        //   291: aload_2         /* $this$constrain$iv */
        //   292: astore          4
        //   294: aload           4
        //   296: astore          $this$constrain_u24lambda_u2d0$iv
        //   298: iconst_0       
        //   299: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   301: aload           $this$constrain_u24lambda_u2d0$iv
        //   303: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   306: astore          $this$_init__u24lambda_u2d2
        //   308: iconst_0       
        //   309: istore          $i$a$-constrain-SettingsCategory$1
        //   311: aload           $this$_init__u24lambda_u2d2
        //   313: bipush          100
        //   315: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   318: checkcast       Ljava/lang/Number;
        //   321: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   324: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   327: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   330: aload           $this$_init__u24lambda_u2d2
        //   332: bipush          100
        //   334: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   337: checkcast       Ljava/lang/Number;
        //   340: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   343: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   346: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   349: nop            
        //   350: nop            
        //   351: nop            
        //   352: nop            
        //   353: aload_1         /* category */
        //   354: invokevirtual   gg/essential/vigilance/data/Category.getDescription:()Ljava/lang/String;
        //   357: ifnull          516
        //   360: new             Lgg/essential/elementa/components/UIWrappedText;
        //   363: dup            
        //   364: aload_1         /* category */
        //   365: invokevirtual   gg/essential/vigilance/data/Category.getDescription:()Ljava/lang/String;
        //   368: iconst_0       
        //   369: aconst_null    
        //   370: iconst_1       
        //   371: iconst_0       
        //   372: fconst_0       
        //   373: aconst_null    
        //   374: bipush          118
        //   376: aconst_null    
        //   377: invokespecial   gg/essential/elementa/components/UIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   380: checkcast       Lgg/essential/elementa/UIComponent;
        //   383: astore_2        /* $this$constrain$iv */
        //   384: iconst_0       
        //   385: istore_3        /* $i$f$constrain */
        //   386: aload_2         /* $this$constrain$iv */
        //   387: astore          4
        //   389: aload           4
        //   391: astore          $this$constrain_u24lambda_u2d0$iv
        //   393: iconst_0       
        //   394: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   396: aload           $this$constrain_u24lambda_u2d0$iv
        //   398: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   401: astore          $this$_init__u24lambda_u2d3
        //   403: iconst_0       
        //   404: istore          $i$a$-constrain-SettingsCategory$2
        //   406: aload           $this$_init__u24lambda_u2d3
        //   408: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   411: dup            
        //   412: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   415: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   418: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   421: aload           $this$_init__u24lambda_u2d3
        //   423: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   426: dup            
        //   427: ldc             13.0
        //   429: iconst_0       
        //   430: iconst_2       
        //   431: aconst_null    
        //   432: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   435: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   438: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   441: aload           $this$_init__u24lambda_u2d3
        //   443: bipush          100
        //   445: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   448: checkcast       Ljava/lang/Number;
        //   451: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   454: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   457: ldc             26.0
        //   459: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   462: checkcast       Ljava/lang/Number;
        //   465: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   468: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   471: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   474: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   477: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   480: aload           $this$_init__u24lambda_u2d3
        //   482: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   485: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getText$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   488: checkcast       Lgg/essential/elementa/state/State;
        //   491: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   494: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   497: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   500: nop            
        //   501: nop            
        //   502: aload           4
        //   504: nop            
        //   505: aload_0         /* this */
        //   506: invokevirtual   gg/essential/vigilance/gui/SettingsCategory.getScroller$Vigilance:()Lgg/essential/elementa/components/ScrollComponent;
        //   509: checkcast       Lgg/essential/elementa/UIComponent;
        //   512: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   515: pop            
        //   516: new             Ljava/util/ArrayList;
        //   519: dup            
        //   520: invokespecial   java/util/ArrayList.<init>:()V
        //   523: astore_2        /* categoryItemsSettingsObjects */
        //   524: new             Ljava/util/ArrayList;
        //   527: dup            
        //   528: invokespecial   java/util/ArrayList.<init>:()V
        //   531: astore_3        /* dividerItemsSettingsObjects */
        //   532: aload_1         /* category */
        //   533: invokevirtual   gg/essential/vigilance/data/Category.getItems:()Ljava/util/List;
        //   536: checkcast       Ljava/lang/Iterable;
        //   539: astore          $this$forEach$iv
        //   541: iconst_0       
        //   542: istore          $i$f$forEach
        //   544: aload           $this$forEach$iv
        //   546: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   551: astore          6
        //   553: aload           6
        //   555: invokeinterface java/util/Iterator.hasNext:()Z
        //   560: ifeq            844
        //   563: aload           6
        //   565: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   570: astore          element$iv
        //   572: aload           element$iv
        //   574: checkcast       Lgg/essential/vigilance/data/CategoryItem;
        //   577: astore          it
        //   579: iconst_0       
        //   580: istore          $i$a$-forEach-SettingsCategory$3
        //   582: aload           it
        //   584: invokevirtual   gg/essential/vigilance/data/CategoryItem.toSettingsObject:()Lgg/essential/vigilance/gui/Setting;
        //   587: astore          settingsObject
        //   589: aload           settingsObject
        //   591: ifnull          840
        //   594: aload           settingsObject
        //   596: checkcast       Lgg/essential/elementa/UIComponent;
        //   599: aload_0         /* this */
        //   600: invokevirtual   gg/essential/vigilance/gui/SettingsCategory.getScroller$Vigilance:()Lgg/essential/elementa/components/ScrollComponent;
        //   603: checkcast       Lgg/essential/elementa/UIComponent;
        //   606: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   609: pop            
        //   610: aload           settingsObject
        //   612: instanceof      Lgg/essential/vigilance/gui/DataBackedSetting;
        //   615: ifeq            691
        //   618: aload_2         /* categoryItemsSettingsObjects */
        //   619: aload           settingsObject
        //   621: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   624: pop            
        //   625: aload           settingsObject
        //   627: checkcast       Lgg/essential/vigilance/gui/DataBackedSetting;
        //   630: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getData$Vigilance:()Lgg/essential/vigilance/data/PropertyData;
        //   633: invokevirtual   gg/essential/vigilance/data/PropertyData.isHidden:()Z
        //   636: ifeq            648
        //   639: aload           settingsObject
        //   641: checkcast       Lgg/essential/vigilance/gui/DataBackedSetting;
        //   644: iconst_1       
        //   645: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.hide:(Z)V
        //   648: aload           settingsObject
        //   650: checkcast       Lgg/essential/vigilance/gui/DataBackedSetting;
        //   653: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getData$Vigilance:()Lgg/essential/vigilance/data/PropertyData;
        //   656: invokevirtual   gg/essential/vigilance/data/PropertyData.getHasDependants:()Z
        //   659: ifeq            840
        //   662: aload           settingsObject
        //   664: checkcast       Lgg/essential/vigilance/gui/DataBackedSetting;
        //   667: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   670: new             Lgg/essential/vigilance/gui/SettingsCategory$3$1;
        //   673: dup            
        //   674: aload           settingsObject
        //   676: aload_2         /* categoryItemsSettingsObjects */
        //   677: aload_3         /* dividerItemsSettingsObjects */
        //   678: aload_1         /* category */
        //   679: invokespecial   gg/essential/vigilance/gui/SettingsCategory$3$1.<init>:(Lgg/essential/vigilance/gui/Setting;Ljava/util/ArrayList;Ljava/util/ArrayList;Lgg/essential/vigilance/data/Category;)V
        //   682: checkcast       Lkotlin/jvm/functions/Function1;
        //   685: invokevirtual   gg/essential/vigilance/gui/settings/SettingComponent.onValueChange:(Lkotlin/jvm/functions/Function1;)V
        //   688: goto            840
        //   691: aload           settingsObject
        //   693: instanceof      Lgg/essential/vigilance/gui/Divider;
        //   696: ifeq            840
        //   699: iconst_0       
        //   700: istore          flag
        //   702: iconst_0       
        //   703: istore          flag2
        //   705: aload_1         /* category */
        //   706: invokevirtual   gg/essential/vigilance/data/Category.getItems:()Ljava/util/List;
        //   709: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   714: astore          13
        //   716: aload           13
        //   718: invokeinterface java/util/Iterator.hasNext:()Z
        //   723: ifeq            805
        //   726: aload           13
        //   728: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   733: checkcast       Lgg/essential/vigilance/data/CategoryItem;
        //   736: astore          item
        //   738: aload           item
        //   740: instanceof      Lgg/essential/vigilance/data/PropertyItem;
        //   743: ifeq            716
        //   746: aload           item
        //   748: checkcast       Lgg/essential/vigilance/data/PropertyItem;
        //   751: invokevirtual   gg/essential/vigilance/data/PropertyItem.getSubcategory:()Ljava/lang/String;
        //   754: aload           settingsObject
        //   756: checkcast       Lgg/essential/vigilance/gui/Divider;
        //   759: invokevirtual   gg/essential/vigilance/gui/Divider.getName:()Ljava/lang/String;
        //   762: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   765: ifeq            716
        //   768: aload           item
        //   770: checkcast       Lgg/essential/vigilance/data/PropertyItem;
        //   773: invokevirtual   gg/essential/vigilance/data/PropertyItem.getData:()Lgg/essential/vigilance/data/PropertyData;
        //   776: invokevirtual   gg/essential/vigilance/data/PropertyData.getDependsOn:()Lgg/essential/vigilance/data/PropertyData;
        //   779: ifnull          785
        //   782: iconst_1       
        //   783: istore          flag
        //   785: aload           item
        //   787: checkcast       Lgg/essential/vigilance/data/PropertyItem;
        //   790: invokevirtual   gg/essential/vigilance/data/PropertyItem.getData:()Lgg/essential/vigilance/data/PropertyData;
        //   793: invokevirtual   gg/essential/vigilance/data/PropertyData.isHidden:()Z
        //   796: ifne            716
        //   799: iconst_1       
        //   800: istore          flag2
        //   802: goto            805
        //   805: iload           flag
        //   807: ifeq            840
        //   810: aload_3         /* dividerItemsSettingsObjects */
        //   811: aload           settingsObject
        //   813: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   816: pop            
        //   817: iload           flag2
        //   819: ifne            840
        //   822: aload           settingsObject
        //   824: checkcast       Lgg/essential/vigilance/gui/Divider;
        //   827: iconst_1       
        //   828: invokevirtual   gg/essential/vigilance/gui/Divider.hide:(Z)V
        //   831: aload           settingsObject
        //   833: checkcast       Lgg/essential/vigilance/gui/Divider;
        //   836: iconst_1       
        //   837: invokevirtual   gg/essential/vigilance/gui/Divider.setHidden$Vigilance:(Z)V
        //   840: nop            
        //   841: goto            553
        //   844: nop            
        //   845: aload_0         /* this */
        //   846: invokevirtual   gg/essential/vigilance/gui/SettingsCategory.getScroller$Vigilance:()Lgg/essential/elementa/components/ScrollComponent;
        //   849: aload_0         /* this */
        //   850: invokespecial   gg/essential/vigilance/gui/SettingsCategory.getScrollBar:()Lgg/essential/elementa/components/UIBlock;
        //   853: checkcast       Lgg/essential/elementa/UIComponent;
        //   856: iconst_1       
        //   857: invokevirtual   gg/essential/elementa/components/ScrollComponent.setVerticalScrollBarComponent:(Lgg/essential/elementa/UIComponent;Z)V
        //   860: aload_0         /* this */
        //   861: invokevirtual   gg/essential/vigilance/gui/SettingsCategory.getScroller$Vigilance:()Lgg/essential/elementa/components/ScrollComponent;
        //   864: new             Lgg/essential/vigilance/gui/SettingsCategory$4;
        //   867: dup            
        //   868: aload_0         /* this */
        //   869: invokespecial   gg/essential/vigilance/gui/SettingsCategory$4.<init>:(Lgg/essential/vigilance/gui/SettingsCategory;)V
        //   872: checkcast       Lkotlin/jvm/functions/Function2;
        //   875: invokevirtual   gg/essential/elementa/components/ScrollComponent.onMouseScroll:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   878: pop            
        //   879: nop            
        //   880: return         
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  category  
        //    StackMapTable: 00 09 FF 02 04 00 10 07 00 02 07 00 A9 07 00 43 01 07 00 43 07 00 43 01 07 00 6B 01 00 00 00 00 00 00 07 00 02 00 00 FF 00 24 00 10 07 00 02 07 00 A9 07 00 D4 07 00 D4 07 00 DB 01 07 00 E1 07 00 E3 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 5E 00 10 07 00 02 07 00 A9 07 00 D4 07 00 D4 07 00 DB 01 07 00 E1 07 00 E3 07 00 ED 01 07 01 06 00 00 00 00 07 00 02 00 00 2A FF 00 18 00 10 07 00 02 07 00 A9 07 00 D4 07 00 D4 07 00 DB 01 07 00 E1 07 00 E3 07 00 ED 01 07 01 06 01 01 07 00 E1 00 07 00 02 00 00 FF 00 44 00 10 07 00 02 07 00 A9 07 00 D4 07 00 D4 07 00 DB 01 07 00 E1 07 00 E3 07 00 ED 01 07 01 06 01 01 07 00 E1 07 00 ED 07 00 02 00 00 FF 00 13 00 10 07 00 02 07 00 A9 07 00 D4 07 00 D4 07 00 DB 01 07 00 E1 07 00 E3 07 00 ED 01 07 01 06 01 01 07 00 E1 00 07 00 02 00 00 FF 00 22 00 10 07 00 02 07 00 A9 07 00 D4 07 00 D4 07 00 DB 01 07 00 E1 07 00 E3 07 00 ED 01 07 01 06 00 00 00 00 07 00 02 00 00 FF 00 03 00 10 07 00 02 07 00 A9 07 00 D4 07 00 D4 07 00 DB 01 07 00 E1 07 00 E3 00 00 00 00 00 00 00 07 00 02 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final ScrollComponent getScroller$Vigilance() {
        return (ScrollComponent)this.scroller$delegate.getValue((Object)this, (KProperty)SettingsCategory.$$delegatedProperties[0]);
    }
    
    private final UIBlock getScrollBar() {
        return (UIBlock)this.scrollBar$delegate.getValue((Object)this, (KProperty)SettingsCategory.$$delegatedProperties[1]);
    }
    
    @JvmOverloads
    public final void closePopups(final boolean instantly) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   gg/essential/vigilance/gui/SettingsCategory.getScroller$Vigilance:()Lgg/essential/elementa/components/ScrollComponent;
        //     4: checkcast       Lgg/essential/elementa/UIComponent;
        //     7: astore_2        /* this_$iv */
        //     8: iconst_0       
        //     9: istore_3        /* $i$f$childrenOfType */
        //    10: aload_2         /* this_$iv */
        //    11: ldc_w           Lgg/essential/vigilance/gui/Setting;.class
        //    14: invokevirtual   gg/essential/elementa/UIComponent.childrenOfType:(Ljava/lang/Class;)Ljava/util/List;
        //    17: checkcast       Ljava/lang/Iterable;
        //    20: astore_2       
        //    21: nop            
        //    22: iconst_0       
        //    23: istore_3        /* $i$f$forEach */
        //    24: aload_2         /* $this$forEach$iv */
        //    25: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    30: astore          4
        //    32: aload           4
        //    34: invokeinterface java/util/Iterator.hasNext:()Z
        //    39: ifeq            71
        //    42: aload           4
        //    44: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    49: astore          element$iv
        //    51: aload           element$iv
        //    53: checkcast       Lgg/essential/vigilance/gui/Setting;
        //    56: astore          it
        //    58: iconst_0       
        //    59: istore          $i$a$-forEach-SettingsCategory$closePopups$1
        //    61: aload           it
        //    63: iload_1         /* instantly */
        //    64: invokevirtual   gg/essential/vigilance/gui/Setting.closePopups:(Z)V
        //    67: nop            
        //    68: goto            32
        //    71: nop            
        //    72: return         
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  instantly  
        //    StackMapTable: 00 02 FE 00 20 07 00 DB 01 07 00 E1 26
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static /* synthetic */ void closePopups$default(final SettingsCategory settingsCategory, boolean instantly, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            instantly = false;
        }
        settingsCategory.closePopups(instantly);
    }
    
    public final void scrollToTop() {
        this.getScroller$Vigilance().scrollToTop(false);
    }
    
    @JvmOverloads
    public final void closePopups() {
        closePopups$default(this, false, 1, null);
    }
    
    private static final boolean _init_$hideDividerMaybe(final Category $category, final Divider divider) {
        boolean f = false;
        final Iterable $this$forEach$iv = $category.getItems();
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final CategoryItem it = (CategoryItem)element$iv;
            final int n = 0;
            if (it instanceof PropertyItem && Intrinsics.areEqual((Object)((PropertyItem)it).getSubcategory(), (Object)divider.getName())) {
                if (((PropertyItem)it).getData().getDependsOn() != null) {
                    f = true;
                }
                if (!((PropertyItem)it).getData().isHidden()) {
                    return false;
                }
                continue;
            }
        }
        return f;
    }
    
    public static final /* synthetic */ boolean access$_init_$hideDividerMaybe(final Category $category, final Divider divider) {
        return _init_$hideDividerMaybe($category, divider);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsCategory.class, "scroller", "getScroller$Vigilance()Lgg/essential/elementa/components/ScrollComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsCategory.class, "scrollBar", "getScrollBar()Lgg/essential/elementa/components/UIBlock;", 0)) };
    }
}
