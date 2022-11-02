package gg.essential.gui.friends.message.v2;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class ParagraphLineImpl$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ParagraphLineImpl this$0;
    
    ParagraphLineImpl$2(final ParagraphLineImpl $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl$2.this$0:Lgg/essential/gui/friends/message/v2/ParagraphLineImpl;
        //     4: invokestatic    gg/essential/gui/friends/message/v2/ParagraphLineImpl.access$getVisibleMessageComponent:(Lgg/essential/gui/friends/message/v2/ParagraphLineImpl;)Lgg/essential/elementa/markdown/MarkdownComponent;
        //     7: invokevirtual   gg/essential/elementa/markdown/MarkdownComponent.getDrawables:()Lgg/essential/elementa/markdown/drawables/DrawableList;
        //    10: checkcast       Ljava/lang/Iterable;
        //    13: astore_1        /* $this$filterIsInstance$iv */
        //    14: aload_1         /* $this$filterIsInstance$iv */
        //    15: astore_3       
        //    16: new             Ljava/util/ArrayList;
        //    19: dup            
        //    20: invokespecial   java/util/ArrayList.<init>:()V
        //    23: checkcast       Ljava/util/Collection;
        //    26: astore          destination$iv$iv
        //    28: aload_3         /* $this$filterIsInstanceTo$iv$iv */
        //    29: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    34: astore          6
        //    36: aload           6
        //    38: invokeinterface java/util/Iterator.hasNext:()Z
        //    43: ifeq            76
        //    46: aload           6
        //    48: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    53: astore          element$iv$iv
        //    55: aload           element$iv$iv
        //    57: instanceof      Lgg/essential/elementa/markdown/drawables/HeaderDrawable;
        //    60: ifeq            36
        //    63: aload           destination$iv$iv
        //    65: aload           element$iv$iv
        //    67: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    72: pop            
        //    73: goto            36
        //    76: aload           destination$iv$iv
        //    78: checkcast       Ljava/util/List;
        //    81: checkcast       Ljava/lang/Iterable;
        //    84: astore_1       
        //    85: aload_0         /* this */
        //    86: getfield        gg/essential/gui/friends/message/v2/ParagraphLineImpl$2.this$0:Lgg/essential/gui/friends/message/v2/ParagraphLineImpl;
        //    89: astore_2       
        //    90: aload_1         /* $this$forEach$iv */
        //    91: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    96: astore          4
        //    98: aload           4
        //   100: invokeinterface java/util/Iterator.hasNext:()Z
        //   105: ifeq            143
        //   108: aload           4
        //   110: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   115: astore          element$iv
        //   117: aload           element$iv
        //   119: checkcast       Lgg/essential/elementa/markdown/drawables/HeaderDrawable;
        //   122: astore          it
        //   124: aload           it
        //   126: aload_2        
        //   127: invokestatic    gg/essential/gui/friends/message/v2/ParagraphLineImpl.access$getVisibleMessageComponent:(Lgg/essential/gui/friends/message/v2/ParagraphLineImpl;)Lgg/essential/elementa/markdown/MarkdownComponent;
        //   130: invokevirtual   gg/essential/elementa/markdown/MarkdownComponent.getMaxTextLineWidth:()F
        //   133: f2d            
        //   134: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   137: invokevirtual   gg/essential/elementa/markdown/drawables/HeaderDrawable.setDividerWidth:(Ljava/lang/Double;)V
        //   140: goto            98
        //   143: return         
        //    StackMapTable: 00 04 FF 00 24 00 07 07 00 02 00 00 00 07 00 3A 00 07 00 40 00 00 F9 00 27 FF 00 15 00 05 00 00 07 00 0A 00 07 00 40 00 00 FF 00 2C 00 00 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}