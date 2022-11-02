package gg.essential.gui.multiplayer;

import net.minecraft.client.gui.*;
import kotlin.*;
import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.*;
import gg.essential.data.*;
import kotlin.jvm.functions.*;
import gg.essential.config.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.screen.multiplayer.*;
import net.minecraft.client.network.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.universal.*;
import kotlin.jvm.internal.*;
import net.minecraft.text.*;
import net.minecraft.client.gui.widget.*;
import java.util.*;
import kotlin.jvm.*;
import gg.essential.util.*;
import gg.essential.mixins.ext.client.gui.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0082\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0006
                                                   \u0002\u0010 
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\u0018\u0000 @2\u00020\u0001:\u0001@B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u0015J8\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020,H\u0002J \u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u000eH\u0016J\u000e\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020\u0004J<\u00104\u001a\u00020#2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u0004062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004082\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000408J\u0006\u0010:\u001a\u00020#J\b\u0010;\u001a\u00020#H\u0002J\u000e\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u00020#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082.¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002
                                                   \u0000R\u000e\u0010	\u001a\u00020\u0004X\u0082.¢\u0006\u0002
                                                   \u0000R\u000e\u0010
                                                   \u001a\u00020\u000bX\u0082.¢\u0006\u0002
                                                   \u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082.¢\u0006\u0002
                                                   \u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0016\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e*\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006A""" }, d2 = { "Lgg/essential/gui/multiplayer/EssentialMultiplayerGui;", "Lnet/minecraft/client/gui/Element;", "()V", "addToFavouritesButton", "Lnet/minecraft/client/gui/widget/ButtonWidget;", "closeButton", "discoverTabButton", "essentialServerList", "Lgg/essential/gui/multiplayer/EssentialServerSelectionList;", "favouritesTabButton", "featured", "Lgg/essential/elementa/components/UIImage;", "friendsTabButton", "height", "", "getHeight", "()I", "initialized", "", "refreshButton", "screen", "Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerScreen;", "showFriendsThing", "getShowFriendsThing", "()Z", "width", "getWidth", "window", "Lgg/essential/elementa/components/Window;", "selectedEntry", "Lnet/minecraft/client/network/ServerInfo;", "Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerServerListWidget;", "getSelectedEntry", "(Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerServerListWidget;)Lnet/minecraft/client/network/ServerInfo;", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "initGui", "makeButton", "id", "x", "y", "text", "", "mouseClicked", "mouseX", "", "mouseY", "mouseButton", "onButtonClicked", "button", "setupButtons", "buttons", "", "addButton", "Lkotlin/Function1;", "removeButton", "updateButtonState", "updateFriendsButton", "updatePlayerActivity", "uuid", "Ljava/util/UUID;", "updateSpsSessions", "Companion", "essential" })
public final class EssentialMultiplayerGui implements Element
{
    @NotNull
    public static final Companion Companion;
    private boolean initialized;
    @NotNull
    private final Window window;
    private MultiplayerScreen screen;
    private ButtonWidget favouritesTabButton;
    private ButtonWidget friendsTabButton;
    private ButtonWidget discoverTabButton;
    private ButtonWidget addToFavouritesButton;
    @Nullable
    private ButtonWidget refreshButton;
    @Nullable
    private ButtonWidget closeButton;
    private EssentialServerSelectionList essentialServerList;
    
    public EssentialMultiplayerGui() {
        super();
        this.window = new Window(ElementaVersion.V1, 144);
    }
    
    private final int getWidth() {
        MultiplayerScreen screen;
        if ((screen = this.screen) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screen");
            screen = null;
        }
        return screen.field_22789;
    }
    
    private final int getHeight() {
        MultiplayerScreen screen;
        if ((screen = this.screen) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screen");
            screen = null;
        }
        return screen.field_22790;
    }
    
    private final boolean getShowFriendsThing() {
        return !OnboardingData.hasSeenFriendsOption() && OnboardingData.hasAcceptedTos();
    }
    
    public final void initGui(@NotNull final MultiplayerScreen screen) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "screen"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: getstatic       gg/essential/config/EssentialConfig.INSTANCE:Lgg/essential/config/EssentialConfig;
        //     9: invokevirtual   gg/essential/config/EssentialConfig.getEssentialFull:()Z
        //    12: ifne            16
        //    15: return         
        //    16: aload_0         /* this */
        //    17: aload_1         /* screen */
        //    18: putfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.screen:Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerScreen;
        //    21: aload_0         /* this */
        //    22: aload_0         /* this */
        //    23: aload_0         /* this */
        //    24: invokespecial   gg/essential/gui/multiplayer/EssentialMultiplayerGui.getWidth:()I
        //    27: iconst_2       
        //    28: idiv           
        //    29: sipush          154
        //    32: isub           
        //    33: bipush          36
        //    35: bipush          100
        //    37: ldc             "Favorites"
        //    39: invokespecial   gg/essential/gui/multiplayer/EssentialMultiplayerGui.makeButton$48504170$1c10b817:(IIILjava/lang/String;)Lnet/minecraft/client/gui/widget/ButtonWidget;
        //    42: putfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.favouritesTabButton:Lnet/minecraft/client/gui/widget/ButtonWidget;
        //    45: aload_0         /* this */
        //    46: aload_0         /* this */
        //    47: aload_0         /* this */
        //    48: invokespecial   gg/essential/gui/multiplayer/EssentialMultiplayerGui.getWidth:()I
        //    51: iconst_2       
        //    52: idiv           
        //    53: bipush          50
        //    55: isub           
        //    56: bipush          36
        //    58: bipush          100
        //    60: ldc             "Friends"
        //    62: invokespecial   gg/essential/gui/multiplayer/EssentialMultiplayerGui.makeButton$48504170$1c10b817:(IIILjava/lang/String;)Lnet/minecraft/client/gui/widget/ButtonWidget;
        //    65: putfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.friendsTabButton:Lnet/minecraft/client/gui/widget/ButtonWidget;
        //    68: aload_0         /* this */
        //    69: aload_0         /* this */
        //    70: aload_0         /* this */
        //    71: invokespecial   gg/essential/gui/multiplayer/EssentialMultiplayerGui.getWidth:()I
        //    74: iconst_2       
        //    75: idiv           
        //    76: bipush          54
        //    78: iadd           
        //    79: bipush          36
        //    81: bipush          100
        //    83: ldc             "Featured"
        //    85: invokespecial   gg/essential/gui/multiplayer/EssentialMultiplayerGui.makeButton$48504170$1c10b817:(IIILjava/lang/String;)Lnet/minecraft/client/gui/widget/ButtonWidget;
        //    88: putfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.discoverTabButton:Lnet/minecraft/client/gui/widget/ButtonWidget;
        //    91: aload_0         /* this */
        //    92: aload_0         /* this */
        //    93: aload_0         /* this */
        //    94: invokespecial   gg/essential/gui/multiplayer/EssentialMultiplayerGui.getWidth:()I
        //    97: iconst_2       
        //    98: idiv           
        //    99: bipush          75
        //   101: isub           
        //   102: aload_0         /* this */
        //   103: invokespecial   gg/essential/gui/multiplayer/EssentialMultiplayerGui.getHeight:()I
        //   106: bipush          42
        //   108: isub           
        //   109: bipush          75
        //   111: ldc             "Favorite"
        //   113: invokespecial   gg/essential/gui/multiplayer/EssentialMultiplayerGui.makeButton$48504170$1c10b817:(IIILjava/lang/String;)Lnet/minecraft/client/gui/widget/ButtonWidget;
        //   116: putfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.addToFavouritesButton:Lnet/minecraft/client/gui/widget/ButtonWidget;
        //   119: getstatic       gg/essential/gui/EssentialPalette.FEATURED_16X:Lgg/essential/gui/image/ImageFactory;
        //   122: invokevirtual   gg/essential/gui/image/ImageFactory.create:()Lgg/essential/elementa/components/UIImage;
        //   125: pop            
        //   126: aload_1         /* screen */
        //   127: invokevirtual   net/minecraft/client/gui/screen/multiplayer/MultiplayerScreen.method_25396:()Ljava/util/List;
        //   130: astore_3       
        //   131: aload_3        
        //   132: invokestatic    kotlin/jvm/internal/TypeIntrinsics.isMutableList:(Ljava/lang/Object;)Z
        //   135: ifeq            142
        //   138: aload_3        
        //   139: goto            143
        //   142: aconst_null    
        //   143: dup            
        //   144: ifnull          157
        //   147: iconst_0       
        //   148: aload_0         /* this */
        //   149: invokeinterface java/util/List.add:(ILjava/lang/Object;)V
        //   154: goto            158
        //   157: pop            
        //   158: aload_0         /* this */
        //   159: invokespecial   gg/essential/gui/multiplayer/EssentialMultiplayerGui.getShowFriendsThing:()Z
        //   162: ifeq            249
        //   165: getstatic       gg/essential/util/GuiUtil.INSTANCE:Lgg/essential/util/GuiUtil;
        //   168: new             Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //   171: dup            
        //   172: iconst_1       
        //   173: invokespecial   gg/essential/gui/common/modal/ConfirmDenyModal.<init>:(Z)V
        //   176: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //   179: astore_2        /* $this$configure$iv */
        //   180: aload_2         /* $this$configure$iv */
        //   181: astore          4
        //   183: aload           4
        //   185: astore          $this$configure_u24lambda_u2d0$iv
        //   187: aload           $this$configure_u24lambda_u2d0$iv
        //   189: checkcast       Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //   192: astore          6
        //   194: astore          7
        //   196: aload           $this$initGui_u24lambda_u2d0
        //   198: ldc             "Do you want your friends to see what servers you are playing on?"
        //   200: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.setTitleText:(Ljava/lang/String;)V
        //   203: aload           $this$initGui_u24lambda_u2d0
        //   205: ldc             "Yes"
        //   207: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.setPrimaryButtonText:(Ljava/lang/String;)V
        //   210: aload           $this$initGui_u24lambda_u2d0
        //   212: ldc             "No"
        //   214: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.setCancelButtonText:(Ljava/lang/String;)V
        //   217: aload           7
        //   219: aload           4
        //   221: checkcast       Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //   224: getstatic       gg/essential/gui/multiplayer/EssentialMultiplayerGui$initGui$2.INSTANCE:Lgg/essential/gui/multiplayer/EssentialMultiplayerGui$initGui$2;
        //   227: checkcast       Lkotlin/jvm/functions/Function0;
        //   230: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.onPrimaryAction:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //   233: getstatic       gg/essential/gui/multiplayer/EssentialMultiplayerGui$initGui$3.INSTANCE:Lgg/essential/gui/multiplayer/EssentialMultiplayerGui$initGui$3;
        //   236: checkcast       Lkotlin/jvm/functions/Function1;
        //   239: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.onCancel:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //   242: checkcast       Lgg/essential/gui/common/modal/Modal;
        //   245: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //   248: pop            
        //   249: aload_0         /* this */
        //   250: getfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.initialized:Z
        //   253: ifne            361
        //   256: aload_0         /* this */
        //   257: iconst_1       
        //   258: putfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.initialized:Z
        //   261: aload_0         /* this */
        //   262: new             Lgg/essential/gui/multiplayer/EssentialServerSelectionList;
        //   265: dup            
        //   266: aload_1         /* screen */
        //   267: aload_1         /* screen */
        //   268: invokestatic    gg/essential/mixins/ext/client/gui/GuiMultiplayerExtKt.getAcc:(Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerScreen;)Lgg/essential/mixins/transformers/client/gui/GuiMultiplayerAccessor;
        //   271: invokeinterface gg/essential/mixins/transformers/client/gui/GuiMultiplayerAccessor.getServerListSelector:()Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerServerListWidget;
        //   276: dup            
        //   277: ldc_w           "screen.acc.serverListSelector"
        //   280: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   283: invokespecial   gg/essential/gui/multiplayer/EssentialServerSelectionList.<init>:(Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerScreen;Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerServerListWidget;)V
        //   286: putfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.essentialServerList:Lgg/essential/gui/multiplayer/EssentialServerSelectionList;
        //   289: getstatic       gg/essential/config/EssentialConfig.INSTANCE:Lgg/essential/config/EssentialConfig;
        //   292: invokevirtual   gg/essential/config/EssentialConfig.getCurrentMultiplayerTab:()I
        //   295: tableswitch {
        //                2: 316
        //                3: 338
        //          default: 357
        //        }
        //   316: aload_0         /* this */
        //   317: getfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.essentialServerList:Lgg/essential/gui/multiplayer/EssentialServerSelectionList;
        //   320: dup            
        //   321: ifnonnull       332
        //   324: pop            
        //   325: ldc_w           "essentialServerList"
        //   328: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   331: aconst_null    
        //   332: invokevirtual   gg/essential/gui/multiplayer/EssentialServerSelectionList.updateFriendsServers:()V
        //   335: goto            357
        //   338: aload_0         /* this */
        //   339: getfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.essentialServerList:Lgg/essential/gui/multiplayer/EssentialServerSelectionList;
        //   342: dup            
        //   343: ifnonnull       354
        //   346: pop            
        //   347: ldc_w           "essentialServerList"
        //   350: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   353: aconst_null    
        //   354: invokevirtual   gg/essential/gui/multiplayer/EssentialServerSelectionList.loadFeaturedServers:()V
        //   357: aload_0         /* this */
        //   358: invokespecial   gg/essential/gui/multiplayer/EssentialMultiplayerGui.updateFriendsButton:()V
        //   361: return         
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  screen  
        //    StackMapTable: 00 0C 10 FD 00 7D 00 07 00 C2 40 07 00 C2 4D 07 00 C2 00 FB 00 5A FB 00 42 4F 07 00 FF 05 4F 07 00 FF 02 03
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void setupButtons(@NotNull final List<? extends ButtonWidget> buttons, @NotNull final Function1<? super ButtonWidget, ? extends ButtonWidget> addButton, @NotNull final Function1<? super ButtonWidget, ? extends ButtonWidget> removeButton) {
        Intrinsics.checkNotNullParameter((Object)buttons, "buttons");
        Intrinsics.checkNotNullParameter((Object)addButton, "addButton");
        Intrinsics.checkNotNullParameter((Object)removeButton, "removeButton");
        if (!EssentialConfig.INSTANCE.getEssentialFull()) {
            return;
        }
        MultiplayerScreen screen;
        if ((screen = this.screen) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screen");
            screen = null;
        }
        final ButtonWidget btnSelectServer = GuiMultiplayerExtKt.getAcc(screen).getBtnSelectServer();
        switch (EssentialConfig.INSTANCE.getCurrentMultiplayerTab()) {
            case 1: {
                setupButtons$removeAllButtons(buttons, removeButton);
                setupButtons$repositionJoinServerButton(btnSelectServer, this, false, "Join Friend");
                Intrinsics.checkNotNullExpressionValue((Object)btnSelectServer, "btnSelectServer");
                addButton.invoke((Object)btnSelectServer);
                this.refreshButton = (ButtonWidget)addButton.invoke((Object)this.makeButton$48504170$1c10b817((this.getWidth() >> 1) - 50, this.getHeight() - 42, 100, "Refresh"));
                this.closeButton = (ButtonWidget)addButton.invoke((Object)this.makeButton$48504170$1c10b817((this.getWidth() >> 1) + 54, this.getHeight() - 42, 100, "Cancel"));
                break;
            }
            case 2: {
                setupButtons$removeAllButtons(buttons, removeButton);
                setupButtons$repositionJoinServerButton(btnSelectServer, this, true, "Join Server");
                ButtonWidget addToFavouritesButton;
                if ((addToFavouritesButton = this.addToFavouritesButton) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addToFavouritesButton");
                    addToFavouritesButton = null;
                }
                addButton.invoke((Object)addToFavouritesButton);
                Intrinsics.checkNotNullExpressionValue((Object)btnSelectServer, "btnSelectServer");
                addButton.invoke((Object)btnSelectServer);
                this.refreshButton = (ButtonWidget)addButton.invoke((Object)this.makeButton$48504170$1c10b817((this.getWidth() >> 1) + 5, this.getHeight() - 42, 75, "Refresh"));
                this.closeButton = (ButtonWidget)addButton.invoke((Object)this.makeButton$48504170$1c10b817((this.getWidth() >> 1) + 84, this.getHeight() - 42, 75, "Cancel"));
                break;
            }
        }
        ButtonWidget favouritesTabButton;
        if ((favouritesTabButton = this.favouritesTabButton) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("favouritesTabButton");
            favouritesTabButton = null;
        }
        addButton.invoke((Object)favouritesTabButton);
        ButtonWidget friendsTabButton;
        if ((friendsTabButton = this.friendsTabButton) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendsTabButton");
            friendsTabButton = null;
        }
        addButton.invoke((Object)friendsTabButton);
        ButtonWidget discoverTabButton;
        if ((discoverTabButton = this.discoverTabButton) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("discoverTabButton");
            discoverTabButton = null;
        }
        addButton.invoke((Object)discoverTabButton);
        this.updateButtonState();
    }
    
    public final void updateButtonState() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.initialized:Z
        //     4: ifne            8
        //     7: return         
        //     8: aload_0         /* this */
        //     9: getfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.favouritesTabButton:Lnet/minecraft/client/gui/widget/ButtonWidget;
        //    12: dup            
        //    13: ifnonnull       24
        //    16: pop            
        //    17: ldc_w           "favouritesTabButton"
        //    20: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //    23: aconst_null    
        //    24: getstatic       gg/essential/config/EssentialConfig.INSTANCE:Lgg/essential/config/EssentialConfig;
        //    27: invokevirtual   gg/essential/config/EssentialConfig.getCurrentMultiplayerTab:()I
        //    30: ifeq            37
        //    33: iconst_1       
        //    34: goto            38
        //    37: iconst_0       
        //    38: putfield        net/minecraft/client/gui/widget/ButtonWidget.field_22763:Z
        //    41: aload_0         /* this */
        //    42: getfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.friendsTabButton:Lnet/minecraft/client/gui/widget/ButtonWidget;
        //    45: dup            
        //    46: ifnonnull       57
        //    49: pop            
        //    50: ldc_w           "friendsTabButton"
        //    53: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //    56: aconst_null    
        //    57: getstatic       gg/essential/config/EssentialConfig.INSTANCE:Lgg/essential/config/EssentialConfig;
        //    60: invokevirtual   gg/essential/config/EssentialConfig.getCurrentMultiplayerTab:()I
        //    63: iconst_1       
        //    64: if_icmpeq       71
        //    67: iconst_1       
        //    68: goto            72
        //    71: iconst_0       
        //    72: putfield        net/minecraft/client/gui/widget/ButtonWidget.field_22763:Z
        //    75: aload_0         /* this */
        //    76: getfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.discoverTabButton:Lnet/minecraft/client/gui/widget/ButtonWidget;
        //    79: dup            
        //    80: ifnonnull       91
        //    83: pop            
        //    84: ldc_w           "discoverTabButton"
        //    87: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //    90: aconst_null    
        //    91: getstatic       gg/essential/config/EssentialConfig.INSTANCE:Lgg/essential/config/EssentialConfig;
        //    94: invokevirtual   gg/essential/config/EssentialConfig.getCurrentMultiplayerTab:()I
        //    97: iconst_2       
        //    98: if_icmpeq       105
        //   101: iconst_1       
        //   102: goto            106
        //   105: iconst_0       
        //   106: putfield        net/minecraft/client/gui/widget/ButtonWidget.field_22763:Z
        //   109: aload_0         /* this */
        //   110: getfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.addToFavouritesButton:Lnet/minecraft/client/gui/widget/ButtonWidget;
        //   113: dup            
        //   114: ifnonnull       125
        //   117: pop            
        //   118: ldc_w           "addToFavouritesButton"
        //   121: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   124: aconst_null    
        //   125: aload_0         /* this */
        //   126: getfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.screen:Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerScreen;
        //   129: dup            
        //   130: ifnonnull       140
        //   133: pop            
        //   134: ldc             "screen"
        //   136: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   139: aconst_null    
        //   140: invokestatic    gg/essential/mixins/ext/client/gui/GuiMultiplayerExtKt.getAcc:(Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerScreen;)Lgg/essential/mixins/transformers/client/gui/GuiMultiplayerAccessor;
        //   143: invokeinterface gg/essential/mixins/transformers/client/gui/GuiMultiplayerAccessor.getBtnSelectServer:()Lnet/minecraft/client/gui/widget/ButtonWidget;
        //   148: getfield        net/minecraft/client/gui/widget/ButtonWidget.field_22763:Z
        //   151: ifeq            247
        //   154: getstatic       gg/essential/config/EssentialConfig.INSTANCE:Lgg/essential/config/EssentialConfig;
        //   157: invokevirtual   gg/essential/config/EssentialConfig.getCurrentMultiplayerTab:()I
        //   160: iconst_2       
        //   161: if_icmpne       247
        //   164: aload_0         /* this */
        //   165: aload_0         /* this */
        //   166: getfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.screen:Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerScreen;
        //   169: dup            
        //   170: ifnonnull       180
        //   173: pop            
        //   174: ldc             "screen"
        //   176: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   179: aconst_null    
        //   180: invokestatic    gg/essential/mixins/ext/client/gui/GuiMultiplayerExtKt.getAcc:(Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerScreen;)Lgg/essential/mixins/transformers/client/gui/GuiMultiplayerAccessor;
        //   183: invokeinterface gg/essential/mixins/transformers/client/gui/GuiMultiplayerAccessor.getServerListSelector:()Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerServerListWidget;
        //   188: dup            
        //   189: ldc_w           "screen.acc.serverListSelector"
        //   192: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   195: invokespecial   gg/essential/gui/multiplayer/EssentialMultiplayerGui.getSelectedEntry:(Lnet/minecraft/client/gui/screen/multiplayer/MultiplayerServerListWidget;)Lnet/minecraft/client/network/ServerInfo;
        //   198: dup            
        //   199: ifnull          238
        //   202: astore_1       
        //   203: astore_2       
        //   204: aload_0         /* this */
        //   205: getfield        gg/essential/gui/multiplayer/EssentialMultiplayerGui.essentialServerList:Lgg/essential/gui/multiplayer/EssentialServerSelectionList;
        //   208: dup            
        //   209: ifnonnull       220
        //   212: pop            
        //   213: ldc_w           "essentialServerList"
        //   216: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   219: aconst_null    
        //   220: aload_1         /* it */
        //   221: invokevirtual   gg/essential/gui/multiplayer/EssentialServerSelectionList.isFavorite:(Lnet/minecraft/client/network/ServerInfo;)Z
        //   224: ifne            231
        //   227: iconst_1       
        //   228: goto            232
        //   231: iconst_0       
        //   232: istore_3       
        //   233: aload_2        
        //   234: iload_3        
        //   235: goto            240
        //   238: pop            
        //   239: iconst_0       
        //   240: ifeq            247
        //   243: iconst_1       
        //   244: goto            248
        //   247: iconst_0       
        //   248: putfield        net/minecraft/client/gui/widget/ButtonWidget.field_22763:Z
        //   251: return         
        //    StackMapTable: 00 14 08 4F 07 01 32 4C 07 01 32 FF 00 00 00 01 07 00 02 00 02 07 01 32 01 52 07 01 32 4D 07 01 32 FF 00 00 00 01 07 00 02 00 02 07 01 32 01 52 07 01 32 4D 07 01 32 FF 00 00 00 01 07 00 02 00 02 07 01 32 01 52 07 01 32 FF 00 0E 00 01 07 00 02 00 02 07 01 32 07 00 75 FF 00 27 00 01 07 00 02 00 03 07 01 32 07 00 02 07 00 75 FF 00 27 00 03 07 00 02 07 01 5B 07 01 32 00 01 07 00 FF 0A 40 01 FF 00 05 00 01 07 00 02 00 02 07 01 32 07 01 5B FF 00 01 00 01 07 00 02 00 02 07 01 32 01 46 07 01 32 FF 00 00 00 01 07 00 02 00 02 07 01 32 01
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public boolean mouseClicked(final double mouseX, final double mouseY, final int mouseButton) {
        if (EssentialConfig.INSTANCE.getEssentialFull()) {
            this.window.mouseClick(mouseX, mouseY, mouseButton);
        }
        return false;
    }
    
    public final void onButtonClicked(@NotNull final ButtonWidget button) {
        Intrinsics.checkNotNullParameter((Object)button, "button");
        if (!EssentialConfig.INSTANCE.getEssentialFull()) {
            return;
        }
        if (button.field_22763) {
            if (Intrinsics.areEqual((Object)button, (Object)this.closeButton)) {
                MultiplayerScreen screen;
                if ((screen = this.screen) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("screen");
                    screen = null;
                }
                GuiMultiplayerExtKt.close(GuiMultiplayerExtKt.getExt(screen));
            }
            else if (Intrinsics.areEqual((Object)button, (Object)this.refreshButton)) {
                MultiplayerScreen screen2;
                if ((screen2 = this.screen) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("screen");
                    screen2 = null;
                }
                GuiMultiplayerExtKt.refresh(GuiMultiplayerExtKt.getExt(screen2));
            }
            else {
                ButtonWidget favouritesTabButton;
                if ((favouritesTabButton = this.favouritesTabButton) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("favouritesTabButton");
                    favouritesTabButton = null;
                }
                if (Intrinsics.areEqual((Object)button, (Object)favouritesTabButton)) {
                    EssentialConfig.INSTANCE.setCurrentMultiplayerTab(0);
                    MultiplayerScreen screen3;
                    if ((screen3 = this.screen) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("screen");
                        screen3 = null;
                    }
                    GuiMultiplayerExtKt.refresh(GuiMultiplayerExtKt.getExt(screen3));
                }
                else {
                    ButtonWidget friendsTabButton;
                    if ((friendsTabButton = this.friendsTabButton) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("friendsTabButton");
                        friendsTabButton = null;
                    }
                    if (Intrinsics.areEqual((Object)button, (Object)friendsTabButton)) {
                        EssentialConfig.INSTANCE.setCurrentMultiplayerTab(1);
                        MultiplayerScreen screen4;
                        if ((screen4 = this.screen) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("screen");
                            screen4 = null;
                        }
                        GuiMultiplayerExtKt.refresh(GuiMultiplayerExtKt.getExt(screen4));
                    }
                    else {
                        ButtonWidget discoverTabButton;
                        if ((discoverTabButton = this.discoverTabButton) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("discoverTabButton");
                            discoverTabButton = null;
                        }
                        if (Intrinsics.areEqual((Object)button, (Object)discoverTabButton)) {
                            EssentialConfig.INSTANCE.setCurrentMultiplayerTab(2);
                            MultiplayerScreen screen5;
                            if ((screen5 = this.screen) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("screen");
                                screen5 = null;
                            }
                            GuiMultiplayerExtKt.refresh(GuiMultiplayerExtKt.getExt(screen5));
                        }
                        else {
                            ButtonWidget addToFavouritesButton;
                            if ((addToFavouritesButton = this.addToFavouritesButton) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("addToFavouritesButton");
                                addToFavouritesButton = null;
                            }
                            if (Intrinsics.areEqual((Object)button, (Object)addToFavouritesButton)) {
                                MultiplayerScreen screen6;
                                if ((screen6 = this.screen) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("screen");
                                    screen6 = null;
                                }
                                final MultiplayerServerListWidget serverListSelector = GuiMultiplayerExtKt.getAcc(screen6).getServerListSelector();
                                Intrinsics.checkNotNullExpressionValue((Object)serverListSelector, "screen.acc.serverListSelector");
                                final ServerInfo selectedEntry = this.getSelectedEntry(serverListSelector);
                                if (selectedEntry == null) {
                                    return;
                                }
                                final ServerInfo server = selectedEntry;
                                EssentialServerSelectionList essentialServerList;
                                if ((essentialServerList = this.essentialServerList) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("essentialServerList");
                                    essentialServerList = null;
                                }
                                essentialServerList.addFavorite(server);
                                this.updateButtonState();
                                EssentialConfig.INSTANCE.setCurrentMultiplayerTab(0);
                                MultiplayerScreen screen7;
                                if ((screen7 = this.screen) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("screen");
                                    screen7 = null;
                                }
                                GuiMultiplayerExtKt.refresh(GuiMultiplayerExtKt.getExt(screen7));
                                final Screen currentScreen = MinecraftClient.getInstance().currentScreen;
                                if (currentScreen == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen");
                                }
                                final MultiplayerScreen newScreen = (MultiplayerScreen)currentScreen;
                                final MultiplayerServerListWidget newList = GuiMultiplayerExtKt.getAcc(newScreen).getServerListSelector();
                                final List method_25396 = newList.method_25396();
                                Intrinsics.checkNotNullExpressionValue((Object)method_25396, "newList.children()");
                                final List $this$lastOrNull$iv = method_25396;
                                final ListIterator iterator$iv = $this$lastOrNull$iv.listIterator($this$lastOrNull$iv.size());
                                while (true) {
                                    while (iterator$iv.hasPrevious()) {
                                        final Object element$iv = iterator$iv.previous();
                                        final MultiplayerServerListWidget$Entry it = (MultiplayerServerListWidget$Entry)element$iv;
                                        if (it instanceof MultiplayerServerListWidget$ServerEntry) {
                                            final Object o = element$iv;
                                            final MultiplayerServerListWidget$Entry lastServer = (MultiplayerServerListWidget$Entry)o;
                                            newScreen.select(lastServer);
                                            newList.method_25307(Double.MAX_VALUE);
                                            return;
                                        }
                                    }
                                    final Object o = null;
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        if (!EssentialConfig.INSTANCE.getEssentialFull()) {
            return;
        }
        this.updateFriendsButton();
        this.window.draw(matrixStack);
    }
    
    public final void updateSpsSessions() {
        if (!EssentialConfig.INSTANCE.getEssentialFull()) {
            return;
        }
        if (EssentialConfig.INSTANCE.getCurrentMultiplayerTab() == 1) {
            EssentialServerSelectionList essentialServerList;
            if ((essentialServerList = this.essentialServerList) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("essentialServerList");
                essentialServerList = null;
            }
            essentialServerList.appendFriendsServers();
        }
    }
    
    public final void updatePlayerActivity(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        if (!EssentialConfig.INSTANCE.getEssentialFull()) {
            return;
        }
        if (EssentialConfig.INSTANCE.getCurrentMultiplayerTab() == 1) {
            EssentialServerSelectionList essentialServerList;
            if ((essentialServerList = this.essentialServerList) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("essentialServerList");
                essentialServerList = null;
            }
            essentialServerList.appendFriendsServers();
        }
        EssentialServerSelectionList essentialServerList2;
        if ((essentialServerList2 = this.essentialServerList) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("essentialServerList");
            essentialServerList2 = null;
        }
        essentialServerList2.updatePlayerStatus(uuid);
    }
    
    private final ButtonWidget makeButton$48504170$1c10b817(final int x, final int y, final int width, final String text) {
        final Ref$ObjectRef guiButton = new Ref$ObjectRef();
        guiButton.element = new ButtonWidget(x, y, width, 20, (Text)HelpersKt.textLiteral(text), EssentialMultiplayerGui::makeButton$lambda-3);
        ButtonWidget buttonWidget;
        if (guiButton.element == null) {
            Intrinsics.throwUninitializedPropertyAccessException("guiButton");
            buttonWidget = null;
        }
        else {
            buttonWidget = (ButtonWidget)guiButton.element;
        }
        return buttonWidget;
    }
    
    private final void updateFriendsButton() {
        final String format = "Friends [%d]";
        final Object[] original = { null };
        final int n = 0;
        EssentialServerSelectionList essentialServerList;
        if ((essentialServerList = this.essentialServerList) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("essentialServerList");
            essentialServerList = null;
        }
        original[n] = essentialServerList.getFriendsServers().size();
        final String format2 = String.format(format, Arrays.copyOf(original, 1));
        Intrinsics.checkNotNullExpressionValue((Object)format2, "format(this, *args)");
        final String friendText = format2;
        ButtonWidget friendsTabButton;
        if ((friendsTabButton = this.friendsTabButton) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendsTabButton");
            friendsTabButton = null;
        }
        friendsTabButton.method_25355((Text)HelpersKt.textLiteral(friendText));
    }
    
    private final ServerInfo getSelectedEntry(final MultiplayerServerListWidget $this$selectedEntry) {
        final EntryListWidget$Entry method_25334 = $this$selectedEntry.method_25334();
        final MultiplayerServerListWidget$ServerEntry multiplayerServerListWidget$ServerEntry = (method_25334 instanceof MultiplayerServerListWidget$ServerEntry) ? method_25334 : null;
        return (multiplayerServerListWidget$ServerEntry != null) ? multiplayerServerListWidget$ServerEntry.getServer() : null;
    }
    
    private static final void setupButtons$removeAllButtons(final List<? extends ButtonWidget> $buttons, final Function1<? super ButtonWidget, ? extends ButtonWidget> $removeButton) {
        for (final ButtonWidget button : $buttons) {
            $removeButton.invoke((Object)button);
        }
    }
    
    private static final void setupButtons$repositionJoinServerButton(final ButtonWidget btnSelectServer, final EssentialMultiplayerGui this$0, final boolean makeSmall, final String newText) {
        btnSelectServer.method_25358(makeSmall ? 75 : 100);
        btnSelectServer.field_22760 = this$0.getWidth() / 2 - 154;
        btnSelectServer.field_22761 = this$0.getHeight() - 42;
        btnSelectServer.method_25355((Text)HelpersKt.textLiteral(newText));
    }
    
    private static final void makeButton$lambda-3(final EssentialMultiplayerGui this$0, final Ref$ObjectRef $guiButton, final ButtonWidget it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$guiButton, "$guiButton");
        ButtonWidget button;
        if ($guiButton.element == null) {
            Intrinsics.throwUninitializedPropertyAccessException("guiButton");
            button = null;
        }
        else {
            button = (ButtonWidget)$guiButton.element;
        }
        this$0.onButtonClicked(button);
    }
    
    @JvmStatic
    @Nullable
    public static final EssentialMultiplayerGui getInstance() {
        return EssentialMultiplayerGui.Companion.getInstance();
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0012
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J
                                                       \u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0005""" }, d2 = { "Lgg/essential/gui/multiplayer/EssentialMultiplayerGui$Companion;", "", "()V", "getInstance", "Lgg/essential/gui/multiplayer/EssentialMultiplayerGui;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @Nullable
        public final EssentialMultiplayerGui getInstance() {
            final Screen openedScreen = GuiUtil.INSTANCE.openedScreen();
            final MultiplayerScreen multiplayerScreen = (openedScreen instanceof MultiplayerScreen) ? openedScreen : null;
            if (multiplayerScreen != null) {
                final GuiMultiplayerExt ext = GuiMultiplayerExtKt.getExt(multiplayerScreen);
                if (ext != null) {
                    return GuiMultiplayerExtKt.getEssential(ext);
                }
            }
            return null;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
