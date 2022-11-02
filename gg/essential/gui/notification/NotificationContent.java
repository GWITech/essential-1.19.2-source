package gg.essential.gui.notification;

import kotlin.*;
import kotlin.reflect.*;
import java.awt.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import gg.essential.api.gui.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u000f
                                                   \u0002\u0018\u0002
                                                   \u0002\b\r
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*R\u001b\u0010\b\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000b\u0010\f\u001a\u0004\b	\u0010
                                                   R\u001b\u0010\r\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010
                                                   R\u001b\u0010\u0010\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010
                                                   R\u001b\u0010\u0013\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0015\u0010\f\u001a\u0004\b\u0014\u0010
                                                   R\u001b\u0010\u0002\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0019\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001c\u0010\f\u001a\u0004\b\u001b\u0010
                                                   R\u001b\u0010\u001d\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001f\u0010\f\u001a\u0004\b\u001e\u0010
                                                   R\u001b\u0010 \u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b"\u0010\f\u001a\u0004\b!\u0010
                                                   R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0004\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b&\u0010\f\u001a\u0004\b%\u0010\u0018¨\u0006+""" }, d2 = { "Lgg/essential/gui/notification/NotificationContent;", "Lgg/essential/elementa/components/UIContainer;", "message", "", "title", "trimMessage", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "actionContainer", "getActionContainer", "()Lgg/essential/elementa/components/UIContainer;", "actionContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "body", "getBody", "body$delegate", "largePreviewContainer", "getLargePreviewContainer", "largePreviewContainer$delegate", "leftBody", "getLeftBody", "leftBody$delegate", "Lgg/essential/elementa/components/UIWrappedText;", "getMessage", "()Lgg/essential/elementa/components/UIWrappedText;", "message$delegate", "previewAndMessage", "getPreviewAndMessage", "previewAndMessage$delegate", "previewContainer", "getPreviewContainer", "previewContainer$delegate", "rightBody", "getRightBody", "rightBody$delegate", "shadowColor", "Ljava/awt/Color;", "getTitle", "title$delegate", "applyBuilder", "", "builder", "Lgg/essential/gui/notification/Notifications$NotificationBuilderImpl;", "essential" })
public final class NotificationContent extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @Nullable
    private final Color shadowColor;
    @NotNull
    private final ReadWriteProperty title$delegate;
    @NotNull
    private final ReadWriteProperty body$delegate;
    @NotNull
    private final ReadWriteProperty leftBody$delegate;
    @NotNull
    private final ReadWriteProperty rightBody$delegate;
    @NotNull
    private final ReadWriteProperty previewAndMessage$delegate;
    @NotNull
    private final ReadWriteProperty previewContainer$delegate;
    @NotNull
    private final ReadWriteProperty largePreviewContainer$delegate;
    @NotNull
    private final ReadWriteProperty actionContainer$delegate;
    
    public NotificationContent(@NotNull final String message, @NotNull final String title, final boolean trimMessage) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "message"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* title */
        //     7: ldc             "title"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    16: aload_0         /* this */
        //    17: getstatic       gg/essential/gui/EssentialPalette.MODAL_OUTLINE:Ljava/awt/Color;
        //    20: astore          4
        //    22: astore          8
        //    24: aload           8
        //    26: aload           4
        //    28: putfield        gg/essential/gui/notification/NotificationContent.shadowColor:Ljava/awt/Color;
        //    31: aload_0         /* this */
        //    32: new             Lgg/essential/elementa/components/UIWrappedText;
        //    35: dup            
        //    36: aload_2         /* title */
        //    37: iconst_0       
        //    38: aload_0         /* this */
        //    39: getfield        gg/essential/gui/notification/NotificationContent.shadowColor:Ljava/awt/Color;
        //    42: iconst_0       
        //    43: iconst_0       
        //    44: fconst_0       
        //    45: aconst_null    
        //    46: bipush          122
        //    48: aconst_null    
        //    49: invokespecial   gg/essential/elementa/components/UIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    52: checkcast       Lgg/essential/elementa/UIComponent;
        //    55: astore          $this$constrain$iv
        //    57: aload           $this$constrain$iv
        //    59: astore          5
        //    61: aload           5
        //    63: astore          $this$constrain_u24lambda_u2d0$iv
        //    65: aload           $this$constrain_u24lambda_u2d0$iv
        //    67: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    70: astore          7
        //    72: astore          8
        //    74: aload           $this$title_delegate_u24lambda_u2d1
        //    76: bipush          100
        //    78: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    81: checkcast       Ljava/lang/Number;
        //    84: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    87: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    90: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    93: aload           $this$title_delegate_u24lambda_u2d1
        //    95: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //    98: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   101: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   104: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   107: aload           8
        //   109: aload           5
        //   111: aload_0         /* this */
        //   112: checkcast       Lgg/essential/elementa/UIComponent;
        //   115: new             Lgg/essential/elementa/state/BasicState;
        //   118: dup            
        //   119: aload_2         /* title */
        //   120: checkcast       Ljava/lang/CharSequence;
        //   123: invokeinterface java/lang/CharSequence.length:()I
        //   128: ifle            135
        //   131: iconst_1       
        //   132: goto            136
        //   135: iconst_0       
        //   136: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   139: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   142: checkcast       Lgg/essential/elementa/state/State;
        //   145: iconst_0       
        //   146: aconst_null    
        //   147: bipush          12
        //   149: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   152: aload_0         /* this */
        //   153: getstatic       gg/essential/gui/notification/NotificationContent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   156: iconst_0       
        //   157: aaload         
        //   158: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   161: putfield        gg/essential/gui/notification/NotificationContent.title$delegate:Lkotlin/properties/ReadWriteProperty;
        //   164: aload_0         /* this */
        //   165: new             Lgg/essential/elementa/components/UIContainer;
        //   168: dup            
        //   169: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   172: checkcast       Lgg/essential/elementa/UIComponent;
        //   175: astore          $this$constrain$iv
        //   177: aload           $this$constrain$iv
        //   179: astore          5
        //   181: aload           5
        //   183: astore          $this$constrain_u24lambda_u2d0$iv
        //   185: aload           $this$constrain_u24lambda_u2d0$iv
        //   187: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   190: astore          7
        //   192: astore          8
        //   194: aload           $this$body_delegate_u24lambda_u2d2
        //   196: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   199: dup            
        //   200: ldc             6.0
        //   202: iconst_0       
        //   203: iconst_2       
        //   204: aconst_null    
        //   205: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   208: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   211: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   214: aload           $this$body_delegate_u24lambda_u2d2
        //   216: bipush          100
        //   218: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   221: checkcast       Ljava/lang/Number;
        //   224: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   227: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   230: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   233: aload           $this$body_delegate_u24lambda_u2d2
        //   235: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   238: dup            
        //   239: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   242: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   245: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   248: aload           8
        //   250: aload           5
        //   252: aload_0         /* this */
        //   253: checkcast       Lgg/essential/elementa/UIComponent;
        //   256: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   259: aload_0         /* this */
        //   260: getstatic       gg/essential/gui/notification/NotificationContent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   263: iconst_1       
        //   264: aaload         
        //   265: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   268: putfield        gg/essential/gui/notification/NotificationContent.body$delegate:Lkotlin/properties/ReadWriteProperty;
        //   271: aload_0         /* this */
        //   272: new             Lgg/essential/elementa/components/UIContainer;
        //   275: dup            
        //   276: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   279: checkcast       Lgg/essential/elementa/UIComponent;
        //   282: astore          $this$constrain$iv
        //   284: aload           $this$constrain$iv
        //   286: astore          5
        //   288: aload           5
        //   290: astore          $this$constrain_u24lambda_u2d0$iv
        //   292: aload           $this$constrain_u24lambda_u2d0$iv
        //   294: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   297: astore          7
        //   299: astore          8
        //   301: aload           $this$leftBody_delegate_u24lambda_u2d3
        //   303: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   306: dup            
        //   307: iconst_1       
        //   308: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //   311: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   314: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   317: aload           $this$leftBody_delegate_u24lambda_u2d3
        //   319: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   322: dup            
        //   323: fconst_0       
        //   324: iconst_1       
        //   325: aconst_null    
        //   326: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   329: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   332: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   335: aload           8
        //   337: aload           5
        //   339: aload_0         /* this */
        //   340: invokespecial   gg/essential/gui/notification/NotificationContent.getBody:()Lgg/essential/elementa/components/UIContainer;
        //   343: checkcast       Lgg/essential/elementa/UIComponent;
        //   346: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   349: aload_0         /* this */
        //   350: getstatic       gg/essential/gui/notification/NotificationContent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   353: iconst_2       
        //   354: aaload         
        //   355: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   358: putfield        gg/essential/gui/notification/NotificationContent.leftBody$delegate:Lkotlin/properties/ReadWriteProperty;
        //   361: aload_0         /* this */
        //   362: new             Lgg/essential/elementa/components/UIContainer;
        //   365: dup            
        //   366: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   369: checkcast       Lgg/essential/elementa/UIComponent;
        //   372: astore          $this$constrain$iv
        //   374: aload           $this$constrain$iv
        //   376: astore          5
        //   378: aload           5
        //   380: astore          $this$constrain_u24lambda_u2d0$iv
        //   382: aload           $this$constrain_u24lambda_u2d0$iv
        //   384: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   387: astore          7
        //   389: astore          8
        //   391: aload           $this$rightBody_delegate_u24lambda_u2d4
        //   393: iconst_0       
        //   394: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   397: checkcast       Ljava/lang/Number;
        //   400: iconst_1       
        //   401: iconst_0       
        //   402: iconst_2       
        //   403: aconst_null    
        //   404: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   407: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   410: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   413: aload           $this$rightBody_delegate_u24lambda_u2d4
        //   415: iconst_0       
        //   416: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   419: checkcast       Ljava/lang/Number;
        //   422: iconst_1       
        //   423: iconst_0       
        //   424: iconst_2       
        //   425: aconst_null    
        //   426: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   429: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   432: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   435: aload           $this$rightBody_delegate_u24lambda_u2d4
        //   437: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   440: dup            
        //   441: fconst_0       
        //   442: iconst_1       
        //   443: aconst_null    
        //   444: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   447: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   450: iconst_5       
        //   451: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   454: checkcast       Ljava/lang/Number;
        //   457: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   460: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   463: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   466: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   469: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   472: aload           $this$rightBody_delegate_u24lambda_u2d4
        //   474: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   477: dup            
        //   478: fconst_0       
        //   479: iconst_1       
        //   480: aconst_null    
        //   481: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   484: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   487: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   490: aload           8
        //   492: aload           5
        //   494: aload_0         /* this */
        //   495: getstatic       gg/essential/gui/notification/NotificationContent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   498: iconst_3       
        //   499: aaload         
        //   500: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   503: putfield        gg/essential/gui/notification/NotificationContent.rightBody$delegate:Lkotlin/properties/ReadWriteProperty;
        //   506: aload_0         /* this */
        //   507: new             Lgg/essential/elementa/components/UIContainer;
        //   510: dup            
        //   511: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   514: checkcast       Lgg/essential/elementa/UIComponent;
        //   517: astore          $this$constrain$iv
        //   519: aload           $this$constrain$iv
        //   521: astore          5
        //   523: aload           5
        //   525: astore          $this$constrain_u24lambda_u2d0$iv
        //   527: aload           $this$constrain_u24lambda_u2d0$iv
        //   529: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   532: astore          7
        //   534: astore          8
        //   536: aload           $this$previewAndMessage_delegate_u24lambda_u2d5
        //   538: bipush          100
        //   540: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   543: checkcast       Ljava/lang/Number;
        //   546: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   549: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   552: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   555: aload           $this$previewAndMessage_delegate_u24lambda_u2d5
        //   557: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   560: dup            
        //   561: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   564: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   567: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   570: aload           8
        //   572: aload           5
        //   574: aload_0         /* this */
        //   575: getstatic       gg/essential/gui/notification/NotificationContent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   578: iconst_4       
        //   579: aaload         
        //   580: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   583: putfield        gg/essential/gui/notification/NotificationContent.previewAndMessage$delegate:Lkotlin/properties/ReadWriteProperty;
        //   586: aload_0         /* this */
        //   587: new             Lgg/essential/elementa/components/UIContainer;
        //   590: dup            
        //   591: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   594: checkcast       Lgg/essential/elementa/UIComponent;
        //   597: astore          $this$constrain$iv
        //   599: aload           $this$constrain$iv
        //   601: astore          5
        //   603: aload           5
        //   605: astore          $this$constrain_u24lambda_u2d0$iv
        //   607: aload           $this$constrain_u24lambda_u2d0$iv
        //   609: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   612: astore          7
        //   614: astore          8
        //   616: aload           $this$previewContainer_delegate_u24lambda_u2d6
        //   618: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   621: dup            
        //   622: fconst_0       
        //   623: iconst_1       
        //   624: aconst_null    
        //   625: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   628: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   631: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   634: aload           $this$previewContainer_delegate_u24lambda_u2d6
        //   636: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   639: dup            
        //   640: fconst_0       
        //   641: iconst_1       
        //   642: aconst_null    
        //   643: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   646: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   649: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   652: aload           8
        //   654: aload           5
        //   656: aload_0         /* this */
        //   657: getstatic       gg/essential/gui/notification/NotificationContent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   660: iconst_5       
        //   661: aaload         
        //   662: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   665: putfield        gg/essential/gui/notification/NotificationContent.previewContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   668: new             Lgg/essential/elementa/components/UIWrappedText;
        //   671: dup            
        //   672: aload_1         /* message */
        //   673: iconst_0       
        //   674: aload_0         /* this */
        //   675: getfield        gg/essential/gui/notification/NotificationContent.shadowColor:Ljava/awt/Color;
        //   678: iconst_0       
        //   679: iconst_1       
        //   680: fconst_0       
        //   681: aconst_null    
        //   682: bipush          106
        //   684: aconst_null    
        //   685: invokespecial   gg/essential/elementa/components/UIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   688: checkcast       Lgg/essential/elementa/UIComponent;
        //   691: astore          $this$constrain$iv
        //   693: aload           $this$constrain$iv
        //   695: astore          5
        //   697: aload           5
        //   699: astore          $this$constrain_u24lambda_u2d0$iv
        //   701: aload           $this$constrain_u24lambda_u2d0$iv
        //   703: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   706: astore          $this$message_delegate_u24lambda_u2d7
        //   708: aload           $this$message_delegate_u24lambda_u2d7
        //   710: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   713: dup            
        //   714: ldc             5.0
        //   716: iconst_0       
        //   717: iconst_2       
        //   718: aconst_null    
        //   719: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   722: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   725: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   728: aload           $this$message_delegate_u24lambda_u2d7
        //   730: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   733: dup            
        //   734: iconst_0       
        //   735: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //   738: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   741: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   744: aload           $this$message_delegate_u24lambda_u2d7
        //   746: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   749: dup            
        //   750: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   753: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   756: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   759: iload_3         /* trimMessage */
        //   760: ifeq            815
        //   763: aload           $this$message_delegate_u24lambda_u2d7
        //   765: aload           $this$message_delegate_u24lambda_u2d7
        //   767: invokevirtual   gg/essential/elementa/UIConstraints.getHeight:()Lgg/essential/elementa/constraints/HeightConstraint;
        //   770: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   773: bipush          27
        //   775: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   778: checkcast       Ljava/lang/Number;
        //   781: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   784: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   787: iconst_1       
        //   788: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   791: checkcast       Ljava/lang/Number;
        //   794: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   797: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   800: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   803: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   806: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.min:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/MinConstraint;
        //   809: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   812: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   815: aload           $this$message_delegate_u24lambda_u2d7
        //   817: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //   820: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   823: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   826: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   829: aload           5
        //   831: aload_0         /* this */
        //   832: invokespecial   gg/essential/gui/notification/NotificationContent.getPreviewAndMessage:()Lgg/essential/elementa/components/UIContainer;
        //   835: checkcast       Lgg/essential/elementa/UIComponent;
        //   838: new             Lgg/essential/elementa/state/BasicState;
        //   841: dup            
        //   842: aload_1         /* message */
        //   843: checkcast       Ljava/lang/CharSequence;
        //   846: invokeinterface java/lang/CharSequence.length:()I
        //   851: ifle            858
        //   854: iconst_1       
        //   855: goto            859
        //   858: iconst_0       
        //   859: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   862: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   865: checkcast       Lgg/essential/elementa/state/State;
        //   868: iconst_0       
        //   869: aconst_null    
        //   870: bipush          12
        //   872: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   875: aload_0         /* this */
        //   876: getstatic       gg/essential/gui/notification/NotificationContent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   879: bipush          6
        //   881: aaload         
        //   882: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   885: pop            
        //   886: aload_0         /* this */
        //   887: new             Lgg/essential/elementa/components/UIContainer;
        //   890: dup            
        //   891: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   894: checkcast       Lgg/essential/elementa/UIComponent;
        //   897: astore          $this$constrain$iv
        //   899: aload           $this$constrain$iv
        //   901: astore          5
        //   903: aload           5
        //   905: astore          $this$constrain_u24lambda_u2d0$iv
        //   907: aload           $this$constrain_u24lambda_u2d0$iv
        //   909: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   912: astore          7
        //   914: astore          8
        //   916: aload           $this$largePreviewContainer_delegate_u24lambda_u2d8
        //   918: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   921: dup            
        //   922: ldc             5.0
        //   924: iconst_0       
        //   925: iconst_2       
        //   926: aconst_null    
        //   927: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   930: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   933: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   936: aload           $this$largePreviewContainer_delegate_u24lambda_u2d8
        //   938: bipush          100
        //   940: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   943: checkcast       Ljava/lang/Number;
        //   946: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   949: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   952: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   955: aload           $this$largePreviewContainer_delegate_u24lambda_u2d8
        //   957: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   960: dup            
        //   961: fconst_0       
        //   962: iconst_1       
        //   963: aconst_null    
        //   964: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   967: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   970: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   973: aload           8
        //   975: aload           5
        //   977: aload_0         /* this */
        //   978: getstatic       gg/essential/gui/notification/NotificationContent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   981: bipush          7
        //   983: aaload         
        //   984: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   987: putfield        gg/essential/gui/notification/NotificationContent.largePreviewContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   990: aload_0         /* this */
        //   991: new             Lgg/essential/elementa/components/UIContainer;
        //   994: dup            
        //   995: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   998: checkcast       Lgg/essential/elementa/UIComponent;
        //  1001: astore          $this$constrain$iv
        //  1003: aload           $this$constrain$iv
        //  1005: astore          5
        //  1007: aload           5
        //  1009: astore          $this$constrain_u24lambda_u2d0$iv
        //  1011: aload           $this$constrain_u24lambda_u2d0$iv
        //  1013: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1016: astore          7
        //  1018: astore          8
        //  1020: aload           $this$actionContainer_delegate_u24lambda_u2d9
        //  1022: iconst_0       
        //  1023: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1026: checkcast       Ljava/lang/Number;
        //  1029: iconst_1       
        //  1030: iconst_0       
        //  1031: iconst_2       
        //  1032: aconst_null    
        //  1033: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1036: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1039: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1042: aload           $this$actionContainer_delegate_u24lambda_u2d9
        //  1044: iconst_0       
        //  1045: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1048: checkcast       Ljava/lang/Number;
        //  1051: iconst_1       
        //  1052: iconst_0       
        //  1053: iconst_2       
        //  1054: aconst_null    
        //  1055: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1058: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1061: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1064: aload           $this$actionContainer_delegate_u24lambda_u2d9
        //  1066: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1069: dup            
        //  1070: fconst_0       
        //  1071: iconst_1       
        //  1072: aconst_null    
        //  1073: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1076: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1079: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1082: aload           $this$actionContainer_delegate_u24lambda_u2d9
        //  1084: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1087: dup            
        //  1088: fconst_0       
        //  1089: iconst_1       
        //  1090: aconst_null    
        //  1091: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1094: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1097: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1100: aload           8
        //  1102: aload           5
        //  1104: aload_0         /* this */
        //  1105: invokespecial   gg/essential/gui/notification/NotificationContent.getRightBody:()Lgg/essential/elementa/components/UIContainer;
        //  1108: checkcast       Lgg/essential/elementa/UIComponent;
        //  1111: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1114: aload_0         /* this */
        //  1115: getstatic       gg/essential/gui/notification/NotificationContent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1118: bipush          8
        //  1120: aaload         
        //  1121: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1124: putfield        gg/essential/gui/notification/NotificationContent.actionContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1127: aload_0         /* this */
        //  1128: invokespecial   gg/essential/gui/notification/NotificationContent.getPreviewContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1131: new             Lgg/essential/elementa/effects/ScissorEffect;
        //  1134: dup            
        //  1135: aconst_null    
        //  1136: iconst_0       
        //  1137: iconst_3       
        //  1138: aconst_null    
        //  1139: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1142: checkcast       Lgg/essential/elementa/effects/Effect;
        //  1145: invokevirtual   gg/essential/elementa/components/UIContainer.enableEffect:(Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //  1148: pop            
        //  1149: aload_0         /* this */
        //  1150: invokespecial   gg/essential/gui/notification/NotificationContent.getLargePreviewContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1153: new             Lgg/essential/elementa/effects/ScissorEffect;
        //  1156: dup            
        //  1157: aconst_null    
        //  1158: iconst_0       
        //  1159: iconst_3       
        //  1160: aconst_null    
        //  1161: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1164: checkcast       Lgg/essential/elementa/effects/Effect;
        //  1167: invokevirtual   gg/essential/elementa/components/UIContainer.enableEffect:(Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //  1170: pop            
        //  1171: aload_0         /* this */
        //  1172: invokespecial   gg/essential/gui/notification/NotificationContent.getActionContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1175: new             Lgg/essential/elementa/effects/ScissorEffect;
        //  1178: dup            
        //  1179: aconst_null    
        //  1180: iconst_0       
        //  1181: iconst_3       
        //  1182: aconst_null    
        //  1183: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1186: checkcast       Lgg/essential/elementa/effects/Effect;
        //  1189: invokevirtual   gg/essential/elementa/components/UIContainer.enableEffect:(Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //  1192: pop            
        //  1193: aload_1         /* message */
        //  1194: checkcast       Ljava/lang/CharSequence;
        //  1197: invokeinterface java/lang/CharSequence.length:()I
        //  1202: ifne            1209
        //  1205: iconst_1       
        //  1206: goto            1210
        //  1209: iconst_0       
        //  1210: ifeq            1320
        //  1213: aload_2         /* title */
        //  1214: checkcast       Ljava/lang/CharSequence;
        //  1217: invokeinterface java/lang/CharSequence.length:()I
        //  1222: ifle            1229
        //  1225: iconst_1       
        //  1226: goto            1230
        //  1229: iconst_0       
        //  1230: ifeq            1320
        //  1233: aload_0         /* this */
        //  1234: aload_0         /* this */
        //  1235: invokespecial   gg/essential/gui/notification/NotificationContent.getTitle:()Lgg/essential/elementa/components/UIWrappedText;
        //  1238: checkcast       Lgg/essential/elementa/UIComponent;
        //  1241: invokevirtual   gg/essential/gui/notification/NotificationContent.removeChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1244: pop            
        //  1245: aload_0         /* this */
        //  1246: invokespecial   gg/essential/gui/notification/NotificationContent.getPreviewAndMessage:()Lgg/essential/elementa/components/UIContainer;
        //  1249: aload_0         /* this */
        //  1250: invokespecial   gg/essential/gui/notification/NotificationContent.getTitle:()Lgg/essential/elementa/components/UIWrappedText;
        //  1253: checkcast       Lgg/essential/elementa/UIComponent;
        //  1256: invokevirtual   gg/essential/elementa/components/UIContainer.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1259: pop            
        //  1260: aload_0         /* this */
        //  1261: invokespecial   gg/essential/gui/notification/NotificationContent.getTitle:()Lgg/essential/elementa/components/UIWrappedText;
        //  1264: checkcast       Lgg/essential/elementa/UIComponent;
        //  1267: astore          $this$constrain$iv
        //  1269: aload           $this$constrain$iv
        //  1271: astore          5
        //  1273: aload           5
        //  1275: astore          $this$constrain_u24lambda_u2d0$iv
        //  1277: aload           $this$constrain_u24lambda_u2d0$iv
        //  1279: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1282: astore          $this$_init__u24lambda_u2d10
        //  1284: aload           $this$_init__u24lambda_u2d10
        //  1286: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1289: dup            
        //  1290: ldc             5.0
        //  1292: iconst_0       
        //  1293: iconst_2       
        //  1294: aconst_null    
        //  1295: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1298: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1301: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1304: aload           $this$_init__u24lambda_u2d10
        //  1306: new             Lgg/essential/elementa/constraints/FillConstraint;
        //  1309: dup            
        //  1310: iconst_0       
        //  1311: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //  1314: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1317: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1320: return         
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  message      
        //  title        
        //  trimMessage  
        //    StackMapTable: 00 0A FF 00 87 00 04 07 00 02 07 00 8D 07 00 8D 01 00 05 07 00 02 07 00 5C 07 00 5C 08 00 73 08 00 73 FF 00 00 00 04 07 00 02 07 00 8D 07 00 8D 01 00 06 07 00 02 07 00 5C 07 00 5C 08 00 73 08 00 73 01 FF 02 A6 00 08 07 00 02 07 00 8D 07 00 8D 00 00 07 00 5C 00 07 00 72 00 00 FF 00 2A 00 03 07 00 02 07 00 8D 07 00 8D 00 04 07 00 5C 07 00 5C 08 03 46 08 03 46 FF 00 00 00 03 07 00 02 07 00 8D 07 00 8D 00 05 07 00 5C 07 00 5C 08 03 46 08 03 46 01 FF 01 5D 00 03 07 00 02 00 07 00 8D 00 00 40 01 F9 00 12 40 01 FA 00 59
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIWrappedText getTitle() {
        return (UIWrappedText)this.title$delegate.getValue((Object)this, (KProperty)NotificationContent.$$delegatedProperties[0]);
    }
    
    private final UIContainer getBody() {
        return (UIContainer)this.body$delegate.getValue((Object)this, (KProperty)NotificationContent.$$delegatedProperties[1]);
    }
    
    private final UIContainer getLeftBody() {
        return (UIContainer)this.leftBody$delegate.getValue((Object)this, (KProperty)NotificationContent.$$delegatedProperties[2]);
    }
    
    private final UIContainer getRightBody() {
        return (UIContainer)this.rightBody$delegate.getValue((Object)this, (KProperty)NotificationContent.$$delegatedProperties[3]);
    }
    
    private final UIContainer getPreviewAndMessage() {
        return (UIContainer)this.previewAndMessage$delegate.getValue((Object)this, (KProperty)NotificationContent.$$delegatedProperties[4]);
    }
    
    private final UIContainer getPreviewContainer() {
        return (UIContainer)this.previewContainer$delegate.getValue((Object)this, (KProperty)NotificationContent.$$delegatedProperties[5]);
    }
    
    private final UIContainer getLargePreviewContainer() {
        return (UIContainer)this.largePreviewContainer$delegate.getValue((Object)this, (KProperty)NotificationContent.$$delegatedProperties[7]);
    }
    
    private final UIContainer getActionContainer() {
        return (UIContainer)this.actionContainer$delegate.getValue((Object)this, (KProperty)NotificationContent.$$delegatedProperties[8]);
    }
    
    public final void applyBuilder(@NotNull final Notifications.NotificationBuilderImpl builder) {
        Intrinsics.checkNotNullParameter((Object)builder, "builder");
        final Iterable $this$forEach$iv = builder.getComponents().entrySet();
        for (final Object element$iv : $this$forEach$iv) {
            final Map.Entry it = (Map.Entry)element$iv;
            final UIComponent component = it.getValue();
            switch (NotificationContent.WhenMappings.$EnumSwitchMapping$0[it.getKey().ordinal()]) {
                case 1: {
                    this.getActionContainer().addChild(component);
                    this.getBody().addChild(this.getRightBody());
                    continue;
                }
                case 2: {
                    this.getPreviewContainer().addChild(component);
                    this.getPreviewAndMessage().insertChildAt(this.getPreviewContainer(), 0);
                    continue;
                }
                case 3: {
                    this.getLargePreviewContainer().addChild(component);
                    this.getLeftBody().addChild(this.getLargePreviewContainer());
                    continue;
                }
            }
        }
        if (!this.getPreviewAndMessage().getChildren().isEmpty()) {
            this.getLeftBody().insertChildAt(this.getPreviewAndMessage(), 0);
        }
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NotificationContent.class, "title", "getTitle()Lgg/essential/elementa/components/UIWrappedText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NotificationContent.class, "body", "getBody()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NotificationContent.class, "leftBody", "getLeftBody()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NotificationContent.class, "rightBody", "getRightBody()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NotificationContent.class, "previewAndMessage", "getPreviewAndMessage()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NotificationContent.class, "previewContainer", "getPreviewContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NotificationContent.class, "message", "getMessage()Lgg/essential/elementa/components/UIWrappedText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NotificationContent.class, "largePreviewContainer", "getLargePreviewContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NotificationContent.class, "actionContainer", "getActionContainer()Lgg/essential/elementa/components/UIContainer;", 0)) };
    }
}
