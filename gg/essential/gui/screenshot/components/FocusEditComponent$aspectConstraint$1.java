package gg.essential.gui.screenshot.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.screenshot.image.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/screenshot/image/PixelBufferTexture;", "invoke", "(Lgg/essential/gui/screenshot/image/PixelBufferTexture;)Ljava/lang/Float;" })
static final class FocusEditComponent$aspectConstraint$1 extends Lambda implements Function1<PixelBufferTexture, Float> {
    public static final FocusEditComponent$aspectConstraint$1 INSTANCE;
    
    FocusEditComponent$aspectConstraint$1() {
        super(1);
    }
    
    @NotNull
    public final Float invoke(@Nullable final PixelBufferTexture it) {
        return (it != null) ? (it.getImageWidth() / (float)it.getImageHeight()) : 1.7777778f;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((PixelBufferTexture)p1);
    }
    
    static {
        FocusEditComponent$aspectConstraint$1.INSTANCE = new FocusEditComponent$aspectConstraint$1();
    }
}