package gg.essential.gui.screenshot.components;

import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import gg.essential.universal.*;
import kotlin.jvm.functions.*;
import gg.essential.*;
import gg.essential.gui.*;
import gg.essential.gui.friends.message.*;
import java.awt.*;
import gg.essential.data.*;
import java.util.*;
import gg.essential.elementa.*;
import gg.essential.elementa.dsl.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.network.connectionmanager.media.*;
import java.nio.file.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007J&\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020	0\u000eR\u0016\u0010\u0004\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u000f""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotOptionsDropdown;", "", "screenshotBrowser", "Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "menuDialogOwner", "Lgg/essential/elementa/state/State;", "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "(Lgg/essential/gui/screenshot/components/ScreenshotBrowser;Lgg/essential/elementa/state/State;)V", "handleRightClick", "", "screenshotProperties", "event", "Lgg/essential/elementa/events/UIClickEvent;", "delete", "Lkotlin/Function0;", "essential" })
public final class ScreenshotOptionsDropdown
{
    @NotNull
    private final ScreenshotBrowser screenshotBrowser;
    @NotNull
    private final State<ScreenshotProperties> menuDialogOwner;
    
    public ScreenshotOptionsDropdown(@NotNull final ScreenshotBrowser screenshotBrowser, @NotNull final State<ScreenshotProperties> menuDialogOwner) {
        Intrinsics.checkNotNullParameter((Object)screenshotBrowser, "screenshotBrowser");
        Intrinsics.checkNotNullParameter((Object)menuDialogOwner, "menuDialogOwner");
        super();
        this.screenshotBrowser = screenshotBrowser;
        this.menuDialogOwner = menuDialogOwner;
    }
    
    public final void handleRightClick(@NotNull final ScreenshotProperties screenshotProperties, @NotNull final UIClickEvent event, @NotNull final Function0<Unit> delete) {
        Intrinsics.checkNotNullParameter((Object)screenshotProperties, "screenshotProperties");
        Intrinsics.checkNotNullParameter((Object)event, "event");
        Intrinsics.checkNotNullParameter((Object)delete, "delete");
        if (this.menuDialogOwner.get() != null) {
            return;
        }
        USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
        this.menuDialogOwner.set((kotlin.jvm.functions.Function1<? super ScreenshotProperties, ? extends ScreenshotProperties>)new ScreenshotOptionsDropdown$handleRightClick.ScreenshotOptionsDropdown$handleRightClick$2(screenshotProperties));
        final float posX = event.getAbsoluteX();
        final float posY = event.getAbsoluteY();
        final List options = new ArrayList();
        final ConnectionManager connectionManager2 = Essential.getInstance().getConnectionManager();
        Intrinsics.checkNotNullExpressionValue((Object)connectionManager2, "getInstance().connectionManager");
        final ConnectionManager connectionManager = connectionManager2;
        final ScreenshotManager screenshotManager2 = connectionManager.getScreenshotManager();
        Intrinsics.checkNotNullExpressionValue((Object)screenshotManager2, "connectionManager.screenshotManager");
        final ScreenshotManager screenshotManager = screenshotManager2;
        final Path path = screenshotProperties.getPath();
        options.add(new OptionMenu.Option("Edit", null, EssentialPalette.EDIT_9X7, null, null, null, null, (Function0)new ScreenshotOptionsDropdown$handleRightClick.ScreenshotOptionsDropdown$handleRightClick$3(this, screenshotProperties), 122));
        options.add(new OptionMenu.Option("Copy Image", null, EssentialPalette.COPY_9X, null, null, null, null, (Function0)new ScreenshotOptionsDropdown$handleRightClick.ScreenshotOptionsDropdown$handleRightClick$4(screenshotManager, path), 122));
        if (OnboardingData.hasAcceptedTos() && connectionManager.isAuthenticated()) {
            options.add(new OptionMenu.Option("Copy Link", null, EssentialPalette.LINK_8X7, null, null, null, null, (Function0)new ScreenshotOptionsDropdown$handleRightClick.ScreenshotOptionsDropdown$handleRightClick$5(screenshotManager, path), 122));
        }
        options.add(new OptionMenu.Option("File Location", null, EssentialPalette.MC_FOLDER_8X7, null, null, null, null, (Function0)new ScreenshotOptionsDropdown$handleRightClick.ScreenshotOptionsDropdown$handleRightClick$6(path), 122));
        options.add(new OptionMenu.Option("Properties", null, EssentialPalette.PROPERTIES_7X5, null, null, null, null, (Function0)new ScreenshotOptionsDropdown$handleRightClick.ScreenshotOptionsDropdown$handleRightClick$7(this, screenshotProperties), 122));
        options.add(new OptionMenu.Option("Delete", null, EssentialPalette.TRASH_9X, null, EssentialPalette.TEXT_RED, null, EssentialPalette.COMPONENT_BACKGROUND, (Function0)new ScreenshotOptionsDropdown$handleRightClick.ScreenshotOptionsDropdown$handleRightClick$8(this, screenshotProperties, (Function0)delete), 42));
        final float posX2 = posX;
        final float posY2 = posY;
        final Collection thisCollection$iv;
        final Collection $this$toTypedArray$iv = thisCollection$iv = options;
        final OptionMenu.Option[] array = thisCollection$iv.toArray(new OptionMenu.Option[0]);
        Intrinsics.checkNotNull((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final OptionMenu.Option[] original = array;
        final OptionMenu menu = ComponentsKt.childOf(new OptionMenu(posX2, posY2, (OptionMenu.Option[])Arrays.copyOf(original, original.length)), this.screenshotBrowser.getWindow());
        menu.init();
        menu.onClose((Function0<Unit>)new ScreenshotOptionsDropdown$handleRightClick.ScreenshotOptionsDropdown$handleRightClick$9(this));
    }
    
    public static /* synthetic */ void handleRightClick$default$58d8c182$2a411322(final ScreenshotOptionsDropdown screenshotOptionsDropdown, final ScreenshotProperties screenshotProperties, final UIClickEvent event) {
        screenshotOptionsDropdown.handleRightClick(screenshotProperties, event, (Function0<Unit>)ScreenshotOptionsDropdown$handleRightClick.ScreenshotOptionsDropdown$handleRightClick$1.INSTANCE);
    }
    
    public static final /* synthetic */ ScreenshotBrowser access$getScreenshotBrowser$p(final ScreenshotOptionsDropdown $this) {
        return $this.screenshotBrowser;
    }
    
    public static final /* synthetic */ State access$getMenuDialogOwner$p(final ScreenshotOptionsDropdown $this) {
        return $this.menuDialogOwner;
    }
}
