package gg.essential.gui.common.input;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class AbstractTextInput$animateCursor$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AbstractTextInput this$0;
    
    AbstractTextInput$animateCursor$1$1(final AbstractTextInput $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/common/input/AbstractTextInput$animateCursor$1$1.this$0:Lgg/essential/gui/common/input/AbstractTextInput;
        //     4: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.getActive:()Z
        //     7: ifne            11
        //    10: return         
        //    11: aload_0         /* this */
        //    12: getfield        gg/essential/gui/common/input/AbstractTextInput$animateCursor$1$1.this$0:Lgg/essential/gui/common/input/AbstractTextInput;
        //    15: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.getCursorComponent:()Lgg/essential/elementa/UIComponent;
        //    18: astore_1       
        //    19: aload_0         /* this */
        //    20: getfield        gg/essential/gui/common/input/AbstractTextInput$animateCursor$1$1.this$0:Lgg/essential/gui/common/input/AbstractTextInput;
        //    23: astore_2       
        //    24: aload_1         /* $this$animate$iv */
        //    25: astore_3       
        //    26: aload_3        
        //    27: astore          $this$animate_u24lambda_u2d0$iv
        //    29: aload           $this$animate_u24lambda_u2d0$iv
        //    31: invokevirtual   gg/essential/elementa/UIComponent.makeAnimation:()Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
        //    34: astore          anim$iv
        //    36: aload           anim$iv
        //    38: astore          $this$invoke_u24lambda_u2d0
        //    40: aload           $this$invoke_u24lambda_u2d0
        //    42: getstatic       gg/essential/elementa/constraints/animation/Animations.IN_CIRCULAR:Lgg/essential/elementa/constraints/animation/Animations;
        //    45: checkcast       Lgg/essential/elementa/constraints/animation/AnimationStrategy;
        //    48: ldc             0.5
        //    50: new             Ljava/awt/Color;
        //    53: dup            
        //    54: sipush          255
        //    57: sipush          255
        //    60: sipush          255
        //    63: iconst_0       
        //    64: invokespecial   java/awt/Color.<init>:(IIII)V
        //    67: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //    70: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //    73: fconst_0       
        //    74: bipush          8
        //    76: aconst_null    
        //    77: invokestatic    gg/essential/elementa/constraints/animation/AnimatingConstraints.setColorAnimation$default:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;Lgg/essential/elementa/constraints/animation/AnimationStrategy;FLgg/essential/elementa/constraints/ColorConstraint;FILjava/lang/Object;)Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
        //    80: pop            
        //    81: aload           $this$invoke_u24lambda_u2d0
        //    83: new             Lgg/essential/gui/common/input/AbstractTextInput$animateCursor$1$1$1$1;
        //    86: dup            
        //    87: aload_2        
        //    88: invokespecial   gg/essential/gui/common/input/AbstractTextInput$animateCursor$1$1$1$1.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;)V
        //    91: checkcast       Lkotlin/jvm/functions/Function0;
        //    94: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.onComplete:(Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
        //    97: pop            
        //    98: aload           $this$animate_u24lambda_u2d0$iv
        //   100: aload           anim$iv
        //   102: invokevirtual   gg/essential/elementa/UIComponent.animateTo:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;)V
        //   105: return         
        //    StackMapTable: 00 01 0B
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}