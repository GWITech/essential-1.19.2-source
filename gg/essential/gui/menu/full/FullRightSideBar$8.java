package gg.essential.gui.menu.full;

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
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "collapsed", "", "invoke" })
static final class FullRightSideBar$8 extends Lambda implements Function2<UIConstraints, Boolean, Unit> {
    final /* synthetic */ FullRightSideBar this$0;
    final /* synthetic */ UIContainer $bottomButton;
    
    FullRightSideBar$8(final FullRightSideBar $receiver, final UIContainer $bottomButton) {
        this.this$0 = $receiver;
        this.$bottomButton = $bottomButton;
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, final boolean collapsed) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        $this$bindConstraints.setY(collapsed ? ConstraintsKt.boundTo((YConstraint)new SiblingConstraint(4.0f, false, 2, null), this.this$0.getSocial()) : ConstraintsKt.boundTo((YConstraint)UtilitiesKt.getPixels(0), this.$bottomButton));
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (boolean)p2);
        return Unit.INSTANCE;
    }
}