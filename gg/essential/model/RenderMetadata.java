package gg.essential.model;

import kotlin.*;
import gg.essential.model.backend.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r¢\u0006\u0002\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\tH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J\t\u0010/\u001a\u00020\u0013H\u00c6\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\rH\u00c6\u0003J{\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\rH\u00c6\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\u0007H\u00d6\u0001J\t\u00106\u001a\u00020\u000eH\u00d6\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00067" }, d2 = { "Lgg/essential/model/RenderMetadata;", "", "pose", "Lgg/essential/model/backend/PlayerPose;", "skin", "Lgg/essential/model/backend/RenderBackend$Texture;", "light", "", "scale", "", "side", "Lgg/essential/model/Side;", "hiddenBones", "", "", "renderExclusion", "", "Lgg/essential/model/Box3;", "positionAdjustment", "Lgg/essential/model/Vector3;", "parts", "Lgg/essential/model/EnumPart;", "(Lgg/essential/model/backend/PlayerPose;Lgg/essential/model/backend/RenderBackend$Texture;IFLgg/essential/model/Side;Ljava/util/Set;Ljava/util/List;Lgg/essential/model/Vector3;Ljava/util/Set;)V", "getHiddenBones", "()Ljava/util/Set;", "getLight", "()I", "getParts", "getPose", "()Lgg/essential/model/backend/PlayerPose;", "getPositionAdjustment", "()Lgg/essential/model/Vector3;", "getRenderExclusion", "()Ljava/util/List;", "getScale", "()F", "getSide", "()Lgg/essential/model/Side;", "getSkin", "()Lgg/essential/model/backend/RenderBackend$Texture;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "cosmetics" })
public final class RenderMetadata
{
    @Nullable
    private final PlayerPose pose;
    @NotNull
    private final RenderBackend.Texture skin;
    private final int light;
    private final float scale;
    @Nullable
    private final Side side;
    @NotNull
    private final Set<String> hiddenBones;
    @NotNull
    private final List<Box3> renderExclusion;
    @NotNull
    private final Vector3 positionAdjustment;
    @Nullable
    private final Set<EnumPart> parts;
    
    public RenderMetadata(@Nullable final PlayerPose pose, @NotNull final RenderBackend.Texture skin, final int light, final float scale, @Nullable final Side side, @NotNull final Set<String> hiddenBones, @NotNull final List<Box3> renderExclusion, @NotNull final Vector3 positionAdjustment, @Nullable final Set<? extends EnumPart> parts) {
        Intrinsics.checkNotNullParameter((Object)skin, "skin");
        Intrinsics.checkNotNullParameter((Object)hiddenBones, "hiddenBones");
        Intrinsics.checkNotNullParameter((Object)renderExclusion, "renderExclusion");
        Intrinsics.checkNotNullParameter((Object)positionAdjustment, "positionAdjustment");
        super();
        this.pose = pose;
        this.skin = skin;
        this.light = light;
        this.scale = scale;
        this.side = side;
        this.hiddenBones = hiddenBones;
        this.renderExclusion = renderExclusion;
        this.positionAdjustment = positionAdjustment;
        this.parts = (Set<EnumPart>)parts;
    }
    
    @Nullable
    public final PlayerPose getPose() {
        return this.pose;
    }
    
    @NotNull
    public final RenderBackend.Texture getSkin() {
        return this.skin;
    }
    
    public final int getLight() {
        return this.light;
    }
    
    public final float getScale() {
        return this.scale;
    }
    
    @Nullable
    public final Side getSide() {
        return this.side;
    }
    
    @NotNull
    public final Set<String> getHiddenBones() {
        return this.hiddenBones;
    }
    
    @NotNull
    public final List<Box3> getRenderExclusion() {
        return this.renderExclusion;
    }
    
    @NotNull
    public final Vector3 getPositionAdjustment() {
        return this.positionAdjustment;
    }
    
    @Nullable
    public final Set<EnumPart> getParts() {
        return this.parts;
    }
    
    @NotNull
    public final RenderMetadata copy(@Nullable final PlayerPose pose, @NotNull final RenderBackend.Texture skin, final int light, final float scale, @Nullable final Side side, @NotNull final Set<String> hiddenBones, @NotNull final List<Box3> renderExclusion, @NotNull final Vector3 positionAdjustment, @Nullable final Set<? extends EnumPart> parts) {
        Intrinsics.checkNotNullParameter((Object)skin, "skin");
        Intrinsics.checkNotNullParameter((Object)hiddenBones, "hiddenBones");
        Intrinsics.checkNotNullParameter((Object)renderExclusion, "renderExclusion");
        Intrinsics.checkNotNullParameter((Object)positionAdjustment, "positionAdjustment");
        return new RenderMetadata(pose, skin, light, scale, side, hiddenBones, renderExclusion, positionAdjustment, parts);
    }
    
    public static /* synthetic */ RenderMetadata copy$default$613085e4$5fc78fc0(final RenderMetadata renderMetadata, final RenderBackend.Texture skin) {
        return renderMetadata.copy(renderMetadata.pose, skin, renderMetadata.light, renderMetadata.scale, renderMetadata.side, renderMetadata.hiddenBones, renderMetadata.renderExclusion, renderMetadata.positionAdjustment, renderMetadata.parts);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "RenderMetadata(pose=" + this.pose + ", skin=" + this.skin + ", light=" + this.light + ", scale=" + this.scale + ", side=" + this.side + ", hiddenBones=" + this.hiddenBones + ", renderExclusion=" + this.renderExclusion + ", positionAdjustment=" + this.positionAdjustment + ", parts=" + this.parts + ')';
    }
    
    @Override
    public int hashCode() {
        int result = (this.pose == null) ? 0 : this.pose.hashCode();
        result = result * 31 + this.skin.hashCode();
        result = result * 31 + Integer.hashCode(this.light);
        result = result * 31 + Float.hashCode(this.scale);
        result = result * 31 + ((this.side == null) ? 0 : this.side.hashCode());
        result = result * 31 + this.hiddenBones.hashCode();
        result = result * 31 + this.renderExclusion.hashCode();
        result = result * 31 + this.positionAdjustment.hashCode();
        result = result * 31 + ((this.parts == null) ? 0 : this.parts.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderMetadata)) {
            return false;
        }
        final RenderMetadata renderMetadata = (RenderMetadata)other;
        return Intrinsics.areEqual((Object)this.pose, (Object)renderMetadata.pose) && Intrinsics.areEqual((Object)this.skin, (Object)renderMetadata.skin) && this.light == renderMetadata.light && Intrinsics.areEqual((Object)this.scale, (Object)renderMetadata.scale) && this.side == renderMetadata.side && Intrinsics.areEqual((Object)this.hiddenBones, (Object)renderMetadata.hiddenBones) && Intrinsics.areEqual((Object)this.renderExclusion, (Object)renderMetadata.renderExclusion) && Intrinsics.areEqual((Object)this.positionAdjustment, (Object)renderMetadata.positionAdjustment) && Intrinsics.areEqual((Object)this.parts, (Object)renderMetadata.parts);
    }
}
