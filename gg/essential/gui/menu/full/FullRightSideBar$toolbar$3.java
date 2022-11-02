package gg.essential.gui.menu.full;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.*;
import gg.essential.elementa.dsl.*;
import gg.essential.handlers.*;
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
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "collapsed", "", "invoke" })
static final class FullRightSideBar$toolbar$3 extends Lambda implements Function2<UIConstraints, Boolean, Unit> {
    final /* synthetic */ UIContainer $bottomButton;
    
    FullRightSideBar$toolbar$3(final UIContainer $bottomButton) {
        this.$bottomButton = $bottomButton;
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, final boolean collapsed) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        $this$bindConstraints.setY(collapsed ? ConstraintsKt.boundTo((YConstraint)UtilitiesKt.getPixels(0), this.$bottomButton) : ((YConstraint)ConstraintsKt.coerceAtMost(ConstraintsKt.boundTo((SuperConstraint<Float>)UtilitiesKt.pixels$default(4, true, false, 2, null), PauseMenuDisplay.Companion.getWindow()), ConstraintsKt.boundTo((SuperConstraint<Float>)new SiblingConstraint(30.0f, false, 2, null), this.$bottomButton))));
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (boolean)p2);
        return Unit.INSTANCE;
    }
}