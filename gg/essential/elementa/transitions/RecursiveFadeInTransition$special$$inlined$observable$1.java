package gg.essential.elementa.transitions;

import kotlin.properties.*;
import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, d1 = { "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000" }, d2 = { "kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib" })
public static final class RecursiveFadeInTransition$special$$inlined$observable$1 extends ObservableProperty<Float> {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ RecursiveFadeInTransition this$0;
    
    public RecursiveFadeInTransition$special$$inlined$observable$1(final Object $captured_local_variable$1, final Object $super_call_param$2, final RecursiveFadeInTransition this$0) {
        this.$initialValue = $captured_local_variable$1;
        this.this$0 = this$0;
        super($super_call_param$2);
    }
    
    protected void afterChange(@NotNull final KProperty<?> property, final Float oldValue, final Float newValue) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "property"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* property */
        //     7: aload_2         /* oldValue */
        //     8: aload_3         /* newValue */
        //     9: checkcast       Ljava/lang/Number;
        //    12: invokevirtual   java/lang/Number.floatValue:()F
        //    15: fstore          4
        //    17: checkcast       Ljava/lang/Number;
        //    20: invokevirtual   java/lang/Number.floatValue:()F
        //    23: fstore          5
        //    25: astore          $noName_0
        //    27: iconst_0       
        //    28: istore          $i$a$-observable-RecursiveFadeInTransition$alpha$2
        //    30: aload_0         /* this */
        //    31: getfield        gg/essential/elementa/transitions/RecursiveFadeInTransition$special$$inlined$observable$1.this$0:Lgg/essential/elementa/transitions/RecursiveFadeInTransition;
        //    34: invokestatic    gg/essential/elementa/transitions/RecursiveFadeInTransition.access$getOverriddenAlphaPercentage$p:(Lgg/essential/elementa/transitions/RecursiveFadeInTransition;)Lgg/essential/elementa/state/BasicState;
        //    37: fload           newValue
        //    39: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    42: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //    45: nop            
        //    46: return         
        //    Signature:
        //  (Lkotlin/reflect/KProperty<*>;Ljava/lang/Float;Ljava/lang/Float;)V
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  property  
        //  oldValue  
        //  newValue  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}