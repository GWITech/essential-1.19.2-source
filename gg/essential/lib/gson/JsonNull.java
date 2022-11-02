package gg.essential.lib.gson;

public final class JsonNull extends JsonElement
{
    public static final JsonNull INSTANCE;
    
    @Deprecated
    public JsonNull() {
        super();
    }
    
    @Override
    public int hashCode() {
        return JsonNull.class.hashCode();
    }
    
    @Override
    public boolean equals(final Object other) {
        return this == other || other instanceof JsonNull;
    }
    
    static {
        INSTANCE = new JsonNull();
    }
}
