package gg.essential.lib.okhttp3.internal.http2;

public enum ErrorCode
{
    NO_ERROR(0), 
    PROTOCOL_ERROR(1), 
    INTERNAL_ERROR(2), 
    FLOW_CONTROL_ERROR(3), 
    REFUSED_STREAM(7), 
    CANCEL(8);
    
    public final int httpCode;
    private static final /* synthetic */ ErrorCode[] $VALUES;
    
    public static ErrorCode[] values() {
        return ErrorCode.$VALUES.clone();
    }
    
    public static ErrorCode valueOf(final String name) {
        return Enum.valueOf(ErrorCode.class, name);
    }
    
    private ErrorCode(final int httpCode) {
        this.httpCode = httpCode;
    }
    
    public static ErrorCode fromHttp2(final int code) {
        for (final ErrorCode errorCode : values()) {
            if (errorCode.httpCode == code) {
                return errorCode;
            }
        }
        return null;
    }
    
    static {
        $VALUES = new ErrorCode[] { ErrorCode.NO_ERROR, ErrorCode.PROTOCOL_ERROR, ErrorCode.INTERNAL_ERROR, ErrorCode.FLOW_CONTROL_ERROR, ErrorCode.REFUSED_STREAM, ErrorCode.CANCEL };
    }
}
