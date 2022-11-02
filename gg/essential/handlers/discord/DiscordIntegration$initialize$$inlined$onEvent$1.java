package gg.essential.handlers.discord;

import kotlinx.coroutines.flow.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import org.jetbrains.annotations.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0019
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006*\u0001\u0000\b
                                                   \u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004
                                                   \u0002\b\u0019¨\u0006\u0007¸\u0006\u000b""" }, d2 = { "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1", "gg/essential/lib/kdiscordipc/KDiscordIPC$on$$inlined$filterIsInstance$1" })
public static final class DiscordIntegration$initialize$$inlined$onEvent$1 implements Flow<Object> {
    final /* synthetic */ Flow $this_unsafeTransform$inlined;
    
    public DiscordIntegration$initialize$$inlined$onEvent$1(final Flow $this_unsafeTransform$inlined) {
        this.$this_unsafeTransform$inlined = $this_unsafeTransform$inlined;
        super();
    }
    
    @Nullable
    public Object collect(@NotNull final FlowCollector collector, @NotNull final Continuation $completion) {
        final FlowCollector $this$unsafeTransform_u24lambda_u2d0 = collector;
        final Object collect = this.$this_unsafeTransform$inlined.collect((FlowCollector)new SuspendFunction() {
            final /* synthetic */ FlowCollector $this_unsafeFlow;
            
            public DiscordIntegration$initialize$$inlined$onEvent$1$2() {
                super();
            }
            
            @Nullable
            public final Object emit(final Object value, @NotNull final Continuation p1) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: instanceof      Lgg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1$2$1;
                //     4: ifeq            36
                //     7: aload_2        
                //     8: checkcast       Lgg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1$2$1;
                //    11: astore_3       
                //    12: aload_3        
                //    13: getfield        gg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1$2$1.label:I
                //    16: ldc             -2147483648
                //    18: iand           
                //    19: ifeq            36
                //    22: aload_3        
                //    23: dup            
                //    24: getfield        gg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1$2$1.label:I
                //    27: ldc             -2147483648
                //    29: isub           
                //    30: putfield        gg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1$2$1.label:I
                //    33: goto            46
                //    36: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1$2$1;
                //    39: dup            
                //    40: aload_0        
                //    41: aload_2        
                //    42: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1$2$1.<init>:(Lgg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1$2;Lkotlin/coroutines/Continuation;)V
                //    45: astore_3        /* $continuation */
                //    46: aload_3         /* $continuation */
                //    47: getfield        gg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1$2$1.result:Ljava/lang/Object;
                //    50: astore          $result
                //    52: invokestatic    kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
                //    55: astore          5
                //    57: aload_3         /* $continuation */
                //    58: getfield        gg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1$2$1.label:I
                //    61: tableswitch {
                //                0: 84
                //                1: 133
                //          default: 142
                //        }
                //    84: aload           $result
                //    86: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
                //    89: aload_0         /* this */
                //    90: getfield        gg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1$2.$this_unsafeFlow:Lkotlinx/coroutines/flow/FlowCollector;
                //    93: aload_1         /* value */
                //    94: astore          6
                //    96: astore          $this$filter_u24lambda_u2d0
                //    98: aload           value
                //   100: astore          it
                //   102: aload           it
                //   104: instanceof      Lgg/essential/lib/kdiscordipc/core/event/impl/ReadyEvent;
                //   107: ifeq            138
                //   110: aload           $this$filter_u24lambda_u2d0
                //   112: aload           value
                //   114: aload_3         /* $continuation */
                //   115: aload_3         /* $continuation */
                //   116: iconst_1       
                //   117: putfield        gg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1$2$1.label:I
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
        }, $completion);
        if (collect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}