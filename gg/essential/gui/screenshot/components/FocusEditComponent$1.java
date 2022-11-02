package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "invoke" })
static final class FocusEditComponent$1 extends Lambda implements Function1<Pair<? extends Boolean, ? extends ScreenshotProperties>, String> {
    public static final FocusEditComponent$1 INSTANCE;
    
    FocusEditComponent$1() {
        super(1);
    }
    
    @NotNull
    public final String invoke(@NotNull final Pair<Boolean, ScreenshotProperties> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final boolean edits = (boolean)pair.component1();
        final ScreenshotProperties focusing = (ScreenshotProperties)pair.component2();
        return (focusing != null) ? (edits ? ("Copy of " + focusing.getPath().getFileName()) : focusing.getPath().getFileName().toString()) : "";
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair<Boolean, ScreenshotProperties>)p1);
    }
    
    static {
        INSTANCE = new Function1<Pair<? extends Boolean, ? extends ScreenshotProperties>, String>() {
            public static final FocusEditComponent$1 INSTANCE;
            
            FocusEditComponent$1() {
                super(1);
            }
            
            @NotNull
            public final String invoke(@NotNull final Pair<Boolean, ScreenshotProperties> pair) {
                Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
                final boolean edits = (boolean)pair.component1();
                final ScreenshotProperties focusing = (ScreenshotProperties)pair.component2();
                return (focusing != null) ? (edits ? ("Copy of " + focusing.getPath().getFileName()) : focusing.getPath().getFileName().toString()) : "";
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((Pair<Boolean, ScreenshotProperties>)p1);
            }
        };
    }
}