package gg.essential.elementa.markdown;

import kotlin.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d" }, d2 = { "Lgg/essential/elementa/markdown/ParagraphConfig;", "", "spaceBetweenLines", "", "spaceBefore", "spaceAfter", "softBreakIsNewline", "", "centered", "(FFFZZ)V", "getCentered", "()Z", "getSoftBreakIsNewline", "getSpaceAfter", "()F", "getSpaceBefore", "getSpaceBetweenLines", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "Elementa" })
public final class ParagraphConfig
{
    private final float spaceBetweenLines;
    private final float spaceBefore;
    private final float spaceAfter;
    private final boolean softBreakIsNewline;
    private final boolean centered;
    
    @JvmOverloads
    public ParagraphConfig(final float spaceBetweenLines, final float spaceBefore, final float spaceAfter, final boolean softBreakIsNewline, final boolean centered) {
        super();
        this.spaceBetweenLines = spaceBetweenLines;
        this.spaceBefore = spaceBefore;
        this.spaceAfter = spaceAfter;
        this.softBreakIsNewline = softBreakIsNewline;
        this.centered = centered;
    }
    
    public ParagraphConfig(float spaceBetweenLines, float spaceBefore, float spaceAfter, boolean softBreakIsNewline, boolean centered, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            spaceBetweenLines = 4.0f;
        }
        if ((n & 0x2) != 0x0) {
            spaceBefore = 5.0f;
        }
        if ((n & 0x4) != 0x0) {
            spaceAfter = 5.0f;
        }
        if ((n & 0x8) != 0x0) {
            softBreakIsNewline = false;
        }
        if ((n & 0x10) != 0x0) {
            centered = false;
        }
        this(spaceBetweenLines, spaceBefore, spaceAfter, softBreakIsNewline, centered);
    }
    
    public final float getSpaceBetweenLines() {
        return this.spaceBetweenLines;
    }
    
    public final float getSpaceBefore() {
        return this.spaceBefore;
    }
    
    public final float getSpaceAfter() {
        return this.spaceAfter;
    }
    
    public final boolean getSoftBreakIsNewline() {
        return this.softBreakIsNewline;
    }
    
    public final boolean getCentered() {
        return this.centered;
    }
    
    public final float component1() {
        return this.spaceBetweenLines;
    }
    
    public final float component2() {
        return this.spaceBefore;
    }
    
    public final float component3() {
        return this.spaceAfter;
    }
    
    public final boolean component4() {
        return this.softBreakIsNewline;
    }
    
    public final boolean component5() {
        return this.centered;
    }
    
    @NotNull
    public final ParagraphConfig copy(final float spaceBetweenLines, final float spaceBefore, final float spaceAfter, final boolean softBreakIsNewline, final boolean centered) {
        return new ParagraphConfig(spaceBetweenLines, spaceBefore, spaceAfter, softBreakIsNewline, centered);
    }
    
    public static /* synthetic */ ParagraphConfig copy$default(final ParagraphConfig paragraphConfig, float spaceBetweenLines, float spaceBefore, float spaceAfter, boolean softBreakIsNewline, boolean centered, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            spaceBetweenLines = paragraphConfig.spaceBetweenLines;
        }
        if ((n & 0x2) != 0x0) {
            spaceBefore = paragraphConfig.spaceBefore;
        }
        if ((n & 0x4) != 0x0) {
            spaceAfter = paragraphConfig.spaceAfter;
        }
        if ((n & 0x8) != 0x0) {
            softBreakIsNewline = paragraphConfig.softBreakIsNewline;
        }
        if ((n & 0x10) != 0x0) {
            centered = paragraphConfig.centered;
        }
        return paragraphConfig.copy(spaceBetweenLines, spaceBefore, spaceAfter, softBreakIsNewline, centered);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ParagraphConfig(spaceBetweenLines=" + this.spaceBetweenLines + ", spaceBefore=" + this.spaceBefore + ", spaceAfter=" + this.spaceAfter + ", softBreakIsNewline=" + this.softBreakIsNewline + ", centered=" + this.centered + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Float.hashCode(this.spaceBetweenLines);
        result = result * 31 + Float.hashCode(this.spaceBefore);
        result = result * 31 + Float.hashCode(this.spaceAfter);
        final int n = result * 31;
        int softBreakIsNewline;
        if ((softBreakIsNewline = (this.softBreakIsNewline ? 1 : 0)) != 0) {
            softBreakIsNewline = 1;
        }
        result = n + softBreakIsNewline;
        final int n2 = result * 31;
        int centered;
        if ((centered = (this.centered ? 1 : 0)) != 0) {
            centered = 1;
        }
        result = n2 + centered;
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphConfig)) {
            return false;
        }
        final ParagraphConfig paragraphConfig = (ParagraphConfig)other;
        return Intrinsics.areEqual((Object)this.spaceBetweenLines, (Object)paragraphConfig.spaceBetweenLines) && Intrinsics.areEqual((Object)this.spaceBefore, (Object)paragraphConfig.spaceBefore) && Intrinsics.areEqual((Object)this.spaceAfter, (Object)paragraphConfig.spaceAfter) && this.softBreakIsNewline == paragraphConfig.softBreakIsNewline && this.centered == paragraphConfig.centered;
    }
    
    @JvmOverloads
    public ParagraphConfig(final float spaceBetweenLines, final float spaceBefore, final float spaceAfter, final boolean softBreakIsNewline) {
        this(spaceBetweenLines, spaceBefore, spaceAfter, softBreakIsNewline, false, 16, null);
    }
    
    @JvmOverloads
    public ParagraphConfig(final float spaceBetweenLines, final float spaceBefore, final float spaceAfter) {
        this(spaceBetweenLines, spaceBefore, spaceAfter, false, false, 24, null);
    }
    
    @JvmOverloads
    public ParagraphConfig(final float spaceBetweenLines, final float spaceBefore) {
        this(spaceBetweenLines, spaceBefore, 0.0f, false, false, 28, null);
    }
    
    @JvmOverloads
    public ParagraphConfig(final float spaceBetweenLines) {
        this(spaceBetweenLines, 0.0f, 0.0f, false, false, 30, null);
    }
    
    @JvmOverloads
    public ParagraphConfig() {
        this(0.0f, 0.0f, 0.0f, false, false, 31, null);
    }
}
