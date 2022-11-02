package gg.essential.lib.okhttp3.internal.platform;

import java.net.*;
import gg.essential.lib.okhttp3.internal.*;
import java.io.*;
import java.util.*;
import gg.essential.lib.okhttp3.*;
import android.util.*;
import java.security.*;
import java.lang.reflect.*;
import gg.essential.lib.okhttp3.internal.tls.*;
import java.security.cert.*;
import javax.net.ssl.*;

class AndroidPlatform extends Platform
{
    private final OptionalMethod<Socket> setUseSessionTickets;
    private final OptionalMethod<Socket> setHostname;
    private final OptionalMethod<Socket> getAlpnSelectedProtocol;
    private final OptionalMethod<Socket> setAlpnProtocols;
    private final AndroidPlatform.CloseGuard closeGuard;
    
    AndroidPlatform(final OptionalMethod<Socket> setUseSessionTickets, final OptionalMethod<Socket> setHostname, final OptionalMethod<Socket> getAlpnSelectedProtocol, final OptionalMethod<Socket> setAlpnProtocols) {
        super();
        this.closeGuard = AndroidPlatform.CloseGuard.get();
        this.setUseSessionTickets = setUseSessionTickets;
        this.setHostname = setHostname;
        this.getAlpnSelectedProtocol = getAlpnSelectedProtocol;
        this.setAlpnProtocols = setAlpnProtocols;
    }
    
    @Override
    public void connectSocket(final Socket socket, final InetSocketAddress address, final int connectTimeout) throws IOException {
        try {
            socket.connect(address, connectTimeout);
        }
        catch (final AssertionError e) {
            if (Util.isAndroidGetsocknameError(e)) {
                throw new IOException(e);
            }
            throw e;
        }
        catch (final SecurityException e2) {
            final IOException ioException = new IOException("Exception in connect");
            ioException.initCause(e2);
            throw ioException;
        }
    }
    
    @Override
    public void configureTlsExtensions(final SSLSocket sslSocket, final String hostname, final List<Protocol> protocols) {
        if (hostname != null) {
            this.setUseSessionTickets.invokeOptionalWithoutCheckedException((Object)sslSocket, new Object[] { true });
            this.setHostname.invokeOptionalWithoutCheckedException((Object)sslSocket, new Object[] { hostname });
        }
        if (this.setAlpnProtocols != null && this.setAlpnProtocols.isSupported((Object)sslSocket)) {
            final Object[] parameters = { Platform.concatLengthPrefixed(protocols) };
            this.setAlpnProtocols.invokeWithoutCheckedException((Object)sslSocket, parameters);
        }
    }
    
    @Override
    public String getSelectedProtocol(final SSLSocket socket) {
        if (this.getAlpnSelectedProtocol == null) {
            return null;
        }
        if (!this.getAlpnSelectedProtocol.isSupported((Object)socket)) {
            return null;
        }
        final byte[] alpnResult = (byte[])this.getAlpnSelectedProtocol.invokeWithoutCheckedException((Object)socket, new Object[0]);
        return (alpnResult != null) ? new String(alpnResult, Util.UTF_8) : null;
    }
    
    @Override
    public void log(final int level, String message, final Throwable t) {
        final int logLevel = (level == 5) ? 5 : 3;
        if (t != null) {
            message = message + '\n' + Log.getStackTraceString(t);
        }
        for (int i = 0, length = message.length(); i < length; ++i) {
            int newline = message.indexOf(10, i);
            newline = ((newline != -1) ? newline : length);
            do {
                final int end = Math.min(newline, i + 4000);
                Log.println(logLevel, "OkHttp", message.substring(i, end));
                i = end;
            } while (i < newline);
        }
    }
    
    @Override
    public Object getStackTraceForCloseable(final String closer) {
        return this.closeGuard.createAndOpen(closer);
    }
    
    @Override
    public void logCloseableLeak(final String message, final Object stackTrace) {
        final boolean reported = this.closeGuard.warnIfOpen(stackTrace);
        if (!reported) {
            this.log(5, message, null);
        }
    }
    
    @Override
    public boolean isCleartextTrafficPermitted(final String hostname) {
        try {
            final Class<?> networkPolicyClass = Class.forName("android.security.NetworkSecurityPolicy");
            final Method getInstanceMethod = networkPolicyClass.getMethod("getInstance", (Class<?>[])new Class[0]);
            final Object networkSecurityPolicy = getInstanceMethod.invoke(null, new Object[0]);
            return this.api24IsCleartextTrafficPermitted(hostname, networkPolicyClass, networkSecurityPolicy);
        }
        catch (final ClassNotFoundException | NoSuchMethodException ex) {
            return super.isCleartextTrafficPermitted(hostname);
        }
        catch (final IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw Util.assertionError("unable to determine cleartext support", e);
        }
    }
    
    private boolean api24IsCleartextTrafficPermitted(final String hostname, final Class<?> networkPolicyClass, final Object networkSecurityPolicy) throws InvocationTargetException, IllegalAccessException {
        try {
            final Method isCleartextTrafficPermittedMethod = networkPolicyClass.getMethod("isCleartextTrafficPermitted", String.class);
            return (boolean)isCleartextTrafficPermittedMethod.invoke(networkSecurityPolicy, hostname);
        }
        catch (final NoSuchMethodException ex) {
            return this.api23IsCleartextTrafficPermitted(hostname, networkPolicyClass, networkSecurityPolicy);
        }
    }
    
    private boolean api23IsCleartextTrafficPermitted(final String hostname, final Class<?> networkPolicyClass, final Object networkSecurityPolicy) throws InvocationTargetException, IllegalAccessException {
        try {
            final Method isCleartextTrafficPermittedMethod = networkPolicyClass.getMethod("isCleartextTrafficPermitted", (Class<?>[])new Class[0]);
            return (boolean)isCleartextTrafficPermittedMethod.invoke(networkSecurityPolicy, new Object[0]);
        }
        catch (final NoSuchMethodException ex) {
            return super.isCleartextTrafficPermitted(hostname);
        }
    }
    
    private static boolean supportsAlpn() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        }
        catch (final ClassNotFoundException ex) {
            return false;
        }
    }
    
    @Override
    public CertificateChainCleaner buildCertificateChainCleaner(final X509TrustManager trustManager) {
        try {
            final Class<?> extensionsClass = Class.forName("android.net.http.X509TrustManagerExtensions");
            final Constructor<?> constructor = extensionsClass.getConstructor(X509TrustManager.class);
            final Object extensions = constructor.newInstance(trustManager);
            final Method checkServerTrusted = extensionsClass.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
            return new AndroidCertificateChainCleaner(extensions, checkServerTrusted);
        }
        catch (final Exception ex) {
            return super.buildCertificateChainCleaner(trustManager);
        }
    }
    
    public static Platform buildIfSupported() {
        try {
            try {
                Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            }
            catch (final ClassNotFoundException ex) {
                Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            final OptionalMethod<Socket> setUseSessionTickets = (OptionalMethod<Socket>)new OptionalMethod((Class)null, "setUseSessionTickets", new Class[] { Boolean.TYPE });
            final OptionalMethod<Socket> setHostname = (OptionalMethod<Socket>)new OptionalMethod((Class)null, "setHostname", new Class[] { String.class });
            OptionalMethod<Socket> getAlpnSelectedProtocol = null;
            OptionalMethod<Socket> setAlpnProtocols = null;
            if (supportsAlpn()) {
                getAlpnSelectedProtocol = (OptionalMethod<Socket>)new OptionalMethod((Class)byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                setAlpnProtocols = (OptionalMethod<Socket>)new OptionalMethod((Class)null, "setAlpnProtocols", new Class[] { byte[].class });
            }
            return new AndroidPlatform(setUseSessionTickets, setHostname, getAlpnSelectedProtocol, setAlpnProtocols);
        }
        catch (final ClassNotFoundException ex2) {
            return null;
        }
    }
    
    @Override
    public TrustRootIndex buildTrustRootIndex(final X509TrustManager trustManager) {
        try {
            final Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            return (TrustRootIndex)new AndroidPlatform.AndroidTrustRootIndex(trustManager, method);
        }
        catch (final NoSuchMethodException ex) {
            return super.buildTrustRootIndex(trustManager);
        }
    }
    
    static final class AndroidCertificateChainCleaner extends CertificateChainCleaner
    {
        private final Object x509TrustManagerExtensions;
        private final Method checkServerTrusted;
        
        AndroidCertificateChainCleaner(final Object x509TrustManagerExtensions, final Method checkServerTrusted) {
            super();
            this.x509TrustManagerExtensions = x509TrustManagerExtensions;
            this.checkServerTrusted = checkServerTrusted;
        }
        
        @Override
        public List<Certificate> clean(final List<Certificate> chain, final String hostname) throws SSLPeerUnverifiedException {
            try {
                final X509Certificate[] certificates = chain.toArray(new X509Certificate[chain.size()]);
                return (List)this.checkServerTrusted.invoke(this.x509TrustManagerExtensions, certificates, "RSA", hostname);
            }
            catch (final InvocationTargetException e) {
                final SSLPeerUnverifiedException exception = new SSLPeerUnverifiedException(e.getMessage());
                exception.initCause(e);
                throw exception;
            }
            catch (final IllegalAccessException e2) {
                throw new AssertionError((Object)e2);
            }
        }
        
        @Override
        public boolean equals(final Object other) {
            return other instanceof AndroidCertificateChainCleaner;
        }
        
        @Override
        public int hashCode() {
            return 0;
        }
    }
}
