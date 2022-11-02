package gg.essential.elementa.impl.commonmark.internal.inline;

import gg.essential.elementa.impl.commonmark.internal.util.*;
import gg.essential.elementa.impl.commonmark.node.*;

public class EntityInlineParser implements InlineContentParser
{
    private static final AsciiMatcher hex;
    private static final AsciiMatcher dec;
    private static final AsciiMatcher entityStart;
    private static final AsciiMatcher entityContinue;
    
    public EntityInlineParser() {
        super();
    }
    
    @Override
    public ParsedInline tryParse(final InlineParserState inlineParserState) {
        final Scanner scanner = inlineParserState.scanner();
        final Position start = scanner.position();
        scanner.next();
        final char c = scanner.peek();
        if (c == '#') {
            scanner.next();
            if (scanner.next('x') || scanner.next('X')) {
                final int digits = scanner.match(EntityInlineParser.hex);
                if (1 <= digits && digits <= 6 && scanner.next(';')) {
                    return this.entity(scanner, start);
                }
            }
            else {
                final int digits = scanner.match(EntityInlineParser.dec);
                if (1 <= digits && digits <= 7 && scanner.next(';')) {
                    return this.entity(scanner, start);
                }
            }
        }
        else if (EntityInlineParser.entityStart.matches(c)) {
            scanner.match(EntityInlineParser.entityContinue);
            if (scanner.next(';')) {
                return this.entity(scanner, start);
            }
        }
        return ParsedInline.none();
    }
    
    private ParsedInline entity(final Scanner scanner, final Position start) {
        final String text = scanner.getSource(start, scanner.position()).getContent();
        return ParsedInline.of(new Text(Html5Entities.entityToString(text)), scanner.position());
    }
    
    static {
        hex = AsciiMatcher.builder().range('0', '9').range('A', 'F').range('a', 'f').build();
        dec = AsciiMatcher.builder().range('0', '9').build();
        entityStart = AsciiMatcher.builder().range('A', 'Z').range('a', 'z').build();
        entityContinue = EntityInlineParser.entityStart.newBuilder().range('0', '9').build();
    }
}
