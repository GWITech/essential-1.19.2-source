package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.internal.*;
import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;
import java.util.*;

public static final class Adapter<T> extends TypeAdapter<T>
{
    private final ObjectConstructor<T> constructor;
    private final Map<String, BoundField> boundFields;
    
    Adapter(final ObjectConstructor<T> constructor, final Map<String, BoundField> boundFields) {
        super();
        this.constructor = constructor;
        this.boundFields = boundFields;
    }
    
    @Override
    public T read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        final T instance = this.constructor.construct();
        try {
            in.beginObject();
            while (in.hasNext()) {
                final String name = in.nextName();
                final BoundField field = this.boundFields.get(name);
                if (field == null || !field.deserialized) {
                    in.skipValue();
                }
                else {
                    field.read(in, instance);
                }
            }
        }
        catch (final IllegalStateException e) {
            throw new JsonSyntaxException(e);
        }
        catch (final IllegalAccessException e2) {
            throw new AssertionError((Object)e2);
        }
        in.endObject();
        return instance;
    }
    
    @Override
    public void write(final JsonWriter out, final T value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        out.beginObject();
        try {
            for (final BoundField boundField : this.boundFields.values()) {
                if (boundField.writeField(value)) {
                    out.name(boundField.name);
                    boundField.write(out, value);
                }
            }
        }
        catch (final IllegalAccessException e) {
            throw new AssertionError((Object)e);
        }
        out.endObject();
    }
}
