package gg.essential.lib.okhttp3;

import javax.annotation.*;

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
