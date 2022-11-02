package gg.essential.handlers.discord;

import kotlin.jvm.functions.*;
import gg.essential.lib.kdiscordipc.core.event.impl.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import gg.essential.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "DiscordIntegration.kt", l = { 182 }, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "gg.essential.handlers.discord.DiscordIntegration$initialize$3")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@""" }, d2 = { "<anonymous>", "", "Lgg/essential/lib/kdiscordipc/core/event/impl/ErrorEvent;" })
static final class DiscordIntegration$initialize$3 extends SuspendLambda implements Function2<ErrorEvent, Continuation<? super Unit>, Object> {
    int label;
    private /* synthetic */ Object L$0;
    
    DiscordIntegration$initialize$3(final Continuation<? super DiscordIntegration$initialize$3> $completion) {
        super(2, (Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0: {
                ResultKt.throwOnFailure($result);
                final ErrorEvent $this$on = (ErrorEvent)this.L$0;
                Essential.logger.error("An error occurred in the Discord Integration: " + $this$on.getData().getMessage());
                DiscordIntegration.access$getIpc$p().disconnect();
                final DiscordIntegration instance = DiscordIntegration.INSTANCE;
                final Continuation $completion = (Continuation)this;
                this.label = 1;
                if (DiscordIntegration.access$connect(instance, $completion) == coroutine_SUSPENDED) {
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
        final DiscordIntegration$initialize$3 discordIntegration$initialize$3 = new DiscordIntegration$initialize$3((Continuation)$completion);
        discordIntegration$initialize$3.L$0 = value;
        return (Continuation<Unit>)discordIntegration$initialize$3;
    }
    
    @Nullable
    public final Object invoke(@NotNull final ErrorEvent p1, @Nullable final Continuation<? super Unit> p2) {
        return ((DiscordIntegration$initialize$3)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((ErrorEvent)p1, (Continuation)p2);
    }
}