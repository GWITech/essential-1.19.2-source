package gg.essential.elementa.font.data;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006)" }, d2 = { "Lgg/essential/elementa/font/data/Atlas;", "", "type", "", "distanceRange", "", "size", "width", "height", "yOrigin", "baseCharHeight", "belowLineHeight", "shadowHeight", "(Ljava/lang/String;FFFFLjava/lang/String;FFF)V", "getBaseCharHeight", "()F", "getBelowLineHeight", "getDistanceRange", "getHeight", "getShadowHeight", "getSize", "getType", "()Ljava/lang/String;", "getWidth", "getYOrigin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Elementa" })
public final class Atlas
{
    @NotNull
    private final String type;
    private final float distanceRange;
    private final float size;
    private final float width;
    private final float height;
    @NotNull
    private final String yOrigin;
    private final float baseCharHeight;
    private final float belowLineHeight;
    private final float shadowHeight;
    
    public Atlas(@NotNull final String type, final float distanceRange, final float size, final float width, final float height, @NotNull final String yOrigin, final float baseCharHeight, final float belowLineHeight, final float shadowHeight) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)yOrigin, "yOrigin");
        super();
        this.type = type;
        this.distanceRange = distanceRange;
        this.size = size;
        this.width = width;
        this.height = height;
        this.yOrigin = yOrigin;
        this.baseCharHeight = baseCharHeight;
        this.belowLineHeight = belowLineHeight;
        this.shadowHeight = shadowHeight;
    }
    
    @NotNull
    public final String getType() {
        return this.type;
    }
    
    public final float getDistanceRange() {
        return this.distanceRange;
    }
    
    public final float getSize() {
        return this.size;
    }
    
    public final float getWidth() {
        return this.width;
    }
    
    public final float getHeight() {
        return this.height;
    }
    
    @NotNull
    public final String getYOrigin() {
        return this.yOrigin;
    }
    
    public final float getBaseCharHeight() {
        return this.baseCharHeight;
    }
    
    public final float getBelowLineHeight() {
        return this.belowLineHeight;
    }
    
    public final float getShadowHeight() {
        return this.shadowHeight;
    }
    
    @NotNull
    public final String component1() {
        return this.type;
    }
    
    public final float component2() {
        return this.distanceRange;
    }
    
    public final float component3() {
        return this.size;
    }
    
    public final float component4() {
        return this.width;
    }
    
    public final float component5() {
        return this.height;
    }
    
    @NotNull
    public final String component6() {
        return this.yOrigin;
    }
    
    public final float component7() {
        return this.baseCharHeight;
    }
    
    public final float component8() {
        return this.belowLineHeight;
    }
    
    public final float component9() {
        return this.shadowHeight;
    }
    
    @NotNull
    public final Atlas copy(@NotNull final String type, final float distanceRange, final float size, final float width, final float height, @NotNull final String yOrigin, final float baseCharHeight, final float belowLineHeight, final float shadowHeight) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)yOrigin, "yOrigin");
        return new Atlas(type, distanceRange, size, width, height, yOrigin, baseCharHeight, belowLineHeight, shadowHeight);
    }
    
    public static /* synthetic */ Atlas copy$default(final Atlas atlas, String type, float distanceRange, float size, float width, float height, String yOrigin, float baseCharHeight, float belowLineHeight, float shadowHeight, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            type = atlas.type;
        }
        if ((n & 0x2) != 0x0) {
            distanceRange = atlas.distanceRange;
        }
        if ((n & 0x4) != 0x0) {
            size = atlas.size;
        }
        if ((n & 0x8) != 0x0) {
            width = atlas.width;
        }
        if ((n & 0x10) != 0x0) {
            height = atlas.height;
        }
        if ((n & 0x20) != 0x0) {
            yOrigin = atlas.yOrigin;
        }
        if ((n & 0x40) != 0x0) {
            baseCharHeight = atlas.baseCharHeight;
        }
        if ((n & 0x80) != 0x0) {
            belowLineHeight = atlas.belowLineHeight;
        }
        if ((n & 0x100) != 0x0) {
            shadowHeight = atlas.shadowHeight;
        }
        return atlas.copy(type, distanceRange, size, width, height, yOrigin, baseCharHeight, belowLineHeight, shadowHeight);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Atlas(type=" + this.type + ", distanceRange=" + this.distanceRange + ", size=" + this.size + ", width=" + this.width + ", height=" + this.height + ", yOrigin=" + this.yOrigin + ", baseCharHeight=" + this.baseCharHeight + ", belowLineHeight=" + this.belowLineHeight + ", shadowHeight=" + this.shadowHeight + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.type.hashCode();
        result = result * 31 + Float.hashCode(this.distanceRange);
        result = result * 31 + Float.hashCode(this.size);
        result = result * 31 + Float.hashCode(this.width);
        result = result * 31 + Float.hashCode(this.height);
        result = result * 31 + this.yOrigin.hashCode();
        result = result * 31 + Float.hashCode(this.baseCharHeight);
        result = result * 31 + Float.hashCode(this.belowLineHeight);
        result = result * 31 + Float.hashCode(this.shadowHeight);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Atlas)) {
            return false;
        }
        final Atlas atlas = (Atlas)other;
        return Intrinsics.areEqual((Object)this.type, (Object)atlas.type) && Intrinsics.areEqual((Object)this.distanceRange, (Object)atlas.distanceRange) && Intrinsics.areEqual((Object)this.size, (Object)atlas.size) && Intrinsics.areEqual((Object)this.width, (Object)atlas.width) && Intrinsics.areEqual((Object)this.height, (Object)atlas.height) && Intrinsics.areEqual((Object)this.yOrigin, (Object)atlas.yOrigin) && Intrinsics.areEqual((Object)this.baseCharHeight, (Object)atlas.baseCharHeight) && Intrinsics.areEqual((Object)this.belowLineHeight, (Object)atlas.belowLineHeight) && Intrinsics.areEqual((Object)this.shadowHeight, (Object)atlas.shadowHeight);
    }
}
