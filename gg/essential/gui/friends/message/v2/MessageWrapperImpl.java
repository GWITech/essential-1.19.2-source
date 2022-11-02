package gg.essential.gui.friends.message.v2;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.state.*;
import kotlin.properties.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.elementa.constraints.*;
import gg.essential.util.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import gg.essential.gui.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.friends.message.*;
import java.awt.*;
import com.sparkuniverse.toolbox.chat.enums.*;
import gg.essential.elementa.components.*;
import kotlin.*;
import gg.essential.gui.friends.state.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0086\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\fH\u0016J\b\u00102\u001a\u000200H\u0016J\b\u00103\u001a\u000200H\u0016J\b\u00104\u001a\u000200H\u0016J\u0006\u00105\u001a\u000200J\u0018\u00106\u001a\u0002002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\fH\u0016J\b\u0010:\u001a\u000200H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020	0\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010
                                                   \u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020	\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0018\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R2\u0010\u0019\u001a&\u0012\f\u0012
                                                    \u001c*\u0004\u0018\u00010\u001b0\u001b \u001c*\u0012\u0012\f\u0012
                                                    \u001c*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b!\u0010\u0012\u001a\u0004\b\u001f\u0010 R\u0014\u0010"\u001a\b\u0012\u0004\u0012\u00020	0#X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b(\u0010\u0012\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b-\u0010\u0012\u001a\u0004\b+\u0010,R\u000e\u0010.\u001a\u00020	X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006;²\u0006
                                                   \u0010<\u001a\u00020=X\u008a\u0084\u0002²\u0006
                                                   \u0010>\u001a\u00020\u000eX\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/friends/message/v2/MessageWrapperImpl;", "Lgg/essential/gui/friends/message/v2/MessageWrapper;", "message", "Lgg/essential/gui/friends/message/v2/ClientMessage;", "messageScreen", "Lgg/essential/gui/friends/message/MessageScreen;", "(Lgg/essential/gui/friends/message/v2/ClientMessage;Lgg/essential/gui/friends/message/MessageScreen;)V", "markedUnreadManually", "Lgg/essential/elementa/state/BasicState;", "", "messageLines", "", "Lgg/essential/gui/friends/message/v2/MessageLine;", "replyContextContainer", "Lgg/essential/elementa/UIComponent;", "getReplyContextContainer", "()Lgg/essential/elementa/UIComponent;", "replyContextContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "replyTo", "Lgg/essential/gui/friends/message/v2/MessageRef;", "replyToIsDeleted", "Lgg/essential/elementa/state/MappedState;", "replyToWeakState", "Lgg/essential/gui/common/WeakState;", "senderUsernameState", "Lgg/essential/gui/common/ReadOnlyState;", "", "kotlin.jvm.PlatformType", "timestampText", "Lgg/essential/gui/common/shadow/EssentialUIText;", "getTimestampText", "()Lgg/essential/gui/common/shadow/EssentialUIText;", "timestampText$delegate", "unreadState", "Lgg/essential/elementa/state/State;", "usernameText", "Lgg/essential/elementa/components/UIText;", "getUsernameText", "()Lgg/essential/elementa/components/UIText;", "usernameText$delegate", "usernameTimestampBox", "Lgg/essential/elementa/components/UIContainer;", "getUsernameTimestampBox", "()Lgg/essential/elementa/components/UIContainer;", "usernameTimestampBox$delegate", "usernameVisible", "addComponent", "", "line", "animationFrame", "delete", "flashHighlight", "markSelfUnread", "openOptionMenu", "event", "Lgg/essential/elementa/events/UIClickEvent;", "component", "retrySend", "essential", "replyIcon", "Lgg/essential/elementa/components/UIImage;", "replyText" })
public final class MessageWrapperImpl extends MessageWrapper
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final MessageScreen messageScreen;
    @Nullable
    private final MessageRef replyTo;
    @Nullable
    private final WeakState<ClientMessage> replyToWeakState;
    private final ReadOnlyState<String> senderUsernameState;
    @NotNull
    private final List<MessageLine> messageLines;
    @NotNull
    private final BasicState<Boolean> markedUnreadManually;
    @NotNull
    private final State<Boolean> unreadState;
    @NotNull
    private final ReadWriteProperty usernameTimestampBox$delegate;
    private final boolean usernameVisible;
    @NotNull
    private final ReadWriteProperty timestampText$delegate;
    
    public MessageWrapperImpl(@NotNull final ClientMessage message, @NotNull final MessageScreen messageScreen) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "message"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* messageScreen */
        //     7: ldc             "messageScreen"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: aload_1         /* message */
        //    14: invokespecial   gg/essential/gui/friends/message/v2/MessageWrapper.<init>:(Lgg/essential/gui/friends/message/v2/ClientMessage;)V
        //    17: aload_0         /* this */
        //    18: aload_2         /* messageScreen */
        //    19: putfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.messageScreen:Lgg/essential/gui/friends/message/MessageScreen;
        //    22: aload_0         /* this */
        //    23: aload_1         /* message */
        //    24: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getReplyTo:()Lgg/essential/gui/friends/message/v2/MessageRef;
        //    27: putfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.replyTo:Lgg/essential/gui/friends/message/v2/MessageRef;
        //    30: aload_0         /* this */
        //    31: aload_0         /* this */
        //    32: getfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.replyTo:Lgg/essential/gui/friends/message/v2/MessageRef;
        //    35: dup            
        //    36: ifnull          45
        //    39: invokevirtual   gg/essential/gui/friends/message/v2/MessageRef.getAsWeakState:()Lgg/essential/gui/common/WeakState;
        //    42: goto            47
        //    45: pop            
        //    46: aconst_null    
        //    47: putfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.replyToWeakState:Lgg/essential/gui/common/WeakState;
        //    50: aload_0         /* this */
        //    51: getfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.replyToWeakState:Lgg/essential/gui/common/WeakState;
        //    54: dup            
        //    55: ifnull          71
        //    58: getstatic       gg/essential/gui/friends/message/v2/MessageWrapperImpl$replyToIsDeleted$1.INSTANCE:Lgg/essential/gui/friends/message/v2/MessageWrapperImpl$replyToIsDeleted$1;
        //    61: checkcast       Lkotlin/jvm/functions/Function1;
        //    64: invokevirtual   gg/essential/gui/common/WeakState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    67: pop            
        //    68: goto            72
        //    71: pop            
        //    72: aload_0         /* this */
        //    73: aload_0         /* this */
        //    74: invokevirtual   gg/essential/gui/friends/message/v2/MessageWrapperImpl.getSender:()Ljava/util/UUID;
        //    77: invokestatic    gg/essential/util/UUIDUtil.getNameAsState:(Ljava/util/UUID;)Lgg/essential/gui/common/ReadOnlyState;
        //    80: putfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.senderUsernameState:Lgg/essential/gui/common/ReadOnlyState;
        //    83: aload_0         /* this */
        //    84: new             Ljava/util/ArrayList;
        //    87: dup            
        //    88: invokespecial   java/util/ArrayList.<init>:()V
        //    91: checkcast       Ljava/util/List;
        //    94: putfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.messageLines:Ljava/util/List;
        //    97: aload_0         /* this */
        //    98: new             Lgg/essential/elementa/state/BasicState;
        //   101: dup            
        //   102: iconst_0       
        //   103: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   106: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   109: putfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.markedUnreadManually:Lgg/essential/elementa/state/BasicState;
        //   112: aload_0         /* this */
        //   113: aload_0         /* this */
        //   114: getfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.messageScreen:Lgg/essential/gui/friends/message/MessageScreen;
        //   117: invokevirtual   gg/essential/gui/friends/message/MessageScreen.getPreview:()Lgg/essential/gui/friends/previews/ChannelPreview;
        //   120: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getGui:()Lgg/essential/gui/friends/SocialMenu;
        //   123: invokevirtual   gg/essential/gui/friends/SocialMenu.getSocialStateManager:()Lgg/essential/gui/friends/state/SocialStateManager;
        //   126: invokevirtual   gg/essential/gui/friends/state/SocialStateManager.getMessengerStates:()Lgg/essential/gui/friends/state/IMessengerStates;
        //   129: aload_1         /* message */
        //   130: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getInfraInstance:()Lcom/sparkuniverse/toolbox/chat/model/Message;
        //   133: invokeinterface gg/essential/gui/friends/state/IMessengerStates.getUnreadMessageState:(Lcom/sparkuniverse/toolbox/chat/model/Message;)Lgg/essential/elementa/state/State;
        //   138: putfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.unreadState:Lgg/essential/elementa/state/State;
        //   141: aload_0         /* this */
        //   142: new             Lgg/essential/elementa/components/UIContainer;
        //   145: dup            
        //   146: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   149: checkcast       Lgg/essential/elementa/UIComponent;
        //   152: astore_3        /* $this$constrain$iv */
        //   153: aload_3         /* $this$constrain$iv */
        //   154: astore          5
        //   156: aload           5
        //   158: astore          $this$constrain_u24lambda_u2d0$iv
        //   160: aload           $this$constrain_u24lambda_u2d0$iv
        //   162: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   165: astore          8
        //   167: astore          9
        //   169: aload           $this$usernameTimestampBox_delegate_u24lambda_u2d0
        //   171: iconst_0       
        //   172: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   175: checkcast       Ljava/lang/Number;
        //   178: aload_0         /* this */
        //   179: invokevirtual   gg/essential/gui/friends/message/v2/MessageWrapperImpl.getSentByClient:()Z
        //   182: iconst_0       
        //   183: iconst_2       
        //   184: aconst_null    
        //   185: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   188: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   191: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   194: aload           $this$usernameTimestampBox_delegate_u24lambda_u2d0
        //   196: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   199: dup            
        //   200: fconst_0       
        //   201: iconst_1       
        //   202: aconst_null    
        //   203: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   206: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   209: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   212: aload           9
        //   214: aload           5
        //   216: aload_0         /* this */
        //   217: checkcast       Lgg/essential/elementa/UIComponent;
        //   220: aload_0         /* this */
        //   221: invokevirtual   gg/essential/gui/friends/message/v2/MessageWrapperImpl.getShowTimestamp:()Lgg/essential/elementa/state/BasicState;
        //   224: checkcast       Lgg/essential/elementa/state/State;
        //   227: new             Lgg/essential/elementa/state/BasicState;
        //   230: dup            
        //   231: aload_0         /* this */
        //   232: getfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.replyTo:Lgg/essential/gui/friends/message/v2/MessageRef;
        //   235: ifnull          242
        //   238: iconst_1       
        //   239: goto            243
        //   242: iconst_0       
        //   243: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   246: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   249: checkcast       Lgg/essential/elementa/state/State;
        //   252: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   255: checkcast       Lgg/essential/elementa/state/State;
        //   258: iconst_0       
        //   259: iconst_0       
        //   260: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   263: iconst_4       
        //   264: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   267: aload_0         /* this */
        //   268: getstatic       gg/essential/gui/friends/message/v2/MessageWrapperImpl.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   271: iconst_0       
        //   272: aaload         
        //   273: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   276: putfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.usernameTimestampBox$delegate:Lkotlin/properties/ReadWriteProperty;
        //   279: aload_0         /* this */
        //   280: aload_0         /* this */
        //   281: invokevirtual   gg/essential/gui/friends/message/v2/MessageWrapperImpl.getSender:()Ljava/util/UUID;
        //   284: invokestatic    gg/essential/util/UUIDUtil.getClientUUID:()Ljava/util/UUID;
        //   287: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   290: ifne            307
        //   293: aload_0         /* this */
        //   294: invokevirtual   gg/essential/gui/friends/message/v2/MessageWrapperImpl.getChannelType:()Lcom/sparkuniverse/toolbox/chat/enums/ChannelType;
        //   297: getstatic       com/sparkuniverse/toolbox/chat/enums/ChannelType.GROUP_DIRECT_MESSAGE:Lcom/sparkuniverse/toolbox/chat/enums/ChannelType;
        //   300: if_acmpne       307
        //   303: iconst_1       
        //   304: goto            308
        //   307: iconst_0       
        //   308: putfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.usernameVisible:Z
        //   311: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   314: dup            
        //   315: aconst_null    
        //   316: iconst_0       
        //   317: aconst_null    
        //   318: iconst_0       
        //   319: iconst_0       
        //   320: iconst_0       
        //   321: bipush          61
        //   323: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   326: aload_0         /* this */
        //   327: getfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.senderUsernameState:Lgg/essential/gui/common/ReadOnlyState;
        //   330: dup            
        //   331: ldc_w           "senderUsernameState"
        //   334: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   337: checkcast       Lgg/essential/elementa/state/State;
        //   340: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   343: checkcast       Lgg/essential/elementa/UIComponent;
        //   346: astore_3        /* $this$constrain$iv */
        //   347: aload_3         /* $this$constrain$iv */
        //   348: astore          5
        //   350: aload           5
        //   352: astore          $this$constrain_u24lambda_u2d0$iv
        //   354: aload           $this$constrain_u24lambda_u2d0$iv
        //   356: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   359: astore          $this$usernameText_delegate_u24lambda_u2d1
        //   361: aload           $this$usernameText_delegate_u24lambda_u2d1
        //   363: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //   366: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   369: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   372: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   375: aload           $this$usernameText_delegate_u24lambda_u2d1
        //   377: new             Lgg/essential/gui/elementa/GuiScaleOffsetConstraint;
        //   380: dup            
        //   381: getstatic       gg/essential/gui/friends/SocialMenu.Companion:Lgg/essential/gui/friends/SocialMenu$Companion;
        //   384: invokevirtual   gg/essential/gui/friends/SocialMenu$Companion.getGuiScaleOffset:()F
        //   387: invokespecial   gg/essential/gui/elementa/GuiScaleOffsetConstraint.<init>:(F)V
        //   390: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   393: invokevirtual   gg/essential/elementa/UIConstraints.setTextScale:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   396: aload           5
        //   398: aload_0         /* this */
        //   399: invokespecial   gg/essential/gui/friends/message/v2/MessageWrapperImpl.getUsernameTimestampBox:()Lgg/essential/elementa/components/UIContainer;
        //   402: checkcast       Lgg/essential/elementa/UIComponent;
        //   405: new             Lgg/essential/elementa/state/BasicState;
        //   408: dup            
        //   409: aload_0         /* this */
        //   410: getfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.usernameVisible:Z
        //   413: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   416: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   419: checkcast       Lgg/essential/elementa/state/State;
        //   422: iconst_0       
        //   423: aconst_null    
        //   424: bipush          12
        //   426: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   429: aload_0         /* this */
        //   430: getstatic       gg/essential/gui/friends/message/v2/MessageWrapperImpl.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   433: iconst_1       
        //   434: aaload         
        //   435: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   438: pop            
        //   439: new             Lgg/essential/elementa/components/UIContainer;
        //   442: dup            
        //   443: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   446: checkcast       Lgg/essential/elementa/UIComponent;
        //   449: astore_3        /* $this$constrain$iv */
        //   450: aload_3         /* $this$constrain$iv */
        //   451: astore          5
        //   453: aload           5
        //   455: astore          $this$constrain_u24lambda_u2d0$iv
        //   457: aload           $this$constrain_u24lambda_u2d0$iv
        //   459: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   462: astore          $this$replyContextContainer_delegate_u24lambda_u2d2
        //   464: aload           $this$replyContextContainer_delegate_u24lambda_u2d2
        //   466: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   469: dup            
        //   470: ldc_w           5.0
        //   473: iconst_0       
        //   474: iconst_2       
        //   475: aconst_null    
        //   476: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   479: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   482: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   485: aload           $this$replyContextContainer_delegate_u24lambda_u2d2
        //   487: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   490: dup            
        //   491: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   494: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   497: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   500: aload           $this$replyContextContainer_delegate_u24lambda_u2d2
        //   502: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   505: dup            
        //   506: fconst_0       
        //   507: iconst_1       
        //   508: aconst_null    
        //   509: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   512: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   515: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   518: aload           5
        //   520: astore_3        /* $this$constrain$iv */
        //   521: aload_3        
        //   522: checkcast       Lgg/essential/elementa/components/UIContainer;
        //   525: astore          $this$replyContextContainer_delegate_u24lambda_u2d3
        //   527: aload_0         /* this */
        //   528: getfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.replyToWeakState:Lgg/essential/gui/common/WeakState;
        //   531: dup            
        //   532: ifnonnull       539
        //   535: pop            
        //   536: goto            635
        //   539: astore          replyToWeakState
        //   541: aload           $this$replyContextContainer_delegate_u24lambda_u2d3
        //   543: checkcast       Lgg/essential/elementa/UIComponent;
        //   546: aload_0         /* this */
        //   547: invokespecial   gg/essential/gui/friends/message/v2/MessageWrapperImpl.getUsernameTimestampBox:()Lgg/essential/elementa/components/UIContainer;
        //   550: checkcast       Lgg/essential/elementa/UIComponent;
        //   553: aload           replyToWeakState
        //   555: getstatic       gg/essential/gui/friends/message/v2/MessageWrapperImpl$replyContextContainer$3$1.INSTANCE:Lgg/essential/gui/friends/message/v2/MessageWrapperImpl$replyContextContainer$3$1;
        //   558: checkcast       Lkotlin/jvm/functions/Function1;
        //   561: invokevirtual   gg/essential/gui/common/WeakState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   564: checkcast       Lgg/essential/elementa/state/State;
        //   567: iconst_0       
        //   568: aload_0         /* this */
        //   569: getfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.usernameVisible:Z
        //   572: ifeq            579
        //   575: iconst_1       
        //   576: goto            580
        //   579: iconst_0       
        //   580: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   583: iconst_4       
        //   584: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   587: pop            
        //   588: aload           $this$replyContextContainer_delegate_u24lambda_u2d3
        //   590: checkcast       Lgg/essential/elementa/UIComponent;
        //   593: iconst_0       
        //   594: iconst_0       
        //   595: iconst_3       
        //   596: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   599: astore          hovered
        //   601: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   604: aload           hovered
        //   606: invokevirtual   gg/essential/gui/EssentialPalette.getTextColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   609: astore          colorState
        //   611: aload           replyToWeakState
        //   613: checkcast       Lgg/essential/elementa/state/State;
        //   616: new             Lgg/essential/gui/friends/message/v2/MessageWrapperImpl$replyContextContainer$3$2;
        //   619: dup            
        //   620: aload           $this$replyContextContainer_delegate_u24lambda_u2d3
        //   622: aload           colorState
        //   624: aload_0         /* this */
        //   625: invokespecial   gg/essential/gui/friends/message/v2/MessageWrapperImpl$replyContextContainer$3$2.<init>:(Lgg/essential/elementa/components/UIContainer;Lgg/essential/elementa/state/State;Lgg/essential/gui/friends/message/v2/MessageWrapperImpl;)V
        //   628: checkcast       Lkotlin/jvm/functions/Function1;
        //   631: invokestatic    gg/essential/gui/common/StateExtensionsKt.onSetValueAndNow:(Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   634: pop            
        //   635: aload_3        
        //   636: astore_3        /* $this$onLeftClick$iv */
        //   637: aload_3         /* $this$onLeftClick$iv */
        //   638: new             Lgg/essential/gui/friends/message/v2/MessageWrapperImpl$special$$inlined$onLeftClick$1;
        //   641: dup            
        //   642: aload_0         /* this */
        //   643: invokespecial   gg/essential/gui/friends/message/v2/MessageWrapperImpl$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/friends/message/v2/MessageWrapperImpl;)V
        //   646: checkcast       Lkotlin/jvm/functions/Function2;
        //   649: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   652: aload_0         /* this */
        //   653: getstatic       gg/essential/gui/friends/message/v2/MessageWrapperImpl.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   656: iconst_2       
        //   657: aaload         
        //   658: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   661: pop            
        //   662: aload_0         /* this */
        //   663: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   666: dup            
        //   667: aload_0         /* this */
        //   668: invokevirtual   gg/essential/gui/friends/message/v2/MessageWrapperImpl.getSendTime:()Ljava/time/Instant;
        //   671: checkcast       Ljava/time/temporal/TemporalAccessor;
        //   674: iconst_0       
        //   675: invokestatic    gg/essential/util/HelpersKt.formatTime:(Ljava/time/temporal/TemporalAccessor;Z)Ljava/lang/String;
        //   678: iconst_0       
        //   679: aconst_null    
        //   680: iconst_0       
        //   681: iconst_0       
        //   682: iconst_0       
        //   683: bipush          60
        //   685: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   688: checkcast       Lgg/essential/elementa/UIComponent;
        //   691: astore_3        /* $this$constrain$iv */
        //   692: aload_3         /* $this$constrain$iv */
        //   693: astore          5
        //   695: aload           5
        //   697: astore          $this$constrain_u24lambda_u2d0$iv
        //   699: aload           $this$constrain_u24lambda_u2d0$iv
        //   701: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   704: astore          8
        //   706: astore          9
        //   708: aload           $this$timestampText_delegate_u24lambda_u2d5
        //   710: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   713: dup            
        //   714: ldc_w           5.0
        //   717: iconst_0       
        //   718: iconst_2       
        //   719: aconst_null    
        //   720: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   723: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   726: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   729: aload           $this$timestampText_delegate_u24lambda_u2d5
        //   731: new             Lgg/essential/gui/elementa/GuiScaleOffsetConstraint;
        //   734: dup            
        //   735: getstatic       gg/essential/gui/friends/SocialMenu.Companion:Lgg/essential/gui/friends/SocialMenu$Companion;
        //   738: invokevirtual   gg/essential/gui/friends/SocialMenu$Companion.getGuiScaleOffset:()F
        //   741: invokespecial   gg/essential/gui/elementa/GuiScaleOffsetConstraint.<init>:(F)V
        //   744: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   747: invokevirtual   gg/essential/elementa/UIConstraints.setTextScale:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   750: aload           $this$timestampText_delegate_u24lambda_u2d5
        //   752: getstatic       gg/essential/gui/EssentialPalette.TEXT_DISABLED:Ljava/awt/Color;
        //   755: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   758: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   761: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   764: aload           9
        //   766: aload           5
        //   768: aload_0         /* this */
        //   769: invokespecial   gg/essential/gui/friends/message/v2/MessageWrapperImpl.getUsernameTimestampBox:()Lgg/essential/elementa/components/UIContainer;
        //   772: checkcast       Lgg/essential/elementa/UIComponent;
        //   775: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   778: aload_0         /* this */
        //   779: getstatic       gg/essential/gui/friends/message/v2/MessageWrapperImpl.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   782: iconst_3       
        //   783: aaload         
        //   784: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   787: putfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.timestampText$delegate:Lkotlin/properties/ReadWriteProperty;
        //   790: aload_0         /* this */
        //   791: checkcast       Lgg/essential/elementa/UIComponent;
        //   794: astore_3        /* $this$constrain$iv */
        //   795: aload_3         /* $this$constrain$iv */
        //   796: astore          5
        //   798: aload           5
        //   800: astore          $this$constrain_u24lambda_u2d0$iv
        //   802: aload           $this$constrain_u24lambda_u2d0$iv
        //   804: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   807: astore          $this$_init__u24lambda_u2d6
        //   809: aload           $this$_init__u24lambda_u2d6
        //   811: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   814: dup            
        //   815: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   818: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   821: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   824: aload           $this$_init__u24lambda_u2d6
        //   826: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   829: dup            
        //   830: ldc_w           5.0
        //   833: iconst_0       
        //   834: iconst_2       
        //   835: aconst_null    
        //   836: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   839: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   842: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   845: aload           $this$_init__u24lambda_u2d6
        //   847: bipush          100
        //   849: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   852: checkcast       Ljava/lang/Number;
        //   855: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   858: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   861: bipush          14
        //   863: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   866: checkcast       Ljava/lang/Number;
        //   869: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   872: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   875: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   878: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   881: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   884: aload           $this$_init__u24lambda_u2d6
        //   886: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   889: dup            
        //   890: fconst_0       
        //   891: iconst_1       
        //   892: aconst_null    
        //   893: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   896: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   899: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   902: aload_0         /* this */
        //   903: invokespecial   gg/essential/gui/friends/message/v2/MessageWrapperImpl.getUsernameTimestampBox:()Lgg/essential/elementa/components/UIContainer;
        //   906: bipush          100
        //   908: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   911: checkcast       Ljava/lang/Number;
        //   914: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   917: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   920: aload_0         /* this */
        //   921: invokespecial   gg/essential/gui/friends/message/v2/MessageWrapperImpl.getTimestampText:()Lgg/essential/gui/common/shadow/EssentialUIText;
        //   924: checkcast       Lgg/essential/elementa/UIComponent;
        //   927: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   930: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   933: invokevirtual   gg/essential/elementa/components/UIContainer.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/UIComponent;
        //   936: pop            
        //   937: aload_0         /* this */
        //   938: getfield        gg/essential/gui/friends/message/v2/MessageWrapperImpl.messageScreen:Lgg/essential/gui/friends/message/MessageScreen;
        //   941: invokevirtual   gg/essential/gui/friends/message/MessageScreen.getReplyingTo:()Lgg/essential/elementa/state/BasicState;
        //   944: new             Lgg/essential/gui/friends/message/v2/MessageWrapperImpl$replyingToThisMessage$1;
        //   947: dup            
        //   948: aload_1         /* message */
        //   949: invokespecial   gg/essential/gui/friends/message/v2/MessageWrapperImpl$replyingToThisMessage$1.<init>:(Lgg/essential/gui/friends/message/v2/ClientMessage;)V
        //   952: checkcast       Lkotlin/jvm/functions/Function1;
        //   955: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   958: astore_3        /* replyingToThisMessage */
        //   959: aload_3         /* replyingToThisMessage */
        //   960: new             Lgg/essential/gui/friends/message/v2/MessageWrapperImpl$2;
        //   963: dup            
        //   964: aload_0         /* this */
        //   965: invokespecial   gg/essential/gui/friends/message/v2/MessageWrapperImpl$2.<init>:(Lgg/essential/gui/friends/message/v2/MessageWrapperImpl;)V
        //   968: checkcast       Lkotlin/jvm/functions/Function1;
        //   971: invokevirtual   gg/essential/elementa/state/MappedState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   974: pop            
        //   975: return         
        //    MethodParameters:
        //  Name           Flags  
        //  -------------  -----
        //  message        
        //  messageScreen  
        //    StackMapTable: 00 0C FF 00 2D 00 02 07 00 02 07 00 86 00 02 07 00 02 07 00 8E FF 00 01 00 02 07 00 02 07 00 86 00 02 07 00 02 07 00 94 57 07 00 94 00 FF 00 A9 00 02 07 00 02 07 00 86 00 06 07 00 02 07 00 EB 07 00 EB 07 01 19 08 00 E3 08 00 E3 FF 00 00 00 02 07 00 02 07 00 86 00 07 07 00 02 07 00 EB 07 00 EB 07 01 19 08 00 E3 08 00 E3 01 F7 00 3F 07 00 02 FF 00 00 00 02 07 00 02 07 00 86 00 02 07 00 02 01 FF 00 E6 00 05 07 00 02 07 00 86 00 07 00 EB 07 00 E8 00 01 07 00 94 FF 00 27 00 07 07 00 02 07 00 86 00 07 00 EB 07 00 E8 00 07 00 94 00 04 07 00 EB 07 00 EB 07 01 19 01 FF 00 00 00 07 07 00 02 07 00 86 00 07 00 EB 07 00 E8 00 07 00 94 00 05 07 00 EB 07 00 EB 07 01 19 01 01 F8 00 36
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIContainer getUsernameTimestampBox() {
        return (UIContainer)this.usernameTimestampBox$delegate.getValue((Object)this, (KProperty)MessageWrapperImpl.$$delegatedProperties[0]);
    }
    
    private final EssentialUIText getTimestampText() {
        return (EssentialUIText)this.timestampText$delegate.getValue((Object)this, (KProperty)MessageWrapperImpl.$$delegatedProperties[3]);
    }
    
    public void addComponent(@NotNull final MessageLine line) {
        Intrinsics.checkNotNullParameter((Object)line, "line");
        this.messageLines.add(line);
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = line;
        final UIConstraints $this$addComponent_u24lambda_u2d7 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$addComponent_u24lambda_u2d7.setY(new SiblingConstraint(3.0f, false, 2, null));
        $this$addComponent_u24lambda_u2d7.setX(UtilitiesKt.pixels$default(0, Intrinsics.areEqual((Object)this.getMessage().getSender(), (Object)UUIDUtil.getClientUUID()), false, 2, null));
        ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this);
    }
    
    @Override
    public void openOptionMenu(@NotNull final UIClickEvent event, @NotNull final MessageLine component) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final float posX = event.getAbsoluteX();
        final float posY = event.getAbsoluteY();
        final List options = new ArrayList();
        if (component instanceof ParagraphLine) {
            options.add(new OptionMenu.Option("Copy", null, EssentialPalette.COPY_9X, null, null, null, null, (Function0)new MessageWrapperImpl$openOptionMenu.MessageWrapperImpl$openOptionMenu$1(component), 122));
        }
        else if (component instanceof ImageEmbed) {
            options.add(new OptionMenu.Option("Copy URL", null, EssentialPalette.LINK_8X7, null, null, null, null, (Function0)new MessageWrapperImpl$openOptionMenu.MessageWrapperImpl$openOptionMenu$2(component), 122));
            options.add(new OptionMenu.Option("Copy Image", null, EssentialPalette.COPY_9X, null, null, null, null, (Function0)new MessageWrapperImpl$openOptionMenu.MessageWrapperImpl$openOptionMenu$3(component), 122));
            options.add(new OptionMenu.Option("Open in Browser", null, EssentialPalette.ARROW_UP_RIGHT_5X5, null, null, null, null, (Function0)new MessageWrapperImpl$openOptionMenu.MessageWrapperImpl$openOptionMenu$4(component), 122));
        }
        else if (component instanceof OutfitEmbed) {
            throw new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
        }
        if (this.getChannelType() != ChannelType.ANNOUNCEMENT) {
            options.add(new OptionMenu.Option("Reply", null, EssentialPalette.REPLY_7X5, null, null, null, null, (Function0)new MessageWrapperImpl$openOptionMenu.MessageWrapperImpl$openOptionMenu$5(this), 122));
        }
        final IMessengerStates messengerStates = this.messageScreen.getPreview().getGui().getSocialStateManager().getMessengerStates();
        if (this.getMessage().getSent()) {
            if (this.getSentByClient()) {
                options.add(new OptionMenu.Option("Delete", null, EssentialPalette.TRASH_9X, null, null, null, null, (Function0)new MessageWrapperImpl$openOptionMenu.MessageWrapperImpl$openOptionMenu$6(messengerStates, this), 122));
            }
            else {
                options.add(new OptionMenu.Option("Mark Unread", null, EssentialPalette.MARK_UNREAD, null, null, null, null, (Function0)new MessageWrapperImpl$openOptionMenu.MessageWrapperImpl$openOptionMenu$7(this), 122));
                if (this.getChannelType() != ChannelType.ANNOUNCEMENT) {
                    options.add(new OptionMenu.Option("Report", null, EssentialPalette.REPORT_8X, null, null, null, null, (Function0)new MessageWrapperImpl$openOptionMenu.MessageWrapperImpl$openOptionMenu$8(this), 122));
                }
            }
        }
        final float posX2 = posX;
        final float posY2 = posY;
        final Collection thisCollection$iv;
        final Collection $this$toTypedArray$iv = thisCollection$iv = options;
        final OptionMenu.Option[] array = thisCollection$iv.toArray(new OptionMenu.Option[0]);
        Intrinsics.checkNotNull((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final OptionMenu.Option[] original = array;
        final OptionMenu menu = ComponentsKt.childOf(new OptionMenu(posX2, posY2, (OptionMenu.Option[])Arrays.copyOf(original, original.length)), Window.Companion.of(this));
        menu.init();
        this.getDropdownOpen().set(true);
        menu.onClose((Function0<Unit>)new MessageWrapperImpl$openOptionMenu.MessageWrapperImpl$openOptionMenu$9(this));
    }
    
    public final void markSelfUnread() {
        this.unreadState.set(true);
        this.markedUnreadManually.set(true);
    }
    
    @Override
    public void flashHighlight() {
        final Iterable $this$forEach$iv = this.messageLines;
        for (final Object element$iv : $this$forEach$iv) {
            final MessageLine it = (MessageLine)element$iv;
            it.flashHighlight();
        }
    }
    
    @Override
    public void retrySend() {
        this.messageScreen.retrySend(this.getMessage());
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        if (this.replyTo != null && !this.replyTo.isInitialized() && this.getTop() > -600.0f) {
            this.replyTo.eagerlyLoad();
        }
        if (this.getMessage().getSent() && !this.markedUnreadManually.get() && this.unreadState.get()) {
            final boolean componentTopVisible = this.getParent().getParent().getParent().isPointInside((this.getLeft() + this.getRight()) / 2.0f, this.getTop());
            if (componentTopVisible) {
                this.unreadState.set(false);
            }
        }
    }
    
    private static final void openOptionMenu$doDelete(final IMessengerStates messengerStates, final MessageWrapperImpl this$0) {
        messengerStates.deleteMessage(this$0.getMessage().getInfraInstance());
    }
    
    public static final /* synthetic */ MessageScreen access$getMessageScreen$p(final MessageWrapperImpl $this) {
        return $this.messageScreen;
    }
    
    public static final /* synthetic */ void access$openOptionMenu$doDelete(final IMessengerStates messengerStates, final MessageWrapperImpl this$0) {
        openOptionMenu$doDelete(messengerStates, this$0);
    }
    
    public static final /* synthetic */ WeakState access$getReplyToWeakState$p(final MessageWrapperImpl $this) {
        return $this.replyToWeakState;
    }
    
    public static final /* synthetic */ List access$getMessageLines$p(final MessageWrapperImpl $this) {
        return $this.messageLines;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)MessageWrapperImpl.class, "usernameTimestampBox", "getUsernameTimestampBox()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)MessageWrapperImpl.class, "usernameText", "getUsernameText()Lgg/essential/elementa/components/UIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)MessageWrapperImpl.class, "replyContextContainer", "getReplyContextContainer()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)MessageWrapperImpl.class, "timestampText", "getTimestampText()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)) };
    }
}
