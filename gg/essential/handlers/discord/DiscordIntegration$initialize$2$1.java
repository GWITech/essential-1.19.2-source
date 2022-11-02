package gg.essential.handlers.discord;

import kotlin.jvm.functions.*;
import gg.essential.lib.kdiscordipc.core.event.impl.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import gg.essential.*;
import gg.essential.handlers.discord.party.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "DiscordIntegration.kt", l = { 152 }, i = { 0 }, s = { "L$0" }, n = { "$this$on" }, m = "invokeSuspend", c = "gg.essential.handlers.discord.DiscordIntegration$initialize$2$1")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@""" }, d2 = { "<anonymous>", "", "Lgg/essential/lib/kdiscordipc/core/event/impl/ActivityJoinEvent;" })
static final class DiscordIntegration$initialize$2$1 extends SuspendLambda implements Function2<ActivityJoinEvent, Continuation<? super Unit>, Object> {
    int label;
    private /* synthetic */ Object L$0;
    
    DiscordIntegration$initialize$2$1(final Continuation<? super DiscordIntegration$initialize$2$1> $completion) {
        super(2, (Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        while (true) {
            switch (this.label) {
                case 0: {
                    ResultKt.throwOnFailure($result);
                    ActivityJoinEvent $this$on = (ActivityJoinEvent)this.L$0;
                    try {
                        final PartyManager partyManager = DiscordIntegration.INSTANCE.getPartyManager();
                        final String secret = $this$on.getData().getSecret();
                        final Continuation $completion = (Continuation)this;
                        this.L$0 = $this$on;
                        this.label = 1;
                        if (partyManager.joinParty(secret, (Continuation<? super Unit>)$completion) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        while (true) {
                            DiscordIntegration.INSTANCE.setHostJoinSecret($this$on.getData().getSecret());
                            return Unit.INSTANCE;
                            $this$on = (ActivityJoinEvent)this.L$0;
                            ResultKt.throwOnFailure($result);
                            continue;
                        }
                    }
                    catch (final Exception e) {
                        Essential.logger.error("Failed to join party " + $this$on.getData() + ": " + e, (Throwable)e);
                    }
                    return Unit.INSTANCE;
                }
                case 1: {
                    continue;
                }
                default: {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            break;
        }
    }
    
    @NotNull
    public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
        final DiscordIntegration$initialize$2$1 discordIntegration$initialize$2$1 = new DiscordIntegration$initialize$2$1((Continuation)$completion);
        discordIntegration$initialize$2$1.L$0 = value;
        return (Continuation<Unit>)discordIntegration$initialize$2$1;
    }
    
    @Nullable
    public final Object invoke(@NotNull final ActivityJoinEvent p1, @Nullable final Continuation<? super Unit> p2) {
        return ((DiscordIntegration$initialize$2$1)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((ActivityJoinEvent)p1, (Continuation)p2);
    }
}