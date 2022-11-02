package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "Lgg/essential/gui/common/UI3DPlayer$FallbackPlayer;", "Lgg/essential/gui/common/UI3DPlayer;", "invoke" })
static final class UI3DPlayer$fallbackPlayer$1 extends Lambda implements Function0<UI3DPlayer$FallbackPlayer> {
    final /* synthetic */ UI3DPlayer this$0;
    
    UI3DPlayer$fallbackPlayer$1(final UI3DPlayer $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    @NotNull
    public final UI3DPlayer$FallbackPlayer invoke() {
        return new UI3DPlayer$FallbackPlayer(this.this$0);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}