package gg.essential.lib.websocket.handshake;

public interface ServerHandshakeBuilder extends HandshakeBuilder, ServerHandshake
{
    void setHttpStatus(final short p0);
    
    void setHttpStatusMessage(final String p0);
}
