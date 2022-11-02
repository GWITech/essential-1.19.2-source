package gg.essential.gui.friends.message.v2;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import java.time.*;
import kotlin.jvm.internal.*;
import com.sparkuniverse.toolbox.chat.model.*;
import gg.essential.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000N
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\f
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000b
                                                   \u0002\b\f
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020	\u0012\u0006\u0010
                                                   \u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ	\u0010#\u001a\u00020\u0003H\u00c6\u0003J	\u0010$\u001a\u00020\u0005H\u00c6\u0003J	\u0010%\u001a\u00020\u0007H\u00c6\u0003J	\u0010&\u001a\u00020	H\u00c6\u0003J	\u0010'\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rH\u00c6\u0003JG\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020	2\b\b\u0002\u0010
                                                   \u001a\u00020\u000b2
                                                   \b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0013\u0010*\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010,\u001a\u00020-J	\u0010.\u001a\u00020/H\u00d6\u0001J	\u00100\u001a\u00020	H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020	¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010
                                                   \u001a\u00020\u000b¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b
                                                   \u0000\u001a\u0004\b!\u0010"¨\u00062""" }, d2 = { "Lgg/essential/gui/friends/message/v2/ClientMessage;", "", "id", "", "channel", "Lcom/sparkuniverse/toolbox/chat/model/Channel;", "sender", "Ljava/util/UUID;", "contents", "", "sendState", "Lgg/essential/gui/friends/message/v2/SendState;", "replyTo", "Lgg/essential/gui/friends/message/v2/MessageRef;", "(JLcom/sparkuniverse/toolbox/chat/model/Channel;Ljava/util/UUID;Ljava/lang/String;Lgg/essential/gui/friends/message/v2/SendState;Lgg/essential/gui/friends/message/v2/MessageRef;)V", "getChannel", "()Lcom/sparkuniverse/toolbox/chat/model/Channel;", "getContents", "()Ljava/lang/String;", "getId", "()J", "getReplyTo", "()Lgg/essential/gui/friends/message/v2/MessageRef;", "getSendState", "()Lgg/essential/gui/friends/message/v2/SendState;", "sendTime", "Ljava/time/Instant;", "getSendTime", "()Ljava/time/Instant;", "getSender", "()Ljava/util/UUID;", "sent", "", "getSent", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "getInfraInstance", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "hashCode", "", "toString", "Companion", "essential" })
public final class ClientMessage
{
    @NotNull
    public static final Companion Companion;
    private final long id;
    @NotNull
    private final Channel channel;
    @NotNull
    private final UUID sender;
    @NotNull
    private final String contents;
    @NotNull
    private final SendState sendState;
    @Nullable
    private final MessageRef replyTo;
    @NotNull
    private final Instant sendTime;
    private final boolean sent;
    
    public ClientMessage(final long id, @NotNull final Channel channel, @NotNull final UUID sender, @NotNull final String contents, @NotNull final SendState sendState, @Nullable final MessageRef replyTo) {
        Intrinsics.checkNotNullParameter((Object)channel, "channel");
        Intrinsics.checkNotNullParameter((Object)sender, "sender");
        Intrinsics.checkNotNullParameter((Object)contents, "contents");
        Intrinsics.checkNotNullParameter((Object)sendState, "sendState");
        super();
        this.id = id;
        this.channel = channel;
        this.sender = sender;
        this.contents = contents;
        this.sendState = sendState;
        this.replyTo = replyTo;
        final Instant ofEpochMilli = Instant.ofEpochMilli((this.id >> 22) + 1609459200L);
        Intrinsics.checkNotNullExpressionValue((Object)ofEpochMilli, "ofEpochMilli((id shr 22)\u2026ls.messageTimeEpocMillis)");
        this.sendTime = ofEpochMilli;
        this.sent = (this.sendState == SendState.CONFIRMED);
    }
    
    public final long getId() {
        return this.id;
    }
    
    @NotNull
    public final Channel getChannel() {
        return this.channel;
    }
    
    @NotNull
    public final UUID getSender() {
        return this.sender;
    }
    
    @NotNull
    public final String getContents() {
        return this.contents;
    }
    
    @NotNull
    public final SendState getSendState() {
        return this.sendState;
    }
    
    @Nullable
    public final MessageRef getReplyTo() {
        return this.replyTo;
    }
    
    @NotNull
    public final Instant getSendTime() {
        return this.sendTime;
    }
    
    public final boolean getSent() {
        return this.sent;
    }
    
    @NotNull
    public final Message getInfraInstance() {
        Message messageById;
        if ((messageById = Essential.getInstance().getConnectionManager().getChatManager().getMessageById(this.id)) == null) {
            final long id;
            final long id2;
            final UUID sender;
            final String contents;
            final boolean b;
            final MessageRef replyTo;
            messageById = new Message(id, id2, sender, contents, b, (replyTo != null) ? Long.valueOf(replyTo.getMessageId()) : null);
            id = this.id;
            id2 = this.channel.getId();
            sender = this.sender;
            contents = this.contents;
            b = true;
            replyTo = this.replyTo;
        }
        return messageById;
    }
    
    @NotNull
    public final ClientMessage copy(final long id, @NotNull final Channel channel, @NotNull final UUID sender, @NotNull final String contents, @NotNull final SendState sendState, @Nullable final MessageRef replyTo) {
        Intrinsics.checkNotNullParameter((Object)channel, "channel");
        Intrinsics.checkNotNullParameter((Object)sender, "sender");
        Intrinsics.checkNotNullParameter((Object)contents, "contents");
        Intrinsics.checkNotNullParameter((Object)sendState, "sendState");
        return new ClientMessage(id, channel, sender, contents, sendState, replyTo);
    }
    
    public static /* synthetic */ ClientMessage copy$default$51aa159d(final ClientMessage clientMessage, long id, Channel channel, UUID sender, String contents, SendState sendState, MessageRef replyTo, final int n) {
        if ((n & 0x1) != 0x0) {
            id = clientMessage.id;
        }
        if ((n & 0x2) != 0x0) {
            channel = clientMessage.channel;
        }
        if ((n & 0x4) != 0x0) {
            sender = clientMessage.sender;
        }
        if ((n & 0x8) != 0x0) {
            contents = clientMessage.contents;
        }
        if ((n & 0x10) != 0x0) {
            sendState = clientMessage.sendState;
        }
        if ((n & 0x20) != 0x0) {
            replyTo = clientMessage.replyTo;
        }
        return clientMessage.copy(id, channel, sender, contents, sendState, replyTo);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ClientMessage(id=" + this.id + ", channel=" + this.channel + ", sender=" + this.sender + ", contents=" + this.contents + ", sendState=" + this.sendState + ", replyTo=" + this.replyTo;
    }
    
    @Override
    public int hashCode() {
        int result = Long.hashCode(this.id);
        result = result * 31 + this.channel.hashCode();
        result = result * 31 + this.sender.hashCode();
        result = result * 31 + this.contents.hashCode();
        result = result * 31 + this.sendState.hashCode();
        result = result * 31 + ((this.replyTo == null) ? 0 : this.replyTo.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientMessage)) {
            return false;
        }
        final ClientMessage clientMessage = (ClientMessage)other;
        return this.id == clientMessage.id && Intrinsics.areEqual((Object)this.channel, (Object)clientMessage.channel) && Intrinsics.areEqual((Object)this.sender, (Object)clientMessage.sender) && Intrinsics.areEqual((Object)this.contents, (Object)clientMessage.contents) && this.sendState == clientMessage.sendState && Intrinsics.areEqual((Object)this.replyTo, (Object)clientMessage.replyTo);
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001a
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J
                                                       \u0010\u0007\u001a\u00020\u0004*\u00020\u0006¨\u0006\b""" }, d2 = { "Lgg/essential/gui/friends/message/v2/ClientMessage$Companion;", "", "()V", "fromNetwork", "Lgg/essential/gui/friends/message/v2/ClientMessage;", "message", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "toModType", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final ClientMessage fromNetwork(@NotNull final Message message) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "message"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
            //     9: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
            //    12: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getChatManager:()Lgg/essential/network/connectionmanager/chat/ChatManager;
            //    15: dup            
            //    16: ldc             "getInstance().connectionManager.chatManager"
            //    18: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
            //    21: astore_2        /* chatManager */
            //    22: aload_1         /* message */
            //    23: invokevirtual   com/sparkuniverse/toolbox/chat/model/Message.getId:()J
            //    26: aload_2         /* chatManager */
            //    27: aload_1         /* message */
            //    28: invokevirtual   com/sparkuniverse/toolbox/chat/model/Message.getChannelId:()J
            //    31: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
            //    34: invokevirtual   gg/essential/network/connectionmanager/chat/ChatManager.getChannel:(Ljava/lang/Long;)Ljava/util/Optional;
            //    37: invokevirtual   java/util/Optional.get:()Ljava/lang/Object;
            //    40: dup            
            //    41: ldc             "chatManager.getChannel(message.channelId).get()"
            //    43: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
            //    46: checkcast       Lcom/sparkuniverse/toolbox/chat/model/Channel;
            //    49: aload_1         /* message */
            //    50: invokevirtual   com/sparkuniverse/toolbox/chat/model/Message.getSender:()Ljava/util/UUID;
            //    53: dup            
            //    54: ldc             "message.sender"
            //    56: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
            //    59: aload_1         /* message */
            //    60: invokevirtual   com/sparkuniverse/toolbox/chat/model/Message.getContents:()Ljava/lang/String;
            //    63: dup            
            //    64: ldc             "message.contents"
            //    66: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
            //    69: getstatic       gg/essential/gui/friends/message/v2/SendState.CONFIRMED:Lgg/essential/gui/friends/message/v2/SendState;
            //    72: aload_1         /* message */
            //    73: invokevirtual   com/sparkuniverse/toolbox/chat/model/Message.getReplyTargetId:()Ljava/lang/Long;
            //    76: dup            
            //    77: ifnull          123
            //    80: astore_3       
            //    81: astore          9
            //    83: astore          8
            //    85: astore          7
            //    87: astore          6
            //    89: lstore          4
            //    91: new             Lgg/essential/gui/friends/message/v2/MessageRef;
            //    94: dup            
            //    95: aload_1         /* message */
            //    96: invokevirtual   com/sparkuniverse/toolbox/chat/model/Message.getChannelId:()J
            //    99: aload_3         /* it */
            //   100: invokevirtual   java/lang/Long.longValue:()J
            //   103: invokespecial   gg/essential/gui/friends/message/v2/MessageRef.<init>:(JJ)V
            //   106: astore          10
            //   108: lload           4
            //   110: aload           6
            //   112: aload           7
            //   114: aload           8
            //   116: aload           9
            //   118: aload           10
            //   120: goto            125
            //   123: pop            
            //   124: aconst_null    
            //   125: astore          11
            //   127: astore          12
            //   129: astore          13
            //   131: astore          14
            //   133: astore          15
            //   135: lstore          16
            //   137: new             Lgg/essential/gui/friends/message/v2/ClientMessage;
            //   140: dup            
            //   141: lload           16
            //   143: aload           15
            //   145: aload           14
            //   147: aload           13
            //   149: aload           12
            //   151: aload           11
            //   153: invokespecial   gg/essential/gui/friends/message/v2/ClientMessage.<init>:(JLcom/sparkuniverse/toolbox/chat/model/Channel;Ljava/util/UUID;Ljava/lang/String;Lgg/essential/gui/friends/message/v2/SendState;Lgg/essential/gui/friends/message/v2/MessageRef;)V
            //   156: areturn        
            //    MethodParameters:
            //  Name     Flags  
            //  -------  -----
            //  message  
            //    StackMapTable: 00 02 FF 00 7B 00 00 00 06 04 07 00 5D 07 00 7D 07 00 7F 07 00 6B 07 00 49 FF 00 01 00 00 00 06 04 07 00 5D 07 00 7D 07 00 7F 07 00 6B 07 00 75
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
