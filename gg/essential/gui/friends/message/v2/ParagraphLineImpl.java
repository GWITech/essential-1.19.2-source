package gg.essential.gui.friends.message.v2;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import kotlin.properties.*;
import gg.essential.elementa.markdown.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.*;
import gg.essential.gui.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.animation.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000^
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020.H\u0016J\b\u00100\u001a\u00020.H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010	\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010
                                                   \u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b#\u0010\u000f\u001a\u0004\b"\u0010\u001fR\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b(\u0010\u000f\u001a\u0004\b&\u0010'R\u000e\u0010)\u001a\u00020\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010*\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b,\u0010\u000f\u001a\u0004\b+\u0010¨\u00061""" }, d2 = { "Lgg/essential/gui/friends/message/v2/ParagraphLineImpl;", "Lgg/essential/gui/friends/message/v2/ParagraphLine;", "wrapper", "Lgg/essential/gui/friends/message/v2/MessageWrapper;", "messageContent", "", "(Lgg/essential/gui/friends/message/v2/MessageWrapper;Ljava/lang/String;)V", "announcementMessage", "", "cleanedText", "invisibleMessageSizeComponent", "Lgg/essential/elementa/markdown/MarkdownComponent;", "getInvisibleMessageSizeComponent", "()Lgg/essential/elementa/markdown/MarkdownComponent;", "invisibleMessageSizeComponent$delegate", "Lkotlin/properties/ReadWriteProperty;", "markdownConfig", "Lgg/essential/elementa/markdown/MarkdownConfig;", "message", "Lgg/essential/gui/friends/message/v2/ClientMessage;", "messageColor", "Lgg/essential/elementa/state/State;", "Ljava/awt/Color;", "messageContainer", "Lgg/essential/elementa/components/UIContainer;", "getMessageContainer", "()Lgg/essential/elementa/components/UIContainer;", "messageContainer$delegate", "messageDot", "Lgg/essential/elementa/components/UIBlock;", "getMessageDot", "()Lgg/essential/elementa/components/UIBlock;", "messageDot$delegate", "messageOutlineBox", "getMessageOutlineBox", "messageOutlineBox$delegate", "retryButton", "Lgg/essential/gui/common/IconButton;", "getRetryButton", "()Lgg/essential/gui/common/IconButton;", "retryButton$delegate", "sentByClient", "visibleMessageComponent", "getVisibleMessageComponent", "visibleMessageComponent$delegate", "animationFrame", "", "beginHighlight", "releaseHighlight", "essential" })
public final class ParagraphLineImpl extends ParagraphLine
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ClientMessage message;
    private final boolean sentByClient;
    private final boolean announcementMessage;
    @NotNull
    private final String cleanedText;
    @NotNull
    private final MarkdownConfig markdownConfig;
    @NotNull
    private final State<Color> messageColor;
    @NotNull
    private final ReadWriteProperty messageOutlineBox$delegate;
    @NotNull
    private final ReadWriteProperty invisibleMessageSizeComponent$delegate;
    @NotNull
    private final ReadWriteProperty messageContainer$delegate;
    @NotNull
    private final ReadWriteProperty visibleMessageComponent$delegate;
    
    public ParagraphLineImpl(@NotNull final MessageWrapper wrapper, @NotNull final String messageContent) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "wrapper"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* messageContent */
        //     7: ldc             "messageContent"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: aload_2         /* messageContent */
        //    14: aload_1         /* wrapper */
        //    15: invokespecial   gg/essential/gui/friends/message/v2/ParagraphLine.<init>:(Ljava/lang/String;Lgg/essential/gui/friends/message/v2/MessageWrapper;)V
        //    18: aload_0         /* this */
        //    19: aload_1         /* wrapper */
        //    20: invokevirtual   gg/essential/gui/friends/message/v2/MessageWrapper.getMessage:()Lgg/essential/gui/friends/message/v2/ClientMessage;
        //    23: putfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.message:Lgg/essential/gui/friends/message/v2/ClientMessage;
        //    26: aload_0         /* this */
        //    27: aload_0         /* this */
        //    28: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.message:Lgg/essential/gui/friends/message/v2/ClientMessage;
        //    31: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getSender:()Ljava/util/UUID;
        //    34: invokestatic    gg/essential/util/UUIDUtil.getClientUUID:()Ljava/util/UUID;
        //    37: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    40: putfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.sentByClient:Z
        //    43: aload_0         /* this */
        //    44: aload_0         /* this */
        //    45: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.message:Lgg/essential/gui/friends/message/v2/ClientMessage;
        //    48: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //    51: invokestatic    gg/essential/util/ExtensionsKt.isAnnouncement:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Z
        //    54: putfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.announcementMessage:Z
        //    57: aload_0         /* this */
        //    58: getstatic       gg/essential/gui/friends/message/MessageUtils.INSTANCE:Lgg/essential/gui/friends/message/MessageUtils;
        //    61: aload_0         /* this */
        //    62: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.message:Lgg/essential/gui/friends/message/v2/ClientMessage;
        //    65: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getContents:()Ljava/lang/String;
        //    68: invokevirtual   gg/essential/gui/friends/message/MessageUtils.handleMarkdownUrls:(Ljava/lang/String;)Ljava/lang/String;
        //    71: putfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.cleanedText:Ljava/lang/String;
        //    74: aload_0         /* this */
        //    75: aload_0         /* this */
        //    76: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.message:Lgg/essential/gui/friends/message/v2/ClientMessage;
        //    79: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getSendState:()Lgg/essential/gui/friends/message/v2/SendState;
        //    82: getstatic       gg/essential/gui/friends/message/v2/SendState.FAILED:Lgg/essential/gui/friends/message/v2/SendState;
        //    85: if_acmpne       97
        //    88: getstatic       gg/essential/gui/friends/message/MessageUtils.INSTANCE:Lgg/essential/gui/friends/message/MessageUtils;
        //    91: invokevirtual   gg/essential/gui/friends/message/MessageUtils.getFailedMessageMarkdownConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //    94: goto            141
        //    97: aload_0         /* this */
        //    98: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.message:Lgg/essential/gui/friends/message/v2/ClientMessage;
        //   101: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   104: invokestatic    gg/essential/util/ExtensionsKt.isAnnouncement:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Z
        //   107: ifeq            119
        //   110: getstatic       gg/essential/gui/friends/message/MessageUtils.INSTANCE:Lgg/essential/gui/friends/message/MessageUtils;
        //   113: invokevirtual   gg/essential/gui/friends/message/MessageUtils.getFullMarkdownConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //   116: goto            141
        //   119: aload_0         /* this */
        //   120: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.sentByClient:Z
        //   123: ifeq            135
        //   126: getstatic       gg/essential/gui/friends/message/MessageUtils.INSTANCE:Lgg/essential/gui/friends/message/MessageUtils;
        //   129: invokevirtual   gg/essential/gui/friends/message/MessageUtils.getOutgoingMessageMarkdownConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //   132: goto            141
        //   135: getstatic       gg/essential/gui/friends/message/MessageUtils.INSTANCE:Lgg/essential/gui/friends/message/MessageUtils;
        //   138: invokevirtual   gg/essential/gui/friends/message/MessageUtils.getIncomingMessageMarkdownConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //   141: putfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.markdownConfig:Lgg/essential/elementa/markdown/MarkdownConfig;
        //   144: new             Lgg/essential/gui/common/IconButton;
        //   147: dup            
        //   148: getstatic       gg/essential/gui/EssentialPalette.RETRY_7X:Lgg/essential/gui/image/ImageFactory;
        //   151: ldc             ""
        //   153: ldc             "Retry"
        //   155: iconst_0       
        //   156: iconst_0       
        //   157: iconst_0       
        //   158: bipush          56
        //   160: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   163: checkcast       Lgg/essential/elementa/UIComponent;
        //   166: astore_3        /* $this$constrain$iv */
        //   167: aload_3         /* $this$constrain$iv */
        //   168: astore          5
        //   170: aload           5
        //   172: astore          $this$constrain_u24lambda_u2d0$iv
        //   174: aload           $this$constrain_u24lambda_u2d0$iv
        //   176: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   179: astore          $this$retryButton_delegate_u24lambda_u2d0
        //   181: aload           $this$retryButton_delegate_u24lambda_u2d0
        //   183: iconst_0       
        //   184: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   187: checkcast       Ljava/lang/Number;
        //   190: iconst_1       
        //   191: iconst_0       
        //   192: iconst_2       
        //   193: aconst_null    
        //   194: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   197: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   200: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   203: aload           $this$retryButton_delegate_u24lambda_u2d0
        //   205: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   208: dup            
        //   209: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   212: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   215: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   218: aload           $this$retryButton_delegate_u24lambda_u2d0
        //   220: bipush          17
        //   222: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   225: checkcast       Ljava/lang/Number;
        //   228: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   231: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   234: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   237: aload           $this$retryButton_delegate_u24lambda_u2d0
        //   239: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   242: dup            
        //   243: fconst_0       
        //   244: iconst_1       
        //   245: aconst_null    
        //   246: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   249: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   252: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   255: aload           5
        //   257: checkcast       Lgg/essential/gui/common/IconButton;
        //   260: new             Lgg/essential/gui/friends/message/v2/ParagraphLineImpl$retryButton$3;
        //   263: dup            
        //   264: aload_1         /* wrapper */
        //   265: invokespecial   gg/essential/gui/friends/message/v2/ParagraphLineImpl$retryButton$3.<init>:(Lgg/essential/gui/friends/message/v2/MessageWrapper;)V
        //   268: checkcast       Lkotlin/jvm/functions/Function0;
        //   271: invokevirtual   gg/essential/gui/common/IconButton.onActiveClick:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/IconButton;
        //   274: checkcast       Lgg/essential/elementa/UIComponent;
        //   277: aload_0         /* this */
        //   278: checkcast       Lgg/essential/elementa/UIComponent;
        //   281: new             Lgg/essential/elementa/state/BasicState;
        //   284: dup            
        //   285: aload_1         /* wrapper */
        //   286: invokevirtual   gg/essential/gui/friends/message/v2/MessageWrapper.getMessage:()Lgg/essential/gui/friends/message/v2/ClientMessage;
        //   289: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getSendState:()Lgg/essential/gui/friends/message/v2/SendState;
        //   292: getstatic       gg/essential/gui/friends/message/v2/SendState.FAILED:Lgg/essential/gui/friends/message/v2/SendState;
        //   295: if_acmpne       309
        //   298: aload_0         /* this */
        //   299: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.sentByClient:Z
        //   302: ifeq            309
        //   305: iconst_1       
        //   306: goto            310
        //   309: iconst_0       
        //   310: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   313: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   316: checkcast       Lgg/essential/elementa/state/State;
        //   319: iconst_0       
        //   320: aconst_null    
        //   321: bipush          12
        //   323: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   326: aload_0         /* this */
        //   327: getstatic       gg/essential/gui/friends/message/v2/ParagraphLineImpl.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   330: iconst_0       
        //   331: aaload         
        //   332: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   335: pop            
        //   336: aload_0         /* this */
        //   337: new             Lgg/essential/elementa/components/UIBlock;
        //   340: dup            
        //   341: aconst_null    
        //   342: iconst_1       
        //   343: aconst_null    
        //   344: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   347: checkcast       Lgg/essential/elementa/UIComponent;
        //   350: astore_3        /* $this$constrain$iv */
        //   351: aload_3         /* $this$constrain$iv */
        //   352: astore          5
        //   354: aload           5
        //   356: astore          $this$constrain_u24lambda_u2d0$iv
        //   358: aload           $this$constrain_u24lambda_u2d0$iv
        //   360: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   363: astore          7
        //   365: astore          8
        //   367: aload           $this$messageOutlineBox_delegate_u24lambda_u2d1
        //   369: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   372: dup            
        //   373: ldc_w           9.0
        //   376: aload_0         /* this */
        //   377: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.sentByClient:Z
        //   380: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   383: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   386: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   389: aload           $this$messageOutlineBox_delegate_u24lambda_u2d1
        //   391: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   394: dup            
        //   395: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   398: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   401: aload_0         /* this */
        //   402: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.announcementMessage:Z
        //   405: ifeq            422
        //   408: bipush          30
        //   410: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   413: checkcast       Ljava/lang/Number;
        //   416: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   419: goto            433
        //   422: bipush          16
        //   424: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   427: checkcast       Ljava/lang/Number;
        //   430: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   433: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   436: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   439: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   442: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   445: aload           $this$messageOutlineBox_delegate_u24lambda_u2d1
        //   447: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   450: dup            
        //   451: fconst_0       
        //   452: iconst_1       
        //   453: aconst_null    
        //   454: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   457: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   460: ldc_w           20.0
        //   463: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   466: checkcast       Ljava/lang/Number;
        //   469: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   472: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   475: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   478: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   481: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   484: aload           8
        //   486: aload           5
        //   488: astore_3        /* $this$constrain$iv */
        //   489: aload_3        
        //   490: checkcast       Lgg/essential/elementa/components/UIBlock;
        //   493: astore          4
        //   495: astore          8
        //   497: aload_0         /* this */
        //   498: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   501: aload           $this$messageOutlineBox_delegate_u24lambda_u2d2
        //   503: checkcast       Lgg/essential/elementa/UIComponent;
        //   506: iconst_0       
        //   507: iconst_0       
        //   508: iconst_3       
        //   509: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   512: aload_1         /* wrapper */
        //   513: invokevirtual   gg/essential/gui/friends/message/v2/MessageWrapper.getDropdownOpen:()Lgg/essential/elementa/state/BasicState;
        //   516: checkcast       Lgg/essential/elementa/state/State;
        //   519: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   522: checkcast       Lgg/essential/elementa/state/State;
        //   525: aload_0         /* this */
        //   526: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.sentByClient:Z
        //   529: invokevirtual   gg/essential/gui/EssentialPalette.getMessageColor:(Lgg/essential/elementa/state/State;Z)Lgg/essential/elementa/state/State;
        //   532: putfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.messageColor:Lgg/essential/elementa/state/State;
        //   535: aload           $this$messageOutlineBox_delegate_u24lambda_u2d2
        //   537: aload_0         /* this */
        //   538: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.messageColor:Lgg/essential/elementa/state/State;
        //   541: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   544: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   547: invokevirtual   gg/essential/elementa/components/UIBlock.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   550: pop            
        //   551: aload           8
        //   553: aload_3        
        //   554: aload_0         /* this */
        //   555: checkcast       Lgg/essential/elementa/UIComponent;
        //   558: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   561: aload_0         /* this */
        //   562: getstatic       gg/essential/gui/friends/message/v2/ParagraphLineImpl.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   565: iconst_1       
        //   566: aaload         
        //   567: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   570: putfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.messageOutlineBox$delegate:Lkotlin/properties/ReadWriteProperty;
        //   573: new             Lgg/essential/elementa/components/UIBlock;
        //   576: dup            
        //   577: aconst_null    
        //   578: iconst_1       
        //   579: aconst_null    
        //   580: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   583: checkcast       Lgg/essential/elementa/UIComponent;
        //   586: astore_3        /* $this$constrain$iv */
        //   587: aload_3         /* $this$constrain$iv */
        //   588: astore          5
        //   590: aload           5
        //   592: astore          $this$constrain_u24lambda_u2d0$iv
        //   594: aload           $this$constrain_u24lambda_u2d0$iv
        //   596: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   599: astore          $this$messageDot_delegate_u24lambda_u2d3
        //   601: aload           $this$messageDot_delegate_u24lambda_u2d3
        //   603: ldc_w           3.0
        //   606: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   609: checkcast       Ljava/lang/Number;
        //   612: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   615: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   618: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   621: aload           $this$messageDot_delegate_u24lambda_u2d3
        //   623: ldc_w           3.0
        //   626: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   629: checkcast       Ljava/lang/Number;
        //   632: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   635: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   638: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   641: aload           $this$messageDot_delegate_u24lambda_u2d3
        //   643: iconst_0       
        //   644: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   647: checkcast       Ljava/lang/Number;
        //   650: aload_0         /* this */
        //   651: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.sentByClient:Z
        //   654: iconst_1       
        //   655: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
        //   658: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   661: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   664: aload           $this$messageDot_delegate_u24lambda_u2d3
        //   666: iconst_0       
        //   667: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   670: checkcast       Ljava/lang/Number;
        //   673: iconst_1       
        //   674: iconst_0       
        //   675: iconst_2       
        //   676: aconst_null    
        //   677: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   680: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   683: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   686: aload           $this$messageDot_delegate_u24lambda_u2d3
        //   688: new             Lgg/essential/elementa/constraints/CopyConstraintColor;
        //   691: dup            
        //   692: invokespecial   gg/essential/elementa/constraints/CopyConstraintColor.<init>:()V
        //   695: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   698: aload_0         /* this */
        //   699: invokespecial   gg/essential/gui/friends/message/v2/ParagraphLineImpl.getMessageOutlineBox:()Lgg/essential/elementa/components/UIBlock;
        //   702: checkcast       Lgg/essential/elementa/UIComponent;
        //   705: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   708: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   711: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   714: aload           5
        //   716: aload_0         /* this */
        //   717: invokespecial   gg/essential/gui/friends/message/v2/ParagraphLineImpl.getMessageOutlineBox:()Lgg/essential/elementa/components/UIBlock;
        //   720: checkcast       Lgg/essential/elementa/UIComponent;
        //   723: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   726: aload_0         /* this */
        //   727: getstatic       gg/essential/gui/friends/message/v2/ParagraphLineImpl.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   730: iconst_2       
        //   731: aaload         
        //   732: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   735: pop            
        //   736: aload_0         /* this */
        //   737: new             Lgg/essential/elementa/markdown/MarkdownComponent;
        //   740: dup            
        //   741: aload_0         /* this */
        //   742: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.cleanedText:Ljava/lang/String;
        //   745: aload_0         /* this */
        //   746: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.markdownConfig:Lgg/essential/elementa/markdown/MarkdownConfig;
        //   749: fconst_0       
        //   750: aconst_null    
        //   751: bipush          12
        //   753: aconst_null    
        //   754: invokespecial   gg/essential/elementa/markdown/MarkdownComponent.<init>:(Ljava/lang/String;Lgg/essential/elementa/markdown/MarkdownConfig;FLgg/essential/elementa/font/FontProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   757: checkcast       Lgg/essential/elementa/UIComponent;
        //   760: astore_3        /* $this$constrain$iv */
        //   761: aload_3         /* $this$constrain$iv */
        //   762: astore          5
        //   764: aload           5
        //   766: astore          $this$constrain_u24lambda_u2d0$iv
        //   768: aload           $this$constrain_u24lambda_u2d0$iv
        //   770: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   773: astore          7
        //   775: astore          8
        //   777: aload           $this$invisibleMessageSizeComponent_delegate_u24lambda_u2d4
        //   779: bipush          100
        //   781: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   784: checkcast       Ljava/lang/Number;
        //   787: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   790: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   793: ldc_w           20.0
        //   796: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   799: checkcast       Ljava/lang/Number;
        //   802: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   805: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   808: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   811: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   814: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   817: aload           8
        //   819: aload           5
        //   821: aload_0         /* this */
        //   822: checkcast       Lgg/essential/elementa/UIComponent;
        //   825: invokestatic    gg/essential/util/ExtensionsKt.hiddenChildOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   828: aload_0         /* this */
        //   829: getstatic       gg/essential/gui/friends/message/v2/ParagraphLineImpl.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   832: iconst_3       
        //   833: aaload         
        //   834: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   837: putfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.invisibleMessageSizeComponent$delegate:Lkotlin/properties/ReadWriteProperty;
        //   840: aload_0         /* this */
        //   841: new             Lgg/essential/elementa/components/UIContainer;
        //   844: dup            
        //   845: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   848: checkcast       Lgg/essential/elementa/UIComponent;
        //   851: astore_3        /* $this$constrain$iv */
        //   852: aload_3         /* $this$constrain$iv */
        //   853: astore          5
        //   855: aload           5
        //   857: astore          $this$constrain_u24lambda_u2d0$iv
        //   859: aload           $this$constrain_u24lambda_u2d0$iv
        //   861: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   864: astore          7
        //   866: astore          8
        //   868: aload           $this$messageContainer_delegate_u24lambda_u2d5
        //   870: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   873: dup            
        //   874: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   877: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   880: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   883: aload           $this$messageContainer_delegate_u24lambda_u2d5
        //   885: bipush          9
        //   887: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   890: checkcast       Ljava/lang/Number;
        //   893: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   896: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   899: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   902: aload           $this$messageContainer_delegate_u24lambda_u2d5
        //   904: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   907: dup            
        //   908: fconst_0       
        //   909: iconst_1       
        //   910: aconst_null    
        //   911: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   914: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   917: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   920: aload           $this$messageContainer_delegate_u24lambda_u2d5
        //   922: new             Lgg/essential/gui/common/constraints/MarkdownContentWidthConstraint;
        //   925: dup            
        //   926: invokespecial   gg/essential/gui/common/constraints/MarkdownContentWidthConstraint.<init>:()V
        //   929: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   932: aload_0         /* this */
        //   933: invokespecial   gg/essential/gui/friends/message/v2/ParagraphLineImpl.getInvisibleMessageSizeComponent:()Lgg/essential/elementa/markdown/MarkdownComponent;
        //   936: checkcast       Lgg/essential/elementa/UIComponent;
        //   939: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   942: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   945: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   948: aload           8
        //   950: aload           5
        //   952: aload_0         /* this */
        //   953: invokespecial   gg/essential/gui/friends/message/v2/ParagraphLineImpl.getMessageOutlineBox:()Lgg/essential/elementa/components/UIBlock;
        //   956: checkcast       Lgg/essential/elementa/UIComponent;
        //   959: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   962: aload_0         /* this */
        //   963: getstatic       gg/essential/gui/friends/message/v2/ParagraphLineImpl.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   966: iconst_4       
        //   967: aaload         
        //   968: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   971: putfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.messageContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   974: aload_0         /* this */
        //   975: new             Lgg/essential/elementa/markdown/MarkdownComponent;
        //   978: dup            
        //   979: aload_0         /* this */
        //   980: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.cleanedText:Ljava/lang/String;
        //   983: aload_0         /* this */
        //   984: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.markdownConfig:Lgg/essential/elementa/markdown/MarkdownConfig;
        //   987: fconst_0       
        //   988: aconst_null    
        //   989: bipush          12
        //   991: aconst_null    
        //   992: invokespecial   gg/essential/elementa/markdown/MarkdownComponent.<init>:(Ljava/lang/String;Lgg/essential/elementa/markdown/MarkdownConfig;FLgg/essential/elementa/font/FontProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   995: checkcast       Lgg/essential/elementa/UIComponent;
        //   998: astore_3        /* $this$constrain$iv */
        //   999: aload_3         /* $this$constrain$iv */
        //  1000: astore          5
        //  1002: aload           5
        //  1004: astore          $this$constrain_u24lambda_u2d0$iv
        //  1006: aload           $this$constrain_u24lambda_u2d0$iv
        //  1008: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1011: astore          7
        //  1013: astore          8
        //  1015: aload           $this$visibleMessageComponent_delegate_u24lambda_u2d6
        //  1017: bipush          100
        //  1019: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1022: checkcast       Ljava/lang/Number;
        //  1025: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1028: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1031: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1034: aload           $this$visibleMessageComponent_delegate_u24lambda_u2d6
        //  1036: aload_0         /* this */
        //  1037: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.message:Lgg/essential/gui/friends/message/v2/ClientMessage;
        //  1040: invokevirtual   gg/essential/gui/friends/message/v2/ClientMessage.getSendState:()Lgg/essential/gui/friends/message/v2/SendState;
        //  1043: getstatic       gg/essential/gui/friends/message/v2/ParagraphLineImpl$WhenMappings.$EnumSwitchMapping$0:[I
        //  1046: swap           
        //  1047: invokevirtual   gg/essential/gui/friends/message/v2/SendState.ordinal:()I
        //  1050: iaload         
        //  1051: tableswitch {
        //                2: 1076
        //                3: 1095
        //                4: 1101
        //          default: 1107
        //        }
        //  1076: aload_0         /* this */
        //  1077: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.sentByClient:Z
        //  1080: ifeq            1089
        //  1083: getstatic       gg/essential/gui/EssentialPalette.SENT_MESSAGE_TEXT:Ljava/awt/Color;
        //  1086: goto            1115
        //  1089: getstatic       gg/essential/gui/EssentialPalette.RECEIVED_MESSAGE_TEXT:Ljava/awt/Color;
        //  1092: goto            1115
        //  1095: getstatic       gg/essential/gui/EssentialPalette.PENDING_MESSAGE_TEXT:Ljava/awt/Color;
        //  1098: goto            1115
        //  1101: getstatic       gg/essential/gui/EssentialPalette.FAILED_MESSAGE_TEXT:Ljava/awt/Color;
        //  1104: goto            1115
        //  1107: new             Lkotlin/NoWhenBranchMatchedException;
        //  1110: dup            
        //  1111: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //  1114: athrow         
        //  1115: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1118: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1121: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1124: aload           8
        //  1126: aload           5
        //  1128: aload_0         /* this */
        //  1129: invokespecial   gg/essential/gui/friends/message/v2/ParagraphLineImpl.getMessageContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1132: checkcast       Lgg/essential/elementa/UIComponent;
        //  1135: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1138: aload_0         /* this */
        //  1139: getstatic       gg/essential/gui/friends/message/v2/ParagraphLineImpl.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1142: iconst_5       
        //  1143: aaload         
        //  1144: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1147: putfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.visibleMessageComponent$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1150: aload_0         /* this */
        //  1151: checkcast       Lgg/essential/elementa/UIComponent;
        //  1154: astore_3        /* $this$constrain$iv */
        //  1155: aload_3         /* $this$constrain$iv */
        //  1156: astore          5
        //  1158: aload           5
        //  1160: astore          $this$constrain_u24lambda_u2d0$iv
        //  1162: aload           $this$constrain_u24lambda_u2d0$iv
        //  1164: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1167: astore          $this$_init__u24lambda_u2d7
        //  1169: aload           $this$_init__u24lambda_u2d7
        //  1171: getstatic       gg/essential/gui/friends/message/MessageUtils.INSTANCE:Lgg/essential/gui/friends/message/MessageUtils;
        //  1174: aload_0         /* this */
        //  1175: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl.announcementMessage:Z
        //  1178: invokestatic    gg/essential/gui/friends/message/MessageUtils.getMessageWidth$default$5943b3e6$58ff3b4a:(Lgg/essential/gui/friends/message/MessageUtils;Z)Lgg/essential/elementa/constraints/WidthConstraint;
        //  1181: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1184: aload           $this$_init__u24lambda_u2d7
        //  1186: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //  1189: dup            
        //  1190: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //  1193: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1196: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1199: aload_0         /* this */
        //  1200: invokespecial   gg/essential/gui/friends/message/v2/ParagraphLineImpl.getVisibleMessageComponent:()Lgg/essential/elementa/markdown/MarkdownComponent;
        //  1203: checkcast       Lgg/essential/elementa/UIComponent;
        //  1206: new             Lgg/essential/gui/friends/message/v2/ParagraphLineImpl$2;
        //  1209: dup            
        //  1210: aload_0         /* this */
        //  1211: invokespecial   gg/essential/gui/friends/message/v2/ParagraphLineImpl$2.<init>:(Lgg/essential/gui/friends/message/v2/ParagraphLineImpl;)V
        //  1214: checkcast       Lkotlin/jvm/functions/Function0;
        //  1217: invokestatic    gg/essential/util/ExtensionsKt.onAnimationFrame:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/UIComponent;
        //  1220: pop            
        //  1221: aload_0         /* this */
        //  1222: invokespecial   gg/essential/gui/friends/message/v2/ParagraphLineImpl.getMessageOutlineBox:()Lgg/essential/elementa/components/UIBlock;
        //  1225: new             Lgg/essential/gui/friends/message/v2/ParagraphLineImpl$3;
        //  1228: dup            
        //  1229: aload_1         /* wrapper */
        //  1230: aload_0         /* this */
        //  1231: invokespecial   gg/essential/gui/friends/message/v2/ParagraphLineImpl$3.<init>:(Lgg/essential/gui/friends/message/v2/MessageWrapper;Lgg/essential/gui/friends/message/v2/ParagraphLineImpl;)V
        //  1234: checkcast       Lkotlin/jvm/functions/Function2;
        //  1237: invokevirtual   gg/essential/elementa/components/UIBlock.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1240: pop            
        //  1241: return         
        //    MethodParameters:
        //  Name            Flags  
        //  --------------  -----
        //  wrapper         
        //  messageContent  
        //    StackMapTable: 00 0E FF 00 61 00 02 07 00 02 07 00 5E 00 01 07 00 02 55 07 00 02 4F 07 00 02 FF 00 05 00 02 07 00 02 07 00 5E 00 02 07 00 02 07 00 AA FF 00 A7 00 02 07 00 02 07 00 5E 00 04 07 00 BC 07 00 BC 08 01 19 08 01 19 FF 00 00 00 02 07 00 02 07 00 5E 00 05 07 00 BC 07 00 BC 08 01 19 08 01 19 01 FF 00 6F 00 09 07 00 02 07 00 5E 00 00 00 07 00 BC 00 07 00 D2 07 00 02 00 02 07 00 D2 07 01 29 FF 00 0A 00 09 07 00 02 07 00 5E 00 00 00 07 00 BC 00 07 00 D2 07 00 02 00 03 07 00 D2 07 01 29 07 01 2B FF 02 82 00 09 07 00 02 07 00 5E 00 00 00 07 00 BC 00 00 07 00 02 00 01 07 00 D2 4C 07 00 D2 45 07 00 D2 45 07 00 D2 FF 00 05 00 00 00 01 07 00 D2 FF 00 07 00 09 07 00 02 07 00 5E 00 00 00 07 00 BC 00 00 07 00 02 00 02 07 00 D2 07 01 A7
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIBlock getMessageOutlineBox() {
        return (UIBlock)this.messageOutlineBox$delegate.getValue((Object)this, (KProperty)ParagraphLineImpl.$$delegatedProperties[1]);
    }
    
    private final MarkdownComponent getInvisibleMessageSizeComponent() {
        return (MarkdownComponent)this.invisibleMessageSizeComponent$delegate.getValue((Object)this, (KProperty)ParagraphLineImpl.$$delegatedProperties[3]);
    }
    
    private final UIContainer getMessageContainer() {
        return (UIContainer)this.messageContainer$delegate.getValue((Object)this, (KProperty)ParagraphLineImpl.$$delegatedProperties[4]);
    }
    
    private final MarkdownComponent getVisibleMessageComponent() {
        return (MarkdownComponent)this.visibleMessageComponent$delegate.getValue((Object)this, (KProperty)ParagraphLineImpl.$$delegatedProperties[5]);
    }
    
    @Override
    public void beginHighlight() {
        final UIComponent $this$animate_u24lambda_u2d0$iv;
        final UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this.getMessageOutlineBox();
        final AnimatingConstraints $this$beginHighlight_u24lambda_u2d8;
        final AnimatingConstraints anim$iv = $this$beginHighlight_u24lambda_u2d8 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        AnimatingConstraints.setColorAnimation$default($this$beginHighlight_u24lambda_u2d8, Animations.OUT_EXP, 0.25f, UtilitiesKt.toConstraint(EssentialPalette.MESSAGE_HIGHLIGHT), 0.0f, 8, null);
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    @Override
    public void releaseHighlight() {
        final UIComponent $this$animate_u24lambda_u2d0$iv;
        final UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this.getMessageOutlineBox();
        final AnimatingConstraints $this$releaseHighlight_u24lambda_u2d9;
        final AnimatingConstraints anim$iv = $this$releaseHighlight_u24lambda_u2d9 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        AnimatingConstraints.setColorAnimation$default($this$releaseHighlight_u24lambda_u2d9, Animations.IN_EXP, 0.25f, ExtensionsKt.toConstraint(this.messageColor), 0.0f, 8, null);
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    @Override
    public void animationFrame() {
        this.getInvisibleMessageSizeComponent().animationFrame();
        super.animationFrame();
    }
    
    public static final /* synthetic */ MarkdownComponent access$getVisibleMessageComponent(final ParagraphLineImpl $this) {
        return $this.getVisibleMessageComponent();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ParagraphLineImpl.class, "retryButton", "getRetryButton()Lgg/essential/gui/common/IconButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ParagraphLineImpl.class, "messageOutlineBox", "getMessageOutlineBox()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ParagraphLineImpl.class, "messageDot", "getMessageDot()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ParagraphLineImpl.class, "invisibleMessageSizeComponent", "getInvisibleMessageSizeComponent()Lgg/essential/elementa/markdown/MarkdownComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ParagraphLineImpl.class, "messageContainer", "getMessageContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ParagraphLineImpl.class, "visibleMessageComponent", "getVisibleMessageComponent()Lgg/essential/elementa/markdown/MarkdownComponent;", 0)) };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[SendState.values().length];
            $EnumSwitchMapping$[SendState.CONFIRMED.ordinal()] = 1;
            $EnumSwitchMapping$[SendState.SENDING.ordinal()] = 2;
            $EnumSwitchMapping$[SendState.FAILED.ordinal()] = 3;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
