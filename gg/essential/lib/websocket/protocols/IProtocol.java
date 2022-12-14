package gg.essential.lib.websocket.protocols;

public interface IProtocol
{
    boolean acceptProvidedProtocol(final String p0);
    
    String getProvidedProtocol();
    
    IProtocol copyInstance();
    
    String toString();
}
