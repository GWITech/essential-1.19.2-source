package gg.essential.gui.common;

import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00028\u0000H\u0017¢\u0006\u0002\u0010
                                                   R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u000b""" }, d2 = { "Lgg/essential/gui/common/ReadOnlyState;", "T", "Lgg/essential/elementa/state/State;", "internalState", "(Lgg/essential/elementa/state/State;)V", "get", "()Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/Object;)V", "essential" })
public final class ReadOnlyState<T> extends State<T>
{
    @NotNull
    private final State<T> internalState;
    
    public ReadOnlyState(@NotNull final State<T> internalState) {
        Intrinsics.checkNotNullParameter((Object)internalState, "internalState");
        super();
        StateExtensionsKt.onSetValueAndNow(this.internalState = internalState, (kotlin.jvm.functions.Function1<? super T, Unit>)new Function1<T, Unit>() {
            final /* synthetic */ ReadOnlyState<T> this$0;
            
            ReadOnlyState$1() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke(final T it) {
                State.this.set(it);
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke(p1);
                return Unit.INSTANCE;
            }
        });
    }
    
    @Override
    public T get() {
        return this.internalState.get();
    }
    
    @Deprecated(message = "This state is read-only", level = DeprecationLevel.ERROR)
    @Override
    @java.lang.Deprecated
    public void set(final T value) {
        throw new IllegalStateException("Cannot set read only value");
    }
    
    public static final /* synthetic */ void access$set$s80204913(final ReadOnlyState $this, final Object value) {
        $this.set(value);
    }
}
