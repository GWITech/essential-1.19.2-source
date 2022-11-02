package gg.essential.gui.image;

import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005""" }, d2 = { "ImageFactory", "Lgg/essential/gui/image/ImageFactory;", "generator", "Lkotlin/Function0;", "Lgg/essential/elementa/components/UIImage;", "essential" })
public final class ImageFactoryKt
{
    @NotNull
    public static final ImageFactory ImageFactory(@NotNull final Function0<? extends UIImage> generator) {
        Intrinsics.checkNotNullParameter((Object)generator, "generator");
        return (ImageFactory)new ImageFactoryKt$ImageFactory.ImageFactoryKt$ImageFactory$1((Function0)generator);
    }
}
