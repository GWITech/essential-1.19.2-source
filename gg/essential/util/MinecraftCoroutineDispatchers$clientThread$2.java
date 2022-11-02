package gg.essential.util;

import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;
import kotlinx.coroutines.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "invoke" })
static final class MinecraftCoroutineDispatchers$clientThread$2 extends Lambda implements Function0<CoroutineDispatcher> {
    public static final MinecraftCoroutineDispatchers$clientThread$2 INSTANCE;
    
    MinecraftCoroutineDispatchers$clientThread$2() {
        super(0);
    }
    
    @NotNull
    public final CoroutineDispatcher invoke() {
        final MinecraftClient instance = MinecraftClient.getInstance();
        Intrinsics.checkNotNullExpressionValue((Object)instance, "getInstance()");
        return ExecutorsKt.from(ExtensionsKt.getExecutor(instance));
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        MinecraftCoroutineDispatchers$clientThread$2.INSTANCE = new MinecraftCoroutineDispatchers$clientThread$2();
    }
}