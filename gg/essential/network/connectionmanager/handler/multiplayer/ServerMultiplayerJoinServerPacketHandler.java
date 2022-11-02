package gg.essential.network.connectionmanager.handler.multiplayer;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.multiplayer.*;
import java.util.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import gg.essential.api.utils.*;
import gg.essential.universal.*;
import net.minecraft.client.world.*;
import net.minecraft.client.network.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerMultiplayerJoinServerPacketHandler extends PacketHandler<ServerMultiplayerJoinServerPacket>
{
    private final Set<String> cooldowns;
    
    public ServerMultiplayerJoinServerPacketHandler() {
        super();
        this.cooldowns = Collections.newSetFromMap(new ConcurrentHashMap<String, Boolean>());
    }
    
    protected void onHandle$4ba9d511(@NotNull final ServerMultiplayerJoinServerPacket packet) {
        final String serverIP = packet.getAddress();
        if (this.cooldowns.contains(serverIP)) {
            return;
        }
        this.cooldowns.add(serverIP);
        Multithreading.schedule(() -> this.cooldowns.remove(serverIP), 7L, TimeUnit.SECONDS);
        UMinecraft.getMinecraft().execute(() -> {
            final ServerInfo serverData = new ServerInfo(serverIP, serverIP, false);
            serverData.setResourcePackPolicy(ServerInfo.ResourcePackPolicy.PROMPT);
            if (UMinecraft.getWorld() != null) {
                UMinecraft.getWorld().method_8525();
            }
            UMinecraft.getMinecraft().joinWorld((ClientWorld)null);
            final Screen parent = (Screen)new TitleScreen();
            ConnectScreen.connect(parent, UMinecraft.getMinecraft(), ServerAddress.parse(serverData.address), serverData);
        });
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$4ba9d511((ServerMultiplayerJoinServerPacket)packet);
    }
    
    private static /* synthetic */ void lambda$onHandle$1(final String serverIP) {
        final ServerInfo serverData = new ServerInfo(serverIP, serverIP, false);
        serverData.setResourcePackPolicy(ServerInfo.ResourcePackPolicy.PROMPT);
        if (UMinecraft.getWorld() != null) {
            UMinecraft.getWorld().method_8525();
        }
        UMinecraft.getMinecraft().joinWorld((ClientWorld)null);
        final Screen parent = (Screen)new TitleScreen();
        ConnectScreen.connect(parent, UMinecraft.getMinecraft(), ServerAddress.parse(serverData.address), serverData);
    }
    
    private /* synthetic */ void lambda$onHandle$0(final String serverIP) {
        this.cooldowns.remove(serverIP);
    }
}
