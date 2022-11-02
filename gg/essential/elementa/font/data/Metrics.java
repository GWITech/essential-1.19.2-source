package gg.essential.elementa.font.data;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c" }, d2 = { "Lgg/essential/elementa/font/data/Metrics;", "", "lineHeight", "", "ascender", "descender", "underlineY", "underlineThickness", "(FFFFF)V", "getAscender", "()F", "getDescender", "getLineHeight", "getUnderlineThickness", "getUnderlineY", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elementa" })
public final class Metrics
{
    private final float lineHeight;
    private final float ascender;
    private final float descender;
    private final float underlineY;
    private final float underlineThickness;
    
    public Metrics(final float lineHeight, final float ascender, final float descender, final float underlineY, final float underlineThickness) {
        super();
        this.lineHeight = lineHeight;
        this.ascender = ascender;
        this.descender = descender;
        this.underlineY = underlineY;
        this.underlineThickness = underlineThickness;
    }
    
    public final float getLineHeight() {
        return this.lineHeight;
    }
    
    public final float getAscender() {
        return this.ascender;
    }
    
    public final float getDescender() {
        return this.descender;
    }
    
    public final float getUnderlineY() {
        return this.underlineY;
    }
    
    public final float getUnderlineThickness() {
        return this.underlineThickness;
    }
    
    public final float component1() {
        return this.lineHeight;
    }
    
    public final float component2() {
        return this.ascender;
    }
    
    public final float component3() {
        return this.descender;
    }
    
    public final float component4() {
        return this.underlineY;
    }
    
    public final float component5() {
        return this.underlineThickness;
    }
    
    @NotNull
    public final Metrics copy(final float lineHeight, final float ascender, final float descender, final float underlineY, final float underlineThickness) {
        return new Metrics(lineHeight, ascender, descender, underlineY, underlineThickness);
    }
    
    public static /* synthetic */ Metrics copy$default(final Metrics metrics, float lineHeight, float ascender, float descender, float underlineY, float underlineThickness, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            lineHeight = metrics.lineHeight;
        }
        if ((n & 0x2) != 0x0) {
            ascender = metrics.ascender;
        }
        if ((n & 0x4) != 0x0) {
            descender = metrics.descender;
        }
        if ((n & 0x8) != 0x0) {
            underlineY = metrics.underlineY;
        }
        if ((n & 0x10) != 0x0) {
            underlineThickness = metrics.underlineThickness;
        }
        return metrics.copy(lineHeight, ascender, descender, underlineY, underlineThickness);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Metrics(lineHeight=" + this.lineHeight + ", ascender=" + this.ascender + ", descender=" + this.descender + ", underlineY=" + this.underlineY + ", underlineThickness=" + this.underlineThickness + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Float.hashCode(this.lineHeight);
        result = result * 31 + Float.hashCode(this.ascender);
        result = result * 31 + Float.hashCode(this.descender);
        result = result * 31 + Float.hashCode(this.underlineY);
        result = result * 31 + Float.hashCode(this.underlineThickness);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Metrics)) {
            return false;
        }
        final Metrics metrics = (Metrics)other;
        return Intrinsics.areEqual((Object)this.lineHeight, (Object)metrics.lineHeight) && Intrinsics.areEqual((Object)this.ascender, (Object)metrics.ascender) && Intrinsics.areEqual((Object)this.descender, (Object)metrics.descender) && Intrinsics.areEqual((Object)this.underlineY, (Object)metrics.underlineY) && Intrinsics.areEqual((Object)this.underlineThickness, (Object)metrics.underlineThickness);
    }
}
