package gg.essential.gui.menu;

import gg.essential.elementa.components.*;
import kotlin.reflect.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.image.*;
import kotlin.properties.*;
import gg.essential.handlers.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000h
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u000e
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u001b\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u001b\u0010\b\u001a\u00020	8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\f\u0010\r\u001a\u0004\b
                                                   \u0010\u000bR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00070\u0013¢\u0006\u0002\b\u0014¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001b\u0010\r\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b#\u0010\r\u001a\u0004\b"\u0010\u001aR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\b
                                                   \u0000\u001a\u0004\b%\u0010 R\u001d\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\b
                                                   \u0000\u001a\u0004\b'\u0010\u0011R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010)\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b+\u0010\r\u001a\u0004\b*\u0010\u001aR\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R)\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060/\u0012\u0004\u0012\u00020\u001e0\u000f¢\u0006\b
                                                   \u0000\u001a\u0004\b0\u0010\u0011R\u001a\u00101\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001e0\u000fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u00103\u001a\u0002048FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b7\u0010\r\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b:\u0010\r\u001a\u0004\b9\u0010\u001aR\u001d\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u000f¢\u0006\b
                                                   \u0000\u001a\u0004\b<\u0010\u0011R\u001b\u0010=\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b?\u0010\r\u001a\u0004\b>\u0010\u001aR\u001d\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u000f¢\u0006\b
                                                   \u0000\u001a\u0004\bA\u0010\u0011R\u001b\u0010B\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\bD\u0010\r\u001a\u0004\bC\u0010\u001aR\u001d\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u000f¢\u0006\b
                                                   \u0000\u001a\u0004\bF\u0010\u0011R\u001b\u0010G\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\bI\u0010\r\u001a\u0004\bH\u0010\u001aR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\b
                                                   \u0000\u001a\u0004\bK\u0010 R\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\bM\u0010N¨\u0006O""" }, d2 = { "Lgg/essential/gui/menu/RightSideBar;", "Lgg/essential/elementa/components/UIContainer;", "menuType", "Lgg/essential/handlers/PauseMenuDisplay$MenuType;", "menuVisible", "Lgg/essential/elementa/state/State;", "", "(Lgg/essential/handlers/PauseMenuDisplay$MenuType;Lgg/essential/elementa/state/State;)V", "betaFlag", "Lgg/essential/elementa/UIComponent;", "getBetaFlag", "()Lgg/essential/elementa/UIComponent;", "betaFlag$delegate", "Lkotlin/properties/ReadWriteProperty;", "collapsed", "Lgg/essential/elementa/state/MappedState;", "getCollapsed", "()Lgg/essential/elementa/state/MappedState;", "connectionManager", "Lgg/essential/network/connectionmanager/ConnectionManager;", "Lorg/jetbrains/annotations/NotNull;", "getConnectionManager", "()Lgg/essential/network/connectionmanager/ConnectionManager;", "essentialButton", "Lgg/essential/gui/common/MenuButton;", "getEssentialButton", "()Lgg/essential/gui/common/MenuButton;", "essentialButton$delegate", "essentialTooltip", "Lgg/essential/elementa/state/BasicState;", "", "getEssentialTooltip", "()Lgg/essential/elementa/state/BasicState;", "folder", "getFolder", "folder$delegate", "folderTooltip", "getFolderTooltip", "hasNotices", "getHasNotices", "hostable", "inviteButton", "getInviteButton", "inviteButton$delegate", "inviteIcon", "Lgg/essential/gui/image/ImageFactory;", "inviteTooltip", "Lkotlin/Pair;", "getInviteTooltip", "messageCount", "", "messageFlag", "Lgg/essential/gui/common/NoticeFlag;", "getMessageFlag", "()Lgg/essential/gui/common/NoticeFlag;", "messageFlag$delegate", "pictures", "getPictures", "pictures$delegate", "picturesTooltip", "getPicturesTooltip", "settings", "getSettings", "settings$delegate", "settingsTooltip", "getSettingsTooltip", "social", "getSocial", "social$delegate", "socialTooltip", "getSocialTooltip", "worldSettings", "getWorldSettings", "worldSettings$delegate", "worldSettingsTooltip", "getWorldSettingsTooltip", "worldSettingsVisible", "getWorldSettingsVisible", "()Lgg/essential/elementa/state/State;", "essential" })
public class RightSideBar extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final MappedState<Boolean, Boolean> collapsed;
    @NotNull
    private final BasicState<Boolean> hostable;
    @NotNull
    private final BasicState<String> essentialTooltip;
    @NotNull
    private final MappedState<Pair<Boolean, Boolean>, String> inviteTooltip;
    @NotNull
    private final MappedState<Boolean, String> socialTooltip;
    @NotNull
    private final MappedState<Boolean, String> picturesTooltip;
    @NotNull
    private final MappedState<Boolean, String> settingsTooltip;
    @NotNull
    private final BasicState<String> folderTooltip;
    @NotNull
    private final BasicState<String> worldSettingsTooltip;
    @NotNull
    private final State<Boolean> worldSettingsVisible;
    @NotNull
    private final State<ImageFactory> inviteIcon;
    @NotNull
    private final MappedState<Integer, String> messageCount;
    @NotNull
    private final MappedState<String, Boolean> hasNotices;
    @NotNull
    private final ReadWriteProperty messageFlag$delegate;
    @NotNull
    private final ReadWriteProperty essentialButton$delegate;
    @NotNull
    private final ReadWriteProperty betaFlag$delegate;
    @NotNull
    private final ReadWriteProperty worldSettings$delegate;
    @NotNull
    private final ReadWriteProperty inviteButton$delegate;
    @NotNull
    private final ReadWriteProperty social$delegate;
    @NotNull
    private final ReadWriteProperty pictures$delegate;
    @NotNull
    private final ReadWriteProperty settings$delegate;
    @NotNull
    private final ReadWriteProperty folder$delegate;
    
    public RightSideBar(@NotNull final PauseMenuDisplay.MenuType menuType, @NotNull final State<Boolean> menuVisible) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "menuType"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* menuVisible */
        //     7: ldc             "menuVisible"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    16: aload_0         /* this */
        //    17: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //    20: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //    23: dup            
        //    24: ldc             "getInstance().connectionManager"
        //    26: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    29: putfield        gg/essential/gui/menu/RightSideBar.connectionManager:Lgg/essential/network/connectionmanager/ConnectionManager;
        //    32: aload_0         /* this */
        //    33: new             Lgg/essential/elementa/state/BasicState;
        //    36: dup            
        //    37: iconst_0       
        //    38: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    41: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    44: getstatic       gg/essential/gui/menu/RightSideBar$collapsed$1.INSTANCE:Lgg/essential/gui/menu/RightSideBar$collapsed$1;
        //    47: checkcast       Lkotlin/jvm/functions/Function1;
        //    50: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    53: putfield        gg/essential/gui/menu/RightSideBar.collapsed:Lgg/essential/elementa/state/MappedState;
        //    56: aload_0         /* this */
        //    57: new             Lgg/essential/elementa/state/BasicState;
        //    60: dup            
        //    61: aload_1         /* menuType */
        //    62: getstatic       gg/essential/handlers/PauseMenuDisplay$MenuType.MAIN:Lgg/essential/handlers/PauseMenuDisplay$MenuType;
        //    65: if_acmpne       72
        //    68: iconst_1       
        //    69: goto            73
        //    72: iconst_0       
        //    73: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    76: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    79: putfield        gg/essential/gui/menu/RightSideBar.hostable:Lgg/essential/elementa/state/BasicState;
        //    82: aload_0         /* this */
        //    83: new             Lgg/essential/elementa/state/BasicState;
        //    86: dup            
        //    87: ldc             "About Essential"
        //    89: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    92: putfield        gg/essential/gui/menu/RightSideBar.essentialTooltip:Lgg/essential/elementa/state/BasicState;
        //    95: aload_0         /* this */
        //    96: aload_0         /* this */
        //    97: getfield        gg/essential/gui/menu/RightSideBar.hostable:Lgg/essential/elementa/state/BasicState;
        //   100: aload_0         /* this */
        //   101: getfield        gg/essential/gui/menu/RightSideBar.collapsed:Lgg/essential/elementa/state/MappedState;
        //   104: checkcast       Lgg/essential/elementa/state/State;
        //   107: invokevirtual   gg/essential/elementa/state/BasicState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   110: getstatic       gg/essential/gui/menu/RightSideBar$inviteTooltip$1.INSTANCE:Lgg/essential/gui/menu/RightSideBar$inviteTooltip$1;
        //   113: checkcast       Lkotlin/jvm/functions/Function1;
        //   116: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   119: putfield        gg/essential/gui/menu/RightSideBar.inviteTooltip:Lgg/essential/elementa/state/MappedState;
        //   122: aload_0         /* this */
        //   123: aload_0         /* this */
        //   124: getfield        gg/essential/gui/menu/RightSideBar.collapsed:Lgg/essential/elementa/state/MappedState;
        //   127: getstatic       gg/essential/gui/menu/RightSideBar$socialTooltip$1.INSTANCE:Lgg/essential/gui/menu/RightSideBar$socialTooltip$1;
        //   130: checkcast       Lkotlin/jvm/functions/Function1;
        //   133: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   136: putfield        gg/essential/gui/menu/RightSideBar.socialTooltip:Lgg/essential/elementa/state/MappedState;
        //   139: aload_0         /* this */
        //   140: aload_0         /* this */
        //   141: getfield        gg/essential/gui/menu/RightSideBar.collapsed:Lgg/essential/elementa/state/MappedState;
        //   144: getstatic       gg/essential/gui/menu/RightSideBar$picturesTooltip$1.INSTANCE:Lgg/essential/gui/menu/RightSideBar$picturesTooltip$1;
        //   147: checkcast       Lkotlin/jvm/functions/Function1;
        //   150: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   153: putfield        gg/essential/gui/menu/RightSideBar.picturesTooltip:Lgg/essential/elementa/state/MappedState;
        //   156: aload_0         /* this */
        //   157: aload_0         /* this */
        //   158: getfield        gg/essential/gui/menu/RightSideBar.collapsed:Lgg/essential/elementa/state/MappedState;
        //   161: getstatic       gg/essential/gui/menu/RightSideBar$settingsTooltip$1.INSTANCE:Lgg/essential/gui/menu/RightSideBar$settingsTooltip$1;
        //   164: checkcast       Lkotlin/jvm/functions/Function1;
        //   167: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   170: putfield        gg/essential/gui/menu/RightSideBar.settingsTooltip:Lgg/essential/elementa/state/MappedState;
        //   173: aload_0         /* this */
        //   174: new             Lgg/essential/elementa/state/BasicState;
        //   177: dup            
        //   178: ldc             "Minecraft Folder"
        //   180: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   183: putfield        gg/essential/gui/menu/RightSideBar.folderTooltip:Lgg/essential/elementa/state/BasicState;
        //   186: aload_0         /* this */
        //   187: new             Lgg/essential/elementa/state/BasicState;
        //   190: dup            
        //   191: ldc             "World Host Settings"
        //   193: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   196: putfield        gg/essential/gui/menu/RightSideBar.worldSettingsTooltip:Lgg/essential/elementa/state/BasicState;
        //   199: aload_0         /* this */
        //   200: aload_0         /* this */
        //   201: checkcast       Lgg/essential/elementa/UIComponent;
        //   204: new             Lgg/essential/gui/menu/RightSideBar$worldSettingsVisible$1;
        //   207: dup            
        //   208: aload_0         /* this */
        //   209: invokespecial   gg/essential/gui/menu/RightSideBar$worldSettingsVisible$1.<init>:(Lgg/essential/gui/menu/RightSideBar;)V
        //   212: checkcast       Lkotlin/jvm/functions/Function0;
        //   215: invokestatic    gg/essential/util/ExtensionsKt.pollingState$default$a9b5a09$5bde5825:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;
        //   218: putfield        gg/essential/gui/menu/RightSideBar.worldSettingsVisible:Lgg/essential/elementa/state/State;
        //   221: aload_0         /* this */
        //   222: aload_0         /* this */
        //   223: checkcast       Lgg/essential/elementa/UIComponent;
        //   226: new             Lgg/essential/gui/menu/RightSideBar$inviteIcon$1;
        //   229: dup            
        //   230: aload_1         /* menuType */
        //   231: aload_0         /* this */
        //   232: invokespecial   gg/essential/gui/menu/RightSideBar$inviteIcon$1.<init>:(Lgg/essential/handlers/PauseMenuDisplay$MenuType;Lgg/essential/gui/menu/RightSideBar;)V
        //   235: checkcast       Lkotlin/jvm/functions/Function0;
        //   238: invokestatic    gg/essential/util/ExtensionsKt.pollingState$default$a9b5a09$5bde5825:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;
        //   241: putfield        gg/essential/gui/menu/RightSideBar.inviteIcon:Lgg/essential/elementa/state/State;
        //   244: aload_0         /* this */
        //   245: aload_0         /* this */
        //   246: getfield        gg/essential/gui/menu/RightSideBar.connectionManager:Lgg/essential/network/connectionmanager/ConnectionManager;
        //   249: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getChatManager:()Lgg/essential/network/connectionmanager/chat/ChatManager;
        //   252: invokevirtual   gg/essential/network/connectionmanager/chat/ChatManager.getUnreadMessageCount:()Lgg/essential/elementa/state/State;
        //   255: aload_0         /* this */
        //   256: getfield        gg/essential/gui/menu/RightSideBar.connectionManager:Lgg/essential/network/connectionmanager/ConnectionManager;
        //   259: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getNoticesManager:()Lgg/essential/network/connectionmanager/notices/NoticesManager;
        //   262: invokevirtual   gg/essential/network/connectionmanager/notices/NoticesManager.getSocialMenuNewFriendRequestNoticeManager:()Lgg/essential/network/connectionmanager/notices/SocialMenuNewFriendRequestNoticeManager;
        //   265: invokevirtual   gg/essential/network/connectionmanager/notices/SocialMenuNewFriendRequestNoticeManager.unseenFriendRequestCount:()Lgg/essential/gui/common/WeakState;
        //   268: checkcast       Lgg/essential/elementa/state/State;
        //   271: invokevirtual   gg/essential/elementa/state/State.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   274: getstatic       gg/essential/gui/menu/RightSideBar$messageCount$1.INSTANCE:Lgg/essential/gui/menu/RightSideBar$messageCount$1;
        //   277: checkcast       Lkotlin/jvm/functions/Function1;
        //   280: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   283: getstatic       gg/essential/gui/menu/RightSideBar$messageCount$2.INSTANCE:Lgg/essential/gui/menu/RightSideBar$messageCount$2;
        //   286: checkcast       Lkotlin/jvm/functions/Function1;
        //   289: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   292: putfield        gg/essential/gui/menu/RightSideBar.messageCount:Lgg/essential/elementa/state/MappedState;
        //   295: aload_0         /* this */
        //   296: aload_0         /* this */
        //   297: getfield        gg/essential/gui/menu/RightSideBar.messageCount:Lgg/essential/elementa/state/MappedState;
        //   300: getstatic       gg/essential/gui/menu/RightSideBar$hasNotices$1.INSTANCE:Lgg/essential/gui/menu/RightSideBar$hasNotices$1;
        //   303: checkcast       Lkotlin/jvm/functions/Function1;
        //   306: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   309: putfield        gg/essential/gui/menu/RightSideBar.hasNotices:Lgg/essential/elementa/state/MappedState;
        //   312: aload_0         /* this */
        //   313: new             Lgg/essential/gui/common/NoticeFlag;
        //   316: dup            
        //   317: new             Lgg/essential/elementa/state/BasicState;
        //   320: dup            
        //   321: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //   324: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getLIGHT_RED:()Lgg/essential/gui/common/MenuButton$Style;
        //   327: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   330: checkcast       Lgg/essential/elementa/state/State;
        //   333: getstatic       gg/essential/gui/common/MenuButton$Alignment.CENTER:Lgg/essential/gui/common/MenuButton$Alignment;
        //   336: iconst_1       
        //   337: anewarray       Lgg/essential/elementa/state/State;
        //   340: astore_3       
        //   341: aload_3        
        //   342: iconst_0       
        //   343: aload_0         /* this */
        //   344: getfield        gg/essential/gui/menu/RightSideBar.messageCount:Lgg/essential/elementa/state/MappedState;
        //   347: checkcast       Lgg/essential/elementa/state/State;
        //   350: aastore        
        //   351: aload_3        
        //   352: invokespecial   gg/essential/gui/common/NoticeFlag.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;[Lgg/essential/elementa/state/State;)V
        //   355: checkcast       Lgg/essential/elementa/UIComponent;
        //   358: aload_0         /* this */
        //   359: getstatic       gg/essential/gui/menu/RightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   362: iconst_0       
        //   363: aaload         
        //   364: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   367: putfield        gg/essential/gui/menu/RightSideBar.messageFlag$delegate:Lkotlin/properties/ReadWriteProperty;
        //   370: aload_0         /* this */
        //   371: new             Lgg/essential/gui/common/MenuButton;
        //   374: dup            
        //   375: new             Lgg/essential/elementa/state/BasicState;
        //   378: dup            
        //   379: ldc_w           "Essential"
        //   382: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   385: checkcast       Lgg/essential/elementa/state/State;
        //   388: aconst_null    
        //   389: aconst_null    
        //   390: aconst_null    
        //   391: getstatic       gg/essential/gui/common/MenuButton$Alignment.LEFT:Lgg/essential/gui/common/MenuButton$Alignment;
        //   394: fconst_0       
        //   395: aconst_null    
        //   396: iconst_0       
        //   397: iconst_0       
        //   398: getstatic       gg/essential/gui/menu/RightSideBar$essentialButton$2.INSTANCE:Lgg/essential/gui/menu/RightSideBar$essentialButton$2;
        //   401: checkcast       Lkotlin/jvm/functions/Function0;
        //   404: sipush          494
        //   407: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;FLgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //   410: checkcast       Lgg/essential/elementa/UIComponent;
        //   413: astore_3        /* $this$constrain$iv */
        //   414: aload_3         /* $this$constrain$iv */
        //   415: astore          5
        //   417: aload           5
        //   419: astore          $this$constrain_u24lambda_u2d0$iv
        //   421: aload           $this$constrain_u24lambda_u2d0$iv
        //   423: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   426: astore          7
        //   428: astore          8
        //   430: aload           $this$essentialButton_delegate_u24lambda_u2d0
        //   432: bipush          80
        //   434: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   437: checkcast       Ljava/lang/Number;
        //   440: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   443: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   446: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   449: aload           $this$essentialButton_delegate_u24lambda_u2d0
        //   451: bipush          20
        //   453: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   456: checkcast       Ljava/lang/Number;
        //   459: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   462: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   465: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   468: aload           8
        //   470: aload           5
        //   472: checkcast       Lgg/essential/gui/common/MenuButton;
        //   475: new             Lgg/essential/elementa/state/BasicState;
        //   478: dup            
        //   479: getstatic       gg/essential/gui/EssentialPalette.ESSENTIAL_7X:Lgg/essential/gui/image/ImageFactory;
        //   482: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   485: checkcast       Lgg/essential/elementa/state/State;
        //   488: iconst_1       
        //   489: new             Lgg/essential/elementa/state/BasicState;
        //   492: dup            
        //   493: getstatic       gg/essential/gui/EssentialPalette.MESSAGE_SENT:Ljava/awt/Color;
        //   496: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   499: checkcast       Lgg/essential/elementa/state/State;
        //   502: aconst_null    
        //   503: aconst_null    
        //   504: ldc_w           -1.0
        //   507: fconst_0       
        //   508: new             Lgg/essential/elementa/state/BasicState;
        //   511: dup            
        //   512: iconst_1       
        //   513: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   516: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   519: checkcast       Lgg/essential/elementa/state/State;
        //   522: bipush          88
        //   524: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //   527: aload_0         /* this */
        //   528: getfield        gg/essential/gui/menu/RightSideBar.collapsed:Lgg/essential/elementa/state/MappedState;
        //   531: checkcast       Lgg/essential/elementa/state/State;
        //   534: ldc_w           20.0
        //   537: invokestatic    gg/essential/gui/common/MenuButton.bindCollapsed$default$3bcddc2a$24867a06:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;F)Lgg/essential/gui/common/MenuButton;
        //   540: checkcast       Lgg/essential/elementa/UIComponent;
        //   543: aload_0         /* this */
        //   544: getstatic       gg/essential/gui/menu/RightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   547: iconst_1       
        //   548: aaload         
        //   549: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   552: putfield        gg/essential/gui/menu/RightSideBar.essentialButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //   555: aload_0         /* this */
        //   556: new             Lgg/essential/gui/common/NoticeFlag;
        //   559: dup            
        //   560: new             Lgg/essential/elementa/state/BasicState;
        //   563: dup            
        //   564: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //   567: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getLIGHT_RED:()Lgg/essential/gui/common/MenuButton$Style;
        //   570: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   573: checkcast       Lgg/essential/elementa/state/State;
        //   576: getstatic       gg/essential/gui/common/MenuButton$Alignment.CENTER:Lgg/essential/gui/common/MenuButton$Alignment;
        //   579: iconst_1       
        //   580: anewarray       Lgg/essential/elementa/state/State;
        //   583: astore_3       
        //   584: aload_3        
        //   585: iconst_0       
        //   586: new             Lgg/essential/elementa/state/BasicState;
        //   589: dup            
        //   590: ldc_w           "BETA"
        //   593: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   596: checkcast       Lgg/essential/elementa/state/State;
        //   599: aastore        
        //   600: aload_3        
        //   601: invokespecial   gg/essential/gui/common/NoticeFlag.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;[Lgg/essential/elementa/state/State;)V
        //   604: astore_3       
        //   605: aload_3        
        //   606: astore          4
        //   608: astore          8
        //   610: aload           $this$betaFlag_delegate_u24lambda_u2d1
        //   612: checkcast       Lgg/essential/elementa/UIComponent;
        //   615: aload           $this$betaFlag_delegate_u24lambda_u2d1
        //   617: checkcast       Lgg/essential/elementa/UIComponent;
        //   620: iconst_0       
        //   621: iconst_0       
        //   622: iconst_3       
        //   623: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   626: aload_2         /* menuVisible */
        //   627: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   630: checkcast       Lgg/essential/elementa/state/State;
        //   633: new             Lgg/essential/elementa/state/BasicState;
        //   636: dup            
        //   637: getstatic       gg/essential/data/VersionData.INSTANCE:Lgg/essential/data/VersionData;
        //   640: invokevirtual   gg/essential/data/VersionData.getEssentialBranch:()Ljava/lang/String;
        //   643: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   648: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   651: checkcast       Lgg/essential/elementa/state/State;
        //   654: getstatic       gg/essential/gui/common/EssentialTooltip$Position.ABOVE:Lgg/essential/gui/common/EssentialTooltip$Position;
        //   657: fconst_0       
        //   658: aconst_null    
        //   659: aconst_null    
        //   660: bipush          56
        //   662: invokestatic    gg/essential/util/ExtensionsKt.bindEssentialTooltip$default$5d648aca:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //   665: pop            
        //   666: aload           8
        //   668: aload_3        
        //   669: checkcast       Lgg/essential/elementa/UIComponent;
        //   672: astore_3        /* $this$onLeftClick$iv */
        //   673: aload_3         /* $this$onLeftClick$iv */
        //   674: new             Lgg/essential/gui/menu/RightSideBar$special$$inlined$onLeftClick$1;
        //   677: dup            
        //   678: aload_0         /* this */
        //   679: invokespecial   gg/essential/gui/menu/RightSideBar$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/menu/RightSideBar;)V
        //   682: checkcast       Lkotlin/jvm/functions/Function2;
        //   685: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   688: aload_0         /* this */
        //   689: getstatic       gg/essential/gui/menu/RightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   692: iconst_2       
        //   693: aaload         
        //   694: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   697: putfield        gg/essential/gui/menu/RightSideBar.betaFlag$delegate:Lkotlin/properties/ReadWriteProperty;
        //   700: aload_0         /* this */
        //   701: new             Lgg/essential/gui/common/MenuButton;
        //   704: dup            
        //   705: aconst_null    
        //   706: aconst_null    
        //   707: aconst_null    
        //   708: aconst_null    
        //   709: aconst_null    
        //   710: aconst_null    
        //   711: iconst_0       
        //   712: iconst_0       
        //   713: getstatic       gg/essential/gui/menu/RightSideBar$worldSettings$2.INSTANCE:Lgg/essential/gui/menu/RightSideBar$worldSettings$2;
        //   716: checkcast       Lkotlin/jvm/functions/Function0;
        //   719: sipush          511
        //   722: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Ljava/lang/String;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;Lgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //   725: checkcast       Lgg/essential/elementa/UIComponent;
        //   728: astore_3        /* $this$constrain$iv */
        //   729: aload_3         /* $this$constrain$iv */
        //   730: astore          5
        //   732: aload           5
        //   734: astore          $this$constrain_u24lambda_u2d0$iv
        //   736: aload           $this$constrain_u24lambda_u2d0$iv
        //   738: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   741: astore          7
        //   743: astore          8
        //   745: aload           $this$worldSettings_delegate_u24lambda_u2d3
        //   747: bipush          20
        //   749: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   752: checkcast       Ljava/lang/Number;
        //   755: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   758: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   761: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   764: aload           $this$worldSettings_delegate_u24lambda_u2d3
        //   766: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   769: dup            
        //   770: fconst_0       
        //   771: iconst_1       
        //   772: aconst_null    
        //   773: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   776: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   779: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   782: aload           8
        //   784: aload           5
        //   786: checkcast       Lgg/essential/gui/common/MenuButton;
        //   789: new             Lgg/essential/elementa/state/BasicState;
        //   792: dup            
        //   793: getstatic       gg/essential/gui/EssentialPalette.WORLD_8X:Lgg/essential/gui/image/ImageFactory;
        //   796: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   799: checkcast       Lgg/essential/elementa/state/State;
        //   802: iconst_0       
        //   803: aconst_null    
        //   804: aconst_null    
        //   805: aconst_null    
        //   806: fconst_0       
        //   807: fconst_0       
        //   808: aconst_null    
        //   809: sipush          254
        //   812: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //   815: checkcast       Lgg/essential/elementa/UIComponent;
        //   818: aload_0         /* this */
        //   819: getstatic       gg/essential/gui/menu/RightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   822: iconst_3       
        //   823: aaload         
        //   824: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   827: putfield        gg/essential/gui/menu/RightSideBar.worldSettings$delegate:Lkotlin/properties/ReadWriteProperty;
        //   830: aload_0         /* this */
        //   831: new             Lgg/essential/gui/common/MenuButton;
        //   834: dup            
        //   835: aload_0         /* this */
        //   836: getfield        gg/essential/gui/menu/RightSideBar.hostable:Lgg/essential/elementa/state/BasicState;
        //   839: getstatic       gg/essential/gui/menu/RightSideBar$inviteButton$2.INSTANCE:Lgg/essential/gui/menu/RightSideBar$inviteButton$2;
        //   842: checkcast       Lkotlin/jvm/functions/Function1;
        //   845: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   848: checkcast       Lgg/essential/elementa/state/State;
        //   851: aconst_null    
        //   852: aconst_null    
        //   853: aconst_null    
        //   854: getstatic       gg/essential/gui/common/MenuButton$Alignment.LEFT:Lgg/essential/gui/common/MenuButton$Alignment;
        //   857: fconst_0       
        //   858: aconst_null    
        //   859: iconst_0       
        //   860: iconst_0       
        //   861: getstatic       gg/essential/gui/menu/RightSideBar$inviteButton$3.INSTANCE:Lgg/essential/gui/menu/RightSideBar$inviteButton$3;
        //   864: checkcast       Lkotlin/jvm/functions/Function0;
        //   867: sipush          494
        //   870: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;FLgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //   873: checkcast       Lgg/essential/elementa/UIComponent;
        //   876: astore_3        /* $this$constrain$iv */
        //   877: aload_3         /* $this$constrain$iv */
        //   878: astore          5
        //   880: aload           5
        //   882: astore          $this$constrain_u24lambda_u2d0$iv
        //   884: aload           $this$constrain_u24lambda_u2d0$iv
        //   886: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   889: astore          7
        //   891: astore          8
        //   893: aload           $this$inviteButton_delegate_u24lambda_u2d4
        //   895: bipush          80
        //   897: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   900: checkcast       Ljava/lang/Number;
        //   903: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   906: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   909: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   912: aload           $this$inviteButton_delegate_u24lambda_u2d4
        //   914: bipush          20
        //   916: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   919: checkcast       Ljava/lang/Number;
        //   922: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   925: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   928: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   931: aload           8
        //   933: aload           5
        //   935: checkcast       Lgg/essential/gui/common/MenuButton;
        //   938: aload_0         /* this */
        //   939: getfield        gg/essential/gui/menu/RightSideBar.inviteIcon:Lgg/essential/elementa/state/State;
        //   942: iconst_1       
        //   943: aconst_null    
        //   944: aconst_null    
        //   945: aconst_null    
        //   946: ldc_w           -2.0
        //   949: aload_0         /* this */
        //   950: getfield        gg/essential/gui/menu/RightSideBar.hostable:Lgg/essential/elementa/state/BasicState;
        //   953: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
        //   956: checkcast       Ljava/lang/Boolean;
        //   959: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   962: ifeq            969
        //   965: fconst_1       
        //   966: goto            970
        //   969: fconst_0       
        //   970: aconst_null    
        //   971: sipush          156
        //   974: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //   977: aload_0         /* this */
        //   978: getfield        gg/essential/gui/menu/RightSideBar.collapsed:Lgg/essential/elementa/state/MappedState;
        //   981: checkcast       Lgg/essential/elementa/state/State;
        //   984: ldc_w           20.0
        //   987: invokestatic    gg/essential/gui/common/MenuButton.bindCollapsed$default$3bcddc2a$24867a06:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;F)Lgg/essential/gui/common/MenuButton;
        //   990: checkcast       Lgg/essential/elementa/UIComponent;
        //   993: aload_0         /* this */
        //   994: getstatic       gg/essential/gui/menu/RightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   997: iconst_4       
        //   998: aaload         
        //   999: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1002: putfield        gg/essential/gui/menu/RightSideBar.inviteButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1005: aload_0         /* this */
        //  1006: new             Lgg/essential/gui/common/MenuButton;
        //  1009: dup            
        //  1010: new             Lgg/essential/elementa/state/BasicState;
        //  1013: dup            
        //  1014: ldc_w           "Social"
        //  1017: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1020: checkcast       Lgg/essential/elementa/state/State;
        //  1023: aconst_null    
        //  1024: aconst_null    
        //  1025: aconst_null    
        //  1026: getstatic       gg/essential/gui/common/MenuButton$Alignment.LEFT:Lgg/essential/gui/common/MenuButton$Alignment;
        //  1029: fconst_0       
        //  1030: aconst_null    
        //  1031: iconst_0       
        //  1032: iconst_0       
        //  1033: getstatic       gg/essential/gui/menu/RightSideBar$social$2.INSTANCE:Lgg/essential/gui/menu/RightSideBar$social$2;
        //  1036: checkcast       Lkotlin/jvm/functions/Function0;
        //  1039: sipush          494
        //  1042: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;FLgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //  1045: checkcast       Lgg/essential/elementa/UIComponent;
        //  1048: astore_3        /* $this$constrain$iv */
        //  1049: aload_3         /* $this$constrain$iv */
        //  1050: astore          5
        //  1052: aload           5
        //  1054: astore          $this$constrain_u24lambda_u2d0$iv
        //  1056: aload           $this$constrain_u24lambda_u2d0$iv
        //  1058: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1061: astore          7
        //  1063: astore          8
        //  1065: aload           $this$social_delegate_u24lambda_u2d5
        //  1067: bipush          80
        //  1069: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1072: checkcast       Ljava/lang/Number;
        //  1075: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1078: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1081: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1084: aload           $this$social_delegate_u24lambda_u2d5
        //  1086: bipush          20
        //  1088: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1091: checkcast       Ljava/lang/Number;
        //  1094: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1097: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1100: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1103: aload           8
        //  1105: aload           5
        //  1107: checkcast       Lgg/essential/gui/common/MenuButton;
        //  1110: new             Lgg/essential/elementa/state/BasicState;
        //  1113: dup            
        //  1114: getstatic       gg/essential/gui/EssentialPalette.SOCIAL_10X:Lgg/essential/gui/image/ImageFactory;
        //  1117: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1120: checkcast       Lgg/essential/elementa/state/State;
        //  1123: iconst_1       
        //  1124: aconst_null    
        //  1125: aconst_null    
        //  1126: aconst_null    
        //  1127: ldc_w           -1.0
        //  1130: fconst_0       
        //  1131: aconst_null    
        //  1132: sipush          220
        //  1135: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //  1138: aload_0         /* this */
        //  1139: getfield        gg/essential/gui/menu/RightSideBar.collapsed:Lgg/essential/elementa/state/MappedState;
        //  1142: checkcast       Lgg/essential/elementa/state/State;
        //  1145: ldc_w           20.0
        //  1148: invokestatic    gg/essential/gui/common/MenuButton.bindCollapsed$default$3bcddc2a$24867a06:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;F)Lgg/essential/gui/common/MenuButton;
        //  1151: checkcast       Lgg/essential/elementa/UIComponent;
        //  1154: aload_0         /* this */
        //  1155: getstatic       gg/essential/gui/menu/RightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1158: iconst_5       
        //  1159: aaload         
        //  1160: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1163: putfield        gg/essential/gui/menu/RightSideBar.social$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1166: aload_0         /* this */
        //  1167: new             Lgg/essential/gui/common/MenuButton;
        //  1170: dup            
        //  1171: new             Lgg/essential/elementa/state/BasicState;
        //  1174: dup            
        //  1175: ldc_w           "Pictures"
        //  1178: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1181: checkcast       Lgg/essential/elementa/state/State;
        //  1184: aconst_null    
        //  1185: aconst_null    
        //  1186: aconst_null    
        //  1187: getstatic       gg/essential/gui/common/MenuButton$Alignment.LEFT:Lgg/essential/gui/common/MenuButton$Alignment;
        //  1190: fconst_0       
        //  1191: aconst_null    
        //  1192: iconst_0       
        //  1193: iconst_0       
        //  1194: getstatic       gg/essential/gui/menu/RightSideBar$pictures$2.INSTANCE:Lgg/essential/gui/menu/RightSideBar$pictures$2;
        //  1197: checkcast       Lkotlin/jvm/functions/Function0;
        //  1200: sipush          494
        //  1203: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;FLgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //  1206: checkcast       Lgg/essential/elementa/UIComponent;
        //  1209: astore_3        /* $this$constrain$iv */
        //  1210: aload_3         /* $this$constrain$iv */
        //  1211: astore          5
        //  1213: aload           5
        //  1215: astore          $this$constrain_u24lambda_u2d0$iv
        //  1217: aload           $this$constrain_u24lambda_u2d0$iv
        //  1219: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1222: astore          7
        //  1224: astore          8
        //  1226: aload           $this$pictures_delegate_u24lambda_u2d6
        //  1228: bipush          80
        //  1230: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1233: checkcast       Ljava/lang/Number;
        //  1236: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1239: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1242: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1245: aload           $this$pictures_delegate_u24lambda_u2d6
        //  1247: bipush          20
        //  1249: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1252: checkcast       Ljava/lang/Number;
        //  1255: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1258: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1261: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1264: aload           8
        //  1266: aload           5
        //  1268: checkcast       Lgg/essential/gui/common/MenuButton;
        //  1271: new             Lgg/essential/elementa/state/BasicState;
        //  1274: dup            
        //  1275: getstatic       gg/essential/gui/EssentialPalette.PICTURES_10X7:Lgg/essential/gui/image/ImageFactory;
        //  1278: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1281: checkcast       Lgg/essential/elementa/state/State;
        //  1284: iconst_1       
        //  1285: aconst_null    
        //  1286: aconst_null    
        //  1287: aconst_null    
        //  1288: ldc_w           -1.0
        //  1291: fconst_2       
        //  1292: aconst_null    
        //  1293: sipush          156
        //  1296: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //  1299: aload_0         /* this */
        //  1300: getfield        gg/essential/gui/menu/RightSideBar.collapsed:Lgg/essential/elementa/state/MappedState;
        //  1303: checkcast       Lgg/essential/elementa/state/State;
        //  1306: ldc_w           20.0
        //  1309: invokestatic    gg/essential/gui/common/MenuButton.bindCollapsed$default$3bcddc2a$24867a06:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;F)Lgg/essential/gui/common/MenuButton;
        //  1312: checkcast       Lgg/essential/elementa/UIComponent;
        //  1315: aload_0         /* this */
        //  1316: getstatic       gg/essential/gui/menu/RightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1319: bipush          6
        //  1321: aaload         
        //  1322: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1325: putfield        gg/essential/gui/menu/RightSideBar.pictures$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1328: aload_0         /* this */
        //  1329: new             Lgg/essential/gui/common/MenuButton;
        //  1332: dup            
        //  1333: new             Lgg/essential/elementa/state/BasicState;
        //  1336: dup            
        //  1337: ldc_w           "Settings"
        //  1340: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1343: checkcast       Lgg/essential/elementa/state/State;
        //  1346: aconst_null    
        //  1347: aconst_null    
        //  1348: aconst_null    
        //  1349: getstatic       gg/essential/gui/common/MenuButton$Alignment.LEFT:Lgg/essential/gui/common/MenuButton$Alignment;
        //  1352: fconst_0       
        //  1353: aconst_null    
        //  1354: iconst_0       
        //  1355: iconst_0       
        //  1356: getstatic       gg/essential/gui/menu/RightSideBar$settings$2.INSTANCE:Lgg/essential/gui/menu/RightSideBar$settings$2;
        //  1359: checkcast       Lkotlin/jvm/functions/Function0;
        //  1362: sipush          494
        //  1365: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;FLgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //  1368: checkcast       Lgg/essential/elementa/UIComponent;
        //  1371: astore_3        /* $this$constrain$iv */
        //  1372: aload_3         /* $this$constrain$iv */
        //  1373: astore          5
        //  1375: aload           5
        //  1377: astore          $this$constrain_u24lambda_u2d0$iv
        //  1379: aload           $this$constrain_u24lambda_u2d0$iv
        //  1381: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1384: astore          7
        //  1386: astore          8
        //  1388: aload           $this$settings_delegate_u24lambda_u2d7
        //  1390: bipush          80
        //  1392: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1395: checkcast       Ljava/lang/Number;
        //  1398: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1401: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1404: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1407: aload           $this$settings_delegate_u24lambda_u2d7
        //  1409: bipush          20
        //  1411: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1414: checkcast       Ljava/lang/Number;
        //  1417: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1420: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1423: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1426: aload           8
        //  1428: aload           5
        //  1430: checkcast       Lgg/essential/gui/common/MenuButton;
        //  1433: new             Lgg/essential/elementa/state/BasicState;
        //  1436: dup            
        //  1437: getstatic       gg/essential/gui/EssentialPalette.SETTINGS_9X8:Lgg/essential/gui/image/ImageFactory;
        //  1440: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1443: checkcast       Lgg/essential/elementa/state/State;
        //  1446: iconst_1       
        //  1447: aconst_null    
        //  1448: aconst_null    
        //  1449: aconst_null    
        //  1450: ldc_w           -1.0
        //  1453: fconst_1       
        //  1454: aconst_null    
        //  1455: sipush          156
        //  1458: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //  1461: aload_0         /* this */
        //  1462: getfield        gg/essential/gui/menu/RightSideBar.collapsed:Lgg/essential/elementa/state/MappedState;
        //  1465: checkcast       Lgg/essential/elementa/state/State;
        //  1468: ldc_w           20.0
        //  1471: invokestatic    gg/essential/gui/common/MenuButton.bindCollapsed$default$3bcddc2a$24867a06:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;F)Lgg/essential/gui/common/MenuButton;
        //  1474: checkcast       Lgg/essential/elementa/UIComponent;
        //  1477: aload_0         /* this */
        //  1478: getstatic       gg/essential/gui/menu/RightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1481: bipush          7
        //  1483: aaload         
        //  1484: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1487: putfield        gg/essential/gui/menu/RightSideBar.settings$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1490: aload_0         /* this */
        //  1491: new             Lgg/essential/gui/common/MenuButton;
        //  1494: dup            
        //  1495: aconst_null    
        //  1496: aconst_null    
        //  1497: aconst_null    
        //  1498: aconst_null    
        //  1499: aconst_null    
        //  1500: aconst_null    
        //  1501: iconst_0       
        //  1502: iconst_0       
        //  1503: getstatic       gg/essential/gui/menu/RightSideBar$folder$2.INSTANCE:Lgg/essential/gui/menu/RightSideBar$folder$2;
        //  1506: checkcast       Lkotlin/jvm/functions/Function0;
        //  1509: sipush          511
        //  1512: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Ljava/lang/String;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;Lgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //  1515: checkcast       Lgg/essential/elementa/UIComponent;
        //  1518: astore_3        /* $this$constrain$iv */
        //  1519: aload_3         /* $this$constrain$iv */
        //  1520: astore          5
        //  1522: aload           5
        //  1524: astore          $this$constrain_u24lambda_u2d0$iv
        //  1526: aload           $this$constrain_u24lambda_u2d0$iv
        //  1528: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1531: astore          7
        //  1533: astore          8
        //  1535: aload           $this$folder_delegate_u24lambda_u2d8
        //  1537: bipush          20
        //  1539: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1542: checkcast       Ljava/lang/Number;
        //  1545: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1548: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1551: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1554: aload           $this$folder_delegate_u24lambda_u2d8
        //  1556: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //  1559: dup            
        //  1560: fconst_0       
        //  1561: iconst_1       
        //  1562: aconst_null    
        //  1563: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1566: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1569: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1572: aload           8
        //  1574: aload           5
        //  1576: checkcast       Lgg/essential/gui/common/MenuButton;
        //  1579: new             Lgg/essential/elementa/state/BasicState;
        //  1582: dup            
        //  1583: getstatic       gg/essential/gui/EssentialPalette.MC_FOLDER_8X7:Lgg/essential/gui/image/ImageFactory;
        //  1586: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1589: checkcast       Lgg/essential/elementa/state/State;
        //  1592: iconst_0       
        //  1593: aconst_null    
        //  1594: aconst_null    
        //  1595: aconst_null    
        //  1596: fconst_0       
        //  1597: fconst_0       
        //  1598: aconst_null    
        //  1599: sipush          254
        //  1602: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //  1605: checkcast       Lgg/essential/elementa/UIComponent;
        //  1608: aload_0         /* this */
        //  1609: getstatic       gg/essential/gui/menu/RightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1612: bipush          8
        //  1614: aaload         
        //  1615: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1618: putfield        gg/essential/gui/menu/RightSideBar.folder$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1621: return         
        //    Signature:
        //  (Lgg/essential/handlers/PauseMenuDisplay$MenuType;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;)V
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  menuType     
        //  menuVisible  
        //    StackMapTable: 00 04 FF 00 48 00 03 07 00 02 07 00 C3 07 00 C8 00 03 07 00 02 08 00 39 08 00 39 FF 00 00 00 03 07 00 02 07 00 C3 07 00 C8 00 04 07 00 02 08 00 39 08 00 39 01 FF 03 7F 00 01 07 00 02 00 08 07 00 02 07 01 33 07 00 C8 01 05 05 05 02 FF 00 00 00 01 07 00 02 00 09 07 00 02 07 01 33 07 00 C8 01 05 05 05 02 02
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final ConnectionManager getConnectionManager() {
        return this.connectionManager;
    }
    
    @NotNull
    public final MappedState<Boolean, Boolean> getCollapsed() {
        return this.collapsed;
    }
    
    @NotNull
    public final BasicState<String> getEssentialTooltip() {
        return this.essentialTooltip;
    }
    
    @NotNull
    public final MappedState<Pair<Boolean, Boolean>, String> getInviteTooltip() {
        return this.inviteTooltip;
    }
    
    @NotNull
    public final MappedState<Boolean, String> getSocialTooltip() {
        return this.socialTooltip;
    }
    
    @NotNull
    public final MappedState<Boolean, String> getPicturesTooltip() {
        return this.picturesTooltip;
    }
    
    @NotNull
    public final MappedState<Boolean, String> getSettingsTooltip() {
        return this.settingsTooltip;
    }
    
    @NotNull
    public final BasicState<String> getFolderTooltip() {
        return this.folderTooltip;
    }
    
    @NotNull
    public final BasicState<String> getWorldSettingsTooltip() {
        return this.worldSettingsTooltip;
    }
    
    @NotNull
    public final State<Boolean> getWorldSettingsVisible() {
        return this.worldSettingsVisible;
    }
    
    @NotNull
    public final MappedState<String, Boolean> getHasNotices() {
        return this.hasNotices;
    }
    
    @NotNull
    public final NoticeFlag getMessageFlag() {
        return (NoticeFlag)this.messageFlag$delegate.getValue((Object)this, (KProperty)RightSideBar.$$delegatedProperties[0]);
    }
    
    @NotNull
    public final MenuButton getEssentialButton() {
        return (MenuButton)this.essentialButton$delegate.getValue((Object)this, (KProperty)RightSideBar.$$delegatedProperties[1]);
    }
    
    @NotNull
    public final UIComponent getBetaFlag() {
        return (UIComponent)this.betaFlag$delegate.getValue((Object)this, (KProperty)RightSideBar.$$delegatedProperties[2]);
    }
    
    @NotNull
    public final MenuButton getWorldSettings() {
        return (MenuButton)this.worldSettings$delegate.getValue((Object)this, (KProperty)RightSideBar.$$delegatedProperties[3]);
    }
    
    @NotNull
    public final MenuButton getInviteButton() {
        return (MenuButton)this.inviteButton$delegate.getValue((Object)this, (KProperty)RightSideBar.$$delegatedProperties[4]);
    }
    
    @NotNull
    public final MenuButton getSocial() {
        return (MenuButton)this.social$delegate.getValue((Object)this, (KProperty)RightSideBar.$$delegatedProperties[5]);
    }
    
    @NotNull
    public final MenuButton getPictures() {
        return (MenuButton)this.pictures$delegate.getValue((Object)this, (KProperty)RightSideBar.$$delegatedProperties[6]);
    }
    
    @NotNull
    public final MenuButton getSettings() {
        return (MenuButton)this.settings$delegate.getValue((Object)this, (KProperty)RightSideBar.$$delegatedProperties[7]);
    }
    
    @NotNull
    public final MenuButton getFolder() {
        return (MenuButton)this.folder$delegate.getValue((Object)this, (KProperty)RightSideBar.$$delegatedProperties[8]);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)RightSideBar.class, "messageFlag", "getMessageFlag()Lgg/essential/gui/common/NoticeFlag;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)RightSideBar.class, "essentialButton", "getEssentialButton()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)RightSideBar.class, "betaFlag", "getBetaFlag()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)RightSideBar.class, "worldSettings", "getWorldSettings()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)RightSideBar.class, "inviteButton", "getInviteButton()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)RightSideBar.class, "social", "getSocial()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)RightSideBar.class, "pictures", "getPictures()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)RightSideBar.class, "settings", "getSettings()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)RightSideBar.class, "folder", "getFolder()Lgg/essential/gui/common/MenuButton;", 0)) };
    }
}
