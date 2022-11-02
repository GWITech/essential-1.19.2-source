package gg.essential.lib.kdiscordipc.manager.impl;

import kotlin.coroutines.jvm.internal.*;
import kotlin.coroutines.*;
import gg.essential.lib.kdiscordipc.data.activity.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "ActivityManager.kt", l = { 60, 62 }, i = { 0, 0, 0, 0, 1, 1 }, s = { "L$0", "L$1", "L$2", "L$3", "L$0", "L$1" }, n = { "this", "activity", "this_$iv", "nonce$iv", "this", "activity" }, m = "setActivity", c = "gg.essential.lib.kdiscordipc.manager.impl.ActivityManager")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
static final class ActivityManager$setActivity$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    /* synthetic */ Object result;
    final /* synthetic */ ActivityManager this$0;
    int label;
    
    ActivityManager$setActivity$1(final ActivityManager this$0, final Continuation<? super ActivityManager$setActivity$1> $completion) {
        this.this$0 = this$0;
        super((Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        this.result = $result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setActivity(null, (Continuation<? super Unit>)this);
    }
}