package gg.essential.gui.common.input;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001c
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0005\b\u0084\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010
                                                   \u001a\u00020\u0004H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010	¨\u0006\u000b""" }, d2 = { "Lgg/essential/gui/common/input/AbstractTextInput$VisualLine;", "Lgg/essential/gui/common/input/AbstractTextInput$Line;", "Lgg/essential/gui/common/input/AbstractTextInput;", "text", "", "textIndex", "", "(Lgg/essential/gui/common/input/AbstractTextInput;Ljava/lang/String;I)V", "getTextIndex", "()I", "toString", "essential" })
protected final class VisualLine extends Line
{
    private final int textIndex;
    
    public VisualLine(@NotNull final String text, final int textIndex) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        super(text);
        this.textIndex = textIndex;
    }
    
    public final int getTextIndex() {
        return this.textIndex;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "VisualLine(text=" + ((Line)this).getText() + ", textIndex=" + this.textIndex;
    }
}
