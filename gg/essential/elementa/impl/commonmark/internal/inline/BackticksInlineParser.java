package gg.essential.elementa.impl.commonmark.internal.inline;

import gg.essential.elementa.impl.commonmark.internal.util.*;
import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.parser.*;

public class BackticksInlineParser implements InlineContentParser
{
    public BackticksInlineParser() {
        super();
    }
    
    @Override
    public ParsedInline tryParse(final InlineParserState inlineParserState) {
        final Scanner scanner = inlineParserState.scanner();
        final Position start = scanner.position();
        final int openingTicks = scanner.matchMultiple('`');
        final Position afterOpening = scanner.position();
        while (scanner.find('`') > 0) {
            final Position beforeClosing = scanner.position();
            final int count = scanner.matchMultiple('`');
            if (count == openingTicks) {
                final Code node = new Code();
                String content = scanner.getSource(afterOpening, beforeClosing).getContent();
                content = content.replace('\n', ' ');
                if (content.length() >= 3 && content.charAt(0) == ' ' && content.charAt(content.length() - 1) == ' ' && Parsing.hasNonSpace(content)) {
                    content = content.substring(1, content.length() - 1);
                }
                node.setLiteral(content);
                return ParsedInline.of(node, scanner.position());
            }
        }
        final SourceLines source = scanner.getSource(start, afterOpening);
        final Text text = new Text(source.getContent());
        return ParsedInline.of(text, afterOpening);
    }
}
