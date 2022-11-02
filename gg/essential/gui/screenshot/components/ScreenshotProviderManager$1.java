package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.screenshot.providers.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke" })
static final class ScreenshotProviderManager$1 extends Lambda implements Function1<Pair<? extends Integer, ? extends Integer>, Unit> {
    final /* synthetic */ ScreenshotProviderManager this$0;
    
    ScreenshotProviderManager$1(final ScreenshotProviderManager $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final Pair<Integer, Integer> it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        ScreenshotProviderManager.access$setFocusImageResolution$p(this.this$0, new TransitionWindowedProvider(ScreenshotProviderManager.access$createFocusImageProvider(this.this$0, it), ScreenshotProviderManager.access$getFocusImageResolution$p(this.this$0)));
        ScreenshotProviderManager.access$getFocusImageResolution$p(this.this$0).setItems(this.this$0.getCurrentPaths());
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Pair<Integer, Integer>)p1);
        return Unit.INSTANCE;
    }
}