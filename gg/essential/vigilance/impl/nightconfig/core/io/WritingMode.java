package gg.essential.vigilance.impl.nightconfig.core.io;

public enum WritingMode
{
    REPLACE, 
    APPEND;
    
    private static final /* synthetic */ WritingMode[] $VALUES;
    
    public static WritingMode[] values() {
        return WritingMode.$VALUES.clone();
    }
    
    public static WritingMode valueOf(final String name) {
        return Enum.valueOf(WritingMode.class, name);
    }
    
    static {
        $VALUES = new WritingMode[] { WritingMode.REPLACE, WritingMode.APPEND };
    }
}
