package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.internal.*;
import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;
import java.util.*;

class TypeAdapters$28 extends TypeAdapter<JsonElement> {
    TypeAdapters$28() {
        super();
    }
    
    @Override
    public JsonElement read(final JsonReader in) throws IOException {
        if (in instanceof JsonTreeReader) {
            return ((JsonTreeReader)in).nextJsonElement();
        }
        switch (in.peek()) {
            case STRING: {
                return new JsonPrimitive(in.nextString());
            }
            case NUMBER: {
                final String number = in.nextString();
                return new JsonPrimitive(new LazilyParsedNumber(number));
            }
            case BOOLEAN: {
                return new JsonPrimitive(in.nextBoolean());
            }
            case NULL: {
                in.nextNull();
                return JsonNull.INSTANCE;
            }
            case BEGIN_ARRAY: {
                final JsonArray array = new JsonArray();
                in.beginArray();
                while (in.hasNext()) {
                    array.add(this.read(in));
                }
                in.endArray();
                return array;
            }
            case BEGIN_OBJECT: {
                final JsonObject object = new JsonObject();
                in.beginObject();
                while (in.hasNext()) {
                    object.add(in.nextName(), this.read(in));
                }
                in.endObject();
                return object;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }
    
    @Override
    public void write(final JsonWriter out, final JsonElement value) throws IOException {
        if (value == null || value.isJsonNull()) {
            out.nullValue();
        }
        else if (value.isJsonPrimitive()) {
            final JsonPrimitive primitive = value.getAsJsonPrimitive();
            if (primitive.isNumber()) {
                out.value(primitive.getAsNumber());
            }
            else if (primitive.isBoolean()) {
                out.value(primitive.getAsBoolean());
            }
            else {
                out.value(primitive.getAsString());
            }
        }
        else if (value.isJsonArray()) {
            out.beginArray();
            for (final JsonElement e : value.getAsJsonArray()) {
                this.write(out, e);
            }
            out.endArray();
        }
        else {
            if (!value.isJsonObject()) {
                throw new IllegalArgumentException("Couldn't write " + value.getClass());
            }
            out.beginObject();
            for (final Map.Entry<String, JsonElement> e2 : value.getAsJsonObject().entrySet()) {
                out.name(e2.getKey());
                this.write(out, e2.getValue());
            }
            out.endObject();
        }
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (JsonElement)o);
    }
}