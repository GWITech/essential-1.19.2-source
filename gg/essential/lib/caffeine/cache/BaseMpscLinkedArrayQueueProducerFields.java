package gg.essential.lib.caffeine.cache;

abstract class BaseMpscLinkedArrayQueueProducerFields<E> extends BaseMpscLinkedArrayQueuePad1<E>
{
    protected long producerIndex;
    
    BaseMpscLinkedArrayQueueProducerFields() {
        super();
    }
}
