package gg.essential.lib.websocket.handshake;

public class HandshakeImpl1Client extends HandshakedataImpl1 implements ClientHandshakeBuilder
{
    private String resourceDescriptor;
    
    public HandshakeImpl1Client() {
        super();
        this.resourceDescriptor = "*";
    }
    
    @Override
    public void setResourceDescriptor(final String resourceDescriptor) {
        if (resourceDescriptor == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.resourceDescriptor = resourceDescriptor;
    }
    
    @Override
    public String getResourceDescriptor() {
        return this.resourceDescriptor;
    }
}
