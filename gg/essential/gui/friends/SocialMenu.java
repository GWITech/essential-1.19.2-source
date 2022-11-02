package gg.essential.gui.friends;

import gg.essential.api.gui.*;
import kotlin.reflect.*;
import gg.essential.gui.friends.state.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.friends.tabs.*;
import gg.essential.gui.friends.previews.*;
import com.sparkuniverse.toolbox.chat.model.*;
import kotlin.*;
import gg.essential.gui.*;
import gg.essential.elementa.state.*;
import java.awt.*;
import gg.essential.gui.friends.message.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import com.sparkuniverse.toolbox.chat.enums.*;
import gg.essential.util.*;
import java.util.concurrent.*;
import gg.essential.*;
import gg.essential.universal.*;
import kotlin.collections.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.connectionmanager.common.packet.social.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.network.connectionmanager.sps.*;
import net.minecraft.client.network.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.config.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000¦\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0011
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0001SB\u0013\b\u0007\u0012
                                                   \b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0002J\u000e\u00105\u001a\u0002002\u0006\u00106\u001a\u000207J\u000e\u00108\u001a\u0002002\u0006\u00106\u001a\u000207J!\u00109\u001a\u0002002\u0012\u0010:\u001a
                                                   \u0012\u0006\b\u0001\u0012\u0002070;"\u000207H\u0002¢\u0006\u0002\u0010<J\u000e\u0010=\u001a\u0002002\u0006\u0010>\u001a\u000207J\b\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u00020@2\u0006\u00106\u001a\u000207H\u0002J\u0010\u0010B\u001a\u00020@2\u0006\u00106\u001a\u000207H\u0002J\b\u0010C\u001a\u00020@H\u0002J\u000e\u0010D\u001a\u0002002\u0006\u0010>\u001a\u000207J\u000e\u0010E\u001a\u0002002\u0006\u0010F\u001a\u00020GJ\u000e\u0010E\u001a\u0002002\u0006\u0010H\u001a\u00020IJ2\u0010J\u001a\u0002002\u0006\u0010F\u001a\u00020G2\u0006\u0010K\u001a\u00020L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002040#2\f\u0010N\u001a\b\u0012\u0004\u0012\u0002000OJ4\u0010P\u001a\u0002002\u0006\u0010H\u001a\u00020I2\u0006\u0010K\u001a\u00020L2\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u0002040#2\f\u0010N\u001a\b\u0012\u0004\u0012\u0002000OJ$\u0010Q\u001a\u0002002\u0006\u0010>\u001a\u0002072\u0006\u0010K\u001a\u00020L2\f\u0010N\u001a\b\u0012\u0004\u0012\u0002000OJ2\u0010Q\u001a\u0002002\u0006\u0010>\u001a\u0002072\u0006\u0010K\u001a\u00020L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002040#2\f\u0010N\u001a\b\u0012\u0004\u0012\u0002000OJ\b\u0010R\u001a\u000200H\u0016R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004
                                                   \u0002\u0010\u0007R\u001b\u0010\b\u001a\u00020	8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\f\u0010\r\u001a\u0004\b
                                                   \u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0016\u0010\r\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001a\u0010\u001b"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b
                                                   \u0000\u001a\u0004\b \u0010!R\u0014\u0010"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010%\u001a\u00020&8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b)\u0010\r\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b.\u0010\u001a\u0004\b,\u0010-¨\u0006T""" }, d2 = { "Lgg/essential/gui/friends/SocialMenu;", "Lgg/essential/api/gui/EssentialGUI;", "Lgg/essential/api/gui/GuiRequiresTOS;", "channelIdToOpen", "", "(Ljava/lang/Long;)V", "channelToRestore", "Ljava/lang/Long;", "chatTab", "Lgg/essential/gui/friends/tabs/ChatTab;", "getChatTab", "()Lgg/essential/gui/friends/tabs/ChatTab;", "chatTab$delegate", "Lkotlin/properties/ReadWriteProperty;", "dividerWidth", "", "getDividerWidth", "()F", "friendsTab", "Lgg/essential/gui/friends/tabs/FriendsTab;", "getFriendsTab", "()Lgg/essential/gui/friends/tabs/FriendsTab;", "friendsTab$delegate", "selectedTab", "Lgg/essential/elementa/state/BasicState;", "Lgg/essential/gui/friends/Tab;", "getSelectedTab", "()Lgg/essential/elementa/state/BasicState;", "setSelectedTab", "(Lgg/essential/elementa/state/BasicState;)V", "socialStateManager", "Lgg/essential/gui/friends/state/SocialStateManager;", "getSocialStateManager", "()Lgg/essential/gui/friends/state/SocialStateManager;", "tabs", "", "Lgg/essential/gui/friends/tabs/TabComponent;", "tabsSelector", "Lgg/essential/gui/friends/TabsSelector;", "getTabsSelector", "()Lgg/essential/gui/friends/TabsSelector;", "tabsSelector$delegate", "titleManagementActions", "Lgg/essential/gui/friends/TitleManagementActions;", "getTitleManagementActions", "()Lgg/essential/gui/friends/TitleManagementActions;", "titleManagementActions$delegate", "addMarkMessagesReadOption", "", "channelId", "options", "", "Lgg/essential/gui/friends/message/OptionMenu$Option;", "handleAddOrRemove", "uuid", "Ljava/util/UUID;", "handleBlockOrUnblock", "handleInvitePlayers", "users", "", "([Ljava/util/UUID;)V", "handleJoinSession", "user", "hasLocalSession", "", "isBlocked", "isFriend", "isJoinableServer", "openMessageFor", "openMessageScreen", "channel", "Lcom/sparkuniverse/toolbox/chat/model/Channel;", "preview", "Lgg/essential/gui/friends/previews/ChannelPreview;", "showGroupDropdown", "position", "Lgg/essential/gui/friends/message/OptionMenu$Position;", "extraOptions", "onClose", "Lkotlin/Function0;", "showManagementDropdown", "showUserDropdown", "updateGuiScale", "Companion", "essential" })
public final class SocialMenu extends EssentialGUI implements GuiRequiresTOS
{
    @NotNull
    public static final Companion Companion;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final SocialStateManager socialStateManager;
    @NotNull
    private BasicState<Tab> selectedTab;
    private final float dividerWidth;
    @NotNull
    private final ReadWriteProperty tabsSelector$delegate;
    @NotNull
    private final ReadWriteProperty chatTab$delegate;
    @NotNull
    private final ReadWriteProperty friendsTab$delegate;
    @NotNull
    private final ReadWriteProperty titleManagementActions$delegate;
    @NotNull
    private final List<TabComponent> tabs;
    @Nullable
    private Long channelToRestore;
    
    @JvmOverloads
    public SocialMenu(@Nullable final Long channelIdToOpen) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       gg/essential/elementa/ElementaVersion.V1:Lgg/essential/elementa/ElementaVersion;
        //     4: ldc             "Social"
        //     6: iconst_0       
        //     7: iconst_0       
        //     8: ldc             "Messaging friends"
        //    10: bipush          12
        //    12: aconst_null    
        //    13: invokespecial   gg/essential/api/gui/EssentialGUI.<init>:(Lgg/essential/elementa/ElementaVersion;Ljava/lang/String;IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    16: aload_0         /* this */
        //    17: new             Lgg/essential/gui/friends/state/SocialStateManager;
        //    20: dup            
        //    21: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //    24: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //    27: dup            
        //    28: ldc             "getInstance().connectionManager"
        //    30: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    33: invokespecial   gg/essential/gui/friends/state/SocialStateManager.<init>:(Lgg/essential/network/connectionmanager/ConnectionManager;)V
        //    36: putfield        gg/essential/gui/friends/SocialMenu.socialStateManager:Lgg/essential/gui/friends/state/SocialStateManager;
        //    39: aload_0         /* this */
        //    40: new             Lgg/essential/elementa/state/BasicState;
        //    43: dup            
        //    44: getstatic       gg/essential/gui/friends/Tab.CHAT:Lgg/essential/gui/friends/Tab;
        //    47: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    50: putfield        gg/essential/gui/friends/SocialMenu.selectedTab:Lgg/essential/elementa/state/BasicState;
        //    53: aload_0         /* this */
        //    54: aload_0         /* this */
        //    55: invokevirtual   gg/essential/gui/friends/SocialMenu.getRightDivider:()Lgg/essential/elementa/components/UIBlock;
        //    58: invokevirtual   gg/essential/elementa/components/UIBlock.getWidth:()F
        //    61: putfield        gg/essential/gui/friends/SocialMenu.dividerWidth:F
        //    64: aload_0         /* this */
        //    65: new             Lgg/essential/gui/friends/TabsSelector;
        //    68: dup            
        //    69: aload_0         /* this */
        //    70: getfield        gg/essential/gui/friends/SocialMenu.selectedTab:Lgg/essential/elementa/state/BasicState;
        //    73: checkcast       Lgg/essential/elementa/state/State;
        //    76: invokespecial   gg/essential/gui/friends/TabsSelector.<init>:(Lgg/essential/elementa/state/State;)V
        //    79: checkcast       Lgg/essential/elementa/UIComponent;
        //    82: astore_2        /* $this$constrain$iv */
        //    83: aload_2         /* $this$constrain$iv */
        //    84: astore_3       
        //    85: aload_3        
        //    86: astore          $this$constrain_u24lambda_u2d0$iv
        //    88: aload           $this$constrain_u24lambda_u2d0$iv
        //    90: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    93: astore          5
        //    95: astore          6
        //    97: aload           $this$tabsSelector_delegate_u24lambda_u2d0
        //    99: sipush          215
        //   102: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   105: checkcast       Ljava/lang/Number;
        //   108: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   111: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   114: bipush          50
        //   116: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   119: checkcast       Ljava/lang/Number;
        //   122: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   125: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   128: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtMost:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtMostConstraint;
        //   131: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   134: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   137: dup            
        //   138: fconst_0       
        //   139: iconst_1       
        //   140: aconst_null    
        //   141: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   144: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   147: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtLeast:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtLeastConstraint;
        //   150: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   153: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   156: aload           $this$tabsSelector_delegate_u24lambda_u2d0
        //   158: bipush          27
        //   160: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   163: checkcast       Ljava/lang/Number;
        //   166: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   169: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   172: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   175: aload           6
        //   177: aload_3        
        //   178: aload_0         /* this */
        //   179: invokevirtual   gg/essential/gui/friends/SocialMenu.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   182: checkcast       Lgg/essential/elementa/UIComponent;
        //   185: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   188: aload_0         /* this */
        //   189: getstatic       gg/essential/gui/friends/SocialMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   192: iconst_0       
        //   193: aaload         
        //   194: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   197: putfield        gg/essential/gui/friends/SocialMenu.tabsSelector$delegate:Lkotlin/properties/ReadWriteProperty;
        //   200: aload_0         /* this */
        //   201: new             Lgg/essential/gui/friends/tabs/ChatTab;
        //   204: dup            
        //   205: aload_0         /* this */
        //   206: aload_0         /* this */
        //   207: getfield        gg/essential/gui/friends/SocialMenu.selectedTab:Lgg/essential/elementa/state/BasicState;
        //   210: checkcast       Lgg/essential/elementa/state/State;
        //   213: invokespecial   gg/essential/gui/friends/tabs/ChatTab.<init>:(Lgg/essential/gui/friends/SocialMenu;Lgg/essential/elementa/state/State;)V
        //   216: checkcast       Lgg/essential/elementa/UIComponent;
        //   219: aload_0         /* this */
        //   220: getstatic       gg/essential/gui/friends/SocialMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   223: iconst_1       
        //   224: aaload         
        //   225: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   228: putfield        gg/essential/gui/friends/SocialMenu.chatTab$delegate:Lkotlin/properties/ReadWriteProperty;
        //   231: aload_0         /* this */
        //   232: new             Lgg/essential/gui/friends/tabs/FriendsTab;
        //   235: dup            
        //   236: aload_0         /* this */
        //   237: aload_0         /* this */
        //   238: getfield        gg/essential/gui/friends/SocialMenu.selectedTab:Lgg/essential/elementa/state/BasicState;
        //   241: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.<init>:(Lgg/essential/gui/friends/SocialMenu;Lgg/essential/elementa/state/BasicState;)V
        //   244: checkcast       Lgg/essential/elementa/UIComponent;
        //   247: aload_0         /* this */
        //   248: getstatic       gg/essential/gui/friends/SocialMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   251: iconst_2       
        //   252: aaload         
        //   253: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   256: putfield        gg/essential/gui/friends/SocialMenu.friendsTab$delegate:Lkotlin/properties/ReadWriteProperty;
        //   259: aload_0         /* this */
        //   260: new             Lgg/essential/gui/friends/TitleManagementActions;
        //   263: dup            
        //   264: aload_0         /* this */
        //   265: invokespecial   gg/essential/gui/friends/TitleManagementActions.<init>:(Lgg/essential/gui/friends/SocialMenu;)V
        //   268: checkcast       Lgg/essential/elementa/UIComponent;
        //   271: astore_2        /* $this$constrain$iv */
        //   272: aload_2         /* $this$constrain$iv */
        //   273: astore_3       
        //   274: aload_3        
        //   275: astore          $this$constrain_u24lambda_u2d0$iv
        //   277: aload           $this$constrain_u24lambda_u2d0$iv
        //   279: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   282: astore          5
        //   284: astore          6
        //   286: aload           $this$titleManagementActions_delegate_u24lambda_u2d1
        //   288: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   291: dup            
        //   292: iconst_0       
        //   293: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   296: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   299: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   302: aload           6
        //   304: aload_3        
        //   305: aload_0         /* this */
        //   306: getfield        gg/essential/gui/friends/SocialMenu.selectedTab:Lgg/essential/elementa/state/BasicState;
        //   309: checkcast       Lgg/essential/elementa/state/State;
        //   312: new             Lgg/essential/gui/friends/SocialMenu$titleManagementActions$3;
        //   315: dup            
        //   316: aload_0         /* this */
        //   317: invokespecial   gg/essential/gui/friends/SocialMenu$titleManagementActions$3.<init>:(Lgg/essential/gui/friends/SocialMenu;)V
        //   320: checkcast       Lkotlin/jvm/functions/Function2;
        //   323: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   326: aload_0         /* this */
        //   327: invokevirtual   gg/essential/gui/friends/SocialMenu.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //   330: checkcast       Lgg/essential/elementa/UIComponent;
        //   333: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   336: aload_0         /* this */
        //   337: getstatic       gg/essential/gui/friends/SocialMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   340: iconst_3       
        //   341: aaload         
        //   342: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   345: putfield        gg/essential/gui/friends/SocialMenu.titleManagementActions$delegate:Lkotlin/properties/ReadWriteProperty;
        //   348: aload_0         /* this */
        //   349: iconst_2       
        //   350: anewarray       Lgg/essential/gui/friends/tabs/TabComponent;
        //   353: astore_2       
        //   354: aload_2        
        //   355: iconst_0       
        //   356: aload_0         /* this */
        //   357: invokevirtual   gg/essential/gui/friends/SocialMenu.getChatTab:()Lgg/essential/gui/friends/tabs/ChatTab;
        //   360: checkcast       Lgg/essential/gui/friends/tabs/TabComponent;
        //   363: aastore        
        //   364: aload_2        
        //   365: iconst_1       
        //   366: aload_0         /* this */
        //   367: invokevirtual   gg/essential/gui/friends/SocialMenu.getFriendsTab:()Lgg/essential/gui/friends/tabs/FriendsTab;
        //   370: checkcast       Lgg/essential/gui/friends/tabs/TabComponent;
        //   373: aastore        
        //   374: aload_2        
        //   375: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        //   378: putfield        gg/essential/gui/friends/SocialMenu.tabs:Ljava/util/List;
        //   381: aload_0         /* this */
        //   382: invokespecial   gg/essential/gui/friends/SocialMenu.getTitleManagementActions:()Lgg/essential/gui/friends/TitleManagementActions;
        //   385: invokevirtual   gg/essential/gui/friends/TitleManagementActions.getSearch:()Lgg/essential/gui/common/EssentialCollapsibleSearchbar;
        //   388: invokevirtual   gg/essential/gui/common/EssentialCollapsibleSearchbar.getTextContent:()Lgg/essential/elementa/state/BasicState;
        //   391: new             Lgg/essential/gui/friends/SocialMenu$1;
        //   394: dup            
        //   395: aload_0         /* this */
        //   396: invokespecial   gg/essential/gui/friends/SocialMenu$1.<init>:(Lgg/essential/gui/friends/SocialMenu;)V
        //   399: checkcast       Lkotlin/jvm/functions/Function1;
        //   402: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   405: pop            
        //   406: aload_0         /* this */
        //   407: invokevirtual   gg/essential/gui/friends/SocialMenu.getChatTab:()Lgg/essential/gui/friends/tabs/ChatTab;
        //   410: invokevirtual   gg/essential/gui/friends/tabs/ChatTab.populate:()V
        //   413: aload_0         /* this */
        //   414: invokevirtual   gg/essential/gui/friends/SocialMenu.getFriendsTab:()Lgg/essential/gui/friends/tabs/FriendsTab;
        //   417: invokevirtual   gg/essential/gui/friends/tabs/FriendsTab.populate:()V
        //   420: aload_1         /* channelIdToOpen */
        //   421: ifnull          465
        //   424: aload_0         /* this */
        //   425: invokevirtual   gg/essential/gui/friends/SocialMenu.getChatTab:()Lgg/essential/gui/friends/tabs/ChatTab;
        //   428: aload_1         /* channelIdToOpen */
        //   429: invokevirtual   java/lang/Long.longValue:()J
        //   432: invokevirtual   gg/essential/gui/friends/tabs/ChatTab.get:(J)Lgg/essential/gui/friends/previews/ChannelPreview;
        //   435: astore_2        /* preview */
        //   436: aload_2         /* preview */
        //   437: ifnull          448
        //   440: aload_0         /* this */
        //   441: aload_2         /* preview */
        //   442: invokevirtual   gg/essential/gui/friends/SocialMenu.openMessageScreen:(Lgg/essential/gui/friends/previews/ChannelPreview;)V
        //   445: goto            472
        //   448: getstatic       gg/essential/Essential.logger:Lorg/apache/logging/log4j/Logger;
        //   451: aload_1         /* channelIdToOpen */
        //   452: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/Long;)Ljava/lang/String;
        //   457: invokeinterface org/apache/logging/log4j/Logger.error:(Ljava/lang/String;)V
        //   462: goto            472
        //   465: aload_0         /* this */
        //   466: invokevirtual   gg/essential/gui/friends/SocialMenu.getChatTab:()Lgg/essential/gui/friends/tabs/ChatTab;
        //   469: invokestatic    gg/essential/gui/friends/tabs/ChatTab.openTopChannel$default$2452020b$74e28fef:(Lgg/essential/gui/friends/tabs/ChatTab;)V
        //   472: aload_0         /* this */
        //   473: getfield        gg/essential/gui/friends/SocialMenu.socialStateManager:Lgg/essential/gui/friends/state/SocialStateManager;
        //   476: invokevirtual   gg/essential/gui/friends/state/SocialStateManager.getMessengerStates:()Lgg/essential/gui/friends/state/IMessengerStates;
        //   479: new             Lgg/essential/gui/friends/SocialMenu$2;
        //   482: dup            
        //   483: aload_0         /* this */
        //   484: invokespecial   gg/essential/gui/friends/SocialMenu$2.<init>:(Lgg/essential/gui/friends/SocialMenu;)V
        //   487: checkcast       Lkotlin/jvm/functions/Function0;
        //   490: invokeinterface gg/essential/gui/friends/state/IMessengerStates.registerResetListener:(Lkotlin/jvm/functions/Function0;)V
        //   495: aload_0         /* this */
        //   496: getfield        gg/essential/gui/friends/SocialMenu.socialStateManager:Lgg/essential/gui/friends/state/SocialStateManager;
        //   499: invokevirtual   gg/essential/gui/friends/state/SocialStateManager.getMessengerStates:()Lgg/essential/gui/friends/state/IMessengerStates;
        //   502: invokeinterface gg/essential/gui/friends/state/IMessengerStates.getObservableChannelList:()Lgg/essential/elementa/utils/ObservableList;
        //   507: new             Lgg/essential/gui/friends/SocialMenu$3;
        //   510: dup            
        //   511: aload_0         /* this */
        //   512: invokespecial   gg/essential/gui/friends/SocialMenu$3.<init>:(Lgg/essential/gui/friends/SocialMenu;)V
        //   515: checkcast       Lkotlin/jvm/functions/Function1;
        //   518: invokestatic    gg/essential/util/ExtensionsKt.onItemAdded:(Lgg/essential/elementa/utils/ObservableList;Lkotlin/jvm/functions/Function1;)V
        //   521: return         
        //    MethodParameters:
        //  Name             Flags  
        //  ---------------  -----
        //  channelIdToOpen  
        //    StackMapTable: 00 03 FF 01 C0 00 07 07 00 02 07 01 7D 07 01 8A 07 00 E3 07 00 E3 07 01 0E 07 00 02 00 00 FF 00 10 00 07 07 00 02 07 01 7D 07 01 A2 07 00 E3 07 00 E3 07 01 0E 07 00 02 00 00 FF 00 06 00 07 07 00 02 07 01 7D 07 01 A8 07 00 E3 07 00 E3 07 01 0E 07 00 02 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public SocialMenu(final byte b) {
        this((Long)null);
    }
    
    @NotNull
    public final SocialStateManager getSocialStateManager() {
        return this.socialStateManager;
    }
    
    @NotNull
    public final BasicState<Tab> getSelectedTab() {
        return this.selectedTab;
    }
    
    public final float getDividerWidth() {
        return this.dividerWidth;
    }
    
    @NotNull
    public final TabsSelector getTabsSelector() {
        return (TabsSelector)this.tabsSelector$delegate.getValue((Object)this, (KProperty)SocialMenu.$$delegatedProperties[0]);
    }
    
    @NotNull
    public final ChatTab getChatTab() {
        return (ChatTab)this.chatTab$delegate.getValue((Object)this, (KProperty)SocialMenu.$$delegatedProperties[1]);
    }
    
    @NotNull
    public final FriendsTab getFriendsTab() {
        return (FriendsTab)this.friendsTab$delegate.getValue((Object)this, (KProperty)SocialMenu.$$delegatedProperties[2]);
    }
    
    private final TitleManagementActions getTitleManagementActions() {
        return (TitleManagementActions)this.titleManagementActions$delegate.getValue((Object)this, (KProperty)SocialMenu.$$delegatedProperties[3]);
    }
    
    @Override
    public void updateGuiScale() {
        this.setNewGuiScale(GuiUtil.INSTANCE.getGuiScale());
        super.updateGuiScale();
    }
    
    public final void openMessageScreen(@NotNull final ChannelPreview preview) {
        Intrinsics.checkNotNullParameter((Object)preview, "preview");
        this.getChatTab().openMessage(preview);
        this.selectedTab.set(Tab.CHAT);
    }
    
    public final void openMessageScreen(@NotNull final Channel channel) {
        Intrinsics.checkNotNullParameter((Object)channel, "channel");
        final ChannelPreview value = this.getChatTab().get(channel.getId());
        if (value != null) {
            final ChannelPreview it = value;
            this.openMessageScreen(it);
        }
    }
    
    public final void openMessageFor(@NotNull final UUID user) {
        Intrinsics.checkNotNullParameter((Object)user, "user");
        final ChannelPreview channelPreview = this.getChatTab().get(user);
        if (channelPreview != null) {
            this.openMessageScreen(channelPreview);
        }
    }
    
    public final void showManagementDropdown(@NotNull final ChannelPreview preview, @NotNull final OptionMenu.Position position, @NotNull final List<OptionMenu.Option> extraOptions, @NotNull final Function0<Unit> onClose) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "preview"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_2         /* position */
        //     8: ldc_w           "position"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_3         /* extraOptions */
        //    15: ldc_w           "extraOptions"
        //    18: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    21: aload           onClose
        //    23: ldc_w           "onClose"
        //    26: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    29: aload_1         /* preview */
        //    30: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getOtherUser:()Ljava/util/UUID;
        //    33: ifnull          94
        //    36: aload_0         /* this */
        //    37: aload_1         /* preview */
        //    38: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getOtherUser:()Ljava/util/UUID;
        //    41: aload_2         /* position */
        //    42: aload_3         /* extraOptions */
        //    43: checkcast       Ljava/util/Collection;
        //    46: invokestatic    kotlin/collections/CollectionsKt.toMutableList:(Ljava/util/Collection;)Ljava/util/List;
        //    49: astore          5
        //    51: aload           5
        //    53: astore          6
        //    55: astore          9
        //    57: astore          8
        //    59: astore          7
        //    61: aload_0         /* this */
        //    62: aload_1         /* preview */
        //    63: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //    66: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //    69: aload           $this$showManagementDropdown_u24lambda_u2d3
        //    71: invokespecial   gg/essential/gui/friends/SocialMenu.addMarkMessagesReadOption:(JLjava/util/List;)V
        //    74: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //    77: pop            
        //    78: aload           7
        //    80: aload           8
        //    82: aload           9
        //    84: aload           5
        //    86: aload           onClose
        //    88: invokevirtual   gg/essential/gui/friends/SocialMenu.showUserDropdown:(Ljava/util/UUID;Lgg/essential/gui/friends/message/OptionMenu$Position;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V
        //    91: goto            127
        //    94: aload_1         /* preview */
        //    95: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //    98: invokestatic    gg/essential/util/ExtensionsKt.isAnnouncement:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Z
        //   101: ifne            119
        //   104: aload_0         /* this */
        //   105: aload_1         /* preview */
        //   106: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   109: aload_2         /* position */
        //   110: aload_3         /* extraOptions */
        //   111: aload           onClose
        //   113: invokevirtual   gg/essential/gui/friends/SocialMenu.showGroupDropdown:(Lcom/sparkuniverse/toolbox/chat/model/Channel;Lgg/essential/gui/friends/message/OptionMenu$Position;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V
        //   116: goto            127
        //   119: aload           onClose
        //   121: invokeinterface kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
        //   126: pop            
        //   127: return         
        //    Signature:
        //  (Lgg/essential/gui/friends/previews/ChannelPreview;Lgg/essential/gui/friends/message/OptionMenu$Position;Ljava/util/List<Lgg/essential/gui/friends/message/OptionMenu$Option;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V
        //    MethodParameters:
        //  Name          Flags  
        //  ------------  -----
        //  preview       
        //  position      
        //  extraOptions  
        //  onClose       
        //    StackMapTable: 00 03 FB 00 5E 18 07
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static /* synthetic */ void showManagementDropdown$default$af9a4a5$3af8509(final SocialMenu socialMenu, final ChannelPreview preview, final OptionMenu.Position position, final Function0 onClose) {
        socialMenu.showManagementDropdown(preview, position, CollectionsKt.emptyList(), (Function0<Unit>)onClose);
    }
    
    private final void addMarkMessagesReadOption(final long channelId, final List<OptionMenu.Option> options) {
        if (this.socialStateManager.getMessengerStates().getUnreadChannelState(channelId).get()) {
            options.add(new OptionMenu.Option("Mark as Read", null, EssentialPalette.MARK_UNREAD, null, null, null, null, (Function0)new SocialMenu$addMarkMessagesReadOption.SocialMenu$addMarkMessagesReadOption$1(this, channelId), 122));
        }
    }
    
    public final void showUserDropdown(@NotNull final UUID user, @NotNull final OptionMenu.Position position, @NotNull final Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter((Object)user, "user");
        Intrinsics.checkNotNullParameter((Object)position, "position");
        Intrinsics.checkNotNullParameter((Object)onClose, "onClose");
        this.showUserDropdown(user, position, CollectionsKt.emptyList(), onClose);
    }
    
    public final void showUserDropdown(@NotNull final UUID user, @NotNull final OptionMenu.Position position, @NotNull final List<OptionMenu.Option> extraOptions, @NotNull final Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter((Object)user, "user");
        Intrinsics.checkNotNullParameter((Object)position, "position");
        Intrinsics.checkNotNullParameter((Object)extraOptions, "extraOptions");
        Intrinsics.checkNotNullParameter((Object)onClose, "onClose");
        final List options = CollectionsKt.toMutableList((Collection)extraOptions);
        if (this.socialStateManager.getStatusStates().getActivity(user).isJoinable()) {
            options.add(new OptionMenu.Option("Join Player", null, EssentialPalette.JOIN_ARROW_5X, EssentialPalette.MESSAGE_SENT, EssentialPalette.MESSAGE_SENT, EssentialPalette.COMPONENT_BACKGROUND, null, (Function0)new SocialMenu$showUserDropdown.SocialMenu$showUserDropdown$1(this, user), 66));
        }
        if (this.hasLocalSession() || this.isJoinableServer()) {
            options.add(new OptionMenu.Option("Invite Player", null, EssentialPalette.INVITE_10X6, EssentialPalette.MESSAGE_SENT, EssentialPalette.MESSAGE_SENT, EssentialPalette.COMPONENT_BACKGROUND, null, (Function0)new SocialMenu$showUserDropdown.SocialMenu$showUserDropdown$2(this, user), 66));
        }
        final MessageScreen messageScreen = this.getChatTab().getCurrentMessageView().get();
        Label_0425: {
            if (this.selectedTab.get() == Tab.FRIENDS) {
                options.add(new OptionMenu.Option("Send Message", null, EssentialPalette.MESSAGE_7X6, null, null, null, null, (Function0)new SocialMenu$showUserDropdown.SocialMenu$showUserDropdown$3(this, user), 122));
            }
            else if (messageScreen != null) {
                final Iterable $this$firstOrNull$iv = this.socialStateManager.getMessengerStates().getObservableChannelList();
                while (true) {
                    for (final Object element$iv : $this$firstOrNull$iv) {
                        final Channel it = (Channel)element$iv;
                        if (Intrinsics.areEqual((Object)ExtensionsKt.getOtherUser(it), (Object)user)) {
                            final Object o = element$iv;
                            final Channel channel = (Channel)o;
                            if (channel != null) {
                                final State muted = this.socialStateManager.getMessengerStates().getMuted(channel.getId());
                                options.add(new OptionMenu.Option(muted.map((Function1)SocialMenu$showUserDropdown.SocialMenu$showUserDropdown$4.INSTANCE), muted.map((Function1)SocialMenu$showUserDropdown.SocialMenu$showUserDropdown$5.INSTANCE), (Function0)new SocialMenu$showUserDropdown.SocialMenu$showUserDropdown$6(muted)));
                            }
                            break Label_0425;
                        }
                    }
                    final Object o = null;
                    continue;
                }
            }
        }
        options.add(new OptionMenu.Option(this.isFriend(user) ? "Remove Friend" : "Add Friend", null, EssentialPalette.INVITE_10X6, null, null, null, null, (Function0)new SocialMenu$showUserDropdown.SocialMenu$showUserDropdown$7(this, user), 122));
        options.add(new OptionMenu.Option(this.isBlocked(user) ? "Unblock Player" : "Block Player", null, EssentialPalette.BLOCK_8X, null, null, null, null, (Function0)new SocialMenu$showUserDropdown.SocialMenu$showUserDropdown$8(this, user), 122));
        final OptionMenu.Companion companion = OptionMenu.Companion;
        final Window window = this.getWindow();
        final Collection thisCollection$iv;
        final Collection $this$toTypedArray$iv = thisCollection$iv = options;
        final OptionMenu.Option[] array = thisCollection$iv.toArray(new OptionMenu.Option[0]);
        Intrinsics.checkNotNull((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final OptionMenu.Option[] original = array;
        companion.create(position, window, Arrays.copyOf(original, original.length), onClose);
    }
    
    public final void showGroupDropdown(@NotNull final Channel channel, @NotNull final OptionMenu.Position position, @NotNull final List<OptionMenu.Option> extraOptions, @NotNull final Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter((Object)channel, "channel");
        Intrinsics.checkNotNullParameter((Object)position, "position");
        Intrinsics.checkNotNullParameter((Object)extraOptions, "extraOptions");
        Intrinsics.checkNotNullParameter((Object)onClose, "onClose");
        final List options = CollectionsKt.toMutableList((Collection)extraOptions);
        this.addMarkMessagesReadOption(channel.getId(), options);
        if (this.hasLocalSession() || this.isJoinableServer()) {
            options.add(new OptionMenu.Option("Invite Group", null, EssentialPalette.INVITE_10X6, EssentialPalette.MESSAGE_SENT, EssentialPalette.MESSAGE_SENT, EssentialPalette.COMPONENT_BACKGROUND, null, (Function0)new SocialMenu$showGroupDropdown.SocialMenu$showGroupDropdown$1(this, channel), 66));
        }
        final State mutedState = this.socialStateManager.getMessengerStates().getMuted(channel.getId());
        if (channel.getType() == ChannelType.GROUP_DIRECT_MESSAGE && Intrinsics.areEqual((Object)channel.getCreatedInfo().getBy(), (Object)UUIDUtil.getClientUUID())) {
            options.add(new OptionMenu.Option("Add Friends", null, EssentialPalette.INVITE_10X6, null, null, null, null, (Function0)new SocialMenu$showGroupDropdown.SocialMenu$showGroupDropdown$2(this, channel), 122));
            options.add(new OptionMenu.Option("Rename Group", null, EssentialPalette.RENAME_8X6, null, null, null, null, (Function0)new SocialMenu$showGroupDropdown.SocialMenu$showGroupDropdown$3(channel, this), 122));
        }
        options.add(new OptionMenu.Option(mutedState.map((Function1)SocialMenu$showGroupDropdown.SocialMenu$showGroupDropdown$4.INSTANCE), mutedState.map((Function1)SocialMenu$showGroupDropdown.SocialMenu$showGroupDropdown$5.INSTANCE), (Function0)new SocialMenu$showGroupDropdown.SocialMenu$showGroupDropdown$6(mutedState)));
        options.add(new OptionMenu.Option("Leave Group", null, EssentialPalette.LEAVE_8X7, null, null, null, null, (Function0)new SocialMenu$showGroupDropdown.SocialMenu$showGroupDropdown$7(this, channel), 122));
        final OptionMenu.Companion companion = OptionMenu.Companion;
        final Window window = this.getWindow();
        final Collection thisCollection$iv;
        final Collection $this$toTypedArray$iv = thisCollection$iv = options;
        final OptionMenu.Option[] array = thisCollection$iv.toArray(new OptionMenu.Option[0]);
        Intrinsics.checkNotNull((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final OptionMenu.Option[] original = array;
        companion.create(position, window, Arrays.copyOf(original, original.length), onClose);
    }
    
    public final void handleJoinSession(@NotNull final UUID user) {
        Intrinsics.checkNotNullParameter((Object)user, "user");
        final CompletableFuture<String> name = UUIDUtil.getName(user);
        Intrinsics.checkNotNullExpressionValue((Object)name, "getName(user)");
        ExtensionsKt.thenAcceptOnMainThread((CompletableFuture<Object>)name, (kotlin.jvm.functions.Function1<? super Object, Unit>)new SocialMenu$handleJoinSession.SocialMenu$handleJoinSession$1(user, this));
    }
    
    private final void handleInvitePlayers(final UUID... users) {
        final ConnectionManager connectionManager2 = Essential.getInstance().getConnectionManager();
        Intrinsics.checkNotNullExpressionValue((Object)connectionManager2, "getInstance().connectionManager");
        final ConnectionManager connectionManager = connectionManager2;
        final SPSManager spsManager2 = connectionManager.getSpsManager();
        Intrinsics.checkNotNullExpressionValue((Object)spsManager2, "connectionManager.spsManager");
        final SPSManager spsManager = spsManager2;
        final ServerInfo currentServerData = UMinecraft.getMinecraft().getCurrentServerEntry();
        if (this.hasLocalSession()) {
            final SPSManager spsManager3 = spsManager;
            final Set<UUID> invitedUsers = spsManager.getInvitedUsers();
            Intrinsics.checkNotNullExpressionValue((Object)invitedUsers, "spsManager.invitedUsers");
            spsManager3.updateInvitedUsers(SetsKt.minus(SetsKt.plus((Set)invitedUsers, (Object[])users), (Object)UUIDUtil.getClientUUID()));
        }
        else if (currentServerData != null) {
            for (int i = 0; i < users.length; ++i) {
                final UUID user = users[i];
                connectionManager.send(new SocialInviteToServerPacket(user, currentServerData.address));
            }
        }
    }
    
    private final boolean hasLocalSession() {
        return Essential.getInstance().getConnectionManager().getSpsManager().getLocalSession() != null;
    }
    
    private final boolean isJoinableServer() {
        final ServerInfo currentServerData = UMinecraft.getMinecraft().getCurrentServerEntry();
        return currentServerData != null && !Essential.getInstance().getConnectionManager().getSpsManager().isSpsAddress(currentServerData.address) && !UMinecraft.getMinecraft().isConnectedToRealms();
    }
    
    private final boolean isBlocked(final UUID uuid) {
        return this.socialStateManager.getRelationshipStates().getObservableBlockedList().contains(uuid);
    }
    
    private final boolean isFriend(final UUID uuid) {
        return this.socialStateManager.getRelationshipStates().getObservableFriendList().contains(uuid);
    }
    
    public final void handleBlockOrUnblock(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final CompletableFuture<String> name = UUIDUtil.getName(uuid);
        Intrinsics.checkNotNullExpressionValue((Object)name, "getName(uuid)");
        ExtensionsKt.thenAcceptOnMainThread((CompletableFuture<Object>)name, (kotlin.jvm.functions.Function1<? super Object, Unit>)new SocialMenu$handleBlockOrUnblock.SocialMenu$handleBlockOrUnblock$1(this, uuid));
    }
    
    public final void handleAddOrRemove(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final CompletableFuture<String> name = UUIDUtil.getName(uuid);
        Intrinsics.checkNotNullExpressionValue((Object)name, "getName(uuid)");
        ExtensionsKt.thenAcceptOnMainThread((CompletableFuture<Object>)name, (kotlin.jvm.functions.Function1<? super Object, Unit>)new SocialMenu$handleAddOrRemove.SocialMenu$handleAddOrRemove$1(this, uuid));
    }
    
    @JvmOverloads
    public SocialMenu() {
        this((byte)0);
    }
    
    @JvmStatic
    @Nullable
    public static final SocialMenu getInstance() {
        return SocialMenu.Companion.getInstance();
    }
    
    public static final /* synthetic */ void access$handleInvitePlayers(final SocialMenu $this, final UUID... users) {
        $this.handleInvitePlayers(users);
    }
    
    public static final /* synthetic */ boolean access$isBlocked(final SocialMenu $this, final UUID uuid) {
        return $this.isBlocked(uuid);
    }
    
    public static final /* synthetic */ boolean access$isFriend(final SocialMenu $this, final UUID uuid) {
        return $this.isFriend(uuid);
    }
    
    public static final /* synthetic */ List access$getTabs$p(final SocialMenu $this) {
        return $this.tabs;
    }
    
    public static final /* synthetic */ void access$setChannelToRestore$p(final SocialMenu $this, final Long <set-?>) {
        $this.channelToRestore = <set-?>;
    }
    
    public static final /* synthetic */ Long access$getChannelToRestore$p(final SocialMenu $this) {
        return $this.channelToRestore;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SocialMenu.class, "tabsSelector", "getTabsSelector()Lgg/essential/gui/friends/TabsSelector;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SocialMenu.class, "chatTab", "getChatTab()Lgg/essential/gui/friends/tabs/ChatTab;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SocialMenu.class, "friendsTab", "getFriendsTab()Lgg/essential/gui/friends/tabs/FriendsTab;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SocialMenu.class, "titleManagementActions", "getTitleManagementActions()Lgg/essential/gui/friends/TitleManagementActions;", 0)) };
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0018
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u0007
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J
                                                       \u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/friends/SocialMenu$Companion;", "", "()V", "getGuiScaleOffset", "", "getInstance", "Lgg/essential/gui/friends/SocialMenu;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @Nullable
        public final SocialMenu getInstance() {
            final Screen openedScreen = GuiUtil.INSTANCE.openedScreen();
            return (openedScreen instanceof SocialMenu) ? ((SocialMenu)openedScreen) : null;
        }
        
        public final float getGuiScaleOffset() {
            return EssentialConfig.INSTANCE.getEnlargeSocialMenuChatMetadata() ? 0.0f : -1.0f;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
