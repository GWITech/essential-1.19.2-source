package gg.essential.gui.api;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.image.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Lgg/essential/gui/image/ImageFactory;", "it", "", "invoke" })
static final class ComponentFactory$build$3 extends Lambda implements Function1<String, ImageFactory> {
    public static final ComponentFactory$build$3 INSTANCE;
    
    ComponentFactory$build$3() {
        super(1);
    }
    
    @NotNull
    public final ImageFactory invoke(@NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return new ResourceImageFactory(it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((String)p1);
    }
    
    static {
        ComponentFactory$build$3.INSTANCE = new ComponentFactory$build$3();
    }
}