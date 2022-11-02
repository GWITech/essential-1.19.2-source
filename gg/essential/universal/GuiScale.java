package gg.essential.universal;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006	""" }, d2 = { "Lgg/essential/universal/GuiScale;", "", "(Ljava/lang/String;I)V", "Auto", "Small", "Medium", "Large", "VeryLarge", "Companion", "universalcraft" })
public enum GuiScale
{
    @NotNull
    public static final Companion Companion;
    private static final int guiScaleOverride;
    
    Auto("Auto", 0), 
    Small("Small", 1), 
    Medium("Medium", 2), 
    Large("Large", 3), 
    VeryLarge("VeryLarge", 4);
    
    private static final /* synthetic */ GuiScale[] $VALUES;
    
    private GuiScale(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static GuiScale[] values() {
        return GuiScale.$VALUES.clone();
    }
    
    public static GuiScale valueOf(final String value) {
        return Enum.valueOf(GuiScale.class, value);
    }
    
    private static final /* synthetic */ GuiScale[] $values() {
        return new GuiScale[] { GuiScale.Auto, GuiScale.Small, GuiScale.Medium, GuiScale.Large, GuiScale.VeryLarge };
    }
    
    @JvmStatic
    @NotNull
    public static final GuiScale fromNumber(final int number) {
        return GuiScale.Companion.fromNumber(number);
    }
    
    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final GuiScale scaleForScreenSize(final int step) {
        return GuiScale.Companion.scaleForScreenSize(step);
    }
    
    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final GuiScale scaleForScreenSize() {
        return GuiScale.Companion.scaleForScreenSize();
    }
    
    public static final /* synthetic */ int access$getGuiScaleOverride$cp() {
        return GuiScale.guiScaleOverride;
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
        final String property = System.getProperty("essential.guiScaleOverride", "-1");
        Intrinsics.checkNotNullExpressionValue((Object)property, "getProperty(\"essential.guiScaleOverride\",\"-1\")");
        guiScaleOverride = Integer.parseInt(property);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001a
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0012\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010	\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006
                                                       """ }, d2 = { "Lgg/essential/universal/GuiScale$Companion;", "", "()V", "guiScaleOverride", "", "fromNumber", "Lgg/essential/universal/GuiScale;", "number", "scaleForScreenSize", "step", "universalcraft" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @NotNull
        public final GuiScale fromNumber(final int number) {
            return GuiScale.values()[number];
        }
        
        @JvmStatic
        @JvmOverloads
        @NotNull
        public final GuiScale scaleForScreenSize(final int step) {
            if (GuiScale.access$getGuiScaleOverride$cp() != -1) {
                return this.fromNumber(RangesKt.coerceIn(GuiScale.access$getGuiScaleOverride$cp(), 0, 4));
            }
            final int width = UResolution.getViewportWidth();
            final int height = UResolution.getViewportHeight();
            return this.fromNumber(Math.min(RangesKt.coerceIn(width / step, 1, 4), RangesKt.coerceIn(height / (step / 16 * 9), 1, 4)));
        }
        
        public static /* synthetic */ GuiScale scaleForScreenSize$default(final Companion companion, int step, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                step = 650;
            }
            return companion.scaleForScreenSize(step);
        }
        
        @JvmStatic
        @JvmOverloads
        @NotNull
        public final GuiScale scaleForScreenSize() {
            return scaleForScreenSize$default(this, 0, 1, null);
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
