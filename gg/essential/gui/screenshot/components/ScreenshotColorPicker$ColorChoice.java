package gg.essential.gui.screenshot.components;

import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000(
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020
                                                   0	¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice;", "Lgg/essential/elementa/components/UIBlock;", "containedColor", "Lgg/essential/elementa/state/State;", "Lgg/essential/gui/screenshot/components/HSBColor;", "index", "", "(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;Lgg/essential/elementa/state/State;I)V", "active", "Lgg/essential/elementa/state/MappedState;", "", "getActive", "()Lgg/essential/elementa/state/MappedState;", "colorBlock", "getColorBlock", "()Lgg/essential/elementa/components/UIBlock;", "colorBlock$delegate", "Lkotlin/properties/ReadWriteProperty;", "getContainedColor", "()Lgg/essential/elementa/state/State;", "getIndex", "()I", "essential" })
public final class ColorChoice extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final State<HSBColor> containedColor;
    private final int index;
    @NotNull
    private final MappedState<Integer, Boolean> active;
    final /* synthetic */ ScreenshotColorPicker this$0;
    
    public ColorChoice(@NotNull final ScreenshotColorPicker this$0, final State<HSBColor> containedColor, final int index) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "containedColor"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: aload_1         /* this$0 */
        //     8: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.this$0:Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;
        //    11: aload_0         /* this */
        //    12: aconst_null    
        //    13: iconst_1       
        //    14: aconst_null    
        //    15: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    18: aload_0         /* this */
        //    19: aload_2         /* containedColor */
        //    20: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.containedColor:Lgg/essential/elementa/state/State;
        //    23: aload_0         /* this */
        //    24: iload_3         /* index */
        //    25: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.index:I
        //    28: aload_0         /* this */
        //    29: aload_0         /* this */
        //    30: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.this$0:Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;
        //    33: invokestatic    gg/essential/gui/screenshot/components/ScreenshotColorPicker.access$getActiveColorIndex$p:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;)Lgg/essential/elementa/state/BasicState;
        //    36: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$active$1;
        //    39: dup            
        //    40: aload_0         /* this */
        //    41: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$active$1.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice;)V
        //    44: checkcast       Lkotlin/jvm/functions/Function1;
        //    47: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    50: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.active:Lgg/essential/elementa/state/MappedState;
        //    53: new             Lgg/essential/elementa/components/UIBlock;
        //    56: dup            
        //    57: aload_0         /* this */
        //    58: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.containedColor:Lgg/essential/elementa/state/State;
        //    61: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$colorBlock$2.INSTANCE:Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$colorBlock$2;
        //    64: checkcast       Lkotlin/jvm/functions/Function1;
        //    67: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    70: checkcast       Lgg/essential/elementa/state/State;
        //    73: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //    76: checkcast       Lgg/essential/elementa/UIComponent;
        //    79: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //    82: astore          $this$constrain$iv
        //    84: aload           $this$constrain$iv
        //    86: astore          6
        //    88: aload           6
        //    90: astore          $this$constrain_u24lambda_u2d0$iv
        //    92: aload           $this$constrain_u24lambda_u2d0$iv
        //    94: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    97: astore          $this$colorBlock_delegate_u24lambda_u2d0
        //    99: aload           $this$colorBlock_delegate_u24lambda_u2d0
        //   101: bipush          100
        //   103: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   106: checkcast       Ljava/lang/Number;
        //   109: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   112: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   115: iconst_2       
        //   116: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   119: checkcast       Ljava/lang/Number;
        //   122: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   125: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   128: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   131: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   134: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   137: aload           $this$colorBlock_delegate_u24lambda_u2d0
        //   139: bipush          100
        //   141: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   144: checkcast       Ljava/lang/Number;
        //   147: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   150: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   153: iconst_2       
        //   154: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   157: checkcast       Ljava/lang/Number;
        //   160: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   163: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   166: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   169: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   172: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   175: aload           6
        //   177: aload_0         /* this */
        //   178: checkcast       Lgg/essential/elementa/UIComponent;
        //   181: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   184: aload_0         /* this */
        //   185: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   188: iconst_0       
        //   189: aaload         
        //   190: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   193: pop            
        //   194: aload_0         /* this */
        //   195: checkcast       Lgg/essential/elementa/UIComponent;
        //   198: astore          $this$constrain$iv
        //   200: aload           $this$constrain$iv
        //   202: astore          6
        //   204: aload           6
        //   206: astore          $this$constrain_u24lambda_u2d0$iv
        //   208: aload           $this$constrain_u24lambda_u2d0$iv
        //   210: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   213: astore          $this$_init__u24lambda_u2d1
        //   215: aload           $this$_init__u24lambda_u2d1
        //   217: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   220: dup            
        //   221: fconst_2       
        //   222: iconst_0       
        //   223: iconst_2       
        //   224: aconst_null    
        //   225: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   228: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   231: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   234: aload           $this$_init__u24lambda_u2d1
        //   236: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   239: dup            
        //   240: fconst_1       
        //   241: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //   244: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   247: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   250: aload           $this$_init__u24lambda_u2d1
        //   252: bipush          100
        //   254: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   257: checkcast       Ljava/lang/Number;
        //   260: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   263: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   266: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   269: aload_0         /* this */
        //   270: aload_0         /* this */
        //   271: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.active:Lgg/essential/elementa/state/MappedState;
        //   274: aload_0         /* this */
        //   275: checkcast       Lgg/essential/elementa/UIComponent;
        //   278: iconst_0       
        //   279: iconst_0       
        //   280: iconst_3       
        //   281: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   284: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   287: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$2.INSTANCE:Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$2;
        //   290: checkcast       Lkotlin/jvm/functions/Function1;
        //   293: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   296: checkcast       Lgg/essential/elementa/state/State;
        //   299: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   302: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   305: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   308: pop            
        //   309: aload_0         /* this */
        //   310: checkcast       Lgg/essential/elementa/UIComponent;
        //   313: astore          4
        //   315: aload_0         /* this */
        //   316: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.this$0:Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;
        //   319: astore          5
        //   321: aload           $this$onLeftClick$iv
        //   323: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$special$$inlined$onLeftClick$1;
        //   326: dup            
        //   327: aload           5
        //   329: aload_0         /* this */
        //   330: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice;)V
        //   333: checkcast       Lkotlin/jvm/functions/Function2;
        //   336: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   339: pop            
        //   340: return         
        //    Signature:
        //  (Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;Lgg/essential/elementa/state/State<Lgg/essential/gui/screenshot/components/HSBColor;>;I)V [from metadata: (Lgg/essential/elementa/state/State<Lgg/essential/gui/screenshot/components/HSBColor;>;I)V]
        //  
        //    MethodParameters:
        //  Name            Flags  
        //  --------------  -----
        //  this$0          
        //  containedColor  
        //  index           
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final State<HSBColor> getContainedColor() {
        return this.containedColor;
    }
    
    public final int getIndex() {
        return this.index;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ColorChoice.class, "colorBlock", "getColorBlock()Lgg/essential/elementa/components/UIBlock;", 0)) };
    }
}
