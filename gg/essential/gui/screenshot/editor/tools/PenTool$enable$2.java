package gg.essential.gui.screenshot.editor.tools;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke" })
static final class PenTool$enable$2 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ PenTool this$0;
    
    PenTool$enable$2(final PenTool $receiver) {
        this.this$0 = $receiver;
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
        //    16: ifeq            20
        //    19: return         
        //    20: aload_0         /* this */
        //    21: getfield        gg/essential/gui/screenshot/editor/tools/PenTool$enable$2.this$0:Lgg/essential/gui/screenshot/editor/tools/PenTool;
        //    24: new             Lgg/essential/gui/screenshot/editor/tools/PenTool$PenVectorStroke;
        //    27: dup            
        //    28: aload_0         /* this */
        //    29: getfield        gg/essential/gui/screenshot/editor/tools/PenTool$enable$2.this$0:Lgg/essential/gui/screenshot/editor/tools/PenTool;
        //    32: aload_0         /* this */
        //    33: getfield        gg/essential/gui/screenshot/editor/tools/PenTool$enable$2.this$0:Lgg/essential/gui/screenshot/editor/tools/PenTool;
        //    36: invokevirtual   gg/essential/gui/screenshot/editor/tools/PenTool.getColor:()Ljava/awt/Color;
        //    39: aload_0         /* this */
        //    40: getfield        gg/essential/gui/screenshot/editor/tools/PenTool$enable$2.this$0:Lgg/essential/gui/screenshot/editor/tools/PenTool;
        //    43: invokevirtual   gg/essential/gui/screenshot/editor/tools/PenTool.getWidth:()F
        //    46: invokespecial   gg/essential/gui/screenshot/editor/tools/PenTool$PenVectorStroke.<init>:(Lgg/essential/gui/screenshot/editor/tools/PenTool;Ljava/awt/Color;F)V
        //    49: astore_3       
        //    50: aload_0         /* this */
        //    51: getfield        gg/essential/gui/screenshot/editor/tools/PenTool$enable$2.this$0:Lgg/essential/gui/screenshot/editor/tools/PenTool;
        //    54: astore          4
        //    56: aload_3        
        //    57: astore          5
        //    59: astore          6
        //    61: aload           4
        //    63: invokevirtual   gg/essential/gui/screenshot/editor/tools/PenTool.getEditableScreenshot:()Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //    66: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas.getVectorEditingOverlay:()Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;
        //    69: aload           it
        //    71: checkcast       Lgg/essential/gui/screenshot/editor/change/Change;
        //    74: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.pushChange:(Lgg/essential/gui/screenshot/editor/change/Change;)Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;
        //    77: pop            
        //    78: aload           6
        //    80: aload_3        
        //    81: invokevirtual   gg/essential/gui/screenshot/editor/tools/PenTool.setCurrentVectorStroke:(Lgg/essential/gui/screenshot/editor/tools/PenTool$PenVectorStroke;)V
        //    84: return         
        //    MethodParameters:
        //  Name                Flags  
        //  ------------------  -----
        //  $this$onMouseClick  
        //  it                  
        //    StackMapTable: 00 01 F9 00 14
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}