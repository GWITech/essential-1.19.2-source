package gg.essential.commands.engine;

import kotlinx.coroutines.*;
import kotlin.jvm.internal.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.api.commands.*;
import kotlin.*;
import java.util.*;
import java.lang.annotation.*;
import java.lang.reflect.*;
import gg.essential.commands.api.*;
import gg.essential.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000r
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010%
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010	\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0
                                                   2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0002\b\u0010J)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\u001d\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u001bJ*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\u0006\u0010\f\u001a\u00020\r2
                                                   \u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u001f\u001a\u00020 H\u0002J+\u0010!\u001a\u00020"2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b#J/\u0010$\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b%J\u001f\u0010&\u001a\u00020""\u0006\b\u0000\u0010'\u0018\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0\u0006H\u0086\bJ(\u0010&\u001a\u00020""\u0004\b\u0000\u0010'2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H'0\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0\u0006J=\u0010)\u001a\b\u0012\u0004\u0012\u0002H'0\u0012"\u0004\b\u0000\u0010'*\u00020\u00162\u001a\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u0002H'0+H\u0080\b\u00f8\u0001\u0000¢\u0006\u0002\b,R"\u0010\u0003\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000\u0082\u0002\u0007
                                                   \u0005\b\u009920\u0001¨\u0006-""" }, d2 = { "Lgg/essential/commands/engine/CommandParser;", "", "()V", "argumentParsers", "", "Ljava/lang/Class;", "Lgg/essential/api/commands/ArgumentParser;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "collectTypeInformation", "Lkotlin/Triple;", "", "param", "Ljava/lang/reflect/Parameter;", "kParam", "Lkotlin/reflect/KParameter;", "collectTypeInformation$essential", "getCompletionOptions", "", "", "arguments", "handler", "Lgg/essential/api/commands/Command$Handler;", "getCompletionOptions$essential", "getHandlerUsage", "command", "Lgg/essential/api/commands/Command;", "getHandlerUsage$essential", "getParsedArgument", "Lgg/essential/util/Try;", "type", "queue", "Lgg/essential/api/commands/ArgumentQueue;", "parseCommandAndCallHandler", "", "parseCommandAndCallHandler$essential", "parseParameter", "parseParameter$essential", "registerArgumentParser", "T", "parser", "params", "func", "Lkotlin/Function2;", "params$essential", "essential" })
public final class CommandParser
{
    @NotNull
    public static final CommandParser INSTANCE;
    @NotNull
    private static final Map<Class<?>, ArgumentParser<?>> argumentParsers;
    @NotNull
    private static final CoroutineScope coroutineScope;
    
    private CommandParser() {
        super();
    }
    
    public final <T> void registerArgumentParser(@NotNull final Class<T> type, @NotNull final ArgumentParser<T> parser) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)parser, "parser");
        CommandParser.argumentParsers.put(type, parser);
    }
    
    public final void parseCommandAndCallHandler$essential(@NotNull final List<String> arguments, @NotNull final Command.Handler handler, @NotNull final Command command) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "arguments"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* handler */
        //     7: ldc             "handler"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* command */
        //    13: ldc             "command"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: new             Lgg/essential/commands/api/ArgumentQueueImpl;
        //    21: dup            
        //    22: new             Ljava/util/LinkedList;
        //    25: dup            
        //    26: aload_1         /* arguments */
        //    27: checkcast       Ljava/util/Collection;
        //    30: invokespecial   java/util/LinkedList.<init>:(Ljava/util/Collection;)V
        //    33: checkcast       Ljava/util/Deque;
        //    36: invokespecial   gg/essential/commands/api/ArgumentQueueImpl.<init>:(Ljava/util/Deque;)V
        //    39: astore          queue
        //    41: aload_2         /* handler */
        //    42: astore          $this$params$iv
        //    44: aload           $this$params$iv
        //    46: invokevirtual   gg/essential/api/commands/Command$Handler.getParams:()[Ljava/lang/reflect/Parameter;
        //    49: astore          $this$mapIndexed$iv$iv
        //    51: aload           $this$mapIndexed$iv$iv
        //    53: astore          10
        //    55: new             Ljava/util/ArrayList;
        //    58: dup            
        //    59: aload           $this$mapIndexed$iv$iv
        //    61: arraylength    
        //    62: invokespecial   java/util/ArrayList.<init>:(I)V
        //    65: checkcast       Ljava/util/Collection;
        //    68: astore          destination$iv$iv$iv
        //    70: iconst_0       
        //    71: istore          index$iv$iv$iv
        //    73: iconst_0       
        //    74: istore          13
        //    76: aload           $this$mapIndexedTo$iv$iv$iv
        //    78: arraylength    
        //    79: istore          14
        //    81: iload           13
        //    83: iload           14
        //    85: if_icmpge       242
        //    88: aload           $this$mapIndexedTo$iv$iv$iv
        //    90: iload           13
        //    92: aaload         
        //    93: astore          item$iv$iv$iv
        //    95: aload           destination$iv$iv$iv
        //    97: iload           index$iv$iv$iv
        //    99: iinc            index$iv$iv$iv, 1
        //   102: aload           item$iv$iv$iv
        //   104: astore          16
        //   106: istore          17
        //   108: astore          18
        //   110: aload           $this$params$iv
        //   112: invokevirtual   gg/essential/api/commands/Command$Handler.getKParams:()Ljava/util/List;
        //   115: dup            
        //   116: ifnull          132
        //   119: iload           index$iv
        //   121: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   126: checkcast       Lkotlin/reflect/KParameter;
        //   129: goto            134
        //   132: pop            
        //   133: aconst_null    
        //   134: astore          kParam$iv
        //   136: aload           param$iv
        //   138: aload           kParam$iv
        //   140: astore          20
        //   142: astore          param
        //   144: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   147: aload           param
        //   149: aload           kParam
        //   151: aload           queue
        //   153: checkcast       Lgg/essential/api/commands/ArgumentQueue;
        //   156: invokevirtual   gg/essential/commands/engine/CommandParser.parseParameter$essential:(Ljava/lang/reflect/Parameter;Lkotlin/reflect/KParameter;Lgg/essential/api/commands/ArgumentQueue;)Lgg/essential/util/Try;
        //   159: astore          parsed
        //   161: aload           parsed
        //   163: astore          23
        //   165: aload           23
        //   167: instanceof      Lgg/essential/util/Success;
        //   170: ifeq            181
        //   173: aload           queue
        //   175: invokevirtual   gg/essential/commands/api/ArgumentQueueImpl.sync$essential:()V
        //   178: goto            219
        //   181: aload           23
        //   183: instanceof      Lgg/essential/util/Failure;
        //   186: ifeq            219
        //   189: aload           queue
        //   191: invokevirtual   gg/essential/commands/api/ArgumentQueueImpl.undo$essential:()V
        //   194: getstatic       gg/essential/util/MinecraftUtils.INSTANCE:Lgg/essential/util/MinecraftUtils;
        //   197: ldc             ""
        //   199: getstatic       gg/essential/universal/ChatColor.RED:Lgg/essential/universal/ChatColor;
        //   202: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   205: aload_3         /* command */
        //   206: aload_2         /* handler */
        //   207: invokevirtual   gg/essential/commands/engine/CommandParser.getHandlerUsage$essential:(Lgg/essential/api/commands/Command;Lgg/essential/api/commands/Command$Handler;)Ljava/lang/String;
        //   210: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Lgg/essential/universal/ChatColor;Ljava/lang/String;)Ljava/lang/String;
        //   215: invokevirtual   gg/essential/util/MinecraftUtils.sendMessage:(Ljava/lang/String;Ljava/lang/String;)V
        //   218: return         
        //   219: aload           parsed
        //   221: invokestatic    gg/essential/util/TryKt.getAsSuccess:(Lgg/essential/util/Try;)Lgg/essential/util/Success;
        //   224: invokevirtual   gg/essential/util/Success.getValue:()Ljava/lang/Object;
        //   227: aload           18
        //   229: swap           
        //   230: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   235: pop            
        //   236: iinc            13, 1
        //   239: goto            81
        //   242: aload           destination$iv$iv$iv
        //   244: checkcast       Ljava/util/List;
        //   247: checkcast       Ljava/util/Collection;
        //   250: astore          $this$toTypedArray$iv
        //   252: aload           $this$toTypedArray$iv
        //   254: astore          thisCollection$iv
        //   256: aload           thisCollection$iv
        //   258: iconst_0       
        //   259: anewarray       Ljava/lang/Object;
        //   262: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   267: dup            
        //   268: ldc             "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
        //   270: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   273: astore          parsedParams
        //   275: aload           queue
        //   277: invokevirtual   gg/essential/commands/api/ArgumentQueueImpl.isEmpty:()Z
        //   280: ifne            306
        //   283: getstatic       gg/essential/util/MinecraftUtils.INSTANCE:Lgg/essential/util/MinecraftUtils;
        //   286: ldc             ""
        //   288: getstatic       gg/essential/universal/ChatColor.RED:Lgg/essential/universal/ChatColor;
        //   291: aload_0         /* this */
        //   292: aload_3         /* command */
        //   293: aload_2         /* handler */
        //   294: invokevirtual   gg/essential/commands/engine/CommandParser.getHandlerUsage$essential:(Lgg/essential/api/commands/Command;Lgg/essential/api/commands/Command$Handler;)Ljava/lang/String;
        //   297: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Lgg/essential/universal/ChatColor;Ljava/lang/String;)Ljava/lang/String;
        //   302: invokevirtual   gg/essential/util/MinecraftUtils.sendMessage:(Ljava/lang/String;Ljava/lang/String;)V
        //   305: return         
        //   306: aload_2         /* handler */
        //   307: invokevirtual   gg/essential/api/commands/Command$Handler.getMethod:()Ljava/lang/reflect/Method;
        //   310: invokestatic    kotlin/reflect/jvm/ReflectJvmMapping.getKotlinFunction:(Ljava/lang/reflect/Method;)Lkotlin/reflect/KFunction;
        //   313: astore          kotlinFunction
        //   315: aload           kotlinFunction
        //   317: ifnull          360
        //   320: aload           kotlinFunction
        //   322: invokeinterface kotlin/reflect/KFunction.isSuspend:()Z
        //   327: ifeq            360
        //   330: getstatic       gg/essential/commands/engine/CommandParser.coroutineScope:Lkotlinx/coroutines/CoroutineScope;
        //   333: aconst_null    
        //   334: aconst_null    
        //   335: new             Lgg/essential/commands/engine/CommandParser$parseCommandAndCallHandler$1;
        //   338: dup            
        //   339: aload           kotlinFunction
        //   341: aload_3         /* command */
        //   342: aload           parsedParams
        //   344: aconst_null    
        //   345: invokespecial   gg/essential/commands/engine/CommandParser$parseCommandAndCallHandler$1.<init>:(Lkotlin/reflect/KFunction;Lgg/essential/api/commands/Command;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V
        //   348: checkcast       Lkotlin/jvm/functions/Function2;
        //   351: iconst_3       
        //   352: aconst_null    
        //   353: invokestatic    kotlinx/coroutines/BuildersKt.launch$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
        //   356: pop            
        //   357: goto            377
        //   360: aload_2         /* handler */
        //   361: invokevirtual   gg/essential/api/commands/Command$Handler.getMethod:()Ljava/lang/reflect/Method;
        //   364: aload_3         /* command */
        //   365: aload           parsedParams
        //   367: aload           parsedParams
        //   369: arraylength    
        //   370: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   373: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   376: pop            
        //   377: return         
        //    Signature:
        //  (Ljava/util/List<Ljava/lang/String;>;Lgg/essential/api/commands/Command$Handler;Lgg/essential/api/commands/Command;)V
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  arguments  
        //  handler    
        //  command    
        //    StackMapTable: 00 09 FF 00 51 00 0F 07 00 02 07 00 75 07 00 6A 07 00 77 07 00 5C 00 00 07 00 6A 00 07 00 79 07 00 79 07 00 60 01 01 01 00 00 FF 00 32 00 13 07 00 02 07 00 75 07 00 6A 07 00 77 07 00 5C 00 00 07 00 6A 00 07 00 79 07 00 79 07 00 60 01 01 01 07 00 85 07 00 85 01 07 00 60 00 01 07 00 75 41 07 00 83 FF 00 2E 00 18 07 00 02 07 00 75 07 00 6A 07 00 77 07 00 5C 00 00 07 00 6A 00 07 00 79 07 00 79 07 00 60 01 01 01 07 00 85 07 00 85 01 07 00 60 07 00 83 07 00 83 07 00 85 07 00 93 07 00 93 00 00 25 FF 00 16 00 0F 07 00 02 07 00 75 07 00 6A 07 00 77 07 00 5C 00 00 07 00 6A 00 07 00 79 07 00 79 07 00 60 01 01 01 00 00 FF 00 3F 00 0F 07 00 02 07 00 75 07 00 6A 07 00 77 07 00 5C 07 00 D4 07 00 60 07 00 6A 07 00 60 07 00 79 07 00 79 07 00 60 01 01 01 00 00 FF 00 35 00 0F 07 00 02 07 00 75 07 00 6A 07 00 77 07 00 5C 07 00 D4 07 00 E0 07 00 6A 07 00 60 07 00 79 07 00 79 07 00 60 01 01 01 00 00 10
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final String getHandlerUsage$essential(@NotNull final Command command, @NotNull final Command.Handler handler) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "command"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* handler */
        //     7: ldc             "handler"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: new             Ljava/lang/StringBuilder;
        //    15: dup            
        //    16: invokespecial   java/lang/StringBuilder.<init>:()V
        //    19: astore_3        /* builder */
        //    20: aload_3         /* builder */
        //    21: ldc_w           "/"
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: aload_1         /* command */
        //    28: invokevirtual   gg/essential/api/commands/Command.getName:()Ljava/lang/String;
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: pop            
        //    35: aload_2         /* handler */
        //    36: invokevirtual   gg/essential/api/commands/Command$Handler.getMethod:()Ljava/lang/reflect/Method;
        //    39: ldc_w           Lgg/essential/api/commands/SubCommand;.class
        //    42: invokevirtual   java/lang/reflect/Method.isAnnotationPresent:(Ljava/lang/Class;)Z
        //    45: ifeq            81
        //    48: aload_2         /* handler */
        //    49: invokevirtual   gg/essential/api/commands/Command$Handler.getMethod:()Ljava/lang/reflect/Method;
        //    52: ldc_w           Lgg/essential/api/commands/SubCommand;.class
        //    55: invokevirtual   java/lang/reflect/Method.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //    58: checkcast       Lgg/essential/api/commands/SubCommand;
        //    61: invokeinterface gg/essential/api/commands/SubCommand.value:()Ljava/lang/String;
        //    66: astore          subCommandName
        //    68: aload_3         /* builder */
        //    69: ldc_w           " "
        //    72: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    75: aload           subCommandName
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: pop            
        //    81: aload_2         /* handler */
        //    82: astore          $this$params$iv
        //    84: aload           $this$params$iv
        //    86: invokevirtual   gg/essential/api/commands/Command$Handler.getParams:()[Ljava/lang/reflect/Parameter;
        //    89: astore          $this$mapIndexed$iv$iv
        //    91: aload           $this$mapIndexed$iv$iv
        //    93: astore          7
        //    95: new             Ljava/util/ArrayList;
        //    98: dup            
        //    99: aload           $this$mapIndexed$iv$iv
        //   101: arraylength    
        //   102: invokespecial   java/util/ArrayList.<init>:(I)V
        //   105: checkcast       Ljava/util/Collection;
        //   108: astore          destination$iv$iv$iv
        //   110: iconst_0       
        //   111: istore          index$iv$iv$iv
        //   113: iconst_0       
        //   114: istore          10
        //   116: aload           $this$mapIndexedTo$iv$iv$iv
        //   118: arraylength    
        //   119: istore          11
        //   121: iload           10
        //   123: iload           11
        //   125: if_icmpge       406
        //   128: aload           $this$mapIndexedTo$iv$iv$iv
        //   130: iload           10
        //   132: aaload         
        //   133: astore          item$iv$iv$iv
        //   135: aload           destination$iv$iv$iv
        //   137: iload           index$iv$iv$iv
        //   139: iinc            index$iv$iv$iv, 1
        //   142: aload           item$iv$iv$iv
        //   144: astore          13
        //   146: istore          14
        //   148: astore          15
        //   150: aload           $this$params$iv
        //   152: invokevirtual   gg/essential/api/commands/Command$Handler.getKParams:()Ljava/util/List;
        //   155: dup            
        //   156: ifnull          172
        //   159: iload           index$iv
        //   161: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   166: checkcast       Lkotlin/reflect/KParameter;
        //   169: goto            174
        //   172: pop            
        //   173: aconst_null    
        //   174: astore          kParam$iv
        //   176: aload           param$iv
        //   178: aload           kParam$iv
        //   180: astore          17
        //   182: astore          param
        //   184: aload           param
        //   186: invokevirtual   java/lang/reflect/Parameter.getType:()Ljava/lang/Class;
        //   189: ldc_w           Ljava/util/Optional;.class
        //   192: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   195: ifne            229
        //   198: aload           kParam
        //   200: ifnull          218
        //   203: aload           kParam
        //   205: invokeinterface kotlin/reflect/KParameter.getType:()Lkotlin/reflect/KType;
        //   210: invokeinterface kotlin/reflect/KType.isMarkedNullable:()Z
        //   215: ifne            229
        //   218: aload           param
        //   220: ldc_w           Lorg/jetbrains/annotations/Nullable;.class
        //   223: invokevirtual   java/lang/reflect/Parameter.isAnnotationPresent:(Ljava/lang/Class;)Z
        //   226: ifeq            233
        //   229: iconst_1       
        //   230: goto            234
        //   233: iconst_0       
        //   234: istore          isOptional
        //   236: aload           param
        //   238: ldc_w           Lgg/essential/api/commands/Options;.class
        //   241: invokevirtual   java/lang/reflect/Parameter.isAnnotationPresent:(Ljava/lang/Class;)Z
        //   244: ifeq            292
        //   247: aload           param
        //   249: ldc_w           Lgg/essential/api/commands/Options;.class
        //   252: invokevirtual   java/lang/reflect/Parameter.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //   255: checkcast       Lgg/essential/api/commands/Options;
        //   258: invokeinterface gg/essential/api/commands/Options.value:()[Ljava/lang/String;
        //   263: checkcast       [Ljava/lang/Comparable;
        //   266: invokestatic    kotlin/collections/ArraysKt.sorted:([Ljava/lang/Comparable;)Ljava/util/List;
        //   269: checkcast       Ljava/lang/Iterable;
        //   272: ldc_w           "|"
        //   275: checkcast       Ljava/lang/CharSequence;
        //   278: aconst_null    
        //   279: aconst_null    
        //   280: iconst_0       
        //   281: aconst_null    
        //   282: aconst_null    
        //   283: bipush          62
        //   285: aconst_null    
        //   286: invokestatic    kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
        //   289: goto            343
        //   292: aload           param
        //   294: ldc_w           Lgg/essential/api/commands/DisplayName;.class
        //   297: invokevirtual   java/lang/reflect/Parameter.isAnnotationPresent:(Ljava/lang/Class;)Z
        //   300: ifeq            322
        //   303: aload           param
        //   305: ldc_w           Lgg/essential/api/commands/DisplayName;.class
        //   308: invokevirtual   java/lang/reflect/Parameter.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //   311: checkcast       Lgg/essential/api/commands/DisplayName;
        //   314: invokeinterface gg/essential/api/commands/DisplayName.value:()Ljava/lang/String;
        //   319: goto            343
        //   322: aload           kParam
        //   324: dup            
        //   325: ifnull          337
        //   328: invokeinterface kotlin/reflect/KParameter.getName:()Ljava/lang/String;
        //   333: dup            
        //   334: ifnonnull       343
        //   337: pop            
        //   338: aload           param
        //   340: invokevirtual   java/lang/reflect/Parameter.getName:()Ljava/lang/String;
        //   343: astore          paramContent
        //   345: aload_3         /* builder */
        //   346: ldc_w           " "
        //   349: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   352: iload           isOptional
        //   354: ifeq            363
        //   357: ldc_w           "["
        //   360: goto            366
        //   363: ldc_w           "<"
        //   366: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   369: aload           paramContent
        //   371: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   374: iload           isOptional
        //   376: ifeq            385
        //   379: ldc_w           "]"
        //   382: goto            388
        //   385: ldc_w           ">"
        //   388: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   391: aload           15
        //   393: swap           
        //   394: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   399: pop            
        //   400: iinc            10, 1
        //   403: goto            121
        //   406: aload_3         /* builder */
        //   407: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   410: dup            
        //   411: ldc_w           "builder.toString()"
        //   414: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   417: areturn        
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  command  
        //  handler  
        //    StackMapTable: 00 11 FC 00 51 07 01 15 FF 00 27 00 0C 07 00 02 07 00 77 07 00 6A 07 01 15 00 07 00 6A 07 00 79 07 00 79 07 00 60 01 01 01 00 00 FF 00 32 00 10 07 00 02 07 00 77 07 00 6A 07 01 15 00 07 00 6A 07 00 79 07 00 79 07 00 60 01 01 01 07 00 85 07 00 85 01 07 00 60 00 01 07 00 75 41 07 00 83 FE 00 2B 07 00 83 07 00 83 07 00 85 0A 03 40 01 FC 00 39 01 1D 4E 07 00 04 45 07 01 65 FF 00 13 00 15 07 00 02 07 00 77 07 00 6A 07 01 15 00 07 00 6A 07 00 79 07 00 79 07 00 60 01 01 01 07 00 85 07 00 85 01 07 00 60 07 00 83 07 00 83 07 00 85 01 07 01 65 00 01 07 01 15 FF 00 02 00 15 07 00 02 07 00 77 07 00 6A 07 01 15 00 07 00 6A 07 00 79 07 00 79 07 00 60 01 01 01 07 00 85 07 00 85 01 07 00 60 07 00 83 07 00 83 07 00 85 01 07 01 65 00 02 07 01 15 07 01 65 52 07 01 15 FF 00 02 00 15 07 00 02 07 00 77 07 00 6A 07 01 15 00 07 00 6A 07 00 79 07 00 79 07 00 60 01 01 01 07 00 85 07 00 85 01 07 00 60 07 00 83 07 00 83 07 00 85 01 07 01 65 00 02 07 01 15 07 01 65 FF 00 11 00 0C 07 00 02 07 00 77 07 00 6A 07 01 15 00 07 00 6A 07 00 79 07 00 79 07 00 60 01 01 01 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final List<String> getCompletionOptions$essential(@NotNull final List<String> arguments, @NotNull final Command.Handler handler) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "arguments"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* handler */
        //     7: ldc             "handler"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: new             Lgg/essential/commands/api/ArgumentQueueImpl;
        //    15: dup            
        //    16: new             Ljava/util/LinkedList;
        //    19: dup            
        //    20: aload_1         /* arguments */
        //    21: checkcast       Ljava/util/Collection;
        //    24: invokespecial   java/util/LinkedList.<init>:(Ljava/util/Collection;)V
        //    27: checkcast       Ljava/util/Deque;
        //    30: invokespecial   gg/essential/commands/api/ArgumentQueueImpl.<init>:(Ljava/util/Deque;)V
        //    33: astore_3        /* queue */
        //    34: aload_2         /* handler */
        //    35: astore          $this$params$iv
        //    37: aload           $this$params$iv
        //    39: invokevirtual   gg/essential/api/commands/Command$Handler.getParams:()[Ljava/lang/reflect/Parameter;
        //    42: astore          $this$mapIndexed$iv$iv
        //    44: aload           $this$mapIndexed$iv$iv
        //    46: astore          6
        //    48: new             Ljava/util/ArrayList;
        //    51: dup            
        //    52: aload           $this$mapIndexed$iv$iv
        //    54: arraylength    
        //    55: invokespecial   java/util/ArrayList.<init>:(I)V
        //    58: checkcast       Ljava/util/Collection;
        //    61: astore          destination$iv$iv$iv
        //    63: iconst_0       
        //    64: istore          index$iv$iv$iv
        //    66: iconst_0       
        //    67: istore          9
        //    69: aload           $this$mapIndexedTo$iv$iv$iv
        //    71: arraylength    
        //    72: istore          10
        //    74: iload           9
        //    76: iload           10
        //    78: if_icmpge       332
        //    81: aload           $this$mapIndexedTo$iv$iv$iv
        //    83: iload           9
        //    85: aaload         
        //    86: astore          item$iv$iv$iv
        //    88: aload           destination$iv$iv$iv
        //    90: iload           index$iv$iv$iv
        //    92: iinc            index$iv$iv$iv, 1
        //    95: aload           item$iv$iv$iv
        //    97: astore          12
        //    99: istore          13
        //   101: astore          14
        //   103: aload           $this$params$iv
        //   105: invokevirtual   gg/essential/api/commands/Command$Handler.getKParams:()Ljava/util/List;
        //   108: dup            
        //   109: ifnull          125
        //   112: iload           index$iv
        //   114: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   119: checkcast       Lkotlin/reflect/KParameter;
        //   122: goto            127
        //   125: pop            
        //   126: aconst_null    
        //   127: astore          kParam$iv
        //   129: aload           param$iv
        //   131: aload           kParam$iv
        //   133: astore          16
        //   135: astore          param
        //   137: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   140: aload           param
        //   142: aload           kParam
        //   144: aload_3         /* queue */
        //   145: checkcast       Lgg/essential/api/commands/ArgumentQueue;
        //   148: invokevirtual   gg/essential/commands/engine/CommandParser.parseParameter$essential:(Ljava/lang/reflect/Parameter;Lkotlin/reflect/KParameter;Lgg/essential/api/commands/ArgumentQueue;)Lgg/essential/util/Try;
        //   151: astore          parsed
        //   153: aload_3         /* queue */
        //   154: invokevirtual   gg/essential/commands/api/ArgumentQueueImpl.isEmpty:()Z
        //   157: ifeq            283
        //   160: aload_3         /* queue */
        //   161: invokevirtual   gg/essential/commands/api/ArgumentQueueImpl.undo$essential:()V
        //   164: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   167: aload           param
        //   169: aload           kParam
        //   171: invokevirtual   gg/essential/commands/engine/CommandParser.collectTypeInformation$essential:(Ljava/lang/reflect/Parameter;Lkotlin/reflect/KParameter;)Lkotlin/Triple;
        //   174: invokevirtual   kotlin/Triple.component1:()Ljava/lang/Object;
        //   177: checkcast       Ljava/lang/Class;
        //   180: astore          type
        //   182: getstatic       gg/essential/commands/engine/CommandParser.argumentParsers:Ljava/util/Map;
        //   185: aload           type
        //   187: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   192: checkcast       Lgg/essential/api/commands/ArgumentParser;
        //   195: dup            
        //   196: ifnonnull       204
        //   199: pop            
        //   200: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //   203: areturn        
        //   204: astore          parser
        //   206: getstatic       gg/essential/util/Try.Companion:Lgg/essential/util/Try$Companion;
        //   209: pop            
        //   210: aload           parser
        //   212: aload_3         /* queue */
        //   213: checkcast       Lgg/essential/api/commands/ArgumentQueue;
        //   216: aload           param
        //   218: invokeinterface gg/essential/api/commands/ArgumentParser.complete:(Lgg/essential/api/commands/ArgumentQueue;Ljava/lang/reflect/Parameter;)Ljava/util/List;
        //   223: astore          res$iv
        //   225: aload           res$iv
        //   227: ifnonnull       239
        //   230: getstatic       gg/essential/util/Failure.INSTANCE:Lgg/essential/util/Failure;
        //   233: checkcast       Lgg/essential/util/Try;
        //   236: goto            251
        //   239: new             Lgg/essential/util/Success;
        //   242: dup            
        //   243: aload           res$iv
        //   245: invokespecial   gg/essential/util/Success.<init>:(Ljava/lang/Object;)V
        //   248: checkcast       Lgg/essential/util/Try;
        //   251: astore          null
        //   253: goto            265
        //   256: pop            
        //   257: getstatic       gg/essential/util/Failure.INSTANCE:Lgg/essential/util/Failure;
        //   260: checkcast       Lgg/essential/util/Try;
        //   263: astore          21
        //   265: aload           21
        //   267: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //   270: invokestatic    gg/essential/util/TryKt.recover:(Lgg/essential/util/Try;Ljava/lang/Object;)Lgg/essential/util/Success;
        //   273: invokevirtual   gg/essential/util/Success.getValue:()Ljava/lang/Object;
        //   276: checkcast       Ljava/lang/Iterable;
        //   279: invokestatic    kotlin/collections/CollectionsKt.sorted:(Ljava/lang/Iterable;)Ljava/util/List;
        //   282: areturn        
        //   283: aload           parsed
        //   285: astore          22
        //   287: aload           22
        //   289: instanceof      Lgg/essential/util/Success;
        //   292: ifeq            302
        //   295: aload_3         /* queue */
        //   296: invokevirtual   gg/essential/commands/api/ArgumentQueueImpl.sync$essential:()V
        //   299: goto            314
        //   302: aload           22
        //   304: instanceof      Lgg/essential/util/Failure;
        //   307: ifeq            314
        //   310: aload_3         /* queue */
        //   311: invokevirtual   gg/essential/commands/api/ArgumentQueueImpl.undo$essential:()V
        //   314: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   317: aload           14
        //   319: swap           
        //   320: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   325: pop            
        //   326: iinc            9, 1
        //   329: goto            74
        //   332: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //   335: areturn        
        //    Signature:
        //  (Ljava/util/List<Ljava/lang/String;>;Lgg/essential/api/commands/Command$Handler;)Ljava/util/List<Ljava/lang/String;>;
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  arguments  
        //  handler    
        //    StackMapTable: 00 0C FF 00 4A 00 0B 07 00 02 07 00 75 07 00 6A 07 00 5C 07 00 6A 07 00 79 07 00 79 07 00 60 01 01 01 00 00 FF 00 32 00 0F 07 00 02 07 00 75 07 00 6A 07 00 5C 07 00 6A 07 00 79 07 00 79 07 00 60 01 01 01 07 00 85 07 00 85 01 07 00 60 00 01 07 00 75 41 07 00 83 FF 00 4C 00 14 07 00 02 07 00 75 07 00 6A 07 00 5C 07 00 6A 07 00 79 07 00 79 07 00 60 01 01 01 07 00 85 07 00 85 01 07 00 60 07 00 83 07 00 83 07 00 85 07 00 93 07 01 8A 00 01 07 01 8F FD 00 22 07 01 8F 07 00 75 4B 07 00 93 FF 00 04 00 15 07 00 02 07 00 75 07 00 6A 07 00 5C 07 00 6A 07 00 79 07 00 79 07 00 60 01 01 01 07 00 85 07 00 85 01 07 00 60 07 00 83 07 00 83 07 00 85 07 00 93 07 01 8A 07 01 8F 00 01 07 01 80 FC 00 08 07 00 93 F8 00 11 FF 00 12 00 17 07 00 02 07 00 75 07 00 6A 07 00 5C 07 00 6A 07 00 79 07 00 79 07 00 60 01 01 01 07 00 85 07 00 85 01 07 00 60 07 00 83 07 00 83 07 00 85 07 00 93 00 00 00 07 00 93 00 00 0B FF 00 11 00 0B 07 00 02 07 00 75 07 00 6A 07 00 5C 07 00 6A 07 00 79 07 00 79 07 00 60 01 01 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  210    253    256    265    Ljava/lang/Exception;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final Try<Object> parseParameter$essential(@NotNull final Parameter param, @Nullable final KParameter kParam, @NotNull final ArgumentQueue queue) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "param"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_3         /* queue */
        //     8: ldc_w           "queue"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_0         /* this */
        //    15: aload_1         /* param */
        //    16: aload_2         /* kParam */
        //    17: invokevirtual   gg/essential/commands/engine/CommandParser.collectTypeInformation$essential:(Ljava/lang/reflect/Parameter;Lkotlin/reflect/KParameter;)Lkotlin/Triple;
        //    20: astore          4
        //    22: aload           4
        //    24: invokevirtual   kotlin/Triple.component1:()Ljava/lang/Object;
        //    27: checkcast       Ljava/lang/Class;
        //    30: astore          type
        //    32: aload           4
        //    34: invokevirtual   kotlin/Triple.component2:()Ljava/lang/Object;
        //    37: checkcast       Ljava/lang/Boolean;
        //    40: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    43: istore          isJavaOptional
        //    45: aload           4
        //    47: invokevirtual   kotlin/Triple.component3:()Ljava/lang/Object;
        //    50: checkcast       Ljava/lang/Boolean;
        //    53: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    56: istore          isNullable
        //    58: aload_0         /* this */
        //    59: aload_1         /* param */
        //    60: aload           type
        //    62: aload_3         /* queue */
        //    63: invokespecial   gg/essential/commands/engine/CommandParser.getParsedArgument:(Ljava/lang/reflect/Parameter;Ljava/lang/Class;Lgg/essential/api/commands/ArgumentQueue;)Lgg/essential/util/Try;
        //    66: astore          result
        //    68: iload           isJavaOptional
        //    70: ifeq            246
        //    73: aload           result
        //    75: astore          9
        //    77: invokestatic    java/util/Optional.empty:()Ljava/util/Optional;
        //    80: dup            
        //    81: ldc_w           "empty()"
        //    84: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    87: astore          failureVal$iv
        //    89: aload           this_$iv
        //    91: astore          11
        //    93: aload           11
        //    95: instanceof      Lgg/essential/util/Failure;
        //    98: ifeq            116
        //   101: new             Lgg/essential/util/Success;
        //   104: dup            
        //   105: aload           failureVal$iv
        //   107: invokespecial   gg/essential/util/Success.<init>:(Ljava/lang/Object;)V
        //   110: checkcast       Lgg/essential/util/Try;
        //   113: goto            245
        //   116: aload           11
        //   118: instanceof      Lgg/essential/util/Success;
        //   121: ifeq            237
        //   124: aload           this_$iv
        //   126: astore          this_$iv$iv
        //   128: aload           this_$iv$iv
        //   130: astore          13
        //   132: aload           13
        //   134: instanceof      Lgg/essential/util/Failure;
        //   137: ifeq            145
        //   140: aload           this_$iv$iv
        //   142: goto            234
        //   145: aload           13
        //   147: instanceof      Lgg/essential/util/Success;
        //   150: ifeq            226
        //   153: getstatic       gg/essential/util/Try.Companion:Lgg/essential/util/Try$Companion;
        //   156: pop            
        //   157: aload           this_$iv$iv
        //   159: checkcast       Lgg/essential/util/Success;
        //   162: invokevirtual   gg/essential/util/Success.getValue:()Ljava/lang/Object;
        //   165: astore          it
        //   167: aload           it
        //   169: invokestatic    java/util/Optional.of:(Ljava/lang/Object;)Ljava/util/Optional;
        //   172: dup            
        //   173: ldc_w           "of(it)"
        //   176: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   179: astore          res$iv$iv$iv
        //   181: aload           res$iv$iv$iv
        //   183: ifnonnull       195
        //   186: getstatic       gg/essential/util/Failure.INSTANCE:Lgg/essential/util/Failure;
        //   189: checkcast       Lgg/essential/util/Try;
        //   192: goto            207
        //   195: new             Lgg/essential/util/Success;
        //   198: dup            
        //   199: aload           res$iv$iv$iv
        //   201: invokespecial   gg/essential/util/Success.<init>:(Ljava/lang/Object;)V
        //   204: checkcast       Lgg/essential/util/Try;
        //   207: astore          null
        //   209: goto            221
        //   212: pop            
        //   213: getstatic       gg/essential/util/Failure.INSTANCE:Lgg/essential/util/Failure;
        //   216: checkcast       Lgg/essential/util/Try;
        //   219: astore          14
        //   221: aload           14
        //   223: goto            234
        //   226: new             Lkotlin/NoWhenBranchMatchedException;
        //   229: dup            
        //   230: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //   233: athrow         
        //   234: goto            245
        //   237: new             Lkotlin/NoWhenBranchMatchedException;
        //   240: dup            
        //   241: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //   244: athrow         
        //   245: areturn        
        //   246: iload           isNullable
        //   248: ifeq            261
        //   251: aload           result
        //   253: aconst_null    
        //   254: invokestatic    gg/essential/util/TryKt.recover:(Lgg/essential/util/Try;Ljava/lang/Object;)Lgg/essential/util/Success;
        //   257: checkcast       Lgg/essential/util/Try;
        //   260: areturn        
        //   261: aload           result
        //   263: areturn        
        //    Signature:
        //  (Ljava/lang/reflect/Parameter;Lkotlin/reflect/KParameter;Lgg/essential/api/commands/ArgumentQueue;)Lgg/essential/util/Try<Ljava/lang/Object;>;
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  param   
        //  kParam  
        //  queue   
        //    StackMapTable: 00 0C FF 00 74 00 0C 07 00 02 07 00 85 07 00 83 07 00 89 07 01 85 07 01 8A 01 01 07 00 93 07 00 93 07 01 35 07 00 93 00 00 FD 00 1C 07 00 93 07 00 93 FC 00 31 07 01 35 4B 07 00 93 FF 00 04 00 0E 07 00 02 07 00 85 07 00 83 07 00 89 07 01 85 07 01 8A 01 01 07 00 93 07 00 93 07 01 35 07 00 93 07 00 93 07 00 93 00 01 07 01 80 FC 00 08 07 00 93 FA 00 04 47 07 00 93 F9 00 02 47 07 00 93 F8 00 00 0E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  157    209    212    221    Ljava/lang/Exception;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final Triple<Class<?>, Boolean, Boolean> collectTypeInformation$essential(@NotNull final Parameter param, @Nullable final KParameter kParam) {
        Intrinsics.checkNotNullParameter((Object)param, "param");
        Class type = param.getType();
        final boolean isJavaOptional = Intrinsics.areEqual((Object)type, (Object)Optional.class);
        final boolean isNullable = (kParam != null && kParam.getType().isMarkedNullable()) || param.isAnnotationPresent(Nullable.class);
        if (isJavaOptional) {
            final Type parameterizedType = param.getParameterizedType();
            if (parameterizedType == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
            }
            final Type type2 = ((ParameterizedType)parameterizedType).getActualTypeArguments()[0];
            if (type2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
            }
            type = (Class)type2;
        }
        return (Triple<Class<?>, Boolean, Boolean>)new Triple((Object)type, (Object)isJavaOptional, (Object)isNullable);
    }
    
    private final Try<Object> getParsedArgument(final Parameter param, final Class<?> type, final ArgumentQueue queue) {
        final ArgumentParser argumentParser = CommandParser.argumentParsers.get(type);
        if (argumentParser == null) {
            return (Try<Object>)Failure.INSTANCE;
        }
        final ArgumentParser parser = argumentParser;
        final Try$Companion companion = Try.Companion;
        Try try1;
        try {
            final Object parse = parser.parse(queue, param);
            Intrinsics.checkNotNull(parse);
            final Object o = parse;
            final WhitespaceSensitiveArgumentQueue whitespaceSensitiveArgumentQueue = (queue instanceof WhitespaceSensitiveArgumentQueue) ? queue : null;
            if (whitespaceSensitiveArgumentQueue != null) {
                whitespaceSensitiveArgumentQueue.markEndOfArgument();
            }
            final Object res$iv = o;
            try1 = (Try)((res$iv == null) ? Failure.INSTANCE : ((Try)new Success(res$iv)));
        }
        catch (final Exception ex) {
            try1 = (Try)Failure.INSTANCE;
        }
        return (Try<Object>)try1;
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   gg/essential/commands/engine/CommandParser.<init>:()V
        //     7: putstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //    10: new             Ljava/util/LinkedHashMap;
        //    13: dup            
        //    14: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    17: checkcast       Ljava/util/Map;
        //    20: putstatic       gg/essential/commands/engine/CommandParser.argumentParsers:Ljava/util/Map;
        //    23: aconst_null    
        //    24: iconst_1       
        //    25: aconst_null    
        //    26: invokestatic    kotlinx/coroutines/SupervisorKt.SupervisorJob$default:(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;
        //    29: getstatic       kotlinx/coroutines/Dispatchers.INSTANCE:Lkotlinx/coroutines/Dispatchers;
        //    32: invokestatic    gg/essential/util/MinecraftCoroutineDispatchersKt.getClient:(Lkotlinx/coroutines/Dispatchers;)Lkotlinx/coroutines/CoroutineDispatcher;
        //    35: checkcast       Lkotlin/coroutines/CoroutineContext;
        //    38: invokeinterface kotlinx/coroutines/CompletableJob.plus:(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
        //    43: invokestatic    kotlinx/coroutines/CoroutineScopeKt.CoroutineScope:(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;
        //    46: putstatic       gg/essential/commands/engine/CommandParser.coroutineScope:Lkotlinx/coroutines/CoroutineScope;
        //    49: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //    52: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    55: dup            
        //    56: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        //    59: new             Lgg/essential/commands/engine/IntArgumentParser;
        //    62: dup            
        //    63: invokespecial   gg/essential/commands/engine/IntArgumentParser.<init>:()V
        //    66: checkcast       Lgg/essential/api/commands/ArgumentParser;
        //    69: invokevirtual   gg/essential/commands/engine/CommandParser.registerArgumentParser:(Ljava/lang/Class;Lgg/essential/api/commands/ArgumentParser;)V
        //    72: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //    75: ldc_w           Ljava/lang/Integer;.class
        //    78: new             Lgg/essential/commands/engine/IntArgumentParser;
        //    81: dup            
        //    82: invokespecial   gg/essential/commands/engine/IntArgumentParser.<init>:()V
        //    85: checkcast       Lgg/essential/api/commands/ArgumentParser;
        //    88: invokevirtual   gg/essential/commands/engine/CommandParser.registerArgumentParser:(Ljava/lang/Class;Lgg/essential/api/commands/ArgumentParser;)V
        //    91: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //    94: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    97: dup            
        //    98: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        //   101: new             Lgg/essential/commands/engine/BooleanArgumentParser;
        //   104: dup            
        //   105: invokespecial   gg/essential/commands/engine/BooleanArgumentParser.<init>:()V
        //   108: checkcast       Lgg/essential/api/commands/ArgumentParser;
        //   111: invokevirtual   gg/essential/commands/engine/CommandParser.registerArgumentParser:(Ljava/lang/Class;Lgg/essential/api/commands/ArgumentParser;)V
        //   114: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   117: ldc_w           Ljava/lang/Boolean;.class
        //   120: new             Lgg/essential/commands/engine/BooleanArgumentParser;
        //   123: dup            
        //   124: invokespecial   gg/essential/commands/engine/BooleanArgumentParser.<init>:()V
        //   127: checkcast       Lgg/essential/api/commands/ArgumentParser;
        //   130: invokevirtual   gg/essential/commands/engine/CommandParser.registerArgumentParser:(Ljava/lang/Class;Lgg/essential/api/commands/ArgumentParser;)V
        //   133: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   136: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //   139: dup            
        //   140: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        //   143: new             Lgg/essential/commands/engine/DoubleArgumentParser;
        //   146: dup            
        //   147: invokespecial   gg/essential/commands/engine/DoubleArgumentParser.<init>:()V
        //   150: checkcast       Lgg/essential/api/commands/ArgumentParser;
        //   153: invokevirtual   gg/essential/commands/engine/CommandParser.registerArgumentParser:(Ljava/lang/Class;Lgg/essential/api/commands/ArgumentParser;)V
        //   156: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   159: ldc_w           Ljava/lang/Double;.class
        //   162: new             Lgg/essential/commands/engine/DoubleArgumentParser;
        //   165: dup            
        //   166: invokespecial   gg/essential/commands/engine/DoubleArgumentParser.<init>:()V
        //   169: checkcast       Lgg/essential/api/commands/ArgumentParser;
        //   172: invokevirtual   gg/essential/commands/engine/CommandParser.registerArgumentParser:(Ljava/lang/Class;Lgg/essential/api/commands/ArgumentParser;)V
        //   175: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   178: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //   181: dup            
        //   182: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        //   185: new             Lgg/essential/commands/engine/FloatArgumentParser;
        //   188: dup            
        //   189: invokespecial   gg/essential/commands/engine/FloatArgumentParser.<init>:()V
        //   192: checkcast       Lgg/essential/api/commands/ArgumentParser;
        //   195: invokevirtual   gg/essential/commands/engine/CommandParser.registerArgumentParser:(Ljava/lang/Class;Lgg/essential/api/commands/ArgumentParser;)V
        //   198: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   201: ldc_w           Ljava/lang/Float;.class
        //   204: new             Lgg/essential/commands/engine/FloatArgumentParser;
        //   207: dup            
        //   208: invokespecial   gg/essential/commands/engine/FloatArgumentParser.<init>:()V
        //   211: checkcast       Lgg/essential/api/commands/ArgumentParser;
        //   214: invokevirtual   gg/essential/commands/engine/CommandParser.registerArgumentParser:(Ljava/lang/Class;Lgg/essential/api/commands/ArgumentParser;)V
        //   217: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   220: astore_0       
        //   221: new             Lgg/essential/commands/engine/StringArgumentParser;
        //   224: dup            
        //   225: invokespecial   gg/essential/commands/engine/StringArgumentParser.<init>:()V
        //   228: checkcast       Lgg/essential/api/commands/ArgumentParser;
        //   231: astore_1        /* parser$iv */
        //   232: aload_0         /* this_$iv */
        //   233: ldc_w           Ljava/lang/String;.class
        //   236: aload_1         /* parser$iv */
        //   237: invokevirtual   gg/essential/commands/engine/CommandParser.registerArgumentParser:(Ljava/lang/Class;Lgg/essential/api/commands/ArgumentParser;)V
        //   240: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   243: astore_0       
        //   244: new             Lgg/essential/commands/engine/PlayerArgumentParser;
        //   247: dup            
        //   248: invokespecial   gg/essential/commands/engine/PlayerArgumentParser.<init>:()V
        //   251: checkcast       Lgg/essential/api/commands/ArgumentParser;
        //   254: astore_1        /* parser$iv */
        //   255: aload_0         /* this_$iv */
        //   256: ldc_w           Lnet/minecraft/entity/player/PlayerEntity;.class
        //   259: aload_1         /* parser$iv */
        //   260: invokevirtual   gg/essential/commands/engine/CommandParser.registerArgumentParser:(Ljava/lang/Class;Lgg/essential/api/commands/ArgumentParser;)V
        //   263: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   266: astore_0       
        //   267: new             Lgg/essential/commands/engine/EssentialFriendArgumentParser;
        //   270: dup            
        //   271: invokespecial   gg/essential/commands/engine/EssentialFriendArgumentParser.<init>:()V
        //   274: checkcast       Lgg/essential/api/commands/ArgumentParser;
        //   277: astore_1        /* parser$iv */
        //   278: aload_0         /* this_$iv */
        //   279: ldc_w           Lgg/essential/commands/engine/EssentialFriend;.class
        //   282: aload_1         /* parser$iv */
        //   283: invokevirtual   gg/essential/commands/engine/CommandParser.registerArgumentParser:(Ljava/lang/Class;Lgg/essential/api/commands/ArgumentParser;)V
        //   286: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   289: astore_0       
        //   290: getstatic       gg/essential/commands/engine/EssentialUserArgumentParser.INSTANCE:Lgg/essential/commands/engine/EssentialUserArgumentParser;
        //   293: checkcast       Lgg/essential/api/commands/ArgumentParser;
        //   296: astore_1        /* parser$iv */
        //   297: aload_0         /* this_$iv */
        //   298: ldc_w           Lgg/essential/commands/engine/EssentialUser;.class
        //   301: aload_1         /* parser$iv */
        //   302: invokevirtual   gg/essential/commands/engine/CommandParser.registerArgumentParser:(Ljava/lang/Class;Lgg/essential/api/commands/ArgumentParser;)V
        //   305: return         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
