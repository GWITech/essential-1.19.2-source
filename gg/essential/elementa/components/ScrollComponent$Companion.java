package gg.essential.elementa.components;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/components/ScrollComponent$Companion;", "", "()V", "getScrollImage", "Lgg/essential/elementa/components/UIImage;", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final UIImage getScrollImage() {
        return UIImage.Companion.ofResourceCached("/vertical-scroll.png");
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
