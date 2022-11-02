package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.gui.common.shadow.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0004\b\u0002\u0010\u0003""" }, d2 = { "<anonymous>", "", "invoke", "()Ljava/lang/Float;" })
static final class MenuButton$availableLabelWidth$1 extends Lambda implements Function0<Float> {
    final /* synthetic */ MenuButton this$0;
    
    MenuButton$availableLabelWidth$1(final MenuButton $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    @NotNull
    public final Float invoke() {
        final float width = this.this$0.getWidth();
        final ShadowIcon access$getShadowIcon$p = MenuButton.access$getShadowIcon$p(this.this$0);
        return width - ((access$getShadowIcon$p != null) ? (access$getShadowIcon$p.getWidth() + 12.0f) : 9.0f);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}