package gg.essential.lib.gson.internal.bind;

import java.lang.reflect.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;
import gg.essential.lib.gson.internal.*;
import java.util.*;
import gg.essential.lib.gson.*;

private final class Adapter<K, V> extends TypeAdapter<Map<K, V>>
{
    private final TypeAdapter<K> keyTypeAdapter;
    private final TypeAdapter<V> valueTypeAdapter;
    private final ObjectConstructor<? extends Map<K, V>> constructor;
    final /* synthetic */ MapTypeAdapterFactory this$0;
    
    public Adapter(final MapTypeAdapterFactory this$0, final Gson context, final Type keyType, final TypeAdapter<K> keyTypeAdapter, final Type valueType, final TypeAdapter<V> valueTypeAdapter, final ObjectConstructor<? extends Map<K, V>> constructor) {
        this.this$0 = this$0;
        super();
        this.keyTypeAdapter = new TypeAdapterRuntimeTypeWrapper<K>(context, keyTypeAdapter, keyType);
        this.valueTypeAdapter = new TypeAdapterRuntimeTypeWrapper<V>(context, valueTypeAdapter, valueType);
        this.constructor = constructor;
    }
    
    @Override
    public Map<K, V> read(final JsonReader in) throws IOException {
        final JsonToken peek = in.peek();
        if (peek == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        final Map<K, V> map = (Map<K, V>)this.constructor.construct();
        if (peek == JsonToken.BEGIN_ARRAY) {
            in.beginArray();
            while (in.hasNext()) {
                in.beginArray();
                final K key = this.keyTypeAdapter.read(in);
                final V value = this.valueTypeAdapter.read(in);
                final V replaced = map.put(key, value);
                if (replaced != null) {
                    throw new JsonSyntaxException("duplicate key: " + key);
                }
                in.endArray();
            }
            in.endArray();
        }
        else {
            in.beginObject();
            while (in.hasNext()) {
                JsonReaderInternalAccess.INSTANCE.promoteNameToValue(in);
                final K key = this.keyTypeAdapter.read(in);
                final V value = this.valueTypeAdapter.read(in);
                final V replaced = map.put(key, value);
                if (replaced != null) {
                    throw new JsonSyntaxException("duplicate key: " + key);
                }
            }
            in.endObject();
        }
        return map;
    }
    
    @Override
    public void write(final JsonWriter out, final Map<K, V> map) throws IOException {
        if (map == null) {
            out.nullValue();
            return;
        }
        if (!this.this$0.complexMapKeySerialization) {
            out.beginObject();
            for (final Map.Entry<K, V> entry : map.entrySet()) {
                out.name(String.valueOf(entry.getKey()));
                this.valueTypeAdapter.write(out, entry.getValue());
            }
            out.endObject();
            return;
        }
        boolean hasComplexKeys = false;
        final List<JsonElement> keys = new ArrayList<JsonElement>(map.size());
        final List<V> values = new ArrayList<V>(map.size());
        for (final Map.Entry<K, V> entry2 : map.entrySet()) {
            final JsonElement keyElement = this.keyTypeAdapter.toJsonTree(entry2.getKey());
            keys.add(keyElement);
            values.add(entry2.getValue());
            hasComplexKeys |= (keyElement.isJsonArray() || keyElement.isJsonObject());
        }
        if (hasComplexKeys) {
            out.beginArray();
            for (int i = 0, size = keys.size(); i < size; ++i) {
                out.beginArray();
                Streams.write(keys.get(i), out);
                this.valueTypeAdapter.write(out, values.get(i));
                out.endArray();
            }
            out.endArray();
        }
        else {
            out.beginObject();
            for (int i = 0, size = keys.size(); i < size; ++i) {
                final JsonElement keyElement = keys.get(i);
                out.name(this.keyToString(keyElement));
                this.valueTypeAdapter.write(out, values.get(i));
            }
            out.endObject();
        }
    }
    
    private String keyToString(final JsonElement keyElement) {
        if (keyElement.isJsonPrimitive()) {
            final JsonPrimitive primitive = keyElement.getAsJsonPrimitive();
            if (primitive.isNumber()) {
                return String.valueOf(primitive.getAsNumber());
            }
            if (primitive.isBoolean()) {
                return Boolean.toString(primitive.getAsBoolean());
            }
            if (primitive.isString()) {
                return primitive.getAsString();
            }
            throw new AssertionError();
        }
        else {
            if (keyElement.isJsonNull()) {
                return "null";
            }
            throw new AssertionError();
        }
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (Map<K, V>)o);
    }
}
