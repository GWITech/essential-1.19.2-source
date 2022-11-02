package gg.essential.gui.studio;

import kotlin.*;
import kotlin.reflect.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.mod.cosmetics.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000F
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0015
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\u0010\u000e
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010!
                                                   \u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005�\u0006\u0002\u0010\u0002J8\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00162\u0006\u0010\u001a\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u001cH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010	\u001a\u00020
                                                   8BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011�\u0006\u001d�\u0006
                                                   \u0010\u001e\u001a\u00020
                                                   X\u008a\u0084\u0002�\u0006
                                                   \u0010\u001f\u001a\u00020
                                                   X\u008a\u0084\u0002�\u0006
                                                   \u0010 \u001a\u00020\u000fX\u008a\u0084\u0002�\u0006
                                                   \u0010!\u001a\u00020
                                                   X\u008a\u0084\u0002�\u0006
                                                   \u0010"\u001a\u00020
                                                   X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/studio/CosmeticOption$PlacementOptions;", "Lgg/essential/elementa/components/UIBlock;", "(Lgg/essential/gui/studio/CosmeticOption;)V", "close", "Lgg/essential/elementa/UIComponent;", "getClose", "()Lgg/essential/elementa/UIComponent;", "close$delegate", "Lkotlin/properties/ReadWriteProperty;", "content", "Lgg/essential/elementa/components/UIContainer;", "getContent", "()Lgg/essential/elementa/components/UIContainer;", "content$delegate", "placementText", "Lgg/essential/gui/common/shadow/EssentialUIText;", "getPlacementText", "()Lgg/essential/gui/common/shadow/EssentialUIText;", "placementText$delegate", "getState", "", "currentSettings", "", "", "", "Lgg/essential/mod/cosmetics/CosmeticSetting;", "cosmeticId", "newSettings", "", "essential", "settingsContainer", "container", "sliderLabel", "sideSettingContainer", "switchContainer" })
public final class PlacementOptions extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ReadWriteProperty content$delegate;
    @NotNull
    private final ReadWriteProperty placementText$delegate;
    final /* synthetic */ CosmeticOption this$0;
    
    public PlacementOptions(final CosmeticOption this$0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1         /* this$0 */
        //     2: putfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //     5: aload_0         /* this */
        //     6: getstatic       gg/essential/gui/EssentialPalette.BUTTON:Ljava/awt/Color;
        //     9: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //    12: aload_0         /* this */
        //    13: new             Lgg/essential/elementa/components/UIContainer;
        //    16: dup            
        //    17: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    20: checkcast       Lgg/essential/elementa/UIComponent;
        //    23: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //    26: astore_2        /* $this$constrain$iv */
        //    27: aload_2         /* $this$constrain$iv */
        //    28: astore          4
        //    30: aload           4
        //    32: astore          $this$constrain_u24lambda_u2d0$iv
        //    34: aload           $this$constrain_u24lambda_u2d0$iv
        //    36: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    39: astore          7
        //    41: astore          34
        //    43: aload           $this$content_delegate_u24lambda_u2d0
        //    45: bipush          100
        //    47: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    50: checkcast       Ljava/lang/Number;
        //    53: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    56: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    59: bipush          8
        //    61: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    64: checkcast       Ljava/lang/Number;
        //    67: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    70: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    73: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //    76: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    79: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    82: aload           $this$content_delegate_u24lambda_u2d0
        //    84: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //    87: dup            
        //    88: fconst_0       
        //    89: iconst_1       
        //    90: aconst_null    
        //    91: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    94: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //    97: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   100: aload           34
        //   102: aload           4
        //   104: aload_0         /* this */
        //   105: checkcast       Lgg/essential/elementa/UIComponent;
        //   108: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   111: aload_0         /* this */
        //   112: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   115: iconst_0       
        //   116: aaload         
        //   117: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   120: putfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.content$delegate:Lkotlin/properties/ReadWriteProperty;
        //   123: aload_0         /* this */
        //   124: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   127: dup            
        //   128: ldc             "Placement"
        //   130: iconst_0       
        //   131: aconst_null    
        //   132: iconst_0       
        //   133: iconst_0       
        //   134: iconst_0       
        //   135: bipush          62
        //   137: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   140: checkcast       Lgg/essential/elementa/UIComponent;
        //   143: astore_2        /* $this$constrain$iv */
        //   144: aload_2         /* $this$constrain$iv */
        //   145: astore          4
        //   147: aload           4
        //   149: astore          $this$constrain_u24lambda_u2d0$iv
        //   151: aload           $this$constrain_u24lambda_u2d0$iv
        //   153: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   156: astore          7
        //   158: astore          34
        //   160: aload           $this$placementText_delegate_u24lambda_u2d1
        //   162: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //   165: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   168: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   171: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   174: aload           34
        //   176: aload           4
        //   178: aload_0         /* this */
        //   179: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   182: checkcast       Lgg/essential/elementa/UIComponent;
        //   185: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   188: aload_0         /* this */
        //   189: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   192: iconst_1       
        //   193: aaload         
        //   194: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   197: putfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.placementText$delegate:Lkotlin/properties/ReadWriteProperty;
        //   200: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //   203: dup            
        //   204: getstatic       gg/essential/gui/EssentialPalette.CANCEL_5X:Lgg/essential/gui/image/ImageFactory;
        //   207: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
        //   210: checkcast       Lgg/essential/elementa/UIComponent;
        //   213: astore_2        /* $this$constrain$iv */
        //   214: aload_2         /* $this$constrain$iv */
        //   215: astore          4
        //   217: aload           4
        //   219: astore          $this$constrain_u24lambda_u2d0$iv
        //   221: aload           $this$constrain_u24lambda_u2d0$iv
        //   223: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   226: astore          $this$close_delegate_u24lambda_u2d2
        //   228: aload           $this$close_delegate_u24lambda_u2d2
        //   230: iconst_0       
        //   231: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   234: checkcast       Ljava/lang/Number;
        //   237: iconst_1       
        //   238: iconst_0       
        //   239: iconst_2       
        //   240: aconst_null    
        //   241: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   244: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   247: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   250: aload           $this$close_delegate_u24lambda_u2d2
        //   252: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   255: dup            
        //   256: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   259: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   262: aload_0         /* this */
        //   263: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions.getPlacementText:()Lgg/essential/gui/common/shadow/EssentialUIText;
        //   266: checkcast       Lgg/essential/elementa/UIComponent;
        //   269: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   272: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   275: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   278: aload           4
        //   280: astore_2        /* $this$constrain$iv */
        //   281: aload_0         /* this */
        //   282: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //   285: astore_3       
        //   286: aload_2         /* $this$onLeftClick$iv */
        //   287: new             Lgg/essential/gui/studio/CosmeticOption$PlacementOptions$special$$inlined$onLeftClick$1;
        //   290: dup            
        //   291: aload_3        
        //   292: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //   295: checkcast       Lkotlin/jvm/functions/Function2;
        //   298: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   301: aload_0         /* this */
        //   302: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   305: checkcast       Lgg/essential/elementa/UIComponent;
        //   308: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   311: aload_0         /* this */
        //   312: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   315: iconst_2       
        //   316: aaload         
        //   317: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   320: pop            
        //   321: aload_0         /* this */
        //   322: checkcast       Lgg/essential/elementa/UIComponent;
        //   325: astore_2        /* $this$constrain$iv */
        //   326: aload_2         /* $this$constrain$iv */
        //   327: astore          4
        //   329: aload           4
        //   331: astore          $this$constrain_u24lambda_u2d0$iv
        //   333: aload           $this$constrain_u24lambda_u2d0$iv
        //   335: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   338: astore          $this$_init__u24lambda_u2d4
        //   340: aload           $this$_init__u24lambda_u2d4
        //   342: bipush          100
        //   344: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   347: checkcast       Ljava/lang/Number;
        //   350: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   353: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   356: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   359: aload           $this$_init__u24lambda_u2d4
        //   361: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   364: dup            
        //   365: fconst_0       
        //   366: iconst_1       
        //   367: aconst_null    
        //   368: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   371: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   374: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   377: new             Lgg/essential/elementa/components/UIContainer;
        //   380: dup            
        //   381: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   384: checkcast       Lgg/essential/elementa/UIComponent;
        //   387: astore_3        /* $this$constrain$iv */
        //   388: aload_3         /* $this$constrain$iv */
        //   389: astore          5
        //   391: aload           5
        //   393: astore          $this$constrain_u24lambda_u2d0$iv
        //   395: aload           $this$constrain_u24lambda_u2d0$iv
        //   397: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   400: astore          $this$_init__u24lambda_u2d5
        //   402: aload           $this$_init__u24lambda_u2d5
        //   404: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   407: dup            
        //   408: ldc             13.0
        //   410: iconst_0       
        //   411: iconst_2       
        //   412: aconst_null    
        //   413: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   416: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   419: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   422: aload           $this$_init__u24lambda_u2d5
        //   424: bipush          100
        //   426: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   429: checkcast       Ljava/lang/Number;
        //   432: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   435: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   438: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   441: aload           $this$_init__u24lambda_u2d5
        //   443: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   446: dup            
        //   447: iconst_0       
        //   448: iconst_1       
        //   449: aconst_null    
        //   450: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   453: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   456: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   459: aload           5
        //   461: aload_0         /* this */
        //   462: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   465: checkcast       Lgg/essential/elementa/UIComponent;
        //   468: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   471: aconst_null    
        //   472: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   475: iconst_3       
        //   476: aaload         
        //   477: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   480: astore_2        /* settingsContainer$delegate */
        //   481: aload_0         /* this */
        //   482: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //   485: invokevirtual   gg/essential/gui/studio/CosmeticOption.getCosmetic:()Lgg/essential/network/cosmetics/Cosmetic;
        //   488: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getSettings:()Ljava/util/List;
        //   491: astore_3        /* settings */
        //   492: aload_3         /* settings */
        //   493: checkcast       Ljava/lang/Iterable;
        //   496: astore          $this$filter$iv
        //   498: aload           $this$filter$iv
        //   500: astore          7
        //   502: new             Ljava/util/ArrayList;
        //   505: dup            
        //   506: invokespecial   java/util/ArrayList.<init>:()V
        //   509: checkcast       Ljava/util/Collection;
        //   512: astore          destination$iv$iv
        //   514: aload           $this$filterTo$iv$iv
        //   516: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   521: astore          10
        //   523: aload           10
        //   525: invokeinterface java/util/Iterator.hasNext:()Z
        //   530: ifeq            576
        //   533: aload           10
        //   535: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   540: astore          element$iv$iv
        //   542: aload           element$iv$iv
        //   544: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //   547: astore          it
        //   549: aload           it
        //   551: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getType:()Ljava/lang/String;
        //   554: ldc_w           "POSITION_RANGE"
        //   557: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   560: ifeq            523
        //   563: aload           destination$iv$iv
        //   565: aload           element$iv$iv
        //   567: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   572: pop            
        //   573: goto            523
        //   576: aload           destination$iv$iv
        //   578: checkcast       Ljava/util/List;
        //   581: checkcast       Ljava/lang/Iterable;
        //   584: astore          $this$flatMap$iv
        //   586: aload           $this$flatMap$iv
        //   588: astore          7
        //   590: new             Ljava/util/ArrayList;
        //   593: dup            
        //   594: invokespecial   java/util/ArrayList.<init>:()V
        //   597: checkcast       Ljava/util/Collection;
        //   600: astore          destination$iv$iv
        //   602: aload           $this$flatMapTo$iv$iv
        //   604: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   609: astore          10
        //   611: aload           10
        //   613: invokeinterface java/util/Iterator.hasNext:()Z
        //   618: ifeq            929
        //   621: aload           10
        //   623: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   628: astore          element$iv$iv
        //   630: aload           element$iv$iv
        //   632: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //   635: astore          setting
        //   637: iconst_3       
        //   638: anewarray       Ljava/lang/String;
        //   641: astore          14
        //   643: aload           14
        //   645: iconst_0       
        //   646: ldc_w           "x"
        //   649: aastore        
        //   650: aload           14
        //   652: iconst_1       
        //   653: ldc_w           "y"
        //   656: aastore        
        //   657: aload           14
        //   659: iconst_2       
        //   660: ldc_w           "z"
        //   663: aastore        
        //   664: aload           14
        //   666: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        //   669: checkcast       Ljava/lang/Iterable;
        //   672: astore          $this$mapIndexedNotNull$iv
        //   674: aload           $this$mapIndexedNotNull$iv
        //   676: astore          16
        //   678: new             Ljava/util/ArrayList;
        //   681: dup            
        //   682: invokespecial   java/util/ArrayList.<init>:()V
        //   685: checkcast       Ljava/util/Collection;
        //   688: astore          destination$iv$iv
        //   690: aload           $this$mapIndexedNotNullTo$iv$iv
        //   692: astore          $this$forEachIndexed$iv$iv$iv
        //   694: iconst_0       
        //   695: istore          index$iv$iv$iv
        //   697: aload           $this$forEachIndexed$iv$iv$iv
        //   699: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   704: astore          22
        //   706: aload           22
        //   708: invokeinterface java/util/Iterator.hasNext:()Z
        //   713: ifeq            908
        //   716: aload           22
        //   718: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   723: astore          item$iv$iv$iv
        //   725: iload           index$iv$iv$iv
        //   727: iinc            index$iv$iv$iv, 1
        //   730: istore          24
        //   732: iload           24
        //   734: ifge            740
        //   737: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        //   740: iload           24
        //   742: aload           item$iv$iv$iv
        //   744: astore          25
        //   746: istore          index$iv$iv
        //   748: iload           index$iv$iv
        //   750: aload           element$iv$iv
        //   752: checkcast       Ljava/lang/String;
        //   755: astore          27
        //   757: istore          index
        //   759: aload           setting
        //   761: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:()Ljava/util/Map;
        //   764: aload           axis
        //   766: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   771: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   776: astore          29
        //   778: aload           29
        //   780: instanceof      Ljava/lang/Number;
        //   783: ifeq            794
        //   786: aload           29
        //   788: checkcast       Ljava/lang/Number;
        //   791: goto            795
        //   794: aconst_null    
        //   795: dup            
        //   796: ifnonnull       804
        //   799: pop            
        //   800: aconst_null    
        //   801: goto            885
        //   804: astore          min
        //   806: aload           setting
        //   808: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:()Ljava/util/Map;
        //   811: aload           axis
        //   813: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   818: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   823: astore          31
        //   825: aload           31
        //   827: instanceof      Ljava/lang/Number;
        //   830: ifeq            841
        //   833: aload           31
        //   835: checkcast       Ljava/lang/Number;
        //   838: goto            842
        //   841: aconst_null    
        //   842: dup            
        //   843: ifnonnull       851
        //   846: pop            
        //   847: aconst_null    
        //   848: goto            885
        //   851: astore          max
        //   853: new             Lkotlin/Triple;
        //   856: dup            
        //   857: iload           index
        //   859: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   862: ldc_w           "Height: "
        //   865: new             Lkotlin/ranges/IntRange;
        //   868: dup            
        //   869: aload           min
        //   871: invokevirtual   java/lang/Number.intValue:()I
        //   874: aload           max
        //   876: invokevirtual   java/lang/Number.intValue:()I
        //   879: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   882: invokespecial   kotlin/Triple.<init>:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   885: dup            
        //   886: ifnull          904
        //   889: astore          it$iv$iv
        //   891: aload           destination$iv$iv
        //   893: aload           it$iv$iv
        //   895: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   900: pop            
        //   901: goto            706
        //   904: pop            
        //   905: goto            706
        //   908: aload           destination$iv$iv
        //   910: checkcast       Ljava/util/List;
        //   913: checkcast       Ljava/lang/Iterable;
        //   916: astore          list$iv$iv
        //   918: aload           destination$iv$iv
        //   920: aload           list$iv$iv
        //   922: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //   925: pop            
        //   926: goto            611
        //   929: aload           destination$iv$iv
        //   931: checkcast       Ljava/util/List;
        //   934: astore          positionSliders
        //   936: aload_0         /* this */
        //   937: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //   940: invokestatic    gg/essential/gui/studio/CosmeticOption.access$getCosmeticsManager$p:(Lgg/essential/gui/studio/CosmeticOption;)Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //   943: invokestatic    gg/essential/util/UUIDUtil.getClientUUID:()Ljava/util/UUID;
        //   946: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getCosmeticSettings:(Ljava/util/UUID;)Lcom/google/common/collect/ImmutableMap;
        //   949: astore          cosmeticSettings
        //   951: aload           cosmeticSettings
        //   953: dup            
        //   954: ifnull          963
        //   957: checkcast       Ljava/util/Map;
        //   960: goto            974
        //   963: pop            
        //   964: new             Ljava/util/LinkedHashMap;
        //   967: dup            
        //   968: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   971: checkcast       Ljava/util/Map;
        //   974: astore          currentSettings
        //   976: aload_0         /* this */
        //   977: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //   980: invokevirtual   gg/essential/gui/studio/CosmeticOption.getCosmetic:()Lgg/essential/network/cosmetics/Cosmetic;
        //   983: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //   986: astore          cosmeticId
        //   988: aload           positionSliders
        //   990: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   995: astore          8
        //   997: aload           8
        //   999: invokeinterface java/util/Iterator.hasNext:()Z
        //  1004: ifeq            1408
        //  1007: aload           8
        //  1009: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1014: checkcast       Lkotlin/Triple;
        //  1017: astore          9
        //  1019: aload           9
        //  1021: invokevirtual   kotlin/Triple.component1:()Ljava/lang/Object;
        //  1024: checkcast       Ljava/lang/Number;
        //  1027: invokevirtual   java/lang/Number.intValue:()I
        //  1030: istore          index
        //  1032: aload           9
        //  1034: invokevirtual   kotlin/Triple.component2:()Ljava/lang/Object;
        //  1037: checkcast       Ljava/lang/String;
        //  1040: astore          label
        //  1042: aload           9
        //  1044: invokevirtual   kotlin/Triple.component3:()Ljava/lang/Object;
        //  1047: checkcast       Lkotlin/ranges/IntRange;
        //  1050: astore          range
        //  1052: new             Lgg/essential/elementa/components/UIContainer;
        //  1055: dup            
        //  1056: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1059: checkcast       Lgg/essential/elementa/UIComponent;
        //  1062: astore          $this$constrain$iv
        //  1064: aload           $this$constrain$iv
        //  1066: astore          16
        //  1068: aload           16
        //  1070: astore          $this$constrain_u24lambda_u2d0$iv
        //  1072: aload           $this$constrain_u24lambda_u2d0$iv
        //  1074: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1077: astore          $this$_init__u24lambda_u2d10
        //  1079: aload           $this$_init__u24lambda_u2d10
        //  1081: bipush          100
        //  1083: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1086: checkcast       Ljava/lang/Number;
        //  1089: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1092: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1095: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1098: aload           $this$_init__u24lambda_u2d10
        //  1100: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //  1103: dup            
        //  1104: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //  1107: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1110: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1113: aload           16
        //  1115: aload_2         /* settingsContainer$delegate */
        //  1116: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-6:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //  1119: checkcast       Lgg/essential/elementa/UIComponent;
        //  1122: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1125: aconst_null    
        //  1126: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1129: iconst_4       
        //  1130: aaload         
        //  1131: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1134: astore          container$delegate
        //  1136: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1139: dup            
        //  1140: aload           label
        //  1142: iconst_0       
        //  1143: aconst_null    
        //  1144: iconst_0       
        //  1145: iconst_0       
        //  1146: iconst_0       
        //  1147: bipush          62
        //  1149: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  1152: checkcast       Lgg/essential/elementa/UIComponent;
        //  1155: astore          $this$constrain$iv
        //  1157: aload           $this$constrain$iv
        //  1159: astore          17
        //  1161: aload           17
        //  1163: astore          $this$constrain_u24lambda_u2d0$iv
        //  1165: aload           $this$constrain_u24lambda_u2d0$iv
        //  1167: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1170: astore          $this$_init__u24lambda_u2d12
        //  1172: aload           $this$_init__u24lambda_u2d12
        //  1174: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1177: dup            
        //  1178: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1181: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1184: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1187: aload           $this$_init__u24lambda_u2d12
        //  1189: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //  1192: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1195: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1198: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1201: aload           17
        //  1203: aload           container$delegate
        //  1205: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-11:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //  1208: checkcast       Lgg/essential/elementa/UIComponent;
        //  1211: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1214: aconst_null    
        //  1215: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1218: iconst_5       
        //  1219: aaload         
        //  1220: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1223: pop            
        //  1224: aload_0         /* this */
        //  1225: aload           currentSettings
        //  1227: aload           cosmeticId
        //  1229: new             Ljava/util/ArrayList;
        //  1232: dup            
        //  1233: invokespecial   java/util/ArrayList.<init>:()V
        //  1236: checkcast       Ljava/util/List;
        //  1239: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions.getState:(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)[I
        //  1242: astore          state
        //  1244: new             Lgg/essential/gui/common/IntEssentialSlider;
        //  1247: dup            
        //  1248: aload           range
        //  1250: invokevirtual   kotlin/ranges/IntRange.getFirst:()I
        //  1253: aload           range
        //  1255: invokevirtual   kotlin/ranges/IntRange.getLast:()I
        //  1258: aload           state
        //  1260: iload           index
        //  1262: iaload         
        //  1263: invokespecial   gg/essential/gui/common/IntEssentialSlider.<init>:(III)V
        //  1266: checkcast       Lgg/essential/elementa/UIComponent;
        //  1269: astore          $this$constrain$iv
        //  1271: aload           $this$constrain$iv
        //  1273: astore          19
        //  1275: aload           19
        //  1277: astore          $this$constrain_u24lambda_u2d0$iv
        //  1279: aload           $this$constrain_u24lambda_u2d0$iv
        //  1281: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1284: astore          $this$_init__u24lambda_u2d14
        //  1286: aload           $this$_init__u24lambda_u2d14
        //  1288: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1291: dup            
        //  1292: fconst_0       
        //  1293: iconst_0       
        //  1294: iconst_3       
        //  1295: aconst_null    
        //  1296: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1299: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1302: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1305: aload           $this$_init__u24lambda_u2d14
        //  1307: new             Lgg/essential/elementa/constraints/FillConstraint;
        //  1310: dup            
        //  1311: iconst_0       
        //  1312: iconst_1       
        //  1313: aconst_null    
        //  1314: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1317: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1320: iconst_1       
        //  1321: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1324: checkcast       Ljava/lang/Number;
        //  1327: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1330: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1333: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  1336: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1339: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1342: aload           $this$_init__u24lambda_u2d14
        //  1344: bipush          12
        //  1346: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1349: checkcast       Ljava/lang/Number;
        //  1352: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1355: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1358: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1361: aload           19
        //  1363: aload           container$delegate
        //  1365: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-11:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //  1368: checkcast       Lgg/essential/elementa/UIComponent;
        //  1371: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1374: checkcast       Lgg/essential/gui/common/IntEssentialSlider;
        //  1377: astore          sliderComponent
        //  1379: aload           sliderComponent
        //  1381: new             Lgg/essential/gui/studio/CosmeticOption$PlacementOptions$5;
        //  1384: dup            
        //  1385: aload_0         /* this */
        //  1386: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //  1389: aload           cosmeticId
        //  1391: aload_0         /* this */
        //  1392: aload           currentSettings
        //  1394: iload           index
        //  1396: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions$5.<init>:(Lgg/essential/gui/studio/CosmeticOption;Ljava/lang/String;Lgg/essential/gui/studio/CosmeticOption$PlacementOptions;Ljava/util/Map;I)V
        //  1399: checkcast       Lkotlin/jvm/functions/Function1;
        //  1402: invokevirtual   gg/essential/gui/common/IntEssentialSlider.onUpdateInt:(Lkotlin/jvm/functions/Function1;)V
        //  1405: goto            997
        //  1408: aload_0         /* this */
        //  1409: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //  1412: invokestatic    gg/essential/gui/studio/CosmeticOption.access$getHasSideOption$p:(Lgg/essential/gui/studio/CosmeticOption;)Lgg/essential/elementa/state/BasicState;
        //  1415: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
        //  1418: checkcast       Ljava/lang/Boolean;
        //  1421: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1424: ifeq            2172
        //  1427: new             Lgg/essential/elementa/components/UIContainer;
        //  1430: dup            
        //  1431: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1434: checkcast       Lgg/essential/elementa/UIComponent;
        //  1437: astore          $this$constrain$iv
        //  1439: aload           $this$constrain$iv
        //  1441: astore          11
        //  1443: aload           11
        //  1445: astore          $this$constrain_u24lambda_u2d0$iv
        //  1447: aload           $this$constrain_u24lambda_u2d0$iv
        //  1449: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1452: astore          $this$_init__u24lambda_u2d15
        //  1454: aload           $this$_init__u24lambda_u2d15
        //  1456: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1459: dup            
        //  1460: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1463: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1466: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1469: aload           $this$_init__u24lambda_u2d15
        //  1471: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1474: dup            
        //  1475: ldc_w           5.0
        //  1478: iconst_0       
        //  1479: iconst_2       
        //  1480: aconst_null    
        //  1481: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1484: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1487: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1490: aload           $this$_init__u24lambda_u2d15
        //  1492: bipush          100
        //  1494: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1497: checkcast       Ljava/lang/Number;
        //  1500: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1503: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1506: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1509: aload           $this$_init__u24lambda_u2d15
        //  1511: bipush          10
        //  1513: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1516: checkcast       Ljava/lang/Number;
        //  1519: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1522: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1525: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1528: aload           11
        //  1530: aload_2         /* settingsContainer$delegate */
        //  1531: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-6:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //  1534: checkcast       Lgg/essential/elementa/UIComponent;
        //  1537: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1540: aconst_null    
        //  1541: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1544: bipush          6
        //  1546: aaload         
        //  1547: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1550: astore          sideSettingContainer$delegate
        //  1552: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1555: dup            
        //  1556: ldc_w           "Side: "
        //  1559: iconst_0       
        //  1560: aconst_null    
        //  1561: iconst_0       
        //  1562: iconst_0       
        //  1563: iconst_0       
        //  1564: bipush          62
        //  1566: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  1569: checkcast       Lgg/essential/elementa/UIComponent;
        //  1572: astore          $this$constrain$iv
        //  1574: aload           $this$constrain$iv
        //  1576: astore          11
        //  1578: aload           11
        //  1580: astore          $this$constrain_u24lambda_u2d0$iv
        //  1582: aload           $this$constrain_u24lambda_u2d0$iv
        //  1584: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1587: astore          $this$_init__u24lambda_u2d17
        //  1589: aload           $this$_init__u24lambda_u2d17
        //  1591: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1594: dup            
        //  1595: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1598: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1601: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1604: aload           $this$_init__u24lambda_u2d17
        //  1606: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //  1609: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1612: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1615: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1618: aload           11
        //  1620: aload           sideSettingContainer$delegate
        //  1622: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-16:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //  1625: checkcast       Lgg/essential/elementa/UIComponent;
        //  1628: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1631: pop            
        //  1632: aload           currentSettings
        //  1634: aload           cosmeticId
        //  1636: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1641: checkcast       Lcom/google/common/collect/ImmutableList;
        //  1644: dup            
        //  1645: ifnull          1733
        //  1648: checkcast       Ljava/lang/Iterable;
        //  1651: astore          13
        //  1653: aload           13
        //  1655: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1660: astore          14
        //  1662: aload           14
        //  1664: invokeinterface java/util/Iterator.hasNext:()Z
        //  1669: ifeq            1707
        //  1672: aload           14
        //  1674: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1679: astore          15
        //  1681: aload           15
        //  1683: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //  1686: astore          it
        //  1688: aload           it
        //  1690: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getType:()Ljava/lang/String;
        //  1693: ldc_w           "SIDE"
        //  1696: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1699: ifeq            1662
        //  1702: aload           15
        //  1704: goto            1708
        //  1707: aconst_null    
        //  1708: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //  1711: dup            
        //  1712: ifnull          1733
        //  1715: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:()Ljava/util/Map;
        //  1718: dup            
        //  1719: ifnull          1733
        //  1722: ldc_w           "SIDE"
        //  1725: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1730: goto            1735
        //  1733: pop            
        //  1734: aconst_null    
        //  1735: getstatic       gg/essential/model/Side.RIGHT:Lgg/essential/model/Side;
        //  1738: invokevirtual   gg/essential/model/Side.name:()Ljava/lang/String;
        //  1741: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1744: istore          rightSide
        //  1746: new             Lgg/essential/elementa/components/UIContainer;
        //  1749: dup            
        //  1750: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1753: checkcast       Lgg/essential/elementa/UIComponent;
        //  1756: astore          $this$constrain$iv
        //  1758: aload           $this$constrain$iv
        //  1760: astore          13
        //  1762: aload           13
        //  1764: astore          $this$constrain_u24lambda_u2d0$iv
        //  1766: aload           $this$constrain_u24lambda_u2d0$iv
        //  1768: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1771: astore          $this$_init__u24lambda_u2d19
        //  1773: aload           $this$_init__u24lambda_u2d19
        //  1775: bipush          6
        //  1777: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1780: checkcast       Ljava/lang/Number;
        //  1783: iconst_1       
        //  1784: iconst_0       
        //  1785: iconst_2       
        //  1786: aconst_null    
        //  1787: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1790: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1793: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1796: aload           $this$_init__u24lambda_u2d19
        //  1798: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1801: dup            
        //  1802: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1805: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1808: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1811: aload           $this$_init__u24lambda_u2d19
        //  1813: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1816: dup            
        //  1817: fconst_0       
        //  1818: iconst_1       
        //  1819: aconst_null    
        //  1820: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1823: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1826: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1829: aload           $this$_init__u24lambda_u2d19
        //  1831: bipush          100
        //  1833: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1836: checkcast       Ljava/lang/Number;
        //  1839: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1842: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1845: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1848: aload           13
        //  1850: aload           sideSettingContainer$delegate
        //  1852: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-16:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //  1855: checkcast       Lgg/essential/elementa/UIComponent;
        //  1858: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1861: aconst_null    
        //  1862: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1865: bipush          7
        //  1867: aaload         
        //  1868: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1871: astore          switchContainer$delegate
        //  1873: new             Lgg/essential/elementa/state/BasicState;
        //  1876: dup            
        //  1877: iload           rightSide
        //  1879: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1882: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1885: astore          rightSideEnabled
        //  1887: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1890: dup            
        //  1891: ldc_w           "L"
        //  1894: iconst_0       
        //  1895: aconst_null    
        //  1896: iconst_0       
        //  1897: iconst_0       
        //  1898: iconst_0       
        //  1899: bipush          62
        //  1901: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  1904: checkcast       Lgg/essential/elementa/UIComponent;
        //  1907: astore          $this$constrain$iv
        //  1909: aload           $this$constrain$iv
        //  1911: astore          14
        //  1913: aload           14
        //  1915: astore          $this$constrain_u24lambda_u2d0$iv
        //  1917: aload           $this$constrain_u24lambda_u2d0$iv
        //  1919: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1922: astore          $this$_init__u24lambda_u2d21
        //  1924: aload           $this$_init__u24lambda_u2d21
        //  1926: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1929: dup            
        //  1930: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1933: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1936: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1939: aload           $this$_init__u24lambda_u2d21
        //  1941: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //  1944: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1947: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1950: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1953: aload           14
        //  1955: aload           switchContainer$delegate
        //  1957: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-20:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //  1960: checkcast       Lgg/essential/elementa/UIComponent;
        //  1963: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1966: pop            
        //  1967: new             Lgg/essential/gui/common/CompactEssentialToggle;
        //  1970: dup            
        //  1971: aload           rightSideEnabled
        //  1973: checkcast       Lgg/essential/elementa/state/State;
        //  1976: invokespecial   gg/essential/gui/common/CompactEssentialToggle.<init>:(Lgg/essential/elementa/state/State;)V
        //  1979: checkcast       Lgg/essential/elementa/UIComponent;
        //  1982: astore          $this$constrain$iv
        //  1984: aload           $this$constrain$iv
        //  1986: astore          15
        //  1988: aload           15
        //  1990: astore          $this$constrain_u24lambda_u2d0$iv
        //  1992: aload           $this$constrain_u24lambda_u2d0$iv
        //  1994: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1997: astore          $this$_init__u24lambda_u2d22
        //  1999: aload           $this$_init__u24lambda_u2d22
        //  2001: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  2004: dup            
        //  2005: ldc_w           3.0
        //  2008: iconst_0       
        //  2009: iconst_2       
        //  2010: aconst_null    
        //  2011: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2014: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2017: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2020: aload           $this$_init__u24lambda_u2d22
        //  2022: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  2025: dup            
        //  2026: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  2029: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  2032: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  2035: aload           15
        //  2037: aload           switchContainer$delegate
        //  2039: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-20:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //  2042: checkcast       Lgg/essential/elementa/UIComponent;
        //  2045: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2048: pop            
        //  2049: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  2052: dup            
        //  2053: ldc_w           "R"
        //  2056: iconst_0       
        //  2057: aconst_null    
        //  2058: iconst_0       
        //  2059: iconst_0       
        //  2060: iconst_0       
        //  2061: bipush          62
        //  2063: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  2066: checkcast       Lgg/essential/elementa/UIComponent;
        //  2069: astore          $this$constrain$iv
        //  2071: aload           $this$constrain$iv
        //  2073: astore          15
        //  2075: aload           15
        //  2077: astore          $this$constrain_u24lambda_u2d0$iv
        //  2079: aload           $this$constrain_u24lambda_u2d0$iv
        //  2081: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2084: astore          $this$_init__u24lambda_u2d23
        //  2086: aload           $this$_init__u24lambda_u2d23
        //  2088: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  2091: dup            
        //  2092: ldc_w           4.0
        //  2095: iconst_0       
        //  2096: iconst_2       
        //  2097: aconst_null    
        //  2098: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2101: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2104: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2107: aload           $this$_init__u24lambda_u2d23
        //  2109: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  2112: dup            
        //  2113: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  2116: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  2119: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  2122: aload           $this$_init__u24lambda_u2d23
        //  2124: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //  2127: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  2130: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  2133: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  2136: aload           15
        //  2138: aload           switchContainer$delegate
        //  2140: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-20:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //  2143: checkcast       Lgg/essential/elementa/UIComponent;
        //  2146: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2149: pop            
        //  2150: aload           rightSideEnabled
        //  2152: new             Lgg/essential/gui/studio/CosmeticOption$PlacementOptions$9;
        //  2155: dup            
        //  2156: aload_0         /* this */
        //  2157: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //  2160: aload           cosmeticId
        //  2162: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions$9.<init>:(Lgg/essential/gui/studio/CosmeticOption;Ljava/lang/String;)V
        //  2165: checkcast       Lkotlin/jvm/functions/Function1;
        //  2168: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  2171: pop            
        //  2172: return         
        //    Signature:
        //  (Lgg/essential/gui/studio/CosmeticOption;)V [from metadata: ()V]
        //  
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  this$0  
        //    StackMapTable: 00 19 FF 02 0B 00 0B 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 07 00 FC 00 00 F9 00 34 FD 00 22 00 07 00 FC FF 00 5E 00 17 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 07 00 FC 00 07 01 06 00 00 00 00 07 00 F4 00 00 00 01 07 00 FC 00 00 FD 00 21 07 01 2B 01 FF 00 35 00 1D 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 07 00 FC 00 07 01 06 00 00 00 00 07 00 F4 00 00 00 01 07 00 FC 00 00 00 00 07 01 1A 01 00 00 40 07 00 61 48 07 00 61 FF 00 24 00 1F 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 07 00 FC 00 07 01 06 00 00 00 00 07 00 F4 00 00 00 01 07 00 FC 00 00 00 00 00 01 00 07 00 61 00 00 40 07 00 61 48 07 00 61 FF 00 21 00 17 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 07 00 FC 00 07 01 06 00 00 00 00 07 00 F4 00 00 00 01 07 00 FC 00 01 07 01 46 52 07 01 46 FF 00 03 00 12 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 07 00 FC 00 00 00 00 00 00 07 00 F4 00 00 FF 00 14 00 09 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 00 FF 00 21 00 05 07 00 02 00 07 00 FA 00 07 01 18 00 01 07 01 6A 4A 07 01 3D FF 00 16 00 09 07 00 02 00 07 00 FA 00 00 00 07 01 3D 07 01 1A 07 00 FC 00 00 FA 01 9A FF 00 FD 00 0F 07 00 02 00 00 00 00 00 00 07 01 1A 07 00 FA 00 00 00 00 00 07 00 FC 00 00 FF 00 2C 00 09 07 00 02 00 00 00 00 00 00 07 01 1A 07 00 FA 00 00 40 07 01 2B 58 07 01 2B 41 07 01 2B FF 01 B4 00 00 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIContainer getContent() {
        return (UIContainer)this.content$delegate.getValue((Object)this, (KProperty)PlacementOptions.$$delegatedProperties[0]);
    }
    
    private final EssentialUIText getPlacementText() {
        return (EssentialUIText)this.placementText$delegate.getValue((Object)this, (KProperty)PlacementOptions.$$delegatedProperties[1]);
    }
    
    private final int[] getState(final Map<String, ? extends List<CosmeticSetting>> currentSettings, final String cosmeticId, final List<CosmeticSetting> newSettings) {
        int currentX = 0;
        int currentY = 0;
        int currentZ = 0;
        final List list = (List)currentSettings.get(cosmeticId);
        if (list != null) {
            final List it = list;
            for (final CosmeticSetting i : it) {
                if (Intrinsics.areEqual((Object)"PLAYER_POSITION_ADJUSTMENT", (Object)i.getType())) {
                    if (i.hasData("x")) {
                        final Number data = i.getData("x");
                        Intrinsics.checkNotNull((Object)data);
                        currentX = data.intValue();
                    }
                    if (i.hasData("y")) {
                        final Number data2 = i.getData("y");
                        Intrinsics.checkNotNull((Object)data2);
                        currentY = data2.intValue();
                    }
                    if (!i.hasData("z")) {
                        continue;
                    }
                    final Number data3 = i.getData("z");
                    Intrinsics.checkNotNull((Object)data3);
                    currentZ = data3.intValue();
                }
                else {
                    newSettings.add(i);
                }
            }
        }
        return new int[] { currentX, currentY, currentZ };
    }
    
    private static final UIContainer _init_$lambda-6(final ReadWriteProperty<Object, UIContainer> $settingsContainer$delegate) {
        return (UIContainer)$settingsContainer$delegate.getValue((Object)null, (KProperty)PlacementOptions.$$delegatedProperties[3]);
    }
    
    private static final UIContainer _init_$lambda-11(final ReadWriteProperty<Object, UIContainer> $container$delegate) {
        return (UIContainer)$container$delegate.getValue((Object)null, (KProperty)PlacementOptions.$$delegatedProperties[4]);
    }
    
    private static final UIContainer _init_$lambda-16(final ReadWriteProperty<Object, UIContainer> $sideSettingContainer$delegate) {
        return (UIContainer)$sideSettingContainer$delegate.getValue((Object)null, (KProperty)PlacementOptions.$$delegatedProperties[6]);
    }
    
    private static final UIContainer _init_$lambda-20(final ReadWriteProperty<Object, UIContainer> $switchContainer$delegate) {
        return (UIContainer)$switchContainer$delegate.getValue((Object)null, (KProperty)PlacementOptions.$$delegatedProperties[7]);
    }
    
    public static final /* synthetic */ int[] access$getState(final PlacementOptions $this, final Map currentSettings, final String cosmeticId, final List newSettings) {
        return $this.getState(currentSettings, cosmeticId, newSettings);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PlacementOptions.class, "content", "getContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PlacementOptions.class, "placementText", "getPlacementText()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PlacementOptions.class, "close", "getClose()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PlacementOptions.class, "settingsContainer", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PlacementOptions.class, "container", "<v#1>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PlacementOptions.class, "sliderLabel", "<v#2>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PlacementOptions.class, "sideSettingContainer", "<v#3>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PlacementOptions.class, "switchContainer", "<v#4>", 0)) };
    }
}
