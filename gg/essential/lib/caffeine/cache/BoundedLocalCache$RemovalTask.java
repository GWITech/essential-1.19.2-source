package gg.essential.lib.caffeine.cache;

import com.google.errorprone.annotations.concurrent.*;

final class RemovalTask implements Runnable
{
    final Node<K, V> node;
    final /* synthetic */ BoundedLocalCache this$0;
    
    RemovalTask(final BoundedLocalCache this$0, final Node<K, V> node) {
        this.this$0 = this$0;
        super();
        this.node = node;
    }
    
    @GuardedBy("evictionLock")
    @Override
    public void run() {
        if (this.node.inWindow() && (this.this$0.evicts() || this.this$0.expiresAfterAccess())) {
            this.this$0.accessOrderWindowDeque().remove(this.node);
        }
        else if (this.this$0.evicts()) {
            if (this.node.inMainProbation()) {
                this.this$0.accessOrderProbationDeque().remove(this.node);
            }
            else {
                this.this$0.accessOrderProtectedDeque().remove(this.node);
            }
        }
        if (this.this$0.expiresAfterWrite()) {
            this.this$0.writeOrderDeque().remove(this.node);
        }
        else if (this.this$0.expiresVariable()) {
            this.this$0.timerWheel().deschedule(this.node);
        }
        this.this$0.makeDead(this.node);
    }
}
