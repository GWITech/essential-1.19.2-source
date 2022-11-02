package gg.essential.gui.about.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "scrollPercentage", "", "<anonymous parameter 1>", "invoke" })
static final class ChangelogPage$afterInitialization$1 extends Lambda implements Function2<Float, Float, Unit> {
    final /* synthetic */ ChangelogPage this$0;
    
    ChangelogPage$afterInitialization$1(final ChangelogPage $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke$2548a35(final float scrollPercentage) {
        if (this.this$0.getParent().getChildren().contains(this.this$0) && scrollPercentage > 0.7) {
            ChangelogPage.scrollContent$default$15e69288$1b1364(this.this$0);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        final float floatValue = ((Number)p1).floatValue();
        ((Number)p2).floatValue();
        this.invoke$2548a35(floatValue);
        return Unit.INSTANCE;
    }
}