package gg.essential.elementa.effects;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class RecursiveFadeEffect$remove$1 extends Lambda implements Function1<UIComponent, Unit> {
    public static final RecursiveFadeEffect$remove$1 INSTANCE;
    
    RecursiveFadeEffect$remove$1() {
        super(1);
    }
    
    public final void invoke(@NotNull final UIComponent it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getConstraints().getColor() instanceof OverridableAlphaColorConstraint) {
            final UIComponent $this$constrain$iv = it;
            final int $i$f$constrain = 0;
            final UIComponent $this$constrain_u24lambda_u2d0$iv = $this$constrain$iv;
            final int n = 0;
            final UIConstraints $this$invoke_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            final int n2 = 0;
            $this$invoke_u24lambda_u2d0.setColor(((OverridableAlphaColorConstraint)$this$invoke_u24lambda_u2d0.getColor()).getOriginalConstraint());
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
    
    static {
        RecursiveFadeEffect$remove$1.INSTANCE = new RecursiveFadeEffect$remove$1();
    }
}