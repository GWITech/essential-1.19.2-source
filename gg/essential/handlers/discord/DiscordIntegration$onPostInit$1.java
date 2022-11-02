package gg.essential.handlers.discord;

import kotlin.jvm.functions.*;
import kotlinx.coroutines.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "DiscordIntegration.kt", l = { 106 }, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "gg.essential.handlers.discord.DiscordIntegration$onPostInit$1")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@""" }, d2 = { "<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;" })
static final class DiscordIntegration$onPostInit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    
    DiscordIntegration$onPostInit$1(final Continuation<? super DiscordIntegration$onPostInit$1> $completion) {
        super(2, (Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0: {
                ResultKt.throwOnFailure($result);
                final DiscordIntegration instance = DiscordIntegration.INSTANCE;
                final Continuation $completion = (Continuation)this;
                this.label = 1;
                if (DiscordIntegration.access$initialize(instance, $completion) == coroutine_SUSPENDED) {
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
        return (Continuation<Unit>)new DiscordIntegration$onPostInit$1((Continuation)$completion);
    }
    
    @Nullable
    public final Object invoke(@NotNull final CoroutineScope p1, @Nullable final Continuation<? super Unit> p2) {
        return ((DiscordIntegration$onPostInit$1)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((CoroutineScope)p1, (Continuation)p2);
    }
}