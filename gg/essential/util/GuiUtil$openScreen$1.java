package gg.essential.util;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.client.gui.screen.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class GuiUtil$openScreen$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Screen $screen;
    
    GuiUtil$openScreen$1(final Screen $screen) {
        this.$screen = $screen;
        super(0);
    }
    
    public final void invoke() {
        GuiUtil.INSTANCE.openScreen(this.$screen);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}