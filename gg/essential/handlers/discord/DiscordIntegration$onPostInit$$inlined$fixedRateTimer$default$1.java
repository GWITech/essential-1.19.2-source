package gg.essential.handlers.discord;

import kotlin.*;
import gg.essential.handlers.discord.activity.provider.*;
import java.util.*;
import gg.essential.handlers.discord.activity.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0011
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000*\u0001\u0000\b
                                                   \u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000""" }, d2 = { "kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib" })
public static final class DiscordIntegration$onPostInit$$inlined$fixedRateTimer$default$1 extends TimerTask {
    public DiscordIntegration$onPostInit$$inlined$fixedRateTimer$default$1() {
        super();
    }
    
    @Override
    public void run() {
        while (true) {
            for (final ActivityStateProvider it : DiscordIntegration.access$getStateProviders$p()) {
                final ActivityState provide = it.provide();
                if (provide != null) {
                    final ActivityState activityState = provide;
                    final ActivityState activityState2 = activityState;
                    if (activityState2 != null) {
                        final ActivityState it2 = activityState2;
                        DiscordIntegration.INSTANCE.setState(it2);
                    }
                    DiscordIntegration.access$setPartyInformation(DiscordIntegration.INSTANCE, DiscordIntegration.access$providePartyInformation(DiscordIntegration.INSTANCE));
                    return;
                }
            }
            final ActivityState activityState = null;
            continue;
        }
    }
}