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
static final class TopMenu$platformSwitch$3 extends Lambda implements Function1<Page, Boolean> {
    public static final TopMenu$platformSwitch$3 INSTANCE;
    
    TopMenu$platformSwitch$3() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final Page it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it instanceof ChangelogPage;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Page)p1);
    }
    
    static {
        TopMenu$platformSwitch$3.INSTANCE = new TopMenu$platformSwitch$3();
    }
}