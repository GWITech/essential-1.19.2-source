package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.node.*;
import java.util.*;
import gg.essential.elementa.impl.commonmark.parser.*;
import gg.essential.elementa.impl.commonmark.internal.util.*;
import gg.essential.elementa.impl.commonmark.internal.inline.*;

public class LinkReferenceDefinitionParser
{
    private State state;
    private final List<SourceLine> paragraphLines;
    private final List<LinkReferenceDefinition> definitions;
    private final List<SourceSpan> sourceSpans;
    private StringBuilder label;
    private String normalizedLabel;
    private String destination;
    private char titleDelimiter;
    private StringBuilder title;
    private boolean referenceValid;
    
    public LinkReferenceDefinitionParser() {
        super();
        this.state = State.START_DEFINITION;
        this.paragraphLines = new ArrayList<SourceLine>();
        this.definitions = new ArrayList<LinkReferenceDefinition>();
        this.sourceSpans = new ArrayList<SourceSpan>();
        this.referenceValid = false;
    }
    
    public void parse(final SourceLine line) {
        this.paragraphLines.add(line);
        if (this.state == State.PARAGRAPH) {
            return;
        }
        final Scanner scanner = Scanner.of(SourceLines.of(line));
        while (scanner.hasNext()) {
            boolean success = false;
            switch (this.state) {
                case START_DEFINITION: {
                    success = this.startDefinition(scanner);
                    break;
                }
                case LABEL: {
                    success = this.label(scanner);
                    break;
                }
                case DESTINATION: {
                    success = this.destination(scanner);
                    break;
                }
                case START_TITLE: {
                    success = this.startTitle(scanner);
                    break;
                }
                case TITLE: {
                    success = this.title(scanner);
                    break;
                }
                default: {
                    throw new IllegalStateException("Unknown parsing state: " + this.state);
                }
            }
            if (!success) {
                this.state = State.PARAGRAPH;
            }
        }
    }
    
    public void addSourceSpan(final SourceSpan sourceSpan) {
        this.sourceSpans.add(sourceSpan);
    }
    
    SourceLines getParagraphLines() {
        return SourceLines.of(this.paragraphLines);
    }
    
    List<SourceSpan> getParagraphSourceSpans() {
        return this.sourceSpans;
    }
    
    List<LinkReferenceDefinition> getDefinitions() {
        this.finishReference();
        return this.definitions;
    }
    
    State getState() {
        return this.state;
    }
    
    private boolean startDefinition(final Scanner scanner) {
        scanner.whitespace();
        if (!scanner.next('[')) {
            return false;
        }
        this.state = State.LABEL;
        this.label = new StringBuilder();
        if (!scanner.hasNext()) {
            this.label.append('\n');
        }
        return true;
    }
    
    private boolean label(final Scanner scanner) {
        final Position start = scanner.position();
        if (!LinkScanner.scanLinkLabelContent(scanner)) {
            return false;
        }
        this.label.append(scanner.getSource(start, scanner.position()).getContent());
        if (!scanner.hasNext()) {
            this.label.append('\n');
            return true;
        }
        if (!scanner.next(']')) {
            return false;
        }
        if (!scanner.next(':')) {
            return false;
        }
        if (this.label.length() > 999) {
            return false;
        }
        final String normalizedLabel = Escaping.normalizeLabelContent(this.label.toString());
        if (normalizedLabel.isEmpty()) {
            return false;
        }
        this.normalizedLabel = normalizedLabel;
        this.state = State.DESTINATION;
        scanner.whitespace();
        return true;
    }
    
    private boolean destination(final Scanner scanner) {
        scanner.whitespace();
        final Position start = scanner.position();
        if (!LinkScanner.scanLinkDestination(scanner)) {
            return false;
        }
        final String rawDestination = scanner.getSource(start, scanner.position()).getContent();
        this.destination = (rawDestination.startsWith("<") ? rawDestination.substring(1, rawDestination.length() - 1) : rawDestination);
        final int whitespace = scanner.whitespace();
        if (!scanner.hasNext()) {
            this.referenceValid = true;
            this.paragraphLines.clear();
        }
        else if (whitespace == 0) {
            return false;
        }
        this.state = State.START_TITLE;
        return true;
    }
    
    private boolean startTitle(final Scanner scanner) {
        scanner.whitespace();
        if (!scanner.hasNext()) {
            this.state = State.START_DEFINITION;
            return true;
        }
        this.titleDelimiter = '\0';
        final char c = scanner.peek();
        switch (c) {
            case '\"':
            case '\'': {
                this.titleDelimiter = c;
                break;
            }
            case '(': {
                this.titleDelimiter = ')';
                break;
            }
        }
        if (this.titleDelimiter != '\0') {
            this.state = State.TITLE;
            this.title = new StringBuilder();
            scanner.next();
            if (!scanner.hasNext()) {
                this.title.append('\n');
            }
        }
        else {
            this.finishReference();
            this.state = State.START_DEFINITION;
        }
        return true;
    }
    
    private boolean title(final Scanner scanner) {
        final Position start = scanner.position();
        if (!LinkScanner.scanLinkTitleContent(scanner, this.titleDelimiter)) {
            return false;
        }
        this.title.append(scanner.getSource(start, scanner.position()).getContent());
        if (!scanner.hasNext()) {
            this.title.append('\n');
            return true;
        }
        scanner.next();
        scanner.whitespace();
        if (scanner.hasNext()) {
            return false;
        }
        this.referenceValid = true;
        this.finishReference();
        this.paragraphLines.clear();
        this.state = State.START_DEFINITION;
        return true;
    }
    
    private void finishReference() {
        if (!this.referenceValid) {
            return;
        }
        final String d = Escaping.unescapeString(this.destination);
        final String t = (this.title != null) ? Escaping.unescapeString(this.title.toString()) : null;
        final LinkReferenceDefinition definition = new LinkReferenceDefinition(this.normalizedLabel, d, t);
        definition.setSourceSpans(this.sourceSpans);
        this.sourceSpans.clear();
        this.definitions.add(definition);
        this.label = null;
        this.referenceValid = false;
        this.normalizedLabel = null;
        this.destination = null;
        this.title = null;
    }
    
    enum State
    {
        START_DEFINITION, 
        LABEL, 
        DESTINATION, 
        START_TITLE, 
        TITLE, 
        PARAGRAPH;
        
        private static final /* synthetic */ State[] $VALUES;
        
        public static State[] values() {
            return State.$VALUES.clone();
        }
        
        public static State valueOf(final String name) {
            return Enum.valueOf(State.class, name);
        }
        
        static {
            $VALUES = new State[] { State.START_DEFINITION, State.LABEL, State.DESTINATION, State.START_TITLE, State.TITLE, State.PARAGRAPH };
        }
    }
}
