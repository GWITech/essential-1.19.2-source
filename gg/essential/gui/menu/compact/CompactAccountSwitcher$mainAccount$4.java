package gg.essential.gui.menu.compact;

import net.minecraft.client.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.image.*;
import gg.essential.elementa.components.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Lgg/essential/gui/image/ImageFactory;", "it", "Lnet/minecraft/client/util/Session;", "invoke" })
static final class CompactAccountSwitcher$mainAccount$4 extends Lambda implements Function1<Session, ImageFactory> {
    public static final CompactAccountSwitcher$mainAccount$4 INSTANCE;
    
    CompactAccountSwitcher$mainAccount$4() {
        super(1);
    }
    
    @NotNull
    public final ImageFactory invoke(@NotNull final Session it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return ImageFactoryKt.ImageFactory((Function0<? extends UIImage>)new CompactAccountSwitcher$mainAccount$4.CompactAccountSwitcher$mainAccount$4$1(it));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Session)p1);
    }
    
    static {
        CompactAccountSwitcher$mainAccount$4.INSTANCE = new CompactAccountSwitcher$mainAccount$4();
    }
}