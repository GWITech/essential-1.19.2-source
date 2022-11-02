package gg.essential.elementa.impl.commonmark.internal.inline;

import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.internal.util.*;

public class HtmlInlineParser implements InlineContentParser
{
    private static final AsciiMatcher asciiLetter;
    private static final AsciiMatcher tagNameStart;
    private static final AsciiMatcher tagNameContinue;
    private static final AsciiMatcher attributeStart;
    private static final AsciiMatcher attributeContinue;
    private static final AsciiMatcher attributeValueEnd;
    private static final AsciiMatcher declaration;
    
    public HtmlInlineParser() {
        super();
    }
    
    @Override
    public ParsedInline tryParse(final InlineParserState inlineParserState) {
        final Scanner scanner = inlineParserState.scanner();
        final Position start = scanner.position();
        scanner.next();
        char c = scanner.peek();
        if (HtmlInlineParser.tagNameStart.matches(c)) {
            if (tryOpenTag(scanner)) {
                return htmlInline(start, scanner);
            }
        }
        else if (c == '/') {
            if (tryClosingTag(scanner)) {
                return htmlInline(start, scanner);
            }
        }
        else if (c == '?') {
            if (tryProcessingInstruction(scanner)) {
                return htmlInline(start, scanner);
            }
        }
        else if (c == '!') {
            scanner.next();
            c = scanner.peek();
            if (c == '-') {
                if (tryComment(scanner)) {
                    return htmlInline(start, scanner);
                }
            }
            else if (c == '[') {
                if (tryCdata(scanner)) {
                    return htmlInline(start, scanner);
                }
            }
            else if (HtmlInlineParser.declaration.matches(c) && tryDeclaration(scanner)) {
                return htmlInline(start, scanner);
            }
        }
        return ParsedInline.none();
    }
    
    private static ParsedInline htmlInline(final Position start, final Scanner scanner) {
        final String text = scanner.getSource(start, scanner.position()).getContent();
        final HtmlInline node = new HtmlInline();
        node.setLiteral(text);
        return ParsedInline.of(node, scanner.position());
    }
    
    private static boolean tryOpenTag(final Scanner scanner) {
        scanner.next();
        scanner.match(HtmlInlineParser.tagNameContinue);
        for (boolean whitespace = scanner.whitespace() >= 1; whitespace && scanner.match(HtmlInlineParser.attributeStart) >= 1; whitespace = (scanner.whitespace() >= 1)) {
            scanner.match(HtmlInlineParser.attributeContinue);
            whitespace = (scanner.whitespace() >= 1);
            if (scanner.next('=')) {
                scanner.whitespace();
                final char valueStart = scanner.peek();
                if (valueStart == '\'') {
                    scanner.next();
                    if (scanner.find('\'') < 0) {
                        return false;
                    }
                    scanner.next();
                }
                else if (valueStart == '\"') {
                    scanner.next();
                    if (scanner.find('\"') < 0) {
                        return false;
                    }
                    scanner.next();
                }
                else if (scanner.find(HtmlInlineParser.attributeValueEnd) <= 0) {
                    return false;
                }
            }
        }
        scanner.next('/');
        return scanner.next('>');
    }
    
    private static boolean tryClosingTag(final Scanner scanner) {
        scanner.next();
        if (scanner.match(HtmlInlineParser.tagNameStart) >= 1) {
            scanner.match(HtmlInlineParser.tagNameContinue);
            scanner.whitespace();
            return scanner.next('>');
        }
        return false;
    }
    
    private static boolean tryProcessingInstruction(final Scanner scanner) {
        scanner.next();
        while (scanner.find('?') > 0) {
            scanner.next();
            if (scanner.next('>')) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean tryComment(final Scanner scanner) {
        scanner.next();
        if (!scanner.next('-')) {
            return false;
        }
        if (scanner.next('>') || scanner.next("->")) {
            return false;
        }
        while (scanner.find('-') >= 0) {
            if (scanner.next("--")) {
                return scanner.next('>');
            }
            scanner.next();
        }
        return false;
    }
    
    private static boolean tryCdata(final Scanner scanner) {
        scanner.next();
        if (scanner.next("CDATA[")) {
            while (scanner.find(']') >= 0) {
                if (scanner.next("]]>")) {
                    return true;
                }
                scanner.next();
            }
        }
        return false;
    }
    
    private static boolean tryDeclaration(final Scanner scanner) {
        scanner.match(HtmlInlineParser.declaration);
        if (scanner.whitespace() <= 0) {
            return false;
        }
        if (scanner.find('>') >= 0) {
            scanner.next();
            return true;
        }
        return false;
    }
    
    static {
        asciiLetter = AsciiMatcher.builder().range('A', 'Z').range('a', 'z').build();
        tagNameStart = HtmlInlineParser.asciiLetter;
        tagNameContinue = HtmlInlineParser.tagNameStart.newBuilder().range('0', '9').c('-').build();
        attributeStart = HtmlInlineParser.asciiLetter.newBuilder().c('_').c(':').build();
        attributeContinue = HtmlInlineParser.attributeStart.newBuilder().range('0', '9').c('.').c('-').build();
        attributeValueEnd = AsciiMatcher.builder().c(' ').c('\t').c('\n').c('\u000b').c('\f').c('\r').c('\"').c('\'').c('=').c('<').c('>').c('`').build();
        declaration = AsciiMatcher.builder().range('A', 'Z').build();
    }
}
