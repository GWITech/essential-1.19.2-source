package gg.essential.lib.okhttp3.internal.platform;

import gg.essential.lib.okhttp3.internal.tls.*;
import java.util.*;
import java.security.cert.*;
import javax.net.ssl.*;
import java.lang.reflect.*;

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
