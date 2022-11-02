package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "view", "Lgg/essential/gui/studio/CosmeticOption$View;", "invoke" })
static final class CosmeticOption$thumbnail$1 extends Lambda implements Function2<UIConstraints, View, Unit> {
    public static final CosmeticOption$thumbnail$1 INSTANCE;
    
    CosmeticOption$thumbnail$1() {
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, @NotNull final View view) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        Intrinsics.checkNotNullParameter((Object)view, "view");
        if (view == View.Grid) {
            $this$bindConstraints.setX(UtilitiesKt.getPixels(0));
            $this$bindConstraints.setY(UtilitiesKt.getPixels(0));
            $this$bindConstraints.setWidth(UtilitiesKt.getPercent(100));
            $this$bindConstraints.setHeight(UtilitiesKt.getPercent(100));
        }
        else {
            $this$bindConstraints.setX(UtilitiesKt.getPixels(2));
            $this$bindConstraints.setY(new CenterConstraint());
            $this$bindConstraints.setWidth(new AspectConstraint(1.0f));
            $this$bindConstraints.setHeight(ConstraintsKt.minus(UtilitiesKt.getPercent(100), UtilitiesKt.getPixels(4)));
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (View)p2);
        return Unit.INSTANCE;
    }
    
    static {
        CosmeticOption$thumbnail$1.INSTANCE = new CosmeticOption$thumbnail$1();
    }
}