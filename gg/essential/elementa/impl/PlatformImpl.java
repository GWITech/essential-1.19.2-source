package gg.essential.elementa.impl;

import net.minecraft.client.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.gui.screen.*;
import net.minecraft.*;

@ApiStatus.Internal
public class PlatformImpl implements Platform
{
    public PlatformImpl() {
        super();
    }
    
    @Override
    public int getMcVersion() {
        return 11801;
    }
    
    @Nullable
    @Override
    public Object getCurrentScreen() {
        return MinecraftClient.getInstance().currentScreen;
    }
    
    @Override
    public void setCurrentScreen(@Nullable final Object screen) {
        MinecraftClient.getInstance().setScreen((Screen)screen);
    }
    
    @Override
    public boolean isAllowedInChat(final char c) {
        return SharedConstants.isValidChar(c);
    }
    
    @Override
    public void enableStencil() {
    }
    
    @Override
    public boolean isCallingFromMinecraftThread() {
        return MinecraftClient.getInstance().method_18854();
    }
}
