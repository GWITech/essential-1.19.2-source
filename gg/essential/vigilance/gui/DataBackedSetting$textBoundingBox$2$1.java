package gg.essential.vigilance.gui;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import kotlin.ranges.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "component", "Lgg/essential/elementa/UIComponent;", "invoke", "(Lgg/essential/elementa/UIComponent;)Ljava/lang/Float;" })
static final class DataBackedSetting$textBoundingBox$2$1 extends Lambda implements Function1<UIComponent, Float> {
    final /* synthetic */ DataBackedSetting this$0;
    
    DataBackedSetting$textBoundingBox$2$1(final DataBackedSetting $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Float invoke(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final Iterator iterator = CollectionsKt.minus((Iterable)DataBackedSetting.access$getBoundingBox(this.this$0).getChildren(), (Object)component).iterator();
        Float value;
        if (!iterator.hasNext()) {
            final Float n = value = null;
        }
        else {
            final UIComponent it = (UIComponent)iterator.next();
            final int n2 = 0;
            float n3 = it.getLeft();
            while (iterator.hasNext()) {
                final UIComponent it2 = (UIComponent)iterator.next();
                final int n4 = 0;
                n3 = Math.min(n3, it2.getLeft());
            }
            final Float n = value = n3;
        }
        Float n;
        final float endPos = (value == null) ? DataBackedSetting.access$getBoundingBox(this.this$0).getRight() : n;
        return RangesKt.coerceAtMost(endPos - component.getLeft() - 10.0f, 364.0f);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UIComponent)p1);
    }
}