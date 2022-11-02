package gg.essential.vigilance.impl.nightconfig.core.utils;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class TransformingCollection<InternalV, ExternalV> implements Collection<ExternalV>
{
    private final Function<? super InternalV, ? extends ExternalV> readTransformation;
    private final Function<? super ExternalV, ? extends InternalV> writeTransformation;
    private final Function<Object, Object> searchTransformation;
    private final Collection<InternalV> internalCollection;
    
    public TransformingCollection(final Collection<InternalV> internalCollection, final Function<? super InternalV, ? extends ExternalV> readTransformation, final Function<? super ExternalV, ? extends InternalV> writeTransformation, final Function<Object, Object> searchTransformation) {
        super();
        this.internalCollection = internalCollection;
        this.readTransformation = readTransformation;
        this.writeTransformation = writeTransformation;
        this.searchTransformation = searchTransformation;
    }
    
    @Override
    public int size() {
        return this.internalCollection.size();
    }
    
    @Override
    public boolean isEmpty() {
        return this.internalCollection.isEmpty();
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.internalCollection.contains(this.searchTransformation.apply(o));
    }
    
    @Override
    public Iterator<ExternalV> iterator() {
        return new TransformingIterator<Object, ExternalV>(this.internalCollection.iterator(), this.readTransformation);
    }
    
    @Override
    public Object[] toArray() {
        final Object[] array = this.internalCollection.toArray();
        for (int i = 0; i < array.length; ++i) {
            array[i] = this.readTransformation.apply((Object)array[i]);
        }
        return array;
    }
    
    @Override
    public <T> T[] toArray(final T[] a) {
        final T[] array = this.internalCollection.toArray(a);
        for (int i = 0; i < array.length; ++i) {
            array[i] = (T)this.readTransformation.apply((Object)array[i]);
        }
        return array;
    }
    
    @Override
    public boolean add(final ExternalV value) {
        return this.internalCollection.add((InternalV)this.writeTransformation.apply(value));
    }
    
    @Override
    public boolean remove(final Object o) {
        return this.internalCollection.remove(this.searchTransformation.apply(o));
    }
    
    @Override
    public boolean containsAll(final Collection<?> c) {
        return this.internalCollection.containsAll(new TransformingCollection<Object, Object>(c, this.searchTransformation, o -> o, this.searchTransformation));
    }
    
    @Override
    public boolean addAll(final Collection<? extends ExternalV> c) {
        return this.internalCollection.addAll((Collection<? extends InternalV>)new TransformingCollection<Object, Object>(c, this.writeTransformation, this.readTransformation, this.searchTransformation));
    }
    
    @Override
    public boolean removeAll(final Collection<?> c) {
        return this.internalCollection.removeAll(new TransformingCollection<Object, Object>(c, this.searchTransformation, o -> o, this.searchTransformation));
    }
    
    @Override
    public boolean removeIf(final Predicate<? super ExternalV> filter) {
        return this.internalCollection.removeIf(internalV -> filter.test(this.readTransformation.apply((Object)internalV)));
    }
    
    @Override
    public boolean retainAll(final Collection<?> c) {
        return this.internalCollection.retainAll(new TransformingCollection<Object, Object>(c, this.searchTransformation, o -> o, this.searchTransformation));
    }
    
    @Override
    public void clear() {
        this.internalCollection.clear();
    }
    
    @Override
    public Spliterator<ExternalV> spliterator() {
        return (Spliterator<ExternalV>)new TransformingSpliterator((Spliterator)this.internalCollection.spliterator(), (Function)this.readTransformation, (Function)this.writeTransformation);
    }
    
    @Override
    public Stream<ExternalV> stream() {
        return this.internalCollection.stream().map(this.readTransformation);
    }
    
    @Override
    public Stream<ExternalV> parallelStream() {
        return this.internalCollection.parallelStream().map(this.readTransformation);
    }
    
    @Override
    public void forEach(final Consumer<? super ExternalV> action) {
        this.internalCollection.forEach(internalV -> action.accept(this.readTransformation.apply((Object)internalV)));
    }
    
    private /* synthetic */ void lambda$forEach$4(final Consumer action, final Object internalV) {
        action.accept(this.readTransformation.apply((Object)internalV));
    }
    
    private static /* synthetic */ Object lambda$retainAll$3(final Object o) {
        return o;
    }
    
    private /* synthetic */ boolean lambda$removeIf$2(final Predicate filter, final Object internalV) {
        return filter.test(this.readTransformation.apply((Object)internalV));
    }
    
    private static /* synthetic */ Object lambda$removeAll$1(final Object o) {
        return o;
    }
    
    private static /* synthetic */ Object lambda$containsAll$0(final Object o) {
        return o;
    }
}
