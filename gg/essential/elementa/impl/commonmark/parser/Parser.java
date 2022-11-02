package gg.essential.elementa.impl.commonmark.parser;

import gg.essential.elementa.impl.commonmark.parser.block.*;
import gg.essential.elementa.impl.commonmark.parser.delimiter.*;
import gg.essential.elementa.impl.commonmark.node.*;
import java.io.*;
import java.util.*;
import gg.essential.elementa.impl.commonmark.*;
import gg.essential.elementa.impl.commonmark.internal.*;

public class Parser
{
    private final List<BlockParserFactory> blockParserFactories;
    private final List<DelimiterProcessor> delimiterProcessors;
    private final InlineParserFactory inlineParserFactory;
    private final List<PostProcessor> postProcessors;
    private final IncludeSourceSpans includeSourceSpans;
    
    private Parser(final Builder builder) {
        super();
        this.blockParserFactories = DocumentParser.calculateBlockParserFactories(builder.blockParserFactories, builder.enabledBlockTypes);
        this.inlineParserFactory = builder.getInlineParserFactory();
        this.postProcessors = builder.postProcessors;
        this.delimiterProcessors = builder.delimiterProcessors;
        this.includeSourceSpans = builder.includeSourceSpans;
        this.inlineParserFactory.create(new InlineParserContextImpl(this.delimiterProcessors, Collections.emptyMap()));
    }
    
    public static Builder builder() {
        return new Builder();
    }
    
    public Node parse(final String input) {
        if (input == null) {
            throw new NullPointerException("input must not be null");
        }
        final DocumentParser documentParser = this.createDocumentParser();
        final Node document = documentParser.parse(input);
        return this.postProcess(document);
    }
    
    public Node parseReader(final Reader input) throws IOException {
        if (input == null) {
            throw new NullPointerException("input must not be null");
        }
        final DocumentParser documentParser = this.createDocumentParser();
        final Node document = documentParser.parse(input);
        return this.postProcess(document);
    }
    
    private DocumentParser createDocumentParser() {
        return new DocumentParser(this.blockParserFactories, this.inlineParserFactory, this.delimiterProcessors, this.includeSourceSpans);
    }
    
    private Node postProcess(Node document) {
        for (final PostProcessor postProcessor : this.postProcessors) {
            document = postProcessor.process(document);
        }
        return document;
    }
    
    Parser(final Builder x0, final Parser.Parser$1 x1) {
        this(x0);
    }
    
    public static class Builder
    {
        private final List<BlockParserFactory> blockParserFactories;
        private final List<DelimiterProcessor> delimiterProcessors;
        private final List<PostProcessor> postProcessors;
        private Set<Class<? extends Block>> enabledBlockTypes;
        private InlineParserFactory inlineParserFactory;
        private IncludeSourceSpans includeSourceSpans;
        
        public Builder() {
            super();
            this.blockParserFactories = new ArrayList<BlockParserFactory>();
            this.delimiterProcessors = new ArrayList<DelimiterProcessor>();
            this.postProcessors = new ArrayList<PostProcessor>();
            this.enabledBlockTypes = DocumentParser.getDefaultBlockParserTypes();
            this.includeSourceSpans = IncludeSourceSpans.NONE;
        }
        
        public Parser build() {
            return new Parser(this, null);
        }
        
        public Builder extensions(final Iterable<? extends Extension> extensions) {
            if (extensions == null) {
                throw new NullPointerException("extensions must not be null");
            }
            for (final Extension extension : extensions) {
                if (extension instanceof ParserExtension) {
                    final ParserExtension parserExtension = (ParserExtension)extension;
                    parserExtension.extend(this);
                }
            }
            return this;
        }
        
        public Builder enabledBlockTypes(final Set<Class<? extends Block>> enabledBlockTypes) {
            if (enabledBlockTypes == null) {
                throw new NullPointerException("enabledBlockTypes must not be null");
            }
            this.enabledBlockTypes = enabledBlockTypes;
            return this;
        }
        
        public Builder includeSourceSpans(final IncludeSourceSpans includeSourceSpans) {
            this.includeSourceSpans = includeSourceSpans;
            return this;
        }
        
        public Builder customBlockParserFactory(final BlockParserFactory blockParserFactory) {
            if (blockParserFactory == null) {
                throw new NullPointerException("blockParserFactory must not be null");
            }
            this.blockParserFactories.add(blockParserFactory);
            return this;
        }
        
        public Builder customDelimiterProcessor(final DelimiterProcessor delimiterProcessor) {
            if (delimiterProcessor == null) {
                throw new NullPointerException("delimiterProcessor must not be null");
            }
            this.delimiterProcessors.add(delimiterProcessor);
            return this;
        }
        
        public Builder postProcessor(final PostProcessor postProcessor) {
            if (postProcessor == null) {
                throw new NullPointerException("postProcessor must not be null");
            }
            this.postProcessors.add(postProcessor);
            return this;
        }
        
        public Builder inlineParserFactory(final InlineParserFactory inlineParserFactory) {
            this.inlineParserFactory = inlineParserFactory;
            return this;
        }
        
        private InlineParserFactory getInlineParserFactory() {
            if (this.inlineParserFactory != null) {
                return this.inlineParserFactory;
            }
            return new InlineParserFactory() {
                final /* synthetic */ Builder this$0;
                
                Parser$Builder$1() {
                    this.this$0 = this$0;
                    super();
                }
                
                @Override
                public InlineParser create(final InlineParserContext inlineParserContext) {
                    return new InlineParserImpl(inlineParserContext);
                }
            };
        }
        
        static /* synthetic */ List access$000(final Builder x0) {
            return x0.blockParserFactories;
        }
        
        static /* synthetic */ Set access$100(final Builder x0) {
            return x0.enabledBlockTypes;
        }
        
        static /* synthetic */ InlineParserFactory access$200(final Builder x0) {
            return x0.getInlineParserFactory();
        }
        
        static /* synthetic */ List access$300(final Builder x0) {
            return x0.postProcessors;
        }
        
        static /* synthetic */ List access$400(final Builder x0) {
            return x0.delimiterProcessors;
        }
        
        static /* synthetic */ IncludeSourceSpans access$500(final Builder x0) {
            return x0.includeSourceSpans;
        }
    }
    
    public interface ParserExtension extends Extension
    {
        void extend(final Builder p0);
    }
}
