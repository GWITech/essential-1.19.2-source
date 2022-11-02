package gg.essential.lib.okhttp3;

import gg.essential.lib.okhttp3.internal.tls.*;
import javax.annotation.*;
import gg.essential.lib.okhttp3.internal.*;
import java.security.cert.*;
import javax.net.ssl.*;
import gg.essential.lib.okio.*;
import java.util.*;

public final class CertificatePinner
{
    public static final CertificatePinner DEFAULT;
    private final Set<CertificatePinner.Pin> pins;
    @Nullable
    private final CertificateChainCleaner certificateChainCleaner;
    
    CertificatePinner(final Set<CertificatePinner.Pin> pins, @Nullable final CertificateChainCleaner certificateChainCleaner) {
        super();
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return other == this || (other instanceof CertificatePinner && Util.equal(this.certificateChainCleaner, ((CertificatePinner)other).certificateChainCleaner) && this.pins.equals(((CertificatePinner)other).pins));
    }
    
    @Override
    public int hashCode() {
        int result = (this.certificateChainCleaner != null) ? this.certificateChainCleaner.hashCode() : 0;
        result = 31 * result + this.pins.hashCode();
        return result;
    }
    
    public void check(final String hostname, List<Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        final List<CertificatePinner.Pin> pins = this.findMatchingPins(hostname);
        if (pins.isEmpty()) {
            return;
        }
        if (this.certificateChainCleaner != null) {
            peerCertificates = this.certificateChainCleaner.clean(peerCertificates, hostname);
        }
        for (int c = 0, certsSize = peerCertificates.size(); c < certsSize; ++c) {
            final X509Certificate x509Certificate = peerCertificates.get(c);
            ByteString sha1 = null;
            ByteString sha2 = null;
            for (int p = 0, pinsSize = pins.size(); p < pinsSize; ++p) {
                final CertificatePinner.Pin pin = pins.get(p);
                if (pin.hashAlgorithm.equals("sha256/")) {
                    if (sha2 == null) {
                        sha2 = sha256(x509Certificate);
                    }
                    if (pin.hash.equals(sha2)) {
                        return;
                    }
                }
                else {
                    if (!pin.hashAlgorithm.equals("sha1/")) {
                        throw new AssertionError((Object)("unsupported hashAlgorithm: " + pin.hashAlgorithm));
                    }
                    if (sha1 == null) {
                        sha1 = sha1(x509Certificate);
                    }
                    if (pin.hash.equals(sha1)) {
                        return;
                    }
                }
            }
        }
        final StringBuilder message = new StringBuilder().append("Certificate pinning failure!").append("\n  Peer certificate chain:");
        for (int c2 = 0, certsSize2 = peerCertificates.size(); c2 < certsSize2; ++c2) {
            final X509Certificate x509Certificate2 = peerCertificates.get(c2);
            message.append("\n    ").append(pin(x509Certificate2)).append(": ").append(x509Certificate2.getSubjectDN().getName());
        }
        message.append("\n  Pinned certificates for ").append(hostname).append(":");
        for (int p2 = 0, pinsSize2 = pins.size(); p2 < pinsSize2; ++p2) {
            final CertificatePinner.Pin pin2 = pins.get(p2);
            message.append("\n    ").append(pin2);
        }
        throw new SSLPeerUnverifiedException(message.toString());
    }
    
    List<CertificatePinner.Pin> findMatchingPins(final String hostname) {
        List<CertificatePinner.Pin> result = Collections.emptyList();
        for (final CertificatePinner.Pin pin : this.pins) {
            if (pin.matches(hostname)) {
                if (result.isEmpty()) {
                    result = new ArrayList<CertificatePinner.Pin>();
                }
                result.add(pin);
            }
        }
        return result;
    }
    
    CertificatePinner withCertificateChainCleaner(@Nullable final CertificateChainCleaner certificateChainCleaner) {
        return Util.equal(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }
    
    public static String pin(final Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + sha256((X509Certificate)certificate).base64();
    }
    
    static ByteString sha1(final X509Certificate x509Certificate) {
        return ByteString.of(x509Certificate.getPublicKey().getEncoded()).sha1();
    }
    
    static ByteString sha256(final X509Certificate x509Certificate) {
        return ByteString.of(x509Certificate.getPublicKey().getEncoded()).sha256();
    }
    
    static {
        DEFAULT = new Builder().build();
    }
    
    public static final class Builder
    {
        private final List<CertificatePinner.Pin> pins;
        
        public Builder() {
            super();
            this.pins = new ArrayList<CertificatePinner.Pin>();
        }
        
        public CertificatePinner build() {
            return new CertificatePinner(new LinkedHashSet<CertificatePinner.Pin>(this.pins), null);
        }
    }
}
