package gg.essential.lib.websocket.exceptions;

public class InvalidFrameException extends InvalidDataException
{
    public InvalidFrameException() {
        super(1002);
    }
    
    public InvalidFrameException(final String s) {
        super(1002, s);
    }
}
