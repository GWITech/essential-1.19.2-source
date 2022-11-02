package gg.essential.vigilance.gui.common.input;

import kotlin.*;
import kotlin.ranges.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0084\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0012" }, d2 = { "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine;", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$Line;", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput;", "text", "", "visualIndices", "Lkotlin/ranges/IntRange;", "(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getVisualIndices", "()Lkotlin/ranges/IntRange;", "setVisualIndices", "(Lkotlin/ranges/IntRange;)V", "addTextAt", "", "newText", "column", "", "toString", "Vigilance" })
protected final class TextualLine extends Line
{
    @NotNull
    private IntRange visualIndices;
    final /* synthetic */ AbstractTextInput this$0;
    
    public TextualLine(@NotNull final AbstractTextInput this$0, @NotNull final String text, final IntRange visualIndices) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)visualIndices, "visualIndices");
        this.this$0 = this$0;
        this$0.super(text);
        this.visualIndices = visualIndices;
    }
    
    public TextualLine(final AbstractTextInput abstractTextInput, final String text, IntRange visualIndices, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        this.this$0 = abstractTextInput;
        if ((n & 0x2) != 0x0) {
            visualIndices = new IntRange(0, 0);
        }
        this(abstractTextInput, text, visualIndices);
    }
    
    @NotNull
    public final IntRange getVisualIndices() {
        return this.visualIndices;
    }
    
    public final void setVisualIndices(@NotNull final IntRange <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.visualIndices = <set-?>;
    }
    
    public final void addTextAt(@NotNull final String newText, final int column) {
        Intrinsics.checkNotNullParameter((Object)newText, "newText");
        if (column >= ((Line)this).getText().length()) {
            ((Line)this).setText(Intrinsics.stringPlus(((Line)this).getText(), (Object)newText));
        }
        else {
            final StringBuilder sb = new StringBuilder();
            final String text = ((Line)this).getText();
            final int beginIndex = 0;
            final String s = text;
            if (s == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring = s.substring(beginIndex, column);
            Intrinsics.checkNotNullExpressionValue((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final StringBuilder append = sb.append(substring).append(newText);
            final String text2 = ((Line)this).getText();
            if (text2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring2 = text2.substring(column);
            Intrinsics.checkNotNullExpressionValue((Object)substring2, "(this as java.lang.String).substring(startIndex)");
            ((Line)this).setText(append.append(substring2).toString());
        }
    }
    
    @NotNull
    @Override
    public String toString() {
        return "TextualLine(text=" + ((Line)this).getText() + ", visualIndices=" + this.visualIndices + ')';
    }
}
