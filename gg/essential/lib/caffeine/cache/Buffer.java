package gg.essential.lib.caffeine.cache;

import java.util.function.*;

interface Buffer<E>
{
    public static final int FULL = 1;
    public static final int SUCCESS = 0;
    public static final int FAILED = -1;
    
    default <E> Buffer<E> disabled() {
        return (Buffer<E>)DisabledBuffer.INSTANCE;
    }
    
    int offer(final E p0);
    
    void drainTo(final Consumer<E> p0);
    
    default int size() {
        return this.writes() - this.reads();
    }
    
    int reads();
    
    int writes();
}
