package gg.essential.handlers.discord;

import kotlin.*;
import kotlinx.coroutines.*;
import kotlin.coroutines.*;
import org.jetbrains.annotations.*;
import gg.essential.lib.kdiscordipc.core.error.*;
import gg.essential.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000!
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0003
                                                   \u0000*\u0001\u0000\b
                                                   \u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006	¸\u0006\u0000""" }, d2 = { "kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core" })
public static final class DiscordIntegration$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public DiscordIntegration$special$$inlined$CoroutineExceptionHandler$1(final CoroutineExceptionHandler$Key $super_call_param$1) {
        super((CoroutineContext$Key)$super_call_param$1);
    }
    
    public void handleException(@NotNull final CoroutineContext context, @NotNull final Throwable exception) {
        final Throwable throwable = exception;
        if (!(throwable instanceof ConnectionError.Disconnected)) {
            Essential.logger.error("Exception caught in Discord IPC: ", throwable);
        }
    }
}