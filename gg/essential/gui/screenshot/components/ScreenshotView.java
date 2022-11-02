package gg.essential.gui.screenshot.components;

import gg.essential.elementa.components.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020	0\bX\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\f""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotView;", "Lgg/essential/elementa/components/UIContainer;", "view", "Lgg/essential/gui/screenshot/components/View;", "screenshotBrowser", "Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "(Lgg/essential/gui/screenshot/components/View;Lgg/essential/gui/screenshot/components/ScreenshotBrowser;)V", "active", "Lgg/essential/elementa/state/State;", "", "getActive", "()Lgg/essential/elementa/state/State;", "essential" })
public abstract class ScreenshotView extends UIContainer
{
    @NotNull
    private final View view;
    @NotNull
    private final State<Boolean> active;
    
    public ScreenshotView(@NotNull final View view, @NotNull final ScreenshotBrowser screenshotBrowser) {
        Intrinsics.checkNotNullParameter((Object)view, "view");
        Intrinsics.checkNotNullParameter((Object)screenshotBrowser, "screenshotBrowser");
        super();
        this.view = view;
        this.active = (State<Boolean>)screenshotBrowser.getCurrentView().map((kotlin.jvm.functions.Function1<? super Object, ?>)new ScreenshotView$active.ScreenshotView$active$1(this));
    }
    
    @NotNull
    public State<Boolean> getActive() {
        return this.active;
    }
    
    public static final /* synthetic */ View access$getView$p(final ScreenshotView $this) {
        return $this.view;
    }
}
