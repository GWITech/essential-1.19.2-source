package gg.essential.lib.kbrewster.eventbus.invokers;

@FunctionalInterface
public interface SubscriberMethod
{
    void invoke(final Object p0) throws Exception;
}
