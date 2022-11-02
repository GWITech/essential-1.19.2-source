package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.connectionmanager.common.packet.*;
import com.sparkuniverse.toolbox.chat.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerChatChannelMessagePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final Message[] messages;
    
    public ServerChatChannelMessagePacket(@NotNull final Message messageModel) {
        this(new Message[] { messageModel });
    }
    
    public ServerChatChannelMessagePacket(@NotNull final Message[] messages) {
        super();
        this.messages = messages;
    }
    
    @NotNull
    public Message[] getMessages() {
        return this.messages;
    }
}
