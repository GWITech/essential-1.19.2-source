package gg.essential.gui.friends.message;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.image.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/image/ImageFactory;", "invoke", "(Lgg/essential/gui/image/ImageFactory;)Ljava/lang/Float;" })
static final class OptionMenu$2$imageContainer$2$1 extends Lambda implements Function1<ImageFactory, Float> {
    public static final OptionMenu$2$imageContainer$2$1 INSTANCE;
    
    OptionMenu$2$imageContainer$2$1() {
        super(1);
    }
    
    @NotNull
    public final Float invoke(@Nullable final ImageFactory it) {
        return (it == null) ? 6.0f : 20.0f;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((ImageFactory)p1);
    }
    
    static {
        OptionMenu$2$imageContainer$2$1.INSTANCE = new OptionMenu$2$imageContainer$2$1();
    }
}