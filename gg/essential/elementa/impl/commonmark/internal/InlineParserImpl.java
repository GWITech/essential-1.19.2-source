package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.parser.*;
import gg.essential.elementa.impl.commonmark.internal.inline.*;
import gg.essential.elementa.impl.commonmark.internal.util.*;
import java.util.*;
import gg.essential.elementa.impl.commonmark.parser.delimiter.*;
import gg.essential.elementa.impl.commonmark.node.*;

public class InlineParserImpl implements InlineParser, InlineParserState
{
    private final BitSet specialCharacters;
    private final Map<Character, DelimiterProcessor> delimiterProcessors;
    private final InlineParserContext context;
    private final Map<Character, List<InlineContentParser>> inlineParsers;
    private Scanner scanner;
    private boolean includeSourceSpans;
    private int trailingSpaces;
    private Delimiter lastDelimiter;
    private Bracket lastBracket;
    
    public InlineParserImpl(final InlineParserContext inlineParserContext) {
        super();
        this.delimiterProcessors = calculateDelimiterProcessors(inlineParserContext.getCustomDelimiterProcessors());
        this.context = inlineParserContext;
        (this.inlineParsers = new HashMap<Character, List<InlineContentParser>>()).put('\\', (List<InlineContentParser>)Collections.singletonList(new BackslashInlineParser()));
        this.inlineParsers.put('`', (List<InlineContentParser>)Collections.singletonList(new BackticksInlineParser()));
        this.inlineParsers.put('&', (List<InlineContentParser>)Collections.singletonList(new EntityInlineParser()));
        this.inlineParsers.put('<', Arrays.asList(new AutolinkInlineParser(), new HtmlInlineParser()));
        this.specialCharacters = calculateSpecialCharacters(this.delimiterProcessors.keySet(), this.inlineParsers.keySet());
    }
    
    public static BitSet calculateSpecialCharacters(final Set<Character> delimiterCharacters, final Set<Character> characters) {
        final BitSet bitSet = new BitSet();
        for (final Character c : delimiterCharacters) {
            bitSet.set(c);
        }
        for (final Character c : characters) {
            bitSet.set(c);
        }
        bitSet.set(91);
        bitSet.set(93);
        bitSet.set(33);
        bitSet.set(10);
        return bitSet;
    }
    
    public static Map<Character, DelimiterProcessor> calculateDelimiterProcessors(final List<DelimiterProcessor> delimiterProcessors) {
        final Map<Character, DelimiterProcessor> map = new HashMap<Character, DelimiterProcessor>();
        addDelimiterProcessors(Arrays.asList(new AsteriskDelimiterProcessor(), new UnderscoreDelimiterProcessor()), map);
        addDelimiterProcessors(delimiterProcessors, map);
        return map;
    }
    
    @Override
    public Scanner scanner() {
        return this.scanner;
    }
    
    private static void addDelimiterProcessors(final Iterable<DelimiterProcessor> delimiterProcessors, final Map<Character, DelimiterProcessor> map) {
        for (final DelimiterProcessor delimiterProcessor : delimiterProcessors) {
            final char opening = delimiterProcessor.getOpeningCharacter();
            final char closing = delimiterProcessor.getClosingCharacter();
            if (opening == closing) {
                final DelimiterProcessor old = map.get(opening);
                if (old != null && old.getOpeningCharacter() == old.getClosingCharacter()) {
                    StaggeredDelimiterProcessor s;
                    if (old instanceof StaggeredDelimiterProcessor) {
                        s = (StaggeredDelimiterProcessor)old;
                    }
                    else {
                        s = new StaggeredDelimiterProcessor(opening);
                        s.add(old);
                    }
                    s.add(delimiterProcessor);
                    map.put(opening, (DelimiterProcessor)s);
                }
                else {
                    addDelimiterProcessorForChar(opening, delimiterProcessor, map);
                }
            }
            else {
                addDelimiterProcessorForChar(opening, delimiterProcessor, map);
                addDelimiterProcessorForChar(closing, delimiterProcessor, map);
            }
        }
    }
    
    private static void addDelimiterProcessorForChar(final char delimiterChar, final DelimiterProcessor toAdd, final Map<Character, DelimiterProcessor> delimiterProcessors) {
        final DelimiterProcessor existing = delimiterProcessors.put(delimiterChar, toAdd);
        if (existing != null) {
            throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + delimiterChar + "'");
        }
    }
    
    @Override
    public void parse(final SourceLines lines, final Node block) {
        this.reset(lines);
        while (true) {
            final List<? extends Node> nodes = this.parseInline();
            if (nodes == null) {
                break;
            }
            for (final Node node : nodes) {
                block.appendChild(node);
            }
        }
        this.processDelimiters(null);
        this.mergeChildTextNodes(block);
    }
    
    void reset(final SourceLines lines) {
        this.scanner = Scanner.of(lines);
        this.includeSourceSpans = !lines.getSourceSpans().isEmpty();
        this.trailingSpaces = 0;
        this.lastDelimiter = null;
        this.lastBracket = null;
    }
    
    private Text text(final SourceLines sourceLines) {
        final Text text = new Text(sourceLines.getContent());
        text.setSourceSpans(sourceLines.getSourceSpans());
        return text;
    }
    
    private List<? extends Node> parseInline() {
        final char c = this.scanner.peek();
        switch (c) {
            case '[': {
                return Collections.singletonList(this.parseOpenBracket());
            }
            case '!': {
                return Collections.singletonList(this.parseBang());
            }
            case ']': {
                return Collections.singletonList(this.parseCloseBracket());
            }
            case '\n': {
                return Collections.singletonList(this.parseLineBreak());
            }
            case '\0': {
                return null;
            }
            default: {
                if (!this.specialCharacters.get(c)) {
                    return Collections.singletonList(this.parseText());
                }
                final List<InlineContentParser> inlineParsers = this.inlineParsers.get(c);
                if (inlineParsers != null) {
                    final Position position = this.scanner.position();
                    for (final InlineContentParser inlineParser : inlineParsers) {
                        final ParsedInline parsedInline = inlineParser.tryParse(this);
                        if (parsedInline instanceof ParsedInlineImpl) {
                            final ParsedInlineImpl parsedInlineImpl = (ParsedInlineImpl)parsedInline;
                            final Node node = parsedInlineImpl.getNode();
                            this.scanner.setPosition(parsedInlineImpl.getPosition());
                            if (this.includeSourceSpans && node.getSourceSpans().isEmpty()) {
                                node.setSourceSpans(this.scanner.getSource(position, this.scanner.position()).getSourceSpans());
                            }
                            return Collections.singletonList(node);
                        }
                        this.scanner.setPosition(position);
                    }
                }
                final DelimiterProcessor delimiterProcessor = this.delimiterProcessors.get(c);
                if (delimiterProcessor != null) {
                    final List<? extends Node> nodes = this.parseDelimiters(delimiterProcessor, c);
                    if (nodes != null) {
                        return nodes;
                    }
                }
                return Collections.singletonList(this.parseText());
            }
        }
    }
    
    private List<? extends Node> parseDelimiters(final DelimiterProcessor delimiterProcessor, final char delimiterChar) {
        final DelimiterData res = this.scanDelimiters(delimiterProcessor, delimiterChar);
        if (res == null) {
            return null;
        }
        final List<Text> characters = res.characters;
        this.lastDelimiter = new Delimiter(characters, delimiterChar, res.canOpen, res.canClose, this.lastDelimiter);
        if (this.lastDelimiter.previous != null) {
            this.lastDelimiter.previous.next = this.lastDelimiter;
        }
        return characters;
    }
    
    private Node parseOpenBracket() {
        final Position start = this.scanner.position();
        this.scanner.next();
        final Position contentPosition = this.scanner.position();
        final Text node = this.text(this.scanner.getSource(start, contentPosition));
        this.addBracket(Bracket.link(node, start, contentPosition, this.lastBracket, this.lastDelimiter));
        return node;
    }
    
    private Node parseBang() {
        final Position start = this.scanner.position();
        this.scanner.next();
        if (this.scanner.next('[')) {
            final Position contentPosition = this.scanner.position();
            final Text node = this.text(this.scanner.getSource(start, contentPosition));
            this.addBracket(Bracket.image(node, start, contentPosition, this.lastBracket, this.lastDelimiter));
            return node;
        }
        return this.text(this.scanner.getSource(start, this.scanner.position()));
    }
    
    private Node parseCloseBracket() {
        final Position beforeClose = this.scanner.position();
        this.scanner.next();
        final Position afterClose = this.scanner.position();
        final Bracket opener = this.lastBracket;
        if (opener == null) {
            return this.text(this.scanner.getSource(beforeClose, afterClose));
        }
        if (!opener.allowed) {
            this.removeLastBracket();
            return this.text(this.scanner.getSource(beforeClose, afterClose));
        }
        String dest = null;
        String title = null;
        if (this.scanner.next('(')) {
            this.scanner.whitespace();
            dest = this.parseLinkDestination(this.scanner);
            if (dest == null) {
                this.scanner.setPosition(afterClose);
            }
            else {
                final int whitespace = this.scanner.whitespace();
                if (whitespace >= 1) {
                    title = this.parseLinkTitle(this.scanner);
                    this.scanner.whitespace();
                }
                if (!this.scanner.next(')')) {
                    this.scanner.setPosition(afterClose);
                    dest = null;
                    title = null;
                }
            }
        }
        if (dest == null) {
            String ref = this.parseLinkLabel(this.scanner);
            if (ref == null) {
                this.scanner.setPosition(afterClose);
            }
            if ((ref == null || ref.isEmpty()) && !opener.bracketAfter) {
                ref = this.scanner.getSource(opener.contentPosition, beforeClose).getContent();
            }
            if (ref != null) {
                final String label = Escaping.normalizeLabelContent(ref);
                final LinkReferenceDefinition definition = this.context.getLinkReferenceDefinition(label);
                if (definition != null) {
                    dest = definition.getDestination();
                    title = definition.getTitle();
                }
            }
        }
        if (dest != null) {
            final Node linkOrImage = opener.image ? new Image(dest, title) : new Link(dest, title);
            Node next;
            for (Node node = opener.node.getNext(); node != null; node = next) {
                next = node.getNext();
                linkOrImage.appendChild(node);
            }
            if (this.includeSourceSpans) {
                linkOrImage.setSourceSpans(this.scanner.getSource(opener.markerPosition, this.scanner.position()).getSourceSpans());
            }
            this.processDelimiters(opener.previousDelimiter);
            this.mergeChildTextNodes(linkOrImage);
            opener.node.unlink();
            this.removeLastBracket();
            if (!opener.image) {
                for (Bracket bracket = this.lastBracket; bracket != null; bracket = bracket.previous) {
                    if (!bracket.image) {
                        bracket.allowed = false;
                    }
                }
            }
            return linkOrImage;
        }
        this.removeLastBracket();
        this.scanner.setPosition(afterClose);
        return this.text(this.scanner.getSource(beforeClose, afterClose));
    }
    
    private void addBracket(final Bracket bracket) {
        if (this.lastBracket != null) {
            this.lastBracket.bracketAfter = true;
        }
        this.lastBracket = bracket;
    }
    
    private void removeLastBracket() {
        this.lastBracket = this.lastBracket.previous;
    }
    
    private String parseLinkDestination(final Scanner scanner) {
        final char delimiter = scanner.peek();
        final Position start = scanner.position();
        if (!LinkScanner.scanLinkDestination(scanner)) {
            return null;
        }
        String dest;
        if (delimiter == '<') {
            final String rawDestination = scanner.getSource(start, scanner.position()).getContent();
            dest = rawDestination.substring(1, rawDestination.length() - 1);
        }
        else {
            dest = scanner.getSource(start, scanner.position()).getContent();
        }
        return Escaping.unescapeString(dest);
    }
    
    private String parseLinkTitle(final Scanner scanner) {
        final Position start = scanner.position();
        if (!LinkScanner.scanLinkTitle(scanner)) {
            return null;
        }
        final String rawTitle = scanner.getSource(start, scanner.position()).getContent();
        final String title = rawTitle.substring(1, rawTitle.length() - 1);
        return Escaping.unescapeString(title);
    }
    
    String parseLinkLabel(final Scanner scanner) {
        if (!scanner.next('[')) {
            return null;
        }
        final Position start = scanner.position();
        if (!LinkScanner.scanLinkLabelContent(scanner)) {
            return null;
        }
        final Position end = scanner.position();
        if (!scanner.next(']')) {
            return null;
        }
        final String content = scanner.getSource(start, end).getContent();
        if (content.length() > 999) {
            return null;
        }
        return content;
    }
    
    private Node parseLineBreak() {
        this.scanner.next();
        if (this.trailingSpaces >= 2) {
            return new HardLineBreak();
        }
        return new SoftLineBreak();
    }
    
    private Node parseText() {
        final Position start = this.scanner.position();
        this.scanner.next();
        char c;
        while (true) {
            c = this.scanner.peek();
            if (c == '\0' || this.specialCharacters.get(c)) {
                break;
            }
            this.scanner.next();
        }
        final SourceLines source = this.scanner.getSource(start, this.scanner.position());
        String content = source.getContent();
        if (c == '\n') {
            final int end = Parsing.skipBackwards(' ', content, content.length() - 1, 0) + 1;
            this.trailingSpaces = content.length() - end;
            content = content.substring(0, end);
        }
        else if (c == '\0') {
            final int end = Parsing.skipSpaceTabBackwards(content, content.length() - 1, 0) + 1;
            content = content.substring(0, end);
        }
        final Text text = new Text(content);
        text.setSourceSpans(source.getSourceSpans());
        return text;
    }
    
    private DelimiterData scanDelimiters(final DelimiterProcessor delimiterProcessor, final char delimiterChar) {
        final int before = this.scanner.peekPreviousCodePoint();
        final Position start = this.scanner.position();
        final int delimiterCount = this.scanner.matchMultiple(delimiterChar);
        if (delimiterCount < delimiterProcessor.getMinLength()) {
            this.scanner.setPosition(start);
            return null;
        }
        final List<Text> delimiters = new ArrayList<Text>();
        this.scanner.setPosition(start);
        Position positionBefore = start;
        while (this.scanner.next(delimiterChar)) {
            delimiters.add(this.text(this.scanner.getSource(positionBefore, this.scanner.position())));
            positionBefore = this.scanner.position();
        }
        final int after = this.scanner.peekCodePoint();
        final boolean beforeIsPunctuation = before == 0 || Parsing.isPunctuationCodePoint(before);
        final boolean beforeIsWhitespace = before == 0 || Parsing.isWhitespaceCodePoint(before);
        final boolean afterIsPunctuation = after == 0 || Parsing.isPunctuationCodePoint(after);
        final boolean afterIsWhitespace = after == 0 || Parsing.isWhitespaceCodePoint(after);
        final boolean leftFlanking = !afterIsWhitespace && (!afterIsPunctuation || beforeIsWhitespace || beforeIsPunctuation);
        final boolean rightFlanking = !beforeIsWhitespace && (!beforeIsPunctuation || afterIsWhitespace || afterIsPunctuation);
        boolean canOpen;
        boolean canClose;
        if (delimiterChar == '_') {
            canOpen = (leftFlanking && (!rightFlanking || beforeIsPunctuation));
            canClose = (rightFlanking && (!leftFlanking || afterIsPunctuation));
        }
        else {
            canOpen = (leftFlanking && delimiterChar == delimiterProcessor.getOpeningCharacter());
            canClose = (rightFlanking && delimiterChar == delimiterProcessor.getClosingCharacter());
        }
        return new DelimiterData(delimiters, canOpen, canClose);
    }
    
    private void processDelimiters(final Delimiter stackBottom) {
        final Map<Character, Delimiter> openersBottom = new HashMap<Character, Delimiter>();
        Delimiter closer;
        for (closer = this.lastDelimiter; closer != null && closer.previous != stackBottom; closer = closer.previous) {}
        while (closer != null) {
            final char delimiterChar = closer.delimiterChar;
            final DelimiterProcessor delimiterProcessor = this.delimiterProcessors.get(delimiterChar);
            if (!closer.canClose() || delimiterProcessor == null) {
                closer = closer.next;
            }
            else {
                final char openingDelimiterChar = delimiterProcessor.getOpeningCharacter();
                int usedDelims = 0;
                boolean openerFound = false;
                boolean potentialOpenerFound = false;
                Delimiter opener;
                for (opener = closer.previous; opener != null && opener != stackBottom && opener != openersBottom.get(delimiterChar); opener = opener.previous) {
                    if (opener.canOpen() && opener.delimiterChar == openingDelimiterChar) {
                        potentialOpenerFound = true;
                        usedDelims = delimiterProcessor.process(opener, closer);
                        if (usedDelims > 0) {
                            openerFound = true;
                            break;
                        }
                    }
                }
                if (!openerFound) {
                    if (!potentialOpenerFound) {
                        openersBottom.put(delimiterChar, closer.previous);
                        if (!closer.canOpen()) {
                            this.removeDelimiterKeepNode(closer);
                        }
                    }
                    closer = closer.next;
                }
                else {
                    for (int i = 0; i < usedDelims; ++i) {
                        final Text delimiter = opener.characters.remove(opener.characters.size() - 1);
                        delimiter.unlink();
                    }
                    for (int i = 0; i < usedDelims; ++i) {
                        final Text delimiter = closer.characters.remove(0);
                        delimiter.unlink();
                    }
                    this.removeDelimitersBetween(opener, closer);
                    if (opener.length() == 0) {
                        this.removeDelimiterAndNodes(opener);
                    }
                    if (closer.length() != 0) {
                        continue;
                    }
                    final Delimiter next = closer.next;
                    this.removeDelimiterAndNodes(closer);
                    closer = next;
                }
            }
        }
        while (this.lastDelimiter != null && this.lastDelimiter != stackBottom) {
            this.removeDelimiterKeepNode(this.lastDelimiter);
        }
    }
    
    private void removeDelimitersBetween(final Delimiter opener, final Delimiter closer) {
        Delimiter previousDelimiter;
        for (Delimiter delimiter = closer.previous; delimiter != null && delimiter != opener; delimiter = previousDelimiter) {
            previousDelimiter = delimiter.previous;
            this.removeDelimiterKeepNode(delimiter);
        }
    }
    
    private void removeDelimiterAndNodes(final Delimiter delim) {
        this.removeDelimiter(delim);
    }
    
    private void removeDelimiterKeepNode(final Delimiter delim) {
        this.removeDelimiter(delim);
    }
    
    private void removeDelimiter(final Delimiter delim) {
        if (delim.previous != null) {
            delim.previous.next = delim.next;
        }
        if (delim.next == null) {
            this.lastDelimiter = delim.previous;
        }
        else {
            delim.next.previous = delim.previous;
        }
    }
    
    private void mergeChildTextNodes(final Node node) {
        if (node.getFirstChild() == null) {
            return;
        }
        this.mergeTextNodesInclusive(node.getFirstChild(), node.getLastChild());
    }
    
    private void mergeTextNodesInclusive(final Node fromNode, final Node toNode) {
        Text first = null;
        Text last = null;
        int length = 0;
        for (Node node = fromNode; node != null; node = node.getNext()) {
            if (node instanceof Text) {
                final Text text = (Text)node;
                if (first == null) {
                    first = text;
                }
                length += text.getLiteral().length();
                last = text;
            }
            else {
                this.mergeIfNeeded(first, last, length);
                first = null;
                last = null;
                length = 0;
                this.mergeChildTextNodes(node);
            }
            if (node == toNode) {
                break;
            }
        }
        this.mergeIfNeeded(first, last, length);
    }
    
    private void mergeIfNeeded(final Text first, final Text last, final int textLength) {
        if (first != null && last != null && first != last) {
            final StringBuilder sb = new StringBuilder(textLength);
            sb.append(first.getLiteral());
            SourceSpans sourceSpans = null;
            if (this.includeSourceSpans) {
                sourceSpans = new SourceSpans();
                sourceSpans.addAll(first.getSourceSpans());
            }
            Node node = first.getNext();
            final Node stop = last.getNext();
            while (node != stop) {
                sb.append(((Text)node).getLiteral());
                if (sourceSpans != null) {
                    sourceSpans.addAll(node.getSourceSpans());
                }
                final Node unlink = node;
                node = node.getNext();
                unlink.unlink();
            }
            final String literal = sb.toString();
            first.setLiteral(literal);
            if (sourceSpans != null) {
                first.setSourceSpans(sourceSpans.getSourceSpans());
            }
        }
    }
    
    private static class DelimiterData
    {
        final List<Text> characters;
        final boolean canClose;
        final boolean canOpen;
        
        DelimiterData(final List<Text> characters, final boolean canOpen, final boolean canClose) {
            super();
            this.characters = characters;
            this.canOpen = canOpen;
            this.canClose = canClose;
        }
    }
}
