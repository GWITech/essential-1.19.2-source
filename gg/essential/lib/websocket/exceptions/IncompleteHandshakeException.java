package gg.essential.lib.websocket.exceptions;

public class IncompleteHandshakeException extends RuntimeException
{
    private final int preferredSize;
    
    public IncompleteHandshakeException(final int preferredSize) {
        super();
        this.preferredSize = preferredSize;
    }
    
    public IncompleteHandshakeException() {
        super();
        this.preferredSize = 0;
    }
    
    public int getPreferredSize() {
        return this.preferredSize;
    }
}
