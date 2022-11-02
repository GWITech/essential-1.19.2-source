package gg.essential.elementa.markdown;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013" }, d2 = { "Lgg/essential/elementa/markdown/MarkdownComponent$ConstraintValues;", "", "width", "", "textScale", "(FF)V", "getTextScale", "()F", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elementa" })
public static final class ConstraintValues
{
    private final float width;
    private final float textScale;
    
    public ConstraintValues(final float width, final float textScale) {
        super();
        this.width = width;
        this.textScale = textScale;
    }
    
    public final float getWidth() {
        return this.width;
    }
    
    public final float getTextScale() {
        return this.textScale;
    }
    
    public final float component1() {
        return this.width;
    }
    
    public final float component2() {
        return this.textScale;
    }
    
    @NotNull
    public final ConstraintValues copy(final float width, final float textScale) {
        return new ConstraintValues(width, textScale);
    }
    
    public static /* synthetic */ ConstraintValues copy$default(final ConstraintValues constraintValues, float width, float textScale, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            width = constraintValues.width;
        }
        if ((n & 0x2) != 0x0) {
            textScale = constraintValues.textScale;
        }
        return constraintValues.copy(width, textScale);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ConstraintValues(width=" + this.width + ", textScale=" + this.textScale + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Float.hashCode(this.width);
        result = result * 31 + Float.hashCode(this.textScale);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConstraintValues)) {
            return false;
        }
        final ConstraintValues constraintValues = (ConstraintValues)other;
        return Intrinsics.areEqual((Object)this.width, (Object)constraintValues.width) && Intrinsics.areEqual((Object)this.textScale, (Object)constraintValues.textScale);
    }
}
