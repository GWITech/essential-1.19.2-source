package gg.essential.lib.websocket.exceptions;

public class InvalidHandshakeException extends InvalidDataException
{
    public InvalidHandshakeException() {
        super(1002);
    }
    
    public InvalidHandshakeException(final String s) {
        super(1002, s);
    }
}
