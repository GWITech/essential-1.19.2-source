package gg.essential.gui.common.input;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0007\b\u0094\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b	\u0010
                                                   "\u0004\b\u000b\u0010\f¨\u0006""" }, d2 = { "Lgg/essential/gui/common/input/AbstractTextInput$Line;", "", "text", "", "(Lgg/essential/gui/common/input/AbstractTextInput;Ljava/lang/String;)V", "length", "", "getLength", "()I", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "essential" })
protected class Line
{
    @NotNull
    private String text;
    
    public Line(@NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        super();
        this.text = text;
    }
    
    @NotNull
    public final String getText() {
        return this.text;
    }
    
    public final void setText(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.text = <set-?>;
    }
    
    public final int getLength() {
        return this.text.length();
    }
}
