package gg.essential.util;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.collections.*;
import kotlin.jvm.internal.*;
import org.apache.logging.log4j.*;
import kotlin.text.*;
import java.io.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0013\b\u0016\u0012
                                                   \u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004B)\u0012\u0006\u0010\u0002\u001a\u00020\u0005\u0012
                                                   \b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\u0010	J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010
                                                   \u001a\u00020\u000b¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010¨\u0006\u0011""" }, d2 = { "Lgg/essential/util/ForkedJvm;", "Ljava/io/Closeable;", "main", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "", "classpath", "jvmArgs", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "process", "Ljava/lang/Process;", "getProcess", "()Ljava/lang/Process;", "close", "", "Companion", "essential" })
public final class ForkedJvm implements Closeable
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Process process;
    private static final Logger LOGGER;
    
    public ForkedJvm(@NotNull final String main, @Nullable final String classpath, @NotNull final List<String> jvmArgs) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "main"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_3         /* jvmArgs */
        //     7: ldc             "jvmArgs"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   java/lang/Object.<init>:()V
        //    16: new             Ljava/util/ArrayList;
        //    19: dup            
        //    20: invokespecial   java/util/ArrayList.<init>:()V
        //    23: checkcast       Ljava/util/List;
        //    26: astore          cmd
        //    28: aload           cmd
        //    30: checkcast       Ljava/util/Collection;
        //    33: ldc             "java.home"
        //    35: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //    38: iconst_0       
        //    39: anewarray       Ljava/lang/String;
        //    42: invokestatic    java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        //    45: ldc             "bin"
        //    47: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //    52: ldc             "java"
        //    54: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //    59: invokeinterface java/nio/file/Path.toAbsolutePath:()Ljava/nio/file/Path;
        //    64: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    67: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    72: pop            
        //    73: aload           cmd
        //    75: aload_3         /* jvmArgs */
        //    76: checkcast       Ljava/util/Collection;
        //    79: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //    84: pop            
        //    85: aload           cmd
        //    87: checkcast       Ljava/util/Collection;
        //    90: ldc             "-cp"
        //    92: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    97: pop            
        //    98: aload           cmd
        //   100: checkcast       Ljava/util/Collection;
        //   103: aload_2         /* classpath */
        //   104: dup            
        //   105: ifnonnull       115
        //   108: pop            
        //   109: getstatic       gg/essential/util/ForkedJvm.Companion:Lgg/essential/util/ForkedJvm$Companion;
        //   112: invokevirtual   gg/essential/util/ForkedJvm$Companion.defaultClassPath:()Ljava/lang/String;
        //   115: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   120: pop            
        //   121: aload           cmd
        //   123: checkcast       Ljava/util/Collection;
        //   126: aload_1         /* main */
        //   127: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   132: pop            
        //   133: getstatic       gg/essential/util/ForkedJvm.LOGGER:Lorg/apache/logging/log4j/Logger;
        //   136: aload           cmd
        //   138: checkcast       Ljava/lang/Iterable;
        //   141: ldc             " "
        //   143: checkcast       Ljava/lang/CharSequence;
        //   146: aconst_null    
        //   147: aconst_null    
        //   148: iconst_0       
        //   149: aconst_null    
        //   150: aconst_null    
        //   151: bipush          62
        //   153: aconst_null    
        //   154: invokestatic    kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
        //   157: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   162: invokeinterface org/apache/logging/log4j/Logger.debug:(Ljava/lang/String;)V
        //   167: aload_0         /* this */
        //   168: new             Ljava/lang/ProcessBuilder;
        //   171: dup            
        //   172: aload           cmd
        //   174: invokespecial   java/lang/ProcessBuilder.<init>:(Ljava/util/List;)V
        //   177: astore          5
        //   179: aload           5
        //   181: astore          6
        //   183: astore          7
        //   185: aload           $this$_init__u24lambda_u2d0
        //   187: getstatic       java/lang/ProcessBuilder$Redirect.PIPE:Ljava/lang/ProcessBuilder$Redirect;
        //   190: invokevirtual   java/lang/ProcessBuilder.redirectError:(Ljava/lang/ProcessBuilder$Redirect;)Ljava/lang/ProcessBuilder;
        //   193: pop            
        //   194: aload           $this$_init__u24lambda_u2d0
        //   196: getstatic       java/lang/ProcessBuilder$Redirect.PIPE:Ljava/lang/ProcessBuilder$Redirect;
        //   199: invokevirtual   java/lang/ProcessBuilder.redirectOutput:(Ljava/lang/ProcessBuilder$Redirect;)Ljava/lang/ProcessBuilder;
        //   202: pop            
        //   203: aload           $this$_init__u24lambda_u2d0
        //   205: getstatic       java/lang/ProcessBuilder$Redirect.PIPE:Ljava/lang/ProcessBuilder$Redirect;
        //   208: invokevirtual   java/lang/ProcessBuilder.redirectInput:(Ljava/lang/ProcessBuilder$Redirect;)Ljava/lang/ProcessBuilder;
        //   211: pop            
        //   212: aload           7
        //   214: aload           5
        //   216: invokevirtual   java/lang/ProcessBuilder.start:()Ljava/lang/Process;
        //   219: dup            
        //   220: ldc             "ProcessBuilder(cmd).appl\u2026t.PIPE)\n        }.start()"
        //   222: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   225: putfield        gg/essential/util/ForkedJvm.process:Ljava/lang/Process;
        //   228: invokestatic    gg/essential/api/utils/Multithreading.getScheduledPool:()Ljava/util/concurrent/ScheduledExecutorService;
        //   231: aload_1         /* main */
        //   232: aload_0         /* this */
        //   233: invokedynamic   BootstrapMethod #1, run:(Ljava/lang/String;Lgg/essential/util/ForkedJvm;)Ljava/lang/Runnable;
        //   238: invokeinterface java/util/concurrent/ScheduledExecutorService.execute:(Ljava/lang/Runnable;)V
        //   243: return         
        //    Signature:
        //  (Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;)V
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  main       
        //  classpath  
        //  jvmArgs    
        //    StackMapTable: 00 01 FF 00 73 00 05 07 00 02 07 00 47 00 00 07 00 3B 00 02 07 00 3D 07 00 47
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public ForkedJvm(final String main) {
        this(main, null, CollectionsKt.emptyList());
    }
    
    @NotNull
    public final Process getProcess() {
        return this.process;
    }
    
    public ForkedJvm(@NotNull final Class<?> main) {
        Intrinsics.checkNotNullParameter((Object)main, "main");
        final String name = main.getName();
        Intrinsics.checkNotNullExpressionValue((Object)name, "main.name");
        this(name);
    }
    
    @Override
    public void close() {
        this.process.destroy();
    }
    
    private static final void _init_$lambda-1(final String $main, final ForkedJvm this$0) {
        Intrinsics.checkNotNullParameter((Object)$main, "$main");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        final Logger logger = LogManager.getLogger($main);
        final InputStream errorStream = this$0.process.getErrorStream();
        Intrinsics.checkNotNullExpressionValue((Object)errorStream, "process.errorStream");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        while (this$0.process.isAlive()) {
            final String line2 = reader.readLine();
            if (line2 == null) {
                break;
            }
            final String line = line2;
            if (StringsKt.startsWith$default(line, "[DEBUG] ", false, 2, (Object)null)) {
                final Logger logger2 = logger;
                final String substring = line.substring("[DEBUG] ".length());
                Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String).substring(startIndex)");
                logger2.debug(substring);
            }
            else {
                logger.error(line);
            }
        }
    }
    
    static {
        Companion = new Companion((byte)0);
        LOGGER = LogManager.getLogger((Class)ForkedJvm.class);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001a
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a
                                                        \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\b""" }, d2 = { "Lgg/essential/util/ForkedJvm$Companion;", "", "()V", "LOGGER", "Lorg/apache/logging/log4j/Logger;", "kotlin.jvm.PlatformType", "defaultClassPath", "", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final String defaultClassPath() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     2: anewarray       Ljava/lang/Class;
            //     5: astore_1       
            //     6: aload_1        
            //     7: iconst_0       
            //     8: ldc             Lgg/essential/util/ForkedJvm;.class
            //    10: aastore        
            //    11: aload_1        
            //    12: iconst_1       
            //    13: ldc             Lkotlin/Unit;.class
            //    15: aastore        
            //    16: aload_1        
            //    17: iconst_2       
            //    18: ldc             "kotlin.io.path.PathsKt"
            //    20: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
            //    23: aastore        
            //    24: aload_1        
            //    25: iconst_3       
            //    26: ldc             "kotlin.collections.jdk8.CollectionsJDK8Kt"
            //    28: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
            //    31: aastore        
            //    32: aload_1        
            //    33: iconst_4       
            //    34: ldc             Lkotlin/reflect/full/IllegalCallableAccessException;.class
            //    36: aastore        
            //    37: aload_1        
            //    38: iconst_5       
            //    39: ldc             Lkotlin/coroutines/CoroutineContext;.class
            //    41: aastore        
            //    42: aload_1        
            //    43: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
            //    46: checkcast       Ljava/lang/Iterable;
            //    49: astore_1        /* $this$map$iv */
            //    50: aload_1         /* $this$map$iv */
            //    51: astore_3       
            //    52: new             Ljava/util/ArrayList;
            //    55: dup            
            //    56: aload_1         /* $this$map$iv */
            //    57: bipush          10
            //    59: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
            //    62: invokespecial   java/util/ArrayList.<init>:(I)V
            //    65: checkcast       Ljava/util/Collection;
            //    68: astore          destination$iv$iv
            //    70: aload_3         /* $this$mapTo$iv$iv */
            //    71: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
            //    76: astore          5
            //    78: aload           5
            //    80: invokeinterface java/util/Iterator.hasNext:()Z
            //    85: ifeq            152
            //    88: aload           5
            //    90: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //    95: astore          item$iv$iv
            //    97: aload           destination$iv$iv
            //    99: aload           item$iv$iv
            //   101: checkcast       Ljava/lang/Class;
            //   104: astore          7
            //   106: astore          13
            //   108: aload           cls
            //   110: ldc             "cls"
            //   112: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
            //   115: aload           cls
            //   117: invokestatic    gg/essential/util/HelpersKt.findCodeSource:(Ljava/lang/Class;)Lgg/essential/util/CodeSource;
            //   120: dup            
            //   121: ifnonnull       140
            //   124: pop            
            //   125: new             Ljava/lang/UnsupportedOperationException;
            //   128: dup            
            //   129: aload           cls
            //   131: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/Class;)Ljava/lang/String;
            //   136: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
            //   139: athrow         
            //   140: aload           13
            //   142: swap           
            //   143: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
            //   148: pop            
            //   149: goto            78
            //   152: aload           destination$iv$iv
            //   154: checkcast       Ljava/util/List;
            //   157: astore_1        /* $this$map$iv */
            //   158: aload_1        
            //   159: astore_2        /* it */
            //   160: aload_2         /* it */
            //   161: invokestatic    kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
            //   164: instanceof      Lgg/essential/util/CodeSource$Directory;
            //   167: ifeq            182
            //   170: ldc             "java.class.path"
            //   172: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
            //   175: dup            
            //   176: ldc             "getProperty(\"java.class.path\")"
            //   178: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
            //   181: areturn        
            //   182: aload_1        
            //   183: checkcast       Ljava/lang/Iterable;
            //   186: astore_1        /* $this$mapNotNull$iv */
            //   187: aload_1         /* $this$mapNotNull$iv */
            //   188: astore_3       
            //   189: new             Ljava/util/ArrayList;
            //   192: dup            
            //   193: invokespecial   java/util/ArrayList.<init>:()V
            //   196: checkcast       Ljava/util/Collection;
            //   199: astore          destination$iv$iv
            //   201: aload_3         /* $this$mapNotNullTo$iv$iv */
            //   202: astore          $this$forEach$iv$iv$iv
            //   204: aload           $this$forEach$iv$iv$iv
            //   206: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
            //   211: astore          7
            //   213: aload           7
            //   215: invokeinterface java/util/Iterator.hasNext:()Z
            //   220: ifeq            317
            //   223: aload           7
            //   225: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //   230: astore          element$iv$iv$iv
            //   232: aload           element$iv$iv$iv
            //   234: astore          element$iv$iv
            //   236: aload           element$iv$iv
            //   238: checkcast       Lgg/essential/util/CodeSource;
            //   241: astore          it
            //   243: aload           it
            //   245: astore          11
            //   247: aload           11
            //   249: instanceof      Lgg/essential/util/CodeSource$Jar;
            //   252: ifeq            274
            //   255: aload           it
            //   257: checkcast       Lgg/essential/util/CodeSource$Jar;
            //   260: invokevirtual   gg/essential/util/CodeSource$Jar.getPath:()Ljava/nio/file/Path;
            //   263: invokeinterface java/nio/file/Path.toAbsolutePath:()Ljava/nio/file/Path;
            //   268: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
            //   271: goto            294
            //   274: aload           11
            //   276: instanceof      Lgg/essential/util/CodeSource$Directory;
            //   279: ifeq            286
            //   282: aconst_null    
            //   283: goto            294
            //   286: new             Lkotlin/NoWhenBranchMatchedException;
            //   289: dup            
            //   290: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
            //   293: athrow         
            //   294: dup            
            //   295: ifnull          313
            //   298: astore          it$iv$iv
            //   300: aload           destination$iv$iv
            //   302: aload           it$iv$iv
            //   304: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
            //   309: pop            
            //   310: goto            213
            //   313: pop            
            //   314: goto            213
            //   317: aload           destination$iv$iv
            //   319: checkcast       Ljava/util/List;
            //   322: checkcast       Ljava/lang/Iterable;
            //   325: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
            //   328: checkcast       Ljava/lang/Iterable;
            //   331: ldc             "path.separator"
            //   333: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
            //   336: dup            
            //   337: ldc             "getProperty(\"path.separator\")"
            //   339: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
            //   342: checkcast       Ljava/lang/CharSequence;
            //   345: aconst_null    
            //   346: aconst_null    
            //   347: iconst_0       
            //   348: aconst_null    
            //   349: aconst_null    
            //   350: bipush          62
            //   352: aconst_null    
            //   353: invokestatic    kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
            //   356: areturn        
            //    StackMapTable: 00 0A FF 00 4E 00 06 00 00 00 00 07 00 44 07 00 4A 00 00 FF 00 3D 00 0E 00 00 00 00 07 00 44 07 00 4A 00 00 00 00 00 00 00 07 00 44 00 01 07 00 73 FF 00 0B 00 05 00 00 00 00 07 00 44 00 00 FF 00 1D 00 02 00 07 00 79 00 00 FF 00 1E 00 08 00 00 00 00 07 00 44 00 00 07 00 4A 00 00 FF 00 3C 00 0C 00 00 00 00 07 00 44 00 00 07 00 4A 00 00 00 07 00 73 00 00 FF 00 0B 00 00 00 00 FF 00 07 00 08 00 00 00 00 07 00 44 00 00 07 00 4A 00 01 07 00 9D 52 07 00 9D F8 00 03
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
