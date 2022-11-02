package gg.essential.connectionmanager.common.packet.subscription;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class SubscriptionUpdatePacket extends Packet
{
    @SerializedName("a")
    @Nullable
    private final UUID[] uuids;
    @SerializedName("b")
    private final boolean unsubscribeFromAll;
    @SerializedName("c")
    private final boolean newSubscription;
    
    public SubscriptionUpdatePacket(final boolean unsubscribeFromAll) {
        this(null, unsubscribeFromAll, false);
    }
    
    public SubscriptionUpdatePacket(@NotNull final UUID[] uuids, final boolean newSubscription) {
        this(uuids, false, newSubscription);
    }
    
    SubscriptionUpdatePacket(@Nullable final UUID[] uuids, final boolean unsubscribeFromAll, final boolean newSubscription) {
        super();
        this.uuids = uuids;
        this.unsubscribeFromAll = unsubscribeFromAll;
        this.newSubscription = newSubscription;
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final SubscriptionUpdatePacket that = (SubscriptionUpdatePacket)o;
        return this.unsubscribeFromAll == that.unsubscribeFromAll && this.newSubscription == that.newSubscription && Arrays.equals(this.uuids, that.uuids);
    }
    
    @Override
    public int hashCode() {
        int result = Objects.hash(this.unsubscribeFromAll, this.newSubscription);
        result = 31 * result + Arrays.hashCode(this.uuids);
        return result;
    }
    
    @Override
    public String toString() {
        return "SubscribeUpdateEvent{uuids=" + Arrays.toString(this.uuids) + ", unsubscribeFromAll=" + this.unsubscribeFromAll + ", newSubscription=" + this.newSubscription + '}';
    }
}
