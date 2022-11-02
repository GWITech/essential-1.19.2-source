package gg.essential.gui.friends.message;

import gg.essential.elementa.components.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.friends.*;
import gg.essential.gui.friends.previews.*;
import kotlin.properties.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.gui.common.constraints.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.util.*;
import java.util.*;
import com.sparkuniverse.toolbox.chat.enums.*;
import gg.essential.gui.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.state.*;
import java.awt.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000<
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
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020	0\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010
                                                   \u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019²\u0006
                                                   \u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006
                                                   \u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/friends/message/MessageTitleBar;", "Lgg/essential/elementa/components/UIContainer;", "messageScreen", "Lgg/essential/gui/friends/message/MessageScreen;", "gui", "Lgg/essential/gui/friends/SocialMenu;", "(Lgg/essential/gui/friends/message/MessageScreen;Lgg/essential/gui/friends/SocialMenu;)V", "dropdownOpen", "Lgg/essential/elementa/state/BasicState;", "", "managementButton", "Lgg/essential/gui/common/IconButton;", "getManagementButton", "()Lgg/essential/gui/common/IconButton;", "managementButton$delegate", "Lkotlin/properties/ReadWriteProperty;", "memberContainer", "preview", "Lgg/essential/gui/friends/previews/ChannelPreview;", "text", "Lgg/essential/elementa/components/UIText;", "getText", "()Lgg/essential/elementa/components/UIText;", "text$delegate", "Member", "essential", "button", "Lgg/essential/elementa/UIComponent;" })
public final class MessageTitleBar extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final MessageScreen messageScreen;
    @NotNull
    private final SocialMenu gui;
    @NotNull
    private final ChannelPreview preview;
    @NotNull
    private final UIContainer memberContainer;
    @NotNull
    private final BasicState<Boolean> dropdownOpen;
    @NotNull
    private final ReadWriteProperty managementButton$delegate;
    
    public MessageTitleBar(@NotNull final MessageScreen messageScreen, @NotNull final SocialMenu gui) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "messageScreen"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* gui */
        //     7: ldc             "gui"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    16: aload_0         /* this */
        //    17: aload_1         /* messageScreen */
        //    18: putfield        gg/essential/gui/friends/message/MessageTitleBar.messageScreen:Lgg/essential/gui/friends/message/MessageScreen;
        //    21: aload_0         /* this */
        //    22: aload_2         /* gui */
        //    23: putfield        gg/essential/gui/friends/message/MessageTitleBar.gui:Lgg/essential/gui/friends/SocialMenu;
        //    26: aload_0         /* this */
        //    27: aload_0         /* this */
        //    28: getfield        gg/essential/gui/friends/message/MessageTitleBar.messageScreen:Lgg/essential/gui/friends/message/MessageScreen;
        //    31: invokevirtual   gg/essential/gui/friends/message/MessageScreen.getPreview:()Lgg/essential/gui/friends/previews/ChannelPreview;
        //    34: putfield        gg/essential/gui/friends/message/MessageTitleBar.preview:Lgg/essential/gui/friends/previews/ChannelPreview;
        //    37: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //    40: dup            
        //    41: aconst_null    
        //    42: iconst_0       
        //    43: aconst_null    
        //    44: iconst_0       
        //    45: iconst_0       
        //    46: iconst_0       
        //    47: bipush          63
        //    49: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //    52: aload_0         /* this */
        //    53: getfield        gg/essential/gui/friends/message/MessageTitleBar.preview:Lgg/essential/gui/friends/previews/ChannelPreview;
        //    56: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getTitleState:()Lgg/essential/elementa/state/MappedState;
        //    59: checkcast       Lgg/essential/elementa/state/State;
        //    62: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //    65: checkcast       Lgg/essential/elementa/UIComponent;
        //    68: astore_3        /* $this$constrain$iv */
        //    69: aload_3         /* $this$constrain$iv */
        //    70: astore          5
        //    72: aload           5
        //    74: astore          $this$constrain_u24lambda_u2d0$iv
        //    76: aload           $this$constrain_u24lambda_u2d0$iv
        //    78: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    81: astore          $this$text_delegate_u24lambda_u2d0
        //    83: aload           $this$text_delegate_u24lambda_u2d0
        //    85: bipush          10
        //    87: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    90: checkcast       Ljava/lang/Number;
        //    93: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    96: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //    99: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   102: aload           $this$text_delegate_u24lambda_u2d0
        //   104: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   107: dup            
        //   108: iconst_0       
        //   109: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   112: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   115: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   118: aload           5
        //   120: aload_0         /* this */
        //   121: checkcast       Lgg/essential/elementa/UIComponent;
        //   124: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   127: aload_0         /* this */
        //   128: getstatic       gg/essential/gui/friends/message/MessageTitleBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   131: iconst_0       
        //   132: aaload         
        //   133: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   136: pop            
        //   137: aload_0         /* this */
        //   138: new             Lgg/essential/elementa/components/UIContainer;
        //   141: dup            
        //   142: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   145: checkcast       Lgg/essential/elementa/UIComponent;
        //   148: astore_3        /* $this$constrain$iv */
        //   149: aload_3         /* $this$constrain$iv */
        //   150: astore          5
        //   152: aload           5
        //   154: astore          $this$constrain_u24lambda_u2d0$iv
        //   156: aload           $this$constrain_u24lambda_u2d0$iv
        //   158: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   161: astore          8
        //   163: astore          13
        //   165: aload           $this$memberContainer_u24lambda_u2d1
        //   167: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   170: dup            
        //   171: ldc             11.0
        //   173: iconst_0       
        //   174: iconst_2       
        //   175: aconst_null    
        //   176: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   179: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   182: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   185: aload           $this$memberContainer_u24lambda_u2d1
        //   187: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   190: dup            
        //   191: iconst_0       
        //   192: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   195: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   198: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   201: aload           $this$memberContainer_u24lambda_u2d1
        //   203: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   206: dup            
        //   207: fconst_0       
        //   208: iconst_1       
        //   209: aconst_null    
        //   210: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   213: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   216: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   219: aload           $this$memberContainer_u24lambda_u2d1
        //   221: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //   224: dup            
        //   225: fconst_0       
        //   226: iconst_1       
        //   227: aconst_null    
        //   228: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   231: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   234: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   237: aload           13
        //   239: aload           5
        //   241: aload_0         /* this */
        //   242: checkcast       Lgg/essential/elementa/UIComponent;
        //   245: aload_0         /* this */
        //   246: getfield        gg/essential/gui/friends/message/MessageTitleBar.preview:Lgg/essential/gui/friends/previews/ChannelPreview;
        //   249: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   252: invokestatic    gg/essential/util/ExtensionsKt.isAnnouncement:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Z
        //   255: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   258: invokestatic    gg/essential/gui/common/StateExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //   261: checkcast       Lgg/essential/elementa/state/State;
        //   264: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   267: checkcast       Lgg/essential/elementa/state/State;
        //   270: iconst_0       
        //   271: aconst_null    
        //   272: bipush          12
        //   274: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   277: checkcast       Lgg/essential/elementa/components/UIContainer;
        //   280: putfield        gg/essential/gui/friends/message/MessageTitleBar.memberContainer:Lgg/essential/elementa/components/UIContainer;
        //   283: aload_0         /* this */
        //   284: new             Lgg/essential/elementa/state/BasicState;
        //   287: dup            
        //   288: iconst_0       
        //   289: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   292: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   295: putfield        gg/essential/gui/friends/message/MessageTitleBar.dropdownOpen:Lgg/essential/elementa/state/BasicState;
        //   298: aload_0         /* this */
        //   299: new             Lgg/essential/gui/common/IconButton;
        //   302: dup            
        //   303: getstatic       gg/essential/gui/EssentialPalette.BURGER_7X5:Lgg/essential/gui/image/ImageFactory;
        //   306: aconst_null    
        //   307: aconst_null    
        //   308: iconst_0       
        //   309: iconst_0       
        //   310: iconst_0       
        //   311: bipush          62
        //   313: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   316: checkcast       Lgg/essential/elementa/UIComponent;
        //   319: astore_3        /* $this$constrain$iv */
        //   320: aload_3         /* $this$constrain$iv */
        //   321: astore          5
        //   323: aload           5
        //   325: astore          $this$constrain_u24lambda_u2d0$iv
        //   327: aload           $this$constrain_u24lambda_u2d0$iv
        //   329: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   332: astore          8
        //   334: astore          13
        //   336: aload           $this$managementButton_delegate_u24lambda_u2d2
        //   338: bipush          10
        //   340: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   343: checkcast       Ljava/lang/Number;
        //   346: iconst_1       
        //   347: iconst_0       
        //   348: iconst_2       
        //   349: aconst_null    
        //   350: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   353: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   356: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   359: aload           $this$managementButton_delegate_u24lambda_u2d2
        //   361: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   364: dup            
        //   365: iconst_0       
        //   366: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   369: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   372: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   375: aload           $this$managementButton_delegate_u24lambda_u2d2
        //   377: bipush          17
        //   379: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   382: checkcast       Ljava/lang/Number;
        //   385: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   388: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   391: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   394: aload           $this$managementButton_delegate_u24lambda_u2d2
        //   396: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   399: dup            
        //   400: fconst_0       
        //   401: iconst_1       
        //   402: aconst_null    
        //   403: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   406: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   409: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   412: aload           13
        //   414: aload           5
        //   416: aload_0         /* this */
        //   417: checkcast       Lgg/essential/elementa/UIComponent;
        //   420: aload_0         /* this */
        //   421: getfield        gg/essential/gui/friends/message/MessageTitleBar.preview:Lgg/essential/gui/friends/previews/ChannelPreview;
        //   424: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   427: invokestatic    gg/essential/util/ExtensionsKt.isAnnouncement:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Z
        //   430: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   433: invokestatic    gg/essential/gui/common/StateExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //   436: checkcast       Lgg/essential/elementa/state/State;
        //   439: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   442: checkcast       Lgg/essential/elementa/state/State;
        //   445: iconst_0       
        //   446: aconst_null    
        //   447: bipush          12
        //   449: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   452: aload_0         /* this */
        //   453: getstatic       gg/essential/gui/friends/message/MessageTitleBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   456: iconst_1       
        //   457: aaload         
        //   458: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   461: putfield        gg/essential/gui/friends/message/MessageTitleBar.managementButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //   464: aload_0         /* this */
        //   465: checkcast       Lgg/essential/elementa/UIComponent;
        //   468: astore_3        /* $this$constrain$iv */
        //   469: aload_3         /* $this$constrain$iv */
        //   470: astore          5
        //   472: aload           5
        //   474: astore          $this$constrain_u24lambda_u2d0$iv
        //   476: aload           $this$constrain_u24lambda_u2d0$iv
        //   478: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   481: astore          $this$_init__u24lambda_u2d3
        //   483: aload           $this$_init__u24lambda_u2d3
        //   485: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   488: dup            
        //   489: iconst_0       
        //   490: iconst_1       
        //   491: aconst_null    
        //   492: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   495: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   498: aload_0         /* this */
        //   499: getfield        gg/essential/gui/friends/message/MessageTitleBar.messageScreen:Lgg/essential/gui/friends/message/MessageScreen;
        //   502: checkcast       Lgg/essential/elementa/UIComponent;
        //   505: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   508: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   511: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   514: aload           $this$_init__u24lambda_u2d3
        //   516: bipush          100
        //   518: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   521: checkcast       Ljava/lang/Number;
        //   524: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   527: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   530: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   533: aload           $this$_init__u24lambda_u2d3
        //   535: bipush          100
        //   537: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   540: checkcast       Ljava/lang/Number;
        //   543: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   546: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   549: aload_0         /* this */
        //   550: getfield        gg/essential/gui/friends/message/MessageTitleBar.messageScreen:Lgg/essential/gui/friends/message/MessageScreen;
        //   553: checkcast       Lgg/essential/elementa/UIComponent;
        //   556: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   559: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   562: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   565: aload_0         /* this */
        //   566: invokespecial   gg/essential/gui/friends/message/MessageTitleBar.getManagementButton:()Lgg/essential/gui/common/IconButton;
        //   569: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   572: aload_0         /* this */
        //   573: invokespecial   gg/essential/gui/friends/message/MessageTitleBar.getManagementButton:()Lgg/essential/gui/common/IconButton;
        //   576: checkcast       Lgg/essential/elementa/UIComponent;
        //   579: iconst_0       
        //   580: iconst_0       
        //   581: iconst_3       
        //   582: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   585: aload_0         /* this */
        //   586: getfield        gg/essential/gui/friends/message/MessageTitleBar.dropdownOpen:Lgg/essential/elementa/state/BasicState;
        //   589: checkcast       Lgg/essential/elementa/state/State;
        //   592: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   595: checkcast       Lgg/essential/elementa/state/State;
        //   598: new             Lgg/essential/elementa/state/BasicState;
        //   601: dup            
        //   602: iconst_1       
        //   603: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   606: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   609: checkcast       Lgg/essential/elementa/state/State;
        //   612: invokevirtual   gg/essential/gui/EssentialPalette.getButtonColor:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   615: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   618: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   621: invokevirtual   gg/essential/gui/common/IconButton.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   624: pop            
        //   625: aload_0         /* this */
        //   626: getfield        gg/essential/gui/friends/message/MessageTitleBar.memberContainer:Lgg/essential/elementa/components/UIContainer;
        //   629: checkcast       Lgg/essential/elementa/UIComponent;
        //   632: aload_0         /* this */
        //   633: getfield        gg/essential/gui/friends/message/MessageTitleBar.gui:Lgg/essential/gui/friends/SocialMenu;
        //   636: invokevirtual   gg/essential/gui/friends/SocialMenu.getSocialStateManager:()Lgg/essential/gui/friends/state/SocialStateManager;
        //   639: invokevirtual   gg/essential/gui/friends/state/SocialStateManager.getMessengerStates:()Lgg/essential/gui/friends/state/IMessengerStates;
        //   642: aload_0         /* this */
        //   643: getfield        gg/essential/gui/friends/message/MessageTitleBar.preview:Lgg/essential/gui/friends/previews/ChannelPreview;
        //   646: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   649: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //   652: invokeinterface gg/essential/gui/friends/state/IMessengerStates.getObservableMemberList:(J)Lgg/essential/elementa/utils/ObservableList;
        //   657: getstatic       gg/essential/gui/friends/message/MessageTitleBar$2.INSTANCE:Lgg/essential/gui/friends/message/MessageTitleBar$2;
        //   660: checkcast       Lkotlin/jvm/functions/Function1;
        //   663: aconst_null    
        //   664: new             Lgg/essential/gui/friends/message/MessageTitleBar$3;
        //   667: dup            
        //   668: aload_0         /* this */
        //   669: invokespecial   gg/essential/gui/friends/message/MessageTitleBar$3.<init>:(Lgg/essential/gui/friends/message/MessageTitleBar;)V
        //   672: checkcast       Lkotlin/jvm/functions/Function1;
        //   675: iconst_4       
        //   676: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindChildren$default$5794d177:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/utils/ObservableList;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //   679: pop            
        //   680: aload_0         /* this */
        //   681: invokespecial   gg/essential/gui/friends/message/MessageTitleBar.getManagementButton:()Lgg/essential/gui/common/IconButton;
        //   684: checkcast       Lgg/essential/elementa/UIComponent;
        //   687: astore_3        /* $this$onLeftClick$iv */
        //   688: aload_3         /* $this$onLeftClick$iv */
        //   689: new             Lgg/essential/gui/friends/message/MessageTitleBar$special$$inlined$onLeftClick$1;
        //   692: dup            
        //   693: aload_0         /* this */
        //   694: invokespecial   gg/essential/gui/friends/message/MessageTitleBar$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/friends/message/MessageTitleBar;)V
        //   697: checkcast       Lkotlin/jvm/functions/Function2;
        //   700: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   703: pop            
        //   704: aload_0         /* this */
        //   705: getfield        gg/essential/gui/friends/message/MessageTitleBar.preview:Lgg/essential/gui/friends/previews/ChannelPreview;
        //   708: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getOtherUser:()Ljava/util/UUID;
        //   711: ifnull          920
        //   714: aload_0         /* this */
        //   715: getfield        gg/essential/gui/friends/message/MessageTitleBar.gui:Lgg/essential/gui/friends/SocialMenu;
        //   718: invokevirtual   gg/essential/gui/friends/SocialMenu.getSocialStateManager:()Lgg/essential/gui/friends/state/SocialStateManager;
        //   721: invokevirtual   gg/essential/gui/friends/state/SocialStateManager.getStatusStates:()Lgg/essential/gui/friends/state/IStatusStates;
        //   724: aload_0         /* this */
        //   725: getfield        gg/essential/gui/friends/message/MessageTitleBar.preview:Lgg/essential/gui/friends/previews/ChannelPreview;
        //   728: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getOtherUser:()Ljava/util/UUID;
        //   731: invokeinterface gg/essential/gui/friends/state/IStatusStates.getActivityState:(Ljava/util/UUID;)Lgg/essential/gui/common/ReadOnlyState;
        //   736: astore_3        /* activityState */
        //   737: new             Lgg/essential/gui/common/IconButton;
        //   740: dup            
        //   741: getstatic       gg/essential/gui/EssentialPalette.JOIN_ARROW_5X:Lgg/essential/gui/image/ImageFactory;
        //   744: ldc_w           "Join Game"
        //   747: aconst_null    
        //   748: iconst_0       
        //   749: iconst_0       
        //   750: iconst_0       
        //   751: bipush          60
        //   753: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   756: checkcast       Lgg/essential/elementa/UIComponent;
        //   759: astore          $this$constrain$iv
        //   761: aload           $this$constrain$iv
        //   763: astore          7
        //   765: aload           7
        //   767: astore          $this$constrain_u24lambda_u2d0$iv
        //   769: aload           $this$constrain_u24lambda_u2d0$iv
        //   771: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   774: astore          $this$_init__u24lambda_u2d5
        //   776: aload           $this$_init__u24lambda_u2d5
        //   778: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   781: dup            
        //   782: ldc_w           3.0
        //   785: iconst_1       
        //   786: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   789: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   792: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   795: aload           $this$_init__u24lambda_u2d5
        //   797: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   800: dup            
        //   801: iconst_0       
        //   802: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   805: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   808: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   811: aload           7
        //   813: checkcast       Lgg/essential/gui/common/IconButton;
        //   816: getstatic       gg/essential/gui/EssentialPalette.MESSAGE_SENT:Ljava/awt/Color;
        //   819: invokestatic    gg/essential/gui/common/StateExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //   822: checkcast       Lgg/essential/elementa/state/State;
        //   825: invokevirtual   gg/essential/gui/common/IconButton.rebindIconColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/IconButton;
        //   828: getstatic       gg/essential/gui/EssentialPalette.MESSAGE_SENT:Ljava/awt/Color;
        //   831: invokestatic    gg/essential/gui/common/StateExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //   834: checkcast       Lgg/essential/elementa/state/State;
        //   837: invokevirtual   gg/essential/gui/common/IconButton.rebindTextColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/IconButton;
        //   840: getstatic       gg/essential/gui/common/IconButton$Layout.TEXT_FIRST:Lgg/essential/gui/common/IconButton$Layout;
        //   843: invokevirtual   gg/essential/gui/common/IconButton.setLayout:(Lgg/essential/gui/common/IconButton$Layout;)Lgg/essential/gui/common/IconButton;
        //   846: new             Lgg/essential/gui/common/IconButton$Dimension$Fixed;
        //   849: dup            
        //   850: ldc_w           70.0
        //   853: ldc_w           17.0
        //   856: invokespecial   gg/essential/gui/common/IconButton$Dimension$Fixed.<init>:(FF)V
        //   859: checkcast       Lgg/essential/gui/common/IconButton$Dimension;
        //   862: invokevirtual   gg/essential/gui/common/IconButton.setDimension:(Lgg/essential/gui/common/IconButton$Dimension;)Lgg/essential/gui/common/IconButton;
        //   865: checkcast       Lgg/essential/elementa/UIComponent;
        //   868: aload_0         /* this */
        //   869: checkcast       Lgg/essential/elementa/UIComponent;
        //   872: aload_3         /* activityState */
        //   873: getstatic       gg/essential/gui/friends/message/MessageTitleBar$button$3.INSTANCE:Lgg/essential/gui/friends/message/MessageTitleBar$button$3;
        //   876: checkcast       Lkotlin/jvm/functions/Function1;
        //   879: invokevirtual   gg/essential/gui/common/ReadOnlyState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   882: checkcast       Lgg/essential/elementa/state/State;
        //   885: iconst_0       
        //   886: aconst_null    
        //   887: bipush          12
        //   889: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   892: astore          $this$onLeftClick$iv
        //   894: aload           $this$onLeftClick$iv
        //   896: new             Lgg/essential/gui/friends/message/MessageTitleBar$special$$inlined$onLeftClick$2;
        //   899: dup            
        //   900: aload_0         /* this */
        //   901: invokespecial   gg/essential/gui/friends/message/MessageTitleBar$special$$inlined$onLeftClick$2.<init>:(Lgg/essential/gui/friends/message/MessageTitleBar;)V
        //   904: checkcast       Lkotlin/jvm/functions/Function2;
        //   907: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   910: aconst_null    
        //   911: getstatic       gg/essential/gui/friends/message/MessageTitleBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   914: iconst_2       
        //   915: aaload         
        //   916: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   919: pop            
        //   920: aload_0         /* this */
        //   921: getfield        gg/essential/gui/friends/message/MessageTitleBar.preview:Lgg/essential/gui/friends/previews/ChannelPreview;
        //   924: invokevirtual   gg/essential/gui/friends/previews/ChannelPreview.getChannel:()Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   927: invokestatic    gg/essential/util/ExtensionsKt.isAnnouncement:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Z
        //   930: ifne            1225
        //   933: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //   936: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //   939: dup            
        //   940: ldc_w           "getInstance().connectionManager"
        //   943: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   946: astore_3        /* connectionManager */
        //   947: aload_3         /* connectionManager */
        //   948: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getSpsManager:()Lgg/essential/network/connectionmanager/sps/SPSManager;
        //   951: dup            
        //   952: ldc_w           "connectionManager.spsManager"
        //   955: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   958: astore          spsManager
        //   960: invokestatic    gg/essential/universal/UMinecraft.getMinecraft:()Lnet/minecraft/client/MinecraftClient;
        //   963: invokevirtual   net/minecraft/client/MinecraftClient.getCurrentServerEntry:()Lnet/minecraft/client/network/ServerInfo;
        //   966: astore          currentServerData
        //   968: aload           spsManager
        //   970: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.getLocalSession:()Lgg/essential/upnp/model/UPnPSession;
        //   973: ifnull          980
        //   976: iconst_1       
        //   977: goto            981
        //   980: iconst_0       
        //   981: istore          hasLocalSession
        //   983: iload           hasLocalSession
        //   985: ifne            1015
        //   988: aload           currentServerData
        //   990: ifnull          1225
        //   993: aload           spsManager
        //   995: aload           currentServerData
        //   997: getfield        net/minecraft/client/network/ServerInfo.address:Ljava/lang/String;
        //  1000: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.isSpsAddress:(Ljava/lang/String;)Z
        //  1003: ifne            1225
        //  1006: invokestatic    gg/essential/universal/UMinecraft.getMinecraft:()Lnet/minecraft/client/MinecraftClient;
        //  1009: invokevirtual   net/minecraft/client/MinecraftClient.isConnectedToRealms:()Z
        //  1012: ifne            1225
        //  1015: new             Lgg/essential/elementa/state/BasicState;
        //  1018: dup            
        //  1019: iconst_0       
        //  1020: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1023: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1026: astore          invited
        //  1028: aload           invited
        //  1030: getstatic       gg/essential/gui/friends/message/MessageTitleBar$textState$1.INSTANCE:Lgg/essential/gui/friends/message/MessageTitleBar$textState$1;
        //  1033: checkcast       Lkotlin/jvm/functions/Function1;
        //  1036: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1039: astore          textState
        //  1041: new             Lgg/essential/gui/common/IconButton;
        //  1044: dup            
        //  1045: getstatic       gg/essential/gui/EssentialPalette.INVITE_10X6:Lgg/essential/gui/image/ImageFactory;
        //  1048: aload           textState
        //  1050: checkcast       Lgg/essential/elementa/state/State;
        //  1053: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Lgg/essential/elementa/state/State;)V
        //  1056: checkcast       Lgg/essential/elementa/UIComponent;
        //  1059: astore          $this$constrain$iv
        //  1061: aload           $this$constrain$iv
        //  1063: astore          10
        //  1065: aload           10
        //  1067: astore          $this$constrain_u24lambda_u2d0$iv
        //  1069: aload           $this$constrain_u24lambda_u2d0$iv
        //  1071: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1074: astore          $this$_init__u24lambda_u2d8
        //  1076: aload           $this$_init__u24lambda_u2d8
        //  1078: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1081: dup            
        //  1082: ldc_w           3.0
        //  1085: iconst_1       
        //  1086: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //  1089: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1092: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1095: aload           $this$_init__u24lambda_u2d8
        //  1097: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //  1100: dup            
        //  1101: iconst_0       
        //  1102: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //  1105: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1108: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1111: aload           10
        //  1113: checkcast       Lgg/essential/gui/common/IconButton;
        //  1116: getstatic       gg/essential/gui/EssentialPalette.MESSAGE_SENT:Ljava/awt/Color;
        //  1119: invokestatic    gg/essential/gui/common/StateExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //  1122: checkcast       Lgg/essential/elementa/state/State;
        //  1125: invokevirtual   gg/essential/gui/common/IconButton.rebindIconColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/IconButton;
        //  1128: getstatic       gg/essential/gui/EssentialPalette.MESSAGE_SENT:Ljava/awt/Color;
        //  1131: invokestatic    gg/essential/gui/common/StateExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //  1134: checkcast       Lgg/essential/elementa/state/State;
        //  1137: invokevirtual   gg/essential/gui/common/IconButton.rebindTextColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/IconButton;
        //  1140: new             Lgg/essential/gui/common/IconButton$Dimension$Fixed;
        //  1143: dup            
        //  1144: ldc_w           55.0
        //  1147: ldc_w           17.0
        //  1150: invokespecial   gg/essential/gui/common/IconButton$Dimension$Fixed.<init>:(FF)V
        //  1153: checkcast       Lgg/essential/gui/common/IconButton$Dimension;
        //  1156: invokevirtual   gg/essential/gui/common/IconButton.setDimension:(Lgg/essential/gui/common/IconButton$Dimension;)Lgg/essential/gui/common/IconButton;
        //  1159: getstatic       gg/essential/gui/common/IconButton$Layout.TEXT_FIRST:Lgg/essential/gui/common/IconButton$Layout;
        //  1162: invokevirtual   gg/essential/gui/common/IconButton.setLayout:(Lgg/essential/gui/common/IconButton$Layout;)Lgg/essential/gui/common/IconButton;
        //  1165: checkcast       Lgg/essential/elementa/UIComponent;
        //  1168: astore          $this$onLeftClick$iv
        //  1170: aload           $this$onLeftClick$iv
        //  1172: new             Lgg/essential/gui/friends/message/MessageTitleBar$special$$inlined$onLeftClick$3;
        //  1175: dup            
        //  1176: aload           invited
        //  1178: iload           hasLocalSession
        //  1180: aload_3         /* connectionManager */
        //  1181: aload_0         /* this */
        //  1182: aload           currentServerData
        //  1184: invokespecial   gg/essential/gui/friends/message/MessageTitleBar$special$$inlined$onLeftClick$3.<init>:(Lgg/essential/elementa/state/BasicState;ZLgg/essential/network/connectionmanager/ConnectionManager;Lgg/essential/gui/friends/message/MessageTitleBar;Lnet/minecraft/client/network/ServerInfo;)V
        //  1187: checkcast       Lkotlin/jvm/functions/Function2;
        //  1190: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1193: new             Lgg/essential/gui/friends/message/MessageTitleBar$button$8;
        //  1196: dup            
        //  1197: aload           invited
        //  1199: invokespecial   gg/essential/gui/friends/message/MessageTitleBar$button$8.<init>:(Lgg/essential/elementa/state/BasicState;)V
        //  1202: checkcast       Lkotlin/jvm/functions/Function1;
        //  1205: invokevirtual   gg/essential/elementa/UIComponent.onMouseLeave:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //  1208: aload_0         /* this */
        //  1209: checkcast       Lgg/essential/elementa/UIComponent;
        //  1212: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1215: aconst_null    
        //  1216: getstatic       gg/essential/gui/friends/message/MessageTitleBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1219: iconst_3       
        //  1220: aaload         
        //  1221: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1224: pop            
        //  1225: return         
        //    MethodParameters:
        //  Name           Flags  
        //  -------------  -----
        //  messageScreen  
        //  gui            
        //    StackMapTable: 00 05 FF 03 98 00 0E 07 00 02 07 00 51 07 01 20 07 01 92 00 07 00 6A 07 00 6A 00 07 01 94 00 00 00 00 07 00 02 00 00 FF 00 3B 00 0E 07 00 02 07 00 51 07 01 20 07 01 A5 07 01 B9 07 01 BF 07 00 6A 00 07 01 94 00 00 00 00 07 00 02 00 00 40 01 FF 00 21 00 0E 07 00 02 07 00 51 07 01 20 07 01 A5 07 01 B9 07 01 BF 01 00 07 01 94 00 00 00 00 07 00 02 00 00 FF 00 D1 00 0E 07 00 02 07 00 51 07 01 20 07 01 92 00 07 01 92 00 00 07 01 92 00 00 00 00 07 00 02 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final IconButton getManagementButton() {
        return (IconButton)this.managementButton$delegate.getValue((Object)this, (KProperty)MessageTitleBar.$$delegatedProperties[1]);
    }
    
    public static final /* synthetic */ ChannelPreview access$getPreview$p(final MessageTitleBar $this) {
        return $this.preview;
    }
    
    public static final /* synthetic */ SocialMenu access$getGui$p(final MessageTitleBar $this) {
        return $this.gui;
    }
    
    public static final /* synthetic */ BasicState access$getDropdownOpen$p(final MessageTitleBar $this) {
        return $this.dropdownOpen;
    }
    
    public static final /* synthetic */ IconButton access$getManagementButton(final MessageTitleBar $this) {
        return $this.getManagementButton();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)MessageTitleBar.class, "text", "getText()Lgg/essential/elementa/components/UIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)MessageTitleBar.class, "managementButton", "getManagementButton()Lgg/essential/gui/common/IconButton;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)MessageTitleBar.class, "button", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)MessageTitleBar.class, "button", "<v#1>", 0)) };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0018
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/friends/message/MessageTitleBar$Member;", "Lgg/essential/elementa/components/UIContainer;", "member", "Ljava/util/UUID;", "(Lgg/essential/gui/friends/message/MessageTitleBar;Ljava/util/UUID;)V", "head", "Lgg/essential/elementa/components/UIImage;", "essential" })
    public final class Member extends UIContainer
    {
        @NotNull
        private final UUID member;
        final /* synthetic */ MessageTitleBar this$0;
        
        public Member(@NotNull final MessageTitleBar this$0, final UUID member) {
            Intrinsics.checkNotNullParameter((Object)member, "member");
            this.this$0 = this$0;
            super();
            this.member = member;
            UIComponent $this$constrain_u24lambda_u2d0$iv;
            UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = CachedAvatarImage.ofUUID(this.member);
            final UIConstraints $this$head_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$head_u24lambda_u2d0.setY(new CenterConstraint());
            $this$head_u24lambda_u2d0.setHeight(UtilitiesKt.getPixels(16));
            $this$head_u24lambda_u2d0.setWidth(new AspectConstraint(0.0f, 1, null));
            ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this);
            $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = this);
            final UIConstraints $this$_init__u24lambda_u2d1 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$_init__u24lambda_u2d1.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
            $this$_init__u24lambda_u2d1.setHeight(new ChildBasedSizeConstraint(0.0f, 1, null));
            $this$_init__u24lambda_u2d1.setX(new SiblingConstraint(3.0f, false, 2, null));
            $this$_init__u24lambda_u2d1.setY(new CenterPixelConstraint('\0'));
            this.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>() {
                final /* synthetic */ Member this$0;
                final /* synthetic */ MessageTitleBar this$1 = Member.this.this$0;
                
                MessageTitleBar$Member$2() {
                    this.this$0 = $receiver;
                    super(2);
                }
                
                public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                    Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                    Intrinsics.checkNotNullParameter((Object)it, "it");
                    if (it.getMouseButton() > 1) {
                        return;
                    }
                    if (!Intrinsics.areEqual((Object)Member.access$getMember$p(this.this$0), (Object)UUIDUtil.getClientUUID())) {
                        final List options = new ArrayList();
                        if (Intrinsics.areEqual((Object)MessageTitleBar.access$getPreview$p(this.this$1).getChannel().getCreatedInfo().getBy(), (Object)UUIDUtil.getClientUUID()) && MessageTitleBar.access$getPreview$p(this.this$1).getChannel().getType() == ChannelType.GROUP_DIRECT_MESSAGE) {
                            options.add(new OptionMenu.Option("Remove from group", null, EssentialPalette.CANCEL_5X, null, null, null, null, (Function0)new MessageTitleBar$Member$2.MessageTitleBar$Member$2$1(this.this$1, this.this$0), 122));
                        }
                        MessageTitleBar.access$getGui$p(this.this$1).showUserDropdown(Member.access$getMember$p(this.this$0), new OptionMenu.Position($this$onMouseClick, true), options, (Function0<Unit>)MessageTitleBar$Member$2.MessageTitleBar$Member$2$2.INSTANCE);
                    }
                }
                
                public /* bridge */ Object invoke(final Object p1, final Object p2) {
                    this.invoke((UIComponent)p1, (UIClickEvent)p2);
                    return Unit.INSTANCE;
                }
            });
        }
        
        public static final /* synthetic */ UUID access$getMember$p(final Member $this) {
            return $this.member;
        }
    }
}
