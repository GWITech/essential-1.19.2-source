package gg.essential.vigilance.impl.nightconfig.core.io;

public enum NewlineStyle
{
    UNIX(new char[] { '\n' }), 
    WINDOWS(new char[] { '\r', '\n' });
    
    public final char[] chars;
    private static final /* synthetic */ NewlineStyle[] $VALUES;
    
    public static NewlineStyle[] values() {
        return NewlineStyle.$VALUES.clone();
    }
    
    public static NewlineStyle valueOf(final String name) {
        return Enum.valueOf(NewlineStyle.class, name);
    }
    
    private NewlineStyle(final char[] chars) {
        this.chars = chars;
    }
    
    public static NewlineStyle system() {
        final String systemNewline = System.getProperty("line.separator");
        return systemNewline.equals("\r\n") ? NewlineStyle.WINDOWS : NewlineStyle.UNIX;
    }
    
    static {
        $VALUES = new NewlineStyle[] { NewlineStyle.UNIX, NewlineStyle.WINDOWS };
    }
}
