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
public static final class ReplyableMessageScreen$special$$inlined$compareBy$1<T> implements Comparator {
    final /* synthetic */ ReplyableMessageScreen this$0;
    
    public ReplyableMessageScreen$special$$inlined$compareBy$1(final ReplyableMessageScreen this$0) {
        this.this$0 = this$0;
        super();
    }
    
    @Override
    public final int compare(final T a, final T b) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Lgg/essential/elementa/UIComponent;
        //     4: astore_3        /* it */
        //     5: aload_3         /* it */
        //     6: astore          4
        //     8: aload           4
        //    10: aload_0         /* this */
        //    11: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen$special$$inlined$compareBy$1.this$0:Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;
        //    14: invokestatic    gg/essential/gui/friends/message/v2/ReplyableMessageScreen.access$getTopSpacer:(Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;)Lgg/essential/gui/common/Spacer;
        //    17: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    20: ifeq            33
        //    23: iconst_0       
        //    24: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    27: checkcast       Ljava/lang/Comparable;
        //    30: goto            65
        //    33: aload           4
        //    35: aload_0         /* this */
        //    36: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen$special$$inlined$compareBy$1.this$0:Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;
        //    39: invokestatic    gg/essential/gui/friends/message/v2/ReplyableMessageScreen.access$getBottomSpacer:(Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;)Lgg/essential/gui/common/Spacer;
        //    42: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    45: ifeq            58
        //    48: iconst_2       
        //    49: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    52: checkcast       Ljava/lang/Comparable;
        //    55: goto            65
        //    58: iconst_1       
        //    59: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    62: checkcast       Ljava/lang/Comparable;
        //    65: aload_2         /* b */
        //    66: checkcast       Lgg/essential/elementa/UIComponent;
        //    69: astore_3       
        //    70: astore          5
        //    72: aload_3         /* it */
        //    73: astore          4
        //    75: aload           4
        //    77: aload_0         /* this */
        //    78: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen$special$$inlined$compareBy$1.this$0:Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;
        //    81: invokestatic    gg/essential/gui/friends/message/v2/ReplyableMessageScreen.access$getTopSpacer:(Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;)Lgg/essential/gui/common/Spacer;
        //    84: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    87: ifeq            100
        //    90: iconst_0       
        //    91: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    94: checkcast       Ljava/lang/Comparable;
        //    97: goto            132
        //   100: aload           4
        //   102: aload_0         /* this */
        //   103: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen$special$$inlined$compareBy$1.this$0:Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;
        //   106: invokestatic    gg/essential/gui/friends/message/v2/ReplyableMessageScreen.access$getBottomSpacer:(Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;)Lgg/essential/gui/common/Spacer;
        //   109: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   112: ifeq            125
        //   115: iconst_2       
        //   116: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   119: checkcast       Ljava/lang/Comparable;
        //   122: goto            132
        //   125: iconst_1       
        //   126: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   129: checkcast       Ljava/lang/Comparable;
        //   132: aload           5
        //   134: swap           
        //   135: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
        //   138: ireturn        
        //    Signature:
        //  (TT;TT;)I
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  a     
        //  b     
        //    StackMapTable: 00 06 FF 00 21 00 05 07 00 02 00 07 00 05 00 07 00 2F 00 00 F9 00 18 46 07 00 41 FF 00 22 00 06 07 00 02 00 00 00 07 00 2F 07 00 41 00 00 FF 00 18 00 06 00 00 00 00 00 07 00 41 00 00 46 07 00 41
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}