package gg.essential.lib.kdiscordipc;

import kotlin.coroutines.jvm.internal.*;
import kotlin.coroutines.*;
import gg.essential.lib.kdiscordipc.core.event.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "KDiscordIPC.kt", l = { 141, 143 }, i = { 0, 0 }, s = { "L$0", "L$1" }, n = { "this_$iv", "nonce$iv" }, m = "subscribe", c = "gg.essential.lib.kdiscordipc.KDiscordIPC")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
static final class KDiscordIPC$subscribe$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    /* synthetic */ Object result;
    final /* synthetic */ KDiscordIPC this$0;
    int label;
    
    KDiscordIPC$subscribe$1(final KDiscordIPC this$0, final Continuation<? super KDiscordIPC$subscribe$1> $completion) {
        this.this$0 = this$0;
        super((Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        this.result = $result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.subscribe(null, (Continuation<? super Unit>)this);
    }
}