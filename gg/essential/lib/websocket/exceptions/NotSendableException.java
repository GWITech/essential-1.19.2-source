package gg.essential.lib.websocket.exceptions;

public class NotSendableException extends RuntimeException
{
    public NotSendableException(final Throwable t) {
        super(t);
    }
}
