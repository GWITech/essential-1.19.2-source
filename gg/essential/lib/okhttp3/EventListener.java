package gg.essential.lib.okhttp3;

public abstract class EventListener
{
    public static final EventListener NONE;
    
    public EventListener() {
        super();
    }
    
    static Factory factory(final EventListener listener) {
        return new Factory() {
            final /* synthetic */ EventListener val$listener;
            
            EventListener$2() {
                super();
            }
            
            @Override
            public EventListener create$a995d89() {
                return listener;
            }
        };
    }
    
    static {
        NONE = new EventListener() {
            EventListener$1() {
                super();
            }
        };
    }
    
    public interface Factory
    {
        EventListener create$a995d89();
    }
}
