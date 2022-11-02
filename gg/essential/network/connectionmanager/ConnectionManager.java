package gg.essential.network.connectionmanager;

import gg.essential.network.client.*;
import gg.essential.network.connectionmanager.notices.*;
import gg.essential.network.connectionmanager.subscription.*;
import gg.essential.network.connectionmanager.relationship.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import gg.essential.network.connectionmanager.chat.*;
import gg.essential.network.connectionmanager.profile.*;
import gg.essential.network.connectionmanager.sps.*;
import gg.essential.network.connectionmanager.serverdiscovery.*;
import gg.essential.network.connectionmanager.social.*;
import gg.essential.network.connectionmanager.ice.*;
import gg.essential.network.connectionmanager.media.*;
import gg.essential.network.connectionmanager.telemetry.*;
import java.io.*;
import gg.essential.util.lwjgl3.*;
import gg.essential.network.connectionmanager.handler.*;
import gg.essential.network.connectionmanager.handler.connection.*;
import gg.essential.connectionmanager.common.packet.multiplayer.*;
import gg.essential.network.connectionmanager.handler.multiplayer.*;
import gg.essential.connectionmanager.common.packet.relationships.*;
import gg.essential.network.connectionmanager.handler.mojang.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.connectionmanager.common.packet.connection.*;
import gg.essential.connectionmanager.common.util.*;
import gg.essential.*;
import gg.essential.api.utils.*;
import gg.essential.gui.menu.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.response.*;
import gg.essential.util.*;
import gg.essential.connectionmanager.common.packet.telemetry.*;
import gg.essential.config.*;
import java.util.function.*;
import java.util.*;
import java.util.concurrent.*;
import gg.essential.event.essential.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.event.client.*;

public class ConnectionManager
{
    @NotNull
    private final Connection connection;
    @NotNull
    private final MinecraftHook minecraftHook;
    @NotNull
    private final List<NetworkedManager> managers;
    @NotNull
    private final NoticesManager noticesManager;
    @NotNull
    private final SubscriptionManager subscriptionManager;
    @NotNull
    private final RelationshipManager relationshipManager;
    @NotNull
    private final CosmeticsManager cosmeticsManager;
    @NotNull
    private final ChatManager chatManager;
    @NotNull
    private final ProfileManager profileManager;
    @NotNull
    private final SPSManager spsManager;
    @NotNull
    private final ServerDiscoveryManager serverDiscoveryManager;
    @NotNull
    private final SocialManager socialManager;
    @NotNull
    private final IceManager iceManager;
    @NotNull
    private final ScreenshotManager screenshotManager;
    @NotNull
    private final TelemetryManager telemetryManager;
    private boolean triedReauth;
    private boolean authenticated;
    private boolean attemptingReconnect;
    private UUID lastAuthenticatedUUID;
    public CompletableFuture<Status> connectionStatus;
    
    public ConnectionManager(@NotNull final MinecraftHook minecraftHook, final File baseDir, final Lwjgl3Loader lwjgl3) {
        super();
        this.connection = new Connection(this);
        this.managers = new ArrayList<NetworkedManager>();
        this.triedReauth = false;
        this.authenticated = false;
        this.attemptingReconnect = false;
        this.minecraftHook = minecraftHook;
        this.subscriptionManager = new SubscriptionManager(this);
        this.managers.add(this.subscriptionManager);
        this.registerPacketHandler(ConnectionRegisterPacketTypeIdPacket.class, new ConnectionRegisterPacketTypeIdPacketHandler());
        this.registerPacketHandler(ConnectionKeepAlivePacket.class, new ServerConnectionKeepAlivePacketHandler());
        this.registerPacketHandler(ClientConnectionDisconnectPacket.class, new ClientConnectionDisconnectPacketHandler());
        this.registerPacketHandler(ServerConnectionReconnectPacket.class, new ServerConnectionReconnectPacketHandler());
        this.registerPacketHandler(ServerMultiplayerJoinServerPacket.class, new ServerMultiplayerJoinServerPacketHandler());
        this.registerPacketHandler(ServerUuidNameMapPacket.class, new ServerUuidNameMapPacketHandler());
        this.managers.add(this.noticesManager = new NoticesManager(this));
        this.cosmeticsManager = new CosmeticsManager(this);
        this.managers.add(this.cosmeticsManager);
        this.relationshipManager = new RelationshipManager(this);
        this.managers.add(this.relationshipManager);
        this.chatManager = new ChatManager(this);
        this.managers.add(this.chatManager);
        this.profileManager = new ProfileManager(this);
        this.managers.add(this.profileManager);
        this.spsManager = new SPSManager(this);
        this.managers.add(this.spsManager);
        this.serverDiscoveryManager = new ServerDiscoveryManager(this);
        this.managers.add(this.serverDiscoveryManager);
        this.managers.add(this.socialManager = new SocialManager(this));
        this.managers.add(this.iceManager = new IceManager(this, this.spsManager));
        this.managers.add(this.screenshotManager = new ScreenshotManager(this, baseDir, lwjgl3));
        this.managers.add(this.telemetryManager = new TelemetryManager(this));
    }
    
    @NotNull
    public Connection getConnection() {
        return this.connection;
    }
    
    @NotNull
    public MinecraftHook getMinecraftHook() {
        return this.minecraftHook;
    }
    
    @NotNull
    public NoticesManager getNoticesManager() {
        return this.noticesManager;
    }
    
    @NotNull
    public SubscriptionManager getSubscriptionManager() {
        return this.subscriptionManager;
    }
    
    @NotNull
    public RelationshipManager getRelationshipManager() {
        return this.relationshipManager;
    }
    
    @NotNull
    public CosmeticsManager getCosmeticsManager() {
        return this.cosmeticsManager;
    }
    
    @NotNull
    public ChatManager getChatManager() {
        return this.chatManager;
    }
    
    @NotNull
    public ProfileManager getProfileManager() {
        return this.profileManager;
    }
    
    @NotNull
    public SPSManager getSpsManager() {
        return this.spsManager;
    }
    
    @NotNull
    public SocialManager getSocialManager() {
        return this.socialManager;
    }
    
    @NotNull
    public ScreenshotManager getScreenshotManager() {
        return this.screenshotManager;
    }
    
    @NotNull
    public IceManager getIceManager() {
        return this.iceManager;
    }
    
    @NotNull
    public TelemetryManager getTelemetryManager() {
        return this.telemetryManager;
    }
    
    public boolean isOpen() {
        return this.connection.isOpen();
    }
    
    public boolean isAuthenticated() {
        return this.authenticated;
    }
    
    public <T extends Packet> void registerPacketHandler(final Class<T> cls, final PacketHandler<T> handler) {
        this.connection.registerPacketHandler(cls, handler);
    }
    
    @Nullable
    public ClientConnectionLoginPacket prepareLoginAsync() {
        this.authenticated = false;
        final byte[] sharedSecret = LoginUtil.generateSharedSecret();
        final String sessionHash = LoginUtil.computeHash(sharedSecret);
        final int statusCode = gg.essential.util.LoginUtil.joinServer(this.minecraftHook.getSession(), this.minecraftHook.getPlayerUUID().toString().replace("-", ""), sessionHash);
        if (statusCode != 204) {
            Essential.logger.warn("Could not authenticate with Mojang - connection attempt aborted.");
            if (statusCode == 429 && !this.attemptingReconnect) {
                this.attemptingReconnect = true;
                Multithreading.schedule(() -> {
                    if (!this.triedReauth && !this.isOpen()) {
                        this.triedReauth = true;
                        this.connect();
                    }
                    this.attemptingReconnect = false;
                    return;
                }, 5L, TimeUnit.SECONDS);
            }
            else if (!this.triedReauth) {
                this.triedReauth = true;
                Essential.logger.warn("Trying to refresh session token..");
                AccountManager.refreshCurrentSession$1385ff();
            }
            return null;
        }
        return new ClientConnectionLoginPacket(this.minecraftHook.getPlayerName(), sharedSecret);
    }
    
    public void onOpenAsync(@NotNull final ClientConnectionLoginPacket loginPacket) {
        this.send(loginPacket, response -> {
            if (!response.isPresent()) {
                Essential.logger.warn("Login request got no response - closing connection.");
                this.close(CloseReason.LOGIN_REQUEST_NO_RESPONSE);
                this.connectionStatus.complete(Status.NO_RESPONSE);
            }
            else {
                final Packet packet = response.get();
                if (!(packet instanceof ResponseActionPacket)) {
                    Essential.logger.warn("Login response type ({}) was not expected - closing connection ({}).", (Object)packet.getClass(), (Object)packet);
                    this.close(CloseReason.INVALID_LOGIN_RESPONSE);
                    this.connectionStatus.complete(Status.INVALID_RESPONSE);
                }
                else {
                    final ResponseActionPacket responseActionPacket = (ResponseActionPacket)packet;
                    if (!responseActionPacket.isSuccessful()) {
                        Essential.logger.warn("Login attempt was not successful - closing connection.");
                        this.close(CloseReason.LOGIN_REQUEST_FAILED);
                        this.connectionStatus.complete(Status.GENERAL_FAILURE);
                    }
                    else {
                        this.triedReauth = false;
                        this.authenticated = true;
                        this.managers.iterator();
                        final Iterator iterator;
                        while (iterator.hasNext()) {
                            final NetworkedManager manager = iterator.next();
                            manager.onConnected();
                        }
                        Multithreading.runAsync(() -> {
                            this.respond(responseActionPacket, ModLoaderUtil.createModsAnnouncePacket());
                            this.send(new ClientTelemetryPacket("SESSION_START"));
                            new ClientTelemetryPacket("MINI_STATE", new HashMap<String, Object>() {
                                ConnectionManager$1() {
                                    super();
                                }
                                
                                {
                                    ((HashMap<String, Boolean>)this).put("mini", !EssentialConfig.INSTANCE.getEssentialFull());
                                }
                            });
                            final ClientTelemetryPacket packet2;
                            this.send(packet2);
                            return;
                        });
                        this.connectionStatus.complete(Status.SUCCESS);
                    }
                }
            }
        });
    }
    
    public void onClose() {
        this.authenticated = false;
        for (NetworkedManager networkedManager : this.managers) {}
        int delay = 30;
        if (this.connection.getURI().toString().contains("localhost")) {
            delay = 3;
        }
        Multithreading.schedule(() -> {
            if (!this.isOpen() && !this.attemptingReconnect) {
                this.connect();
            }
        }, delay, TimeUnit.SECONDS);
    }
    
    public void respond(@NotNull final Packet respondingTo, @NotNull final Packet respondingWith) {
        this.send(respondingWith, null, null, null, respondingTo.getPacketUniqueId());
    }
    
    public void send(@NotNull final Packet packet) {
        this.send(packet, null);
    }
    
    public void send(@NotNull final Packet packet, @Nullable final Consumer<Optional<Packet>> responseCallback) {
        this.send(packet, responseCallback, TimeUnit.SECONDS, 10L);
    }
    
    public void send(@NotNull final Packet packet, @Nullable final Consumer<Optional<Packet>> responseCallback, @Nullable final TimeUnit timeoutUnit, @Nullable final Long timeoutValue) {
        this.send(packet, responseCallback, timeoutUnit, timeoutValue, null);
    }
    
    public void send(@NotNull final Packet packet, @Nullable final Consumer<Optional<Packet>> responseCallback, @Nullable final TimeUnit timeoutUnit, @Nullable final Long timeoutValue, @Nullable final UUID packetId) {
        this.connection.send(packet, responseCallback, timeoutUnit, timeoutValue, packetId);
    }
    
    public synchronized CompletionStage<Status> connect() {
        if (this.connectionStatus != null && !this.connectionStatus.isDone()) {
            return this.connectionStatus;
        }
        this.connectionStatus = new CompletableFuture<Status>();
        Multithreading.getScheduledPool().execute(() -> this.connection.attemptConnect$1385ff());
        return this.connectionStatus;
    }
    
    public void close(@NotNull final CloseReason closeReason) {
        this.close(closeReason, null);
    }
    
    public void close(@NotNull final CloseReason closeReason, @Nullable final String metadata) {
        this.connection.close(closeReason, metadata);
    }
    
    @Subscribe
    public void onTosAcceptedEvent(@NotNull final TosAcceptedEvent event) {
        this.connect();
    }
    
    @Subscribe
    public void onPreReAuthEvent(@NotNull final ReAuthEvent.Pre event) {
        if (!event.getSession().getProfile().getId().equals(this.lastAuthenticatedUUID)) {
            this.lastAuthenticatedUUID = event.getSession().getProfile().getId();
            if (this.isOpen()) {
                this.close(CloseReason.REAUTHENTICATION);
            }
        }
    }
    
    @Subscribe
    public void onPostReAuthEvent(@NotNull final ReAuthEvent.Post event) {
        if (event.getSession().getProfile().getId().equals(this.lastAuthenticatedUUID)) {
            this.connect();
        }
    }
    
    public ServerDiscoveryManager getServerDiscoveryManager() {
        return this.serverDiscoveryManager;
    }
    
    public void onTosRevokedOrEssentialDisabled() {
        if (this.isOpen()) {
            this.close(CloseReason.USER_TOS_REVOKED);
        }
        for (final NetworkedManager manager : this.managers) {
            manager.resetState();
        }
    }
    
    private /* synthetic */ void lambda$connect$4() {
        this.connection.attemptConnect$1385ff();
    }
    
    private /* synthetic */ void lambda$onClose$3() {
        if (!this.isOpen() && !this.attemptingReconnect) {
            this.connect();
        }
    }
    
    private /* synthetic */ void lambda$onOpenAsync$2(final Optional response) {
        if (!response.isPresent()) {
            Essential.logger.warn("Login request got no response - closing connection.");
            this.close(CloseReason.LOGIN_REQUEST_NO_RESPONSE);
            this.connectionStatus.complete(Status.NO_RESPONSE);
            return;
        }
        final Packet packet = response.get();
        if (!(packet instanceof ResponseActionPacket)) {
            Essential.logger.warn("Login response type ({}) was not expected - closing connection ({}).", (Object)packet.getClass(), (Object)packet);
            this.close(CloseReason.INVALID_LOGIN_RESPONSE);
            this.connectionStatus.complete(Status.INVALID_RESPONSE);
            return;
        }
        final ResponseActionPacket responseActionPacket = (ResponseActionPacket)packet;
        if (!responseActionPacket.isSuccessful()) {
            Essential.logger.warn("Login attempt was not successful - closing connection.");
            this.close(CloseReason.LOGIN_REQUEST_FAILED);
            this.connectionStatus.complete(Status.GENERAL_FAILURE);
            return;
        }
        this.triedReauth = false;
        this.authenticated = true;
        for (final NetworkedManager manager : this.managers) {
            manager.onConnected();
        }
        Multithreading.runAsync(() -> {
            this.respond(responseActionPacket, ModLoaderUtil.createModsAnnouncePacket());
            this.send(new ClientTelemetryPacket("SESSION_START"));
            new ClientTelemetryPacket("MINI_STATE", new HashMap<String, Object>() {
                ConnectionManager$1() {
                    super();
                }
                
                {
                    ((HashMap<String, Boolean>)this).put("mini", !EssentialConfig.INSTANCE.getEssentialFull());
                }
            });
            final ClientTelemetryPacket packet2;
            this.send(packet2);
            return;
        });
        this.connectionStatus.complete(Status.SUCCESS);
    }
    
    private /* synthetic */ void lambda$onOpenAsync$1(final ResponseActionPacket responseActionPacket) {
        this.respond(responseActionPacket, ModLoaderUtil.createModsAnnouncePacket());
        this.send(new ClientTelemetryPacket("SESSION_START"));
        this.send(new ClientTelemetryPacket("MINI_STATE", new HashMap<String, Object>() {
            ConnectionManager$1() {
                super();
            }
            
            {
                ((HashMap<String, Boolean>)this).put("mini", !EssentialConfig.INSTANCE.getEssentialFull());
            }
        }));
    }
    
    private /* synthetic */ void lambda$prepareLoginAsync$0() {
        if (!this.triedReauth && !this.isOpen()) {
            this.triedReauth = true;
            this.connect();
        }
        this.attemptingReconnect = false;
    }
    
    public enum Status
    {
        NO_TOS, 
        ESSENTIAL_DISABLED, 
        ALREADY_CONNECTED, 
        NO_RESPONSE, 
        INVALID_RESPONSE, 
        MOJANG_UNAUTHORIZED, 
        GENERAL_FAILURE, 
        SUCCESS;
        
        private static final /* synthetic */ Status[] $VALUES;
        
        public static Status[] values() {
            return Status.$VALUES.clone();
        }
        
        public static Status valueOf(final String name) {
            return Enum.valueOf(Status.class, name);
        }
        
        private static /* synthetic */ Status[] $values() {
            return new Status[] { Status.NO_TOS, Status.ESSENTIAL_DISABLED, Status.ALREADY_CONNECTED, Status.NO_RESPONSE, Status.INVALID_RESPONSE, Status.MOJANG_UNAUTHORIZED, Status.GENERAL_FAILURE, Status.SUCCESS };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
