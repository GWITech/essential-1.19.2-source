package gg.essential.elementa.impl.commonmark.renderer.text;

import gg.essential.elementa.impl.commonmark.renderer.*;

class TextContentRenderer$1 implements TextContentNodeRendererFactory {
    final /* synthetic */ TextContentRenderer this$0;
    
    TextContentRenderer$1(final TextContentRenderer this$0) {
        this.this$0 = this$0;
        super();
    }
    
    @Override
    public NodeRenderer create(final TextContentNodeRendererContext context) {
        return new CoreTextContentNodeRenderer(context);
    }
}