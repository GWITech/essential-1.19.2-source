package gg.essential.util;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import java.util.concurrent.*;
import kotlinx.coroutines.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "invoke" })
static final class MinecraftCoroutineDispatchers$renderThread$2 extends Lambda implements Function0<CoroutineDispatcher> {
    public static final MinecraftCoroutineDispatchers$renderThread$2 INSTANCE;
    
    MinecraftCoroutineDispatchers$renderThread$2() {
        super(0);
    }
    
    @NotNull
    public final CoroutineDispatcher invoke() {
        return ExecutorsKt.from((Executor)MinecraftCoroutineDispatchers$renderThread$2.MinecraftCoroutineDispatchers$renderThread$2$1.INSTANCE);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        MinecraftCoroutineDispatchers$renderThread$2.INSTANCE = new MinecraftCoroutineDispatchers$renderThread$2();
    }
}