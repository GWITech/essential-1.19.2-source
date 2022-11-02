package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "it", "", "invoke" })
static final class MenuButton$setIcon$1$2 extends Lambda implements Function2<UIConstraints, String, Unit> {
    final /* synthetic */ boolean $rightAligned;
    final /* synthetic */ float $xOffset;
    final /* synthetic */ MenuButton $this_apply;
    final /* synthetic */ float $yOffset;
    
    MenuButton$setIcon$1$2(final boolean $rightAligned, final float $xOffset, final MenuButton $receiver, final float $yOffset) {
        this.$rightAligned = $rightAligned;
        this.$xOffset = $xOffset;
        this.$this_apply = $receiver;
        this.$yOffset = $yOffset;
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, @NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        $this$bindConstraints.setX((it.length() > 0) ? ((XConstraint)ConstraintsKt.plus(UtilitiesKt.pixels$default(5, this.$rightAligned, false, 2, null), UtilitiesKt.getPixels(this.$xOffset))) : ((XConstraint)new CenterConstraint()));
        $this$bindConstraints.setY((it.length() > 0) ? ((YConstraint)ConstraintsKt.plus(ConstraintsKt.boundTo((SuperConstraint<Float>)UtilitiesKt.pixels$default(1, true, false, 2, null), MenuButton.access$getLabel(this.$this_apply)), UtilitiesKt.getPixels(this.$yOffset))) : ((YConstraint)new CenterConstraint()));
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (String)p2);
        return Unit.INSTANCE;
    }
}