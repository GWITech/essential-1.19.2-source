package gg.essential.gui.screenshot.components;

import java.awt.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.animation.*;
import kotlin.ranges.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.events.*;
import kotlin.collections.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.dsl.*;
import java.util.*;
import gg.essential.elementa.utils.*;
import kotlin.*;
import gg.essential.elementa.*;
import gg.essential.universal.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000®\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000b
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000e
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000b
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u001a
                                                   \u0002\u0010\u000f
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   \u0018\u0000 \u008a\u00012\u00020\u0001:\u0006\u008a\u0001\u008b\u0001\u008c\u0001Bm\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020	\u0012\b\b\u0002\u0010
                                                   \u001a\u00020	\u0012\b\b\u0002\u0010\u000b\u001a\u00020	\u0012\b\b\u0002\u0010\f\u001a\u00020	\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012
                                                   \b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u0010\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0010H\u0016JF\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020	26\u0010A\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0004\u0012\u00020,0+J\b\u0010F\u001a\u00020,H\u0016J\b\u0010G\u001a\u00020	H\u0016J\b\u0010H\u001a\u00020,H\u0016J\b\u0010I\u001a\u00020\u0005H\u0002J\b\u0010J\u001a\u00020\u0005H\u0002J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00050L2\u0006\u0010@\u001a\u00020	H\u0002J"\u0010M\u001a\b\u0012\u0004\u0012\u0002HO0N"\u0004\b\u0000\u0010O2\f\u0010P\u001a\b\u0012\u0004\u0012\u0002HO0QH\u0016J\b\u0010R\u001a\u00020\u0000H\u0016J\u0010\u0010S\u001a\u00020,2\u0006\u0010T\u001a\u00020UH\u0016J)\u0010V\u001a\u00020,2!\u0010W\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020	0XJ\u0018\u0010Y\u001a\u00020\u00102\u0006\u0010Z\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\u0005H\u0016J\u0018\u0010\\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\u00102\u0006\u0010^\u001a\u00020\u0010H\u0016J\u0018\u0010_\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u0018H\u0016J\u0018\u0010a\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\u00102\u0006\u0010^\u001a\u00020\u0010H\u0016J \u0010b\u001a\u00020,2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020\u0018H\u0016J \u0010g\u001a\u00020,2\u0006\u0010c\u001a\u00020\u00052\u0006\u0010e\u001a\u00020\u00052\u0006\u0010h\u001a\u00020\u0018H\u0002J\u0018\u0010i\u001a\u00020,2\u0006\u0010j\u001a\u00020\u00052\u0006\u0010@\u001a\u00020	H\u0002J\u0010\u0010k\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0010H\u0016J\u0018\u0010l\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\u00102\u0006\u0010m\u001a\u00020\u0010H\u0016J$\u0010n\u001a\u00020,2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u0010o\u001a\u00020	J\u0010\u0010p\u001a\u00020,2\b\b\u0002\u0010o\u001a\u00020	J\u0010\u0010q\u001a\u00020,2\b\b\u0002\u0010o\u001a\u00020	J\u0010\u0010r\u001a\u00020,2\b\b\u0002\u0010o\u001a\u00020	J\u0010\u0010s\u001a\u00020,2\b\b\u0002\u0010o\u001a\u00020	J(\u0010t\u001a\u00020,2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00100N2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180XJ\u0014\u0010w\u001a\u00020\u00002\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00100NJ\u000e\u0010x\u001a\u00020,2\u0006\u0010y\u001a\u00020\u0003J\u001a\u0010z\u001a\u00020,2\u0006\u0010>\u001a\u00020\u00102\b\b\u0002\u0010{\u001a\u00020	H\u0007J\u001e\u0010|\u001a\u00020,2\u0006\u0010>\u001a\u00020\u00102\u0006\u0010{\u001a\u00020	2\u0006\u0010@\u001a\u00020	J\u001a\u0010}\u001a\u00020,2\u0006\u0010>\u001a\u00020\u00102\b\b\u0002\u0010{\u001a\u00020	H\u0007J8\u0010~\u001a\u00020,"\u000e\b\u0000\u0010O*\b\u0012\u0004\u0012\u0002HO0\u007f2	\b\u0002\u0010\u0080\u0001\u001a\u00020	2\u0013\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002HO0XH\u0007J!\u0010~\u001a\u00020,2\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00100\u0082\u0001j	\u0012\u0004\u0012\u00020\u0010`\u0083\u0001J"\u0010\u0084\u0001\u001a\u00020,2\u0006\u0010>\u001a\u00020\u00102\u0007\u0010\u0085\u0001\u001a\u00020\u00052\u0006\u0010@\u001a\u00020	H\u0002J!\u0010\u0086\u0001\u001a\u00020,2\u0006\u0010D\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u00052\u0006\u0010@\u001a\u00020	H\u0002J\u001d\u0010\u0087\u0001\u001a\u00020\u0005*\u00020\u00052\r\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050LH\u0082\u0002J\u0013\u0010\u0089\u0001\u001a\u00020d*\b\u0012\u0004\u0012\u00020d0LH\u0002J\u0013\u0010\u0089\u0001\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050LH\u0002R\u000e\u0010\u0012\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0004
                                                   \u0002\u0010\u0019R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001bX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010"\u001a\u00020	X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u001e\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b
                                                   \u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b(\u0010&R&\u0010)\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020,0+0*X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\b\u001a\u00020	X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u000b\u001a\u00020	X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010.\u001a\u00020	X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010/\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u00100\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u00101\u001a\u00020	X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u00104\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u00105\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u00106\u001a\u00020	X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u001e\u00107\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b
                                                   \u0000\u001a\u0004\b8\u0010&R\u0011\u00109\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b:\u0010&R&\u0010;\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020,0+0*X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010<\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010
                                                   \u001a\u00020	X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\f\u001a\u00020	X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u008d\u0001""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;", "Lgg/essential/elementa/components/UIContainer;", "emptyString", "", "innerPadding", "", "scrollIconColor", "Ljava/awt/Color;", "horizontalScrollEnabled", "", "verticalScrollEnabled", "horizontalScrollOpposite", "verticalScrollOpposite", "pixelsPerScroll", "scrollAcceleration", "customScissorBoundingBox", "Lgg/essential/elementa/UIComponent;", "(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;)V", "actualHolder", "allChildren", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getAllChildren", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "animationFPS", "", "Ljava/lang/Integer;", "autoScrollBegin", "Lkotlin/Pair;", "currentScrollAcceleration", "emptyText", "Lgg/essential/elementa/components/UIWrappedText;", "getEmptyText", "()Lgg/essential/elementa/components/UIWrappedText;", "horizontalDragBeginPos", "horizontalHideScrollWhenUseless", "<set-?>", "horizontalOffset", "getHorizontalOffset", "()F", "horizontalOverhang", "getHorizontalOverhang", "horizontalScrollAdjustEvents", "", "Lkotlin/Function2;", "", "horizontalScrollBarGrip", "isAutoScrolling", "lastActualHeight", "lastActualWidth", "needsUpdate", "scrollIconComponent", "Lgg/essential/elementa/components/UIImage;", "topGap", "verticalDragBeginPos", "verticalHideScrollWhenUseless", "verticalOffset", "getVerticalOffset", "verticalOverhang", "getVerticalOverhang", "verticalScrollAdjustEvents", "verticalScrollBarGrip", "addChild", "component", "addScrollAdjustEvent", "isHorizontal", "event", "Lkotlin/ParameterName;", "name", "scrollPercentage", "percentageOfParent", "afterInitialization", "alwaysDrawChildren", "animationFrame", "calculateActualHeight", "calculateActualWidth", "calculateOffsetRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "childrenOfType", "", "T", "clazz", "Ljava/lang/Class;", "clearChildren", "draw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "filterChildren", "filter", "Lkotlin/Function1;", "hitTest", "x", "y", "insertChildAfter", "newComponent", "targetComponent", "insertChildAt", "index", "insertChildBefore", "mouseClick", "mouseX", "", "mouseY", "button", "onClick", "mouseButton", "onScroll", "delta", "removeChild", "replaceChild", "componentToReplace", "scrollTo", "smoothScroll", "scrollToBottom", "scrollToLeft", "scrollToRight", "scrollToTop", "searchAndInsert", "components", "comparison", "setChildren", "setEmptyText", "text", "setHorizontalScrollBarComponent", "hideWhenUseless", "setScrollBarComponent", "setVerticalScrollBarComponent", "sortChildren", "", "descending", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "updateGrip", "mouseCoord", "updateScrollBar", "div", "range", "width", "Companion", "DefaultScrollBar", "ScrollChildConstraint", "essential" })
public final class ScreenshotScrollComponent extends UIContainer
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
    private float topGap;
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
    private float lastActualWidth;
    private float lastActualHeight;
    
    @JvmOverloads
    public ScreenshotScrollComponent(@NotNull final String emptyString, @NotNull final Color scrollIconColor, final boolean verticalScrollEnabled, final float pixelsPerScroll, final float scrollAcceleration, @Nullable final UIComponent customScissorBoundingBox) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "emptyString"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* scrollIconColor */
        //     7: ldc             "scrollIconColor"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    16: aload_0         /* this */
        //    17: fconst_0       
        //    18: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.innerPadding:F
        //    21: aload_0         /* this */
        //    22: aload_2         /* scrollIconColor */
        //    23: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.scrollIconColor:Ljava/awt/Color;
        //    26: aload_0         /* this */
        //    27: iconst_0       
        //    28: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.horizontalScrollEnabled:Z
        //    31: aload_0         /* this */
        //    32: iload_3         /* verticalScrollEnabled */
        //    33: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.verticalScrollEnabled:Z
        //    36: aload_0         /* this */
        //    37: iconst_0       
        //    38: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.horizontalScrollOpposite:Z
        //    41: aload_0         /* this */
        //    42: iconst_0       
        //    43: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.verticalScrollOpposite:Z
        //    46: aload_0         /* this */
        //    47: fload           pixelsPerScroll
        //    49: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.pixelsPerScroll:F
        //    52: aload_0         /* this */
        //    53: fload           scrollAcceleration
        //    55: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.scrollAcceleration:F
        //    58: aload_0         /* this */
        //    59: ldc             30.0
        //    61: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.topGap:F
        //    64: aload_0         /* this */
        //    65: new             Lgg/essential/elementa/components/UIContainer;
        //    68: dup            
        //    69: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    72: checkcast       Lgg/essential/elementa/UIComponent;
        //    75: astore          $this$constrain$iv
        //    77: aload           $this$constrain$iv
        //    79: astore          8
        //    81: aload           8
        //    83: astore          $this$constrain_u24lambda_u2d0$iv
        //    85: aload           $this$constrain_u24lambda_u2d0$iv
        //    87: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    90: astore          10
        //    92: astore          11
        //    94: aload           $this$actualHolder_u24lambda_u2d0
        //    96: fconst_0       
        //    97: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   100: checkcast       Ljava/lang/Number;
        //   103: iconst_0       
        //   104: iconst_0       
        //   105: iconst_3       
        //   106: aconst_null    
        //   107: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   110: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   113: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   116: aload           $this$actualHolder_u24lambda_u2d0
        //   118: fconst_0       
        //   119: aload_0         /* this */
        //   120: getfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.topGap:F
        //   123: fsub           
        //   124: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   127: checkcast       Ljava/lang/Number;
        //   130: iconst_0       
        //   131: iconst_0       
        //   132: iconst_3       
        //   133: aconst_null    
        //   134: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   137: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   140: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   143: aload           $this$actualHolder_u24lambda_u2d0
        //   145: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //   148: dup            
        //   149: fconst_1       
        //   150: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(F)V
        //   153: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   156: fconst_0       
        //   157: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   160: checkcast       Ljava/lang/Number;
        //   163: iconst_0       
        //   164: iconst_0       
        //   165: iconst_3       
        //   166: aconst_null    
        //   167: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   170: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   173: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   176: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   179: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   182: aload           $this$actualHolder_u24lambda_u2d0
        //   184: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //   187: dup            
        //   188: fconst_1       
        //   189: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(F)V
        //   192: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   195: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   198: aload           11
        //   200: aload           8
        //   202: checkcast       Lgg/essential/elementa/components/UIContainer;
        //   205: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.actualHolder:Lgg/essential/elementa/components/UIContainer;
        //   208: aload_0         /* this */
        //   209: new             Lgg/essential/elementa/components/UIWrappedText;
        //   212: dup            
        //   213: aload_1         /* emptyString */
        //   214: iconst_0       
        //   215: aconst_null    
        //   216: iconst_1       
        //   217: iconst_0       
        //   218: fconst_0       
        //   219: aconst_null    
        //   220: bipush          118
        //   222: aconst_null    
        //   223: invokespecial   gg/essential/elementa/components/UIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   226: checkcast       Lgg/essential/elementa/UIComponent;
        //   229: astore          $this$constrain$iv
        //   231: aload           $this$constrain$iv
        //   233: astore          8
        //   235: aload           8
        //   237: astore          $this$constrain_u24lambda_u2d0$iv
        //   239: aload           $this$constrain_u24lambda_u2d0$iv
        //   241: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   244: astore          10
        //   246: astore          11
        //   248: aload           $this$emptyText_u24lambda_u2d1
        //   250: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   253: dup            
        //   254: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   257: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   260: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   263: aload           $this$emptyText_u24lambda_u2d1
        //   265: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   268: dup            
        //   269: fconst_0       
        //   270: iconst_0       
        //   271: iconst_3       
        //   272: aconst_null    
        //   273: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   276: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   279: iconst_4       
        //   280: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   283: checkcast       Ljava/lang/Number;
        //   286: iconst_0       
        //   287: iconst_0       
        //   288: iconst_3       
        //   289: aconst_null    
        //   290: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   293: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   296: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   299: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   302: aload_0         /* this */
        //   303: getfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.topGap:F
        //   306: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   309: checkcast       Ljava/lang/Number;
        //   312: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   315: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   318: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   321: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   324: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   327: aload           11
        //   329: aload           8
        //   331: checkcast       Lgg/essential/elementa/components/UIWrappedText;
        //   334: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.emptyText:Lgg/essential/elementa/components/UIWrappedText;
        //   337: aload_0         /* this */
        //   338: getstatic       gg/essential/gui/screenshot/components/ScreenshotScrollComponent.Companion:Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent$Companion;
        //   341: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotScrollComponent$Companion.getScrollImage:()Lgg/essential/elementa/components/UIImage;
        //   344: checkcast       Lgg/essential/elementa/UIComponent;
        //   347: astore          $this$constrain$iv
        //   349: aload           $this$constrain$iv
        //   351: astore          8
        //   353: aload           8
        //   355: astore          $this$constrain_u24lambda_u2d0$iv
        //   357: aload           $this$constrain_u24lambda_u2d0$iv
        //   359: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   362: astore          10
        //   364: astore          11
        //   366: aload           $this$scrollIconComponent_u24lambda_u2d2
        //   368: bipush          10
        //   370: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   373: checkcast       Ljava/lang/Number;
        //   376: iconst_0       
        //   377: iconst_0       
        //   378: iconst_3       
        //   379: aconst_null    
        //   380: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   383: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   386: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   389: aload           $this$scrollIconComponent_u24lambda_u2d2
        //   391: bipush          16
        //   393: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   396: checkcast       Ljava/lang/Number;
        //   399: iconst_0       
        //   400: iconst_0       
        //   401: iconst_3       
        //   402: aconst_null    
        //   403: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   406: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   409: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   412: aload           $this$scrollIconComponent_u24lambda_u2d2
        //   414: aload_0         /* this */
        //   415: getfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.scrollIconColor:Ljava/awt/Color;
        //   418: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   421: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   424: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   427: aload           11
        //   429: aload           8
        //   431: checkcast       Lgg/essential/elementa/components/UIImage;
        //   434: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.scrollIconComponent:Lgg/essential/elementa/components/UIImage;
        //   437: aload_0         /* this */
        //   438: fconst_0       
        //   439: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.horizontalOffset:F
        //   442: aload_0         /* this */
        //   443: fconst_0       
        //   444: aload_0         /* this */
        //   445: getfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.topGap:F
        //   448: fsub           
        //   449: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.verticalOffset:F
        //   452: aload_0         /* this */
        //   453: ldc_w           -1.0
        //   456: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.horizontalDragBeginPos:F
        //   459: aload_0         /* this */
        //   460: ldc_w           -1.0
        //   463: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.verticalDragBeginPos:F
        //   466: aload_0         /* this */
        //   467: iconst_1       
        //   468: anewarray       Lkotlin/jvm/functions/Function2;
        //   471: astore          7
        //   473: aload           7
        //   475: iconst_0       
        //   476: new             Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent$horizontalScrollAdjustEvents$1;
        //   479: dup            
        //   480: aload_0         /* this */
        //   481: invokespecial   gg/essential/gui/screenshot/components/ScreenshotScrollComponent$horizontalScrollAdjustEvents$1.<init>:(Ljava/lang/Object;)V
        //   484: checkcast       Lkotlin/jvm/functions/Function3;
        //   487: iconst_1       
        //   488: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   491: invokestatic    gg/essential/elementa/utils/BindingKt.bindLast:(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;
        //   494: aastore        
        //   495: aload           7
        //   497: invokestatic    kotlin/collections/CollectionsKt.mutableListOf:([Ljava/lang/Object;)Ljava/util/List;
        //   500: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.horizontalScrollAdjustEvents:Ljava/util/List;
        //   503: aload_0         /* this */
        //   504: iconst_1       
        //   505: anewarray       Lkotlin/jvm/functions/Function2;
        //   508: astore          7
        //   510: aload           7
        //   512: iconst_0       
        //   513: new             Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent$verticalScrollAdjustEvents$1;
        //   516: dup            
        //   517: aload_0         /* this */
        //   518: invokespecial   gg/essential/gui/screenshot/components/ScreenshotScrollComponent$verticalScrollAdjustEvents$1.<init>:(Ljava/lang/Object;)V
        //   521: checkcast       Lkotlin/jvm/functions/Function3;
        //   524: iconst_0       
        //   525: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   528: invokestatic    gg/essential/elementa/utils/BindingKt.bindLast:(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;
        //   531: aastore        
        //   532: aload           7
        //   534: invokestatic    kotlin/collections/CollectionsKt.mutableListOf:([Ljava/lang/Object;)Ljava/util/List;
        //   537: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.verticalScrollAdjustEvents:Ljava/util/List;
        //   540: aload_0         /* this */
        //   541: iconst_1       
        //   542: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.needsUpdate:Z
        //   545: aload_0         /* this */
        //   546: ldc_w           -1.0
        //   549: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   552: ldc_w           -1.0
        //   555: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   558: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   561: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.autoScrollBegin:Lkotlin/Pair;
        //   564: aload_0         /* this */
        //   565: fconst_1       
        //   566: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.currentScrollAcceleration:F
        //   569: aload_0         /* this */
        //   570: new             Ljava/util/concurrent/CopyOnWriteArrayList;
        //   573: dup            
        //   574: invokespecial   java/util/concurrent/CopyOnWriteArrayList.<init>:()V
        //   577: putfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.allChildren:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   580: aload_0         /* this */
        //   581: checkcast       Lgg/essential/elementa/UIComponent;
        //   584: astore          $this$constrain$iv
        //   586: aload           $this$constrain$iv
        //   588: astore          8
        //   590: aload           8
        //   592: astore          $this$constrain_u24lambda_u2d0$iv
        //   594: aload           $this$constrain_u24lambda_u2d0$iv
        //   596: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   599: astore          $this$_init__u24lambda_u2d3
        //   601: aload           $this$_init__u24lambda_u2d3
        //   603: new             Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent$ScrollChildConstraint;
        //   606: dup            
        //   607: aload_0         /* this */
        //   608: invokespecial   gg/essential/gui/screenshot/components/ScreenshotScrollComponent$ScrollChildConstraint.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;)V
        //   611: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   614: bipush          100
        //   616: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   619: checkcast       Ljava/lang/Number;
        //   622: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percentOfWindow:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeWindowConstraint;
        //   625: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   628: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtMost:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtMostConstraint;
        //   631: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   634: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   637: aload           $this$_init__u24lambda_u2d3
        //   639: new             Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent$ScrollChildConstraint;
        //   642: dup            
        //   643: aload_0         /* this */
        //   644: invokespecial   gg/essential/gui/screenshot/components/ScreenshotScrollComponent$ScrollChildConstraint.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;)V
        //   647: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   650: bipush          100
        //   652: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   655: checkcast       Ljava/lang/Number;
        //   658: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percentOfWindow:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeWindowConstraint;
        //   661: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   664: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtMost:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtMostConstraint;
        //   667: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   670: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   673: aload_0         /* this */
        //   674: getfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.verticalScrollEnabled:Z
        //   677: ifne            691
        //   680: new             Ljava/lang/IllegalArgumentException;
        //   683: dup            
        //   684: ldc_w           "ScrollComponent must have at least one direction of scrolling enabled"
        //   687: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   690: athrow         
        //   691: aload_0         /* this */
        //   692: aload_0         /* this */
        //   693: getfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.actualHolder:Lgg/essential/elementa/components/UIContainer;
        //   696: checkcast       Lgg/essential/elementa/UIComponent;
        //   699: invokespecial   gg/essential/elementa/components/UIContainer.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   702: pop            
        //   703: aload_0         /* this */
        //   704: getfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.actualHolder:Lgg/essential/elementa/components/UIContainer;
        //   707: aload_0         /* this */
        //   708: getfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.emptyText:Lgg/essential/elementa/components/UIWrappedText;
        //   711: checkcast       Lgg/essential/elementa/UIComponent;
        //   714: invokevirtual   gg/essential/elementa/components/UIContainer.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   717: pop            
        //   718: aload_0         /* this */
        //   719: iconst_1       
        //   720: anewarray       Lgg/essential/elementa/effects/Effect;
        //   723: astore          7
        //   725: aload           7
        //   727: iconst_0       
        //   728: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   731: dup            
        //   732: aload           customScissorBoundingBox
        //   734: iconst_0       
        //   735: iconst_2       
        //   736: aconst_null    
        //   737: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   740: checkcast       Lgg/essential/elementa/effects/Effect;
        //   743: aastore        
        //   744: aload           7
        //   746: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotScrollComponent.enableEffects:([Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   749: pop            
        //   750: aload_0         /* this */
        //   751: getfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.emptyText:Lgg/essential/elementa/components/UIWrappedText;
        //   754: aload_0         /* this */
        //   755: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotScrollComponent.getFontProvider:()Lgg/essential/elementa/font/FontProvider;
        //   758: invokevirtual   gg/essential/elementa/components/UIWrappedText.setFontProvider:(Lgg/essential/elementa/font/FontProvider;)Lgg/essential/elementa/UIComponent;
        //   761: pop            
        //   762: aload_0         /* this */
        //   763: aload_0         /* this */
        //   764: getfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.scrollIconComponent:Lgg/essential/elementa/components/UIImage;
        //   767: checkcast       Lgg/essential/elementa/UIComponent;
        //   770: invokespecial   gg/essential/elementa/components/UIContainer.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   773: pop            
        //   774: aload_0         /* this */
        //   775: getfield        gg/essential/gui/screenshot/components/ScreenshotScrollComponent.scrollIconComponent:Lgg/essential/elementa/components/UIImage;
        //   778: iconst_1       
        //   779: invokevirtual   gg/essential/elementa/components/UIImage.hide:(Z)V
        //   782: aload_0         /* this */
        //   783: new             Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent$2;
        //   786: dup            
        //   787: aload_0         /* this */
        //   788: invokespecial   gg/essential/gui/screenshot/components/ScreenshotScrollComponent$2.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;)V
        //   791: checkcast       Lkotlin/jvm/functions/Function2;
        //   794: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotScrollComponent.onMouseScroll:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   797: pop            
        //   798: aload_0         /* this */
        //   799: new             Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent$3;
        //   802: dup            
        //   803: aload_0         /* this */
        //   804: invokespecial   gg/essential/gui/screenshot/components/ScreenshotScrollComponent$3.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;)V
        //   807: checkcast       Lkotlin/jvm/functions/Function2;
        //   810: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotScrollComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   813: pop            
        //   814: return         
        //    MethodParameters:
        //  Name                      Flags  
        //  ------------------------  -----
        //  emptyString               
        //  scrollIconColor           
        //  verticalScrollEnabled     
        //  pixelsPerScroll           
        //  scrollAcceleration        
        //  customScissorBoundingBox  
        //    StackMapTable: 00 01 FF 02 B3 00 07 07 00 02 00 00 00 00 00 07 00 DE 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public ScreenshotScrollComponent(String emptyString, Color scrollIconColor, boolean verticalScrollEnabled, float pixelsPerScroll, float scrollAcceleration, UIComponent customScissorBoundingBox, final int n) {
        if ((n & 0x1) != 0x0) {
            emptyString = "";
        }
        if ((n & 0x4) != 0x0) {
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            scrollIconColor = white;
        }
        if ((n & 0x10) != 0x0) {
            verticalScrollEnabled = true;
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
        this(emptyString, scrollIconColor, verticalScrollEnabled, pixelsPerScroll, scrollAcceleration, customScissorBoundingBox);
    }
    
    @NotNull
    public final UIWrappedText getEmptyText() {
        return this.emptyText;
    }
    
    public final float getVerticalOffset() {
        return this.verticalOffset;
    }
    
    @NotNull
    public final CopyOnWriteArrayList<UIComponent> getAllChildren() {
        return this.allChildren;
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
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
            final UIComponent $this$animate_u24lambda_u2d0$iv = this.actualHolder;
            final AnimatingConstraints $this$draw_u24lambda_u2d4;
            final AnimatingConstraints anim$iv = $this$draw_u24lambda_u2d4 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
            this.horizontalOffset = (horizontalRange.isEmpty() ? 0.0f : ((Number)RangesKt.coerceIn((Comparable)this.horizontalOffset, horizontalRange)).floatValue());
            this.verticalOffset = (verticalRange.isEmpty() ? (0.0f - this.topGap) : ((Number)RangesKt.coerceIn((Comparable)this.verticalOffset, verticalRange)).floatValue());
            AnimatingConstraints.setXAnimation$default($this$draw_u24lambda_u2d4, Animations.IN_SIN, 0.1f, UtilitiesKt.pixels$default(this.horizontalOffset, false, false, 3, null), 0.0f, 8, null);
            AnimatingConstraints.setYAnimation$default($this$draw_u24lambda_u2d4, Animations.IN_SIN, 0.1f, UtilitiesKt.pixels$default(this.verticalOffset, false, false, 3, null), 0.0f, 8, null);
            $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
            float percent = (0.0f - this.horizontalOffset) / this.width((ClosedFloatingPointRange<Float>)horizontalRange);
            float percentageOfParent = this.getWidth() / actualWidth;
            Iterable $this$forEach$iv = this.horizontalScrollAdjustEvents;
            for (final Object element$iv : $this$forEach$iv) {
                final Function2 it = (Function2)element$iv;
                it.invoke((Object)percent, (Object)percentageOfParent);
            }
            percent = (0.0f - this.verticalOffset - this.topGap) / this.width((ClosedFloatingPointRange<Float>)verticalRange);
            percentageOfParent = this.getHeight() / actualHeight;
            $this$forEach$iv = this.verticalScrollAdjustEvents;
            for (final Object element$iv : $this$forEach$iv) {
                final Function2 it = (Function2)element$iv;
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
    
    public final void scrollTo$483d6f3f(final float horizontalOffset, final float verticalOffset) {
        final ClosedFloatingPointRange horizontalRange = this.calculateOffsetRange(true);
        final ClosedFloatingPointRange verticalRange = this.calculateOffsetRange(false);
        this.horizontalOffset = (horizontalRange.isEmpty() ? 0.0f : ((Number)RangesKt.coerceIn((Comparable)horizontalOffset, horizontalRange)).floatValue());
        this.verticalOffset = (verticalRange.isEmpty() ? (0.0f - this.topGap) : ((Number)RangesKt.coerceIn((Comparable)verticalOffset, verticalRange)).floatValue());
        this.actualHolder.setX(UtilitiesKt.pixels$default(this.horizontalOffset, false, false, 3, null));
        this.actualHolder.setY(UtilitiesKt.pixels$default(this.verticalOffset, false, false, 3, null));
        final float horizontalFraction = this.div(0.0f - this.horizontalOffset, (ClosedFloatingPointRange<Float>)horizontalRange);
        final float verticalFraction = this.div(0.0f - this.verticalOffset - this.topGap, (ClosedFloatingPointRange<Float>)verticalRange);
        Iterable $this$forEach$iv = this.horizontalScrollAdjustEvents;
        for (final Object element$iv : $this$forEach$iv) {
            final Function2 it = (Function2)element$iv;
            it.invoke((Object)horizontalFraction, (Object)(this.getWidth() / this.calculateActualWidth()));
        }
        $this$forEach$iv = this.verticalScrollAdjustEvents;
        for (final Object element$iv : $this$forEach$iv) {
            final Function2 it = (Function2)element$iv;
            it.invoke((Object)verticalFraction, (Object)(this.getHeight() / this.calculateActualHeight()));
        }
    }
    
    public static /* synthetic */ void scrollTo$default$30c8be7$658e097d(final ScreenshotScrollComponent screenshotScrollComponent, final float verticalOffset) {
        screenshotScrollComponent.scrollTo$483d6f3f(screenshotScrollComponent.horizontalOffset, verticalOffset);
    }
    
    private final float div(final float $this$div, final ClosedFloatingPointRange<Float> range) {
        final float width = this.width(range);
        return (width == 0.0f) ? 0.0f : ($this$div / width);
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
    public final void setVerticalScrollBarComponent$46e808b7(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        this.setScrollBarComponent$69e63f03$46e808b7(component);
    }
    
    public final void setScrollBarComponent$69e63f03$46e808b7(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        this.verticalScrollBarGrip = component;
        this.verticalHideScrollWhenUseless = true;
        component.onMouseScroll((Function2<? super UIComponent, ? super UIScrollEvent, Unit>)new ScreenshotScrollComponent$setScrollBarComponent.ScreenshotScrollComponent$setScrollBarComponent$1(this));
        component.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new ScreenshotScrollComponent$setScrollBarComponent.ScreenshotScrollComponent$setScrollBarComponent$2(this));
        component.onMouseDrag((Function4<? super UIComponent, ? super Float, ? super Float, ? super Integer, Unit>)new ScreenshotScrollComponent$setScrollBarComponent.ScreenshotScrollComponent$setScrollBarComponent$3(this, component));
        component.onMouseRelease((Function1<? super UIComponent, Unit>)new ScreenshotScrollComponent$setScrollBarComponent.ScreenshotScrollComponent$setScrollBarComponent$4(this));
        this.needsUpdate = true;
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
            final float newPos = component.getLeft() + dragDelta - minCoord;
            final float percentage = newPos / (maxCoord - minCoord);
            this.horizontalOffset = -(percentage * this.calculateActualWidth());
        }
        else {
            final float minCoord = component.getParent().getTop();
            final float maxCoord = component.getParent().getBottom();
            final float dragDelta = mouseCoord - this.verticalDragBeginPos;
            final float n = -this.topGap;
            final float newPos = component.getTop() + dragDelta - minCoord;
            final float percentage = newPos / (maxCoord - minCoord);
            this.verticalOffset = n + -(percentage * this.calculateActualHeight());
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
        if (!isHorizontal && this.verticalHideScrollWhenUseless) {
            if (clampedPercentage == 1.0f) {
                Window.Companion.enqueueRenderOperation((Function0<Unit>)new ScreenshotScrollComponent$updateScrollBar.ScreenshotScrollComponent$updateScrollBar$1((Object)component));
                return;
            }
            Window.Companion.enqueueRenderOperation((Function0<Unit>)new ScreenshotScrollComponent$updateScrollBar.ScreenshotScrollComponent$updateScrollBar$2((Object)component));
        }
        if (isHorizontal) {
            component.setWidth(ConstraintsKt.coerceAtLeast(new RelativeConstraint(clampedPercentage), UtilitiesKt.getPixels(10)));
        }
        else {
            component.setHeight(ConstraintsKt.coerceAtLeast(new RelativeConstraint(clampedPercentage), UtilitiesKt.getPixels(10)));
        }
        final UIComponent $this$animate_u24lambda_u2d0$iv;
        final UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = component;
        final AnimatingConstraints $this$updateScrollBar_u24lambda_u2d11;
        final AnimatingConstraints anim$iv = $this$updateScrollBar_u24lambda_u2d11 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        if (isHorizontal) {
            AnimatingConstraints.setXAnimation$default($this$updateScrollBar_u24lambda_u2d11, Animations.IN_SIN, 0.1f, BasicConstraintsKt.basicXConstraint((Function1<? super UIComponent, Float>)new ScreenshotScrollComponent$updateScrollBar$3.ScreenshotScrollComponent$updateScrollBar$3$1(scrollPercentage, this)), 0.0f, 8, null);
        }
        else {
            AnimatingConstraints.setYAnimation$default($this$updateScrollBar_u24lambda_u2d11, Animations.IN_SIN, 0.1f, BasicConstraintsKt.basicYConstraint((Function1<? super UIComponent, Float>)new ScreenshotScrollComponent$updateScrollBar$3.ScreenshotScrollComponent$updateScrollBar$3$2(scrollPercentage, this)), 0.0f, 8, null);
        }
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    private final float calculateActualWidth() {
        if (this.actualHolder.getChildren().isEmpty()) {
            return 0.0f;
        }
        final ObservableList c = this.actualHolder.getChildren();
        final Iterator iterator = c.iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        UIComponent it = (UIComponent)iterator.next();
        float a = it.getRight();
        while (iterator.hasNext()) {
            final UIComponent it2 = (UIComponent)iterator.next();
            a = Math.max(a, it2.getRight());
        }
        final float n = a;
        final Iterable iterable = c;
        final float n2 = n;
        final Iterator iterator2 = iterable.iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        it = (UIComponent)iterator2.next();
        float a2 = it.getLeft();
        while (iterator2.hasNext()) {
            final UIComponent it2 = (UIComponent)iterator2.next();
            a2 = Math.min(a2, it2.getLeft());
        }
        return n2 - a2;
    }
    
    private final float calculateActualHeight() {
        if (this.actualHolder.getChildren().isEmpty()) {
            return 0.0f;
        }
        final ObservableList c = this.actualHolder.getChildren();
        final Iterator iterator = c.iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        UIComponent it = (UIComponent)iterator.next();
        float a = it.getBottom();
        while (iterator.hasNext()) {
            final UIComponent it2 = (UIComponent)iterator.next();
            a = Math.max(a, it2.getBottom());
        }
        final float n = a;
        final Iterable iterable = c;
        final float n2 = n;
        final Iterator iterator2 = iterable.iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        it = (UIComponent)iterator2.next();
        float min = it.getTop() + this.topGap;
        while (iterator2.hasNext()) {
            final UIComponent it2 = (UIComponent)iterator2.next();
            min = Math.min(min, it2.getTop() + this.topGap);
        }
        return n2 - min;
    }
    
    private final ClosedFloatingPointRange<Float> calculateOffsetRange(final boolean isHorizontal) {
        ClosedFloatingPointRange closedFloatingPointRange;
        if (isHorizontal) {
            final float actualWidth = this.calculateActualWidth();
            final float maxNegative = this.getWidth() - actualWidth - 0.0f;
            closedFloatingPointRange = RangesKt.rangeTo(maxNegative, 0.0f);
        }
        else {
            final float actualHeight = this.calculateActualHeight();
            final float maxNegative = this.getHeight() - actualHeight - 0.0f - this.topGap;
            closedFloatingPointRange = RangesKt.rangeTo(maxNegative, 0.0f - this.topGap);
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
            final UIComponent $this$constrain_u24lambda_u2d0$iv;
            final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this.scrollIconComponent;
            final UIConstraints $this$onClick_u24lambda_u2d18 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$onClick_u24lambda_u2d18.setX(UtilitiesKt.pixels$default(mouseX - 5.0f, false, false, 3, null));
            $this$onClick_u24lambda_u2d18.setY(UtilitiesKt.pixels$default(mouseY - 8.0f, false, false, 3, null));
            this.scrollIconComponent.unhide(false);
        }
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        final float currentScrollAcceleration = this.currentScrollAcceleration;
        final float n = this.scrollAcceleration - 1.0f;
        final Integer animationFPS = this.animationFPS;
        this.currentScrollAcceleration = RangesKt.coerceAtLeast(currentScrollAcceleration - n / ((animationFPS != null) ? animationFPS : 244), 1.0f);
        if (!this.isAutoScrolling) {
            return;
        }
        if (this.verticalScrollEnabled) {
            final float yBegin = ((Number)this.autoScrollBegin.getSecond()).floatValue() + this.getTop();
            final double currentY = UMouse.Scaled.getY();
            final float top = this.getTop();
            if (currentY <= this.getBottom() && top <= currentY) {
                final double deltaY = currentY - yBegin;
                final double percentY = deltaY / (-this.getHeight() / 2.0f);
                this.verticalOffset += (float)percentY * 5.0f;
                this.needsUpdate = true;
            }
        }
        this.needsUpdate = true;
    }
    
    @NotNull
    @Override
    public ScreenshotScrollComponent addChild(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ScreenshotScrollComponent $this$addChild_u24lambda_u2d19 = this;
        $this$addChild_u24lambda_u2d19.actualHolder.removeChild($this$addChild_u24lambda_u2d19.emptyText);
        $this$addChild_u24lambda_u2d19.actualHolder.addChild(component);
        $this$addChild_u24lambda_u2d19.allChildren.add(component);
        $this$addChild_u24lambda_u2d19.needsUpdate = true;
        return this;
    }
    
    @NotNull
    @Override
    public ScreenshotScrollComponent insertChildAt(@NotNull final UIComponent component, final int index) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ScreenshotScrollComponent $this$insertChildAt_u24lambda_u2d20 = this;
        if (index < 0 || index > $this$insertChildAt_u24lambda_u2d20.allChildren.size()) {
            System.out.println("Bad index given to insertChildAt (index: " + index + ", children size: " + $this$insertChildAt_u24lambda_u2d20.allChildren.size());
        }
        else {
            $this$insertChildAt_u24lambda_u2d20.actualHolder.removeChild($this$insertChildAt_u24lambda_u2d20.emptyText);
            component.setParent($this$insertChildAt_u24lambda_u2d20.actualHolder);
            $this$insertChildAt_u24lambda_u2d20.actualHolder.getChildren().add(index, component);
            $this$insertChildAt_u24lambda_u2d20.allChildren.add(index, component);
            $this$insertChildAt_u24lambda_u2d20.needsUpdate = true;
        }
        return this;
    }
    
    @NotNull
    @Override
    public ScreenshotScrollComponent insertChildBefore(@NotNull final UIComponent newComponent, @NotNull final UIComponent targetComponent) {
        Intrinsics.checkNotNullParameter((Object)newComponent, "newComponent");
        Intrinsics.checkNotNullParameter((Object)targetComponent, "targetComponent");
        final ScreenshotScrollComponent $this$insertChildBefore_u24lambda_u2d21 = this;
        final int indexOfExisting = $this$insertChildBefore_u24lambda_u2d21.allChildren.indexOf(targetComponent);
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
    public ScreenshotScrollComponent insertChildAfter(@NotNull final UIComponent newComponent, @NotNull final UIComponent targetComponent) {
        Intrinsics.checkNotNullParameter((Object)newComponent, "newComponent");
        Intrinsics.checkNotNullParameter((Object)targetComponent, "targetComponent");
        final ScreenshotScrollComponent $this$insertChildAfter_u24lambda_u2d22 = this;
        final int indexOfExisting = $this$insertChildAfter_u24lambda_u2d22.allChildren.indexOf(targetComponent);
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
    public ScreenshotScrollComponent replaceChild(@NotNull final UIComponent newComponent, @NotNull final UIComponent componentToReplace) {
        Intrinsics.checkNotNullParameter((Object)newComponent, "newComponent");
        Intrinsics.checkNotNullParameter((Object)componentToReplace, "componentToReplace");
        final ScreenshotScrollComponent $this$replaceChild_u24lambda_u2d23 = this;
        final int indexOfExisting = $this$replaceChild_u24lambda_u2d23.allChildren.indexOf(componentToReplace);
        if (indexOfExisting == -1) {
            System.out.println((Object)"componentToReplace given to replaceChild is not a child of this component");
        }
        else {
            $this$replaceChild_u24lambda_u2d23.actualHolder.removeChild($this$replaceChild_u24lambda_u2d23.emptyText);
            $this$replaceChild_u24lambda_u2d23.actualHolder.getChildren().remove(indexOfExisting);
            $this$replaceChild_u24lambda_u2d23.allChildren.remove(indexOfExisting);
            newComponent.setParent($this$replaceChild_u24lambda_u2d23.actualHolder);
            $this$replaceChild_u24lambda_u2d23.actualHolder.getChildren().add(indexOfExisting, newComponent);
            $this$replaceChild_u24lambda_u2d23.allChildren.add(indexOfExisting, newComponent);
            $this$replaceChild_u24lambda_u2d23.needsUpdate = true;
        }
        return this;
    }
    
    @NotNull
    @Override
    public ScreenshotScrollComponent removeChild(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final ScreenshotScrollComponent $this$removeChild_u24lambda_u2d24 = this;
        if (Intrinsics.areEqual((Object)component, (Object)$this$removeChild_u24lambda_u2d24.scrollIconComponent)) {
            super.removeChild(component);
        }
        else {
            $this$removeChild_u24lambda_u2d24.actualHolder.removeChild(component);
            $this$removeChild_u24lambda_u2d24.allChildren.remove(component);
            if ($this$removeChild_u24lambda_u2d24.allChildren.isEmpty()) {
                $this$removeChild_u24lambda_u2d24.actualHolder.addChild($this$removeChild_u24lambda_u2d24.emptyText);
            }
            $this$removeChild_u24lambda_u2d24.needsUpdate = true;
        }
        return this;
    }
    
    @NotNull
    @Override
    public ScreenshotScrollComponent clearChildren() {
        final ScreenshotScrollComponent $this$clearChildren_u24lambda_u2d25 = this;
        $this$clearChildren_u24lambda_u2d25.allChildren.clear();
        $this$clearChildren_u24lambda_u2d25.actualHolder.clearChildren();
        $this$clearChildren_u24lambda_u2d25.actualHolder.addChild($this$clearChildren_u24lambda_u2d25.emptyText);
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
    
    private final float width(final ClosedFloatingPointRange<Float> $this$width) {
        return Math.abs(((Number)$this$width.getStart()).floatValue() - ((Number)$this$width.getEndInclusive()).floatValue());
    }
    
    @JvmOverloads
    public ScreenshotScrollComponent() {
        this(null, null, false, 0.0f, 0.0f, null, 1023);
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
    
    public static final /* synthetic */ boolean access$getHorizontalScrollEnabled$p(final ScreenshotScrollComponent $this) {
        return false;
    }
    
    public static final /* synthetic */ void access$onScroll(final ScreenshotScrollComponent $this, final float delta, final boolean isHorizontal) {
        $this.onScroll(delta, isHorizontal);
    }
    
    public static final /* synthetic */ boolean access$getVerticalScrollEnabled$p(final ScreenshotScrollComponent $this) {
        return $this.verticalScrollEnabled;
    }
    
    public static final /* synthetic */ void access$setVerticalDragBeginPos$p(final ScreenshotScrollComponent $this, final float <set-?>) {
        $this.verticalDragBeginPos = <set-?>;
    }
    
    public static final /* synthetic */ void access$updateGrip(final ScreenshotScrollComponent $this, final UIComponent component, final float mouseCoord, final boolean isHorizontal) {
        $this.updateGrip(component, mouseCoord, isHorizontal);
    }
    
    public static final /* synthetic */ float access$getVerticalDragBeginPos$p(final ScreenshotScrollComponent $this) {
        return $this.verticalDragBeginPos;
    }
    
    public static final /* synthetic */ UIContainer access$getActualHolder$p(final ScreenshotScrollComponent $this) {
        return $this.actualHolder;
    }
    
    public static final /* synthetic */ boolean access$getHorizontalScrollOpposite$p(final ScreenshotScrollComponent $this) {
        return false;
    }
    
    public static final /* synthetic */ boolean access$getVerticalScrollOpposite$p(final ScreenshotScrollComponent $this) {
        return false;
    }
    
    public static final /* synthetic */ void access$updateScrollBar(final ScreenshotScrollComponent $this, final float scrollPercentage, final float percentageOfParent, final boolean isHorizontal) {
        $this.updateScrollBar(scrollPercentage, percentageOfParent, isHorizontal);
    }
    
    public static final /* synthetic */ void access$onClick(final ScreenshotScrollComponent $this, final float mouseX, final float mouseY, final int mouseButton) {
        $this.onClick(mouseX, mouseY, mouseButton);
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000H
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u0007
                                                       \u0002\b\u0007
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0005
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0010\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016R\u001a\u0010\u0006\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\u0007\u0010\b"\u0004\b	\u0010
                                                       R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\r\u0010\u000e"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\u0017\u0010\u0018"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006&""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent$ScrollChildConstraint;", "Lgg/essential/elementa/constraints/WidthConstraint;", "Lgg/essential/elementa/constraints/HeightConstraint;", "padding", "", "(Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;F)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "maxConstraint", "Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;", "getPadding", "()F", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "sumConstraint", "Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;", "getHeightImpl", "component", "getWidthImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "essential" })
    public final class ScrollChildConstraint implements HeightConstraint, WidthConstraint
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
        final /* synthetic */ ScreenshotScrollComponent this$0;
        
        public ScrollChildConstraint(final ScreenshotScrollComponent this$0, final byte b) {
            this.this$0 = this$0;
            super();
            this.padding = 0.0f;
            this.recalculate = true;
            this.sumConstraint = new ChildBasedSizeConstraint(0.0f);
            this.maxConstraint = new ChildBasedMaxSizeConstraint();
        }
        
        public ScrollChildConstraint(final ScreenshotScrollComponent this$0) {
            this((byte)0);
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
            final SizeConstraint constraint = sizeConstraint = (ScreenshotScrollComponent.access$getHorizontalScrollEnabled$p(this.this$0) ? this.sumConstraint : ((SizeConstraint)this.maxConstraint));
            UIComponent constrainTo;
            if ((constrainTo = this.getConstrainTo()) == null) {
                constrainTo = ScreenshotScrollComponent.access$getActualHolder$p(this.this$0);
            }
            sizeConstraint.setConstrainTo(constrainTo);
            return constraint.getWidthImpl(component);
        }
        
        @Override
        public float getHeightImpl(@NotNull final UIComponent component) {
            Intrinsics.checkNotNullParameter((Object)component, "component");
            final SizeConstraint sizeConstraint;
            final SizeConstraint constraint = sizeConstraint = (ScreenshotScrollComponent.access$getVerticalScrollEnabled$p(this.this$0) ? this.sumConstraint : ((SizeConstraint)this.maxConstraint));
            UIComponent constrainTo;
            if ((constrainTo = this.getConstrainTo()) == null) {
                constrainTo = ScreenshotScrollComponent.access$getActualHolder$p(this.this$0);
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
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0012
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent$Companion;", "", "()V", "getScrollImage", "Lgg/essential/elementa/components/UIImage;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final UIImage getScrollImage() {
            return UIImage.Companion.ofResourceCached("/vertical-scroll.png");
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
