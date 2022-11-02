package gg.essential.lib.kdiscordipc;

import kotlin.coroutines.jvm.internal.*;
import kotlin.coroutines.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "KDiscordIPC.kt", l = { 77, 78, 79, 80, 81, 84, 86 }, i = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5 }, s = { "L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "L$0" }, n = { "this", "index", "this", "index", "this", "index", "this", "index", "this", "index", "this" }, m = "connect", c = "gg.essential.lib.kdiscordipc.KDiscordIPC")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
static final class KDiscordIPC$connect$1 extends ContinuationImpl {
    Object L$0;
    int I$0;
    /* synthetic */ Object result;
    final /* synthetic */ KDiscordIPC this$0;
    int label;
    
    KDiscordIPC$connect$1(final KDiscordIPC this$0, final Continuation<? super KDiscordIPC$connect$1> $completion) {
        this.this$0 = this$0;
        super((Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        this.result = $result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.connect(0, (Continuation<? super Unit>)this);
    }
}