package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "xAlignment", "Lgg/essential/gui/common/MenuButton$Alignment;", "invoke" })
static final class NoticeFlag$textContainer$3 extends Lambda implements Function2<UIConstraints, MenuButton.Alignment, Unit> {
    public static final NoticeFlag$textContainer$3 INSTANCE;
    
    NoticeFlag$textContainer$3() {
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, @NotNull final MenuButton.Alignment xAlignment) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        Intrinsics.checkNotNullParameter((Object)xAlignment, "xAlignment");
        $this$bindConstraints.setX((XConstraint)xAlignment.getConstraint().invoke());
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (MenuButton.Alignment)p2);
        return Unit.INSTANCE;
    }
    
    static {
        NoticeFlag$textContainer$3.INSTANCE = new NoticeFlag$textContainer$3();
    }
}