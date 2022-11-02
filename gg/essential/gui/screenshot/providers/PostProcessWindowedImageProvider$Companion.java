package gg.essential.gui.screenshot.providers;

import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.screenshot.downsampling.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000"
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020\b¨\u0006
                                                   """ }, d2 = { "Lgg/essential/gui/screenshot/providers/PostProcessWindowedImageProvider$Companion;", "", "()V", "bicubicFilter", "Lkotlin/Function1;", "Lgg/essential/gui/screenshot/downsampling/PixelBuffer;", "Lkotlin/ExtensionFunctionType;", "maxWidth", "", "maxHeight", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final Function1<PixelBuffer, PixelBuffer> bicubicFilter(final int maxWidth, final int maxHeight) {
        return (Function1<PixelBuffer, PixelBuffer>)new PostProcessWindowedImageProvider$Companion$bicubicFilter.PostProcessWindowedImageProvider$Companion$bicubicFilter$1(maxWidth, maxHeight);
    }
    
    public Companion(final byte b) {
        this();
    }
}
