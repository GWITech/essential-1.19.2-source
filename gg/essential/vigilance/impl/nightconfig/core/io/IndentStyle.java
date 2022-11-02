package gg.essential.vigilance.impl.nightconfig.core.io;

public enum IndentStyle
{
    TABS(new char[] { '\t' }), 
    SPACES_2(new char[] { ' ', ' ' }), 
    SPACES_4(new char[] { ' ', ' ', ' ', ' ' }), 
    SPACES_8(new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' });
    
    public final char[] chars;
    private static final /* synthetic */ IndentStyle[] $VALUES;
    
    public static IndentStyle[] values() {
        return IndentStyle.$VALUES.clone();
    }
    
    public static IndentStyle valueOf(final String name) {
        return Enum.valueOf(IndentStyle.class, name);
    }
    
    private IndentStyle(final char[] chars) {
        this.chars = chars;
    }
    
    static {
        $VALUES = new IndentStyle[] { IndentStyle.TABS, IndentStyle.SPACES_2, IndentStyle.SPACES_4, IndentStyle.SPACES_8 };
    }
}
