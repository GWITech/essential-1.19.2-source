package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class ScrollComponent$setScrollBarComponent$4 extends Lambda implements Function1<UIComponent, Unit> {
    final /* synthetic */ boolean $isHorizontal;
    final /* synthetic */ ScrollComponent this$0;
    
    ScrollComponent$setScrollBarComponent$4(final boolean $isHorizontal, final ScrollComponent $receiver) {
        this.$isHorizontal = $isHorizontal;
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseRelease) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseRelease, "$this$onMouseRelease");
        if (this.$isHorizontal) {
            ScrollComponent.access$setHorizontalDragBeginPos$p(this.this$0, -1.0f);
        }
        else {
            ScrollComponent.access$setVerticalDragBeginPos$p(this.this$0, -1.0f);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
}