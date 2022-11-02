package gg.essential.gui.friends.state;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/gui/friends/state/PlayerActivity$Offline;", "Lgg/essential/gui/friends/state/PlayerActivity;", "()V", "essential" })
public static final class Offline extends PlayerActivity
{
    @NotNull
    public static final Offline INSTANCE;
    
    private Offline() {
        super((byte)0);
    }
    
    static {
        INSTANCE = new Offline();
    }
}
