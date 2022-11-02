package gg.essential.gui.friends.tabs;

import java.util.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0007\u0010\u0000\u001a\u00020\u0001"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a
                                                    \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a
                                                    \u0004*\u0004\u0018\u0001H\u0002H\u0002H
                                                   ¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b""" }, d2 = { "<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1" })
public static final class ChatTab$special$$inlined$thenBy$1<T> implements Comparator {
    final /* synthetic */ Comparator $this_thenBy;
    
    public ChatTab$special$$inlined$thenBy$1(final Comparator $receiver) {
        this.$this_thenBy = $receiver;
        super();
    }
    
    @Override
    public final int compare(final T a, final T b) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/friends/tabs/ChatTab$special$$inlined$thenBy$1.$this_thenBy:Ljava/util/Comparator;
        //     4: aload_1         /* a */
        //     5: aload_2         /* b */
        //     6: invokeinterface java/util/Comparator.compare:(Ljava/lang/Object;Ljava/lang/Object;)I
        //    11: istore_3        /* previousCompare */
        //    12: iload_3         /* previousCompare */
        //    13: ifeq            20
        //    16: iload_3         /* previousCompare */
        //    17: goto            102
        //    20: aload_1         /* a */
        //    21: checkcast       Lgg/essential/elementa/UIComponent;
        //    24: astore          it
        //    26: aload           it
        //    28: checkcast       Lgg/essential/gui/friends/previews/ChannelPreview;
        //    31: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getHasUnreadState:()Lgg/essential/gui/common/ReadOnlyState;
        //    34: invokevirtual   gg/essential/gui/common/ReadOnlyState.get:()Ljava/lang/Object;
        //    37: checkcast       Ljava/lang/Boolean;
        //    40: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    43: ifne            50
        //    46: iconst_1       
        //    47: goto            51
        //    50: iconst_0       
        //    51: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    54: checkcast       Ljava/lang/Comparable;
        //    57: aload_2         /* b */
        //    58: checkcast       Lgg/essential/elementa/UIComponent;
        //    61: astore          4
        //    63: astore          5
        //    65: aload           it
        //    67: checkcast       Lgg/essential/gui/friends/previews/ChannelPreview;
        //    70: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getHasUnreadState:()Lgg/essential/gui/common/ReadOnlyState;
        //    73: invokevirtual   gg/essential/gui/common/ReadOnlyState.get:()Ljava/lang/Object;
        //    76: checkcast       Ljava/lang/Boolean;
        //    79: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    82: ifne            89
        //    85: iconst_1       
        //    86: goto            90
        //    89: iconst_0       
        //    90: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    93: checkcast       Ljava/lang/Comparable;
        //    96: aload           5
        //    98: swap           
        //    99: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
        //   102: ireturn        
        //    Signature:
        //  (TT;TT;)I
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  a     
        //  b     
        //    StackMapTable: 00 06 FF 00 14 00 03 00 07 00 05 07 00 05 00 00 FF 00 1D 00 03 00 00 07 00 05 00 00 40 01 FF 00 25 00 06 00 00 00 00 00 07 00 4A 00 00 40 01 FF 00 0B 00 00 00 01 01
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}