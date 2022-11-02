package gg.essential.util;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00028\u00002\f\u0010	\u001a\b\u0012\u0004\u0012\u00028\u00000
                                                   ¢\u0006\u0002\u0010\u000bJ)\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\r0\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004
                                                   \u0002\u0010\u0007¨\u0006\u0012""" }, d2 = { "Lgg/essential/util/RefCounted;", "T", "", "()V", "refCount", "", "value", "Ljava/lang/Object;", "obtain", "factory", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "release", "", "disposer", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "essential" })
public final class RefCounted<T>
{
    private int refCount;
    @Nullable
    private T value;
    
    public RefCounted() {
        super();
    }
    
    @NotNull
    public final synchronized T obtain(@NotNull final Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter((Object)factory, "factory");
        ++this.refCount;
        Object value;
        if ((value = this.value) == null) {
            final Object it = factory.invoke();
            this.value = (T)it;
            value = it;
        }
        return (T)value;
    }
    
    public final synchronized void release(@NotNull final Function1<? super T, Unit> disposer) {
        Intrinsics.checkNotNullParameter((Object)disposer, "disposer");
        --this.refCount;
        if (this.refCount == 0) {
            final T value = this.value;
            Intrinsics.checkNotNull((Object)value);
            disposer.invoke((Object)value);
            this.value = null;
        }
    }
}
