package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.reflect.*;
import gg.essential.lib.gson.*;
import gg.essential.lib.gson.internal.*;
import java.lang.reflect.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;
import java.util.*;

public final class CollectionTypeAdapterFactory implements TypeAdapterFactory
{
    private final ConstructorConstructor constructorConstructor;
    
    public CollectionTypeAdapterFactory(final ConstructorConstructor constructorConstructor) {
        super();
        this.constructorConstructor = constructorConstructor;
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        final Type type = typeToken.getType();
        final Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        final Type elementType = $Gson$Types.getCollectionElementType(type, rawType);
        final TypeAdapter<?> elementTypeAdapter = gson.getAdapter(TypeToken.get(elementType));
        final ObjectConstructor<T> constructor = this.constructorConstructor.get(typeToken);
        final TypeAdapter<T> result = (TypeAdapter<T>)new Adapter(gson, elementType, (TypeAdapter<Object>)elementTypeAdapter, (ObjectConstructor<? extends Collection<Object>>)constructor);
        return result;
    }
    
    private static final class Adapter<E> extends TypeAdapter<Collection<E>>
    {
        private final TypeAdapter<E> elementTypeAdapter;
        private final ObjectConstructor<? extends Collection<E>> constructor;
        
        public Adapter(final Gson context, final Type elementType, final TypeAdapter<E> elementTypeAdapter, final ObjectConstructor<? extends Collection<E>> constructor) {
            super();
            this.elementTypeAdapter = new TypeAdapterRuntimeTypeWrapper<E>(context, elementTypeAdapter, elementType);
            this.constructor = constructor;
        }
        
        @Override
        public Collection<E> read(final JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            final Collection<E> collection = (Collection<E>)this.constructor.construct();
            in.beginArray();
            while (in.hasNext()) {
                final E instance = this.elementTypeAdapter.read(in);
                collection.add(instance);
            }
            in.endArray();
            return collection;
        }
        
        @Override
        public void write(final JsonWriter out, final Collection<E> collection) throws IOException {
            if (collection == null) {
                out.nullValue();
                return;
            }
            out.beginArray();
            for (final E element : collection) {
                this.elementTypeAdapter.write(out, element);
            }
            out.endArray();
        }
        
        @Override
        public /* bridge */ Object read(final JsonReader in) throws IOException {
            return this.read(in);
        }
        
        @Override
        public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
            this.write(out, (Collection<E>)o);
        }
    }
}
