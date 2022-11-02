package gg.essential.elementa.components.image;

import kotlin.*;
import java.net.*;
import java.awt.image.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0002J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H¦\u0002¨\u0006\t\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/components/image/ImageCache;", "", "get", "Ljava/awt/image/BufferedImage;", "url", "Ljava/net/URL;", "set", "", "image", "Elementa" })
public interface ImageCache
{
    @Nullable
    BufferedImage get(@NotNull final URL p0);
    
    void set(@NotNull final URL p0, @NotNull final BufferedImage p1);
}
