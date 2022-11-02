package gg.essential.elementa.impl.commonmark.internal.inline;

import java.util.regex.*;
import gg.essential.elementa.impl.commonmark.node.*;

public class BackslashInlineParser implements InlineContentParser
{
    private static final Pattern ESCAPABLE;
    
    public BackslashInlineParser() {
        super();
    }
    
    @Override
    public ParsedInline tryParse(final InlineParserState inlineParserState) {
        final Scanner scanner = inlineParserState.scanner();
        scanner.next();
        final char next = scanner.peek();
        if (next == '\n') {
            scanner.next();
            return ParsedInline.of(new HardLineBreak(), scanner.position());
        }
        if (BackslashInlineParser.ESCAPABLE.matcher(String.valueOf(next)).matches()) {
            scanner.next();
            return ParsedInline.of(new Text(String.valueOf(next)), scanner.position());
        }
        return ParsedInline.of(new Text("\\"), scanner.position());
    }
    
    static {
        ESCAPABLE = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    }
}
