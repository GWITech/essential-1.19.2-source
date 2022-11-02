package gg.essential.gui.common.input;

import kotlin.*;
import kotlin.ranges.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002\b\u0084\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\b\u0010	"\u0004\b
                                                   \u0010\u000b¨\u0006\u0012""" }, d2 = { "Lgg/essential/gui/common/input/AbstractTextInput$TextualLine;", "Lgg/essential/gui/common/input/AbstractTextInput$Line;", "Lgg/essential/gui/common/input/AbstractTextInput;", "text", "", "visualIndices", "Lkotlin/ranges/IntRange;", "(Lgg/essential/gui/common/input/AbstractTextInput;Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getVisualIndices", "()Lkotlin/ranges/IntRange;", "setVisualIndices", "(Lkotlin/ranges/IntRange;)V", "addTextAt", "", "newText", "column", "", "toString", "essential" })
protected final class TextualLine extends Line
{
    @NotNull
    private IntRange visualIndices;
    
    public TextualLine(@NotNull final String text, @NotNull final IntRange visualIndices) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)visualIndices, "visualIndices");
        super(text);
        this.visualIndices = visualIndices;
    }
    
    public TextualLine(final AbstractTextInput abstractTextInput, final String text) {
        this(text, new IntRange(0, 0));
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
            ((Line)this).setText(((Line)this).getText() + newText);
        }
        else {
            final String substring = ((Line)this).getText().substring(0, column);
            Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            final String substring2 = ((Line)this).getText().substring(column);
            Intrinsics.checkNotNullExpressionValue((Object)substring2, "this as java.lang.String).substring(startIndex)");
            ((Line)this).setText(substring + newText + substring2);
        }
    }
    
    @NotNull
    @Override
    public String toString() {
        return "TextualLine(text=" + ((Line)this).getText() + ", visualIndices=" + this.visualIndices;
    }
}
