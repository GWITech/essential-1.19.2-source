package gg.essential.gui.screenshot.editor.tools;

import kotlin.*;
import gg.essential.gui.screenshot.editor.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006	""" }, d2 = { "Lgg/essential/gui/screenshot/editor/tools/Tool;", "", "editableScreenshot", "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;", "(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V", "getEditableScreenshot", "()Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;", "enable", "", "essential" })
public abstract class Tool
{
    @NotNull
    private final ScreenshotCanvas editableScreenshot;
    
    public Tool(@NotNull final ScreenshotCanvas editableScreenshot) {
        Intrinsics.checkNotNullParameter((Object)editableScreenshot, "editableScreenshot");
        super();
        this.editableScreenshot = editableScreenshot;
    }
    
    @NotNull
    public final ScreenshotCanvas getEditableScreenshot() {
        return this.editableScreenshot;
    }
}
