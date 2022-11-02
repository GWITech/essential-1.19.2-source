package gg.essential.gui.notification;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import gg.essential.elementa.components.*;
import kotlin.properties.*;
import java.util.concurrent.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.animation.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.dsl.*;
import gg.essential.gui.common.*;
import kotlin.jvm.functions.*;
import gg.essential.api.utils.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000X
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\f\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020	\u0012\u000e\b\u0002\u0010
                                                   \u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\u000e\u0010\u000f\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\u0002\u0010\u0012J\b\u0010*\u001a\u00020\fH\u0002J\u0006\u0010+\u001a\u00020\fJ\b\u0010,\u001a\u00020\fH\u0002J\b\u0010-\u001a\u00020\fH\u0002J\b\u0010.\u001a\u00020\fH\u0002J\b\u0010/\u001a\u00020\fH\u0014J\b\u00100\u001a\u00020\u0007H\u0016J\b\u00101\u001a\u00020\fH\u0002J\b\u00102\u001a\u00020\fH\u0014R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u001a\u001a\u00020	X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020	0\u001cX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0011\u0010\b\u001a\u00020	¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0017\u0010
                                                   \u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b
                                                   \u0000\u001a\u0004\b!\u0010"R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b
                                                   \u0000\u001a\u0004\b#\u0010"R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b(\u0010)¨\u00063""" }, d2 = { "Lgg/essential/gui/notification/Notification;", "Lgg/essential/gui/common/HighlightedBlock;", "text", "", "title", "timerEnabled", "Lgg/essential/elementa/state/State;", "", "duration", "", "onClick", "Lkotlin/Function0;", "", "onClosed", "trimMessage", "dismissNotification", "Ljava/util/concurrent/CompletableFuture;", "Ljava/lang/Void;", "(Ljava/lang/String;Ljava/lang/String;Lgg/essential/elementa/state/State;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/util/concurrent/CompletableFuture;)V", "content", "Lgg/essential/gui/notification/NotificationContent;", "getContent", "()Lgg/essential/gui/notification/NotificationContent;", "content$delegate", "Lkotlin/properties/ReadWriteProperty;", "couldBeAClick", "dragStart", "draggedPixels", "Lgg/essential/elementa/state/BasicState;", "dragging", "getDuration", "()F", "hovered", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getOnClosed", "timer", "Lgg/essential/elementa/components/UIBlock;", "timerAnimation", "Lgg/essential/elementa/constraints/animation/AnimatingConstraints;", "getTrimMessage", "()Z", "animateCompleteTimerNow", "animateIn", "animateOut", "animateOutFast", "animateTimer", "highlight", "isHovered", "springBack", "unhighlight", "essential" })
public final class Notification extends HighlightedBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final State<Boolean> timerEnabled;
    private final float duration;
    @NotNull
    private final Function0<Unit> onClick;
    @NotNull
    private final Function0<Unit> onClosed;
    private final boolean trimMessage;
    @NotNull
    private final State<Boolean> hovered;
    @NotNull
    private final UIBlock timer;
    @NotNull
    private final AnimatingConstraints timerAnimation;
    private boolean dragging;
    private float dragStart;
    @NotNull
    private BasicState<Float> draggedPixels;
    private boolean couldBeAClick;
    @NotNull
    private final ReadWriteProperty content$delegate;
    
    public Notification(@NotNull final String text, @NotNull final String title, @NotNull final State<Boolean> timerEnabled, final float duration, @NotNull final Function0<Unit> onClick, @NotNull final Function0<Unit> onClosed, final boolean trimMessage, @NotNull final CompletableFuture<Void> dismissNotification) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "text"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* title */
        //     7: ldc             "title"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* timerEnabled */
        //    13: ldc             "timerEnabled"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload           onClick
        //    20: ldc             "onClick"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: aload           onClosed
        //    27: ldc             "onClosed"
        //    29: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    32: aload           dismissNotification
        //    34: ldc             "dismissNotification"
        //    36: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    39: aload_0         /* this */
        //    40: getstatic       gg/essential/gui/EssentialPalette.TOAST_BACKGROUND:Ljava/awt/Color;
        //    43: getstatic       gg/essential/gui/EssentialPalette.TOAST_BORDER:Ljava/awt/Color;
        //    46: aconst_null    
        //    47: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //    50: fconst_0       
        //    51: getstatic       gg/essential/gui/common/HighlightedBlock$ClickBehavior.STAY_HIGHLIGHTED:Lgg/essential/gui/common/HighlightedBlock$ClickBehavior;
        //    54: bipush          52
        //    56: invokespecial   gg/essential/gui/common/HighlightedBlock.<init>:(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;FLgg/essential/gui/common/HighlightedBlock$ClickBehavior;I)V
        //    59: aload_0         /* this */
        //    60: aload_3         /* timerEnabled */
        //    61: putfield        gg/essential/gui/notification/Notification.timerEnabled:Lgg/essential/elementa/state/State;
        //    64: aload_0         /* this */
        //    65: fload           duration
        //    67: putfield        gg/essential/gui/notification/Notification.duration:F
        //    70: aload_0         /* this */
        //    71: aload           onClick
        //    73: putfield        gg/essential/gui/notification/Notification.onClick:Lkotlin/jvm/functions/Function0;
        //    76: aload_0         /* this */
        //    77: aload           onClosed
        //    79: putfield        gg/essential/gui/notification/Notification.onClosed:Lkotlin/jvm/functions/Function0;
        //    82: aload_0         /* this */
        //    83: iload           trimMessage
        //    85: putfield        gg/essential/gui/notification/Notification.trimMessage:Z
        //    88: aload_0         /* this */
        //    89: aload_0         /* this */
        //    90: checkcast       Lgg/essential/elementa/UIComponent;
        //    93: iconst_0       
        //    94: iconst_0       
        //    95: iconst_3       
        //    96: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //    99: putfield        gg/essential/gui/notification/Notification.hovered:Lgg/essential/elementa/state/State;
        //   102: aload_0         /* this */
        //   103: new             Lgg/essential/elementa/components/UIBlock;
        //   106: dup            
        //   107: aload_0         /* this */
        //   108: getfield        gg/essential/gui/notification/Notification.hovered:Lgg/essential/elementa/state/State;
        //   111: getstatic       gg/essential/gui/notification/Notification$timer$1.INSTANCE:Lgg/essential/gui/notification/Notification$timer$1;
        //   114: checkcast       Lkotlin/jvm/functions/Function1;
        //   117: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   120: checkcast       Lgg/essential/elementa/state/State;
        //   123: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   126: checkcast       Lgg/essential/elementa/UIComponent;
        //   129: astore          $this$constrain$iv
        //   131: aload           $this$constrain$iv
        //   133: astore          10
        //   135: aload           10
        //   137: astore          $this$constrain_u24lambda_u2d0$iv
        //   139: aload           $this$constrain_u24lambda_u2d0$iv
        //   141: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   144: astore          12
        //   146: astore          13
        //   148: aload           $this$timer_u24lambda_u2d0
        //   150: iconst_0       
        //   151: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   154: checkcast       Ljava/lang/Number;
        //   157: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   160: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   163: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   166: aload           $this$timer_u24lambda_u2d0
        //   168: iconst_0       
        //   169: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   172: checkcast       Ljava/lang/Number;
        //   175: iconst_1       
        //   176: iconst_0       
        //   177: iconst_2       
        //   178: aconst_null    
        //   179: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   182: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   185: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   188: aload           $this$timer_u24lambda_u2d0
        //   190: iconst_0       
        //   191: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   194: checkcast       Ljava/lang/Number;
        //   197: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   200: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   203: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   206: aload           $this$timer_u24lambda_u2d0
        //   208: iconst_3       
        //   209: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   212: checkcast       Ljava/lang/Number;
        //   215: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   218: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   221: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   224: aload           13
        //   226: aload           10
        //   228: checkcast       Lgg/essential/elementa/components/UIBlock;
        //   231: putfield        gg/essential/gui/notification/Notification.timer:Lgg/essential/elementa/components/UIBlock;
        //   234: aload_0         /* this */
        //   235: aload_0         /* this */
        //   236: getfield        gg/essential/gui/notification/Notification.timer:Lgg/essential/elementa/components/UIBlock;
        //   239: invokevirtual   gg/essential/elementa/components/UIBlock.makeAnimation:()Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
        //   242: putfield        gg/essential/gui/notification/Notification.timerAnimation:Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
        //   245: aload_0         /* this */
        //   246: new             Lgg/essential/elementa/state/BasicState;
        //   249: dup            
        //   250: fconst_0       
        //   251: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   254: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   257: putfield        gg/essential/gui/notification/Notification.draggedPixels:Lgg/essential/elementa/state/BasicState;
        //   260: aload_0         /* this */
        //   261: iconst_1       
        //   262: putfield        gg/essential/gui/notification/Notification.couldBeAClick:Z
        //   265: aload_0         /* this */
        //   266: new             Lgg/essential/gui/notification/NotificationContent;
        //   269: dup            
        //   270: aload_1         /* text */
        //   271: aload_2         /* title */
        //   272: aload_0         /* this */
        //   273: getfield        gg/essential/gui/notification/Notification.trimMessage:Z
        //   276: invokespecial   gg/essential/gui/notification/NotificationContent.<init>:(Ljava/lang/String;Ljava/lang/String;Z)V
        //   279: checkcast       Lgg/essential/elementa/UIComponent;
        //   282: astore          $this$constrain$iv
        //   284: aload           $this$constrain$iv
        //   286: astore          10
        //   288: aload           10
        //   290: astore          $this$constrain_u24lambda_u2d0$iv
        //   292: aload           $this$constrain_u24lambda_u2d0$iv
        //   294: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   297: astore          12
        //   299: astore          13
        //   301: aload           $this$content_delegate_u24lambda_u2d1
        //   303: iconst_5       
        //   304: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   307: checkcast       Ljava/lang/Number;
        //   310: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   313: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   316: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   319: aload           $this$content_delegate_u24lambda_u2d1
        //   321: iconst_5       
        //   322: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   325: checkcast       Ljava/lang/Number;
        //   328: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   331: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   334: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   337: aload           $this$content_delegate_u24lambda_u2d1
        //   339: bipush          100
        //   341: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   344: checkcast       Ljava/lang/Number;
        //   347: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   350: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   353: bipush          10
        //   355: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   358: checkcast       Ljava/lang/Number;
        //   361: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   364: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   367: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   370: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   373: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   376: aload           $this$content_delegate_u24lambda_u2d1
        //   378: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   381: dup            
        //   382: fconst_0       
        //   383: iconst_1       
        //   384: aconst_null    
        //   385: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   388: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   391: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   394: aload           13
        //   396: aload           10
        //   398: aload_0         /* this */
        //   399: invokevirtual   gg/essential/gui/notification/Notification.getContentContainer:()Lgg/essential/elementa/UIComponent;
        //   402: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   405: aload_0         /* this */
        //   406: getstatic       gg/essential/gui/notification/Notification.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   409: iconst_0       
        //   410: aaload         
        //   411: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   414: putfield        gg/essential/gui/notification/Notification.content$delegate:Lkotlin/properties/ReadWriteProperty;
        //   417: aload_0         /* this */
        //   418: checkcast       Lgg/essential/elementa/UIComponent;
        //   421: astore          $this$constrain$iv
        //   423: aload           $this$constrain$iv
        //   425: astore          10
        //   427: aload           10
        //   429: astore          $this$constrain_u24lambda_u2d0$iv
        //   431: aload           $this$constrain_u24lambda_u2d0$iv
        //   433: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   436: astore          $this$_init__u24lambda_u2d2
        //   438: aload           $this$_init__u24lambda_u2d2
        //   440: iconst_0       
        //   441: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   444: checkcast       Ljava/lang/Number;
        //   447: iconst_1       
        //   448: iconst_1       
        //   449: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
        //   452: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   455: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   458: aload           $this$_init__u24lambda_u2d2
        //   460: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   463: dup            
        //   464: fconst_0       
        //   465: iconst_1       
        //   466: iconst_1       
        //   467: aconst_null    
        //   468: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   471: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   474: iconst_5       
        //   475: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   478: checkcast       Ljava/lang/Number;
        //   481: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   484: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   487: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   490: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   493: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   496: aload           $this$_init__u24lambda_u2d2
        //   498: sipush          170
        //   501: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   504: checkcast       Ljava/lang/Number;
        //   507: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   510: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   513: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   516: aload           $this$_init__u24lambda_u2d2
        //   518: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   521: dup            
        //   522: fconst_0       
        //   523: iconst_1       
        //   524: aconst_null    
        //   525: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   528: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   531: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   534: aload_0         /* this */
        //   535: invokevirtual   gg/essential/gui/notification/Notification.getParentContainer:()Lgg/essential/elementa/UIComponent;
        //   538: astore          $this$constrain$iv
        //   540: aload           $this$constrain$iv
        //   542: astore          10
        //   544: aload           10
        //   546: astore          $this$constrain_u24lambda_u2d0$iv
        //   548: aload           $this$constrain_u24lambda_u2d0$iv
        //   550: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   553: astore          $this$_init__u24lambda_u2d3
        //   555: aload           $this$_init__u24lambda_u2d3
        //   557: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //   560: dup            
        //   561: fconst_0       
        //   562: iconst_1       
        //   563: aconst_null    
        //   564: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   567: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   570: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   573: aload           $this$_init__u24lambda_u2d3
        //   575: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   578: dup            
        //   579: fconst_0       
        //   580: iconst_1       
        //   581: aconst_null    
        //   582: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   585: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   588: iconst_2       
        //   589: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   592: checkcast       Ljava/lang/Number;
        //   595: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   598: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   601: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   604: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   607: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   610: aload_0         /* this */
        //   611: invokevirtual   gg/essential/gui/notification/Notification.getContentContainer:()Lgg/essential/elementa/UIComponent;
        //   614: astore          $this$constrain$iv
        //   616: aload           $this$constrain$iv
        //   618: astore          10
        //   620: aload           10
        //   622: astore          $this$constrain_u24lambda_u2d0$iv
        //   624: aload           $this$constrain_u24lambda_u2d0$iv
        //   626: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   629: astore          $this$_init__u24lambda_u2d4
        //   631: aload           $this$_init__u24lambda_u2d4
        //   633: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   636: dup            
        //   637: fconst_0       
        //   638: iconst_1       
        //   639: aconst_null    
        //   640: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   643: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   646: bipush          8
        //   648: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   651: checkcast       Ljava/lang/Number;
        //   654: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   657: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   660: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   663: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   666: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   669: aload_0         /* this */
        //   670: getfield        gg/essential/gui/notification/Notification.timer:Lgg/essential/elementa/components/UIBlock;
        //   673: checkcast       Lgg/essential/elementa/UIComponent;
        //   676: aload_0         /* this */
        //   677: invokevirtual   gg/essential/gui/notification/Notification.getContentContainer:()Lgg/essential/elementa/UIComponent;
        //   680: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   683: pop            
        //   684: aload_0         /* this */
        //   685: checkcast       Lgg/essential/elementa/UIComponent;
        //   688: astore          $this$onLeftClick$iv
        //   690: aload           $this$onLeftClick$iv
        //   692: new             Lgg/essential/gui/notification/Notification$special$$inlined$onLeftClick$1;
        //   695: dup            
        //   696: aload_0         /* this */
        //   697: invokespecial   gg/essential/gui/notification/Notification$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/notification/Notification;)V
        //   700: checkcast       Lkotlin/jvm/functions/Function2;
        //   703: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   706: pop            
        //   707: aload_0         /* this */
        //   708: new             Lgg/essential/gui/notification/Notification$7;
        //   711: dup            
        //   712: aload_0         /* this */
        //   713: invokespecial   gg/essential/gui/notification/Notification$7.<init>:(Lgg/essential/gui/notification/Notification;)V
        //   716: checkcast       Lkotlin/jvm/functions/Function1;
        //   719: invokevirtual   gg/essential/gui/notification/Notification.onMouseRelease:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   722: pop            
        //   723: aload_0         /* this */
        //   724: new             Lgg/essential/gui/notification/Notification$8;
        //   727: dup            
        //   728: aload_0         /* this */
        //   729: invokespecial   gg/essential/gui/notification/Notification$8.<init>:(Lgg/essential/gui/notification/Notification;)V
        //   732: checkcast       Lkotlin/jvm/functions/Function4;
        //   735: invokevirtual   gg/essential/gui/notification/Notification.onMouseDrag:(Lkotlin/jvm/functions/Function4;)Lgg/essential/elementa/UIComponent;
        //   738: pop            
        //   739: aload           dismissNotification
        //   741: new             Lgg/essential/gui/notification/Notification$9;
        //   744: dup            
        //   745: aload_0         /* this */
        //   746: invokespecial   gg/essential/gui/notification/Notification$9.<init>:(Lgg/essential/gui/notification/Notification;)V
        //   749: checkcast       Lkotlin/jvm/functions/Function1;
        //   752: invokestatic    gg/essential/util/ExtensionsKt.thenAcceptOnMainThread:(Ljava/util/concurrent/CompletableFuture;Lkotlin/jvm/functions/Function1;)Ljava/util/concurrent/CompletableFuture;
        //   755: pop            
        //   756: return         
        //    Signature:
        //  (Ljava/lang/String;Ljava/lang/String;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;FLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;ZLjava/util/concurrent/CompletableFuture<Ljava/lang/Void;>;)V
        //    MethodParameters:
        //  Name                 Flags  
        //  -------------------  -----
        //  text                 
        //  title                
        //  timerEnabled         
        //  duration             
        //  onClick              
        //  onClosed             
        //  trimMessage          
        //  dismissNotification  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }
    
    @NotNull
    public final Function0<Unit> getOnClosed() {
        return this.onClosed;
    }
    
    @NotNull
    public final NotificationContent getContent() {
        return (NotificationContent)this.content$delegate.getValue((Object)this, (KProperty)Notification.$$delegatedProperties[0]);
    }
    
    private final void animateCompleteTimerNow() {
        final WidthConstraint width = this.timerAnimation.getWidth();
        final AnimationComponent animationComponent = (width instanceof AnimationComponent) ? width : null;
        if (animationComponent == null) {
            return;
        }
        final AnimationComponent widthAnim = animationComponent;
        final float percentComplete = widthAnim.getPercentComplete();
        this.timer.setWidth(new RelativeConstraint(percentComplete));
        widthAnim.stopIfSupported();
        final UIComponent $this$animate_u24lambda_u2d0$iv;
        final UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this.timer;
        final AnimatingConstraints $this$animateCompleteTimerNow_u24lambda_u2d6;
        final AnimatingConstraints anim$iv = $this$animateCompleteTimerNow_u24lambda_u2d6 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        AnimatingConstraints.setWidthAnimation$default($this$animateCompleteTimerNow_u24lambda_u2d6, Animations.OUT_EXP, (1.0f - percentComplete) * 1.25f, new RelativeConstraint(0.0f, 1, null), 0.0f, 8, null);
        $this$animateCompleteTimerNow_u24lambda_u2d6.onComplete((Function0<Unit>)new Notification$animateCompleteTimerNow$1.Notification$animateCompleteTimerNow$1$1(this));
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    @Override
    protected void highlight() {
        if (this.getClicked()) {
            return;
        }
        super.highlight();
    }
    
    @Override
    protected void unhighlight() {
        if (this.getClicked()) {
            return;
        }
        super.unhighlight();
    }
    
    public final void animateIn() {
        final UIComponent $this$animate_u24lambda_u2d0$iv;
        final UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this;
        final AnimatingConstraints $this$animateIn_u24lambda_u2d7;
        final AnimatingConstraints anim$iv = $this$animateIn_u24lambda_u2d7 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        AnimatingConstraints.setXAnimation$default($this$animateIn_u24lambda_u2d7, Animations.OUT_EXP, 0.5f, ConstraintsKt.plus(UtilitiesKt.pixels$default(2, true, false, 2, null), ExtensionsKt.pixels$default(this.draggedPixels, false, false, 3, null)), 0.0f, 8, null);
        $this$animateIn_u24lambda_u2d7.onComplete((Function0<Unit>)new Notification$animateIn$1.Notification$animateIn$1$1(this));
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    private final void animateTimer() {
        this.timerAnimation.setWidthAnimation(Animations.LINEAR, this.duration, new RelativeConstraint(0.0f, 1, null), 0.5f).begin().onComplete((Function0<Unit>)new Notification$animateTimer.Notification$animateTimer$1(this));
        StateExtensionsKt.onSetValueAndNow((State<Object>)StateExtensionsKt.and(this.timerEnabled, (State<Boolean>)StateExtensionsKt.not(gg.essential.util.ExtensionsKt.hoveredState$default$56721d26(this, false, false, 3))), (kotlin.jvm.functions.Function1<? super Object, Unit>)new Notification$animateTimer.Notification$animateTimer$2(this));
    }
    
    private final void animateOut() {
        final UIComponent $this$animate_u24lambda_u2d0$iv;
        final UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this;
        final AnimatingConstraints $this$animateOut_u24lambda_u2d8;
        final AnimatingConstraints anim$iv = $this$animateOut_u24lambda_u2d8 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        $this$animateOut_u24lambda_u2d8.setXAnimation(Animations.IN_EXP, 0.5f, UtilitiesKt.pixels(0, true, true), 0.5f);
        $this$animateOut_u24lambda_u2d8.onComplete((Function0<Unit>)new Notification$animateOut$1.Notification$animateOut$1$1(this));
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    private final void animateOutFast() {
        final UIComponent $this$animate_u24lambda_u2d0$iv;
        final UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this;
        final AnimatingConstraints $this$animateOutFast_u24lambda_u2d9;
        final AnimatingConstraints anim$iv = $this$animateOutFast_u24lambda_u2d9 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        AnimatingConstraints.setXAnimation$default($this$animateOutFast_u24lambda_u2d9, Animations.OUT_EXP, 0.5f, UtilitiesKt.pixels(0, true, true), 0.0f, 8, null);
        $this$animateOutFast_u24lambda_u2d9.onComplete((Function0<Unit>)new Notification$animateOutFast$1.Notification$animateOutFast$1$1(this));
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    private final void springBack() {
        final UIComponent $this$animate_u24lambda_u2d0$iv;
        final UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this;
        final AnimatingConstraints $this$springBack_u24lambda_u2d10;
        final AnimatingConstraints anim$iv = $this$springBack_u24lambda_u2d10 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        AnimatingConstraints.setXAnimation$default($this$springBack_u24lambda_u2d10, Animations.OUT_EXP, 0.5f, UtilitiesKt.pixels$default(2, true, false, 2, null), 0.0f, 8, null);
        $this$springBack_u24lambda_u2d10.onComplete((Function0<Unit>)new Notification$springBack$1.Notification$springBack$1$1(this));
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    @Override
    public boolean isHovered() {
        return GuiUtil.Companion.getOpenedScreen() != null && super.isHovered();
    }
    
    public static final /* synthetic */ void access$animateOut(final Notification $this) {
        $this.animateOut();
    }
    
    public static final /* synthetic */ AnimatingConstraints access$getTimerAnimation$p(final Notification $this) {
        return $this.timerAnimation;
    }
    
    public static final /* synthetic */ void access$setDragging$p(final Notification $this, final boolean <set-?>) {
        $this.dragging = <set-?>;
    }
    
    public static final /* synthetic */ Function1 access$getClickAction(final Notification $this) {
        return $this.getClickAction();
    }
    
    public static final /* synthetic */ void access$setDragStart$p(final Notification $this, final float <set-?>) {
        $this.dragStart = <set-?>;
    }
    
    public static final /* synthetic */ void access$setCouldBeAClick$p(final Notification $this, final boolean <set-?>) {
        $this.couldBeAClick = <set-?>;
    }
    
    public static final /* synthetic */ void access$setClicked(final Notification $this, final boolean <set-?>) {
        $this.setClicked(<set-?>);
    }
    
    public static final /* synthetic */ void access$animateTimer(final Notification $this) {
        $this.animateTimer();
    }
    
    public static final /* synthetic */ BasicState access$getDraggedPixels$p(final Notification $this) {
        return $this.draggedPixels;
    }
    
    public static final /* synthetic */ boolean access$getDragging$p(final Notification $this) {
        return $this.dragging;
    }
    
    public static final /* synthetic */ boolean access$getCouldBeAClick$p(final Notification $this) {
        return $this.couldBeAClick;
    }
    
    public static final /* synthetic */ void access$animateCompleteTimerNow(final Notification $this) {
        $this.animateCompleteTimerNow();
    }
    
    public static final /* synthetic */ void access$springBack(final Notification $this) {
        $this.springBack();
    }
    
    public static final /* synthetic */ void access$animateOutFast(final Notification $this) {
        $this.animateOutFast();
    }
    
    public static final /* synthetic */ float access$getDragStart$p(final Notification $this) {
        return $this.dragStart;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Notification.class, "content", "getContent()Lgg/essential/gui/notification/NotificationContent;", 0)) };
    }
}
