package gg.essential.commands.impl;

import gg.essential.gui.sps.*;
import gg.essential.api.commands.*;

public class CommandInviteFriends extends Command
{
    public CommandInviteFriends() {
        super("invitefriends");
    }
    
    @DefaultHandler
    public void handle() {
        InviteFriendsModal.INSTANCE.show();
    }
}
