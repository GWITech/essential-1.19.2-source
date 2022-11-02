package gg.essential.api.utils;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u0007\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/api/utils/ShutdownHookUtil;", "", "register", "", "task", "Ljava/lang/Runnable;", "unregister", "essential-api" })
public interface ShutdownHookUtil
{
    void register(@NotNull final Runnable p0);
    
    void unregister(@NotNull final Runnable p0);
}
