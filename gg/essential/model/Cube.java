package gg.essential.model;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.model.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B_\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010BY\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013B\u0015\b\u0016\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\u0010\u0017Bi\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0018J\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001604J.\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010\u0002\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u0005J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010\u001aR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001a\u0010'\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001a\u0010*\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001a\u0010-\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\u001a\u00100\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\u001604X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@" }, d2 = { "Lgg/essential/model/Cube;", "", "renderer", "Lgg/essential/model/Bone;", "texU", "", "texV", "x", "y", "z", "dx", "dy", "dz", "delta", "mirror", "", "(Lgg/essential/model/Bone;FFFFFFFFFZ)V", "uvData", "Lgg/essential/model/CubeUvData;", "(Lgg/essential/model/Bone;FFFFFFFZLgg/essential/model/CubeUvData;)V", "precomputedFaces", "", "Lgg/essential/model/Face;", "(Ljava/util/List;)V", "(Lgg/essential/model/Bone;FFFFFFFZFFLgg/essential/model/CubeUvData;)V", "boxName", "", "getBoxName", "()Ljava/lang/String;", "setBoxName", "(Ljava/lang/String;)V", "posX1", "getPosX1", "()F", "setPosX1", "(F)V", "posX2", "getPosX2", "setPosX2", "posY1", "getPosY1", "setPosY1", "posY2", "getPosY2", "setPosY2", "posZ1", "getPosZ1", "setPosZ1", "posZ2", "getPosZ2", "setPosZ2", "quadList", "", "getQuadList", "render", "", "matrixStack", "Lgg/essential/model/util/UMatrixStack;", "Lgg/essential/model/util/UVertexConsumer;", "light", "", "scale", "verticalUVOffset", "name", "cosmetics" })
public final class Cube
{
    @NotNull
    private final List<Face> quadList;
    
    public Cube(@NotNull final Bone renderer, final float texU, final float texV, final float x, final float y, final float z, final float dx, final float dy, final float dz, final float delta, final boolean mirror) {
        Intrinsics.checkNotNullParameter((Object)renderer, "renderer");
        this(renderer, x, y, z, dx, dy, dz, delta, mirror, texU, texV, null);
    }
    
    public Cube(@NotNull final Bone renderer, final float x, final float y, final float z, final float dx, final float dy, final float dz, final float delta, final boolean mirror, @Nullable final CubeUvData uvData) {
        Intrinsics.checkNotNullParameter((Object)renderer, "renderer");
        this(renderer, x, y, z, dx, dy, dz, delta, mirror, 0.0f, 0.0f, uvData);
    }
    
    public Cube(@NotNull final List<Face> precomputedFaces) {
        Intrinsics.checkNotNullParameter((Object)precomputedFaces, "precomputedFaces");
        super();
        (this.quadList = new ArrayList<Face>()).addAll(precomputedFaces);
    }
    
    private Cube(final Bone renderer, final float x, final float y, final float z, final float dx, final float dy, final float dz, final float delta, final boolean mirror, final float texU, final float texV, final CubeUvData uvData) {
        super();
        this.quadList = new ArrayList<Face>();
        float x2 = x;
        float y2 = y;
        float z2 = z;
        float x3 = x2 + dx;
        float y3 = y2 + dy;
        float z3 = z2 + dz;
        x2 -= delta;
        y2 -= delta;
        z2 -= delta;
        x3 += delta;
        y3 += delta;
        z3 += delta;
        if (mirror) {
            final float f3 = x3;
            x3 = x2;
            x2 = f3;
        }
        final PositionTexVertex PositionTexVertex7 = new PositionTexVertex(x2, y2, z2, 0.0f, 0.0f);
        final PositionTexVertex PositionTexVertex8 = new PositionTexVertex(x3, y2, z2, 0.0f, 8.0f);
        final PositionTexVertex PositionTexVertex9 = new PositionTexVertex(x3, y3, z2, 8.0f, 8.0f);
        final PositionTexVertex PositionTexVertex10 = new PositionTexVertex(x2, y3, z2, 8.0f, 0.0f);
        final PositionTexVertex PositionTexVertex11 = new PositionTexVertex(x2, y2, z3, 0.0f, 0.0f);
        final PositionTexVertex PositionTexVertex12 = new PositionTexVertex(x3, y2, z3, 0.0f, 8.0f);
        final PositionTexVertex PositionTexVertex13 = new PositionTexVertex(x3, y3, z3, 8.0f, 8.0f);
        final PositionTexVertex PositionTexVertex14 = new PositionTexVertex(x2, y3, z3, 8.0f, 0.0f);
        final float[] DEFAULT_UV_NORTH = { texU + dz, texV + dz, texU + dz + dx, texV + dz + dy };
        final float[] DEFAULT_UV_EAST = { texU, texV + dz, texU + dz, texV + dz + dy };
        final float[] DEFAULT_UV_SOUTH = { texU + dz + dx + dz, texV + dz, texU + dz + dx + dz + dx, texV + dz + dy };
        final float[] DEFAULT_UV_WEST = { texU + dz + dx, texV + dz, texU + dz + dx + dz, texV + dz + dy };
        final float[] DEFAULT_UV_UP = { texU + dz, texV, texU + dz + dx, texV + dz };
        final float[] DEFAULT_UV_DOWN = { texU + dz + dx, texV + dz, texU + dz + dx + dx, texV };
        float[] north2;
        if (uvData == null || (north2 = uvData.getNorth()) == null) {
            north2 = DEFAULT_UV_NORTH;
        }
        final float[] north = north2;
        float[] east2;
        if (uvData == null || (east2 = uvData.getEast()) == null) {
            east2 = DEFAULT_UV_EAST;
        }
        final float[] east = east2;
        float[] south2;
        if (uvData == null || (south2 = uvData.getSouth()) == null) {
            south2 = DEFAULT_UV_SOUTH;
        }
        final float[] south = south2;
        float[] west2;
        if (uvData == null || (west2 = uvData.getWest()) == null) {
            west2 = DEFAULT_UV_WEST;
        }
        final float[] west = west2;
        float[] up2;
        if (uvData == null || (up2 = uvData.getUp()) == null) {
            up2 = DEFAULT_UV_UP;
        }
        final float[] up = up2;
        float[] down2;
        if (uvData == null || (down2 = uvData.getDown()) == null) {
            down2 = DEFAULT_UV_DOWN;
        }
        final float[] down = down2;
        this.quadList.add(new Face(new PositionTexVertex[] { PositionTexVertex12, PositionTexVertex8, PositionTexVertex9, PositionTexVertex13 }, west[0], west[1], west[2], west[3], (float)renderer.getTextureWidth(), (float)renderer.getTextureHeight()));
        this.quadList.add(new Face(new PositionTexVertex[] { PositionTexVertex7, PositionTexVertex11, PositionTexVertex14, PositionTexVertex10 }, east[0], east[1], east[2], east[3], (float)renderer.getTextureWidth(), (float)renderer.getTextureHeight()));
        this.quadList.add(new Face(new PositionTexVertex[] { PositionTexVertex12, PositionTexVertex11, PositionTexVertex7, PositionTexVertex8 }, up[0], up[1], up[2], up[3], (float)renderer.getTextureWidth(), (float)renderer.getTextureHeight()));
        this.quadList.add(new Face(new PositionTexVertex[] { PositionTexVertex9, PositionTexVertex10, PositionTexVertex14, PositionTexVertex13 }, down[0], down[1], down[2], down[3], (float)renderer.getTextureWidth(), (float)renderer.getTextureHeight()));
        this.quadList.add(new Face(new PositionTexVertex[] { PositionTexVertex8, PositionTexVertex7, PositionTexVertex10, PositionTexVertex9 }, north[0], north[1], north[2], north[3], (float)renderer.getTextureWidth(), (float)renderer.getTextureHeight()));
        this.quadList.add(new Face(new PositionTexVertex[] { PositionTexVertex11, PositionTexVertex12, PositionTexVertex13, PositionTexVertex14 }, south[0], south[1], south[2], south[3], (float)renderer.getTextureWidth(), (float)renderer.getTextureHeight()));
        for (int i = 0; i < 6; ++i) {
            final PositionTexVertex[] vertexPositions = this.quadList.get(i).vertexPositions;
            final PositionTexVertex a = vertexPositions[0];
            final PositionTexVertex b = vertexPositions[1];
            final PositionTexVertex c = vertexPositions[2];
            final PositionTexVertex d = vertexPositions[3];
            this.quadList.add(new Face(new PositionTexVertex[] { b, a, d, c }));
        }
        if (mirror) {
            for (final Face texturedquad : this.quadList) {
                texturedquad.flipFace();
            }
        }
    }
    
    public final void render$55fcef95(@NotNull final UMatrixStack matrixStack, @NotNull final UVertexConsumer renderer, final float scale, final float verticalUVOffset) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)renderer, "renderer");
        for (final Face texturedquad : this.quadList) {
            texturedquad.draw$55fcef95(matrixStack, renderer, scale, verticalUVOffset);
        }
    }
    
    @NotNull
    public final List<Face> getQuadList() {
        return this.quadList;
    }
}
