package gg.essential.util;

import gg.essential.lib.gson.*;
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
    
    @Override
    public String toString() {
        if (this.object != null) {
            return this.object.toString();
        }
        return "{}";
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
    
    public List<String> getKeys() {
        final List<String> tmp = new ArrayList<String>();
        this.object.entrySet().forEach(e -> tmp.add(e.getKey()));
        return tmp;
    }
    
    private static /* synthetic */ void lambda$getKeys$3(final List tmp, final Map.Entry e) {
        tmp.add(e.getKey());
    }
    
    private static /* synthetic */ Boolean lambda$static$0() {
        return true;
    }
    
    static {
        JsonHolder.printFormattingException = ThreadLocal.withInitial(() -> true);
    }
}
