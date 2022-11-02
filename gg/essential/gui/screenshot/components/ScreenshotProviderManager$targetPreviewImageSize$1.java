package gg.essential.gui.screenshot.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;
import gg.essential.util.*;
import gg.essential.universal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "Lkotlin/Pair;", "", "invoke" })
static final class ScreenshotProviderManager$targetPreviewImageSize$1 extends Lambda implements Function0<Pair<? extends Integer, ? extends Integer>> {
    final /* synthetic */ ScreenshotProviderManager this$0;
    
    ScreenshotProviderManager$targetPreviewImageSize$1(final ScreenshotProviderManager $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    @NotNull
    public final Pair<Integer, Integer> invoke() {
        final UIComponent $this$findChildOfTypeOrNull$iv = ScreenshotProviderManager.access$getScroller$p(this.this$0);
        final ScreenshotPreview screenshotPreview = ExtensionsKt.findChildOfTypeOrNull($this$findChildOfTypeOrNull$iv, ScreenshotPreview.class, true);
        if (screenshotPreview == null) {
            return ScreenshotProviderManager.minResolutionTargetResolution;
        }
        final ScreenshotPreview preview = screenshotPreview;
        final int realWidth = (int)(preview.getWidth() * UMinecraft.getGuiScale());
        final int realHeight = (int)(preview.getHeight() * UMinecraft.getGuiScale());
        return (Pair<Integer, Integer>)ScreenshotProviderManager.access$roundResolutionToCommonValues(this.this$0, new Pair((Object)realWidth, (Object)realHeight));
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}