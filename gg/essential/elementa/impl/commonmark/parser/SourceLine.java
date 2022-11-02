package gg.essential.elementa.impl.commonmark.parser;

import gg.essential.elementa.impl.commonmark.node.*;

public class SourceLine
{
    private final CharSequence content;
    private final SourceSpan sourceSpan;
    
    public static SourceLine of(final CharSequence content, final SourceSpan sourceSpan) {
        return new SourceLine(content, sourceSpan);
    }
    
    private SourceLine(final CharSequence content, final SourceSpan sourceSpan) {
        super();
        if (content == null) {
            throw new NullPointerException("content must not be null");
        }
        this.content = content;
        this.sourceSpan = sourceSpan;
    }
    
    public CharSequence getContent() {
        return this.content;
    }
    
    public SourceSpan getSourceSpan() {
        return this.sourceSpan;
    }
    
    public SourceLine substring(final int beginIndex, final int endIndex) {
        final CharSequence newContent = this.content.subSequence(beginIndex, endIndex);
        SourceSpan newSourceSpan = null;
        if (this.sourceSpan != null) {
            final int columnIndex = this.sourceSpan.getColumnIndex() + beginIndex;
            final int length = endIndex - beginIndex;
            if (length != 0) {
                newSourceSpan = SourceSpan.of(this.sourceSpan.getLineIndex(), columnIndex, length);
            }
        }
        return of(newContent, newSourceSpan);
    }
}
