package gg.essential.elementa.impl.commonmark.ext.gfm.strikethrough;

import gg.essential.elementa.impl.commonmark.parser.*;
import gg.essential.elementa.impl.commonmark.*;
import gg.essential.elementa.impl.commonmark.ext.gfm.strikethrough.internal.*;
import gg.essential.elementa.impl.commonmark.parser.delimiter.*;
import gg.essential.elementa.impl.commonmark.renderer.html.*;
import gg.essential.elementa.impl.commonmark.renderer.text.*;

public class StrikethroughExtension implements Parser.ParserExtension, HtmlRenderer.HtmlRendererExtension, TextContentRenderer.TextContentRendererExtension
{
    private StrikethroughExtension() {
        super();
    }
    
    public static Extension create() {
        return new StrikethroughExtension();
    }
    
    @Override
    public void extend(final Parser.Builder parserBuilder) {
        parserBuilder.customDelimiterProcessor(new StrikethroughDelimiterProcessor());
    }
    
    public void extend(final HtmlRenderer.Builder rendererBuilder) {
        rendererBuilder.nodeRendererFactory((HtmlNodeRendererFactory)new StrikethroughExtension.StrikethroughExtension$1(this));
    }
    
    public void extend(final TextContentRenderer.Builder rendererBuilder) {
        rendererBuilder.nodeRendererFactory((TextContentNodeRendererFactory)new StrikethroughExtension.StrikethroughExtension$2(this));
    }
}
