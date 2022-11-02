package gg.essential.lib.websocket.handshake;

public class HandshakeImpl1Server extends HandshakedataImpl1 implements ServerHandshakeBuilder
{
    private short httpstatus;
    private String httpstatusmessage;
    
    public HandshakeImpl1Server() {
        super();
    }
    
    @Override
    public String getHttpStatusMessage() {
        return this.httpstatusmessage;
    }
    
    @Override
    public short getHttpStatus() {
        return this.httpstatus;
    }
    
    @Override
    public void setHttpStatusMessage(final String message) {
        this.httpstatusmessage = message;
    }
    
    @Override
    public void setHttpStatus(final short status) {
        this.httpstatus = status;
    }
}
