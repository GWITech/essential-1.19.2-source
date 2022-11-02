package gg.essential.vigilance.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class IconButton$special$$inlined$onLeftClick$1 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ IconButton this$0;
    
    public IconButton$special$$inlined$onLeftClick$1(final IconButton this$0) {
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
        //    16: ifne            60
        //    19: aload_1         /* $this$onMouseClick */
        //    20: aload_2         /* it */
        //    21: astore_3       
        //    22: astore          $this$_init__u24lambda_u2d4
        //    24: iconst_0       
        //    25: istore          $i$a$-onLeftClick-IconButton$2
        //    27: aload_0         /* this */
        //    28: getfield        gg/essential/vigilance/gui/common/IconButton$special$$inlined$onLeftClick$1.this$0:Lgg/essential/vigilance/gui/common/IconButton;
        //    31: invokestatic    gg/essential/vigilance/gui/common/IconButton.access$getEnabledState$p:(Lgg/essential/vigilance/gui/common/IconButton;)Lgg/essential/elementa/state/MappedState;
        //    34: invokevirtual   gg/essential/elementa/state/MappedState.get:()Ljava/lang/Object;
        //    37: checkcast       Ljava/lang/Boolean;
        //    40: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    43: ifeq            59
        //    46: getstatic       gg/essential/universal/USound.INSTANCE:Lgg/essential/universal/USound;
        //    49: fconst_0       
        //    50: iconst_1       
        //    51: aconst_null    
        //    52: invokestatic    gg/essential/universal/USound.playButtonPress$default:(Lgg/essential/universal/USound;FILjava/lang/Object;)V
        //    55: aload_3         /* it */
        //    56: invokevirtual   gg/essential/elementa/events/UIClickEvent.stopPropagation:()V
        //    59: nop            
        //    60: return         
        //    MethodParameters:
        //  Name                Flags  
        //  ------------------  -----
        //  $this$onMouseClick  
        //  it                  
        //    StackMapTable: 00 02 FE 00 3B 07 00 37 07 00 5B 01 F8 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}