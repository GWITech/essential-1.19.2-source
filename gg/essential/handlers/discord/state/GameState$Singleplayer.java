package gg.essential.handlers.discord.state;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/handlers/discord/state/GameState$Singleplayer;", "Lgg/essential/handlers/discord/state/GameState;", "()V", "essential" })
public static final class Singleplayer extends GameState
{
    @NotNull
    public static final Singleplayer INSTANCE;
    
    private Singleplayer() {
        super((byte)0);
    }
    
    static {
        INSTANCE = new Singleplayer();
    }
}
