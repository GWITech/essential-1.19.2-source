package gg.essential.gui.common;

import gg.essential.elementa.state.*;
import java.util.function.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import java.lang.ref.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012
                                                   \u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\b¢\u0006\u0002\u0010	J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0013R \u0010
                                                   \u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086.¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0010\u000e"\u0004\b\u000f\u0010\u0010¨\u0006\u0014""" }, d2 = { "Lgg/essential/gui/common/WeakState$WeakListener;", "T", "Ljava/lang/ref/WeakReference;", "Lgg/essential/elementa/state/State;", "Ljava/util/function/Consumer;", "weakState", "Lgg/essential/gui/common/WeakState;", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "(Lgg/essential/gui/common/WeakState;Ljava/lang/ref/ReferenceQueue;)V", "unregister", "Lkotlin/Function0;", "", "getUnregister", "()Lkotlin/jvm/functions/Function0;", "setUnregister", "(Lkotlin/jvm/functions/Function0;)V", "accept", "value", "(Ljava/lang/Object;)V", "essential" })
private static final class WeakListener<T> extends WeakReference<State<T>> implements Consumer<T>
{
    public Function0<Unit> unregister;
    
    public WeakListener(@NotNull final WeakState<T> weakState, @NotNull final ReferenceQueue<State<?>> referenceQueue) {
        Intrinsics.checkNotNullParameter((Object)weakState, "weakState");
        Intrinsics.checkNotNullParameter((Object)referenceQueue, "referenceQueue");
        super(weakState, referenceQueue);
    }
    
    @NotNull
    public final Function0<Unit> getUnregister() {
        final Function0<Unit> unregister = this.unregister;
        if (unregister != null) {
            return unregister;
        }
        Intrinsics.throwUninitializedPropertyAccessException("unregister");
        return null;
    }
    
    public final void setUnregister(@NotNull final Function0<Unit> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.unregister = <set-?>;
    }
    
    @Override
    public void accept(final T value) {
        final State state = this.get();
        if (state != null) {
            state.set(value);
        }
    }
}
