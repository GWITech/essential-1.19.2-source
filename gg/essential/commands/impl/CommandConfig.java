package gg.essential.commands.impl;

import gg.essential.util.*;
import gg.essential.config.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.api.commands.*;

public class CommandConfig extends Command
{
    public CommandConfig() {
        super("essential");
    }
    
    @DefaultHandler
    public void handle() {
        GuiUtil.INSTANCE.openScreen(EssentialConfig.INSTANCE.gui());
    }
}
