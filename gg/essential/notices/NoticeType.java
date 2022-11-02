package gg.essential.notices;

public enum NoticeType
{
    NEW_BANNER, 
    SALE, 
    FRIEND_REQUEST_TOAST, 
    FRIEND_REQUEST_NEW_INDICATOR;
    
    private static final /* synthetic */ NoticeType[] $VALUES;
    
    public static NoticeType[] values() {
        return NoticeType.$VALUES.clone();
    }
    
    public static NoticeType valueOf(final String name) {
        return Enum.valueOf(NoticeType.class, name);
    }
    
    private static /* synthetic */ NoticeType[] $values() {
        return new NoticeType[] { NoticeType.NEW_BANNER, NoticeType.SALE, NoticeType.FRIEND_REQUEST_TOAST, NoticeType.FRIEND_REQUEST_NEW_INDICATOR };
    }
    
    static {
        $VALUES = $values();
    }
}
