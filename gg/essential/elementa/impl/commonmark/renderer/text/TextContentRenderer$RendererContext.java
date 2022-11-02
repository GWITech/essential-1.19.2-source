package gg.essential.elementa.impl.commonmark.renderer.text;

import gg.essential.elementa.impl.commonmark.internal.renderer.*;
import gg.essential.elementa.impl.commonmark.renderer.*;
import gg.essential.elementa.impl.commonmark.node.*;

private class RendererContext implements TextContentNodeRendererContext
{
    private final TextContentWriter textContentWriter;
    private final NodeRendererMap nodeRendererMap;
    final /* synthetic */ TextContentRenderer this$0;
    
    private RendererContext(final TextContentRenderer x0, final TextContentWriter textContentWriter) {
        this.this$0 = x0;
        super();
        this.nodeRendererMap = new NodeRendererMap();
        this.textContentWriter = textContentWriter;
        for (int i = TextContentRenderer.access$400(x0).size() - 1; i >= 0; --i) {
            final TextContentNodeRendererFactory nodeRendererFactory = TextContentRenderer.access$400(x0).get(i);
            final NodeRenderer nodeRenderer = nodeRendererFactory.create(this);
            this.nodeRendererMap.add(nodeRenderer);
        }
    }
    
    @Override
    public boolean stripNewlines() {
        return TextContentRenderer.access$500(this.this$0);
    }
    
    @Override
    public TextContentWriter getWriter() {
        return this.textContentWriter;
    }
    
    @Override
    public void render(final Node node) {
        this.nodeRendererMap.render(node);
    }
    
    RendererContext(final TextContentRenderer x0, final TextContentWriter x1, final TextContentRenderer$1 x2) {
        this(x0, x1);
    }
}
