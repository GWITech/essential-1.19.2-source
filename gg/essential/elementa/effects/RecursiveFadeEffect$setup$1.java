package gg.essential.elementa.effects;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class RecursiveFadeEffect$setup$1 extends Lambda implements Function1<UIComponent, Unit> {
    final /* synthetic */ RecursiveFadeEffect this$0;
    
    RecursiveFadeEffect$setup$1(final RecursiveFadeEffect $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final UIComponent it) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "it"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* it */
        //     7: astore_2       
        //     8: aload_0         /* this */
        //     9: getfield        gg/essential/elementa/effects/RecursiveFadeEffect$setup$1.this$0:Lgg/essential/elementa/effects/RecursiveFadeEffect;
        //    12: astore_3       
        //    13: iconst_0       
        //    14: istore          $i$f$constrain
        //    16: aload_2         /* $this$constrain$iv */
        //    17: astore          5
        //    19: aload           5
        //    21: astore          $this$constrain_u24lambda_u2d0$iv
        //    23: iconst_0       
        //    24: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //    26: aload           $this$constrain_u24lambda_u2d0$iv
        //    28: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    31: astore          $this$invoke_u24lambda_u2d0
        //    33: iconst_0       
        //    34: istore          $i$a$-constrain-RecursiveFadeEffect$setup$1$1
        //    36: aload           $this$invoke_u24lambda_u2d0
        //    38: new             Lgg/essential/elementa/effects/RecursiveFadeEffect$OverridableAlphaColorConstraint;
        //    41: dup            
        //    42: aload           $this$invoke_u24lambda_u2d0
        //    44: invokevirtual   gg/essential/elementa/UIConstraints.getColor:()Lgg/essential/elementa/constraints/ColorConstraint;
        //    47: aload_3        
        //    48: invokestatic    gg/essential/elementa/effects/RecursiveFadeEffect.access$isOverridden$p:(Lgg/essential/elementa/effects/RecursiveFadeEffect;)Lgg/essential/elementa/state/MappedState;
        //    51: checkcast       Lgg/essential/elementa/state/State;
        //    54: aload_3        
        //    55: invokestatic    gg/essential/elementa/effects/RecursiveFadeEffect.access$getOverriddenAlphaPercentage$p:(Lgg/essential/elementa/effects/RecursiveFadeEffect;)Lgg/essential/elementa/state/MappedState;
        //    58: checkcast       Lgg/essential/elementa/state/State;
        //    61: invokespecial   gg/essential/elementa/effects/RecursiveFadeEffect$OverridableAlphaColorConstraint.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V
        //    64: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //    67: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //    70: nop            
        //    71: nop            
        //    72: nop            
        //    73: nop            
        //    74: return         
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  it    
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
}