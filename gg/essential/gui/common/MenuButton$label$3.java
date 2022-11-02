package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke" })
static final class MenuButton$label$3 extends Lambda implements Function2<UIConstraints, Pair<? extends Boolean, ? extends Boolean>, Unit> {
    final /* synthetic */ MenuButton this$0;
    
    MenuButton$label$3(final MenuButton $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, @NotNull final Pair<Boolean, Boolean> pair) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final boolean collapsed = (boolean)pair.component1();
        final boolean iconVisible = (boolean)pair.component2();
        $this$bindConstraints.setX((collapsed && !iconVisible) ? ((XConstraint)new CenterConstraint()) : ((XConstraint)ConstraintsKt.plus((SuperConstraint<Float>)MenuButton.access$getTextAlignment$p(this.this$0).getConstraint().invoke(), UtilitiesKt.getPixels(MenuButton.access$getTextXOffset$p(this.this$0)))));
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (Pair)p2);
        return Unit.INSTANCE;
    }
}