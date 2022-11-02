package gg.essential.lib.kdiscordipc.manager.impl;

import kotlin.jvm.functions.*;
import gg.essential.lib.kdiscordipc.core.event.impl.*;
import kotlin.coroutines.jvm.internal.*;
import gg.essential.lib.kdiscordipc.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import gg.essential.lib.kdiscordipc.core.event.*;
import kotlin.coroutines.*;
import kotlinx.coroutines.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¨\u0006\u0005" }, d2 = { "<anonymous>", "", "T", "Lgg/essential/lib/kdiscordipc/core/event/Event;", "event", "gg/essential/lib/kdiscordipc/KDiscordIPC$on$2" })
@DebugMetadata(f = "KDiscordIPC.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "gg.essential.lib.kdiscordipc.KDiscordIPC$on$2")
public static final class VoiceSettingsManager$init$$inlined$onEvent$2 extends SuspendLambda implements Function2<VoiceSettingsUpdateEvent, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    final /* synthetic */ KDiscordIPC this$0;
    final /* synthetic */ Function2 $consumer;
    
    public VoiceSettingsManager$init$$inlined$onEvent$2(final KDiscordIPC $receiver, final Function2 $consumer, final Continuation $completion) {
        this.this$0 = $receiver;
        this.$consumer = $consumer;
        super(2, $completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure($result);
        final Event event = (Event)this.L$0;
        BuildersKt.launch$default(this.this$0.getScope(), (CoroutineContext)null, (CoroutineStart)null, (Function2)new VoiceSettingsManager$init$$inlined$onEvent$2.VoiceSettingsManager$init$$inlined$onEvent$2$1(this.$consumer, event, (Continuation)null), 3, (Object)null);
        return Unit.INSTANCE;
    }
    
    @NotNull
    public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
        final VoiceSettingsManager$init$$inlined$onEvent$2 voiceSettingsManager$init$$inlined$onEvent$2 = new VoiceSettingsManager$init$$inlined$onEvent$2(this.this$0, this.$consumer, (Continuation)$completion);
        voiceSettingsManager$init$$inlined$onEvent$2.L$0 = value;
        return (Continuation<Unit>)voiceSettingsManager$init$$inlined$onEvent$2;
    }
    
    @Nullable
    public final Object invoke(@NotNull final VoiceSettingsUpdateEvent p1, @Nullable final Continuation<? super Unit> p2) {
        return ((VoiceSettingsManager$init$$inlined$onEvent$2)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((Event)p1, (Continuation)p2);
    }
}