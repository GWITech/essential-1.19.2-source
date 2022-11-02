package gg.essential.lib.kdiscordipc.manager.impl;

import kotlin.jvm.functions.*;
import gg.essential.lib.kdiscordipc.core.event.impl.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "VoiceSettingsManager.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "gg.essential.lib.kdiscordipc.manager.impl.VoiceSettingsManager$init$2")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@" }, d2 = { "<anonymous>", "", "Lgg/essential/lib/kdiscordipc/core/event/impl/VoiceSettingsUpdateEvent;" })
static final class VoiceSettingsManager$init$2 extends SuspendLambda implements Function2<VoiceSettingsUpdateEvent, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    final /* synthetic */ VoiceSettingsManager this$0;
    
    VoiceSettingsManager$init$2(final VoiceSettingsManager $receiver, final Continuation<? super VoiceSettingsManager$init$2> $completion) {
        this.this$0 = $receiver;
        super(2, (Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure($result);
        final VoiceSettingsUpdateEvent $this$on = (VoiceSettingsUpdateEvent)this.L$0;
        $this$on.getData();
        return Unit.INSTANCE;
    }
    
    @NotNull
    public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
        final VoiceSettingsManager$init$2 voiceSettingsManager$init$2 = new VoiceSettingsManager$init$2(this.this$0, (Continuation)$completion);
        voiceSettingsManager$init$2.L$0 = value;
        return (Continuation<Unit>)voiceSettingsManager$init$2;
    }
    
    @Nullable
    public final Object invoke(@NotNull final VoiceSettingsUpdateEvent p1, @Nullable final Continuation<? super Unit> p2) {
        return ((VoiceSettingsManager$init$2)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((VoiceSettingsUpdateEvent)p1, (Continuation)p2);
    }
}