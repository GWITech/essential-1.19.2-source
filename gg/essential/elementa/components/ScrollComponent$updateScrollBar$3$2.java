package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "component", "Lgg/essential/elementa/UIComponent;", "invoke", "(Lgg/essential/elementa/UIComponent;)Ljava/lang/Float;" })
static final class ScrollComponent$updateScrollBar$3$2 extends Lambda implements Function1<UIComponent, Float> {
    final /* synthetic */ float $scrollPercentage;
    final /* synthetic */ ScrollComponent this$0;
    
    ScrollComponent$updateScrollBar$3$2(final float $scrollPercentage, final ScrollComponent $receiver) {
        this.$scrollPercentage = $scrollPercentage;
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Float invoke(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final float offset = (component.getParent().getHeight() - component.getHeight()) * this.$scrollPercentage;
        return ScrollComponent.access$getVerticalScrollOpposite$p(this.this$0) ? (component.getParent().getBottom() - component.getHeight() + offset) : (component.getParent().getTop() + offset);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UIComponent)p1);
    }
}