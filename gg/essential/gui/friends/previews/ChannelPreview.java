package gg.essential.gui.friends.previews;

import kotlin.reflect.*;
import gg.essential.gui.friends.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import com.sparkuniverse.toolbox.chat.model.*;
import kotlin.properties.*;
import gg.essential.gui.studio.*;
import java.util.*;
import gg.essential.elementa.components.*;
import kotlin.collections.*;
import gg.essential.util.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.*;
import gg.essential.gui.common.shadow.*;
import java.awt.*;
import gg.essential.elementa.dsl.*;
import gg.essential.gui.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.friends.state.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0092\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0002GHB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010F\u001a\u00020=H\u0016R2\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0
                                                   \u0012\u0004\u0012\u00020\u000b0	X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\f\u0010\r"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00070\u0013¢\u0006\u0002\b\u0014¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u001d\u001a\u00060\u001eR\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 R\u0014\u0010"\u001a\b\u0012\u0004\u0012\u00020\u000b0#X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0'¢\u0006\b
                                                   \u0000\u001a\u0004\b(\u0010)R\u001b\u0010*\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b,\u0010\u001c\u001a\u0004\b+\u0010\u001aR\u000e\u0010-\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0016\u0010.\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010/0'X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u00100\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002070'X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0013\u00108\u001a\u0004\u0018\u000109¢\u0006\b
                                                   \u0000\u001a\u0004\b:\u0010;R\u001d\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0	¢\u0006\b
                                                   \u0000\u001a\u0004\b>\u0010\rR\u001b\u0010?\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bC\u0010\u001c\u001a\u0004\bA\u0010BR\u000e\u0010D\u001a\u00020EX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006I""" }, d2 = { "Lgg/essential/gui/friends/previews/ChannelPreview;", "Lgg/essential/elementa/components/UIBlock;", "Lgg/essential/gui/friends/previews/SearchableItem;", "gui", "Lgg/essential/gui/friends/SocialMenu;", "channel", "Lcom/sparkuniverse/toolbox/chat/model/Channel;", "(Lgg/essential/gui/friends/SocialMenu;Lcom/sparkuniverse/toolbox/chat/model/Channel;)V", "active", "Lgg/essential/elementa/state/MappedState;", "Lkotlin/Pair;", "", "getActive", "()Lgg/essential/elementa/state/MappedState;", "setActive", "(Lgg/essential/elementa/state/MappedState;)V", "getChannel", "()Lcom/sparkuniverse/toolbox/chat/model/Channel;", "connectionManager", "Lgg/essential/network/connectionmanager/ConnectionManager;", "Lorg/jetbrains/annotations/NotNull;", "getConnectionManager", "()Lgg/essential/network/connectionmanager/ConnectionManager;", "contentContainer", "Lgg/essential/elementa/components/UIContainer;", "getContentContainer", "()Lgg/essential/elementa/components/UIContainer;", "contentContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "description", "Lgg/essential/gui/friends/previews/ChannelPreview$Description;", "getDescription", "()Lgg/essential/gui/friends/previews/ChannelPreview$Description;", "description$delegate", "dropdownOpen", "Lgg/essential/elementa/state/BasicState;", "getGui", "()Lgg/essential/gui/friends/SocialMenu;", "hasUnreadState", "Lgg/essential/gui/common/ReadOnlyState;", "getHasUnreadState", "()Lgg/essential/gui/common/ReadOnlyState;", "imageContainer", "getImageContainer", "imageContainer$delegate", "isSinglePerson", "latestMessageState", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "latestMessageTimestamp", "", "getLatestMessageTimestamp", "()J", "messengerStates", "Lgg/essential/gui/friends/state/IMessengerStates;", "numUnread", "", "otherUser", "Ljava/util/UUID;", "getOtherUser", "()Ljava/util/UUID;", "titleState", "", "getTitleState", "titleText", "Lgg/essential/elementa/components/UIText;", "getTitleText", "()Lgg/essential/elementa/components/UIText;", "titleText$delegate", "unreadQuantity", "Lgg/essential/gui/studio/Tag;", "getSearchTag", "Companion", "Description", "essential" })
public final class ChannelPreview extends UIBlock implements SearchableItem
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final SocialMenu gui;
    @NotNull
    private final Channel channel;
    private final boolean isSinglePerson;
    @Nullable
    private final UUID otherUser;
    @NotNull
    private final MappedState<String, String> titleState;
    @NotNull
    private MappedState<Pair<Boolean, Boolean>, Boolean> active;
    @NotNull
    private final IMessengerStates messengerStates;
    @NotNull
    private final ReadOnlyState<Message> latestMessageState;
    @NotNull
    private final ReadOnlyState<Integer> numUnread;
    @NotNull
    private final ReadOnlyState<Boolean> hasUnreadState;
    @NotNull
    private final ReadWriteProperty contentContainer$delegate;
    @NotNull
    private final ReadWriteProperty imageContainer$delegate;
    @NotNull
    private final ReadWriteProperty titleText$delegate;
    @NotNull
    private final Tag unreadQuantity;
    @NotNull
    private final BasicState<Boolean> dropdownOpen;
    @NotNull
    private static final List<String> groupIcons;
    
    public ChannelPreview(@NotNull final SocialMenu gui, @NotNull final Channel channel) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "gui"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* channel */
        //     7: ldc             "channel"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: aconst_null    
        //    14: iconst_1       
        //    15: aconst_null    
        //    16: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    19: aload_0         /* this */
        //    20: aload_1         /* gui */
        //    21: putfield        gg/essential/gui/friends/previews/ChannelPreview.gui:Lgg/essential/gui/friends/SocialMenu;
        //    24: aload_0         /* this */
        //    25: aload_2         /* channel */
        //    26: putfield        gg/essential/gui/friends/previews/ChannelPreview.channel:Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //    29: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //    32: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //    35: ldc             "getInstance().connectionManager"
        //    37: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    40: aload_0         /* this */
        //    41: aload_0         /* this */
        //    42: getfield        gg/essential/gui/friends/previews/ChannelPreview.channel:Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //    45: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getType:()Lcom/sparkuniverse/toolbox/chat/enums/ChannelType;
        //    48: getstatic       com/sparkuniverse/toolbox/chat/enums/ChannelType.DIRECT_MESSAGE:Lcom/sparkuniverse/toolbox/chat/enums/ChannelType;
        //    51: if_acmpne       58
        //    54: iconst_1       
        //    55: goto            59
        //    58: iconst_0       
        //    59: putfield        gg/essential/gui/friends/previews/ChannelPreview.isSinglePerson:Z
        //    62: aload_0         /* this */
        //    63: aload_0         /* this */
        //    64: getfield        gg/essential/gui/friends/previews/ChannelPreview.channel:Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //    67: invokestatic    gg/essential/util/ExtensionsKt.getOtherUser:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Ljava/util/UUID;
        //    70: putfield        gg/essential/gui/friends/previews/ChannelPreview.otherUser:Ljava/util/UUID;
        //    73: aload_0         /* this */
        //    74: new             Lgg/essential/elementa/state/BasicState;
        //    77: dup            
        //    78: aload_0         /* this */
        //    79: getfield        gg/essential/gui/friends/previews/ChannelPreview.isSinglePerson:Z
        //    82: ifeq            90
        //    85: ldc             "Loading username..."
        //    87: goto            92
        //    90: ldc             "Loading group title..."
        //    92: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    95: getstatic       gg/essential/gui/friends/previews/ChannelPreview$titleState$1.INSTANCE:Lgg/essential/gui/friends/previews/ChannelPreview$titleState$1;
        //    98: checkcast       Lkotlin/jvm/functions/Function1;
        //   101: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   104: putfield        gg/essential/gui/friends/previews/ChannelPreview.titleState:Lgg/essential/elementa/state/MappedState;
        //   107: aload_0         /* this */
        //   108: aload_0         /* this */
        //   109: getfield        gg/essential/gui/friends/previews/ChannelPreview.gui:Lgg/essential/gui/friends/SocialMenu;
        //   112: invokevirtual   gg/essential/gui/friends/SocialMenu.getChatTab:()Lgg/essential/gui/friends/tabs/ChatTab;
        //   115: invokevirtual   gg/essential/gui/friends/tabs/ChatTab.getCurrentMessageView:()Lgg/essential/elementa/state/BasicState;
        //   118: new             Lgg/essential/gui/friends/previews/ChannelPreview$active$1;
        //   121: dup            
        //   122: aload_0         /* this */
        //   123: invokespecial   gg/essential/gui/friends/previews/ChannelPreview$active$1.<init>:(Lgg/essential/gui/friends/previews/ChannelPreview;)V
        //   126: checkcast       Lkotlin/jvm/functions/Function1;
        //   129: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   132: checkcast       Lgg/essential/elementa/state/State;
        //   135: aload_0         /* this */
        //   136: getfield        gg/essential/gui/friends/previews/ChannelPreview.gui:Lgg/essential/gui/friends/SocialMenu;
        //   139: invokevirtual   gg/essential/gui/friends/SocialMenu.getSelectedTab:()Lgg/essential/elementa/state/BasicState;
        //   142: getstatic       gg/essential/gui/friends/previews/ChannelPreview$active$2.INSTANCE:Lgg/essential/gui/friends/previews/ChannelPreview$active$2;
        //   145: checkcast       Lkotlin/jvm/functions/Function1;
        //   148: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   151: checkcast       Lgg/essential/elementa/state/State;
        //   154: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   157: putfield        gg/essential/gui/friends/previews/ChannelPreview.active:Lgg/essential/elementa/state/MappedState;
        //   160: aload_0         /* this */
        //   161: aload_0         /* this */
        //   162: getfield        gg/essential/gui/friends/previews/ChannelPreview.gui:Lgg/essential/gui/friends/SocialMenu;
        //   165: invokevirtual   gg/essential/gui/friends/SocialMenu.getSocialStateManager:()Lgg/essential/gui/friends/state/SocialStateManager;
        //   168: invokevirtual   gg/essential/gui/friends/state/SocialStateManager.getMessengerStates:()Lgg/essential/gui/friends/state/IMessengerStates;
        //   171: putfield        gg/essential/gui/friends/previews/ChannelPreview.messengerStates:Lgg/essential/gui/friends/state/IMessengerStates;
        //   174: aload_0         /* this */
        //   175: aload_0         /* this */
        //   176: getfield        gg/essential/gui/friends/previews/ChannelPreview.messengerStates:Lgg/essential/gui/friends/state/IMessengerStates;
        //   179: aload_0         /* this */
        //   180: getfield        gg/essential/gui/friends/previews/ChannelPreview.channel:Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   183: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //   186: invokeinterface gg/essential/gui/friends/state/IMessengerStates.getLatestMessage:(J)Lgg/essential/gui/common/ReadOnlyState;
        //   191: putfield        gg/essential/gui/friends/previews/ChannelPreview.latestMessageState:Lgg/essential/gui/common/ReadOnlyState;
        //   194: aload_0         /* this */
        //   195: aload_0         /* this */
        //   196: getfield        gg/essential/gui/friends/previews/ChannelPreview.messengerStates:Lgg/essential/gui/friends/state/IMessengerStates;
        //   199: aload_0         /* this */
        //   200: getfield        gg/essential/gui/friends/previews/ChannelPreview.channel:Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   203: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //   206: invokeinterface gg/essential/gui/friends/state/IMessengerStates.getNumUnread:(J)Lgg/essential/gui/common/ReadOnlyState;
        //   211: putfield        gg/essential/gui/friends/previews/ChannelPreview.numUnread:Lgg/essential/gui/common/ReadOnlyState;
        //   214: aload_0         /* this */
        //   215: aload_0         /* this */
        //   216: getfield        gg/essential/gui/friends/previews/ChannelPreview.messengerStates:Lgg/essential/gui/friends/state/IMessengerStates;
        //   219: aload_0         /* this */
        //   220: getfield        gg/essential/gui/friends/previews/ChannelPreview.channel:Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   223: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //   226: invokeinterface gg/essential/gui/friends/state/IMessengerStates.getUnreadChannelState:(J)Lgg/essential/gui/common/ReadOnlyState;
        //   231: putfield        gg/essential/gui/friends/previews/ChannelPreview.hasUnreadState:Lgg/essential/gui/common/ReadOnlyState;
        //   234: aload_0         /* this */
        //   235: new             Lgg/essential/elementa/components/UIContainer;
        //   238: dup            
        //   239: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   242: checkcast       Lgg/essential/elementa/UIComponent;
        //   245: astore_3        /* $this$constrain$iv */
        //   246: aload_3         /* $this$constrain$iv */
        //   247: astore          4
        //   249: aload           4
        //   251: astore          $this$constrain_u24lambda_u2d0$iv
        //   253: aload           $this$constrain_u24lambda_u2d0$iv
        //   255: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   258: astore          6
        //   260: astore          7
        //   262: aload           $this$contentContainer_delegate_u24lambda_u2d0
        //   264: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   267: dup            
        //   268: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   271: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   274: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   277: aload           $this$contentContainer_delegate_u24lambda_u2d0
        //   279: bipush          100
        //   281: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   284: checkcast       Ljava/lang/Number;
        //   287: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   290: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   293: bipush          20
        //   295: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   298: checkcast       Ljava/lang/Number;
        //   301: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   304: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   307: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   310: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   313: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   316: aload           $this$contentContainer_delegate_u24lambda_u2d0
        //   318: bipush          100
        //   320: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   323: checkcast       Ljava/lang/Number;
        //   326: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   329: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   332: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   335: aload           7
        //   337: aload           4
        //   339: aload_0         /* this */
        //   340: checkcast       Lgg/essential/elementa/UIComponent;
        //   343: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   346: aload_0         /* this */
        //   347: getstatic       gg/essential/gui/friends/previews/ChannelPreview.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   350: iconst_0       
        //   351: aaload         
        //   352: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   355: putfield        gg/essential/gui/friends/previews/ChannelPreview.contentContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   358: aload_0         /* this */
        //   359: new             Lgg/essential/elementa/components/UIContainer;
        //   362: dup            
        //   363: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   366: checkcast       Lgg/essential/elementa/UIComponent;
        //   369: astore_3        /* $this$constrain$iv */
        //   370: aload_3         /* $this$constrain$iv */
        //   371: astore          4
        //   373: aload           4
        //   375: astore          $this$constrain_u24lambda_u2d0$iv
        //   377: aload           $this$constrain_u24lambda_u2d0$iv
        //   379: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   382: astore          6
        //   384: astore          7
        //   386: aload           $this$imageContainer_delegate_u24lambda_u2d1
        //   388: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   391: dup            
        //   392: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   395: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   398: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   401: aload           $this$imageContainer_delegate_u24lambda_u2d1
        //   403: bipush          24
        //   405: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   408: checkcast       Ljava/lang/Number;
        //   411: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   414: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   417: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   420: aload           $this$imageContainer_delegate_u24lambda_u2d1
        //   422: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   425: dup            
        //   426: fconst_0       
        //   427: iconst_1       
        //   428: aconst_null    
        //   429: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   432: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   435: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   438: aload           7
        //   440: aload           4
        //   442: aload_0         /* this */
        //   443: invokespecial   gg/essential/gui/friends/previews/ChannelPreview.getContentContainer:()Lgg/essential/elementa/components/UIContainer;
        //   446: checkcast       Lgg/essential/elementa/UIComponent;
        //   449: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   452: aload_0         /* this */
        //   453: getstatic       gg/essential/gui/friends/previews/ChannelPreview.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   456: iconst_1       
        //   457: aaload         
        //   458: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   461: putfield        gg/essential/gui/friends/previews/ChannelPreview.imageContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   464: aload_0         /* this */
        //   465: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   468: dup            
        //   469: aconst_null    
        //   470: iconst_0       
        //   471: aconst_null    
        //   472: iconst_0       
        //   473: iconst_0       
        //   474: iconst_0       
        //   475: bipush          63
        //   477: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   480: aload_0         /* this */
        //   481: getfield        gg/essential/gui/friends/previews/ChannelPreview.titleState:Lgg/essential/elementa/state/MappedState;
        //   484: checkcast       Lgg/essential/elementa/state/State;
        //   487: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   490: checkcast       Lgg/essential/elementa/UIComponent;
        //   493: astore_3        /* $this$constrain$iv */
        //   494: aload_3         /* $this$constrain$iv */
        //   495: astore          4
        //   497: aload           4
        //   499: astore          $this$constrain_u24lambda_u2d0$iv
        //   501: aload           $this$constrain_u24lambda_u2d0$iv
        //   503: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   506: astore          6
        //   508: astore          7
        //   510: aload           $this$titleText_delegate_u24lambda_u2d2
        //   512: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   515: dup            
        //   516: ldc_w           7.5
        //   519: iconst_0       
        //   520: iconst_2       
        //   521: aconst_null    
        //   522: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   525: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   528: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   531: aload           $this$titleText_delegate_u24lambda_u2d2
        //   533: bipush          10
        //   535: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   538: checkcast       Ljava/lang/Number;
        //   541: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   544: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   547: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   550: aload           7
        //   552: aload           4
        //   554: aload_0         /* this */
        //   555: invokespecial   gg/essential/gui/friends/previews/ChannelPreview.getContentContainer:()Lgg/essential/elementa/components/UIContainer;
        //   558: checkcast       Lgg/essential/elementa/UIComponent;
        //   561: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   564: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   567: dup            
        //   568: aload_0         /* this */
        //   569: invokespecial   gg/essential/gui/friends/previews/ChannelPreview.getContentContainer:()Lgg/essential/elementa/components/UIContainer;
        //   572: checkcast       Lgg/essential/elementa/UIComponent;
        //   575: iconst_0       
        //   576: iconst_2       
        //   577: aconst_null    
        //   578: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   581: checkcast       Lgg/essential/elementa/effects/Effect;
        //   584: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   587: aload_0         /* this */
        //   588: getstatic       gg/essential/gui/friends/previews/ChannelPreview.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   591: iconst_2       
        //   592: aaload         
        //   593: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   596: putfield        gg/essential/gui/friends/previews/ChannelPreview.titleText$delegate:Lkotlin/properties/ReadWriteProperty;
        //   599: aload_0         /* this */
        //   600: new             Lgg/essential/gui/studio/Tag;
        //   603: dup            
        //   604: new             Lgg/essential/elementa/state/BasicState;
        //   607: dup            
        //   608: getstatic       gg/essential/gui/EssentialPalette.RED:Ljava/awt/Color;
        //   611: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   614: checkcast       Lgg/essential/elementa/state/State;
        //   617: new             Lgg/essential/elementa/state/BasicState;
        //   620: dup            
        //   621: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //   624: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   627: checkcast       Lgg/essential/elementa/state/State;
        //   630: aload_0         /* this */
        //   631: getfield        gg/essential/gui/friends/previews/ChannelPreview.numUnread:Lgg/essential/gui/common/ReadOnlyState;
        //   634: checkcast       Lgg/essential/elementa/state/State;
        //   637: invokestatic    gg/essential/gui/common/StateExtensionsKt.mapToString:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   640: checkcast       Lgg/essential/elementa/state/State;
        //   643: invokespecial   gg/essential/gui/studio/Tag.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V
        //   646: checkcast       Lgg/essential/elementa/UIComponent;
        //   649: astore_3        /* $this$constrain$iv */
        //   650: aload_3         /* $this$constrain$iv */
        //   651: astore          4
        //   653: aload           4
        //   655: astore          $this$constrain_u24lambda_u2d0$iv
        //   657: aload           $this$constrain_u24lambda_u2d0$iv
        //   659: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   662: astore          6
        //   664: astore          7
        //   666: aload           $this$unreadQuantity_u24lambda_u2d3
        //   668: iconst_0       
        //   669: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   672: checkcast       Ljava/lang/Number;
        //   675: iconst_1       
        //   676: iconst_0       
        //   677: iconst_2       
        //   678: aconst_null    
        //   679: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   682: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   685: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   688: aload           $this$unreadQuantity_u24lambda_u2d3
        //   690: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   693: dup            
        //   694: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   697: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   700: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   703: aload           $this$unreadQuantity_u24lambda_u2d3
        //   705: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   708: dup            
        //   709: fconst_0       
        //   710: iconst_1       
        //   711: aconst_null    
        //   712: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   715: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   718: iconst_4       
        //   719: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   722: checkcast       Ljava/lang/Number;
        //   725: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   728: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   731: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   734: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   737: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   740: aload           $this$unreadQuantity_u24lambda_u2d3
        //   742: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   745: dup            
        //   746: fconst_0       
        //   747: iconst_1       
        //   748: aconst_null    
        //   749: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   752: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   755: iconst_4       
        //   756: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   759: checkcast       Ljava/lang/Number;
        //   762: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   765: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   768: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   771: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   774: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   777: aload           7
        //   779: aload           4
        //   781: aload_0         /* this */
        //   782: invokespecial   gg/essential/gui/friends/previews/ChannelPreview.getContentContainer:()Lgg/essential/elementa/components/UIContainer;
        //   785: checkcast       Lgg/essential/elementa/UIComponent;
        //   788: aload_0         /* this */
        //   789: getfield        gg/essential/gui/friends/previews/ChannelPreview.hasUnreadState:Lgg/essential/gui/common/ReadOnlyState;
        //   792: checkcast       Lgg/essential/elementa/state/State;
        //   795: iconst_0       
        //   796: aconst_null    
        //   797: bipush          12
        //   799: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   802: new             Lgg/essential/gui/common/shadow/ShadowEffect;
        //   805: dup            
        //   806: getstatic       gg/essential/gui/EssentialPalette.BLACK:Ljava/awt/Color;
        //   809: invokespecial   gg/essential/gui/common/shadow/ShadowEffect.<init>:(Ljava/awt/Color;)V
        //   812: checkcast       Lgg/essential/elementa/effects/Effect;
        //   815: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   818: checkcast       Lgg/essential/gui/studio/Tag;
        //   821: putfield        gg/essential/gui/friends/previews/ChannelPreview.unreadQuantity:Lgg/essential/gui/studio/Tag;
        //   824: new             Lgg/essential/gui/friends/previews/ChannelPreview$Description;
        //   827: dup            
        //   828: aload_0         /* this */
        //   829: invokespecial   gg/essential/gui/friends/previews/ChannelPreview$Description.<init>:(Lgg/essential/gui/friends/previews/ChannelPreview;)V
        //   832: checkcast       Lgg/essential/elementa/UIComponent;
        //   835: astore_3        /* $this$constrain$iv */
        //   836: aload_3         /* $this$constrain$iv */
        //   837: astore          4
        //   839: aload           4
        //   841: astore          $this$constrain_u24lambda_u2d0$iv
        //   843: aload           $this$constrain_u24lambda_u2d0$iv
        //   845: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   848: astore          $this$description_delegate_u24lambda_u2d4
        //   850: aload           $this$description_delegate_u24lambda_u2d4
        //   852: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   855: dup            
        //   856: iconst_0       
        //   857: iconst_1       
        //   858: aconst_null    
        //   859: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   862: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   865: aload_0         /* this */
        //   866: invokespecial   gg/essential/gui/friends/previews/ChannelPreview.getTitleText:()Lgg/essential/elementa/components/UIText;
        //   869: checkcast       Lgg/essential/elementa/UIComponent;
        //   872: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   875: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   878: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   881: aload           $this$description_delegate_u24lambda_u2d4
        //   883: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   886: dup            
        //   887: ldc_w           5.0
        //   890: iconst_0       
        //   891: iconst_2       
        //   892: aconst_null    
        //   893: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   896: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   899: aload_0         /* this */
        //   900: invokespecial   gg/essential/gui/friends/previews/ChannelPreview.getTitleText:()Lgg/essential/elementa/components/UIText;
        //   903: checkcast       Lgg/essential/elementa/UIComponent;
        //   906: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   909: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   912: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   915: aload           4
        //   917: aload_0         /* this */
        //   918: getfield        gg/essential/gui/friends/previews/ChannelPreview.hasUnreadState:Lgg/essential/gui/common/ReadOnlyState;
        //   921: checkcast       Lgg/essential/elementa/state/State;
        //   924: new             Lgg/essential/gui/friends/previews/ChannelPreview$description$3;
        //   927: dup            
        //   928: aload_0         /* this */
        //   929: invokespecial   gg/essential/gui/friends/previews/ChannelPreview$description$3.<init>:(Lgg/essential/gui/friends/previews/ChannelPreview;)V
        //   932: checkcast       Lkotlin/jvm/functions/Function2;
        //   935: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   938: aload_0         /* this */
        //   939: invokespecial   gg/essential/gui/friends/previews/ChannelPreview.getContentContainer:()Lgg/essential/elementa/components/UIContainer;
        //   942: checkcast       Lgg/essential/elementa/UIComponent;
        //   945: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   948: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   951: dup            
        //   952: aload_0         /* this */
        //   953: invokespecial   gg/essential/gui/friends/previews/ChannelPreview.getContentContainer:()Lgg/essential/elementa/components/UIContainer;
        //   956: checkcast       Lgg/essential/elementa/UIComponent;
        //   959: iconst_0       
        //   960: iconst_2       
        //   961: aconst_null    
        //   962: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   965: checkcast       Lgg/essential/elementa/effects/Effect;
        //   968: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   971: aload_0         /* this */
        //   972: getstatic       gg/essential/gui/friends/previews/ChannelPreview.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   975: iconst_3       
        //   976: aaload         
        //   977: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   980: pop            
        //   981: aload_0         /* this */
        //   982: new             Lgg/essential/elementa/state/BasicState;
        //   985: dup            
        //   986: iconst_0       
        //   987: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   990: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   993: putfield        gg/essential/gui/friends/previews/ChannelPreview.dropdownOpen:Lgg/essential/elementa/state/BasicState;
        //   996: aload_0         /* this */
        //   997: aload_0         /* this */
        //   998: checkcast       Lgg/essential/elementa/UIComponent;
        //  1001: iconst_0       
        //  1002: iconst_0       
        //  1003: iconst_3       
        //  1004: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //  1007: aload_0         /* this */
        //  1008: getfield        gg/essential/gui/friends/previews/ChannelPreview.dropdownOpen:Lgg/essential/elementa/state/BasicState;
        //  1011: checkcast       Lgg/essential/elementa/state/State;
        //  1014: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1017: checkcast       Lgg/essential/elementa/state/State;
        //  1020: aload_0         /* this */
        //  1021: getfield        gg/essential/gui/friends/previews/ChannelPreview.active:Lgg/essential/elementa/state/MappedState;
        //  1024: checkcast       Lgg/essential/elementa/state/State;
        //  1027: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1030: getstatic       gg/essential/gui/friends/previews/ChannelPreview$1.INSTANCE:Lgg/essential/gui/friends/previews/ChannelPreview$1;
        //  1033: checkcast       Lkotlin/jvm/functions/Function1;
        //  1036: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1039: checkcast       Lgg/essential/elementa/state/State;
        //  1042: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1045: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1048: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //  1051: pop            
        //  1052: aload_0         /* this */
        //  1053: checkcast       Lgg/essential/elementa/UIComponent;
        //  1056: astore_3        /* $this$constrain$iv */
        //  1057: aload_3         /* $this$constrain$iv */
        //  1058: astore          4
        //  1060: aload           4
        //  1062: astore          $this$constrain_u24lambda_u2d0$iv
        //  1064: aload           $this$constrain_u24lambda_u2d0$iv
        //  1066: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1069: astore          $this$_init__u24lambda_u2d5
        //  1071: aload           $this$_init__u24lambda_u2d5
        //  1073: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1076: dup            
        //  1077: fconst_0       
        //  1078: iconst_0       
        //  1079: iconst_3       
        //  1080: aconst_null    
        //  1081: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1084: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1087: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1090: aload           $this$_init__u24lambda_u2d5
        //  1092: bipush          100
        //  1094: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1097: checkcast       Ljava/lang/Number;
        //  1100: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1103: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1106: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1109: aload           $this$_init__u24lambda_u2d5
        //  1111: bipush          40
        //  1113: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1116: checkcast       Ljava/lang/Number;
        //  1119: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1122: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1125: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1128: aload_0         /* this */
        //  1129: new             Lgg/essential/gui/friends/previews/ChannelPreview$3;
        //  1132: dup            
        //  1133: aload_0         /* this */
        //  1134: invokespecial   gg/essential/gui/friends/previews/ChannelPreview$3.<init>:(Lgg/essential/gui/friends/previews/ChannelPreview;)V
        //  1137: checkcast       Lkotlin/jvm/functions/Function2;
        //  1140: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1143: pop            
        //  1144: aload_0         /* this */
        //  1145: invokespecial   gg/essential/gui/friends/previews/ChannelPreview.getContentContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1148: checkcast       Lgg/essential/elementa/UIComponent;
        //  1151: astore_3        /* $this$onLeftClick$iv */
        //  1152: aload_3         /* $this$onLeftClick$iv */
        //  1153: new             Lgg/essential/gui/friends/previews/ChannelPreview$special$$inlined$onLeftClick$1;
        //  1156: dup            
        //  1157: aload_0         /* this */
        //  1158: invokespecial   gg/essential/gui/friends/previews/ChannelPreview$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/friends/previews/ChannelPreview;)V
        //  1161: checkcast       Lkotlin/jvm/functions/Function2;
        //  1164: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1167: pop            
        //  1168: aload_0         /* this */
        //  1169: getfield        gg/essential/gui/friends/previews/ChannelPreview.otherUser:Ljava/util/UUID;
        //  1172: ifnull          1278
        //  1175: aload_0         /* this */
        //  1176: getfield        gg/essential/gui/friends/previews/ChannelPreview.otherUser:Ljava/util/UUID;
        //  1179: invokestatic    gg/essential/util/CachedAvatarImage.ofUUID:(Ljava/util/UUID;)Lgg/essential/elementa/components/UIImage;
        //  1182: checkcast       Lgg/essential/elementa/UIComponent;
        //  1185: astore_3        /* $this$constrain$iv */
        //  1186: aload_3         /* $this$constrain$iv */
        //  1187: astore          4
        //  1189: aload           4
        //  1191: astore          $this$constrain_u24lambda_u2d0$iv
        //  1193: aload           $this$constrain_u24lambda_u2d0$iv
        //  1195: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1198: astore          $this$_init__u24lambda_u2d7
        //  1200: aload           $this$_init__u24lambda_u2d7
        //  1202: bipush          100
        //  1204: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1207: checkcast       Ljava/lang/Number;
        //  1210: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1213: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1216: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1219: aload           $this$_init__u24lambda_u2d7
        //  1221: bipush          100
        //  1223: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1226: checkcast       Ljava/lang/Number;
        //  1229: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1232: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1235: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1238: aload           4
        //  1240: aload_0         /* this */
        //  1241: invokespecial   gg/essential/gui/friends/previews/ChannelPreview.getImageContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1244: checkcast       Lgg/essential/elementa/UIComponent;
        //  1247: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1250: pop            
        //  1251: aload_0         /* this */
        //  1252: getfield        gg/essential/gui/friends/previews/ChannelPreview.titleState:Lgg/essential/elementa/state/MappedState;
        //  1255: aload_0         /* this */
        //  1256: getfield        gg/essential/gui/friends/previews/ChannelPreview.otherUser:Ljava/util/UUID;
        //  1259: invokestatic    gg/essential/util/UUIDUtil.getNameAsState:(Ljava/util/UUID;)Lgg/essential/gui/common/ReadOnlyState;
        //  1262: dup            
        //  1263: ldc_w           "getNameAsState(otherUser)"
        //  1266: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1269: checkcast       Lgg/essential/elementa/state/State;
        //  1272: invokevirtual   gg/essential/elementa/state/MappedState.rebind:(Lgg/essential/elementa/state/State;)V
        //  1275: goto            1494
        //  1278: aload_0         /* this */
        //  1279: getfield        gg/essential/gui/friends/previews/ChannelPreview.titleState:Lgg/essential/elementa/state/MappedState;
        //  1282: aload_0         /* this */
        //  1283: getfield        gg/essential/gui/friends/previews/ChannelPreview.messengerStates:Lgg/essential/gui/friends/state/IMessengerStates;
        //  1286: aload_0         /* this */
        //  1287: getfield        gg/essential/gui/friends/previews/ChannelPreview.channel:Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //  1290: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //  1293: invokeinterface gg/essential/gui/friends/state/IMessengerStates.getTitle:(J)Lgg/essential/gui/common/ReadOnlyState;
        //  1298: checkcast       Lgg/essential/elementa/state/State;
        //  1301: invokevirtual   gg/essential/elementa/state/MappedState.rebind:(Lgg/essential/elementa/state/State;)V
        //  1304: aload_0         /* this */
        //  1305: getfield        gg/essential/gui/friends/previews/ChannelPreview.channel:Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //  1308: invokestatic    gg/essential/util/ExtensionsKt.isAnnouncement:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Z
        //  1311: ifeq            1395
        //  1314: getstatic       gg/essential/elementa/components/UIImage.Companion:Lgg/essential/elementa/components/UIImage$Companion;
        //  1317: ldc_w           "/assets/essential/textures/announcement_icon.png"
        //  1320: invokevirtual   gg/essential/elementa/components/UIImage$Companion.ofResourceCached:(Ljava/lang/String;)Lgg/essential/elementa/components/UIImage;
        //  1323: checkcast       Lgg/essential/elementa/UIComponent;
        //  1326: astore_3        /* $this$constrain$iv */
        //  1327: aload_3         /* $this$constrain$iv */
        //  1328: astore          4
        //  1330: aload           4
        //  1332: astore          $this$constrain_u24lambda_u2d0$iv
        //  1334: aload           $this$constrain_u24lambda_u2d0$iv
        //  1336: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1339: astore          $this$_init__u24lambda_u2d8
        //  1341: aload           $this$_init__u24lambda_u2d8
        //  1343: bipush          100
        //  1345: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1348: checkcast       Ljava/lang/Number;
        //  1351: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1354: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1357: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1360: aload           $this$_init__u24lambda_u2d8
        //  1362: bipush          100
        //  1364: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1367: checkcast       Ljava/lang/Number;
        //  1370: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1373: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1376: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1379: aload           4
        //  1381: aload_0         /* this */
        //  1382: invokespecial   gg/essential/gui/friends/previews/ChannelPreview.getImageContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1385: checkcast       Lgg/essential/elementa/UIComponent;
        //  1388: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1391: pop            
        //  1392: goto            1494
        //  1395: getstatic       gg/essential/elementa/components/UIImage.Companion:Lgg/essential/elementa/components/UIImage$Companion;
        //  1398: getstatic       gg/essential/gui/friends/previews/ChannelPreview.groupIcons:Ljava/util/List;
        //  1401: checkcast       Ljava/util/Collection;
        //  1404: aload_0         /* this */
        //  1405: getfield        gg/essential/gui/friends/previews/ChannelPreview.channel:Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //  1408: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //  1411: invokestatic    kotlin/random/RandomKt.Random:(J)Lkotlin/random/Random;
        //  1414: invokestatic    kotlin/collections/CollectionsKt.random:(Ljava/util/Collection;Lkotlin/random/Random;)Ljava/lang/Object;
        //  1417: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/Object;)Ljava/lang/String;
        //  1422: invokevirtual   gg/essential/elementa/components/UIImage$Companion.ofResourceCached:(Ljava/lang/String;)Lgg/essential/elementa/components/UIImage;
        //  1425: checkcast       Lgg/essential/elementa/UIComponent;
        //  1428: astore_3        /* $this$constrain$iv */
        //  1429: aload_3         /* $this$constrain$iv */
        //  1430: astore          4
        //  1432: aload           4
        //  1434: astore          $this$constrain_u24lambda_u2d0$iv
        //  1436: aload           $this$constrain_u24lambda_u2d0$iv
        //  1438: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1441: astore          $this$_init__u24lambda_u2d9
        //  1443: aload           $this$_init__u24lambda_u2d9
        //  1445: bipush          100
        //  1447: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1450: checkcast       Ljava/lang/Number;
        //  1453: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1456: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1459: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1462: aload           $this$_init__u24lambda_u2d9
        //  1464: bipush          100
        //  1466: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1469: checkcast       Ljava/lang/Number;
        //  1472: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1475: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1478: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1481: aload           4
        //  1483: aload_0         /* this */
        //  1484: invokespecial   gg/essential/gui/friends/previews/ChannelPreview.getImageContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1487: checkcast       Lgg/essential/elementa/UIComponent;
        //  1490: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1493: pop            
        //  1494: return         
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  gui      
        //  channel  
        //    StackMapTable: 00 07 FF 00 3A 00 01 07 00 02 00 01 07 00 02 FF 00 00 00 01 07 00 02 00 02 07 00 02 01 FF 00 1E 00 01 07 00 02 00 03 07 00 02 08 00 4A 08 00 4A FF 00 01 00 01 07 00 02 00 04 07 00 02 08 00 4A 08 00 4A 07 00 B1 FB 04 A1 FB 00 74 FA 00 62
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final SocialMenu getGui() {
        return this.gui;
    }
    
    @NotNull
    public final Channel getChannel() {
        return this.channel;
    }
    
    @Nullable
    public final UUID getOtherUser() {
        return this.otherUser;
    }
    
    @NotNull
    public final MappedState<String, String> getTitleState() {
        return this.titleState;
    }
    
    @NotNull
    public final ReadOnlyState<Boolean> getHasUnreadState() {
        return this.hasUnreadState;
    }
    
    public final long getLatestMessageTimestamp() {
        final Message message = this.latestMessageState.get();
        return ((message != null) ? message.getId() : this.channel.getId()) >> 22;
    }
    
    private final UIContainer getContentContainer() {
        return (UIContainer)this.contentContainer$delegate.getValue((Object)this, (KProperty)ChannelPreview.$$delegatedProperties[0]);
    }
    
    private final UIContainer getImageContainer() {
        return (UIContainer)this.imageContainer$delegate.getValue((Object)this, (KProperty)ChannelPreview.$$delegatedProperties[1]);
    }
    
    private final UIText getTitleText() {
        return (UIText)this.titleText$delegate.getValue((Object)this, (KProperty)ChannelPreview.$$delegatedProperties[2]);
    }
    
    @NotNull
    @Override
    public String getSearchTag() {
        return this.titleState.get();
    }
    
    public static final /* synthetic */ ReadOnlyState access$getLatestMessageState$p(final ChannelPreview $this) {
        return $this.latestMessageState;
    }
    
    public static final /* synthetic */ Tag access$getUnreadQuantity$p(final ChannelPreview $this) {
        return $this.unreadQuantity;
    }
    
    public static final /* synthetic */ BasicState access$getDropdownOpen$p(final ChannelPreview $this) {
        return $this.dropdownOpen;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ChannelPreview.class, "contentContainer", "getContentContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ChannelPreview.class, "imageContainer", "getImageContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ChannelPreview.class, "titleText", "getTitleText()Lgg/essential/elementa/components/UIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ChannelPreview.class, "description", "getDescription()Lgg/essential/gui/friends/previews/ChannelPreview$Description;", 0)) };
        new Companion((byte)0);
        groupIcons = CollectionsKt.listOf((Object[])new String[] { "blue", "purple", "red", "yellow" });
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000B
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u000e
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0010\u000b
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020	0\u0007X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u001b\u0010
                                                       \u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f
                                                       \u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f
                                                       \u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0007X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u0016\u0010\u0017\u001a
                                                        \u0019*\u0004\u0018\u00010\u00180\u0018X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\u001a""" }, d2 = { "Lgg/essential/gui/friends/previews/ChannelPreview$Description;", "Lgg/essential/elementa/components/UIContainer;", "(Lgg/essential/gui/friends/previews/ChannelPreview;)V", "activity", "Lgg/essential/gui/common/ReadOnlyState;", "Lgg/essential/gui/friends/state/PlayerActivity;", "descriptionState", "Lgg/essential/elementa/state/MappedState;", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "", "descriptionText", "Lgg/essential/elementa/components/UIText;", "getDescriptionText", "()Lgg/essential/elementa/components/UIText;", "descriptionText$delegate", "Lkotlin/properties/ReadWriteProperty;", "friendStatus", "Lgg/essential/gui/friends/previews/FriendStatus;", "getFriendStatus", "()Lgg/essential/gui/friends/previews/FriendStatus;", "friendStatus$delegate", "joinable", "", "uuid", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "essential" })
    public final class Description extends UIContainer
    {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
        private final UUID uuid;
        @NotNull
        private final ReadOnlyState<PlayerActivity> activity;
        @NotNull
        private final MappedState<PlayerActivity, Boolean> joinable;
        @NotNull
        private final MappedState<Message, String> descriptionState;
        final /* synthetic */ ChannelPreview this$0;
        
        public Description(final ChannelPreview this$0) {
            this.this$0 = this$0;
            super();
            UUID uuid;
            if ((uuid = this.this$0.getOtherUser()) == null) {
                uuid = UUIDUtil.formatWithDashes("00000000000000000000000000000000");
            }
            this.uuid = uuid;
            final IStatusStates statusStates = this.this$0.getGui().getSocialStateManager().getStatusStates();
            final UUID uuid2 = this.uuid;
            Intrinsics.checkNotNullExpressionValue((Object)uuid2, "uuid");
            this.activity = statusStates.getActivityState(uuid2);
            this.joinable = this.activity.map((kotlin.jvm.functions.Function1<? super PlayerActivity, ? extends Boolean>)ChannelPreview$Description$joinable.ChannelPreview$Description$joinable$1.INSTANCE);
            this.descriptionState = ChannelPreview.access$getLatestMessageState$p(this.this$0).map((Function1)new ChannelPreview$Description$descriptionState.ChannelPreview$Description$descriptionState$1(this.this$0));
            final UUID uuid3 = this.uuid;
            Intrinsics.checkNotNullExpressionValue((Object)uuid3, "uuid");
            ComponentsKt.provideDelegate(StateExtensionsKt.bindParent$default$6fcd5b6b(new FriendStatus(uuid3, this.this$0.getGui().getSocialStateManager().getStatusStates()), this, this.joinable, false, null, 12), this, Description.$$delegatedProperties[0]);
            UIComponent $this$constrain_u24lambda_u2d0$iv;
            UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new EssentialUIText(null, false, null, false, true, false, 15).bindText((State<String>)this.descriptionState);
            final UIConstraints $this$descriptionText_delegate_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$descriptionText_delegate_u24lambda_u2d0.setWidth(ConstraintsKt.min($this$descriptionText_delegate_u24lambda_u2d0.getWidth(), UtilitiesKt.getPercent(100)));
            $this$descriptionText_delegate_u24lambda_u2d0.setColor(UtilitiesKt.toConstraint(EssentialPalette.TEXT_DISABLED));
            ComponentsKt.provideDelegate(StateExtensionsKt.bindParent$default$6fcd5b6b($this$constrain_u24lambda_u2d0$iv, this, StateExtensionsKt.not((State<Boolean>)this.joinable), false, null, 12), this, Description.$$delegatedProperties[1]);
            $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = this);
            final UIConstraints $this$_init__u24lambda_u2d1 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$_init__u24lambda_u2d1.setWidth(new FillConstraint(false));
            $this$_init__u24lambda_u2d1.setHeight(new ChildBasedSizeConstraint(0.0f, 1, null));
        }
        
        static {
            $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Description.class, "friendStatus", "getFriendStatus()Lgg/essential/gui/friends/previews/FriendStatus;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Description.class, "descriptionText", "getDescriptionText()Lgg/essential/elementa/components/UIText;", 0)) };
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0016
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010 
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\u0006""" }, d2 = { "Lgg/essential/gui/friends/previews/ChannelPreview$Companion;", "", "()V", "groupIcons", "", "", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
