package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.resource.language.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u0014 \u0003*	\u0018\u00010\u0001¢\u0006\u0002\b\u00020\u0001¢\u0006\u0002\b\u00022\u0006\u0010\u0004\u001a\u00020\u0005H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "", "Lorg/jetbrains/annotations/Nullable;", "kotlin.jvm.PlatformType", "it", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "invoke" })
static final class CosmeticStudio$categoryTextState$1 extends Lambda implements Function1<Category, String> {
    public static final CosmeticStudio$categoryTextState$1 INSTANCE;
    
    CosmeticStudio$categoryTextState$1() {
        super(1);
    }
    
    public final String invoke(@NotNull final Category it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        String s;
        if (it instanceof final Category.InfraSlot infraSlot) {
            if ((s = infraSlot.getCategory().getDisplayName("en_us")) == null) {
                s = infraSlot.getCategory().getId();
            }
        }
        else {
            s = ((it instanceof Category.Cart) ? "Cart" : I18n.translate("studio." + it.getId(), new Object[0]));
        }
        return s;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Category)p1);
    }
    
    static {
        CosmeticStudio$categoryTextState$1.INSTANCE = new CosmeticStudio$categoryTextState$1();
    }
}