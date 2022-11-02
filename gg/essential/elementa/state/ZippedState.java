package gg.essential.elementa.state;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B!\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\bJ\u0014\u0010\r\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u0014\u0010\u000f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010" }, d2 = { "Lgg/essential/elementa/state/ZippedState;", "T", "U", "Lgg/essential/elementa/state/BasicState;", "Lkotlin/Pair;", "firstState", "Lgg/essential/elementa/state/State;", "secondState", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "removeFirstListener", "Lkotlin/Function0;", "", "removeSecondListener", "rebindFirst", "newState", "rebindSecond", "Elementa" })
public final class ZippedState<T, U> extends BasicState<Pair<? extends T, ? extends U>>
{
    @NotNull
    private Function0<Unit> removeFirstListener;
    @NotNull
    private Function0<Unit> removeSecondListener;
    
    public ZippedState(@NotNull final State<T> firstState, @NotNull final State<U> secondState) {
        Intrinsics.checkNotNullParameter((Object)firstState, "firstState");
        Intrinsics.checkNotNullParameter((Object)secondState, "secondState");
        super(TuplesKt.to((Object)firstState.get(), (Object)secondState.get()));
        this.removeFirstListener = firstState.onSetValue((kotlin.jvm.functions.Function1<? super T, Unit>)new ZippedState$removeFirstListener.ZippedState$removeFirstListener$1(this));
        this.removeSecondListener = secondState.onSetValue((kotlin.jvm.functions.Function1<? super U, Unit>)new ZippedState$removeSecondListener.ZippedState$removeSecondListener$1(this));
    }
    
    public final void rebindFirst(@NotNull final State<T> newState) {
        Intrinsics.checkNotNullParameter((Object)newState, "newState");
        this.removeFirstListener.invoke();
        this.removeFirstListener = newState.onSetValue((kotlin.jvm.functions.Function1<? super T, Unit>)new ZippedState$rebindFirst.ZippedState$rebindFirst$1(this));
        this.set((Pair<? extends T, ? extends U>)TuplesKt.to((Object)newState.get(), this.get().getSecond()));
    }
    
    public final void rebindSecond(@NotNull final State<U> newState) {
        Intrinsics.checkNotNullParameter((Object)newState, "newState");
        this.removeSecondListener.invoke();
        this.removeSecondListener = newState.onSetValue((kotlin.jvm.functions.Function1<? super U, Unit>)new ZippedState$rebindSecond.ZippedState$rebindSecond$1(this));
        this.set((Pair<? extends T, ? extends U>)TuplesKt.to(this.get().getFirst(), (Object)newState.get()));
    }
}
