package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.parser.delimiter.*;
import gg.essential.elementa.impl.commonmark.internal.util.*;
import java.io.*;
import gg.essential.elementa.impl.commonmark.parser.block.*;
import gg.essential.elementa.impl.commonmark.node.*;
import java.util.*;
import gg.essential.elementa.impl.commonmark.parser.*;

public class DocumentParser implements ParserState
{
    private static final Set<Class<? extends Block>> CORE_FACTORY_TYPES;
    private static final Map<Class<? extends Block>, BlockParserFactory> NODES_TO_CORE_FACTORIES;
    private SourceLine line;
    private int lineIndex;
    private int index;
    private int column;
    private boolean columnIsInTab;
    private int nextNonSpace;
    private int nextNonSpaceColumn;
    private int indent;
    private boolean blank;
    private final List<BlockParserFactory> blockParserFactories;
    private final InlineParserFactory inlineParserFactory;
    private final List<DelimiterProcessor> delimiterProcessors;
    private final IncludeSourceSpans includeSourceSpans;
    private final DocumentBlockParser documentBlockParser;
    private final Map<String, LinkReferenceDefinition> definitions;
    private final List<OpenBlockParser> openBlockParsers;
    private final List<BlockParser> allBlockParsers;
    
    public DocumentParser(final List<BlockParserFactory> blockParserFactories, final InlineParserFactory inlineParserFactory, final List<DelimiterProcessor> delimiterProcessors, final IncludeSourceSpans includeSourceSpans) {
        super();
        this.lineIndex = -1;
        this.index = 0;
        this.column = 0;
        this.nextNonSpace = 0;
        this.nextNonSpaceColumn = 0;
        this.indent = 0;
        this.definitions = new LinkedHashMap<String, LinkReferenceDefinition>();
        this.openBlockParsers = new ArrayList<OpenBlockParser>();
        this.allBlockParsers = new ArrayList<BlockParser>();
        this.blockParserFactories = blockParserFactories;
        this.inlineParserFactory = inlineParserFactory;
        this.delimiterProcessors = delimiterProcessors;
        this.includeSourceSpans = includeSourceSpans;
        this.documentBlockParser = new DocumentBlockParser();
        this.activateBlockParser(new OpenBlockParser(this.documentBlockParser, 0));
    }
    
    public static Set<Class<? extends Block>> getDefaultBlockParserTypes() {
        return DocumentParser.CORE_FACTORY_TYPES;
    }
    
    public static List<BlockParserFactory> calculateBlockParserFactories(final List<BlockParserFactory> customBlockParserFactories, final Set<Class<? extends Block>> enabledBlockTypes) {
        final List<BlockParserFactory> list = new ArrayList<BlockParserFactory>();
        list.addAll(customBlockParserFactories);
        for (final Class<? extends Block> blockType : enabledBlockTypes) {
            list.add(DocumentParser.NODES_TO_CORE_FACTORIES.get(blockType));
        }
        return list;
    }
    
    public Document parse(final String input) {
        int lineStart = 0;
        int lineBreak;
        while ((lineBreak = Parsing.findLineBreak(input, lineStart)) != -1) {
            final String line = input.substring(lineStart, lineBreak);
            this.parseLine(line);
            if (lineBreak + 1 < input.length() && input.charAt(lineBreak) == '\r' && input.charAt(lineBreak + 1) == '\n') {
                lineStart = lineBreak + 2;
            }
            else {
                lineStart = lineBreak + 1;
            }
        }
        if (input.length() > 0 && (lineStart == 0 || lineStart < input.length())) {
            final String line = input.substring(lineStart);
            this.parseLine(line);
        }
        return this.finalizeAndProcess();
    }
    
    public Document parse(final Reader input) throws IOException {
        BufferedReader bufferedReader;
        if (input instanceof BufferedReader) {
            bufferedReader = (BufferedReader)input;
        }
        else {
            bufferedReader = new BufferedReader(input);
        }
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            this.parseLine(line);
        }
        return this.finalizeAndProcess();
    }
    
    @Override
    public SourceLine getLine() {
        return this.line;
    }
    
    @Override
    public int getIndex() {
        return this.index;
    }
    
    @Override
    public int getNextNonSpaceIndex() {
        return this.nextNonSpace;
    }
    
    @Override
    public int getColumn() {
        return this.column;
    }
    
    @Override
    public int getIndent() {
        return this.indent;
    }
    
    @Override
    public boolean isBlank() {
        return this.blank;
    }
    
    @Override
    public BlockParser getActiveBlockParser() {
        return this.openBlockParsers.get(this.openBlockParsers.size() - 1).blockParser;
    }
    
    private void parseLine(final CharSequence ln) {
        this.setLine(ln);
        int matches = 1;
        for (int i = 1; i < this.openBlockParsers.size(); ++i) {
            final OpenBlockParser openBlockParser = this.openBlockParsers.get(i);
            final BlockParser blockParser = openBlockParser.blockParser;
            this.findNextNonSpace();
            final BlockContinue result = blockParser.tryContinue(this);
            if (!(result instanceof BlockContinueImpl)) {
                break;
            }
            final BlockContinueImpl blockContinue = (BlockContinueImpl)result;
            openBlockParser.sourceIndex = this.getIndex();
            if (blockContinue.isFinalize()) {
                this.addSourceSpans();
                this.closeBlockParsers(this.openBlockParsers.size() - i);
                return;
            }
            if (blockContinue.getNewIndex() != -1) {
                this.setNewIndex(blockContinue.getNewIndex());
            }
            else if (blockContinue.getNewColumn() != -1) {
                this.setNewColumn(blockContinue.getNewColumn());
            }
            ++matches;
        }
        int unmatchedBlocks = this.openBlockParsers.size() - matches;
        BlockParser blockParser2 = this.openBlockParsers.get(matches - 1).blockParser;
        boolean startedNewBlock = false;
        int lastIndex = this.index;
        boolean tryBlockStarts = blockParser2.getBlock() instanceof Paragraph || blockParser2.isContainer();
        while (tryBlockStarts) {
            lastIndex = this.index;
            this.findNextNonSpace();
            if (this.isBlank() || (this.indent < Parsing.CODE_BLOCK_INDENT && Parsing.isLetter(this.line.getContent(), this.nextNonSpace))) {
                this.setNewIndex(this.nextNonSpace);
                break;
            }
            final BlockStartImpl blockStart = this.findBlockStart(blockParser2);
            if (blockStart == null) {
                this.setNewIndex(this.nextNonSpace);
                break;
            }
            startedNewBlock = true;
            final int sourceIndex = this.getIndex();
            if (unmatchedBlocks > 0) {
                this.closeBlockParsers(unmatchedBlocks);
                unmatchedBlocks = 0;
            }
            if (blockStart.getNewIndex() != -1) {
                this.setNewIndex(blockStart.getNewIndex());
            }
            else if (blockStart.getNewColumn() != -1) {
                this.setNewColumn(blockStart.getNewColumn());
            }
            List<SourceSpan> replacedSourceSpans = null;
            if (blockStart.isReplaceActiveBlockParser()) {
                final Block replacedBlock = this.prepareActiveBlockParserForReplacement();
                replacedSourceSpans = replacedBlock.getSourceSpans();
            }
            for (final BlockParser newBlockParser : blockStart.getBlockParsers()) {
                this.addChild(new OpenBlockParser(newBlockParser, sourceIndex));
                if (replacedSourceSpans != null) {
                    newBlockParser.getBlock().setSourceSpans(replacedSourceSpans);
                }
                blockParser2 = newBlockParser;
                tryBlockStarts = newBlockParser.isContainer();
            }
        }
        if (!startedNewBlock && !this.isBlank() && this.getActiveBlockParser().canHaveLazyContinuationLines()) {
            this.openBlockParsers.get(this.openBlockParsers.size() - 1).sourceIndex = lastIndex;
            this.addLine();
        }
        else {
            if (unmatchedBlocks > 0) {
                this.closeBlockParsers(unmatchedBlocks);
            }
            if (!blockParser2.isContainer()) {
                this.addLine();
            }
            else if (!this.isBlank()) {
                final ParagraphParser paragraphParser = new ParagraphParser();
                this.addChild(new OpenBlockParser(paragraphParser, lastIndex));
                this.addLine();
            }
            else {
                this.addSourceSpans();
            }
        }
    }
    
    private void setLine(final CharSequence ln) {
        ++this.lineIndex;
        this.index = 0;
        this.column = 0;
        this.columnIsInTab = false;
        final CharSequence lineContent = Parsing.prepareLine(ln);
        SourceSpan sourceSpan = null;
        if (this.includeSourceSpans != IncludeSourceSpans.NONE) {
            sourceSpan = SourceSpan.of(this.lineIndex, 0, lineContent.length());
        }
        this.line = SourceLine.of(lineContent, sourceSpan);
    }
    
    private void findNextNonSpace() {
        int i = this.index;
        int cols = this.column;
        this.blank = true;
        final int length = this.line.getContent().length();
    Label_0107:
        while (i < length) {
            final char c = this.line.getContent().charAt(i);
            switch (c) {
                case ' ': {
                    ++i;
                    ++cols;
                    continue;
                }
                case '\t': {
                    ++i;
                    cols += 4 - cols % 4;
                    continue;
                }
                default: {
                    this.blank = false;
                    break Label_0107;
                }
            }
        }
        this.nextNonSpace = i;
        this.nextNonSpaceColumn = cols;
        this.indent = this.nextNonSpaceColumn - this.column;
    }
    
    private void setNewIndex(final int newIndex) {
        if (newIndex >= this.nextNonSpace) {
            this.index = this.nextNonSpace;
            this.column = this.nextNonSpaceColumn;
        }
        final int length = this.line.getContent().length();
        while (this.index < newIndex && this.index != length) {
            this.advance();
        }
        this.columnIsInTab = false;
    }
    
    private void setNewColumn(final int newColumn) {
        if (newColumn >= this.nextNonSpaceColumn) {
            this.index = this.nextNonSpace;
            this.column = this.nextNonSpaceColumn;
        }
        final int length = this.line.getContent().length();
        while (this.column < newColumn && this.index != length) {
            this.advance();
        }
        if (this.column > newColumn) {
            --this.index;
            this.column = newColumn;
            this.columnIsInTab = true;
        }
        else {
            this.columnIsInTab = false;
        }
    }
    
    private void advance() {
        final char c = this.line.getContent().charAt(this.index);
        ++this.index;
        if (c == '\t') {
            this.column += Parsing.columnsToNextTabStop(this.column);
        }
        else {
            ++this.column;
        }
    }
    
    private void addLine() {
        CharSequence content;
        if (this.columnIsInTab) {
            final int afterTab = this.index + 1;
            final CharSequence rest = this.line.getContent().subSequence(afterTab, this.line.getContent().length());
            final int spaces = Parsing.columnsToNextTabStop(this.column);
            final StringBuilder sb = new StringBuilder(spaces + rest.length());
            for (int i = 0; i < spaces; ++i) {
                sb.append(' ');
            }
            sb.append(rest);
            content = sb.toString();
        }
        else if (this.index == 0) {
            content = this.line.getContent();
        }
        else {
            content = this.line.getContent().subSequence(this.index, this.line.getContent().length());
        }
        SourceSpan sourceSpan = null;
        if (this.includeSourceSpans == IncludeSourceSpans.BLOCKS_AND_INLINES) {
            sourceSpan = SourceSpan.of(this.lineIndex, this.index, content.length());
        }
        this.getActiveBlockParser().addLine(SourceLine.of(content, sourceSpan));
        this.addSourceSpans();
    }
    
    private void addSourceSpans() {
        if (this.includeSourceSpans != IncludeSourceSpans.NONE) {
            for (int i = 1; i < this.openBlockParsers.size(); ++i) {
                final OpenBlockParser openBlockParser = this.openBlockParsers.get(i);
                final int blockIndex = openBlockParser.sourceIndex;
                final int length = this.line.getContent().length() - blockIndex;
                if (length != 0) {
                    openBlockParser.blockParser.addSourceSpan(SourceSpan.of(this.lineIndex, blockIndex, length));
                }
            }
        }
    }
    
    private BlockStartImpl findBlockStart(final BlockParser blockParser) {
        final MatchedBlockParser matchedBlockParser = new MatchedBlockParserImpl(blockParser);
        for (final BlockParserFactory blockParserFactory : this.blockParserFactories) {
            final BlockStart result = blockParserFactory.tryStart(this, matchedBlockParser);
            if (result instanceof BlockStartImpl) {
                return (BlockStartImpl)result;
            }
        }
        return null;
    }
    
    private void finalize(final BlockParser blockParser) {
        if (blockParser instanceof ParagraphParser) {
            this.addDefinitionsFrom((ParagraphParser)blockParser);
        }
        blockParser.closeBlock();
    }
    
    private void addDefinitionsFrom(final ParagraphParser paragraphParser) {
        for (final LinkReferenceDefinition definition : paragraphParser.getDefinitions()) {
            paragraphParser.getBlock().insertBefore(definition);
            final String label = definition.getLabel();
            if (!this.definitions.containsKey(label)) {
                this.definitions.put(label, definition);
            }
        }
    }
    
    private void processInlines() {
        final InlineParserContextImpl context = new InlineParserContextImpl(this.delimiterProcessors, this.definitions);
        final InlineParser inlineParser = this.inlineParserFactory.create(context);
        for (final BlockParser blockParser : this.allBlockParsers) {
            blockParser.parseInlines(inlineParser);
        }
    }
    
    private void addChild(final OpenBlockParser openBlockParser) {
        while (!this.getActiveBlockParser().canContain(openBlockParser.blockParser.getBlock())) {
            this.closeBlockParsers(1);
        }
        this.getActiveBlockParser().getBlock().appendChild(openBlockParser.blockParser.getBlock());
        this.activateBlockParser(openBlockParser);
    }
    
    private void activateBlockParser(final OpenBlockParser openBlockParser) {
        this.openBlockParsers.add(openBlockParser);
    }
    
    private OpenBlockParser deactivateBlockParser() {
        return this.openBlockParsers.remove(this.openBlockParsers.size() - 1);
    }
    
    private Block prepareActiveBlockParserForReplacement() {
        final BlockParser old = this.deactivateBlockParser().blockParser;
        if (old instanceof ParagraphParser) {
            final ParagraphParser paragraphParser = (ParagraphParser)old;
            this.addDefinitionsFrom(paragraphParser);
        }
        old.closeBlock();
        old.getBlock().unlink();
        return old.getBlock();
    }
    
    private Document finalizeAndProcess() {
        this.closeBlockParsers(this.openBlockParsers.size());
        this.processInlines();
        return this.documentBlockParser.getBlock();
    }
    
    private void closeBlockParsers(final int count) {
        for (int i = 0; i < count; ++i) {
            final BlockParser blockParser = this.deactivateBlockParser().blockParser;
            this.finalize(blockParser);
            this.allBlockParsers.add(blockParser);
        }
    }
    
    static {
        CORE_FACTORY_TYPES = new LinkedHashSet<Class<? extends Block>>(Arrays.asList(BlockQuote.class, Heading.class, FencedCodeBlock.class, HtmlBlock.class, ThematicBreak.class, ListBlock.class, IndentedCodeBlock.class));
        final Map<Class<? extends Block>, BlockParserFactory> map = new HashMap<Class<? extends Block>, BlockParserFactory>();
        map.put(BlockQuote.class, new BlockQuoteParser.Factory());
        map.put(Heading.class, new HeadingParser.Factory());
        map.put(FencedCodeBlock.class, new FencedCodeBlockParser.Factory());
        map.put(HtmlBlock.class, (BlockParserFactory)new HtmlBlockParser.Factory());
        map.put(ThematicBreak.class, new ThematicBreakParser.Factory());
        map.put(ListBlock.class, new ListBlockParser.Factory());
        map.put(IndentedCodeBlock.class, (BlockParserFactory)new IndentedCodeBlockParser.Factory());
        NODES_TO_CORE_FACTORIES = Collections.unmodifiableMap((Map<? extends Class<? extends Block>, ? extends BlockParserFactory>)map);
    }
    
    private static class MatchedBlockParserImpl implements MatchedBlockParser
    {
        private final BlockParser matchedBlockParser;
        
        public MatchedBlockParserImpl(final BlockParser matchedBlockParser) {
            super();
            this.matchedBlockParser = matchedBlockParser;
        }
        
        @Override
        public BlockParser getMatchedBlockParser() {
            return this.matchedBlockParser;
        }
        
        @Override
        public SourceLines getParagraphLines() {
            if (this.matchedBlockParser instanceof ParagraphParser) {
                final ParagraphParser paragraphParser = (ParagraphParser)this.matchedBlockParser;
                return paragraphParser.getParagraphLines();
            }
            return SourceLines.empty();
        }
    }
    
    private static class OpenBlockParser
    {
        private final BlockParser blockParser;
        private int sourceIndex;
        
        OpenBlockParser(final BlockParser blockParser, final int sourceIndex) {
            super();
            this.blockParser = blockParser;
            this.sourceIndex = sourceIndex;
        }
        
        static /* synthetic */ BlockParser access$000(final OpenBlockParser x0) {
            return x0.blockParser;
        }
        
        static /* synthetic */ int access$102(final OpenBlockParser x0, final int x1) {
            return x0.sourceIndex = x1;
        }
        
        static /* synthetic */ int access$100(final OpenBlockParser x0) {
            return x0.sourceIndex;
        }
    }
}
