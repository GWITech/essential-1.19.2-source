package gg.essential.mixins.ext.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006	""" }, d2 = { "executor", "Ljava/util/concurrent/Executor;", "Lgg/essential/mixins/ext/client/MinecraftExt;", "getExecutor", "(Lgg/essential/mixins/ext/client/MinecraftExt;)Ljava/util/concurrent/Executor;", "ext", "Lnet/minecraft/client/MinecraftClient;", "getExt", "(Lnet/minecraft/client/MinecraftClient;)Lgg/essential/mixins/ext/client/MinecraftExt;", "essential" })
public final class MinecraftExtKt
{
    @NotNull
    public static final Executor getExecutor(@NotNull final MinecraftExt $this$executor) {
        Intrinsics.checkNotNullParameter((Object)$this$executor, "<this>");
        return $this$executor.getEssential$executor();
    }
    
    @NotNull
    public static final MinecraftExt getExt(@NotNull final MinecraftClient $this$ext) {
        Intrinsics.checkNotNullParameter((Object)$this$ext, "<this>");
        return (MinecraftExt)$this$ext;
    }
}
