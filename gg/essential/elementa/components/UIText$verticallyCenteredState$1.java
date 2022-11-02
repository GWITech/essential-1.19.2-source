package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "invoke", "(Lgg/essential/elementa/UIConstraints;)Ljava/lang/Boolean;" })
static final class UIText$verticallyCenteredState$1 extends Lambda implements Function1<UIConstraints, Boolean> {
    public static final UIText$verticallyCenteredState$1 INSTANCE;
    
    UIText$verticallyCenteredState$1() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final UIConstraints $this$asState) {
        Intrinsics.checkNotNullParameter((Object)$this$asState, "$this$asState");
        return $this$asState.getY() instanceof CenterConstraint;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UIConstraints)p1);
    }
    
    static {
        UIText$verticallyCenteredState$1.INSTANCE = new UIText$verticallyCenteredState$1();
    }
}