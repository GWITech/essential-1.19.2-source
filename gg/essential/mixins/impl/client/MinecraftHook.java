package gg.essential.mixins.impl.client;

import gg.essential.mixins.impl.*;
import net.minecraft.client.*;
import gg.essential.*;
import gg.essential.universal.*;
import gg.essential.event.client.*;
import net.minecraft.util.profiler.*;
import gg.essential.event.network.server.*;
import gg.essential.handlers.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.event.gui.*;

public class MinecraftHook extends ClassHook<MinecraftClient>
{
    public MinecraftHook(final MinecraftClient instance) {
        super(instance);
    }
    
    public void preinit() {
        Essential.EVENT_BUS.register(Essential.getInstance());
        Essential.EVENT_BUS.post(new PreInitializationEvent());
    }
    
    public void startGame() {
        Essential.EVENT_BUS.post(new InitializationEvent());
    }
    
    public void postInit() {
        Essential.EVENT_BUS.post(new PostInitializationEvent());
    }
    
    public void runTick() {
        final Profiler mcProfiler = UMinecraft.getMinecraft().getProfiler();
        mcProfiler.push("essential_tick");
        ++ClientTickEvent.counter;
        Essential.EVENT_BUS.post(new ClientTickEvent());
        mcProfiler.pop();
    }
    
    public void disconnect() {
        Essential.EVENT_BUS.post(new ServerLeaveEvent());
    }
    
    public void shutdown() {
        ShutdownHook.INSTANCE.execute();
    }
    
    public GuiOpenEvent displayGuiScreen(final Screen screen) {
        final GuiOpenEvent guiOpenEvent = new GuiOpenEvent(screen);
        Essential.EVENT_BUS.post(guiOpenEvent);
        return guiOpenEvent;
    }
}
