package gg.essential.handlers.discord.activity.provider.impl;

import gg.essential.handlers.discord.activity.provider.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.handlers.discord.*;
import gg.essential.handlers.discord.state.*;
import gg.essential.util.*;
import gg.essential.handlers.discord.activity.*;
import kotlin.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J
                                                   \u0010\b\u001a\u0004\u0018\u00010	H\u0016R"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0082\u000e¢\u0006\b
                                                   \u0000"\u0004\b\u0006\u0010\u0007¨\u0006
                                                   """ }, d2 = { "Lgg/essential/handlers/discord/activity/provider/impl/GameActivityStateProvider;", "Lgg/essential/handlers/discord/activity/provider/ActivityStateProvider;", "()V", "value", "Lgg/essential/handlers/discord/state/GameState;", "state", "setState", "(Lgg/essential/handlers/discord/state/GameState;)V", "provide", "Lgg/essential/handlers/discord/activity/ActivityState;", "essential" })
public final class GameActivityStateProvider implements ActivityStateProvider
{
    @Nullable
    private GameState state;
    
    public GameActivityStateProvider() {
        super();
    }
    
    private final void setState(final GameState value) {
        final GameState castedField = this.state;
        final boolean shouldRegenerateKey = (castedField instanceof GameState.Multiplayer) ? (!(value instanceof GameState.Multiplayer) || !Intrinsics.areEqual((Object)((GameState.Multiplayer)castedField).getIp(), (Object)((GameState.Multiplayer)value).getIp())) : (castedField instanceof GameState.SPS.Host && !(value instanceof GameState.SPS.Host));
        if (shouldRegenerateKey) {
            DiscordIntegration.INSTANCE.regenerateSpsJoinKey();
        }
        this.state = value;
    }
    
    @Nullable
    @Override
    public ActivityState provide() {
        this.setState(GameState.Companion.current());
        final GameState state = this.state;
        ActivityState activityState;
        if (state instanceof GameState.Singleplayer) {
            activityState = ActivityState.Singleplayer.INSTANCE;
        }
        else if (state instanceof final GameState.Multiplayer multiplayer) {
            activityState = (ActivityState)new ActivityState$Multiplayer(multiplayer.getIp());
        }
        else if (state instanceof GameState$Realms) {
            activityState = (ActivityState)ActivityState$Realm.INSTANCE;
        }
        else if (state instanceof final GameState.SPS.Guest guest) {
            final UUID hostUUID = guest.getSession().getHostUUID();
            Intrinsics.checkNotNullExpressionValue((Object)hostUUID, "state.session.hostUUID");
            final UUID uuid = hostUUID;
            final String username = UUIDUtil.getName(uuid).join();
            Intrinsics.checkNotNullExpressionValue((Object)username, "username");
            activityState = (ActivityState)new ActivityState$SPSGuest(username);
        }
        else if (state instanceof GameState.SPS.Host) {
            activityState = (ActivityState)ActivityState$SPSHost.INSTANCE;
        }
        else {
            if (state != null) {
                throw new NoWhenBranchMatchedException();
            }
            activityState = null;
        }
        return activityState;
    }
}
