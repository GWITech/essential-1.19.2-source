package gg.essential.lib.kdiscordipc;

import kotlin.*;
import kotlin.coroutines.jvm.internal.*;
import kotlin.coroutines.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
@DebugMetadata(f = "KDiscordIPC.kt", l = { 224 }, i = {}, s = {}, n = {}, m = "emit", c = "gg.essential.lib.kdiscordipc.KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$1$2")
public static final class KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$1$2$1 extends ContinuationImpl {
    /* synthetic */ Object result;
    int label;
    final /* synthetic */ KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$1$2 this$0;
    
    public KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$1$2$1(final KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$1$2 this$0, final Continuation $completion) {
        this.this$0 = this$0;
        super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        this.result = $result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, (Continuation)this);
    }
}