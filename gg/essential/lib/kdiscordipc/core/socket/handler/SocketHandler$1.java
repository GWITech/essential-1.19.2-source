package gg.essential.lib.kdiscordipc.core.socket.handler;

import kotlin.jvm.functions.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "SocketHandler.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "gg.essential.lib.kdiscordipc.core.socket.handler.SocketHandler$1")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@" }, d2 = { "<anonymous>", "", "it", "" })
static final class SocketHandler$1 extends SuspendLambda implements Function2<byte[], Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    final /* synthetic */ SocketHandler this$0;
    
    SocketHandler$1(final SocketHandler $receiver, final Continuation<? super SocketHandler$1> $completion) {
        this.this$0 = $receiver;
        super(2, (Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure($result);
        final byte[] it = (byte[])this.L$0;
        SocketHandler.access$getSocket$p(this.this$0).write(it);
        return Unit.INSTANCE;
    }
    
    @NotNull
    public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
        final Function2<byte[], Continuation<? super Unit>, Object> function2 = (Function2<byte[], Continuation<? super Unit>, Object>)new Function2<byte[], Continuation<? super Unit>, Object>() {
            /* synthetic */ Object L$0;
            final /* synthetic */ SocketHandler this$0 = this.this$0;
            
            SocketHandler$1(final Continuation<? super SocketHandler$1> $completion) {
                super(2, (Continuation)$completion);
            }
            
            @Nullable
            public final Object invokeSuspend(@NotNull final Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure($result);
                final byte[] it = (byte[])this.L$0;
                SocketHandler.access$getSocket$p(this.this$0).write(it);
                return Unit.INSTANCE;
            }
        };
        function2.L$0 = value;
        return (Continuation<Unit>)function2;
    }
    
    @Nullable
    public final Object invoke(@NotNull final byte[] p1, @Nullable final Continuation<? super Unit> p2) {
        return ((SocketHandler$1)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((byte[])p1, (Continuation<? super Unit>)p2);
    }
}