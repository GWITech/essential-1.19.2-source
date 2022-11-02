package gg.essential.gui.about.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/about/components/Page;", "invoke", "(Lgg/essential/gui/about/components/Page;)Ljava/lang/Boolean;" })
static final class LeftPane$MenuItem$selected$1 extends Lambda implements Function1<Page, Boolean> {
    final /* synthetic */ Page $page;
    
    LeftPane$MenuItem$selected$1(final Page $page) {
        this.$page = $page;
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final Page it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return Intrinsics.areEqual((Object)it, (Object)this.$page);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Page)p1);
    }
}