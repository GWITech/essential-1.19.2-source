package gg.essential.handlers.discord;

import kotlin.jvm.functions.*;
import kotlinx.coroutines.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import gg.essential.lib.kdiscordipc.core.event.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001"
                                                   \b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\u008a@¨\u0006\u0005""" }, d2 = { "<anonymous>", "", "T", "Lgg/essential/lib/kdiscordipc/core/event/Event;", "Lkotlinx/coroutines/CoroutineScope;", "gg/essential/lib/kdiscordipc/KDiscordIPC$on$2$1" })
@DebugMetadata(f = "KDiscordIPC.kt", l = { 103 }, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "gg.essential.lib.kdiscordipc.KDiscordIPC$on$2$1")
public static final class DiscordIntegration$initialize$$inlined$onEvent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ Function2 $consumer;
    final /* synthetic */ Event $event;
    
    public DiscordIntegration$initialize$$inlined$onEvent$2$1(final Function2 $consumer, final Event $event, final Continuation $completion) {
        this.$consumer = $consumer;
        this.$event = $event;
        super(2, $completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0: {
                ResultKt.throwOnFailure($result);
                final Function2 $consumer = this.$consumer;
                final Event $event = this.$event;
                this.label = 1;
                if ($consumer.invoke((Object)$event, (Object)this) == coroutine_SUSPENDED) {
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
        return (Continuation<Unit>)new DiscordIntegration$initialize$$inlined$onEvent$2$1(this.$consumer, this.$event, (Continuation)$completion);
    }
    
    @Nullable
    public final Object invoke(@NotNull final CoroutineScope p1, @Nullable final Continuation<? super Unit> p2) {
        return ((DiscordIntegration$initialize$$inlined$onEvent$2$1)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((CoroutineScope)p1, (Continuation)p2);
    }
}