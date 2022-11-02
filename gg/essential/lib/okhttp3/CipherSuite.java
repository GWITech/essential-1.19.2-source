package gg.essential.lib.okhttp3;

import java.util.*;

public final class CipherSuite
{
    static final Comparator<String> ORDER_BY_NAME;
    private static final Map<String, CipherSuite> INSTANCES;
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
    final String javaName;
    
    public static synchronized CipherSuite forJavaName(final String javaName) {
        CipherSuite result = CipherSuite.INSTANCES.get(javaName);
        if (result == null) {
            result = new CipherSuite(javaName);
            CipherSuite.INSTANCES.put(javaName, result);
        }
        return result;
    }
    
    static List<CipherSuite> forJavaNames(final String... cipherSuites) {
        final List<CipherSuite> result = new ArrayList<CipherSuite>(cipherSuites.length);
        for (final String cipherSuite : cipherSuites) {
            result.add(forJavaName(cipherSuite));
        }
        return Collections.unmodifiableList((List<? extends CipherSuite>)result);
    }
    
    private CipherSuite(final String javaName) {
        super();
        if (javaName == null) {
            throw new NullPointerException();
        }
        this.javaName = javaName;
    }
    
    private static CipherSuite of$58cc9018(final String javaName) {
        return forJavaName(javaName);
    }
    
    @Override
    public String toString() {
        return this.javaName;
    }
    
    static {
        ORDER_BY_NAME = new Comparator<String>() {
            CipherSuite$1() {
                super();
            }
            
            @Override
            public int compare(final String a, final String b) {
                for (int i = 4, limit = Math.min(a.length(), b.length()); i < limit; ++i) {
                    final char charA = a.charAt(i);
                    final char charB = b.charAt(i);
                    if (charA != charB) {
                        return (charA < charB) ? -1 : 1;
                    }
                }
                final int lengthA = a.length();
                final int lengthB = b.length();
                if (lengthA != lengthB) {
                    return (lengthA < lengthB) ? -1 : 1;
                }
                return 0;
            }
            
            @Override
            public /* bridge */ int compare(final Object o, final Object o2) {
                return this.compare((String)o, (String)o2);
            }
        };
        INSTANCES = new TreeMap<String, CipherSuite>(CipherSuite.ORDER_BY_NAME);
        of$58cc9018("SSL_RSA_WITH_NULL_MD5");
        of$58cc9018("SSL_RSA_WITH_NULL_SHA");
        of$58cc9018("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        of$58cc9018("SSL_RSA_WITH_RC4_128_MD5");
        of$58cc9018("SSL_RSA_WITH_RC4_128_SHA");
        of$58cc9018("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        of$58cc9018("SSL_RSA_WITH_DES_CBC_SHA");
        TLS_RSA_WITH_3DES_EDE_CBC_SHA = of$58cc9018("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        of$58cc9018("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        of$58cc9018("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        of$58cc9018("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        of$58cc9018("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        of$58cc9018("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        of$58cc9018("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        of$58cc9018("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        of$58cc9018("SSL_DH_anon_WITH_RC4_128_MD5");
        of$58cc9018("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        of$58cc9018("SSL_DH_anon_WITH_DES_CBC_SHA");
        of$58cc9018("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        of$58cc9018("TLS_KRB5_WITH_DES_CBC_SHA");
        of$58cc9018("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        of$58cc9018("TLS_KRB5_WITH_RC4_128_SHA");
        of$58cc9018("TLS_KRB5_WITH_DES_CBC_MD5");
        of$58cc9018("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        of$58cc9018("TLS_KRB5_WITH_RC4_128_MD5");
        of$58cc9018("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        of$58cc9018("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        of$58cc9018("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        of$58cc9018("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        TLS_RSA_WITH_AES_128_CBC_SHA = of$58cc9018("TLS_RSA_WITH_AES_128_CBC_SHA");
        of$58cc9018("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        of$58cc9018("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        of$58cc9018("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        TLS_RSA_WITH_AES_256_CBC_SHA = of$58cc9018("TLS_RSA_WITH_AES_256_CBC_SHA");
        of$58cc9018("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        of$58cc9018("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        of$58cc9018("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        of$58cc9018("TLS_RSA_WITH_NULL_SHA256");
        of$58cc9018("TLS_RSA_WITH_AES_128_CBC_SHA256");
        of$58cc9018("TLS_RSA_WITH_AES_256_CBC_SHA256");
        of$58cc9018("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        of$58cc9018("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        of$58cc9018("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        of$58cc9018("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        of$58cc9018("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        of$58cc9018("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        of$58cc9018("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        of$58cc9018("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        of$58cc9018("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        of$58cc9018("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        of$58cc9018("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        of$58cc9018("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        of$58cc9018("TLS_PSK_WITH_RC4_128_SHA");
        of$58cc9018("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        of$58cc9018("TLS_PSK_WITH_AES_128_CBC_SHA");
        of$58cc9018("TLS_PSK_WITH_AES_256_CBC_SHA");
        of$58cc9018("TLS_RSA_WITH_SEED_CBC_SHA");
        TLS_RSA_WITH_AES_128_GCM_SHA256 = of$58cc9018("TLS_RSA_WITH_AES_128_GCM_SHA256");
        TLS_RSA_WITH_AES_256_GCM_SHA384 = of$58cc9018("TLS_RSA_WITH_AES_256_GCM_SHA384");
        of$58cc9018("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        of$58cc9018("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        of$58cc9018("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        of$58cc9018("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        of$58cc9018("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        of$58cc9018("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        of$58cc9018("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        of$58cc9018("TLS_FALLBACK_SCSV");
        of$58cc9018("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        of$58cc9018("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        of$58cc9018("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        of$58cc9018("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        of$58cc9018("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        of$58cc9018("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        of$58cc9018("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        of$58cc9018("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = of$58cc9018("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = of$58cc9018("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        of$58cc9018("TLS_ECDH_RSA_WITH_NULL_SHA");
        of$58cc9018("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        of$58cc9018("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        of$58cc9018("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        of$58cc9018("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        of$58cc9018("TLS_ECDHE_RSA_WITH_NULL_SHA");
        of$58cc9018("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        of$58cc9018("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = of$58cc9018("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = of$58cc9018("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        of$58cc9018("TLS_ECDH_anon_WITH_NULL_SHA");
        of$58cc9018("TLS_ECDH_anon_WITH_RC4_128_SHA");
        of$58cc9018("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        of$58cc9018("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        of$58cc9018("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        of$58cc9018("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        of$58cc9018("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        of$58cc9018("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        of$58cc9018("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        of$58cc9018("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        of$58cc9018("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        of$58cc9018("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        of$58cc9018("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = of$58cc9018("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = of$58cc9018("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        of$58cc9018("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        of$58cc9018("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = of$58cc9018("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = of$58cc9018("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        of$58cc9018("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        of$58cc9018("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        of$58cc9018("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        of$58cc9018("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = of$58cc9018("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = of$58cc9018("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    }
}
