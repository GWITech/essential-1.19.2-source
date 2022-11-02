package gg.essential.elementa.components.image;

import kotlin.*;
import gg.essential.universal.utils.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000H&¨\u0006\b\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/components/image/CacheableImage;", "", "applyTexture", "", "texture", "Lgg/essential/universal/utils/ReleasedDynamicTexture;", "supply", "image", "Elementa" })
public interface CacheableImage
{
    void supply(@NotNull final CacheableImage p0);
    
    void applyTexture(@Nullable final ReleasedDynamicTexture p0);
}
