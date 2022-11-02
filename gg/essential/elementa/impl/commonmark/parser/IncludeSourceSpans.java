package gg.essential.elementa.impl.commonmark.parser;

public enum IncludeSourceSpans
{
    NONE, 
    BLOCKS, 
    BLOCKS_AND_INLINES;
    
    private static final /* synthetic */ IncludeSourceSpans[] $VALUES;
    
    public static IncludeSourceSpans[] values() {
        return IncludeSourceSpans.$VALUES.clone();
    }
    
    public static IncludeSourceSpans valueOf(final String name) {
        return Enum.valueOf(IncludeSourceSpans.class, name);
    }
    
    static {
        $VALUES = new IncludeSourceSpans[] { IncludeSourceSpans.NONE, IncludeSourceSpans.BLOCKS, IncludeSourceSpans.BLOCKS_AND_INLINES };
    }
}
