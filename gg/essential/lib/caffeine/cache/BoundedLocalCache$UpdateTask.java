package gg.essential.lib.caffeine.cache;

import com.google.errorprone.annotations.concurrent.*;

final class UpdateTask implements Runnable
{
    final int weightDifference;
    final Node<K, V> node;
    final /* synthetic */ BoundedLocalCache this$0;
    
    public UpdateTask(final BoundedLocalCache this$0, final Node<K, V> node, final int weightDifference) {
        this.this$0 = this$0;
        super();
        this.weightDifference = weightDifference;
        this.node = node;
    }
    
    @GuardedBy("evictionLock")
    @Override
    public void run() {
        if (this.this$0.evicts()) {
            final int oldWeightedSize = this.node.getPolicyWeight();
            this.node.setPolicyWeight(oldWeightedSize + this.weightDifference);
            if (this.node.inWindow()) {
                if (this.node.getPolicyWeight() <= this.this$0.windowMaximum()) {
                    this.this$0.onAccess(this.node);
                }
                else if (this.this$0.accessOrderWindowDeque().contains(this.node)) {
                    this.this$0.accessOrderWindowDeque().moveToFront(this.node);
                }
                this.this$0.setWindowWeightedSize(this.this$0.windowWeightedSize() + this.weightDifference);
            }
            else if (this.node.inMainProbation()) {
                if (this.node.getPolicyWeight() <= this.this$0.maximum()) {
                    this.this$0.onAccess(this.node);
                }
                else if (this.this$0.accessOrderProbationDeque().remove(this.node)) {
                    this.this$0.accessOrderWindowDeque().addFirst(this.node);
                    this.this$0.setWindowWeightedSize(this.this$0.windowWeightedSize() + this.node.getPolicyWeight());
                }
            }
            else if (this.node.inMainProtected()) {
                if (this.node.getPolicyWeight() <= this.this$0.maximum()) {
                    this.this$0.onAccess(this.node);
                    this.this$0.setMainProtectedWeightedSize(this.this$0.mainProtectedWeightedSize() + this.weightDifference);
                }
                else if (this.this$0.accessOrderProtectedDeque().remove(this.node)) {
                    this.this$0.accessOrderWindowDeque().addFirst(this.node);
                    this.this$0.setWindowWeightedSize(this.this$0.windowWeightedSize() + this.node.getPolicyWeight());
                    this.this$0.setMainProtectedWeightedSize(this.this$0.mainProtectedWeightedSize() - oldWeightedSize);
                }
                else {
                    this.this$0.setMainProtectedWeightedSize(this.this$0.mainProtectedWeightedSize() - oldWeightedSize);
                }
            }
            this.this$0.setWeightedSize(this.this$0.weightedSize() + this.weightDifference);
        }
        else if (this.this$0.expiresAfterAccess()) {
            this.this$0.onAccess(this.node);
        }
        if (this.this$0.expiresAfterWrite()) {
            BoundedLocalCache.reorder(this.this$0.writeOrderDeque(), this.node);
        }
        else if (this.this$0.expiresVariable()) {
            this.this$0.timerWheel().reschedule(this.node);
        }
    }
}
