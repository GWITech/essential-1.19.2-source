package gg.essential.elementa.transitions;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "invoke" })
static final class Transition$transition$2$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Transition this$0;
    final /* synthetic */ UIComponent $component;
    final /* synthetic */ Function0<Unit> $callback;
    
    Transition$transition$2$2(final Transition $receiver, final UIComponent $component, final Function0<Unit> $callback) {
        this.this$0 = $receiver;
        this.$component = $component;
        this.$callback = $callback;
        super(0);
    }
    
    public final void invoke() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/elementa/transitions/Transition$transition$2$2.this$0:Lgg/essential/elementa/transitions/Transition;
        //     4: aload_0         /* this */
        //     5: getfield        gg/essential/elementa/transitions/Transition$transition$2$2.$component:Lgg/essential/elementa/UIComponent;
        //     8: invokevirtual   gg/essential/elementa/transitions/Transition.afterTransition:(Lgg/essential/elementa/UIComponent;)V
        //    11: aload_0         /* this */
        //    12: getfield        gg/essential/elementa/transitions/Transition$transition$2$2.this$0:Lgg/essential/elementa/transitions/Transition;
        //    15: invokestatic    gg/essential/elementa/transitions/Transition.access$getParallelTransitions$p:(Lgg/essential/elementa/transitions/Transition;)Ljava/util/List;
        //    18: checkcast       Ljava/lang/Iterable;
        //    21: astore_1       
        //    22: aload_0         /* this */
        //    23: getfield        gg/essential/elementa/transitions/Transition$transition$2$2.$component:Lgg/essential/elementa/UIComponent;
        //    26: astore_2       
        //    27: iconst_0       
        //    28: istore_3        /* $i$f$forEach */
        //    29: aload_1         /* $this$forEach$iv */
        //    30: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    35: astore          4
        //    37: aload           4
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifeq            76
        //    47: aload           4
        //    49: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    54: astore          element$iv
        //    56: aload           element$iv
        //    58: checkcast       Lgg/essential/elementa/transitions/Transition;
        //    61: astore          it
        //    63: iconst_0       
        //    64: istore          $i$a$-forEach-Transition$transition$2$2$1
        //    66: aload           it
        //    68: aload_2        
        //    69: invokevirtual   gg/essential/elementa/transitions/Transition.afterTransition:(Lgg/essential/elementa/UIComponent;)V
        //    72: nop            
        //    73: goto            37
        //    76: nop            
        //    77: aload_0         /* this */
        //    78: getfield        gg/essential/elementa/transitions/Transition$transition$2$2.this$0:Lgg/essential/elementa/transitions/Transition;
        //    81: invokestatic    gg/essential/elementa/transitions/Transition.access$getSequenceTransition$p:(Lgg/essential/elementa/transitions/Transition;)Lgg/essential/elementa/transitions/Transition;
        //    84: ifnonnull       108
        //    87: aload_0         /* this */
        //    88: getfield        gg/essential/elementa/transitions/Transition$transition$2$2.$callback:Lkotlin/jvm/functions/Function0;
        //    91: dup            
        //    92: ifnonnull       99
        //    95: pop            
        //    96: goto            130
        //    99: invokeinterface kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
        //   104: pop            
        //   105: goto            130
        //   108: aload_0         /* this */
        //   109: getfield        gg/essential/elementa/transitions/Transition$transition$2$2.this$0:Lgg/essential/elementa/transitions/Transition;
        //   112: invokestatic    gg/essential/elementa/transitions/Transition.access$getSequenceTransition$p:(Lgg/essential/elementa/transitions/Transition;)Lgg/essential/elementa/transitions/Transition;
        //   115: dup            
        //   116: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        //   119: aload_0         /* this */
        //   120: getfield        gg/essential/elementa/transitions/Transition$transition$2$2.$component:Lgg/essential/elementa/UIComponent;
        //   123: aload_0         /* this */
        //   124: getfield        gg/essential/elementa/transitions/Transition$transition$2$2.$callback:Lkotlin/jvm/functions/Function0;
        //   127: invokevirtual   gg/essential/elementa/transitions/Transition.transition:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)V
        //   130: return         
        //    StackMapTable: 00 05 FF 00 25 00 05 07 00 02 07 00 3D 07 00 43 01 07 00 45 00 00 26 56 07 00 07 08 15
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}