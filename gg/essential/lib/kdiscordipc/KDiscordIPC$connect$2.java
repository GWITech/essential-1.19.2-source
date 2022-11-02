package gg.essential.lib.kdiscordipc;

import kotlin.coroutines.jvm.internal.*;
import kotlinx.coroutines.flow.*;
import gg.essential.lib.kdiscordipc.core.packet.inbound.*;
import kotlin.coroutines.*;
import kotlin.*;
import kotlin.coroutines.intrinsics.*;
import gg.essential.lib.kdiscordipc.core.event.impl.*;
import gg.essential.lib.kdiscordipc.core.packet.inbound.impl.*;
import gg.essential.lib.kdiscordipc.core.event.data.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/InboundPacket;", "emit", "(Ldev/cbyrne/kdiscordipc/core/packet/inbound/InboundPacket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;" })
static final class KDiscordIPC$connect$2<T> implements SuspendFunction, FlowCollector {
    final /* synthetic */ KDiscordIPC this$0;
    
    KDiscordIPC$connect$2(final KDiscordIPC $receiver) {
        this.this$0 = $receiver;
        super();
    }
    
    @Nullable
    public final Object emit(@NotNull final InboundPacket it, @NotNull final Continuation<? super Unit> $completion) {
        if (it instanceof DispatchEventPacket.Ready) {
            final Object emit = KDiscordIPC.access$get_events$p(this.this$0).emit((Object)new ReadyEvent(((DispatchEventPacket.Ready)it).getData()), (Continuation)$completion);
            if (emit == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return emit;
            }
            return Unit.INSTANCE;
        }
        else if (it instanceof DispatchEventPacket.UserUpdate) {
            final Object emit2 = KDiscordIPC.access$get_events$p(this.this$0).emit((Object)new CurrentUserUpdateEvent(((DispatchEventPacket.UserUpdate)it).getData()), (Continuation)$completion);
            if (emit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return emit2;
            }
            return Unit.INSTANCE;
        }
        else if (it instanceof DispatchEventPacket.VoiceSettingsUpdate) {
            final Object emit3 = KDiscordIPC.access$get_events$p(this.this$0).emit((Object)new VoiceSettingsUpdateEvent(((DispatchEventPacket.VoiceSettingsUpdate)it).getData()), (Continuation)$completion);
            if (emit3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return emit3;
            }
            return Unit.INSTANCE;
        }
        else if (it instanceof DispatchEventPacket.ActivityJoin) {
            final Object emit4 = KDiscordIPC.access$get_events$p(this.this$0).emit((Object)new ActivityJoinEvent(((DispatchEventPacket.ActivityJoin)it).getData()), (Continuation)$completion);
            if (emit4 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return emit4;
            }
            return Unit.INSTANCE;
        }
        else if (it instanceof DispatchEventPacket.ActivityInvite) {
            final Object emit5 = KDiscordIPC.access$get_events$p(this.this$0).emit((Object)new ActivityInviteEvent(((DispatchEventPacket.ActivityInvite)it).getData()), (Continuation)$completion);
            if (emit5 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return emit5;
            }
            return Unit.INSTANCE;
        }
        else if (it instanceof DispatchEventPacket.Error) {
            final Object emit6 = KDiscordIPC.access$get_events$p(this.this$0).emit((Object)new ErrorEvent(((DispatchEventPacket.Error)it).getData()), (Continuation)$completion);
            if (emit6 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return emit6;
            }
            return Unit.INSTANCE;
        }
        else if (it instanceof ErrorPacket) {
            final Object emit7 = KDiscordIPC.access$get_events$p(this.this$0).emit((Object)new ErrorEvent(new ErrorEventData(((ErrorPacket)it).getCode(), ((ErrorPacket)it).getMessage())), (Continuation)$completion);
            if (emit7 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return emit7;
            }
            return Unit.INSTANCE;
        }
        else {
            final Object emit8 = KDiscordIPC.access$get_packets$p(this.this$0).emit((Object)it, (Continuation)$completion);
            if (emit8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return emit8;
            }
            return Unit.INSTANCE;
        }
    }
    
    public /* bridge */ Object emit(final Object value, final Continuation $completion) {
        return this.emit((InboundPacket)value, $completion);
    }
}