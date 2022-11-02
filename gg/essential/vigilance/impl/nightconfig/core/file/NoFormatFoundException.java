package gg.essential.vigilance.impl.nightconfig.core.file;

public class NoFormatFoundException extends RuntimeException
{
    public NoFormatFoundException(final String message) {
        super(message);
    }
    
    public NoFormatFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
