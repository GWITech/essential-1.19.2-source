package gg.essential.gui.about.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.data.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\r
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class ChangelogComponent$getChangelogContent$1$header$1 extends Lambda implements Function1<String, CharSequence> {
    public static final ChangelogComponent$getChangelogContent$1$header$1 INSTANCE;
    
    ChangelogComponent$getChangelogContent$1$header$1() {
        super(1);
    }
    
    @NotNull
    public final CharSequence invoke(@NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return VersionData.INSTANCE.formatPlatform(it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((String)p1);
    }
    
    static {
        ChangelogComponent$getChangelogContent$1$header$1.INSTANCE = new ChangelogComponent$getChangelogContent$1$header$1();
    }
}