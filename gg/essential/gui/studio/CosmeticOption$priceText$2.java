package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "view", "Lgg/essential/gui/studio/CosmeticOption$View;", "invoke" })
static final class CosmeticOption$priceText$2 extends Lambda implements Function2<UIConstraints, View, Unit> {
    public static final CosmeticOption$priceText$2 INSTANCE;
    
    CosmeticOption$priceText$2() {
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, @NotNull final View view) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        Intrinsics.checkNotNullParameter((Object)view, "view");
        if (view == View.Grid) {
            $this$bindConstraints.setX(UtilitiesKt.getPixels(2));
            $this$bindConstraints.setY(UtilitiesKt.pixels$default(0, true, false, 2, null));
        }
        else {
            $this$bindConstraints.setX(UtilitiesKt.pixels$default((view == View.Cart) ? 30 : 5, true, false, 2, null));
            $this$bindConstraints.setY(new CenterConstraint());
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (View)p2);
        return Unit.INSTANCE;
    }
    
    static {
        CosmeticOption$priceText$2.INSTANCE = new CosmeticOption$priceText$2();
    }
}