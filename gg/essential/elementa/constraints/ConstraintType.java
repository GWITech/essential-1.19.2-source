package gg.essential.elementa.constraints;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "Lgg/essential/elementa/constraints/ConstraintType;", "", "prettyName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getPrettyName", "()Ljava/lang/String;", "X", "Y", "WIDTH", "HEIGHT", "RADIUS", "COLOR", "FONT_PROVIDER", "TEXT_SCALE", "Elementa" })
public enum ConstraintType
{
    @NotNull
    private final String prettyName;
    
    X("X", 0, "X"), 
    Y("Y", 1, "Y"), 
    WIDTH("WIDTH", 2, "Width"), 
    HEIGHT("HEIGHT", 3, "Height"), 
    RADIUS("RADIUS", 4, "Radius"), 
    COLOR("COLOR", 5, "Color"), 
    FONT_PROVIDER("FONT_PROVIDER", 6, "Font Provider"), 
    TEXT_SCALE("TEXT_SCALE", 7, "TextScale");
    
    private static final /* synthetic */ ConstraintType[] $VALUES;
    
    private ConstraintType(final String $enum$name, final int $enum$ordinal, final String prettyName) {
        this.prettyName = prettyName;
    }
    
    @NotNull
    public final String getPrettyName() {
        return this.prettyName;
    }
    
    public static ConstraintType[] values() {
        return ConstraintType.$VALUES.clone();
    }
    
    public static ConstraintType valueOf(final String value) {
        return Enum.valueOf(ConstraintType.class, value);
    }
    
    private static final /* synthetic */ ConstraintType[] $values() {
        return new ConstraintType[] { ConstraintType.X, ConstraintType.Y, ConstraintType.WIDTH, ConstraintType.HEIGHT, ConstraintType.RADIUS, ConstraintType.COLOR, ConstraintType.FONT_PROVIDER, ConstraintType.TEXT_SCALE };
    }
    
    static {
        $VALUES = $values();
    }
}
