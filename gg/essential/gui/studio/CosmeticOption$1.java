package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.*;
import gg.essential.elementa.dsl.*;
import gg.essential.gui.elementa.*;
import kotlin.jvm.internal.*;
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
static final class CosmeticOption$1 extends Lambda implements Function2<UIConstraints, View, Unit> {
    final /* synthetic */ CosmeticOption this$0;
    
    CosmeticOption$1(final CosmeticOption $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, @NotNull final View view) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        Intrinsics.checkNotNullParameter((Object)view, "view");
        if (view == View.Grid) {
            $this$bindConstraints.setX(new SpacedCramSiblingConstraint(ConstraintsKt.boundTo((WidthConstraint)UtilitiesKt.percent(0.5), this.this$0.getWindow()), UtilitiesKt.getPixels(0)));
            $this$bindConstraints.setY(new SpacedCramSiblingConstraint(ConstraintsKt.boundTo((WidthConstraint)UtilitiesKt.percent(0.5), this.this$0.getWindow()), UtilitiesKt.getPixels(0)));
            $this$bindConstraints.setWidth(ConstraintsKt.boundTo((WidthConstraint)new SizeCramConstraint(ConstraintsKt.boundTo((WidthConstraint)UtilitiesKt.percent(0.5), this.this$0.getWindow()), UtilitiesKt.getPixels(2)), this.this$0.getWindow()));
            $this$bindConstraints.setHeight(new AspectConstraint(0.0f, 1, null));
        }
        else {
            $this$bindConstraints.setX(new CenterConstraint());
            $this$bindConstraints.setY(new SiblingConstraint(8.0f, false, 2, null));
            $this$bindConstraints.setWidth(ConstraintsKt.minus(UtilitiesKt.getPercent(100), UtilitiesKt.getPixels(8)));
            $this$bindConstraints.setHeight(UtilitiesKt.getPixels(30));
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (View)p2);
        return Unit.INSTANCE;
    }
}