package gg.essential.universal;

import net.minecraft.client.render.*;

public enum CommonVertexFormats
{
    POSITION(VertexFormats.POSITION), 
    POSITION_COLOR(VertexFormats.POSITION_COLOR), 
    POSITION_TEXTURE(VertexFormats.POSITION_TEXTURE), 
    POSITION_TEXTURE_COLOR(VertexFormats.POSITION_TEXTURE_COLOR), 
    POSITION_COLOR_TEXTURE_LIGHT(VertexFormats.POSITION_COLOR_TEXTURE_LIGHT_NORMAL), 
    POSITION_TEXTURE_LIGHT_COLOR(VertexFormats.POSITION_TEXTURE_LIGHT_COLOR), 
    POSITION_TEXTURE_COLOR_LIGHT(VertexFormats.POSITION_TEXTURE_COLOR_LIGHT), 
    POSITION_TEXTURE_COLOR_NORMAL(VertexFormats.POSITION_TEXTURE_COLOR_NORMAL);
    
    private final VertexFormat mc;
    private static final /* synthetic */ CommonVertexFormats[] $VALUES;
    
    public static CommonVertexFormats[] values() {
        return CommonVertexFormats.$VALUES.clone();
    }
    
    public static CommonVertexFormats valueOf(final String name) {
        return Enum.valueOf(CommonVertexFormats.class, name);
    }
    
    private CommonVertexFormats(final VertexFormat mc) {
        this.mc = mc;
    }
    
    private static /* synthetic */ CommonVertexFormats[] $values() {
        return new CommonVertexFormats[] { CommonVertexFormats.POSITION, CommonVertexFormats.POSITION_COLOR, CommonVertexFormats.POSITION_TEXTURE, CommonVertexFormats.POSITION_TEXTURE_COLOR, CommonVertexFormats.POSITION_COLOR_TEXTURE_LIGHT, CommonVertexFormats.POSITION_TEXTURE_LIGHT_COLOR, CommonVertexFormats.POSITION_TEXTURE_COLOR_LIGHT, CommonVertexFormats.POSITION_TEXTURE_COLOR_NORMAL };
    }
    
    static {
        $VALUES = $values();
    }
}
