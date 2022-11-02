package gg.essential.elementa.markdown.drawables;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/markdown/drawables/TextDrawable;", "invoke" })
static final class HeaderDrawable$id$1 extends Lambda implements Function1<TextDrawable, CharSequence> {
    public static final HeaderDrawable$id$1 INSTANCE;
    
    HeaderDrawable$id$1() {
        super(1);
    }
    
    @NotNull
    public final CharSequence invoke(@NotNull final TextDrawable it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it.plainText();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((TextDrawable)p1);
    }
    
    static {
        HeaderDrawable$id$1.INSTANCE = new HeaderDrawable$id$1();
    }
}