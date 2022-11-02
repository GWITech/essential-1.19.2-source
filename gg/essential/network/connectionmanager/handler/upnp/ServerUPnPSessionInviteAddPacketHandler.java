package gg.essential.network.connectionmanager.handler.upnp;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.upnp.*;
import java.util.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.config.*;
import gg.essential.handlers.discord.*;
import java.util.concurrent.*;
import gg.essential.api.utils.*;
import gg.essential.universal.*;
import gg.essential.gui.notification.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.network.connectionmanager.sps.*;
import gg.essential.upnp.model.*;
import net.minecraft.client.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.util.*;

public class ServerUPnPSessionInviteAddPacketHandler extends PacketHandler<ServerUPnPSessionInviteAddPacket>
{
    private final Set<UUID> cooldowns;
    
    public ServerUPnPSessionInviteAddPacketHandler() {
        super();
        this.cooldowns = Collections.newSetFromMap(new ConcurrentHashMap<UUID, Boolean>());
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerUPnPSessionInviteAddPacket packet) {
        final SPSManager spsManager = connectionManager.getSpsManager();
        final UUID hostUUID = packet.getHostUUID();
        final UPnPSession session = spsManager.getRemoteSession(hostUUID);
        if (session == null || !EssentialConfig.INSTANCE.getEssentialFull() || this.cooldowns.contains(hostUUID)) {
            return;
        }
        if (DiscordIntegration.INSTANCE.getPartyManager().shouldHideNotificationForHost(hostUUID)) {
            return;
        }
        this.cooldowns.add(hostUUID);
        Multithreading.schedule(() -> this.cooldowns.remove(hostUUID), 7L, TimeUnit.SECONDS);
        final MinecraftClient mc = UMinecraft.getMinecraft();
        UUIDUtil.getName(hostUUID).thenAcceptAsync(hostName -> Notifications.INSTANCE.push("World Invite", hostName + " has invited you to join their world. Click here to join!", (Function0<Unit>)(() -> {
            MinecraftUtils.INSTANCE.connectToServer(hostName, spsManager.getSpsAddress(hostUUID));
            return Unit.INSTANCE;
        })), ExtensionsKt.getExecutor(mc));
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerUPnPSessionInviteAddPacket)packet);
    }
    
    private static /* synthetic */ void lambda$onHandle$2(final SPSManager spsManager, final UUID hostUUID, final String hostName) {
        Notifications.INSTANCE.push("World Invite", hostName + " has invited you to join their world. Click here to join!", (Function0<Unit>)(() -> {
            MinecraftUtils.INSTANCE.connectToServer(hostName, spsManager.getSpsAddress(hostUUID));
            return Unit.INSTANCE;
        }));
    }
    
    private static /* synthetic */ Unit lambda$onHandle$1(final String hostName, final SPSManager spsManager, final UUID hostUUID) {
        MinecraftUtils.INSTANCE.connectToServer(hostName, spsManager.getSpsAddress(hostUUID));
        return Unit.INSTANCE;
    }
    
    private /* synthetic */ void lambda$onHandle$0(final UUID hostUUID) {
        this.cooldowns.remove(hostUUID);
    }
}
