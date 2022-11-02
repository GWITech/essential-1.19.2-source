package gg.essential.handlers;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "invoke" })
static final class PauseMenuDisplay$init$topButton$2 extends Lambda implements Function1<UIConstraints, Unit> {
    public static final PauseMenuDisplay$init$topButton$2 INSTANCE;
    
    PauseMenuDisplay$init$topButton$2() {
        super(1);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$constrainTo) {
        Intrinsics.checkNotNullParameter((Object)$this$constrainTo, "$this$constrainTo");
        $this$constrainTo.setX(new CenterConstraint());
        $this$constrainTo.setY(ConstraintsKt.plus(UtilitiesKt.getPercent(25), UtilitiesKt.getPixels(48)));
        $this$constrainTo.setWidth(UtilitiesKt.getPixels(200));
        $this$constrainTo.setHeight(UtilitiesKt.getPixels(20));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIConstraints)p1);
        return Unit.INSTANCE;
    }
    
    static {
        PauseMenuDisplay$init$topButton$2.INSTANCE = new PauseMenuDisplay$init$topButton$2();
    }
}