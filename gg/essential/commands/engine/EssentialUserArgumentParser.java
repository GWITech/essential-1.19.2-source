package gg.essential.commands.engine;

import kotlin.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.api.commands.*;
import java.lang.reflect.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000:
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\b\u0003
                                                   \u0002\u0010 
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0013\u0010\u0004\u001a\u00070\u0005¢\u0006\u0002\b\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b8F¢\u0006\u0006\u001a\u0004\b	\u0010
                                                   ¨\u0006\u0013""" }, d2 = { "Lgg/essential/commands/engine/EssentialUserArgumentParser;", "Lgg/essential/api/commands/ArgumentParser;", "Lgg/essential/commands/engine/EssentialUser;", "()V", "connectionManager", "Lgg/essential/network/connectionmanager/ConnectionManager;", "Lorg/jetbrains/annotations/NotNull;", "users", "", "getUsers", "()Ljava/util/Set;", "complete", "", "", "arguments", "Lgg/essential/api/commands/ArgumentQueue;", "param", "Ljava/lang/reflect/Parameter;", "parse", "essential" })
public final class EssentialUserArgumentParser implements ArgumentParser<EssentialUser>
{
    @NotNull
    public static final EssentialUserArgumentParser INSTANCE;
    @NotNull
    private static final ConnectionManager connectionManager;
    
    private EssentialUserArgumentParser() {
        super();
    }
    
    @NotNull
    public final Set<EssentialUser> getUsers() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getRelationshipManager:()Lgg/essential/network/connectionmanager/relationship/RelationshipManager;
        //     6: invokevirtual   gg/essential/network/connectionmanager/relationship/RelationshipManager.getFriends:()Ljava/util/Map;
        //     9: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    14: getstatic       gg/essential/commands/engine/EssentialUserArgumentParser.connectionManager:Lgg/essential/network/connectionmanager/ConnectionManager;
        //    17: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getSpsManager:()Lgg/essential/network/connectionmanager/sps/SPSManager;
        //    20: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.getInvitedUsers:()Ljava/util/Set;
        //    23: dup            
        //    24: ldc             "connectionManager.spsManager.invitedUsers"
        //    26: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    29: checkcast       Ljava/lang/Iterable;
        //    32: invokestatic    kotlin/collections/SetsKt.plus:(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
        //    35: checkcast       Ljava/lang/Iterable;
        //    38: astore_1        /* $this$map$iv */
        //    39: aload_1         /* $this$map$iv */
        //    40: astore_2       
        //    41: new             Ljava/util/ArrayList;
        //    44: dup            
        //    45: aload_1         /* $this$map$iv */
        //    46: bipush          10
        //    48: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    51: invokespecial   java/util/ArrayList.<init>:(I)V
        //    54: checkcast       Ljava/util/Collection;
        //    57: astore_3        /* destination$iv$iv */
        //    58: aload_2         /* $this$mapTo$iv$iv */
        //    59: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    64: astore          4
        //    66: aload           4
        //    68: invokeinterface java/util/Iterator.hasNext:()Z
        //    73: ifeq            123
        //    76: aload           4
        //    78: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    83: astore          item$iv$iv
        //    85: aload_3         /* destination$iv$iv */
        //    86: aload           item$iv$iv
        //    88: checkcast       Ljava/util/UUID;
        //    91: astore          6
        //    93: astore          7
        //    95: new             Lgg/essential/commands/engine/EssentialUser;
        //    98: dup            
        //    99: aload           it
        //   101: ldc             "it"
        //   103: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   106: aload           it
        //   108: invokespecial   gg/essential/commands/engine/EssentialUser.<init>:(Ljava/util/UUID;)V
        //   111: aload           7
        //   113: swap           
        //   114: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   119: pop            
        //   120: goto            66
        //   123: aload_3         /* destination$iv$iv */
        //   124: checkcast       Ljava/util/List;
        //   127: checkcast       Ljava/lang/Iterable;
        //   130: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //   133: areturn        
        //    Signature:
        //  ()Ljava/util/Set<Lgg/essential/commands/engine/EssentialUser;>;
        //    StackMapTable: 00 02 FF 00 42 00 05 00 00 00 07 00 64 07 00 6A 00 00 FA 00 38
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    @Override
    public EssentialUser parse(@NotNull final ArgumentQueue arguments, @NotNull final Parameter param) {
        Intrinsics.checkNotNullParameter((Object)arguments, "arguments");
        Intrinsics.checkNotNullParameter((Object)param, "param");
        final String name = arguments.poll();
        for (final Object next : this.getUsers()) {
            final EssentialUser user = (EssentialUser)next;
            final String s2;
            final String s = s2 = user.getUsername().getNow(null);
            String lowerCase;
            if (s2 != null) {
                Intrinsics.checkNotNullExpressionValue((Object)s2, "getNow(null)");
                Intrinsics.checkNotNullExpressionValue((Object)(lowerCase = s.toLowerCase(Locale.ROOT)), "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            else {
                lowerCase = null;
            }
            final String lowerCase2 = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue((Object)lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (Intrinsics.areEqual((Object)lowerCase, (Object)lowerCase2)) {
                return (EssentialUser)next;
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
        //    32: invokevirtual   gg/essential/commands/engine/EssentialUserArgumentParser.getUsers:()Ljava/util/Set;
        //    35: checkcast       Ljava/lang/Iterable;
        //    38: astore          $this$mapNotNull$iv
        //    40: aload           $this$mapNotNull$iv
        //    42: astore          5
        //    44: new             Ljava/util/ArrayList;
        //    47: dup            
        //    48: invokespecial   java/util/ArrayList.<init>:()V
        //    51: checkcast       Ljava/util/Collection;
        //    54: astore          destination$iv$iv
        //    56: aload           $this$mapNotNullTo$iv$iv
        //    58: astore          $this$forEach$iv$iv$iv
        //    60: aload           $this$forEach$iv$iv$iv
        //    62: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    67: astore          9
        //    69: aload           9
        //    71: invokeinterface java/util/Iterator.hasNext:()Z
        //    76: ifeq            134
        //    79: aload           9
        //    81: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    86: astore          element$iv$iv$iv
        //    88: aload           element$iv$iv$iv
        //    90: astore          element$iv$iv
        //    92: aload           element$iv$iv
        //    94: checkcast       Lgg/essential/commands/engine/EssentialUser;
        //    97: astore          it
        //    99: aload           it
        //   101: invokevirtual   gg/essential/commands/engine/EssentialUser.getUsername:()Ljava/util/concurrent/CompletableFuture;
        //   104: aconst_null    
        //   105: invokevirtual   java/util/concurrent/CompletableFuture.getNow:(Ljava/lang/Object;)Ljava/lang/Object;
        //   108: checkcast       Ljava/lang/String;
        //   111: dup            
        //   112: ifnull          130
        //   115: astore          it$iv$iv
        //   117: aload           destination$iv$iv
        //   119: aload           it$iv$iv
        //   121: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   126: pop            
        //   127: goto            69
        //   130: pop            
        //   131: goto            69
        //   134: aload           destination$iv$iv
        //   136: checkcast       Ljava/util/List;
        //   139: checkcast       Ljava/lang/Iterable;
        //   142: astore          $this$filter$iv
        //   144: aload           $this$filter$iv
        //   146: astore          5
        //   148: new             Ljava/util/ArrayList;
        //   151: dup            
        //   152: invokespecial   java/util/ArrayList.<init>:()V
        //   155: checkcast       Ljava/util/Collection;
        //   158: astore          destination$iv$iv
        //   160: aload           $this$filterTo$iv$iv
        //   162: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   167: astore          7
        //   169: aload           7
        //   171: invokeinterface java/util/Iterator.hasNext:()Z
        //   176: ifeq            232
        //   179: aload           7
        //   181: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   186: astore          element$iv$iv
        //   188: aload           element$iv$iv
        //   190: checkcast       Ljava/lang/String;
        //   193: astore          it
        //   195: aload           it
        //   197: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //   200: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   203: dup            
        //   204: ldc             "this as java.lang.String).toLowerCase(Locale.ROOT)"
        //   206: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   209: aload_3         /* nameStart */
        //   210: iconst_0       
        //   211: iconst_2       
        //   212: aconst_null    
        //   213: invokestatic    kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   216: ifeq            169
        //   219: aload           destination$iv$iv
        //   221: aload           element$iv$iv
        //   223: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   228: pop            
        //   229: goto            169
        //   232: aload           destination$iv$iv
        //   234: checkcast       Ljava/util/List;
        //   237: areturn        
        //    Signature:
        //  (Lgg/essential/api/commands/ArgumentQueue;Ljava/lang/reflect/Parameter;)Ljava/util/List<Ljava/lang/String;>;
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  arguments  
        //  param      
        //    StackMapTable: 00 05 FF 00 45 00 0A 00 00 00 07 00 9E 00 00 07 00 64 00 00 07 00 6A 00 00 7C 07 00 9E F8 00 03 FC 00 22 07 00 6A FF 00 3E 00 07 00 00 00 00 00 00 07 00 64 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public /* bridge */ Object parse(final ArgumentQueue arguments, final Parameter param) {
        return this.parse(arguments, param);
    }
    
    static {
        INSTANCE = new EssentialUserArgumentParser();
        final ConnectionManager connectionManager2 = Essential.getInstance().getConnectionManager();
        Intrinsics.checkNotNullExpressionValue((Object)connectionManager2, "getInstance().connectionManager");
        connectionManager = connectionManager2;
    }
}
