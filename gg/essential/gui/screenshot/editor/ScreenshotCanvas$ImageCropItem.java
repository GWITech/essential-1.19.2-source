package gg.essential.gui.screenshot.editor;

import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000"
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0007
                                                   \u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b	\u0010
                                                   "\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u000f\u0010\u0010"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0010"\u0004\b\u0015\u0010\u0012¨\u0006\u0016""" }, d2 = { "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;", "Lgg/essential/elementa/components/UIContainer;", "alignment", "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;", "(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;)V", "getAlignment", "()Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;", "dragging", "", "getDragging", "()Z", "setDragging", "(Z)V", "xDragOffset", "", "getXDragOffset", "()F", "setXDragOffset", "(F)V", "yDragOffset", "getYDragOffset", "setYDragOffset", "essential" })
public final class ImageCropItem extends UIContainer
{
    @NotNull
    private final CropAlignment alignment;
    private boolean dragging;
    private float xDragOffset;
    private float yDragOffset;
    final /* synthetic */ ScreenshotCanvas this$0;
    
    public ImageCropItem(@NotNull final ScreenshotCanvas this$0, final CropAlignment alignment) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "alignment"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: aload_1         /* this$0 */
        //     8: putfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //    11: aload_0         /* this */
        //    12: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    15: aload_0         /* this */
        //    16: aload_2         /* alignment */
        //    17: putfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //    20: aload_0         /* this */
        //    21: checkcast       Lgg/essential/elementa/UIComponent;
        //    24: astore_3       
        //    25: aload_0         /* this */
        //    26: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //    29: astore          4
        //    31: aload_3         /* $this$constrain$iv */
        //    32: astore          6
        //    34: aload           6
        //    36: astore          $this$constrain_u24lambda_u2d0$iv
        //    38: aload           $this$constrain_u24lambda_u2d0$iv
        //    40: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    43: astore          $this$_init__u24lambda_u2d0
        //    45: aload           $this$_init__u24lambda_u2d0
        //    47: bipush          15
        //    49: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    52: checkcast       Ljava/lang/Number;
        //    55: iconst_0       
        //    56: iconst_0       
        //    57: iconst_3       
        //    58: aconst_null    
        //    59: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    62: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //    65: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //    68: aload           $this$_init__u24lambda_u2d0
        //    70: bipush          15
        //    72: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    75: checkcast       Ljava/lang/Number;
        //    78: iconst_0       
        //    79: iconst_0       
        //    80: iconst_3       
        //    81: aconst_null    
        //    82: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    85: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    88: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    91: aload           $this$_init__u24lambda_u2d0
        //    93: aload_0         /* this */
        //    94: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //    97: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getCenterX:()Z
        //   100: ifeq            116
        //   103: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   106: dup            
        //   107: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   110: checkcast       Lgg/essential/elementa/constraints/PositionConstraint;
        //   113: goto            144
        //   116: invokestatic    gg/essential/gui/screenshot/editor/ScreenshotCanvas.access$getPadding$p$2da702bc:()I
        //   119: pop            
        //   120: bipush          -2
        //   122: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   125: checkcast       Ljava/lang/Number;
        //   128: aload_0         /* this */
        //   129: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //   132: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpX:()Z
        //   135: iconst_0       
        //   136: iconst_2       
        //   137: aconst_null    
        //   138: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   141: checkcast       Lgg/essential/elementa/constraints/PositionConstraint;
        //   144: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   147: aload           4
        //   149: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas.getRetainedImage:()Lgg/essential/elementa/components/UIContainer;
        //   152: checkcast       Lgg/essential/elementa/UIComponent;
        //   155: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   158: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   161: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   164: aload           $this$_init__u24lambda_u2d0
        //   166: aload_0         /* this */
        //   167: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //   170: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getCenterY:()Z
        //   173: ifeq            189
        //   176: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   179: dup            
        //   180: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   183: checkcast       Lgg/essential/elementa/constraints/PositionConstraint;
        //   186: goto            217
        //   189: invokestatic    gg/essential/gui/screenshot/editor/ScreenshotCanvas.access$getPadding$p$2da702bc:()I
        //   192: pop            
        //   193: bipush          -2
        //   195: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   198: checkcast       Ljava/lang/Number;
        //   201: aload_0         /* this */
        //   202: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //   205: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpY:()Z
        //   208: iconst_0       
        //   209: iconst_2       
        //   210: aconst_null    
        //   211: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   214: checkcast       Lgg/essential/elementa/constraints/PositionConstraint;
        //   217: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   220: aload           4
        //   222: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas.getRetainedImage:()Lgg/essential/elementa/components/UIContainer;
        //   225: checkcast       Lgg/essential/elementa/UIComponent;
        //   228: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   231: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   234: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   237: aload_0         /* this */
        //   238: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //   241: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getCorner:()Z
        //   244: ifeq            588
        //   247: aload_0         /* this */
        //   248: checkcast       Lgg/essential/elementa/UIComponent;
        //   251: astore_3        /* $this$addChild$iv */
        //   252: aload_3         /* $this$addChild$iv */
        //   253: astore          5
        //   255: aload           5
        //   257: astore          $this$addChild_u24lambda_u2d1$iv
        //   259: aload           $this$addChild_u24lambda_u2d1$iv
        //   261: aload           $this$addChild_u24lambda_u2d1$iv
        //   263: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;
        //   266: astore          8
        //   268: astore          14
        //   270: new             Lgg/essential/elementa/components/UIBlock;
        //   273: dup            
        //   274: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //   277: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   280: checkcast       Lgg/essential/elementa/UIComponent;
        //   283: astore          $this$constrain$iv
        //   285: aload           $this$constrain$iv
        //   287: astore          11
        //   289: aload           11
        //   291: astore          $this$constrain_u24lambda_u2d0$iv
        //   293: aload           $this$constrain_u24lambda_u2d0$iv
        //   295: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   298: astore          $this$lambda_u2d2_u24lambda_u2d1
        //   300: aload           $this$lambda_u2d2_u24lambda_u2d1
        //   302: aload           $this$_init__u24lambda_u2d2
        //   304: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //   307: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpX:()Z
        //   310: ifeq            317
        //   313: iconst_0       
        //   314: goto            318
        //   317: iconst_0       
        //   318: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   321: checkcast       Ljava/lang/Number;
        //   324: iconst_0       
        //   325: iconst_0       
        //   326: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
        //   329: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   332: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   335: aload           $this$lambda_u2d2_u24lambda_u2d1
        //   337: iconst_0       
        //   338: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   341: checkcast       Ljava/lang/Number;
        //   344: aload           $this$_init__u24lambda_u2d2
        //   346: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //   349: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpY:()Z
        //   352: iconst_0       
        //   353: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
        //   356: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   359: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   362: aload           $this$lambda_u2d2_u24lambda_u2d1
        //   364: bipush          15
        //   366: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   369: checkcast       Ljava/lang/Number;
        //   372: iconst_0       
        //   373: iconst_0       
        //   374: iconst_3       
        //   375: aconst_null    
        //   376: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   379: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   382: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   385: aload           $this$lambda_u2d2_u24lambda_u2d1
        //   387: iconst_2       
        //   388: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   391: checkcast       Ljava/lang/Number;
        //   394: iconst_0       
        //   395: iconst_0       
        //   396: iconst_3       
        //   397: aconst_null    
        //   398: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   401: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   404: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   407: aload           11
        //   409: aload           14
        //   411: swap           
        //   412: invokevirtual   gg/essential/elementa/UIComponent.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   415: pop            
        //   416: aload_0         /* this */
        //   417: checkcast       Lgg/essential/elementa/UIComponent;
        //   420: astore_3        /* $this$addChild$iv */
        //   421: aload_3         /* $this$addChild$iv */
        //   422: astore          5
        //   424: aload           5
        //   426: astore          $this$addChild_u24lambda_u2d1$iv
        //   428: aload           $this$addChild_u24lambda_u2d1$iv
        //   430: aload           $this$addChild_u24lambda_u2d1$iv
        //   432: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;
        //   435: astore          8
        //   437: astore          14
        //   439: new             Lgg/essential/elementa/components/UIBlock;
        //   442: dup            
        //   443: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //   446: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   449: checkcast       Lgg/essential/elementa/UIComponent;
        //   452: astore          $this$constrain$iv
        //   454: aload           $this$constrain$iv
        //   456: astore          11
        //   458: aload           11
        //   460: astore          $this$constrain_u24lambda_u2d0$iv
        //   462: aload           $this$constrain_u24lambda_u2d0$iv
        //   464: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   467: astore          $this$lambda_u2d4_u24lambda_u2d3
        //   469: aload           $this$lambda_u2d4_u24lambda_u2d3
        //   471: iconst_0       
        //   472: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   475: checkcast       Ljava/lang/Number;
        //   478: aload           $this$_init__u24lambda_u2d4
        //   480: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //   483: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpX:()Z
        //   486: iconst_0       
        //   487: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
        //   490: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   493: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   496: aload           $this$lambda_u2d4_u24lambda_u2d3
        //   498: aload           $this$_init__u24lambda_u2d4
        //   500: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //   503: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpY:()Z
        //   506: ifeq            513
        //   509: iconst_0       
        //   510: goto            514
        //   513: iconst_0       
        //   514: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   517: checkcast       Ljava/lang/Number;
        //   520: iconst_0       
        //   521: iconst_0       
        //   522: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
        //   525: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   528: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   531: aload           $this$lambda_u2d4_u24lambda_u2d3
        //   533: iconst_2       
        //   534: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   537: checkcast       Ljava/lang/Number;
        //   540: iconst_0       
        //   541: iconst_0       
        //   542: iconst_3       
        //   543: aconst_null    
        //   544: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   547: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   550: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   553: aload           $this$lambda_u2d4_u24lambda_u2d3
        //   555: bipush          15
        //   557: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   560: checkcast       Ljava/lang/Number;
        //   563: iconst_0       
        //   564: iconst_0       
        //   565: iconst_3       
        //   566: aconst_null    
        //   567: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   570: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   573: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   576: aload           11
        //   578: aload           14
        //   580: swap           
        //   581: invokevirtual   gg/essential/elementa/UIComponent.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   584: pop            
        //   585: goto            780
        //   588: aload_0         /* this */
        //   589: checkcast       Lgg/essential/elementa/UIComponent;
        //   592: astore_3        /* $this$addChild$iv */
        //   593: aload_3         /* $this$addChild$iv */
        //   594: astore          5
        //   596: aload           5
        //   598: astore          $this$addChild_u24lambda_u2d1$iv
        //   600: aload           $this$addChild_u24lambda_u2d1$iv
        //   602: aload           $this$addChild_u24lambda_u2d1$iv
        //   604: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;
        //   607: astore          8
        //   609: astore          14
        //   611: new             Lgg/essential/elementa/components/UIBlock;
        //   614: dup            
        //   615: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //   618: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   621: checkcast       Lgg/essential/elementa/UIComponent;
        //   624: astore          $this$constrain$iv
        //   626: aload           $this$constrain$iv
        //   628: astore          11
        //   630: aload           11
        //   632: astore          $this$constrain_u24lambda_u2d0$iv
        //   634: aload           $this$constrain_u24lambda_u2d0$iv
        //   636: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   639: astore          $this$lambda_u2d6_u24lambda_u2d5
        //   641: aload           $this$lambda_u2d6_u24lambda_u2d5
        //   643: iconst_0       
        //   644: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   647: checkcast       Ljava/lang/Number;
        //   650: aload           $this$_init__u24lambda_u2d6
        //   652: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //   655: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpX:()Z
        //   658: iconst_0       
        //   659: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
        //   662: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   665: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   668: aload           $this$lambda_u2d6_u24lambda_u2d5
        //   670: iconst_0       
        //   671: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   674: checkcast       Ljava/lang/Number;
        //   677: aload           $this$_init__u24lambda_u2d6
        //   679: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //   682: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpY:()Z
        //   685: iconst_0       
        //   686: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
        //   689: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   692: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   695: aload           $this$lambda_u2d6_u24lambda_u2d5
        //   697: aload           $this$_init__u24lambda_u2d6
        //   699: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //   702: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getCenterY:()Z
        //   705: ifeq            713
        //   708: bipush          15
        //   710: goto            714
        //   713: iconst_2       
        //   714: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   717: checkcast       Ljava/lang/Number;
        //   720: iconst_0       
        //   721: iconst_0       
        //   722: iconst_3       
        //   723: aconst_null    
        //   724: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   727: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   730: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   733: aload           $this$lambda_u2d6_u24lambda_u2d5
        //   735: aload           $this$_init__u24lambda_u2d6
        //   737: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //   740: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getCenterX:()Z
        //   743: ifeq            751
        //   746: bipush          15
        //   748: goto            752
        //   751: iconst_2       
        //   752: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   755: checkcast       Ljava/lang/Number;
        //   758: iconst_0       
        //   759: iconst_0       
        //   760: iconst_3       
        //   761: aconst_null    
        //   762: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   765: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   768: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   771: aload           11
        //   773: aload           14
        //   775: swap           
        //   776: invokevirtual   gg/essential/elementa/UIComponent.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   779: pop            
        //   780: aload_0         /* this */
        //   781: getstatic       gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$5.INSTANCE:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$5;
        //   784: checkcast       Lkotlin/jvm/functions/Function1;
        //   787: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.onMouseEnter:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   790: pop            
        //   791: aload_0         /* this */
        //   792: getstatic       gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$6.INSTANCE:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$6;
        //   795: checkcast       Lkotlin/jvm/functions/Function1;
        //   798: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.onMouseLeave:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   801: pop            
        //   802: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //   805: dup            
        //   806: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //   809: astore_3        /* oldCrop */
        //   810: aload_0         /* this */
        //   811: new             Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$7;
        //   814: dup            
        //   815: aload_0         /* this */
        //   816: aload_0         /* this */
        //   817: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //   820: aload_3         /* oldCrop */
        //   821: invokespecial   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$7.<init>:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lkotlin/jvm/internal/Ref$ObjectRef;)V
        //   824: checkcast       Lkotlin/jvm/functions/Function2;
        //   827: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   830: pop            
        //   831: aload_0         /* this */
        //   832: new             Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$8;
        //   835: dup            
        //   836: aload_0         /* this */
        //   837: aload_3         /* oldCrop */
        //   838: aload_0         /* this */
        //   839: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //   842: invokespecial   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$8.<init>:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;Lkotlin/jvm/internal/Ref$ObjectRef;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V
        //   845: checkcast       Lkotlin/jvm/functions/Function1;
        //   848: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.onMouseRelease:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   851: pop            
        //   852: aload_0         /* this */
        //   853: new             Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$9;
        //   856: dup            
        //   857: aload_0         /* this */
        //   858: aload_0         /* this */
        //   859: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //   862: invokespecial   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$9.<init>:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V
        //   865: checkcast       Lkotlin/jvm/functions/Function4;
        //   868: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.onMouseDrag:(Lkotlin/jvm/functions/Function4;)Lgg/essential/elementa/UIComponent;
        //   871: pop            
        //   872: return         
        //    Signature:
        //  (Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;)V [from metadata: (Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;)V]
        //  
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  this$0     
        //  alignment  
        //    StackMapTable: 00 0E FF 00 74 00 0A 07 00 02 00 00 00 07 00 32 00 00 00 00 07 00 60 00 01 07 00 60 FF 00 1B 00 0A 07 00 02 00 00 00 07 00 32 00 00 00 00 07 00 60 00 02 07 00 60 07 00 74 FF 00 2C 00 05 07 00 02 00 00 00 07 00 32 00 01 07 00 60 FF 00 1B 00 05 07 00 02 00 00 00 07 00 32 00 02 07 00 60 07 00 74 FF 00 63 00 0F 07 00 02 00 00 00 00 00 00 00 07 00 02 00 00 07 00 4A 00 07 00 60 07 00 4A 00 01 07 00 60 FF 00 00 00 0F 07 00 02 00 00 00 00 00 00 00 07 00 02 00 00 07 00 4A 00 07 00 60 07 00 4A 00 02 07 00 60 01 FF 00 C2 00 0F 07 00 02 00 00 00 00 00 00 00 00 00 00 07 00 4A 00 07 00 60 07 00 4A 00 01 07 00 60 FF 00 00 00 0F 07 00 02 00 00 00 00 00 00 00 00 00 00 07 00 4A 00 07 00 60 07 00 4A 00 02 07 00 60 01 FF 00 49 00 01 07 00 02 00 00 FF 00 7C 00 0F 07 00 02 00 00 00 00 00 00 00 07 00 02 00 00 07 00 4A 00 07 00 60 07 00 4A 00 01 07 00 60 FF 00 00 00 0F 07 00 02 00 00 00 00 00 00 00 07 00 02 00 00 07 00 4A 00 07 00 60 07 00 4A 00 02 07 00 60 01 FF 00 24 00 0F 07 00 02 00 00 00 00 00 00 00 00 00 00 07 00 4A 00 00 07 00 4A 00 01 07 00 60 FF 00 00 00 0F 07 00 02 00 00 00 00 00 00 00 00 00 00 07 00 4A 00 00 07 00 4A 00 02 07 00 60 01 FF 00 1B 00 01 07 00 02 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final CropAlignment getAlignment() {
        return this.alignment;
    }
    
    public final boolean getDragging() {
        return this.dragging;
    }
    
    public final void setDragging(final boolean <set-?>) {
        this.dragging = <set-?>;
    }
    
    public final float getXDragOffset() {
        return this.xDragOffset;
    }
    
    public final void setXDragOffset(final float <set-?>) {
        this.xDragOffset = <set-?>;
    }
    
    public final float getYDragOffset() {
        return this.yDragOffset;
    }
    
    public final void setYDragOffset(final float <set-?>) {
        this.yDragOffset = <set-?>;
    }
    
    public static final /* synthetic */ Pair access$getMousePosition(final ImageCropItem $this) {
        return $this.getMousePosition();
    }
}
