package gg.essential.gui.friends.state;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.common.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000"
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020	2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006
                                                   \u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/gui/friends/state/IStatusStates;", "", "getActivity", "Lgg/essential/gui/friends/state/PlayerActivity;", "uuid", "Ljava/util/UUID;", "getActivityState", "Lgg/essential/gui/common/ReadOnlyState;", "joinSession", "", "essential" })
public interface IStatusStates
{
    @NotNull
    ReadOnlyState<PlayerActivity> getActivityState(@NotNull final UUID p0);
    
    @NotNull
    PlayerActivity getActivity(@NotNull final UUID p0);
    
    boolean joinSession(@NotNull final UUID p0);
}
