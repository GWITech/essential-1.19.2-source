package gg.essential.elementa.font.data;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013" }, d2 = { "Lgg/essential/elementa/font/data/Glyph;", "", "unicode", "", "advance", "", "planeBounds", "Lgg/essential/elementa/font/data/PlaneBounds;", "atlasBounds", "Lgg/essential/elementa/font/data/AtlasBounds;", "(IFLgg/essential/elementa/font/data/PlaneBounds;Lgg/essential/elementa/font/data/AtlasBounds;)V", "getAdvance", "()F", "getAtlasBounds", "()Lgg/essential/elementa/font/data/AtlasBounds;", "getPlaneBounds", "()Lgg/essential/elementa/font/data/PlaneBounds;", "getUnicode", "()I", "Elementa" })
public final class Glyph
{
    private final int unicode;
    private final float advance;
    @Nullable
    private final PlaneBounds planeBounds;
    @Nullable
    private final AtlasBounds atlasBounds;
    
    public Glyph(final int unicode, final float advance, @Nullable final PlaneBounds planeBounds, @Nullable final AtlasBounds atlasBounds) {
        super();
        this.unicode = unicode;
        this.advance = advance;
        this.planeBounds = planeBounds;
        this.atlasBounds = atlasBounds;
    }
    
    public Glyph(final int unicode, final float advance, PlaneBounds planeBounds, AtlasBounds atlasBounds, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x4) != 0x0) {
            planeBounds = null;
        }
        if ((n & 0x8) != 0x0) {
            atlasBounds = null;
        }
        this(unicode, advance, planeBounds, atlasBounds);
    }
    
    public final int getUnicode() {
        return this.unicode;
    }
    
    public final float getAdvance() {
        return this.advance;
    }
    
    @Nullable
    public final PlaneBounds getPlaneBounds() {
        return this.planeBounds;
    }
    
    @Nullable
    public final AtlasBounds getAtlasBounds() {
        return this.atlasBounds;
    }
}
