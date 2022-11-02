package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import kotlin.*;
import gg.essential.elementa.constraints.*;
import gg.essential.gui.common.shadow.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lgg/essential/gui/common/IconButton$Layout;", "", "invoke" })
static final class IconButton$3 extends Lambda implements Function1<Pair<? extends Layout, ? extends Boolean>, Unit> {
    final /* synthetic */ IconButton this$0;
    
    IconButton$3(final IconButton $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final Pair<? extends Layout, Boolean> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final Layout layout = (Layout)pair.component1();
        final boolean emptyText = (boolean)pair.component2();
        final ShadowIcon access$getIcon = IconButton.access$getIcon(this.this$0);
        PositionConstraint positionConstraint = null;
        if (emptyText) {
            positionConstraint = new CenterConstraint();
        }
        else {
            positionConstraint = switch (WhenMappings.$EnumSwitchMapping$0[layout.ordinal()]) {
                case 1 -> UtilitiesKt.getPixels(0);
                case 2 -> ConstraintsKt.boundTo((PositionConstraint)new SiblingConstraint(6.0f, false, 2, null), IconButton.access$getButtonText(this.this$0));
                default -> throw new NoWhenBranchMatchedException();
            };
        }
        access$getIcon.setX(positionConstraint);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Pair<? extends Layout, Boolean>)p1);
        return Unit.INSTANCE;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[Layout.values().length];
            $EnumSwitchMapping$[Layout.ICON_FIRST.ordinal()] = 1;
            $EnumSwitchMapping$[Layout.TEXT_FIRST.ordinal()] = 2;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}