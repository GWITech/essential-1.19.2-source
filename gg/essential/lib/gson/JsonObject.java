package gg.essential.lib.gson;

import gg.essential.lib.gson.internal.*;
import java.util.*;

public final class JsonObject extends JsonElement
{
    private final LinkedTreeMap<String, JsonElement> members;
    
    public JsonObject() {
        super();
        this.members = new LinkedTreeMap<String, JsonElement>();
    }
    
    public void add(final String property, final JsonElement value) {
        this.members.put(property, (value == null) ? JsonNull.INSTANCE : value);
    }
    
    public void addProperty(final String property, final String value) {
        this.add(property, (value == null) ? JsonNull.INSTANCE : new JsonPrimitive(value));
    }
    
    public Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.members.entrySet();
    }
    
    public boolean has(final String memberName) {
        return this.members.containsKey(memberName);
    }
    
    public JsonElement get(final String memberName) {
        return this.members.get(memberName);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof JsonObject && ((JsonObject)o).members.equals(this.members));
    }
    
    @Override
    public int hashCode() {
        return this.members.hashCode();
    }
}
