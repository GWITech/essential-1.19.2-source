package gg.essential.handlers.discord.activity.provider;

import kotlin.*;
import gg.essential.handlers.discord.activity.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J
                                                   \u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u0006\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/handlers/discord/activity/provider/ActivityStateProvider;", "", "init", "", "provide", "Lgg/essential/handlers/discord/activity/ActivityState;", "essential" })
public interface ActivityStateProvider
{
    default void init() {
    }
    
    @Nullable
    ActivityState provide();
}
