package gg.essential.elementa.constraints.debug;

import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0080\b\u00f8\u0001\u0000\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b" }, d2 = { "constraintDebugger", "Lgg/essential/elementa/constraints/debug/ConstraintDebugger;", "getConstraintDebugger", "()Lgg/essential/elementa/constraints/debug/ConstraintDebugger;", "setConstraintDebugger", "(Lgg/essential/elementa/constraints/debug/ConstraintDebugger;)V", "withDebugger", "", "debugger", "block", "Lkotlin/Function0;", "Elementa" })
public final class ConstraintDebuggerKt
{
    @Nullable
    private static ConstraintDebugger constraintDebugger;
    
    @Nullable
    public static final ConstraintDebugger getConstraintDebugger() {
        return ConstraintDebuggerKt.constraintDebugger;
    }
    
    public static final void setConstraintDebugger(@Nullable final ConstraintDebugger <set-?>) {
        ConstraintDebuggerKt.constraintDebugger = <set-?>;
    }
    
    public static final void withDebugger(@NotNull final ConstraintDebugger debugger, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter((Object)debugger, "debugger");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final int $i$f$withDebugger = 0;
        final ConstraintDebugger prevDebugger = getConstraintDebugger();
        setConstraintDebugger(debugger);
        try {
            block.invoke();
        }
        finally {
            InlineMarker.finallyStart(1);
            setConstraintDebugger(prevDebugger);
            InlineMarker.finallyEnd(1);
        }
    }
}
