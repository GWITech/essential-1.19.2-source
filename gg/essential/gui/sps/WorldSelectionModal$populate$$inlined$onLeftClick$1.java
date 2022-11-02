package gg.essential.gui.sps;

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
public static final class WorldSelectionModal$populate$$inlined$onLeftClick$1 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ WorldSelectionModal this$0;
    
    public WorldSelectionModal$populate$$inlined$onLeftClick$1(final WorldSelectionModal this$0) {
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
        //    16: ifne            94
        //    19: aload_1         /* $this$onMouseClick */
        //    20: aload_2         /* it */
        //    21: astore_3       
        //    22: astore          $this$populate_u24lambda_u2d0
        //    24: aload_0         /* this */
        //    25: getfield        gg/essential/gui/sps/WorldSelectionModal$populate$$inlined$onLeftClick$1.this$0:Lgg/essential/gui/sps/WorldSelectionModal;
        //    28: invokestatic    gg/essential/gui/sps/WorldSelectionModal.access$getSelectedWorld$p:(Lgg/essential/gui/sps/WorldSelectionModal;)Lgg/essential/elementa/state/State;
        //    31: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //    34: aload           $this$populate_u24lambda_u2d0
        //    36: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    39: ifeq            49
        //    42: aload_3         /* it */
        //    43: invokevirtual   gg/essential/elementa/events/UIClickEvent.getClickCount:()I
        //    46: goto            50
        //    49: iconst_1       
        //    50: istore          clickCount
        //    52: aload_0         /* this */
        //    53: getfield        gg/essential/gui/sps/WorldSelectionModal$populate$$inlined$onLeftClick$1.this$0:Lgg/essential/gui/sps/WorldSelectionModal;
        //    56: invokestatic    gg/essential/gui/sps/WorldSelectionModal.access$getSelectedWorld$p:(Lgg/essential/gui/sps/WorldSelectionModal;)Lgg/essential/elementa/state/State;
        //    59: aload           $this$populate_u24lambda_u2d0
        //    61: checkcast       Lgg/essential/gui/sps/WorldSelectionModal$WorldEntry;
        //    64: invokevirtual   gg/essential/elementa/state/State.set:(Ljava/lang/Object;)V
        //    67: iload           clickCount
        //    69: iconst_1       
        //    70: if_icmple       94
        //    73: aload_0         /* this */
        //    74: getfield        gg/essential/gui/sps/WorldSelectionModal$populate$$inlined$onLeftClick$1.this$0:Lgg/essential/gui/sps/WorldSelectionModal;
        //    77: invokevirtual   gg/essential/gui/sps/WorldSelectionModal.getPrimaryButtonAction:()Lkotlin/jvm/functions/Function0;
        //    80: dup            
        //    81: ifnull          93
        //    84: invokeinterface kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
        //    89: pop            
        //    90: goto            94
        //    93: pop            
        //    94: return         
        //    MethodParameters:
        //  Name                Flags  
        //  ------------------  -----
        //  $this$onMouseClick  
        //  it                  
        //    StackMapTable: 00 04 FF 00 31 00 05 07 00 02 00 00 00 07 00 4F 00 00 40 01 FF 00 2A 00 00 00 01 07 00 5B 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}