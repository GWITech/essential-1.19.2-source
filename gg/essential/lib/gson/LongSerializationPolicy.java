package gg.essential.lib.gson;

public enum LongSerializationPolicy
{
    DEFAULT {
        LongSerializationPolicy$1(final String x0) {
        }
    }, 
    STRING {
        LongSerializationPolicy$2(final String x0) {
        }
    };
    
    private static final /* synthetic */ LongSerializationPolicy[] $VALUES;
    
    public static LongSerializationPolicy[] values() {
        return LongSerializationPolicy.$VALUES.clone();
    }
    
    public static LongSerializationPolicy valueOf(final String name) {
        return Enum.valueOf(LongSerializationPolicy.class, name);
    }
    
    LongSerializationPolicy(final String x0, final int x1, final byte b) {
        this();
    }
    
    static {
        $VALUES = new LongSerializationPolicy[] { LongSerializationPolicy.DEFAULT, LongSerializationPolicy.STRING };
    }
}
