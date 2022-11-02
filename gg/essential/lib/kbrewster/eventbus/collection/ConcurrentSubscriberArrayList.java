package gg.essential.lib.kbrewster.eventbus.collection;

import java.util.concurrent.*;
import gg.essential.lib.kbrewster.eventbus.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.function.*;
import java.util.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 1, 16 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007" }, d2 = { "Lgg/essential/lib/kbrewster/eventbus/collection/ConcurrentSubscriberArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lgg/essential/lib/kbrewster/eventbus/EventBus$Subscriber;", "()V", "add", "", "element", "KeventBus" })
public final class ConcurrentSubscriberArrayList extends CopyOnWriteArrayList<EventBus.Subscriber>
{
    @Override
    public boolean add(@NotNull final EventBus.Subscriber element) {
        Intrinsics.checkParameterIsNotNull((Object)element, "element");
        if (this.size() == 0) {
            super.add(element);
        }
        else {
            final List list = this;
            final Comparator<Object> comparingInt = Comparator.comparingInt((ToIntFunction<? super Object>)ConcurrentSubscriberArrayList$add$index.ConcurrentSubscriberArrayList$add$index$1.INSTANCE);
            Intrinsics.checkExpressionValueIsNotNull((Object)comparingInt, "Comparator.comparingInt \u2026scriber -> obj.priority }");
            int index = CollectionsKt.binarySearch$default(list, (Object)element, (Comparator)comparingInt, 0, 0, 12, (Object)null);
            if (index < 0) {
                index = -(index + 1);
            }
            super.add(index, element);
        }
        return true;
    }
    
    @Override
    public /* bridge */ boolean add(final Object o) {
        return this.add((EventBus.Subscriber)o);
    }
    
    public ConcurrentSubscriberArrayList() {
        super();
    }
    
    public /* bridge */ boolean contains(final EventBus.Subscriber o) {
        return super.contains(o);
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object o) {
        return (o == null || o instanceof EventBus.Subscriber) && this.contains((EventBus.Subscriber)o);
    }
    
    public /* bridge */ int indexOf(final EventBus.Subscriber o) {
        return super.indexOf(o);
    }
    
    @Override
    public final /* bridge */ int indexOf(final Object o) {
        if (o == null || o instanceof EventBus.Subscriber) {
            return this.indexOf((EventBus.Subscriber)o);
        }
        return -1;
    }
    
    public /* bridge */ int lastIndexOf(final EventBus.Subscriber o) {
        return super.lastIndexOf(o);
    }
    
    @Override
    public final /* bridge */ int lastIndexOf(final Object o) {
        if (o == null || o instanceof EventBus.Subscriber) {
            return this.lastIndexOf((EventBus.Subscriber)o);
        }
        return -1;
    }
    
    public /* bridge */ boolean remove(final EventBus.Subscriber o) {
        return super.remove(o);
    }
    
    @Override
    public final /* bridge */ boolean remove(final Object o) {
        return (o == null || o instanceof EventBus.Subscriber) && this.remove((EventBus.Subscriber)o);
    }
    
    public /* bridge */ int getSize() {
        return super.size();
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.getSize();
    }
}
