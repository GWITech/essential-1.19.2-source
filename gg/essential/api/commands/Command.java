package gg.essential.api.commands;

import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.*;
import gg.essential.api.*;
import kotlin.jvm.internal.*;
import java.lang.reflect.*;
import kotlin.*;
import kotlin.reflect.*;
import java.util.concurrent.*;
import gg.essential.api.utils.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000L
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0010"
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010%
                                                   \u0002\b\u0003
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002#$B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010!\u001a\u00020"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010	R\u001c\u0010
                                                   \u001a
                                                   \u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0013\u0010	R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010\u0012\f\u0012
                                                    \u001e*\u0004\u0018\u00010\u001d0\u001d0\u001c0\u001b¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001f\u0010 ¨\u0006%""" }, d2 = { "Lgg/essential/api/commands/Command;", "", "name", "", "autoHelpSubcommand", "", "hideFromAutocomplete", "(Ljava/lang/String;ZZ)V", "getAutoHelpSubcommand", "()Z", "commandAliases", "", "Lgg/essential/api/commands/Command$Alias;", "getCommandAliases", "()Ljava/util/Set;", "defaultHandler", "Lgg/essential/api/commands/Command$Handler;", "getDefaultHandler", "()Lgg/essential/api/commands/Command$Handler;", "getHideFromAutocomplete", "getName", "()Ljava/lang/String;", "subCommands", "", "getSubCommands", "()Ljava/util/Map;", "uniqueSubCommands", "", "Lkotlin/Pair;", "Lgg/essential/api/commands/SubCommand;", "kotlin.jvm.PlatformType", "getUniqueSubCommands", "()Ljava/util/List;", "register", "", "Alias", "Handler", "essential-api" })
public abstract class Command
{
    @NotNull
    private final String name;
    private final boolean autoHelpSubcommand;
    private final boolean hideFromAutocomplete;
    @Nullable
    private final Set<Alias> commandAliases;
    @Nullable
    private final Handler defaultHandler;
    @NotNull
    private final List<Pair<Handler, SubCommand>> uniqueSubCommands;
    @NotNull
    private final Map<String, Handler> subCommands;
    
    @JvmOverloads
    public Command(@NotNull final String name, final boolean autoHelpSubcommand, final boolean hideFromAutocomplete) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "name"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0         /* this */
        //    11: aload_1         /* name */
        //    12: putfield        gg/essential/api/commands/Command.name:Ljava/lang/String;
        //    15: aload_0         /* this */
        //    16: iload_2         /* autoHelpSubcommand */
        //    17: putfield        gg/essential/api/commands/Command.autoHelpSubcommand:Z
        //    20: aload_0         /* this */
        //    21: iload_3         /* hideFromAutocomplete */
        //    22: putfield        gg/essential/api/commands/Command.hideFromAutocomplete:Z
        //    25: aload_0         /* this */
        //    26: invokestatic    kotlin/collections/SetsKt.emptySet:()Ljava/util/Set;
        //    29: putfield        gg/essential/api/commands/Command.commandAliases:Ljava/util/Set;
        //    32: aload_0         /* this */
        //    33: aload_0         /* this */
        //    34: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    37: getstatic       gg/essential/api/commands/Command$defaultHandler$1.INSTANCE:Lgg/essential/api/commands/Command$defaultHandler$1;
        //    40: checkcast       Lkotlin/jvm/functions/Function1;
        //    43: invokestatic    kotlin/sequences/SequencesKt.generateSequence:(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
        //    46: getstatic       gg/essential/api/commands/Command$defaultHandler$2.INSTANCE:Lgg/essential/api/commands/Command$defaultHandler$2;
        //    49: checkcast       Lkotlin/jvm/functions/Function1;
        //    52: invokestatic    kotlin/sequences/SequencesKt.flatMapIterable:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
        //    55: astore          5
        //    57: astore          23
        //    59: aload           5
        //    61: astore          6
        //    63: aload           6
        //    65: invokeinterface kotlin/sequences/Sequence.iterator:()Ljava/util/Iterator;
        //    70: astore          7
        //    72: aload           7
        //    74: invokeinterface java/util/Iterator.hasNext:()Z
        //    79: ifeq            113
        //    82: aload           7
        //    84: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    89: astore          8
        //    91: aload           8
        //    93: checkcast       Ljava/lang/reflect/Method;
        //    96: astore          it
        //    98: aload           it
        //   100: ldc             Lgg/essential/api/commands/DefaultHandler;.class
        //   102: invokevirtual   java/lang/reflect/Method.isAnnotationPresent:(Ljava/lang/Class;)Z
        //   105: ifeq            72
        //   108: aload           8
        //   110: goto            114
        //   113: aconst_null    
        //   114: aload           23
        //   116: swap           
        //   117: checkcast       Ljava/lang/reflect/Method;
        //   120: dup            
        //   121: ifnull          143
        //   124: astore          6
        //   126: astore          23
        //   128: new             Lgg/essential/api/commands/Command$Handler;
        //   131: dup            
        //   132: aload           p0
        //   134: invokespecial   gg/essential/api/commands/Command$Handler.<init>:(Ljava/lang/reflect/Method;)V
        //   137: aload           23
        //   139: swap           
        //   140: goto            145
        //   143: pop            
        //   144: aconst_null    
        //   145: putfield        gg/essential/api/commands/Command.defaultHandler:Lgg/essential/api/commands/Command$Handler;
        //   148: aload_0         /* this */
        //   149: aload_0         /* this */
        //   150: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   153: invokevirtual   java/lang/Class.getDeclaredMethods:()[Ljava/lang/reflect/Method;
        //   156: dup            
        //   157: ldc             "this::class.java.declaredMethods"
        //   159: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   162: checkcast       [Ljava/lang/Object;
        //   165: astore          4
        //   167: astore          23
        //   169: aload           $this$filter$iv
        //   171: astore          6
        //   173: new             Ljava/util/ArrayList;
        //   176: dup            
        //   177: invokespecial   java/util/ArrayList.<init>:()V
        //   180: checkcast       Ljava/util/Collection;
        //   183: astore          destination$iv$iv
        //   185: iconst_0       
        //   186: istore          9
        //   188: aload           $this$filterTo$iv$iv
        //   190: arraylength    
        //   191: istore          10
        //   193: iload           9
        //   195: iload           10
        //   197: if_icmpge       240
        //   200: aload           $this$filterTo$iv$iv
        //   202: iload           9
        //   204: aaload         
        //   205: astore          element$iv$iv
        //   207: aload           element$iv$iv
        //   209: checkcast       Ljava/lang/reflect/Method;
        //   212: astore          it
        //   214: aload           it
        //   216: ldc             Lgg/essential/api/commands/SubCommand;.class
        //   218: invokevirtual   java/lang/reflect/Method.isAnnotationPresent:(Ljava/lang/Class;)Z
        //   221: ifeq            234
        //   224: aload           destination$iv$iv
        //   226: aload           element$iv$iv
        //   228: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   233: pop            
        //   234: iinc            9, 1
        //   237: goto            193
        //   240: aload           destination$iv$iv
        //   242: checkcast       Ljava/util/List;
        //   245: aload           23
        //   247: swap           
        //   248: checkcast       Ljava/lang/Iterable;
        //   251: astore          4
        //   253: astore          23
        //   255: aload           $this$map$iv
        //   257: astore          6
        //   259: new             Ljava/util/ArrayList;
        //   262: dup            
        //   263: aload           $this$map$iv
        //   265: bipush          10
        //   267: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   270: invokespecial   java/util/ArrayList.<init>:(I)V
        //   273: checkcast       Ljava/util/Collection;
        //   276: astore          destination$iv$iv
        //   278: aload           $this$mapTo$iv$iv
        //   280: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   285: astore          9
        //   287: aload           9
        //   289: invokeinterface java/util/Iterator.hasNext:()Z
        //   294: ifeq            355
        //   297: aload           9
        //   299: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   304: astore          item$iv$iv
        //   306: aload           destination$iv$iv
        //   308: aload           item$iv$iv
        //   310: checkcast       Ljava/lang/reflect/Method;
        //   313: astore          11
        //   315: astore          24
        //   317: new             Lgg/essential/api/commands/Command$Handler;
        //   320: dup            
        //   321: aload           it
        //   323: ldc             "it"
        //   325: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   328: aload           it
        //   330: invokespecial   gg/essential/api/commands/Command$Handler.<init>:(Ljava/lang/reflect/Method;)V
        //   333: aload           it
        //   335: ldc             Lgg/essential/api/commands/SubCommand;.class
        //   337: invokevirtual   java/lang/reflect/Method.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //   340: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   343: aload           24
        //   345: swap           
        //   346: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   351: pop            
        //   352: goto            287
        //   355: aload           destination$iv$iv
        //   357: checkcast       Ljava/util/List;
        //   360: aload           23
        //   362: swap           
        //   363: putfield        gg/essential/api/commands/Command.uniqueSubCommands:Ljava/util/List;
        //   366: aload_0         /* this */
        //   367: aload_0         /* this */
        //   368: getfield        gg/essential/api/commands/Command.uniqueSubCommands:Ljava/util/List;
        //   371: astore          5
        //   373: astore          23
        //   375: new             Ljava/util/LinkedHashMap;
        //   378: dup            
        //   379: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   382: checkcast       Ljava/util/Map;
        //   385: astore          map
        //   387: aload           list
        //   389: checkcast       Ljava/lang/Iterable;
        //   392: astore          $this$forEach$iv
        //   394: aload           $this$forEach$iv
        //   396: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   401: astore          10
        //   403: aload           10
        //   405: invokeinterface java/util/Iterator.hasNext:()Z
        //   410: ifeq            584
        //   413: aload           10
        //   415: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   420: astore          element$iv
        //   422: aload           element$iv
        //   424: checkcast       Lkotlin/Pair;
        //   427: astore          12
        //   429: aload           12
        //   431: invokevirtual   kotlin/Pair.component1:()Ljava/lang/Object;
        //   434: checkcast       Lgg/essential/api/commands/Command$Handler;
        //   437: astore          handler
        //   439: aload           12
        //   441: invokevirtual   kotlin/Pair.component2:()Ljava/lang/Object;
        //   444: checkcast       Lgg/essential/api/commands/SubCommand;
        //   447: astore          ann
        //   449: aload           map
        //   451: astore          15
        //   453: aload           ann
        //   455: invokeinterface gg/essential/api/commands/SubCommand.value:()Ljava/lang/String;
        //   460: astore          16
        //   462: getstatic       java/util/Locale.ENGLISH:Ljava/util/Locale;
        //   465: dup            
        //   466: ldc             "ENGLISH"
        //   468: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   471: aload           16
        //   473: swap           
        //   474: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   477: dup            
        //   478: ldc             "this as java.lang.String).toLowerCase(locale)"
        //   480: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   483: astore          16
        //   485: aload           15
        //   487: aload           16
        //   489: aload           handler
        //   491: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   496: pop            
        //   497: aload           ann
        //   499: invokeinterface gg/essential/api/commands/SubCommand.aliases:()[Ljava/lang/String;
        //   504: astore          $this$forEach$iv
        //   506: iconst_0       
        //   507: istore          17
        //   509: aload           $this$forEach$iv
        //   511: arraylength    
        //   512: istore          18
        //   514: iload           17
        //   516: iload           18
        //   518: if_icmpge       581
        //   521: aload           $this$forEach$iv
        //   523: iload           17
        //   525: aaload         
        //   526: astore          element$iv
        //   528: aload           element$iv
        //   530: astore          alias
        //   532: aload           map
        //   534: astore          21
        //   536: aload           alias
        //   538: astore          22
        //   540: getstatic       java/util/Locale.ENGLISH:Ljava/util/Locale;
        //   543: dup            
        //   544: ldc             "ENGLISH"
        //   546: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   549: aload           22
        //   551: swap           
        //   552: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   555: dup            
        //   556: ldc             "this as java.lang.String).toLowerCase(locale)"
        //   558: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   561: astore          22
        //   563: aload           21
        //   565: aload           22
        //   567: aload           handler
        //   569: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   574: pop            
        //   575: iinc            17, 1
        //   578: goto            514
        //   581: goto            403
        //   584: aload           map
        //   586: aload           23
        //   588: swap           
        //   589: putfield        gg/essential/api/commands/Command.subCommands:Ljava/util/Map;
        //   592: return         
        //    MethodParameters:
        //  Name                  Flags  
        //  --------------------  -----
        //  name                  
        //  autoHelpSubcommand    
        //  hideFromAutocomplete  
        //    StackMapTable: 00 0E FF 00 48 00 18 07 00 02 00 00 00 00 00 00 07 00 7A 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 28 00 18 07 00 02 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 40 07 00 04 FF 00 1C 00 01 07 00 02 00 02 07 00 02 07 00 83 FF 00 01 00 01 07 00 02 00 02 07 00 02 07 00 34 FF 00 2F 00 18 07 00 02 00 00 00 00 00 07 00 9B 07 00 A0 00 01 01 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 28 FF 00 05 00 18 07 00 02 00 00 00 00 00 00 07 00 A0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 2E 00 18 07 00 02 00 00 00 00 00 00 07 00 A0 00 07 00 7A 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 43 00 18 07 00 02 00 00 00 00 00 00 07 00 A0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 2F 00 18 00 00 00 00 00 00 00 07 00 C7 00 00 07 00 7A 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 6E 00 18 00 00 00 00 00 00 00 07 00 C7 00 00 07 00 7A 00 00 07 00 34 00 07 00 EB 00 01 01 00 00 00 00 07 00 02 00 00 FF 00 42 00 18 00 00 00 00 00 00 00 07 00 C7 00 00 07 00 7A 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 02 00 18 00 00 00 00 00 00 00 07 00 C7 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public Command(final String name, boolean autoHelpSubcommand, boolean hideFromAutocomplete, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            autoHelpSubcommand = true;
        }
        if ((n & 0x4) != 0x0) {
            hideFromAutocomplete = false;
        }
        this(name, autoHelpSubcommand, hideFromAutocomplete);
    }
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    public final boolean getAutoHelpSubcommand() {
        return this.autoHelpSubcommand;
    }
    
    public final boolean getHideFromAutocomplete() {
        return this.hideFromAutocomplete;
    }
    
    @Nullable
    public Set<Alias> getCommandAliases() {
        return this.commandAliases;
    }
    
    @Nullable
    public final Handler getDefaultHandler() {
        return this.defaultHandler;
    }
    
    @NotNull
    public final List<Pair<Handler, SubCommand>> getUniqueSubCommands() {
        return this.uniqueSubCommands;
    }
    
    @NotNull
    public final Map<String, Handler> getSubCommands() {
        return this.subCommands;
    }
    
    public final void register() {
        EssentialAPI.Companion.getCommandRegistry().registerCommand(this);
    }
    
    @JvmOverloads
    public Command(@NotNull final String name, final boolean autoHelpSubcommand) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        this(name, autoHelpSubcommand, false, 4, null);
    }
    
    @JvmOverloads
    public Command(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        this(name, false, false, 6, null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000 
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u000b
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J	\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J	\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J	\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                       \u0000\u001a\u0004\b	\u0010
                                                       ¨\u0006\u0013""" }, d2 = { "Lgg/essential/api/commands/Command$Alias;", "", "alias", "", "hideFromAutocomplete", "", "(Ljava/lang/String;Z)V", "getAlias", "()Ljava/lang/String;", "getHideFromAutocomplete", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "essential-api" })
    public static final class Alias
    {
        @NotNull
        private final String alias;
        private final boolean hideFromAutocomplete;
        
        @JvmOverloads
        public Alias(@NotNull final String alias, final boolean hideFromAutocomplete) {
            Intrinsics.checkNotNullParameter((Object)alias, "alias");
            super();
            this.alias = alias;
            this.hideFromAutocomplete = hideFromAutocomplete;
        }
        
        public Alias(final String alias, boolean hideFromAutocomplete, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
            if ((n & 0x2) != 0x0) {
                hideFromAutocomplete = false;
            }
            this(alias, hideFromAutocomplete);
        }
        
        @NotNull
        public final String getAlias() {
            return this.alias;
        }
        
        public final boolean getHideFromAutocomplete() {
            return this.hideFromAutocomplete;
        }
        
        @NotNull
        public final String component1() {
            return this.alias;
        }
        
        public final boolean component2() {
            return this.hideFromAutocomplete;
        }
        
        @NotNull
        public final Alias copy(@NotNull final String alias, final boolean hideFromAutocomplete) {
            Intrinsics.checkNotNullParameter((Object)alias, "alias");
            return new Alias(alias, hideFromAutocomplete);
        }
        
        public static /* synthetic */ Alias copy$default(final Alias alias, String alias2, boolean hideFromAutocomplete, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                alias2 = alias.alias;
            }
            if ((n & 0x2) != 0x0) {
                hideFromAutocomplete = alias.hideFromAutocomplete;
            }
            return alias.copy(alias2, hideFromAutocomplete);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Alias(alias=" + this.alias + ", hideFromAutocomplete=" + this.hideFromAutocomplete;
        }
        
        @Override
        public int hashCode() {
            int result = this.alias.hashCode();
            final int n = result * 31;
            int hideFromAutocomplete;
            if ((hideFromAutocomplete = (this.hideFromAutocomplete ? 1 : 0)) != 0) {
                hideFromAutocomplete = 1;
            }
            result = n + hideFromAutocomplete;
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Alias)) {
                return false;
            }
            final Alias alias = (Alias)other;
            return Intrinsics.areEqual((Object)this.alias, (Object)alias.alias) && this.hideFromAutocomplete == alias.hideFromAutocomplete;
        }
        
        @JvmOverloads
        public Alias(@NotNull final String alias) {
            Intrinsics.checkNotNullParameter((Object)alias, "alias");
            this(alias, false, 2, null);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000*
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010 
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0007
                                                       \u0002\u0010\u0011
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R#\u0010\u0005\u001a
                                                       \u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f
                                                       \u0004\b
                                                       \u0010\u000b\u001a\u0004\b\b\u0010	R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006
                                                       
                                                       \u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015""" }, d2 = { "Lgg/essential/api/commands/Command$Handler;", "", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "kParams", "", "Lkotlin/reflect/KParameter;", "getKParams", "()Ljava/util/List;", "kParams$delegate", "Lkotlin/Lazy;", "getMethod", "()Ljava/lang/reflect/Method;", "params", "", "Ljava/lang/reflect/Parameter;", "getParams", "()[Ljava/lang/reflect/Parameter;", "[Ljava/lang/reflect/Parameter;", "Companion", "essential-api" })
    public static final class Handler
    {
        @NotNull
        private static final Companion Companion;
        @NotNull
        private final Method method;
        @NotNull
        private final Parameter[] params;
        @NotNull
        private final Lazy kParams$delegate;
        @Deprecated
        @NotNull
        private static final SerialExecutor cacheCooker;
        
        public Handler(@NotNull final Method method) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "method"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_0         /* this */
            //     7: invokespecial   java/lang/Object.<init>:()V
            //    10: aload_0         /* this */
            //    11: aload_1         /* method */
            //    12: putfield        gg/essential/api/commands/Command$Handler.method:Ljava/lang/reflect/Method;
            //    15: aload_0         /* this */
            //    16: aload_0         /* this */
            //    17: getfield        gg/essential/api/commands/Command$Handler.method:Ljava/lang/reflect/Method;
            //    20: invokevirtual   java/lang/reflect/Method.getParameters:()[Ljava/lang/reflect/Parameter;
            //    23: dup            
            //    24: ldc             "method.parameters"
            //    26: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
            //    29: checkcast       [Ljava/lang/Object;
            //    32: astore_2       
            //    33: astore          10
            //    35: aload_2         /* $this$filter$iv */
            //    36: astore          4
            //    38: new             Ljava/util/ArrayList;
            //    41: dup            
            //    42: invokespecial   java/util/ArrayList.<init>:()V
            //    45: checkcast       Ljava/util/Collection;
            //    48: astore          destination$iv$iv
            //    50: iconst_0       
            //    51: istore          6
            //    53: aload           $this$filterTo$iv$iv
            //    55: arraylength    
            //    56: istore          7
            //    58: iload           6
            //    60: iload           7
            //    62: if_icmpge       116
            //    65: aload           $this$filterTo$iv$iv
            //    67: iload           6
            //    69: aaload         
            //    70: astore          element$iv$iv
            //    72: aload           element$iv$iv
            //    74: checkcast       Ljava/lang/reflect/Parameter;
            //    77: astore          it
            //    79: aload           it
            //    81: invokevirtual   java/lang/reflect/Parameter.getType:()Ljava/lang/Class;
            //    84: ldc             Lkotlin/coroutines/Continuation;.class
            //    86: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //    89: ifne            96
            //    92: iconst_1       
            //    93: goto            97
            //    96: iconst_0       
            //    97: ifeq            110
            //   100: aload           destination$iv$iv
            //   102: aload           element$iv$iv
            //   104: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
            //   109: pop            
            //   110: iinc            6, 1
            //   113: goto            58
            //   116: aload           destination$iv$iv
            //   118: checkcast       Ljava/util/List;
            //   121: aload           10
            //   123: swap           
            //   124: checkcast       Ljava/util/Collection;
            //   127: astore_2        /* $this$toTypedArray$iv */
            //   128: aload_2         /* $this$toTypedArray$iv */
            //   129: astore          thisCollection$iv
            //   131: aload           thisCollection$iv
            //   133: iconst_0       
            //   134: anewarray       Ljava/lang/reflect/Parameter;
            //   137: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
            //   142: dup            
            //   143: ldc             "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            //   145: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
            //   148: checkcast       [Ljava/lang/reflect/Parameter;
            //   151: putfield        gg/essential/api/commands/Command$Handler.params:[Ljava/lang/reflect/Parameter;
            //   154: aload_0         /* this */
            //   155: new             Lgg/essential/api/commands/Command$Handler$kParams$2;
            //   158: dup            
            //   159: aload_0         /* this */
            //   160: invokespecial   gg/essential/api/commands/Command$Handler$kParams$2.<init>:(Lgg/essential/api/commands/Command$Handler;)V
            //   163: checkcast       Lkotlin/jvm/functions/Function0;
            //   166: invokestatic    kotlin/LazyKt.lazy:(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
            //   169: astore_2       
            //   170: aload_2        
            //   171: astore_3       
            //   172: astore          10
            //   174: getstatic       gg/essential/api/commands/Command$Handler.cacheCooker:Lgg/essential/api/utils/SerialExecutor;
            //   177: aload_3         /* it */
            //   178: invokedynamic   BootstrapMethod #0, run:(Lkotlin/Lazy;)Ljava/lang/Runnable;
            //   183: invokevirtual   gg/essential/api/utils/SerialExecutor.execute:(Ljava/lang/Runnable;)V
            //   186: aload           10
            //   188: aload_2        
            //   189: putfield        gg/essential/api/commands/Command$Handler.kParams$delegate:Lkotlin/Lazy;
            //   192: return         
            //    MethodParameters:
            //  Name    Flags  
            //  ------  -----
            //  method  
            //    StackMapTable: 00 05 FF 00 3A 00 0B 07 00 02 00 00 00 07 00 49 07 00 4E 01 01 00 00 07 00 02 00 00 FF 00 25 00 0B 07 00 02 00 00 00 07 00 49 07 00 4E 01 01 07 00 04 00 07 00 02 00 00 40 01 FF 00 0C 00 0B 07 00 02 00 00 00 07 00 49 07 00 4E 01 01 00 00 07 00 02 00 00 FF 00 05 00 0B 07 00 02 00 00 00 00 07 00 4E 00 00 00 00 07 00 02 00 00
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @NotNull
        public final Method getMethod() {
            return this.method;
        }
        
        @NotNull
        public final Parameter[] getParams() {
            return this.params;
        }
        
        @Nullable
        public final List<KParameter> getKParams() {
            return (List)this.kParams$delegate.getValue();
        }
        
        private static final void kParams_delegate$lambda-2$lambda-1(final Lazy $it) {
            Intrinsics.checkNotNullParameter((Object)$it, "$it");
            $it.getValue();
        }
        
        static {
            Companion = new Companion(null);
            cacheCooker = new SerialExecutor(Multithreading.getScheduledPool());
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000\u0012
                                                           \u0002\u0018\u0002
                                                           \u0002\u0010\u0000
                                                           \u0002\b\u0002
                                                           \u0002\u0018\u0002
                                                           \u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                           \u0000¨\u0006\u0005""" }, d2 = { "Lgg/essential/api/commands/Command$Handler$Companion;", "", "()V", "cacheCooker", "Lgg/essential/api/utils/SerialExecutor;", "essential-api" })
        private static final class Companion
        {
            private Companion() {
                super();
            }
            
            public Companion(final DefaultConstructorMarker $constructor_marker) {
                this();
            }
        }
    }
}
