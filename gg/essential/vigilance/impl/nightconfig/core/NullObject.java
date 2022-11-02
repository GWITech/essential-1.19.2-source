package gg.essential.vigilance.impl.nightconfig.core;

public final class NullObject
{
    public static final NullObject NULL_OBJECT;
    
    private NullObject() {
        super();
    }
    
    @Override
    public String toString() {
        return "NULL_OBJECT";
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    static {
        NULL_OBJECT = new NullObject();
    }
}
