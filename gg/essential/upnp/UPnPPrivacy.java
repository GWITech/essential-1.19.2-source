package gg.essential.upnp;

public enum UPnPPrivacy
{
    INVITE_ONLY, 
    FRIENDS;
    
    private static final /* synthetic */ UPnPPrivacy[] $VALUES;
    
    public static UPnPPrivacy[] values() {
        return UPnPPrivacy.$VALUES.clone();
    }
    
    public static UPnPPrivacy valueOf(final String name) {
        return Enum.valueOf(UPnPPrivacy.class, name);
    }
    
    private static /* synthetic */ UPnPPrivacy[] $values() {
        return new UPnPPrivacy[] { UPnPPrivacy.INVITE_ONLY, UPnPPrivacy.FRIENDS };
    }
    
    static {
        $VALUES = $values();
    }
}
