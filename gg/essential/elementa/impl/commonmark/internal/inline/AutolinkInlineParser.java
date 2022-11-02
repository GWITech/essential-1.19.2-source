package gg.essential.elementa.impl.commonmark.internal.inline;

import java.util.regex.*;
import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.parser.*;

public class AutolinkInlineParser implements InlineContentParser
{
    private static final Pattern URI;
    private static final Pattern EMAIL;
    
    public AutolinkInlineParser() {
        super();
    }
    
    @Override
    public ParsedInline tryParse(final InlineParserState inlineParserState) {
        final Scanner scanner = inlineParserState.scanner();
        scanner.next();
        final Position textStart = scanner.position();
        if (scanner.find('>') > 0) {
            final SourceLines textSource = scanner.getSource(textStart, scanner.position());
            final String content = textSource.getContent();
            scanner.next();
            String destination = null;
            if (AutolinkInlineParser.URI.matcher(content).matches()) {
                destination = content;
            }
            else if (AutolinkInlineParser.EMAIL.matcher(content).matches()) {
                destination = "mailto:" + content;
            }
            if (destination != null) {
                final Link link = new Link(destination, null);
                final Text text = new Text(content);
                text.setSourceSpans(textSource.getSourceSpans());
                link.appendChild(text);
                return ParsedInline.of(link, scanner.position());
            }
        }
        return ParsedInline.none();
    }
    
    static {
        URI = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
        EMAIL = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");
    }
}
