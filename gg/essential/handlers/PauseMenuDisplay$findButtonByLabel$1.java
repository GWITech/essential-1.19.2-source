package gg.essential.handlers;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import net.minecraft.client.gui.widget.*;
import kotlin.*;
import net.minecraft.client.gui.screen.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a	\u0018\u00010\u0001¢\u0006\u0002\b\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "Lnet/minecraft/client/gui/widget/ButtonWidget;", "Lkotlin/internal/NoInfer;", "invoke" })
static final class PauseMenuDisplay$findButtonByLabel$1 extends Lambda implements Function0<ButtonWidget> {
    final /* synthetic */ Screen $this_findButtonByLabel;
    final /* synthetic */ String[] $label;
    
    PauseMenuDisplay$findButtonByLabel$1(final Screen $receiver, final String[] $label) {
        this.$this_findButtonByLabel = $receiver;
        this.$label = $label;
        super(0);
    }
    
    @Nullable
    public final ButtonWidget invoke() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/handlers/PauseMenuDisplay$findButtonByLabel$1.$this_findButtonByLabel:Lnet/minecraft/client/gui/screen/Screen;
        //     4: checkcast       Lgg/essential/mixins/transformers/client/gui/GuiScreenAccessor;
        //     7: invokeinterface gg/essential/mixins/transformers/client/gui/GuiScreenAccessor.essential$getChildren:()Ljava/util/List;
        //    12: astore_1       
        //    13: aload_1        
        //    14: ldc             "this as GuiScreenAccesso\u2026`essential$getChildren`()"
        //    16: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    19: aload_1        
        //    20: checkcast       Ljava/lang/Iterable;
        //    23: astore_1        /* $this$filterIsInstance$iv */
        //    24: aload_1         /* $this$filterIsInstance$iv */
        //    25: astore_3       
        //    26: new             Ljava/util/ArrayList;
        //    29: dup            
        //    30: invokespecial   java/util/ArrayList.<init>:()V
        //    33: checkcast       Ljava/util/Collection;
        //    36: astore          destination$iv$iv
        //    38: aload_3         /* $this$filterIsInstanceTo$iv$iv */
        //    39: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    44: astore          6
        //    46: aload           6
        //    48: invokeinterface java/util/Iterator.hasNext:()Z
        //    53: ifeq            86
        //    56: aload           6
        //    58: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    63: astore          element$iv$iv
        //    65: aload           element$iv$iv
        //    67: instanceof      Lnet/minecraft/client/gui/widget/ButtonWidget;
        //    70: ifeq            46
        //    73: aload           destination$iv$iv
        //    75: aload           element$iv$iv
        //    77: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    82: pop            
        //    83: goto            46
        //    86: aload           destination$iv$iv
        //    88: checkcast       Ljava/util/List;
        //    91: astore_1        /* $this$filterIsInstance$iv */
        //    92: aload_0         /* this */
        //    93: getfield        gg/essential/handlers/PauseMenuDisplay$findButtonByLabel$1.$label:[Ljava/lang/String;
        //    96: astore_2       
        //    97: aload_1         /* $this$lastOrNull$iv */
        //    98: aload_1         /* $this$lastOrNull$iv */
        //    99: invokeinterface java/util/List.size:()I
        //   104: invokeinterface java/util/List.listIterator:(I)Ljava/util/ListIterator;
        //   109: astore          iterator$iv
        //   111: aload           iterator$iv
        //   113: invokeinterface java/util/ListIterator.hasPrevious:()Z
        //   118: ifeq            205
        //   121: aload           iterator$iv
        //   123: invokeinterface java/util/ListIterator.previous:()Ljava/lang/Object;
        //   128: astore          element$iv
        //   130: aload           element$iv
        //   132: checkcast       Lnet/minecraft/client/gui/widget/ButtonWidget;
        //   135: astore          button
        //   137: aload_2        
        //   138: astore          $this$any$iv
        //   140: iconst_0       
        //   141: istore          9
        //   143: aload           $this$any$iv
        //   145: arraylength    
        //   146: istore          10
        //   148: iload           9
        //   150: iload           10
        //   152: if_icmpge       196
        //   155: aload           $this$any$iv
        //   157: iload           9
        //   159: aaload         
        //   160: astore          element$iv
        //   162: aload           element$iv
        //   164: astore          it
        //   166: aload           button
        //   168: invokevirtual   net/minecraft/client/gui/widget/ButtonWidget.method_25369:()Lnet/minecraft/text/Text;
        //   171: aload           it
        //   173: iconst_0       
        //   174: anewarray       Ljava/lang/Object;
        //   177: invokestatic    gg/essential/util/HelpersKt.textTranslatable:(Ljava/lang/String;[Ljava/lang/Object;)Lnet/minecraft/text/MutableText;
        //   180: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   183: ifeq            190
        //   186: iconst_1       
        //   187: goto            197
        //   190: iinc            9, 1
        //   193: goto            148
        //   196: iconst_0       
        //   197: ifeq            111
        //   200: aload           element$iv
        //   202: goto            206
        //   205: aconst_null    
        //   206: checkcast       Lnet/minecraft/client/gui/widget/ButtonWidget;
        //   209: areturn        
        //    StackMapTable: 00 09 FF 00 2E 00 07 07 00 02 07 00 3F 00 07 00 3F 07 00 46 00 07 00 4C 00 00 27 FF 00 18 00 07 07 00 02 07 00 5C 07 00 65 07 00 3F 07 00 67 00 07 00 69 00 00 FF 00 24 00 0B 07 00 02 07 00 5C 07 00 65 07 00 3F 07 00 67 07 00 69 07 00 56 00 07 00 65 01 01 00 00 FD 00 29 07 00 7F 07 00 7F F9 00 05 40 01 FF 00 07 00 07 07 00 02 07 00 5C 07 00 65 07 00 3F 07 00 67 00 07 00 69 00 00 40 07 00 69
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}