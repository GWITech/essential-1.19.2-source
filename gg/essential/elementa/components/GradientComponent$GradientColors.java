package gg.essential.elementa.components;

import kotlin.*;
import java.awt.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019" }, d2 = { "Lgg/essential/elementa/components/GradientComponent$GradientColors;", "", "topLeft", "Ljava/awt/Color;", "topRight", "bottomLeft", "bottomRight", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", "getBottomLeft", "()Ljava/awt/Color;", "getBottomRight", "getTopLeft", "getTopRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elementa" })
public static final class GradientColors
{
    @NotNull
    private final Color topLeft;
    @NotNull
    private final Color topRight;
    @NotNull
    private final Color bottomLeft;
    @NotNull
    private final Color bottomRight;
    
    public GradientColors(@NotNull final Color topLeft, @NotNull final Color topRight, @NotNull final Color bottomLeft, @NotNull final Color bottomRight) {
        Intrinsics.checkNotNullParameter((Object)topLeft, "topLeft");
        Intrinsics.checkNotNullParameter((Object)topRight, "topRight");
        Intrinsics.checkNotNullParameter((Object)bottomLeft, "bottomLeft");
        Intrinsics.checkNotNullParameter((Object)bottomRight, "bottomRight");
        super();
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
    
    @NotNull
    public final Color getTopLeft() {
        return this.topLeft;
    }
    
    @NotNull
    public final Color getTopRight() {
        return this.topRight;
    }
    
    @NotNull
    public final Color getBottomLeft() {
        return this.bottomLeft;
    }
    
    @NotNull
    public final Color getBottomRight() {
        return this.bottomRight;
    }
    
    @NotNull
    public final Color component1() {
        return this.topLeft;
    }
    
    @NotNull
    public final Color component2() {
        return this.topRight;
    }
    
    @NotNull
    public final Color component3() {
        return this.bottomLeft;
    }
    
    @NotNull
    public final Color component4() {
        return this.bottomRight;
    }
    
    @NotNull
    public final GradientColors copy(@NotNull final Color topLeft, @NotNull final Color topRight, @NotNull final Color bottomLeft, @NotNull final Color bottomRight) {
        Intrinsics.checkNotNullParameter((Object)topLeft, "topLeft");
        Intrinsics.checkNotNullParameter((Object)topRight, "topRight");
        Intrinsics.checkNotNullParameter((Object)bottomLeft, "bottomLeft");
        Intrinsics.checkNotNullParameter((Object)bottomRight, "bottomRight");
        return new GradientColors(topLeft, topRight, bottomLeft, bottomRight);
    }
    
    public static /* synthetic */ GradientColors copy$default(final GradientColors gradientColors, Color topLeft, Color topRight, Color bottomLeft, Color bottomRight, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            topLeft = gradientColors.topLeft;
        }
        if ((n & 0x2) != 0x0) {
            topRight = gradientColors.topRight;
        }
        if ((n & 0x4) != 0x0) {
            bottomLeft = gradientColors.bottomLeft;
        }
        if ((n & 0x8) != 0x0) {
            bottomRight = gradientColors.bottomRight;
        }
        return gradientColors.copy(topLeft, topRight, bottomLeft, bottomRight);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "GradientColors(topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ", bottomRight=" + this.bottomRight + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.topLeft.hashCode();
        result = result * 31 + this.topRight.hashCode();
        result = result * 31 + this.bottomLeft.hashCode();
        result = result * 31 + this.bottomRight.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientColors)) {
            return false;
        }
        final GradientColors gradientColors = (GradientColors)other;
        return Intrinsics.areEqual((Object)this.topLeft, (Object)gradientColors.topLeft) && Intrinsics.areEqual((Object)this.topRight, (Object)gradientColors.topRight) && Intrinsics.areEqual((Object)this.bottomLeft, (Object)gradientColors.bottomLeft) && Intrinsics.areEqual((Object)this.bottomRight, (Object)gradientColors.bottomRight);
    }
}
