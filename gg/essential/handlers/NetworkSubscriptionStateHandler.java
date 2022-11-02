package gg.essential.handlers;

import gg.essential.event.client.*;
import gg.essential.data.*;
import gg.essential.*;
import gg.essential.universal.*;
import gg.essential.mixins.impl.client.entity.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.network.connectionmanager.subscription.*;
import net.minecraft.client.world.*;
import gg.essential.cosmetics.source.*;
import net.minecraft.client.network.*;
import java.util.*;
import gg.essential.lib.kbrewster.eventbus.*;

public class NetworkSubscriptionStateHandler
{
    private final Set<UUID> subscribedTo;
    
    public NetworkSubscriptionStateHandler() {
        super();
        this.subscribedTo = new HashSet<UUID>();
    }
    
    @Subscribe
    public void tick(final ClientTickEvent tickEvent) {
        if (!OnboardingData.hasAcceptedTos()) {
            return;
        }
        final ConnectionManager connectionManager = Essential.getInstance().getConnectionManager();
        final SubscriptionManager subscriptionManager = connectionManager.getSubscriptionManager();
        final Set<UUID> currentTickList = new HashSet<UUID>();
        final ClientWorld theWorld = UMinecraft.getWorld();
        if (theWorld != null) {
            for (final AbstractClientPlayerEntity playerEntity : theWorld.method_18456()) {
                currentTickList.add(playerEntity.method_5667());
                if (playerEntity instanceof final AbstractClientPlayerExt abstractClientPlayerExt) {
                    final CosmeticsSource cosmeticsSource = abstractClientPlayerExt.getCosmeticsSource();
                    if (!(cosmeticsSource instanceof LiveCosmeticsSource)) {
                        continue;
                    }
                    currentTickList.add(((LiveCosmeticsSource)cosmeticsSource).getUuid());
                }
            }
        }
        final ClientPlayNetworkHandler netHandler = UMinecraft.getNetHandler();
        if (netHandler != null) {
            final Collection<PlayerListEntry> playerInfoMap = netHandler.getPlayerList();
            for (final PlayerListEntry info : playerInfoMap) {
                final UUID id = info.getProfile().getId();
                currentTickList.add(id);
            }
        }
        final Iterator<UUID> iterator = this.subscribedTo.iterator();
        final Set<UUID> unsubFrom = new HashSet<UUID>();
        while (iterator.hasNext()) {
            final UUID next = iterator.next();
            if (!currentTickList.contains(next)) {
                unsubFrom.add(next);
                iterator.remove();
            }
        }
        final Set<UUID> subTo = new HashSet<UUID>();
        for (final UUID uuid : currentTickList) {
            if (this.subscribedTo.add(uuid)) {
                if (uuid.version() != 4) {
                    continue;
                }
                subTo.add(uuid);
            }
        }
        if (subTo.size() > 0) {
            subscriptionManager.subscribeToFeeds(subTo);
        }
        if (unsubFrom.size() > 0) {
            subscriptionManager.unSubscribeFromFeeds(unsubFrom);
        }
    }
}
