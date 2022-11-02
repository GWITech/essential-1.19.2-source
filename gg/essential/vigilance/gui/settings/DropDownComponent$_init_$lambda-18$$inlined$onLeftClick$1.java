package gg.essential.vigilance.gui.settings;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class DropDownComponent$_init_$lambda-18$$inlined$onLeftClick$1 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ DropDownComponent this$0;
    final /* synthetic */ int $index$inlined;
    
    public DropDownComponent$_init_$lambda-18$$inlined$onLeftClick$1(final DropDownComponent this$0, final int $index$inlined) {
        this.this$0 = this$0;
        this.$index$inlined = $index$inlined;
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
        //    16: ifne            52
        //    19: aload_1         /* $this$onMouseClick */
        //    20: aload_2         /* it */
        //    21: astore_3       
        //    22: astore          $this$lambda_u2d18_u24lambda_u2d14
        //    24: iconst_0       
        //    25: istore          $i$a$-onLeftClick-DropDownComponent$3$optionContainer$3
        //    27: getstatic       gg/essential/universal/USound.INSTANCE:Lgg/essential/universal/USound;
        //    30: fconst_0       
        //    31: iconst_1       
        //    32: aconst_null    
        //    33: invokestatic    gg/essential/universal/USound.playButtonPress$default:(Lgg/essential/universal/USound;FILjava/lang/Object;)V
        //    36: aload_3         /* it */
        //    37: invokevirtual   gg/essential/elementa/events/UIClickEvent.stopPropagation:()V
        //    40: aload_0         /* this */
        //    41: getfield        gg/essential/vigilance/gui/settings/DropDownComponent$_init_$lambda-18$$inlined$onLeftClick$1.this$0:Lgg/essential/vigilance/gui/settings/DropDownComponent;
        //    44: aload_0         /* this */
        //    45: getfield        gg/essential/vigilance/gui/settings/DropDownComponent$_init_$lambda-18$$inlined$onLeftClick$1.$index$inlined:I
        //    48: invokevirtual   gg/essential/vigilance/gui/settings/DropDownComponent.select:(I)V
        //    51: nop            
        //    52: return         
        //    MethodParameters:
        //  Name                Flags  
        //  ------------------  -----
        //  $this$onMouseClick  
        //  it                  
        //    StackMapTable: 00 01 34
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}