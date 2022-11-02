package gg.essential.commands.impl;

import gg.essential.network.connectionmanager.*;
import gg.essential.network.connectionmanager.sps.*;
import gg.essential.network.connectionmanager.social.*;
import gg.essential.util.*;
import gg.essential.universal.*;
import gg.essential.gui.sps.*;
import net.minecraft.client.*;
import net.minecraft.client.network.*;
import gg.essential.api.commands.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.util.*;
import kotlin.coroutines.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000*
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010
                                                   \u001a\u00020\u000bH\u0007J\u0011\u0010\f\u001a\u00020\u000bH\u0087@\u00f8\u0001\u0000¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000bH\u0007R\u0013\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0013\u0010\u0006\u001a\u00070\u0007¢\u0006\u0002\b\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0013\u0010\b\u001a\u00070	¢\u0006\u0002\b\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000\u0082\u0002\u0004
                                                   \u0002\b\u0019¨\u0006\u000f""" }, d2 = { "Lgg/essential/commands/impl/CommandSession;", "Lgg/essential/api/commands/Command;", "()V", "connectionManager", "Lgg/essential/network/connectionmanager/ConnectionManager;", "Lorg/jetbrains/annotations/NotNull;", "socialManager", "Lgg/essential/network/connectionmanager/social/SocialManager;", "spsManager", "Lgg/essential/network/connectionmanager/sps/SPSManager;", "handleClose", "", "handleInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleOpen", "essential" })
public final class CommandSession extends Command
{
    @NotNull
    public static final CommandSession INSTANCE;
    @NotNull
    private static final ConnectionManager connectionManager;
    @NotNull
    private static final SPSManager spsManager;
    @NotNull
    private static final SocialManager socialManager;
    
    private CommandSession() {
        super("esession", false, false, 6, null);
    }
    
    @SubCommand(value = "open", description = "Start a world share session")
    public final void handleOpen() {
        if (CommandSession.spsManager.getLocalSession() != null) {
            MinecraftUtils.INSTANCE.sendMessage("Cannot start session, one is already running.");
            return;
        }
        final ServerInfo currentServerData = UMinecraft.getMinecraft().getCurrentServerEntry();
        if (currentServerData != null && !CommandSession.spsManager.isSpsAddress(currentServerData.address) && !UMinecraft.getMinecraft().isConnectedToRealms()) {
            InviteFriendsModal.INSTANCE.show();
            return;
        }
        if (MinecraftClient.getInstance().isInSingleplayer()) {
            InviteFriendsModal.INSTANCE.show();
            return;
        }
        MinecraftUtils.INSTANCE.sendMessage("Cannot start session, your current world does not support invites");
    }
    
    @SubCommand(value = "close", description = "Close your world share session")
    public final void handleClose() {
        final ServerInfo currentServerData = UMinecraft.getMinecraft().getCurrentServerEntry();
        if (MinecraftClient.getInstance().isInSingleplayer() && CommandSession.spsManager.getLocalSession() != null) {
            CommandSession.spsManager.closeLocalSession();
            MinecraftUtils.INSTANCE.sendMessage("Closed session");
        }
        else {
            if (currentServerData != null) {
                final Set<UUID> invitesOnServer = CommandSession.socialManager.getInvitesOnServer(currentServerData.address);
                Intrinsics.checkNotNullExpressionValue((Object)invitesOnServer, "socialManager.getInvites\u2026urrentServerData.address)");
                if (!invitesOnServer.isEmpty()) {
                    CommandSession.socialManager.setInvitedFriendsOnServer(currentServerData.address, SetsKt.emptySet());
                    MinecraftUtils.INSTANCE.sendMessage("Closed session");
                    return;
                }
            }
            MinecraftUtils.INSTANCE.sendMessage("No session running");
        }
    }
    
    @SubCommand(value = "info", description = "Info about your world share session")
    @Nullable
    public final Object handleInfo(@NotNull final Continuation<? super Unit> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lgg/essential/commands/impl/CommandSession$handleInfo$1;
        //     4: ifeq            39
        //     7: aload_1        
        //     8: checkcast       Lgg/essential/commands/impl/CommandSession$handleInfo$1;
        //    11: astore          14
        //    13: aload           14
        //    15: getfield        gg/essential/commands/impl/CommandSession$handleInfo$1.label:I
        //    18: ldc             -2147483648
        //    20: iand           
        //    21: ifeq            39
        //    24: aload           14
        //    26: dup            
        //    27: getfield        gg/essential/commands/impl/CommandSession$handleInfo$1.label:I
        //    30: ldc             -2147483648
        //    32: isub           
        //    33: putfield        gg/essential/commands/impl/CommandSession$handleInfo$1.label:I
        //    36: goto            50
        //    39: new             Lgg/essential/commands/impl/CommandSession$handleInfo$1;
        //    42: dup            
        //    43: aload_0        
        //    44: aload_1        
        //    45: invokespecial   gg/essential/commands/impl/CommandSession$handleInfo$1.<init>:(Lgg/essential/commands/impl/CommandSession;Lkotlin/coroutines/Continuation;)V
        //    48: astore          $continuation
        //    50: aload           $continuation
        //    52: getfield        gg/essential/commands/impl/CommandSession$handleInfo$1.result:Ljava/lang/Object;
        //    55: astore          $result
        //    57: invokestatic    kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
        //    60: astore          15
        //    62: aload           $continuation
        //    64: getfield        gg/essential/commands/impl/CommandSession$handleInfo$1.label:I
        //    67: tableswitch {
        //                0: 92
        //                1: 267
        //                2: 543
        //          default: 702
        //        }
        //    92: aload           $result
        //    94: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //    97: getstatic       gg/essential/commands/impl/CommandSession.spsManager:Lgg/essential/network/connectionmanager/sps/SPSManager;
        //   100: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.getLocalSession:()Lgg/essential/upnp/model/UPnPSession;
        //   103: astore_2        /* localSession */
        //   104: aload_2         /* localSession */
        //   105: ifnonnull       324
        //   108: invokestatic    gg/essential/universal/UMinecraft.getMinecraft:()Lnet/minecraft/client/MinecraftClient;
        //   111: invokevirtual   net/minecraft/client/MinecraftClient.getCurrentServerEntry:()Lnet/minecraft/client/network/ServerInfo;
        //   114: astore_3        /* currentServerData */
        //   115: aload_3         /* currentServerData */
        //   116: ifnull          312
        //   119: getstatic       gg/essential/commands/impl/CommandSession.socialManager:Lgg/essential/network/connectionmanager/social/SocialManager;
        //   122: aload_3         /* currentServerData */
        //   123: getfield        net/minecraft/client/network/ServerInfo.address:Ljava/lang/String;
        //   126: invokevirtual   gg/essential/network/connectionmanager/social/SocialManager.getInvitesOnServer:(Ljava/lang/String;)Ljava/util/Set;
        //   129: astore          4
        //   131: aload           4
        //   133: ldc             "invitesOnServer"
        //   135: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   138: aload           4
        //   140: checkcast       Ljava/util/Collection;
        //   143: invokeinterface java/util/Collection.isEmpty:()Z
        //   148: ifne            155
        //   151: iconst_1       
        //   152: goto            156
        //   155: iconst_0       
        //   156: ifeq            312
        //   159: getstatic       gg/essential/util/MinecraftUtils.INSTANCE:Lgg/essential/util/MinecraftUtils;
        //   162: ldc             "Invited Players: "
        //   164: invokevirtual   gg/essential/util/MinecraftUtils.sendMessage:(Ljava/lang/String;)V
        //   167: aload           invitesOnServer
        //   169: checkcast       Ljava/lang/Iterable;
        //   172: astore          $this$forEach$iv
        //   174: aload           $this$forEach$iv
        //   176: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   181: astore          7
        //   183: aload           7
        //   185: invokeinterface java/util/Iterator.hasNext:()Z
        //   190: ifeq            308
        //   193: aload           7
        //   195: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   200: astore          element$iv
        //   202: aload           element$iv
        //   204: checkcast       Ljava/util/UUID;
        //   207: astore          it
        //   209: getstatic       gg/essential/util/MinecraftUtils.INSTANCE:Lgg/essential/util/MinecraftUtils;
        //   212: astore          11
        //   214: aload           it
        //   216: invokestatic    gg/essential/util/UUIDUtil.getName:(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;
        //   219: astore          12
        //   221: aload           12
        //   223: ldc             "getName(it)"
        //   225: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   228: aload           12
        //   230: checkcast       Ljava/util/concurrent/CompletionStage;
        //   233: aload           $continuation
        //   235: aload           $continuation
        //   237: aload           7
        //   239: putfield        gg/essential/commands/impl/CommandSession$handleInfo$1.L$0:Ljava/lang/Object;
        //   242: aload           $continuation
        //   244: aload           11
        //   246: putfield        gg/essential/commands/impl/CommandSession$handleInfo$1.L$1:Ljava/lang/Object;
        //   249: aload           $continuation
        //   251: iconst_1       
        //   252: putfield        gg/essential/commands/impl/CommandSession$handleInfo$1.label:I
        //   255: invokestatic    kotlinx/coroutines/future/FutureKt.await:(Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   258: dup            
        //   259: aload           15
        //   261: if_acmpne       294
        //   264: aload           15
        //   266: areturn        
        //   267: aload           $continuation
        //   269: getfield        gg/essential/commands/impl/CommandSession$handleInfo$1.L$1:Ljava/lang/Object;
        //   272: checkcast       Lgg/essential/util/MinecraftUtils;
        //   275: astore          11
        //   277: aload           $continuation
        //   279: getfield        gg/essential/commands/impl/CommandSession$handleInfo$1.L$0:Ljava/lang/Object;
        //   282: checkcast       Ljava/util/Iterator;
        //   285: astore          7
        //   287: aload           $result
        //   289: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   292: aload           $result
        //   294: aload           11
        //   296: swap           
        //   297: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/Object;)Ljava/lang/String;
        //   302: invokevirtual   gg/essential/util/MinecraftUtils.sendMessage:(Ljava/lang/String;)V
        //   305: goto            183
        //   308: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   311: areturn        
        //   312: getstatic       gg/essential/util/MinecraftUtils.INSTANCE:Lgg/essential/util/MinecraftUtils;
        //   315: ldc             "No session running"
        //   317: invokevirtual   gg/essential/util/MinecraftUtils.sendMessage:(Ljava/lang/String;)V
        //   320: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   323: areturn        
        //   324: getstatic       gg/essential/util/MinecraftUtils.INSTANCE:Lgg/essential/util/MinecraftUtils;
        //   327: aload_2         /* localSession */
        //   328: invokevirtual   gg/essential/upnp/model/UPnPSession.getPrivacy:()Lgg/essential/upnp/UPnPPrivacy;
        //   331: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Lgg/essential/upnp/UPnPPrivacy;)Ljava/lang/String;
        //   336: invokevirtual   gg/essential/util/MinecraftUtils.sendMessage:(Ljava/lang/String;)V
        //   339: getstatic       gg/essential/util/MinecraftUtils.INSTANCE:Lgg/essential/util/MinecraftUtils;
        //   342: getstatic       gg/essential/commands/impl/CommandSession.spsManager:Lgg/essential/network/connectionmanager/sps/SPSManager;
        //   345: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.isAllowCheats:()Z
        //   348: invokedynamic   BootstrapMethod #2, makeConcatWithConstants:(Z)Ljava/lang/String;
        //   353: invokevirtual   gg/essential/util/MinecraftUtils.sendMessage:(Ljava/lang/String;)V
        //   356: getstatic       gg/essential/util/MinecraftUtils.INSTANCE:Lgg/essential/util/MinecraftUtils;
        //   359: getstatic       gg/essential/commands/impl/CommandSession.spsManager:Lgg/essential/network/connectionmanager/sps/SPSManager;
        //   362: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.getCurrentGameMode:()Lnet/minecraft/world/GameMode;
        //   365: invokedynamic   BootstrapMethod #3, makeConcatWithConstants:(Lnet/minecraft/world/GameMode;)Ljava/lang/String;
        //   370: invokevirtual   gg/essential/util/MinecraftUtils.sendMessage:(Ljava/lang/String;)V
        //   373: getstatic       gg/essential/util/MinecraftUtils.INSTANCE:Lgg/essential/util/MinecraftUtils;
        //   376: getstatic       gg/essential/commands/impl/CommandSession.spsManager:Lgg/essential/network/connectionmanager/sps/SPSManager;
        //   379: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.getDifficulty:()Lnet/minecraft/world/Difficulty;
        //   382: invokedynamic   BootstrapMethod #4, makeConcatWithConstants:(Lnet/minecraft/world/Difficulty;)Ljava/lang/String;
        //   387: invokevirtual   gg/essential/util/MinecraftUtils.sendMessage:(Ljava/lang/String;)V
        //   390: getstatic       gg/essential/util/MinecraftUtils.INSTANCE:Lgg/essential/util/MinecraftUtils;
        //   393: getstatic       gg/essential/commands/impl/CommandSession.spsManager:Lgg/essential/network/connectionmanager/sps/SPSManager;
        //   396: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.getSessionStartTime:()Ljava/time/Instant;
        //   399: checkcast       Ljava/time/temporal/Temporal;
        //   402: invokestatic    java/time/Instant.now:()Ljava/time/Instant;
        //   405: checkcast       Ljava/time/temporal/Temporal;
        //   408: invokestatic    java/time/Duration.between:(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
        //   411: dup            
        //   412: ldc_w           "between(spsManager.sessi\u2026StartTime, Instant.now())"
        //   415: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   418: invokestatic    gg/essential/util/ExtensionsKt.toShortString:(Ljava/time/Duration;)Ljava/lang/String;
        //   421: invokedynamic   BootstrapMethod #5, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   426: invokevirtual   gg/essential/util/MinecraftUtils.sendMessage:(Ljava/lang/String;)V
        //   429: getstatic       gg/essential/util/MinecraftUtils.INSTANCE:Lgg/essential/util/MinecraftUtils;
        //   432: ldc             "Invited Players: "
        //   434: invokevirtual   gg/essential/util/MinecraftUtils.sendMessage:(Ljava/lang/String;)V
        //   437: getstatic       gg/essential/commands/impl/CommandSession.spsManager:Lgg/essential/network/connectionmanager/sps/SPSManager;
        //   440: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.getInvitedUsers:()Ljava/util/Set;
        //   443: dup            
        //   444: ldc_w           "spsManager.invitedUsers"
        //   447: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   450: invokestatic    gg/essential/util/UUIDUtil.getClientUUID:()Ljava/util/UUID;
        //   453: invokestatic    kotlin/collections/SetsKt.plus:(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;
        //   456: checkcast       Ljava/lang/Iterable;
        //   459: astore_3        /* $this$forEach$iv */
        //   460: aload_3         /* $this$forEach$iv */
        //   461: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   466: astore          5
        //   468: aload           5
        //   470: invokeinterface java/util/Iterator.hasNext:()Z
        //   475: ifeq            698
        //   478: aload           5
        //   480: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   485: astore          element$iv
        //   487: aload           element$iv
        //   489: checkcast       Ljava/util/UUID;
        //   492: astore          invitedUser
        //   494: aload           invitedUser
        //   496: invokestatic    gg/essential/util/UUIDUtil.getName:(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;
        //   499: dup            
        //   500: ldc_w           "getName(invitedUser)"
        //   503: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   506: checkcast       Ljava/util/concurrent/CompletionStage;
        //   509: aload           $continuation
        //   511: aload           $continuation
        //   513: aload           5
        //   515: putfield        gg/essential/commands/impl/CommandSession$handleInfo$1.L$0:Ljava/lang/Object;
        //   518: aload           $continuation
        //   520: aload           invitedUser
        //   522: putfield        gg/essential/commands/impl/CommandSession$handleInfo$1.L$1:Ljava/lang/Object;
        //   525: aload           $continuation
        //   527: iconst_2       
        //   528: putfield        gg/essential/commands/impl/CommandSession$handleInfo$1.label:I
        //   531: invokestatic    kotlinx/coroutines/future/FutureKt.await:(Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   534: dup            
        //   535: aload           15
        //   537: if_acmpne       570
        //   540: aload           15
        //   542: areturn        
        //   543: aload           $continuation
        //   545: getfield        gg/essential/commands/impl/CommandSession$handleInfo$1.L$1:Ljava/lang/Object;
        //   548: checkcast       Ljava/util/UUID;
        //   551: astore          invitedUser
        //   553: aload           $continuation
        //   555: getfield        gg/essential/commands/impl/CommandSession$handleInfo$1.L$0:Ljava/lang/Object;
        //   558: checkcast       Ljava/util/Iterator;
        //   561: astore          5
        //   563: aload           $result
        //   565: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   568: aload           $result
        //   570: checkcast       Ljava/lang/String;
        //   573: astore          username
        //   575: aload           invitedUser
        //   577: invokestatic    gg/essential/util/UUIDUtil.getClientUUID:()Ljava/util/UUID;
        //   580: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   583: ifeq            592
        //   586: getstatic       gg/essential/universal/ChatColor.AQUA:Lgg/essential/universal/ChatColor;
        //   589: goto            628
        //   592: getstatic       gg/essential/commands/impl/CommandSession.spsManager:Lgg/essential/network/connectionmanager/sps/SPSManager;
        //   595: aload           invitedUser
        //   597: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.getOnlineState:(Ljava/util/UUID;)Lgg/essential/gui/common/WeakState;
        //   600: invokevirtual   gg/essential/gui/common/WeakState.get:()Ljava/lang/Object;
        //   603: dup            
        //   604: ldc_w           "spsManager.getOnlineState(invitedUser).get()"
        //   607: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   610: checkcast       Ljava/lang/Boolean;
        //   613: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   616: ifeq            625
        //   619: getstatic       gg/essential/universal/ChatColor.GREEN:Lgg/essential/universal/ChatColor;
        //   622: goto            628
        //   625: getstatic       gg/essential/universal/ChatColor.GRAY:Lgg/essential/universal/ChatColor;
        //   628: astore          colorPrefix
        //   630: aload           invitedUser
        //   632: astore          12
        //   634: aload           12
        //   636: invokestatic    gg/essential/util/UUIDUtil.getClientUUID:()Ljava/util/UUID;
        //   639: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   642: ifeq            651
        //   645: ldc_w           " (Host)"
        //   648: goto            676
        //   651: getstatic       gg/essential/commands/impl/CommandSession.spsManager:Lgg/essential/network/connectionmanager/sps/SPSManager;
        //   654: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.getOppedPlayers:()Ljava/util/Set;
        //   657: aload           12
        //   659: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   664: ifeq            673
        //   667: ldc_w           " (OP)"
        //   670: goto            676
        //   673: ldc_w           ""
        //   676: astore          suffix
        //   678: getstatic       gg/essential/util/MinecraftUtils.INSTANCE:Lgg/essential/util/MinecraftUtils;
        //   681: aload           colorPrefix
        //   683: aload           username
        //   685: aload           suffix
        //   687: invokedynamic   BootstrapMethod #6, makeConcatWithConstants:(Lgg/essential/universal/ChatColor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   692: invokevirtual   gg/essential/util/MinecraftUtils.sendMessage:(Ljava/lang/String;)V
        //   695: goto            468
        //   698: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   701: areturn        
        //   702: new             Ljava/lang/IllegalStateException;
        //   705: dup            
        //   706: ldc_w           "call to 'resume' before 'invoke' with coroutine"
        //   709: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   712: athrow         
        //    Signature:
        //  (Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
        //    StackMapTable: 00 16 27 FF 00 0A 00 0F 07 00 02 07 00 A4 00 00 00 00 00 00 00 00 00 00 00 00 07 00 22 00 00 FF 00 29 00 10 07 00 02 07 00 A4 00 00 00 00 00 00 00 00 00 00 00 07 00 B0 07 00 22 07 00 B0 00 00 FF 00 3E 00 10 07 00 02 07 00 A4 07 00 BA 07 00 50 07 00 BC 00 00 00 00 00 00 00 00 07 00 B0 07 00 22 07 00 B0 00 00 40 01 FF 00 1A 00 10 07 00 02 07 00 A4 00 00 00 00 00 07 00 C6 00 00 00 00 00 07 00 B0 07 00 22 07 00 B0 00 00 FF 00 53 00 10 07 00 02 07 00 A4 00 00 00 00 00 00 00 00 00 00 00 07 00 B0 07 00 22 07 00 B0 00 00 FF 00 1A 00 10 07 00 02 07 00 A4 00 00 00 00 00 07 00 C6 00 00 00 07 00 39 00 07 00 B0 07 00 22 07 00 B0 00 01 07 00 B0 FF 00 0D 00 10 07 00 02 07 00 A4 00 00 00 00 00 07 00 C6 00 00 00 00 00 07 00 B0 07 00 22 07 00 B0 00 00 FF 00 03 00 10 07 00 02 07 00 A4 07 00 BA 07 00 50 00 00 00 00 00 00 00 00 00 07 00 B0 07 00 22 07 00 B0 00 00 FF 00 0B 00 10 07 00 02 07 00 A4 07 00 BA 00 00 00 00 00 00 00 00 00 00 07 00 B0 07 00 22 07 00 B0 00 00 FF 00 8F 00 10 07 00 02 07 00 A4 00 00 00 07 00 C6 00 00 00 00 00 00 00 07 00 B0 07 00 22 07 00 B0 00 00 FF 00 4A 00 10 07 00 02 07 00 A4 00 00 00 00 00 00 00 00 00 00 00 07 00 B0 07 00 22 07 00 B0 00 00 FF 00 1A 00 10 07 00 02 07 00 A4 00 00 00 07 00 C6 00 07 00 CE 00 00 00 00 00 07 00 B0 07 00 22 07 00 B0 00 01 07 00 B0 FF 00 15 00 10 07 00 02 07 00 A4 00 00 00 07 00 C6 00 07 00 CE 00 00 07 01 47 00 00 07 00 B0 07 00 22 07 00 B0 00 00 20 42 07 01 4D FF 00 16 00 10 07 00 02 07 00 A4 00 00 00 07 00 C6 00 07 00 CE 00 07 01 4D 07 01 47 00 07 00 CE 07 00 B0 07 00 22 07 00 B0 00 00 15 42 07 01 47 FF 00 15 00 10 07 00 02 07 00 A4 00 00 00 07 00 C6 00 00 00 00 00 00 00 07 00 B0 07 00 22 07 00 B0 00 00 FF 00 03 00 10 07 00 02 07 00 A4 00 00 00 00 00 00 00 00 00 00 00 07 00 B0 07 00 22 07 00 B0 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        INSTANCE = new CommandSession();
        final ConnectionManager connectionManager2 = Essential.getInstance().getConnectionManager();
        Intrinsics.checkNotNullExpressionValue((Object)connectionManager2, "getInstance().connectionManager");
        connectionManager = connectionManager2;
        final SPSManager spsManager2 = CommandSession.connectionManager.getSpsManager();
        Intrinsics.checkNotNullExpressionValue((Object)spsManager2, "connectionManager.spsManager");
        spsManager = spsManager2;
        final SocialManager socialManager2 = CommandSession.connectionManager.getSocialManager();
        Intrinsics.checkNotNullExpressionValue((Object)socialManager2, "connectionManager.socialManager");
        socialManager = socialManager2;
    }
}
