package gg.essential.lib.okhttp3;

import javax.annotation.*;
import java.net.*;
import gg.essential.lib.okhttp3.internal.cache.*;
import javax.net.*;
import javax.net.ssl.*;
import java.util.*;
import gg.essential.lib.okhttp3.internal.tls.*;

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
