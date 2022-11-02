package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class ScreenshotScrollComponent$setScrollBarComponent$4 extends Lambda implements Function1<UIComponent, Unit> {
    final /* synthetic */ boolean $isHorizontal;
    final /* synthetic */ ScreenshotScrollComponent this$0;
    
    ScreenshotScrollComponent$setScrollBarComponent$4(final ScreenshotScrollComponent $receiver) {
        this.$isHorizontal = false;
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseRelease) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseRelease, "$this$onMouseRelease");
        ScreenshotScrollComponent.access$setVerticalDragBeginPos$p(this.this$0, -1.0f);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
}