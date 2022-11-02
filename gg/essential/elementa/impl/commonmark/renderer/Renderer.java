package gg.essential.elementa.impl.commonmark.renderer;

import gg.essential.elementa.impl.commonmark.node.*;

public interface Renderer
{
    void render(final Node p0, final Appendable p1);
    
    String render(final Node p0);
}
