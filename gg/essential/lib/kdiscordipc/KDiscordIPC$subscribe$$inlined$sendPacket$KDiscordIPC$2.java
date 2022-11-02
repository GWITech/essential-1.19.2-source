package gg.essential.lib.kdiscordipc;

import kotlin.jvm.functions.*;
import gg.essential.lib.kdiscordipc.core.packet.inbound.impl.*;
import kotlin.coroutines.*;
import kotlin.coroutines.intrinsics.*;
import gg.essential.lib.kdiscordipc.core.packet.inbound.*;
import kotlin.jvm.internal.*;
import kotlin.coroutines.jvm.internal.*;
import org.jetbrains.annotations.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¨\u0006\u0005" }, d2 = { "<anonymous>", "", "T", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/InboundPacket;", "it", "gg/essential/lib/kdiscordipc/KDiscordIPC$sendPacket$2" })
@DebugMetadata(f = "KDiscordIPC.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "gg.essential.lib.kdiscordipc.KDiscordIPC$sendPacket$2")
public static final class KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$2 extends SuspendLambda implements Function2<SubscribePacket, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    final /* synthetic */ String $nonce;
    
    public KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$2(final String $nonce, final Continuation $completion) {
        this.$nonce = $nonce;
        super(2, $completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure($result);
        final InboundPacket it = (InboundPacket)this.L$0;
        return Boxing.boxBoolean(Intrinsics.areEqual((Object)it.getNonce(), (Object)this.$nonce));
    }
    
    @NotNull
    public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
        final KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$2 kDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$2 = new KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$2(this.$nonce, (Continuation)$completion);
        kDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$2.L$0 = value;
        return (Continuation<Unit>)kDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$2;
    }
    
    @Nullable
    public final Object invoke(@NotNull final SubscribePacket p1, @Nullable final Continuation<? super Boolean> p2) {
        return ((KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$2)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((InboundPacket)p1, (Continuation)p2);
    }
}