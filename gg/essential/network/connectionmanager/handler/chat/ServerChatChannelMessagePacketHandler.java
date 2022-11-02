package gg.essential.network.connectionmanager.handler.chat;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.chat.*;
import java.util.concurrent.atomic.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import java.util.stream.*;
import com.sparkuniverse.toolbox.chat.model.*;
import gg.essential.gui.friends.*;
import gg.essential.util.*;
import gg.essential.config.*;
import com.sparkuniverse.toolbox.chat.enums.*;
import net.minecraft.client.*;
import java.util.function.*;
import gg.essential.network.connectionmanager.chat.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerChatChannelMessagePacketHandler extends PacketHandler<ServerChatChannelMessagePacket>
{
    public static final AtomicInteger prefetching;
    
    public ServerChatChannelMessagePacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerChatChannelMessagePacket packet) {
        final ChatManager chatManager = connectionManager.getChatManager();
        Message message = null;
        final List<Message> sortedMessages = Arrays.stream(packet.getMessages()).sorted(Comparator.comparing(message -> ExtensionsKt.getSentTimestamp((Message)message)).reversed()).collect((Collector<? super Message, ?, List<Message>>)Collectors.toList());
        final Iterator<Message> iterator = sortedMessages.iterator();
        while (iterator.hasNext()) {
            message = iterator.next();
            final Optional<Channel> channelOptional = chatManager.getChannel(message.getChannelId());
            if (!channelOptional.isPresent()) {
                return;
            }
            final Channel channel = channelOptional.get();
            chatManager.addMessageToChannel(channel.getId(), message);
            final boolean notification = !(GuiUtil.INSTANCE.openedScreen() instanceof SocialMenu);
            if (message.isRead()) {
                continue;
            }
            if (message.getSender().equals(UUIDUtil.getClientUUID())) {
                continue;
            }
            if (!notification || channel.isMuted() || ServerChatChannelMessagePacketHandler.prefetching.get() != 0 || !EssentialConfig.INSTANCE.getEssentialFull()) {
                continue;
            }
            final UUID uuid = (channel.getType() == ChannelType.DIRECT_MESSAGE) ? ExtensionsKt.getOtherUser(channel) : message.getSender();
            UUIDUtil.getName(uuid).thenAcceptAsync((Consumer<? super String>)new ServerChatChannelMessagePacketHandler.NotificationHandler(channel, message), ExtensionsKt.getExecutor(MinecraftClient.getInstance()));
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerChatChannelMessagePacket)packet);
    }
    
    private static /* synthetic */ Long lambda$onHandle$0(final Object message) {
        return ExtensionsKt.getSentTimestamp((Message)message);
    }
    
    static {
        prefetching = new AtomicInteger();
    }
}
