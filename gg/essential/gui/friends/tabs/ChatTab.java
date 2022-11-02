package gg.essential.gui.friends.tabs;

import kotlin.reflect.*;
import gg.essential.network.connectionmanager.*;
import kotlin.properties.*;
import gg.essential.gui.friends.message.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.friends.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.friends.previews.*;
import kotlin.collections.*;
import kotlin.jvm.functions.*;
import kotlin.sequences.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.util.*;
import gg.essential.elementa.utils.*;
import kotlin.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.*;
import com.sparkuniverse.toolbox.chat.model.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u009a\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b
                                                   
                                                   \u0002\u0010 
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010@\u001a\u0004\u0018\u00010-2\u0006\u0010A\u001a\u00020BH\u0086\u0002J\u0013\u0010@\u001a\u0004\u0018\u00010-2\u0006\u0010C\u001a\u00020DH\u0086\u0002J\u000e\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020-J\u0012\u0010H\u001a\u00020F2
                                                   \b\u0002\u0010I\u001a\u0004\u0018\u00010JJ\b\u0010K\u001a\u00020FH\u0016R\u001b\u0010\b\u001a\u00020	8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\f\u0010\r\u001a\u0004\b
                                                   \u0010\u000bR\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0013\u0010\u0012\u001a\u00070\u0013¢\u0006\u0002\b\u0014X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0013\u0010\u0015\u001a\u00070\u0016¢\u0006\u0002\b\u0014X\u0082\u0004¢\u0006\u0002
                                                   \u0000R"\u0010\u0017\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001a\u0010\u001b"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b"\u0010\r\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b%\u0010\r\u001a\u0004\b$\u0010!R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b*\u0010\r\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020201X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u00103\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b5\u0010\r\u001a\u0004\b4\u0010!R\u001b\u00106\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b8\u0010\r\u001a\u0004\b7\u0010)R\u001b\u00109\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b;\u0010\r\u001a\u0004\b:\u0010!R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020	0=X\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b>\u0010?¨\u0006L""" }, d2 = { "Lgg/essential/gui/friends/tabs/ChatTab;", "Lgg/essential/gui/friends/tabs/TabComponent;", "gui", "Lgg/essential/gui/friends/SocialMenu;", "selectedTab", "Lgg/essential/elementa/state/State;", "Lgg/essential/gui/friends/Tab;", "(Lgg/essential/gui/friends/SocialMenu;Lgg/essential/elementa/state/State;)V", "channelListScroller", "Lgg/essential/elementa/components/ScrollComponent;", "getChannelListScroller", "()Lgg/essential/elementa/components/ScrollComponent;", "channelListScroller$delegate", "Lkotlin/properties/ReadWriteProperty;", "channelSorter", "Ljava/util/Comparator;", "Lgg/essential/elementa/UIComponent;", "Lkotlin/Comparator;", "chatManager", "Lgg/essential/network/connectionmanager/chat/ChatManager;", "Lorg/jetbrains/annotations/NotNull;", "connectionManager", "Lgg/essential/network/connectionmanager/ConnectionManager;", "currentMessageView", "Lgg/essential/elementa/state/BasicState;", "Lgg/essential/gui/friends/message/MessageScreen;", "getCurrentMessageView", "()Lgg/essential/elementa/state/BasicState;", "setCurrentMessageView", "(Lgg/essential/elementa/state/BasicState;)V", "divider", "Lgg/essential/elementa/components/UIBlock;", "getDivider", "()Lgg/essential/elementa/components/UIBlock;", "divider$delegate", "horizontalDivider", "getHorizontalDivider", "horizontalDivider$delegate", "messageScreenArea", "Lgg/essential/elementa/components/UIContainer;", "getMessageScreenArea", "()Lgg/essential/elementa/components/UIContainer;", "messageScreenArea$delegate", "previews", "Lkotlin/sequences/Sequence;", "Lgg/essential/gui/friends/previews/ChannelPreview;", "getPreviews", "()Lkotlin/sequences/Sequence;", "readSorter", "Lkotlin/Function1;", "", "scrollbar", "getScrollbar", "scrollbar$delegate", "scrollbarArea", "getScrollbarArea", "scrollbarArea$delegate", "titleBarNotch", "getTitleBarNotch", "titleBarNotch$delegate", "userLists", "", "getUserLists", "()Ljava/util/List;", "get", "uuid", "Ljava/util/UUID;", "channelId", "", "openMessage", "", "preview", "openTopChannel", "exclude", "Lcom/sparkuniverse/toolbox/chat/model/Channel;", "populate", "essential" })
public final class ChatTab extends TabComponent
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final ReadWriteProperty horizontalDivider$delegate;
    @NotNull
    private final ReadWriteProperty channelListScroller$delegate;
    @NotNull
    private final ReadWriteProperty divider$delegate;
    @NotNull
    private final ReadWriteProperty messageScreenArea$delegate;
    @NotNull
    private final ReadWriteProperty scrollbarArea$delegate;
    @NotNull
    private final ReadWriteProperty scrollbar$delegate;
    @NotNull
    private final List<ScrollComponent> userLists;
    @NotNull
    private final Comparator<UIComponent> channelSorter;
    @NotNull
    private BasicState<MessageScreen> currentMessageView;
    
    public ChatTab(@NotNull final SocialMenu gui, @NotNull final State<Tab> selectedTab) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "gui"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* selectedTab */
        //     7: ldc             "selectedTab"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: getstatic       gg/essential/gui/friends/Tab.CHAT:Lgg/essential/gui/friends/Tab;
        //    16: aload_1         /* gui */
        //    17: aload_2         /* selectedTab */
        //    18: invokespecial   gg/essential/gui/friends/tabs/TabComponent.<init>:(Lgg/essential/gui/friends/Tab;Lgg/essential/gui/friends/SocialMenu;Lgg/essential/elementa/state/State;)V
        //    21: aload_0         /* this */
        //    22: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //    25: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //    28: dup            
        //    29: ldc             "getInstance().connectionManager"
        //    31: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    34: putfield        gg/essential/gui/friends/tabs/ChatTab.connectionManager:Lgg/essential/network/connectionmanager/ConnectionManager;
        //    37: aload_0         /* this */
        //    38: getfield        gg/essential/gui/friends/tabs/ChatTab.connectionManager:Lgg/essential/network/connectionmanager/ConnectionManager;
        //    41: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getChatManager:()Lgg/essential/network/connectionmanager/chat/ChatManager;
        //    44: ldc             "connectionManager.chatManager"
        //    46: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    49: aload_0         /* this */
        //    50: new             Lgg/essential/elementa/components/UIBlock;
        //    53: dup            
        //    54: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //    57: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getDarkDivider:()Ljava/awt/Color;
        //    60: invokevirtual   java/awt/Color.darker:()Ljava/awt/Color;
        //    63: dup            
        //    64: ldc             "VigilancePalette.getDarkDivider().darker()"
        //    66: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    69: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //    72: checkcast       Lgg/essential/elementa/UIComponent;
        //    75: astore_3        /* $this$constrain$iv */
        //    76: aload_3         /* $this$constrain$iv */
        //    77: astore          5
        //    79: aload           5
        //    81: astore          $this$constrain_u24lambda_u2d0$iv
        //    83: aload           $this$constrain_u24lambda_u2d0$iv
        //    85: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    88: astore          7
        //    90: astore          8
        //    92: aload           $this$horizontalDivider_delegate_u24lambda_u2d0
        //    94: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //    97: dup            
        //    98: fconst_0       
        //    99: iconst_0       
        //   100: iconst_3       
        //   101: aconst_null    
        //   102: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   105: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   108: aload_1         /* gui */
        //   109: invokevirtual   gg/essential/gui/friends/SocialMenu.getTabsSelector:()Lgg/essential/gui/friends/TabsSelector;
        //   112: checkcast       Lgg/essential/elementa/UIComponent;
        //   115: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   118: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   121: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   124: aload           $this$horizontalDivider_delegate_u24lambda_u2d0
        //   126: bipush          100
        //   128: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   131: checkcast       Ljava/lang/Number;
        //   134: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   137: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   140: aload_1         /* gui */
        //   141: invokevirtual   gg/essential/gui/friends/SocialMenu.getTabsSelector:()Lgg/essential/gui/friends/TabsSelector;
        //   144: checkcast       Lgg/essential/elementa/UIComponent;
        //   147: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   150: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   153: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   156: aload           $this$horizontalDivider_delegate_u24lambda_u2d0
        //   158: aload_1         /* gui */
        //   159: invokevirtual   gg/essential/gui/friends/SocialMenu.getDividerWidth:()F
        //   162: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   165: checkcast       Ljava/lang/Number;
        //   168: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   171: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   174: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   177: aload           8
        //   179: aload           5
        //   181: aload_0         /* this */
        //   182: checkcast       Lgg/essential/elementa/UIComponent;
        //   185: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   188: aload_0         /* this */
        //   189: getstatic       gg/essential/gui/friends/tabs/ChatTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   192: iconst_0       
        //   193: aaload         
        //   194: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   197: putfield        gg/essential/gui/friends/tabs/ChatTab.horizontalDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //   200: aload_0         /* this */
        //   201: new             Lgg/essential/elementa/components/ScrollComponent;
        //   204: dup            
        //   205: aconst_null    
        //   206: fconst_0       
        //   207: aconst_null    
        //   208: iconst_0       
        //   209: iconst_0       
        //   210: iconst_0       
        //   211: iconst_0       
        //   212: fconst_0       
        //   213: fconst_0       
        //   214: aconst_null    
        //   215: sipush          1023
        //   218: aconst_null    
        //   219: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   222: checkcast       Lgg/essential/elementa/UIComponent;
        //   225: astore_3        /* $this$constrain$iv */
        //   226: aload_3         /* $this$constrain$iv */
        //   227: astore          5
        //   229: aload           5
        //   231: astore          $this$constrain_u24lambda_u2d0$iv
        //   233: aload           $this$constrain_u24lambda_u2d0$iv
        //   235: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   238: astore          7
        //   240: astore          8
        //   242: aload           $this$channelListScroller_delegate_u24lambda_u2d1
        //   244: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   247: dup            
        //   248: fconst_0       
        //   249: iconst_0       
        //   250: iconst_3       
        //   251: aconst_null    
        //   252: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   255: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   258: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   261: aload           $this$channelListScroller_delegate_u24lambda_u2d1
        //   263: bipush          100
        //   265: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   268: checkcast       Ljava/lang/Number;
        //   271: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   274: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   277: aload_0         /* this */
        //   278: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getHorizontalDivider:()Lgg/essential/elementa/components/UIBlock;
        //   281: checkcast       Lgg/essential/elementa/UIComponent;
        //   284: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   287: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   290: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   293: aload           $this$channelListScroller_delegate_u24lambda_u2d1
        //   295: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   298: dup            
        //   299: iconst_0       
        //   300: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //   303: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   306: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   309: aload           8
        //   311: aload           5
        //   313: astore_3        /* $this$constrain$iv */
        //   314: aload_3        
        //   315: checkcast       Lgg/essential/elementa/components/ScrollComponent;
        //   318: astore          4
        //   320: astore          8
        //   322: aload           it
        //   324: invokevirtual   gg/essential/elementa/components/ScrollComponent.getEmptyText:()Lgg/essential/elementa/components/UIWrappedText;
        //   327: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   330: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getDarkText:()Ljava/awt/Color;
        //   333: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   336: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   339: invokevirtual   gg/essential/elementa/components/UIWrappedText.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   342: pop            
        //   343: aload           8
        //   345: aload_3        
        //   346: aload_0         /* this */
        //   347: checkcast       Lgg/essential/elementa/UIComponent;
        //   350: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   353: checkcast       Lgg/essential/elementa/components/ScrollComponent;
        //   356: bipush          40
        //   358: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   361: checkcast       Ljava/lang/Number;
        //   364: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   367: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   370: invokestatic    gg/essential/util/ExtensionsKt.scrollGradient:(Lgg/essential/elementa/components/ScrollComponent;Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/components/ScrollComponent;
        //   373: checkcast       Lgg/essential/elementa/UIComponent;
        //   376: aload_0         /* this */
        //   377: getstatic       gg/essential/gui/friends/tabs/ChatTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   380: iconst_1       
        //   381: aaload         
        //   382: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   385: putfield        gg/essential/gui/friends/tabs/ChatTab.channelListScroller$delegate:Lkotlin/properties/ReadWriteProperty;
        //   388: aload_0         /* this */
        //   389: new             Lgg/essential/elementa/components/UIBlock;
        //   392: dup            
        //   393: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //   396: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   399: checkcast       Lgg/essential/elementa/UIComponent;
        //   402: astore_3        /* $this$constrain$iv */
        //   403: aload_3         /* $this$constrain$iv */
        //   404: astore          5
        //   406: aload           5
        //   408: astore          $this$constrain_u24lambda_u2d0$iv
        //   410: aload           $this$constrain_u24lambda_u2d0$iv
        //   412: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   415: astore          7
        //   417: astore          8
        //   419: aload           $this$divider_delegate_u24lambda_u2d3
        //   421: bipush          100
        //   423: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   426: checkcast       Ljava/lang/Number;
        //   429: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   432: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   435: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   438: aload           $this$divider_delegate_u24lambda_u2d3
        //   440: bipush          100
        //   442: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   445: checkcast       Ljava/lang/Number;
        //   448: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   451: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   454: aload_1         /* gui */
        //   455: invokevirtual   gg/essential/gui/friends/SocialMenu.getRightDivider:()Lgg/essential/elementa/components/UIBlock;
        //   458: checkcast       Lgg/essential/elementa/UIComponent;
        //   461: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   464: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   467: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   470: aload           $this$divider_delegate_u24lambda_u2d3
        //   472: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   475: dup            
        //   476: fconst_0       
        //   477: iconst_0       
        //   478: iconst_3       
        //   479: aconst_null    
        //   480: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   483: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   486: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   489: aload           8
        //   491: aload           5
        //   493: aload_0         /* this */
        //   494: checkcast       Lgg/essential/elementa/UIComponent;
        //   497: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   500: aload_0         /* this */
        //   501: getstatic       gg/essential/gui/friends/tabs/ChatTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   504: iconst_2       
        //   505: aaload         
        //   506: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   509: putfield        gg/essential/gui/friends/tabs/ChatTab.divider$delegate:Lkotlin/properties/ReadWriteProperty;
        //   512: aload_0         /* this */
        //   513: new             Lgg/essential/elementa/components/UIContainer;
        //   516: dup            
        //   517: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   520: checkcast       Lgg/essential/elementa/UIComponent;
        //   523: astore_3        /* $this$constrain$iv */
        //   524: aload_3         /* $this$constrain$iv */
        //   525: astore          5
        //   527: aload           5
        //   529: astore          $this$constrain_u24lambda_u2d0$iv
        //   531: aload           $this$constrain_u24lambda_u2d0$iv
        //   533: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   536: astore          7
        //   538: astore          8
        //   540: aload           $this$messageScreenArea_delegate_u24lambda_u2d4
        //   542: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   545: dup            
        //   546: fconst_0       
        //   547: iconst_0       
        //   548: iconst_3       
        //   549: aconst_null    
        //   550: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   553: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   556: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   559: aload           $this$messageScreenArea_delegate_u24lambda_u2d4
        //   561: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   564: dup            
        //   565: iconst_0       
        //   566: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //   569: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   572: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   575: aload           $this$messageScreenArea_delegate_u24lambda_u2d4
        //   577: bipush          100
        //   579: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   582: checkcast       Ljava/lang/Number;
        //   585: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   588: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   591: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   594: aload           8
        //   596: aload           5
        //   598: aload_0         /* this */
        //   599: checkcast       Lgg/essential/elementa/UIComponent;
        //   602: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   605: aload_0         /* this */
        //   606: getstatic       gg/essential/gui/friends/tabs/ChatTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   609: iconst_3       
        //   610: aaload         
        //   611: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   614: putfield        gg/essential/gui/friends/tabs/ChatTab.messageScreenArea$delegate:Lkotlin/properties/ReadWriteProperty;
        //   617: aload_0         /* this */
        //   618: new             Lgg/essential/elementa/components/UIContainer;
        //   621: dup            
        //   622: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   625: checkcast       Lgg/essential/elementa/UIComponent;
        //   628: astore_3        /* $this$constrain$iv */
        //   629: aload_3         /* $this$constrain$iv */
        //   630: astore          5
        //   632: aload           5
        //   634: astore          $this$constrain_u24lambda_u2d0$iv
        //   636: aload           $this$constrain_u24lambda_u2d0$iv
        //   638: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   641: astore          7
        //   643: astore          8
        //   645: aload           $this$scrollbarArea_delegate_u24lambda_u2d5
        //   647: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   650: dup            
        //   651: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   654: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   657: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   660: aload           $this$scrollbarArea_delegate_u24lambda_u2d5
        //   662: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   665: dup            
        //   666: iconst_0       
        //   667: iconst_1       
        //   668: aconst_null    
        //   669: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   672: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   675: aload_0         /* this */
        //   676: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getChannelListScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   679: checkcast       Lgg/essential/elementa/UIComponent;
        //   682: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   685: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   688: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   691: aload           $this$scrollbarArea_delegate_u24lambda_u2d5
        //   693: bipush          100
        //   695: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   698: checkcast       Ljava/lang/Number;
        //   701: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   704: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   707: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   710: aload           $this$scrollbarArea_delegate_u24lambda_u2d5
        //   712: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   715: dup            
        //   716: iconst_0       
        //   717: iconst_1       
        //   718: aconst_null    
        //   719: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   722: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   725: aload_0         /* this */
        //   726: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getChannelListScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   729: checkcast       Lgg/essential/elementa/UIComponent;
        //   732: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   735: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   738: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   741: aload           8
        //   743: aload           5
        //   745: aload_0         /* this */
        //   746: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getDivider:()Lgg/essential/elementa/components/UIBlock;
        //   749: checkcast       Lgg/essential/elementa/UIComponent;
        //   752: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   755: aload_0         /* this */
        //   756: getstatic       gg/essential/gui/friends/tabs/ChatTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   759: iconst_4       
        //   760: aaload         
        //   761: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   764: putfield        gg/essential/gui/friends/tabs/ChatTab.scrollbarArea$delegate:Lkotlin/properties/ReadWriteProperty;
        //   767: aload_0         /* this */
        //   768: new             Lgg/essential/elementa/components/UIBlock;
        //   771: dup            
        //   772: getstatic       gg/essential/gui/EssentialPalette.SCROLLBAR:Ljava/awt/Color;
        //   775: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   778: checkcast       Lgg/essential/elementa/UIComponent;
        //   781: astore_3        /* $this$constrain$iv */
        //   782: aload_3         /* $this$constrain$iv */
        //   783: astore          5
        //   785: aload           5
        //   787: astore          $this$constrain_u24lambda_u2d0$iv
        //   789: aload           $this$constrain_u24lambda_u2d0$iv
        //   791: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   794: astore          7
        //   796: astore          8
        //   798: aload           $this$scrollbar_delegate_u24lambda_u2d6
        //   800: bipush          100
        //   802: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   805: checkcast       Ljava/lang/Number;
        //   808: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   811: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   814: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   817: aload           $this$scrollbar_delegate_u24lambda_u2d6
        //   819: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   822: dup            
        //   823: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   826: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   829: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   832: aload           8
        //   834: aload           5
        //   836: aload_0         /* this */
        //   837: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getScrollbarArea:()Lgg/essential/elementa/components/UIContainer;
        //   840: checkcast       Lgg/essential/elementa/UIComponent;
        //   843: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   846: aload_0         /* this */
        //   847: getstatic       gg/essential/gui/friends/tabs/ChatTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   850: iconst_5       
        //   851: aaload         
        //   852: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   855: putfield        gg/essential/gui/friends/tabs/ChatTab.scrollbar$delegate:Lkotlin/properties/ReadWriteProperty;
        //   858: new             Lgg/essential/elementa/components/UIBlock;
        //   861: dup            
        //   862: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_HIGHLIGHT:Ljava/awt/Color;
        //   865: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   868: checkcast       Lgg/essential/elementa/UIComponent;
        //   871: astore_3        /* $this$constrain$iv */
        //   872: aload_3         /* $this$constrain$iv */
        //   873: astore          5
        //   875: aload           5
        //   877: astore          $this$constrain_u24lambda_u2d0$iv
        //   879: aload           $this$constrain_u24lambda_u2d0$iv
        //   881: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   884: astore          $this$titleBarNotch_delegate_u24lambda_u2d7
        //   886: aload           $this$titleBarNotch_delegate_u24lambda_u2d7
        //   888: bipush          100
        //   890: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   893: checkcast       Ljava/lang/Number;
        //   896: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   899: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   902: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   905: aload           $this$titleBarNotch_delegate_u24lambda_u2d7
        //   907: bipush          100
        //   909: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   912: checkcast       Ljava/lang/Number;
        //   915: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   918: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   921: aload_0         /* this */
        //   922: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getDivider:()Lgg/essential/elementa/components/UIBlock;
        //   925: checkcast       Lgg/essential/elementa/UIComponent;
        //   928: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   931: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   934: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   937: aload           $this$titleBarNotch_delegate_u24lambda_u2d7
        //   939: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   942: dup            
        //   943: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   946: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   949: aload_0         /* this */
        //   950: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getDivider:()Lgg/essential/elementa/components/UIBlock;
        //   953: checkcast       Lgg/essential/elementa/UIComponent;
        //   956: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   959: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   962: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   965: aload           5
        //   967: aload_1         /* gui */
        //   968: invokevirtual   gg/essential/gui/friends/SocialMenu.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //   971: checkcast       Lgg/essential/elementa/UIComponent;
        //   974: aload_0         /* this */
        //   975: invokevirtual   gg/essential/gui/friends/tabs/ChatTab.getActive:()Lgg/essential/elementa/state/MappedState;
        //   978: checkcast       Lgg/essential/elementa/state/State;
        //   981: iconst_0       
        //   982: aconst_null    
        //   983: bipush          12
        //   985: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   988: aload_0         /* this */
        //   989: getstatic       gg/essential/gui/friends/tabs/ChatTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   992: bipush          6
        //   994: aaload         
        //   995: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   998: pop            
        //   999: aload_0         /* this */
        //  1000: aload_0         /* this */
        //  1001: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getChannelListScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //  1004: invokestatic    kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
        //  1007: putfield        gg/essential/gui/friends/tabs/ChatTab.userLists:Ljava/util/List;
        //  1010: getstatic       gg/essential/gui/friends/tabs/ChatTab$readSorter$1.INSTANCE:Lgg/essential/gui/friends/tabs/ChatTab$readSorter$1;
        //  1013: pop            
        //  1014: aload_0         /* this */
        //  1015: getstatic       gg/essential/gui/common/ScrollSpacer.Companion:Lgg/essential/gui/common/ScrollSpacer$Companion;
        //  1018: invokevirtual   gg/essential/gui/common/ScrollSpacer$Companion.getComparator:()Ljava/util/Comparator;
        //  1021: astore_3       
        //  1022: new             Lgg/essential/gui/friends/tabs/ChatTab$special$$inlined$thenBy$1;
        //  1025: dup            
        //  1026: aload_3        
        //  1027: invokespecial   gg/essential/gui/friends/tabs/ChatTab$special$$inlined$thenBy$1.<init>:(Ljava/util/Comparator;)V
        //  1030: checkcast       Ljava/util/Comparator;
        //  1033: astore_3       
        //  1034: new             Lgg/essential/gui/friends/tabs/ChatTab$special$$inlined$thenByDescending$1;
        //  1037: dup            
        //  1038: aload_3        
        //  1039: invokespecial   gg/essential/gui/friends/tabs/ChatTab$special$$inlined$thenByDescending$1.<init>:(Ljava/util/Comparator;)V
        //  1042: checkcast       Ljava/util/Comparator;
        //  1045: putfield        gg/essential/gui/friends/tabs/ChatTab.channelSorter:Ljava/util/Comparator;
        //  1048: aload_0         /* this */
        //  1049: new             Lgg/essential/elementa/state/BasicState;
        //  1052: dup            
        //  1053: aconst_null    
        //  1054: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1057: putfield        gg/essential/gui/friends/tabs/ChatTab.currentMessageView:Lgg/essential/elementa/state/BasicState;
        //  1060: aload_0         /* this */
        //  1061: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getChannelListScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //  1064: aload_0         /* this */
        //  1065: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getScrollbar:()Lgg/essential/elementa/components/UIBlock;
        //  1068: checkcast       Lgg/essential/elementa/UIComponent;
        //  1071: iconst_1       
        //  1072: invokevirtual   gg/essential/elementa/components/ScrollComponent.setVerticalScrollBarComponent:(Lgg/essential/elementa/UIComponent;Z)V
        //  1075: return         
        //    Signature:
        //  (Lgg/essential/gui/friends/SocialMenu;Lgg/essential/elementa/state/State<Lgg/essential/gui/friends/Tab;>;)V
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  gui          
        //  selectedTab  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIBlock getHorizontalDivider() {
        return (UIBlock)this.horizontalDivider$delegate.getValue((Object)this, (KProperty)ChatTab.$$delegatedProperties[0]);
    }
    
    private final ScrollComponent getChannelListScroller() {
        return (ScrollComponent)this.channelListScroller$delegate.getValue((Object)this, (KProperty)ChatTab.$$delegatedProperties[1]);
    }
    
    private final UIBlock getDivider() {
        return (UIBlock)this.divider$delegate.getValue((Object)this, (KProperty)ChatTab.$$delegatedProperties[2]);
    }
    
    private final UIContainer getMessageScreenArea() {
        return (UIContainer)this.messageScreenArea$delegate.getValue((Object)this, (KProperty)ChatTab.$$delegatedProperties[3]);
    }
    
    private final UIContainer getScrollbarArea() {
        return (UIContainer)this.scrollbarArea$delegate.getValue((Object)this, (KProperty)ChatTab.$$delegatedProperties[4]);
    }
    
    private final UIBlock getScrollbar() {
        return (UIBlock)this.scrollbar$delegate.getValue((Object)this, (KProperty)ChatTab.$$delegatedProperties[5]);
    }
    
    private final Sequence<ChannelPreview> getPreviews() {
        final Sequence $this$filterIsInstance$iv = CollectionsKt.asSequence((Iterable)this.getChannelListScroller().getAllChildren());
        final Sequence filter = SequencesKt.filter($this$filterIsInstance$iv, (Function1)ChatTab$special$$inlined$filterIsInstance$1.INSTANCE);
        Intrinsics.checkNotNull((Object)filter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return (Sequence<ChannelPreview>)filter;
    }
    
    @NotNull
    @Override
    public List<ScrollComponent> getUserLists() {
        return this.userLists;
    }
    
    @NotNull
    public final BasicState<MessageScreen> getCurrentMessageView() {
        return this.currentMessageView;
    }
    
    public void populate() {
        final ObservableList observableChannelList = this.getMessengerStates().getObservableChannelList();
        UIComponent $this$constrain_u24lambda_u2d0$iv;
        UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new ScrollSpacer(true);
        final UIConstraints $this$populate_u24lambda_u2d10 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$populate_u24lambda_u2d10.setWidth(UtilitiesKt.getPercent(100));
        $this$populate_u24lambda_u2d10.setHeight(UtilitiesKt.getPixels(5));
        ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this.getChannelListScroller());
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = new ScrollSpacer(false));
        final UIConstraints $this$populate_u24lambda_u2d11 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$populate_u24lambda_u2d11.setY(new SiblingConstraint(0.0f, false, 3, null));
        $this$populate_u24lambda_u2d11.setWidth(UtilitiesKt.getPercent(100));
        $this$populate_u24lambda_u2d11.setHeight(UtilitiesKt.getPixels(5));
        ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this.getChannelListScroller());
        ExtensionsKt.onItemRemoved((ObservableList<Object>)observableChannelList, (kotlin.jvm.functions.Function1<? super Object, Unit>)new ChatTab$populate.ChatTab$populate$3(this));
        StateExtensionsKt.bindChildren$default$5794d177(this.getChannelListScroller(), observableChannelList, null, this.channelSorter, (Function1)new ChatTab$populate.ChatTab$populate$4(this), 2);
        this.getMessengerStates().onMessageReadChange((Function1<? super Message, Unit>)new ChatTab$populate.ChatTab$populate$5(this));
    }
    
    public final void openTopChannel(@Nullable final Channel exclude) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getChannelListScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //     4: invokevirtual   gg/essential/elementa/components/ScrollComponent.getAllChildren:()Ljava/util/concurrent/CopyOnWriteArrayList;
        //     7: checkcast       Ljava/lang/Iterable;
        //    10: astore_3        /* $this$filterIsInstance$iv */
        //    11: aload_3         /* $this$filterIsInstance$iv */
        //    12: astore          4
        //    14: new             Ljava/util/ArrayList;
        //    17: dup            
        //    18: invokespecial   java/util/ArrayList.<init>:()V
        //    21: checkcast       Ljava/util/Collection;
        //    24: astore          destination$iv$iv
        //    26: aload           $this$filterIsInstanceTo$iv$iv
        //    28: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    33: astore          6
        //    35: aload           6
        //    37: invokeinterface java/util/Iterator.hasNext:()Z
        //    42: ifeq            75
        //    45: aload           6
        //    47: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    52: astore          element$iv$iv
        //    54: aload           element$iv$iv
        //    56: instanceof      Lgg/essential/gui/friends/previews/ChannelPreview;
        //    59: ifeq            35
        //    62: aload           destination$iv$iv
        //    64: aload           element$iv$iv
        //    66: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    71: pop            
        //    72: goto            35
        //    75: aload           destination$iv$iv
        //    77: checkcast       Ljava/util/List;
        //    80: checkcast       Ljava/lang/Iterable;
        //    83: astore_3        /* $this$filter$iv */
        //    84: aload_3         /* $this$filter$iv */
        //    85: astore          4
        //    87: new             Ljava/util/ArrayList;
        //    90: dup            
        //    91: invokespecial   java/util/ArrayList.<init>:()V
        //    94: checkcast       Ljava/util/Collection;
        //    97: astore          destination$iv$iv
        //    99: aload           $this$filterTo$iv$iv
        //   101: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   106: astore          6
        //   108: aload           6
        //   110: invokeinterface java/util/Iterator.hasNext:()Z
        //   115: ifeq            167
        //   118: aload           6
        //   120: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   125: astore          element$iv$iv
        //   127: aload           element$iv$iv
        //   129: checkcast       Lgg/essential/gui/friends/previews/ChannelPreview;
        //   132: astore          it
        //   134: aload           it
        //   136: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   139: aload_1         /* exclude */
        //   140: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   143: ifne            150
        //   146: iconst_1       
        //   147: goto            151
        //   150: iconst_0       
        //   151: ifeq            108
        //   154: aload           destination$iv$iv
        //   156: aload           element$iv$iv
        //   158: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   163: pop            
        //   164: goto            108
        //   167: aload           destination$iv$iv
        //   169: checkcast       Ljava/util/List;
        //   172: checkcast       Ljava/lang/Iterable;
        //   175: aload_0         /* this */
        //   176: getfield        gg/essential/gui/friends/tabs/ChatTab.channelSorter:Ljava/util/Comparator;
        //   179: invokestatic    kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
        //   182: invokestatic    kotlin/collections/CollectionsKt.firstOrNull:(Ljava/util/List;)Ljava/lang/Object;
        //   185: checkcast       Lgg/essential/gui/friends/previews/ChannelPreview;
        //   188: astore_2        /* firstOrNull */
        //   189: aload_2         /* firstOrNull */
        //   190: ifnull          201
        //   193: aload_0         /* this */
        //   194: invokevirtual   gg/essential/gui/friends/tabs/ChatTab.getGui:()Lgg/essential/gui/friends/SocialMenu;
        //   197: aload_2         /* firstOrNull */
        //   198: invokevirtual   gg/essential/gui/friends/SocialMenu.openMessageScreen:(Lgg/essential/gui/friends/previews/ChannelPreview;)V
        //   201: return         
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  exclude  
        //    StackMapTable: 00 07 FF 00 23 00 07 07 00 02 07 01 F8 00 00 00 07 01 F2 07 01 FA 00 00 FA 00 27 FC 00 20 07 01 FA FC 00 29 07 02 14 40 01 FF 00 0F 00 06 07 00 02 00 00 00 00 07 01 F2 00 00 FF 00 21 00 00 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static /* synthetic */ void openTopChannel$default$2452020b$74e28fef(final ChatTab chatTab) {
        chatTab.openTopChannel(null);
    }
    
    @Nullable
    public final ChannelPreview get(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final Sequence $this$firstOrNull$iv = this.getPreviews();
        for (final Object element$iv : $this$firstOrNull$iv) {
            final ChannelPreview it = (ChannelPreview)element$iv;
            if (Intrinsics.areEqual((Object)it.getOtherUser(), (Object)uuid)) {
                final Object o = element$iv;
                return (ChannelPreview)o;
            }
        }
        final Object o = null;
        return (ChannelPreview)o;
    }
    
    @Nullable
    public final ChannelPreview get(final long channelId) {
        final Sequence $this$firstOrNull$iv = this.getPreviews();
        for (final Object element$iv : $this$firstOrNull$iv) {
            final ChannelPreview it = (ChannelPreview)element$iv;
            if (it.getChannel().getId() == channelId) {
                final Object o = element$iv;
                return (ChannelPreview)o;
            }
        }
        final Object o = null;
        return (ChannelPreview)o;
    }
    
    public final void openMessage(@NotNull final ChannelPreview preview) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "preview"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_1         /* preview */
        //     8: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getTop:()F
        //    11: aload_0         /* this */
        //    12: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getChannelListScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //    15: invokevirtual   gg/essential/elementa/components/ScrollComponent.getTop:()F
        //    18: fcmpg          
        //    19: ifge            56
        //    22: aload_0         /* this */
        //    23: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getChannelListScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //    26: fconst_0       
        //    27: aload_0         /* this */
        //    28: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getChannelListScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //    31: invokevirtual   gg/essential/elementa/components/ScrollComponent.getVerticalOffset:()F
        //    34: aload_0         /* this */
        //    35: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getChannelListScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //    38: invokevirtual   gg/essential/elementa/components/ScrollComponent.getTop:()F
        //    41: aload_1         /* preview */
        //    42: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getTop:()F
        //    45: fsub           
        //    46: fadd           
        //    47: iconst_0       
        //    48: iconst_5       
        //    49: aconst_null    
        //    50: invokestatic    gg/essential/elementa/components/ScrollComponent.scrollTo$default:(Lgg/essential/elementa/components/ScrollComponent;FFZILjava/lang/Object;)V
        //    53: goto            102
        //    56: aload_1         /* preview */
        //    57: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getBottom:()F
        //    60: aload_0         /* this */
        //    61: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getChannelListScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //    64: invokevirtual   gg/essential/elementa/components/ScrollComponent.getBottom:()F
        //    67: fcmpl          
        //    68: ifle            102
        //    71: aload_0         /* this */
        //    72: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getChannelListScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //    75: fconst_0       
        //    76: aload_0         /* this */
        //    77: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getChannelListScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //    80: invokevirtual   gg/essential/elementa/components/ScrollComponent.getVerticalOffset:()F
        //    83: aload_0         /* this */
        //    84: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getChannelListScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //    87: invokevirtual   gg/essential/elementa/components/ScrollComponent.getBottom:()F
        //    90: aload_1         /* preview */
        //    91: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getBottom:()F
        //    94: fsub           
        //    95: fadd           
        //    96: iconst_0       
        //    97: iconst_5       
        //    98: aconst_null    
        //    99: invokestatic    gg/essential/elementa/components/ScrollComponent.scrollTo$default:(Lgg/essential/elementa/components/ScrollComponent;FFZILjava/lang/Object;)V
        //   102: aload_1         /* preview */
        //   103: aload_0         /* this */
        //   104: getfield        gg/essential/gui/friends/tabs/ChatTab.currentMessageView:Lgg/essential/elementa/state/BasicState;
        //   107: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
        //   110: checkcast       Lgg/essential/gui/friends/message/MessageScreen;
        //   113: dup            
        //   114: ifnull          123
        //   117: invokevirtual   gg/essential/gui/friends/message/MessageScreen.getPreview:()Lgg/essential/gui/friends/previews/ChannelPreview;
        //   120: goto            125
        //   123: pop            
        //   124: aconst_null    
        //   125: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   128: ifeq            132
        //   131: return         
        //   132: aload_0         /* this */
        //   133: getfield        gg/essential/gui/friends/tabs/ChatTab.currentMessageView:Lgg/essential/elementa/state/BasicState;
        //   136: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
        //   139: checkcast       Lgg/essential/gui/friends/message/MessageScreen;
        //   142: dup            
        //   143: ifnull          152
        //   146: invokevirtual   gg/essential/gui/friends/message/MessageScreen.onClose:()V
        //   149: goto            153
        //   152: pop            
        //   153: aload_0         /* this */
        //   154: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getMessageScreenArea:()Lgg/essential/elementa/components/UIContainer;
        //   157: invokevirtual   gg/essential/elementa/components/UIContainer.clearChildren:()Lgg/essential/elementa/UIComponent;
        //   160: pop            
        //   161: new             Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;
        //   164: dup            
        //   165: aload_1         /* preview */
        //   166: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.<init>:(Lgg/essential/gui/friends/previews/ChannelPreview;)V
        //   169: checkcast       Lgg/essential/gui/friends/message/MessageScreen;
        //   172: astore_2        /* messageScreen */
        //   173: aload_0         /* this */
        //   174: getfield        gg/essential/gui/friends/tabs/ChatTab.currentMessageView:Lgg/essential/elementa/state/BasicState;
        //   177: aload_2         /* messageScreen */
        //   178: checkcast       Lgg/essential/elementa/UIComponent;
        //   181: astore_3        /* $this$constrain$iv */
        //   182: aload_3         /* $this$constrain$iv */
        //   183: astore          4
        //   185: aload           4
        //   187: astore          $this$constrain_u24lambda_u2d0$iv
        //   189: aload           $this$constrain_u24lambda_u2d0$iv
        //   191: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   194: astore          6
        //   196: astore          7
        //   198: aload           $this$openMessage_u24lambda_u2d15
        //   200: bipush          100
        //   202: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   205: checkcast       Ljava/lang/Number;
        //   208: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   211: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   214: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   217: aload           $this$openMessage_u24lambda_u2d15
        //   219: bipush          100
        //   221: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   224: checkcast       Ljava/lang/Number;
        //   227: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   230: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   233: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   236: aload           7
        //   238: aload           4
        //   240: aload_0         /* this */
        //   241: invokespecial   gg/essential/gui/friends/tabs/ChatTab.getMessageScreenArea:()Lgg/essential/elementa/components/UIContainer;
        //   244: checkcast       Lgg/essential/elementa/UIComponent;
        //   247: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   250: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //   253: return         
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  preview  
        //    StackMapTable: 00 07 38 2D FF 00 14 00 02 07 00 02 07 02 04 00 02 07 02 04 07 02 58 FF 00 01 00 02 07 00 02 07 02 04 00 02 07 02 04 07 02 04 06 53 07 02 58 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final /* synthetic */ ScrollComponent access$getChannelListScroller(final ChatTab $this) {
        return $this.getChannelListScroller();
    }
    
    public static final /* synthetic */ Comparator access$getChannelSorter$p(final ChatTab $this) {
        return $this.channelSorter;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ChatTab.class, "horizontalDivider", "getHorizontalDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ChatTab.class, "channelListScroller", "getChannelListScroller()Lgg/essential/elementa/components/ScrollComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ChatTab.class, "divider", "getDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ChatTab.class, "messageScreenArea", "getMessageScreenArea()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ChatTab.class, "scrollbarArea", "getScrollbarArea()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ChatTab.class, "scrollbar", "getScrollbar()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ChatTab.class, "titleBarNotch", "getTitleBarNotch()Lgg/essential/elementa/components/UIBlock;", 0)) };
    }
}
