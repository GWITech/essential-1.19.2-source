package gg.essential.lib.gson.stream;

public enum JsonToken
{
    BEGIN_ARRAY, 
    END_ARRAY, 
    BEGIN_OBJECT, 
    END_OBJECT, 
    NAME, 
    STRING, 
    NUMBER, 
    BOOLEAN, 
    NULL, 
    END_DOCUMENT;
    
    private static final /* synthetic */ JsonToken[] $VALUES;
    
    public static JsonToken[] values() {
        return JsonToken.$VALUES.clone();
    }
    
    public static JsonToken valueOf(final String name) {
        return Enum.valueOf(JsonToken.class, name);
    }
    
    static {
        $VALUES = new JsonToken[] { JsonToken.BEGIN_ARRAY, JsonToken.END_ARRAY, JsonToken.BEGIN_OBJECT, JsonToken.END_OBJECT, JsonToken.NAME, JsonToken.STRING, JsonToken.NUMBER, JsonToken.BOOLEAN, JsonToken.NULL, JsonToken.END_DOCUMENT };
    }
}
