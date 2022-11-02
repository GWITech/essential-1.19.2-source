package gg.essential.handlers;

import gg.essential.event.gui.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.connectionmanager.common.enums.*;
import gg.essential.lib.kbrewster.eventbus.*;
import org.jetbrains.annotations.*;
import gg.essential.data.*;
import gg.essential.config.*;
import gg.essential.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.util.*;
import net.minecraft.client.network.*;
import gg.essential.mixins.ext.client.multiplayer.*;
import gg.essential.event.network.server.*;

public class ServerStatusHandler
{
    public ServerStatusHandler() {
        super();
    }
    
    @Subscribe
    public void onGuiSwitch(final GuiOpenEvent event) {
        if (event.getGui() instanceof TitleScreen) {
            this.setActivity(null, null);
        }
    }
    
    @Subscribe
    public void disconnectEvent(final ServerLeaveEvent event) {
        this.setActivity(null, null);
    }
    
    private void setActivity(@Nullable final ActivityType activityType, @Nullable final String metadata) {
        if (!OnboardingData.hasAcceptedTos() || !EssentialConfig.INSTANCE.getEssentialFull()) {
            return;
        }
        final ConnectionManager connectionManager = Essential.getInstance().getConnectionManager();
        connectionManager.getProfileManager().updatePlayerActivity(activityType, metadata);
    }
    
    @Subscribe
    public void connect(final ServerJoinEvent event) {
        final ServerInfo serverData = event.getServerData();
        final ServerDataExt serverDataExt = ServerDataExtKt.getExt(serverData);
        Boolean shareWithFriends = serverDataExt.getEssential$shareWithFriends();
        if (shareWithFriends == null) {
            shareWithFriends = EssentialConfig.INSTANCE.getSendServerUpdates();
        }
        if (!shareWithFriends) {
            return;
        }
        this.setActivity(ActivityType.PLAYING, AddressUtil.INSTANCE.getFormattedAddress(serverData.address));
    }
    
    @Subscribe
    public void joinSinglePlayer(final SingleplayerJoinEvent event) {
        this.setActivity(ActivityType.PLAYING, "Singleplayer");
    }
}
