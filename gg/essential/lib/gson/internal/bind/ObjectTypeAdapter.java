package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.reflect.*;
import gg.essential.lib.gson.*;
import gg.essential.lib.gson.internal.*;
import java.util.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

public final class ObjectTypeAdapter extends TypeAdapter<Object>
{
    private static final TypeAdapterFactory DOUBLE_FACTORY;
    private final Gson gson;
    private final ToNumberStrategy toNumberStrategy;
    
    private ObjectTypeAdapter(final Gson gson, final ToNumberStrategy toNumberStrategy) {
        super();
        this.gson = gson;
        this.toNumberStrategy = toNumberStrategy;
    }
    
    private static TypeAdapterFactory newFactory(final ToNumberStrategy toNumberStrategy) {
        return new TypeAdapterFactory() {
            final /* synthetic */ ToNumberStrategy val$toNumberStrategy;
            
            ObjectTypeAdapter$1() {
                super();
            }
            
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
                if (type.getRawType() == Object.class) {
                    return (TypeAdapter<T>)new ObjectTypeAdapter(gson, toNumberStrategy, (byte)0);
                }
                return null;
            }
        };
    }
    
    public static TypeAdapterFactory getFactory(final ToNumberStrategy toNumberStrategy) {
        if (toNumberStrategy == ToNumberPolicy.DOUBLE) {
            return ObjectTypeAdapter.DOUBLE_FACTORY;
        }
        return newFactory(toNumberStrategy);
    }
    
    @Override
    public Object read(final JsonReader in) throws IOException {
        final JsonToken token = in.peek();
        switch (token) {
            case BEGIN_ARRAY: {
                final List<Object> list = new ArrayList<Object>();
                in.beginArray();
                while (in.hasNext()) {
                    list.add(this.read(in));
                }
                in.endArray();
                return list;
            }
            case BEGIN_OBJECT: {
                final Map<String, Object> map = new LinkedTreeMap<String, Object>();
                in.beginObject();
                while (in.hasNext()) {
                    map.put(in.nextName(), this.read(in));
                }
                in.endObject();
                return map;
            }
            case STRING: {
                return in.nextString();
            }
            case NUMBER: {
                return this.toNumberStrategy.readNumber(in);
            }
            case BOOLEAN: {
                return in.nextBoolean();
            }
            case NULL: {
                in.nextNull();
                return null;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }
    
    @Override
    public void write(final JsonWriter out, final Object value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        final TypeAdapter<Object> typeAdapter = this.gson.getAdapter(value.getClass());
        if (typeAdapter instanceof ObjectTypeAdapter) {
            out.beginObject();
            out.endObject();
            return;
        }
        typeAdapter.write(out, value);
    }
    
    ObjectTypeAdapter(final Gson x0, final ToNumberStrategy x1, final byte b) {
        this(x0, x1);
    }
    
    static {
        DOUBLE_FACTORY = newFactory(ToNumberPolicy.DOUBLE);
    }
}
