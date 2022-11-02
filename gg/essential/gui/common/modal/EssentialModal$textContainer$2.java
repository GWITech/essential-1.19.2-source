package gg.essential.gui.common.modal;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H
                                                   ¢\u0006\u0004\b\u0005\u0010\u0006""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;" })
static final class EssentialModal$textContainer$2 extends Lambda implements Function1<Pair<? extends String, ? extends String>, Boolean> {
    public static final EssentialModal$textContainer$2 INSTANCE;
    
    EssentialModal$textContainer$2() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final Pair<String, String> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final String title = (String)pair.component1();
        final String content = (String)pair.component2();
        return title.length() > 0 && content.length() > 0;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        EssentialModal$textContainer$2.INSTANCE = new EssentialModal$textContainer$2();
    }
}