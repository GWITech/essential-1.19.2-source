package gg.essential.universal;

import net.minecraft.client.render.*;

public enum DrawMode
{
    LINES(1), 
    LINE_STRIP(3), 
    TRIANGLES(4), 
    TRIANGLE_STRIP(5), 
    TRIANGLE_FAN(6), 
    QUADS(7);
    
    private final int glMode;
    private final VertexFormat.DrawMode mcMode;
    private static final /* synthetic */ DrawMode[] $VALUES;
    
    public static DrawMode[] values() {
        return DrawMode.$VALUES.clone();
    }
    
    public static DrawMode valueOf(final String name) {
        return Enum.valueOf(DrawMode.class, name);
    }
    
    private DrawMode(final int glMode) {
        this.glMode = glMode;
        this.mcMode = glToMcDrawMode(glMode);
    }
    
    private static VertexFormat.DrawMode glToMcDrawMode(final int glMode) {
        switch (glMode) {
            case 1: {
                return VertexFormat.DrawMode.LINES;
            }
            case 3: {
                return VertexFormat.DrawMode.LINE_STRIP;
            }
            case 4: {
                return VertexFormat.DrawMode.TRIANGLES;
            }
            case 5: {
                return VertexFormat.DrawMode.TRIANGLE_STRIP;
            }
            case 6: {
                return VertexFormat.DrawMode.TRIANGLE_FAN;
            }
            case 7: {
                return VertexFormat.DrawMode.QUADS;
            }
            default: {
                throw new IllegalArgumentException("Unsupported draw mode " + glMode);
            }
        }
    }
    
    private static DrawMode fromMc(final VertexFormat.DrawMode mcMode) {
        switch (UGraphics.UGraphics$1.$SwitchMap$net$minecraft$client$render$VertexFormat$DrawMode[mcMode.ordinal()]) {
            case 1: {
                return DrawMode.LINES;
            }
            case 2: {
                return DrawMode.LINE_STRIP;
            }
            case 3: {
                return DrawMode.TRIANGLES;
            }
            case 4: {
                return DrawMode.TRIANGLE_STRIP;
            }
            case 5: {
                return DrawMode.TRIANGLE_FAN;
            }
            case 6: {
                return DrawMode.QUADS;
            }
            default: {
                throw new IllegalArgumentException("Unsupported draw mode " + mcMode);
            }
        }
    }
    
    public static DrawMode fromGl(final int glMode) {
        switch (glMode) {
            case 1: {
                return DrawMode.LINES;
            }
            case 3: {
                return DrawMode.LINE_STRIP;
            }
            case 4: {
                return DrawMode.TRIANGLES;
            }
            case 5: {
                return DrawMode.TRIANGLE_STRIP;
            }
            case 6: {
                return DrawMode.TRIANGLE_FAN;
            }
            case 7: {
                return DrawMode.QUADS;
            }
            default: {
                throw new IllegalArgumentException("Unsupported draw mode " + glMode);
            }
        }
    }
    
    public static DrawMode fromRenderLayer(final RenderLayer renderLayer) {
        return fromMc(renderLayer.getDrawMode());
    }
    
    private static /* synthetic */ DrawMode[] $values() {
        return new DrawMode[] { DrawMode.LINES, DrawMode.LINE_STRIP, DrawMode.TRIANGLES, DrawMode.TRIANGLE_STRIP, DrawMode.TRIANGLE_FAN, DrawMode.QUADS };
    }
    
    static {
        $VALUES = $values();
    }
}
