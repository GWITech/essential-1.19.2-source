package gg.essential.commands.engine;

import net.minecraft.entity.player.*;
import kotlin.*;
import gg.essential.api.commands.*;
import java.lang.reflect.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import net.minecraft.client.network.*;
import net.minecraft.client.world.*;
import java.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000(
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   H\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   H\u0016¨\u0006\f""" }, d2 = { "Lgg/essential/commands/engine/PlayerArgumentParser;", "Lgg/essential/api/commands/ArgumentParser;", "Lnet/minecraft/entity/player/PlayerEntity;", "()V", "complete", "", "", "arguments", "Lgg/essential/api/commands/ArgumentQueue;", "param", "Ljava/lang/reflect/Parameter;", "parse", "essential" })
public final class PlayerArgumentParser implements ArgumentParser<PlayerEntity>
{
    public PlayerArgumentParser() {
        super();
    }
    
    @Nullable
    @Override
    public PlayerEntity parse(@NotNull final ArgumentQueue arguments, @NotNull final Parameter param) {
        Intrinsics.checkNotNullParameter((Object)arguments, "arguments");
        Intrinsics.checkNotNullParameter((Object)param, "param");
        final String name = arguments.poll();
        final ClientWorld world = UMinecraft.getWorld();
        if (world != null) {
            final List method_18456 = world.method_18456();
            if (method_18456 != null) {
                while (true) {
                    for (final Object next : method_18456) {
                        final AbstractClientPlayerEntity it = (AbstractClientPlayerEntity)next;
                        if (Intrinsics.areEqual((Object)it.method_5477().getString(), (Object)name)) {
                            final AbstractClientPlayerEntity abstractClientPlayerEntity = (AbstractClientPlayerEntity)next;
                            final AbstractClientPlayerEntity abstractClientPlayerEntity2 = abstractClientPlayerEntity;
                            return (PlayerEntity)abstractClientPlayerEntity2;
                        }
                    }
                    final AbstractClientPlayerEntity abstractClientPlayerEntity = null;
                    continue;
                }
            }
        }
        final AbstractClientPlayerEntity abstractClientPlayerEntity2 = null;
        return (PlayerEntity)abstractClientPlayerEntity2;
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
        //    18: astore_3        /* nameStart */
        //    19: invokestatic    gg/essential/universal/UMinecraft.getWorld:()Lnet/minecraft/client/world/ClientWorld;
        //    22: dup            
        //    23: ifnull          223
        //    26: invokevirtual   net/minecraft/client/world/ClientWorld.method_18456:()Ljava/util/List;
        //    29: dup            
        //    30: ifnull          223
        //    33: checkcast       Ljava/lang/Iterable;
        //    36: astore          $this$map$iv
        //    38: aload           $this$map$iv
        //    40: astore          6
        //    42: new             Ljava/util/ArrayList;
        //    45: dup            
        //    46: aload           $this$map$iv
        //    48: bipush          10
        //    50: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    53: invokespecial   java/util/ArrayList.<init>:(I)V
        //    56: checkcast       Ljava/util/Collection;
        //    59: astore          destination$iv$iv
        //    61: aload           $this$mapTo$iv$iv
        //    63: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    68: astore          9
        //    70: aload           9
        //    72: invokeinterface java/util/Iterator.hasNext:()Z
        //    77: ifeq            122
        //    80: aload           9
        //    82: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    87: astore          item$iv$iv
        //    89: aload           destination$iv$iv
        //    91: aload           item$iv$iv
        //    93: checkcast       Lnet/minecraft/client/network/AbstractClientPlayerEntity;
        //    96: astore          11
        //    98: astore          13
        //   100: aload           it
        //   102: invokevirtual   net/minecraft/client/network/AbstractClientPlayerEntity.method_5477:()Lnet/minecraft/text/Text;
        //   105: invokeinterface net/minecraft/text/Text.getString:()Ljava/lang/String;
        //   110: aload           13
        //   112: swap           
        //   113: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   118: pop            
        //   119: goto            70
        //   122: aload           destination$iv$iv
        //   124: checkcast       Ljava/util/List;
        //   127: checkcast       Ljava/lang/Iterable;
        //   130: astore          $this$filter$iv
        //   132: aload           $this$filter$iv
        //   134: astore          7
        //   136: new             Ljava/util/ArrayList;
        //   139: dup            
        //   140: invokespecial   java/util/ArrayList.<init>:()V
        //   143: checkcast       Ljava/util/Collection;
        //   146: astore          destination$iv$iv
        //   148: aload           $this$filterTo$iv$iv
        //   150: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   155: astore          10
        //   157: aload           10
        //   159: invokeinterface java/util/Iterator.hasNext:()Z
        //   164: ifeq            215
        //   167: aload           10
        //   169: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   174: astore          element$iv$iv
        //   176: aload           element$iv$iv
        //   178: checkcast       Ljava/lang/String;
        //   181: astore          it
        //   183: aload           it
        //   185: ldc             "it"
        //   187: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   190: aload           it
        //   192: aload_3         /* nameStart */
        //   193: iconst_0       
        //   194: iconst_2       
        //   195: aconst_null    
        //   196: invokestatic    kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   199: ifeq            157
        //   202: aload           destination$iv$iv
        //   204: aload           element$iv$iv
        //   206: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   211: pop            
        //   212: goto            157
        //   215: aload           destination$iv$iv
        //   217: checkcast       Ljava/util/List;
        //   220: goto            227
        //   223: pop            
        //   224: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //   227: areturn        
        //    Signature:
        //  (Lgg/essential/api/commands/ArgumentQueue;Ljava/lang/reflect/Parameter;)Ljava/util/List<Ljava/lang/String;>;
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  arguments  
        //  param      
        //    StackMapTable: 00 06 FF 00 46 00 0A 07 00 02 07 00 30 07 00 63 07 00 48 07 00 42 00 07 00 42 07 00 78 00 07 00 4A 00 00 33 FF 00 22 00 0B 07 00 02 07 00 30 07 00 63 07 00 48 07 00 42 07 00 42 07 00 42 07 00 42 07 00 78 07 00 4A 07 00 4A 00 00 39 FF 00 07 00 04 07 00 02 07 00 30 07 00 63 07 00 48 00 01 07 00 05 43 07 00 7E
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public /* bridge */ Object parse(final ArgumentQueue arguments, final Parameter param) {
        return this.parse(arguments, param);
    }
}
