package gg.essential.elementa.state;

import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.util.function.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\r\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0002\u0010\u0012J,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00150\u0014\"\u0004\b\u0001\u0010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00150\u0006J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0000\"\u0004\b\u0001\u0010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00150\u0017J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006J\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u001a\u0010\u001b\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0006J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ,\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00150\u001f0\u0000\"\u0004\b\u0001\u0010\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00150\u0000R&\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006!" }, d2 = { "Lgg/essential/elementa/state/State;", "T", "", "()V", "listeners", "", "Lkotlin/Function1;", "", "getListeners", "()Ljava/util/List;", "get", "()Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "defaultProvider", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "map", "Lgg/essential/elementa/state/MappedState;", "U", "mapper", "Ljava/util/function/Function;", "onSetValue", "listener", "Ljava/util/function/Consumer;", "set", "value", "(Ljava/lang/Object;)V", "zip", "Lkotlin/Pair;", "otherState", "Elementa" })
public abstract class State<T>
{
    @NotNull
    private final List<Function1<T, Unit>> listeners;
    
    public State() {
        super();
        this.listeners = new ArrayList<Function1<T, Unit>>();
    }
    
    @NotNull
    protected final List<Function1<T, Unit>> getListeners() {
        return this.listeners;
    }
    
    public abstract T get();
    
    public void set(final T value) {
        final Iterable $this$forEach$iv = this.listeners;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Function1 it = (Function1)element$iv;
            final int n = 0;
            it.invoke((Object)value);
        }
    }
    
    public final void set(@NotNull final Function1<? super T, ? extends T> mapper) {
        Intrinsics.checkNotNullParameter((Object)mapper, "mapper");
        this.set(mapper.invoke(this.get()));
    }
    
    @NotNull
    public final Function0<Unit> onSetValue(@NotNull final Function1<? super T, Unit> listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        this.listeners.add((Function1<T, Unit>)listener);
        return (Function0<Unit>)new State$onSetValue.State$onSetValue$1(this, (Function1)listener);
    }
    
    @NotNull
    public final Function0<Unit> onSetValue(@NotNull final Consumer<T> listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        return this.onSetValue((Function1<? super T, Unit>)new State$onSetValue.State$onSetValue$2((Consumer)listener));
    }
    
    public final T getOrDefault(final T defaultValue) {
        T value;
        if ((value = this.get()) == null) {
            value = defaultValue;
        }
        return value;
    }
    
    public final T getOrElse(@NotNull final Function0<? extends T> defaultProvider) {
        Intrinsics.checkNotNullParameter((Object)defaultProvider, "defaultProvider");
        Object o;
        if ((o = this.get()) == null) {
            o = defaultProvider.invoke();
        }
        return (T)o;
    }
    
    @NotNull
    public final <U> MappedState<T, U> map(@NotNull final Function1<? super T, ? extends U> mapper) {
        Intrinsics.checkNotNullParameter((Object)mapper, "mapper");
        return new MappedState<T, U>(this, mapper);
    }
    
    @NotNull
    public final <U> State<U> map(@NotNull final Function<T, U> mapper) {
        Intrinsics.checkNotNullParameter((Object)mapper, "mapper");
        return (State)this.map((kotlin.jvm.functions.Function1<? super T, ?>)new State$map.State$map$1((Function)mapper));
    }
    
    @NotNull
    public final <U> State<Pair<T, U>> zip(@NotNull final State<U> otherState) {
        Intrinsics.checkNotNullParameter((Object)otherState, "otherState");
        return (State)new ZippedState((State<Object>)this, (State<Object>)otherState);
    }
}
