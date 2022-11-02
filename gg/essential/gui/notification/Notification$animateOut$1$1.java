package gg.essential.gui.notification;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class Notification$animateOut$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Notification this$0;
    
    Notification$animateOut$1$1(final Notification $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/notification/Notification$animateOut$1$1.this$0:Lgg/essential/gui/notification/Notification;
        //     4: checkcast       Lgg/essential/elementa/UIComponent;
        //     7: astore_1       
        //     8: aload_0         /* this */
        //     9: getfield        gg/essential/gui/notification/Notification$animateOut$1$1.this$0:Lgg/essential/gui/notification/Notification;
        //    12: astore_2       
        //    13: aload_1         /* $this$animate$iv */
        //    14: astore_3       
        //    15: aload_3        
        //    16: astore          $this$animate_u24lambda_u2d0$iv
        //    18: aload           $this$animate_u24lambda_u2d0$iv
        //    20: invokevirtual   gg/essential/elementa/UIComponent.makeAnimation:()Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
        //    23: astore          anim$iv
        //    25: aload           anim$iv
        //    27: astore          $this$invoke_u24lambda_u2d0
        //    29: aload           $this$invoke_u24lambda_u2d0
        //    31: getstatic       gg/essential/elementa/constraints/animation/Animations.OUT_EXP:Lgg/essential/elementa/constraints/animation/Animations;
        //    34: checkcast       Lgg/essential/elementa/constraints/animation/AnimationStrategy;
        //    37: ldc             0.25
        //    39: iconst_0       
        //    40: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    43: checkcast       Ljava/lang/Number;
        //    46: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    49: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //    52: fconst_0       
        //    53: bipush          8
        //    55: aconst_null    
        //    56: invokestatic    gg/essential/elementa/constraints/animation/AnimatingConstraints.setHeightAnimation$default:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;Lgg/essential/elementa/constraints/animation/AnimationStrategy;FLgg/essential/elementa/constraints/HeightConstraint;FILjava/lang/Object;)Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
        //    59: pop            
        //    60: aload           $this$invoke_u24lambda_u2d0
        //    62: new             Lgg/essential/gui/notification/Notification$animateOut$1$1$1$1;
        //    65: dup            
        //    66: aload_2        
        //    67: invokespecial   gg/essential/gui/notification/Notification$animateOut$1$1$1$1.<init>:(Lgg/essential/gui/notification/Notification;)V
        //    70: checkcast       Lkotlin/jvm/functions/Function0;
        //    73: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.onComplete:(Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
        //    76: pop            
        //    77: aload           $this$animate_u24lambda_u2d0$iv
        //    79: aload           anim$iv
        //    81: invokevirtual   gg/essential/elementa/UIComponent.animateTo:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;)V
        //    84: return         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}