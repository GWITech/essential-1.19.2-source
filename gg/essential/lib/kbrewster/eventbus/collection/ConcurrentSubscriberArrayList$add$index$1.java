package gg.essential.lib.kbrewster.eventbus.collection;

import java.util.function.*;
import kotlin.*;
import gg.essential.lib.kbrewster.eventbus.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 16 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "obj", "Lgg/essential/lib/kbrewster/eventbus/EventBus$Subscriber;", "applyAsInt" })
static final class ConcurrentSubscriberArrayList$add$index$1<T> implements ToIntFunction<T> {
    public static final ConcurrentSubscriberArrayList$add$index.ConcurrentSubscriberArrayList$add$index$1 INSTANCE;
    
    @Override
    public /* bridge */ int applyAsInt(final Object o) {
        return this.applyAsInt((EventBus.Subscriber)o);
    }
    
    public final int applyAsInt(@NotNull final EventBus.Subscriber obj) {
        Intrinsics.checkParameterIsNotNull((Object)obj, "obj");
        return obj.getPriority();
    }
    
    ConcurrentSubscriberArrayList$add$index$1() {
        super();
    }
    
    static {
        ConcurrentSubscriberArrayList$add$index.ConcurrentSubscriberArrayList$add$index$1.INSTANCE = new ConcurrentSubscriberArrayList$add$index.ConcurrentSubscriberArrayList$add$index$1();
    }
}