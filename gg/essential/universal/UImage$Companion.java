package gg.essential.universal;

import kotlin.*;
import net.minecraft.client.texture.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020	H\u0007¨\u0006
                                                   """ }, d2 = { "Lgg/essential/universal/UImage$Companion;", "", "()V", "ofSize", "Lgg/essential/universal/UImage;", "width", "", "height", "clear", "", "universalcraft" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @JvmStatic
    @JvmOverloads
    @NotNull
    public final UImage ofSize(final int width, final int height, final boolean clear) {
        return new UImage(new NativeImage(width, height, clear));
    }
    
    public static /* synthetic */ UImage ofSize$default(final Companion companion, final int width, final int height, boolean clear, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            clear = true;
        }
        return companion.ofSize(width, height, clear);
    }
    
    @JvmStatic
    @JvmOverloads
    @NotNull
    public final UImage ofSize(final int width, final int height) {
        return ofSize$default(this, width, height, false, 4, null);
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
