package gg.essential.gui.menu.full;

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
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "collapsed", "", "invoke" })
static final class FullRightSideBar$6 extends Lambda implements Function2<UIConstraints, Boolean, Unit> {
    public static final FullRightSideBar$6 INSTANCE;
    
    FullRightSideBar$6() {
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, final boolean collapsed) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        $this$bindConstraints.setX(collapsed ? ((XConstraint)new CenterConstraint()) : ((XConstraint)UtilitiesKt.pixels$default(0, true, false, 2, null)));
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (boolean)p2);
        return Unit.INSTANCE;
    }
    
    static {
        INSTANCE = new Function2<UIConstraints, Boolean, Unit>() {
            public static final FullRightSideBar$6 INSTANCE;
            
            FullRightSideBar$6() {
                super(2);
            }
            
            public final void invoke(@NotNull final UIConstraints $this$bindConstraints, final boolean collapsed) {
                Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
                $this$bindConstraints.setX(collapsed ? ((XConstraint)new CenterConstraint()) : ((XConstraint)UtilitiesKt.pixels$default(0, true, false, 2, null)));
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIConstraints)p1, (boolean)p2);
                return Unit.INSTANCE;
            }
        };
    }
}