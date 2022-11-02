package gg.essential.gui.friends.message.v2;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.reflect.*;
import java.awt.image.*;
import kotlin.properties.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class ImageEmbedImpl$loadImage$1 extends Lambda implements Function0<Unit> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    final /* synthetic */ int $id;
    final /* synthetic */ ImageEmbedImpl this$0;
    final /* synthetic */ BufferedImage $loadedImage;
    
    ImageEmbedImpl$loadImage$1(final int $id, final ImageEmbedImpl $receiver, final BufferedImage $loadedImage) {
        this.$id = $id;
        this.this$0 = $receiver;
        this.$loadedImage = $loadedImage;
        super(0);
    }
    
    public final void invoke() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.$id:I
        //     4: aload_0         /* this */
        //     5: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
        //     8: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl.access$getLoading$p:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)Ljava/lang/Integer;
        //    11: dup            
        //    12: ifnonnull       20
        //    15: pop            
        //    16: pop            
        //    17: goto            26
        //    20: invokevirtual   java/lang/Integer.intValue:()I
        //    23: if_icmpeq       27
        //    26: return         
        //    27: aload_0         /* this */
        //    28: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
        //    31: aload_0         /* this */
        //    32: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.$loadedImage:Ljava/awt/image/BufferedImage;
        //    35: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl.access$setLoadedImage$p:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;Ljava/awt/image/BufferedImage;)V
        //    38: aload_0         /* this */
        //    39: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.$loadedImage:Ljava/awt/image/BufferedImage;
        //    42: ifnonnull       53
        //    45: aload_0         /* this */
        //    46: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
        //    49: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl.access$addFailureMessage:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)V
        //    52: return         
        //    53: aload_0         /* this */
        //    54: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
        //    57: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl.access$getAspectRatio$p:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)Lgg/essential/elementa/state/BasicState;
        //    60: aload_0         /* this */
        //    61: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.$loadedImage:Ljava/awt/image/BufferedImage;
        //    64: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //    67: i2f            
        //    68: aload_0         /* this */
        //    69: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.$loadedImage:Ljava/awt/image/BufferedImage;
        //    72: invokevirtual   java/awt/image/BufferedImage.getHeight:()I
        //    75: i2f            
        //    76: fdiv           
        //    77: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    80: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //    83: new             Lgg/essential/elementa/components/UIImage;
        //    86: dup            
        //    87: aload_0         /* this */
        //    88: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.$loadedImage:Ljava/awt/image/BufferedImage;
        //    91: invokestatic    java/util/concurrent/CompletableFuture.completedFuture:(Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;
        //    94: dup            
        //    95: ldc             "completedFuture(loadedImage)"
        //    97: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   100: aconst_null    
        //   101: aconst_null    
        //   102: bipush          6
        //   104: aconst_null    
        //   105: invokespecial   gg/essential/elementa/components/UIImage.<init>:(Ljava/util/concurrent/CompletableFuture;Lgg/essential/elementa/components/image/ImageProvider;Lgg/essential/elementa/components/image/ImageProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   108: checkcast       Lgg/essential/elementa/UIComponent;
        //   111: astore_2       
        //   112: aload_0         /* this */
        //   113: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
        //   116: astore_3       
        //   117: aload_2         /* $this$constrain$iv */
        //   118: astore          5
        //   120: aload           5
        //   122: astore          $this$constrain_u24lambda_u2d0$iv
        //   124: aload           $this$constrain_u24lambda_u2d0$iv
        //   126: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   129: astore          $this$invoke_u24lambda_u2d0
        //   131: aload           $this$invoke_u24lambda_u2d0
        //   133: new             Lgg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint;
        //   136: dup            
        //   137: aload_3        
        //   138: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl.access$getAspectRatio$p:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)Lgg/essential/elementa/state/BasicState;
        //   141: checkcast       Lgg/essential/elementa/state/State;
        //   144: invokespecial   gg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint.<init>:(Lgg/essential/elementa/state/State;)V
        //   147: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   150: aload_3        
        //   151: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl.access$getImageSizeContainer:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)Lgg/essential/elementa/components/UIContainer;
        //   154: checkcast       Lgg/essential/elementa/UIComponent;
        //   157: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   160: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   163: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   166: aload           $this$invoke_u24lambda_u2d0
        //   168: new             Lgg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint;
        //   171: dup            
        //   172: aload_3        
        //   173: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl.access$getAspectRatio$p:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)Lgg/essential/elementa/state/BasicState;
        //   176: checkcast       Lgg/essential/elementa/state/State;
        //   179: invokespecial   gg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint.<init>:(Lgg/essential/elementa/state/State;)V
        //   182: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   185: aload_3        
        //   186: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl.access$getImageSizeContainer:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)Lgg/essential/elementa/components/UIContainer;
        //   189: checkcast       Lgg/essential/elementa/UIComponent;
        //   192: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   195: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   198: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   201: aload           $this$invoke_u24lambda_u2d0
        //   203: new             Lgg/essential/elementa/constraints/CopyConstraintColor;
        //   206: dup            
        //   207: invokespecial   gg/essential/elementa/constraints/CopyConstraintColor.<init>:()V
        //   210: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   213: aload_3        
        //   214: checkcast       Lgg/essential/elementa/UIComponent;
        //   217: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   220: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   223: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   226: aload           5
        //   228: astore_2        /* $this$constrain$iv */
        //   229: aload_2        
        //   230: checkcast       Lgg/essential/elementa/components/UIImage;
        //   233: astore_3        /* $this$invoke_u24lambda_u2d1 */
        //   234: aload_3         /* $this$invoke_u24lambda_u2d1 */
        //   235: getstatic       gg/essential/elementa/components/UIImage$TextureScalingMode.LINEAR:Lgg/essential/elementa/components/UIImage$TextureScalingMode;
        //   238: invokevirtual   gg/essential/elementa/components/UIImage.setTextureMagFilter:(Lgg/essential/elementa/components/UIImage$TextureScalingMode;)V
        //   241: aload_3         /* $this$invoke_u24lambda_u2d1 */
        //   242: getstatic       gg/essential/elementa/components/UIImage$TextureScalingMode.LINEAR:Lgg/essential/elementa/components/UIImage$TextureScalingMode;
        //   245: invokevirtual   gg/essential/elementa/components/UIImage.setTextureMinFilter:(Lgg/essential/elementa/components/UIImage$TextureScalingMode;)V
        //   248: aload_2        
        //   249: aload_0         /* this */
        //   250: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
        //   253: checkcast       Lgg/essential/elementa/UIComponent;
        //   256: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   259: aconst_null    
        //   260: getstatic       gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   263: iconst_0       
        //   264: aaload         
        //   265: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   268: astore_1        /* image$delegate */
        //   269: new             Lgg/essential/elementa/components/UIBlock;
        //   272: dup            
        //   273: aconst_null    
        //   274: iconst_1       
        //   275: aconst_null    
        //   276: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   279: checkcast       Lgg/essential/elementa/UIComponent;
        //   282: astore_3       
        //   283: aload_0         /* this */
        //   284: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
        //   287: astore          4
        //   289: aload_3         /* $this$constrain$iv */
        //   290: astore          6
        //   292: aload           6
        //   294: astore          $this$constrain_u24lambda_u2d0$iv
        //   296: aload           $this$constrain_u24lambda_u2d0$iv
        //   298: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   301: astore          $this$invoke_u24lambda_u2d3
        //   303: aload           $this$invoke_u24lambda_u2d3
        //   305: iconst_0       
        //   306: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   309: checkcast       Ljava/lang/Number;
        //   312: aload           4
        //   314: invokevirtual   gg/essential/gui/friends/message/v2/ImageEmbedImpl.getMessageWrapper:()Lgg/essential/gui/friends/message/v2/MessageWrapper;
        //   317: invokevirtual   gg/essential/gui/friends/message/v2/MessageWrapper.getSentByClient:()Z
        //   320: iconst_1       
        //   321: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
        //   324: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   327: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   330: aload           $this$invoke_u24lambda_u2d3
        //   332: iconst_0       
        //   333: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   336: checkcast       Ljava/lang/Number;
        //   339: iconst_1       
        //   340: iconst_0       
        //   341: iconst_2       
        //   342: aconst_null    
        //   343: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   346: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   349: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   352: aload           $this$invoke_u24lambda_u2d3
        //   354: ldc             3.0
        //   356: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   359: checkcast       Ljava/lang/Number;
        //   362: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   365: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   368: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   371: aload           $this$invoke_u24lambda_u2d3
        //   373: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   376: dup            
        //   377: fconst_0       
        //   378: iconst_1       
        //   379: aconst_null    
        //   380: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   383: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   386: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   389: aload           6
        //   391: astore_3        /* $this$constrain$iv */
        //   392: aload_0         /* this */
        //   393: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
        //   396: astore          4
        //   398: aload_3        
        //   399: checkcast       Lgg/essential/elementa/components/UIBlock;
        //   402: astore          $this$invoke_u24lambda_u2d4
        //   404: aload           $this$invoke_u24lambda_u2d4
        //   406: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   409: aload_1         /* image$delegate */
        //   410: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.invoke$lambda-2:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIImage;
        //   413: checkcast       Lgg/essential/elementa/UIComponent;
        //   416: iconst_0       
        //   417: iconst_0       
        //   418: iconst_3       
        //   419: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   422: aload           4
        //   424: invokevirtual   gg/essential/gui/friends/message/v2/ImageEmbedImpl.getMessageWrapper:()Lgg/essential/gui/friends/message/v2/MessageWrapper;
        //   427: invokevirtual   gg/essential/gui/friends/message/v2/MessageWrapper.getSentByClient:()Z
        //   430: invokevirtual   gg/essential/gui/EssentialPalette.getMessageColor:(Lgg/essential/elementa/state/State;Z)Lgg/essential/elementa/state/State;
        //   433: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   436: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   439: invokevirtual   gg/essential/elementa/components/UIBlock.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   442: pop            
        //   443: aload_3        
        //   444: aload_1         /* image$delegate */
        //   445: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.invoke$lambda-2:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIImage;
        //   448: checkcast       Lgg/essential/elementa/UIComponent;
        //   451: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   454: aconst_null    
        //   455: getstatic       gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   458: iconst_1       
        //   459: aaload         
        //   460: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   463: pop            
        //   464: aload_1         /* image$delegate */
        //   465: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.invoke$lambda-2:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIImage;
        //   468: checkcast       Lgg/essential/elementa/UIComponent;
        //   471: astore_3       
        //   472: aload_0         /* this */
        //   473: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
        //   476: astore          4
        //   478: aload_3         /* $this$onLeftClick$iv */
        //   479: new             Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1$invoke$$inlined$onLeftClick$1;
        //   482: dup            
        //   483: aload           4
        //   485: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1$invoke$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)V
        //   488: checkcast       Lkotlin/jvm/functions/Function2;
        //   491: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   494: pop            
        //   495: aload_1         /* image$delegate */
        //   496: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.invoke$lambda-2:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIImage;
        //   499: new             Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1$2;
        //   502: dup            
        //   503: aload_0         /* this */
        //   504: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
        //   507: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1$2.<init>:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)V
        //   510: checkcast       Lkotlin/jvm/functions/Function2;
        //   513: invokevirtual   gg/essential/elementa/components/UIImage.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   516: pop            
        //   517: aload_0         /* this */
        //   518: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
        //   521: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl.access$getFocusedView:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView;
        //   524: aload_1         /* image$delegate */
        //   525: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl$loadImage$1.invoke$lambda-2:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIImage;
        //   528: invokevirtual   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.setup:(Lgg/essential/elementa/components/UIImage;)V
        //   531: return         
        //    StackMapTable: 00 04 FF 00 14 00 01 07 00 02 00 02 01 07 00 3B FA 00 05 FC 00 00 07 00 02 19
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final UIImage invoke$lambda-2(final ReadWriteProperty<Object, UIImage> $image$delegate) {
        return (UIImage)$image$delegate.getValue((Object)null, ImageEmbedImpl$loadImage$1.$$delegatedProperties[0]);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
    
    static {
        ImageEmbedImpl$loadImage$1.$$delegatedProperties = new KProperty[] { (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ImageEmbedImpl.class, "image", "<v#2>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ImageEmbedImpl.class, "dot", "<v#3>", 0)) };
    }
}