package gg.essential.lib.caffeine.cache;

import java.lang.ref.*;
import com.google.errorprone.annotations.concurrent.*;

abstract class Node<K, V> implements AccessOrderDeque.AccessOrder<Node<K, V>>, WriteOrderDeque.WriteOrder<Node<K, V>>
{
    public static final int WINDOW = 0;
    public static final int PROBATION = 1;
    public static final int PROTECTED = 2;
    
    Node() {
        super();
    }
    
    public abstract K getKey();
    
    public abstract Object getKeyReference();
    
    public abstract V getValue();
    
    public abstract Object getValueReference();
    
    @GuardedBy("this")
    public abstract void setValue(final V p0, final ReferenceQueue<V> p1);
    
    public abstract boolean containsValue(final Object p0);
    
    @GuardedBy("this")
    public int getWeight() {
        return 1;
    }
    
    @GuardedBy("this")
    public void setWeight(final int weight) {
    }
    
    @GuardedBy("evictionLock")
    public int getPolicyWeight() {
        return 1;
    }
    
    @GuardedBy("evictionLock")
    public void setPolicyWeight(final int weight) {
    }
    
    public abstract boolean isAlive();
    
    @GuardedBy("this")
    public abstract boolean isRetired();
    
    @GuardedBy("this")
    public abstract boolean isDead();
    
    @GuardedBy("this")
    public abstract void retire();
    
    @GuardedBy("this")
    public abstract void die();
    
    public long getVariableTime() {
        return 0L;
    }
    
    public void setVariableTime(final long time) {
    }
    
    public boolean casVariableTime(final long expect, final long update) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    public Node<K, V> getPreviousInVariableOrder() {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    public void setPreviousInVariableOrder(final Node<K, V> prev) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    public Node<K, V> getNextInVariableOrder() {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    public void setNextInVariableOrder(final Node<K, V> prev) {
        throw new UnsupportedOperationException();
    }
    
    public boolean inWindow() {
        return this.getQueueType() == 0;
    }
    
    public boolean inMainProbation() {
        return this.getQueueType() == 1;
    }
    
    public boolean inMainProtected() {
        return this.getQueueType() == 2;
    }
    
    public void makeWindow() {
        this.setQueueType(0);
    }
    
    public void makeMainProbation() {
        this.setQueueType(1);
    }
    
    public void makeMainProtected() {
        this.setQueueType(2);
    }
    
    public int getQueueType() {
        return 0;
    }
    
    public void setQueueType(final int queueType) {
        throw new UnsupportedOperationException();
    }
    
    public long getAccessTime() {
        return 0L;
    }
    
    public void setAccessTime(final long time) {
    }
    
    @GuardedBy("evictionLock")
    @Override
    public Node<K, V> getPreviousInAccessOrder() {
        return null;
    }
    
    @GuardedBy("evictionLock")
    @Override
    public void setPreviousInAccessOrder(final Node<K, V> prev) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    @Override
    public Node<K, V> getNextInAccessOrder() {
        return null;
    }
    
    @GuardedBy("evictionLock")
    @Override
    public void setNextInAccessOrder(final Node<K, V> next) {
        throw new UnsupportedOperationException();
    }
    
    public long getWriteTime() {
        return 0L;
    }
    
    public void setWriteTime(final long time) {
    }
    
    public boolean casWriteTime(final long expect, final long update) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    @Override
    public Node<K, V> getPreviousInWriteOrder() {
        return null;
    }
    
    @GuardedBy("evictionLock")
    @Override
    public void setPreviousInWriteOrder(final Node<K, V> prev) {
        throw new UnsupportedOperationException();
    }
    
    @GuardedBy("evictionLock")
    @Override
    public Node<K, V> getNextInWriteOrder() {
        return null;
    }
    
    @GuardedBy("evictionLock")
    @Override
    public void setNextInWriteOrder(final Node<K, V> next) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final String toString() {
        return String.format("%s=[key=%s, value=%s, weight=%d, queueType=%,d, accessTimeNS=%,d, writeTimeNS=%,d, varTimeNs=%,d, prevInAccess=%s, nextInAccess=%s, prevInWrite=%s, nextInWrite=%s]", this.getClass().getSimpleName(), this.getKey(), this.getValue(), this.getWeight(), this.getQueueType(), this.getAccessTime(), this.getWriteTime(), this.getVariableTime(), this.getPreviousInAccessOrder() != null, this.getNextInAccessOrder() != null, this.getPreviousInWriteOrder() != null, this.getNextInWriteOrder() != null);
    }
    
    @GuardedBy("evictionLock")
    @Override
    public /* bridge */ void setNextInAccessOrder(final AccessOrderDeque.AccessOrder accessOrder) {
        this.setNextInAccessOrder((Node)accessOrder);
    }
    
    @GuardedBy("evictionLock")
    @Override
    public /* bridge */ AccessOrderDeque.AccessOrder getNextInAccessOrder() {
        return this.getNextInAccessOrder();
    }
    
    @GuardedBy("evictionLock")
    @Override
    public /* bridge */ void setPreviousInAccessOrder(final AccessOrderDeque.AccessOrder accessOrder) {
        this.setPreviousInAccessOrder((Node)accessOrder);
    }
    
    @GuardedBy("evictionLock")
    @Override
    public /* bridge */ AccessOrderDeque.AccessOrder getPreviousInAccessOrder() {
        return this.getPreviousInAccessOrder();
    }
    
    @GuardedBy("evictionLock")
    @Override
    public /* bridge */ void setNextInWriteOrder(final WriteOrderDeque.WriteOrder writeOrder) {
        this.setNextInWriteOrder((Node)writeOrder);
    }
    
    @GuardedBy("evictionLock")
    @Override
    public /* bridge */ WriteOrderDeque.WriteOrder getNextInWriteOrder() {
        return this.getNextInWriteOrder();
    }
    
    @GuardedBy("evictionLock")
    @Override
    public /* bridge */ void setPreviousInWriteOrder(final WriteOrderDeque.WriteOrder writeOrder) {
        this.setPreviousInWriteOrder((Node)writeOrder);
    }
    
    @GuardedBy("evictionLock")
    @Override
    public /* bridge */ WriteOrderDeque.WriteOrder getPreviousInWriteOrder() {
        return this.getPreviousInWriteOrder();
    }
}
