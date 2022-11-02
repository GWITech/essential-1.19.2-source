package gg.essential.gui.screenshot.concurrent;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J"\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                   \u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                   \u0000R!\u0010	\u001a\u0012\u0012\u0004\u0012\u00020\u000b0
                                                   j\b\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u000e¨\u0006\u0014""" }, d2 = { "Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable$Companion;", "", "()V", "CACHE_WRITE", "", "FOCUS", "MIN_RES", "PRECOMPUTE", "REGULAR", "comparator", "Ljava/util/Comparator;", "Ljava/lang/Runnable;", "Lkotlin/Comparator;", "getComparator", "()Ljava/util/Comparator;", "withPriority", "Ljava/util/concurrent/Executor;", "windowIndex", "providerPriority", "indexInWindow", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final Comparator<Runnable> getComparator() {
        return PrioritizedCallable.access$getComparator$cp();
    }
    
    @NotNull
    public final Executor withPriority(@NotNull final Executor $this$withPriority, final int windowIndex, final int providerPriority, final int indexInWindow) {
        Intrinsics.checkNotNullParameter((Object)$this$withPriority, "<this>");
        return Companion::withPriority$lambda-0;
    }
    
    private static final void withPriority$lambda-0(final Executor $this_withPriority, final int $windowIndex, final int $providerPriority, final int $indexInWindow, final Runnable runnable) {
        Intrinsics.checkNotNullParameter((Object)$this_withPriority, "$this_withPriority");
        if (runnable instanceof PrioritizedTask) {
            $this_withPriority.execute(runnable);
        }
        else {
            final PrioritizedCallable$Companion$withPriority$1$callable.PrioritizedCallable$Companion$withPriority$1$callable$1 callable = new PrioritizedCallable$Companion$withPriority$1$callable.PrioritizedCallable$Companion$withPriority$1$callable$1($windowIndex, $providerPriority, $indexInWindow, runnable);
            $this_withPriority.execute(new PrioritizedTask<Object>((PrioritizedCallable<?>)callable));
        }
    }
    
    public Companion(final byte b) {
        this();
    }
}
