package gg.essential.lib.okhttp3;

enum ParseResult
{
    SUCCESS, 
    MISSING_SCHEME, 
    UNSUPPORTED_SCHEME, 
    INVALID_PORT, 
    INVALID_HOST;
    
    private static final /* synthetic */ ParseResult[] $VALUES;
    
    public static ParseResult[] values() {
        return ParseResult.$VALUES.clone();
    }
    
    public static ParseResult valueOf(final String name) {
        return Enum.valueOf(ParseResult.class, name);
    }
    
    static {
        $VALUES = new ParseResult[] { ParseResult.SUCCESS, ParseResult.MISSING_SCHEME, ParseResult.UNSUPPORTED_SCHEME, ParseResult.INVALID_PORT, ParseResult.INVALID_HOST };
    }
}
