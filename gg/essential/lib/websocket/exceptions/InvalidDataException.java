package gg.essential.lib.websocket.exceptions;

public class InvalidDataException extends Exception
{
    private final int closecode;
    
    public InvalidDataException(final int closecode) {
        super();
        this.closecode = closecode;
    }
    
    public InvalidDataException(final int closecode, final String s) {
        super(s);
        this.closecode = closecode;
    }
    
    public InvalidDataException(final Throwable t) {
        super(t);
        this.closecode = 1007;
    }
    
    public int getCloseCode() {
        return this.closecode;
    }
}
