package gg.essential.gui.common;

import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.reflect.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import kotlin.properties.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0007\b&\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020	¢\u0006\u0002\u0010
                                                   R\u000e\u0010\b\u001a\u00020	X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u000b\u001a\u00020\u00018DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010¨\u0006\u0010""" }, d2 = { "Lgg/essential/gui/common/EssentialToggle;", "Lgg/essential/elementa/components/UIBlock;", "enabled", "Lgg/essential/elementa/state/State;", "", "disabledColor", "Ljava/awt/Color;", "enabledColor", "boxOffset", "", "(Lgg/essential/elementa/state/State;Ljava/awt/Color;Ljava/awt/Color;I)V", "switchBox", "getSwitchBox", "()Lgg/essential/elementa/components/UIBlock;", "switchBox$delegate", "Lkotlin/properties/ReadWriteProperty;", "essential" })
public abstract class EssentialToggle extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final State<Boolean> enabled;
    @NotNull
    private final Color disabledColor;
    @NotNull
    private final Color enabledColor;
    private final int boxOffset;
    @NotNull
    private final ReadWriteProperty switchBox$delegate;
    
    public EssentialToggle(@NotNull final State<Boolean> enabled, @NotNull final Color disabledColor, @NotNull final Color enabledColor, final int boxOffset) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "enabled"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* disabledColor */
        //     7: ldc             "disabledColor"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* enabledColor */
        //    13: ldc             "enabledColor"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload_0         /* this */
        //    19: aconst_null    
        //    20: iconst_1       
        //    21: aconst_null    
        //    22: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    25: aload_0         /* this */
        //    26: aload_1         /* enabled */
        //    27: putfield        gg/essential/gui/common/EssentialToggle.enabled:Lgg/essential/elementa/state/State;
        //    30: aload_0         /* this */
        //    31: aload_2         /* disabledColor */
        //    32: putfield        gg/essential/gui/common/EssentialToggle.disabledColor:Ljava/awt/Color;
        //    35: aload_0         /* this */
        //    36: aload_3         /* enabledColor */
        //    37: putfield        gg/essential/gui/common/EssentialToggle.enabledColor:Ljava/awt/Color;
        //    40: aload_0         /* this */
        //    41: iload           boxOffset
        //    43: putfield        gg/essential/gui/common/EssentialToggle.boxOffset:I
        //    46: aload_0         /* this */
        //    47: new             Lgg/essential/elementa/components/UIBlock;
        //    50: dup            
        //    51: aconst_null    
        //    52: iconst_1       
        //    53: aconst_null    
        //    54: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    57: checkcast       Lgg/essential/elementa/UIComponent;
        //    60: astore          $this$constrain$iv
        //    62: aload           $this$constrain$iv
        //    64: astore          6
        //    66: aload           6
        //    68: astore          $this$constrain_u24lambda_u2d0$iv
        //    70: aload           $this$constrain_u24lambda_u2d0$iv
        //    72: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    75: astore          8
        //    77: astore          9
        //    79: aload           $this$switchBox_delegate_u24lambda_u2d0
        //    81: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //    84: dup            
        //    85: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //    88: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    91: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    94: aload           $this$switchBox_delegate_u24lambda_u2d0
        //    96: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //    99: dup            
        //   100: fconst_0       
        //   101: iconst_1       
        //   102: aconst_null    
        //   103: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   106: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   109: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   112: aload           9
        //   114: aload           6
        //   116: aload_0         /* this */
        //   117: checkcast       Lgg/essential/elementa/UIComponent;
        //   120: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   123: aload_0         /* this */
        //   124: getstatic       gg/essential/gui/common/EssentialToggle.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   127: iconst_0       
        //   128: aaload         
        //   129: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   132: putfield        gg/essential/gui/common/EssentialToggle.switchBox$delegate:Lkotlin/properties/ReadWriteProperty;
        //   135: aload_0         /* this */
        //   136: checkcast       Lgg/essential/elementa/UIComponent;
        //   139: astore          $this$onLeftClick$iv
        //   141: aload           $this$onLeftClick$iv
        //   143: new             Lgg/essential/gui/common/EssentialToggle$special$$inlined$onLeftClick$1;
        //   146: dup            
        //   147: aload_0         /* this */
        //   148: invokespecial   gg/essential/gui/common/EssentialToggle$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/common/EssentialToggle;)V
        //   151: checkcast       Lkotlin/jvm/functions/Function2;
        //   154: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   157: pop            
        //   158: aload_0         /* this */
        //   159: aload_0         /* this */
        //   160: getfield        gg/essential/gui/common/EssentialToggle.enabled:Lgg/essential/elementa/state/State;
        //   163: new             Lgg/essential/gui/common/EssentialToggle$2;
        //   166: dup            
        //   167: aload_0         /* this */
        //   168: invokespecial   gg/essential/gui/common/EssentialToggle$2.<init>:(Lgg/essential/gui/common/EssentialToggle;)V
        //   171: checkcast       Lkotlin/jvm/functions/Function1;
        //   174: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   177: checkcast       Lgg/essential/elementa/state/State;
        //   180: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   183: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   186: invokevirtual   gg/essential/gui/common/EssentialToggle.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   189: pop            
        //   190: aload_0         /* this */
        //   191: getfield        gg/essential/gui/common/EssentialToggle.enabled:Lgg/essential/elementa/state/State;
        //   194: new             Lgg/essential/gui/common/EssentialToggle$3;
        //   197: dup            
        //   198: aload_0         /* this */
        //   199: invokespecial   gg/essential/gui/common/EssentialToggle$3.<init>:(Lgg/essential/gui/common/EssentialToggle;)V
        //   202: checkcast       Lkotlin/jvm/functions/Function1;
        //   205: invokestatic    gg/essential/gui/common/StateExtensionsKt.onSetValueAndNow:(Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   208: pop            
        //   209: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;Ljava/awt/Color;Ljava/awt/Color;I)V
        //    MethodParameters:
        //  Name           Flags  
        //  -------------  -----
        //  enabled        
        //  disabledColor  
        //  enabledColor   
        //  boxOffset      
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    protected final UIBlock getSwitchBox() {
        return (UIBlock)this.switchBox$delegate.getValue((Object)this, (KProperty)EssentialToggle.$$delegatedProperties[0]);
    }
    
    public static final /* synthetic */ State access$getEnabled$p(final EssentialToggle $this) {
        return $this.enabled;
    }
    
    public static final /* synthetic */ Color access$getEnabledColor$p(final EssentialToggle $this) {
        return $this.enabledColor;
    }
    
    public static final /* synthetic */ Color access$getDisabledColor$p(final EssentialToggle $this) {
        return $this.disabledColor;
    }
    
    public static final /* synthetic */ int access$getBoxOffset$p(final EssentialToggle $this) {
        return $this.boxOffset;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialToggle.class, "switchBox", "getSwitchBox()Lgg/essential/elementa/components/UIBlock;", 0)) };
    }
}
