package gg.essential.network.connectionmanager.social.handler;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.social.*;
import gg.essential.network.connectionmanager.social.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.config.*;
import gg.essential.universal.*;
import java.util.concurrent.*;
import gg.essential.api.utils.*;
import gg.essential.gui.notification.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.client.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.util.*;

public class SocialInviteToServerPacketHandler extends PacketHandler<SocialInviteToServerPacket>
{
    private final Set<UUID> cooldowns;
    @NotNull
    private final SocialManager socialManager;
    
    public SocialInviteToServerPacketHandler(@NotNull final SocialManager socialManager) {
        super();
        this.cooldowns = Collections.newSetFromMap(new ConcurrentHashMap<UUID, Boolean>());
        this.socialManager = socialManager;
    }
    
    protected void onHandle$49589e0a(@NotNull final SocialInviteToServerPacket packet) {
        if (!EssentialConfig.INSTANCE.getEssentialFull()) {
            return;
        }
        this.socialManager.addIncomingServerInvite(packet.getUUID(), packet.getAddress());
        final MinecraftClient mc = UMinecraft.getMinecraft();
        if (this.cooldowns.contains(packet.getUUID())) {
            return;
        }
        this.cooldowns.add(packet.getUUID());
        Multithreading.schedule(() -> this.cooldowns.remove(packet.getUUID()), 7L, TimeUnit.SECONDS);
        UUIDUtil.getName(packet.getUUID()).thenAcceptAsync(hostName -> Notifications.INSTANCE.push("Server Invite", hostName + " has invited you to play with them on " + packet.getAddress(), (Function0<Unit>)(() -> {
            MinecraftUtils.INSTANCE.connectToServer(hostName, packet.getAddress());
            this.socialManager.removeIncomingServerInvite(packet.getUUID());
            return Unit.INSTANCE;
        })), ExtensionsKt.getExecutor(mc));
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle$49589e0a((SocialInviteToServerPacket)packet);
    }
    
    private /* synthetic */ void lambda$onHandle$2(final SocialInviteToServerPacket packet, final String hostName) {
        Notifications.INSTANCE.push("Server Invite", hostName + " has invited you to play with them on " + packet.getAddress(), (Function0<Unit>)(() -> {
            MinecraftUtils.INSTANCE.connectToServer(hostName, packet.getAddress());
            this.socialManager.removeIncomingServerInvite(packet.getUUID());
            return Unit.INSTANCE;
        }));
    }
    
    private /* synthetic */ Unit lambda$onHandle$1(final String hostName, final SocialInviteToServerPacket packet) {
        MinecraftUtils.INSTANCE.connectToServer(hostName, packet.getAddress());
        this.socialManager.removeIncomingServerInvite(packet.getUUID());
        return Unit.INSTANCE;
    }
    
    private /* synthetic */ void lambda$onHandle$0(final SocialInviteToServerPacket packet) {
        this.cooldowns.remove(packet.getUUID());
    }
}
