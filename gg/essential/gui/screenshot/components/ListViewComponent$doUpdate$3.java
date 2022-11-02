package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u000f
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class ListViewComponent$doUpdate$3 extends Lambda implements Function1<UIComponent, Comparable<?>> {
    public static final ListViewComponent$doUpdate$3 INSTANCE;
    
    ListViewComponent$doUpdate$3() {
        super(1);
    }
    
    @Nullable
    public final Comparable<?> invoke(@NotNull final UIComponent it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return -((ScreenshotDateGroup)it).getRange().ordinal();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UIComponent)p1);
    }
    
    static {
        ListViewComponent$doUpdate$3.INSTANCE = new ListViewComponent$doUpdate$3();
    }
}