package gg.essential.handlers;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.properties.*;
import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.*;
import gg.essential.elementa.dsl.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;

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
static final class PauseMenuDisplay$init$rightContainer$3 extends Lambda implements Function2<UIConstraints, Pair<? extends Boolean, ? extends Boolean>, Unit> {
    final /* synthetic */ ReadWriteProperty<Object, UIContainer> $topButton$delegate;
    final /* synthetic */ ReadWriteProperty<Object, UIContainer> $bottomButton$delegate;
    
    PauseMenuDisplay$init$rightContainer$3(final ReadWriteProperty<Object, UIContainer> $topButton$delegate, final ReadWriteProperty<Object, UIContainer> $bottomButton$delegate) {
        this.$topButton$delegate = $topButton$delegate;
        this.$bottomButton$delegate = $bottomButton$delegate;
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, @NotNull final Pair<Boolean, Boolean> pair) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final boolean collapse = (boolean)pair.component1();
        final boolean isCompact = (boolean)pair.component2();
        if (isCompact) {
            $this$bindConstraints.setX(ConstraintsKt.coerceAtLeast(ConstraintsKt.boundTo((SuperConstraint<Float>)UtilitiesKt.pixels$default(13, true, false, 2, null), PauseMenuDisplay.Companion.getWindow()), ConstraintsKt.plus(ConstraintsKt.boundTo((SuperConstraint<Float>)UtilitiesKt.pixels$default(0, true, false, 2, null), PauseMenuDisplay.access$init$lambda-0(this.$topButton$delegate)), UtilitiesKt.getPixels(24))));
            $this$bindConstraints.setY(ConstraintsKt.coerceAtLeast(ConstraintsKt.coerceAtMost(ConstraintsKt.div(ConstraintsKt.plus(ConstraintsKt.boundTo((SuperConstraint<Float>)new CenterConstraint(), PauseMenuDisplay.access$init$lambda-1(this.$bottomButton$delegate)), ConstraintsKt.boundTo((SuperConstraint<Float>)new CenterConstraint(), PauseMenuDisplay.access$init$lambda-0(this.$topButton$delegate))), 2), ConstraintsKt.boundTo((SuperConstraint<Float>)UtilitiesKt.pixels$default(40, true, false, 2, null), PauseMenuDisplay.Companion.getWindow())), ConstraintsKt.boundTo((SuperConstraint<Float>)UtilitiesKt.pixels$default(0, true, false, 2, null), PauseMenuDisplay.access$init$lambda-1(this.$bottomButton$delegate))));
            $this$bindConstraints.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
        }
        else {
            $this$bindConstraints.setWidth(collapse ? ((WidthConstraint)UtilitiesKt.getPixels(68)) : ((WidthConstraint)UtilitiesKt.getPixels(104)));
            $this$bindConstraints.setX(ConstraintsKt.coerceIn(ConstraintsKt.plus(ConstraintsKt.boundTo((SuperConstraint<Float>)new SiblingConstraint(0.0f, false, 3, null), PauseMenuDisplay.access$init$lambda-0(this.$topButton$delegate)), ConstraintsKt.minus(ConstraintsKt.div(ConstraintsKt.plus(ConstraintsKt.boundTo((SuperConstraint<Float>)UtilitiesKt.getPixels(0), PauseMenuDisplay.access$init$lambda-0(this.$topButton$delegate)), UtilitiesKt.getPixels(28)), 2.0f), ConstraintsKt.div($this$bindConstraints.getWidth(), 2))), ConstraintsKt.boundTo((SuperConstraint<Float>)new SiblingConstraint(28.0f, false, 2, null), PauseMenuDisplay.access$init$lambda-0(this.$topButton$delegate)), ConstraintsKt.boundTo((SuperConstraint<Float>)new SiblingConstraint(65.0f, false, 2, null), PauseMenuDisplay.access$init$lambda-0(this.$topButton$delegate))));
            $this$bindConstraints.setY(ConstraintsKt.coerceAtLeast(UtilitiesKt.getPixels(28), ConstraintsKt.minus(ConstraintsKt.boundTo((SuperConstraint<Float>)UtilitiesKt.getPixels(0), PauseMenuDisplay.access$init$lambda-0(this.$topButton$delegate)), UtilitiesKt.getPixels(100))));
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (Pair)p2);
        return Unit.INSTANCE;
    }
}