package gg.essential.elementa.components.image;

import kotlin.*;
import java.awt.image.*;
import org.jetbrains.annotations.*;
import gg.essential.universal.utils.*;
import java.awt.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import gg.essential.elementa.utils.*;
import javax.imageio.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012" }, d2 = { "Lgg/essential/elementa/components/image/DefaultFailureImage;", "Lgg/essential/elementa/components/image/ImageProvider;", "()V", "loadingImage", "Ljava/awt/image/BufferedImage;", "loadingTexture", "Lgg/essential/universal/utils/ReleasedDynamicTexture;", "drawImage", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "x", "", "y", "width", "height", "color", "Ljava/awt/Color;", "Elementa" })
public final class DefaultFailureImage implements ImageProvider
{
    @NotNull
    public static final DefaultFailureImage INSTANCE;
    @Nullable
    private static BufferedImage loadingImage;
    private static ReleasedDynamicTexture loadingTexture;
    
    private DefaultFailureImage() {
        super();
    }
    
    @Override
    public void drawImage(@NotNull final UMatrixStack matrixStack, final double x, final double y, final double width, final double height, @NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        if (DefaultFailureImage.loadingTexture == null) {
            final BufferedImage loadingImage = DefaultFailureImage.loadingImage;
            Intrinsics.checkNotNull((Object)loadingImage);
            final ReleasedDynamicTexture texture = UGraphics.getTexture(loadingImage);
            Intrinsics.checkNotNullExpressionValue((Object)texture, "getTexture(loadingImage!!)");
            DefaultFailureImage.loadingTexture = texture;
            DefaultFailureImage.loadingImage = null;
        }
        ReleasedDynamicTexture loadingTexture;
        if ((loadingTexture = DefaultFailureImage.loadingTexture) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingTexture");
            loadingTexture = null;
        }
        ImageKt.drawTexture(matrixStack, loadingTexture, color, x, y, width, height, 9729, 9729);
    }
    
    static {
        INSTANCE = new DefaultFailureImage();
        DefaultFailureImage.loadingImage = ImageIO.read(DefaultFailureImage.INSTANCE.getClass().getResourceAsStream("/textures/failure.png"));
    }
}
