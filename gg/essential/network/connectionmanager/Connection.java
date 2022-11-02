package gg.essential.network.connectionmanager;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.network.connectionmanager.handler.*;
import org.apache.commons.lang3.tuple.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import org.jetbrains.annotations.*;
import java.net.*;
import gg.essential.universal.*;
import gg.essential.util.*;
import com.google.common.collect.*;
import java.lang.reflect.*;
import com.sparkuniverse.toolbox.relationships.enums.*;
import com.sparkuniverse.toolbox.relationships.serialisation.*;
import com.sparkuniverse.toolbox.util.*;
import com.sparkuniverse.toolbox.serialization.*;
import java.util.concurrent.locks.*;
import gg.essential.api.utils.*;
import gg.essential.lib.caffeine.cache.*;
import gg.essential.*;
import gg.essential.lib.websocket.client.*;
import gg.essential.lib.websocket.handshake.*;
import gg.essential.connectionmanager.common.packet.connection.*;
import java.util.*;
import java.nio.*;
import org.apache.commons.lang3.*;
import gg.essential.lib.gson.*;
import java.nio.charset.*;
import java.io.*;
import gg.essential.data.*;
import gg.essential.config.*;
import gg.essential.handlers.*;
import gg.essential.network.connectionmanager.legacyjre.*;
import javax.net.*;
import javax.net.ssl.*;
import java.util.concurrent.*;

public class Connection extends WebSocketClient
{
    private final byte[] EMPTY_BYTE_ARRAY;
    @NotNull
    private final Executor mainThreadExecutor;
    @NotNull
    private final Map<Class<? extends Packet>, PacketHandler<?>> packetHandlers;
    @NotNull
    private final Cache<UUID, Pair<Long, Consumer<Optional<Packet>>>> awaitingPacketResponses;
    @NotNull
    private final AtomicInteger packetTypeId;
    @NotNull
    private final Map<Integer, String> incomingPacketTypeIds;
    @NotNull
    private final Map<String, Integer> outgoingPacketTypeIds;
    private final boolean LOG_PACKETS;
    private int failedConnects;
    @NotNull
    private final Gson gson;
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final Lock connectLock;
    private long lastReceivedKeepAlive;
    private long connectedAt;
    private boolean connectedBefore;
    ScheduledFuture<?> retryConnectionTask;
    @Nullable
    private String closureExtraData;
    @Nullable
    private ClientConnectionLoginPacket loginPacket;
    static final /* synthetic */ boolean $assertionsDisabled;
    
    public Connection(@NotNull final ConnectionManager connectionManager) {
        super(URI.create(System.getProperty("essential.cm.host", System.getenv().getOrDefault("ESSENTIAL_CM_HOST", "wss://connect.essential.gg/v1"))));
        this.EMPTY_BYTE_ARRAY = new byte[0];
        this.mainThreadExecutor = ExtensionsKt.getExecutor(UMinecraft.getMinecraft());
        this.packetHandlers = (Map<Class<? extends Packet>, PacketHandler<?>>)Maps.newHashMap();
        this.packetTypeId = new AtomicInteger();
        this.incomingPacketTypeIds = (Map<Integer, String>)Maps.newConcurrentMap();
        this.outgoingPacketTypeIds = (Map<String, Integer>)Maps.newConcurrentMap();
        this.LOG_PACKETS = System.getProperty("essential.logPackets", "false").equals("true");
        this.failedConnects = 0;
        this.gson = new GsonBuilder().registerTypeAdapter(UUID.class, new UUIDTypeAdapter()).registerTypeAdapter(RelationshipType.class, new RelationshipTypeAdapter()).registerTypeAdapter(RelationshipState.class, new RelationshipStateAdapter()).registerTypeAdapter(FriendRequestPrivacySetting.class, new FriendRequestPrivacySettingTypeAdapter()).registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter()).create();
        this.connectLock = new ReentrantLock();
        this.connectedAt = System.currentTimeMillis();
        this.connectedBefore = false;
        this.awaitingPacketResponses = Caffeine.newBuilder().maximumSize(10000L).executor(Multithreading.getPool()).scheduler(Scheduler.forScheduledExecutorService(Multithreading.getScheduledPool())).expireAfter((Expiry<? super Object, ? super Object>)new Expiry<UUID, Pair<Long, Consumer<Optional<Packet>>>>() {
            Connection$1() {
                super();
            }
            
            public long expireAfterCreate$3633b9f8(@NotNull final Pair<Long, Consumer<Optional<Packet>>> valueData) {
                return valueData.getKey();
            }
            
            public long expireAfterUpdate$6fbcf324(final long currentDuration) {
                return currentDuration;
            }
            
            public long expireAfterRead$6fbcf324(final long currentDuration) {
                return currentDuration;
            }
            
            @Override
            public /* bridge */ long expireAfterRead(@NotNull final Object o, @NotNull final Object o2, final long n, final long currentDuration) {
                return this.expireAfterRead$6fbcf324(currentDuration);
            }
            
            @Override
            public /* bridge */ long expireAfterUpdate(@NotNull final Object o, @NotNull final Object o2, final long n, final long currentDuration) {
                return this.expireAfterUpdate$6fbcf324(currentDuration);
            }
            
            @Override
            public /* bridge */ long expireAfterCreate(@NotNull final Object o, @NotNull final Object o2, final long n) {
                return this.expireAfterCreate$3633b9f8((Pair<Long, Consumer<Optional<Packet>>>)o2);
            }
        }).evictionListener((key, value, cause) -> {
            if (value != null && (RemovalCause.EXPIRED == cause || RemovalCause.SIZE == cause)) {
                final Consumer<Optional<Packet>> packetHandler = value.getRight();
                this.mainThreadExecutor.execute(() -> packetHandler.accept(Optional.empty()));
            }
            return;
        }).build();
        this.connectionManager = connectionManager;
        this.setTcpNoDelay(true);
        this.setReuseAddr(true);
        this.setConnectionLostTimeout$13462e();
        if (LegacyJre.IS_LEGACY_JRE_51) {
            Essential.logger.info("Using LegacyJreDnsResolver");
            this.setDnsResolver((DnsResolver)new LegacyJreDnsResolver());
        }
        else {
            Essential.logger.info("Using Default JreDnsResolver");
        }
        Multithreading.getScheduledPool().scheduleAtFixedRate(() -> {
            if (!(!this.isOpen())) {
                final long diff = System.currentTimeMillis() - this.lastReceivedKeepAlive;
                if (diff >= 60000L) {
                    this.close(CloseReason.SERVER_KEEP_ALIVE_TIMEOUT, diff + "ms");
                }
            }
        }, 0L, 30L, TimeUnit.SECONDS);
    }
    
    public void registerIncomingPacketTypeId(@NotNull final String packetName, final int packetTypeId) {
        this.incomingPacketTypeIds.put(packetTypeId, packetName);
    }
    
    public void setLastReceivedKeepAlive(final long lastReceivedKeepAlive) {
        this.lastReceivedKeepAlive = lastReceivedKeepAlive;
    }
    
    public <T extends Packet> void registerPacketHandler(final Class<T> cls, final PacketHandler<T> handler) {
        this.packetHandlers.put(cls, handler);
    }
    
    public void close(@NotNull final CloseReason closeReason, @Nullable final String extraData) {
        this.closureExtraData = extraData;
        this.close(closeReason.getCode(), closeReason.name());
    }
    
    @Override
    public void onOpen(@NotNull final ServerHandshake serverHandshake) {
        Essential.logger.info("Opened connection to Essential ConnectionManager (code={}, message={})", (Object)serverHandshake.getHttpStatus(), (Object)serverHandshake.getHttpStatusMessage());
        assert this.loginPacket != null;
        this.closureExtraData = null;
        this.packetTypeId.set(0);
        this.incomingPacketTypeIds.clear();
        this.outgoingPacketTypeIds.clear();
        final String packetName = this.splitPacketPackage(ConnectionRegisterPacketTypeIdPacket.class);
        this.incomingPacketTypeIds.put(0, packetName);
        this.outgoingPacketTypeIds.put(packetName, 0);
        this.connectedAt = System.currentTimeMillis();
        this.connectionManager.onOpenAsync(this.loginPacket);
    }
    
    @Override
    public void onClose(final int code, @NotNull final String reason, final boolean remote) {
        Essential.logger.info("Closed connection to Essential Connection Manager (code={}, reason={}, remote={}), connection was open for {}ms", (Object)code, reason + ((this.closureExtraData == null) ? "" : (" (" + this.closureExtraData)), (Object)remote, (Object)(System.currentTimeMillis() - this.connectedAt));
        this.connectionManager.connectionStatus.complete(ConnectionManager.Status.GENERAL_FAILURE);
        final Executor mainThreadExecutor = this.mainThreadExecutor;
        final ConnectionManager connectionManager = this.connectionManager;
        Objects.requireNonNull(connectionManager);
        mainThreadExecutor.execute(connectionManager::onClose);
    }
    
    @Override
    public void onMessage(@NotNull final ByteBuffer byteBuffer) {
        PacketHandler packetHandler;
        Consumer<Optional<Packet>> fResponseHandler;
        Packet packet;
        try {
            final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteBuffer.array());
            try {
                final DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    final int packetTypeId = dataInputStream.readInt();
                    final String packetName = this.incomingPacketTypeIds.get(packetTypeId);
                    if (packetName == null) {
                        Essential.logger.warn("Unknown packet type id {} from connection manager.", (Object)packetTypeId);
                        dataInputStream.close();
                        byteArrayInputStream.close();
                        return;
                    }
                    Class<? extends Packet> packetClass;
                    try {
                        packetClass = (Class<? extends Packet>)Class.forName("gg.essential.connectionmanager.common.packet." + packetName);
                    }
                    catch (final ClassNotFoundException ex) {
                        packetClass = UnknownPacket.class;
                    }
                    final String packetIdString = this.readString(dataInputStream);
                    packetHandler = this.packetHandlers.get(packetClass);
                    UUID packetId = null;
                    Consumer<Optional<Packet>> responseHandler = null;
                    if (!StringUtils.isEmpty(packetIdString)) {
                        packetId = UUID.fromString(packetIdString);
                        final Pair<Long, Consumer<Optional<Packet>>> responseCallbackPair = this.awaitingPacketResponses.getIfPresent(packetId);
                        if (responseCallbackPair != null) {
                            this.awaitingPacketResponses.invalidate(packetId);
                            responseHandler = responseCallbackPair.getRight();
                        }
                    }
                    fResponseHandler = responseHandler;
                    if (packetHandler == null && responseHandler == null) {
                        dataInputStream.close();
                        byteArrayInputStream.close();
                        return;
                    }
                    final String jsonString = this.readString(dataInputStream);
                    if (this.LOG_PACKETS) {
                        Essential.debug.info(packetClass.getSimpleName() + " " + jsonString);
                    }
                    try {
                        packet = this.gson.fromJson(jsonString, packetClass);
                    }
                    catch (final JsonParseException e) {
                        Essential.logger.error("Error when deserialising json '{}' for '{}'.", (Object)jsonString, (Object)packetClass, (Object)e);
                        dataInputStream.close();
                        byteArrayInputStream.close();
                        return;
                    }
                    if (packetId != null) {
                        packet.setUniqueId(packetId);
                    }
                    dataInputStream.close();
                }
                catch (final Throwable t) {
                    try {
                        dataInputStream.close();
                    }
                    catch (final Throwable exception) {
                        t.addSuppressed(exception);
                    }
                    throw t;
                }
                byteArrayInputStream.close();
            }
            catch (final Throwable t2) {
                try {
                    byteArrayInputStream.close();
                }
                catch (final Throwable exception2) {
                    t2.addSuppressed(exception2);
                }
                throw t2;
            }
        }
        catch (final IOException e2) {
            Essential.logger.error("Error when reading byte buffer data '{}'.", (Object)byteBuffer.array(), (Object)e2);
            return;
        }
        if (packet instanceof ConnectionRegisterPacketTypeIdPacket) {
            packetHandler.handle(this.connectionManager, packet);
            return;
        }
        this.mainThreadExecutor.execute(() -> {
            if (!(!this.isOpen())) {
                Consumer<Optional<Packet>> responseHandler2 = fResponseHandler;
                if (responseHandler2 instanceof EarlyResponseHandler) {
                    try {
                        responseHandler2.accept(Optional.of(packet));
                    }
                    catch (final Throwable throwable) {
                        throwable.printStackTrace();
                    }
                    responseHandler2 = null;
                }
                if (packetHandler != null) {
                    try {
                        packetHandler.handle(this.connectionManager, packet);
                    }
                    catch (final Throwable throwable2) {
                        throwable2.printStackTrace();
                    }
                }
                if (responseHandler2 != null) {
                    try {
                        responseHandler2.accept(Optional.of(packet));
                    }
                    catch (final Throwable throwable3) {
                        throwable3.printStackTrace();
                    }
                }
            }
        });
    }
    
    @Override
    public void onError(@NotNull final Exception e) {
        Essential.logger.error("Critical error occurred on connection management. ", (Throwable)e);
    }
    
    public void send(@NotNull final Packet packet, @Nullable final Consumer<Optional<Packet>> responseCallback, @Nullable final TimeUnit timeoutUnit, @Nullable final Long timeoutValue, @Nullable UUID packetId) {
        if (!this.isOpen()) {
            if (responseCallback != null) {
                responseCallback.accept(Optional.empty());
            }
            return;
        }
        final boolean wantsResponseHandling = responseCallback != null && timeoutUnit != null && timeoutValue != null;
        packetId = ((wantsResponseHandling && packetId == null) ? UUID.randomUUID() : packetId);
        final int packetTypeId = this.outgoingPacketTypeIds.computeIfAbsent(this.splitPacketPackage(packet.getClass()), packetName -> {
            final int newId = this.packetTypeId.incrementAndGet();
            this.send(new ConnectionRegisterPacketTypeIdPacket(packetName, newId), null, null, null, null);
            return Integer.valueOf(newId);
        });
        final byte[] packetBytes = this.gson.toJson(packet).getBytes(StandardCharsets.UTF_8);
        final byte[] packetIdBytes = (packetId != null) ? packetId.toString().getBytes(StandardCharsets.UTF_8) : this.EMPTY_BYTE_ARRAY;
        if (this.LOG_PACKETS) {
            Essential.debug.info(packet.getClass().getSimpleName() + " " + new String(packetBytes));
        }
        try (final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream)) {
            dataOutputStream.writeInt(packetTypeId);
            dataOutputStream.writeInt(packetIdBytes.length);
            dataOutputStream.write(packetIdBytes);
            dataOutputStream.writeInt(packetBytes.length);
            dataOutputStream.write(packetBytes);
            this.send(byteArrayOutputStream.toByteArray());
        }
        catch (final IOException e) {
            Essential.logger.error("Error occurred when sending out packet '{}'.", (Object)packet, (Object)e);
        }
        if (wantsResponseHandling) {
            this.awaitingPacketResponses.put(packetId, Pair.of(timeoutUnit.toNanos(timeoutValue), responseCallback));
        }
    }
    
    public void attemptConnect$1385ff() {
        this.failedConnects = 0;
        this.attemptConnect();
    }
    
    public void attemptConnect() {
        if (!this.connectLock.tryLock()) {
            return;
        }
        try {
            this.doAttemptConnect();
        }
        finally {
            this.connectLock.unlock();
        }
    }
    
    private void doAttemptConnect() {
        if (!OnboardingData.hasAcceptedTos()) {
            this.connectionManager.connectionStatus.complete(ConnectionManager.Status.NO_TOS);
            return;
        }
        if (!EssentialConfig.INSTANCE.getEssentialEnabled()) {
            this.connectionManager.connectionStatus.complete(ConnectionManager.Status.ESSENTIAL_DISABLED);
            return;
        }
        if (this.isOpen()) {
            this.connectionManager.connectionStatus.complete(ConnectionManager.Status.ALREADY_CONNECTED);
            return;
        }
        this.lastReceivedKeepAlive = System.currentTimeMillis();
        this.loginPacket = this.connectionManager.prepareLoginAsync();
        if (this.loginPacket == null) {
            this.connectionManager.connectionStatus.complete(ConnectionManager.Status.MOJANG_UNAUTHORIZED);
            this.failedConnects = Math.max(this.failedConnects, 6);
            this.retryConnectWithBackoff();
            return;
        }
        try {
            if (this.connectedBefore) {
                super.reconnectBlocking();
            }
            else {
                SSLSocketFactory factory = new CertChain().load("isrgrootx1").load("lets-encrypt-r3").done().getSocketFactory();
                if (LegacyJre.IS_LEGACY_JRE_51 || LegacyJre.IS_LEGACY_JRE_74) {
                    Essential.logger.info("Using LegacyJreSocketFactory");
                    factory = new LegacyJreSocketFactory(factory, this.uri.getHost());
                }
                else {
                    Essential.logger.info("Using Default JreSocketFactory");
                }
                if ("wss".equals(this.uri.getScheme())) {
                    this.setSocketFactory(factory);
                }
                this.connectBlocking$27c946d(TimeUnit.SECONDS);
                this.connectedBefore = true;
                this.failedConnects = 0;
            }
        }
        catch (final Exception e) {
            this.connectedBefore = false;
            Essential.logger.error("Error when connecting to Essential ConnectionManager.", (Throwable)e);
            e.printStackTrace();
        }
        if (!this.isOpen()) {
            Essential.logger.warn("Unable to connect to a Essential Connection Manager.");
            this.connectionManager.connectionStatus.complete(ConnectionManager.Status.GENERAL_FAILURE);
            this.retryConnectWithBackoff();
            return;
        }
        Essential.logger.info("Essential Connection Manager connection established.");
    }
    
    private void retryConnectWithBackoff() {
        ++this.failedConnects;
        if (this.retryConnectionTask != null) {
            this.retryConnectionTask.cancel(true);
        }
        this.retryConnectionTask = Multithreading.schedule(this::attemptConnect, (long)Math.min(Math.pow(2.0, this.failedConnects + 3 + ThreadLocalRandom.current().nextFloat()), 128.0), TimeUnit.SECONDS);
    }
    
    @NotNull
    private String readString(@NotNull final DataInputStream dataInputStream) throws IOException {
        final byte[] bytes = new byte[dataInputStream.readInt()];
        dataInputStream.read(bytes);
        return new String(bytes, StandardCharsets.UTF_8);
    }
    
    @NotNull
    private String splitPacketPackage(@NotNull final Class<? extends Packet> packetClass) {
        return packetClass.getName().replace("gg.essential.connectionmanager.common.packet.", "");
    }
    
    public Gson getGson() {
        return this.gson;
    }
    
    private /* synthetic */ Integer lambda$send$4(final String packetName) {
        final int newId = this.packetTypeId.incrementAndGet();
        this.send(new ConnectionRegisterPacketTypeIdPacket(packetName, newId), null, null, null, null);
        return newId;
    }
    
    private /* synthetic */ void lambda$onMessage$3(final Consumer fResponseHandler, final Packet packet, final PacketHandler packetHandler) {
        if (!this.isOpen()) {
            return;
        }
        Consumer<Optional<Packet>> responseHandler = fResponseHandler;
        if (responseHandler instanceof EarlyResponseHandler) {
            try {
                responseHandler.accept(Optional.of(packet));
            }
            catch (final Throwable throwable) {
                throwable.printStackTrace();
            }
            responseHandler = null;
        }
        if (packetHandler != null) {
            try {
                packetHandler.handle(this.connectionManager, packet);
            }
            catch (final Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        if (responseHandler != null) {
            try {
                responseHandler.accept(Optional.of(packet));
            }
            catch (final Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
    
    private /* synthetic */ void lambda$new$2() {
        if (!this.isOpen()) {
            return;
        }
        final long diff = System.currentTimeMillis() - this.lastReceivedKeepAlive;
        if (diff < 60000L) {
            return;
        }
        this.close(CloseReason.SERVER_KEEP_ALIVE_TIMEOUT, diff + "ms");
    }
    
    private /* synthetic */ void lambda$new$1(final UUID key, final Pair value, final RemovalCause cause) {
        if (value != null && (RemovalCause.EXPIRED == cause || RemovalCause.SIZE == cause)) {
            final Consumer<Optional<Packet>> packetHandler = value.getRight();
            this.mainThreadExecutor.execute(() -> packetHandler.accept(Optional.empty()));
        }
    }
    
    private static /* synthetic */ void lambda$new$0(final Consumer packetHandler) {
        packetHandler.accept(Optional.empty());
    }
    
    static {
        $assertionsDisabled = !Connection.class.desiredAssertionStatus();
    }
    
    public interface EarlyResponseHandler extends Consumer<Optional<Packet>>
    {
    }
}
