package gg.essential.api.utils;

import com.google.gson.*;
import java.util.*;

public class JsonHolder
{
    public static ThreadLocal<Boolean> printFormattingException;
    private JsonObject object;
    
    public JsonHolder(final JsonObject object) {
        super();
        this.object = object;
    }
    
    public JsonHolder(final String raw) {
        super();
        if (raw == null) {
            this.object = new JsonObject();
        }
        else {
            try {
                this.object = new JsonParser().parse(raw).getAsJsonObject();
            }
            catch (final Exception e) {
                this.object = new JsonObject();
                if (JsonHolder.printFormattingException.get()) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public JsonHolder() {
        this(new JsonObject());
    }
    
    public void ensureJsonHolder(final String key) {
        if (!this.has(key)) {
            this.put(key, new JsonHolder());
        }
    }
    
    public void ensureJsonArray(final String key) {
        if (!this.has(key)) {
            this.put(key, new JsonArray());
        }
    }
    
    public JsonHolder optOrCreateJsonHolder(final String key) {
        this.ensureJsonHolder(key);
        return this.optJSONObject(key);
    }
    
    public JsonArray optOrCreateJsonArray(final String key) {
        this.ensureJsonArray(key);
        return this.optJSONArray(key);
    }
    
    @Override
    public String toString() {
        if (this.object != null) {
            return this.object.toString();
        }
        return "{}";
    }
    
    public JsonHolder put(final String key, final boolean value) {
        this.object.addProperty(key, value);
        return this;
    }
    
    public void mergeNotOverride(final JsonHolder merge) {
        this.merge(merge, false);
    }
    
    public void mergeOverride(final JsonHolder merge) {
        this.merge(merge, true);
    }
    
    public void merge(final JsonHolder merge, final boolean override) {
        final JsonObject object = merge.getObject();
        merge.getKeys().stream().filter(s -> override || !this.has(s)).forEach(s -> this.put(s, object.get(s)));
    }
    
    private JsonHolder put(final String s, final JsonElement element) {
        this.object.add(s, element);
        return this;
    }
    
    public JsonHolder put(final String key, final String value) {
        this.object.addProperty(key, value);
        return this;
    }
    
    public JsonHolder put(final String key, final int value) {
        this.object.addProperty(key, value);
        return this;
    }
    
    public JsonHolder put(final String key, final double value) {
        this.object.addProperty(key, value);
        return this;
    }
    
    public JsonHolder put(final String key, final long value) {
        this.object.addProperty(key, value);
        return this;
    }
    
    private JsonHolder defaultOptJSONObject(final String key, final JsonObject fallBack) {
        try {
            return new JsonHolder(this.object.get(key).getAsJsonObject());
        }
        catch (final Exception ex) {
            return new JsonHolder(fallBack);
        }
    }
    
    public JsonArray defaultOptJSONArray(final String key, final JsonArray fallback) {
        try {
            return this.object.get(key).getAsJsonArray();
        }
        catch (final Exception ex) {
            return fallback;
        }
    }
    
    public JsonArray optJSONArray(final String key) {
        return this.defaultOptJSONArray(key, new JsonArray());
    }
    
    public boolean has(final String key) {
        return this.object.has(key);
    }
    
    public long optLong(final String key, final long fallback) {
        try {
            final JsonElement jsonElement = this.object.get(key);
            if (jsonElement != null) {
                return jsonElement.getAsLong();
            }
        }
        catch (final Exception ex) {}
        return fallback;
    }
    
    public long optLong(final String key) {
        return this.optLong(key, 0L);
    }
    
    public boolean optBoolean(final String key, final boolean fallback) {
        try {
            final JsonElement jsonElement = this.object.get(key);
            if (jsonElement != null) {
                return jsonElement.getAsBoolean();
            }
        }
        catch (final Exception ex) {}
        return fallback;
    }
    
    public boolean optBoolean(final String key) {
        return this.optBoolean(key, false);
    }
    
    public JsonObject optActualJSONObject(final String key) {
        try {
            return this.object.get(key).getAsJsonObject();
        }
        catch (final Exception ex) {
            return new JsonObject();
        }
    }
    
    public JsonHolder optJSONObject(final String key) {
        return this.defaultOptJSONObject(key, new JsonObject());
    }
    
    public int optInt(final String key, final int fallBack) {
        try {
            return this.object.get(key).getAsInt();
        }
        catch (final Exception ex) {
            return fallBack;
        }
    }
    
    public int optInt(final String key) {
        return this.optInt(key, 0);
    }
    
    public String defaultOptString(final String key, final String fallBack) {
        try {
            final JsonElement jsonElement = this.object.get(key);
            if (jsonElement != null) {
                return jsonElement.getAsString();
            }
        }
        catch (final Exception ex) {}
        return fallBack;
    }
    
    public String optString(final String key) {
        return this.defaultOptString(key, "");
    }
    
    public double optDouble(final String key, final double fallBack) {
        try {
            final JsonElement jsonElement = this.object.get(key);
            if (jsonElement != null) {
                return jsonElement.getAsDouble();
            }
        }
        catch (final Exception ex) {}
        return fallBack;
    }
    
    public List<String> getKeys() {
        final List<String> tmp = new ArrayList<String>();
        this.object.entrySet().forEach(e -> tmp.add(e.getKey()));
        return tmp;
    }
    
    public double optDouble(final String key) {
        return this.optDouble(key, 0.0);
    }
    
    public int getSize() {
        return this.object.entrySet().size();
    }
    
    public JsonObject getObject() {
        return this.object;
    }
    
    public boolean isNull(final String key) {
        return this.object.has(key) && this.object.get(key).isJsonNull();
    }
    
    public JsonHolder put(final String values, final JsonHolder values1) {
        return this.put(values, values1.getObject());
    }
    
    public JsonHolder put(final String values, final JsonObject object) {
        this.object.add(values, object);
        return this;
    }
    
    public JsonHolder put(final String key, final JsonArray jsonElements) {
        this.object.add(key, jsonElements);
        return this;
    }
    
    public void remove(final String header) {
        this.object.remove(header);
    }
    
    public JsonElement removeAndGet(final String header) {
        return this.object.remove(header);
    }
    
    private static /* synthetic */ void lambda$getKeys$3(final List tmp, final Map.Entry e) {
        tmp.add(e.getKey());
    }
    
    private /* synthetic */ void lambda$merge$2(final JsonObject object, final String s) {
        this.put(s, object.get(s));
    }
    
    private /* synthetic */ boolean lambda$merge$1(final boolean override, final String s) {
        return override || !this.has(s);
    }
    
    private static /* synthetic */ Boolean lambda$static$0() {
        return true;
    }
    
    static {
        JsonHolder.printFormattingException = ThreadLocal.withInitial(() -> true);
    }
}
