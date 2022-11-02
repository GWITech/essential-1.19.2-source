package gg.essential.commands.brigadier;

import org.jetbrains.annotations.*;
import com.mojang.brigadier.*;
import net.minecraft.client.network.*;
import kotlin.jvm.internal.*;
import gg.essential.commands.*;
import kotlin.*;
import gg.essential.api.commands.*;
import java.util.*;
import com.mojang.brigadier.builder.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070	*\u00020
                                                   2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070	*\u000202\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u000f""" }, d2 = { "Lgg/essential/commands/brigadier/EssentialBrigadierIntegration;", "", "()V", "addCommands", "", "target", "Lcom/mojang/brigadier/CommandDispatcher;", "Lnet/minecraft/client/network/ClientCommandSource;", "toBrigadierBuilder", "Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;", "Lgg/essential/api/commands/Command;", "name", "", "Lgg/essential/api/commands/Command$Handler;", "DummyCommand", "essential" })
public final class EssentialBrigadierIntegration
{
    @NotNull
    public static final EssentialBrigadierIntegration INSTANCE;
    
    private EssentialBrigadierIntegration() {
        super();
    }
    
    public final void addCommands(@NotNull final CommandDispatcher<ClientCommandSource> target) {
        Intrinsics.checkNotNullParameter((Object)target, "target");
        for (final Map.Entry<String, V> entry2 : EssentialCommandRegistry.INSTANCE.getCommands$essential().entrySet()) {
            final String name = entry2.getKey();
            final Pair entry = (Pair)entry2.getValue();
            final Command command = (Command)entry.component1();
            final boolean hideFromAutocomplete = (boolean)entry.component2();
            if (!hideFromAutocomplete) {
                target.register((LiteralArgumentBuilder)this.toBrigadierBuilder(command, name));
            }
        }
    }
    
    private final LiteralArgumentBuilder<ClientCommandSource> toBrigadierBuilder(final Command $this$toBrigadierBuilder, final String name) {
        final Command.Handler defaultHandler = $this$toBrigadierBuilder.getDefaultHandler();
        LiteralArgumentBuilder literalArgumentBuilder;
        if (defaultHandler == null || (literalArgumentBuilder = this.toBrigadierBuilder(defaultHandler, name)) == null) {
            literalArgumentBuilder = LiteralArgumentBuilder.literal(name);
        }
        final LiteralArgumentBuilder result = literalArgumentBuilder;
        for (final Map.Entry<String, V> entry : $this$toBrigadierBuilder.getSubCommands().entrySet()) {
            final String subCommandName = entry.getKey();
            final Command.Handler subCommandHandler = (Command.Handler)entry.getValue();
            result.then((ArgumentBuilder)this.toBrigadierBuilder(subCommandHandler, subCommandName));
        }
        Intrinsics.checkNotNullExpressionValue((Object)result, "result");
        return (LiteralArgumentBuilder<ClientCommandSource>)result;
    }
    
    private final LiteralArgumentBuilder<ClientCommandSource> toBrigadierBuilder(final Command.Handler $this$toBrigadierBuilder, final String name) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    com/mojang/brigadier/builder/LiteralArgumentBuilder.literal:(Ljava/lang/String;)Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;
        //     4: astore_3        /* result */
        //     5: aload_3         /* result */
        //     6: ldc             "result"
        //     8: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    11: aload_3         /* result */
        //    12: astore          endOfTree
        //    14: aload_3         /* result */
        //    15: invokestatic    kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
        //    18: checkcast       Ljava/util/Collection;
        //    21: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //    24: pop            
        //    25: aload_1         /* $this$toBrigadierBuilder */
        //    26: astore          7
        //    28: astore          29
        //    30: aload           $this$params$iv
        //    32: invokevirtual   gg/essential/api/commands/Command$Handler.getParams:()[Ljava/lang/reflect/Parameter;
        //    35: astore          $this$mapIndexed$iv$iv
        //    37: aload           $this$mapIndexed$iv$iv
        //    39: astore          11
        //    41: new             Ljava/util/ArrayList;
        //    44: dup            
        //    45: aload           $this$mapIndexed$iv$iv
        //    47: arraylength    
        //    48: invokespecial   java/util/ArrayList.<init>:(I)V
        //    51: checkcast       Ljava/util/Collection;
        //    54: astore          destination$iv$iv$iv
        //    56: iconst_0       
        //    57: istore          index$iv$iv$iv
        //    59: iconst_0       
        //    60: istore          14
        //    62: aload           $this$mapIndexedTo$iv$iv$iv
        //    64: arraylength    
        //    65: istore          15
        //    67: iload           14
        //    69: iload           15
        //    71: if_icmpge       298
        //    74: aload           $this$mapIndexedTo$iv$iv$iv
        //    76: iload           14
        //    78: aaload         
        //    79: astore          item$iv$iv$iv
        //    81: aload           destination$iv$iv$iv
        //    83: iload           index$iv$iv$iv
        //    85: iinc            index$iv$iv$iv, 1
        //    88: aload           item$iv$iv$iv
        //    90: astore          17
        //    92: istore          18
        //    94: astore          19
        //    96: aload           $this$params$iv
        //    98: invokevirtual   gg/essential/api/commands/Command$Handler.getKParams:()Ljava/util/List;
        //   101: dup            
        //   102: ifnull          118
        //   105: iload           index$iv
        //   107: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   112: checkcast       Lkotlin/reflect/KParameter;
        //   115: goto            120
        //   118: pop            
        //   119: aconst_null    
        //   120: astore          kParam$iv
        //   122: aload           param$iv
        //   124: aload           kParam$iv
        //   126: astore          21
        //   128: astore          param
        //   130: aload           param
        //   132: ldc             Lgg/essential/api/commands/DisplayName;.class
        //   134: invokevirtual   java/lang/reflect/Parameter.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //   137: checkcast       Lgg/essential/api/commands/DisplayName;
        //   140: dup            
        //   141: ifnull          153
        //   144: invokeinterface gg/essential/api/commands/DisplayName.value:()Ljava/lang/String;
        //   149: dup            
        //   150: ifnonnull       180
        //   153: pop            
        //   154: aload           kParam
        //   156: dup            
        //   157: ifnull          168
        //   160: invokeinterface kotlin/reflect/KParameter.getName:()Ljava/lang/String;
        //   165: goto            170
        //   168: pop            
        //   169: aconst_null    
        //   170: dup            
        //   171: ifnonnull       180
        //   174: pop            
        //   175: aload           param
        //   177: invokevirtual   java/lang/reflect/Parameter.getName:()Ljava/lang/String;
        //   180: astore          displayName
        //   182: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   185: aload           param
        //   187: aload           kParam
        //   189: invokevirtual   gg/essential/commands/engine/CommandParser.collectTypeInformation$essential:(Ljava/lang/reflect/Parameter;Lkotlin/reflect/KParameter;)Lkotlin/Triple;
        //   192: astore          24
        //   194: aload           24
        //   196: invokevirtual   kotlin/Triple.component2:()Ljava/lang/Object;
        //   199: checkcast       Ljava/lang/Boolean;
        //   202: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   205: istore          isJavaOptional
        //   207: aload           24
        //   209: invokevirtual   kotlin/Triple.component3:()Ljava/lang/Object;
        //   212: checkcast       Ljava/lang/Boolean;
        //   215: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   218: istore          isNullable
        //   220: iload           isJavaOptional
        //   222: ifne            230
        //   225: iload           isNullable
        //   227: ifeq            245
        //   230: aload           endOfTree
        //   232: checkcast       Lcom/mojang/brigadier/builder/ArgumentBuilder;
        //   235: getstatic       gg/essential/commands/brigadier/EssentialBrigadierIntegration$DummyCommand.INSTANCE:Lgg/essential/commands/brigadier/EssentialBrigadierIntegration$DummyCommand;
        //   238: checkcast       Lcom/mojang/brigadier/Command;
        //   241: invokevirtual   com/mojang/brigadier/builder/ArgumentBuilder.executes:(Lcom/mojang/brigadier/Command;)Lcom/mojang/brigadier/builder/ArgumentBuilder;
        //   244: pop            
        //   245: aload           displayName
        //   247: new             Lgg/essential/commands/brigadier/EssentialBrigadierArgument;
        //   250: dup            
        //   251: aload           param
        //   253: aload           kParam
        //   255: invokespecial   gg/essential/commands/brigadier/EssentialBrigadierArgument.<init>:(Ljava/lang/reflect/Parameter;Lkotlin/reflect/KParameter;)V
        //   258: checkcast       Lcom/mojang/brigadier/arguments/ArgumentType;
        //   261: invokestatic    com/mojang/brigadier/builder/RequiredArgumentBuilder.argument:(Ljava/lang/String;Lcom/mojang/brigadier/arguments/ArgumentType;)Lcom/mojang/brigadier/builder/RequiredArgumentBuilder;
        //   264: astore          27
        //   266: aload           27
        //   268: astore          it
        //   270: aload           it
        //   272: ldc             "it"
        //   274: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   277: aload           it
        //   279: astore          endOfTree
        //   281: aload           27
        //   283: aload           19
        //   285: swap           
        //   286: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   291: pop            
        //   292: iinc            14, 1
        //   295: goto            67
        //   298: aload           destination$iv$iv$iv
        //   300: checkcast       Ljava/util/List;
        //   303: aload           29
        //   305: swap           
        //   306: checkcast       Ljava/lang/Iterable;
        //   309: invokestatic    kotlin/collections/CollectionsKt.plus:(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
        //   312: astore          arguments
        //   314: aload           arguments
        //   316: astore          $this$reduceRight$iv
        //   318: aload           $this$reduceRight$iv
        //   320: aload           $this$reduceRight$iv
        //   322: invokeinterface java/util/List.size:()I
        //   327: invokeinterface java/util/List.listIterator:(I)Ljava/util/ListIterator;
        //   332: astore          iterator$iv
        //   334: aload           iterator$iv
        //   336: invokeinterface java/util/ListIterator.hasPrevious:()Z
        //   341: ifne            355
        //   344: new             Ljava/lang/UnsupportedOperationException;
        //   347: dup            
        //   348: ldc_w           "Empty list can't be reduced."
        //   351: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //   354: athrow         
        //   355: aload           iterator$iv
        //   357: invokeinterface java/util/ListIterator.previous:()Ljava/lang/Object;
        //   362: astore          accumulator$iv
        //   364: aload           iterator$iv
        //   366: invokeinterface java/util/ListIterator.hasPrevious:()Z
        //   371: ifeq            421
        //   374: aload           iterator$iv
        //   376: invokeinterface java/util/ListIterator.previous:()Ljava/lang/Object;
        //   381: aload           accumulator$iv
        //   383: checkcast       Lcom/mojang/brigadier/builder/ArgumentBuilder;
        //   386: astore          10
        //   388: checkcast       Lcom/mojang/brigadier/builder/ArgumentBuilder;
        //   391: astore          acc
        //   393: aload           acc
        //   395: aload           argumentBuilder
        //   397: invokevirtual   com/mojang/brigadier/builder/ArgumentBuilder.then:(Lcom/mojang/brigadier/builder/ArgumentBuilder;)Lcom/mojang/brigadier/builder/ArgumentBuilder;
        //   400: dup            
        //   401: ifnonnull       416
        //   404: pop            
        //   405: new             Ljava/lang/NullPointerException;
        //   408: dup            
        //   409: ldc_w           "null cannot be cast to non-null type com.mojang.brigadier.builder.ArgumentBuilder<net.minecraft.client.network.ClientCommandSource, *>"
        //   412: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   415: athrow         
        //   416: astore          accumulator$iv
        //   418: goto            364
        //   421: aload_3         /* result */
        //   422: areturn        
        //    Signature:
        //  (Lgg/essential/api/commands/Command$Handler;Ljava/lang/String;)Lcom/mojang/brigadier/builder/LiteralArgumentBuilder<Lnet/minecraft/client/network/ClientCommandSource;>;
        //    MethodParameters:
        //  Name                      Flags  
        //  ------------------------  -----
        //  $this$toBrigadierBuilder  
        //  name                      
        //    StackMapTable: 00 0E FF 00 43 00 1E 07 00 02 07 00 8B 07 00 55 07 00 81 07 00 04 00 00 07 00 8B 00 07 00 B1 00 07 00 B1 07 00 A1 01 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 A1 00 00 FF 00 32 00 1E 07 00 02 07 00 8B 07 00 55 07 00 81 07 00 04 00 00 07 00 8B 00 07 00 B1 00 07 00 B1 07 00 A1 01 01 01 07 00 BF 07 00 BF 01 07 00 A1 00 00 00 00 00 00 00 00 00 07 00 A1 00 01 07 00 B7 41 07 00 BD FF 00 20 00 1E 07 00 02 07 00 8B 07 00 55 07 00 81 07 00 04 00 00 07 00 8B 00 07 00 B1 00 07 00 B1 07 00 A1 01 01 01 07 00 BF 07 00 BF 01 07 00 A1 07 00 BD 07 00 BD 07 00 BF 00 00 00 00 00 00 07 00 A1 00 01 07 00 04 4E 07 00 BD 41 07 00 55 49 07 00 55 FF 00 31 00 1E 07 00 02 07 00 8B 07 00 55 07 00 81 07 00 04 00 00 07 00 8B 00 07 00 B1 00 07 00 B1 07 00 A1 01 01 01 07 00 BF 07 00 BF 01 07 00 A1 07 00 BD 07 00 BD 07 00 BF 07 00 55 07 00 D3 01 01 00 00 07 00 A1 00 00 0E FF 00 34 00 1E 07 00 02 07 00 8B 07 00 55 07 00 81 07 00 04 00 00 07 00 8B 00 07 00 B1 00 07 00 B1 07 00 A1 01 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 A1 00 00 FF 00 38 00 1E 07 00 02 07 00 8B 07 00 55 07 00 81 07 00 04 07 00 B7 07 00 B7 07 00 8B 07 01 03 07 00 B1 00 07 00 B1 07 00 A1 01 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 A1 00 00 FF 00 08 00 1E 07 00 02 07 00 8B 07 00 55 07 00 81 07 00 04 07 00 B7 07 00 B7 07 00 8B 07 01 03 07 00 04 00 07 00 04 07 00 A1 01 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 A1 00 00 FF 00 33 00 1E 07 00 02 07 00 8B 07 00 55 07 00 81 07 00 04 07 00 B7 07 00 B7 07 00 8B 07 01 03 07 00 04 07 00 8D 07 00 8D 07 00 A1 01 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 A1 00 01 07 00 8D FF 00 04 00 1E 07 00 02 07 00 8B 07 00 55 07 00 81 07 00 04 07 00 B7 07 00 B7 07 00 8B 07 01 03 07 00 04 00 07 00 04 07 00 A1 01 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 A1 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        INSTANCE = new EssentialBrigadierIntegration();
    }
}
