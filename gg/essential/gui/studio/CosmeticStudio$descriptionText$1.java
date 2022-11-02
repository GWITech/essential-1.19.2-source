package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.mod.cosmetics.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lorg/jetbrains/annotations/NotNull;", "it", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "invoke" })
static final class CosmeticStudio$descriptionText$1 extends Lambda implements Function1<Category, String> {
    public static final CosmeticStudio$descriptionText$1 INSTANCE;
    
    CosmeticStudio$descriptionText$1() {
        super(1);
    }
    
    @NotNull
    public final String invoke(@NotNull final Category it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        String s;
        if (it instanceof final Category.InfraSlot infraSlot) {
            if ((s = infraSlot.getCategory().getDescriptions().get("en_us")) == null) {
                s = "";
            }
        }
        else {
            s = ((it instanceof Category.Slot) ? ((WhenMappings.$EnumSwitchMapping$0[((Category.Slot)it).getSlot().ordinal()] == 1) ? """
                                                                                                                                      Only official capes unlocked on your profile are available.
                                                                                                                                      
                                                                                                                                      Unselect a cape to use one provided by a 3rd party mod.""" : "") : ((it instanceof Category.New) ? "The latest and greatest additions to our catalog!" : ((it instanceof Category.Owned) ? "All the cosmetics that you own." : "")));
        }
        return s;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Category)p1);
    }
    
    static {
        CosmeticStudio$descriptionText$1.INSTANCE = new CosmeticStudio$descriptionText$1();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[CosmeticSlot.values().length];
            $EnumSwitchMapping$[CosmeticSlot.CAPE.ordinal()] = 1;
            WhenMappings.$EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}