package gg.essential.handlers.discord.activity;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/handlers/discord/activity/ActivityState$GUI$MainMenu;", "Lgg/essential/handlers/discord/activity/ActivityState;", "()V", "text", "", "getText", "()Ljava/lang/String;", "essential" })
public static final class MainMenu extends ActivityState
{
    @NotNull
    public static final MainMenu INSTANCE;
    @NotNull
    private static final String text;
    
    private MainMenu() {
        super((byte)0);
    }
    
    @NotNull
    @Override
    public String getText() {
        return MainMenu.text;
    }
    
    static {
        MainMenu.INSTANCE = new MainMenu();
        MainMenu.text = "Looking at the main menu";
    }
}
