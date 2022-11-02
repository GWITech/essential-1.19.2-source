package gg.essential.gui.screenshot.components;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import kotlin.properties.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b	\u0010
                                                   \u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012""" }, d2 = { "Lgg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke;", "Lgg/essential/elementa/components/UIContainer;", "width", "", "(Lgg/essential/gui/screenshot/components/StrokeWidthComponent;I)V", "block", "Lgg/essential/elementa/components/UIBlock;", "getBlock", "()Lgg/essential/elementa/components/UIBlock;", "block$delegate", "Lkotlin/properties/ReadWriteProperty;", "hovered", "Lgg/essential/elementa/state/State;", "", "selected", "Lgg/essential/elementa/state/MappedState;", "getWidth", "()I", "essential" })
public final class Stoke extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    private final int width;
    @NotNull
    private final MappedState<Integer, Boolean> selected;
    @NotNull
    private final State<Boolean> hovered;
    @NotNull
    private final ReadWriteProperty block$delegate;
    final /* synthetic */ StrokeWidthComponent this$0;
    
    public Stoke(final StrokeWidthComponent this$0, final int width) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1         /* this$0 */
        //     2: putfield        gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.this$0:Lgg/essential/gui/screenshot/components/StrokeWidthComponent;
        //     5: aload_0         /* this */
        //     6: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //     9: aload_0         /* this */
        //    10: iload_2         /* width */
        //    11: putfield        gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.width:I
        //    14: aload_0         /* this */
        //    15: aload_0         /* this */
        //    16: getfield        gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.this$0:Lgg/essential/gui/screenshot/components/StrokeWidthComponent;
        //    19: invokestatic    gg/essential/gui/screenshot/components/StrokeWidthComponent.access$getSelectedWidth$p:(Lgg/essential/gui/screenshot/components/StrokeWidthComponent;)Lgg/essential/elementa/state/BasicState;
        //    22: new             Lgg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke$selected$1;
        //    25: dup            
        //    26: aload_0         /* this */
        //    27: invokespecial   gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke$selected$1.<init>:(Lgg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke;)V
        //    30: checkcast       Lkotlin/jvm/functions/Function1;
        //    33: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    36: putfield        gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.selected:Lgg/essential/elementa/state/MappedState;
        //    39: aload_0         /* this */
        //    40: aload_0         /* this */
        //    41: checkcast       Lgg/essential/elementa/UIComponent;
        //    44: iconst_0       
        //    45: iconst_0       
        //    46: iconst_3       
        //    47: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //    50: putfield        gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.hovered:Lgg/essential/elementa/state/State;
        //    53: aload_0         /* this */
        //    54: new             Lgg/essential/elementa/components/UIBlock;
        //    57: dup            
        //    58: aconst_null    
        //    59: iconst_1       
        //    60: aconst_null    
        //    61: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    64: checkcast       Lgg/essential/elementa/UIComponent;
        //    67: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //    70: astore_3        /* $this$constrain$iv */
        //    71: aload_3         /* $this$constrain$iv */
        //    72: astore          5
        //    74: aload           5
        //    76: astore          $this$constrain_u24lambda_u2d0$iv
        //    78: aload           $this$constrain_u24lambda_u2d0$iv
        //    80: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    83: astore          7
        //    85: astore          8
        //    87: aload           $this$block_delegate_u24lambda_u2d0
        //    89: aload_0         /* this */
        //    90: getfield        gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.width:I
        //    93: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    96: checkcast       Ljava/lang/Number;
        //    99: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   102: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   105: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   108: aload           $this$block_delegate_u24lambda_u2d0
        //   110: bipush          100
        //   112: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   115: checkcast       Ljava/lang/Number;
        //   118: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   121: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   124: iconst_4       
        //   125: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   128: checkcast       Ljava/lang/Number;
        //   131: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   134: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   137: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   140: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   143: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   146: aload           8
        //   148: aload           5
        //   150: aload_0         /* this */
        //   151: checkcast       Lgg/essential/elementa/UIComponent;
        //   154: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   157: aload_0         /* this */
        //   158: getstatic       gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   161: iconst_0       
        //   162: aaload         
        //   163: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   166: putfield        gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.block$delegate:Lkotlin/properties/ReadWriteProperty;
        //   169: aload_0         /* this */
        //   170: checkcast       Lgg/essential/elementa/UIComponent;
        //   173: astore_3        /* $this$constrain$iv */
        //   174: aload_3         /* $this$constrain$iv */
        //   175: astore          5
        //   177: aload           5
        //   179: astore          $this$constrain_u24lambda_u2d0$iv
        //   181: aload           $this$constrain_u24lambda_u2d0$iv
        //   183: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   186: astore          $this$_init__u24lambda_u2d1
        //   188: aload           $this$_init__u24lambda_u2d1
        //   190: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   193: dup            
        //   194: fconst_1       
        //   195: iconst_0       
        //   196: iconst_2       
        //   197: aconst_null    
        //   198: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   201: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   204: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   207: aload           $this$_init__u24lambda_u2d1
        //   209: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   212: dup            
        //   213: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   216: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   219: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   222: aload           $this$_init__u24lambda_u2d1
        //   224: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   227: dup            
        //   228: fconst_0       
        //   229: iconst_1       
        //   230: aconst_null    
        //   231: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   234: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   237: iconst_2       
        //   238: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   241: checkcast       Ljava/lang/Number;
        //   244: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   247: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   250: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   253: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   256: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   259: aload           $this$_init__u24lambda_u2d1
        //   261: bipush          100
        //   263: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   266: checkcast       Ljava/lang/Number;
        //   269: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   272: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   275: iconst_2       
        //   276: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   279: checkcast       Ljava/lang/Number;
        //   282: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   285: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   288: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   291: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   294: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   297: aload_0         /* this */
        //   298: checkcast       Lgg/essential/elementa/UIComponent;
        //   301: astore_3       
        //   302: aload_0         /* this */
        //   303: getfield        gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.this$0:Lgg/essential/gui/screenshot/components/StrokeWidthComponent;
        //   306: astore          4
        //   308: aload_3         /* $this$onLeftClick$iv */
        //   309: new             Lgg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke$special$$inlined$onLeftClick$1;
        //   312: dup            
        //   313: aload           4
        //   315: aload_0         /* this */
        //   316: invokespecial   gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/screenshot/components/StrokeWidthComponent;Lgg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke;)V
        //   319: checkcast       Lkotlin/jvm/functions/Function2;
        //   322: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   325: pop            
        //   326: aload_0         /* this */
        //   327: getfield        gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.selected:Lgg/essential/elementa/state/MappedState;
        //   330: getstatic       gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke$3.INSTANCE:Lgg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke$3;
        //   333: checkcast       Lkotlin/jvm/functions/Function1;
        //   336: invokevirtual   gg/essential/elementa/state/MappedState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   339: pop            
        //   340: aload_0         /* this */
        //   341: checkcast       Lgg/essential/elementa/UIComponent;
        //   344: new             Lgg/essential/elementa/state/BasicState;
        //   347: dup            
        //   348: aload_0         /* this */
        //   349: getfield        gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.width:I
        //   352: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(I)Ljava/lang/String;
        //   357: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   360: checkcast       Lgg/essential/elementa/state/State;
        //   363: aconst_null    
        //   364: fconst_0       
        //   365: aconst_null    
        //   366: aconst_null    
        //   367: bipush          30
        //   369: invokestatic    gg/essential/util/ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //   372: pop            
        //   373: aload_0         /* this */
        //   374: invokespecial   gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.getBlock:()Lgg/essential/elementa/components/UIBlock;
        //   377: aload_0         /* this */
        //   378: getfield        gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.selected:Lgg/essential/elementa/state/MappedState;
        //   381: aload_0         /* this */
        //   382: getfield        gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke.hovered:Lgg/essential/elementa/state/State;
        //   385: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   388: getstatic       gg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke$4.INSTANCE:Lgg/essential/gui/screenshot/components/StrokeWidthComponent$Stoke$4;
        //   391: checkcast       Lkotlin/jvm/functions/Function1;
        //   394: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   397: checkcast       Lgg/essential/elementa/state/State;
        //   400: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   403: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   406: invokevirtual   gg/essential/elementa/components/UIBlock.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   409: pop            
        //   410: return         
        //    Signature:
        //  (Lgg/essential/gui/screenshot/components/StrokeWidthComponent;I)V [from metadata: (I)V]
        //  
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  this$0  
        //  width   
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public final int getWidth() {
        return this.width;
    }
    
    private final UIBlock getBlock() {
        return (UIBlock)this.block$delegate.getValue((Object)this, (KProperty)Stoke.$$delegatedProperties[0]);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Stoke.class, "block", "getBlock()Lgg/essential/elementa/components/UIBlock;", 0)) };
    }
}
