package gg.essential.gui.screenshot.components;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import java.util.function.*;
import gg.essential.elementa.state.*;
import gg.essential.handlers.screenshot.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000:
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010%
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020	0\b2\u0006\u0010\r\u001a\u00020\u0007J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\r\u001a\u00020\u0007J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0007J\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\bJ\u001e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0002R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020	0\b0\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R \u0010
                                                   \u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0017""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotStateManager;", "", "screenshotBrowser", "Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "(Lgg/essential/gui/screenshot/components/ScreenshotBrowser;)V", "aspectMap", "", "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "Lgg/essential/elementa/state/State;", "", "favoriteMap", "", "getAspectRatio", "properties", "getFavoriteState", "getFavoriteTextState", "", "handleDelete", "", "mapFavoriteText", "favorite", "registerFavoriteState", "state", "essential" })
public final class ScreenshotStateManager
{
    @NotNull
    private final ScreenshotBrowser screenshotBrowser;
    @NotNull
    private final Map<ScreenshotProperties, State<Boolean>> favoriteMap;
    @NotNull
    private final Map<ScreenshotProperties, State<Float>> aspectMap;
    
    public ScreenshotStateManager(@NotNull final ScreenshotBrowser screenshotBrowser) {
        Intrinsics.checkNotNullParameter((Object)screenshotBrowser, "screenshotBrowser");
        super();
        this.screenshotBrowser = screenshotBrowser;
        this.favoriteMap = new LinkedHashMap<ScreenshotProperties, State<Boolean>>();
        this.aspectMap = new LinkedHashMap<ScreenshotProperties, State<Float>>();
    }
    
    private final void registerFavoriteState(final ScreenshotProperties properties, final State<Boolean> state) {
        state.onSetValue((kotlin.jvm.functions.Function1<? super Boolean, Unit>)new ScreenshotStateManager$registerFavoriteState.ScreenshotStateManager$registerFavoriteState$1(properties, this));
    }
    
    @NotNull
    public final State<Float> getAspectRatio(@NotNull final ScreenshotProperties properties) {
        Intrinsics.checkNotNullParameter((Object)properties, "properties");
        final State<Float> computeIfAbsent = this.aspectMap.computeIfAbsent(properties, ScreenshotStateManager::getAspectRatio$lambda-0);
        Intrinsics.checkNotNullExpressionValue((Object)computeIfAbsent, "aspectMap.computeIfAbsen\u2026cState(16 / 9f)\n        }");
        return computeIfAbsent;
    }
    
    @NotNull
    public final State<Boolean> getFavoriteState(@NotNull final ScreenshotProperties properties) {
        Intrinsics.checkNotNullParameter((Object)properties, "properties");
        final State<Boolean> computeIfAbsent = this.favoriteMap.computeIfAbsent(properties, ScreenshotStateManager::getFavoriteState$lambda-2);
        Intrinsics.checkNotNullExpressionValue((Object)computeIfAbsent, """
                                                                        favoriteMap.computeIfAbs\u2026)
                                                                                    }
                                                                                }""");
        return computeIfAbsent;
    }
    
    @NotNull
    public final State<String> getFavoriteTextState(@NotNull final ScreenshotProperties properties) {
        Intrinsics.checkNotNullParameter((Object)properties, "properties");
        return this.mapFavoriteText(this.getFavoriteState(properties));
    }
    
    @NotNull
    public final State<String> mapFavoriteText(@NotNull final State<Boolean> favorite) {
        Intrinsics.checkNotNullParameter((Object)favorite, "favorite");
        return (State)favorite.map((kotlin.jvm.functions.Function1<? super Boolean, ?>)ScreenshotStateManager$mapFavoriteText.ScreenshotStateManager$mapFavoriteText$1.INSTANCE);
    }
    
    public final void handleDelete(@NotNull final ScreenshotProperties properties) {
        Intrinsics.checkNotNullParameter((Object)properties, "properties");
        this.aspectMap.remove(properties);
        this.favoriteMap.remove(properties);
    }
    
    private static final State getAspectRatio$lambda-0(final ScreenshotProperties it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return new BasicState(1.7777778f);
    }
    
    private static final State getFavoriteState$lambda-2(final ScreenshotStateManager this$0, final ScreenshotProperties it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final ClientScreenshotMetadata metadata = it.getMetadata();
        final BasicState state = new BasicState(metadata != null && metadata.getFavorite());
        this$0.registerFavoriteState(it, state);
        return state;
    }
    
    public static final /* synthetic */ ScreenshotBrowser access$getScreenshotBrowser$p(final ScreenshotStateManager $this) {
        return $this.screenshotBrowser;
    }
}
