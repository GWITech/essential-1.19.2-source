package gg.essential.vigilance.impl.nightconfig.core.utils;

import java.util.function.*;
import java.util.*;

public final class TransformingSet<InternalV, ExternalV> extends TransformingCollection<InternalV, ExternalV> implements Set<ExternalV>
{
    public TransformingSet(final Set<InternalV> internalCollection, final Function<? super InternalV, ? extends ExternalV> readTransformation, final Function<? super ExternalV, ? extends InternalV> writeTransformation, final Function<Object, Object> searchTransformation) {
        super(internalCollection, readTransformation, (Function<? super Object, ? extends InternalV>)writeTransformation, searchTransformation);
    }
}
