package gg.essential.elementa.impl.commonmark.internal.inline;

import java.util.*;
import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.parser.*;
import gg.essential.elementa.impl.commonmark.internal.util.*;

public class Scanner
{
    public static final char END = '\0';
    private final List<SourceLine> lines;
    private int lineIndex;
    private int index;
    private SourceLine line;
    private int lineLength;
    
    Scanner(final List<SourceLine> lines, final int lineIndex, final int index) {
        super();
        this.line = SourceLine.of("", null);
        this.lineLength = 0;
        this.lines = lines;
        this.lineIndex = lineIndex;
        this.index = index;
        if (!lines.isEmpty()) {
            this.checkPosition(lineIndex, index);
            this.setLine(lines.get(lineIndex));
        }
    }
    
    public static Scanner of(final SourceLines lines) {
        return new Scanner(lines.getLines(), 0, 0);
    }
    
    public char peek() {
        if (this.index < this.lineLength) {
            return this.line.getContent().charAt(this.index);
        }
        if (this.lineIndex < this.lines.size() - 1) {
            return '\n';
        }
        return '\0';
    }
    
    public int peekCodePoint() {
        if (this.index < this.lineLength) {
            final char c = this.line.getContent().charAt(this.index);
            if (Character.isHighSurrogate(c) && this.index + 1 < this.lineLength) {
                final char low = this.line.getContent().charAt(this.index + 1);
                if (Character.isLowSurrogate(low)) {
                    return Character.toCodePoint(c, low);
                }
            }
            return c;
        }
        if (this.lineIndex < this.lines.size() - 1) {
            return 10;
        }
        return 0;
    }
    
    public int peekPreviousCodePoint() {
        if (this.index > 0) {
            final int prev = this.index - 1;
            final char c = this.line.getContent().charAt(prev);
            if (Character.isLowSurrogate(c) && prev > 0) {
                final char high = this.line.getContent().charAt(prev - 1);
                if (Character.isHighSurrogate(high)) {
                    return Character.toCodePoint(high, c);
                }
            }
            return c;
        }
        if (this.lineIndex > 0) {
            return 10;
        }
        return 0;
    }
    
    public boolean hasNext() {
        return this.index < this.lineLength || this.lineIndex < this.lines.size() - 1;
    }
    
    public void next() {
        ++this.index;
        if (this.index > this.lineLength) {
            ++this.lineIndex;
            if (this.lineIndex < this.lines.size()) {
                this.setLine(this.lines.get(this.lineIndex));
            }
            else {
                this.setLine(SourceLine.of("", null));
            }
            this.index = 0;
        }
    }
    
    public boolean next(final char c) {
        if (this.peek() == c) {
            this.next();
            return true;
        }
        return false;
    }
    
    public boolean next(final String content) {
        if (this.index < this.lineLength && this.index + content.length() <= this.lineLength) {
            for (int i = 0; i < content.length(); ++i) {
                if (this.line.getContent().charAt(this.index + i) != content.charAt(i)) {
                    return false;
                }
            }
            this.index += content.length();
            return true;
        }
        return false;
    }
    
    public int matchMultiple(final char c) {
        int count = 0;
        while (this.peek() == c) {
            ++count;
            this.next();
        }
        return count;
    }
    
    public int match(final CharMatcher matcher) {
        int count = 0;
        while (matcher.matches(this.peek())) {
            ++count;
            this.next();
        }
        return count;
    }
    
    public int whitespace() {
        int count = 0;
        while (true) {
            switch (this.peek()) {
                case '\t':
                case '\n':
                case '\u000b':
                case '\f':
                case '\r':
                case ' ': {
                    ++count;
                    this.next();
                    continue;
                }
                default: {
                    return count;
                }
            }
        }
    }
    
    public int find(final char c) {
        int count = 0;
        while (true) {
            final char cur = this.peek();
            if (cur == '\0') {
                return -1;
            }
            if (cur == c) {
                return count;
            }
            ++count;
            this.next();
        }
    }
    
    public int find(final CharMatcher matcher) {
        int count = 0;
        while (true) {
            final char c = this.peek();
            if (c == '\0') {
                return -1;
            }
            if (matcher.matches(c)) {
                return count;
            }
            ++count;
            this.next();
        }
    }
    
    public Position position() {
        return new Position(this.lineIndex, this.index);
    }
    
    public void setPosition(final Position position) {
        this.checkPosition(position.lineIndex, position.index);
        this.lineIndex = position.lineIndex;
        this.index = position.index;
        this.setLine(this.lines.get(this.lineIndex));
    }
    
    public SourceLines getSource(final Position begin, final Position end) {
        if (begin.lineIndex == end.lineIndex) {
            final SourceLine line = this.lines.get(begin.lineIndex);
            final CharSequence newContent = line.getContent().subSequence(begin.index, end.index);
            SourceSpan newSourceSpan = null;
            final SourceSpan sourceSpan = line.getSourceSpan();
            if (sourceSpan != null) {
                newSourceSpan = SourceSpan.of(sourceSpan.getLineIndex(), sourceSpan.getColumnIndex() + begin.index, newContent.length());
            }
            return SourceLines.of(SourceLine.of(newContent, newSourceSpan));
        }
        final SourceLines sourceLines = SourceLines.empty();
        final SourceLine firstLine = this.lines.get(begin.lineIndex);
        sourceLines.addLine(firstLine.substring(begin.index, firstLine.getContent().length()));
        for (int line2 = begin.lineIndex + 1; line2 < end.lineIndex; ++line2) {
            sourceLines.addLine(this.lines.get(line2));
        }
        final SourceLine lastLine = this.lines.get(end.lineIndex);
        sourceLines.addLine(lastLine.substring(0, end.index));
        return sourceLines;
    }
    
    private void setLine(final SourceLine line) {
        this.line = line;
        this.lineLength = line.getContent().length();
    }
    
    private void checkPosition(final int lineIndex, final int index) {
        if (lineIndex < 0 || lineIndex >= this.lines.size()) {
            throw new IllegalArgumentException("Line index " + lineIndex + " out of range, number of lines: " + this.lines.size());
        }
        final SourceLine line = this.lines.get(lineIndex);
        if (index < 0 || index > line.getContent().length()) {
            throw new IllegalArgumentException("Index " + index + " out of range, line length: " + line.getContent().length());
        }
    }
}
