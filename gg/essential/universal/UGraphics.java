package gg.essential.universal;

import java.util.regex.*;
import java.util.function.*;
import gg.essential.universal.vertex.*;
import org.lwjgl.opengl.*;
import com.mojang.blaze3d.systems.*;
import com.mojang.blaze3d.platform.*;
import net.minecraft.util.*;
import net.minecraft.text.*;
import net.minecraft.client.font.*;
import gg.essential.universal.utils.*;
import net.minecraft.client.texture.*;
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
import com.google.common.collect.*;
import java.awt.*;
import java.util.*;
import net.minecraft.client.render.*;

public class UGraphics
{
    private static final Pattern formattingCodePattern;
    public static Style EMPTY_WITH_FONT_ID;
    private static UMatrixStack UNIT_STACK;
    public static int ZERO_TEXT_ALPHA;
    private BufferBuilder instance;
    private VertexFormat vertexFormat;
    private static final Map<VertexFormat, Supplier<Shader>> DEFAULT_SHADERS;
    private RenderLayer renderLayer;
    
    public UGraphics(final BufferBuilder instance) {
        super();
        this.instance = instance;
    }
    
    public UVertexConsumer asUVertexConsumer() {
        return UVertexConsumer.of((VertexConsumer)this.instance);
    }
    
    public static UGraphics getFromTessellator() {
        return new UGraphics(getTessellator().getBuffer());
    }
    
    public static Tessellator getTessellator() {
        return Tessellator.getInstance();
    }
    
    @Deprecated
    public static void draw() {
        getTessellator().draw();
    }
    
    public static void cullFace(final int mode) {
        GL11.glCullFace(mode);
    }
    
    public static void enableLighting() {
    }
    
    public static void disableLighting() {
    }
    
    public static void disableLight(final int mode) {
    }
    
    public static void enableLight(final int mode) {
    }
    
    public static void enableBlend() {
        RenderSystem.enableBlend();
    }
    
    @Deprecated
    public static void disableTexture2D() {
        RenderSystem.disableTexture();
    }
    
    public static void disableAlpha() {
    }
    
    public static void shadeModel(final int mode) {
    }
    
    public static void blendEquation(final int equation) {
        RenderSystem.blendEquation(equation);
    }
    
    public static void tryBlendFuncSeparate(final int srcFactor, final int dstFactor, final int srcFactorAlpha, final int dstFactorAlpha) {
        RenderSystem.blendFuncSeparate(srcFactor, dstFactor, srcFactorAlpha, dstFactorAlpha);
    }
    
    @Deprecated
    public static void enableTexture2D() {
        RenderSystem.enableTexture();
    }
    
    public static void disableBlend() {
        RenderSystem.disableBlend();
    }
    
    public static void deleteTexture(final int glTextureId) {
        RenderSystem.deleteTexture(glTextureId);
    }
    
    public static void enableAlpha() {
    }
    
    public static void configureTexture(final int glTextureId, final Runnable block) {
        final int prevTextureBinding = GL11.glGetInteger(32873);
        RenderSystem.bindTexture(glTextureId);
        block.run();
        RenderSystem.bindTexture(prevTextureBinding);
    }
    
    public static void configureTextureUnit(final int index, final Runnable block) {
        final int prevActiveTexture = getActiveTexture();
        setActiveTexture(33984 + index);
        block.run();
        setActiveTexture(prevActiveTexture);
    }
    
    @Deprecated
    public static void activeTexture(final int glId) {
        setActiveTexture(glId);
    }
    
    public static int getActiveTexture() {
        return GL11.glGetInteger(34016);
    }
    
    public static void setActiveTexture(final int glId) {
        GlStateManager._activeTexture(glId);
    }
    
    @Deprecated
    public static void bindTexture(final int glTextureId) {
        RenderSystem.setShaderTexture(GlStateManager._getActiveTexture() - 33984, glTextureId);
    }
    
    @Deprecated
    public static void bindTexture(final Identifier resourceLocation) {
        bindTexture(getOrLoadTextureId(resourceLocation));
    }
    
    public static void bindTexture(final int index, final int glTextureId) {
        RenderSystem.setShaderTexture(index, glTextureId);
    }
    
    public static void bindTexture(final int index, final Identifier resourceLocation) {
        bindTexture(index, getOrLoadTextureId(resourceLocation));
    }
    
    private static int getOrLoadTextureId(final Identifier resourceLocation) {
        final TextureManager textureManager = UMinecraft.getMinecraft().getTextureManager();
        AbstractTexture texture = textureManager.getTexture(resourceLocation);
        if (texture == null) {
            texture = (AbstractTexture)new ResourceTexture(resourceLocation);
            textureManager.registerTexture(resourceLocation, texture);
        }
        return texture.getGlId();
    }
    
    public static int getStringWidth(final String in) {
        return UMinecraft.getFontRenderer().getWidth(in);
    }
    
    public static int getFontHeight() {
        Objects.requireNonNull(UMinecraft.getFontRenderer());
        return 9;
    }
    
    @Deprecated
    public static void drawString(final String text, final float x, final float y, final int color, final boolean shadow) {
        drawString(UGraphics.UNIT_STACK, text, x, y, color, shadow);
    }
    
    public static void drawString(final UMatrixStack stack, final String text, final float x, final float y, final int color, final boolean shadow) {
        if ((color >> 24 & 0xFF) <= 10) {
            return;
        }
        final VertexConsumerProvider.Immediate irendertypebuffer$impl = VertexConsumerProvider.immediate(Tessellator.getInstance().getBuffer());
        UMinecraft.getFontRenderer().draw(text, x, y, color, shadow, stack.peek().getModel(), (VertexConsumerProvider)irendertypebuffer$impl, false, 0, 15728880);
        irendertypebuffer$impl.draw();
    }
    
    @Deprecated
    public static void drawString(final String text, final float x, final float y, final int color, final int shadowColor) {
        drawString(UGraphics.UNIT_STACK, text, x, y, color, shadowColor);
    }
    
    public static void drawString(final UMatrixStack stack, final String text, final float x, final float y, final int color, final int shadowColor) {
        if ((color >> 24 & 0xFF) <= 10) {
            return;
        }
        final String shadowText = ChatColor.Companion.stripColorCodes(text);
        final VertexConsumerProvider.Immediate irendertypebuffer$impl = VertexConsumerProvider.immediate(Tessellator.getInstance().getBuffer());
        UMinecraft.getFontRenderer().draw(shadowText, x + 1.0f, y + 1.0f, shadowColor, false, stack.peek().getModel(), (VertexConsumerProvider)irendertypebuffer$impl, false, 0, 15728880);
        UMinecraft.getFontRenderer().draw(text, x, y, color, false, stack.peek().getModel(), (VertexConsumerProvider)irendertypebuffer$impl, false, 0, 15728880);
        irendertypebuffer$impl.draw();
    }
    
    public static List<String> listFormattedStringToWidth(final String str, final int wrapWidth) {
        return listFormattedStringToWidth(str, wrapWidth, true);
    }
    
    public static List<String> listFormattedStringToWidth(final String str, int wrapWidth, final boolean safe) {
        if (safe) {
            final String tmp = UGraphics.formattingCodePattern.matcher(str).replaceAll("");
            int max = 0;
            for (final String s : tmp.split(" ")) {
                max = Math.max(max, getStringWidth(s));
            }
            wrapWidth = Math.max(max, wrapWidth);
        }
        final List<String> strings = new ArrayList<String>();
        final TextHandler charManager = UMinecraft.getFontRenderer().getTextHandler();
        final StringVisitable properties = charManager.trimToWidth((StringVisitable)Text.literal(str).fillStyle(UGraphics.EMPTY_WITH_FONT_ID), wrapWidth, Style.EMPTY);
        properties.visit(string -> {
            strings.add(string);
            return Optional.empty();
        });
        return strings;
    }
    
    public static float getCharWidth(final char character) {
        return (float)getStringWidth(String.valueOf(character));
    }
    
    public static void glClear(final int mode) {
        GL11.glClear(mode);
    }
    
    public static void glClearStencil(final int mode) {
        GL11.glClearStencil(mode);
    }
    
    public static ReleasedDynamicTexture getTexture(final InputStream stream) {
        try {
            return new ReleasedDynamicTexture(NativeImage.read(stream));
        }
        catch (final IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Failed to read image");
        }
    }
    
    public static ReleasedDynamicTexture getTexture(final BufferedImage img) {
        try {
            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(img, "png", baos);
            return new ReleasedDynamicTexture(NativeImage.read((InputStream)new ByteArrayInputStream(baos.toByteArray())));
        }
        catch (final IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Failed to create texture");
        }
    }
    
    public static ReleasedDynamicTexture getEmptyTexture() {
        return new ReleasedDynamicTexture(0, 0);
    }
    
    public static void glUseProgram(final int program) {
        GlStateManager._glUseProgram(program);
    }
    
    public static boolean isOpenGl21Supported() {
        return true;
    }
    
    public static boolean areShadersSupported() {
        return true;
    }
    
    public static int glCreateProgram() {
        return GlStateManager.glCreateProgram();
    }
    
    public static int glCreateShader(final int type) {
        return GlStateManager.glCreateShader(type);
    }
    
    public static void glCompileShader(final int shaderIn) {
        GlStateManager.glCompileShader(shaderIn);
    }
    
    public static int glGetShaderi(final int shaderIn, final int pname) {
        return GlStateManager.glGetShaderi(shaderIn, pname);
    }
    
    public static String glGetShaderInfoLog(final int shader, final int maxLen) {
        return GlStateManager.glGetShaderInfoLog(shader, maxLen);
    }
    
    public static void glAttachShader(final int program, final int shaderIn) {
        GlStateManager.glAttachShader(program, shaderIn);
    }
    
    public static void glLinkProgram(final int program) {
        GlStateManager.glLinkProgram(program);
    }
    
    public static int glGetProgrami(final int program, final int pname) {
        return GlStateManager.glGetProgrami(program, pname);
    }
    
    public static String glGetProgramInfoLog(final int program, final int maxLen) {
        return GlStateManager.glGetProgramInfoLog(program, maxLen);
    }
    
    public static void color4f(final float red, final float green, final float blue, final float alpha) {
        RenderSystem.setShaderColor(red, green, blue, alpha);
    }
    
    public static void directColor3f(final float red, final float green, final float blue) {
        color4f(red, green, blue, 1.0f);
    }
    
    public static void enableDepth() {
        RenderSystem.enableDepthTest();
    }
    
    public static void depthFunc(final int mode) {
        RenderSystem.depthFunc(mode);
    }
    
    public static void depthMask(final boolean flag) {
        RenderSystem.depthMask(flag);
    }
    
    public static void disableDepth() {
        RenderSystem.disableDepthTest();
    }
    
    public static void setShader(final Supplier<Shader> shader) {
        RenderSystem.setShader((Supplier)shader);
    }
    
    public UGraphics beginWithActiveShader(final DrawMode mode, final CommonVertexFormats format) {
        return this.beginWithActiveShader(mode, format.mc);
    }
    
    public UGraphics beginWithActiveShader(final DrawMode mode, final VertexFormat format) {
        this.vertexFormat = format;
        this.instance.begin(mode.mcMode, format);
        return this;
    }
    
    public UGraphics beginWithDefaultShader(final DrawMode mode, final CommonVertexFormats format) {
        return this.beginWithDefaultShader(mode, format.mc);
    }
    
    public UGraphics beginWithDefaultShader(final DrawMode mode, final VertexFormat format) {
        final Supplier<Shader> supplier = UGraphics.DEFAULT_SHADERS.get(format);
        if (supplier == null) {
            throw new IllegalArgumentException("No default shader for " + format + ". Bind your own and use beginWithActiveShader instead.");
        }
        setShader(supplier);
        return this.beginWithActiveShader(mode, format);
    }
    
    public UGraphics beginRenderLayer(final RenderLayer renderLayer) {
        this.renderLayer = renderLayer;
        this.beginWithActiveShader(DrawMode.fromRenderLayer(renderLayer), renderLayer.getVertexFormat());
        return this;
    }
    
    @Deprecated
    public UGraphics begin(final int glMode, final CommonVertexFormats format) {
        return this.begin(glMode, format.mc);
    }
    
    @Deprecated
    public UGraphics begin(final int glMode, final VertexFormat format) {
        this.beginWithDefaultShader(DrawMode.fromGl(glMode), format);
        return this;
    }
    
    public void drawDirect() {
        if (this.renderLayer != null) {
            this.renderLayer.draw(this.instance, 0, 0, 0);
            return;
        }
        this.doDraw();
    }
    
    public void drawSorted(final int cameraX, final int cameraY, final int cameraZ) {
        if (this.renderLayer != null) {
            this.renderLayer.draw(this.instance, cameraX, cameraY, cameraZ);
            return;
        }
        this.instance.sortFrom((float)cameraX, (float)cameraY, (float)cameraZ);
        this.doDraw();
    }
    
    private static boolean[] getDesiredTextureUnitState(final VertexFormat vertexFormat) {
        boolean[] wantEnabled = new boolean[2];
        for (final VertexFormatElement element : vertexFormat.getElements()) {
            if (element.getType() == VertexFormatElement.Type.UV) {
                final int index = element.getUvIndex();
                if (wantEnabled.length <= index) {
                    wantEnabled = Arrays.copyOf(wantEnabled, index + 1);
                }
                wantEnabled[index] = true;
            }
        }
        return wantEnabled;
    }
    
    private void doDraw() {
        final VertexFormat vertexFormat = this.vertexFormat;
        if (vertexFormat == null) {
            getTessellator().draw();
            return;
        }
        getTessellator().draw();
    }
    
    @Deprecated
    public UGraphics pos(final double x, final double y, final double z) {
        return this.pos(UGraphics.UNIT_STACK, x, y, z);
    }
    
    public UGraphics pos(final UMatrixStack stack, final double x, final double y, final double z) {
        if (stack == UGraphics.UNIT_STACK) {
            this.instance.method_22912(x, y, z);
        }
        else {
            this.instance.method_22918(stack.peek().getModel(), (float)x, (float)y, (float)z);
        }
        return this;
    }
    
    @Deprecated
    public UGraphics norm(final float x, final float y, final float z) {
        return this.norm(UGraphics.UNIT_STACK, x, y, z);
    }
    
    public UGraphics norm(final UMatrixStack stack, final float x, final float y, final float z) {
        if (stack == UGraphics.UNIT_STACK) {
            this.instance.method_22914(x, y, z);
        }
        else {
            this.instance.method_23763(stack.peek().getNormal(), x, y, z);
        }
        return this;
    }
    
    public UGraphics color(final int red, final int green, final int blue, final int alpha) {
        return this.color(red / 255.0f, green / 255.0f, blue / 255.0f, alpha / 255.0f);
    }
    
    public UGraphics color(final float red, final float green, final float blue, final float alpha) {
        this.instance.method_22915(red, green, blue, alpha);
        return this;
    }
    
    public UGraphics color(final Color color) {
        return this.color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }
    
    public UGraphics endVertex() {
        this.instance.method_1344();
        return this;
    }
    
    public UGraphics tex(final double u, final double v) {
        this.instance.method_22913((float)u, (float)v);
        return this;
    }
    
    public UGraphics overlay(final int u, final int v) {
        this.instance.method_22917(u, v);
        return this;
    }
    
    public UGraphics light(final int u, final int v) {
        this.instance.method_22921(u, v);
        return this;
    }
    
    private static /* synthetic */ Optional lambda$listFormattedStringToWidth$0(final List strings, final String string) {
        strings.add(string);
        return Optional.empty();
    }
    
    static {
        formattingCodePattern = Pattern.compile("(?i)§[0-9A-FK-OR]");
        UGraphics.EMPTY_WITH_FONT_ID = Style.EMPTY.withFont(new Identifier("minecraft", "alt"));
        UGraphics.UNIT_STACK = UMatrixStack.UNIT;
        UGraphics.ZERO_TEXT_ALPHA = 10;
        (DEFAULT_SHADERS = new HashMap<VertexFormat, Supplier<Shader>>()).put(VertexFormats.LINES, GameRenderer::getRenderTypeLinesShader);
        UGraphics.DEFAULT_SHADERS.put(VertexFormats.POSITION_TEXTURE_COLOR_LIGHT, GameRenderer::getParticleShader);
        UGraphics.DEFAULT_SHADERS.put(VertexFormats.POSITION, GameRenderer::getPositionShader);
        UGraphics.DEFAULT_SHADERS.put(VertexFormats.POSITION_COLOR, GameRenderer::getPositionColorShader);
        UGraphics.DEFAULT_SHADERS.put(VertexFormats.POSITION_COLOR_LIGHT, GameRenderer::getPositionColorLightmapShader);
        UGraphics.DEFAULT_SHADERS.put(VertexFormats.POSITION_TEXTURE, GameRenderer::getPositionTexShader);
        UGraphics.DEFAULT_SHADERS.put(VertexFormats.POSITION_COLOR_TEXTURE, GameRenderer::getPositionColorTexShader);
        UGraphics.DEFAULT_SHADERS.put(VertexFormats.POSITION_TEXTURE_COLOR, GameRenderer::getPositionTexColorShader);
        UGraphics.DEFAULT_SHADERS.put(VertexFormats.POSITION_COLOR_TEXTURE_LIGHT, GameRenderer::getPositionColorTexLightmapShader);
        UGraphics.DEFAULT_SHADERS.put(VertexFormats.POSITION_TEXTURE_LIGHT_COLOR, GameRenderer::getPositionTexLightmapColorShader);
        UGraphics.DEFAULT_SHADERS.put(VertexFormats.POSITION_TEXTURE_COLOR_NORMAL, GameRenderer::getPositionTexColorNormalShader);
    }
    
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
}
