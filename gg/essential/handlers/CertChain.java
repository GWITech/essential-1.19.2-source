package gg.essential.handlers;

import java.nio.file.*;
import java.io.*;
import java.security.cert.*;
import javax.net.ssl.*;
import java.security.*;

public class CertChain
{
    private final CertificateFactory cf;
    private final KeyStore keyStore;
    
    public CertChain() throws Exception {
        super();
        this.cf = CertificateFactory.getInstance("X.509");
        this.keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        final Path ksPath = Paths.get(System.getProperty("java.home"), "lib", "security", "cacerts");
        this.keyStore.load(Files.newInputStream(ksPath, new OpenOption[0]), null);
    }
    
    public CertChain load(final String filename) throws Exception {
        try (final InputStream cert = CertChain.class.getResourceAsStream("/assets/essential/certs/" + filename + ".der")) {
            final InputStream caInput = new BufferedInputStream(cert);
            final Certificate crt = this.cf.generateCertificate(caInput);
            this.keyStore.setCertificateEntry(filename, crt);
        }
        return this;
    }
    
    public SSLContext done() throws Exception {
        final TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmf.init(this.keyStore);
        final SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, tmf.getTrustManagers(), null);
        return sslContext;
    }
}
