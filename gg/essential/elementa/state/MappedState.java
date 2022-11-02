package gg.essential.elementa.state;

import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e" }, d2 = { "Lgg/essential/elementa/state/MappedState;", "T", "U", "Lgg/essential/elementa/state/BasicState;", "initialState", "Lgg/essential/elementa/state/State;", "mapper", "Lkotlin/Function1;", "(Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)V", "removeListener", "Lkotlin/Function0;", "", "rebind", "newState", "Elementa" })
public class MappedState<T, U> extends BasicState<U>
{
    @NotNull
    private final Function1<T, U> mapper;
    @NotNull
    private Function0<Unit> removeListener;
    
    public MappedState(@NotNull final State<T> initialState, @NotNull final Function1<? super T, ? extends U> mapper) {
        Intrinsics.checkNotNullParameter((Object)initialState, "initialState");
        Intrinsics.checkNotNullParameter((Object)mapper, "mapper");
        super(mapper.invoke((Object)initialState.get()));
        this.mapper = (Function1<T, U>)mapper;
        this.removeListener = initialState.onSetValue((kotlin.jvm.functions.Function1<? super T, Unit>)new MappedState$removeListener.MappedState$removeListener$1(this));
    }
    
    public final void rebind(@NotNull final State<T> newState) {
        Intrinsics.checkNotNullParameter((Object)newState, "newState");
        this.removeListener.invoke();
        this.removeListener = newState.onSetValue((kotlin.jvm.functions.Function1<? super T, Unit>)new MappedState$rebind.MappedState$rebind$1(this));
        this.set((U)this.mapper.invoke((Object)newState.get()));
    }
    
    public static final /* synthetic */ Function1 access$getMapper$p(final MappedState $this) {
        return $this.mapper;
    }
}
