package gg.essential.lib.websocket.exceptions;

public class IncompleteException extends Exception
{
    private final int preferredSize;
    
    public IncompleteException(final int preferredSize) {
        super();
        this.preferredSize = preferredSize;
    }
    
    public int getPreferredSize() {
        return this.preferredSize;
    }
}
