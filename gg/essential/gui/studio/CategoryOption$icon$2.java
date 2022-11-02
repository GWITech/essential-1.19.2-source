package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import kotlin.*;
import java.util.concurrent.*;
import gg.essential.elementa.components.image.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import java.util.*;
import org.jetbrains.annotations.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lgg/essential/elementa/components/UIImage;", "invoke" })
static final class CategoryOption$icon$2 extends Lambda implements Function0<UIImage> {
    final /* synthetic */ CategoryOption this$0;
    
    CategoryOption$icon$2(final CategoryOption $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    @NotNull
    public final UIImage invoke() {
        UIImage ofResourceCached;
        if (CategoryOption.access$getCategory$p(this.this$0) instanceof CosmeticStudio.Category.InfraSlot) {
            final CompletableFuture<Object> thenApplyAsync;
            ofResourceCached = new UIImage(thenApplyAsync, null, null, 6, null);
            thenApplyAsync = CategoryOption.access$getCosmeticsManager$p(this.this$0).getAssetBytes(((CosmeticStudio.Category.InfraSlot)CategoryOption.access$getCategory$p(this.this$0)).getCategory().getIcon()).thenApplyAsync((Function<? super byte[], ?>)CategoryOption$icon$2::invoke$lambda-0);
            Intrinsics.checkNotNullExpressionValue((Object)thenApplyAsync, "cosmeticsManager.getAsse\u2026am(it))\n                }");
        }
        else {
            final UIImage.Companion companion = UIImage.Companion;
            final String lowerCase = CategoryOption.access$getCategory$p(this.this$0).getId().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            ofResourceCached = companion.ofResourceCached("/assets/essential/textures/studio/" + lowerCase + ".png");
        }
        return ofResourceCached;
    }
    
    private static final BufferedImage invoke$lambda-0(final byte[] it) {
        return ImageIO.read(new ByteArrayInputStream(it));
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}