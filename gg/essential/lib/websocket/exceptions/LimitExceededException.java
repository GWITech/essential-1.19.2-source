package gg.essential.lib.websocket.exceptions;

public class LimitExceededException extends InvalidDataException
{
    private final int limit;
    
    public LimitExceededException() {
        this(Integer.MAX_VALUE);
    }
    
    public LimitExceededException(final int limit) {
        super(1009);
        this.limit = limit;
    }
    
    public LimitExceededException(final String s, final int limit) {
        super(1009, s);
        this.limit = limit;
    }
    
    public LimitExceededException(final String s) {
        this(s, Integer.MAX_VALUE);
    }
    
    public int getLimit() {
        return this.limit;
    }
}
