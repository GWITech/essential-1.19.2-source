package gg.essential.api.commands;

import java.lang.reflect.*;
import kotlin.*;
import java.util.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.*;
import gg.essential.api.utils.*;

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
