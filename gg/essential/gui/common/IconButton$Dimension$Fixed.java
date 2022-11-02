package gg.essential.gui.common;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000*
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b	
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J	\u0010	\u001a\u00020\u0003H\u00c6\u0003J	\u0010
                                                   \u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J	\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J	\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014""" }, d2 = { "Lgg/essential/gui/common/IconButton$Dimension$Fixed;", "Lgg/essential/gui/common/IconButton$Dimension;", "width", "", "height", "(FF)V", "getHeight", "()F", "getWidth", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "essential" })
public static final class Fixed extends Dimension
{
    private final float width;
    private final float height;
    
    public Fixed(final float width, final float height) {
        super((byte)0);
        this.width = width;
        this.height = 17.0f;
    }
    
    public final float getWidth() {
        return this.width;
    }
    
    public final float getHeight() {
        return this.height;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Fixed(width=" + this.width + ", height=" + this.height;
    }
    
    @Override
    public int hashCode() {
        int result = Float.hashCode(this.width);
        result = result * 31 + Float.hashCode(this.height);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fixed)) {
            return false;
        }
        final Fixed fixed = (Fixed)other;
        return Intrinsics.areEqual((Object)this.width, (Object)fixed.width) && Intrinsics.areEqual((Object)this.height, (Object)fixed.height);
    }
}
