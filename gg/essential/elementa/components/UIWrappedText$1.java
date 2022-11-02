package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.utils.*;
import gg.essential.elementa.font.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/UIComponent;", "invoke", "(Lgg/essential/elementa/UIComponent;)Ljava/lang/Float;" })
static final class UIWrappedText$1 extends Lambda implements Function1<UIComponent, Float> {
    final /* synthetic */ UIWrappedText this$0;
    
    UIWrappedText$1(final UIWrappedText $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Float invoke(@NotNull final UIComponent it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final FontProvider fontProvider = UIWrappedText.access$getFontProvider$s1021434057(this.this$0);
        final List lines = TextKt.getStringSplitToWidth$default(this.this$0.getText(), this.this$0.getWidth(), this.this$0.getTextScale(), false, false, fontProvider, 16, null);
        if (lines.isEmpty()) {
            return 0.0f;
        }
        return ((lines.size() - 1) * UIWrappedText.access$getLineSpacing$p(this.this$0) + ((Number)UIWrappedText.access$getExtraHeightState$p(this.this$0).get()).floatValue() + (fontProvider.getBaseLineHeight() + fontProvider.getBelowLineHeight() + fontProvider.getShadowHeight())) * this.this$0.getTextScale();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UIComponent)p1);
    }
}