package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "it", "Lgg/essential/gui/common/MenuButton$Style;", "invoke" })
static final class NoticeFlag$backgroundColor$1 extends Lambda implements Function1<MenuButton.Style, Color> {
    public static final NoticeFlag$backgroundColor$1 INSTANCE;
    
    NoticeFlag$backgroundColor$1() {
        super(1);
    }
    
    @NotNull
    public final Color invoke(@NotNull final MenuButton.Style it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it.getButtonColor();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((MenuButton.Style)p1);
    }
    
    static {
        NoticeFlag$backgroundColor$1.INSTANCE = new NoticeFlag$backgroundColor$1();
    }
}