package gg.essential.sps.quic.jvm;

import org.jetbrains.annotations.*;
import gg.essential.sps.quic.*;
import kotlin.jvm.internal.*;
import java.io.*;
import gg.essential.quic.*;
import java.util.function.*;
import java.time.temporal.*;
import java.time.*;
import kotlin.io.*;
import org.apache.commons.io.*;
import java.net.*;
import org.apache.logging.log4j.*;
import gg.essential.util.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000e\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   J\u001c\u0010\u000b\u001a\u00020
                                                   *\u00020\f2\u0006\u0010\r\u001a\u00020
                                                   2\u0006\u0010	\u001a\u00020
                                                   H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0011""" }, d2 = { "Lgg/essential/sps/quic/jvm/ForkedJvmServerQuicStreamPool;", "", "()V", "lazyConnector", "Lgg/essential/sps/quic/jvm/ForkedJvmServerQuicStreamPool$LazyConnector;", "accept", "Lgg/essential/sps/quic/QuicStream;", "iceSocket", "Ljava/net/DatagramSocket;", "httpPort", "", "bind", "Lgg/essential/sps/quic/jvm/ForkedJvmQuicConnector;", "tcpPort", "Companion", "LazyConnector", "Stream", "essential" })
public final class ForkedJvmServerQuicStreamPool
{
    @NotNull
    private final LazyConnector lazyConnector;
    private static final Logger LOGGER;
    
    public ForkedJvmServerQuicStreamPool() {
        super();
        this.lazyConnector = new LazyConnector();
    }
    
    private final synchronized int bind(final ForkedJvmQuicConnector $this$bind, final int tcpPort, final int httpPort) {
        $this$bind.getOutput().write(0);
        $this$bind.getOutput().writeUTF(UtilKt.getLOCALHOST().getHostAddress());
        $this$bind.getOutput().writeShort(tcpPort);
        $this$bind.getOutput().writeShort(httpPort);
        $this$bind.getOutput().flush();
        return $this$bind.getInput().readUnsignedShort();
    }
    
    @NotNull
    public final QuicStream accept(@NotNull final DatagramSocket iceSocket, final int httpPort) {
        Intrinsics.checkNotNullParameter((Object)iceSocket, "iceSocket");
        final ForkedJvmQuicConnector connector = this.lazyConnector.obtain();
        final DatagramSocket udpSocket = new DatagramSocket(0, UtilKt.getLOCALHOST());
        try {
            final Closeable closeable = new ServerSocket(0, 1, UtilKt.getLOCALHOST());
            Throwable t = null;
            try {
                final ServerSocket serverSocket = (ServerSocket)closeable;
                final int connectorPort = this.bind(connector, serverSocket.getLocalPort(), httpPort);
                ForkedJvmServerQuicStreamPool.LOGGER.debug("udp: " + udpSocket.getLocalPort() + " <> " + connectorPort + ", tcp: " + serverSocket.getLocalPort() + ", http: " + httpPort);
                udpSocket.connect(UtilKt.getLOCALHOST(), connectorPort);
                final String s = "quic\u2192ice";
                final DatagramSocket datagramSocket = udpSocket;
                final LogOnce to = LogOnce.to((Consumer)ForkedJvmServerQuicStreamPool.LOGGER::debug);
                Intrinsics.checkNotNullExpressionValue((Object)to, "to(LOGGER::debug)");
                UtilKt.forwardAsync(s, datagramSocket, iceSocket, to);
                final String s2 = "ice\u2192quic";
                final DatagramSocket datagramSocket2 = udpSocket;
                final LogOnce to2 = LogOnce.to((Consumer)ForkedJvmServerQuicStreamPool.LOGGER::debug);
                Intrinsics.checkNotNullExpressionValue((Object)to2, "to(LOGGER::debug)");
                UtilKt.forwardAsync(s2, iceSocket, datagramSocket2, to2);
                serverSocket.setSoTimeout((int)Duration.of(10L, ChronoUnit.SECONDS).toMillis());
                final Socket tcpSocket = serverSocket.accept();
                final DatagramSocket datagramSocket3 = udpSocket;
                Intrinsics.checkNotNullExpressionValue((Object)tcpSocket, "tcpSocket");
                return (QuicStream)new ForkedJvmServerQuicStreamPool.Stream(this, iceSocket, datagramSocket3, tcpSocket);
            }
            catch (final Throwable t2) {
                t = t2;
                throw t2;
            }
            finally {
                CloseableKt.closeFinally(closeable, t);
            }
        }
        catch (final Exception e) {
            IOUtils.closeQuietly(udpSocket);
            this.lazyConnector.release();
            throw e;
        }
    }
    
    public static final /* synthetic */ Logger access$getLOGGER$cp() {
        return ForkedJvmServerQuicStreamPool.LOGGER;
    }
    
    public static final /* synthetic */ LazyConnector access$getLazyConnector$p(final ForkedJvmServerQuicStreamPool $this) {
        return $this.lazyConnector;
    }
    
    static {
        new Companion((byte)0);
        LOGGER = LogManager.getLogger();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001e
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u0002
                                                       \u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006	""" }, d2 = { "Lgg/essential/sps/quic/jvm/ForkedJvmServerQuicStreamPool$LazyConnector;", "", "()V", "inner", "Lgg/essential/util/RefCounted;", "Lgg/essential/sps/quic/jvm/ForkedJvmQuicConnector;", "obtain", "release", "", "essential" })
    private static final class LazyConnector
    {
        @NotNull
        private final RefCounted<ForkedJvmQuicConnector> inner;
        
        public LazyConnector() {
            super();
            this.inner = new RefCounted<ForkedJvmQuicConnector>();
        }
        
        @NotNull
        public final ForkedJvmQuicConnector obtain() {
            return this.inner.obtain((kotlin.jvm.functions.Function0<? extends ForkedJvmQuicConnector>)ForkedJvmServerQuicStreamPool$LazyConnector$obtain.ForkedJvmServerQuicStreamPool$LazyConnector$obtain$1.INSTANCE);
        }
        
        public final void release() {
            this.inner.release((kotlin.jvm.functions.Function1<? super ForkedJvmQuicConnector, Unit>)ForkedJvmServerQuicStreamPool$LazyConnector$release.ForkedJvmServerQuicStreamPool$LazyConnector$release$1.INSTANCE);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0014
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a
                                                        \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\u0006""" }, d2 = { "Lgg/essential/sps/quic/jvm/ForkedJvmServerQuicStreamPool$Companion;", "", "()V", "LOGGER", "Lorg/apache/logging/log4j/Logger;", "kotlin.jvm.PlatformType", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
