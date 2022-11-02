package gg.essential.gui.friends.message.v2;

import kotlin.reflect.*;
import gg.essential.gui.friends.previews.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.friends.*;
import kotlin.properties.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.functions.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.elementa.utils.*;
import com.sparkuniverse.toolbox.chat.model.*;
import gg.essential.elementa.*;
import gg.essential.gui.common.*;
import gg.essential.network.connectionmanager.chat.*;
import java.util.concurrent.*;
import gg.essential.gui.friends.message.*;
import kotlin.text.*;
import gg.essential.*;
import java.net.*;
import kotlin.sequences.*;
import gg.essential.elementa.components.*;
import java.util.function.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.util.*;
import java.util.*;
import java.time.*;
import kotlin.*;
import gg.essential.elementa.dsl.*;
import kotlin.collections.*;
import gg.essential.connectionmanager.common.packet.chat.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000¾\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0010%
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010!
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010F\u001a\u000203H\u0002J\b\u0010G\u001a\u000203H\u0002J\u0010\u0010H\u001a\u0002032\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u000203H\u0016J\u001e\u0010L\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020)2\u0006\u0010I\u001a\u00020JH\u0002J\b\u0010P\u001a\u000203H\u0002J\b\u0010Q\u001a\u000203H\u0002J\u0010\u0010R\u001a\u0002032\u0006\u0010O\u001a\u00020)H\u0016J\u0010\u0010S\u001a\u0002032\u0006\u0010O\u001a\u00020)H\u0016J\u0010\u0010T\u001a\u0002032\u0006\u0010O\u001a\u00020)H\u0002J\u000e\u0010T\u001a\u0002032\u0006\u0010O\u001a\u00020UR&\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010	\u001a\u00020\bX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u001b\u0010
                                                   \u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0013\u0010\u0012\u001a\u00070\u0013¢\u0006\u0002\b\u0014X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R2\u0010\u001a\u001a&\u0012\f\u0012
                                                    \u001d*\u0004\u0018\u00010\u001c0\u001c \u001d*\u0012\u0012\f\u0012
                                                    \u001d*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u001b0\u001bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b"\u0010\u000f\u001a\u0004\b \u0010!R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0(X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020)0+X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b.\u0010/R\u000e\u00100\u001a\u00020\bX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020302X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b8\u0010\u000f\u001a\u0004\b6\u00107R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020)0:X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0<X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010=\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bA\u0010\u000f\u001a\u0004\b?\u0010@R\u001b\u0010B\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bD\u0010\u000f\u001a\u0004\bC\u0010\rR\u000e\u0010E\u001a\u00020\bX\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006V²\u0006
                                                   \u0010W\u001a\u00020XX\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;", "Lgg/essential/gui/friends/message/MessageScreen;", "preview", "Lgg/essential/gui/friends/previews/ChannelPreview;", "(Lgg/essential/gui/friends/previews/ChannelPreview;)V", "active", "Lgg/essential/elementa/state/MappedState;", "Lkotlin/Pair;", "", "addedUnreadDivider", "bottomSpacer", "Lgg/essential/gui/common/Spacer;", "getBottomSpacer", "()Lgg/essential/gui/common/Spacer;", "bottomSpacer$delegate", "Lkotlin/properties/ReadWriteProperty;", "channel", "Lcom/sparkuniverse/toolbox/chat/model/Channel;", "cm", "Lgg/essential/network/connectionmanager/ConnectionManager;", "Lorg/jetbrains/annotations/NotNull;", "content", "Lgg/essential/elementa/components/UIContainer;", "getContent", "()Lgg/essential/elementa/components/UIContainer;", "content$delegate", "contentSortComparator", "Ljava/util/Comparator;", "Lgg/essential/elementa/UIComponent;", "kotlin.jvm.PlatformType", "emptyText", "Lgg/essential/gui/common/shadow/EssentialUIText;", "getEmptyText", "()Lgg/essential/gui/common/shadow/EssentialUIText;", "emptyText$delegate", "gui", "Lgg/essential/gui/friends/SocialMenu;", "lastRequest", "", "messageSubstitutions", "", "Lgg/essential/gui/friends/message/v2/ClientMessage;", "networkObservableMessageList", "Lgg/essential/elementa/utils/ObservableList;", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "observableMessageList", "getPreview", "()Lgg/essential/gui/friends/previews/ChannelPreview;", "receivedAllMessages", "scrollCleanup", "Lkotlin/Function0;", "", "scroller", "Lgg/essential/elementa/components/ScrollComponent;", "getScroller", "()Lgg/essential/elementa/components/ScrollComponent;", "scroller$delegate", "sendQueue", "", "showEmptyText", "Lgg/essential/elementa/state/BasicState;", "standardBar", "Lgg/essential/gui/friends/message/MessageTitleBar;", "getStandardBar", "()Lgg/essential/gui/friends/message/MessageTitleBar;", "standardBar$delegate", "topSpacer", "getTopSpacer", "topSpacer$delegate", "updatingSendQueue", "fakeOutgoingMessageTimestamps", "insertUnreadDivider", "markedManuallyUnread", "messageWrapper", "Lgg/essential/gui/friends/message/v2/MessageWrapper;", "onClose", "parseComponents", "", "Lgg/essential/gui/friends/message/v2/MessageLine;", "message", "recalculateTimestampVisibility", "requestMoreMessages", "retrySend", "scrollToMessage", "sendMessage", "", "essential", "unreadDivider", "Lgg/essential/gui/friends/message/v2/UnreadDividerImpl;" })
public final class ReplyableMessageScreen extends MessageScreen
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ChannelPreview preview;
    @NotNull
    private final SocialMenu gui;
    @NotNull
    private final MappedState<Pair<Boolean, Boolean>, Boolean> active;
    @NotNull
    private final ReadWriteProperty standardBar$delegate;
    @NotNull
    private final ReadWriteProperty scroller$delegate;
    @NotNull
    private final ReadWriteProperty content$delegate;
    @NotNull
    private final BasicState<Boolean> showEmptyText;
    @NotNull
    private final ReadWriteProperty topSpacer$delegate;
    @NotNull
    private final ReadWriteProperty bottomSpacer$delegate;
    @NotNull
    private final Function0<Unit> scrollCleanup;
    private long lastRequest;
    @NotNull
    private final ConnectionManager cm;
    @NotNull
    private final Channel channel;
    private boolean receivedAllMessages;
    @NotNull
    private final ObservableList<Message> networkObservableMessageList;
    @NotNull
    private final ObservableList<ClientMessage> observableMessageList;
    @NotNull
    private final List<ClientMessage> sendQueue;
    @NotNull
    private final Map<ClientMessage, ClientMessage> messageSubstitutions;
    private boolean updatingSendQueue;
    private boolean addedUnreadDivider;
    private final Comparator<UIComponent> contentSortComparator;
    
    public ReplyableMessageScreen(@NotNull final ChannelPreview preview) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "preview"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   gg/essential/gui/friends/message/MessageScreen.<init>:()V
        //    10: aload_0         /* this */
        //    11: aload_1         /* preview */
        //    12: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.preview:Lgg/essential/gui/friends/previews/ChannelPreview;
        //    15: aload_0         /* this */
        //    16: aload_0         /* this */
        //    17: invokevirtual   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getPreview:()Lgg/essential/gui/friends/previews/ChannelPreview;
        //    20: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getGui:()Lgg/essential/gui/friends/SocialMenu;
        //    23: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.gui:Lgg/essential/gui/friends/SocialMenu;
        //    26: aload_0         /* this */
        //    27: aload_0         /* this */
        //    28: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.gui:Lgg/essential/gui/friends/SocialMenu;
        //    31: invokevirtual   gg/essential/gui/friends/SocialMenu.getChatTab:()Lgg/essential/gui/friends/tabs/ChatTab;
        //    34: invokevirtual   gg/essential/gui/friends/tabs/ChatTab.getCurrentMessageView:()Lgg/essential/elementa/state/BasicState;
        //    37: new             Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen$active$1;
        //    40: dup            
        //    41: aload_0         /* this */
        //    42: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen$active$1.<init>:(Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;)V
        //    45: checkcast       Lkotlin/jvm/functions/Function1;
        //    48: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    51: checkcast       Lgg/essential/elementa/state/State;
        //    54: aload_0         /* this */
        //    55: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.gui:Lgg/essential/gui/friends/SocialMenu;
        //    58: invokevirtual   gg/essential/gui/friends/SocialMenu.getSelectedTab:()Lgg/essential/elementa/state/BasicState;
        //    61: getstatic       gg/essential/gui/friends/message/v2/ReplyableMessageScreen$active$2.INSTANCE:Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen$active$2;
        //    64: checkcast       Lkotlin/jvm/functions/Function1;
        //    67: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    70: checkcast       Lgg/essential/elementa/state/State;
        //    73: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //    76: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.active:Lgg/essential/elementa/state/MappedState;
        //    79: aload_0         /* this */
        //    80: new             Lgg/essential/gui/friends/message/MessageTitleBar;
        //    83: dup            
        //    84: aload_0         /* this */
        //    85: checkcast       Lgg/essential/gui/friends/message/MessageScreen;
        //    88: aload_0         /* this */
        //    89: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.gui:Lgg/essential/gui/friends/SocialMenu;
        //    92: invokespecial   gg/essential/gui/friends/message/MessageTitleBar.<init>:(Lgg/essential/gui/friends/message/MessageScreen;Lgg/essential/gui/friends/SocialMenu;)V
        //    95: checkcast       Lgg/essential/elementa/UIComponent;
        //    98: aload_0         /* this */
        //    99: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.gui:Lgg/essential/gui/friends/SocialMenu;
        //   102: invokevirtual   gg/essential/gui/friends/SocialMenu.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //   105: checkcast       Lgg/essential/elementa/UIComponent;
        //   108: aload_0         /* this */
        //   109: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.active:Lgg/essential/elementa/state/MappedState;
        //   112: checkcast       Lgg/essential/elementa/state/State;
        //   115: iconst_0       
        //   116: aconst_null    
        //   117: bipush          12
        //   119: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   122: aload_0         /* this */
        //   123: getstatic       gg/essential/gui/friends/message/v2/ReplyableMessageScreen.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   126: iconst_0       
        //   127: aaload         
        //   128: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   131: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.standardBar$delegate:Lkotlin/properties/ReadWriteProperty;
        //   134: aload_0         /* this */
        //   135: new             Lgg/essential/elementa/components/ScrollComponent;
        //   138: dup            
        //   139: aconst_null    
        //   140: fconst_0       
        //   141: aconst_null    
        //   142: iconst_0       
        //   143: iconst_0       
        //   144: iconst_0       
        //   145: iconst_1       
        //   146: fconst_0       
        //   147: fconst_2       
        //   148: aconst_null    
        //   149: sipush          703
        //   152: aconst_null    
        //   153: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   156: checkcast       Lgg/essential/elementa/UIComponent;
        //   159: astore_2        /* $this$constrain$iv */
        //   160: aload_2         /* $this$constrain$iv */
        //   161: astore          4
        //   163: aload           4
        //   165: astore          $this$constrain_u24lambda_u2d0$iv
        //   167: aload           $this$constrain_u24lambda_u2d0$iv
        //   169: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   172: astore          7
        //   174: astore          14
        //   176: aload           $this$scroller_delegate_u24lambda_u2d0
        //   178: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   181: dup            
        //   182: fconst_0       
        //   183: iconst_0       
        //   184: iconst_3       
        //   185: aconst_null    
        //   186: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   189: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   192: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   195: aload           $this$scroller_delegate_u24lambda_u2d0
        //   197: bipush          100
        //   199: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   202: checkcast       Ljava/lang/Number;
        //   205: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   208: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   211: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   214: aload           $this$scroller_delegate_u24lambda_u2d0
        //   216: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   219: dup            
        //   220: iconst_0       
        //   221: iconst_1       
        //   222: aconst_null    
        //   223: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   226: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   229: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   232: aload           14
        //   234: aload           4
        //   236: aload_0         /* this */
        //   237: checkcast       Lgg/essential/elementa/UIComponent;
        //   240: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   243: aload_0         /* this */
        //   244: getstatic       gg/essential/gui/friends/message/v2/ReplyableMessageScreen.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   247: iconst_1       
        //   248: aaload         
        //   249: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   252: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.scroller$delegate:Lkotlin/properties/ReadWriteProperty;
        //   255: aload_0         /* this */
        //   256: new             Lgg/essential/elementa/components/UIContainer;
        //   259: dup            
        //   260: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   263: checkcast       Lgg/essential/elementa/UIComponent;
        //   266: astore_2        /* $this$constrain$iv */
        //   267: aload_2         /* $this$constrain$iv */
        //   268: astore          4
        //   270: aload           4
        //   272: astore          $this$constrain_u24lambda_u2d0$iv
        //   274: aload           $this$constrain_u24lambda_u2d0$iv
        //   276: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   279: astore          7
        //   281: astore          14
        //   283: aload           $this$content_delegate_u24lambda_u2d1
        //   285: iconst_0       
        //   286: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   289: checkcast       Ljava/lang/Number;
        //   292: iconst_1       
        //   293: iconst_0       
        //   294: iconst_2       
        //   295: aconst_null    
        //   296: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   299: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   302: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   305: aload           $this$content_delegate_u24lambda_u2d1
        //   307: bipush          100
        //   309: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   312: checkcast       Ljava/lang/Number;
        //   315: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   318: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   321: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   324: aload           $this$content_delegate_u24lambda_u2d1
        //   326: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   329: dup            
        //   330: fconst_0       
        //   331: iconst_1       
        //   332: aconst_null    
        //   333: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   336: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   339: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   342: aload           14
        //   344: aload           4
        //   346: aload_0         /* this */
        //   347: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   350: checkcast       Lgg/essential/elementa/UIComponent;
        //   353: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   356: aload_0         /* this */
        //   357: getstatic       gg/essential/gui/friends/message/v2/ReplyableMessageScreen.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   360: iconst_2       
        //   361: aaload         
        //   362: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   365: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.content$delegate:Lkotlin/properties/ReadWriteProperty;
        //   368: aload_0         /* this */
        //   369: new             Lgg/essential/elementa/state/BasicState;
        //   372: dup            
        //   373: iconst_1       
        //   374: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   377: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   380: astore_2       
        //   381: aload_2        
        //   382: astore_3       
        //   383: astore          14
        //   385: aload_0         /* this */
        //   386: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   389: invokevirtual   gg/essential/elementa/components/UIContainer.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //   392: aload_3         /* $this$showEmptyText_u24lambda_u2d4 */
        //   393: aload_0         /* this */
        //   394: invokedynamic   BootstrapMethod #0, update:(Lgg/essential/elementa/state/BasicState;Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;)Ljava/util/Observer;
        //   399: invokevirtual   gg/essential/elementa/utils/ObservableList.addObserver:(Ljava/util/Observer;)V
        //   402: aload           14
        //   404: aload_2        
        //   405: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.showEmptyText:Lgg/essential/elementa/state/BasicState;
        //   408: aload_0         /* this */
        //   409: new             Lgg/essential/gui/common/Spacer;
        //   412: dup            
        //   413: aconst_null    
        //   414: bipush          6
        //   416: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   419: checkcast       Ljava/lang/Number;
        //   422: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   425: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   428: iconst_1       
        //   429: invokespecial   gg/essential/gui/common/Spacer.<init>:(Lgg/essential/elementa/constraints/WidthConstraint;Lgg/essential/elementa/constraints/HeightConstraint;I)V
        //   432: checkcast       Lgg/essential/elementa/UIComponent;
        //   435: aload_0         /* this */
        //   436: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   439: checkcast       Lgg/essential/elementa/UIComponent;
        //   442: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   445: aload_0         /* this */
        //   446: getstatic       gg/essential/gui/friends/message/v2/ReplyableMessageScreen.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   449: iconst_3       
        //   450: aaload         
        //   451: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   454: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.topSpacer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   457: aload_0         /* this */
        //   458: new             Lgg/essential/gui/common/Spacer;
        //   461: dup            
        //   462: aconst_null    
        //   463: bipush          6
        //   465: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   468: checkcast       Ljava/lang/Number;
        //   471: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   474: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   477: iconst_1       
        //   478: invokespecial   gg/essential/gui/common/Spacer.<init>:(Lgg/essential/elementa/constraints/WidthConstraint;Lgg/essential/elementa/constraints/HeightConstraint;I)V
        //   481: checkcast       Lgg/essential/elementa/UIComponent;
        //   484: aload_0         /* this */
        //   485: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   488: checkcast       Lgg/essential/elementa/UIComponent;
        //   491: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   494: aload_0         /* this */
        //   495: getstatic       gg/essential/gui/friends/message/v2/ReplyableMessageScreen.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   498: iconst_4       
        //   499: aaload         
        //   500: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   503: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.bottomSpacer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   506: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   509: dup            
        //   510: ldc_w           "Send a message to begin chatting!"
        //   513: iconst_0       
        //   514: aconst_null    
        //   515: iconst_0       
        //   516: iconst_0       
        //   517: iconst_0       
        //   518: bipush          62
        //   520: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   523: checkcast       Lgg/essential/elementa/UIComponent;
        //   526: astore_2        /* $this$constrain$iv */
        //   527: aload_2         /* $this$constrain$iv */
        //   528: astore          4
        //   530: aload           4
        //   532: astore          $this$constrain_u24lambda_u2d0$iv
        //   534: aload           $this$constrain_u24lambda_u2d0$iv
        //   536: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   539: astore          $this$emptyText_delegate_u24lambda_u2d5
        //   541: aload           $this$emptyText_delegate_u24lambda_u2d5
        //   543: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   546: dup            
        //   547: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   550: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   553: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   556: aload           $this$emptyText_delegate_u24lambda_u2d5
        //   558: bipush          10
        //   560: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   563: checkcast       Ljava/lang/Number;
        //   566: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   569: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   572: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   575: aload           $this$emptyText_delegate_u24lambda_u2d5
        //   577: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //   580: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   583: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   586: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   589: aload           4
        //   591: aload_0         /* this */
        //   592: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   595: invokevirtual   gg/essential/elementa/components/ScrollComponent.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //   598: iconst_0       
        //   599: invokevirtual   gg/essential/elementa/utils/ObservableList.get:(I)Ljava/lang/Object;
        //   602: dup            
        //   603: ldc_w           "scroller.children[0]"
        //   606: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   609: checkcast       Lgg/essential/elementa/UIComponent;
        //   612: aload_0         /* this */
        //   613: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.showEmptyText:Lgg/essential/elementa/state/BasicState;
        //   616: checkcast       Lgg/essential/elementa/state/State;
        //   619: iconst_0       
        //   620: aconst_null    
        //   621: bipush          12
        //   623: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   626: aload_0         /* this */
        //   627: getstatic       gg/essential/gui/friends/message/v2/ReplyableMessageScreen.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   630: iconst_5       
        //   631: aaload         
        //   632: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   635: pop            
        //   636: aload_0         /* this */
        //   637: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //   640: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //   643: dup            
        //   644: ldc_w           "getInstance().connectionManager"
        //   647: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   650: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.cm:Lgg/essential/network/connectionmanager/ConnectionManager;
        //   653: aload_0         /* this */
        //   654: aload_0         /* this */
        //   655: invokevirtual   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getPreview:()Lgg/essential/gui/friends/previews/ChannelPreview;
        //   658: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   661: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.channel:Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   664: aload_0         /* this */
        //   665: aload_0         /* this */
        //   666: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.gui:Lgg/essential/gui/friends/SocialMenu;
        //   669: invokevirtual   gg/essential/gui/friends/SocialMenu.getSocialStateManager:()Lgg/essential/gui/friends/state/SocialStateManager;
        //   672: invokevirtual   gg/essential/gui/friends/state/SocialStateManager.getMessengerStates:()Lgg/essential/gui/friends/state/IMessengerStates;
        //   675: aload_0         /* this */
        //   676: invokevirtual   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getPreview:()Lgg/essential/gui/friends/previews/ChannelPreview;
        //   679: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   682: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //   685: invokeinterface gg/essential/gui/friends/state/IMessengerStates.getObservableMessageList:(J)Lgg/essential/elementa/utils/ObservableList;
        //   690: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.networkObservableMessageList:Lgg/essential/elementa/utils/ObservableList;
        //   693: aload_0         /* this */
        //   694: aload_0         /* this */
        //   695: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.networkObservableMessageList:Lgg/essential/elementa/utils/ObservableList;
        //   698: getstatic       gg/essential/gui/friends/message/v2/ReplyableMessageScreen$observableMessageList$1.INSTANCE:Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen$observableMessageList$1;
        //   701: checkcast       Lkotlin/jvm/functions/Function1;
        //   704: invokestatic    gg/essential/gui/common/StateExtensionsKt.map:(Lgg/essential/elementa/utils/ObservableList;Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/utils/ObservableList;
        //   707: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.observableMessageList:Lgg/essential/elementa/utils/ObservableList;
        //   710: aload_0         /* this */
        //   711: new             Ljava/util/ArrayList;
        //   714: dup            
        //   715: invokespecial   java/util/ArrayList.<init>:()V
        //   718: checkcast       Ljava/util/List;
        //   721: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.sendQueue:Ljava/util/List;
        //   724: aload_0         /* this */
        //   725: new             Ljava/util/LinkedHashMap;
        //   728: dup            
        //   729: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   732: checkcast       Ljava/util/Map;
        //   735: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.messageSubstitutions:Ljava/util/Map;
        //   738: aload_0         /* this */
        //   739: new             Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen$special$$inlined$compareBy$1;
        //   742: dup            
        //   743: aload_0         /* this */
        //   744: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen$special$$inlined$compareBy$1.<init>:(Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;)V
        //   747: checkcast       Ljava/util/Comparator;
        //   750: invokedynamic   BootstrapMethod #1, apply:()Ljava/util/function/Function;
        //   755: invokeinterface java/util/Comparator.thenComparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        //   760: invokedynamic   BootstrapMethod #2, apply:()Ljava/util/function/Function;
        //   765: invokeinterface java/util/Comparator.thenComparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        //   770: invokedynamic   BootstrapMethod #3, apply:()Ljava/util/function/Function;
        //   775: invokeinterface java/util/Comparator.thenComparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        //   780: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.contentSortComparator:Ljava/util/Comparator;
        //   783: aload_0         /* this */
        //   784: invokevirtual   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getPreview:()Lgg/essential/gui/friends/previews/ChannelPreview;
        //   787: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   790: invokestatic    gg/essential/util/ExtensionsKt.isAnnouncement:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Z
        //   793: ifne            845
        //   796: new             Lgg/essential/gui/friends/message/v2/ReplyMessageInput;
        //   799: dup            
        //   800: aload_0         /* this */
        //   801: invokevirtual   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getPreview:()Lgg/essential/gui/friends/previews/ChannelPreview;
        //   804: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getTitleState:()Lgg/essential/elementa/state/MappedState;
        //   807: checkcast       Lgg/essential/elementa/state/State;
        //   810: aload_0         /* this */
        //   811: invokevirtual   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getReplyingTo:()Lgg/essential/elementa/state/BasicState;
        //   814: checkcast       Lgg/essential/elementa/state/State;
        //   817: invokespecial   gg/essential/gui/friends/message/v2/ReplyMessageInput.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V
        //   820: new             Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen$1;
        //   823: dup            
        //   824: aload_0         /* this */
        //   825: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen$1.<init>:(Ljava/lang/Object;)V
        //   828: checkcast       Lkotlin/jvm/functions/Function1;
        //   831: invokevirtual   gg/essential/gui/friends/message/v2/ReplyMessageInput.onSendMessage:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/friends/message/MessageInput;
        //   834: checkcast       Lgg/essential/elementa/UIComponent;
        //   837: aload_0         /* this */
        //   838: checkcast       Lgg/essential/elementa/UIComponent;
        //   841: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   844: pop            
        //   845: aload_0         /* this */
        //   846: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.gui:Lgg/essential/gui/friends/SocialMenu;
        //   849: checkcast       Lgg/essential/api/gui/EssentialGUI;
        //   852: new             Lgg/essential/elementa/state/BasicState;
        //   855: dup            
        //   856: iconst_1       
        //   857: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   860: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   863: checkcast       Lgg/essential/elementa/state/State;
        //   866: aconst_null    
        //   867: aconst_null    
        //   868: aload_0         /* this */
        //   869: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   872: checkcast       Lgg/essential/elementa/UIComponent;
        //   875: iconst_1       
        //   876: bipush          6
        //   878: invokestatic    gg/essential/util/ExtensionsKt.createRightDividerScroller$default$6f501d84:(Lgg/essential/api/gui/EssentialGUI;Lgg/essential/elementa/state/State;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;ZI)Lkotlin/Pair;
        //   881: astore_3       
        //   882: aload_3        
        //   883: invokevirtual   kotlin/Pair.component1:()Ljava/lang/Object;
        //   886: checkcast       Lgg/essential/elementa/components/UIContainer;
        //   889: astore          component
        //   891: aload_3        
        //   892: invokevirtual   kotlin/Pair.component2:()Ljava/lang/Object;
        //   895: checkcast       Lkotlin/jvm/functions/Function0;
        //   898: astore          cleanup
        //   900: aload_0         /* this */
        //   901: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   904: aload           component
        //   906: checkcast       Lgg/essential/elementa/UIComponent;
        //   909: iconst_1       
        //   910: invokevirtual   gg/essential/elementa/components/ScrollComponent.setVerticalScrollBarComponent:(Lgg/essential/elementa/UIComponent;Z)V
        //   913: aload_0         /* this */
        //   914: aload           cleanup
        //   916: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.scrollCleanup:Lkotlin/jvm/functions/Function0;
        //   919: aload_0         /* this */
        //   920: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   923: checkcast       Lgg/essential/elementa/UIComponent;
        //   926: aload_0         /* this */
        //   927: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.observableMessageList:Lgg/essential/elementa/utils/ObservableList;
        //   930: aconst_null    
        //   931: aload_0         /* this */
        //   932: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.contentSortComparator:Ljava/util/Comparator;
        //   935: new             Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen$3;
        //   938: dup            
        //   939: aload_0         /* this */
        //   940: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen$3.<init>:(Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;)V
        //   943: checkcast       Lkotlin/jvm/functions/Function1;
        //   946: iconst_2       
        //   947: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindChildren$default$5794d177:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/utils/ObservableList;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //   950: pop            
        //   951: aload_0         /* this */
        //   952: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.observableMessageList:Lgg/essential/elementa/utils/ObservableList;
        //   955: getstatic       gg/essential/gui/friends/message/v2/ReplyableMessageScreen$messageDates$1.INSTANCE:Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen$messageDates$1;
        //   958: checkcast       Lkotlin/jvm/functions/Function1;
        //   961: invokestatic    gg/essential/gui/common/StateExtensionsKt.mapToSet:(Lgg/essential/elementa/utils/ObservableList;Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/utils/ObservableList;
        //   964: astore_2        /* messageDates */
        //   965: aload_0         /* this */
        //   966: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   969: checkcast       Lgg/essential/elementa/UIComponent;
        //   972: aload_2         /* messageDates */
        //   973: aconst_null    
        //   974: aload_0         /* this */
        //   975: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.contentSortComparator:Ljava/util/Comparator;
        //   978: getstatic       gg/essential/gui/friends/message/v2/ReplyableMessageScreen$4.INSTANCE:Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen$4;
        //   981: checkcast       Lkotlin/jvm/functions/Function1;
        //   984: iconst_2       
        //   985: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindChildren$default$5794d177:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/utils/ObservableList;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //   988: pop            
        //   989: aload_0         /* this */
        //   990: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.observableMessageList:Lgg/essential/elementa/utils/ObservableList;
        //   993: aload_0         /* this */
        //   994: invokedynamic   BootstrapMethod #4, update:(Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;)Ljava/util/Observer;
        //   999: invokevirtual   gg/essential/elementa/utils/ObservableList.addObserver:(Ljava/util/Observer;)V
        //  1002: aload_0         /* this */
        //  1003: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.cm:Lgg/essential/network/connectionmanager/ConnectionManager;
        //  1006: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getChatManager:()Lgg/essential/network/connectionmanager/chat/ChatManager;
        //  1009: aload_0         /* this */
        //  1010: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.channel:Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //  1013: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //  1016: invokevirtual   gg/essential/network/connectionmanager/chat/ChatManager.getMessages:(J)Ljava/util/Map;
        //  1019: astore_3        /* channelMessages */
        //  1020: aload_3         /* channelMessages */
        //  1021: ifnonnull       1045
        //  1024: aload_0         /* this */
        //  1025: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.cm:Lgg/essential/network/connectionmanager/ConnectionManager;
        //  1028: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getChatManager:()Lgg/essential/network/connectionmanager/chat/ChatManager;
        //  1031: aload_0         /* this */
        //  1032: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.channel:Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //  1035: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //  1038: aconst_null    
        //  1039: invokevirtual   gg/essential/network/connectionmanager/chat/ChatManager.retrieveRecentMessageHistory:(JLjava/util/function/Consumer;)V
        //  1042: goto            1253
        //  1045: aload_3         /* channelMessages */
        //  1046: invokeinterface java/util/Map.size:()I
        //  1051: bipush          50
        //  1053: if_icmpge       1253
        //  1056: aload_0         /* this */
        //  1057: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.cm:Lgg/essential/network/connectionmanager/ConnectionManager;
        //  1060: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getChatManager:()Lgg/essential/network/connectionmanager/chat/ChatManager;
        //  1063: aload_0         /* this */
        //  1064: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.channel:Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //  1067: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //  1070: aload_3         /* channelMessages */
        //  1071: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //  1076: checkcast       Ljava/lang/Iterable;
        //  1079: astore          5
        //  1081: lstore          15
        //  1083: astore          14
        //  1085: aload           $this$minByOrNull$iv
        //  1087: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1092: astore          iterator$iv
        //  1094: aload           iterator$iv
        //  1096: invokeinterface java/util/Iterator.hasNext:()Z
        //  1101: ifne            1108
        //  1104: aconst_null    
        //  1105: goto            1213
        //  1108: aload           iterator$iv
        //  1110: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1115: astore          minElem$iv
        //  1117: aload           iterator$iv
        //  1119: invokeinterface java/util/Iterator.hasNext:()Z
        //  1124: ifne            1132
        //  1127: aload           minElem$iv
        //  1129: goto            1213
        //  1132: aload           minElem$iv
        //  1134: checkcast       Lcom/sparkuniverse/toolbox/chat/model/Message;
        //  1137: astore          it
        //  1139: aload           it
        //  1141: ldc_w           "it"
        //  1144: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1147: aload           it
        //  1149: invokestatic    gg/essential/util/ExtensionsKt.getSentTimestamp:(Lcom/sparkuniverse/toolbox/chat/model/Message;)J
        //  1152: lstore          minValue$iv
        //  1154: aload           iterator$iv
        //  1156: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1161: astore          e$iv
        //  1163: aload           e$iv
        //  1165: checkcast       Lcom/sparkuniverse/toolbox/chat/model/Message;
        //  1168: astore          it
        //  1170: aload           it
        //  1172: ldc_w           "it"
        //  1175: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1178: aload           it
        //  1180: invokestatic    gg/essential/util/ExtensionsKt.getSentTimestamp:(Lcom/sparkuniverse/toolbox/chat/model/Message;)J
        //  1183: lstore          v$iv
        //  1185: lload           minValue$iv
        //  1187: lload           v$iv
        //  1189: lcmp           
        //  1190: ifle            1201
        //  1193: aload           e$iv
        //  1195: astore          minElem$iv
        //  1197: lload           v$iv
        //  1199: lstore          minValue$iv
        //  1201: aload           iterator$iv
        //  1203: invokeinterface java/util/Iterator.hasNext:()Z
        //  1208: ifne            1154
        //  1211: aload           minElem$iv
        //  1213: astore          17
        //  1215: aload           14
        //  1217: lload           15
        //  1219: aload           17
        //  1221: checkcast       Lcom/sparkuniverse/toolbox/chat/model/Message;
        //  1224: dup            
        //  1225: ifnull          1237
        //  1228: invokevirtual   com/sparkuniverse/toolbox/chat/model/Message.getId:()J
        //  1231: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1234: goto            1239
        //  1237: pop            
        //  1238: aconst_null    
        //  1239: aconst_null    
        //  1240: bipush          50
        //  1242: aload_3         /* channelMessages */
        //  1243: invokeinterface java/util/Map.size:()I
        //  1248: isub           
        //  1249: aconst_null    
        //  1250: invokevirtual   gg/essential/network/connectionmanager/chat/ChatManager.retrieveMessageHistory:(JLjava/lang/Long;Ljava/lang/Long;ILjava/util/function/Consumer;)V
        //  1253: aload_0         /* this */
        //  1254: invokevirtual   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getReplyingTo:()Lgg/essential/elementa/state/BasicState;
        //  1257: new             Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen$7;
        //  1260: dup            
        //  1261: aload_0         /* this */
        //  1262: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen$7.<init>:(Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;)V
        //  1265: checkcast       Lkotlin/jvm/functions/Function1;
        //  1268: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  1271: pop            
        //  1272: aload_0         /* this */
        //  1273: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //  1276: iconst_0       
        //  1277: new             Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen$8;
        //  1280: dup            
        //  1281: aload_0         /* this */
        //  1282: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen$8.<init>:(Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;)V
        //  1285: checkcast       Lkotlin/jvm/functions/Function2;
        //  1288: invokevirtual   gg/essential/elementa/components/ScrollComponent.addScrollAdjustEvent:(ZLkotlin/jvm/functions/Function2;)V
        //  1291: aload_0         /* this */
        //  1292: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.recalculateTimestampVisibility:()V
        //  1295: aload_0         /* this */
        //  1296: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.insertUnreadDivider:()V
        //  1299: return         
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  preview  
        //    StackMapTable: 00 0A FF 03 4D 00 0F 07 00 02 07 00 9C 07 00 D1 07 00 B5 07 00 D1 07 00 D1 00 07 00 F5 00 00 00 00 00 00 07 00 02 00 00 FF 00 C7 00 0F 07 00 02 07 00 9C 07 01 50 07 01 CD 07 00 D1 07 01 20 07 02 1A 07 00 F5 00 00 00 00 00 00 07 00 02 00 00 FF 00 3E 00 10 07 00 02 07 00 9C 07 01 50 07 01 CD 07 00 D1 07 02 50 07 02 1A 07 02 56 00 00 00 00 00 00 07 02 3E 04 00 00 FF 00 17 00 10 07 00 02 07 00 9C 07 01 50 07 01 CD 07 00 D1 07 02 50 07 02 1A 07 02 56 07 02 5F 00 00 00 00 00 07 02 3E 04 00 00 FF 00 15 00 0F 07 00 02 07 00 9C 07 01 50 07 01 CD 07 00 D1 07 02 50 07 02 1A 07 02 56 07 02 5F 04 00 00 00 07 02 3E 04 00 00 FF 00 2E 00 0E 07 00 02 07 00 9C 07 01 50 07 01 CD 07 00 D1 07 02 50 07 02 1A 07 02 56 07 02 5F 04 07 02 5F 04 07 02 3E 04 00 00 FF 00 0B 00 10 07 00 02 07 00 9C 07 01 50 07 01 CD 07 00 D1 07 02 50 07 02 1A 07 02 56 00 00 00 00 00 00 07 02 3E 04 00 01 07 02 5F FF 00 17 00 11 07 00 02 07 00 9C 07 01 50 07 01 CD 07 00 D1 07 02 50 07 02 1A 07 02 56 00 00 00 00 00 00 07 02 3E 04 07 02 5F 00 03 07 02 3E 04 07 02 61 FF 00 01 00 11 07 00 02 07 00 9C 07 01 50 07 01 CD 07 00 D1 07 02 50 07 02 1A 07 02 56 00 00 00 00 00 00 07 02 3E 04 07 02 5F 00 03 07 02 3E 04 07 02 6A FF 00 0D 00 0F 07 00 02 07 00 9C 07 01 50 07 01 CD 07 00 D1 07 02 5F 07 02 1A 07 02 5F 00 00 00 00 00 00 07 02 5F 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    @Override
    public ChannelPreview getPreview() {
        return this.preview;
    }
    
    private final MessageTitleBar getStandardBar() {
        return (MessageTitleBar)this.standardBar$delegate.getValue((Object)this, (KProperty)ReplyableMessageScreen.$$delegatedProperties[0]);
    }
    
    private final ScrollComponent getScroller() {
        return (ScrollComponent)this.scroller$delegate.getValue((Object)this, (KProperty)ReplyableMessageScreen.$$delegatedProperties[1]);
    }
    
    private final UIContainer getContent() {
        return (UIContainer)this.content$delegate.getValue((Object)this, (KProperty)ReplyableMessageScreen.$$delegatedProperties[2]);
    }
    
    private final Spacer getTopSpacer() {
        return (Spacer)this.topSpacer$delegate.getValue((Object)this, (KProperty)ReplyableMessageScreen.$$delegatedProperties[3]);
    }
    
    private final Spacer getBottomSpacer() {
        return (Spacer)this.bottomSpacer$delegate.getValue((Object)this, (KProperty)ReplyableMessageScreen.$$delegatedProperties[4]);
    }
    
    private final void insertUnreadDivider() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.addedUnreadDivider:Z
        //     4: ifeq            8
        //     7: return         
        //     8: aload_0         /* this */
        //     9: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.gui:Lgg/essential/gui/friends/SocialMenu;
        //    12: invokevirtual   gg/essential/gui/friends/SocialMenu.getSocialStateManager:()Lgg/essential/gui/friends/state/SocialStateManager;
        //    15: invokevirtual   gg/essential/gui/friends/state/SocialStateManager.getMessengerStates:()Lgg/essential/gui/friends/state/IMessengerStates;
        //    18: astore_1        /* messengerStates */
        //    19: aload_0         /* this */
        //    20: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.observableMessageList:Lgg/essential/elementa/utils/ObservableList;
        //    23: checkcast       Ljava/lang/Iterable;
        //    26: astore_3        /* $this$sortedBy$iv */
        //    27: aload_3         /* $this$sortedBy$iv */
        //    28: new             Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen$insertUnreadDivider$$inlined$sortedBy$1;
        //    31: dup            
        //    32: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen$insertUnreadDivider$$inlined$sortedBy$1.<init>:()V
        //    35: checkcast       Ljava/util/Comparator;
        //    38: invokestatic    kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
        //    41: astore_2        /* sortedMessages */
        //    42: aload_2         /* sortedMessages */
        //    43: checkcast       Ljava/lang/Iterable;
        //    46: astore_3        /* $this$none$iv */
        //    47: aload_3         /* $this$none$iv */
        //    48: instanceof      Ljava/util/Collection;
        //    51: ifeq            70
        //    54: aload_3         /* $this$none$iv */
        //    55: checkcast       Ljava/util/Collection;
        //    58: invokeinterface java/util/Collection.isEmpty:()Z
        //    63: ifeq            70
        //    66: iconst_1       
        //    67: goto            132
        //    70: aload_3         /* $this$none$iv */
        //    71: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    76: astore          5
        //    78: aload           5
        //    80: invokeinterface java/util/Iterator.hasNext:()Z
        //    85: ifeq            131
        //    88: aload           5
        //    90: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    95: astore          element$iv
        //    97: aload           element$iv
        //    99: checkcast       Lgg/essential/gui/friends/message/v2/ClientMessage;
        //   102: astore          it
        //   104: aload_1         /* messengerStates */
        //   105: aload           it
        //   107: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getInfraInstance:()Lcom/sparkuniverse/toolbox/chat/model/Message;
        //   110: invokeinterface gg/essential/gui/friends/state/IMessengerStates.getUnreadMessageState:(Lcom/sparkuniverse/toolbox/chat/model/Message;)Lgg/essential/elementa/state/State;
        //   115: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   118: checkcast       Ljava/lang/Boolean;
        //   121: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   124: ifeq            78
        //   127: iconst_0       
        //   128: goto            132
        //   131: iconst_1       
        //   132: ifeq            141
        //   135: aload_0         /* this */
        //   136: iconst_1       
        //   137: putfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.addedUnreadDivider:Z
        //   140: return         
        //   141: aload_2         /* sortedMessages */
        //   142: invokeinterface java/util/List.isEmpty:()Z
        //   147: ifeq            151
        //   150: return         
        //   151: aload_2         /* sortedMessages */
        //   152: invokestatic    kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
        //   155: checkcast       Lgg/essential/gui/friends/message/v2/ClientMessage;
        //   158: astore_3        /* first */
        //   159: aload_1         /* messengerStates */
        //   160: aload_3         /* first */
        //   161: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getInfraInstance:()Lcom/sparkuniverse/toolbox/chat/model/Message;
        //   164: invokeinterface gg/essential/gui/friends/state/IMessengerStates.getUnreadMessageState:(Lcom/sparkuniverse/toolbox/chat/model/Message;)Lgg/essential/elementa/state/State;
        //   169: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   172: checkcast       Ljava/lang/Boolean;
        //   175: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   178: ifeq            194
        //   181: aload_0         /* this */
        //   182: getfield        gg/essential/gui/friends/message/v2/ReplyableMessageScreen.receivedAllMessages:Z
        //   185: ifeq            194
        //   188: aload_0         /* this */
        //   189: aload_3         /* first */
        //   190: invokestatic    gg/essential/gui/friends/message/v2/ReplyableMessageScreen.insertUnreadDivider$insertDividerAt:(Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;Lgg/essential/gui/friends/message/v2/ClientMessage;)V
        //   193: return         
        //   194: aload_2         /* sortedMessages */
        //   195: checkcast       Ljava/lang/Iterable;
        //   198: astore          $this$zipWithNext$iv
        //   200: aload           $this$zipWithNext$iv
        //   202: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   207: astore          iterator$iv
        //   209: aload           iterator$iv
        //   211: invokeinterface java/util/Iterator.hasNext:()Z
        //   216: ifne            226
        //   219: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //   222: pop            
        //   223: goto            363
        //   226: new             Ljava/util/ArrayList;
        //   229: dup            
        //   230: invokespecial   java/util/ArrayList.<init>:()V
        //   233: checkcast       Ljava/util/List;
        //   236: astore          result$iv
        //   238: aload           iterator$iv
        //   240: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   245: astore          current$iv
        //   247: aload           iterator$iv
        //   249: invokeinterface java/util/Iterator.hasNext:()Z
        //   254: ifeq            363
        //   257: aload           iterator$iv
        //   259: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   264: astore          next$iv
        //   266: aload           result$iv
        //   268: aload           current$iv
        //   270: aload           next$iv
        //   272: checkcast       Lgg/essential/gui/friends/message/v2/ClientMessage;
        //   275: astore          10
        //   277: checkcast       Lgg/essential/gui/friends/message/v2/ClientMessage;
        //   280: astore          11
        //   282: astore          14
        //   284: aload_1         /* messengerStates */
        //   285: aload           current
        //   287: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getInfraInstance:()Lcom/sparkuniverse/toolbox/chat/model/Message;
        //   290: invokeinterface gg/essential/gui/friends/state/IMessengerStates.getUnreadMessageState:(Lcom/sparkuniverse/toolbox/chat/model/Message;)Lgg/essential/elementa/state/State;
        //   295: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   298: checkcast       Ljava/lang/Boolean;
        //   301: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   304: istore          currentUnread
        //   306: aload_1         /* messengerStates */
        //   307: aload           next
        //   309: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getInfraInstance:()Lcom/sparkuniverse/toolbox/chat/model/Message;
        //   312: invokeinterface gg/essential/gui/friends/state/IMessengerStates.getUnreadMessageState:(Lcom/sparkuniverse/toolbox/chat/model/Message;)Lgg/essential/elementa/state/State;
        //   317: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   320: checkcast       Ljava/lang/Boolean;
        //   323: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   326: istore          nextUnread
        //   328: iload           currentUnread
        //   330: ifne            345
        //   333: iload           nextUnread
        //   335: ifeq            345
        //   338: aload_0         /* this */
        //   339: aload           next
        //   341: invokestatic    gg/essential/gui/friends/message/v2/ReplyableMessageScreen.insertUnreadDivider$insertDividerAt:(Lgg/essential/gui/friends/message/v2/ReplyableMessageScreen;Lgg/essential/gui/friends/message/v2/ClientMessage;)V
        //   344: return         
        //   345: aload           14
        //   347: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   350: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   355: pop            
        //   356: aload           next$iv
        //   358: astore          current$iv
        //   360: goto            247
        //   363: return         
        //    StackMapTable: 00 0C 08 FE 00 3D 07 01 B3 07 01 C6 07 02 50 FD 00 07 00 07 02 56 34 FF 00 00 00 04 07 00 02 07 01 B3 07 01 C6 07 02 50 00 01 01 08 09 FF 00 2A 00 04 07 00 02 07 01 B3 07 01 C6 07 02 B8 00 00 FE 00 1F 07 02 50 00 07 02 56 FD 00 14 07 01 C6 07 02 5F FF 00 61 00 0F 07 00 02 07 01 B3 07 01 C6 07 02 B8 07 02 50 00 07 02 56 07 01 C6 07 02 5F 07 02 5F 07 02 B8 07 02 B8 01 01 07 01 C6 00 00 FF 00 11 00 07 07 00 02 07 01 B3 07 01 C6 07 02 B8 07 02 50 00 07 02 56 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void requestMoreMessages() {
        final Map<Long, Message> messages2 = this.cm.getChatManager().getMessages(this.channel.getId());
        if (messages2 == null) {
            return;
        }
        final Map messages = messages2;
        final ChatManager chatManager = this.cm.getChatManager();
        final long id = this.channel.getId();
        final Iterable iterable = messages.values();
        final long n = id;
        final ChatManager chatManager2 = chatManager;
        final Iterator iterator = iterable.iterator();
        Comparable comparable;
        if (!iterator.hasNext()) {
            comparable = null;
        }
        else {
            final Message it = (Message)iterator.next();
            Comparable comparable2 = it.getId();
            while (iterator.hasNext()) {
                final Message it2 = (Message)iterator.next();
                final Comparable comparable3 = it2.getId();
                if (comparable2.compareTo(comparable3) > 0) {
                    comparable2 = comparable3;
                }
            }
            comparable = comparable2;
        }
        final Comparable comparable4 = comparable;
        final ChatManager chatManager3 = chatManager2;
        final long channelId = n;
        final Long n2 = (Long)comparable4;
        if (n2 != null) {
            chatManager3.retrieveMessageHistory(channelId, (long)n2, null, ReplyableMessageScreen::requestMoreMessages$lambda-21);
        }
    }
    
    private final void recalculateTimestampVisibility() {
        final long chainStartDelta = TimeUnit.MINUTES.toMillis(5L);
        Long chainStartTime = null;
        for (final UIComponent it : this.getContent().getChildren()) {
            if (!(it instanceof MessageWrapper)) {
                chainStartTime = null;
            }
            else if (chainStartTime != null && ((MessageWrapper)it).previousSiblingIsSameSenderWithinAMinute() && ((MessageWrapper)it).getMessage().getSendTime().toEpochMilli() - chainStartTime <= chainStartDelta) {
                ((MessageWrapper)it).getShowTimestamp().set(false);
            }
            else {
                chainStartTime = ((MessageWrapper)it).getMessage().getSendTime().toEpochMilli();
                ((MessageWrapper)it).getShowTimestamp().set(true);
            }
        }
    }
    
    private final List<MessageLine> parseComponents(final ClientMessage message, final MessageWrapper messageWrapper) {
        final List messages = new ArrayList();
        final String cleanedText = MessageUtils.INSTANCE.handleMarkdownUrls(message.getContents());
        final int trimmedLength = StringsKt.removeSuffix(StringsKt.removePrefix(StringsKt.trim((CharSequence)cleanedText).toString(), (CharSequence)"<"), (CharSequence)">").length();
        boolean messageOnlyContainsEmbeds = false;
        final Sequence $this$forEach$iv = Regex.findAll$default(MessageUtils.INSTANCE.getURL_REGEX(), (CharSequence)cleanedText, 0, 2, (Object)null);
        for (final Object element$iv : $this$forEach$iv) {
            final MatchResult it = (MatchResult)element$iv;
            final String match = StringsKt.removeSuffix(it.getValue(), (CharSequence)">");
            messageOnlyContainsEmbeds = (match.length() >= trimmedLength);
            URL url2;
            try {
                url2 = new URL(match);
            }
            catch (final MalformedURLException e) {
                Essential.logger.debug("Ignoring invalid URL:", (Throwable)e);
                continue;
            }
            final URL url = url2;
            messages.add(new ImageEmbedImpl(url, messageWrapper));
        }
        if (!messageOnlyContainsEmbeds) {
            messages.add(0, new ParagraphLineImpl(messageWrapper, cleanedText));
        }
        return messages;
    }
    
    public final void sendMessage(@NotNull final String message) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "message"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* this */
        //     8: invokevirtual   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getReplyingTo:()Lgg/essential/elementa/state/BasicState;
        //    11: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
        //    14: checkcast       Lgg/essential/gui/friends/message/v2/ClientMessage;
        //    17: astore_2        /* replyingTo */
        //    18: aload_0         /* this */
        //    19: invokevirtual   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getReplyingTo:()Lgg/essential/elementa/state/BasicState;
        //    22: aconst_null    
        //    23: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //    26: aload_1         /* message */
        //    27: checkcast       Ljava/lang/CharSequence;
        //    30: invokestatic    kotlin/text/StringsKt.isBlank:(Ljava/lang/CharSequence;)Z
        //    33: ifeq            37
        //    36: return         
        //    37: aload_0         /* this */
        //    38: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //    41: iconst_0       
        //    42: iconst_1       
        //    43: aconst_null    
        //    44: invokestatic    gg/essential/elementa/components/ScrollComponent.scrollToBottom$default:(Lgg/essential/elementa/components/ScrollComponent;ZILjava/lang/Object;)V
        //    47: getstatic       gg/essential/universal/USound.INSTANCE:Lgg/essential/universal/USound;
        //    50: getstatic       net/minecraft/sound/SoundEvents.BLOCK_NOTE_BLOCK_HAT:Lnet/minecraft/sound/SoundEvent;
        //    53: dup            
        //    54: ldc_w           "BLOCK_NOTE_BLOCK_HAT"
        //    57: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    60: ldc_w           0.25
        //    63: ldc_w           0.75
        //    66: invokevirtual   gg/essential/universal/USound.playSoundStatic:(Lnet/minecraft/sound/SoundEvent;FF)V
        //    69: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //    72: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //    75: ldc_w           "getInstance().connectionManager"
        //    78: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    81: invokestatic    java/lang/System.currentTimeMillis:()J
        //    84: ldc2_w          1609459200
        //    87: lsub           
        //    88: bipush          22
        //    90: lshl           
        //    91: aload_0         /* this */
        //    92: invokevirtual   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getPreview:()Lgg/essential/gui/friends/previews/ChannelPreview;
        //    95: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //    98: invokestatic    gg/essential/util/UUIDUtil.getClientUUID:()Ljava/util/UUID;
        //   101: dup            
        //   102: ldc_w           "getClientUUID()"
        //   105: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   108: aload_1         /* message */
        //   109: getstatic       gg/essential/gui/friends/message/v2/SendState.SENDING:Lgg/essential/gui/friends/message/v2/SendState;
        //   112: aload_2         /* replyingTo */
        //   113: dup            
        //   114: ifnull          168
        //   117: astore          4
        //   119: astore          10
        //   121: astore          9
        //   123: astore          8
        //   125: astore          7
        //   127: lstore          5
        //   129: new             Lgg/essential/gui/friends/message/v2/MessageRef;
        //   132: dup            
        //   133: aload_0         /* this */
        //   134: invokevirtual   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getPreview:()Lgg/essential/gui/friends/previews/ChannelPreview;
        //   137: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   140: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //   143: aload           it
        //   145: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getId:()J
        //   148: invokespecial   gg/essential/gui/friends/message/v2/MessageRef.<init>:(JJ)V
        //   151: astore          11
        //   153: lload           5
        //   155: aload           7
        //   157: aload           8
        //   159: aload           9
        //   161: aload           10
        //   163: aload           11
        //   165: goto            170
        //   168: pop            
        //   169: aconst_null    
        //   170: astore          12
        //   172: astore          13
        //   174: astore          14
        //   176: astore          15
        //   178: astore          16
        //   180: lstore          17
        //   182: new             Lgg/essential/gui/friends/message/v2/ClientMessage;
        //   185: dup            
        //   186: lload           17
        //   188: aload           16
        //   190: aload           15
        //   192: aload           14
        //   194: aload           13
        //   196: aload           12
        //   198: invokespecial   gg/essential/gui/friends/message/v2/ClientMessage.<init>:(JLcom/sparkuniverse/toolbox/chat/model/Channel;Ljava/util/UUID;Ljava/lang/String;Lgg/essential/gui/friends/message/v2/SendState;Lgg/essential/gui/friends/message/v2/MessageRef;)V
        //   201: astore_3        /* fakeMessage */
        //   202: aload_0         /* this */
        //   203: aload_3         /* fakeMessage */
        //   204: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.sendMessage:(Lgg/essential/gui/friends/message/v2/ClientMessage;)V
        //   207: return         
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  message  
        //    StackMapTable: 00 03 FC 00 25 07 02 B8 FF 00 82 00 03 07 00 02 07 03 59 07 02 B8 00 06 04 07 01 AD 07 03 D2 07 03 59 07 03 C6 07 02 B8 FF 00 01 00 03 07 00 02 07 03 59 07 02 B8 00 06 04 07 01 AD 07 03 D2 07 03 59 07 03 C6 07 03 CC
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void fakeOutgoingMessageTimestamps() {
        if (this.sendQueue.isEmpty() || this.updatingSendQueue) {
            return;
        }
        this.updatingSendQueue = true;
        Window.Companion.enqueueRenderOperation((Function0<Unit>)new ReplyableMessageScreen$fakeOutgoingMessageTimestamps.ReplyableMessageScreen$fakeOutgoingMessageTimestamps$1(this));
    }
    
    private final void sendMessage(final ClientMessage message) {
        this.sendQueue.add(message);
        this.observableMessageList.add(message);
        final String trimmed = new Regex("(?<!  )\\n").replace((CharSequence)StringsKt.replace$default(StringsKt.trim((CharSequence)message.getContents()).toString(), "`", "", false, 4, (Object)null), "  \n");
        final ChatManager chatManager = Essential.getInstance().getConnectionManager().getChatManager();
        final long id = message.getChannel().getId();
        final String messageContent = trimmed;
        final MessageRef replyTo = message.getReplyTo();
        chatManager.sendMessage(id, messageContent, (replyTo != null) ? Long.valueOf(replyTo.getMessageId()) : null, ReplyableMessageScreen::sendMessage$lambda-25);
    }
    
    @Override
    public void onClose() {
        this.getStandardBar().hide(true);
        this.scrollCleanup.invoke();
    }
    
    @Override
    public void scrollToMessage(@NotNull final ClientMessage message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        while (true) {
            for (final Object next : this.getContent().getChildren()) {
                final UIComponent it = (UIComponent)next;
                if (it instanceof MessageWrapper && ((MessageWrapper)it).getMessage().getId() == message.getId()) {
                    final UIComponent uiComponent = (UIComponent)next;
                    final UIComponent uiComponent2 = uiComponent;
                    final MessageWrapper messageWrapper = (uiComponent2 instanceof MessageWrapper) ? ((MessageWrapper)uiComponent2) : null;
                    if (messageWrapper == null) {
                        return;
                    }
                    final MessageWrapper component = messageWrapper;
                    ExtensionsKt.scrollToCenterComponent$518015f5(this.getScroller(), component);
                    component.flashHighlight();
                    return;
                }
            }
            final UIComponent uiComponent = null;
            continue;
        }
    }
    
    @Override
    public void retrySend(@NotNull final ClientMessage message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        if (message.getSendState() != SendState.FAILED || !Intrinsics.areEqual((Object)message.getSender(), (Object)UUIDUtil.getClientUUID())) {
            throw new IllegalArgumentException("Message was already sent or was not sent by the client");
        }
        this.observableMessageList.remove(message);
        this.sendMessage(ClientMessage.copy$default$51aa159d(message, 0L, null, null, null, SendState.SENDING, null, 47));
    }
    
    @Override
    public void markedManuallyUnread(@NotNull final MessageWrapper messageWrapper) {
        Intrinsics.checkNotNullParameter((Object)messageWrapper, "messageWrapper");
        ExtensionsKt.holdScrollVerticalLocation(this.getScroller(), messageWrapper, (Function0<Unit>)new ReplyableMessageScreen$markedManuallyUnread.ReplyableMessageScreen$markedManuallyUnread$1(this, messageWrapper));
    }
    
    private static final void showEmptyText$lambda-4$lambda-3(final BasicState $this_apply, final ReplyableMessageScreen this$0, final Observable p2, final Object p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this_apply"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_1         /* this$0 */
        //     8: ldc_w           "this$0"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_0         /* $this_apply */
        //    15: aload_1         /* this$0 */
        //    16: invokespecial   gg/essential/gui/friends/message/v2/ReplyableMessageScreen.getContent:()Lgg/essential/elementa/components/UIContainer;
        //    19: invokevirtual   gg/essential/elementa/components/UIContainer.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //    22: checkcast       Ljava/lang/Iterable;
        //    25: astore          4
        //    27: astore          8
        //    29: aload           $this$none$iv
        //    31: instanceof      Ljava/util/Collection;
        //    34: ifeq            54
        //    37: aload           $this$none$iv
        //    39: checkcast       Ljava/util/Collection;
        //    42: invokeinterface java/util/Collection.isEmpty:()Z
        //    47: ifeq            54
        //    50: iconst_1       
        //    51: goto            102
        //    54: aload           $this$none$iv
        //    56: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    61: astore          5
        //    63: aload           5
        //    65: invokeinterface java/util/Iterator.hasNext:()Z
        //    70: ifeq            101
        //    73: aload           5
        //    75: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    80: astore          element$iv
        //    82: aload           element$iv
        //    84: checkcast       Lgg/essential/elementa/UIComponent;
        //    87: astore          it
        //    89: aload           it
        //    91: instanceof      Lgg/essential/gui/friends/message/v2/MessageWrapper;
        //    94: ifeq            63
        //    97: iconst_0       
        //    98: goto            102
        //   101: iconst_1       
        //   102: istore          9
        //   104: aload           8
        //   106: iload           9
        //   108: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   111: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //   114: return         
        //    StackMapTable: 00 04 FF 00 36 00 09 07 00 B5 07 00 02 07 04 49 07 02 5F 07 02 50 00 00 00 07 00 B5 00 00 FF 00 08 00 09 07 00 B5 07 00 02 07 04 49 07 02 5F 07 02 50 07 02 56 00 00 07 00 B5 00 00 25 FF 00 00 00 09 07 00 B5 07 00 02 07 04 49 07 02 5F 07 02 50 00 00 00 07 00 B5 00 01 01
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final Instant contentSortComparator$lambda-7(final UIComponent uiComponent) {
        Intrinsics.checkNotNullParameter((Object)uiComponent, "uiComponent");
        final MessengerElement component = (MessengerElement)uiComponent;
        Instant instant;
        if (component instanceof final MessageWrapper messageWrapper) {
            instant = messageWrapper.getMessage().getSendTime();
        }
        else {
            if (!(component instanceof Divider)) {
                throw new NoWhenBranchMatchedException();
            }
            instant = ((Divider)component).getTimeStamp();
        }
        return instant;
    }
    
    private static final Integer contentSortComparator$lambda-8(final UIComponent uiComponent) {
        Intrinsics.checkNotNullParameter((Object)uiComponent, "uiComponent");
        final MessengerElement messengerElement = (MessengerElement)uiComponent;
        int i;
        if (messengerElement instanceof MessageWrapper) {
            i = 1;
        }
        else {
            if (!(messengerElement instanceof Divider)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        return i;
    }
    
    private static final Integer contentSortComparator$lambda-9(final UIComponent uiComponent) {
        Intrinsics.checkNotNullParameter((Object)uiComponent, "uiComponent");
        return (uiComponent instanceof UnreadDivider) ? 0 : ((uiComponent instanceof DateDivider) ? 1 : 2);
    }
    
    private static final void _init_$lambda-11(final ReplyableMessageScreen this$0, final Observable observable, final Object arg) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Window.Companion.enqueueRenderOperation((Function0<Unit>)new ReplyableMessageScreen$5.ReplyableMessageScreen$5$1(this$0));
        this$0.insertUnreadDivider();
        this$0.fakeOutgoingMessageTimestamps();
    }
    
    private static final void insertUnreadDivider$insertDividerAtInstant(final ReplyableMessageScreen this$0, final Instant instant) {
        ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf((T)new UnreadDividerImpl(instant), this$0.getContent()), null, ReplyableMessageScreen.$$delegatedProperties[6]);
        final List list = this$0.getContent().getChildren();
        final Comparator<UIComponent> contentSortComparator = this$0.contentSortComparator;
        Intrinsics.checkNotNullExpressionValue((Object)contentSortComparator, "contentSortComparator");
        CollectionsKt.sortWith(list, (Comparator)contentSortComparator);
        this$0.addedUnreadDivider = true;
    }
    
    private static final void insertUnreadDivider$insertDividerAt(final ReplyableMessageScreen this$0, final ClientMessage clientMessage) {
        final List $this$indexOfFirst$iv = this$0.getContent().getChildren();
        int index$iv = 0;
        while (true) {
            for (final Object item$iv : $this$indexOfFirst$iv) {
                final UIComponent it = (UIComponent)item$iv;
                if (it instanceof MessageWrapper && Intrinsics.areEqual((Object)((MessageWrapper)it).getMessage(), (Object)clientMessage)) {
                    final int i = index$iv;
                    final Integer value = i;
                    int index = value.intValue();
                    final int size = this$0.getContent().getChildren().size();
                    final int n = index - 1;
                    final Integer n2 = (0 <= n && n < size) ? value : null;
                    if (n2 != null) {
                        index = n2.intValue();
                        final UIComponent previousSibling = this$0.getContent().getChildren().get(index - 1);
                        if (previousSibling instanceof final DateDivider dateDivider) {
                            insertUnreadDivider$insertDividerAtInstant(this$0, dateDivider.getTimeStamp());
                            return;
                        }
                    }
                    insertUnreadDivider$insertDividerAtInstant(this$0, clientMessage.getSendTime());
                    return;
                }
                ++index$iv;
            }
            final int i = -1;
            continue;
        }
    }
    
    private static final void requestMoreMessages$lambda-21(final ReplyableMessageScreen this$0, final Optional it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        if (!it.isPresent()) {
            return;
        }
        final ServerChatChannelMessagePacket value = it.get();
        final ServerChatChannelMessagePacket serverChatChannelMessagePacket = (value instanceof ServerChatChannelMessagePacket) ? value : null;
        if (serverChatChannelMessagePacket != null) {
            final Message[] messages = serverChatChannelMessagePacket.getMessages();
            if (messages != null) {
                final Message[] receivedMessages = messages;
                if (receivedMessages.length == 0) {
                    this$0.receivedAllMessages = true;
                    this$0.insertUnreadDivider();
                }
            }
        }
    }
    
    private static final void sendMessage$lambda-25(final ReplyableMessageScreen this$0, final ClientMessage $message, final Optional it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$message, "$message");
        this$0.sendQueue.remove($message);
        if (!this$0.observableMessageList.remove($message)) {
            final ClientMessage clientMessage = this$0.messageSubstitutions.remove($message);
            if (clientMessage != null) {
                final ClientMessage substitute = clientMessage;
                this$0.observableMessageList.remove(substitute);
            }
        }
        if (!(it.orElse(null) instanceof ServerChatChannelMessagePacket)) {
            this$0.observableMessageList.add(ClientMessage.copy$default$51aa159d($message, 0L, null, null, null, SendState.FAILED, null, 47));
        }
    }
    
    public static final /* synthetic */ ObservableList access$getObservableMessageList$p(final ReplyableMessageScreen $this) {
        return $this.observableMessageList;
    }
    
    public static final /* synthetic */ List access$getSendQueue$p(final ReplyableMessageScreen $this) {
        return $this.sendQueue;
    }
    
    public static final /* synthetic */ void access$setUpdatingSendQueue$p$14d4a654(final ReplyableMessageScreen $this) {
        $this.updatingSendQueue = false;
    }
    
    public static final /* synthetic */ Map access$getMessageSubstitutions$p(final ReplyableMessageScreen $this) {
        return $this.messageSubstitutions;
    }
    
    public static final /* synthetic */ UIContainer access$getContent(final ReplyableMessageScreen $this) {
        return $this.getContent();
    }
    
    public static final /* synthetic */ void access$insertUnreadDivider(final ReplyableMessageScreen $this) {
        $this.insertUnreadDivider();
    }
    
    public static final /* synthetic */ void access$setAddedUnreadDivider$p$14d4a654(final ReplyableMessageScreen $this) {
        $this.addedUnreadDivider = false;
    }
    
    public static final /* synthetic */ Spacer access$getTopSpacer(final ReplyableMessageScreen $this) {
        return $this.getTopSpacer();
    }
    
    public static final /* synthetic */ Spacer access$getBottomSpacer(final ReplyableMessageScreen $this) {
        return $this.getBottomSpacer();
    }
    
    public static final /* synthetic */ void access$recalculateTimestampVisibility(final ReplyableMessageScreen $this) {
        $this.recalculateTimestampVisibility();
    }
    
    public static final /* synthetic */ List access$parseComponents(final ReplyableMessageScreen $this, final ClientMessage message, final MessageWrapper messageWrapper) {
        return $this.parseComponents(message, messageWrapper);
    }
    
    public static final /* synthetic */ ScrollComponent access$getScroller(final ReplyableMessageScreen $this) {
        return $this.getScroller();
    }
    
    public static final /* synthetic */ long access$getLastRequest$p(final ReplyableMessageScreen $this) {
        return $this.lastRequest;
    }
    
    public static final /* synthetic */ void access$setLastRequest$p(final ReplyableMessageScreen $this, final long <set-?>) {
        $this.lastRequest = <set-?>;
    }
    
    public static final /* synthetic */ void access$requestMoreMessages(final ReplyableMessageScreen $this) {
        $this.requestMoreMessages();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ReplyableMessageScreen.class, "standardBar", "getStandardBar()Lgg/essential/gui/friends/message/MessageTitleBar;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ReplyableMessageScreen.class, "scroller", "getScroller()Lgg/essential/elementa/components/ScrollComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ReplyableMessageScreen.class, "content", "getContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ReplyableMessageScreen.class, "topSpacer", "getTopSpacer()Lgg/essential/gui/common/Spacer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ReplyableMessageScreen.class, "bottomSpacer", "getBottomSpacer()Lgg/essential/gui/common/Spacer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ReplyableMessageScreen.class, "emptyText", "getEmptyText()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ReplyableMessageScreen.class, "unreadDivider", "<v#0>", 0)) };
    }
}
