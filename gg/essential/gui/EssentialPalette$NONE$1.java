package gg.essential.gui;

import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import kotlin.*;
import java.awt.image.*;
import java.util.concurrent.*;
import gg.essential.elementa.components.image.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lgg/essential/elementa/components/UIImage;", "invoke" })
static final class EssentialPalette$NONE$1 extends Lambda implements Function0<UIImage> {
    public static final EssentialPalette$NONE$1 INSTANCE;
    
    EssentialPalette$NONE$1() {
        super(0);
    }
    
    @NotNull
    public final UIImage invoke() {
        final CompletableFuture<BufferedImage> completedFuture = CompletableFuture.completedFuture(new BufferedImage(1, 1, 2));
        Intrinsics.checkNotNullExpressionValue((Object)completedFuture, "completedFuture(Buffered\u2026eredImage.TYPE_INT_ARGB))");
        return new UIImage(completedFuture, null, null, 6, null);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        EssentialPalette$NONE$1.INSTANCE = new EssentialPalette$NONE$1();
    }
}