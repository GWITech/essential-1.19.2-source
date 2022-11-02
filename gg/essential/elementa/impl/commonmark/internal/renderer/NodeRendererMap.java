package gg.essential.elementa.impl.commonmark.internal.renderer;

import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.renderer.*;
import java.util.*;

public class NodeRendererMap
{
    private final Map<Class<? extends Node>, NodeRenderer> renderers;
    
    public NodeRendererMap() {
        super();
        this.renderers = new HashMap<Class<? extends Node>, NodeRenderer>(32);
    }
    
    public void add(final NodeRenderer nodeRenderer) {
        for (final Class<? extends Node> nodeType : nodeRenderer.getNodeTypes()) {
            this.renderers.put(nodeType, nodeRenderer);
        }
    }
    
    public void render(final Node node) {
        final NodeRenderer nodeRenderer = this.renderers.get(node.getClass());
        if (nodeRenderer != null) {
            nodeRenderer.render(node);
        }
    }
}
