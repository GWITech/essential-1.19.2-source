package gg.essential.elementa.impl.commonmark.renderer.text;

import gg.essential.elementa.impl.commonmark.node.*;

public interface TextContentNodeRendererContext
{
    boolean stripNewlines();
    
    TextContentWriter getWriter();
    
    void render(final Node p0);
}
