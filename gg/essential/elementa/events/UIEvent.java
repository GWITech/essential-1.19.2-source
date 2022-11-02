package gg.essential.elementa.events;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000f" }, d2 = { "Lgg/essential/elementa/events/UIEvent;", "", "()V", "propagationStopped", "", "getPropagationStopped", "()Z", "setPropagationStopped", "(Z)V", "propagationStoppedImmediately", "getPropagationStoppedImmediately", "setPropagationStoppedImmediately", "stopImmediatePropagation", "", "stopPropagation", "Elementa" })
public abstract class UIEvent
{
    private boolean propagationStopped;
    private boolean propagationStoppedImmediately;
    
    public UIEvent() {
        super();
    }
    
    public final boolean getPropagationStopped() {
        return this.propagationStopped;
    }
    
    public final void setPropagationStopped(final boolean <set-?>) {
        this.propagationStopped = <set-?>;
    }
    
    public final boolean getPropagationStoppedImmediately() {
        return this.propagationStoppedImmediately;
    }
    
    public final void setPropagationStoppedImmediately(final boolean <set-?>) {
        this.propagationStoppedImmediately = <set-?>;
    }
    
    public final void stopPropagation() {
        this.propagationStopped = true;
    }
    
    public final void stopImmediatePropagation() {
        this.propagationStoppedImmediately = true;
    }
}
