package gg.essential.lib.caffeine.cache;

import java.util.concurrent.*;
import com.google.errorprone.annotations.concurrent.*;

final class AddTask implements Runnable
{
    final Node<K, V> node;
    final int weight;
    final /* synthetic */ BoundedLocalCache this$0;
    
    AddTask(final BoundedLocalCache this$0, final Node<K, V> node, final int weight) {
        this.this$0 = this$0;
        super();
        this.weight = weight;
        this.node = node;
    }
    
    @GuardedBy("evictionLock")
    @Override
    public void run() {
        if (this.this$0.evicts()) {
            final long weightedSize = this.this$0.weightedSize();
            this.this$0.setWeightedSize(weightedSize + this.weight);
            this.this$0.setWindowWeightedSize(this.this$0.windowWeightedSize() + this.weight);
            this.node.setPolicyWeight(this.node.getPolicyWeight() + this.weight);
            final long maximum = this.this$0.maximum();
            if (weightedSize >= maximum >>> 1) {
                final long capacity = this.this$0.isWeighted() ? this.this$0.data.mappingCount() : maximum;
                this.this$0.frequencySketch().ensureCapacity(capacity);
            }
            final K key = this.node.getKey();
            if (key != null) {
                this.this$0.frequencySketch().increment(key);
            }
            this.this$0.setMissesInSample(this.this$0.missesInSample() + 1);
        }
        final boolean isAlive;
        synchronized (this.node) {
            isAlive = this.node.isAlive();
        }
        if (isAlive) {
            if (this.this$0.expiresAfterWrite()) {
                this.this$0.writeOrderDeque().add(this.node);
            }
            if (this.this$0.evicts() && this.weight > this.this$0.windowMaximum()) {
                this.this$0.accessOrderWindowDeque().offerFirst(this.node);
            }
            else if (this.this$0.evicts() || this.this$0.expiresAfterAccess()) {
                this.this$0.accessOrderWindowDeque().offerLast(this.node);
            }
            if (this.this$0.expiresVariable()) {
                this.this$0.timerWheel().schedule(this.node);
            }
        }
        if (this.this$0.isComputingAsync(this.node)) {
            synchronized (this.node) {
                if (!Async.isReady((CompletableFuture<?>)this.node.getValue())) {
                    final long expirationTime = this.this$0.expirationTicker().read() + 6917529027641081854L;
                    this.this$0.setVariableTime(this.node, expirationTime);
                    this.this$0.setAccessTime(this.node, expirationTime);
                    this.this$0.setWriteTime(this.node, expirationTime);
                }
            }
        }
    }
}
