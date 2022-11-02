package gg.essential.gui.menu;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "compact", "", "invoke" })
static final class LeftSideBar$playerWardrobeContainer$3 extends Lambda implements Function2<UIConstraints, Boolean, Unit> {
    final /* synthetic */ UIContainer $rightSideBar;
    final /* synthetic */ LeftSideBar this$0;
    
    LeftSideBar$playerWardrobeContainer$3(final UIContainer $rightSideBar, final LeftSideBar $receiver) {
        this.$rightSideBar = $rightSideBar;
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, final boolean compact) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        $this$bindConstraints.setY(compact ? ((YConstraint)ConstraintsKt.coerceAtLeast(ConstraintsKt.boundTo((SuperConstraint<Float>)new CenterConstraint(), this.$rightSideBar), ConstraintsKt.boundTo((SuperConstraint<Float>)UtilitiesKt.pixels$default(0, true, false, 2, null), LeftSideBar.access$getBottomButton$p(this.this$0)))) : ConstraintsKt.boundTo((YConstraint)UtilitiesKt.pixels$default(0, true, false, 2, null), this.$rightSideBar));
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (boolean)p2);
        return Unit.INSTANCE;
    }
}