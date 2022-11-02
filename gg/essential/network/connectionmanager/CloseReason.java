package gg.essential.network.connectionmanager;

public enum CloseReason
{
    SERVER_KEEP_ALIVE_TIMEOUT(4500), 
    SERVER_REQUESTED(4501), 
    CLIENT_FAILED_MOJANG_AUTH(4502), 
    LOGIN_REQUEST_NO_RESPONSE(4503), 
    INVALID_LOGIN_RESPONSE(4504), 
    LOGIN_REQUEST_FAILED(4505), 
    REAUTHENTICATION(4506), 
    SERVER_REQUESTED_RECONNECT(4507), 
    NOT_AUTHENTICATED(4508), 
    USER_TOS_REVOKED(4509);
    
    private final int code;
    private static final /* synthetic */ CloseReason[] $VALUES;
    
    public static CloseReason[] values() {
        return CloseReason.$VALUES.clone();
    }
    
    public static CloseReason valueOf(final String name) {
        return Enum.valueOf(CloseReason.class, name);
    }
    
    private CloseReason(final int code) {
        this.code = code;
    }
    
    public int getCode() {
        return this.code;
    }
    
    private static /* synthetic */ CloseReason[] $values() {
        return new CloseReason[] { CloseReason.SERVER_KEEP_ALIVE_TIMEOUT, CloseReason.SERVER_REQUESTED, CloseReason.CLIENT_FAILED_MOJANG_AUTH, CloseReason.LOGIN_REQUEST_NO_RESPONSE, CloseReason.INVALID_LOGIN_RESPONSE, CloseReason.LOGIN_REQUEST_FAILED, CloseReason.REAUTHENTICATION, CloseReason.SERVER_REQUESTED_RECONNECT, CloseReason.NOT_AUTHENTICATED, CloseReason.USER_TOS_REVOKED };
    }
    
    static {
        $VALUES = $values();
    }
}
