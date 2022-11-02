package gg.essential.network.connectionmanager.chat;

import gg.essential.gui.friends.state.*;
import java.util.concurrent.*;
import com.sparkuniverse.toolbox.chat.model.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.elementa.state.*;
import gg.essential.network.connectionmanager.queue.*;
import gg.essential.network.connectionmanager.handler.*;
import gg.essential.network.connectionmanager.handler.chat.*;
import org.jetbrains.annotations.*;
import com.sparkuniverse.toolbox.chat.enums.*;
import com.google.common.collect.*;
import gg.essential.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.util.*;
import gg.essential.gui.notification.*;
import gg.essential.connectionmanager.common.packet.response.*;
import gg.essential.connectionmanager.common.packet.chat.*;
import gg.essential.gui.common.*;
import gg.essential.gui.friends.message.*;
import java.util.*;
import java.util.function.*;
import gg.essential.gui.friends.message.v2.*;

public class ChatManager extends StateCallbackManager<IMessengerManager> implements NetworkedManager
{
    @NotNull
    private final Map<Long, Channel> channels;
    @NotNull
    private final Map<Long, ConcurrentMap<Long, Message>> channelMessages;
    @NotNull
    private final Map<String, Map<String, String>> reportReasons;
    @NotNull
    private final Set<Long> announcementChannelIds;
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final State<Integer> unreadMessageCount;
    @NotNull
    private final PacketQueue mutedStateUpdateQueue;
    @NotNull
    private final Map<Long, Message> messageMap;
    @NotNull
    private final Map<Long, ChatManager.EagerMessageResolver> channelEagerMessageResolverMap;
    
    public ChatManager(@NotNull final ConnectionManager connectionManager) {
        super();
        this.channels = (Map<Long, Channel>)Maps.newConcurrentMap();
        this.channelMessages = (Map<Long, ConcurrentMap<Long, Message>>)Maps.newConcurrentMap();
        this.reportReasons = (Map<String, Map<String, String>>)Maps.newConcurrentMap();
        this.announcementChannelIds = Sets.newConcurrentHashSet();
        this.unreadMessageCount = new BasicState<Integer>(0);
        this.messageMap = (Map<Long, Message>)Maps.newConcurrentMap();
        this.channelEagerMessageResolverMap = new HashMap<Long, ChatManager.EagerMessageResolver>();
        this.connectionManager = connectionManager;
        this.mutedStateUpdateQueue = new SequentialPacketQueue.Builder(connectionManager).onTimeoutRetransmit().create();
        connectionManager.registerPacketHandler(ChatChannelMemberAddPacket.class, new ChatChannelMemberAddPacketHandler());
        connectionManager.registerPacketHandler(ChatChannelMessageDeletePacket.class, new ChatChannelMessageDeletePacketHandler());
        connectionManager.registerPacketHandler(ChatChannelMemberRemovePacket.class, new ChatChannelMemberRemovePacketHandler());
        connectionManager.registerPacketHandler(ChatChannelUpdatePacket.class, new ChatChannelUpdatePacketHandler());
        connectionManager.registerPacketHandler(ServerChatChannelAddPacket.class, new ServerChatChannelAddPacketHandler());
        connectionManager.registerPacketHandler(ServerChatChannelClearPacket.class, new ServerChatChannelClearPacketHandler());
        connectionManager.registerPacketHandler(ServerChatChannelMessagePacket.class, new ServerChatChannelMessagePacketHandler());
        connectionManager.registerPacketHandler(ServerChatChannelRemovePacket.class, new ServerChatChannelRemovePacketHandler());
        connectionManager.registerPacketHandler(ServerChatChannelMessageReportReasonsPacket.class, new ServerChatChannelMessageReportReasonsPacketHandler());
    }
    
    @NotNull
    public Map<Long, Channel> getChannels() {
        return this.channels;
    }
    
    public void setReportReasons(@Nullable final Map<String, Map<String, String>> reportReasons) {
        this.reportReasons.clear();
        if (reportReasons == null) {
            return;
        }
        this.reportReasons.putAll(reportReasons);
    }
    
    @NotNull
    public Optional<Channel> getChannel(@NotNull final Long id) {
        return Optional.ofNullable(this.channels.get(id));
    }
    
    public long getPrimaryAnnouncementChannelId() {
        final Channel channel = this.getPrimaryAnnouncementChannel();
        return (channel != null) ? channel.getId() : 0L;
    }
    
    @Nullable
    public Channel getPrimaryAnnouncementChannel() {
        for (final Channel channel : this.channels.values()) {
            if (channel.getType() == ChannelType.ANNOUNCEMENT) {
                return channel;
            }
        }
        return null;
    }
    
    @NotNull
    public Set<Long> getAnnouncementChannelIds() {
        return this.announcementChannelIds;
    }
    
    @NotNull
    public Map<String, String> getReportReasons(@NotNull final String preferredLocale) {
        final ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        for (final Map.Entry<String, Map<String, String>> entry : this.reportReasons.entrySet()) {
            final Map<String, String> values = entry.getValue();
            String value = values.get(preferredLocale);
            if (value == null) {
                value = values.get("en_US");
            }
            builder.put(entry.getKey(), value);
        }
        return builder.build();
    }
    
    public void addChannels(@NotNull final Iterable<Channel> channels) {
        for (final Channel channel : channels) {
            this.addChannel(channel);
        }
    }
    
    public void addChannel(@NotNull final Channel channel) {
        this.channels.put(channel.getId(), channel);
        for (final UUID member : channel.getMembers()) {
            CachedAvatarImage.ofUUID(member);
        }
        ServerChatChannelMessagePacketHandler.prefetching.incrementAndGet();
        this.retrieveRecentMessageHistory(channel.getId(), 10, packet -> ServerChatChannelMessagePacketHandler.prefetching.decrementAndGet());
        if (ExtensionsKt.isAnnouncement(channel)) {
            for (final long announcementChannelId : this.announcementChannelIds) {
                if (announcementChannelId != channel.getId()) {
                    ServerChatChannelMessagePacketHandler.prefetching.incrementAndGet();
                    this.retrieveRecentMessageHistory(announcementChannelId, 100, packet -> ServerChatChannelMessagePacketHandler.prefetching.decrementAndGet());
                }
            }
            this.announcementChannelIds.add(channel.getId());
        }
        for (final IMessengerManager iMessengerManager : this.getCallbacks()) {
            iMessengerManager.newChannel(channel);
        }
    }
    
    public void setChannelInfo(final long channelId, @Nullable final String channelName, @Nullable final String channelTopic) {
        final Optional<Channel> channelOptional = this.getChannel(channelId);
        if (!channelOptional.isPresent()) {
            return;
        }
        final Channel channel = channelOptional.get();
        if (channelName != null) {
            channel.setName(channelName);
        }
        if (channelTopic != null) {
            channel.setTopic(channelTopic);
        }
        for (final IMessengerManager iMessengerManager : this.getCallbacks()) {
            iMessengerManager.channelUpdated(channel);
        }
    }
    
    public void removeChannels(final long[] channelIds) {
        for (final long channelId : channelIds) {
            this.removeChannel(channelId);
        }
    }
    
    @Nullable
    public Channel removeChannel(final long id) {
        final Channel channel = this.channels.remove(id);
        final ConcurrentMap<Long, Message> removed = this.channelMessages.remove(id);
        if (removed != null) {
            for (final Long messsageId : removed.keySet()) {
                this.messageMap.remove(messsageId);
            }
        }
        this.updateUnreadMessageCount();
        if (channel != null) {
            for (final IMessengerManager iMessengerManager : this.getCallbacks()) {
                iMessengerManager.channelDeleted(channel);
            }
        }
        this.channelEagerMessageResolverMap.remove(id);
        this.announcementChannelIds.remove(id);
        return channel;
    }
    
    public void clearChannels() {
        this.channels.clear();
        this.channelMessages.clear();
        this.updateUnreadMessageCount();
        this.announcementChannelIds.clear();
        this.reportReasons.clear();
        this.channelEagerMessageResolverMap.clear();
        this.messageMap.clear();
        for (final IMessengerManager callback : this.getCallbacks()) {
            callback.reset();
        }
    }
    
    @Override
    public void onConnected() {
        this.mutedStateUpdateQueue.reset();
        this.resetState();
    }
    
    @Override
    public void resetState() {
        this.clearChannels();
    }
    
    @Nullable
    public Map<Long, Message> getMessages(final long channelId) {
        final ConcurrentMap<Long, Message> messageMap = this.channelMessages.get(channelId);
        return (messageMap != null) ? Collections.unmodifiableMap((Map<? extends Long, ? extends Message>)messageMap) : null;
    }
    
    public void addMessageToChannel(final long channelId, @NotNull final Message message) {
        final Channel channel = this.getChannel(channelId).orElse(null);
        if (channel == null) {
            Essential.logger.error("Received message: " + message + " for channel that does not exist");
            return;
        }
        this.messageMap.put(message.getId(), message);
        ConcurrentMap<Long, Message> map = this.channelMessages.get(channelId);
        if (map == null) {
            map = Maps.newConcurrentMap();
            this.channelMessages.put(channelId, map);
        }
        map.put(message.getId(), message);
        for (final IMessengerManager iMessengerManager : this.getCallbacks()) {
            iMessengerManager.messageReceived(channel, message);
        }
        this.updateUnreadMessageCount();
        final ChatManager.EagerMessageResolver eagerMessageResolver = this.channelEagerMessageResolverMap.get(channelId);
        if (eagerMessageResolver != null) {
            eagerMessageResolver.messageReceived(message);
        }
    }
    
    public void sendMessage(final long channelId, @NotNull final String messageContent, @Nullable final Long replyToMessageId, @Nullable final Consumer<Optional<Packet>> callback) {
        this.connectionManager.send(new ClientChatChannelMessageCreatePacket(channelId, messageContent, replyToMessageId), callback);
    }
    
    public void sendMessage(final long channelId, @NotNull final String messageContent, @Nullable final Consumer<Optional<Packet>> callback) {
        this.sendMessage(channelId, messageContent, null, callback);
    }
    
    public void removeMessage(final long channelId, final long messageId) {
        this.messageMap.remove(messageId);
        final ConcurrentMap<Long, Message> channelMessages = this.channelMessages.get(channelId);
        if (channelMessages != null) {
            final Message message = channelMessages.remove(messageId);
            if (message != null) {
                this.updateUnreadMessageCount();
                for (final IMessengerManager iMessengerManager : this.getCallbacks()) {
                    iMessengerManager.messageDeleted(message);
                }
            }
        }
    }
    
    public void deleteMessage(final long channelId, final long messageId) {
        this.deleteMessage(channelId, messageId, null);
        this.removeMessage(channelId, messageId);
    }
    
    public void deleteMessage(final long channelId, final long messageId, @Nullable final Consumer<Optional<Packet>> callback) {
        this.connectionManager.send(new ChatChannelMessageDeletePacket(channelId, messageId), callback);
    }
    
    public void createGroupDM(@NotNull final UUID[] members, @Nullable String groupName, @Nullable final Consumer<Optional<Channel>> callback) {
        for (final UUID member : members) {
            if (!this.connectionManager.getRelationshipManager().isFriend(member) && member != UUIDUtil.getClientUUID()) {
                Notifications.INSTANCE.push("Failed to create group", "You are not friends with one of the members");
                if (callback != null) {
                    callback.accept(Optional.empty());
                }
                return;
            }
        }
        if (groupName == null) {
            groupName = "New Group";
        }
        else if (groupName.length() > 64) {
            groupName = groupName.substring(0, 63);
        }
        this.connectionManager.send(new ClientChatChannelCreatePacket(ChannelType.GROUP_DIRECT_MESSAGE, groupName, members), response -> {
            Optional<Channel> channel;
            if (!response.isPresent()) {
                Notifications.INSTANCE.push("Error", "A timeout occurred please try again");
                channel = Optional.empty();
            }
            else if (response.get() instanceof ServerChatChannelAddPacket) {
                channel = response.get().getChannels().stream().findFirst();
            }
            else {
                Notifications.INSTANCE.push("Error", "An unexpected error occurred");
                channel = Optional.empty();
            }
            if (callback != null) {
                callback.accept(channel);
            }
        });
    }
    
    public void createDM(@NotNull final UUID otherParty, @Nullable final String playerName, @Nullable final Consumer<Optional<Packet>> callback) {
        if (!this.connectionManager.getRelationshipManager().isFriend(otherParty)) {
            Notifications.INSTANCE.push("Failed to create DM", "You are not friends with this player");
            return;
        }
        this.connectionManager.send(new ClientChatChannelCreatePacket(ChannelType.DIRECT_MESSAGE, playerName, new UUID[] { otherParty }), callback);
    }
    
    public void updateChannelInformation(final long channelId, @Nullable String channelName, @Nullable String channelTopic) {
        final Channel currentChannelInfo = this.channels.get(channelId);
        if (currentChannelInfo == null) {
            Notifications.INSTANCE.push("Error updating channel", "Channel does not exist");
            return;
        }
        if (channelName == null) {
            channelName = currentChannelInfo.getName();
        }
        else if (channelName.length() > 64) {
            channelName = channelName.substring(0, 63);
        }
        if (channelTopic == null) {
            channelTopic = currentChannelInfo.getTopic();
        }
        if (channelName.equals(currentChannelInfo.getName()) && (channelTopic == null || channelTopic.equals(currentChannelInfo.getTopic()))) {
            Notifications.INSTANCE.push("Error updating channel", "Nothing to update");
            return;
        }
        final ChatChannelUpdatePacket update = new ChatChannelUpdatePacket(channelId, channelName, channelTopic);
        this.connectionManager.send(update, responseOptional -> {
            final Packet packet = responseOptional.orElse(null);
            if (!(packet instanceof ResponseActionPacket) || !((ResponseActionPacket)packet).isSuccessful()) {
                Notifications.INSTANCE.push("Error updating channel", "An unexpected error has occurred. Try again.");
            }
            else {
                this.setChannelInfo(channelId, update.getName(), update.getTopic());
            }
        });
    }
    
    public void addPlayersToChannel(final long channelId, @NotNull final UUID[] players) {
        final Channel channel = this.channels.get(channelId);
        if (channel == null) {
            Notifications.INSTANCE.push("Error adding players", "Channel does not exist");
            return;
        }
        if (channel.getType() != ChannelType.GROUP_DIRECT_MESSAGE) {
            Notifications.INSTANCE.push("Error adding players", "Channel is not a group DM");
            return;
        }
        if (channel.getType().hasUserLimit() && channel.getMembers().size() + 1 > channel.getType().getBaseUserLimit()) {
            Notifications.INSTANCE.push("Error adding players", "Channel has reached it's user limit");
            return;
        }
        this.connectionManager.send(new ChatChannelMemberAddPacket(channelId, players), maybePacket -> {
            final Packet packet = maybePacket.orElse(null);
            if (packet instanceof final ServerChannelMemberActionResponsePacket serverChannelMemberActionResponsePacket) {
                serverChannelMemberActionResponsePacket.getResults().entrySet().iterator();
                final Iterator iterator;
                while (iterator.hasNext()) {
                    final Map.Entry<UUID, Boolean> entry = iterator.next();
                    final UUID uuid = entry.getKey();
                    if (entry.getValue()) {
                        channel.getMembers().add(uuid);
                    }
                    else {
                        UUIDUtil.getName(uuid).thenAccept(name -> Notifications.INSTANCE.push("Error adding player", "Failed to adding " + name + " to group."));
                    }
                }
                this.getCallbacks().iterator();
                final Iterator iterator2;
                while (iterator2.hasNext()) {
                    final IMessengerManager iMessengerManager = iterator2.next();
                    iMessengerManager.channelUpdated(channel);
                }
            }
            else {
                Notifications.INSTANCE.push("Error adding player", "An unexpected error has occurred. Try again.");
            }
        });
    }
    
    public void removePlayerFromChannel(final long channelId, @NotNull final UUID player) {
        final Channel channel = this.channels.get(channelId);
        if (channel == null) {
            Notifications.INSTANCE.push("Error removing player", "Channel does not exist");
            return;
        }
        if (channel.getType() != ChannelType.GROUP_DIRECT_MESSAGE) {
            Notifications.INSTANCE.push("Error removing player", "Channel is not a group DM");
            return;
        }
        if (!channel.getMembers().contains(player)) {
            Notifications.INSTANCE.push("Error removing player", "User is not in group.");
            return;
        }
        this.connectionManager.send(new ChatChannelMemberRemovePacket(channelId, new UUID[] { player }), maybePacket -> {
            final Packet packet = maybePacket.orElse(null);
            if (packet instanceof final ServerChannelMemberActionResponsePacket serverChannelMemberActionResponsePacket) {
                serverChannelMemberActionResponsePacket.getResults().entrySet().iterator();
                final Iterator iterator;
                while (iterator.hasNext()) {
                    final Map.Entry<UUID, Boolean> entry = iterator.next();
                    final UUID uuid = entry.getKey();
                    if (entry.getValue()) {
                        if (uuid.equals(UUIDUtil.getClientUUID())) {
                            this.removeChannel(channelId);
                            return;
                        }
                        else {
                            channel.getMembers().remove(uuid);
                        }
                    }
                    else {
                        UUIDUtil.getName(uuid).thenAccept(name -> Notifications.INSTANCE.push("Error removing player", "Failed to remove " + name + " from group."));
                    }
                }
                this.getCallbacks().iterator();
                final Iterator iterator2;
                while (iterator2.hasNext()) {
                    final IMessengerManager iMessengerManager = iterator2.next();
                    iMessengerManager.channelUpdated(channel);
                }
            }
            else {
                Notifications.INSTANCE.push("Error removing player", "An unexpected error has occurred. Try again.");
            }
        });
    }
    
    public void retrieveMessageHistory(final long channelId, @Nullable final Long before, @Nullable final Long after, @Nullable final Consumer<Optional<Packet>> callback) {
        this.retrieveMessageHistory(channelId, before, after, 50, callback);
    }
    
    public void retrieveMessageHistory(final long channelId, final Long before, final Long after, final int messageLimit, @Nullable final Consumer<Optional<Packet>> callback) {
        if (!this.channels.containsKey(channelId)) {
            Essential.logger.error("Attempted to request message history for a channel that is not locally cached!");
            return;
        }
        this.connectionManager.send(new ClientChatChannelMessagesRetrievePacket(channelId, before, after, messageLimit), response -> {
            final Packet packet = response.orElse(null);
            if (packet instanceof final ServerChatChannelMessagePacket serverChatChannelMessagePacket) {
                final boolean isEmpty = serverChatChannelMessagePacket.getMessages().length == 0;
                if (before == null && after == null && isEmpty) {
                    this.channelMessages.putIfAbsent(channelId, Maps.newConcurrentMap());
                }
            }
            if (callback != null) {
                callback.accept(response);
            }
        });
    }
    
    public void retrieveRecentMessageHistory(final long channelId, @Nullable final Consumer<Optional<Packet>> callback) {
        this.retrieveRecentMessageHistory(channelId, 50, callback);
    }
    
    public void retrieveRecentMessageHistory(final long channelId, final int messageLimit, @Nullable final Consumer<Optional<Packet>> callback) {
        this.retrieveMessageHistory(channelId, null, null, messageLimit, callback);
    }
    
    public void updateMutedState(@NotNull final Channel channel, final boolean muted) {
        this.mutedStateUpdateQueue.enqueue(new ClientChatChannelMutePacket(channel.getId(), muted), response -> {
            final Packet packet = response.orElse(null);
            final boolean success = packet instanceof ResponseActionPacket && ((ResponseActionPacket)packet).isSuccessful();
            if (success) {
                channel.setMuted(muted);
            }
            else {
                Notifications.INSTANCE.push("Error updating channel", "Failed to save mute state.");
            }
            this.getCallbacks().iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                final IMessengerManager iMessengerManager = iterator.next();
                iMessengerManager.channelUpdated(channel);
            }
        });
    }
    
    public void fileReport(final long channelId, final long messageId, final String reason) {
        this.mutedStateUpdateQueue.enqueue(new ClientChatChannelMessageReportPacket(channelId, messageId, reason), response -> {
            final Packet packet = response.orElse(null);
            if (packet instanceof ServerChatChannelMessageReportPacket) {
                Notifications.INSTANCE.push("Report", "Your report has been submitted.");
            }
            else {
                Notifications.INSTANCE.push("Report", "An error occurred while submitting the report. Please contact support if issues persist.");
            }
        });
    }
    
    private void updateUnreadMessageCount() {
        int unreadMessages = 0;
        for (final ConcurrentMap<Long, Message> value : this.channelMessages.values()) {
            for (final Message message : value.values()) {
                if (!message.isRead()) {
                    ++unreadMessages;
                }
            }
        }
        this.unreadMessageCount.set(unreadMessages);
    }
    
    public void updateReadState(final Message message, final boolean read) {
        if (message.isRead() == read) {
            return;
        }
        message.setRead(read);
        this.updateUnreadMessageCount();
        this.connectionManager.send(new ClientChatChannelMessageReadStatePacket(message.getChannelId(), message.getId(), read));
    }
    
    public State<Integer> getUnreadMessageCount() {
        return new WeakState<Integer>(this.unreadMessageCount);
    }
    
    public void membersAdded(final long channelId, final UUID[] members) {
        final Optional<Channel> channelOptional = this.getChannel(channelId);
        if (!channelOptional.isPresent()) {
            return;
        }
        final Channel channel = channelOptional.get();
        channel.getMembers().addAll(Arrays.asList(members));
        for (final IMessengerManager manager : this.getCallbacks()) {
            manager.channelUpdated(channel);
        }
    }
    
    public void membersRemoved(final long channelId, final UUID[] members) {
        final Optional<Channel> channelOptional = this.getChannel(channelId);
        if (!channelOptional.isPresent()) {
            return;
        }
        final Channel channel = channelOptional.get();
        final List<UUID> list = Arrays.asList(members);
        final Set members2 = channel.getMembers();
        Objects.requireNonNull(members2);
        list.forEach(members2::remove);
        for (final IMessengerManager manager : this.getCallbacks()) {
            manager.channelUpdated(channel);
        }
    }
    
    @Nullable
    public Message getMessageById(final long messageId) {
        return this.messageMap.get(messageId);
    }
    
    @Nullable
    private Long getOldestLoadedMessageId(final long channel) {
        final Map<Long, Message> messages = this.getMessages(channel);
        if (messages == null) {
            return null;
        }
        final Optional<Message> min = messages.values().stream().min(Comparator.comparingLong(value -> MessageUtils.INSTANCE.getSentTimeStamp(value.getId())));
        return min.map((Function<? super Message, ? extends Long>)Message::getId).orElse(null);
    }
    
    public void retrieveChannelHistoryUntil(final MessageRef ref) {
        if (ref.getMessageId() == -1L) {
            throw new IllegalArgumentException("Cannot request channel history for a deleted message");
        }
        if (ref.isInitialized()) {
            return;
        }
        final Message messageById = this.getMessageById(ref.getMessageId());
        if (messageById != null) {
            ref.supplyValue(ClientMessage.Companion.fromNetwork(messageById));
            return;
        }
        this.channelEagerMessageResolverMap.computeIfAbsent(ref.getChannelId(), x$0 -> new ChatManager.EagerMessageResolver(this, x$0)).resolve(ref);
    }
    
    private /* synthetic */ ChatManager.EagerMessageResolver lambda$retrieveChannelHistoryUntil$12(final long x$0) {
        return new ChatManager.EagerMessageResolver(this, x$0);
    }
    
    private static /* synthetic */ long lambda$getOldestLoadedMessageId$11(final Message value) {
        return MessageUtils.INSTANCE.getSentTimeStamp(value.getId());
    }
    
    private static /* synthetic */ void lambda$fileReport$10(final Optional response) {
        final Packet packet = response.orElse(null);
        if (packet instanceof ServerChatChannelMessageReportPacket) {
            Notifications.INSTANCE.push("Report", "Your report has been submitted.");
        }
        else {
            Notifications.INSTANCE.push("Report", "An error occurred while submitting the report. Please contact support if issues persist.");
        }
    }
    
    private /* synthetic */ void lambda$updateMutedState$9(final Channel channel, final boolean muted, final Optional response) {
        final Packet packet = response.orElse(null);
        final boolean success = packet instanceof ResponseActionPacket && ((ResponseActionPacket)packet).isSuccessful();
        if (success) {
            channel.setMuted(muted);
        }
        else {
            Notifications.INSTANCE.push("Error updating channel", "Failed to save mute state.");
        }
        for (final IMessengerManager iMessengerManager : this.getCallbacks()) {
            iMessengerManager.channelUpdated(channel);
        }
    }
    
    private /* synthetic */ void lambda$retrieveMessageHistory$8(final Long before, final Long after, final long channelId, final Consumer callback, final Optional response) {
        final Packet packet = response.orElse(null);
        if (packet instanceof final ServerChatChannelMessagePacket serverChatChannelMessagePacket) {
            final boolean isEmpty = serverChatChannelMessagePacket.getMessages().length == 0;
            if (before == null && after == null && isEmpty) {
                this.channelMessages.putIfAbsent(channelId, Maps.newConcurrentMap());
            }
        }
        if (callback != null) {
            callback.accept(response);
        }
    }
    
    private /* synthetic */ void lambda$removePlayerFromChannel$7(final long channelId, final Channel channel, final Optional maybePacket) {
        final Packet packet = maybePacket.orElse(null);
        if (packet instanceof final ServerChannelMemberActionResponsePacket serverChannelMemberActionResponsePacket) {
            for (final Map.Entry<UUID, Boolean> entry : serverChannelMemberActionResponsePacket.getResults().entrySet()) {
                final UUID uuid = entry.getKey();
                if (entry.getValue()) {
                    if (uuid.equals(UUIDUtil.getClientUUID())) {
                        this.removeChannel(channelId);
                        return;
                    }
                    channel.getMembers().remove(uuid);
                }
                else {
                    UUIDUtil.getName(uuid).thenAccept(name -> Notifications.INSTANCE.push("Error removing player", "Failed to remove " + name + " from group."));
                }
            }
            for (final IMessengerManager iMessengerManager : this.getCallbacks()) {
                iMessengerManager.channelUpdated(channel);
            }
        }
        else {
            Notifications.INSTANCE.push("Error removing player", "An unexpected error has occurred. Try again.");
        }
    }
    
    private static /* synthetic */ void lambda$removePlayerFromChannel$6(final String name) {
        Notifications.INSTANCE.push("Error removing player", "Failed to remove " + name + " from group.");
    }
    
    private /* synthetic */ void lambda$addPlayersToChannel$5(final Channel channel, final Optional maybePacket) {
        final Packet packet = maybePacket.orElse(null);
        if (packet instanceof final ServerChannelMemberActionResponsePacket serverChannelMemberActionResponsePacket) {
            for (final Map.Entry<UUID, Boolean> entry : serverChannelMemberActionResponsePacket.getResults().entrySet()) {
                final UUID uuid = entry.getKey();
                if (entry.getValue()) {
                    channel.getMembers().add(uuid);
                }
                else {
                    UUIDUtil.getName(uuid).thenAccept(name -> Notifications.INSTANCE.push("Error adding player", "Failed to adding " + name + " to group."));
                }
            }
            for (final IMessengerManager iMessengerManager : this.getCallbacks()) {
                iMessengerManager.channelUpdated(channel);
            }
        }
        else {
            Notifications.INSTANCE.push("Error adding player", "An unexpected error has occurred. Try again.");
        }
    }
    
    private static /* synthetic */ void lambda$addPlayersToChannel$4(final String name) {
        Notifications.INSTANCE.push("Error adding player", "Failed to adding " + name + " to group.");
    }
    
    private /* synthetic */ void lambda$updateChannelInformation$3(final long channelId, final ChatChannelUpdatePacket update, final Optional responseOptional) {
        final Packet packet = responseOptional.orElse(null);
        if (!(packet instanceof ResponseActionPacket) || !((ResponseActionPacket)packet).isSuccessful()) {
            Notifications.INSTANCE.push("Error updating channel", "An unexpected error has occurred. Try again.");
            return;
        }
        this.setChannelInfo(channelId, update.getName(), update.getTopic());
    }
    
    private static /* synthetic */ void lambda$createGroupDM$2(final Consumer callback, final Optional response) {
        Optional<Channel> channel;
        if (!response.isPresent()) {
            Notifications.INSTANCE.push("Error", "A timeout occurred please try again");
            channel = Optional.empty();
        }
        else if (response.get() instanceof ServerChatChannelAddPacket) {
            channel = response.get().getChannels().stream().findFirst();
        }
        else {
            Notifications.INSTANCE.push("Error", "An unexpected error occurred");
            channel = Optional.empty();
        }
        if (callback != null) {
            callback.accept(channel);
        }
    }
    
    private static /* synthetic */ void lambda$addChannel$1(final Optional packet) {
        ServerChatChannelMessagePacketHandler.prefetching.decrementAndGet();
    }
    
    private static /* synthetic */ void lambda$addChannel$0(final Optional packet) {
        ServerChatChannelMessagePacketHandler.prefetching.decrementAndGet();
    }
}
