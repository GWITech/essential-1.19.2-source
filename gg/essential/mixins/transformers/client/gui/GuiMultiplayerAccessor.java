package gg.essential.mixins.transformers.client.gui;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.gui.screen.multiplayer.*;
import org.spongepowered.asm.mixin.gen.*;
import net.minecraft.client.gui.widget.*;
import net.minecraft.client.gui.screen.*;

@Mixin({ MultiplayerScreen.class })
public interface GuiMultiplayerAccessor
{
    @Accessor("serverListWidget")
    MultiplayerServerListWidget getServerListSelector();
    
    @Accessor("buttonJoin")
    ButtonWidget getBtnSelectServer();
    
    @Accessor("parent")
    Screen getParentScreen();
}
