package gg.essential.lib.websocket.client;

import java.net.*;

class WebSocketClient$1 implements DnsResolver {
    WebSocketClient$1() {
        super();
    }
    
    @Override
    public InetAddress resolve(final URI uri) throws UnknownHostException {
        return InetAddress.getByName(uri.getHost());
    }
}