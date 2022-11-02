package gg.essential.vigilance.impl.nightconfig.core.io;

public class WritingException extends RuntimeException
{
    public WritingException(final String message) {
        super(message);
    }
    
    public WritingException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public WritingException(final Throwable cause) {
        this("Failed to write data: ", cause);
    }
}
