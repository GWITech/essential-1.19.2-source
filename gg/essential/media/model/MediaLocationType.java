package gg.essential.media.model;

public enum MediaLocationType
{
    SINGLE_PLAYER, 
    SHARED_WORLD, 
    MULTIPLAYER, 
    MENU, 
    UNKNOWN;
    
    private static final /* synthetic */ MediaLocationType[] $VALUES;
    
    public static MediaLocationType[] values() {
        return MediaLocationType.$VALUES.clone();
    }
    
    public static MediaLocationType valueOf(final String name) {
        return Enum.valueOf(MediaLocationType.class, name);
    }
    
    private static /* synthetic */ MediaLocationType[] $values() {
        return new MediaLocationType[] { MediaLocationType.SINGLE_PLAYER, MediaLocationType.SHARED_WORLD, MediaLocationType.MULTIPLAYER, MediaLocationType.MENU, MediaLocationType.UNKNOWN };
    }
    
    static {
        $VALUES = $values();
    }
}
