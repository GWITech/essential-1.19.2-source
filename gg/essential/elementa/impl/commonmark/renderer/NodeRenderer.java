package gg.essential.elementa.impl.commonmark.renderer;

import java.util.*;
import gg.essential.elementa.impl.commonmark.node.*;

public interface NodeRenderer
{
    Set<Class<? extends Node>> getNodeTypes();
    
    void render(final Node p0);
}
