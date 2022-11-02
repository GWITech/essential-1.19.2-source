package gg.essential.lib.kdiscordipc.manager.impl;

import kotlin.coroutines.jvm.internal.*;
import kotlinx.coroutines.flow.*;
import kotlin.*;
import kotlin.coroutines.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n" }, d2 = { "<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", "gg/essential/lib/kdiscordipc/KDiscordIPC$on$$inlined$filterIsInstance$1$2" })
public static final class UserManager$init$$inlined$onEvent$1$2<T> implements SuspendFunction, FlowCollector {
    final /* synthetic */ FlowCollector $this_unsafeFlow;
    
    public UserManager$init$$inlined$onEvent$1$2(final FlowCollector $receiver) {
        this.$this_unsafeFlow = $receiver;
        super();
    }
    
    @Nullable
    public final Object emit(final Object value, @NotNull final Continuation p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lgg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1$2$1;
        //     4: ifeq            36
        //     7: aload_2        
        //     8: checkcast       Lgg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1$2$1;
        //    11: astore_3       
        //    12: aload_3        
        //    13: getfield        gg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1$2$1.label:I
        //    16: ldc             -2147483648
        //    18: iand           
        //    19: ifeq            36
        //    22: aload_3        
        //    23: dup            
        //    24: getfield        gg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1$2$1.label:I
        //    27: ldc             -2147483648
        //    29: isub           
        //    30: putfield        gg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1$2$1.label:I
        //    33: goto            46
        //    36: new             Lgg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1$2$1;
        //    39: dup            
        //    40: aload_0        
        //    41: aload_2        
        //    42: invokespecial   gg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1$2$1.<init>:(Lgg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1$2;Lkotlin/coroutines/Continuation;)V
        //    45: astore_3        /* $continuation */
        //    46: aload_3         /* $continuation */
        //    47: getfield        gg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1$2$1.result:Ljava/lang/Object;
        //    50: astore          $result
        //    52: invokestatic    kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
        //    55: astore          5
        //    57: aload_3         /* $continuation */
        //    58: getfield        gg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1$2$1.label:I
        //    61: tableswitch {
        //                0: 84
        //                1: 133
        //          default: 142
        //        }
        //    84: aload           $result
        //    86: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //    89: aload_0         /* this */
        //    90: getfield        gg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1$2.$this_unsafeFlow:Lkotlinx/coroutines/flow/FlowCollector;
        //    93: aload_1         /* value */
        //    94: astore          6
        //    96: astore          $this$filter_u24lambda_u2d0
        //    98: aload           value
        //   100: astore          it
        //   102: aload           it
        //   104: instanceof      Lgg/essential/lib/kdiscordipc/core/event/impl/CurrentUserUpdateEvent;
        //   107: ifeq            138
        //   110: aload           $this$filter_u24lambda_u2d0
        //   112: aload           value
        //   114: aload_3         /* $continuation */
        //   115: aload_3         /* $continuation */
        //   116: iconst_1       
        //   117: putfield        gg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1$2$1.label:I
        //   120: invokeinterface kotlinx/coroutines/flow/FlowCollector.emit:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   125: aload           5
        //   127: if_acmpne       138
        //   130: aload           5
        //   132: areturn        
        //   133: aload           $result
        //   135: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   138: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   141: areturn        
        //   142: new             Ljava/lang/IllegalStateException;
        //   145: dup            
        //   146: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   148: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   151: athrow         
        //    StackMapTable: 00 06 24 FF 00 09 00 04 07 00 02 07 00 05 00 07 00 28 00 00 FD 00 25 07 00 05 07 00 05 FF 00 30 00 05 00 00 00 00 07 00 05 00 00 FF 00 04 00 00 00 00 03
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}