package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "it", "Lgg/essential/gui/common/IconButton$Layout;", "invoke" })
static final class IconButton$buttonText$2 extends Lambda implements Function2<UIConstraints, Layout, Unit> {
    public static final IconButton$buttonText$2 INSTANCE;
    
    IconButton$buttonText$2() {
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, @NotNull final Layout it) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        $this$bindConstraints.setY(new CenterConstraint());
        $this$bindConstraints.setX(switch (WhenMappings.$EnumSwitchMapping$0[it.ordinal()]) {
            case 1 -> new SiblingConstraint(5.0f, false, 2, null);
            case 2 -> UtilitiesKt.getPixels(0);
            default -> throw new NoWhenBranchMatchedException();
        });
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (Layout)p2);
        return Unit.INSTANCE;
    }
    
    static {
        IconButton$buttonText$2.INSTANCE = new IconButton$buttonText$2();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[Layout.values().length];
            $EnumSwitchMapping$[Layout.ICON_FIRST.ordinal()] = 1;
            $EnumSwitchMapping$[Layout.TEXT_FIRST.ordinal()] = 2;
            WhenMappings.$EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}