package gg.essential.gui.menu;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
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
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "isCollapsed", "", "invoke" })
static final class LeftSideBar$player$3 extends Lambda implements Function2<UIConstraints, Boolean, Unit> {
    public static final LeftSideBar$player$3 INSTANCE;
    
    LeftSideBar$player$3() {
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, final boolean isCollapsed) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        $this$bindConstraints.setHeight(isCollapsed ? ((HeightConstraint)UtilitiesKt.getPixels(110)) : ((HeightConstraint)UtilitiesKt.getPixels(120)));
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (boolean)p2);
        return Unit.INSTANCE;
    }
    
    static {
        LeftSideBar$player$3.INSTANCE = new LeftSideBar$player$3();
    }
}