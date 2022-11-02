package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/UIComponent;", "invoke", "(Lgg/essential/elementa/UIComponent;)Ljava/lang/Float;" })
static final class EssentialSlider$sliderNotch$2$1 extends Lambda implements Function1<UIComponent, Float> {
    final /* synthetic */ EssentialSlider this$0;
    
    EssentialSlider$sliderNotch$2$1(final EssentialSlider $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Float invoke(@NotNull final UIComponent it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final float left = it.getParent().getLeft();
        final float floatValue = this.this$0.getFraction().get().floatValue();
        final float width = it.getParent().getWidth();
        EssentialSlider.access$getNotchWidth$p$68584c70();
        return left + floatValue * (width - 3.0f);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UIComponent)p1);
    }
}