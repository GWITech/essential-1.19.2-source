package gg.essential.mixins.impl.client.network;

import gg.essential.mixins.impl.*;
import net.minecraft.client.network.*;
import gg.essential.*;
import gg.essential.event.network.chat.*;

public class NetHandlerPlayClientHook extends ClassHook<ClientPlayNetworkHandler>
{
    public NetHandlerPlayClientHook(final ClientPlayNetworkHandler instance) {
        super(instance);
    }
    
    public String sendChatMessage(final String message) {
        if (message.startsWith("/")) {
            final SendCommandEvent event = new SendCommandEvent(message.substring(1));
            Essential.EVENT_BUS.post(event);
            return event.isCancelled() ? null : ("/" + event.getCommandLine());
        }
        final SendChatMessageEvent event2 = new SendChatMessageEvent(message);
        Essential.EVENT_BUS.post(event2);
        return event2.isCancelled() ? null : event2.getMessage();
    }
    
    public boolean sendCommand(final String commandLine) {
        final SendCommandEvent event = new SendCommandEvent(commandLine);
        Essential.EVENT_BUS.post(event);
        return event.isCancelled();
    }
}
