package gg.essential.elementa.components;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lgg/essential/elementa/components/UIImage$TextureScalingMode;", "", "glMode", "", "(Ljava/lang/String;II)V", "getGlMode$Elementa", "()I", "NEAREST", "LINEAR", "NEAREST_MIPMAP_NEAREST", "LINEAR_MIPMAP_NEAREST", "NEAREST_MIPMAP_LINEAR", "LINEAR_MIPMAP_LINEAR", "Elementa" })
public enum TextureScalingMode
{
    private final int glMode;
    
    NEAREST("NEAREST", 0, 9728), 
    LINEAR("LINEAR", 1, 9729), 
    NEAREST_MIPMAP_NEAREST("NEAREST_MIPMAP_NEAREST", 2, 9984), 
    LINEAR_MIPMAP_NEAREST("LINEAR_MIPMAP_NEAREST", 3, 9985), 
    NEAREST_MIPMAP_LINEAR("NEAREST_MIPMAP_LINEAR", 4, 9986), 
    LINEAR_MIPMAP_LINEAR("LINEAR_MIPMAP_LINEAR", 5, 9987);
    
    private static final /* synthetic */ TextureScalingMode[] $VALUES;
    
    private TextureScalingMode(final String $enum$name, final int $enum$ordinal, final int glMode) {
        this.glMode = glMode;
    }
    
    public final int getGlMode$Elementa() {
        return this.glMode;
    }
    
    public static TextureScalingMode[] values() {
        return TextureScalingMode.$VALUES.clone();
    }
    
    public static TextureScalingMode valueOf(final String value) {
        return Enum.valueOf(TextureScalingMode.class, value);
    }
    
    private static final /* synthetic */ TextureScalingMode[] $values() {
        return new TextureScalingMode[] { TextureScalingMode.NEAREST, TextureScalingMode.LINEAR, TextureScalingMode.NEAREST_MIPMAP_NEAREST, TextureScalingMode.LINEAR_MIPMAP_NEAREST, TextureScalingMode.NEAREST_MIPMAP_LINEAR, TextureScalingMode.LINEAR_MIPMAP_LINEAR };
    }
    
    static {
        $VALUES = $values();
    }
}
