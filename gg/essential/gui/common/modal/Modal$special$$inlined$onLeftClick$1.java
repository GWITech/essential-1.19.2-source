package gg.essential.gui.common.modal;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class Modal$special$$inlined$onLeftClick$1 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ Modal this$0;
    
    public Modal$special$$inlined$onLeftClick$1(final Modal this$0) {
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
        //    16: ifne            54
        //    19: aload_1         /* $this$onMouseClick */
        //    20: aload_2         /* it */
        //    21: astore_3       
        //    22: astore          $this$_init__u24lambda_u2d3
        //    24: aload_0         /* this */
        //    25: getfield        gg/essential/gui/common/modal/Modal$special$$inlined$onLeftClick$1.this$0:Lgg/essential/gui/common/modal/Modal;
        //    28: invokevirtual   gg/essential/gui/common/modal/Modal.isAnimating:()Z
        //    31: ifne            54
        //    34: aload_3         /* event */
        //    35: invokevirtual   gg/essential/elementa/events/UIClickEvent.getTarget:()Lgg/essential/elementa/UIComponent;
        //    38: aload           $this$_init__u24lambda_u2d3
        //    40: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    43: ifeq            54
        //    46: aload_0         /* this */
        //    47: getfield        gg/essential/gui/common/modal/Modal$special$$inlined$onLeftClick$1.this$0:Lgg/essential/gui/common/modal/Modal;
        //    50: aconst_null    
        //    51: invokestatic    gg/essential/gui/common/modal/Modal.fadeOut$default$70fdbc49:(Lgg/essential/gui/common/modal/Modal;Ljava/lang/Object;)V
        //    54: return         
        //    MethodParameters:
        //  Name                Flags  
        //  ------------------  -----
        //  $this$onMouseClick  
        //  it                  
        //    StackMapTable: 00 01 F8 00 36
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}