package gg.essential.gui.friends.message.v2;

import java.util.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0007\u0010\u0000\u001a\u00020\u0001"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a
                                                    \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a
                                                    \u0004*\u0004\u0018\u0001H\u0002H\u0002H
                                                   ¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b""" }, d2 = { "<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2" })
public static final class ReplyableMessageScreen$insertUnreadDivider$$inlined$sortedBy$1<T> implements Comparator {
    public ReplyableMessageScreen$insertUnreadDivider$$inlined$sortedBy$1() {
        super();
    }
    
    @Override
    public final int compare(final T a, final T b) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Lgg/essential/gui/friends/message/v2/ClientMessage;
        //     4: astore_3        /* it */
        //     5: aload_3         /* it */
        //     6: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getSendTime:()Ljava/time/Instant;
        //     9: checkcast       Ljava/lang/Comparable;
        //    12: aload_2         /* b */
        //    13: checkcast       Lgg/essential/gui/friends/message/v2/ClientMessage;
        //    16: astore_3       
        //    17: astore          4
        //    19: aload_3         /* it */
        //    20: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getSendTime:()Ljava/time/Instant;
        //    23: aload           4
        //    25: swap           
        //    26: checkcast       Ljava/lang/Comparable;
        //    29: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
        //    32: ireturn        
        //    Signature:
        //  (TT;TT;)I
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  a     
        //  b     
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}