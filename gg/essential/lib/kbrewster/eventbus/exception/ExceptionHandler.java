package gg.essential.lib.kbrewster.eventbus.exception;

import kotlin.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
@Metadata(mv = { 1, 1, 16 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&?\u0006\u0007" }, d2 = { "Lgg/essential/lib/kbrewster/eventbus/exception/ExceptionHandler;", "", "handle", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "KeventBus" })
public interface ExceptionHandler
{
    void handle(@NotNull final Exception p0);
}
