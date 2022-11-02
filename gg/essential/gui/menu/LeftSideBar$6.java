package gg.essential.gui.menu;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "compact", "", "invoke" })
static final class LeftSideBar$6 extends Lambda implements Function2<UIConstraints, Boolean, Unit> {
    final /* synthetic */ LeftSideBar this$0;
    
    LeftSideBar$6(final LeftSideBar $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, final boolean compact) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        if (compact) {
            $this$bindConstraints.setY(ConstraintsKt.boundTo((YConstraint)new SiblingConstraint(3.0f, false, 2, null), LeftSideBar.access$getWardrobeButton(this.this$0)));
            $this$bindConstraints.setWidth(UtilitiesKt.getPixels(78));
        }
        else {
            $this$bindConstraints.setY(ConstraintsKt.boundTo((YConstraint)new SiblingConstraint(0.0f, true, 1, null), LeftSideBar.access$getWardrobeButton(this.this$0)));
            $this$bindConstraints.setWidth(ConstraintsKt.minus(ConstraintsKt.boundTo((SuperConstraint<Float>)UtilitiesKt.getPercent(100), LeftSideBar.access$getWardrobeButton(this.this$0)), UtilitiesKt.getPixels(2)));
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (boolean)p2);
        return Unit.INSTANCE;
    }
}