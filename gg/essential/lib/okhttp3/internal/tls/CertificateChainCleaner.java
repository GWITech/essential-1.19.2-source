package gg.essential.lib.okhttp3.internal.tls;

import java.util.*;
import java.security.cert.*;
import javax.net.ssl.*;
import gg.essential.lib.okhttp3.internal.platform.*;

public abstract class CertificateChainCleaner
{
    public CertificateChainCleaner() {
        super();
    }
    
    public abstract List<Certificate> clean(final List<Certificate> p0, final String p1) throws SSLPeerUnverifiedException;
    
    public static CertificateChainCleaner get(final X509TrustManager trustManager) {
        return Platform.get().buildCertificateChainCleaner(trustManager);
    }
}
