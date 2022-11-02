package gg.essential.lib.kbrewster.eventbus.invokers;

import java.lang.reflect.*;

public interface InvokerType
{
    SubscriberMethod setup(final Object p0, final Class p1, final Class p2, final Method p3) throws Throwable;
    
    @FunctionalInterface
    public interface SubscriberMethod
    {
        void invoke(final Object p0) throws Exception;
    }
}
