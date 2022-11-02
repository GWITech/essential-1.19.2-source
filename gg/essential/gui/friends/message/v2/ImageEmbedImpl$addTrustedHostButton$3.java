package gg.essential.gui.friends.message.v2;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import java.net.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class ImageEmbedImpl$addTrustedHostButton$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ URL $url;
    
    ImageEmbedImpl$addTrustedHostButton$3(final URL $url) {
        this.$url = $url;
        super(0);
    }
    
    public final void invoke() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: new             Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //     6: dup            
        //     7: iconst_0       
        //     8: invokespecial   gg/essential/gui/common/modal/ConfirmDenyModal.<init>:(Z)V
        //    11: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //    14: astore_1       
        //    15: aload_0         /* this */
        //    16: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$addTrustedHostButton$3.$url:Ljava/net/URL;
        //    19: astore_2       
        //    20: aload_1         /* $this$configure$iv */
        //    21: astore_3       
        //    22: aload_3        
        //    23: astore          $this$configure_u24lambda_u2d0$iv
        //    25: aload           $this$configure_u24lambda_u2d0$iv
        //    27: checkcast       Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    30: astore          5
        //    32: astore          6
        //    34: aload           $this$invoke_u24lambda_u2d0
        //    36: aload_2        
        //    37: invokevirtual   java/net/URL.getHost:()Ljava/lang/String;
        //    40: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //    45: invokestatic    kotlin/text/StringsKt.trimIndent:(Ljava/lang/String;)Ljava/lang/String;
        //    48: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.setContentText:(Ljava/lang/String;)V
        //    51: aload           6
        //    53: aload_3        
        //    54: checkcast       Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    57: new             Lgg/essential/gui/friends/message/v2/ImageEmbedImpl$addTrustedHostButton$3$2;
        //    60: dup            
        //    61: aload_0         /* this */
        //    62: getfield        gg/essential/gui/friends/message/v2/ImageEmbedImpl$addTrustedHostButton$3.$url:Ljava/net/URL;
        //    65: invokespecial   gg/essential/gui/friends/message/v2/ImageEmbedImpl$addTrustedHostButton$3$2.<init>:(Ljava/net/URL;)V
        //    68: checkcast       Lkotlin/jvm/functions/Function0;
        //    71: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.onPrimaryAction:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    74: checkcast       Lgg/essential/gui/common/modal/Modal;
        //    77: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //    80: pop            
        //    81: return         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}