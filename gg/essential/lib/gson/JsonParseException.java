package gg.essential.lib.gson;

public class JsonParseException extends RuntimeException
{
    public JsonParseException(final String msg) {
        super(msg);
    }
    
    public JsonParseException(final String msg, final Throwable cause) {
        super(msg, cause);
    }
    
    public JsonParseException(final Throwable cause) {
        super(cause);
    }
}
