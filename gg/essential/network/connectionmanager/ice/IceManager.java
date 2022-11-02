package gg.essential.network.connectionmanager.ice;

import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import com.google.common.util.concurrent.*;
import java.lang.reflect.*;
import gg.essential.network.connectionmanager.sps.*;
import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.ice.*;
import gg.essential.network.connectionmanager.ice.handler.*;
import gg.essential.lib.jitsi.utils.logging2.*;
import java.beans.*;
import gg.essential.lib.ice4j.*;
import java.io.*;
import gg.essential.lib.ice4j.pseudotcp.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.api.utils.*;
import gg.essential.lib.ice4j.ice.harvest.*;
import gg.essential.sps.quic.jvm.*;
import gg.essential.sps.quic.*;
import gg.essential.network.connectionmanager.ice.netty.*;
import io.netty.channel.*;
import io.netty.channel.local.*;
import net.minecraft.client.*;
import gg.essential.sps.*;
import gg.essential.mixins.ext.network.*;
import io.netty.bootstrap.*;
import gg.essential.util.*;
import net.minecraft.server.*;
import net.minecraft.server.integrated.*;
import java.util.concurrent.atomic.*;
import gg.essential.quic.*;
import java.net.*;
import gg.essential.lib.ice4j.socket.*;
import gg.essential.network.connectionmanager.ice.util.*;
import java.util.concurrent.*;
import gg.essential.lib.ice4j.ice.*;
import java.util.*;
import org.apache.logging.log4j.*;
import gg.essential.universal.*;
import kotlin.*;
import java.util.function.*;

public class IceManager implements NetworkedManager
{
    private static final Logger LOGGER;
    public static final String[] STUN_HOSTS;
    public static final String[] TURN_HOSTS;
    private static final boolean SUPPORTS_QUIC;
    public static final Lazy<EventLoopGroup> ICE_SERVER_EVENT_LOOP_GROUP;
    public static final Lazy<EventLoopGroup> ICE_CLIENT_EVENT_LOOP_GROUP;
    private static final ForkedJvmServerQuicStreamPool QUIC_SERVER_POOL;
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final Map<UUID, IceManager.IceConnection> connections;
    private int integratedServerVoicePort;
    private Integer proxyHttpPort;
    
    private static EventLoopGroup makeIceEventLoopGroup(final boolean server) {
        final ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("Netty " + (server ? "Server" : "Client") + " IO ICE #%d").setDaemon(true).build();
        return (EventLoopGroup)new DefaultEventLoopGroup(0, threadFactory);
    }
    
    private static void bypassSocketLimit() {
        if (System.getSecurityManager() == null) {
            IceManager.LOGGER.debug("No security manager installed, no need to bypass datagram socket limit.");
            return;
        }
        try {
            final Class<?> resourceManagerClass = Class.forName("sun.net.ResourceManager");
            final Field numSocketsField = resourceManagerClass.getDeclaredField("numSockets");
            numSocketsField.setAccessible(true);
            final AtomicInteger numSockets = (AtomicInteger)numSocketsField.get(null);
            numSockets.addAndGet(-1000);
        }
        catch (final Throwable t) {
            IceManager.LOGGER.warn("Failed to bypass datagram socket limit:", t);
        }
    }
    
    public IceManager(@NotNull final ConnectionManager connectionManager, @NotNull final SPSManager spsManager) {
        super();
        this.connections = new ConcurrentHashMap<UUID, IceManager.IceConnection>();
        (this.connectionManager = connectionManager).registerPacketHandler(IceSessionPacket.class, new IceSessionPacketHandler(this, spsManager));
        connectionManager.registerPacketHandler(IceCandidatePacket.class, new IceCandidatePacketHandler(this));
    }
    
    public IceManager.IceConnection getConnection(final UUID remote) {
        return this.connections.get(remote);
    }
    
    public void setVoicePort(final int voicePort) {
        this.integratedServerVoicePort = voicePort;
    }
    
    public Integer getProxyHttpPort() {
        return this.proxyHttpPort;
    }
    
    private Agent createAgent(final UUID user, final boolean client) {
        String flags = IceManager.SUPPORTS_QUIC ? "q" : "";
        if (!client) {
            flags = flags + "v" + this.integratedServerVoicePort;
        }
        final Agent agent = new Agent("essential-" + flags, (gg.essential.lib.jitsi.utils.logging2.Logger)new LoggerImpl("ice4j-" + user));
        agent.setTrickling(true);
        agent.setControlling(client);
        if (!Boolean.getBoolean("essential.sps.legacy-nomination")) {
            agent.setNominationStrategy(NominationStrategy.NONE);
            agent.addStateChangeListener((PropertyChangeListener)new NominateBestRTT());
        }
        else {
            agent.setNominationStrategy(NominationStrategy.NOMINATE_FIRST_HOST_OR_REFLEXIVE_VALID);
        }
        for (final String stunHost : IceManager.STUN_HOSTS) {
            agent.addCandidateHarvester((CandidateHarvester)new StunCandidateHarvester(new TransportAddress(stunHost, 3478, Transport.UDP)));
        }
        agent.addCandidateHarvester((CandidateHarvester)new UPNPHarvester());
        for (final String turnHost : IceManager.TURN_HOSTS) {
            agent.addCandidateHarvester((CandidateHarvester)new TurnCandidateHarvester(new TransportAddress(turnHost, 3478, Transport.UDP)));
        }
        return agent;
    }
    
    private Component createComponent(final Agent agent, final IceMediaStream mediaStream) {
        try {
            return agent.createComponent(mediaStream, KeepAliveStrategy.SELECTED_ONLY, true);
        }
        catch (final IOException e) {
            IceManager.LOGGER.error("Failed to create component:", (Throwable)e);
            return null;
        }
    }
    
    private PseudoTcpSocket createPseudoTcpSocket(final DatagramSocket datagramSocket) throws IOException {
        try {
            return new PseudoTcpSocketFactory().createSocket(datagramSocket);
        }
        catch (final SocketException e) {
            IceManager.LOGGER.error("Failed to create ICE pseudo tcp socket:", (Throwable)e);
            throw new IOException("ICE setup failed. Contact support.");
        }
    }
    
    private IceManager.IceConnection setupAgent(final UUID user, final boolean client, final Consumer<IceMediaStream> configureMediaStream) {
        final Agent agent = this.createAgent(user, client);
        final IceMediaStream mediaStream = agent.createMediaStream("minecraft");
        configureMediaStream.accept(mediaStream);
        final Component component = this.createComponent(agent, mediaStream);
        if (component == null) {
            freeSafely(agent);
            return null;
        }
        final IceManager.IceConnection connection = new IceManager.IceConnection(client, agent, mediaStream, component);
        final IceManager.IceConnection oldConnection = this.connections.put(user, connection);
        if (oldConnection != null) {
            freeSafely(oldConnection.agent);
        }
        this.connectionManager.send(new IceSessionPacket(user, agent.getLocalUfrag(), agent.getLocalPassword()));
        Multithreading.getScheduledPool().execute(() -> {
            final TrickleCallback trickleCallback = candidates -> {
                for (final LocalCandidate candidate : candidates) {
                    final String str = CandidateUtil.candidateToString(candidate);
                    IceManager.LOGGER.debug("New local candidate for {}: {}", (Object)user, (Object)str);
                    this.connectionManager.send(new IceCandidatePacket(user, str));
                }
            };
            trickleCallback.onIceCandidates((Collection)component.getLocalCandidates());
            agent.startCandidateTrickle(trickleCallback);
            return;
        });
        return connection;
    }
    
    public SocketAddress createClientAgent(final UUID user) throws IOException {
        IceManager.LOGGER.debug("Creating client-side ICE agent for {}", (Object)user);
        final IceManager.IceConnection connection = this.setupAgent(user, true, mediaStream -> {});
        if (connection == null) {
            throw new IOException("ICE setup failed. Contact support.");
        }
        try {
            connection.iceReadyFuture.join();
        }
        catch (final CompletionException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof final IOException ex) {
                throw ex;
            }
            throw e;
        }
        ChannelInitializer<LocalChannel> channelInitializer;
        try {
            final TransportAddress remoteAddress = connection.getSelectedRemoteAddress();
            final MultiplexingDatagramSocket iceSocket = connection.component.getSocket();
            iceSocket.connect(remoteAddress.getAddress(), remoteAddress.getPort());
            this.setupVoiceMultiplexing(iceSocket, false, connection.getVoicePort());
            if (connection.isQuic()) {
                final ForkedJvmClientQuicStream quicStream = new ForkedJvmClientQuicStream((DatagramSocket)iceSocket);
                channelInitializer = new QuicStreamChannelInitializer((QuicStream)quicStream, user);
                this.proxyHttpPort = quicStream.getHttpPort();
            }
            else {
                final PseudoTcpSocket tcpSocket = this.createPseudoTcpSocket(iceSocket);
                tcpSocket.connect((SocketAddress)remoteAddress, 10000);
                channelInitializer = new PseudoTcpChannelInitializer(tcpSocket, user);
                this.proxyHttpPort = null;
            }
        }
        catch (final IOException e2) {
            freeSafely(connection.agent);
            throw e2;
        }
        return ((ServerBootstrap)((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel((Class)LocalServerChannel.class)).handler((ChannelHandler)new CloseAfterFirstMessage())).childHandler((ChannelHandler)channelInitializer).group((EventLoopGroup)IceManager.ICE_CLIENT_EVENT_LOOP_GROUP.getValue()).localAddress((SocketAddress)LocalAddress.ANY)).bind().syncUninterruptibly().channel().localAddress();
    }
    
    public void createServerAgent(final UUID user, final String ufrag, final String password) {
        IceManager.LOGGER.debug("Creating server-side ICE agent at request from {} (ufrag: {}, pwd: {})", (Object)user, (Object)ufrag, (Object)password);
        final IceManager.IceConnection connection = this.setupAgent(user, false, mediaStream -> {
            mediaStream.setRemoteUfrag(ufrag);
            mediaStream.setRemotePassword(password);
            return;
        });
        if (connection == null) {
            return;
        }
        final IntegratedServer server = MinecraftClient.getInstance().getServer();
        if (server == null) {
            IceManager.LOGGER.error("Tried to register ICE socket but server was not running!");
            freeSafely(connection.agent);
            return;
        }
        connection.startConnectivityChecks();
        ExtensionsKt.logExceptions(connection.iceReadyFuture.thenComposeAsync(__ -> {
            final CompletableFuture<QuicStreamChannelInitializer> future = new CompletableFuture<QuicStreamChannelInitializer>();
            try {
                final TransportAddress remoteAddress = connection.getSelectedRemoteAddress();
                final MultiplexingDatagramSocket iceSocket = connection.component.getSocket();
                iceSocket.connect(remoteAddress.getAddress(), remoteAddress.getPort());
                this.setupVoiceMultiplexing(iceSocket, true, this.integratedServerVoicePort);
                int httpPort = 9;
                final Integer maybeHttpPort = ResourcePackSharingHttpServer.INSTANCE.getPort();
                if (maybeHttpPort != null) {
                    httpPort = maybeHttpPort;
                }
                if (connection.isQuic()) {
                    final QuicStream quicStream = IceManager.QUIC_SERVER_POOL.accept(iceSocket, httpPort);
                    future.complete(new QuicStreamChannelInitializer(quicStream, user));
                }
                else {
                    final PseudoTcpSocket tcpSocket = this.createPseudoTcpSocket(iceSocket);
                    tcpSocket.accept((SocketAddress)remoteAddress, 10000);
                    future.complete((QuicStreamChannelInitializer)new PseudoTcpChannelInitializer(tcpSocket, user));
                }
            }
            catch (final Exception e) {
                future.completeExceptionally(e);
            }
            return (CompletableFuture<ChannelInitializer<LocalChannel>>)future;
        }, (Executor)IceManager.ICE_SERVER_EVENT_LOOP_GROUP.getValue()).thenAcceptAsync(channelInitializer -> {
            final SocketAddress iceEndpoint = NetworkSystemExtKt.getIceEndpoint(server.method_3787());
            ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)IceManager.ICE_SERVER_EVENT_LOOP_GROUP.getValue())).handler((ChannelHandler)channelInitializer)).channel((Class)LocalChannel.class)).connect(iceEndpoint);
        }, (Executor)ExtensionsKt.getExecutor((MinecraftServer)server)));
    }
    
    private void setupVoiceMultiplexing(final MultiplexingDatagramSocket iceSocket, final boolean server, final int voicePort) throws SocketException {
        DatagramSocket realVoiceSocket;
        AtomicReference<SocketAddress> remoteAddress;
        if (server) {
            realVoiceSocket = new DatagramSocket(0);
            remoteAddress = new AtomicReference<SocketAddress>(new InetSocketAddress(InetAddress.getLoopbackAddress(), voicePort));
        }
        else {
            try {
                realVoiceSocket = new DatagramSocket(voicePort);
            }
            catch (final SocketException e) {
                IceManager.LOGGER.error("Failed to allocate port for voice chat forwarding:", (Throwable)e);
                return;
            }
            remoteAddress = new AtomicReference<SocketAddress>(null);
        }
        final Logger logger = IceManager.LOGGER;
        Objects.requireNonNull(logger);
        final LogOnce debugOnce = LogOnce.to((Consumer)logger::debug);
        final MultiplexedDatagramSocket iceVoiceSocket = iceSocket.getSocket(datagramPacket -> {
            final byte[] data = datagramPacket.getData();
            return data.length >= 1 && data[0] == 16;
        });
        final Thread inboundThread = new Thread(() -> {
            try {
                while (!iceVoiceSocket.isClosed() && !realVoiceSocket.isClosed()) {
                    final byte[] buf = new byte[65535];
                    final DatagramPacket packet = new DatagramPacket(buf, 65535);
                    iceVoiceSocket.receive(packet);
                    debugOnce.log("inbound", (Object)packet.getLength());
                    packet.setData(buf, 1, packet.getLength() - 1);
                    packet.setSocketAddress(remoteAddress.get());
                    realVoiceSocket.send(packet);
                }
            }
            catch (final IOException e2) {
                debugOnce.log("inboundException", (Object)e2);
                if (!iceVoiceSocket.isClosed() && !realVoiceSocket.isClosed() && !(e2 instanceof PortUnreachableException)) {
                    e2.printStackTrace();
                }
            }
            return;
        }, "ice voice inbound");
        inboundThread.setDaemon(true);
        inboundThread.start();
        final Thread outboundThread = new Thread(() -> {
            try {
                while (!iceVoiceSocket.isClosed() && !realVoiceSocket.isClosed()) {
                    final byte[] buf2 = new byte[65535];
                    final DatagramPacket packet2 = new DatagramPacket(buf2, 1, 65534);
                    realVoiceSocket.receive(packet2);
                    debugOnce.log("outbound", (Object)packet2.getLength());
                    if (!server) {
                        remoteAddress.set(packet2.getSocketAddress());
                    }
                    buf2[0] = 16;
                    packet2.setData(buf2, 0, packet2.getLength() + 1);
                    packet2.setSocketAddress(iceVoiceSocket.getRemoteSocketAddress());
                    iceVoiceSocket.send(packet2);
                }
            }
            catch (final IOException e3) {
                debugOnce.log("outboundException", (Object)e3);
                if (!iceVoiceSocket.isClosed() && !realVoiceSocket.isClosed() && !(e3 instanceof PortUnreachableException)) {
                    e3.printStackTrace();
                }
            }
            return;
        }, "ice voice outbound");
        outboundThread.setDaemon(true);
        outboundThread.start();
    }
    
    public void addRemoteCandidate(final UUID user, final String candidateStr) {
        IceManager.LOGGER.debug("New remote candidate from {}: {}", (Object)user, (Object)candidateStr);
        final IceManager.IceConnection connection = this.connections.get(user);
        if (connection == null) {
            IceManager.LOGGER.debug("Ignoring candidate from {} because they have no active session.", (Object)user);
            return;
        }
        final RemoteCandidate candidate = CandidateUtil.candidateFromString(candidateStr, connection.component);
        if (candidate == null) {
            return;
        }
        Multithreading.runAsync(() -> {
            connection.component.addUpdateRemoteCandidates(candidate);
            connection.component.updateRemoteCandidates();
        });
    }
    
    private static String[] getCommaSeparatedStrings(final String property, final String[] defaults) {
        final String str = System.getProperty(property);
        return (str != null) ? str.split(",") : defaults;
    }
    
    private static void freeSafely(final Agent agent) {
        try {
            agent.free();
        }
        catch (final Exception e) {
            e.printStackTrace();
        }
    }
    
    private static /* synthetic */ void lambda$addRemoteCandidate$11(final IceManager.IceConnection connection, final RemoteCandidate candidate) {
        connection.component.addUpdateRemoteCandidates(candidate);
        connection.component.updateRemoteCandidates();
    }
    
    private static /* synthetic */ void lambda$setupVoiceMultiplexing$10(final MultiplexedDatagramSocket iceVoiceSocket, final DatagramSocket realVoiceSocket, final LogOnce debugOnce, final boolean server, final AtomicReference remoteAddress) {
        try {
            while (!iceVoiceSocket.isClosed() && !realVoiceSocket.isClosed()) {
                final byte[] buf = new byte[65535];
                final DatagramPacket packet = new DatagramPacket(buf, 1, 65534);
                realVoiceSocket.receive(packet);
                debugOnce.log("outbound", (Object)packet.getLength());
                if (!server) {
                    remoteAddress.set(packet.getSocketAddress());
                }
                buf[0] = 16;
                packet.setData(buf, 0, packet.getLength() + 1);
                packet.setSocketAddress(iceVoiceSocket.getRemoteSocketAddress());
                iceVoiceSocket.send(packet);
            }
        }
        catch (final IOException e) {
            debugOnce.log("outboundException", (Object)e);
            if (!iceVoiceSocket.isClosed() && !realVoiceSocket.isClosed() && !(e instanceof PortUnreachableException)) {
                e.printStackTrace();
            }
        }
    }
    
    private static /* synthetic */ void lambda$setupVoiceMultiplexing$9(final MultiplexedDatagramSocket iceVoiceSocket, final DatagramSocket realVoiceSocket, final LogOnce debugOnce, final AtomicReference remoteAddress) {
        try {
            while (!iceVoiceSocket.isClosed() && !realVoiceSocket.isClosed()) {
                final byte[] buf = new byte[65535];
                final DatagramPacket packet = new DatagramPacket(buf, 65535);
                iceVoiceSocket.receive(packet);
                debugOnce.log("inbound", (Object)packet.getLength());
                packet.setData(buf, 1, packet.getLength() - 1);
                packet.setSocketAddress(remoteAddress.get());
                realVoiceSocket.send(packet);
            }
        }
        catch (final IOException e) {
            debugOnce.log("inboundException", (Object)e);
            if (!iceVoiceSocket.isClosed() && !realVoiceSocket.isClosed() && !(e instanceof PortUnreachableException)) {
                e.printStackTrace();
            }
        }
    }
    
    private static /* synthetic */ boolean lambda$setupVoiceMultiplexing$8(final DatagramPacket datagramPacket) {
        final byte[] data = datagramPacket.getData();
        return data.length >= 1 && data[0] == 16;
    }
    
    private static /* synthetic */ void lambda$createServerAgent$7(final IntegratedServer server, final ChannelInitializer channelInitializer) {
        final SocketAddress iceEndpoint = NetworkSystemExtKt.getIceEndpoint(server.method_3787());
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)IceManager.ICE_SERVER_EVENT_LOOP_GROUP.getValue())).handler((ChannelHandler)channelInitializer)).channel((Class)LocalChannel.class)).connect(iceEndpoint);
    }
    
    private /* synthetic */ CompletionStage lambda$createServerAgent$6(final IceManager.IceConnection connection, final UUID user, final Void __) {
        final CompletableFuture<ChannelInitializer<LocalChannel>> future = new CompletableFuture<ChannelInitializer<LocalChannel>>();
        try {
            final TransportAddress remoteAddress = connection.getSelectedRemoteAddress();
            final MultiplexingDatagramSocket iceSocket = connection.component.getSocket();
            iceSocket.connect(remoteAddress.getAddress(), remoteAddress.getPort());
            this.setupVoiceMultiplexing(iceSocket, true, this.integratedServerVoicePort);
            int httpPort = 9;
            final Integer maybeHttpPort = ResourcePackSharingHttpServer.INSTANCE.getPort();
            if (maybeHttpPort != null) {
                httpPort = maybeHttpPort;
            }
            if (connection.isQuic()) {
                final QuicStream quicStream = IceManager.QUIC_SERVER_POOL.accept(iceSocket, httpPort);
                future.complete(new QuicStreamChannelInitializer(quicStream, user));
            }
            else {
                final PseudoTcpSocket tcpSocket = this.createPseudoTcpSocket(iceSocket);
                tcpSocket.accept((SocketAddress)remoteAddress, 10000);
                future.complete(new PseudoTcpChannelInitializer(tcpSocket, user));
            }
        }
        catch (final Exception e) {
            future.completeExceptionally(e);
        }
        return future;
    }
    
    private static /* synthetic */ void lambda$createServerAgent$5(final String ufrag, final String password, final IceMediaStream mediaStream) {
        mediaStream.setRemoteUfrag(ufrag);
        mediaStream.setRemotePassword(password);
    }
    
    private static /* synthetic */ void lambda$createClientAgent$4(final IceMediaStream mediaStream) {
    }
    
    private /* synthetic */ void lambda$setupAgent$3(final UUID user, final Component component, final Agent agent) {
        final TrickleCallback trickleCallback = candidates -> {
            for (final LocalCandidate candidate : candidates) {
                final String str = CandidateUtil.candidateToString(candidate);
                IceManager.LOGGER.debug("New local candidate for {}: {}", (Object)user, (Object)str);
                this.connectionManager.send(new IceCandidatePacket(user, str));
            }
        };
        trickleCallback.onIceCandidates((Collection)component.getLocalCandidates());
        agent.startCandidateTrickle(trickleCallback);
    }
    
    private /* synthetic */ void lambda$setupAgent$2(final UUID user, final Collection candidates) {
        for (final LocalCandidate candidate : candidates) {
            final String str = CandidateUtil.candidateToString(candidate);
            IceManager.LOGGER.debug("New local candidate for {}: {}", (Object)user, (Object)str);
            this.connectionManager.send(new IceCandidatePacket(user, str));
        }
    }
    
    private static /* synthetic */ EventLoopGroup lambda$static$1() {
        return makeIceEventLoopGroup(false);
    }
    
    private static /* synthetic */ EventLoopGroup lambda$static$0() {
        return makeIceEventLoopGroup(true);
    }
    
    static {
        LOGGER = LogManager.getLogger((Class)IceManager.class);
        STUN_HOSTS = getCommaSeparatedStrings("essential.sps.stun_hosts", new String[] { "us.stun.essential.gg", "eu.stun.essential.gg" });
        TURN_HOSTS = getCommaSeparatedStrings("essential.sps.turn_hosts", new String[] { "us.turn.essential.gg", "eu.turn.essential.gg" });
        final String property = System.getProperty("essential.sps.quic");
        if (property != null) {
            SUPPORTS_QUIC = Boolean.parseBoolean(property);
            IceManager.LOGGER.info("Explicitly {} QUIC for SPS.", (Object)(IceManager.SUPPORTS_QUIC ? "enabled" : "disabled"));
        }
        else {
            final String arch = System.getProperty("os.arch");
            if (!(SUPPORTS_QUIC = ("amd64".equals(arch) || (UMinecraft.isRunningOnMac && ("aarch64".equals(arch) || "x86_64".equals(arch)))))) {
                IceManager.LOGGER.warn("Disabling QUIC for SPS because OS architecure ({}) is unsupported. This may result in slow connections under certain circumstances. Try reducing the server render distance in these cases.", (Object)arch);
            }
        }
        ICE_SERVER_EVENT_LOOP_GROUP = LazyKt.lazy(() -> makeIceEventLoopGroup(true));
        ICE_CLIENT_EVENT_LOOP_GROUP = LazyKt.lazy(() -> makeIceEventLoopGroup(false));
        QUIC_SERVER_POOL = new ForkedJvmServerQuicStreamPool();
        bypassSocketLimit();
        try {
            final Function<String, java.util.logging.Logger> loggerFactory = (Function<String, java.util.logging.Logger>)Log4jAsJulLogger::new;
            final Field loggerFactoryField = LoggerImpl.class.getDeclaredField("loggerFactory");
            loggerFactoryField.setAccessible(true);
            loggerFactoryField.set(null, loggerFactory);
        }
        catch (final NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        if (System.getProperty("gg.essential.lib.ice4j.MAX_CTRAN_RETRANS_TIMER") == null) {
            System.setProperty("gg.essential.lib.ice4j.MAX_CTRAN_RETRANS_TIMER", String.valueOf(1600));
        }
        if (System.getProperty("gg.essential.lib.ice4j.MAX_RETRANSMISSIONS") == null) {
            System.setProperty("gg.essential.lib.ice4j.MAX_RETRANSMISSIONS", String.valueOf(6));
        }
    }
}
