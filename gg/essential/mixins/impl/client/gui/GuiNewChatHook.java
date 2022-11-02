package gg.essential.mixins.impl.client.gui;

import gg.essential.mixins.impl.*;
import net.minecraft.client.gui.hud.*;
import net.minecraft.text.*;
import gg.essential.event.network.chat.*;
import gg.essential.*;

public class GuiNewChatHook extends ClassHook<ChatHud>
{
    public GuiNewChatHook(final ChatHud instance) {
        super(instance);
    }
    
    public ChatEvent printChatMessage(final Text chatComponent) {
        final ChatEvent event = new ChatEvent(chatComponent);
        Essential.EVENT_BUS.post(event);
        return event;
    }
}
