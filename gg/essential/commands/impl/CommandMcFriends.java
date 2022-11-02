package gg.essential.commands.impl;

import gg.essential.util.*;
import gg.essential.gui.friends.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.api.commands.*;

public class CommandMcFriends extends Command
{
    public CommandMcFriends() {
        super("essentialfriends");
    }
    
    @DefaultHandler
    public void handle() {
        GuiUtil.INSTANCE.openScreen(new SocialMenu());
    }
}
