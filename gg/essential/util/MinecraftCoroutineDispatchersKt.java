package gg.essential.util;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlinx.coroutines.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b"\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"\u001b\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b	\u0010\u0006¨\u0006
                                                   """ }, d2 = { "Client", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Dispatchers;", "getClient$annotations", "(Lkotlinx/coroutines/Dispatchers;)V", "getClient", "(Lkotlinx/coroutines/Dispatchers;)Lkotlinx/coroutines/CoroutineDispatcher;", "Render", "getRender$annotations", "getRender", "essential" })
public final class MinecraftCoroutineDispatchersKt
{
    @NotNull
    public static final CoroutineDispatcher getClient(@NotNull final Dispatchers $this$Client) {
        Intrinsics.checkNotNullParameter((Object)$this$Client, "<this>");
        return MinecraftCoroutineDispatchers.INSTANCE.getClientThread();
    }
}
