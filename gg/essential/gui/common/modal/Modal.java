package gg.essential.gui.common.modal;

import kotlin.reflect.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.gui.common.*;
import gg.essential.vigilance.gui.*;
import java.awt.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import kotlin.collections.*;
import java.util.*;
import gg.essential.elementa.transitions.*;
import gg.essential.elementa.constraints.animation.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000D
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\f
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u001a\u0010\u001a\u001a\u00020\u00112\u0010\b\u0002\u0010\u001b\u001a
                                                   \u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00112\u0010\b\u0002\u0010\u001b\u001a
                                                   \u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001cH\u0016R\u001b\u0010\u0002\u001a\u00020\u00038DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000b\u0010\f\u001a\u0004\b	\u0010
                                                   R+\u0010\r\u001a\u001f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0002\b\u0012X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0013\u0010\u0015"\u0004\b\u0016\u0010\u0017R-\u0010\u0018\u001a!\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e¢\u0006\u0002\b\u0012X\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006\u001e""" }, d2 = { "Lgg/essential/gui/common/modal/Modal;", "Lgg/essential/elementa/components/UIBlock;", "container", "Lgg/essential/gui/common/HighlightedBlock;", "backgroundAlpha", "", "fadeTime", "", "(Lgg/essential/gui/common/HighlightedBlock;IF)V", "getContainer", "()Lgg/essential/gui/common/HighlightedBlock;", "container$delegate", "Lkotlin/properties/ReadWriteProperty;", "escapeListener", "Lkotlin/Function3;", "Lgg/essential/elementa/UIComponent;", "", "", "Lkotlin/ExtensionFunctionType;", "isAnimating", "", "()Z", "setAnimating", "(Z)V", "windowListListener", "afterInitialization", "fadeIn", "callback", "Lkotlin/Function0;", "fadeOut", "essential" })
public class Modal extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    private final float fadeTime;
    private boolean isAnimating;
    @Nullable
    private Function3<? super UIComponent, ? super Character, ? super Integer, Unit> windowListListener;
    @NotNull
    private final Function3<UIComponent, Character, Integer, Unit> escapeListener;
    @NotNull
    private final ReadWriteProperty container$delegate;
    
    public Modal(@NotNull final HighlightedBlock container, final int backgroundAlpha, final float fadeTime) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "container"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //    10: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getModalBackground:()Ljava/awt/Color;
        //    13: iload_2         /* backgroundAlpha */
        //    14: invokestatic    gg/essential/elementa/utils/ExtensionsKt.withAlpha:(Ljava/awt/Color;I)Ljava/awt/Color;
        //    17: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //    20: aload_0         /* this */
        //    21: fload_3         /* fadeTime */
        //    22: putfield        gg/essential/gui/common/modal/Modal.fadeTime:F
        //    25: aload_0         /* this */
        //    26: new             Lgg/essential/gui/common/modal/Modal$escapeListener$1;
        //    29: dup            
        //    30: aload_0         /* this */
        //    31: invokespecial   gg/essential/gui/common/modal/Modal$escapeListener$1.<init>:(Lgg/essential/gui/common/modal/Modal;)V
        //    34: checkcast       Lkotlin/jvm/functions/Function3;
        //    37: putfield        gg/essential/gui/common/modal/Modal.escapeListener:Lkotlin/jvm/functions/Function3;
        //    40: aload_0         /* this */
        //    41: aload_1         /* container */
        //    42: checkcast       Lgg/essential/elementa/UIComponent;
        //    45: astore          $this$constrain$iv
        //    47: aload           $this$constrain$iv
        //    49: astore          5
        //    51: aload           5
        //    53: astore          $this$constrain_u24lambda_u2d0$iv
        //    55: aload           $this$constrain_u24lambda_u2d0$iv
        //    57: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    60: astore          7
        //    62: astore          8
        //    64: aload           $this$container_delegate_u24lambda_u2d0
        //    66: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //    69: dup            
        //    70: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //    73: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //    76: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //    79: aload           $this$container_delegate_u24lambda_u2d0
        //    81: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //    84: dup            
        //    85: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //    88: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    91: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    94: aload           8
        //    96: aload           5
        //    98: aload_0         /* this */
        //    99: checkcast       Lgg/essential/elementa/UIComponent;
        //   102: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   105: aload_0         /* this */
        //   106: getstatic       gg/essential/gui/common/modal/Modal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   109: iconst_0       
        //   110: aaload         
        //   111: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   114: putfield        gg/essential/gui/common/modal/Modal.container$delegate:Lkotlin/properties/ReadWriteProperty;
        //   117: aload_0         /* this */
        //   118: checkcast       Lgg/essential/elementa/UIComponent;
        //   121: astore          $this$constrain$iv
        //   123: aload           $this$constrain$iv
        //   125: astore          5
        //   127: aload           5
        //   129: astore          $this$constrain_u24lambda_u2d0$iv
        //   131: aload           $this$constrain_u24lambda_u2d0$iv
        //   133: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   136: astore          $this$_init__u24lambda_u2d1
        //   138: aload           $this$_init__u24lambda_u2d1
        //   140: iconst_0       
        //   141: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   144: checkcast       Ljava/lang/Number;
        //   147: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percentOfWindow:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeWindowConstraint;
        //   150: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   153: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   156: aload           $this$_init__u24lambda_u2d1
        //   158: iconst_0       
        //   159: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   162: checkcast       Ljava/lang/Number;
        //   165: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percentOfWindow:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeWindowConstraint;
        //   168: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   171: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   174: aload           $this$_init__u24lambda_u2d1
        //   176: bipush          100
        //   178: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   181: checkcast       Ljava/lang/Number;
        //   184: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percentOfWindow:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeWindowConstraint;
        //   187: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   190: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   193: aload           $this$_init__u24lambda_u2d1
        //   195: bipush          100
        //   197: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   200: checkcast       Ljava/lang/Number;
        //   203: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percentOfWindow:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeWindowConstraint;
        //   206: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   209: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   212: aload_1         /* container */
        //   213: invokevirtual   gg/essential/gui/common/HighlightedBlock.constrainBasedOnChildren:()Lgg/essential/gui/common/HighlightedBlock;
        //   216: pop            
        //   217: aload_1         /* container */
        //   218: invokevirtual   gg/essential/gui/common/HighlightedBlock.getContentContainer:()Lgg/essential/elementa/UIComponent;
        //   221: astore          $this$constrain$iv
        //   223: aload           $this$constrain$iv
        //   225: astore          5
        //   227: aload           5
        //   229: astore          $this$constrain_u24lambda_u2d0$iv
        //   231: aload           $this$constrain_u24lambda_u2d0$iv
        //   233: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   236: astore          $this$_init__u24lambda_u2d2
        //   238: aload           $this$_init__u24lambda_u2d2
        //   240: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   243: dup            
        //   244: fconst_0       
        //   245: iconst_1       
        //   246: aconst_null    
        //   247: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   250: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   253: bipush          20
        //   255: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   258: checkcast       Ljava/lang/Number;
        //   261: iconst_0       
        //   262: iconst_0       
        //   263: iconst_3       
        //   264: aconst_null    
        //   265: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   268: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   271: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   274: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   277: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   280: aload           $this$_init__u24lambda_u2d2
        //   282: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   285: dup            
        //   286: fconst_0       
        //   287: iconst_1       
        //   288: aconst_null    
        //   289: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   292: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   295: bipush          20
        //   297: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   300: checkcast       Ljava/lang/Number;
        //   303: iconst_0       
        //   304: iconst_0       
        //   305: iconst_3       
        //   306: aconst_null    
        //   307: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   310: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   313: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   316: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   319: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   322: aload_0         /* this */
        //   323: checkcast       Lgg/essential/elementa/UIComponent;
        //   326: astore          $this$onLeftClick$iv
        //   328: aload           $this$onLeftClick$iv
        //   330: new             Lgg/essential/gui/common/modal/Modal$special$$inlined$onLeftClick$1;
        //   333: dup            
        //   334: aload_0         /* this */
        //   335: invokespecial   gg/essential/gui/common/modal/Modal$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/common/modal/Modal;)V
        //   338: checkcast       Lkotlin/jvm/functions/Function2;
        //   341: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   344: pop            
        //   345: return         
        //    MethodParameters:
        //  Name             Flags  
        //  ---------------  -----
        //  container        
        //  backgroundAlpha  
        //  fadeTime         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public Modal(HighlightedBlock container, int backgroundAlpha, float fadeTime, final int n) {
        if ((n & 0x1) != 0x0) {
            container = new HighlightedBlock(VigilancePalette.INSTANCE.getDarkBackground(), VigilancePalette.INSTANCE.getDarkHighlight(), null, VigilancePalette.INSTANCE.getAccent(), 0.0f, null, 116);
        }
        if ((n & 0x2) != 0x0) {
            backgroundAlpha = 150;
        }
        if ((n & 0x4) != 0x0) {
            fadeTime = 0.5f;
        }
        this(container, backgroundAlpha, fadeTime);
    }
    
    protected final boolean isAnimating() {
        return this.isAnimating;
    }
    
    protected final void setAnimating$1385ff() {
        this.isAnimating = false;
    }
    
    @NotNull
    protected final HighlightedBlock getContainer() {
        return (HighlightedBlock)this.container$delegate.getValue((Object)this, (KProperty)Modal.$$delegatedProperties[0]);
    }
    
    @Override
    public void afterInitialization() {
        this.setFloating(true);
    }
    
    public void fadeIn(@Nullable final Function0<Unit> callback) {
        if (this.isAnimating) {
            return;
        }
        this.windowListListener = (Function3<? super UIComponent, ? super Character, ? super Integer, Unit>)CollectionsKt.removeFirstOrNull((List)Window.Companion.of(this).getKeyTypedListeners());
        Window.Companion.of(this).onKeyType(this.escapeListener);
        this.isAnimating = true;
        UIComponent.unhide$default(this, false, 1, null);
        this.setFloating(true);
        new RecursiveFadeInTransition(this.fadeTime, null, 2, null).transition(this, (Function0<Unit>)new Modal$fadeIn.Modal$fadeIn$1(this, (Function0)callback));
    }
    
    public static /* synthetic */ void fadeIn$default$70fdbc49(final Modal modal, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fadeIn");
        }
        modal.fadeIn(null);
    }
    
    public void fadeOut(@Nullable final Function0<Unit> callback) {
        final Function3 windowListListener = this.windowListListener;
        final Window window = Window.Companion.of(this);
        if (windowListListener != null) {
            window.getKeyTypedListeners().add(0, (Function3<UIComponent, Character, Integer, Unit>)windowListListener);
        }
        window.getKeyTypedListeners().remove(this.escapeListener);
        this.hide(true);
        this.setFloating(false);
        if (callback != null) {
            callback.invoke();
        }
    }
    
    public static /* synthetic */ void fadeOut$default$70fdbc49(final Modal modal, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fadeOut");
        }
        modal.fadeOut(null);
    }
    
    public Modal() {
        this(null, 0, 0.0f, 7);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Modal.class, "container", "getContainer()Lgg/essential/gui/common/HighlightedBlock;", 0)) };
    }
}
