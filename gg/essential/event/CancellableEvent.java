package gg.essential.event;

public class CancellableEvent
{
    private boolean cancelled;
    
    public CancellableEvent() {
        super();
    }
    
    public void setCancelled$1385ff() {
        this.cancelled = true;
    }
    
    public boolean isCancelled() {
        return this.cancelled;
    }
}
