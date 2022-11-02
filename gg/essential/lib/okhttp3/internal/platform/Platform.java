package gg.essential.lib.okhttp3.internal.platform;

import java.net.*;
import java.io.*;
import java.util.logging.*;
import java.util.*;
import javax.net.ssl.*;
import gg.essential.lib.okio.*;
import gg.essential.lib.okhttp3.internal.tls.*;
import gg.essential.lib.okhttp3.*;

public class Platform
{
    private static final Platform PLATFORM;
    private static final Logger logger;
    
    public Platform() {
        super();
    }
    
    public static Platform get() {
        return Platform.PLATFORM;
    }
    
    public void configureTlsExtensions(final SSLSocket sslSocket, final String hostname, final List<Protocol> protocols) {
    }
    
    public void afterHandshake(final SSLSocket sslSocket) {
    }
    
    public String getSelectedProtocol(final SSLSocket socket) {
        return null;
    }
    
    public void connectSocket(final Socket socket, final InetSocketAddress address, final int connectTimeout) throws IOException {
        socket.connect(address, connectTimeout);
    }
    
    public void log(final int level, final String message, final Throwable t) {
        final Level logLevel = (level == 5) ? Level.WARNING : Level.INFO;
        Platform.logger.log(logLevel, message, t);
    }
    
    public boolean isCleartextTrafficPermitted(final String hostname) {
        return true;
    }
    
    public Object getStackTraceForCloseable(final String closer) {
        if (Platform.logger.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }
    
    public void logCloseableLeak(String message, final Object stackTrace) {
        if (stackTrace == null) {
            message += " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        this.log(5, message, (Throwable)stackTrace);
    }
    
    public static List<String> alpnProtocolNames(final List<Protocol> protocols) {
        final List<String> names = new ArrayList<String>(protocols.size());
        for (int i = 0, size = protocols.size(); i < size; ++i) {
            final Protocol protocol = protocols.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                names.add(protocol.toString());
            }
        }
        return names;
    }
    
    public CertificateChainCleaner buildCertificateChainCleaner(final X509TrustManager trustManager) {
        return new BasicCertificateChainCleaner(this.buildTrustRootIndex(trustManager));
    }
    
    private static Platform findPlatform() {
        final Platform android = AndroidPlatform.buildIfSupported();
        if (android != null) {
            return android;
        }
        final Platform jdk9 = Jdk9Platform.buildIfSupported();
        if (jdk9 != null) {
            return jdk9;
        }
        final Platform jdkWithJettyBoot = JdkWithJettyBootPlatform.buildIfSupported();
        if (jdkWithJettyBoot != null) {
            return jdkWithJettyBoot;
        }
        return new Platform();
    }
    
    static byte[] concatLengthPrefixed(final List<Protocol> protocols) {
        final Buffer result = new Buffer();
        for (int i = 0, size = protocols.size(); i < size; ++i) {
            final Protocol protocol = protocols.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                result.writeByte(protocol.toString().length());
                result.writeUtf8(protocol.toString());
            }
        }
        return result.readByteArray();
    }
    
    public TrustRootIndex buildTrustRootIndex(final X509TrustManager trustManager) {
        return new BasicTrustRootIndex(trustManager.getAcceptedIssuers());
    }
    
    static {
        PLATFORM = findPlatform();
        logger = Logger.getLogger(OkHttpClient.class.getName());
    }
}
