package gg.essential.gui.screenshot.editor;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B3\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010
                                                   R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010
                                                   R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\r\u0010
                                                   R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000e\u0010
                                                   j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017""" }, d2 = { "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;", "", "alignOpX", "", "alignOpY", "centerX", "centerY", "corner", "(Ljava/lang/String;IZZZZZ)V", "getAlignOpX", "()Z", "getAlignOpY", "getCenterX", "getCenterY", "getCorner", "TOP_LEFT", "TOP_CENTER", "TOP_RIGHT", "RIGHT_CENTER", "BOTTOM_RIGHT", "BOTTOM_CENTER", "BOTTOM_LEFT", "LEFT_CENTER", "essential" })
public enum CropAlignment
{
    private final boolean alignOpX;
    private final boolean alignOpY;
    private final boolean centerX;
    private final boolean centerY;
    private final boolean corner;
    
    TOP_LEFT(false, false, false, false, true, 12), 
    TOP_CENTER(false, false, true, false, false, 8), 
    TOP_RIGHT(true, false, false, false, true, 12), 
    RIGHT_CENTER(true, false, false, true, false, 4), 
    BOTTOM_RIGHT(true, true, false, false, true, 12), 
    BOTTOM_CENTER(false, true, true, false, false, 8), 
    BOTTOM_LEFT(false, true, false, false, true, 12), 
    LEFT_CENTER(false, false, false, true, false, 4);
    
    private static final /* synthetic */ CropAlignment[] $VALUES;
    
    private CropAlignment(final String $enum$name, final int $enum$ordinal, final boolean alignOpX, final boolean alignOpY, final boolean centerX, final boolean centerY, final boolean corner) {
        this.alignOpX = alignOpX;
        this.alignOpY = alignOpY;
        this.centerX = centerX;
        this.centerY = centerY;
        this.corner = corner;
    }
    
    CropAlignment(final String $enum$name, final int $enum$ordinal, final boolean alignOpX, final boolean alignOpY, boolean centerX, boolean centerY, final boolean corner, final int n) {
        if ((n & 0x4) != 0x0) {
            centerX = false;
        }
        if ((n & 0x8) != 0x0) {
            centerY = false;
        }
        this($enum$name, $enum$ordinal, alignOpX, alignOpY, centerX, centerY, corner);
    }
    
    public final boolean getAlignOpX() {
        return this.alignOpX;
    }
    
    public final boolean getAlignOpY() {
        return this.alignOpY;
    }
    
    public final boolean getCenterX() {
        return this.centerX;
    }
    
    public final boolean getCenterY() {
        return this.centerY;
    }
    
    public final boolean getCorner() {
        return this.corner;
    }
    
    public static CropAlignment[] values() {
        return CropAlignment.$VALUES.clone();
    }
    
    public static CropAlignment valueOf(final String value) {
        return Enum.valueOf(CropAlignment.class, value);
    }
    
    private static final /* synthetic */ CropAlignment[] $values() {
        return new CropAlignment[] { CropAlignment.TOP_LEFT, CropAlignment.TOP_CENTER, CropAlignment.TOP_RIGHT, CropAlignment.RIGHT_CENTER, CropAlignment.BOTTOM_RIGHT, CropAlignment.BOTTOM_CENTER, CropAlignment.BOTTOM_LEFT, CropAlignment.LEFT_CENTER };
    }
    
    static {
        $VALUES = $values();
    }
}
