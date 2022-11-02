package gg.essential.lib.websocket.handshake;

public interface ServerHandshake extends Handshakedata
{
    short getHttpStatus();
    
    String getHttpStatusMessage();
}
