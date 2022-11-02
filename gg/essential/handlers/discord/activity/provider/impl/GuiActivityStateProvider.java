package gg.essential.handlers.discord.activity.provider.impl;

import gg.essential.handlers.discord.activity.provider.*;
import kotlin.*;
import gg.essential.*;
import gg.essential.universal.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.handlers.discord.activity.*;
import gg.essential.api.gui.*;
import gg.essential.mixins.ext.client.gui.*;
import net.minecraft.client.gui.screen.multiplayer.*;
import net.minecraft.client.gui.screen.pack.*;
import net.minecraft.client.gui.screen.*;
import net.minecraft.client.gui.screen.option.*;
import gg.essential.vigilance.gui.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J
                                                   \u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020	H\u0002¨\u0006
                                                   """ }, d2 = { "Lgg/essential/handlers/discord/activity/provider/impl/GuiActivityStateProvider;", "Lgg/essential/handlers/discord/activity/provider/ActivityStateProvider;", "()V", "init", "", "provide", "Lgg/essential/handlers/discord/activity/ActivityState;", "stateForScreen", "screen", "Lnet/minecraft/client/gui/screen/Screen;", "essential" })
public final class GuiActivityStateProvider implements ActivityStateProvider
{
    public GuiActivityStateProvider() {
        super();
    }
    
    @Override
    public void init() {
        Essential.getInstance().registerListener(this);
    }
    
    @Nullable
    @Override
    public ActivityState provide() {
        final Screen currentScreen = UMinecraft.getMinecraft().currentScreen;
        if (currentScreen == null) {
            return null;
        }
        final Screen screen = currentScreen;
        return this.stateForScreen(screen);
    }
    
    private final ActivityState stateForScreen(final Screen screen) {
        if (Intrinsics.areEqual((Object)screen.getClass().getName(), (Object)"net.labymod.gui.ModGuiMultiplayer")) {
            return (ActivityState)ActivityState$GUI$ServerList.INSTANCE;
        }
        ActivityState activityState;
        if (screen instanceof final EssentialGUI essentialGUI) {
            final String discordActivityDescription = essentialGUI.getDiscordActivityDescription();
            ActivityState.GUI.Described described;
            if (discordActivityDescription != null) {
                final String it = discordActivityDescription;
                described = new ActivityState.GUI.Described(it);
            }
            else {
                described = null;
            }
            activityState = described;
        }
        else {
            activityState = ((screen instanceof GuiMainMenu) ? ActivityState.GUI.MainMenu.INSTANCE : ((screen instanceof AddServerScreen || screen instanceof MultiplayerScreen) ? ActivityState$GUI$ServerList.INSTANCE : ((screen instanceof OptionsScreen || screen instanceof PackScreen) ? new ActivityState.GUI.Options((byte)0) : ((screen instanceof DirectConnectScreen) ? ActivityState$GUI$ServerList.INSTANCE : ((screen instanceof GameOptionsScreen) ? new ActivityState.GUI.Options((byte)0) : ((screen instanceof SettingsGui) ? ((ActivityState)new ActivityState.GUI.Options(false)) : null))))));
        }
        return activityState;
    }
}
