package gg.essential.network.connectionmanager.sps;

import gg.essential.gui.friends.state.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.upnp.model.*;
import org.jetbrains.annotations.*;
import gg.essential.sps.*;
import java.time.*;
import com.google.common.collect.*;
import gg.essential.network.connectionmanager.queue.*;
import gg.essential.network.connectionmanager.handler.*;
import gg.essential.network.connectionmanager.handler.upnp.*;
import gg.essential.upnp.*;
import gg.essential.gui.notification.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.client.*;
import gg.essential.gui.multiplayer.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.universal.*;
import net.minecraft.client.util.*;
import gg.essential.*;
import gg.essential.handlers.*;
import net.minecraft.client.network.*;
import gg.essential.config.*;
import gg.essential.commands.*;
import java.util.concurrent.*;
import net.minecraft.server.integrated.*;
import com.sparkuniverse.toolbox.util.*;
import gg.essential.util.*;
import gg.essential.connectionmanager.common.packet.upnp.*;
import kotlin.collections.*;
import com.mojang.authlib.*;
import gg.essential.mixins.transformers.server.integrated.*;
import net.minecraft.server.network.*;
import net.minecraft.client.resource.language.*;
import gg.essential.universal.wrappers.message.*;
import net.minecraft.text.*;
import gg.essential.event.network.server.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.data.*;
import net.minecraft.world.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import net.minecraft.server.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.state.*;
import gg.essential.event.sps.*;

public class SPSManager extends StateCallbackManager<IStatusManager> implements NetworkedManager
{
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final PacketQueue updateQueue;
    @NotNull
    private final Object whitelistSemaphore;
    @NotNull
    private final Map<UUID, UPnPSession> remoteSessions;
    @Nullable
    private CompletableFuture<Boolean> startFuture;
    @NotNull
    private SPSState localState;
    @Nullable
    private UPnPSession localSession;
    private GameMode currentGameMode;
    private boolean allowCheats;
    private Difficulty difficulty;
    @Nullable
    private String serverStatusResponse;
    private final Set<UUID> oppedPlayers;
    private final Map<UUID, State<Boolean>> onlinePlayerStates;
    private String error;
    private boolean shareResourcePack;
    @Nullable
    private ResourcePackSharingHttpServer.PackInfo packInfo;
    private String resourcePackUrl;
    private String resourcePackChecksum;
    private Instant sessionStartTime;
    
    public SPSManager(@NotNull final ConnectionManager connectionManager) {
        super();
        this.whitelistSemaphore = new Object();
        this.remoteSessions = (Map<UUID, UPnPSession>)Maps.newConcurrentMap();
        this.localState = SPSState.INACTIVE;
        this.oppedPlayers = new HashSet<UUID>();
        this.onlinePlayerStates = new HashMap<UUID, State<Boolean>>();
        this.shareResourcePack = false;
        this.resourcePackUrl = null;
        this.resourcePackChecksum = null;
        this.sessionStartTime = Instant.now();
        this.connectionManager = connectionManager;
        this.updateQueue = new SequentialPacketQueue.Builder(connectionManager).onTimeoutRetransmit().create();
        connectionManager.registerPacketHandler(ServerUPnPSessionInviteAddPacket.class, new ServerUPnPSessionInviteAddPacketHandler());
        connectionManager.registerPacketHandler(ServerUPnPSessionPopulatePacket.class, new ServerUPnPSessionPopulatePacketHandler());
        connectionManager.registerPacketHandler(ServerUPnPSessionRemovePacket.class, new ServerUPnPSessionRemovePacketHandler());
        Runtime.getRuntime().addShutdownHook(new Thread(this::closeLocalSession));
    }
    
    @NotNull
    public String getSpsAddress(@NotNull final UUID hostUUID) {
        return hostUUID.toString() + ".essential-sps";
    }
    
    public GameMode getCurrentGameMode() {
        return this.currentGameMode;
    }
    
    public boolean isAllowCheats() {
        return this.allowCheats;
    }
    
    public boolean isSpsAddress(final String address) {
        return address.endsWith(".essential-sps");
    }
    
    @Nullable
    public UUID getHostFromSpsAddress(@NotNull String address) {
        if (!address.endsWith(".essential-sps")) {
            return null;
        }
        address = address.substring(0, address.length() - ".essential-sps".length());
        try {
            return UUID.fromString(address);
        }
        catch (final IllegalArgumentException ex) {
            return null;
        }
    }
    
    @Nullable
    public UPnPSession getSessionFromSpsAddress(@NotNull final String address) {
        final UUID hostUUID = this.getHostFromSpsAddress(address);
        if (hostUUID == null) {
            return null;
        }
        return this.getRemoteSession(hostUUID);
    }
    
    @Nullable
    public UPnPSession getRemoteSession(final UUID hostUUID) {
        return this.remoteSessions.get(hostUUID);
    }
    
    @NotNull
    public Collection<UPnPSession> getRemoteSessions() {
        return Collections.unmodifiableCollection((Collection<? extends UPnPSession>)this.remoteSessions.values());
    }
    
    public void addRemoteSession(@NotNull final UPnPSession session) {
        final UPnPSession previousSession = this.remoteSessions.put(session.getHostUUID(), session);
        if ((previousSession == null && session.getPrivacy() == UPnPPrivacy.FRIENDS) || (previousSession != null && previousSession.getPrivacy() != UPnPPrivacy.FRIENDS && session.getPrivacy() == UPnPPrivacy.FRIENDS)) {
            UUIDUtil.getName(session.getHostUUID()).thenAcceptAsync(hostName -> Notifications.INSTANCE.push("World Invite", hostName + " has started a world for all friends. Click here to join!", (Function0<Unit>)(() -> {
                MinecraftUtils.INSTANCE.connectToServer(hostName, this.getSpsAddress(session.getHostUUID()));
                return Unit.INSTANCE;
            })), ExtensionsKt.getExecutor(MinecraftClient.getInstance()));
        }
        final EssentialMultiplayerGui gui = EssentialMultiplayerGui.getInstance();
        if (gui != null) {
            gui.updateSpsSessions();
        }
        for (final IStatusManager manager : this.getCallbacks()) {
            manager.refreshActivity(session.getHostUUID());
        }
    }
    
    public void removeRemoteSession(@NotNull final UUID hostUUID) {
        this.remoteSessions.remove(hostUUID);
        for (final IStatusManager manager : this.getCallbacks()) {
            manager.refreshActivity(hostUUID);
        }
    }
    
    @NotNull
    public Set<UUID> getInvitedUsers() {
        final UPnPSession session = this.localSession;
        return (session != null) ? session.getInvites() : Collections.emptySet();
    }
    
    public synchronized void updateInvitedUsers(Set<UUID> invited) {
        if (this.localSession == null) {
            throw new IllegalStateException("Cannot update invites while no session is active.");
        }
        invited = Collections.unmodifiableSet((Set<? extends UUID>)new HashSet<UUID>(invited));
        final Set<UUID> removed = SetsKt.minus((Set)this.localSession.getInvites(), (Iterable)invited);
        final Set<UUID> added = SetsKt.minus((Set)invited, (Iterable)this.localSession.getInvites());
        if (!removed.isEmpty()) {
            this.updateQueue.enqueue(new ClientUPnPSessionInvitesRemovePacket(removed));
        }
        if (!added.isEmpty()) {
            this.updateQueue.enqueue(new ClientUPnPSessionInvitesAddPacket(added));
        }
        this.localSession = new UPnPSession(this.localSession.getHostUUID(), this.localSession.getIp(), this.localSession.getPort(), this.localSession.getPrivacy(), invited, this.localSession.getCreatedAt());
        Multithreading.runAsync(this::refreshWhitelist);
        this.persistSettings();
    }
    
    @NotNull
    public SPSState getLocalState() {
        return this.localState;
    }
    
    @Nullable
    public UPnPSession getLocalSession() {
        return this.localSession;
    }
    
    public Difficulty getDifficulty() {
        return this.difficulty;
    }
    
    public Instant getSessionStartTime() {
        return this.sessionStartTime;
    }
    
    public synchronized CompletableFuture<Boolean> startLocalSession$2636050f(@NotNull final GameMode gameMode, final Difficulty difficulty, final UPnPPrivacy privacy) {
        final CompletableFuture<Boolean> inProgressFuture = this.startFuture;
        if (inProgressFuture != null) {
            return inProgressFuture;
        }
        this.sessionStartTime = Instant.now();
        this.currentGameMode = gameMode;
        this.allowCheats = false;
        this.difficulty = difficulty;
        this.localState = SPSState.OPENING;
        this.updateOppedPlayers(SetsKt.plus((Set)this.oppedPlayers, (Object)UUIDUtil.getClientUUID()), false, false);
        final ResourcePackSharingHttpServer instance = ResourcePackSharingHttpServer.INSTANCE;
        Objects.requireNonNull(instance);
        Multithreading.runAsync(instance::startServer);
        this.updateResourcePack(this.packInfo);
        return this.startFuture = CompletableFuture.supplyAsync(() -> {
            final IntegratedServer server = UMinecraft.getMinecraft().getServer();
            if (server == null) {
                return Boolean.valueOf(false);
            }
            else {
                server.method_3760().setWhitelistEnabled(true);
                server.method_3776(difficulty, true);
                final int port = NetworkUtils.findLocalPort();
                if (!server.method_3763(gameMode, allowCheats, port)) {
                    this.error = "Unable to start LAN server.";
                    return Boolean.valueOf(false);
                }
                else {
                    int voicePort = port;
                    if (ModLoaderUtil.INSTANCE.isModLoaded("plasmo_voice")) {
                        voicePort = 60606;
                    }
                    this.connectionManager.getIceManager().setVoicePort(voicePort);
                    Essential.logger.info("UPnP Init on port: {}", (Object)port);
                    final UPnPWrapper.UPnPStatus status = UPnPWrapper.openOnPort(port);
                    if (status == UPnPWrapper.UPnPStatus.UNAVAILABLE) {
                        this.error = "Failed to open UPnP. Your current router does not yet support it.";
                        return Boolean.valueOf(false);
                    }
                    else if (status == UPnPWrapper.UPnPStatus.FAILED) {
                        this.error = "Failed to open UPnP. If issues persist contact support.";
                        return Boolean.valueOf(false);
                    }
                    else {
                        this.updateLocalSession(UPnPWrapper.ip, UPnPWrapper.port, privacy);
                        final String address = this.getSpsAddress(UUIDUtil.getClientUUID());
                        final ServerInfo serverData = new ServerInfo("", address, false);
                        serverData.setResourcePackPolicy(ServerInfo.ResourcePackPolicy.PROMPT);
                        Essential.EVENT_BUS.post(new ServerJoinEvent(serverData));
                        server.method_3760().addToOperators(MinecraftClient.getInstance().getSession().getProfile());
                        this.oppedPlayers.add(UUIDUtil.getClientUUID());
                        if (FeatureFlags.SPS_HOST_COMMANDS_ENABLED) {
                            ExtensionsKt.getExecutor(MinecraftClient.getInstance());
                            final EssentialCommandRegistry instance2 = EssentialCommandRegistry.INSTANCE;
                            Objects.requireNonNull(instance2);
                            final Object o;
                            ((Executor)o).execute(instance2::registerSPSHostCommands);
                        }
                        return Boolean.valueOf(true);
                    }
                }
            }
        }, Multithreading.POOL).thenApply(success -> {
            this.localState = (success ? SPSState.ACTIVE : SPSState.FAILED);
            this.startFuture = null;
            return success;
        });
    }
    
    public synchronized void updateLocalPrivacy(@NotNull final UPnPPrivacy privacy) {
        final UPnPSession session = this.localSession;
        if (session != null) {
            this.updateLocalSession(session.getIp(), session.getPort(), privacy);
        }
        this.persistSettings();
    }
    
    public synchronized void updateLocalSession(@NotNull final String ip, final int port, @NotNull final UPnPPrivacy privacy) {
        final UPnPSession oldSession = this.localSession;
        final UPnPSession session = new UPnPSession(UUIDUtil.getClientUUID(), ip, port, privacy, (oldSession != null) ? oldSession.getInvites() : Collections.emptySet(), (oldSession != null) ? oldSession.getCreatedAt() : new DateTime());
        if (this.localSession == null) {
            this.updateQueue.enqueue(new ClientUPnPSessionCreatePacket(ip, port, privacy));
        }
        else {
            this.updateQueue.enqueue(new ClientUPnPSessionUpdatePacket(ip, port, privacy));
        }
        this.localSession = session;
        Multithreading.runAsync(this::refreshWhitelist);
    }
    
    public synchronized void closeLocalSession() {
        final UPnPSession oldSession = this.localSession;
        if (oldSession != null) {
            Multithreading.runAsync(() -> {
                if (!UPnPWrapper.close(oldSession.getPort())) {
                    MinecraftUtils.INSTANCE.sendMessage("An error occurred closing the UPnP port");
                }
                return;
            });
        }
        this.currentGameMode = null;
        this.allowCheats = false;
        this.oppedPlayers.clear();
        this.onlinePlayerStates.clear();
        this.localState = SPSState.INACTIVE;
        this.localSession = null;
        ResourcePackSharingHttpServer.INSTANCE.stopServer();
        if (FeatureFlags.SPS_HOST_COMMANDS_ENABLED) {
            final Executor executor = ExtensionsKt.getExecutor(MinecraftClient.getInstance());
            final EssentialCommandRegistry instance = EssentialCommandRegistry.INSTANCE;
            Objects.requireNonNull(instance);
            executor.execute(instance::unregisterSPSHostCommands);
        }
        this.updateQueue.enqueue(new ClientUPnPSessionClosePacket());
    }
    
    public void updateServerStatusResponse(@NotNull final String updatedResponse) {
        if (this.localSession == null) {
            return;
        }
        if (updatedResponse.equals(this.serverStatusResponse)) {
            return;
        }
        this.serverStatusResponse = updatedResponse;
        ExtensionsKt.getExecutor(MinecraftClient.getInstance()).execute(() -> this.updateQueue.enqueue(new ClientUPnPSessionPingProxyUpdatePacket(updatedResponse)));
    }
    
    public void refreshWhitelist() {
        synchronized (this.whitelistSemaphore) {
            this.doRefreshWhitelist();
        }
    }
    
    private void doRefreshWhitelist() {
        final UPnPSession session = this.localSession;
        if (session == null) {
            return;
        }
        Set<UUID> invited;
        if (session.getPrivacy() == UPnPPrivacy.INVITE_ONLY) {
            invited = session.getInvites();
        }
        else {
            invited = new HashSet<UUID>(this.connectionManager.getRelationshipManager().getFriends().keySet());
        }
        CollectionsKt.map((Iterable)invited, UUIDUtil::getName).forEach(CompletableFuture::join);
        final IntegratedServer server = UMinecraft.getMinecraft().getServer();
        if (server == null) {
            return;
        }
        ExtensionsKt.getExecutor((MinecraftServer)server).execute(() -> {
            final Whitelist whitelist = server.method_3760().getWhitelist();
            whitelist.method_14636();
            final String[] array;
            int i = 0;
            for (int length = array.length; i < length; ++i) {
                final String userName = array[i];
                final GameProfile profile = server.method_3793().findByName(userName).orElse(null);
                if (profile != null && !invited.contains(profile.getId())) {
                    whitelist.method_14635((Object)profile);
                }
            }
            invited.iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                final UUID uuid = iterator.next();
                final String userName2 = UUIDUtil.getName(uuid).join();
                final GameProfile profile2 = new GameProfile(uuid, userName2);
                if (whitelist.method_14640((Object)profile2) == null) {
                    whitelist.method_14633((ServerConfigEntry)new WhitelistEntry(profile2));
                }
            }
            ((LanConnectionsAccessor)server.method_3760()).getPlayerEntityList().iterator();
            final Iterator iterator2;
            while (iterator2.hasNext()) {
                final ServerPlayerEntity entity = iterator2.next();
                if (!invited.contains(entity.method_5667()) && !UUIDUtil.getClientUUID().equals(entity.method_5667())) {
                    entity.networkHandler.disconnect((Text)new UTextComponent(I18n.translate("multiplayer.disconnect.server_shutdown", new Object[0])).getComponent());
                }
            }
        });
    }
    
    @Subscribe
    private void onDisconnect(final ServerLeaveEvent event) {
        this.closeLocalSession();
    }
    
    @Override
    public synchronized void onConnected() {
        this.updateQueue.reset();
        if (this.localSession != null) {
            Multithreading.runAsync(() -> {
                final String ip = UPnPWrapper.refreshIp();
                synchronized (this) {
                    final UPnPSession session = this.localSession;
                    if (session != null) {
                        this.localSession = null;
                        this.updateLocalSession(ip, session.getPort(), session.getPrivacy());
                        this.updateInvitedUsers(session.getInvites());
                        final String serverStatusResponse = this.serverStatusResponse;
                        if (serverStatusResponse != null) {
                            this.updateQueue.enqueue(new ClientUPnPSessionPingProxyUpdatePacket(serverStatusResponse));
                        }
                    }
                }
                return;
            });
        }
        this.resetState();
    }
    
    @Override
    public void resetState() {
        this.remoteSessions.clear();
    }
    
    public String getError() {
        return this.error;
    }
    
    public void updateWorldSettings(final boolean cheats, @NotNull final GameMode gameType, @NotNull final Difficulty difficulty) {
        final IntegratedServer integratedServer = UMinecraft.getMinecraft().getServer();
        if (integratedServer != null) {
            ExtensionsKt.getExecutor((MinecraftServer)integratedServer).execute(() -> {
                integratedServer.method_3838(gameType);
                integratedServer.method_3760().setCheatsAllowed(cheats);
                integratedServer.method_3776(difficulty, true);
                return;
            });
        }
        if (UMinecraft.getWorld() != null && !UMinecraft.getWorld().getLevelProperties().method_197()) {
            UMinecraft.getWorld().getLevelProperties().setDifficulty(difficulty);
        }
        this.allowCheats = cheats;
        this.currentGameMode = gameType;
        this.difficulty = difficulty;
        this.persistSettings();
    }
    
    private void persistSettings() {
        final IntegratedServer integratedServer = UMinecraft.getMinecraft().getServer();
        if (integratedServer != null) {
            final SPSData.SPSSettings spsSettings = new SPSData.SPSSettings(this.currentGameMode, this.difficulty, (this.localSession != null) ? this.localSession.getPrivacy() : UPnPPrivacy.INVITE_ONLY, this.allowCheats, (Set)this.getInvitedUsers(), this.shareResourcePack, (Set)this.oppedPlayers);
            SPSData.INSTANCE.saveSPSSettings(spsSettings, ExtensionsKt.getWorldDirectory(integratedServer));
        }
    }
    
    public void updateWorldGameRules(final GameRules gameRules, final Map<String, String> gameRuleSettings) {
        final HashMap<String, String> immutableGameRules = new HashMap<String, String>(gameRuleSettings);
        final IntegratedServer integratedServer = UMinecraft.getMinecraft().getServer();
        if (integratedServer != null) {
            ExtensionsKt.getExecutor((MinecraftServer)integratedServer).execute(() -> GameRules.accept((GameRules.Visitor)new SPSManager.SPSManager$1(immutableGameRules, gameRules, integratedServer)));
        }
    }
    
    public void updateOppedPlayers(final Set<UUID> oppedPlayers, final boolean allowCheats) {
        this.updateOppedPlayers(oppedPlayers, allowCheats, true);
    }
    
    private void updateOppedPlayers(final Set<UUID> oppedPlayers, final boolean allowCheats, final boolean persistSettings) {
        final IntegratedServer integratedServer = MinecraftClient.getInstance().getServer();
        if (integratedServer == null) {
            throw new IllegalStateException("No local session is currently active.");
        }
        this.allowCheats = allowCheats;
        this.oppedPlayers.clear();
        this.oppedPlayers.addAll(oppedPlayers);
        if (persistSettings) {
            this.persistSettings();
        }
        final HashSet<UUID> immutableOppedPlayers = new HashSet<UUID>(oppedPlayers);
        ExtensionsKt.getExecutor((MinecraftServer)integratedServer).execute(() -> {
            integratedServer.method_3760().setCheatsAllowed(allowCheats);
            final PlayerManager playerList = integratedServer.method_3760();
            final OperatorList opList = playerList.getOpList();
            final List<GameProfile> allProfiles = Arrays.stream(opList.method_14636()).map(username -> integratedServer.method_3793().findByName(username)).filter(Optional::isPresent).map((Function<? super Object, ?>)Optional::get).collect((Collector<? super Object, ?, List<GameProfile>>)Collectors.toList());
            allProfiles.iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                final GameProfile profile = iterator.next();
                if (!immutableOppedPlayers.contains(profile.getId()) && !profile.getId().equals(UUIDUtil.getClientUUID())) {
                    playerList.removeFromOperators(profile);
                }
            }
            immutableOppedPlayers.iterator();
            final Iterator iterator2;
            while (iterator2.hasNext()) {
                final UUID oppedPlayer = iterator2.next();
                final GameProfile gameProfile = new GameProfile(oppedPlayer, (String)UUIDUtil.getName(oppedPlayer).join());
                if (opList.method_14640((Object)gameProfile) == null) {
                    playerList.addToOperators(gameProfile);
                }
            }
        });
    }
    
    public Set<UUID> getOppedPlayers() {
        return this.oppedPlayers;
    }
    
    public WeakState<Boolean> getOnlineState(final UUID uuid) {
        if (uuid.equals(UUIDUtil.getClientUUID())) {
            return new WeakState<Boolean>(new BasicState<Boolean>(true));
        }
        return new WeakState<Boolean>(this.onlinePlayerStates.computeIfAbsent(uuid, k -> new BasicState(false)));
    }
    
    @Subscribe
    public void onPlayerJoinSession(final PlayerJoinSessionEvent event) {
        this.onlinePlayerStates.computeIfAbsent(event.getProfile().getId(), k -> new BasicState(true)).set(true);
    }
    
    @Subscribe
    public void onPlayerLeaveSession(final PlayerLeaveSessionEvent event) {
        final State<Boolean> onlineState = this.onlinePlayerStates.remove(event.getProfile().getId());
        if (onlineState != null) {
            onlineState.set(false);
        }
    }
    
    public boolean isShareResourcePack() {
        return this.shareResourcePack;
    }
    
    public void setShareResourcePack(final boolean shareResourcePack) {
        this.shareResourcePack = shareResourcePack;
        this.updateResourcePack(this.packInfo);
        this.persistSettings();
    }
    
    public void updateResourcePack(@Nullable final ResourcePackSharingHttpServer.PackInfo info) {
        this.packInfo = info;
        final IntegratedServer integratedServer = MinecraftClient.getInstance().getServer();
        if (integratedServer != null) {
            if (this.packInfo == null || !this.shareResourcePack) {
                this.setServerResourcePack(null, null);
            }
            else {
                final String url = "http://" + UUIDUtil.getClientUUID() + ".essential-sps/" + this.packInfo.getChecksum();
                this.setServerResourcePack(url, this.packInfo.getChecksum());
            }
        }
    }
    
    private void setServerResourcePack(final String url, final String checksum) {
        this.resourcePackUrl = url;
        this.resourcePackChecksum = checksum;
    }
    
    public String getResourcePackUrl() {
        return this.resourcePackUrl;
    }
    
    public String getResourcePackChecksum() {
        return this.resourcePackChecksum;
    }
    
    private static /* synthetic */ State lambda$onPlayerJoinSession$13(final UUID k) {
        return new BasicState(true);
    }
    
    private static /* synthetic */ State lambda$getOnlineState$12(final UUID k) {
        return new BasicState(false);
    }
    
    private static /* synthetic */ void lambda$updateOppedPlayers$11(final IntegratedServer integratedServer, final boolean allowCheats, final HashSet immutableOppedPlayers) {
        integratedServer.method_3760().setCheatsAllowed(allowCheats);
        final PlayerManager playerList = integratedServer.method_3760();
        final OperatorList opList = playerList.getOpList();
        final List<GameProfile> allProfiles = Arrays.stream(opList.method_14636()).map(username -> integratedServer.method_3793().findByName(username)).filter(Optional::isPresent).map((Function<? super Object, ?>)Optional::get).collect((Collector<? super Object, ?, List<GameProfile>>)Collectors.toList());
        for (final GameProfile profile : allProfiles) {
            if (!immutableOppedPlayers.contains(profile.getId()) && !profile.getId().equals(UUIDUtil.getClientUUID())) {
                playerList.removeFromOperators(profile);
            }
        }
        for (final UUID oppedPlayer : immutableOppedPlayers) {
            final GameProfile gameProfile = new GameProfile(oppedPlayer, (String)UUIDUtil.getName(oppedPlayer).join());
            if (opList.method_14640((Object)gameProfile) == null) {
                playerList.addToOperators(gameProfile);
            }
        }
    }
    
    private static /* synthetic */ Optional lambda$updateOppedPlayers$10(final IntegratedServer integratedServer, final String username) {
        return integratedServer.method_3793().findByName(username);
    }
    
    private /* synthetic */ void lambda$updateWorldGameRules$9(final HashMap immutableGameRules, final GameRules gameRules, final IntegratedServer integratedServer) {
        GameRules.accept((GameRules.Visitor)new SPSManager.SPSManager$1(immutableGameRules, gameRules, integratedServer));
    }
    
    private static /* synthetic */ void lambda$updateWorldSettings$8(final IntegratedServer integratedServer, final GameMode gameType, final boolean cheats, final Difficulty difficulty) {
        integratedServer.method_3838(gameType);
        integratedServer.method_3760().setCheatsAllowed(cheats);
        integratedServer.method_3776(difficulty, true);
    }
    
    private /* synthetic */ void lambda$onConnected$7() {
        final String ip = UPnPWrapper.refreshIp();
        synchronized (this) {
            final UPnPSession session = this.localSession;
            if (session != null) {
                this.localSession = null;
                this.updateLocalSession(ip, session.getPort(), session.getPrivacy());
                this.updateInvitedUsers(session.getInvites());
                final String serverStatusResponse = this.serverStatusResponse;
                if (serverStatusResponse != null) {
                    this.updateQueue.enqueue(new ClientUPnPSessionPingProxyUpdatePacket(serverStatusResponse));
                }
            }
        }
    }
    
    private static /* synthetic */ void lambda$doRefreshWhitelist$6(final IntegratedServer server, final Set invited) {
        final Whitelist whitelist = server.method_3760().getWhitelist();
        for (final String userName : whitelist.method_14636()) {
            final GameProfile profile = server.method_3793().findByName(userName).orElse(null);
            if (profile != null && !invited.contains(profile.getId())) {
                whitelist.method_14635((Object)profile);
            }
        }
        for (final UUID uuid : invited) {
            final String userName2 = UUIDUtil.getName(uuid).join();
            final GameProfile profile2 = new GameProfile(uuid, userName2);
            if (whitelist.method_14640((Object)profile2) == null) {
                whitelist.method_14633((ServerConfigEntry)new WhitelistEntry(profile2));
            }
        }
        for (final ServerPlayerEntity entity : ((LanConnectionsAccessor)server.method_3760()).getPlayerEntityList()) {
            if (!invited.contains(entity.method_5667()) && !UUIDUtil.getClientUUID().equals(entity.method_5667())) {
                entity.networkHandler.disconnect((Text)new UTextComponent(I18n.translate("multiplayer.disconnect.server_shutdown", new Object[0])).getComponent());
            }
        }
    }
    
    private /* synthetic */ void lambda$updateServerStatusResponse$5(final String updatedResponse) {
        this.updateQueue.enqueue(new ClientUPnPSessionPingProxyUpdatePacket(updatedResponse));
    }
    
    private static /* synthetic */ void lambda$closeLocalSession$4(final UPnPSession oldSession) {
        if (!UPnPWrapper.close(oldSession.getPort())) {
            MinecraftUtils.INSTANCE.sendMessage("An error occurred closing the UPnP port");
        }
    }
    
    private /* synthetic */ Boolean lambda$startLocalSession$3(final Boolean success) {
        this.localState = (success ? SPSState.ACTIVE : SPSState.FAILED);
        this.startFuture = null;
        return success;
    }
    
    private /* synthetic */ Boolean lambda$startLocalSession$2(final Difficulty difficulty, final GameMode gameMode, final boolean allowCheats, final UPnPPrivacy privacy) {
        final IntegratedServer server = UMinecraft.getMinecraft().getServer();
        if (server == null) {
            return false;
        }
        server.method_3760().setWhitelistEnabled(true);
        server.method_3776(difficulty, true);
        final int port = NetworkUtils.findLocalPort();
        if (!server.method_3763(gameMode, allowCheats, port)) {
            this.error = "Unable to start LAN server.";
            return false;
        }
        int voicePort = port;
        if (ModLoaderUtil.INSTANCE.isModLoaded("plasmo_voice")) {
            voicePort = 60606;
        }
        this.connectionManager.getIceManager().setVoicePort(voicePort);
        Essential.logger.info("UPnP Init on port: {}", (Object)port);
        final UPnPWrapper.UPnPStatus status = UPnPWrapper.openOnPort(port);
        if (status == UPnPWrapper.UPnPStatus.UNAVAILABLE) {
            this.error = "Failed to open UPnP. Your current router does not yet support it.";
            return false;
        }
        if (status == UPnPWrapper.UPnPStatus.FAILED) {
            this.error = "Failed to open UPnP. If issues persist contact support.";
            return false;
        }
        this.updateLocalSession(UPnPWrapper.ip, UPnPWrapper.port, privacy);
        final String address = this.getSpsAddress(UUIDUtil.getClientUUID());
        final ServerInfo serverData = new ServerInfo("", address, false);
        serverData.setResourcePackPolicy(ServerInfo.ResourcePackPolicy.PROMPT);
        Essential.EVENT_BUS.post(new ServerJoinEvent(serverData));
        server.method_3760().addToOperators(MinecraftClient.getInstance().getSession().getProfile());
        this.oppedPlayers.add(UUIDUtil.getClientUUID());
        if (FeatureFlags.SPS_HOST_COMMANDS_ENABLED) {
            final Executor executor = ExtensionsKt.getExecutor(MinecraftClient.getInstance());
            final EssentialCommandRegistry instance = EssentialCommandRegistry.INSTANCE;
            Objects.requireNonNull(instance);
            executor.execute(instance::registerSPSHostCommands);
        }
        return true;
    }
    
    private /* synthetic */ void lambda$addRemoteSession$1(final UPnPSession session, final String hostName) {
        Notifications.INSTANCE.push("World Invite", hostName + " has started a world for all friends. Click here to join!", (Function0<Unit>)(() -> {
            MinecraftUtils.INSTANCE.connectToServer(hostName, this.getSpsAddress(session.getHostUUID()));
            return Unit.INSTANCE;
        }));
    }
    
    private /* synthetic */ Unit lambda$addRemoteSession$0(final String hostName, final UPnPSession session) {
        MinecraftUtils.INSTANCE.connectToServer(hostName, this.getSpsAddress(session.getHostUUID()));
        return Unit.INSTANCE;
    }
}
