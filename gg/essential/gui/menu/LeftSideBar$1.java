package gg.essential.gui.menu;

import kotlin.*;
import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.dsl.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;
import gg.essential.handlers.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "compact", "", "invoke" })
static final class LeftSideBar$1 extends Lambda implements Function2<UIConstraints, Boolean, Unit> {
    final /* synthetic */ LeftSideBar this$0;
    final /* synthetic */ UIContainer $rightSideBar;
    
    LeftSideBar$1(final LeftSideBar $receiver, final UIContainer $rightSideBar) {
        this.this$0 = $receiver;
        this.$rightSideBar = $rightSideBar;
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, final boolean compact) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        if (compact) {
            $this$bindConstraints.setX(ConstraintsKt.coerceAtMost(BasicConstraintsKt.basicXConstraint((Function1<? super UIComponent, Float>)new LeftSideBar$1.LeftSideBar$1$1(this.this$0)), ConstraintsKt.boundTo((SuperConstraint<Float>)UtilitiesKt.pixels$default(17, false, true, 1, null), LeftSideBar.access$getTopButton$p(this.this$0))));
            $this$bindConstraints.setY(ConstraintsKt.boundTo((YConstraint)UtilitiesKt.getPixels(0), LeftSideBar.access$getPlayer(this.this$0)));
            $this$bindConstraints.setWidth(ConstraintsKt.boundTo((WidthConstraint)UtilitiesKt.getPercent(100), LeftSideBar.access$getPlayer(this.this$0)));
            $this$bindConstraints.setHeight(new ChildBasedSizeConstraint(0.0f, 1, null));
        }
        else {
            $this$bindConstraints.setX(ConstraintsKt.minus(ConstraintsKt.boundTo((SuperConstraint<Float>)new SiblingConstraint(0.0f, false, 3, null), PauseMenuDisplay.Companion.getWindow()), ConstraintsKt.boundTo((SuperConstraint<Float>)new SiblingConstraint(0.0f, false, 3, null), this.$rightSideBar)));
            $this$bindConstraints.setY(UtilitiesKt.getPixels(0));
            $this$bindConstraints.setWidth(ConstraintsKt.boundTo((WidthConstraint)UtilitiesKt.getPercent(100), LeftSideBar.access$getAccountSwitcher$p(this.this$0)));
            $this$bindConstraints.setHeight(UtilitiesKt.getPercent(100));
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (boolean)p2);
        return Unit.INSTANCE;
    }
}