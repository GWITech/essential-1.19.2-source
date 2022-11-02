package gg.essential.handlers.discord;

import kotlin.coroutines.jvm.internal.*;
import kotlin.*;
import kotlin.coroutines.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "DiscordIntegration.kt", l = { 190 }, i = {}, s = {}, n = {}, m = "connect", c = "gg.essential.handlers.discord.DiscordIntegration")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
static final class DiscordIntegration$connect$1 extends ContinuationImpl {
    /* synthetic */ Object result;
    final /* synthetic */ DiscordIntegration this$0;
    int label;
    
    DiscordIntegration$connect$1(final DiscordIntegration this$0, final Continuation<? super DiscordIntegration$connect$1> $completion) {
        this.this$0 = this$0;
        super((Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        this.result = $result;
        this.label |= Integer.MIN_VALUE;
        return DiscordIntegration.access$connect(this.this$0, (Continuation)this);
    }
}