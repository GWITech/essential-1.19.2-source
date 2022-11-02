package gg.essential.network.connectionmanager.legacyjre;

import javax.net.ssl.*;
import java.lang.reflect.*;
import java.io.*;
import java.net.*;

public class LegacyJreSocketFactory extends SSLSocketFactory
{
    private final SSLSocketFactory inner;
    private final String host;
    
    public LegacyJreSocketFactory(final SSLSocketFactory inner, final String host) {
        super();
        this.inner = inner;
        this.host = host;
    }
    
    private Socket configure(final Socket socket) {
        try {
            socket.getClass().getDeclaredMethod("setHost", String.class).invoke(socket, this.host);
        }
        catch (final IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return socket;
    }
    
    @Override
    public String[] getDefaultCipherSuites() {
        return this.inner.getDefaultCipherSuites();
    }
    
    @Override
    public String[] getSupportedCipherSuites() {
        return this.inner.getSupportedCipherSuites();
    }
    
    @Override
    public Socket createSocket() throws IOException {
        return this.configure(this.inner.createSocket());
    }
    
    @Override
    public Socket createSocket(final Socket socket, final String s, final int i, final boolean b) throws IOException {
        return this.configure(this.inner.createSocket(socket, s, i, b));
    }
    
    @Override
    public Socket createSocket(final String s, final int i) throws IOException {
        return this.configure(this.inner.createSocket(s, i));
    }
    
    @Override
    public Socket createSocket(final String s, final int i, final InetAddress inetAddress, final int i1) throws IOException {
        return this.configure(this.inner.createSocket(s, i, inetAddress, i1));
    }
    
    @Override
    public Socket createSocket(final InetAddress inetAddress, final int i) throws IOException {
        return this.configure(this.inner.createSocket(inetAddress, i));
    }
    
    @Override
    public Socket createSocket(final InetAddress inetAddress, final int i, final InetAddress inetAddress1, final int i1) throws IOException {
        return this.configure(this.inner.createSocket(inetAddress, i, inetAddress1, i1));
    }
}
