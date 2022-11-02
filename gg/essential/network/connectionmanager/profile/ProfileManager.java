package gg.essential.network.connectionmanager.profile;

import gg.essential.gui.friends.state.*;
import gg.essential.network.connectionmanager.subscription.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.enums.*;
import gg.essential.profiles.model.*;
import com.google.common.collect.*;
import gg.essential.elementa.state.*;
import gg.essential.network.connectionmanager.queue.*;
import gg.essential.network.connectionmanager.handler.*;
import gg.essential.network.connectionmanager.handler.profile.*;
import gg.essential.connectionmanager.common.packet.profile.trustedhosts.*;
import gg.essential.network.connectionmanager.handler.profile.trustedhosts.*;
import gg.essential.data.*;
import gg.essential.lib.gson.*;
import org.jetbrains.annotations.*;
import gg.essential.config.*;
import gg.essential.gui.notification.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.api.utils.*;
import java.util.concurrent.*;
import java.util.*;
import gg.essential.gui.multiplayer.*;
import gg.essential.connectionmanager.common.packet.profile.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.gui.common.*;
import java.util.stream.*;
import gg.essential.gui.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import gg.essential.api.gui.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.friends.*;
import com.sparkuniverse.toolbox.chat.model.*;
import com.sparkuniverse.toolbox.chat.enums.*;
import gg.essential.util.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.gui.friends.previews.*;

public class ProfileManager extends StateCallbackManager<IStatusManager> implements NetworkedManager, SubscriptionManager.Listener
{
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final Map<UUID, ProfileStatus> statuses;
    @NotNull
    private final Map<UUID, Pair<ActivityType, String>> activities;
    @NotNull
    private final Map<String, TrustedHost> trustedHosts;
    @NotNull
    private final PacketQueue updateQueue;
    @NotNull
    private final State<Set<String>> trustedHostsState;
    @NotNull
    private final State<Set<String>> userTrustedHostsState;
    private boolean loadedDefaultTrustedHosts;
    
    public ProfileManager(@NotNull final ConnectionManager connectionManager) {
        super();
        this.statuses = (Map<UUID, ProfileStatus>)Maps.newConcurrentMap();
        this.activities = (Map<UUID, Pair<ActivityType, String>>)Maps.newConcurrentMap();
        this.trustedHosts = (Map<String, TrustedHost>)Maps.newConcurrentMap();
        this.trustedHostsState = new BasicState<Set<String>>(new HashSet<String>());
        this.userTrustedHostsState = new BasicState<Set<String>>(new HashSet<String>());
        this.loadedDefaultTrustedHosts = false;
        this.connectionManager = connectionManager;
        this.updateQueue = new SequentialPacketQueue.Builder(connectionManager).onTimeoutSkip().create();
        connectionManager.registerPacketHandler(ServerProfileActivityPacket.class, new ServerProfileActivityPacketHandler());
        connectionManager.registerPacketHandler(ServerProfileStatusPacket.class, new ServerProfileStatusPacketHandler());
        connectionManager.registerPacketHandler(ServerProfileTrustedHostsClearPacket.class, new ServerProfileTrustedHostsClearPacketHandler());
        connectionManager.registerPacketHandler(ServerProfileTrustedHostsPopulatePacket.class, new ServerProfileTrustedHostsPopulatePacketHandler());
        connectionManager.registerPacketHandler(ServerProfileTrustedHostsRemovePacket.class, new ServerProfileTrustedHostsRemovePacketHandler());
    }
    
    @NotNull
    public Map<UUID, Pair<ActivityType, String>> getActivities() {
        return this.activities;
    }
    
    @NotNull
    public synchronized Map<String, TrustedHost> getTrustedHosts() {
        if (!OnboardingData.hasAcceptedTos() && !this.loadedDefaultTrustedHosts) {
            this.loadedDefaultTrustedHosts = true;
            try {
                final Gson gson = this.connectionManager.getConnection().getGson();
                final String trustedHostURL = "https://api.essential.gg/v2/trusted_hosts";
                final TrustedHost[] array;
                final TrustedHost[] trustedHosts = array = gson.fromJson(WebUtil.fetchString(trustedHostURL), TrustedHost[].class);
                for (final TrustedHost trustedHost : array) {
                    this.addTrustedHost(trustedHost);
                }
            }
            catch (final JsonParseException e) {
                e.printStackTrace();
            }
        }
        return this.trustedHosts;
    }
    
    @NotNull
    public ProfileStatus getStatus(@NotNull final UUID uuid) {
        return this.getStatusIfLoaded(uuid).orElse(ProfileStatus.OFFLINE);
    }
    
    @NotNull
    public Optional<ProfileStatus> getStatusIfLoaded(@NotNull final UUID uuid) {
        return Optional.ofNullable(this.statuses.get(uuid));
    }
    
    @NotNull
    public Optional<Pair<ActivityType, String>> getActivity(@NotNull final UUID uuid) {
        return Optional.ofNullable(this.activities.get(uuid));
    }
    
    public void setPlayerStatus(@NotNull final UUID uuid, @Nullable final ProfileStatus status) {
        if (status == null) {
            this.removePlayerStatus(uuid);
            return;
        }
        final ProfileStatus put = this.statuses.put(uuid, status);
        if (put == ProfileStatus.OFFLINE && status == ProfileStatus.ONLINE && this.connectionManager.getRelationshipManager().isFriend(uuid) && EssentialConfig.INSTANCE.getFriendConnectionStatus()) {
            UUIDUtil.getName(uuid).thenAcceptAsync(s -> Notifications.INSTANCE.push("", s + " is now online!", 4.0f, (Function0<Unit>)(() -> {
                final SocialMenu gui = SocialMenu.getInstance();
                Channel channel = null;
                for (final Channel value : this.connectionManager.getChatManager().getChannels().values()) {
                    if (value.getType() == ChannelType.DIRECT_MESSAGE && value.getMembers().contains(uuid)) {
                        channel = value;
                        break;
                    }
                }
                if (gui == null) {
                    GuiUtil.INSTANCE.openScreen(new SocialMenu((channel == null) ? null : Long.valueOf(channel.getId())));
                }
                else if (channel != null) {
                    final ChannelPreview cbp = gui.getChatTab().get(channel.getId());
                    if (cbp != null) {
                        gui.openMessageScreen(cbp);
                    }
                }
                return Unit.INSTANCE;
            }), (Function0<Unit>)(() -> Unit.INSTANCE), (Function1<? super NotificationBuilder, Unit>)(notificationBuilder -> {
                final UIContainer profileIcon = new UIContainer();
                profileIcon.getConstraints().setWidth(new PixelConstraint(9.0f));
                profileIcon.getConstraints().setHeight(new PixelConstraint(10.0f));
                final UIBlock shadow = new UIBlock(EssentialPalette.MODAL_OUTLINE);
                shadow.getConstraints().setX(new PixelConstraint(1.0f));
                shadow.getConstraints().setY(new PixelConstraint(1.0f));
                shadow.getConstraints().setWidth(new PixelConstraint(8.0f));
                shadow.getConstraints().setHeight(new AspectConstraint());
                shadow.setChildOf(profileIcon);
                final UIImage image = CachedAvatarImage.ofUUID(uuid);
                image.getConstraints().setWidth(new PixelConstraint(8.0f));
                image.getConstraints().setHeight(new AspectConstraint());
                image.setChildOf(profileIcon);
                notificationBuilder.withCustomComponent(Slot.PREVIEW, profileIcon);
                return Unit.INSTANCE;
            })), (Executor)Multithreading.getPool());
        }
        for (final IStatusManager statusManager : this.getCallbacks()) {
            statusManager.refreshActivity(uuid);
        }
    }
    
    public void setPlayerActivity(@NotNull final UUID uuid, @Nullable final ActivityType activityType, @Nullable final String metadata) {
        if (activityType == null || metadata == null) {
            if (this.connectionManager.getSocialManager().getIncomingServerInvite(uuid).isPresent()) {
                this.connectionManager.getSocialManager().removeIncomingServerInvite(uuid);
            }
            this.removePlayerActivity(uuid);
            return;
        }
        this.activities.put(uuid, (Pair<ActivityType, String>)new Pair((Object)activityType, (Object)metadata));
        for (final IStatusManager statusManager : this.getCallbacks()) {
            statusManager.refreshActivity(uuid);
        }
        final EssentialMultiplayerGui gui = EssentialMultiplayerGui.getInstance();
        if (gui != null) {
            gui.updatePlayerActivity(uuid);
        }
    }
    
    public void updatePlayerActivity(@Nullable final ActivityType activityType, @Nullable final String metadata) {
        this.setPlayerActivity(UUIDUtil.getClientUUID(), activityType, metadata);
        this.updateQueue.enqueue(new ClientProfileActivityPacket(activityType, metadata));
    }
    
    public void addTrustedHost(@NotNull final TrustedHost trustedHost) {
        this.trustedHosts.put(trustedHost.getId(), trustedHost);
        this.updateTrustedHostState();
    }
    
    private void updateTrustedHostState() {
        this.trustedHostsState.set(this.trustedHosts.values().stream().flatMap(trustedHost -> trustedHost.getDomains().stream()).collect((Collector<? super Object, ?, Set<String>>)Collectors.toSet()));
        this.userTrustedHostsState.set(this.trustedHosts.values().stream().filter(trustedHost -> trustedHost.getProfileId() != null).flatMap(trustedHost -> trustedHost.getDomains().stream()).collect((Collector<? super Object, ?, Set<String>>)Collectors.toSet()));
    }
    
    public void removePlayerStatus(@NotNull final UUID uuid) {
        this.statuses.remove(uuid);
        for (final IStatusManager statusManager : this.getCallbacks()) {
            statusManager.refreshActivity(uuid);
        }
    }
    
    public void removePlayerActivity(@NotNull final UUID uuid) {
        this.activities.remove(uuid);
        final EssentialMultiplayerGui gui = EssentialMultiplayerGui.getInstance();
        if (gui != null) {
            gui.updatePlayerActivity(uuid);
        }
        for (final IStatusManager statusManager : this.getCallbacks()) {
            statusManager.refreshActivity(uuid);
        }
    }
    
    public void removeTrustedHost(@NotNull final String id) {
        this.trustedHosts.remove(id);
        this.updateTrustedHostState();
    }
    
    public void clearTrustedHosts() {
        this.trustedHosts.clear();
        this.updateTrustedHostState();
    }
    
    @Override
    public void onConnected() {
        final Optional<Pair<ActivityType, String>> clientActivity = this.getActivity(UUIDUtil.getClientUUID());
        this.resetState();
        clientActivity.ifPresent(activity -> this.updatePlayerActivity((ActivityType)activity.getFirst(), (String)activity.getSecond()));
    }
    
    @Override
    public void resetState() {
        this.updateQueue.reset();
        this.trustedHosts.clear();
        this.activities.clear();
        this.statuses.clear();
        this.updateTrustedHostState();
    }
    
    @Override
    public void onSubscriptionRemoved(@NotNull final Set<UUID> uuids) {
        for (final UUID uuid : uuids) {
            if (!this.connectionManager.getRelationshipManager().isFriend(uuid)) {
                this.removePlayerActivity(uuid);
            }
        }
    }
    
    public WeakState<Set<String>> getTrustedHostsState() {
        return new WeakState<Set<String>>(this.trustedHostsState);
    }
    
    public WeakState<Set<String>> getUserTrustedHostsState() {
        return new WeakState<Set<String>>(this.userTrustedHostsState);
    }
    
    private /* synthetic */ void lambda$onConnected$8(final Pair activity) {
        this.updatePlayerActivity((ActivityType)activity.getFirst(), (String)activity.getSecond());
    }
    
    private static /* synthetic */ Stream lambda$updateTrustedHostState$7(final TrustedHost trustedHost) {
        return trustedHost.getDomains().stream();
    }
    
    private static /* synthetic */ boolean lambda$updateTrustedHostState$6(final TrustedHost trustedHost) {
        return trustedHost.getProfileId() != null;
    }
    
    private static /* synthetic */ Stream lambda$updateTrustedHostState$5(final TrustedHost trustedHost) {
        return trustedHost.getDomains().stream();
    }
    
    private /* synthetic */ void lambda$setPlayerStatus$4(final UUID uuid, final String s) {
        Notifications.INSTANCE.push("", s + " is now online!", 4.0f, (Function0<Unit>)(() -> {
            final SocialMenu gui = SocialMenu.getInstance();
            Channel channel = null;
            for (final Channel value : this.connectionManager.getChatManager().getChannels().values()) {
                if (value.getType() == ChannelType.DIRECT_MESSAGE && value.getMembers().contains(uuid)) {
                    channel = value;
                    break;
                }
            }
            if (gui == null) {
                GuiUtil.INSTANCE.openScreen(new SocialMenu((channel == null) ? null : Long.valueOf(channel.getId())));
            }
            else if (channel != null) {
                final ChannelPreview cbp = gui.getChatTab().get(channel.getId());
                if (cbp != null) {
                    gui.openMessageScreen(cbp);
                }
            }
            return Unit.INSTANCE;
        }), (Function0<Unit>)(() -> Unit.INSTANCE), (Function1<? super NotificationBuilder, Unit>)(notificationBuilder -> {
            final UIContainer profileIcon = new UIContainer();
            profileIcon.getConstraints().setWidth(new PixelConstraint(9.0f));
            profileIcon.getConstraints().setHeight(new PixelConstraint(10.0f));
            final UIBlock shadow = new UIBlock(EssentialPalette.MODAL_OUTLINE);
            shadow.getConstraints().setX(new PixelConstraint(1.0f));
            shadow.getConstraints().setY(new PixelConstraint(1.0f));
            shadow.getConstraints().setWidth(new PixelConstraint(8.0f));
            shadow.getConstraints().setHeight(new AspectConstraint());
            shadow.setChildOf(profileIcon);
            final UIImage image = CachedAvatarImage.ofUUID(uuid);
            image.getConstraints().setWidth(new PixelConstraint(8.0f));
            image.getConstraints().setHeight(new AspectConstraint());
            image.setChildOf(profileIcon);
            notificationBuilder.withCustomComponent(Slot.PREVIEW, profileIcon);
            return Unit.INSTANCE;
        }));
    }
    
    private static /* synthetic */ Unit lambda$setPlayerStatus$2(final UUID uuid, final NotificationBuilder notificationBuilder) {
        final UIContainer profileIcon = new UIContainer();
        profileIcon.getConstraints().setWidth(new PixelConstraint(9.0f));
        profileIcon.getConstraints().setHeight(new PixelConstraint(10.0f));
        final UIBlock shadow = new UIBlock(EssentialPalette.MODAL_OUTLINE);
        shadow.getConstraints().setX(new PixelConstraint(1.0f));
        shadow.getConstraints().setY(new PixelConstraint(1.0f));
        shadow.getConstraints().setWidth(new PixelConstraint(8.0f));
        shadow.getConstraints().setHeight(new AspectConstraint());
        shadow.setChildOf(profileIcon);
        final UIImage image = CachedAvatarImage.ofUUID(uuid);
        image.getConstraints().setWidth(new PixelConstraint(8.0f));
        image.getConstraints().setHeight(new AspectConstraint());
        image.setChildOf(profileIcon);
        notificationBuilder.withCustomComponent(Slot.PREVIEW, profileIcon);
        return Unit.INSTANCE;
    }
    
    private static /* synthetic */ Unit lambda$setPlayerStatus$1() {
        return Unit.INSTANCE;
    }
    
    private /* synthetic */ Unit lambda$setPlayerStatus$0(final UUID uuid) {
        final SocialMenu gui = SocialMenu.getInstance();
        Channel channel = null;
        for (final Channel value : this.connectionManager.getChatManager().getChannels().values()) {
            if (value.getType() == ChannelType.DIRECT_MESSAGE && value.getMembers().contains(uuid)) {
                channel = value;
                break;
            }
        }
        if (gui == null) {
            GuiUtil.INSTANCE.openScreen(new SocialMenu((channel == null) ? null : Long.valueOf(channel.getId())));
        }
        else if (channel != null) {
            final ChannelPreview cbp = gui.getChatTab().get(channel.getId());
            if (cbp != null) {
                gui.openMessageScreen(cbp);
            }
        }
        return Unit.INSTANCE;
    }
}
