package gg.essential.gui.friends;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import gg.essential.elementa.dsl.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "it", "Lgg/essential/gui/friends/Tab;", "invoke" })
static final class SocialMenu$titleManagementActions$3 extends Lambda implements Function2<UIConstraints, Tab, Unit> {
    final /* synthetic */ SocialMenu this$0;
    
    SocialMenu$titleManagementActions$3(final SocialMenu $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, @NotNull final Tab it) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        $this$bindConstraints.setX((it == Tab.CHAT) ? ConstraintsKt.boundTo((XConstraint)UtilitiesKt.pixels$default(10, true, false, 2, null), this.this$0.getTabsSelector()) : ((XConstraint)UtilitiesKt.pixels$default(10, true, false, 2, null)));
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (Tab)p2);
        return Unit.INSTANCE;
    }
}