package gg.essential.commands.impl;

import gg.essential.network.connectionmanager.chat.*;
import com.google.common.collect.*;
import gg.essential.commands.engine.*;
import java.util.function.*;
import gg.essential.connectionmanager.common.packet.*;
import java.util.concurrent.*;
import gg.essential.api.commands.*;
import gg.essential.util.*;
import gg.essential.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.chat.*;
import com.sparkuniverse.toolbox.chat.model.*;
import kotlin.collections.*;
import java.util.*;
import org.jetbrains.annotations.*;

public class CommandMessage extends Command
{
    private static final ChatManager cm;
    
    public CommandMessage() {
        super("essentialmessage");
    }
    
    @Nullable
    @Override
    public Set<Alias> getCommandAliases() {
        return ImmutableSet.of(new Alias("emsg"));
    }
    
    @DefaultHandler
    public void handle(@DisplayName("ign") final EssentialFriend friend, @DisplayName("message") @Greedy final String message) throws ExecutionException, InterruptedException {
        CommandMessage.cm.sendMessage(friend.getChannel().getId(), message, new EarlyResponseHandler(friend));
    }
    
    public void onConfirm(final String message) {
        MinecraftUtils.INSTANCE.sendMessage(message);
    }
    
    static {
        cm = Essential.getInstance().getConnectionManager().getChatManager();
    }
    
    private class EarlyResponseHandler implements Connection.EarlyResponseHandler
    {
        private final EssentialFriend friend;
        final /* synthetic */ CommandMessage this$0;
        
        public EarlyResponseHandler(final CommandMessage this$0, final EssentialFriend friend) {
            this.this$0 = this$0;
            super();
            this.friend = friend;
        }
        
        @Override
        public void accept(final Optional<Packet> packet) {
            if (packet.isPresent() && packet.get() instanceof ServerChatChannelMessagePacket) {
                final Message messageObj = (Message)CollectionsKt.first((List)Arrays.asList(packet.get().getMessages()));
                messageObj.setRead(true);
                CommandMessage.cm.updateReadState(messageObj, true);
                this.this$0.onConfirm("§dTo " + this.friend.getIgn() + "§r: " + messageObj.getContents());
            }
            else {
                this.this$0.onConfirm("Error!");
            }
        }
        
        @NotNull
        @Override
        public Consumer<Optional<Packet>> andThen(@NotNull final Consumer<? super Optional<Packet>> after) {
            return packet -> {};
        }
        
        @Override
        public /* bridge */ void accept(final Object o) {
            this.accept((Optional<Packet>)o);
        }
        
        private static /* synthetic */ void lambda$andThen$0(final Optional packet) {
        }
    }
}
