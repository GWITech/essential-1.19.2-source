package gg.essential.lib.okhttp3;

import java.security.cert.*;
import javax.net.ssl.*;
import gg.essential.lib.okhttp3.internal.*;
import java.util.*;
import javax.annotation.*;

public final class Handshake
{
    private final TlsVersion tlsVersion;
    private final CipherSuite cipherSuite;
    private final List<Certificate> peerCertificates;
    private final List<Certificate> localCertificates;
    
    private Handshake(final TlsVersion tlsVersion, final CipherSuite cipherSuite, final List<Certificate> peerCertificates, final List<Certificate> localCertificates) {
        super();
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.peerCertificates = peerCertificates;
        this.localCertificates = localCertificates;
    }
    
    public static Handshake get(final SSLSession session) {
        final String cipherSuiteString = session.getCipherSuite();
        if (cipherSuiteString == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        final CipherSuite cipherSuite = CipherSuite.forJavaName(cipherSuiteString);
        final String tlsVersionString = session.getProtocol();
        if (tlsVersionString == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        final TlsVersion tlsVersion = TlsVersion.forJavaName(tlsVersionString);
        Certificate[] peerCertificates;
        try {
            peerCertificates = session.getPeerCertificates();
        }
        catch (final SSLPeerUnverifiedException ex) {
            peerCertificates = null;
        }
        final List<Certificate> peerCertificatesList = (peerCertificates != null) ? Util.immutableList(peerCertificates) : Collections.emptyList();
        final Certificate[] localCertificates = session.getLocalCertificates();
        final List<Certificate> localCertificatesList = (localCertificates != null) ? Util.immutableList(localCertificates) : Collections.emptyList();
        return new Handshake(tlsVersion, cipherSuite, peerCertificatesList, localCertificatesList);
    }
    
    public CipherSuite cipherSuite() {
        return this.cipherSuite;
    }
    
    public List<Certificate> peerCertificates() {
        return this.peerCertificates;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (!(other instanceof Handshake)) {
            return false;
        }
        final Handshake that = (Handshake)other;
        return this.tlsVersion.equals(that.tlsVersion) && this.cipherSuite.equals(that.cipherSuite) && this.peerCertificates.equals(that.peerCertificates) && this.localCertificates.equals(that.localCertificates);
    }
    
    @Override
    public int hashCode() {
        int result = 527 + this.tlsVersion.hashCode();
        result = 31 * result + this.cipherSuite.hashCode();
        result = 31 * result + this.peerCertificates.hashCode();
        result = 31 * result + this.localCertificates.hashCode();
        return result;
    }
}
