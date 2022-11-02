package gg.essential.gui.screenshot.concurrent;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b""" }, d2 = { "Lgg/essential/gui/screenshot/concurrent/PrioritizedTask;", "D", "Ljava/util/concurrent/FutureTask;", "prioritizedCallback", "Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;", "(Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;)V", "getPrioritizedCallback", "()Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;", "essential" })
public final class PrioritizedTask<D> extends FutureTask<D>
{
    @NotNull
    private final PrioritizedCallable<D> prioritizedCallback;
    
    public PrioritizedTask(@NotNull final PrioritizedCallable<D> prioritizedCallback) {
        Intrinsics.checkNotNullParameter((Object)prioritizedCallback, "prioritizedCallback");
        super(prioritizedCallback);
        this.prioritizedCallback = prioritizedCallback;
    }
    
    @NotNull
    public final PrioritizedCallable<D> getPrioritizedCallback() {
        return this.prioritizedCallback;
    }
}
