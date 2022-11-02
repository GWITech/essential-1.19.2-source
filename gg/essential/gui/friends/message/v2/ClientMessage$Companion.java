package gg.essential.gui.friends.message.v2;

import kotlin.*;
import com.sparkuniverse.toolbox.chat.model.*;
import org.jetbrains.annotations.*;

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
