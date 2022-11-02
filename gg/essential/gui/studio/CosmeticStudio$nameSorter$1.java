package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u000f
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class CosmeticStudio$nameSorter$1 extends Lambda implements Function1<UIComponent, Comparable<?>> {
    public static final CosmeticStudio$nameSorter$1 INSTANCE;
    
    CosmeticStudio$nameSorter$1() {
        super(1);
    }
    
    @NotNull
    public final Comparable<?> invoke(@NotNull final UIComponent it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final String displayName = ((CosmeticOption)it).getCosmetic().getDisplayName("en_us");
        return (displayName != null) ? displayName : ((Comparable)"");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UIComponent)p1);
    }
    
    static {
        CosmeticStudio$nameSorter$1.INSTANCE = new CosmeticStudio$nameSorter$1();
    }
}