package gg.essential.commands.engine;

import kotlin.*;
import gg.essential.api.commands.*;
import java.lang.reflect.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000(
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   H\u0016J\u001f\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   H\u0016¢\u0006\u0002\u0010\f¨\u0006""" }, d2 = { "Lgg/essential/commands/engine/BooleanArgumentParser;", "Lgg/essential/api/commands/ArgumentParser;", "", "()V", "complete", "", "", "arguments", "Lgg/essential/api/commands/ArgumentQueue;", "param", "Ljava/lang/reflect/Parameter;", "parse", "(Lgg/essential/api/commands/ArgumentQueue;Ljava/lang/reflect/Parameter;)Ljava/lang/Boolean;", "essential" })
public final class BooleanArgumentParser implements ArgumentParser<Boolean>
{
    public BooleanArgumentParser() {
        super();
    }
    
    @Nullable
    @Override
    public Boolean parse(@NotNull final ArgumentQueue arguments, @NotNull final Parameter param) {
        Intrinsics.checkNotNullParameter((Object)arguments, "arguments");
        Intrinsics.checkNotNullParameter((Object)param, "param");
        final String poll;
        final String it = poll = arguments.poll();
        return Intrinsics.areEqual((Object)poll, (Object)"true") ? Boolean.valueOf(true) : (Intrinsics.areEqual((Object)poll, (Object)"false") ? Boolean.valueOf(false) : null);
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
        //    18: astore_3        /* word */
        //    19: iconst_2       
        //    20: anewarray       Ljava/lang/String;
        //    23: astore          4
        //    25: aload           4
        //    27: iconst_0       
        //    28: ldc             "true"
        //    30: aastore        
        //    31: aload           4
        //    33: iconst_1       
        //    34: ldc             "false"
        //    36: aastore        
        //    37: aload           4
        //    39: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        //    42: checkcast       Ljava/lang/Iterable;
        //    45: astore          $this$filter$iv
        //    47: aload           $this$filter$iv
        //    49: astore          5
        //    51: new             Ljava/util/ArrayList;
        //    54: dup            
        //    55: invokespecial   java/util/ArrayList.<init>:()V
        //    58: checkcast       Ljava/util/Collection;
        //    61: astore          destination$iv$iv
        //    63: aload           $this$filterTo$iv$iv
        //    65: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    70: astore          7
        //    72: aload           7
        //    74: invokeinterface java/util/Iterator.hasNext:()Z
        //    79: ifeq            123
        //    82: aload           7
        //    84: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    89: astore          element$iv$iv
        //    91: aload           element$iv$iv
        //    93: checkcast       Ljava/lang/String;
        //    96: astore          it
        //    98: aload           it
        //   100: aload_3         /* word */
        //   101: iconst_0       
        //   102: iconst_2       
        //   103: aconst_null    
        //   104: invokestatic    kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   107: ifeq            72
        //   110: aload           destination$iv$iv
        //   112: aload           element$iv$iv
        //   114: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   119: pop            
        //   120: goto            72
        //   123: aload           destination$iv$iv
        //   125: checkcast       Ljava/util/List;
        //   128: areturn        
        //    Signature:
        //  (Lgg/essential/api/commands/ArgumentQueue;Ljava/lang/reflect/Parameter;)Ljava/util/List<Ljava/lang/String;>;
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  arguments  
        //  param      
        //    StackMapTable: 00 02 FF 00 48 00 08 00 00 00 07 00 41 00 00 07 00 54 07 00 5A 00 00 FF 00 32 00 07 00 00 00 00 00 00 07 00 54 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public /* bridge */ Object parse(final ArgumentQueue arguments, final Parameter param) {
        return this.parse(arguments, param);
    }
}
