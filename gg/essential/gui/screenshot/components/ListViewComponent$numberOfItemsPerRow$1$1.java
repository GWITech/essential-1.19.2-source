package gg.essential.gui.screenshot.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.config.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class ListViewComponent$numberOfItemsPerRow$1$1 extends Lambda implements Function1<Integer, Unit> {
    public static final ListViewComponent$numberOfItemsPerRow$1$1 INSTANCE;
    
    ListViewComponent$numberOfItemsPerRow$1$1() {
        super(1);
    }
    
    public final void invoke(final int it) {
        EssentialConfig.INSTANCE.setScreenshotBrowserItemsPerRow(it);
        EssentialConfig.INSTANCE.markDirty();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke(((Number)p1).intValue());
        return Unit.INSTANCE;
    }
    
    static {
        ListViewComponent$numberOfItemsPerRow$1$1.INSTANCE = new ListViewComponent$numberOfItemsPerRow$1$1();
    }
}