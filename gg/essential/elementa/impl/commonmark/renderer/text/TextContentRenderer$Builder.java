package gg.essential.elementa.impl.commonmark.renderer.text;

import gg.essential.elementa.impl.commonmark.*;
import java.util.*;

public static class Builder
{
    private boolean stripNewlines;
    private List<TextContentNodeRendererFactory> nodeRendererFactories;
    
    public Builder() {
        super();
        this.stripNewlines = false;
        this.nodeRendererFactories = new ArrayList<TextContentNodeRendererFactory>();
    }
    
    public TextContentRenderer build() {
        return new TextContentRenderer(this, null);
    }
    
    public Builder stripNewlines(final boolean stripNewlines) {
        this.stripNewlines = stripNewlines;
        return this;
    }
    
    public Builder nodeRendererFactory(final TextContentNodeRendererFactory nodeRendererFactory) {
        this.nodeRendererFactories.add(nodeRendererFactory);
        return this;
    }
    
    public Builder extensions(final Iterable<? extends Extension> extensions) {
        for (final Extension extension : extensions) {
            if (extension instanceof TextContentRendererExtension) {
                final TextContentRendererExtension textContentRendererExtension = (TextContentRendererExtension)extension;
                textContentRendererExtension.extend(this);
            }
        }
        return this;
    }
    
    static /* synthetic */ boolean access$000(final Builder x0) {
        return x0.stripNewlines;
    }
    
    static /* synthetic */ List access$100(final Builder x0) {
        return x0.nodeRendererFactories;
    }
}
