package gg.essential.elementa.impl.commonmark.ext.ins;

import gg.essential.elementa.impl.commonmark.parser.*;
import gg.essential.elementa.impl.commonmark.*;
import gg.essential.elementa.impl.commonmark.ext.ins.internal.*;
import gg.essential.elementa.impl.commonmark.parser.delimiter.*;
import gg.essential.elementa.impl.commonmark.renderer.html.*;
import gg.essential.elementa.impl.commonmark.renderer.text.*;

public class InsExtension implements Parser.ParserExtension, HtmlRenderer.HtmlRendererExtension, TextContentRenderer.TextContentRendererExtension
{
    private InsExtension() {
        super();
    }
    
    public static Extension create() {
        return new InsExtension();
    }
    
    @Override
    public void extend(final Parser.Builder parserBuilder) {
        parserBuilder.customDelimiterProcessor(new InsDelimiterProcessor());
    }
    
    public void extend(final HtmlRenderer.Builder rendererBuilder) {
        rendererBuilder.nodeRendererFactory((HtmlNodeRendererFactory)new InsExtension.InsExtension$1(this));
    }
    
    public void extend(final TextContentRenderer.Builder rendererBuilder) {
        rendererBuilder.nodeRendererFactory((TextContentNodeRendererFactory)new InsExtension.InsExtension$2(this));
    }
}
