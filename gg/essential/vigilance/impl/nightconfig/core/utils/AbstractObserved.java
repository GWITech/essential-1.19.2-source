package gg.essential.vigilance.impl.nightconfig.core.utils;

abstract class AbstractObserved
{
    protected final Runnable callback;
    
    protected AbstractObserved(final Runnable callback) {
        super();
        this.callback = callback;
    }
}
