package gg.essential.lib.kbrewster.eventbus;

import kotlin.*;
import gg.essential.lib.kbrewster.eventbus.invokers.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 16 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0086\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013" }, d2 = { "Lgg/essential/lib/kbrewster/eventbus/EventBus$Subscriber;", "", "obj", "priority", "", "invoker", "Lgg/essential/lib/kbrewster/eventbus/invokers/InvokerType$SubscriberMethod;", "(Ljava/lang/Object;ILme/kbrewster/eventbus/invokers/InvokerType$SubscriberMethod;)V", "getObj", "()Ljava/lang/Object;", "getPriority", "()I", "equals", "", "other", "hashCode", "invoke", "", "arg", "KeventBus" })
public static final class Subscriber
{
    @NotNull
    private final Object obj;
    private final int priority;
    private final InvokerType.SubscriberMethod invoker;
    
    public final void invoke(@Nullable final Object arg) throws Exception {
        final InvokerType.SubscriberMethod invoker = this.invoker;
        if (invoker == null) {
            Intrinsics.throwNpe();
        }
        invoker.invoke(arg);
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return ((other != null) ? other.hashCode() : 0) == this.hashCode();
    }
    
    @Override
    public int hashCode() {
        return this.obj.hashCode();
    }
    
    public final int getPriority() {
        return this.priority;
    }
    
    public Subscriber(@NotNull final Object obj, final int priority, @Nullable final InvokerType.SubscriberMethod invoker) {
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        super();
        this.obj = obj;
        this.priority = priority;
        this.invoker = invoker;
    }
}
