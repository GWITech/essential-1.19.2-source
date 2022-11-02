package gg.essential.vigilance.gui.common.input;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0094\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r" }, d2 = { "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$Line;", "", "text", "", "(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;Ljava/lang/String;)V", "length", "", "getLength", "()I", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Vigilance" })
protected class Line
{
    @NotNull
    private String text;
    final /* synthetic */ AbstractTextInput this$0;
    
    public Line(@NotNull final AbstractTextInput this$0, final String text) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this.this$0 = this$0;
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
