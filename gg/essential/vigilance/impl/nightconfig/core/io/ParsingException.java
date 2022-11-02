package gg.essential.vigilance.impl.nightconfig.core.io;

public class ParsingException extends RuntimeException
{
    public ParsingException(final String message) {
        super(message);
    }
    
    public ParsingException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public static ParsingException readFailed(final Throwable cause) {
        return new ParsingException("Failed to parse data from Reader", cause);
    }
    
    public static ParsingException notEnoughData() {
        return new ParsingException("Not enough data available");
    }
}
