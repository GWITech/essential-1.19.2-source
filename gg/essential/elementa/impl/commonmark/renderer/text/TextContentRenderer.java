package gg.essential.elementa.impl.commonmark.renderer.text;

import gg.essential.elementa.impl.commonmark.renderer.*;
import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.*;
import java.util.*;
import gg.essential.elementa.impl.commonmark.internal.renderer.*;

public class TextContentRenderer implements Renderer
{
    private final boolean stripNewlines;
    private final List<TextContentNodeRendererFactory> nodeRendererFactories;
    
    private TextContentRenderer(final Builder builder) {
        super();
        this.stripNewlines = builder.stripNewlines;
        (this.nodeRendererFactories = new ArrayList<TextContentNodeRendererFactory>(builder.nodeRendererFactories.size() + 1)).addAll(builder.nodeRendererFactories);
        this.nodeRendererFactories.add(new TextContentNodeRendererFactory() {
            final /* synthetic */ TextContentRenderer this$0;
            
            TextContentRenderer$1() {
                this.this$0 = this$0;
                super();
            }
            
            @Override
            public NodeRenderer create(final TextContentNodeRendererContext context) {
                return new CoreTextContentNodeRenderer(context);
            }
        });
    }
    
    public static Builder builder() {
        return new Builder();
    }
    
    @Override
    public void render(final Node node, final Appendable output) {
        final RendererContext context = new RendererContext(this, new TextContentWriter(output));
        context.render(node);
    }
    
    @Override
    public String render(final Node node) {
        final StringBuilder sb = new StringBuilder();
        this.render(node, sb);
        return sb.toString();
    }
    
    TextContentRenderer(final Builder x0, final TextContentRenderer$1 x1) {
        this(x0);
    }
    
    static /* synthetic */ List access$400(final TextContentRenderer x0) {
        return x0.nodeRendererFactories;
    }
    
    static /* synthetic */ boolean access$500(final TextContentRenderer x0) {
        return x0.stripNewlines;
    }
    
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
            for (int i = x0.nodeRendererFactories.size() - 1; i >= 0; --i) {
                final TextContentNodeRendererFactory nodeRendererFactory = x0.nodeRendererFactories.get(i);
                final NodeRenderer nodeRenderer = nodeRendererFactory.create(this);
                this.nodeRendererMap.add(nodeRenderer);
            }
        }
        
        @Override
        public boolean stripNewlines() {
            return this.this$0.stripNewlines;
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
    
    public interface TextContentRendererExtension extends Extension
    {
        void extend(final Builder p0);
    }
}
