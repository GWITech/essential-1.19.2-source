package gg.essential.commands;

import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import gg.essential.config.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import gg.essential.commands.engine.*;
import gg.essential.event.network.chat.*;
import kotlin.text.*;
import kotlin.collections.*;
import java.util.*;
import kotlin.jvm.functions.*;
import gg.essential.universal.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.api.commands.*;
import gg.essential.commands.impl.*;
import gg.essential.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000l
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u0011
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a2\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020	H\u0002J\u0010\u0010"\u001a\u00020\u00182\u0006\u0010!\u001a\u00020	H\u0016J*\u0010#\u001a\u00020\u0018"\u0004\b\u0000\u0010$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H$0&2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H$0(H\u0016J\b\u0010)\u001a\u00020\u0018H\u0007J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010!\u001a\u00020	H\u0016J\b\u0010+\u001a\u00020\u0018H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R,\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020	\u0012\u0004\u0012\u00020
                                                   0\b0\u0006X\u0080\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020	0\u0016X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006,""" }, d2 = { "Lgg/essential/commands/EssentialCommandRegistry;", "Lgg/essential/api/commands/CommandRegistry;", "()V", "commandSession", "Lgg/essential/commands/impl/CommandSession;", "commands", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlin/Pair;", "Lgg/essential/api/commands/Command;", "", "getCommands$essential", "()Ljava/util/concurrent/ConcurrentHashMap;", "friends", "Lgg/essential/commands/impl/CommandMcFriends;", "invite", "Lgg/essential/commands/impl/CommandInvite;", "inviteFriends", "Lgg/essential/commands/impl/CommandInviteFriends;", "message", "Lgg/essential/commands/impl/CommandMessage;", "spsHostCommands", "", "checkMiniCommands", "", "getCompletionOptions", "", "commandString", "(Ljava/lang/String;)[Ljava/lang/String;", "onSendCommand", "event", "Lgg/essential/event/network/chat/SendCommandEvent;", "printCommandHelpMessage", "command", "registerCommand", "registerParser", "T", "type", "Ljava/lang/Class;", "parser", "Lgg/essential/api/commands/ArgumentParser;", "registerSPSHostCommands", "unregisterCommand", "unregisterSPSHostCommands", "essential" })
public final class EssentialCommandRegistry implements CommandRegistry
{
    @NotNull
    public static final EssentialCommandRegistry INSTANCE;
    @NotNull
    private static final ConcurrentHashMap<String, Pair<Command, Boolean>> commands;
    @NotNull
    private static final CommandMcFriends friends;
    @NotNull
    private static final CommandMessage message;
    @NotNull
    private static final CommandInviteFriends inviteFriends;
    @NotNull
    private static final CommandSession commandSession;
    @NotNull
    private static final CommandInvite invite;
    @NotNull
    private static final List<Command> spsHostCommands;
    
    private EssentialCommandRegistry() {
        super();
    }
    
    @NotNull
    public final ConcurrentHashMap<String, Pair<Command, Boolean>> getCommands$essential() {
        return EssentialCommandRegistry.commands;
    }
    
    public final void checkMiniCommands() {
        if (!EssentialConfig.INSTANCE.getEssentialFull()) {
            this.unregisterCommand(EssentialCommandRegistry.friends);
            this.unregisterCommand(EssentialCommandRegistry.message);
            this.unregisterCommand(EssentialCommandRegistry.inviteFriends);
            if (FeatureFlags.SPS_HOST_COMMANDS_ENABLED) {
                this.unregisterCommand(EssentialCommandRegistry.commandSession);
                this.unregisterCommand(EssentialCommandRegistry.invite);
            }
        }
        else {
            this.registerCommand(EssentialCommandRegistry.friends);
            this.registerCommand(EssentialCommandRegistry.message);
            this.registerCommand(EssentialCommandRegistry.inviteFriends);
            if (FeatureFlags.SPS_HOST_COMMANDS_ENABLED) {
                this.registerCommand(EssentialCommandRegistry.commandSession);
                this.registerCommand(EssentialCommandRegistry.invite);
            }
        }
    }
    
    public final void registerSPSHostCommands() {
        for (final Command spsHostCommand : EssentialCommandRegistry.spsHostCommands) {
            this.registerCommand(spsHostCommand);
        }
    }
    
    public final void unregisterSPSHostCommands() {
        for (final Command spsHostCommand : EssentialCommandRegistry.spsHostCommands) {
            this.unregisterCommand(spsHostCommand);
        }
    }
    
    @Override
    public void unregisterCommand(@NotNull final Command command) {
        Intrinsics.checkNotNullParameter((Object)command, "command");
        final ConcurrentHashMap<String, Pair<Command, Boolean>> commands = EssentialCommandRegistry.commands;
        final String name = command.getName();
        final Locale english = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue((Object)english, "ENGLISH");
        final String lowerCase = name.toLowerCase(english);
        Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
        commands.remove(lowerCase);
        final Set<Command.Alias> commandAliases = command.getCommandAliases();
        if (commandAliases != null) {
            final Iterable $this$forEach$iv = commandAliases;
            for (final Object element$iv : $this$forEach$iv) {
                final Command.Alias it = (Command.Alias)element$iv;
                EssentialCommandRegistry.commands.remove(it.getAlias());
            }
        }
    }
    
    @Override
    public void registerCommand(@NotNull final Command command) {
        Intrinsics.checkNotNullParameter((Object)command, "command");
        final Map map = EssentialCommandRegistry.commands;
        final String name = command.getName();
        final Locale english = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue((Object)english, "ENGLISH");
        final String lowerCase = name.toLowerCase(english);
        Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
        map.put(lowerCase, TuplesKt.to((Object)command, (Object)command.getHideFromAutocomplete()));
        final Set<Command.Alias> commandAliases = command.getCommandAliases();
        Unit instance;
        if (commandAliases != null) {
            final Iterable $this$forEach$iv = commandAliases;
            for (final Object element$iv : $this$forEach$iv) {
                final Command.Alias it = (Command.Alias)element$iv;
                EssentialCommandRegistry.commands.put(it.getAlias(), TuplesKt.to((Object)command, (Object)it.getHideFromAutocomplete()));
            }
            instance = Unit.INSTANCE;
        }
        else {
            instance = null;
        }
        if (instance == null) {
            return;
        }
    }
    
    @Override
    public <T> void registerParser(@NotNull final Class<T> type, @NotNull final ArgumentParser<T> parser) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)parser, "parser");
        CommandParser.INSTANCE.registerArgumentParser(type, parser);
    }
    
    @Subscribe
    public final void onSendCommand(@NotNull final SendCommandEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        final String commandLine = event.getCommandLine();
        Intrinsics.checkNotNullExpressionValue((Object)commandLine, "event.commandLine");
        final List args = StringsKt.split$default((CharSequence)StringsKt.trim((CharSequence)commandLine).toString(), new String[] { " " }, false, 0, 6, (Object)null);
        if (args.isEmpty()) {
            return;
        }
        final ConcurrentHashMap<String, Pair<Command, Boolean>> commands = EssentialCommandRegistry.commands;
        final String s = args.get(0);
        final Locale english = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue((Object)english, "ENGLISH");
        final String lowerCase = s.toLowerCase(english);
        Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
        final Pair pair = commands.get(lowerCase);
        if (pair != null) {
            final Command command2 = (Command)pair.getFirst();
            if (command2 != null) {
                final Command command = command2;
                event.setCancelled$1385ff();
                if (args.size() >= 2) {
                    final String s2 = args.get(1);
                    final Locale english2 = Locale.ENGLISH;
                    Intrinsics.checkNotNullExpressionValue((Object)english2, "ENGLISH");
                    final String lowerCase2 = s2.toLowerCase(english2);
                    Intrinsics.checkNotNullExpressionValue((Object)lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                    final String subCommand = lowerCase2;
                    final Command.Handler subCommandHandler = command.getSubCommands().get(subCommand);
                    if (subCommandHandler != null) {
                        CommandParser.INSTANCE.parseCommandAndCallHandler$essential(CollectionsKt.drop((Iterable)args, 2), subCommandHandler, command);
                        return;
                    }
                    if (Intrinsics.areEqual((Object)subCommand, (Object)"help") && command.getAutoHelpSubcommand()) {
                        this.printCommandHelpMessage(command);
                        return;
                    }
                }
                final Command.Handler defaultHandler = command.getDefaultHandler();
                if (defaultHandler == null || (args.size() > 1 && defaultHandler.getParams().length == 0)) {
                    final List it = CollectionsKt.sorted((Iterable)command.getSubCommands().keySet());
                    final String subCommands = CollectionsKt.joinToString$default((Iterable)(command.getAutoHelpSubcommand() ? CollectionsKt.plus((Collection)CollectionsKt.listOf((Object)"help"), (Iterable)it) : it), (CharSequence)"|", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null);
                    MinecraftUtils.INSTANCE.sendMessage("", ChatColor.RED + "Usage: /" + command.getName() + " <" + subCommands);
                    return;
                }
                CommandParser.INSTANCE.parseCommandAndCallHandler$essential(CollectionsKt.drop((Iterable)args, 1), defaultHandler, command);
            }
        }
    }
    
    @NotNull
    public final String[] getCompletionOptions(@NotNull final String commandString) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "commandString"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: new             Ljava/util/ArrayList;
        //    10: dup            
        //    11: invokespecial   java/util/ArrayList.<init>:()V
        //    14: checkcast       Ljava/util/List;
        //    17: astore_2        /* availableCompletions */
        //    18: aload_1         /* commandString */
        //    19: iconst_0       
        //    20: invokevirtual   java/lang/String.charAt:(I)C
        //    23: bipush          47
        //    25: if_icmpeq       58
        //    28: aload_2         /* availableCompletions */
        //    29: checkcast       Ljava/util/Collection;
        //    32: astore_3        /* $this$toTypedArray$iv */
        //    33: aload_3         /* $this$toTypedArray$iv */
        //    34: astore          thisCollection$iv
        //    36: aload           thisCollection$iv
        //    38: iconst_0       
        //    39: anewarray       Ljava/lang/String;
        //    42: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //    47: dup            
        //    48: ldc_w           "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
        //    51: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    54: checkcast       [Ljava/lang/String;
        //    57: areturn        
        //    58: aload_1         /* commandString */
        //    59: iconst_1       
        //    60: invokestatic    kotlin/text/StringsKt.drop:(Ljava/lang/String;I)Ljava/lang/String;
        //    63: checkcast       Ljava/lang/CharSequence;
        //    66: iconst_1       
        //    67: anewarray       Ljava/lang/String;
        //    70: astore          4
        //    72: aload           4
        //    74: iconst_0       
        //    75: ldc             " "
        //    77: aastore        
        //    78: aload           4
        //    80: iconst_0       
        //    81: iconst_0       
        //    82: bipush          6
        //    84: aconst_null    
        //    85: invokestatic    kotlin/text/StringsKt.split$default:(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
        //    88: astore_3        /* args */
        //    89: aload_3         /* args */
        //    90: invokeinterface java/util/List.isEmpty:()Z
        //    95: ifeq            130
        //    98: aload_2         /* availableCompletions */
        //    99: checkcast       Ljava/util/Collection;
        //   102: astore          $this$toTypedArray$iv
        //   104: aload           $this$toTypedArray$iv
        //   106: astore          thisCollection$iv
        //   108: aload           thisCollection$iv
        //   110: iconst_0       
        //   111: anewarray       Ljava/lang/String;
        //   114: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   119: dup            
        //   120: ldc_w           "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
        //   123: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   126: checkcast       [Ljava/lang/String;
        //   129: areturn        
        //   130: aload_3         /* args */
        //   131: invokeinterface java/util/List.size:()I
        //   136: iconst_1       
        //   137: if_icmpne       445
        //   140: aload_2         /* availableCompletions */
        //   141: getstatic       gg/essential/commands/EssentialCommandRegistry.commands:Ljava/util/concurrent/ConcurrentHashMap;
        //   144: invokevirtual   java/util/concurrent/ConcurrentHashMap.keySet:()Ljava/util/Set;
        //   147: dup            
        //   148: ldc_w           "commands.keys"
        //   151: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   154: checkcast       Ljava/lang/Iterable;
        //   157: invokestatic    kotlin/collections/CollectionsKt.sorted:(Ljava/lang/Iterable;)Ljava/util/List;
        //   160: checkcast       Ljava/lang/Iterable;
        //   163: astore          4
        //   165: astore          14
        //   167: aload           $this$filter$iv
        //   169: astore          6
        //   171: new             Ljava/util/ArrayList;
        //   174: dup            
        //   175: invokespecial   java/util/ArrayList.<init>:()V
        //   178: checkcast       Ljava/util/Collection;
        //   181: astore          destination$iv$iv
        //   183: aload           $this$filterTo$iv$iv
        //   185: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   190: astore          9
        //   192: aload           9
        //   194: invokeinterface java/util/Iterator.hasNext:()Z
        //   199: ifeq            300
        //   202: aload           9
        //   204: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   209: astore          element$iv$iv
        //   211: aload           element$iv$iv
        //   213: checkcast       Ljava/lang/String;
        //   216: astore          it
        //   218: aload           it
        //   220: ldc_w           "it"
        //   223: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   226: aload           it
        //   228: aload_3         /* args */
        //   229: iconst_0       
        //   230: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   235: checkcast       Ljava/lang/String;
        //   238: iconst_0       
        //   239: iconst_2       
        //   240: aconst_null    
        //   241: invokestatic    kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   244: ifeq            283
        //   247: getstatic       gg/essential/commands/EssentialCommandRegistry.commands:Ljava/util/concurrent/ConcurrentHashMap;
        //   250: aload           it
        //   252: invokevirtual   java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   255: checkcast       Lkotlin/Pair;
        //   258: dup            
        //   259: ifnull          274
        //   262: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //   265: checkcast       Ljava/lang/Boolean;
        //   268: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   271: goto            276
        //   274: pop            
        //   275: iconst_1       
        //   276: ifne            283
        //   279: iconst_1       
        //   280: goto            284
        //   283: iconst_0       
        //   284: ifeq            192
        //   287: aload           destination$iv$iv
        //   289: aload           element$iv$iv
        //   291: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   296: pop            
        //   297: goto            192
        //   300: aload           destination$iv$iv
        //   302: checkcast       Ljava/util/List;
        //   305: aload           14
        //   307: swap           
        //   308: checkcast       Ljava/lang/Iterable;
        //   311: astore          4
        //   313: astore          14
        //   315: aload           $this$map$iv
        //   317: astore          6
        //   319: new             Ljava/util/ArrayList;
        //   322: dup            
        //   323: aload           $this$map$iv
        //   325: bipush          10
        //   327: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   330: invokespecial   java/util/ArrayList.<init>:(I)V
        //   333: checkcast       Ljava/util/Collection;
        //   336: astore          destination$iv$iv
        //   338: aload           $this$mapTo$iv$iv
        //   340: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   345: astore          9
        //   347: aload           9
        //   349: invokeinterface java/util/Iterator.hasNext:()Z
        //   354: ifeq            396
        //   357: aload           9
        //   359: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   364: astore          item$iv$iv
        //   366: aload           destination$iv$iv
        //   368: aload           item$iv$iv
        //   370: checkcast       Ljava/lang/String;
        //   373: astore          11
        //   375: astore          15
        //   377: aload           it
        //   379: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   384: aload           15
        //   386: swap           
        //   387: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   392: pop            
        //   393: goto            347
        //   396: aload           destination$iv$iv
        //   398: checkcast       Ljava/util/List;
        //   401: aload           14
        //   403: swap           
        //   404: checkcast       Ljava/util/Collection;
        //   407: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   412: pop            
        //   413: aload_2         /* availableCompletions */
        //   414: checkcast       Ljava/util/Collection;
        //   417: astore          $this$toTypedArray$iv
        //   419: aload           $this$toTypedArray$iv
        //   421: astore          thisCollection$iv
        //   423: aload           thisCollection$iv
        //   425: iconst_0       
        //   426: anewarray       Ljava/lang/String;
        //   429: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   434: dup            
        //   435: ldc_w           "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
        //   438: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   441: checkcast       [Ljava/lang/String;
        //   444: areturn        
        //   445: getstatic       gg/essential/commands/EssentialCommandRegistry.commands:Ljava/util/concurrent/ConcurrentHashMap;
        //   448: aload_3         /* args */
        //   449: iconst_0       
        //   450: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   455: checkcast       Ljava/lang/String;
        //   458: astore          6
        //   460: getstatic       java/util/Locale.ENGLISH:Ljava/util/Locale;
        //   463: dup            
        //   464: ldc             "ENGLISH"
        //   466: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   469: aload           6
        //   471: swap           
        //   472: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   475: dup            
        //   476: ldc             "this as java.lang.String).toLowerCase(locale)"
        //   478: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   481: invokevirtual   java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   484: checkcast       Lkotlin/Pair;
        //   487: dup            
        //   488: ifnull          501
        //   491: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //   494: checkcast       Lgg/essential/api/commands/Command;
        //   497: dup            
        //   498: ifnonnull       534
        //   501: pop            
        //   502: aload_2         /* availableCompletions */
        //   503: checkcast       Ljava/util/Collection;
        //   506: astore          $this$toTypedArray$iv
        //   508: aload           $this$toTypedArray$iv
        //   510: astore          thisCollection$iv
        //   512: aload           thisCollection$iv
        //   514: iconst_0       
        //   515: anewarray       Ljava/lang/String;
        //   518: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   523: dup            
        //   524: ldc_w           "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
        //   527: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   530: checkcast       [Ljava/lang/String;
        //   533: areturn        
        //   534: astore          command
        //   536: aload           command
        //   538: invokevirtual   gg/essential/api/commands/Command.getDefaultHandler:()Lgg/essential/api/commands/Command$Handler;
        //   541: dup            
        //   542: ifnull          576
        //   545: astore          it
        //   547: aload_2         /* availableCompletions */
        //   548: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   551: aload_3         /* args */
        //   552: checkcast       Ljava/lang/Iterable;
        //   555: iconst_1       
        //   556: invokestatic    kotlin/collections/CollectionsKt.drop:(Ljava/lang/Iterable;I)Ljava/util/List;
        //   559: aload           it
        //   561: invokevirtual   gg/essential/commands/engine/CommandParser.getCompletionOptions$essential:(Ljava/util/List;Lgg/essential/api/commands/Command$Handler;)Ljava/util/List;
        //   564: checkcast       Ljava/util/Collection;
        //   567: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   572: pop            
        //   573: goto            577
        //   576: pop            
        //   577: aload_3         /* args */
        //   578: invokeinterface java/util/List.size:()I
        //   583: iconst_2       
        //   584: if_icmplt       817
        //   587: aload_3         /* args */
        //   588: iconst_1       
        //   589: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   594: checkcast       Ljava/lang/String;
        //   597: astore          6
        //   599: getstatic       java/util/Locale.ENGLISH:Ljava/util/Locale;
        //   602: dup            
        //   603: ldc             "ENGLISH"
        //   605: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   608: aload           6
        //   610: swap           
        //   611: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   614: dup            
        //   615: ldc             "this as java.lang.String).toLowerCase(locale)"
        //   617: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   620: astore          subCommand
        //   622: aload_3         /* args */
        //   623: invokeinterface java/util/List.size:()I
        //   628: iconst_2       
        //   629: if_icmpne       769
        //   632: aload           command
        //   634: invokevirtual   gg/essential/api/commands/Command.getSubCommands:()Ljava/util/Map;
        //   637: invokeinterface java/util/Map.isEmpty:()Z
        //   642: ifne            649
        //   645: iconst_1       
        //   646: goto            650
        //   649: iconst_0       
        //   650: ifeq            769
        //   653: aload_2         /* availableCompletions */
        //   654: aload           command
        //   656: invokevirtual   gg/essential/api/commands/Command.getSubCommands:()Ljava/util/Map;
        //   659: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   664: checkcast       Ljava/lang/Iterable;
        //   667: astore          6
        //   669: astore          14
        //   671: aload           $this$filter$iv
        //   673: astore          8
        //   675: new             Ljava/util/ArrayList;
        //   678: dup            
        //   679: invokespecial   java/util/ArrayList.<init>:()V
        //   682: checkcast       Ljava/util/Collection;
        //   685: astore          destination$iv$iv
        //   687: aload           $this$filterTo$iv$iv
        //   689: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   694: astore          11
        //   696: aload           11
        //   698: invokeinterface java/util/Iterator.hasNext:()Z
        //   703: ifeq            748
        //   706: aload           11
        //   708: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   713: astore          element$iv$iv
        //   715: aload           element$iv$iv
        //   717: checkcast       Ljava/lang/String;
        //   720: astore          it
        //   722: aload           it
        //   724: aload           subCommand
        //   726: iconst_0       
        //   727: iconst_2       
        //   728: aconst_null    
        //   729: invokestatic    kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   732: ifeq            696
        //   735: aload           destination$iv$iv
        //   737: aload           element$iv$iv
        //   739: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   744: pop            
        //   745: goto            696
        //   748: aload           destination$iv$iv
        //   750: checkcast       Ljava/util/List;
        //   753: aload           14
        //   755: swap           
        //   756: checkcast       Ljava/util/Collection;
        //   759: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   764: pop            
        //   765: aload_2         /* availableCompletions */
        //   766: invokestatic    kotlin/collections/CollectionsKt.sort:(Ljava/util/List;)V
        //   769: aload           command
        //   771: invokevirtual   gg/essential/api/commands/Command.getSubCommands:()Ljava/util/Map;
        //   774: aload           subCommand
        //   776: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   781: checkcast       Lgg/essential/api/commands/Command$Handler;
        //   784: astore          subCommandHandler
        //   786: aload           subCommandHandler
        //   788: ifnull          817
        //   791: aload_2         /* availableCompletions */
        //   792: getstatic       gg/essential/commands/engine/CommandParser.INSTANCE:Lgg/essential/commands/engine/CommandParser;
        //   795: aload_3         /* args */
        //   796: checkcast       Ljava/lang/Iterable;
        //   799: iconst_2       
        //   800: invokestatic    kotlin/collections/CollectionsKt.drop:(Ljava/lang/Iterable;I)Ljava/util/List;
        //   803: aload           subCommandHandler
        //   805: invokevirtual   gg/essential/commands/engine/CommandParser.getCompletionOptions$essential:(Ljava/util/List;Lgg/essential/api/commands/Command$Handler;)Ljava/util/List;
        //   808: checkcast       Ljava/util/Collection;
        //   811: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   816: pop            
        //   817: aload           command
        //   819: invokevirtual   gg/essential/api/commands/Command.getAutoHelpSubcommand:()Z
        //   822: ifeq            870
        //   825: ldc_w           "help"
        //   828: aload_3         /* args */
        //   829: iconst_1       
        //   830: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   835: checkcast       Ljava/lang/String;
        //   838: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //   841: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   844: dup            
        //   845: ldc_w           "this as java.lang.String).toLowerCase(Locale.ROOT)"
        //   848: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   851: iconst_0       
        //   852: iconst_2       
        //   853: aconst_null    
        //   854: invokestatic    kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   857: ifeq            870
        //   860: aload_2         /* availableCompletions */
        //   861: ldc_w           "help"
        //   864: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   869: pop            
        //   870: aload_2         /* availableCompletions */
        //   871: checkcast       Ljava/util/Collection;
        //   874: astore          $this$toTypedArray$iv
        //   876: aload           $this$toTypedArray$iv
        //   878: astore          thisCollection$iv
        //   880: aload           thisCollection$iv
        //   882: iconst_0       
        //   883: anewarray       Ljava/lang/String;
        //   886: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   891: dup            
        //   892: ldc_w           "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
        //   895: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   898: checkcast       [Ljava/lang/String;
        //   901: areturn        
        //    MethodParameters:
        //  Name           Flags  
        //  -------------  -----
        //  commandString  
        //    StackMapTable: 00 16 FF 00 3A 00 03 00 07 00 90 07 00 6B 00 00 FF 00 47 00 04 00 00 07 00 6B 07 00 6B 00 00 FF 00 3D 00 0F 00 00 07 00 6B 07 00 6B 00 00 00 07 01 38 00 07 00 71 00 00 00 00 07 00 6B 00 00 FF 00 51 00 0F 00 00 07 00 6B 07 00 6B 00 00 00 07 01 38 00 07 00 71 07 00 04 00 00 00 07 00 6B 00 01 07 00 FD 41 01 06 40 01 FF 00 0F 00 0F 00 00 07 00 6B 00 00 00 00 07 01 38 00 00 00 00 00 00 07 00 6B 00 00 FF 00 2E 00 0F 00 00 07 00 6B 00 00 00 00 07 01 38 00 07 00 71 00 00 00 00 07 00 6B 00 00 FF 00 30 00 0F 00 00 07 00 6B 00 00 00 00 07 01 38 00 00 00 00 00 00 07 00 6B 00 00 FF 00 30 00 04 00 00 07 00 6B 07 00 6B 00 00 FF 00 37 00 03 00 00 07 00 6B 00 01 07 00 04 FF 00 20 00 04 00 00 07 00 6B 07 00 6B 00 01 07 00 54 FF 00 29 00 05 00 00 07 00 6B 07 00 6B 07 00 54 00 01 07 01 0E 00 FC 00 47 07 00 90 40 01 FF 00 2D 00 0F 00 00 07 00 6B 07 00 6B 07 00 54 07 00 90 00 00 00 07 01 38 00 07 00 71 00 00 07 00 6B 00 00 FF 00 33 00 0F 00 00 07 00 6B 07 00 6B 07 00 54 07 00 90 00 00 00 07 01 38 00 00 00 00 07 00 6B 00 00 FF 00 14 00 06 00 00 07 00 6B 07 00 6B 07 00 54 07 00 90 00 00 FA 00 2F F9 00 34
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void printCommandHelpMessage(final Command command) {
        MinecraftUtils.INSTANCE.sendMessage("", ChatColor.AQUA + "Usage for /" + command.getName());
        final Iterable $this$forEach$iv = command.getUniqueSubCommands();
        for (Object element$iv : $this$forEach$iv) {
            final Pair pair = (Pair)element$iv;
            final Command.Handler handler = (Command.Handler)pair.component1();
            final SubCommand ann = (SubCommand)pair.component2();
            final String usage = CommandParser.INSTANCE.getHandlerUsage$essential(command, handler);
            final String description = ann.description();
            if (!Intrinsics.areEqual((Object)description, (Object)"")) {
                MinecraftUtils.INSTANCE.sendMessage("", ChatColor.RED + usage + " " + ChatColor.GRAY + "- " + ChatColor.ITALIC + description);
            }
            else {
                MinecraftUtils.INSTANCE.sendMessage("", ChatColor.RED + usage);
            }
        }
    }
    
    private static final void _init_$lambda-0() {
        EssentialCommandRegistry.INSTANCE.registerCommand(new CommandConfig());
        EssentialCommandRegistry.INSTANCE.checkMiniCommands();
        if (Intrinsics.areEqual((Object)System.getProperty("elementa.dev", "false"), (Object)"true")) {
            EssentialCommandRegistry.INSTANCE.registerCommand((Command)new CommandTest());
        }
    }
    
    static {
        INSTANCE = new EssentialCommandRegistry();
        commands = new ConcurrentHashMap<String, Pair<Command, Boolean>>();
        friends = new CommandMcFriends();
        message = new CommandMessage();
        inviteFriends = new CommandInviteFriends();
        commandSession = CommandSession.INSTANCE;
        invite = CommandInvite.INSTANCE;
        spsHostCommands = CollectionsKt.listOf((Object[])new Command[] { CommandOp.INSTANCE, CommandDeOp.INSTANCE, CommandKick.INSTANCE });
        Multithreading.runAsync(EssentialCommandRegistry::_init_$lambda-0);
    }
}
