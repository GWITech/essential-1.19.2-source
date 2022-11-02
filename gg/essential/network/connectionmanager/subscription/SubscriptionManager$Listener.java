package gg.essential.network.connectionmanager.subscription;

import java.util.*;
import org.jetbrains.annotations.*;

public interface Listener
{
    default void onSubscriptionAdded(@NotNull final Set<UUID> uuids) {
    }
    
    default void onSubscriptionRemoved(@NotNull final Set<UUID> uuids) {
    }
}
