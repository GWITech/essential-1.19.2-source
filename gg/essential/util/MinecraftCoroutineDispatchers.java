package gg.essential.util;

import org.jetbrains.annotations.*;
import kotlinx.coroutines.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010	\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000b\u0010\b\u001a\u0004\b
                                                   \u0010\u0006¨\u0006\f""" }, d2 = { "Lgg/essential/util/MinecraftCoroutineDispatchers;", "", "()V", "clientThread", "Lkotlinx/coroutines/CoroutineDispatcher;", "getClientThread", "()Lkotlinx/coroutines/CoroutineDispatcher;", "clientThread$delegate", "Lkotlin/Lazy;", "renderThread", "getRenderThread", "renderThread$delegate", "essential" })
public final class MinecraftCoroutineDispatchers
{
    @NotNull
    public static final MinecraftCoroutineDispatchers INSTANCE;
    @NotNull
    private static final Lazy clientThread$delegate;
    
    private MinecraftCoroutineDispatchers() {
        super();
    }
    
    @NotNull
    public final CoroutineDispatcher getClientThread() {
        return (CoroutineDispatcher)MinecraftCoroutineDispatchers.clientThread$delegate.getValue();
    }
    
    static {
        INSTANCE = new MinecraftCoroutineDispatchers();
        clientThread$delegate = LazyKt.lazy((Function0)MinecraftCoroutineDispatchers$clientThread.MinecraftCoroutineDispatchers$clientThread$2.INSTANCE);
        LazyKt.lazy((Function0)MinecraftCoroutineDispatchers$renderThread.MinecraftCoroutineDispatchers$renderThread$2.INSTANCE);
    }
}
