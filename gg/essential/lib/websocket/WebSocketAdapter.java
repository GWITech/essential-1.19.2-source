package gg.essential.lib.websocket;

import gg.essential.lib.websocket.handshake.*;
import gg.essential.lib.websocket.exceptions.*;
import gg.essential.lib.websocket.framing.*;

public abstract class WebSocketAdapter implements WebSocketListener
{
    private PingFrame pingFrame;
    
    public WebSocketAdapter() {
        super();
    }
    
    @Override
    public ServerHandshakeBuilder onWebsocketHandshakeReceivedAsServer$3e88c659() throws InvalidDataException {
        return new HandshakeImpl1Server();
    }
    
    @Override
    public void onWebsocketPing(final WebSocket conn, final Framedata f) {
        conn.sendFrame(new PongFrame((PingFrame)f));
    }
    
    @Override
    public PingFrame onPreparePing$52d00a6e() {
        if (this.pingFrame == null) {
            this.pingFrame = new PingFrame();
        }
        return this.pingFrame;
    }
}
