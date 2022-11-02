package gg.essential.gui.friends.previews;

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
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "it", "", "invoke" })
static final class ChannelPreview$description$3 extends Lambda implements Function2<UIConstraints, Boolean, Unit> {
    final /* synthetic */ ChannelPreview this$0;
    
    ChannelPreview$description$3(final ChannelPreview $receiver) {
        this.this$0 = $receiver;
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, final boolean it) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        $this$bindConstraints.setWidth(it ? ((WidthConstraint)ConstraintsKt.minus(ConstraintsKt.minus(new FillConstraint(false), ComponentConstraintsKt.componentWidthConstraint(ChannelPreview.access$getUnreadQuantity$p(this.this$0))), UtilitiesKt.getPixels(4))) : ((WidthConstraint)new FillConstraint(false)));
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (boolean)p2);
        return Unit.INSTANCE;
    }
}