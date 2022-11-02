package gg.essential.gui.friends.message.v2;

import kotlin.reflect.*;
import java.util.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import java.net.*;
import gg.essential.gui.common.*;
import gg.essential.gui.common.shadow.*;
import java.awt.*;
import gg.essential.gui.*;
import gg.essential.elementa.dsl.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.constraints.animation.*;
import javax.imageio.*;
import gg.essential.*;
import gg.essential.gui.friends.message.*;
import kotlin.text.jdk8.*;
import kotlin.text.*;
import java.io.*;
import org.apache.commons.io.*;
import java.nio.file.attribute.*;
import java.nio.file.*;
import java.awt.image.*;
import net.minecraft.client.*;
import gg.essential.util.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.components.*;
import java.util.concurrent.*;
import gg.essential.elementa.components.image.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0094\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010#
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002\u0018\u0000 82\u00020\u0001:\u000289B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005�\u0006\u0002\u0010\u0006J\b\u0010(\u001a\u00020)H\u0002J\u0018\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020)H\u0016J\b\u00100\u001a\u00020)H\u0016J
                                                   \u00101\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020\u001dH\u0002J\b\u00106\u001a\u00020)H\u0002J\b\u00107\u001a\u00020)H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\b\u000b\u0010\f\u001a\u0004\b	\u0010
                                                   R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004�\u0006\u0002
                                                   \u0000R\u001f\u0010\u0010\u001a\u00060\u0011R\u00020\u00008BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\b\u0019\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e�\u0006\u0002
                                                   \u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e�\u0006\u0004
                                                   \u0002\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e�\u0006\u0002
                                                   \u0000Rj\u0010!\u001a^\u0012(\u0012&\u0012\f\u0012
                                                    %*\u0004\u0018\u00010$0$ %*\u0012\u0012\f\u0012
                                                    %*\u0004\u0018\u00010$0$\u0018\u00010&0# %*.\u0012(\u0012&\u0012\f\u0012
                                                    %*\u0004\u0018\u00010$0$ %*\u0012\u0012\f\u0012
                                                    %*\u0004\u0018\u00010$0$\u0018\u00010&0#\u0018\u00010"0"X\u0082\u0004�\u0006\u0002
                                                   \u0000Rj\u0010'\u001a^\u0012(\u0012&\u0012\f\u0012
                                                    %*\u0004\u0018\u00010$0$ %*\u0012\u0012\f\u0012
                                                    %*\u0004\u0018\u00010$0$\u0018\u00010&0# %*.\u0012(\u0012&\u0012\f\u0012
                                                    %*\u0004\u0018\u00010$0$ %*\u0012\u0012\f\u0012
                                                    %*\u0004\u0018\u00010$0$\u0018\u00010&0#\u0018\u00010"0"X\u0082\u0004�\u0006\u0002
                                                   \u0000�\u0006:�\u0006
                                                   \u0010;\u001a\u00020<X\u008a\u0084\u0002�\u0006
                                                   \u0010=\u001a\u00020\bX\u008a\u0084\u0002�\u0006
                                                   \u0010>\u001a\u00020?X\u008a\u0084\u0002�\u0006
                                                   \u0010@\u001a\u00020AX\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;", "Lgg/essential/gui/friends/message/v2/ImageEmbed;", "url", "Ljava/net/URL;", "wrapper", "Lgg/essential/gui/friends/message/v2/MessageWrapper;", "(Ljava/net/URL;Lgg/essential/gui/friends/message/v2/MessageWrapper;)V", "addTrustedHostButton", "Lgg/essential/gui/common/IconButton;", "getAddTrustedHostButton", "()Lgg/essential/gui/common/IconButton;", "addTrustedHostButton$delegate", "Lkotlin/properties/ReadWriteProperty;", "aspectRatio", "Lgg/essential/elementa/state/BasicState;", "", "focusedView", "Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView;", "getFocusedView", "()Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView;", "focusedView$delegate", "imageSizeContainer", "Lgg/essential/elementa/components/UIContainer;", "getImageSizeContainer", "()Lgg/essential/elementa/components/UIContainer;", "imageSizeContainer$delegate", "loadedImage", "Ljava/awt/image/BufferedImage;", "loading", "", "Ljava/lang/Integer;", "previewing", "", "trustedHostState", "Lgg/essential/gui/common/WeakState;", "", "", "kotlin.jvm.PlatformType", "", "userTrustedHostsState", "addFailureMessage", "", "animateColor", "strategy", "Lgg/essential/elementa/constraints/animation/AnimationStrategy;", "color", "Ljava/awt/Color;", "beginHighlight", "copyImageToClipboard", "download", "getWindow", "Lgg/essential/elementa/components/Window;", "loadImage", "id", "prepareAndLoad", "releaseHighlight", "Companion", "FocusedView", "essential", "failureMessage", "Lgg/essential/gui/common/shadow/EssentialUIText;", "retryButton", "image", "Lgg/essential/elementa/components/UIImage;", "dot", "Lgg/essential/elementa/components/UIBlock;" })
public final class ImageEmbedImpl extends ImageEmbed
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    private final WeakState<Set<String>> trustedHostState;
    private final WeakState<Set<String>> userTrustedHostsState;
    @Nullable
    private BufferedImage loadedImage;
    @Nullable
    private Integer loading;
    @NotNull
    private final BasicState<Float> aspectRatio;
    @NotNull
    private final ReadWriteProperty focusedView$delegate;
    @NotNull
    private final ReadWriteProperty addTrustedHostButton$delegate;
    @NotNull
    private final ReadWriteProperty imageSizeContainer$delegate;
    private boolean previewing;
    private static int nextLoadingId;
    
    public ImageEmbedImpl(@NotNull final URL url, @NotNull final MessageWrapper wrapper) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "url"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* wrapper */
        //     7: ldc             "wrapper"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: aload_1         /* url */
        //    14: aload_2         /* wrapper */
        //    15: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbed.<init>:(Ljava/net/URL;Lgg/essential/gui/friends/message/v2/MessageWrapper;)V
        //    18: aload_0         /* this */
        //    19: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //    22: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //    25: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getProfileManager:()Lgg/essential/network/connectionmanager/profile/ProfileManager;
        //    28: invokevirtual   gg/essential/network/connectionmanager/profile/ProfileManager.getTrustedHostsState:()Lgg/essential/gui/common/WeakState;
        //    31: putfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl.trustedHostState:Lgg/essential/gui/common/WeakState;
        //    34: aload_0         /* this */
        //    35: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //    38: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //    41: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getProfileManager:()Lgg/essential/network/connectionmanager/profile/ProfileManager;
        //    44: invokevirtual   gg/essential/network/connectionmanager/profile/ProfileManager.getUserTrustedHostsState:()Lgg/essential/gui/common/WeakState;
        //    47: putfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl.userTrustedHostsState:Lgg/essential/gui/common/WeakState;
        //    50: aload_0         /* this */
        //    51: new             Lgg/essential/elementa/state/BasicState;
        //    54: dup            
        //    55: ldc             0.5625
        //    57: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    60: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    63: putfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl.aspectRatio:Lgg/essential/elementa/state/BasicState;
        //    66: aload_0         /* this */
        //    67: new             Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView;
        //    70: dup            
        //    71: aload_0         /* this */
        //    72: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.<init>:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)V
        //    75: checkcast       Lgg/essential/elementa/UIComponent;
        //    78: aload_0         /* this */
        //    79: getstatic       gg/essential/gui/friends/message/v2/ImageEmbedImpl.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //    82: iconst_0       
        //    83: aaload         
        //    84: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //    87: putfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl.focusedView$delegate:Lkotlin/properties/ReadWriteProperty;
        //    90: aload_0         /* this */
        //    91: new             Lgg/essential/gui/common/IconButton;
        //    94: dup            
        //    95: getstatic       gg/essential/gui/EssentialPalette.PLUS_7X:Lgg/essential/gui/image/ImageFactory;
        //    98: ldc             ""
        //   100: aload_1         /* url */
        //   101: invokevirtual   java/net/URL.getHost:()Ljava/lang/String;
        //   104: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   109: iconst_0       
        //   110: iconst_0       
        //   111: iconst_0       
        //   112: bipush          56
        //   114: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   117: checkcast       Lgg/essential/elementa/UIComponent;
        //   120: astore_3        /* $this$constrain$iv */
        //   121: aload_3         /* $this$constrain$iv */
        //   122: astore          4
        //   124: aload           4
        //   126: astore          $this$constrain_u24lambda_u2d0$iv
        //   128: aload           $this$constrain_u24lambda_u2d0$iv
        //   130: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   133: astore          6
        //   135: astore          7
        //   137: aload           $this$addTrustedHostButton_delegate_u24lambda_u2d0
        //   139: bipush          17
        //   141: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   144: checkcast       Ljava/lang/Number;
        //   147: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   150: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   153: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   156: aload           $this$addTrustedHostButton_delegate_u24lambda_u2d0
        //   158: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   161: dup            
        //   162: fconst_0       
        //   163: iconst_1       
        //   164: aconst_null    
        //   165: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   168: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   171: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   174: aload           7
        //   176: aload           4
        //   178: checkcast       Lgg/essential/gui/common/IconButton;
        //   181: new             Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$addTrustedHostButton$3;
        //   184: dup            
        //   185: aload_1         /* url */
        //   186: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$addTrustedHostButton$3.<init>:(Ljava/net/URL;)V
        //   189: checkcast       Lkotlin/jvm/functions/Function0;
        //   192: invokevirtual   gg/essential/gui/common/IconButton.onActiveClick:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/IconButton;
        //   195: checkcast       Lgg/essential/elementa/UIComponent;
        //   198: aload_0         /* this */
        //   199: checkcast       Lgg/essential/elementa/UIComponent;
        //   202: invokestatic    gg/essential/util/ExtensionsKt.hiddenChildOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   205: aload_0         /* this */
        //   206: getstatic       gg/essential/gui/friends/message/v2/ImageEmbedImpl.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   209: iconst_1       
        //   210: aaload         
        //   211: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   214: putfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl.addTrustedHostButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //   217: aload_0         /* this */
        //   218: new             Lgg/essential/elementa/components/UIContainer;
        //   221: dup            
        //   222: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   225: checkcast       Lgg/essential/elementa/UIComponent;
        //   228: astore_3        /* $this$constrain$iv */
        //   229: aload_3         /* $this$constrain$iv */
        //   230: astore          4
        //   232: aload           4
        //   234: astore          $this$constrain_u24lambda_u2d0$iv
        //   236: aload           $this$constrain_u24lambda_u2d0$iv
        //   238: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   241: astore          6
        //   243: astore          7
        //   245: aload           $this$imageSizeContainer_delegate_u24lambda_u2d1
        //   247: getstatic       gg/essential/gui/friends/message/MessageUtils.INSTANCE:Lgg/essential/gui/friends/message/MessageUtils;
        //   250: aload_2         /* wrapper */
        //   251: invokevirtual   gg/essential/gui/friends/message/v2/MessageWrapper.getChannelType:()Lcom/sparkuniverse/toolbox/chat/enums/ChannelType;
        //   254: getstatic       com/sparkuniverse/toolbox/chat/enums/ChannelType.ANNOUNCEMENT:Lcom/sparkuniverse/toolbox/chat/enums/ChannelType;
        //   257: if_acmpne       264
        //   260: iconst_1       
        //   261: goto            265
        //   264: iconst_0       
        //   265: invokestatic    gg/essential/gui/friends/message/MessageUtils.getMessageWidth$default$5943b3e6$58ff3b4a:(Lgg/essential/gui/friends/message/MessageUtils;Z)Lgg/essential/elementa/constraints/WidthConstraint;
        //   268: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   271: aload           $this$imageSizeContainer_delegate_u24lambda_u2d1
        //   273: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   276: dup            
        //   277: ldc             0.5625
        //   279: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //   282: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   285: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   288: aload           7
        //   290: aload           4
        //   292: aload_2         /* wrapper */
        //   293: checkcast       Lgg/essential/elementa/UIComponent;
        //   296: invokestatic    gg/essential/util/ExtensionsKt.hiddenChildOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   299: aload_0         /* this */
        //   300: getstatic       gg/essential/gui/friends/message/v2/ImageEmbedImpl.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   303: iconst_2       
        //   304: aaload         
        //   305: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   308: putfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl.imageSizeContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   311: aload_0         /* this */
        //   312: checkcast       Lgg/essential/elementa/UIComponent;
        //   315: astore_3        /* $this$constrain$iv */
        //   316: aload_3         /* $this$constrain$iv */
        //   317: astore          4
        //   319: aload           4
        //   321: astore          $this$constrain_u24lambda_u2d0$iv
        //   323: aload           $this$constrain_u24lambda_u2d0$iv
        //   325: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   328: astore          $this$_init__u24lambda_u2d2
        //   330: aload           $this$_init__u24lambda_u2d2
        //   332: bipush          10
        //   334: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   337: checkcast       Ljava/lang/Number;
        //   340: aload_2         /* wrapper */
        //   341: invokevirtual   gg/essential/gui/friends/message/v2/MessageWrapper.getSentByClient:()Z
        //   344: iconst_0       
        //   345: iconst_2       
        //   346: aconst_null    
        //   347: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   350: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   353: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   356: aload           $this$_init__u24lambda_u2d2
        //   358: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   361: dup            
        //   362: ldc_w           4.0
        //   365: iconst_0       
        //   366: iconst_2       
        //   367: aconst_null    
        //   368: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   371: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   374: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   377: aload           $this$_init__u24lambda_u2d2
        //   379: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   382: dup            
        //   383: fconst_0       
        //   384: iconst_1       
        //   385: aconst_null    
        //   386: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   389: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   392: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   395: aload           $this$_init__u24lambda_u2d2
        //   397: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   400: dup            
        //   401: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   404: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   407: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   410: aload_0         /* this */
        //   411: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl.trustedHostState:Lgg/essential/gui/common/WeakState;
        //   414: dup            
        //   415: ldc_w           "trustedHostState"
        //   418: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   421: checkcast       Lgg/essential/elementa/state/State;
        //   424: new             Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$2;
        //   427: dup            
        //   428: aload_1         /* url */
        //   429: aload_0         /* this */
        //   430: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$2.<init>:(Ljava/net/URL;Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)V
        //   433: checkcast       Lkotlin/jvm/functions/Function1;
        //   436: invokestatic    gg/essential/gui/common/StateExtensionsKt.onSetValueAndNow:(Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   439: pop            
        //   440: return         
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  url      
        //  wrapper  
        //    StackMapTable: 00 02 FF 01 08 00 08 07 00 02 07 00 B2 07 01 07 07 00 9D 07 00 9D 07 00 9D 07 00 DA 07 00 02 00 02 07 00 DA 07 01 01 FF 00 00 00 08 07 00 02 07 00 B2 07 01 07 07 00 9D 07 00 9D 07 00 9D 07 00 DA 07 00 02 00 03 07 00 DA 07 01 01 01
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final FocusedView getFocusedView() {
        return (FocusedView)this.focusedView$delegate.getValue((Object)this, (KProperty)ImageEmbedImpl.$$delegatedProperties[0]);
    }
    
    private final IconButton getAddTrustedHostButton() {
        return (IconButton)this.addTrustedHostButton$delegate.getValue((Object)this, (KProperty)ImageEmbedImpl.$$delegatedProperties[1]);
    }
    
    private final UIContainer getImageSizeContainer() {
        return (UIContainer)this.imageSizeContainer$delegate.getValue((Object)this, (KProperty)ImageEmbedImpl.$$delegatedProperties[2]);
    }
    
    private final void prepareAndLoad() {
        final int nextLoadingId = ImageEmbedImpl.nextLoadingId;
        ImageEmbedImpl.nextLoadingId = nextLoadingId + 1;
        final int nextId = nextLoadingId;
        this.loading = nextId;
        Multithreading.runAsync(ImageEmbedImpl::prepareAndLoad$lambda-3);
    }
    
    private final void addFailureMessage() {
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new EssentialUIText("Failed to load image", false, null, false, false, false, 62);
        final UIConstraints $this$addFailureMessage_u24lambda_u2d4 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$addFailureMessage_u24lambda_u2d4.setY(new CenterConstraint());
        ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this), null, ImageEmbedImpl.$$delegatedProperties[3]);
        final UIComponent $this$constrain_u24lambda_u2d0$iv2;
        final UIComponent $this$constrain$iv2 = $this$constrain_u24lambda_u2d0$iv2 = new IconButton(EssentialPalette.RETRY_7X, "", "Retry", false, false, false, 56);
        final UIConstraints $this$addFailureMessage_u24lambda_u2d5 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$addFailureMessage_u24lambda_u2d5.setX(new SiblingConstraint(4.0f, false, 2, null));
        $this$addFailureMessage_u24lambda_u2d5.setY(new CenterConstraint());
        $this$addFailureMessage_u24lambda_u2d5.setWidth(UtilitiesKt.getPixels(17));
        $this$addFailureMessage_u24lambda_u2d5.setHeight(new AspectConstraint(0.0f, 1, null));
        ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf((T)((IconButton)$this$constrain_u24lambda_u2d0$iv2).onActiveClick((Function0<Unit>)new ImageEmbedImpl$addFailureMessage$retryButton.ImageEmbedImpl$addFailureMessage$retryButton$3(this)), this), null, ImageEmbedImpl.$$delegatedProperties[4]);
    }
    
    @Override
    public void copyImageToClipboard() {
        final BufferedImage loadedImage = this.loadedImage;
        if (loadedImage != null) {
            Multithreading.runAsync(ImageEmbedImpl::copyImageToClipboard$lambda-9);
        }
    }
    
    @Override
    public void beginHighlight() {
        this.animateColor(Animations.OUT_EXP, EssentialPalette.MESSAGE_HIGHLIGHT);
    }
    
    private final void animateColor(final AnimationStrategy strategy, final Color color) {
        final UIComponent $this$animate_u24lambda_u2d0$iv;
        final UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this;
        final AnimatingConstraints $this$animateColor_u24lambda_u2d10;
        final AnimatingConstraints anim$iv = $this$animateColor_u24lambda_u2d10 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        AnimatingConstraints.setColorAnimation$default($this$animateColor_u24lambda_u2d10, strategy, 0.25f, UtilitiesKt.toConstraint(color), 0.0f, 8, null);
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    @Override
    public void releaseHighlight() {
        final AnimationStrategy strategy = Animations.IN_EXP;
        final Color white = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
        this.animateColor(strategy, white);
    }
    
    private final BufferedImage download() {
        final byte[] original = WebUtil.downloadToBytes(this.getUrl().toString(), "Essential Embeds");
        try {
            final BufferedImage read = ImageIO.read(new ByteArrayInputStream(original));
            if (read != null) {
                final BufferedImage it = read;
                return it;
            }
        }
        catch (final Exception e) {
            Essential.logger.debug("Error parsing image", (Throwable)e);
        }
        Intrinsics.checkNotNullExpressionValue((Object)original, "original");
        final String responseString = new String(original, Charsets.UTF_8);
        final MatchResult find$default = Regex.find$default(MessageUtils.INSTANCE.getImageEmbedRegex(), (CharSequence)responseString, 0, 2, (Object)null);
        if (find$default == null) {
            return null;
        }
        final MatchResult embedUrlMatcher = find$default;
        final MatchGroup value = RegexExtensionsJDK8Kt.get(embedUrlMatcher.getGroups(), "url");
        if (value != null) {
            final String value2 = value.getValue();
            if (value2 != null) {
                final String embedUrl = value2;
                if (!MessageUtils.INSTANCE.getURL_REGEX().matches((CharSequence)embedUrl)) {
                    return null;
                }
                final byte[] embedUrlBytes = WebUtil.downloadToBytes(embedUrl, "Essential Embeds");
                BufferedImage read2;
                try {
                    read2 = ImageIO.read(new ByteArrayInputStream(embedUrlBytes));
                }
                catch (final Exception e2) {
                    Essential.logger.debug("Error parsing image", (Throwable)e2);
                    read2 = null;
                }
                return read2;
            }
        }
        return null;
    }
    
    private final void loadImage(final int id) {
        BufferedImage download;
        try {
            download = this.download();
        }
        catch (final IOException e) {
            Essential.logger.debug("Error downloading image", (Throwable)e);
            download = null;
        }
        final BufferedImage loadedImage = download;
        Window.Companion.enqueueRenderOperation((Function0<Unit>)new ImageEmbedImpl$loadImage.ImageEmbedImpl$loadImage$1(id, this, loadedImage));
    }
    
    private final Window getWindow() {
        return Window.Companion.of(this);
    }
    
    private static final void prepareAndLoad$lambda-3(final ImageEmbedImpl this$0, final int $nextId) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this$0.loadImage($nextId);
    }
    
    private static final void copyImageToClipboard$lambda-9$lambda-8(final File $tempFile) {
        Essential.getInstance().getConnectionManager().getScreenshotManager().copyScreenshotToClipboard($tempFile, "Successfully copied image to clipboard.");
        FileUtils.deleteQuietly($tempFile);
    }
    
    private static final void copyImageToClipboard$lambda-9(final BufferedImage $loadedImage) {
        final File tempFile = Files.createTempFile("essential-screenshot", "png", (FileAttribute<?>[])new FileAttribute[0]).toFile();
        ImageIO.write($loadedImage, "png", tempFile);
        final MinecraftClient instance = MinecraftClient.getInstance();
        Intrinsics.checkNotNullExpressionValue((Object)instance, "getInstance()");
        ExtensionsKt.getExecutor(instance).execute(ImageEmbedImpl::copyImageToClipboard$lambda-9$lambda-8);
    }
    
    public static final /* synthetic */ void access$prepareAndLoad(final ImageEmbedImpl $this) {
        $this.prepareAndLoad();
    }
    
    public static final /* synthetic */ Integer access$getLoading$p(final ImageEmbedImpl $this) {
        return $this.loading;
    }
    
    public static final /* synthetic */ void access$setLoadedImage$p(final ImageEmbedImpl $this, final BufferedImage <set-?>) {
        $this.loadedImage = <set-?>;
    }
    
    public static final /* synthetic */ void access$addFailureMessage(final ImageEmbedImpl $this) {
        $this.addFailureMessage();
    }
    
    public static final /* synthetic */ BasicState access$getAspectRatio$p(final ImageEmbedImpl $this) {
        return $this.aspectRatio;
    }
    
    public static final /* synthetic */ FocusedView access$getFocusedView(final ImageEmbedImpl $this) {
        return $this.getFocusedView();
    }
    
    public static final /* synthetic */ UIContainer access$getImageSizeContainer(final ImageEmbedImpl $this) {
        return $this.getImageSizeContainer();
    }
    
    public static final /* synthetic */ boolean access$getPreviewing$p(final ImageEmbedImpl $this) {
        return $this.previewing;
    }
    
    public static final /* synthetic */ void access$setPreviewing$p(final ImageEmbedImpl $this, final boolean <set-?>) {
        $this.previewing = <set-?>;
    }
    
    public static final /* synthetic */ Window access$getWindow(final ImageEmbedImpl $this) {
        return $this.getWindow();
    }
    
    public static final /* synthetic */ WeakState access$getUserTrustedHostsState$p(final ImageEmbedImpl $this) {
        return $this.userTrustedHostsState;
    }
    
    public static final /* synthetic */ IconButton access$getAddTrustedHostButton(final ImageEmbedImpl $this) {
        return $this.getAddTrustedHostButton();
    }
    
    public static final /* synthetic */ void access$setLoading$p(final ImageEmbedImpl $this, final Integer <set-?>) {
        $this.loading = <set-?>;
    }
    
    public static final /* synthetic */ BufferedImage access$getLoadedImage$p(final ImageEmbedImpl $this) {
        return $this.loadedImage;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ImageEmbedImpl.class, "focusedView", "getFocusedView()Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ImageEmbedImpl.class, "addTrustedHostButton", "getAddTrustedHostButton()Lgg/essential/gui/common/IconButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ImageEmbedImpl.class, "imageSizeContainer", "getImageSizeContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ImageEmbedImpl.class, "failureMessage", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ImageEmbedImpl.class, "retryButton", "<v#1>", 0)) };
        new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00008
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b	
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0010\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005�\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH\u0002J\b\u0010\u001b\u001a\u00020\bH\u0002J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004�\u0006\u0002
                                                       \u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004�\u0006\u0002
                                                       \u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002�\u0006\f
                                                       \u0004\b\u000b\u0010\f\u001a\u0004\b	\u0010
                                                       R\u001b\u0010\r\u001a\u00020\u00018BX\u0082\u0084\u0002�\u0006\f
                                                       \u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002�\u0006\f
                                                       \u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014�\u0006\u001e""" }, d2 = { "Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView;", "Lgg/essential/elementa/components/UIContainer;", "(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)V", "block", "Lgg/essential/elementa/components/UIBlock;", "dontEmbed", "Lgg/essential/gui/common/shadow/EssentialUIText;", "floatImage", "Lgg/essential/elementa/components/UIImage;", "getFloatImage", "()Lgg/essential/elementa/components/UIImage;", "floatImage$delegate", "Lkotlin/properties/ReadWriteProperty;", "floatImageContainer", "getFloatImageContainer", "()Lgg/essential/elementa/components/UIContainer;", "floatImageContainer$delegate", "openOriginal", "Lgg/essential/elementa/UIComponent;", "getOpenOriginal", "()Lgg/essential/elementa/UIComponent;", "openOriginal$delegate", "enterPreview", "", "exitPreview", "callback", "Lkotlin/Function0;", "generateEmptyImage", "setup", "image", "essential" })
    public final class FocusedView extends UIContainer
    {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
        @NotNull
        private final UIBlock block;
        @NotNull
        private final ReadWriteProperty floatImageContainer$delegate;
        @NotNull
        private final ReadWriteProperty floatImage$delegate;
        @NotNull
        private final ReadWriteProperty openOriginal$delegate;
        @NotNull
        private final EssentialUIText dontEmbed;
        final /* synthetic */ ImageEmbedImpl this$0;
        
        public FocusedView(final ImageEmbedImpl this$0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: aload_1         /* this$0 */
            //     2: putfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
            //     5: aload_0         /* this */
            //     6: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
            //     9: aload_0         /* this */
            //    10: new             Lgg/essential/elementa/components/UIBlock;
            //    13: dup            
            //    14: new             Ljava/awt/Color;
            //    17: dup            
            //    18: iconst_0       
            //    19: iconst_0       
            //    20: iconst_0       
            //    21: iconst_0       
            //    22: invokespecial   java/awt/Color.<init>:(IIII)V
            //    25: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
            //    28: checkcast       Lgg/essential/elementa/UIComponent;
            //    31: astore_2        /* $this$constrain$iv */
            //    32: aload_2         /* $this$constrain$iv */
            //    33: astore          4
            //    35: aload           4
            //    37: astore          $this$constrain_u24lambda_u2d0$iv
            //    39: aload           $this$constrain_u24lambda_u2d0$iv
            //    41: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //    44: astore          7
            //    46: astore          9
            //    48: aload           $this$block_u24lambda_u2d0
            //    50: bipush          100
            //    52: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    55: checkcast       Ljava/lang/Number;
            //    58: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //    61: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //    64: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //    67: aload           $this$block_u24lambda_u2d0
            //    69: bipush          100
            //    71: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    74: checkcast       Ljava/lang/Number;
            //    77: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //    80: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //    83: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //    86: aload           9
            //    88: aload           4
            //    90: aload_0         /* this */
            //    91: checkcast       Lgg/essential/elementa/UIComponent;
            //    94: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //    97: checkcast       Lgg/essential/elementa/components/UIBlock;
            //   100: putfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.block:Lgg/essential/elementa/components/UIBlock;
            //   103: aload_0         /* this */
            //   104: new             Lgg/essential/elementa/components/UIContainer;
            //   107: dup            
            //   108: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
            //   111: checkcast       Lgg/essential/elementa/UIComponent;
            //   114: astore_2        /* $this$constrain$iv */
            //   115: aload_2         /* $this$constrain$iv */
            //   116: astore          4
            //   118: aload           4
            //   120: astore          $this$constrain_u24lambda_u2d0$iv
            //   122: aload           $this$constrain_u24lambda_u2d0$iv
            //   124: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   127: astore          7
            //   129: astore          9
            //   131: aload           $this$floatImageContainer_delegate_u24lambda_u2d1
            //   133: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //   136: dup            
            //   137: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //   140: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //   143: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //   146: aload           $this$floatImageContainer_delegate_u24lambda_u2d1
            //   148: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //   151: dup            
            //   152: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //   155: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //   158: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //   161: aload           $this$floatImageContainer_delegate_u24lambda_u2d1
            //   163: iconst_1       
            //   164: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   167: checkcast       Ljava/lang/Number;
            //   170: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   173: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   176: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   179: aload           $this$floatImageContainer_delegate_u24lambda_u2d1
            //   181: iconst_1       
            //   182: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   185: checkcast       Ljava/lang/Number;
            //   188: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   191: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   194: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   197: aload           9
            //   199: aload           4
            //   201: aload_0         /* this */
            //   202: checkcast       Lgg/essential/elementa/UIComponent;
            //   205: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   208: aload_0         /* this */
            //   209: getstatic       gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   212: iconst_0       
            //   213: aaload         
            //   214: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   217: putfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.floatImageContainer$delegate:Lkotlin/properties/ReadWriteProperty;
            //   220: aload_0         /* this */
            //   221: aload_0         /* this */
            //   222: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.generateEmptyImage:()Lgg/essential/elementa/components/UIImage;
            //   225: checkcast       Lgg/essential/elementa/UIComponent;
            //   228: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   231: astore_2       
            //   232: aload_0         /* this */
            //   233: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
            //   236: astore_3       
            //   237: aload_2         /* $this$constrain$iv */
            //   238: astore          5
            //   240: aload           5
            //   242: astore          $this$constrain_u24lambda_u2d0$iv
            //   244: aload           $this$constrain_u24lambda_u2d0$iv
            //   246: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   249: astore          8
            //   251: astore          9
            //   253: aload           $this$floatImage_delegate_u24lambda_u2d2
            //   255: new             Lgg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint;
            //   258: dup            
            //   259: aload_3        
            //   260: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl.access$getAspectRatio$p:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)Lgg/essential/elementa/state/BasicState;
            //   263: checkcast       Lgg/essential/elementa/state/State;
            //   266: invokespecial   gg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint.<init>:(Lgg/essential/elementa/state/State;)V
            //   269: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   272: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   275: aload           $this$floatImage_delegate_u24lambda_u2d2
            //   277: new             Lgg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint;
            //   280: dup            
            //   281: aload_3        
            //   282: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl.access$getAspectRatio$p:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)Lgg/essential/elementa/state/BasicState;
            //   285: checkcast       Lgg/essential/elementa/state/State;
            //   288: invokespecial   gg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint.<init>:(Lgg/essential/elementa/state/State;)V
            //   291: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   294: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   297: aload           9
            //   299: aload           5
            //   301: astore_2        /* $this$constrain$iv */
            //   302: aload_2        
            //   303: checkcast       Lgg/essential/elementa/components/UIImage;
            //   306: astore_3       
            //   307: astore          9
            //   309: aload_3         /* $this$floatImage_delegate_u24lambda_u2d3 */
            //   310: getstatic       gg/essential/elementa/components/UIImage$TextureScalingMode.LINEAR:Lgg/essential/elementa/components/UIImage$TextureScalingMode;
            //   313: invokevirtual   gg/essential/elementa/components/UIImage.setTextureMagFilter:(Lgg/essential/elementa/components/UIImage$TextureScalingMode;)V
            //   316: aload_3         /* $this$floatImage_delegate_u24lambda_u2d3 */
            //   317: getstatic       gg/essential/elementa/components/UIImage$TextureScalingMode.LINEAR:Lgg/essential/elementa/components/UIImage$TextureScalingMode;
            //   320: invokevirtual   gg/essential/elementa/components/UIImage.setTextureMinFilter:(Lgg/essential/elementa/components/UIImage$TextureScalingMode;)V
            //   323: aload_3         /* $this$floatImage_delegate_u24lambda_u2d3 */
            //   324: new             Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$floatImage$3$1;
            //   327: dup            
            //   328: aload_0         /* this */
            //   329: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$floatImage$3$1.<init>:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView;)V
            //   332: checkcast       Lkotlin/jvm/functions/Function3;
            //   335: invokevirtual   gg/essential/elementa/components/UIImage.onKeyType:(Lkotlin/jvm/functions/Function3;)Lgg/essential/elementa/UIComponent;
            //   338: pop            
            //   339: aload_3         /* $this$floatImage_delegate_u24lambda_u2d3 */
            //   340: getstatic       gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$floatImage$3$2.INSTANCE:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$floatImage$3$2;
            //   343: checkcast       Lkotlin/jvm/functions/Function2;
            //   346: invokevirtual   gg/essential/elementa/components/UIImage.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
            //   349: pop            
            //   350: aload           9
            //   352: aload_2        
            //   353: aload_0         /* this */
            //   354: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.getFloatImageContainer:()Lgg/essential/elementa/components/UIContainer;
            //   357: checkcast       Lgg/essential/elementa/UIComponent;
            //   360: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   363: aload_0         /* this */
            //   364: getstatic       gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   367: iconst_1       
            //   368: aaload         
            //   369: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   372: putfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.floatImage$delegate:Lkotlin/properties/ReadWriteProperty;
            //   375: aload_0         /* this */
            //   376: new             Lgg/essential/gui/common/shadow/EssentialUIText;
            //   379: dup            
            //   380: aconst_null    
            //   381: iconst_0       
            //   382: aconst_null    
            //   383: iconst_0       
            //   384: iconst_0       
            //   385: iconst_0       
            //   386: bipush          63
            //   388: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
            //   391: checkcast       Lgg/essential/elementa/UIComponent;
            //   394: astore_2        /* $this$constrain$iv */
            //   395: aload_2         /* $this$constrain$iv */
            //   396: astore          4
            //   398: aload           4
            //   400: astore          $this$constrain_u24lambda_u2d0$iv
            //   402: aload           $this$constrain_u24lambda_u2d0$iv
            //   404: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   407: astore          7
            //   409: astore          9
            //   411: aload           $this$openOriginal_delegate_u24lambda_u2d4
            //   413: new             Lgg/essential/elementa/constraints/SiblingConstraint;
            //   416: dup            
            //   417: ldc             3.0
            //   419: iconst_0       
            //   420: iconst_2       
            //   421: aconst_null    
            //   422: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   425: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   428: aload_0         /* this */
            //   429: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.getFloatImage:()Lgg/essential/elementa/components/UIImage;
            //   432: checkcast       Lgg/essential/elementa/UIComponent;
            //   435: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
            //   438: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //   441: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //   444: aload           $this$openOriginal_delegate_u24lambda_u2d4
            //   446: iconst_0       
            //   447: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   450: checkcast       Ljava/lang/Number;
            //   453: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   456: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   459: aload_0         /* this */
            //   460: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.getFloatImage:()Lgg/essential/elementa/components/UIImage;
            //   463: checkcast       Lgg/essential/elementa/UIComponent;
            //   466: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
            //   469: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //   472: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //   475: aload           $this$openOriginal_delegate_u24lambda_u2d4
            //   477: new             Ljava/awt/Color;
            //   480: dup            
            //   481: iconst_0       
            //   482: iconst_0       
            //   483: iconst_0       
            //   484: iconst_0       
            //   485: invokespecial   java/awt/Color.<init>:(IIII)V
            //   488: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //   491: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //   494: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
            //   497: aload           9
            //   499: aload           4
            //   501: astore_2        /* $this$constrain$iv */
            //   502: aload_2        
            //   503: checkcast       Lgg/essential/gui/common/shadow/EssentialUIText;
            //   506: astore_3       
            //   507: astore          9
            //   509: aload_3         /* $this$openOriginal_delegate_u24lambda_u2d5 */
            //   510: aload_3         /* $this$openOriginal_delegate_u24lambda_u2d5 */
            //   511: checkcast       Lgg/essential/elementa/UIComponent;
            //   514: iconst_0       
            //   515: iconst_0       
            //   516: iconst_3       
            //   517: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
            //   520: getstatic       gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$openOriginal$3$1.INSTANCE:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$openOriginal$3$1;
            //   523: checkcast       Lkotlin/jvm/functions/Function1;
            //   526: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
            //   529: checkcast       Lgg/essential/elementa/state/State;
            //   532: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
            //   535: pop            
            //   536: aload           9
            //   538: aload_2        
            //   539: astore_2       
            //   540: aload_0         /* this */
            //   541: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
            //   544: astore_3       
            //   545: aload_2         /* $this$onLeftClick$iv */
            //   546: new             Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$special$$inlined$onLeftClick$1;
            //   549: dup            
            //   550: aload_3        
            //   551: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)V
            //   554: checkcast       Lkotlin/jvm/functions/Function2;
            //   557: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
            //   560: aload_0         /* this */
            //   561: checkcast       Lgg/essential/elementa/UIComponent;
            //   564: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   567: aload_0         /* this */
            //   568: getstatic       gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   571: iconst_2       
            //   572: aaload         
            //   573: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   576: putfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.openOriginal$delegate:Lkotlin/properties/ReadWriteProperty;
            //   579: aload_0         /* this */
            //   580: new             Lgg/essential/gui/common/shadow/EssentialUIText;
            //   583: dup            
            //   584: aconst_null    
            //   585: iconst_0       
            //   586: aconst_null    
            //   587: iconst_0       
            //   588: iconst_0       
            //   589: iconst_0       
            //   590: bipush          63
            //   592: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
            //   595: checkcast       Lgg/essential/elementa/UIComponent;
            //   598: astore_2        /* $this$constrain$iv */
            //   599: aload_2         /* $this$constrain$iv */
            //   600: astore          4
            //   602: aload           4
            //   604: astore          $this$constrain_u24lambda_u2d0$iv
            //   606: aload           $this$constrain_u24lambda_u2d0$iv
            //   608: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   611: astore          7
            //   613: astore          9
            //   615: aload           $this$dontEmbed_u24lambda_u2d7
            //   617: new             Ljava/awt/Color;
            //   620: dup            
            //   621: iconst_0       
            //   622: iconst_0       
            //   623: iconst_0       
            //   624: iconst_0       
            //   625: invokespecial   java/awt/Color.<init>:(IIII)V
            //   628: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //   631: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //   634: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
            //   637: aload           $this$dontEmbed_u24lambda_u2d7
            //   639: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
            //   642: dup            
            //   643: iconst_0       
            //   644: iconst_1       
            //   645: aconst_null    
            //   646: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   649: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   652: aload_0         /* this */
            //   653: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.getOpenOriginal:()Lgg/essential/elementa/UIComponent;
            //   656: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
            //   659: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //   662: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //   665: aload           $this$dontEmbed_u24lambda_u2d7
            //   667: iconst_0       
            //   668: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   671: checkcast       Ljava/lang/Number;
            //   674: iconst_1       
            //   675: iconst_0       
            //   676: iconst_2       
            //   677: aconst_null    
            //   678: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   681: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   684: aload_0         /* this */
            //   685: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.getFloatImage:()Lgg/essential/elementa/components/UIImage;
            //   688: checkcast       Lgg/essential/elementa/UIComponent;
            //   691: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
            //   694: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //   697: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //   700: aload           9
            //   702: aload           4
            //   704: astore_2        /* $this$constrain$iv */
            //   705: aload_0         /* this */
            //   706: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
            //   709: astore_3       
            //   710: aload_2        
            //   711: checkcast       Lgg/essential/gui/common/shadow/EssentialUIText;
            //   714: astore          4
            //   716: astore          9
            //   718: aload           $this$dontEmbed_u24lambda_u2d9
            //   720: checkcast       Lgg/essential/elementa/UIComponent;
            //   723: aload_0         /* this */
            //   724: checkcast       Lgg/essential/elementa/UIComponent;
            //   727: aload_3        
            //   728: invokestatic    gg/essential/gui/friends/message/v2/ImageEmbedImpl.access$getUserTrustedHostsState$p:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)Lgg/essential/gui/common/WeakState;
            //   731: new             Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$dontEmbed$2$1;
            //   734: dup            
            //   735: aload_3        
            //   736: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$dontEmbed$2$1.<init>:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)V
            //   739: checkcast       Lkotlin/jvm/functions/Function1;
            //   742: invokevirtual   gg/essential/gui/common/WeakState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
            //   745: checkcast       Lgg/essential/elementa/state/State;
            //   748: iconst_0       
            //   749: aconst_null    
            //   750: bipush          12
            //   752: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
            //   755: pop            
            //   756: aload           $this$dontEmbed_u24lambda_u2d9
            //   758: aload           $this$dontEmbed_u24lambda_u2d9
            //   760: checkcast       Lgg/essential/elementa/UIComponent;
            //   763: iconst_0       
            //   764: iconst_0       
            //   765: iconst_3       
            //   766: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
            //   769: getstatic       gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$dontEmbed$2$2.INSTANCE:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$dontEmbed$2$2;
            //   772: checkcast       Lkotlin/jvm/functions/Function1;
            //   775: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
            //   778: checkcast       Lgg/essential/elementa/state/State;
            //   781: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
            //   784: pop            
            //   785: aload           $this$dontEmbed_u24lambda_u2d9
            //   787: checkcast       Lgg/essential/elementa/UIComponent;
            //   790: astore          $this$onLeftClick$iv
            //   792: aload           $this$onLeftClick$iv
            //   794: new             Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$dontEmbed$lambda-9$$inlined$onLeftClick$1;
            //   797: dup            
            //   798: aload_0         /* this */
            //   799: aload_3        
            //   800: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$dontEmbed$lambda-9$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView;Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)V
            //   803: checkcast       Lkotlin/jvm/functions/Function2;
            //   806: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
            //   809: pop            
            //   810: aload           9
            //   812: aload_2        
            //   813: checkcast       Lgg/essential/gui/common/shadow/EssentialUIText;
            //   816: putfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.dontEmbed:Lgg/essential/gui/common/shadow/EssentialUIText;
            //   819: aload_0         /* this */
            //   820: checkcast       Lgg/essential/elementa/UIComponent;
            //   823: astore_2        /* $this$constrain$iv */
            //   824: aload_2         /* $this$constrain$iv */
            //   825: astore          4
            //   827: aload           4
            //   829: astore          $this$constrain_u24lambda_u2d0$iv
            //   831: aload           $this$constrain_u24lambda_u2d0$iv
            //   833: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   836: astore          $this$_init__u24lambda_u2d10
            //   838: aload           $this$_init__u24lambda_u2d10
            //   840: bipush          100
            //   842: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   845: checkcast       Ljava/lang/Number;
            //   848: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //   851: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   854: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   857: aload           $this$_init__u24lambda_u2d10
            //   859: bipush          100
            //   861: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   864: checkcast       Ljava/lang/Number;
            //   867: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //   870: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   873: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   876: aload_0         /* this */
            //   877: checkcast       Lgg/essential/elementa/UIComponent;
            //   880: astore_2        /* $this$onLeftClick$iv */
            //   881: aload_2         /* $this$onLeftClick$iv */
            //   882: new             Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$special$$inlined$onLeftClick$2;
            //   885: dup            
            //   886: aload_0         /* this */
            //   887: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$special$$inlined$onLeftClick$2.<init>:(Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView;)V
            //   890: checkcast       Lkotlin/jvm/functions/Function2;
            //   893: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
            //   896: pop            
            //   897: return         
            //    Signature:
            //  (Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;)V [from metadata: ()V]
            //  
            //    MethodParameters:
            //  Name    Flags  
            //  ------  -----
            //  this$0  
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        private final UIContainer getFloatImageContainer() {
            return (UIContainer)this.floatImageContainer$delegate.getValue((Object)this, (KProperty)FocusedView.$$delegatedProperties[0]);
        }
        
        private final UIImage getFloatImage() {
            return (UIImage)this.floatImage$delegate.getValue((Object)this, (KProperty)FocusedView.$$delegatedProperties[1]);
        }
        
        private final UIComponent getOpenOriginal() {
            return (UIComponent)this.openOriginal$delegate.getValue((Object)this, (KProperty)FocusedView.$$delegatedProperties[2]);
        }
        
        public final void setup(@NotNull final UIImage image) {
            Intrinsics.checkNotNullParameter((Object)image, "image");
            image.supply(this.getFloatImage());
        }
        
        public final void enterPreview() {
            if (ImageEmbedImpl.access$getPreviewing$p(this.this$0)) {
                return;
            }
            ImageEmbedImpl.access$setPreviewing$p(this.this$0, true);
            ImageEmbedImpl.this.getWindow().addChild(this);
            this.getFloatImage().grabWindowFocus();
            UIComponent $this$animate_u24lambda_u2d0$iv;
            UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this.block;
            final AnimatingConstraints $this$enterPreview_u24lambda_u2d12;
            AnimatingConstraints anim$iv = $this$enterPreview_u24lambda_u2d12 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
            AnimatingConstraints.setColorAnimation$default($this$enterPreview_u24lambda_u2d12, Animations.OUT_EXP, 0.25f, UtilitiesKt.toConstraint(new Color(0, 0, 0, 200)), 0.0f, 8, null);
            $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
            $this$animate$iv = ($this$animate_u24lambda_u2d0$iv = this.getOpenOriginal());
            final AnimatingConstraints $this$enterPreview_u24lambda_u2d13;
            anim$iv = ($this$enterPreview_u24lambda_u2d13 = $this$animate_u24lambda_u2d0$iv.makeAnimation());
            AnimatingConstraints.setColorAnimation$default($this$enterPreview_u24lambda_u2d13, Animations.OUT_EXP, 0.25f, UtilitiesKt.toConstraint(EssentialPalette.TEXT_HIGHLIGHT), 0.0f, 8, null);
            $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
            if (this.dontEmbed.getHasParent()) {
                $this$animate$iv = ($this$animate_u24lambda_u2d0$iv = this.dontEmbed);
                anim$iv = $this$animate_u24lambda_u2d0$iv.makeAnimation();
                final AnimatingConstraints animatingConstraints;
                final AnimatingConstraints $this$enterPreview_u24lambda_u2d14 = animatingConstraints = anim$iv;
                final AnimationStrategy animationStrategy = Animations.OUT_EXP;
                final float n = 0.25f;
                final Color red = Color.RED;
                Intrinsics.checkNotNullExpressionValue((Object)red, "RED");
                AnimatingConstraints.setColorAnimation$default(animatingConstraints, animationStrategy, n, UtilitiesKt.toConstraint(red), 0.0f, 8, null);
                $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
            }
            $this$animate$iv = ($this$animate_u24lambda_u2d0$iv = this.getFloatImageContainer());
            final AnimatingConstraints $this$enterPreview_u24lambda_u2d15;
            anim$iv = ($this$enterPreview_u24lambda_u2d15 = $this$animate_u24lambda_u2d0$iv.makeAnimation());
            AnimatingConstraints.setWidthAnimation$default($this$enterPreview_u24lambda_u2d15, Animations.OUT_EXP, 0.25f, UtilitiesKt.getPercentOfWindow(75), 0.0f, 8, null);
            AnimatingConstraints.setHeightAnimation$default($this$enterPreview_u24lambda_u2d15, Animations.OUT_EXP, 0.25f, UtilitiesKt.getPercentOfWindow(75), 0.0f, 8, null);
            $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
        }
        
        private final void exitPreview(final Function0<Unit> callback) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokevirtual   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.releaseWindowFocus:()V
            //     4: aload_0         /* this */
            //     5: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.getFloatImageContainer:()Lgg/essential/elementa/components/UIContainer;
            //     8: checkcast       Lgg/essential/elementa/UIComponent;
            //    11: astore_2        /* $this$animate$iv */
            //    12: aload_2         /* $this$animate$iv */
            //    13: astore          4
            //    15: aload           4
            //    17: astore          $this$animate_u24lambda_u2d0$iv
            //    19: aload           $this$animate_u24lambda_u2d0$iv
            //    21: invokevirtual   gg/essential/elementa/UIComponent.makeAnimation:()Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
            //    24: astore          anim$iv
            //    26: aload           anim$iv
            //    28: astore          $this$exitPreview_u24lambda_u2d16
            //    30: aload           $this$exitPreview_u24lambda_u2d16
            //    32: getstatic       gg/essential/elementa/constraints/animation/Animations.OUT_EXP:Lgg/essential/elementa/constraints/animation/Animations;
            //    35: checkcast       Lgg/essential/elementa/constraints/animation/AnimationStrategy;
            //    38: ldc_w           0.25
            //    41: iconst_1       
            //    42: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    45: checkcast       Ljava/lang/Number;
            //    48: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //    51: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //    54: fconst_0       
            //    55: bipush          8
            //    57: aconst_null    
            //    58: invokestatic    gg/essential/elementa/constraints/animation/AnimatingConstraints.setWidthAnimation$default:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;Lgg/essential/elementa/constraints/animation/AnimationStrategy;FLgg/essential/elementa/constraints/WidthConstraint;FILjava/lang/Object;)Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
            //    61: pop            
            //    62: aload           $this$exitPreview_u24lambda_u2d16
            //    64: getstatic       gg/essential/elementa/constraints/animation/Animations.OUT_EXP:Lgg/essential/elementa/constraints/animation/Animations;
            //    67: checkcast       Lgg/essential/elementa/constraints/animation/AnimationStrategy;
            //    70: ldc_w           0.25
            //    73: iconst_1       
            //    74: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    77: checkcast       Ljava/lang/Number;
            //    80: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //    83: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //    86: fconst_0       
            //    87: bipush          8
            //    89: aconst_null    
            //    90: invokestatic    gg/essential/elementa/constraints/animation/AnimatingConstraints.setHeightAnimation$default:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;Lgg/essential/elementa/constraints/animation/AnimationStrategy;FLgg/essential/elementa/constraints/HeightConstraint;FILjava/lang/Object;)Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
            //    93: pop            
            //    94: aload           $this$animate_u24lambda_u2d0$iv
            //    96: aload           anim$iv
            //    98: invokevirtual   gg/essential/elementa/UIComponent.animateTo:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;)V
            //   101: aload_0         /* this */
            //   102: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.getOpenOriginal:()Lgg/essential/elementa/UIComponent;
            //   105: astore_2        /* $this$animate$iv */
            //   106: aload_2         /* $this$animate$iv */
            //   107: astore          4
            //   109: aload           4
            //   111: astore          $this$animate_u24lambda_u2d0$iv
            //   113: aload           $this$animate_u24lambda_u2d0$iv
            //   115: invokevirtual   gg/essential/elementa/UIComponent.makeAnimation:()Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
            //   118: astore          anim$iv
            //   120: aload           anim$iv
            //   122: astore          $this$exitPreview_u24lambda_u2d17
            //   124: aload           $this$exitPreview_u24lambda_u2d17
            //   126: getstatic       gg/essential/elementa/constraints/animation/Animations.OUT_EXP:Lgg/essential/elementa/constraints/animation/Animations;
            //   129: checkcast       Lgg/essential/elementa/constraints/animation/AnimationStrategy;
            //   132: ldc_w           0.25
            //   135: new             Ljava/awt/Color;
            //   138: dup            
            //   139: iconst_0       
            //   140: iconst_0       
            //   141: iconst_0       
            //   142: iconst_0       
            //   143: invokespecial   java/awt/Color.<init>:(IIII)V
            //   146: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //   149: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //   152: fconst_0       
            //   153: bipush          8
            //   155: aconst_null    
            //   156: invokestatic    gg/essential/elementa/constraints/animation/AnimatingConstraints.setColorAnimation$default:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;Lgg/essential/elementa/constraints/animation/AnimationStrategy;FLgg/essential/elementa/constraints/ColorConstraint;FILjava/lang/Object;)Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
            //   159: pop            
            //   160: aload           $this$animate_u24lambda_u2d0$iv
            //   162: aload           anim$iv
            //   164: invokevirtual   gg/essential/elementa/UIComponent.animateTo:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;)V
            //   167: aload_0         /* this */
            //   168: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.dontEmbed:Lgg/essential/gui/common/shadow/EssentialUIText;
            //   171: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.getHasParent:()Z
            //   174: ifeq            246
            //   177: aload_0         /* this */
            //   178: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.dontEmbed:Lgg/essential/gui/common/shadow/EssentialUIText;
            //   181: checkcast       Lgg/essential/elementa/UIComponent;
            //   184: astore_2        /* $this$animate$iv */
            //   185: aload_2         /* $this$animate$iv */
            //   186: astore          4
            //   188: aload           4
            //   190: astore          $this$animate_u24lambda_u2d0$iv
            //   192: aload           $this$animate_u24lambda_u2d0$iv
            //   194: invokevirtual   gg/essential/elementa/UIComponent.makeAnimation:()Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
            //   197: astore          anim$iv
            //   199: aload           anim$iv
            //   201: astore          $this$exitPreview_u24lambda_u2d18
            //   203: aload           $this$exitPreview_u24lambda_u2d18
            //   205: getstatic       gg/essential/elementa/constraints/animation/Animations.OUT_EXP:Lgg/essential/elementa/constraints/animation/Animations;
            //   208: checkcast       Lgg/essential/elementa/constraints/animation/AnimationStrategy;
            //   211: ldc_w           0.25
            //   214: new             Ljava/awt/Color;
            //   217: dup            
            //   218: iconst_0       
            //   219: iconst_0       
            //   220: iconst_0       
            //   221: iconst_0       
            //   222: invokespecial   java/awt/Color.<init>:(IIII)V
            //   225: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //   228: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //   231: fconst_0       
            //   232: bipush          8
            //   234: aconst_null    
            //   235: invokestatic    gg/essential/elementa/constraints/animation/AnimatingConstraints.setColorAnimation$default:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;Lgg/essential/elementa/constraints/animation/AnimationStrategy;FLgg/essential/elementa/constraints/ColorConstraint;FILjava/lang/Object;)Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
            //   238: pop            
            //   239: aload           $this$animate_u24lambda_u2d0$iv
            //   241: aload           anim$iv
            //   243: invokevirtual   gg/essential/elementa/UIComponent.animateTo:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;)V
            //   246: aload_0         /* this */
            //   247: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.block:Lgg/essential/elementa/components/UIBlock;
            //   250: checkcast       Lgg/essential/elementa/UIComponent;
            //   253: astore_2       
            //   254: aload_0         /* this */
            //   255: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView.this$0:Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;
            //   258: astore_3       
            //   259: aload_2         /* $this$animate$iv */
            //   260: astore          5
            //   262: aload           5
            //   264: astore          $this$animate_u24lambda_u2d0$iv
            //   266: aload           $this$animate_u24lambda_u2d0$iv
            //   268: invokevirtual   gg/essential/elementa/UIComponent.makeAnimation:()Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
            //   271: astore          anim$iv
            //   273: aload           anim$iv
            //   275: astore          $this$exitPreview_u24lambda_u2d19
            //   277: aload           $this$exitPreview_u24lambda_u2d19
            //   279: getstatic       gg/essential/elementa/constraints/animation/Animations.OUT_EXP:Lgg/essential/elementa/constraints/animation/Animations;
            //   282: checkcast       Lgg/essential/elementa/constraints/animation/AnimationStrategy;
            //   285: ldc_w           0.25
            //   288: new             Ljava/awt/Color;
            //   291: dup            
            //   292: iconst_0       
            //   293: iconst_0       
            //   294: iconst_0       
            //   295: iconst_0       
            //   296: invokespecial   java/awt/Color.<init>:(IIII)V
            //   299: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //   302: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //   305: fconst_0       
            //   306: bipush          8
            //   308: aconst_null    
            //   309: invokestatic    gg/essential/elementa/constraints/animation/AnimatingConstraints.setColorAnimation$default:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;Lgg/essential/elementa/constraints/animation/AnimationStrategy;FLgg/essential/elementa/constraints/ColorConstraint;FILjava/lang/Object;)Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
            //   312: new             Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$exitPreview$5$1;
            //   315: dup            
            //   316: aload_1         /* callback */
            //   317: aload_3        
            //   318: aload_0         /* this */
            //   319: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView$exitPreview$5$1.<init>:(Lkotlin/jvm/functions/Function0;Lgg/essential/gui/friends/message/v2/ImageEmbedImpl;Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$FocusedView;)V
            //   322: checkcast       Lkotlin/jvm/functions/Function0;
            //   325: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.onComplete:(Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
            //   328: pop            
            //   329: aload           $this$animate_u24lambda_u2d0$iv
            //   331: aload           anim$iv
            //   333: invokevirtual   gg/essential/elementa/UIComponent.animateTo:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;)V
            //   336: return         
            //    Signature:
            //  (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V
            //    MethodParameters:
            //  Name      Flags  
            //  --------  -----
            //  callback  
            //    StackMapTable: 00 01 FB 00 F6
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        static /* synthetic */ void exitPreview$default$5dc5e77$23e56f5b(final FocusedView focusedView) {
            focusedView.exitPreview((Function0<Unit>)ImageEmbedImpl$FocusedView$exitPreview.ImageEmbedImpl$FocusedView$exitPreview$1.INSTANCE);
        }
        
        private final UIImage generateEmptyImage() {
            final CompletableFuture<BufferedImage> completedFuture = CompletableFuture.completedFuture(new BufferedImage(1, 1, 2));
            Intrinsics.checkNotNullExpressionValue((Object)completedFuture, "completedFuture(Buffered\u2026eredImage.TYPE_INT_ARGB))");
            return new UIImage(completedFuture, null, null, 6, null);
        }
        
        public static final /* synthetic */ void access$exitPreview(final FocusedView $this, final Function0 callback) {
            $this.exitPreview((Function0<Unit>)callback);
        }
        
        static {
            $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusedView.class, "floatImageContainer", "getFloatImageContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusedView.class, "floatImage", "getFloatImage()Lgg/essential/elementa/components/UIImage;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusedView.class, "openOriginal", "getOpenOriginal()Lgg/essential/elementa/UIComponent;", 0)) };
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0018
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u0007
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002�\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T�\u0006\u0002
                                                       \u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e�\u0006\u0002
                                                       \u0000�\u0006\u0007""" }, d2 = { "Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$Companion;", "", "()V", "animationTime", "", "nextLoadingId", "", "essential" })
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
