package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class MenuButton$7 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ MenuButton this$0;
    
    MenuButton$7(final MenuButton $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(final boolean it) {
        if (it) {
            MenuButton.access$setOriginalWidth$p(this.this$0, this.this$0.getConstraints().getWidth());
            MenuButton.access$setOriginalHeight$p(this.this$0, this.this$0.getConstraints().getHeight());
            if (MenuButton.access$getCollapsedWidth$p(this.this$0) > 0.0f) {
                this.this$0.setWidth(UtilitiesKt.getPixels(MenuButton.access$getCollapsedWidth$p(this.this$0)));
            }
            else {
                this.this$0.setWidth(ConstraintsKt.coerceAtLeast(new AspectConstraint(0.0f, 1, null), ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(10))));
            }
            if (MenuButton.access$getCollapsedHeight$p(this.this$0) > 0.0f) {
                this.this$0.setHeight(UtilitiesKt.getPixels(MenuButton.access$getCollapsedHeight$p(this.this$0)));
            }
        }
        else {
            this.this$0.setWidth(MenuButton.access$getOriginalWidth$p(this.this$0));
            this.this$0.setHeight(MenuButton.access$getOriginalHeight$p(this.this$0));
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((boolean)p1);
        return Unit.INSTANCE;
    }
}