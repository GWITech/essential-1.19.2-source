package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import kotlin.*;
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
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "it", "Lgg/essential/gui/studio/CosmeticOption$View;", "invoke" })
static final class CosmeticOption$topBarIconContainer$3 extends Lambda implements Function2<UIConstraints, View, Unit> {
    final /* synthetic */ CosmeticOption this$0;
    
    CosmeticOption$topBarIconContainer$3(final CosmeticOption $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, @NotNull final View it) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it == View.Cart) {
            $this$bindConstraints.setX(ConstraintsKt.boundTo((XConstraint)new SiblingConstraint(7.0f, false, 2, null), CosmeticOption.access$getName(this.this$0)));
            $this$bindConstraints.setY(new CenterConstraint());
        }
        else {
            $this$bindConstraints.setX(UtilitiesKt.getPixels(0));
            $this$bindConstraints.setY(UtilitiesKt.getPixels(0));
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (View)p2);
        return Unit.INSTANCE;
    }
}