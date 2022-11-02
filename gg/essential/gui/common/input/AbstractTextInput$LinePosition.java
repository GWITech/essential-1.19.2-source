package gg.essential.gui.common.input;

import java.util.*;
import kotlin.collections.*;
import kotlin.text.*;
import kotlin.ranges.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.font.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000D
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000f
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\f
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u0000
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0005\b\u0084\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0000R\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u0016\u001a\u00020\u00042
                                                   \u0010\u0017\u001a\u00060\u0000R\u00020\u0002H\u0096\u0002J\u0018\u0010\u0018\u001a\u00060\u0000R\u00020\u00022
                                                   \u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0002J\u0018\u0010\u001a\u001a\u00060\u0000R\u00020\u00022
                                                   \u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0002J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u0012\u0010\u001e\u001a\u00060\u0000R\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004J!\u0010 \u001a\u00060\u0000R\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00042
                                                   \u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0082\u0010J!\u0010!\u001a\u00060\u0000R\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00042
                                                   \u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0082\u0010J\u0018\u0010"\u001a\u00060\u0000R\u00020\u00022
                                                   \u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0002J\u0018\u0010#\u001a\u00060\u0000R\u00020\u00022
                                                   \u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0002J\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0%J\b\u0010'\u001a\u00020(H\u0016J
                                                   \u0010)\u001a\u00060\u0000R\u00020\u0002J
                                                   \u0010*\u001a\u00060\u0000R\u00020\u0002J\u0012\u0010+\u001a\u00060\u0000R\u00020\u00022\u0006\u0010,\u001a\u00020\u0004R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u0011\u0010\u000b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0012\u0010
                                                   R\u0018\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0015R\u00020\u00020\u0014X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006-""" }, d2 = { "Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;", "", "Lgg/essential/gui/common/input/AbstractTextInput;", "line", "", "column", "isVisual", "", "(Lgg/essential/gui/common/input/AbstractTextInput;IIZ)V", "getColumn", "()I", "isAtAbsoluteEnd", "()Z", "isAtAbsoluteStart", "isAtLineEnd", "isAtLineStart", "isInFirstLine", "isInLastLine", "getLine", "lines", "", "Lgg/essential/gui/common/input/AbstractTextInput$Line;", "compareTo", "other", "complexOffsetColumnNegative", "pos", "complexOffsetColumnPositive", "equals", "", "hashCode", "offsetColumn", "amount", "offsetColumnNegative", "offsetColumnPositive", "simpleOffsetColumnNegative", "simpleOffsetColumnPositive", "toScreenPos", "Lkotlin/Pair;", "", "toString", "", "toTextualPos", "toVisualPos", "withColumn", "newColumn", "essential" })
protected final class LinePosition implements Comparable<LinePosition>
{
    private final int line;
    private final int column;
    private final boolean isVisual;
    @NotNull
    private final List<Line> lines;
    final /* synthetic */ AbstractTextInput this$0;
    
    public LinePosition(final AbstractTextInput this$0, final int line, final int column, final boolean isVisual) {
        this.this$0 = this$0;
        super();
        this.line = line;
        this.column = column;
        this.isVisual = isVisual;
        this.lines = (List<Line>)(this.isVisual ? this.this$0.getVisualLines() : this.this$0.getTextualLines());
    }
    
    public final int getLine() {
        return this.line;
    }
    
    public final int getColumn() {
        return this.column;
    }
    
    public final boolean isAtLineStart() {
        return this.column == 0;
    }
    
    public final boolean isAtLineEnd() {
        return this.column == this.lines.get(this.line).getLength();
    }
    
    public final boolean isInFirstLine() {
        return this.line == 0;
    }
    
    public final boolean isInLastLine() {
        return this.line == CollectionsKt.getLastIndex((List)this.lines);
    }
    
    public final boolean isAtAbsoluteStart() {
        return this.isInFirstLine() && this.isAtLineStart();
    }
    
    public final boolean isAtAbsoluteEnd() {
        return this.isInLastLine() && this.isAtLineEnd();
    }
    
    @NotNull
    public final LinePosition offsetColumn(final int amount) {
        return (amount > 0) ? this.offsetColumnPositive(amount, this) : ((amount < 0) ? this.offsetColumnNegative(-amount, this) : this);
    }
    
    private final LinePosition offsetColumnNegative(final int amount, final LinePosition pos) {
        LinePosition linePosition = this;
        int n = amount;
        LinePosition linePosition2 = pos;
        LinePosition pos2;
        while (true) {
            final LinePosition linePosition3 = linePosition;
            final int n2 = n;
            pos2 = linePosition2;
            if (n2 == 0 || pos2.isAtAbsoluteStart()) {
                break;
            }
            final int n3 = n2 - 1;
            final LinePosition complexOffsetColumnNegative = linePosition3.complexOffsetColumnNegative(pos2);
            linePosition = linePosition3;
            n = n3;
            linePosition2 = complexOffsetColumnNegative;
        }
        return pos2;
    }
    
    private final LinePosition complexOffsetColumnNegative(final LinePosition pos) {
        if (!pos.isVisual) {
            return this.simpleOffsetColumnNegative(pos);
        }
        if (!pos.isAtLineStart()) {
            return this.simpleOffsetColumnNegative(pos);
        }
        final VisualLine currentLine = this.this$0.getVisualLines().get(pos.line);
        final VisualLine previousLine = this.this$0.getVisualLines().get(pos.line - 1);
        if (currentLine.getTextIndex() != previousLine.getTextIndex()) {
            return this.simpleOffsetColumnNegative(pos);
        }
        if (StringsKt.last((CharSequence)((Line)previousLine).getText()) != ' ') {
            return this.simpleOffsetColumnNegative(pos);
        }
        return this.this$0.new LinePosition(pos.line - 1, ((Line)previousLine).getLength() - 1, true);
    }
    
    private final LinePosition simpleOffsetColumnNegative(final LinePosition pos) {
        return (pos.column == 0) ? this.this$0.new LinePosition(pos.line - 1, pos.lines.get(pos.line - 1).getLength(), pos.isVisual) : pos.withColumn(pos.column - 1);
    }
    
    private final LinePosition offsetColumnPositive(final int amount, final LinePosition pos) {
        LinePosition linePosition = this;
        int n = amount;
        LinePosition linePosition2 = pos;
        LinePosition pos2;
        while (true) {
            final LinePosition linePosition3 = linePosition;
            final int n2 = n;
            pos2 = linePosition2;
            if (n2 == 0 || pos2.isAtAbsoluteEnd()) {
                break;
            }
            final int n3 = n2 - 1;
            final LinePosition complexOffsetColumnPositive = linePosition3.complexOffsetColumnPositive(pos2);
            linePosition = linePosition3;
            n = n3;
            linePosition2 = complexOffsetColumnPositive;
        }
        return pos2;
    }
    
    private final LinePosition complexOffsetColumnPositive(final LinePosition pos) {
        if (!pos.isVisual) {
            return this.simpleOffsetColumnPositive(pos);
        }
        final VisualLine currentLine = this.this$0.getVisualLines().get(pos.line);
        if (pos.column < ((Line)currentLine).getLength() - 1) {
            return this.simpleOffsetColumnPositive(pos);
        }
        if (pos.line == CollectionsKt.getLastIndex((List)this.this$0.getVisualLines())) {
            return this.this$0.new LinePosition(pos.line, ((Line)currentLine).getLength(), true);
        }
        if (pos.column == ((Line)currentLine).getLength() - 1 && StringsKt.last((CharSequence)((Line)currentLine).getText()) != ' ') {
            return this.simpleOffsetColumnPositive(pos);
        }
        final VisualLine nextLine = this.this$0.getVisualLines().get(pos.line + 1);
        if (currentLine.getTextIndex() == nextLine.getTextIndex()) {
            return this.this$0.new LinePosition(pos.line + 1, 0, true);
        }
        return this.simpleOffsetColumnPositive(pos);
    }
    
    private final LinePosition simpleOffsetColumnPositive(final LinePosition pos) {
        return (pos.column >= pos.lines.get(pos.line).getLength()) ? ((pos.line == CollectionsKt.getLastIndex((List)pos.lines)) ? this.this$0.new LinePosition(CollectionsKt.getLastIndex((List)pos.lines), ((Line)CollectionsKt.last((List)pos.lines)).getLength(), pos.isVisual) : this.this$0.new LinePosition(pos.line + 1, 0, pos.isVisual)) : pos.withColumn(pos.column + 1);
    }
    
    @NotNull
    public final LinePosition withColumn(final int newColumn) {
        return this.this$0.new LinePosition(this.line, newColumn, this.isVisual);
    }
    
    @NotNull
    public final LinePosition toTextualPos() {
        if (!this.isVisual) {
            return this;
        }
        final VisualLine visualLine = this.this$0.getVisualLines().get(this.line);
        final TextualLine textualLine = this.this$0.getTextualLines().get(visualLine.getTextIndex());
        int totalVisualLength = 0;
        for (int i = textualLine.getVisualIndices().getFirst(); i < this.line; ++i) {
            totalVisualLength += ((Line)this.this$0.getVisualLines().get(i)).getLength();
        }
        return this.this$0.new LinePosition(visualLine.getTextIndex(), totalVisualLength + this.column, false);
    }
    
    @NotNull
    public final LinePosition toVisualPos() {
        if (this.isVisual) {
            return this;
        }
        final TextualLine textualLine = this.this$0.getTextualLines().get(this.line);
        int lengthRemaining = this.column;
        final IntRange visualIndices = textualLine.getVisualIndices();
        int visualLineIndex = visualIndices.getFirst();
        final int last = visualIndices.getLast();
        if (visualLineIndex <= last) {
            while (true) {
                final VisualLine visualLine = this.this$0.getVisualLines().get(visualLineIndex);
                if (((Line)visualLine).getLength() >= lengthRemaining) {
                    return this.this$0.new LinePosition(visualLineIndex, lengthRemaining, true);
                }
                lengthRemaining -= ((Line)visualLine).getLength();
                if (visualLineIndex == last) {
                    break;
                }
                ++visualLineIndex;
            }
        }
        System.out.println((Object)"toTextualPos: Unexpected end of function");
        return this.this$0.new LinePosition(0, 0, true);
    }
    
    @NotNull
    public final Pair<Float, Float> toScreenPos() {
        final LinePosition visualPos = this.toVisualPos();
        final String substring = ((Line)this.this$0.getVisualLines().get(visualPos.line)).getText().substring(0, visualPos.column);
        Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        final float x = UtilitiesKt.width$default(substring, this.this$0.getTextScale(), null, 2, null) - this.this$0.getHorizontalScrollingOffset();
        final float y = this.this$0.getLineHeight() * visualPos.line * this.this$0.getTextScale() + this.this$0.getVerticalScrollingOffset();
        return (Pair<Float, Float>)TuplesKt.to((Object)x, (Object)y);
    }
    
    @Override
    public int compareTo(@NotNull final LinePosition other) {
        Intrinsics.checkNotNullParameter((Object)other, "other");
        final LinePosition thisVisual = this.toVisualPos();
        final LinePosition otherVisual = other.toVisualPos();
        return (thisVisual.line < otherVisual.line) ? -1 : ((thisVisual.line > otherVisual.line) ? 1 : ((thisVisual.column < otherVisual.column) ? -1 : ((thisVisual.column > otherVisual.column) ? 1 : 0)));
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return other instanceof LinePosition && this.line == ((LinePosition)other).line && this.column == ((LinePosition)other).column && this.isVisual == ((LinePosition)other).isVisual;
    }
    
    @Override
    public int hashCode() {
        int result = this.line;
        result = 31 * result + this.column;
        result = 31 * result + Boolean.hashCode(this.isVisual);
        return result;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "LinePosition(line=" + this.line + ", column=" + this.column + ", isVisual=" + this.isVisual;
    }
    
    @Override
    public /* bridge */ int compareTo(final Object other) {
        return this.compareTo((LinePosition)other);
    }
}
