package gg.essential.cosmetics.boxmask;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.util.*;
import gg.essential.model.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0014" }, d2 = { "Lgg/essential/cosmetics/boxmask/ModelClipperImpl;", "Lgg/essential/cosmetics/boxmask/ModelClipper;", "()V", "apply", "", "bone", "Lgg/essential/model/Bone;", "renderExclusions", "", "Lgg/essential/model/Box3;", "compute", "masks", "generateARegion", "intersectedFace", "Lgg/essential/cosmetics/boxmask/ModelClipperImpl$IntersectedFace;", "minYIntersect", "", "EnumRegion", "FaceRegion", "IntersectedFace", "cosmetics" })
public final class ModelClipperImpl implements ModelClipper
{
    public ModelClipperImpl() {
        super();
    }
    
    @NotNull
    @Override
    public Bone compute(@NotNull final Bone bone, @NotNull final List<Box3> masks) {
        Intrinsics.checkNotNullParameter((Object)bone, "bone");
        Intrinsics.checkNotNullParameter((Object)masks, "masks");
        if (masks.isEmpty()) {
            return bone;
        }
        final Bone modifiedBone = bone.deepCopy();
        this.apply(modifiedBone, masks);
        return modifiedBone;
    }
    
    private final void apply(final Bone bone, final List<Box3> renderExclusions) {
        for (final Cube cube : bone.cubeList) {
            final Iterator iterator = cube.getQuadList().iterator();
            final List newFaces = new ArrayList();
            while (iterator.hasNext()) {
                final Face next = iterator.next();
                final Box3 selfBox = new Box3((byte)0);
                final PositionTexVertex[] vertices = next.vertexPositions;
                final Vector3 a = vertices[0].vector3.clone();
                final Vector3 b = vertices[1].vector3.clone();
                final Vector3 c = vertices[2].vector3.clone();
                final Vector3 d = vertices[3].vector3.clone();
                selfBox.setFromPoints(CollectionsKt.listOf((Object[])new Vector3[] { a, b, c, d }));
                boolean matched = false;
                final ModelClipperImpl.IntersectedFace intersectedFace = new ModelClipperImpl.IntersectedFace(next);
                for (final Box3 exclusion : renderExclusions) {
                    final Box3 intersect = selfBox.clone().intersect(exclusion);
                    if (Intrinsics.areEqual((Object)intersect, (Object)selfBox)) {
                        iterator.remove();
                        matched = false;
                        break;
                    }
                    if (intersect.isEmpty()) {
                        continue;
                    }
                    matched = true;
                    final float xHeight = intersect.getMax().x - intersect.getMin().x;
                    final float zHeight = intersect.getMax().z - intersect.getMin().z;
                    final float minYIntersect = Math.min(intersect.getMin().y, intersectedFace.getARegion().getPoints()[3].vector3.y);
                    if (xHeight == 0.0f) {
                        this.generateARegion(intersectedFace, minYIntersect);
                    }
                    else {
                        if (zHeight != 0.0f) {
                            continue;
                        }
                        this.generateARegion(intersectedFace, minYIntersect);
                    }
                }
                if (matched) {
                    iterator.remove();
                    newFaces.addAll(intersectedFace.generateFaces());
                }
            }
            cube.getQuadList().addAll(newFaces);
        }
        for (final Bone childModel : bone.childModels) {
            this.apply(childModel, renderExclusions);
        }
    }
    
    private final void generateARegion(final ModelClipperImpl.IntersectedFace intersectedFace, final float minYIntersect) {
        intersectedFace.getARegion().getPoints()[2].vector3.y = minYIntersect;
        intersectedFace.getARegion().getPoints()[3].vector3.y = minYIntersect;
        final float texY = intersectedFace.getARegion().getPoints()[1].texturePositionY + (minYIntersect - intersectedFace.getARegion().getPoints()[0].vector3.y) / intersectedFace.getARegion().getSpacialYDistance() * intersectedFace.getARegion().getTextureYDistance();
        intersectedFace.getARegion().getPoints()[2].texturePositionY = texY;
        intersectedFace.getARegion().getPoints()[3].texturePositionY = texY;
    }
}
