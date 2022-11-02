package gg.essential.lib.okhttp3;

import javax.annotation.*;
import gg.essential.lib.okhttp3.internal.cache.*;
import javax.net.*;
import java.security.*;
import gg.essential.lib.okhttp3.internal.*;
import java.net.*;
import gg.essential.lib.okhttp3.internal.connection.*;
import javax.net.ssl.*;
import java.util.*;
import gg.essential.lib.okhttp3.internal.tls.*;

public class OkHttpClient implements Cloneable
{
    static final List<Protocol> DEFAULT_PROTOCOLS;
    static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS;
    final Dispatcher dispatcher;
    @Nullable
    final Proxy proxy;
    final List<Protocol> protocols;
    final List<ConnectionSpec> connectionSpecs;
    final List<Interceptor> interceptors;
    final List<Interceptor> networkInterceptors;
    final EventListener.Factory eventListenerFactory;
    final ProxySelector proxySelector;
    final CookieJar cookieJar;
    @Nullable
    final Cache cache;
    @Nullable
    final InternalCache internalCache;
    final SocketFactory socketFactory;
    @Nullable
    final SSLSocketFactory sslSocketFactory;
    @Nullable
    final CertificateChainCleaner certificateChainCleaner;
    final HostnameVerifier hostnameVerifier;
    final CertificatePinner certificatePinner;
    final Authenticator proxyAuthenticator;
    final Authenticator authenticator;
    final ConnectionPool connectionPool;
    final Dns dns;
    final boolean followSslRedirects;
    final boolean followRedirects;
    final boolean retryOnConnectionFailure;
    final int connectTimeout;
    final int readTimeout;
    final int writeTimeout;
    
    public OkHttpClient() {
        this(new Builder());
    }
    
    OkHttpClient(final Builder builder) {
        super();
        this.dispatcher = builder.dispatcher;
        this.proxy = builder.proxy;
        this.protocols = builder.protocols;
        this.connectionSpecs = builder.connectionSpecs;
        this.interceptors = Util.immutableList(builder.interceptors);
        this.networkInterceptors = Util.immutableList(builder.networkInterceptors);
        this.eventListenerFactory = builder.eventListenerFactory;
        this.proxySelector = builder.proxySelector;
        this.cookieJar = builder.cookieJar;
        this.cache = builder.cache;
        this.internalCache = builder.internalCache;
        this.socketFactory = builder.socketFactory;
        boolean isTLS = false;
        for (final ConnectionSpec spec : this.connectionSpecs) {
            isTLS = (isTLS || spec.isTls());
        }
        if (builder.sslSocketFactory != null || !isTLS) {
            this.sslSocketFactory = builder.sslSocketFactory;
            this.certificateChainCleaner = builder.certificateChainCleaner;
        }
        else {
            final X509TrustManager trustManager = this.systemDefaultTrustManager();
            this.sslSocketFactory = this.systemDefaultSslSocketFactory(trustManager);
            this.certificateChainCleaner = CertificateChainCleaner.get(trustManager);
        }
        this.hostnameVerifier = builder.hostnameVerifier;
        this.certificatePinner = builder.certificatePinner.withCertificateChainCleaner(this.certificateChainCleaner);
        this.proxyAuthenticator = builder.proxyAuthenticator;
        this.authenticator = builder.authenticator;
        this.connectionPool = builder.connectionPool;
        this.dns = builder.dns;
        this.followSslRedirects = builder.followSslRedirects;
        this.followRedirects = builder.followRedirects;
        this.retryOnConnectionFailure = builder.retryOnConnectionFailure;
        this.connectTimeout = builder.connectTimeout;
        this.readTimeout = builder.readTimeout;
        this.writeTimeout = builder.writeTimeout;
        if (this.interceptors.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.interceptors);
        }
        if (this.networkInterceptors.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.networkInterceptors);
        }
    }
    
    private X509TrustManager systemDefaultTrustManager() {
        try {
            final TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore)null);
            final TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            }
            return (X509TrustManager)trustManagers[0];
        }
        catch (final GeneralSecurityException e) {
            throw Util.assertionError("No System TLS", e);
        }
    }
    
    private SSLSocketFactory systemDefaultSslSocketFactory(final X509TrustManager trustManager) {
        try {
            final SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, new TrustManager[] { trustManager }, null);
            return sslContext.getSocketFactory();
        }
        catch (final GeneralSecurityException e) {
            throw Util.assertionError("No System TLS", e);
        }
    }
    
    public int connectTimeoutMillis() {
        return this.connectTimeout;
    }
    
    public int readTimeoutMillis() {
        return this.readTimeout;
    }
    
    public int writeTimeoutMillis() {
        return this.writeTimeout;
    }
    
    public Proxy proxy() {
        return this.proxy;
    }
    
    public ProxySelector proxySelector() {
        return this.proxySelector;
    }
    
    public CookieJar cookieJar() {
        return this.cookieJar;
    }
    
    InternalCache internalCache() {
        return (this.cache != null) ? this.cache.internalCache : this.internalCache;
    }
    
    public Dns dns() {
        return this.dns;
    }
    
    public SocketFactory socketFactory() {
        return this.socketFactory;
    }
    
    public SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }
    
    public HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }
    
    public CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }
    
    public Authenticator authenticator() {
        return this.authenticator;
    }
    
    public Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }
    
    public ConnectionPool connectionPool() {
        return this.connectionPool;
    }
    
    public boolean followSslRedirects() {
        return this.followSslRedirects;
    }
    
    public boolean followRedirects() {
        return this.followRedirects;
    }
    
    public boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }
    
    public Dispatcher dispatcher() {
        return this.dispatcher;
    }
    
    public List<Protocol> protocols() {
        return this.protocols;
    }
    
    public List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }
    
    public List<Interceptor> interceptors() {
        return this.interceptors;
    }
    
    public List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }
    
    public EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }
    
    public Call newCall(final Request request) {
        return RealCall.newRealCall(this, request, false);
    }
    
    static {
        DEFAULT_PROTOCOLS = Util.immutableList(Protocol.HTTP_2, Protocol.HTTP_1_1);
        DEFAULT_CONNECTION_SPECS = Util.immutableList(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);
        Internal.instance = new Internal() {
            OkHttpClient$1() {
                super();
            }
            
            @Override
            public void addLenient(final Headers.Builder builder, final String line) {
                builder.addLenient(line);
            }
            
            @Override
            public void addLenient(final Headers.Builder builder, final String name, final String value) {
                builder.addLenient(name, value);
            }
            
            @Override
            public boolean connectionBecameIdle(final ConnectionPool pool, final RealConnection connection) {
                return pool.connectionBecameIdle(connection);
            }
            
            @Override
            public RealConnection get(final ConnectionPool pool, final Address address, final StreamAllocation streamAllocation, final Route route) {
                return pool.get(address, streamAllocation, route);
            }
            
            @Override
            public boolean equalsNonHost(final Address a, final Address b) {
                return a.equalsNonHost(b);
            }
            
            @Override
            public Socket deduplicate(final ConnectionPool pool, final Address address, final StreamAllocation streamAllocation) {
                return pool.deduplicate(address, streamAllocation);
            }
            
            @Override
            public void put(final ConnectionPool pool, final RealConnection connection) {
                pool.put(connection);
            }
            
            @Override
            public RouteDatabase routeDatabase(final ConnectionPool connectionPool) {
                return connectionPool.routeDatabase;
            }
            
            @Override
            public int code(final Response.Builder responseBuilder) {
                return responseBuilder.code;
            }
            
            @Override
            public void apply(final ConnectionSpec tlsConfiguration, final SSLSocket sslSocket, final boolean isFallback) {
                tlsConfiguration.apply(sslSocket, isFallback);
            }
        };
    }
    
    public static final class Builder
    {
        Dispatcher dispatcher;
        @Nullable
        Proxy proxy;
        List<Protocol> protocols;
        List<ConnectionSpec> connectionSpecs;
        final List<Interceptor> interceptors;
        final List<Interceptor> networkInterceptors;
        EventListener.Factory eventListenerFactory;
        ProxySelector proxySelector;
        CookieJar cookieJar;
        @Nullable
        Cache cache;
        @Nullable
        InternalCache internalCache;
        SocketFactory socketFactory;
        @Nullable
        SSLSocketFactory sslSocketFactory;
        @Nullable
        CertificateChainCleaner certificateChainCleaner;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        Authenticator proxyAuthenticator;
        Authenticator authenticator;
        ConnectionPool connectionPool;
        Dns dns;
        boolean followSslRedirects;
        boolean followRedirects;
        boolean retryOnConnectionFailure;
        int connectTimeout;
        int readTimeout;
        int writeTimeout;
        
        public Builder() {
            super();
            this.interceptors = new ArrayList<Interceptor>();
            this.networkInterceptors = new ArrayList<Interceptor>();
            this.dispatcher = new Dispatcher();
            this.protocols = OkHttpClient.DEFAULT_PROTOCOLS;
            this.connectionSpecs = OkHttpClient.DEFAULT_CONNECTION_SPECS;
            this.eventListenerFactory = EventListener.factory(EventListener.NONE);
            this.proxySelector = ProxySelector.getDefault();
            this.cookieJar = CookieJar.NO_COOKIES;
            this.socketFactory = SocketFactory.getDefault();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.proxyAuthenticator = Authenticator.NONE;
            this.authenticator = Authenticator.NONE;
            this.connectionPool = new ConnectionPool();
            this.dns = Dns.SYSTEM;
            this.followSslRedirects = true;
            this.followRedirects = true;
            this.retryOnConnectionFailure = true;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
        }
    }
}
