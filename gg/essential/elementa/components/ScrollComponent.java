package gg.essential.elementa.components;

import java.awt.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.animation.*;
import kotlin.ranges.*;
import gg.essential.elementa.events.*;
import kotlin.comparisons.*;
import kotlin.collections.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.utils.*;
import kotlin.*;
import gg.essential.elementa.*;
import gg.essential.universal.*;
import java.util.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u008b\u00012\u00020\u0001:\u0006\u008b\u0001\u008c\u0001\u008d\u0001Bm\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u0010\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0010H\u0016JF\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020\t26\u0010B\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(F\u0012\u0004\u0012\u00020,0+J\b\u0010G\u001a\u00020,H\u0016J\b\u0010H\u001a\u00020\tH\u0016J\b\u0010I\u001a\u00020,H\u0016J\b\u0010J\u001a\u00020\u0005H\u0002J\b\u0010K\u001a\u00020\u0005H\u0002J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00050M2\u0006\u0010A\u001a\u00020\tH\u0002J\"\u0010N\u001a\b\u0012\u0004\u0012\u0002HP0O\"\u0004\b\u0000\u0010P2\f\u0010Q\u001a\b\u0012\u0004\u0012\u0002HP0RH\u0016J\b\u0010S\u001a\u00020\u0000H\u0016J\u0010\u0010T\u001a\u00020,2\u0006\u0010U\u001a\u00020VH\u0016J)\u0010W\u001a\u00020,2!\u0010X\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\t0YJ\u0018\u0010Z\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020\u0005H\u0016J\u0018\u0010]\u001a\u00020\u00002\u0006\u0010^\u001a\u00020\u00102\u0006\u0010_\u001a\u00020\u0010H\u0016J\u0018\u0010`\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00102\u0006\u0010a\u001a\u00020\u0018H\u0016J\u0018\u0010b\u001a\u00020\u00002\u0006\u0010^\u001a\u00020\u00102\u0006\u0010_\u001a\u00020\u0010H\u0016J \u0010c\u001a\u00020,2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020\u0018H\u0016J \u0010h\u001a\u00020,2\u0006\u0010d\u001a\u00020\u00052\u0006\u0010f\u001a\u00020\u00052\u0006\u0010i\u001a\u00020\u0018H\u0002J\u0018\u0010j\u001a\u00020,2\u0006\u0010k\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\tH\u0002J\u0010\u0010l\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0010H\u0016J\u0018\u0010m\u001a\u00020\u00002\u0006\u0010^\u001a\u00020\u00102\u0006\u0010n\u001a\u00020\u0010H\u0016J$\u0010o\u001a\u00020,2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u00020\u00052\b\b\u0002\u0010p\u001a\u00020\tJ\u0010\u0010q\u001a\u00020,2\b\b\u0002\u0010p\u001a\u00020\tJ\u0010\u0010r\u001a\u00020,2\b\b\u0002\u0010p\u001a\u00020\tJ\u0010\u0010s\u001a\u00020,2\b\b\u0002\u0010p\u001a\u00020\tJ\u0010\u0010t\u001a\u00020,2\b\b\u0002\u0010p\u001a\u00020\tJ(\u0010u\u001a\u00020,2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00100O2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180YJ\u0014\u0010x\u001a\u00020\u00002\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00100OJ\u000e\u0010y\u001a\u00020,2\u0006\u0010z\u001a\u00020\u0003J\u001a\u0010{\u001a\u00020,2\u0006\u0010?\u001a\u00020\u00102\b\b\u0002\u0010|\u001a\u00020\tH\u0007J\u001e\u0010}\u001a\u00020,2\u0006\u0010?\u001a\u00020\u00102\u0006\u0010|\u001a\u00020\t2\u0006\u0010A\u001a\u00020\tJ\u001a\u0010~\u001a\u00020,2\u0006\u0010?\u001a\u00020\u00102\b\b\u0002\u0010|\u001a\u00020\tH\u0007J9\u0010\u007f\u001a\u00020,\"\u000f\b\u0000\u0010P*\t\u0012\u0004\u0012\u0002HP0\u0080\u00012\t\b\u0002\u0010\u0081\u0001\u001a\u00020\t2\u0013\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002HP0YH\u0007J!\u0010\u007f\u001a\u00020,2\u0019\u0010\u0082\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00100\u0083\u0001j\t\u0012\u0004\u0012\u00020\u0010`\u0084\u0001J\"\u0010\u0085\u0001\u001a\u00020,2\u0006\u0010?\u001a\u00020\u00102\u0007\u0010\u0086\u0001\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\tH\u0002J!\u0010\u0087\u0001\u001a\u00020,2\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\tH\u0002J\u001d\u0010\u0088\u0001\u001a\u00020\u0005*\u00020\u00052\r\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050MH\u0082\u0002J\u0013\u0010\u008a\u0001\u001a\u00020e*\b\u0012\u0004\u0012\u00020e0MH\u0002J\u0013\u0010\u008a\u0001\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050MH\u0002R\u000e\u0010\u0012\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b(\u0010&R&\u0010)\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020,0+0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00108\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0011\u0010:\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b;\u0010&R&\u0010<\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020,0+0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u008e\u0001" }, d2 = { "Lgg/essential/elementa/components/ScrollComponent;", "Lgg/essential/elementa/components/UIContainer;", "emptyString", "", "innerPadding", "", "scrollIconColor", "Ljava/awt/Color;", "horizontalScrollEnabled", "", "verticalScrollEnabled", "horizontalScrollOpposite", "verticalScrollOpposite", "pixelsPerScroll", "scrollAcceleration", "customScissorBoundingBox", "Lgg/essential/elementa/UIComponent;", "(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;)V", "actualHolder", "allChildren", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getAllChildren", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "animationFPS", "", "Ljava/lang/Integer;", "autoScrollBegin", "Lkotlin/Pair;", "currentScrollAcceleration", "emptyText", "Lgg/essential/elementa/components/UIWrappedText;", "getEmptyText", "()Lgg/essential/elementa/components/UIWrappedText;", "horizontalDragBeginPos", "horizontalHideScrollWhenUseless", "<set-?>", "horizontalOffset", "getHorizontalOffset", "()F", "horizontalOverhang", "getHorizontalOverhang", "horizontalScrollAdjustEvents", "", "Lkotlin/Function2;", "", "horizontalScrollBarGrip", "isAutoScrolling", "lastActualHeight", "lastActualWidth", "lastHeight", "lastWidth", "needsUpdate", "scrollIconComponent", "Lgg/essential/elementa/components/UIImage;", "verticalDragBeginPos", "verticalHideScrollWhenUseless", "verticalOffset", "getVerticalOffset", "verticalOverhang", "getVerticalOverhang", "verticalScrollAdjustEvents", "verticalScrollBarGrip", "addChild", "component", "addScrollAdjustEvent", "isHorizontal", "event", "Lkotlin/ParameterName;", "name", "scrollPercentage", "percentageOfParent", "afterInitialization", "alwaysDrawChildren", "animationFrame", "calculateActualHeight", "calculateActualWidth", "calculateOffsetRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "childrenOfType", "", "T", "clazz", "Ljava/lang/Class;", "clearChildren", "draw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "filterChildren", "filter", "Lkotlin/Function1;", "hitTest", "x", "y", "insertChildAfter", "newComponent", "targetComponent", "insertChildAt", "index", "insertChildBefore", "mouseClick", "mouseX", "", "mouseY", "button", "onClick", "mouseButton", "onScroll", "delta", "removeChild", "replaceChild", "componentToReplace", "scrollTo", "smoothScroll", "scrollToBottom", "scrollToLeft", "scrollToRight", "scrollToTop", "searchAndInsert", "components", "comparison", "setChildren", "setEmptyText", "text", "setHorizontalScrollBarComponent", "hideWhenUseless", "setScrollBarComponent", "setVerticalScrollBarComponent", "sortChildren", "", "descending", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "updateGrip", "mouseCoord", "updateScrollBar", "div", "range", "width", "Companion", "DefaultScrollBar", "ScrollChildConstraint", "Elementa" })
public final class ScrollComponent extends UIContainer
{
    @NotNull
    public static final Companion Companion;
    private final float innerPadding;
    @NotNull
    private final Color scrollIconColor;
    private final boolean horizontalScrollEnabled;
    private final boolean verticalScrollEnabled;
    private final boolean horizontalScrollOpposite;
    private final boolean verticalScrollOpposite;
    private final float pixelsPerScroll;
    private final float scrollAcceleration;
    @Nullable
    private Integer animationFPS;
    @NotNull
    private final UIContainer actualHolder;
    @NotNull
    private final UIWrappedText emptyText;
    @NotNull
    private final UIImage scrollIconComponent;
    private float horizontalOffset;
    private float verticalOffset;
    @Nullable
    private UIComponent horizontalScrollBarGrip;
    private boolean horizontalHideScrollWhenUseless;
    @Nullable
    private UIComponent verticalScrollBarGrip;
    private boolean verticalHideScrollWhenUseless;
    private float horizontalDragBeginPos;
    private float verticalDragBeginPos;
    @NotNull
    private final List<Function2<Float, Float, Unit>> horizontalScrollAdjustEvents;
    @NotNull
    private final List<Function2<Float, Float, Unit>> verticalScrollAdjustEvents;
    private boolean needsUpdate;
    private boolean isAutoScrolling;
    @NotNull
    private Pair<Float, Float> autoScrollBegin;
    private float currentScrollAcceleration;
    @NotNull
    private final CopyOnWriteArrayList<UIComponent> allChildren;
    private float lastWidth;
    private float lastHeight;
    private float lastActualWidth;
    private float lastActualHeight;
    
    @JvmOverloads
    public ScrollComponent(@NotNull final String emptyString, final float innerPadding, @NotNull final Color scrollIconColor, final boolean horizontalScrollEnabled, final boolean verticalScrollEnabled, final boolean horizontalScrollOpposite, final boolean verticalScrollOpposite, final float pixelsPerScroll, final float scrollAcceleration, @Nullable final UIComponent customScissorBoundingBox) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "emptyString"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_3         /* scrollIconColor */
        //     7: ldc             "scrollIconColor"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    16: aload_0         /* this */
        //    17: fload_2         /* innerPadding */
        //    18: putfield        gg/essential/elementa/components/ScrollComponent.innerPadding:F
        //    21: aload_0         /* this */
        //    22: aload_3         /* scrollIconColor */
        //    23: putfield        gg/essential/elementa/components/ScrollComponent.scrollIconColor:Ljava/awt/Color;
        //    26: aload_0         /* this */
        //    27: iload           horizontalScrollEnabled
        //    29: putfield        gg/essential/elementa/components/ScrollComponent.horizontalScrollEnabled:Z
        //    32: aload_0         /* this */
        //    33: iload           verticalScrollEnabled
        //    35: putfield        gg/essential/elementa/components/ScrollComponent.verticalScrollEnabled:Z
        //    38: aload_0         /* this */
        //    39: iload           horizontalScrollOpposite
        //    41: putfield        gg/essential/elementa/components/ScrollComponent.horizontalScrollOpposite:Z
        //    44: aload_0         /* this */
        //    45: iload           verticalScrollOpposite
        //    47: putfield        gg/essential/elementa/components/ScrollComponent.verticalScrollOpposite:Z
        //    50: aload_0         /* this */
        //    51: fload           pixelsPerScroll
        //    53: putfield        gg/essential/elementa/components/ScrollComponent.pixelsPerScroll:F
        //    56: aload_0         /* this */
        //    57: fload           scrollAcceleration
        //    59: putfield        gg/essential/elementa/components/ScrollComponent.scrollAcceleration:F
        //    62: aload_0         /* this */
        //    63: new             Lgg/essential/elementa/components/UIContainer;
        //    66: dup            
        //    67: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    70: checkcast       Lgg/essential/elementa/UIComponent;
        //    73: astore          $this$constrain$iv
        //    75: iconst_0       
        //    76: istore          $i$f$constrain
        //    78: aload           $this$constrain$iv
        //    80: astore          13
        //    82: aload           13
        //    84: astore          $this$constrain_u24lambda_u2d0$iv
        //    86: iconst_0       
        //    87: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //    89: aload           $this$constrain_u24lambda_u2d0$iv
        //    91: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    94: astore          16
        //    96: astore          18
        //    98: iconst_0       
        //    99: istore          $i$a$-constrain-ScrollComponent$actualHolder$1
        //   101: aload           $this$actualHolder_u24lambda_u2d0
        //   103: aload_0         /* this */
        //   104: getfield        gg/essential/elementa/components/ScrollComponent.innerPadding:F
        //   107: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   110: checkcast       Ljava/lang/Number;
        //   113: iconst_0       
        //   114: iconst_0       
        //   115: iconst_3       
        //   116: aconst_null    
        //   117: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   120: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   123: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   126: aload           $this$actualHolder_u24lambda_u2d0
        //   128: aload_0         /* this */
        //   129: getfield        gg/essential/elementa/components/ScrollComponent.innerPadding:F
        //   132: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   135: checkcast       Ljava/lang/Number;
        //   138: iconst_0       
        //   139: iconst_0       
        //   140: iconst_3       
        //   141: aconst_null    
        //   142: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   145: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   148: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   151: aload           $this$actualHolder_u24lambda_u2d0
        //   153: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //   156: dup            
        //   157: fconst_1       
        //   158: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(F)V
        //   161: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   164: aload_0         /* this */
        //   165: getfield        gg/essential/elementa/components/ScrollComponent.innerPadding:F
        //   168: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   171: checkcast       Ljava/lang/Number;
        //   174: iconst_0       
        //   175: iconst_0       
        //   176: iconst_3       
        //   177: aconst_null    
        //   178: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   181: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   184: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   187: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   190: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   193: aload           $this$actualHolder_u24lambda_u2d0
        //   195: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //   198: dup            
        //   199: fconst_1       
        //   200: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(F)V
        //   203: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   206: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   209: nop            
        //   210: aload           18
        //   212: nop            
        //   213: aload           13
        //   215: nop            
        //   216: checkcast       Lgg/essential/elementa/components/UIContainer;
        //   219: putfield        gg/essential/elementa/components/ScrollComponent.actualHolder:Lgg/essential/elementa/components/UIContainer;
        //   222: aload_0         /* this */
        //   223: new             Lgg/essential/elementa/components/UIWrappedText;
        //   226: dup            
        //   227: aload_1         /* emptyString */
        //   228: iconst_0       
        //   229: aconst_null    
        //   230: iconst_1       
        //   231: iconst_0       
        //   232: fconst_0       
        //   233: aconst_null    
        //   234: bipush          118
        //   236: aconst_null    
        //   237: invokespecial   gg/essential/elementa/components/UIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   240: checkcast       Lgg/essential/elementa/UIComponent;
        //   243: astore          $this$constrain$iv
        //   245: iconst_0       
        //   246: istore          $i$f$constrain
        //   248: aload           $this$constrain$iv
        //   250: astore          13
        //   252: aload           13
        //   254: astore          $this$constrain_u24lambda_u2d0$iv
        //   256: iconst_0       
        //   257: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   259: aload           $this$constrain_u24lambda_u2d0$iv
        //   261: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   264: astore          16
        //   266: astore          18
        //   268: iconst_0       
        //   269: istore          $i$a$-constrain-ScrollComponent$emptyText$1
        //   271: aload           $this$emptyText_u24lambda_u2d1
        //   273: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   276: dup            
        //   277: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   280: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   283: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   286: aload           $this$emptyText_u24lambda_u2d1
        //   288: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   291: dup            
        //   292: fconst_0       
        //   293: iconst_0       
        //   294: iconst_3       
        //   295: aconst_null    
        //   296: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   299: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   302: iconst_4       
        //   303: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   306: checkcast       Ljava/lang/Number;
        //   309: iconst_0       
        //   310: iconst_0       
        //   311: iconst_3       
        //   312: aconst_null    
        //   313: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   316: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   319: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   322: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   325: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   328: nop            
        //   329: aload           18
        //   331: nop            
        //   332: aload           13
        //   334: nop            
        //   335: checkcast       Lgg/essential/elementa/components/UIWrappedText;
        //   338: putfield        gg/essential/elementa/components/ScrollComponent.emptyText:Lgg/essential/elementa/components/UIWrappedText;
        //   341: aload_0         /* this */
        //   342: getstatic       gg/essential/elementa/components/ScrollComponent.Companion:Lgg/essential/elementa/components/ScrollComponent$Companion;
        //   345: invokevirtual   gg/essential/elementa/components/ScrollComponent$Companion.getScrollImage:()Lgg/essential/elementa/components/UIImage;
        //   348: checkcast       Lgg/essential/elementa/UIComponent;
        //   351: astore          $this$constrain$iv
        //   353: iconst_0       
        //   354: istore          $i$f$constrain
        //   356: aload           $this$constrain$iv
        //   358: astore          13
        //   360: aload           13
        //   362: astore          $this$constrain_u24lambda_u2d0$iv
        //   364: iconst_0       
        //   365: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   367: aload           $this$constrain_u24lambda_u2d0$iv
        //   369: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   372: astore          16
        //   374: astore          18
        //   376: iconst_0       
        //   377: istore          $i$a$-constrain-ScrollComponent$scrollIconComponent$1
        //   379: aload           $this$scrollIconComponent_u24lambda_u2d2
        //   381: bipush          10
        //   383: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   386: checkcast       Ljava/lang/Number;
        //   389: iconst_0       
        //   390: iconst_0       
        //   391: iconst_3       
        //   392: aconst_null    
        //   393: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   396: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   399: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   402: aload           $this$scrollIconComponent_u24lambda_u2d2
        //   404: bipush          16
        //   406: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   409: checkcast       Ljava/lang/Number;
        //   412: iconst_0       
        //   413: iconst_0       
        //   414: iconst_3       
        //   415: aconst_null    
        //   416: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   419: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   422: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   425: aload           $this$scrollIconComponent_u24lambda_u2d2
        //   427: aload_0         /* this */
        //   428: getfield        gg/essential/elementa/components/ScrollComponent.scrollIconColor:Ljava/awt/Color;
        //   431: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   434: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   437: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   440: nop            
        //   441: aload           18
        //   443: nop            
        //   444: aload           13
        //   446: nop            
        //   447: checkcast       Lgg/essential/elementa/components/UIImage;
        //   450: putfield        gg/essential/elementa/components/ScrollComponent.scrollIconComponent:Lgg/essential/elementa/components/UIImage;
        //   453: aload_0         /* this */
        //   454: aload_0         /* this */
        //   455: getfield        gg/essential/elementa/components/ScrollComponent.innerPadding:F
        //   458: putfield        gg/essential/elementa/components/ScrollComponent.horizontalOffset:F
        //   461: aload_0         /* this */
        //   462: aload_0         /* this */
        //   463: getfield        gg/essential/elementa/components/ScrollComponent.innerPadding:F
        //   466: putfield        gg/essential/elementa/components/ScrollComponent.verticalOffset:F
        //   469: aload_0         /* this */
        //   470: ldc_w           -1.0
        //   473: putfield        gg/essential/elementa/components/ScrollComponent.horizontalDragBeginPos:F
        //   476: aload_0         /* this */
        //   477: ldc_w           -1.0
        //   480: putfield        gg/essential/elementa/components/ScrollComponent.verticalDragBeginPos:F
        //   483: aload_0         /* this */
        //   484: iconst_1       
        //   485: anewarray       Lkotlin/jvm/functions/Function2;
        //   488: astore          11
        //   490: aload           11
        //   492: iconst_0       
        //   493: new             Lgg/essential/elementa/components/ScrollComponent$horizontalScrollAdjustEvents$1;
        //   496: dup            
        //   497: aload_0         /* this */
        //   498: invokespecial   gg/essential/elementa/components/ScrollComponent$horizontalScrollAdjustEvents$1.<init>:(Ljava/lang/Object;)V
        //   501: checkcast       Lkotlin/jvm/functions/Function3;
        //   504: iconst_1       
        //   505: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   508: invokestatic    gg/essential/elementa/utils/BindingKt.bindLast:(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;
        //   511: aastore        
        //   512: aload           11
        //   514: invokestatic    kotlin/collections/CollectionsKt.mutableListOf:([Ljava/lang/Object;)Ljava/util/List;
        //   517: putfield        gg/essential/elementa/components/ScrollComponent.horizontalScrollAdjustEvents:Ljava/util/List;
        //   520: aload_0         /* this */
        //   521: iconst_1       
        //   522: anewarray       Lkotlin/jvm/functions/Function2;
        //   525: astore          11
        //   527: aload           11
        //   529: iconst_0       
        //   530: new             Lgg/essential/elementa/components/ScrollComponent$verticalScrollAdjustEvents$1;
        //   533: dup            
        //   534: aload_0         /* this */
        //   535: invokespecial   gg/essential/elementa/components/ScrollComponent$verticalScrollAdjustEvents$1.<init>:(Ljava/lang/Object;)V
        //   538: checkcast       Lkotlin/jvm/functions/Function3;
        //   541: iconst_0       
        //   542: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   545: invokestatic    gg/essential/elementa/utils/BindingKt.bindLast:(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;
        //   548: aastore        
        //   549: aload           11
        //   551: invokestatic    kotlin/collections/CollectionsKt.mutableListOf:([Ljava/lang/Object;)Ljava/util/List;
        //   554: putfield        gg/essential/elementa/components/ScrollComponent.verticalScrollAdjustEvents:Ljava/util/List;
        //   557: aload_0         /* this */
        //   558: iconst_1       
        //   559: putfield        gg/essential/elementa/components/ScrollComponent.needsUpdate:Z
        //   562: aload_0         /* this */
        //   563: ldc_w           -1.0
        //   566: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   569: ldc_w           -1.0
        //   572: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   575: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   578: putfield        gg/essential/elementa/components/ScrollComponent.autoScrollBegin:Lkotlin/Pair;
        //   581: aload_0         /* this */
        //   582: fconst_1       
        //   583: putfield        gg/essential/elementa/components/ScrollComponent.currentScrollAcceleration:F
        //   586: aload_0         /* this */
        //   587: new             Ljava/util/concurrent/CopyOnWriteArrayList;
        //   590: dup            
        //   591: invokespecial   java/util/concurrent/CopyOnWriteArrayList.<init>:()V
        //   594: putfield        gg/essential/elementa/components/ScrollComponent.allChildren:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   597: nop            
        //   598: aload_0         /* this */
        //   599: checkcast       Lgg/essential/elementa/UIComponent;
        //   602: astore          $this$constrain$iv
        //   604: iconst_0       
        //   605: istore          $i$f$constrain
        //   607: aload           $this$constrain$iv
        //   609: astore          13
        //   611: aload           13
        //   613: astore          $this$constrain_u24lambda_u2d0$iv
        //   615: iconst_0       
        //   616: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   618: aload           $this$constrain_u24lambda_u2d0$iv
        //   620: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   623: astore          $this$_init__u24lambda_u2d3
        //   625: iconst_0       
        //   626: istore          $i$a$-constrain-ScrollComponent$1
        //   628: aload           $this$_init__u24lambda_u2d3
        //   630: new             Lgg/essential/elementa/components/ScrollComponent$ScrollChildConstraint;
        //   633: dup            
        //   634: aload_0         /* this */
        //   635: fconst_0       
        //   636: iconst_1       
        //   637: aconst_null    
        //   638: invokespecial   gg/essential/elementa/components/ScrollComponent$ScrollChildConstraint.<init>:(Lgg/essential/elementa/components/ScrollComponent;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   641: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   644: bipush          100
        //   646: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   649: checkcast       Ljava/lang/Number;
        //   652: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percentOfWindow:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeWindowConstraint;
        //   655: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   658: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtMost:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtMostConstraint;
        //   661: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   664: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   667: aload           $this$_init__u24lambda_u2d3
        //   669: new             Lgg/essential/elementa/components/ScrollComponent$ScrollChildConstraint;
        //   672: dup            
        //   673: aload_0         /* this */
        //   674: fconst_0       
        //   675: iconst_1       
        //   676: aconst_null    
        //   677: invokespecial   gg/essential/elementa/components/ScrollComponent$ScrollChildConstraint.<init>:(Lgg/essential/elementa/components/ScrollComponent;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   680: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   683: bipush          100
        //   685: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   688: checkcast       Ljava/lang/Number;
        //   691: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percentOfWindow:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeWindowConstraint;
        //   694: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   697: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtMost:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtMostConstraint;
        //   700: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   703: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   706: nop            
        //   707: nop            
        //   708: nop            
        //   709: nop            
        //   710: aload_0         /* this */
        //   711: getfield        gg/essential/elementa/components/ScrollComponent.horizontalScrollEnabled:Z
        //   714: ifne            735
        //   717: aload_0         /* this */
        //   718: getfield        gg/essential/elementa/components/ScrollComponent.verticalScrollEnabled:Z
        //   721: ifne            735
        //   724: new             Ljava/lang/IllegalArgumentException;
        //   727: dup            
        //   728: ldc_w           "ScrollComponent must have at least one direction of scrolling enabled"
        //   731: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   734: athrow         
        //   735: aload_0         /* this */
        //   736: aload_0         /* this */
        //   737: getfield        gg/essential/elementa/components/ScrollComponent.actualHolder:Lgg/essential/elementa/components/UIContainer;
        //   740: checkcast       Lgg/essential/elementa/UIComponent;
        //   743: invokespecial   gg/essential/elementa/components/UIContainer.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   746: pop            
        //   747: aload_0         /* this */
        //   748: getfield        gg/essential/elementa/components/ScrollComponent.actualHolder:Lgg/essential/elementa/components/UIContainer;
        //   751: aload_0         /* this */
        //   752: getfield        gg/essential/elementa/components/ScrollComponent.emptyText:Lgg/essential/elementa/components/UIWrappedText;
        //   755: checkcast       Lgg/essential/elementa/UIComponent;
        //   758: invokevirtual   gg/essential/elementa/components/UIContainer.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   761: pop            
        //   762: aload_0         /* this */
        //   763: iconst_1       
        //   764: anewarray       Lgg/essential/elementa/effects/Effect;
        //   767: astore          11
        //   769: aload           11
        //   771: iconst_0       
        //   772: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   775: dup            
        //   776: aload           customScissorBoundingBox
        //   778: iconst_0       
        //   779: iconst_2       
        //   780: aconst_null    
        //   781: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   784: checkcast       Lgg/essential/elementa/effects/Effect;
        //   787: aastore        
        //   788: aload           11
        //   790: invokevirtual   gg/essential/elementa/components/ScrollComponent.enableEffects:([Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   793: pop            
        //   794: aload_0         /* this */
        //   795: getfield        gg/essential/elementa/components/ScrollComponent.emptyText:Lgg/essential/elementa/components/UIWrappedText;
        //   798: aload_0         /* this */
        //   799: invokevirtual   gg/essential/elementa/components/ScrollComponent.getFontProvider:()Lgg/essential/elementa/font/FontProvider;
        //   802: invokevirtual   gg/essential/elementa/components/UIWrappedText.setFontProvider:(Lgg/essential/elementa/font/FontProvider;)Lgg/essential/elementa/UIComponent;
        //   805: pop            
        //   806: aload_0         /* this */
        //   807: aload_0         /* this */
        //   808: getfield        gg/essential/elementa/components/ScrollComponent.scrollIconComponent:Lgg/essential/elementa/components/UIImage;
        //   811: checkcast       Lgg/essential/elementa/UIComponent;
        //   814: invokespecial   gg/essential/elementa/components/UIContainer.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   817: pop            
        //   818: aload_0         /* this */
        //   819: getfield        gg/essential/elementa/components/ScrollComponent.scrollIconComponent:Lgg/essential/elementa/components/UIImage;
        //   822: iconst_1       
        //   823: invokevirtual   gg/essential/elementa/components/UIImage.hide:(Z)V
        //   826: aload_0         /* this */
        //   827: new             Lgg/essential/elementa/components/ScrollComponent$2;
        //   830: dup            
        //   831: aload_0         /* this */
        //   832: invokespecial   gg/essential/elementa/components/ScrollComponent$2.<init>:(Lgg/essential/elementa/components/ScrollComponent;)V
        //   835: checkcast       Lkotlin/jvm/functions/Function2;
        //   838: invokevirtual   gg/essential/elementa/components/ScrollComponent.onMouseScroll:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   841: pop            
        //   842: aload_0         /* this */
        //   843: new             Lgg/essential/elementa/components/ScrollComponent$3;
        //   846: dup            
        //   847: aload_0         /* this */
        //   848: invokespecial   gg/essential/elementa/components/ScrollComponent$3.<init>:(Lgg/essential/elementa/components/ScrollComponent;)V
        //   851: checkcast       Lkotlin/jvm/functions/Function2;
        //   854: invokevirtual   gg/essential/elementa/components/ScrollComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   857: pop            
        //   858: nop            
        //   859: return         
        //    MethodParameters:
        //  Name                      Flags  
        //  ------------------------  -----
        //  emptyString               
        //  innerPadding              
        //  scrollIconColor           
        //  horizontalScrollEnabled   
        //  verticalScrollEnabled     
        //  horizontalScrollOpposite  
        //  verticalScrollOpposite    
        //  pixelsPerScroll           
        //  scrollAcceleration        
        //  customScissorBoundingBox  
        //    StackMapTable: 00 01 FF 02 DF 00 13 07 00 02 07 01 8F 02 07 01 91 01 01 01 01 02 02 07 00 DD 07 00 DD 01 07 00 DD 07 00 DD 01 07 00 F3 01 07 00 02 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public ScrollComponent(String emptyString, float innerPadding, Color scrollIconColor, boolean horizontalScrollEnabled, boolean verticalScrollEnabled, boolean horizontalScrollOpposite, boolean verticalScrollOpposite, float pixelsPerScroll, float scrollAcceleration, UIComponent customScissorBoundingBox, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            emptyString = "";
        }
        if ((n & 0x2) != 0x0) {
            innerPadding = 0.0f;
        }
        if ((n & 0x4) != 0x0) {
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            scrollIconColor = white;
        }
        if ((n & 0x8) != 0x0) {
            horizontalScrollEnabled = false;
        }
        if ((n & 0x10) != 0x0) {
            verticalScrollEnabled = true;
        }
        if ((n & 0x20) != 0x0) {
            horizontalScrollOpposite = false;
        }
        if ((n & 0x40) != 0x0) {
            verticalScrollOpposite = false;
        }
        if ((n & 0x80) != 0x0) {
            pixelsPerScroll = 15.0f;
        }
        if ((n & 0x100) != 0x0) {
            scrollAcceleration = 1.0f;
        }
        if ((n & 0x200) != 0x0) {
            customScissorBoundingBox = null;
        }
        this(emptyString, innerPadding, scrollIconColor, horizontalScrollEnabled, verticalScrollEnabled, horizontalScrollOpposite, verticalScrollOpposite, pixelsPerScroll, scrollAcceleration, customScissorBoundingBox);
    }
    
    @NotNull
    public final UIWrappedText getEmptyText() {
        return this.emptyText;
    }
    
    public final float getHorizontalOffset() {
        return this.horizontalOffset;
    }
    
    public final float getVerticalOffset() {
        return this.verticalOffset;
    }
    
    @NotNull
    public final CopyOnWriteArrayList<UIComponent> getAllChildren() {
        return this.allChildren;
    }
    
    public final float getHorizontalOverhang() {
        return Math.max(0.0f, this.calculateActualWidth() - this.getWidth());
    }
    
    public final float getVerticalOverhang() {
        return Math.max(0.0f, this.calculateActualHeight() - this.getHeight());
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final float width = this.getWidth();
        final float height = this.getHeight();
        if (width != this.lastWidth || height != this.lastHeight) {
            this.lastWidth = width;
            this.lastHeight = height;
            this.needsUpdate = true;
        }
        final float actualWidth = this.calculateActualWidth();
        final float actualHeight = this.calculateActualHeight();
        if (actualWidth != this.lastActualWidth || actualHeight != this.lastActualHeight) {
            this.lastActualWidth = actualWidth;
            this.lastActualHeight = actualHeight;
            this.needsUpdate = true;
        }
        if (this.needsUpdate) {
            this.needsUpdate = false;
            final ClosedFloatingPointRange horizontalRange = this.calculateOffsetRange(true);
            final ClosedFloatingPointRange verticalRange = this.calculateOffsetRange(false);
            final UIComponent $this$animate$iv = this.actualHolder;
            final int $i$f$animate = 0;
            final UIComponent $this$animate_u24lambda_u2d0$iv = $this$animate$iv;
            final int n = 0;
            final AnimatingConstraints $this$draw_u24lambda_u2d4;
            final AnimatingConstraints anim$iv = $this$draw_u24lambda_u2d4 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
            final int n2 = 0;
            this.horizontalOffset = (horizontalRange.isEmpty() ? this.innerPadding : ((Number)RangesKt.coerceIn((Comparable)this.getHorizontalOffset(), horizontalRange)).floatValue());
            this.verticalOffset = (verticalRange.isEmpty() ? this.innerPadding : ((Number)RangesKt.coerceIn((Comparable)this.getVerticalOffset(), verticalRange)).floatValue());
            AnimatingConstraints.setXAnimation$default($this$draw_u24lambda_u2d4, Animations.IN_SIN, 0.1f, UtilitiesKt.pixels$default(this.getHorizontalOffset(), false, false, 3, null), 0.0f, 8, null);
            AnimatingConstraints.setYAnimation$default($this$draw_u24lambda_u2d4, Animations.IN_SIN, 0.1f, UtilitiesKt.pixels$default(this.getVerticalOffset(), false, false, 3, null), 0.0f, 8, null);
            $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
            float percent = 0.0f;
            percent = (this.innerPadding - this.horizontalOffset) / this.width((ClosedFloatingPointRange<Float>)horizontalRange);
            float percentageOfParent = 0.0f;
            percentageOfParent = width / actualWidth;
            Iterable $this$forEach$iv = this.horizontalScrollAdjustEvents;
            int $i$f$forEach = 0;
            for (final Object element$iv : $this$forEach$iv) {
                final Function2 it = (Function2)element$iv;
                final int n3 = 0;
                it.invoke((Object)percent, (Object)percentageOfParent);
            }
            percent = (this.innerPadding - this.verticalOffset) / this.width((ClosedFloatingPointRange<Float>)verticalRange);
            percentageOfParent = height / actualHeight;
            $this$forEach$iv = this.verticalScrollAdjustEvents;
            $i$f$forEach = 0;
            for (final Object element$iv : $this$forEach$iv) {
                final Function2 it = (Function2)element$iv;
                final int n4 = 0;
                it.invoke((Object)percent, (Object)percentageOfParent);
            }
        }
        super.draw(matrixStack);
    }
    
    @Override
    public void afterInitialization() {
        super.afterInitialization();
        this.animationFPS = Window.Companion.of(this).getAnimationFPS();
    }
    
    public final void setEmptyText(@NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this.emptyText.setText(text);
    }
    
    public final void addScrollAdjustEvent(final boolean isHorizontal, @NotNull final Function2<? super Float, ? super Float, Unit> event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        if (isHorizontal) {
            this.horizontalScrollAdjustEvents.add((Function2<Float, Float, Unit>)event);
        }
        else {
            this.verticalScrollAdjustEvents.add((Function2<Float, Float, Unit>)event);
        }
    }
    
    @JvmOverloads
    public final void setHorizontalScrollBarComponent(@NotNull final UIComponent component, final boolean hideWhenUseless) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        this.setScrollBarComponent(component, hideWhenUseless, true);
    }
    
    public static /* synthetic */ void setHorizontalScrollBarComponent$default(final ScrollComponent scrollComponent, final UIComponent component, boolean hideWhenUseless, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            hideWhenUseless = false;
        }
        scrollComponent.setHorizontalScrollBarComponent(component, hideWhenUseless);
    }
    
    @JvmOverloads
    public final void setVerticalScrollBarComponent(@NotNull final UIComponent component, final boolean hideWhenUseless) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        this.setScrollBarComponent(component, hideWhenUseless, false);
    }
    
    public static /* synthetic */ void setVerticalScrollBarComponent$default(final ScrollComponent scrollComponent, final UIComponent component, boolean hideWhenUseless, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            hideWhenUseless = false;
        }
        scrollComponent.setVerticalScrollBarComponent(component, hideWhenUseless);
    }
    
    public final void setScrollBarComponent(@NotNull final UIComponent component, final boolean hideWhenUseless, final boolean isHorizontal) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        if (isHorizontal) {
            this.horizontalScrollBarGrip = component;
            this.horizontalHideScrollWhenUseless = hideWhenUseless;
        }
        else {
            this.verticalScrollBarGrip = component;
            this.verticalHideScrollWhenUseless = hideWhenUseless;
        }
        component.onMouseScroll((Function2<? super UIComponent, ? super UIScrollEvent, Unit>)new ScrollComponent$setScrollBarComponent.ScrollComponent$setScrollBarComponent$1(isHorizontal, this));
        component.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new ScrollComponent$setScrollBarComponent.ScrollComponent$setScrollBarComponent$2(isHorizontal, this));
        component.onMouseDrag((Function4<? super UIComponent, ? super Float, ? super Float, ? super Integer, Unit>)new ScrollComponent$setScrollBarComponent.ScrollComponent$setScrollBarComponent$3(isHorizontal, this, component));
        component.onMouseRelease((Function1<? super UIComponent, Unit>)new ScrollComponent$setScrollBarComponent.ScrollComponent$setScrollBarComponent$4(isHorizontal, this));
        this.needsUpdate = true;
    }
    
    public final void scrollTo(final float horizontalOffset, final float verticalOffset, final boolean smoothScroll) {
        final ClosedFloatingPointRange horizontalRange = this.calculateOffsetRange(true);
        final ClosedFloatingPointRange verticalRange = this.calculateOffsetRange(false);
        this.horizontalOffset = (horizontalRange.isEmpty() ? this.innerPadding : ((Number)RangesKt.coerceIn((Comparable)horizontalOffset, horizontalRange)).floatValue());
        this.verticalOffset = (verticalRange.isEmpty() ? this.innerPadding : ((Number)RangesKt.coerceIn((Comparable)verticalOffset, verticalRange)).floatValue());
        if (smoothScroll) {
            this.needsUpdate = true;
            return;
        }
        this.actualHolder.setX(UtilitiesKt.pixels$default(this.horizontalOffset, false, false, 3, null));
        this.actualHolder.setY(UtilitiesKt.pixels$default(this.verticalOffset, false, false, 3, null));
        final float horizontalFraction = this.div(this.innerPadding - this.horizontalOffset, (ClosedFloatingPointRange<Float>)horizontalRange);
        final float verticalFraction = this.div(this.innerPadding - this.verticalOffset, (ClosedFloatingPointRange<Float>)verticalRange);
        Iterable $this$forEach$iv = this.horizontalScrollAdjustEvents;
        int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Function2 it = (Function2)element$iv;
            final int n = 0;
            it.invoke((Object)horizontalFraction, (Object)(this.getWidth() / this.calculateActualWidth()));
        }
        $this$forEach$iv = this.verticalScrollAdjustEvents;
        $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Function2 it = (Function2)element$iv;
            final int n2 = 0;
            it.invoke((Object)verticalFraction, (Object)(this.getHeight() / this.calculateActualHeight()));
        }
    }
    
    public static /* synthetic */ void scrollTo$default(final ScrollComponent scrollComponent, float horizontalOffset, float verticalOffset, boolean smoothScroll, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            horizontalOffset = scrollComponent.horizontalOffset;
        }
        if ((n & 0x2) != 0x0) {
            verticalOffset = scrollComponent.verticalOffset;
        }
        if ((n & 0x4) != 0x0) {
            smoothScroll = true;
        }
        scrollComponent.scrollTo(horizontalOffset, verticalOffset, smoothScroll);
    }
    
    private final float div(final float $this$div, final ClosedFloatingPointRange<Float> range) {
        final float width = this.width(range);
        return (width == 0.0f) ? 0.0f : ($this$div / width);
    }
    
    public final void scrollToLeft(final boolean smoothScroll) {
        scrollTo$default(this, Float.POSITIVE_INFINITY, 0.0f, smoothScroll, 2, null);
    }
    
    public static /* synthetic */ void scrollToLeft$default(final ScrollComponent scrollComponent, boolean smoothScroll, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            smoothScroll = true;
        }
        scrollComponent.scrollToLeft(smoothScroll);
    }
    
    public final void scrollToRight(final boolean smoothScroll) {
        scrollTo$default(this, Float.NEGATIVE_INFINITY, 0.0f, smoothScroll, 2, null);
    }
    
    public static /* synthetic */ void scrollToRight$default(final ScrollComponent scrollComponent, boolean smoothScroll, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            smoothScroll = true;
        }
        scrollComponent.scrollToRight(smoothScroll);
    }
    
    public final void scrollToTop(final boolean smoothScroll) {
        scrollTo$default(this, 0.0f, Float.POSITIVE_INFINITY, smoothScroll, 1, null);
    }
    
    public static /* synthetic */ void scrollToTop$default(final ScrollComponent scrollComponent, boolean smoothScroll, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            smoothScroll = true;
        }
        scrollComponent.scrollToTop(smoothScroll);
    }
    
    public final void scrollToBottom(final boolean smoothScroll) {
        scrollTo$default(this, 0.0f, Float.NEGATIVE_INFINITY, smoothScroll, 1, null);
    }
    
    public static /* synthetic */ void scrollToBottom$default(final ScrollComponent scrollComponent, boolean smoothScroll, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            smoothScroll = true;
        }
        scrollComponent.scrollToBottom(smoothScroll);
    }
    
    public final void filterChildren(@NotNull final Function1<? super UIComponent, Boolean> filter) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "filter"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* this */
        //     8: getfield        gg/essential/elementa/components/ScrollComponent.actualHolder:Lgg/essential/elementa/components/UIContainer;
        //    11: invokevirtual   gg/essential/elementa/components/UIContainer.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //    14: invokevirtual   gg/essential/elementa/utils/ObservableList.clear:()V
        //    17: aload_0         /* this */
        //    18: getfield        gg/essential/elementa/components/ScrollComponent.actualHolder:Lgg/essential/elementa/components/UIContainer;
        //    21: invokevirtual   gg/essential/elementa/components/UIContainer.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //    24: aload_0         /* this */
        //    25: getfield        gg/essential/elementa/components/ScrollComponent.allChildren:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    28: checkcast       Ljava/lang/Iterable;
        //    31: astore_2       
        //    32: astore          9
        //    34: iconst_0       
        //    35: istore_3        /* $i$f$filter */
        //    36: aload_2         /* $this$filter$iv */
        //    37: astore          4
        //    39: new             Ljava/util/ArrayList;
        //    42: dup            
        //    43: invokespecial   java/util/ArrayList.<init>:()V
        //    46: checkcast       Ljava/util/Collection;
        //    49: astore          destination$iv$iv
        //    51: iconst_0       
        //    52: istore          $i$f$filterTo
        //    54: aload           $this$filterTo$iv$iv
        //    56: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    61: astore          7
        //    63: aload           7
        //    65: invokeinterface java/util/Iterator.hasNext:()Z
        //    70: ifeq            112
        //    73: aload           7
        //    75: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    80: astore          element$iv$iv
        //    82: aload_1         /* filter */
        //    83: aload           element$iv$iv
        //    85: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    90: checkcast       Ljava/lang/Boolean;
        //    93: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    96: ifeq            63
        //    99: aload           destination$iv$iv
        //   101: aload           element$iv$iv
        //   103: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   108: pop            
        //   109: goto            63
        //   112: aload           destination$iv$iv
        //   114: checkcast       Ljava/util/List;
        //   117: nop            
        //   118: aload           9
        //   120: swap           
        //   121: checkcast       Ljava/util/Collection;
        //   124: astore_2       
        //   125: aload_2        
        //   126: invokeinterface java/util/Collection.isEmpty:()Z
        //   131: ifeq            151
        //   134: astore          9
        //   136: iconst_0       
        //   137: istore_3        /* $i$a$-ifEmpty-ScrollComponent$filterChildren$1 */
        //   138: aload_0         /* this */
        //   139: invokevirtual   gg/essential/elementa/components/ScrollComponent.getEmptyText:()Lgg/essential/elementa/components/UIWrappedText;
        //   142: invokestatic    kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
        //   145: aload           9
        //   147: swap           
        //   148: goto            152
        //   151: aload_2        
        //   152: checkcast       Ljava/util/Collection;
        //   155: invokevirtual   gg/essential/elementa/utils/ObservableList.addAll:(Ljava/util/Collection;)Z
        //   158: pop            
        //   159: aload_0         /* this */
        //   160: getfield        gg/essential/elementa/components/ScrollComponent.actualHolder:Lgg/essential/elementa/components/UIContainer;
        //   163: invokevirtual   gg/essential/elementa/components/UIContainer.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //   166: checkcast       Ljava/lang/Iterable;
        //   169: astore_2        /* $this$forEach$iv */
        //   170: iconst_0       
        //   171: istore_3        /* $i$f$forEach */
        //   172: aload_2         /* $this$forEach$iv */
        //   173: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   178: astore          4
        //   180: aload           4
        //   182: invokeinterface java/util/Iterator.hasNext:()Z
        //   187: ifeq            224
        //   190: aload           4
        //   192: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   197: astore          element$iv
        //   199: aload           element$iv
        //   201: checkcast       Lgg/essential/elementa/UIComponent;
        //   204: astore          it
        //   206: iconst_0       
        //   207: istore          $i$a$-forEach-ScrollComponent$filterChildren$2
        //   209: aload           it
        //   211: aload_0         /* this */
        //   212: getfield        gg/essential/elementa/components/ScrollComponent.actualHolder:Lgg/essential/elementa/components/UIContainer;
        //   215: checkcast       Lgg/essential/elementa/UIComponent;
        //   218: invokevirtual   gg/essential/elementa/UIComponent.setParent:(Lgg/essential/elementa/UIComponent;)V
        //   221: goto            180
        //   224: nop            
        //   225: aload_0         /* this */
        //   226: iconst_1       
        //   227: putfield        gg/essential/elementa/components/ScrollComponent.needsUpdate:Z
        //   230: return         
        //    Signature:
        //  (Lkotlin/jvm/functions/Function1<-Lgg/essential/elementa/UIComponent;Ljava/lang/Boolean;>;)V
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  filter  
        //    StackMapTable: 00 06 FF 00 3F 00 0A 07 00 02 07 02 9A 07 02 27 01 07 02 27 07 02 D4 01 07 02 2D 00 07 02 CC 00 00 30 FF 00 26 00 0A 07 00 02 07 02 9A 07 02 D4 01 07 02 27 07 02 D4 01 07 02 2D 00 07 02 CC 00 01 07 02 CC FF 00 00 00 0A 07 00 02 07 02 9A 07 02 D4 01 07 02 27 07 02 D4 01 07 02 2D 00 07 02 CC 00 02 07 02 CC 07 02 2F FF 00 1B 00 0A 07 00 02 07 02 9A 07 02 27 01 07 02 2D 07 02 2F 00 00 00 07 02 CC 00 00 2B
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmOverloads
    public final <T extends Comparable<? super T>> void sortChildren(final boolean descending, @NotNull final Function1<? super UIComponent, ? extends T> comparator) {
        Intrinsics.checkNotNullParameter((Object)comparator, "comparator");
        if (descending) {
            final List $this$sortByDescending$iv = this.actualHolder.getChildren();
            final int $i$f$sortByDescending = 0;
            if ($this$sortByDescending$iv.size() > 1) {
                CollectionsKt.sortWith($this$sortByDescending$iv, (Comparator)new Comparator<T>(comparator) {
                    final /* synthetic */ Function1 $selector;
                    
                    public ScrollComponent$sortChildren$$inlined$sortByDescending$1(final Function1 $selector) {
                        this.$selector = $selector;
                        super();
                    }
                    
                    @Override
                    public final int compare(final T a, final T b) {
                        return ComparisonsKt.compareValues((Comparable)this.$selector.invoke((Object)b), (Comparable)this.$selector.invoke((Object)a));
                    }
                });
            }
        }
        else {
            final List $this$sortBy$iv = this.actualHolder.getChildren();
            final int $i$f$sortBy = 0;
            if ($this$sortBy$iv.size() > 1) {
                CollectionsKt.sortWith($this$sortBy$iv, (Comparator)new ScrollComponent$sortChildren$$inlined$sortBy$1((Function1)comparator));
            }
        }
    }
    
    public static /* synthetic */ void sortChildren$default(final ScrollComponent scrollComponent, boolean descending, final Function1 comparator, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            descending = false;
        }
        scrollComponent.sortChildren(descending, (kotlin.jvm.functions.Function1<? super UIComponent, ? extends Comparable>)comparator);
    }
    
    public final void sortChildren(@NotNull final Comparator<UIComponent> comparator) {
        Intrinsics.checkNotNullParameter((Object)comparator, "comparator");
        CollectionsKt.sortWith((List)this.actualHolder.getChildren(), (Comparator)comparator);
    }
    
    private final void updateGrip(final UIComponent component, final float mouseCoord, final boolean isHorizontal) {
        if (isHorizontal) {
            final float minCoord = component.getParent().getLeft();
            final float maxCoord = component.getParent().getRight();
            final float dragDelta = mouseCoord - this.horizontalDragBeginPos;
            float horizontalOffset;
            if (this.horizontalScrollOpposite) {
                final float newPos = maxCoord - component.getRight() - dragDelta;
                final float percentage = newPos / (maxCoord - minCoord);
                horizontalOffset = percentage * this.calculateActualWidth();
            }
            else {
                final float newPos = component.getLeft() + dragDelta - minCoord;
                final float percentage = newPos / (maxCoord - minCoord);
                horizontalOffset = -(percentage * this.calculateActualWidth());
            }
            this.horizontalOffset = horizontalOffset;
        }
        else {
            final float minCoord = component.getParent().getTop();
            final float maxCoord = component.getParent().getBottom();
            final float dragDelta = mouseCoord - this.verticalDragBeginPos;
            float verticalOffset;
            if (this.verticalScrollOpposite) {
                final float newPos = maxCoord - component.getBottom() - dragDelta;
                final float percentage = newPos / (maxCoord - minCoord);
                verticalOffset = percentage * this.calculateActualHeight();
            }
            else {
                final float newPos = component.getTop() + dragDelta - minCoord;
                final float percentage = newPos / (maxCoord - minCoord);
                verticalOffset = -(percentage * this.calculateActualHeight());
            }
            this.verticalOffset = verticalOffset;
        }
        this.needsUpdate = true;
    }
    
    private final void onScroll(final float delta, final boolean isHorizontal) {
        if (isHorizontal) {
            this.horizontalOffset += delta * this.pixelsPerScroll * this.currentScrollAcceleration;
        }
        else {
            this.verticalOffset += delta * this.pixelsPerScroll * this.currentScrollAcceleration;
        }
        this.currentScrollAcceleration = RangesKt.coerceIn(this.currentScrollAcceleration + (this.scrollAcceleration - 1.0f) * 0.15f, 0.0f, this.scrollAcceleration);
        this.needsUpdate = true;
    }
    
    private final void updateScrollBar(final float scrollPercentage, final float percentageOfParent, final boolean isHorizontal) {
        UIComponent uiComponent;
        if (isHorizontal) {
            if ((uiComponent = this.horizontalScrollBarGrip) == null) {
                return;
            }
        }
        else if ((uiComponent = this.verticalScrollBarGrip) == null) {
            return;
        }
        final UIComponent component = uiComponent;
        final float clampedPercentage = RangesKt.coerceAtMost(percentageOfParent, 1.0f);
        if ((isHorizontal && this.horizontalHideScrollWhenUseless) || (!isHorizontal && this.verticalHideScrollWhenUseless)) {
            if (clampedPercentage == 1.0f) {
                Window.Companion.enqueueRenderOperation((Function0<Unit>)new ScrollComponent$updateScrollBar.ScrollComponent$updateScrollBar$1((Object)component));
                return;
            }
            Window.Companion.enqueueRenderOperation((Function0<Unit>)new ScrollComponent$updateScrollBar.ScrollComponent$updateScrollBar$2((Object)component));
        }
        if (isHorizontal) {
            component.setWidth(new RelativeConstraint(clampedPercentage));
        }
        else {
            component.setHeight(new RelativeConstraint(clampedPercentage));
        }
        final UIComponent $this$animate$iv = component;
        final int $i$f$animate = 0;
        final UIComponent $this$animate_u24lambda_u2d0$iv = $this$animate$iv;
        final int n = 0;
        final AnimatingConstraints $this$updateScrollBar_u24lambda_u2d11;
        final AnimatingConstraints anim$iv = $this$updateScrollBar_u24lambda_u2d11 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        final int n2 = 0;
        if (isHorizontal) {
            AnimatingConstraints.setXAnimation$default($this$updateScrollBar_u24lambda_u2d11, Animations.IN_SIN, 0.1f, BasicConstraintsKt.basicXConstraint((Function1<? super UIComponent, Float>)new ScrollComponent$updateScrollBar$3.ScrollComponent$updateScrollBar$3$1(scrollPercentage, this)), 0.0f, 8, null);
        }
        else {
            AnimatingConstraints.setYAnimation$default($this$updateScrollBar_u24lambda_u2d11, Animations.IN_SIN, 0.1f, BasicConstraintsKt.basicYConstraint((Function1<? super UIComponent, Float>)new ScrollComponent$updateScrollBar$3.ScrollComponent$updateScrollBar$3$2(scrollPercentage, this)), 0.0f, 8, null);
        }
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    private final float calculateActualWidth() {
        if (this.actualHolder.getChildren().isEmpty()) {
            return 0.0f;
        }
        final ObservableList c = this.actualHolder.getChildren();
        final int n = 0;
        final Iterator iterator = c.iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        UIComponent it = (UIComponent)iterator.next();
        final int n2 = 0;
        float a = it.getRight();
        while (iterator.hasNext()) {
            final UIComponent it2 = (UIComponent)iterator.next();
            final int n3 = 0;
            a = Math.max(a, it2.getRight());
        }
        final float n4 = a;
        final Iterable iterable = c;
        final float n5 = n4;
        final Iterator iterator2 = iterable.iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        it = (UIComponent)iterator2.next();
        final int n6 = 0;
        float a2 = it.getLeft();
        while (iterator2.hasNext()) {
            final UIComponent it2 = (UIComponent)iterator2.next();
            final int n7 = 0;
            a2 = Math.min(a2, it2.getLeft());
        }
        return n5 - a2;
    }
    
    private final float calculateActualHeight() {
        if (this.actualHolder.getChildren().isEmpty()) {
            return 0.0f;
        }
        final ObservableList c = this.actualHolder.getChildren();
        final int n = 0;
        final Iterator iterator = c.iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        UIComponent it = (UIComponent)iterator.next();
        final int n2 = 0;
        float a = it.getBottom();
        while (iterator.hasNext()) {
            final UIComponent it2 = (UIComponent)iterator.next();
            final int n3 = 0;
            a = Math.max(a, it2.getBottom());
        }
        final float n4 = a;
        final Iterable iterable = c;
        final float n5 = n4;
        final Iterator iterator2 = iterable.iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        it = (UIComponent)iterator2.next();
        final int n6 = 0;
        float a2 = it.getTop();
        while (iterator2.hasNext()) {
            final UIComponent it2 = (UIComponent)iterator2.next();
            final int n7 = 0;
            a2 = Math.min(a2, it2.getTop());
        }
        return n5 - a2;
    }
    
    private final ClosedFloatingPointRange<Float> calculateOffsetRange(final boolean isHorizontal) {
        ClosedFloatingPointRange closedFloatingPointRange;
        if (isHorizontal) {
            final float actualWidth = this.calculateActualWidth();
            final float maxNegative = this.getWidth() - actualWidth - this.innerPadding;
            closedFloatingPointRange = (this.horizontalScrollOpposite ? RangesKt.rangeTo(-this.innerPadding, -maxNegative) : RangesKt.rangeTo(maxNegative, this.innerPadding));
        }
        else {
            final float actualHeight = this.calculateActualHeight();
            final float maxNegative = this.getHeight() - actualHeight - this.innerPadding;
            closedFloatingPointRange = (this.verticalScrollOpposite ? RangesKt.rangeTo(-this.innerPadding, -maxNegative) : RangesKt.rangeTo(maxNegative, this.innerPadding));
        }
        return (ClosedFloatingPointRange<Float>)closedFloatingPointRange;
    }
    
    private final void onClick(final float mouseX, final float mouseY, final int mouseButton) {
        if (this.isAutoScrolling) {
            this.isAutoScrolling = false;
            UIComponent.hide$default(this.scrollIconComponent, false, 1, null);
            return;
        }
        if (mouseButton == 2) {
            this.isAutoScrolling = true;
            this.autoScrollBegin = (Pair<Float, Float>)TuplesKt.to((Object)mouseX, (Object)mouseY);
            final UIComponent $this$constrain$iv = this.scrollIconComponent;
            final int $i$f$constrain = 0;
            final UIComponent $this$constrain_u24lambda_u2d0$iv = $this$constrain$iv;
            final int n = 0;
            final UIConstraints $this$onClick_u24lambda_u2d18 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            final int n2 = 0;
            $this$onClick_u24lambda_u2d18.setX(UtilitiesKt.pixels$default(mouseX - 5, false, false, 3, null));
            $this$onClick_u24lambda_u2d18.setY(UtilitiesKt.pixels$default(mouseY - 8, false, false, 3, null));
            this.scrollIconComponent.unhide(false);
        }
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        final float currentScrollAcceleration = this.currentScrollAcceleration;
        final float n = this.scrollAcceleration - 1.0f;
        final Integer animationFPS = this.animationFPS;
        this.currentScrollAcceleration = RangesKt.coerceAtLeast(currentScrollAcceleration - n / ((animationFPS == null) ? 244 : animationFPS), 1.0f);
        if (!this.isAutoScrolling) {
            return;
        }
        if (this.horizontalScrollEnabled) {
            final float xBegin = ((Number)this.autoScrollBegin.getFirst()).floatValue() + this.getLeft();
            final double currentX = UMouse.Scaled.getX();
            final float left = this.getLeft();
            if (currentX <= this.getRight() && left <= currentX) {
                final double deltaX = currentX - xBegin;
                final double percentX = deltaX / (-this.getWidth() / 2);
                this.horizontalOffset += (float)percentX * 5.0f;
                this.needsUpdate = true;
            }
        }
        if (this.verticalScrollEnabled) {
            final float yBegin = ((Number)this.autoScrollBegin.getSecond()).floatValue() + this.getTop();
            final double currentY = UMouse.Scaled.getY();
            final float top = this.getTop();
            if (currentY <= this.getBottom() && top <= currentY) {
                final double deltaY = currentY - yBegin;
                final double percentY = deltaY / (-this.getHeight() / 2);
                this.verticalOffset += (float)percentY * 5.0f;
                this.needsUpdate = true;
            }
        }
        this.needsUpdate = true;
    }
    
    @NotNull
    @Override
    public ScrollComponent addChild(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ScrollComponent $this$addChild_u24lambda_u2d19 = this;
        final int n = 0;
        $this$addChild_u24lambda_u2d19.actualHolder.removeChild($this$addChild_u24lambda_u2d19.getEmptyText());
        $this$addChild_u24lambda_u2d19.actualHolder.addChild(component);
        $this$addChild_u24lambda_u2d19.getAllChildren().add(component);
        $this$addChild_u24lambda_u2d19.needsUpdate = true;
        return this;
    }
    
    @NotNull
    @Override
    public ScrollComponent insertChildAt(@NotNull final UIComponent component, final int index) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ScrollComponent $this$insertChildAt_u24lambda_u2d20 = this;
        final int n = 0;
        if (index < 0 || index > $this$insertChildAt_u24lambda_u2d20.getAllChildren().size()) {
            System.out.println((Object)("Bad index given to insertChildAt (index: " + index + ", children size: " + $this$insertChildAt_u24lambda_u2d20.getAllChildren().size()));
        }
        else {
            $this$insertChildAt_u24lambda_u2d20.actualHolder.removeChild($this$insertChildAt_u24lambda_u2d20.getEmptyText());
            component.setParent($this$insertChildAt_u24lambda_u2d20.actualHolder);
            $this$insertChildAt_u24lambda_u2d20.actualHolder.getChildren().add(index, component);
            $this$insertChildAt_u24lambda_u2d20.getAllChildren().add(index, component);
            $this$insertChildAt_u24lambda_u2d20.needsUpdate = true;
        }
        return this;
    }
    
    @NotNull
    @Override
    public ScrollComponent insertChildBefore(@NotNull final UIComponent newComponent, @NotNull final UIComponent targetComponent) {
        Intrinsics.checkNotNullParameter((Object)newComponent, "newComponent");
        Intrinsics.checkNotNullParameter((Object)targetComponent, "targetComponent");
        final ScrollComponent $this$insertChildBefore_u24lambda_u2d21 = this;
        final int n = 0;
        final int indexOfExisting = $this$insertChildBefore_u24lambda_u2d21.getAllChildren().indexOf(targetComponent);
        if (indexOfExisting == -1) {
            System.out.println((Object)"targetComponent given to insertChildBefore is not a child of this component");
        }
        else {
            $this$insertChildBefore_u24lambda_u2d21.insertChildAt(newComponent, indexOfExisting);
        }
        return this;
    }
    
    @NotNull
    @Override
    public ScrollComponent insertChildAfter(@NotNull final UIComponent newComponent, @NotNull final UIComponent targetComponent) {
        Intrinsics.checkNotNullParameter((Object)newComponent, "newComponent");
        Intrinsics.checkNotNullParameter((Object)targetComponent, "targetComponent");
        final ScrollComponent $this$insertChildAfter_u24lambda_u2d22 = this;
        final int n = 0;
        final int indexOfExisting = $this$insertChildAfter_u24lambda_u2d22.getAllChildren().indexOf(targetComponent);
        if (indexOfExisting == -1) {
            System.out.println((Object)"targetComponent given to insertChildAfter is not a child of this component");
        }
        else {
            $this$insertChildAfter_u24lambda_u2d22.insertChildAt(newComponent, indexOfExisting + 1);
        }
        return this;
    }
    
    @NotNull
    @Override
    public ScrollComponent replaceChild(@NotNull final UIComponent newComponent, @NotNull final UIComponent componentToReplace) {
        Intrinsics.checkNotNullParameter((Object)newComponent, "newComponent");
        Intrinsics.checkNotNullParameter((Object)componentToReplace, "componentToReplace");
        final ScrollComponent $this$replaceChild_u24lambda_u2d23 = this;
        final int n = 0;
        final int indexOfExisting = $this$replaceChild_u24lambda_u2d23.getAllChildren().indexOf(componentToReplace);
        if (indexOfExisting == -1) {
            System.out.println((Object)"componentToReplace given to replaceChild is not a child of this component");
        }
        else {
            $this$replaceChild_u24lambda_u2d23.actualHolder.removeChild($this$replaceChild_u24lambda_u2d23.getEmptyText());
            $this$replaceChild_u24lambda_u2d23.actualHolder.getChildren().remove(indexOfExisting);
            $this$replaceChild_u24lambda_u2d23.getAllChildren().remove(indexOfExisting);
            newComponent.setParent($this$replaceChild_u24lambda_u2d23.actualHolder);
            $this$replaceChild_u24lambda_u2d23.actualHolder.getChildren().add(indexOfExisting, newComponent);
            $this$replaceChild_u24lambda_u2d23.getAllChildren().add(indexOfExisting, newComponent);
            $this$replaceChild_u24lambda_u2d23.needsUpdate = true;
        }
        return this;
    }
    
    @NotNull
    @Override
    public ScrollComponent removeChild(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ScrollComponent $this$removeChild_u24lambda_u2d24 = this;
        final int n = 0;
        if (Intrinsics.areEqual((Object)component, (Object)$this$removeChild_u24lambda_u2d24.scrollIconComponent)) {
            super.removeChild(component);
        }
        else {
            $this$removeChild_u24lambda_u2d24.actualHolder.removeChild(component);
            $this$removeChild_u24lambda_u2d24.getAllChildren().remove(component);
            if ($this$removeChild_u24lambda_u2d24.getAllChildren().isEmpty()) {
                $this$removeChild_u24lambda_u2d24.actualHolder.addChild($this$removeChild_u24lambda_u2d24.getEmptyText());
            }
            $this$removeChild_u24lambda_u2d24.needsUpdate = true;
        }
        return this;
    }
    
    @NotNull
    @Override
    public ScrollComponent clearChildren() {
        final ScrollComponent $this$clearChildren_u24lambda_u2d25 = this;
        final int n = 0;
        $this$clearChildren_u24lambda_u2d25.getAllChildren().clear();
        $this$clearChildren_u24lambda_u2d25.actualHolder.clearChildren();
        $this$clearChildren_u24lambda_u2d25.actualHolder.addChild($this$clearChildren_u24lambda_u2d25.getEmptyText());
        $this$clearChildren_u24lambda_u2d25.needsUpdate = true;
        return this;
    }
    
    @Override
    public boolean alwaysDrawChildren() {
        return true;
    }
    
    @NotNull
    @Override
    public <T> List<T> childrenOfType(@NotNull final Class<T> clazz) {
        Intrinsics.checkNotNullParameter((Object)clazz, "clazz");
        return this.actualHolder.childrenOfType(clazz);
    }
    
    @Override
    public void mouseClick(final double mouseX, final double mouseY, final int button) {
        this.actualHolder.mouseClick(mouseX, mouseY, button);
    }
    
    @NotNull
    @Override
    public UIComponent hitTest(final float x, final float y) {
        return this.actualHolder.hitTest(x, y);
    }
    
    public final void searchAndInsert(@NotNull final List<? extends UIComponent> components, @NotNull final Function1<? super UIComponent, Integer> comparison) {
        Intrinsics.checkNotNullParameter((Object)components, "components");
        Intrinsics.checkNotNullParameter((Object)comparison, "comparison");
        if (components.isEmpty()) {
            return;
        }
        this.actualHolder.getChildren().remove(this.emptyText);
        final int searchIndex = CollectionsKt.binarySearch$default((List)this.actualHolder.getChildren(), 0, 0, (Function1)comparison, 3, (Object)null);
        final Iterable $this$forEach$iv = components;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final UIComponent it = (UIComponent)element$iv;
            final int n = 0;
            it.setParent(this.actualHolder);
        }
        this.allChildren.addAll(components);
        this.actualHolder.getChildren().addAll((searchIndex >= 0) ? searchIndex : (-(searchIndex + 1)), components);
        this.needsUpdate = true;
    }
    
    @NotNull
    public final ScrollComponent setChildren(@NotNull final List<? extends UIComponent> components) {
        Intrinsics.checkNotNullParameter((Object)components, "components");
        final ScrollComponent $this$setChildren_u24lambda_u2d29 = this;
        final int n = 0;
        $this$setChildren_u24lambda_u2d29.actualHolder.getChildren().clear();
        final ObservableList<UIComponent> children = $this$setChildren_u24lambda_u2d29.actualHolder.getChildren();
        final Collection collection = components;
        Collection list;
        if (collection.isEmpty()) {
            final int n2 = 0;
            list = CollectionsKt.listOf((Object)$this$setChildren_u24lambda_u2d29.getEmptyText());
        }
        else {
            list = collection;
        }
        children.addAll(list);
        final Iterable $this$forEach$iv = $this$setChildren_u24lambda_u2d29.actualHolder.getChildren();
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final UIComponent it = (UIComponent)element$iv;
            final int n3 = 0;
            it.setParent($this$setChildren_u24lambda_u2d29.actualHolder);
        }
        $this$setChildren_u24lambda_u2d29.getAllChildren().clear();
        $this$setChildren_u24lambda_u2d29.getAllChildren().addAll($this$setChildren_u24lambda_u2d29.actualHolder.getChildren());
        $this$setChildren_u24lambda_u2d29.needsUpdate = true;
        return this;
    }
    
    private final double width(final ClosedFloatingPointRange<Double> $this$width) {
        return Math.abs(((Number)$this$width.getStart()).doubleValue() - ((Number)$this$width.getEndInclusive()).doubleValue());
    }
    
    private final float width(final ClosedFloatingPointRange<Float> $this$width) {
        return Math.abs(((Number)$this$width.getStart()).floatValue() - ((Number)$this$width.getEndInclusive()).floatValue());
    }
    
    @JvmOverloads
    public ScrollComponent(@NotNull final String emptyString, final float innerPadding, @NotNull final Color scrollIconColor, final boolean horizontalScrollEnabled, final boolean verticalScrollEnabled, final boolean horizontalScrollOpposite, final boolean verticalScrollOpposite, final float pixelsPerScroll, final float scrollAcceleration) {
        Intrinsics.checkNotNullParameter((Object)emptyString, "emptyString");
        Intrinsics.checkNotNullParameter((Object)scrollIconColor, "scrollIconColor");
        this(emptyString, innerPadding, scrollIconColor, horizontalScrollEnabled, verticalScrollEnabled, horizontalScrollOpposite, verticalScrollOpposite, pixelsPerScroll, scrollAcceleration, null, 512, null);
    }
    
    @JvmOverloads
    public ScrollComponent(@NotNull final String emptyString, final float innerPadding, @NotNull final Color scrollIconColor, final boolean horizontalScrollEnabled, final boolean verticalScrollEnabled, final boolean horizontalScrollOpposite, final boolean verticalScrollOpposite, final float pixelsPerScroll) {
        Intrinsics.checkNotNullParameter((Object)emptyString, "emptyString");
        Intrinsics.checkNotNullParameter((Object)scrollIconColor, "scrollIconColor");
        this(emptyString, innerPadding, scrollIconColor, horizontalScrollEnabled, verticalScrollEnabled, horizontalScrollOpposite, verticalScrollOpposite, pixelsPerScroll, 0.0f, null, 768, null);
    }
    
    @JvmOverloads
    public ScrollComponent(@NotNull final String emptyString, final float innerPadding, @NotNull final Color scrollIconColor, final boolean horizontalScrollEnabled, final boolean verticalScrollEnabled, final boolean horizontalScrollOpposite, final boolean verticalScrollOpposite) {
        Intrinsics.checkNotNullParameter((Object)emptyString, "emptyString");
        Intrinsics.checkNotNullParameter((Object)scrollIconColor, "scrollIconColor");
        this(emptyString, innerPadding, scrollIconColor, horizontalScrollEnabled, verticalScrollEnabled, horizontalScrollOpposite, verticalScrollOpposite, 0.0f, 0.0f, null, 896, null);
    }
    
    @JvmOverloads
    public ScrollComponent(@NotNull final String emptyString, final float innerPadding, @NotNull final Color scrollIconColor, final boolean horizontalScrollEnabled, final boolean verticalScrollEnabled, final boolean horizontalScrollOpposite) {
        Intrinsics.checkNotNullParameter((Object)emptyString, "emptyString");
        Intrinsics.checkNotNullParameter((Object)scrollIconColor, "scrollIconColor");
        this(emptyString, innerPadding, scrollIconColor, horizontalScrollEnabled, verticalScrollEnabled, horizontalScrollOpposite, false, 0.0f, 0.0f, null, 960, null);
    }
    
    @JvmOverloads
    public ScrollComponent(@NotNull final String emptyString, final float innerPadding, @NotNull final Color scrollIconColor, final boolean horizontalScrollEnabled, final boolean verticalScrollEnabled) {
        Intrinsics.checkNotNullParameter((Object)emptyString, "emptyString");
        Intrinsics.checkNotNullParameter((Object)scrollIconColor, "scrollIconColor");
        this(emptyString, innerPadding, scrollIconColor, horizontalScrollEnabled, verticalScrollEnabled, false, false, 0.0f, 0.0f, null, 992, null);
    }
    
    @JvmOverloads
    public ScrollComponent(@NotNull final String emptyString, final float innerPadding, @NotNull final Color scrollIconColor, final boolean horizontalScrollEnabled) {
        Intrinsics.checkNotNullParameter((Object)emptyString, "emptyString");
        Intrinsics.checkNotNullParameter((Object)scrollIconColor, "scrollIconColor");
        this(emptyString, innerPadding, scrollIconColor, horizontalScrollEnabled, false, false, false, 0.0f, 0.0f, null, 1008, null);
    }
    
    @JvmOverloads
    public ScrollComponent(@NotNull final String emptyString, final float innerPadding, @NotNull final Color scrollIconColor) {
        Intrinsics.checkNotNullParameter((Object)emptyString, "emptyString");
        Intrinsics.checkNotNullParameter((Object)scrollIconColor, "scrollIconColor");
        this(emptyString, innerPadding, scrollIconColor, false, false, false, false, 0.0f, 0.0f, null, 1016, null);
    }
    
    @JvmOverloads
    public ScrollComponent(@NotNull final String emptyString, final float innerPadding) {
        Intrinsics.checkNotNullParameter((Object)emptyString, "emptyString");
        this(emptyString, innerPadding, null, false, false, false, false, 0.0f, 0.0f, null, 1020, null);
    }
    
    @JvmOverloads
    public ScrollComponent(@NotNull final String emptyString) {
        Intrinsics.checkNotNullParameter((Object)emptyString, "emptyString");
        this(emptyString, 0.0f, null, false, false, false, false, 0.0f, 0.0f, null, 1022, null);
    }
    
    @JvmOverloads
    public ScrollComponent() {
        this(null, 0.0f, null, false, false, false, false, 0.0f, 0.0f, null, 1023, null);
    }
    
    @JvmOverloads
    public final void setHorizontalScrollBarComponent(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        setHorizontalScrollBarComponent$default(this, component, false, 2, null);
    }
    
    @JvmOverloads
    public final void setVerticalScrollBarComponent(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        setVerticalScrollBarComponent$default(this, component, false, 2, null);
    }
    
    @JvmOverloads
    public final <T extends Comparable<? super T>> void sortChildren(@NotNull final Function1<? super UIComponent, ? extends T> comparator) {
        Intrinsics.checkNotNullParameter((Object)comparator, "comparator");
        sortChildren$default(this, false, comparator, 1, null);
    }
    
    private static final /* synthetic */ void updateScrollBar$hide(final UIComponent $this$updateScrollBar_u24hide) {
        UIComponent.hide$default($this$updateScrollBar_u24hide, false, 1, null);
    }
    
    private static final /* synthetic */ void updateScrollBar$unhide(final UIComponent $this$updateScrollBar_u24unhide) {
        UIComponent.unhide$default($this$updateScrollBar_u24unhide, false, 1, null);
    }
    
    @Override
    public /* bridge */ UIComponent addChild(final UIComponent component) {
        return this.addChild(component);
    }
    
    @Override
    public /* bridge */ UIComponent insertChildAt(final UIComponent component, final int index) {
        return this.insertChildAt(component, index);
    }
    
    @Override
    public /* bridge */ UIComponent insertChildBefore(final UIComponent newComponent, final UIComponent targetComponent) {
        return this.insertChildBefore(newComponent, targetComponent);
    }
    
    @Override
    public /* bridge */ UIComponent insertChildAfter(final UIComponent newComponent, final UIComponent targetComponent) {
        return this.insertChildAfter(newComponent, targetComponent);
    }
    
    @Override
    public /* bridge */ UIComponent replaceChild(final UIComponent newComponent, final UIComponent componentToReplace) {
        return this.replaceChild(newComponent, componentToReplace);
    }
    
    @Override
    public /* bridge */ UIComponent removeChild(final UIComponent component) {
        return this.removeChild(component);
    }
    
    @Override
    public /* bridge */ UIComponent clearChildren() {
        return this.clearChildren();
    }
    
    public static final /* synthetic */ boolean access$getHorizontalScrollEnabled$p(final ScrollComponent $this) {
        return $this.horizontalScrollEnabled;
    }
    
    public static final /* synthetic */ void access$onScroll(final ScrollComponent $this, final float delta, final boolean isHorizontal) {
        $this.onScroll(delta, isHorizontal);
    }
    
    public static final /* synthetic */ boolean access$getVerticalScrollEnabled$p(final ScrollComponent $this) {
        return $this.verticalScrollEnabled;
    }
    
    public static final /* synthetic */ void access$setHorizontalDragBeginPos$p(final ScrollComponent $this, final float <set-?>) {
        $this.horizontalDragBeginPos = <set-?>;
    }
    
    public static final /* synthetic */ void access$setVerticalDragBeginPos$p(final ScrollComponent $this, final float <set-?>) {
        $this.verticalDragBeginPos = <set-?>;
    }
    
    public static final /* synthetic */ float access$getHorizontalDragBeginPos$p(final ScrollComponent $this) {
        return $this.horizontalDragBeginPos;
    }
    
    public static final /* synthetic */ void access$updateGrip(final ScrollComponent $this, final UIComponent component, final float mouseCoord, final boolean isHorizontal) {
        $this.updateGrip(component, mouseCoord, isHorizontal);
    }
    
    public static final /* synthetic */ float access$getVerticalDragBeginPos$p(final ScrollComponent $this) {
        return $this.verticalDragBeginPos;
    }
    
    public static final /* synthetic */ void access$updateScrollBar$hide(final UIComponent $receiver) {
        updateScrollBar$hide($receiver);
    }
    
    public static final /* synthetic */ void access$updateScrollBar$unhide(final UIComponent $receiver) {
        updateScrollBar$unhide($receiver);
    }
    
    public static final /* synthetic */ UIContainer access$getActualHolder$p(final ScrollComponent $this) {
        return $this.actualHolder;
    }
    
    public static final /* synthetic */ boolean access$getHorizontalScrollOpposite$p(final ScrollComponent $this) {
        return $this.horizontalScrollOpposite;
    }
    
    public static final /* synthetic */ boolean access$getVerticalScrollOpposite$p(final ScrollComponent $this) {
        return $this.verticalScrollOpposite;
    }
    
    public static final /* synthetic */ void access$updateScrollBar(final ScrollComponent $this, final float scrollPercentage, final float percentageOfParent, final boolean isHorizontal) {
        $this.updateScrollBar(scrollPercentage, percentageOfParent, isHorizontal);
    }
    
    public static final /* synthetic */ void access$onClick(final ScrollComponent $this, final float mouseX, final float mouseY, final int mouseButton) {
        $this.onClick(mouseX, mouseY, mouseButton);
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016R\u001a\u0010\u0006\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&" }, d2 = { "Lgg/essential/elementa/components/ScrollComponent$ScrollChildConstraint;", "Lgg/essential/elementa/constraints/WidthConstraint;", "Lgg/essential/elementa/constraints/HeightConstraint;", "padding", "", "(Lgg/essential/elementa/components/ScrollComponent;F)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "maxConstraint", "Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;", "getPadding", "()F", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "sumConstraint", "Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;", "getHeightImpl", "component", "getWidthImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
    public final class ScrollChildConstraint implements WidthConstraint, HeightConstraint
    {
        private final float padding;
        private float cachedValue;
        private boolean recalculate;
        @Nullable
        private UIComponent constrainTo;
        @NotNull
        private final ChildBasedSizeConstraint sumConstraint;
        @NotNull
        private final ChildBasedMaxSizeConstraint maxConstraint;
        final /* synthetic */ ScrollComponent this$0;
        
        public ScrollChildConstraint(final ScrollComponent this$0, final float padding) {
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
            this.this$0 = this$0;
            super();
            this.padding = padding;
            this.recalculate = true;
            this.sumConstraint = new ChildBasedSizeConstraint(this.padding);
            this.maxConstraint = new ChildBasedMaxSizeConstraint();
        }
        
        public ScrollChildConstraint(final ScrollComponent scrollComponent, float padding, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
            this.this$0 = scrollComponent;
            if ((n & 0x1) != 0x0) {
                padding = 0.0f;
            }
            this(scrollComponent, padding);
        }
        
        public final float getPadding() {
            return this.padding;
        }
        
        @NotNull
        @Override
        public Float getCachedValue() {
            return this.cachedValue;
        }
        
        public void setCachedValue(final float <set-?>) {
            this.cachedValue = <set-?>;
        }
        
        @Override
        public boolean getRecalculate() {
            return this.recalculate;
        }
        
        @Override
        public void setRecalculate(final boolean <set-?>) {
            this.recalculate = <set-?>;
        }
        
        @Nullable
        @Override
        public UIComponent getConstrainTo() {
            return this.constrainTo;
        }
        
        @Override
        public void setConstrainTo(@Nullable final UIComponent <set-?>) {
            this.constrainTo = <set-?>;
        }
        
        @Override
        public float getWidthImpl(@NotNull final UIComponent component) {
            Intrinsics.checkNotNullParameter((Object)component, "component");
            final SizeConstraint sizeConstraint;
            final SizeConstraint constraint = sizeConstraint = (ScrollComponent.access$getHorizontalScrollEnabled$p(this.this$0) ? this.sumConstraint : ((SizeConstraint)this.maxConstraint));
            UIComponent constrainTo;
            if ((constrainTo = this.getConstrainTo()) == null) {
                constrainTo = ScrollComponent.access$getActualHolder$p(this.this$0);
            }
            sizeConstraint.setConstrainTo(constrainTo);
            return constraint.getWidthImpl(component);
        }
        
        @Override
        public float getHeightImpl(@NotNull final UIComponent component) {
            Intrinsics.checkNotNullParameter((Object)component, "component");
            final SizeConstraint sizeConstraint;
            final SizeConstraint constraint = sizeConstraint = (ScrollComponent.access$getVerticalScrollEnabled$p(this.this$0) ? this.sumConstraint : ((SizeConstraint)this.maxConstraint));
            UIComponent constrainTo;
            if ((constrainTo = this.getConstrainTo()) == null) {
                constrainTo = ScrollComponent.access$getActualHolder$p(this.this$0);
            }
            sizeConstraint.setConstrainTo(constrainTo);
            return constraint.getHeightImpl(component);
        }
        
        @Override
        public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
            Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
            Intrinsics.checkNotNullParameter((Object)type, "type");
            switch (ScrollChildConstraint.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1: {
                    visitor.visitChildren(ConstraintType.WIDTH);
                    break;
                }
                case 2: {
                    visitor.visitChildren(ConstraintType.HEIGHT);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(type.getPrettyName());
                }
            }
        }
        
        @Override
        public /* bridge */ Object getCachedValue() {
            return this.getCachedValue();
        }
        
        @Override
        public /* bridge */ void setCachedValue(final Object <set-?>) {
            this.setCachedValue(((Number)<set-?>).floatValue());
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/components/ScrollComponent$Companion;", "", "()V", "getScrollImage", "Lgg/essential/elementa/components/UIImage;", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final UIImage getScrollImage() {
            return UIImage.Companion.ofResourceCached("/vertical-scroll.png");
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
