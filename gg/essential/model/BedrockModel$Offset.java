package gg.essential.model;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011" }, d2 = { "Lgg/essential/model/BedrockModel$Offset;", "", "pivotX", "", "pivotY", "pivotZ", "offsetX", "offsetY", "offsetZ", "(FFFFFF)V", "getOffsetX", "()F", "getOffsetY", "getOffsetZ", "getPivotX", "getPivotY", "getPivotZ", "cosmetics" })
private static final class Offset
{
    private final float pivotX;
    private final float pivotY;
    private final float offsetX;
    private final float offsetY;
    
    public Offset(final float pivotX, final float pivotY, final float offsetX, final float offsetY) {
        super();
        this.pivotX = pivotX;
        this.pivotY = pivotY;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }
    
    public final float getPivotX() {
        return this.pivotX;
    }
    
    public final float getPivotY() {
        return this.pivotY;
    }
    
    public final float getOffsetX() {
        return this.offsetX;
    }
    
    public final float getOffsetY() {
        return this.offsetY;
    }
}
