package gg.essential.gui.common.modal;

import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.universal.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.components.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class EssentialModal$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Ref$ObjectRef<Screen> $screen;
    final /* synthetic */ EssentialModal this$0;
    
    EssentialModal$3(final Ref$ObjectRef<Screen> $screen, final EssentialModal $receiver) {
        this.$screen = $screen;
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        if (!Intrinsics.areEqual((Object)UScreen.Companion.getCurrentScreen(), this.$screen.element)) {
            this.$screen.element = UScreen.Companion.getCurrentScreen();
            Window.Companion.enqueueRenderOperation((Function0<Unit>)new EssentialModal$3.EssentialModal$3$1(this.this$0));
        }
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}