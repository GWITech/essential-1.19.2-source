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
                                                   ¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b""" }, d2 = { "<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2" })
public static final class FriendsTab$special$$inlined$compareBy$1<T> implements Comparator {
    final /* synthetic */ FriendsTab this$0;
    
    public FriendsTab$special$$inlined$compareBy$1(final FriendsTab this$0) {
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
        //     5: aload_0         /* this */
        //     6: getfield        gg/essential/gui/friends/tabs/FriendsTab$special$$inlined$compareBy$1.this$0:Lgg/essential/gui/friends/tabs/FriendsTab;
        //     9: invokestatic    gg/essential/gui/friends/tabs/FriendsTab.access$getSocialStateManager$p:(Lgg/essential/gui/friends/tabs/FriendsTab;)Lgg/essential/gui/friends/state/SocialStateManager;
        //    12: invokevirtual   gg/essential/gui/friends/state/SocialStateManager.getStatusStates:()Lgg/essential/gui/friends/state/IStatusStates;
        //    15: aload_3         /* it */
        //    16: checkcast       Lgg/essential/gui/friends/previews/BasicUserEntry;
        //    19: invokevirtual   gg/essential/gui/friends/previews/BasicUserEntry.getUser:()Ljava/util/UUID;
        //    22: invokeinterface gg/essential/gui/friends/state/IStatusStates.getActivity:(Ljava/util/UUID;)Lgg/essential/gui/friends/state/PlayerActivity;
        //    27: astore          activity
        //    29: aload           activity
        //    31: invokevirtual   gg/essential/gui/friends/state/PlayerActivity.isJoinable:()Z
        //    34: ifeq            47
        //    37: iconst_0       
        //    38: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    41: checkcast       Ljava/lang/Comparable;
        //    44: goto            167
        //    47: aload           activity
        //    49: astore          5
        //    51: aload           5
        //    53: instanceof      Lgg/essential/gui/friends/state/PlayerActivity$Multiplayer;
        //    56: ifeq            69
        //    59: iconst_0       
        //    60: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    63: checkcast       Ljava/lang/Comparable;
        //    66: goto            167
        //    69: aload           5
        //    71: instanceof      Lgg/essential/gui/friends/state/PlayerActivity$SPSSession;
        //    74: ifeq            99
        //    77: aload           activity
        //    79: invokevirtual   gg/essential/gui/friends/state/PlayerActivity.isJoinable:()Z
        //    82: ifeq            89
        //    85: iconst_0       
        //    86: goto            90
        //    89: iconst_1       
        //    90: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    93: checkcast       Ljava/lang/Comparable;
        //    96: goto            167
        //    99: aload           5
        //   101: instanceof      Lgg/essential/gui/friends/state/PlayerActivity$OnlineWithDescription;
        //   104: ifeq            117
        //   107: iconst_1       
        //   108: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   111: checkcast       Ljava/lang/Comparable;
        //   114: goto            167
        //   117: aload           5
        //   119: getstatic       gg/essential/gui/friends/state/PlayerActivity$Online.INSTANCE:Lgg/essential/gui/friends/state/PlayerActivity$Online;
        //   122: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   125: ifeq            138
        //   128: iconst_2       
        //   129: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   132: checkcast       Ljava/lang/Comparable;
        //   135: goto            167
        //   138: aload           5
        //   140: getstatic       gg/essential/gui/friends/state/PlayerActivity$Offline.INSTANCE:Lgg/essential/gui/friends/state/PlayerActivity$Offline;
        //   143: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   146: ifeq            159
        //   149: iconst_3       
        //   150: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   153: checkcast       Ljava/lang/Comparable;
        //   156: goto            167
        //   159: new             Lkotlin/NoWhenBranchMatchedException;
        //   162: dup            
        //   163: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //   166: athrow         
        //   167: aload_2         /* b */
        //   168: checkcast       Lgg/essential/elementa/UIComponent;
        //   171: astore_3       
        //   172: astore          6
        //   174: aload_0         /* this */
        //   175: getfield        gg/essential/gui/friends/tabs/FriendsTab$special$$inlined$compareBy$1.this$0:Lgg/essential/gui/friends/tabs/FriendsTab;
        //   178: invokestatic    gg/essential/gui/friends/tabs/FriendsTab.access$getSocialStateManager$p:(Lgg/essential/gui/friends/tabs/FriendsTab;)Lgg/essential/gui/friends/state/SocialStateManager;
        //   181: invokevirtual   gg/essential/gui/friends/state/SocialStateManager.getStatusStates:()Lgg/essential/gui/friends/state/IStatusStates;
        //   184: aload_3         /* it */
        //   185: checkcast       Lgg/essential/gui/friends/previews/BasicUserEntry;
        //   188: invokevirtual   gg/essential/gui/friends/previews/BasicUserEntry.getUser:()Ljava/util/UUID;
        //   191: invokeinterface gg/essential/gui/friends/state/IStatusStates.getActivity:(Ljava/util/UUID;)Lgg/essential/gui/friends/state/PlayerActivity;
        //   196: astore          activity
        //   198: aload           activity
        //   200: invokevirtual   gg/essential/gui/friends/state/PlayerActivity.isJoinable:()Z
        //   203: ifeq            216
        //   206: iconst_0       
        //   207: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   210: checkcast       Ljava/lang/Comparable;
        //   213: goto            336
        //   216: aload           activity
        //   218: astore          5
        //   220: aload           5
        //   222: instanceof      Lgg/essential/gui/friends/state/PlayerActivity$Multiplayer;
        //   225: ifeq            238
        //   228: iconst_0       
        //   229: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   232: checkcast       Ljava/lang/Comparable;
        //   235: goto            336
        //   238: aload           5
        //   240: instanceof      Lgg/essential/gui/friends/state/PlayerActivity$SPSSession;
        //   243: ifeq            268
        //   246: aload           activity
        //   248: invokevirtual   gg/essential/gui/friends/state/PlayerActivity.isJoinable:()Z
        //   251: ifeq            258
        //   254: iconst_0       
        //   255: goto            259
        //   258: iconst_1       
        //   259: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   262: checkcast       Ljava/lang/Comparable;
        //   265: goto            336
        //   268: aload           5
        //   270: instanceof      Lgg/essential/gui/friends/state/PlayerActivity$OnlineWithDescription;
        //   273: ifeq            286
        //   276: iconst_1       
        //   277: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   280: checkcast       Ljava/lang/Comparable;
        //   283: goto            336
        //   286: aload           5
        //   288: getstatic       gg/essential/gui/friends/state/PlayerActivity$Online.INSTANCE:Lgg/essential/gui/friends/state/PlayerActivity$Online;
        //   291: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   294: ifeq            307
        //   297: iconst_2       
        //   298: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   301: checkcast       Ljava/lang/Comparable;
        //   304: goto            336
        //   307: aload           5
        //   309: getstatic       gg/essential/gui/friends/state/PlayerActivity$Offline.INSTANCE:Lgg/essential/gui/friends/state/PlayerActivity$Offline;
        //   312: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   315: ifeq            328
        //   318: iconst_3       
        //   319: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   322: checkcast       Ljava/lang/Comparable;
        //   325: goto            336
        //   328: new             Lkotlin/NoWhenBranchMatchedException;
        //   331: dup            
        //   332: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //   335: athrow         
        //   336: aload           6
        //   338: swap           
        //   339: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
        //   342: ireturn        
        //    Signature:
        //  (TT;TT;)I
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  a     
        //  b     
        //    StackMapTable: 00 12 FF 00 2F 00 05 07 00 02 00 07 00 05 00 07 00 47 00 00 FC 00 15 07 00 47 F8 00 13 40 01 FE 00 08 00 00 07 00 47 11 14 FF 00 14 00 00 00 00 FF 00 07 00 03 07 00 02 00 07 00 05 00 01 07 00 53 FF 00 30 00 07 00 00 00 00 07 00 47 00 07 00 53 00 00 FF 00 15 00 07 00 00 00 00 07 00 47 07 00 47 07 00 53 00 00 FF 00 13 00 07 00 00 00 00 00 00 07 00 53 00 00 40 01 FF 00 08 00 07 00 00 00 00 00 07 00 47 07 00 53 00 00 11 14 FF 00 14 00 00 00 00 FF 00 07 00 07 00 00 00 00 00 00 07 00 53 00 01 07 00 53
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}