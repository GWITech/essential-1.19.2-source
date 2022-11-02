package gg.essential.vigilance.impl.nightconfig.core.utils;

import java.util.*;
import java.util.function.*;

public final class TransformingIterator<InternalV, ExternalV> implements Iterator<ExternalV>
{
    private final Function<? super InternalV, ? extends ExternalV> readTransformation;
    private final Iterator<InternalV> internalIterator;
    
    public TransformingIterator(final Iterator<InternalV> internalIterator, final Function<? super InternalV, ? extends ExternalV> readTransformation) {
        super();
        this.readTransformation = readTransformation;
        this.internalIterator = internalIterator;
    }
    
    @Override
    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }
    
    @Override
    public ExternalV next() {
        return (ExternalV)this.readTransformation.apply(this.internalIterator.next());
    }
    
    @Override
    public void remove() {
        this.internalIterator.remove();
    }
    
    @Override
    public void forEachRemaining(final Consumer<? super ExternalV> action) {
        this.internalIterator.forEachRemaining(internalV -> action.accept(this.readTransformation.apply((Object)internalV)));
    }
    
    private /* synthetic */ void lambda$forEachRemaining$0(final Consumer action, final Object internalV) {
        action.accept(this.readTransformation.apply((Object)internalV));
    }
}
