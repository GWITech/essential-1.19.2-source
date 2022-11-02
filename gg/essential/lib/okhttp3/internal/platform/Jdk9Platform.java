package gg.essential.lib.okhttp3.internal.platform;

import java.util.*;
import gg.essential.lib.okhttp3.*;
import gg.essential.lib.okhttp3.internal.*;
import java.lang.reflect.*;
import javax.net.ssl.*;

final class Jdk9Platform extends Platform
{
    final Method setProtocolMethod;
    final Method getProtocolMethod;
    
    Jdk9Platform(final Method setProtocolMethod, final Method getProtocolMethod) {
        super();
        this.setProtocolMethod = setProtocolMethod;
        this.getProtocolMethod = getProtocolMethod;
    }
    
    @Override
    public void configureTlsExtensions(final SSLSocket sslSocket, final String hostname, final List<Protocol> protocols) {
        try {
            final SSLParameters sslParameters = sslSocket.getSSLParameters();
            final List<String> names = Platform.alpnProtocolNames(protocols);
            this.setProtocolMethod.invoke(sslParameters, names.toArray(new String[names.size()]));
            sslSocket.setSSLParameters(sslParameters);
        }
        catch (final IllegalAccessException | InvocationTargetException e) {
            throw Util.assertionError("unable to set ssl parameters", e);
        }
    }
    
    @Override
    public String getSelectedProtocol(final SSLSocket socket) {
        try {
            final String protocol = (String)this.getProtocolMethod.invoke(socket, new Object[0]);
            if (protocol == null || protocol.equals("")) {
                return null;
            }
            return protocol;
        }
        catch (final IllegalAccessException | InvocationTargetException e) {
            throw Util.assertionError("unable to get selected protocols", e);
        }
    }
    
    public static Jdk9Platform buildIfSupported() {
        try {
            final Method setProtocolMethod = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            final Method getProtocolMethod = SSLSocket.class.getMethod("getApplicationProtocol", (Class<?>[])new Class[0]);
            return new Jdk9Platform(setProtocolMethod, getProtocolMethod);
        }
        catch (final NoSuchMethodException ex) {
            return null;
        }
    }
}
