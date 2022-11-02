package gg.essential.commands.engine;

import kotlin.*;
import gg.essential.network.connectionmanager.chat.*;
import gg.essential.api.commands.*;
import java.lang.reflect.*;
import kotlin.jvm.internal.*;
import java.util.*;
import org.jetbrains.annotations.*;
import gg.essential.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020	0\u00052\u0006\u0010
                                                   \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010
                                                   \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010""" }, d2 = { "Lgg/essential/commands/engine/EssentialFriendArgumentParser;", "Lgg/essential/api/commands/ArgumentParser;", "Lgg/essential/commands/engine/EssentialFriend;", "()V", "friends", "", "getFriends", "()Ljava/util/List;", "complete", "", "arguments", "Lgg/essential/api/commands/ArgumentQueue;", "param", "Ljava/lang/reflect/Parameter;", "parse", "Companion", "essential" })
public final class EssentialFriendArgumentParser implements ArgumentParser<EssentialFriend>
{
    @NotNull
    private static final ChatManager cm;
    
    public EssentialFriendArgumentParser() {
        super();
    }
    
    @NotNull
    public final List<EssentialFriend> getFriends() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   gg/essential/network/connectionmanager/chat/ChatManager.getChannels:()Ljava/util/Map;
        //     6: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //    11: checkcast       Ljava/lang/Iterable;
        //    14: astore_1        /* $this$filter$iv */
        //    15: aload_1         /* $this$filter$iv */
        //    16: astore_2       
        //    17: new             Ljava/util/ArrayList;
        //    20: dup            
        //    21: invokespecial   java/util/ArrayList.<init>:()V
        //    24: checkcast       Ljava/util/Collection;
        //    27: astore_3        /* destination$iv$iv */
        //    28: aload_2         /* $this$filterTo$iv$iv */
        //    29: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    34: astore          4
        //    36: aload           4
        //    38: invokeinterface java/util/Iterator.hasNext:()Z
        //    43: ifeq            97
        //    46: aload           4
        //    48: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    53: astore          element$iv$iv
        //    55: aload           element$iv$iv
        //    57: checkcast       Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //    60: astore          it
        //    62: aload           it
        //    64: ldc             "it"
        //    66: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    69: aload           it
        //    71: invokestatic    gg/essential/util/ExtensionsKt.isAnnouncement:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Z
        //    74: ifne            81
        //    77: iconst_1       
        //    78: goto            82
        //    81: iconst_0       
        //    82: ifeq            36
        //    85: aload_3         /* destination$iv$iv */
        //    86: aload           element$iv$iv
        //    88: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    93: pop            
        //    94: goto            36
        //    97: aload_3         /* destination$iv$iv */
        //    98: checkcast       Ljava/util/List;
        //   101: checkcast       Ljava/lang/Iterable;
        //   104: astore_1        /* $this$mapNotNull$iv */
        //   105: aload_1         /* $this$mapNotNull$iv */
        //   106: astore_2       
        //   107: new             Ljava/util/ArrayList;
        //   110: dup            
        //   111: invokespecial   java/util/ArrayList.<init>:()V
        //   114: checkcast       Ljava/util/Collection;
        //   117: astore_3        /* destination$iv$iv */
        //   118: aload_2         /* $this$mapNotNullTo$iv$iv */
        //   119: astore          $this$forEach$iv$iv$iv
        //   121: aload           $this$forEach$iv$iv$iv
        //   123: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   128: astore          6
        //   130: aload           6
        //   132: invokeinterface java/util/Iterator.hasNext:()Z
        //   137: ifeq            233
        //   140: aload           6
        //   142: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   147: astore          element$iv$iv$iv
        //   149: aload           element$iv$iv$iv
        //   151: astore          element$iv$iv
        //   153: aload           element$iv$iv
        //   155: checkcast       Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   158: astore          channel
        //   160: aload           channel
        //   162: ldc             "channel"
        //   164: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   167: aload           channel
        //   169: invokestatic    gg/essential/util/ExtensionsKt.getOtherUser:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Ljava/util/UUID;
        //   172: dup            
        //   173: ifnull          209
        //   176: astore          it
        //   178: new             Lgg/essential/commands/engine/EssentialFriend;
        //   181: dup            
        //   182: aload           it
        //   184: invokestatic    gg/essential/util/UUIDUtil.getName:(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;
        //   187: invokevirtual   java/util/concurrent/CompletableFuture.get:()Ljava/lang/Object;
        //   190: dup            
        //   191: ldc             "getName(it).get()"
        //   193: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   196: checkcast       Ljava/lang/String;
        //   199: aload           it
        //   201: aload           channel
        //   203: invokespecial   gg/essential/commands/engine/EssentialFriend.<init>:(Ljava/lang/String;Ljava/util/UUID;Lcom/sparkuniverse/toolbox/chat/model/Channel;)V
        //   206: goto            211
        //   209: pop            
        //   210: aconst_null    
        //   211: dup            
        //   212: ifnull          229
        //   215: astore          it$iv$iv
        //   217: aload_3         /* destination$iv$iv */
        //   218: aload           it$iv$iv
        //   220: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   225: pop            
        //   226: goto            130
        //   229: pop            
        //   230: goto            130
        //   233: aload_3         /* destination$iv$iv */
        //   234: checkcast       Ljava/util/List;
        //   237: areturn        
        //    Signature:
        //  ()Ljava/util/List<Lgg/essential/commands/engine/EssentialFriend;>;
        //    StackMapTable: 00 09 FF 00 24 00 05 00 00 00 07 00 42 07 00 48 00 00 FC 00 2C 07 00 05 40 01 F9 00 0E FE 00 20 00 00 07 00 48 F7 00 4E 07 00 82 41 07 00 6E 51 07 00 6E F8 00 03
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    @Override
    public EssentialFriend parse(@NotNull final ArgumentQueue arguments, @NotNull final Parameter param) {
        Intrinsics.checkNotNullParameter((Object)arguments, "arguments");
        Intrinsics.checkNotNullParameter((Object)param, "param");
        final String name = arguments.poll();
        for (final Object next : this.getFriends()) {
            final EssentialFriend friend = (EssentialFriend)next;
            final String lowerCase = friend.getIgn().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            final String lowerCase2 = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue((Object)lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (Intrinsics.areEqual((Object)lowerCase, (Object)lowerCase2)) {
                return (EssentialFriend)next;
            }
        }
        return null;
    }
    
    @NotNull
    @Override
    public List<String> complete(@NotNull final ArgumentQueue arguments, @NotNull final Parameter param) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "arguments"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* param */
        //     7: ldc             "param"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_1         /* arguments */
        //    13: invokeinterface gg/essential/api/commands/ArgumentQueue.poll:()Ljava/lang/String;
        //    18: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //    21: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //    24: dup            
        //    25: ldc             "this as java.lang.String).toLowerCase(Locale.ROOT)"
        //    27: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    30: astore_3        /* nameStart */
        //    31: aload_0         /* this */
        //    32: invokevirtual   gg/essential/commands/engine/EssentialFriendArgumentParser.getFriends:()Ljava/util/List;
        //    35: checkcast       Ljava/lang/Iterable;
        //    38: astore          $this$map$iv
        //    40: aload           $this$map$iv
        //    42: astore          5
        //    44: new             Ljava/util/ArrayList;
        //    47: dup            
        //    48: aload           $this$map$iv
        //    50: bipush          10
        //    52: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    55: invokespecial   java/util/ArrayList.<init>:(I)V
        //    58: checkcast       Ljava/util/Collection;
        //    61: astore          destination$iv$iv
        //    63: aload           $this$mapTo$iv$iv
        //    65: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    70: astore          7
        //    72: aload           7
        //    74: invokeinterface java/util/Iterator.hasNext:()Z
        //    79: ifeq            119
        //    82: aload           7
        //    84: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    89: astore          item$iv$iv
        //    91: aload           destination$iv$iv
        //    93: aload           item$iv$iv
        //    95: checkcast       Lgg/essential/commands/engine/EssentialFriend;
        //    98: astore          9
        //   100: astore          10
        //   102: aload           it
        //   104: invokevirtual   gg/essential/commands/engine/EssentialFriend.getIgn:()Ljava/lang/String;
        //   107: aload           10
        //   109: swap           
        //   110: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   115: pop            
        //   116: goto            72
        //   119: aload           destination$iv$iv
        //   121: checkcast       Ljava/util/List;
        //   124: checkcast       Ljava/lang/Iterable;
        //   127: astore          $this$filter$iv
        //   129: aload           $this$filter$iv
        //   131: astore          5
        //   133: new             Ljava/util/ArrayList;
        //   136: dup            
        //   137: invokespecial   java/util/ArrayList.<init>:()V
        //   140: checkcast       Ljava/util/Collection;
        //   143: astore          destination$iv$iv
        //   145: aload           $this$filterTo$iv$iv
        //   147: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   152: astore          7
        //   154: aload           7
        //   156: invokeinterface java/util/Iterator.hasNext:()Z
        //   161: ifeq            217
        //   164: aload           7
        //   166: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   171: astore          element$iv$iv
        //   173: aload           element$iv$iv
        //   175: checkcast       Ljava/lang/String;
        //   178: astore          it
        //   180: aload           it
        //   182: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //   185: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   188: dup            
        //   189: ldc             "this as java.lang.String).toLowerCase(Locale.ROOT)"
        //   191: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   194: aload_3         /* nameStart */
        //   195: iconst_0       
        //   196: iconst_2       
        //   197: aconst_null    
        //   198: invokestatic    kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   201: ifeq            154
        //   204: aload           destination$iv$iv
        //   206: aload           element$iv$iv
        //   208: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   213: pop            
        //   214: goto            154
        //   217: aload           destination$iv$iv
        //   219: checkcast       Ljava/util/List;
        //   222: areturn        
        //    Signature:
        //  (Lgg/essential/api/commands/ArgumentQueue;Ljava/lang/reflect/Parameter;)Ljava/util/List<Ljava/lang/String;>;
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  arguments  
        //  param      
        //    StackMapTable: 00 04 FF 00 48 00 08 00 00 00 07 00 7D 00 00 07 00 42 07 00 48 00 00 FA 00 2E FC 00 22 07 00 48 FF 00 3E 00 07 00 00 00 00 00 00 07 00 42 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public /* bridge */ Object parse(final ArgumentQueue arguments, final Parameter param) {
        return this.parse(arguments, param);
    }
    
    static {
        new Companion((byte)0);
        final ChatManager chatManager = Essential.getInstance().getConnectionManager().getChatManager();
        Intrinsics.checkNotNullExpressionValue((Object)chatManager, "getInstance().connectionManager.chatManager");
        cm = chatManager;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0016
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\u0006""" }, d2 = { "Lgg/essential/commands/engine/EssentialFriendArgumentParser$Companion;", "", "()V", "cm", "Lgg/essential/network/connectionmanager/chat/ChatManager;", "Lorg/jetbrains/annotations/NotNull;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
