package gg.essential.lib.caffeine.cache;

abstract class BaseMpscLinkedArrayQueueColdProducerFields<E> extends BaseMpscLinkedArrayQueuePad3<E>
{
    protected volatile long producerLimit;
    protected long producerMask;
    protected E[] producerBuffer;
    
    BaseMpscLinkedArrayQueueColdProducerFields() {
        super();
    }
}
