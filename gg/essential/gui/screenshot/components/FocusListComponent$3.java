package gg.essential.gui.screenshot.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "properties", "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "invoke" })
static final class FocusListComponent$3 extends Lambda implements Function1<ScreenshotProperties, Unit> {
    final /* synthetic */ FocusListComponent this$0;
    
    FocusListComponent$3(final FocusListComponent $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@Nullable final ScreenshotProperties properties) {
        if (properties != null) {
            final State favState = FocusListComponent.access$getScreenshotBrowser$p(this.this$0).getStateManager().getFavoriteState(properties);
            this.this$0.applyFavoriteState(favState);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((ScreenshotProperties)p1);
        return Unit.INSTANCE;
    }
}