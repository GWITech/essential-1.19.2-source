package gg.essential.gui.sps;

import net.minecraft.world.level.storage.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.*;
import kotlin.collections.*;
import gg.essential.*;
import gg.essential.universal.*;
import gg.essential.upnp.*;
import gg.essential.handlers.*;
import gg.essential.gui.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.functions.*;
import gg.essential.util.*;
import java.util.concurrent.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.network.connectionmanager.sps.*;
import net.minecraft.client.world.*;
import gg.essential.gui.common.modal.*;
import net.minecraft.world.level.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.components.*;
import net.minecraft.server.integrated.*;
import java.nio.file.*;
import net.minecraft.server.world.*;
import net.minecraft.world.*;
import gg.essential.data.*;
import net.minecraft.client.network.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\f
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001 B\u0007\b\u0002�\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020	2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002JL\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020	2
                                                   \b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020	2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0006\u0010\u0015\u001a\u00020\rJF\u0010\u0015\u001a\u00020\r2
                                                   \b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0017\u001a\u00020	2\b\b\u0002\u0010\u0013\u001a\u00020	2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fJD\u0010\u0018\u001a\u00020\r2\u0010\b\u0002\u0010\u0019\u001a
                                                   \u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020	2
                                                   \b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\fJ,\u0010\u001b\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u001c\u001a\u00020	2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002�\u0006!�\u0006
                                                   \u0010"\u001a\u00020#X\u008a\u0084\u0002�\u0006
                                                   \u0010$\u001a\u00020%X\u008a\u0084\u0002�\u0006
                                                   \u0010&\u001a\u00020'X\u008a\u0084\u0002�\u0006
                                                   \u0010(\u001a\u00020)X\u008a\u0084\u0002�\u0006
                                                   \u0010*\u001a\u00020'X\u008a\u0084\u0002�\u0006
                                                   \u0010+\u001a\u00020,X\u008a\u0084\u0002�\u0006
                                                   \u0010-\u001a\u00020'X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/sps/InviteFriendsModal;", "", "()V", "createFriendSelection", "Lgg/essential/gui/common/modal/FriendSelectionModal;", "initialFriends", "", "Ljava/util/UUID;", "justStarted", "", "fadeInInstantly", "callback", "Lkotlin/Function0;", "", "createWorldSettingsModal", "Lgg/essential/gui/common/modal/ConfirmDenyModal;", "invited", "worldSummary", "Lnet/minecraft/world/level/storage/LevelSummary;", "saveAfterOpen", "callbackAfterOpen", "show", "prepopulatedInvites", "showIPWarning", "showInviteModal", "initialInvites", "onComplete", "startSession", "openWorldSettings", "updateSpsSettings", "spsSettings", "Lgg/essential/data/SPSData$SPSSettings;", "WorldSetting", "essential", "notifyContainer", "Lgg/essential/elementa/UIComponent;", "notifyToggle", "Lgg/essential/gui/common/Checkbox;", "notifySpacer", "Lgg/essential/gui/common/Spacer;", "description", "Lgg/essential/gui/common/shadow/EssentialUIWrappedText;", "descSpacer", "settings", "Lgg/essential/elementa/components/UIContainer;", "spacer" })
public final class InviteFriendsModal
{
    @NotNull
    public static final InviteFriendsModal INSTANCE;
    
    private InviteFriendsModal() {
        super();
    }
    
    public final void show() {
        show$default$7781189c(this, null, null, false, false, (Function0)InviteFriendsModal$show.InviteFriendsModal$show$1.INSTANCE, 15);
    }
    
    public final void show(@Nullable final LevelSummary worldSummary, @NotNull final Set<UUID> prepopulatedInvites, final boolean showIPWarning, final boolean saveAfterOpen, @NotNull final Function0<Unit> callbackAfterOpen) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "prepopulatedInvites"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload           callbackAfterOpen
        //     8: ldc             "callbackAfterOpen"
        //    10: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    13: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //    16: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //    19: dup            
        //    20: ldc             "getInstance().connectionManager"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: astore          connectionManager
        //    27: aload           connectionManager
        //    29: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getSpsManager:()Lgg/essential/network/connectionmanager/sps/SPSManager;
        //    32: dup            
        //    33: ldc             "connectionManager.spsManager"
        //    35: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    38: astore          spsManager
        //    40: getstatic       gg/essential/util/MinecraftUtils.INSTANCE:Lgg/essential/util/MinecraftUtils;
        //    43: invokevirtual   gg/essential/util/MinecraftUtils.isHostingSPS:()Z
        //    46: ifeq            92
        //    49: getstatic       gg/essential/util/GuiUtil.INSTANCE:Lgg/essential/util/GuiUtil;
        //    52: new             Lgg/essential/gui/sps/InviteSelectionModal;
        //    55: dup            
        //    56: aload           spsManager
        //    58: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.getInvitedUsers:()Ljava/util/Set;
        //    61: dup            
        //    62: ldc             "spsManager.invitedUsers"
        //    64: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    67: aload_2         /* prepopulatedInvites */
        //    68: checkcast       Ljava/lang/Iterable;
        //    71: invokestatic    kotlin/collections/SetsKt.plus:(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
        //    74: aload           callbackAfterOpen
        //    76: invokespecial   gg/essential/gui/sps/InviteSelectionModal.<init>:(Ljava/util/Set;Lkotlin/jvm/functions/Function0;)V
        //    79: checkcast       Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    82: checkcast       Lgg/essential/gui/common/modal/Modal;
        //    85: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //    88: pop            
        //    89: goto            294
        //    92: invokestatic    gg/essential/universal/UMinecraft.getMinecraft:()Lnet/minecraft/client/MinecraftClient;
        //    95: invokevirtual   net/minecraft/client/MinecraftClient.getCurrentServerEntry:()Lnet/minecraft/client/network/ServerInfo;
        //    98: ifnull          110
        //   101: aload_0         /* this */
        //   102: aload           callbackAfterOpen
        //   104: invokestatic    gg/essential/gui/sps/InviteFriendsModal.showInviteModal$default$452b6876$24a528d2:(Lgg/essential/gui/sps/InviteFriendsModal;Lkotlin/jvm/functions/Function0;)V
        //   107: goto            294
        //   110: invokestatic    gg/essential/universal/UMinecraft.getMinecraft:()Lnet/minecraft/client/MinecraftClient;
        //   113: invokevirtual   net/minecraft/client/MinecraftClient.getServer:()Lnet/minecraft/server/integrated/IntegratedServer;
        //   116: ifnonnull       123
        //   119: aload_1         /* worldSummary */
        //   120: ifnull          294
        //   123: new             Lgg/essential/gui/sps/InviteFriendsModal$show$nextAction$1;
        //   126: dup            
        //   127: aload_1         /* worldSummary */
        //   128: aload_2         /* prepopulatedInvites */
        //   129: iload           saveAfterOpen
        //   131: aload           callbackAfterOpen
        //   133: invokespecial   gg/essential/gui/sps/InviteFriendsModal$show$nextAction$1.<init>:(Lnet/minecraft/world/level/storage/LevelSummary;Ljava/util/Set;ZLkotlin/jvm/functions/Function0;)V
        //   136: checkcast       Lkotlin/jvm/functions/Function0;
        //   139: astore          nextAction
        //   141: iload_3         /* showIPWarning */
        //   142: ifne            156
        //   145: aload           nextAction
        //   147: invokeinterface kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
        //   152: pop            
        //   153: goto            294
        //   156: getstatic       gg/essential/config/EssentialConfig.INSTANCE:Lgg/essential/config/EssentialConfig;
        //   159: invokevirtual   gg/essential/config/EssentialConfig.getSpsIPWarning:()Z
        //   162: ifne            176
        //   165: aload           nextAction
        //   167: invokeinterface kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
        //   172: pop            
        //   173: goto            294
        //   176: getstatic       gg/essential/util/GuiUtil.INSTANCE:Lgg/essential/util/GuiUtil;
        //   179: new             Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //   182: dup            
        //   183: iconst_0       
        //   184: aload_1         /* worldSummary */
        //   185: ifnull          192
        //   188: fconst_0       
        //   189: goto            194
        //   192: ldc             0.5
        //   194: invokespecial   gg/essential/gui/common/modal/ConfirmDenyModal.<init>:(ZF)V
        //   197: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //   200: astore          $this$configure$iv
        //   202: aload           $this$configure$iv
        //   204: astore          10
        //   206: aload           10
        //   208: astore          $this$configure_u24lambda_u2d0$iv
        //   210: aload           $this$configure_u24lambda_u2d0$iv
        //   212: checkcast       Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //   215: astore          12
        //   217: astore          13
        //   219: aload           $this$show_u24lambda_u2d0
        //   221: ldc             "This world will be hosted through your internet. Your host's IP will be visible through network logs! \n\nDo you want to proceed?"
        //   223: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.setTitleText:(Ljava/lang/String;)V
        //   226: aload           $this$show_u24lambda_u2d0
        //   228: ldc             "Proceed"
        //   230: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.setPrimaryButtonText:(Ljava/lang/String;)V
        //   233: aload           $this$show_u24lambda_u2d0
        //   235: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.getSpacer:()Lgg/essential/gui/common/Spacer;
        //   238: bipush          12
        //   240: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   243: checkcast       Ljava/lang/Number;
        //   246: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   249: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   252: invokevirtual   gg/essential/gui/common/Spacer.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/UIComponent;
        //   255: pop            
        //   256: aload           13
        //   258: aload           10
        //   260: checkcast       Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //   263: new             Lgg/essential/gui/sps/InviteFriendsModal$show$4;
        //   266: dup            
        //   267: aload           nextAction
        //   269: invokespecial   gg/essential/gui/sps/InviteFriendsModal$show$4.<init>:(Lkotlin/jvm/functions/Function0;)V
        //   272: checkcast       Lkotlin/jvm/functions/Function0;
        //   275: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.onPrimaryAction:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //   278: getstatic       gg/essential/gui/sps/InviteFriendsModal$show$5.INSTANCE:Lgg/essential/gui/sps/InviteFriendsModal$show$5;
        //   281: checkcast       Lkotlin/jvm/functions/Function1;
        //   284: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.configureLayout:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/modal/EssentialModal;
        //   287: checkcast       Lgg/essential/gui/common/modal/Modal;
        //   290: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //   293: pop            
        //   294: return         
        //    Signature:
        //  (Lnet/minecraft/world/level/storage/LevelSummary;Ljava/util/Set<Ljava/util/UUID;>;ZZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V
        //    MethodParameters:
        //  Name                 Flags  
        //  -------------------  -----
        //  worldSummary         
        //  prepopulatedInvites  
        //  showIPWarning        
        //  saveAfterOpen        
        //  callbackAfterOpen    
        //    StackMapTable: 00 08 FD 00 5C 07 00 7E 07 00 96 11 0C FC 00 20 07 00 5E 13 FF 00 0F 00 09 07 00 02 07 00 D4 07 00 D6 01 01 07 00 5E 07 00 7E 07 00 96 07 00 5E 00 04 07 00 8F 08 00 B3 08 00 B3 01 FF 00 01 00 09 07 00 02 07 00 D4 07 00 D6 01 01 07 00 5E 07 00 7E 07 00 96 07 00 5E 00 05 07 00 8F 08 00 B3 08 00 B3 01 02 FA 00 63
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static /* synthetic */ void show$default$7781189c(final InviteFriendsModal inviteFriendsModal, LevelSummary worldSummary, Set emptySet, boolean showIPWarning, boolean saveAfterOpen, Function0 callbackAfterOpen, final int n) {
        if ((n & 0x1) != 0x0) {
            worldSummary = null;
        }
        if ((n & 0x2) != 0x0) {
            emptySet = SetsKt.emptySet();
        }
        if ((n & 0x4) != 0x0) {
            showIPWarning = true;
        }
        if ((n & 0x8) != 0x0) {
            saveAfterOpen = true;
        }
        if ((n & 0x10) != 0x0) {
            callbackAfterOpen = (Function0)InviteFriendsModal$show.InviteFriendsModal$show$2.INSTANCE;
        }
        inviteFriendsModal.show(worldSummary, emptySet, showIPWarning, saveAfterOpen, (Function0<Unit>)callbackAfterOpen);
    }
    
    public final void startSession(@NotNull final Set<UUID> prepopulatedInvites, final boolean openWorldSettings, @NotNull final Function0<Unit> callbackAfterOpen) {
        Intrinsics.checkNotNullParameter((Object)prepopulatedInvites, "prepopulatedInvites");
        Intrinsics.checkNotNullParameter((Object)callbackAfterOpen, "callbackAfterOpen");
        final ConnectionManager connectionManager2 = Essential.getInstance().getConnectionManager();
        Intrinsics.checkNotNullExpressionValue((Object)connectionManager2, "getInstance().connectionManager");
        final ConnectionManager connectionManager = connectionManager2;
        final SPSManager spsManager2 = connectionManager.getSpsManager();
        Intrinsics.checkNotNullExpressionValue((Object)spsManager2, "connectionManager.spsManager");
        final SPSManager spsManager3;
        final SPSManager spsManager = spsManager3 = spsManager2;
        final GameMode adventure = GameMode.ADVENTURE;
        final ClientWorld world = UMinecraft.getMinecraft().world;
        Intrinsics.checkNotNull((Object)world);
        final CompletableFuture openFuture = spsManager3.startLocalSession$2636050f(adventure, world.method_8407(), UPnPPrivacy.INVITE_ONLY);
        final Ref$BooleanRef cancelled = new Ref$BooleanRef();
        final EssentialModal essentialModal;
        final EssentialModal $this$configure$iv = essentialModal = new EssentialModal(true, 0.0f);
        final EssentialModal $this$startSession_u24lambda_u2d1;
        final EssentialModal $this$configure_u24lambda_u2d0$iv = $this$startSession_u24lambda_u2d1 = essentialModal;
        $this$startSession_u24lambda_u2d1.setTitleText(UPnPWrapper.ICE ? "Starting integrated server..." : "Checking UPnP Compatibility");
        $this$startSession_u24lambda_u2d1.setTitleTextColor(EssentialPalette.TEXT_HIGHLIGHT);
        $this$startSession_u24lambda_u2d1.setPrimaryButtonText("Cancel");
        $this$startSession_u24lambda_u2d1.getPrimaryActionButton().rebindStyle(new BasicState<MenuButton.Style>(MenuButton.Companion.getGRAY()), new BasicState<MenuButton.Style>(MenuButton.Companion.getDARK_GRAY()));
        final EssentialModal modal = essentialModal.onPrimaryOrDismissAction((Function1<? super Boolean, Unit>)new InviteFriendsModal$startSession$modal.InviteFriendsModal$startSession$modal$2(cancelled, openFuture, spsManager));
        GuiUtil.INSTANCE.pushModal(modal);
        Intrinsics.checkNotNullExpressionValue((Object)openFuture, "openFuture");
        final CompletableFuture<Void> thenAcceptOnMainThread = ExtensionsKt.thenAcceptOnMainThread((CompletableFuture<Object>)openFuture, (kotlin.jvm.functions.Function1<? super Object, Unit>)new InviteFriendsModal$startSession.InviteFriendsModal$startSession$1(cancelled, connectionManager, modal, spsManager, openWorldSettings, (Set)prepopulatedInvites, (Function0)callbackAfterOpen));
        Intrinsics.checkNotNullExpressionValue((Object)thenAcceptOnMainThread, """
                                                                               prepopulatedInvites: Set\u2026r
                                                                                           }
                                                                                       }""");
        ExtensionsKt.logExceptions$default$68026618$686f8a8c(thenAcceptOnMainThread);
    }
    
    public static /* synthetic */ void startSession$default$75c0204b$26969be7(final InviteFriendsModal inviteFriendsModal, final Set prepopulatedInvites, final Function0 callbackAfterOpen) {
        inviteFriendsModal.startSession(prepopulatedInvites, true, (Function0<Unit>)callbackAfterOpen);
    }
    
    private final ConfirmDenyModal createWorldSettingsModal(final Set<UUID> invited, final boolean justStarted, final boolean fadeInInstantly, final LevelSummary worldSummary, final boolean saveAfterOpen, final Function0<Unit> callbackAfterOpen) {
        final SPSManager spsManager2 = Essential.getInstance().getConnectionManager().getSpsManager();
        Intrinsics.checkNotNullExpressionValue((Object)spsManager2, "getInstance().connectionManager.spsManager");
        final SPSManager spsManager = spsManager2;
        final IntegratedServer server = UMinecraft.getMinecraft().getServer();
        final IntegratedServer $this$worldDirectory;
        final IntegratedServer integratedServer = $this$worldDirectory = (UMinecraft.getMinecraft().isInSingleplayer() ? server : null);
        Path path;
        if ($this$worldDirectory == null || (path = ExtensionsKt.getWorldDirectory($this$worldDirectory)) == null) {
            Intrinsics.checkNotNull((Object)worldSummary);
            path = ExtensionsKt.getWorldDirectory(worldSummary);
        }
        final Path worldPath = path;
        final IntegratedServer integratedServer2 = integratedServer;
        WorldProperties method_3848 = null;
        Label_0092: {
            if (integratedServer2 != null) {
                final ServerWorld method_3847 = integratedServer2.method_3847(World.OVERWORLD);
                if (method_3847 != null) {
                    method_3848 = method_3847.method_8401();
                    break Label_0092;
                }
            }
            method_3848 = null;
        }
        final ServerWorldProperties info = (ServerWorldProperties)method_3848;
        final Ref$ObjectRef spsSettings = new Ref$ObjectRef();
        spsSettings.element = SPSData.INSTANCE.getSPSSettings(worldPath, worldSummary, info);
        final EssentialModal $this$configure_u24lambda_u2d0$iv;
        final EssentialModal $this$configure$iv = $this$configure_u24lambda_u2d0$iv = new ConfirmDenyModal(false, 0.0f);
        final ConfirmDenyModal $this$createWorldSettingsModal_u24lambda_u2d4 = (ConfirmDenyModal)$this$configure_u24lambda_u2d0$iv;
        $this$createWorldSettingsModal_u24lambda_u2d4.setTitleText("Basic World Settings");
        $this$createWorldSettingsModal_u24lambda_u2d4.setTitleTextColor(EssentialPalette.TEXT_HIGHLIGHT);
        $this$createWorldSettingsModal_u24lambda_u2d4.getSpacer().setHeight(UtilitiesKt.getPixels(13));
        if (worldSummary != null) {
            $this$createWorldSettingsModal_u24lambda_u2d4.setCancelButtonText("Back");
            $this$createWorldSettingsModal_u24lambda_u2d4.onCancel((Function1<? super Boolean, Unit>)InviteFriendsModal$createWorldSettingsModal$2.InviteFriendsModal$createWorldSettingsModal$2$1.INSTANCE);
        }
        $this$createWorldSettingsModal_u24lambda_u2d4.setPrimaryButtonText("Next");
        return (ConfirmDenyModal)((ConfirmDenyModal)$this$configure_u24lambda_u2d0$iv).onCancel((Function1<? super Boolean, Unit>)new InviteFriendsModal$createWorldSettingsModal.InviteFriendsModal$createWorldSettingsModal$3(true, spsManager)).onPrimaryAction((Function0<Unit>)new InviteFriendsModal$createWorldSettingsModal.InviteFriendsModal$createWorldSettingsModal$4(worldSummary, spsSettings, (Set)invited, spsManager, true, saveAfterOpen, (Function0)callbackAfterOpen)).configureLayout((Function1<? super UIContainer, Unit>)new InviteFriendsModal$createWorldSettingsModal.InviteFriendsModal$createWorldSettingsModal$5(spsSettings, info));
    }
    
    static /* synthetic */ ConfirmDenyModal createWorldSettingsModal$default$42817470$2aff3294$624588f6(final InviteFriendsModal inviteFriendsModal, final Set invited, final Function0 callbackAfterOpen) {
        return inviteFriendsModal.createWorldSettingsModal(invited, true, true, null, true, (Function0<Unit>)callbackAfterOpen);
    }
    
    private final void updateSpsSettings(final SPSData$SPSSettings spsSettings) {
        final SPSManager spsManager2 = Essential.getInstance().getConnectionManager().getSpsManager();
        Intrinsics.checkNotNullExpressionValue((Object)spsManager2, "getInstance().connectionManager.spsManager");
        final SPSManager spsManager = spsManager2;
        spsManager.updateWorldSettings(spsSettings.getCheats(), spsSettings.getGameType(), spsSettings.getDifficulty());
        spsManager.updateLocalPrivacy(spsSettings.getPrivacy());
        spsManager.updateOppedPlayers(spsSettings.getOppedPlayers(), spsSettings.getCheats());
        spsManager.setShareResourcePack(spsSettings.getShareResourcePack());
    }
    
    public final void showInviteModal$2369152(@Nullable final Set<UUID> initialInvites, final boolean justStarted, @Nullable final LevelSummary worldSummary, @NotNull final Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter((Object)onComplete, "onComplete");
        final ConnectionManager connectionManager2 = Essential.getInstance().getConnectionManager();
        Intrinsics.checkNotNullExpressionValue((Object)connectionManager2, "getInstance().connectionManager");
        final ConnectionManager connectionManager = connectionManager2;
        final SPSManager spsManager2 = connectionManager.getSpsManager();
        Intrinsics.checkNotNullExpressionValue((Object)spsManager2, "connectionManager.spsManager");
        final SPSManager spsManager = spsManager2;
        final ServerInfo currentServerData = UMinecraft.getMinecraft().getCurrentServerEntry();
        final Set invites = (currentServerData != null) ? connectionManager.getSocialManager().getInvitesOnServer(currentServerData.address) : spsManager.getInvitedUsers();
        final GuiUtil instance = GuiUtil.INSTANCE;
        Set<UUID> set = initialInvites;
        Set<UUID> set2 = initialInvites;
        if (initialInvites == null) {
            set = (set2 = invites);
        }
        Intrinsics.checkNotNullExpressionValue((Object)set2, "initialInvites ?: invites");
        instance.pushModal((Modal)new InviteSelectionModal((Set)set, justStarted, worldSummary, (Function0)onComplete));
    }
    
    public static /* synthetic */ void showInviteModal$default$452b6876$24a528d2(final InviteFriendsModal inviteFriendsModal, final Function0 onComplete) {
        inviteFriendsModal.showInviteModal$2369152(null, false, null, (Function0<Unit>)onComplete);
    }
    
    public static final /* synthetic */ ConfirmDenyModal access$createWorldSettingsModal$5c0014ab(final InviteFriendsModal $this, final Set invited, final LevelSummary worldSummary, final boolean saveAfterOpen, final Function0 callbackAfterOpen) {
        return $this.createWorldSettingsModal(invited, true, true, worldSummary, saveAfterOpen, (Function0<Unit>)callbackAfterOpen);
    }
    
    public static final /* synthetic */ void access$updateSpsSettings(final InviteFriendsModal $this, final SPSData$SPSSettings spsSettings) {
        $this.updateSpsSettings(spsSettings);
    }
    
    static {
        INSTANCE = new InviteFriendsModal();
    }
}
