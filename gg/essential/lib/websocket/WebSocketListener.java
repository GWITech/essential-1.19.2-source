package gg.essential.lib.websocket;

import gg.essential.lib.websocket.exceptions.*;
import java.nio.*;
import gg.essential.lib.websocket.handshake.*;
import gg.essential.lib.websocket.framing.*;

public interface WebSocketListener
{
    ServerHandshakeBuilder onWebsocketHandshakeReceivedAsServer$3e88c659() throws InvalidDataException;
    
    void onWebsocketMessage$1d6d21a6(final ByteBuffer p0);
    
    void onWebsocketOpen$56665a9(final Handshakedata p0);
    
    void onWebsocketClose$76aa343e(final int p0, final String p1, final boolean p2);
    
    void onWebsocketError$6d401871(final Exception p0);
    
    void onWebsocketPing(final WebSocket p0, final Framedata p1);
    
    PingFrame onPreparePing$52d00a6e();
}
