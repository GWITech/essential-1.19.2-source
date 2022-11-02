package gg.essential.elementa.impl.commonmark.parser;

import gg.essential.elementa.impl.commonmark.internal.*;

class Parser$Builder$1 implements InlineParserFactory {
    final /* synthetic */ Builder this$0;
    
    Parser$Builder$1(final Builder this$0) {
        this.this$0 = this$0;
        super();
    }
    
    @Override
    public InlineParser create(final InlineParserContext inlineParserContext) {
        return new InlineParserImpl(inlineParserContext);
    }
}