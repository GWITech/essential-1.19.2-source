package gg.essential.network.connectionmanager.cosmetics;

import java.util.function.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.*;
import gg.essential.gui.notification.*;
import gg.essential.connectionmanager.common.packet.response.*;
import gg.essential.network.connectionmanager.*;

public class CosmeticEquipVisibilityResponse implements Consumer<Optional<Packet>>
{
    private final boolean nextState;
    private final boolean notification;
    
    public CosmeticEquipVisibilityResponse(final boolean nextState, final boolean notification) {
        super();
        this.nextState = nextState;
        this.notification = notification;
    }
    
    @Override
    public void accept(final Optional<Packet> responseOptional) {
        final Essential instance = Essential.getInstance();
        final ConnectionManager connectionManager = instance.getConnectionManager();
        final CosmeticsManager cosmeticsManager = connectionManager.getCosmeticsManager();
        if (!responseOptional.isPresent()) {
            if (this.notification) {
                Notifications.INSTANCE.push("Error", "An error occurred toggling your cosmetic state");
            }
        }
        else {
            final Packet packet = responseOptional.get();
            if (packet instanceof ResponseActionPacket && ((ResponseActionPacket)packet).isSuccessful()) {
                cosmeticsManager.setOwnCosmeticsVisible(this.nextState);
                if (this.notification) {
                    Notifications.INSTANCE.push("Cosmetics", "Your equipped cosmetics are now " + (this.nextState ? "shown" : "hidden") + " ingame");
                }
            }
        }
    }
    
    @Override
    public /* bridge */ void accept(final Object o) {
        this.accept((Optional<Packet>)o);
    }
}
