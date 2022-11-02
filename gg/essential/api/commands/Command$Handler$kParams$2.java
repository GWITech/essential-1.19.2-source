package gg.essential.api.commands;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.util.*;
import kotlin.reflect.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a
                                                   \u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lkotlin/reflect/KParameter;", "invoke" })
static final class Command$Handler$kParams$2 extends Lambda implements Function0<List<? extends KParameter>> {
    final /* synthetic */ Command.Handler this$0;
    
    Command$Handler$kParams$2(final Command.Handler $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    @Nullable
    public final List<KParameter> invoke() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/api/commands/Command$Handler$kParams$2.this$0:Lgg/essential/api/commands/Command$Handler;
        //     4: invokevirtual   gg/essential/api/commands/Command$Handler.getMethod:()Ljava/lang/reflect/Method;
        //     7: invokestatic    kotlin/reflect/jvm/ReflectJvmMapping.getKotlinFunction:(Ljava/lang/reflect/Method;)Lkotlin/reflect/KFunction;
        //    10: dup            
        //    11: ifnull          114
        //    14: invokeinterface kotlin/reflect/KFunction.getParameters:()Ljava/util/List;
        //    19: dup            
        //    20: ifnull          114
        //    23: checkcast       Ljava/lang/Iterable;
        //    26: astore_1        /* $this$filter$iv */
        //    27: aload_1         /* $this$filter$iv */
        //    28: astore_2       
        //    29: new             Ljava/util/ArrayList;
        //    32: dup            
        //    33: invokespecial   java/util/ArrayList.<init>:()V
        //    36: checkcast       Ljava/util/Collection;
        //    39: astore_3        /* destination$iv$iv */
        //    40: aload_2         /* $this$filterTo$iv$iv */
        //    41: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    46: astore          4
        //    48: aload           4
        //    50: invokeinterface java/util/Iterator.hasNext:()Z
        //    55: ifeq            107
        //    58: aload           4
        //    60: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    65: astore          element$iv$iv
        //    67: aload           element$iv$iv
        //    69: checkcast       Lkotlin/reflect/KParameter;
        //    72: astore          it
        //    74: aload           it
        //    76: invokeinterface kotlin/reflect/KParameter.getKind:()Lkotlin/reflect/KParameter$Kind;
        //    81: getstatic       kotlin/reflect/KParameter$Kind.VALUE:Lkotlin/reflect/KParameter$Kind;
        //    84: if_acmpne       91
        //    87: iconst_1       
        //    88: goto            92
        //    91: iconst_0       
        //    92: ifeq            48
        //    95: aload_3         /* destination$iv$iv */
        //    96: aload           element$iv$iv
        //    98: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   103: pop            
        //   104: goto            48
        //   107: aload_3         /* destination$iv$iv */
        //   108: checkcast       Ljava/util/List;
        //   111: goto            116
        //   114: pop            
        //   115: aconst_null    
        //   116: areturn        
        //    Signature:
        //  ()Ljava/util/List<Lkotlin/reflect/KParameter;>;
        //    StackMapTable: 00 06 FF 00 30 00 05 00 00 00 07 00 46 07 00 4C 00 00 FC 00 2A 07 00 62 40 01 F9 00 0E FF 00 06 00 00 00 01 07 00 62 41 07 00 68
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}