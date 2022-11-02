package gg.essential.gui.common.modal;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "it", "", "invoke" })
static final class EssentialModal$titleContainer$3 extends Lambda implements Function2<UIConstraints, Boolean, Unit> {
    public static final EssentialModal$titleContainer$3 INSTANCE;
    
    EssentialModal$titleContainer$3() {
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, final boolean it) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        $this$bindConstraints.setX(new CenterConstraint());
        $this$bindConstraints.setY(UtilitiesKt.getPixel(1));
        $this$bindConstraints.setWidth(UtilitiesKt.getPercent(100));
        $this$bindConstraints.setHeight(it ? ((HeightConstraint)new ChildBasedSizeConstraint(0.0f, 1, null)) : ((HeightConstraint)UtilitiesKt.getPixels(0)));
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (boolean)p2);
        return Unit.INSTANCE;
    }
    
    static {
        EssentialModal$titleContainer$3.INSTANCE = new EssentialModal$titleContainer$3();
    }
}