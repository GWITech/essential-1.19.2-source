package gg.essential.vigilance.gui.settings;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class DropDownComponent$special$$inlined$onLeftClick$2 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ DropDownComponent this$0;
    
    public DropDownComponent$special$$inlined$onLeftClick$2(final DropDownComponent this$0) {
        this.this$0 = this$0;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$onMouseClick"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* it */
        //     7: ldc             "it"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_2         /* it */
        //    13: invokevirtual   gg/essential/elementa/events/UIClickEvent.getMouseButton:()I
        //    16: ifne            83
        //    19: aload_1         /* $this$onMouseClick */
        //    20: aload_2         /* it */
        //    21: astore_3       
        //    22: astore          $this$_init__u24lambda_u2d19
        //    24: iconst_0       
        //    25: istore          $i$a$-onLeftClick-DropDownComponent$4
        //    27: getstatic       gg/essential/universal/USound.INSTANCE:Lgg/essential/universal/USound;
        //    30: fconst_0       
        //    31: iconst_1       
        //    32: aconst_null    
        //    33: invokestatic    gg/essential/universal/USound.playButtonPress$default:(Lgg/essential/universal/USound;FILjava/lang/Object;)V
        //    36: aload_3         /* event */
        //    37: invokevirtual   gg/essential/elementa/events/UIClickEvent.stopPropagation:()V
        //    40: aload_0         /* this */
        //    41: getfield        gg/essential/vigilance/gui/settings/DropDownComponent$special$$inlined$onLeftClick$2.this$0:Lgg/essential/vigilance/gui/settings/DropDownComponent;
        //    44: invokestatic    gg/essential/vigilance/gui/settings/DropDownComponent.access$getWritableExpandedState$p:(Lgg/essential/vigilance/gui/settings/DropDownComponent;)Lgg/essential/elementa/state/State;
        //    47: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //    50: checkcast       Ljava/lang/Boolean;
        //    53: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    56: ifeq            72
        //    59: aload_0         /* this */
        //    60: getfield        gg/essential/vigilance/gui/settings/DropDownComponent$special$$inlined$onLeftClick$2.this$0:Lgg/essential/vigilance/gui/settings/DropDownComponent;
        //    63: iconst_0       
        //    64: iconst_1       
        //    65: aconst_null    
        //    66: invokestatic    gg/essential/vigilance/gui/settings/DropDownComponent.collapse$default:(Lgg/essential/vigilance/gui/settings/DropDownComponent;ZILjava/lang/Object;)V
        //    69: goto            82
        //    72: aload_0         /* this */
        //    73: getfield        gg/essential/vigilance/gui/settings/DropDownComponent$special$$inlined$onLeftClick$2.this$0:Lgg/essential/vigilance/gui/settings/DropDownComponent;
        //    76: iconst_0       
        //    77: iconst_1       
        //    78: aconst_null    
        //    79: invokestatic    gg/essential/vigilance/gui/settings/DropDownComponent.expand$default:(Lgg/essential/vigilance/gui/settings/DropDownComponent;ZILjava/lang/Object;)V
        //    82: nop            
        //    83: return         
        //    MethodParameters:
        //  Name                Flags  
        //  ------------------  -----
        //  $this$onMouseClick  
        //  it                  
        //    StackMapTable: 00 03 FE 00 48 07 00 37 07 00 5F 01 09 F8 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}