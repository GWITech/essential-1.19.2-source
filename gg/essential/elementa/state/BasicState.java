package gg.essential.elementa.state;

import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\r\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0006J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0003\u001a\u00028\u0000X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\r" }, d2 = { "Lgg/essential/elementa/state/BasicState;", "T", "Lgg/essential/elementa/state/State;", "valueBacker", "(Ljava/lang/Object;)V", "getValueBacker", "()Ljava/lang/Object;", "setValueBacker", "Ljava/lang/Object;", "get", "set", "", "value", "Elementa" })
public class BasicState<T> extends State<T>
{
    private T valueBacker;
    
    public BasicState(final T valueBacker) {
        super();
        this.valueBacker = valueBacker;
    }
    
    protected final T getValueBacker() {
        return this.valueBacker;
    }
    
    protected final void setValueBacker(final T <set-?>) {
        this.valueBacker = <set-?>;
    }
    
    @Override
    public T get() {
        return this.valueBacker;
    }
    
    @Override
    public void set(final T value) {
        if (Intrinsics.areEqual((Object)value, (Object)this.valueBacker)) {
            return;
        }
        super.set(this.valueBacker = value);
    }
}
