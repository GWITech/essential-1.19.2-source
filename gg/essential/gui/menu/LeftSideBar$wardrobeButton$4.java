package gg.essential.gui.menu;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
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
static final class LeftSideBar$wardrobeButton$4 extends Lambda implements Function2<UIConstraints, Pair<? extends Boolean, ? extends Boolean>, Unit> {
    final /* synthetic */ LeftSideBar this$0;
    
    LeftSideBar$wardrobeButton$4(final LeftSideBar $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, @NotNull final Pair<Boolean, Boolean> pair) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final boolean collapsed = (boolean)pair.component1();
        final boolean isCompact = (boolean)pair.component2();
        if (isCompact) {
            $this$bindConstraints.setX(new CenterConstraint());
            $this$bindConstraints.setY(new SiblingConstraint(9.0f, false, 2, null));
        }
        else if (collapsed) {
            $this$bindConstraints.setX(new CenterConstraint());
            $this$bindConstraints.setY(new SiblingConstraint(10.0f, false, 2, null));
        }
        else {
            $this$bindConstraints.setX(ConstraintsKt.boundTo((XConstraint)UtilitiesKt.getPixels(0), this.this$0));
            $this$bindConstraints.setY(new SiblingConstraint(30.0f, false, 2, null));
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (Pair)p2);
        return Unit.INSTANCE;
    }
}