package gg.essential.event.client;

import net.minecraft.client.util.*;
import org.jetbrains.annotations.*;

public class ReAuthEvent
{
    private final Session session;
    
    public ReAuthEvent(@NotNull final Session session) {
        super();
        this.session = session;
    }
    
    public Session getSession() {
        return this.session;
    }
    
    public static class Pre extends ReAuthEvent
    {
        public Pre(final Session session) {
            super(session);
        }
    }
    
    public static class Post extends ReAuthEvent
    {
        public Post(final Session session) {
            super(session);
        }
    }
}
