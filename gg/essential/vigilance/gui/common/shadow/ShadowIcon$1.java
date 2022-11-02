package gg.essential.vigilance.gui.common.shadow;

import kotlin.jvm.functions.*;
import gg.essential.vigilance.utils.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.components.image.*;
import gg.essential.vigilance.gui.common.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.state.*;
import java.awt.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.effects.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lgg/essential/vigilance/utils/ImageFactory;", "", "invoke" })
static final class ShadowIcon$1 extends Lambda implements Function1<Pair<? extends ImageFactory, ? extends Boolean>, Unit> {
    final /* synthetic */ ShadowIcon this$0;
    
    ShadowIcon$1(final ShadowIcon $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final Pair<? extends ImageFactory, Boolean> $dstr$icon$shadow) {
        Intrinsics.checkNotNullParameter((Object)$dstr$icon$shadow, "$dstr$icon$shadow");
        final ImageFactory icon = (ImageFactory)$dstr$icon$shadow.component1();
        final boolean shadow = (boolean)$dstr$icon$shadow.component2();
        this.this$0.clearChildren();
        final UIComponent $this$constrain$iv = icon.create();
        final int $i$f$constrain = 0;
        final UIComponent $this$constrain_u24lambda_u2d0$iv = $this$constrain$iv;
        final int n = 0;
        final UIConstraints $this$invoke_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        final int n2 = 0;
        $this$invoke_u24lambda_u2d0.setWidth(UtilitiesKt.getPercent(100));
        $this$invoke_u24lambda_u2d0.setHeight(UtilitiesKt.getPercent(100));
        final UIComponent uiComponent = $this$constrain_u24lambda_u2d0$iv;
        final ShadowIcon this$0 = this.this$0;
        final UIImage it = (UIImage)uiComponent;
        final int n3 = 0;
        it.supply(new AutoImageSize(this$0, false, 2, null));
        final UIComponent image = ComponentsKt.childOf(((UIImage)uiComponent).setColor(ExtensionsKt.toConstraint(ShadowIcon.access$getPrimaryColorState$p(this.this$0))), this.this$0);
        if (shadow) {
            ComponentsKt.effect(image, new ShadowEffect(null, 1, null).rebindColor(ShadowIcon.access$getShadowColorState$p(this.this$0)));
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Pair<? extends ImageFactory, Boolean>)p1);
        return Unit.INSTANCE;
    }
}