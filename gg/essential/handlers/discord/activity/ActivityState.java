package gg.essential.handlers.discord.activity;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000:
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0007\b	
                                                   \u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001	\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016""" }, d2 = { "Lgg/essential/handlers/discord/activity/ActivityState;", "", "()V", "text", "", "getText", "()Ljava/lang/String;", "GUI", "Multiplayer", "Realm", "SPSGuest", "SPSHost", "Singleplayer", "Lgg/essential/handlers/discord/activity/ActivityState$Multiplayer;", "Lgg/essential/handlers/discord/activity/ActivityState$SPSHost;", "Lgg/essential/handlers/discord/activity/ActivityState$SPSGuest;", "Lgg/essential/handlers/discord/activity/ActivityState$Singleplayer;", "Lgg/essential/handlers/discord/activity/ActivityState$Realm;", "Lgg/essential/handlers/discord/activity/ActivityState$GUI$Described;", "Lgg/essential/handlers/discord/activity/ActivityState$GUI$MainMenu;", "Lgg/essential/handlers/discord/activity/ActivityState$GUI$ServerList;", "Lgg/essential/handlers/discord/activity/ActivityState$GUI$Options;", "essential" })
public abstract class ActivityState
{
    private ActivityState() {
        super();
    }
    
    @NotNull
    public abstract String getText();
    
    public ActivityState(final byte b) {
        this();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0014
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/handlers/discord/activity/ActivityState$Singleplayer;", "Lgg/essential/handlers/discord/activity/ActivityState;", "()V", "text", "", "getText", "()Ljava/lang/String;", "essential" })
    public static final class Singleplayer extends ActivityState
    {
        @NotNull
        public static final Singleplayer INSTANCE;
        @NotNull
        private static final String text;
        
        private Singleplayer() {
            super((byte)0);
        }
        
        @NotNull
        @Override
        public String getText() {
            return Singleplayer.text;
        }
        
        static {
            INSTANCE = new Singleplayer();
            text = "Playing Singleplayer";
        }
    }
}
