package gg.essential.lib.gson;

public final class JsonIOException extends JsonParseException
{
    public JsonIOException(final String msg) {
        super(msg);
    }
    
    public JsonIOException(final String msg, final Throwable cause) {
        super(msg, cause);
    }
    
    public JsonIOException(final Throwable cause) {
        super(cause);
    }
}
