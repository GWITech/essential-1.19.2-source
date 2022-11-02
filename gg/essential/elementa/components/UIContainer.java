package gg.essential.elementa.components;

import gg.essential.elementa.*;
import kotlin.*;
import gg.essential.universal.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007" }, d2 = { "Lgg/essential/elementa/components/UIContainer;", "Lgg/essential/elementa/UIComponent;", "()V", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "Elementa" })
public class UIContainer extends UIComponent
{
    public UIContainer() {
        super();
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.beforeDrawCompat(matrixStack);
        super.draw(matrixStack);
    }
}
