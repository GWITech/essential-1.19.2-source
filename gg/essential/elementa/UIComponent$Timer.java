package gg.essential.elementa;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0017¨\u0006\u001b" }, d2 = { "Lgg/essential/elementa/UIComponent$Timer;", "", "delay", "", "interval", "callback", "Lkotlin/Function1;", "", "", "(JJLkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "hasDelayed", "", "getHasDelayed", "()Z", "setHasDelayed", "(Z)V", "getInterval", "()J", "lastTime", "getLastTime", "setLastTime", "(J)V", "timeLeft", "getTimeLeft", "setTimeLeft", "Elementa" })
private static final class Timer
{
    private final long interval;
    @NotNull
    private final Function1<Integer, Unit> callback;
    private boolean hasDelayed;
    private long timeLeft;
    private long lastTime;
    
    public Timer(final long delay, final long interval, @NotNull final Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        super();
        this.interval = interval;
        this.callback = (Function1<Integer, Unit>)callback;
        this.timeLeft = delay;
        this.lastTime = System.currentTimeMillis();
        if (delay == 0L) {
            this.hasDelayed = true;
            this.timeLeft = this.interval;
        }
    }
    
    public final long getInterval() {
        return this.interval;
    }
    
    @NotNull
    public final Function1<Integer, Unit> getCallback() {
        return this.callback;
    }
    
    public final boolean getHasDelayed() {
        return this.hasDelayed;
    }
    
    public final void setHasDelayed(final boolean <set-?>) {
        this.hasDelayed = <set-?>;
    }
    
    public final long getTimeLeft() {
        return this.timeLeft;
    }
    
    public final void setTimeLeft(final long <set-?>) {
        this.timeLeft = <set-?>;
    }
    
    public final long getLastTime() {
        return this.lastTime;
    }
    
    public final void setLastTime(final long <set-?>) {
        this.lastTime = <set-?>;
    }
}
