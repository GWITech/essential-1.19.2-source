package gg.essential.lib.okhttp3;

import javax.annotation.*;
import javax.net.ssl.*;
import gg.essential.lib.okhttp3.internal.*;
import java.util.*;

public final class ConnectionSpec
{
    private static final CipherSuite[] APPROVED_CIPHER_SUITES;
    public static final ConnectionSpec MODERN_TLS;
    public static final ConnectionSpec CLEARTEXT;
    final boolean tls;
    final boolean supportsTlsExtensions;
    @Nullable
    final String[] cipherSuites;
    @Nullable
    final String[] tlsVersions;
    
    ConnectionSpec(final Builder builder) {
        super();
        this.tls = builder.tls;
        this.cipherSuites = builder.cipherSuites;
        this.tlsVersions = builder.tlsVersions;
        this.supportsTlsExtensions = builder.supportsTlsExtensions;
    }
    
    public boolean isTls() {
        return this.tls;
    }
    
    @Nullable
    public List<CipherSuite> cipherSuites() {
        return (this.cipherSuites != null) ? CipherSuite.forJavaNames(this.cipherSuites) : null;
    }
    
    @Nullable
    public List<TlsVersion> tlsVersions() {
        return (this.tlsVersions != null) ? TlsVersion.forJavaNames(this.tlsVersions) : null;
    }
    
    public boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }
    
    void apply(final SSLSocket sslSocket, final boolean isFallback) {
        final ConnectionSpec specToApply = this.supportedSpec(sslSocket, isFallback);
        if (specToApply.tlsVersions != null) {
            sslSocket.setEnabledProtocols(specToApply.tlsVersions);
        }
        if (specToApply.cipherSuites != null) {
            sslSocket.setEnabledCipherSuites(specToApply.cipherSuites);
        }
    }
    
    private ConnectionSpec supportedSpec(final SSLSocket sslSocket, final boolean isFallback) {
        String[] cipherSuitesIntersection = (this.cipherSuites != null) ? Util.intersect(CipherSuite.ORDER_BY_NAME, sslSocket.getEnabledCipherSuites(), this.cipherSuites) : sslSocket.getEnabledCipherSuites();
        final String[] tlsVersionsIntersection = (this.tlsVersions != null) ? Util.intersect(Util.NATURAL_ORDER, sslSocket.getEnabledProtocols(), this.tlsVersions) : sslSocket.getEnabledProtocols();
        final String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        final int indexOfFallbackScsv = Util.indexOf(CipherSuite.ORDER_BY_NAME, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (isFallback && indexOfFallbackScsv != -1) {
            cipherSuitesIntersection = Util.concat(cipherSuitesIntersection, supportedCipherSuites[indexOfFallbackScsv]);
        }
        return new Builder(this).cipherSuites(cipherSuitesIntersection).tlsVersions(tlsVersionsIntersection).build();
    }
    
    public boolean isCompatible(final SSLSocket socket) {
        return this.tls && (this.tlsVersions == null || Util.nonEmptyIntersection(Util.NATURAL_ORDER, this.tlsVersions, socket.getEnabledProtocols())) && (this.cipherSuites == null || Util.nonEmptyIntersection(CipherSuite.ORDER_BY_NAME, this.cipherSuites, socket.getEnabledCipherSuites()));
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (!(other instanceof ConnectionSpec)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        final ConnectionSpec that = (ConnectionSpec)other;
        if (this.tls != that.tls) {
            return false;
        }
        if (this.tls) {
            if (!Arrays.equals(this.cipherSuites, that.cipherSuites)) {
                return false;
            }
            if (!Arrays.equals(this.tlsVersions, that.tlsVersions)) {
                return false;
            }
            if (this.supportsTlsExtensions != that.supportsTlsExtensions) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int result = 17;
        if (this.tls) {
            result = 527 + Arrays.hashCode(this.cipherSuites);
            result = 31 * result + Arrays.hashCode(this.tlsVersions);
            result = 31 * result + (this.supportsTlsExtensions ? 0 : 1);
        }
        return result;
    }
    
    @Override
    public String toString() {
        if (!this.tls) {
            return "ConnectionSpec()";
        }
        final String cipherSuitesString = (this.cipherSuites != null) ? this.cipherSuites().toString() : "[all enabled]";
        final String tlsVersionsString = (this.tlsVersions != null) ? this.tlsVersions().toString() : "[all enabled]";
        return "ConnectionSpec(cipherSuites=" + cipherSuitesString + ", tlsVersions=" + tlsVersionsString + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ")";
    }
    
    static {
        APPROVED_CIPHER_SUITES = new CipherSuite[] { CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA };
        MODERN_TLS = new Builder(true).cipherSuites(ConnectionSpec.APPROVED_CIPHER_SUITES).tlsVersions(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).supportsTlsExtensions$260aee36().build();
        new Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_0).supportsTlsExtensions$260aee36().build();
        CLEARTEXT = new Builder(false).build();
    }
    
    public static final class Builder
    {
        boolean tls;
        @Nullable
        String[] cipherSuites;
        @Nullable
        String[] tlsVersions;
        boolean supportsTlsExtensions;
        
        Builder(final boolean tls) {
            super();
            this.tls = tls;
        }
        
        public Builder(final ConnectionSpec connectionSpec) {
            super();
            this.tls = connectionSpec.tls;
            this.cipherSuites = connectionSpec.cipherSuites;
            this.tlsVersions = connectionSpec.tlsVersions;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions;
        }
        
        public Builder cipherSuites(final CipherSuite... cipherSuites) {
            if (!this.tls) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            final String[] strings = new String[cipherSuites.length];
            for (int i = 0; i < cipherSuites.length; ++i) {
                strings[i] = cipherSuites[i].javaName;
            }
            return this.cipherSuites(strings);
        }
        
        public Builder cipherSuites(final String... cipherSuites) {
            if (!this.tls) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.cipherSuites = cipherSuites.clone();
            return this;
        }
        
        public Builder tlsVersions(final TlsVersion... tlsVersions) {
            if (!this.tls) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            final String[] strings = new String[tlsVersions.length];
            for (int i = 0; i < tlsVersions.length; ++i) {
                strings[i] = tlsVersions[i].javaName;
            }
            return this.tlsVersions(strings);
        }
        
        public Builder tlsVersions(final String... tlsVersions) {
            if (!this.tls) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.tlsVersions = tlsVersions.clone();
            return this;
        }
        
        public Builder supportsTlsExtensions$260aee36() {
            if (!this.tls) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.supportsTlsExtensions = true;
            return this;
        }
        
        public ConnectionSpec build() {
            return new ConnectionSpec(this);
        }
    }
}
