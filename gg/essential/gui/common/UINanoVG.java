package gg.essential.gui.common;

import kotlin.*;
import gg.essential.util.lwjgl3.api.nanovg.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.shader.*;
import org.lwjgl.opengl.*;
import gg.essential.*;
import gg.essential.universal.*;
import net.minecraft.client.render.*;
import gg.essential.util.lwjgl3.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000(
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0014J(\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020	2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010
                                                   \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH$R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006\u000f""" }, d2 = { "Lgg/essential/gui/common/UINanoVG;", "Lgg/essential/gui/common/UIFrameBuffer;", "()V", "nanoVG", "Lgg/essential/util/lwjgl3/api/nanovg/NanoVG;", "delete", "", "render", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "width", "", "height", "renderVG", "vg", "essential" })
public abstract class UINanoVG extends UIFrameBuffer
{
    @Nullable
    private NanoVG nanoVG;
    
    public UINanoVG() {
        super();
    }
    
    @Override
    public void delete() {
        final NanoVG nanoVG = this.nanoVG;
        if (nanoVG != null) {
            nanoVG.delete();
        }
        this.nanoVG = null;
        super.delete();
    }
    
    @Override
    protected void render(@NotNull final UMatrixStack matrixStack, final float width, final float height) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final BlendState blendState = BlendState.Companion.active();
        final boolean depthState = GL11.glGetBoolean(2929);
        final int activeTexture = UGraphics.getActiveTexture();
        UGraphics.setActiveTexture(activeTexture);
        final int textureState = GL11.glGetInteger(32873);
        NanoVG nanoVG2;
        if ((nanoVG2 = this.nanoVG) == null) {
            final Lwjgl3Loader this_$iv = Essential.getInstance().getLwjgl3();
            final NanoVG value = this_$iv.get(NanoVG.class);
            final NanoVG it = value;
            this.nanoVG = it;
            nanoVG2 = value;
        }
        final NanoVG nanoVG = nanoVG2;
        nanoVG.beginFrame(width, height, (float)(UResolution.getViewportWidth() / UResolution.getWindowWidth()));
        this.renderVG(matrixStack, nanoVG, width, height);
        nanoVG.endFrame();
        UGraphics.tryBlendFuncSeparate(770, 771, 770, 771);
        UGraphics.enableBlend();
        UGraphics.disableDepth();
        BufferRenderer.unbindAll();
        blendState.activate();
        if (depthState) {
            UGraphics.enableDepth();
        }
        else {
            UGraphics.disableDepth();
        }
        GL11.glBindTexture(3553, textureState);
        UGraphics.setActiveTexture(activeTexture);
    }
    
    protected abstract void renderVG(@NotNull final UMatrixStack p0, @NotNull final NanoVG p1, final float p2, final float p3);
}
