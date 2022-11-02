package gg.essential.lib.kdiscordipc.core.socket.handler;

import kotlin.jvm.functions.*;
import kotlinx.coroutines.flow.*;
import gg.essential.lib.kdiscordipc.core.packet.inbound.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import gg.essential.lib.kdiscordipc.core.packet.pipeline.*;
import gg.essential.lib.kdiscordipc.core.error.*;
import java.net.*;
import gg.essential.lib.kdiscordipc.core.socket.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "SocketHandler.kt", l = { 39 }, i = { 0 }, s = { "L$0" }, n = { "$this$flow" }, m = "invokeSuspend", c = "gg.essential.lib.kdiscordipc.core.socket.handler.SocketHandler$events$1")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@" }, d2 = { "<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/InboundPacket;" })
static final class SocketHandler$events$1 extends SuspendLambda implements Function2<FlowCollector<? super InboundPacket>, Continuation<? super Unit>, Object> {
    int label;
    private /* synthetic */ Object L$0;
    final /* synthetic */ SocketHandler this$0;
    
    SocketHandler$events$1(final SocketHandler $receiver, final Continuation<? super SocketHandler$events$1> $completion) {
        this.this$0 = $receiver;
        super(2, (Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        while (true) {
            switch (this.label) {
                case 0: {
                    ResultKt.throwOnFailure($result);
                    final FlowCollector $this$flow = (FlowCollector)this.L$0;
                    break;
                }
                case 1: {
                    Label_0111: {
                        break Label_0111;
                        try {
                            final RawPacket rawPacket = SocketHandler.access$getSocket$p(this.this$0).read();
                            final InboundPacket decode = ByteToMessageDecoder.INSTANCE.decode(rawPacket);
                            if (decode == null) {
                                break;
                            }
                            final InboundPacket it = decode;
                            final FlowCollector $this$flow;
                            final FlowCollector flowCollector = $this$flow;
                            final InboundPacket inboundPacket = it;
                            this.L$0 = $this$flow;
                            this.label = 1;
                            if (flowCollector.emit((Object)inboundPacket, (Continuation)this) == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            while (true) {
                                break;
                                final FlowCollector flowCollector2 = (FlowCollector)this.L$0;
                                ResultKt.throwOnFailure($result);
                                continue;
                            }
                        }
                        catch (final DecodeError e) {
                            if (e instanceof DecodeError.InvalidData) {
                                throw ConnectionError.Disconnected.INSTANCE;
                            }
                            break;
                        }
                        catch (final SocketException ex) {
                            throw ConnectionError.Disconnected.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                default: {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            if (this.this$0.getConnected()) {
                continue;
            }
            break;
        }
        return Unit.INSTANCE;
    }
    
    @NotNull
    public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
        final SocketHandler$events$1 socketHandler$events$1 = new SocketHandler$events$1(this.this$0, (Continuation)$completion);
        socketHandler$events$1.L$0 = value;
        return (Continuation<Unit>)socketHandler$events$1;
    }
    
    @Nullable
    public final Object invoke(@NotNull final FlowCollector<? super InboundPacket> p1, @Nullable final Continuation<? super Unit> p2) {
        return ((SocketHandler$events$1)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((FlowCollector)p1, (Continuation)p2);
    }
}