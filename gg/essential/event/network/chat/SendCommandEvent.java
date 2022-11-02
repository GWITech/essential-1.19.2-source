package gg.essential.event.network.chat;

import gg.essential.event.*;

public class SendCommandEvent extends CancellableEvent
{
    private final String commandLine;
    
    public SendCommandEvent(final String commandLine) {
        super();
        this.commandLine = commandLine;
    }
    
    public String getCommandLine() {
        return this.commandLine;
    }
}
