package gg.essential.lib.kdiscordipc.core.socket.handler;

import kotlin.jvm.functions.*;
import kotlinx.coroutines.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import kotlinx.coroutines.flow.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "SocketHandler.kt", l = { 94 }, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "gg.essential.lib.kdiscordipc.core.socket.handler.SocketHandler$write$2")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@" }, d2 = { "<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;" })
static final class SocketHandler$write$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SocketHandler this$0;
    final /* synthetic */ byte[] $bytes;
    
    SocketHandler$write$2(final SocketHandler $receiver, final byte[] $bytes, final Continuation<? super SocketHandler$write$2> $completion) {
        this.this$0 = $receiver;
        this.$bytes = $bytes;
        super(2, (Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0: {
                ResultKt.throwOnFailure($result);
                final MutableSharedFlow access$getOutboundBytes$p = SocketHandler.access$getOutboundBytes$p(this.this$0);
                final byte[] $bytes = this.$bytes;
                final Continuation continuation = (Continuation)this;
                this.label = 1;
                if (access$getOutboundBytes$p.emit((Object)$bytes, continuation) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure($result);
                break;
            }
            default: {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
    
    @NotNull
    public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
        return (Continuation<Unit>)new SocketHandler$write$2(this.this$0, this.$bytes, (Continuation)$completion);
    }
    
    @Nullable
    public final Object invoke(@NotNull final CoroutineScope p1, @Nullable final Continuation<? super Unit> p2) {
        return ((SocketHandler$write$2)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((CoroutineScope)p1, (Continuation)p2);
    }
}