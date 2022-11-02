package gg.essential.elementa.components.image;

import gg.essential.universal.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0017J8\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/components/image/ImageProvider;", "", "drawImage", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "x", "", "y", "width", "height", "color", "Ljava/awt/Color;", "drawImageCompat", "Elementa" })
public interface ImageProvider
{
    default void drawImage(@NotNull final UMatrixStack matrixStack, final double x, final double y, final double width, final double height, @NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        matrixStack.runWithGlobalState((kotlin.jvm.functions.Function0<?>)new ImageProvider$drawImage.ImageProvider$drawImage$1(this, x, y, width, height, color));
    }
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "drawImage(matrixStack, x, y, width, height, color)", imports = {}))
    @java.lang.Deprecated
    default void drawImage(final double x, final double y, final double width, final double height, @NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this.drawImage(UMatrixStack.Compat.INSTANCE.get(), x, y, width, height, color);
    }
    
    default void drawImageCompat(@NotNull final UMatrixStack matrixStack, final double x, final double y, final double width, final double height, @NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        UMatrixStack.Compat.INSTANCE.runLegacyMethod(matrixStack, (kotlin.jvm.functions.Function0<?>)new ImageProvider$drawImageCompat.ImageProvider$drawImageCompat$1(this, x, y, width, height, color));
    }
    
    default /* synthetic */ void access$drawImage$jd(final ImageProvider $this, final UMatrixStack matrixStack, final double x, final double y, final double width, final double height, final Color color) {
        $this.drawImage(matrixStack, x, y, width, height, color);
    }
    
    default /* synthetic */ void access$drawImage$jd(final ImageProvider $this, final double x, final double y, final double width, final double height, final Color color) {
        $this.drawImage(x, y, width, height, color);
    }
    
    default /* synthetic */ void access$drawImageCompat$jd(final ImageProvider $this, final UMatrixStack matrixStack, final double x, final double y, final double width, final double height, final Color color) {
        $this.drawImageCompat(matrixStack, x, y, width, height, color);
    }
}
