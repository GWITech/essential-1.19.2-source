package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/UIComponent;", "invoke", "(Lgg/essential/elementa/UIComponent;)Ljava/lang/Boolean;" })
static final class CosmeticStudio$filterAndSortCosmeticOptions$1 extends Lambda implements Function1<UIComponent, Boolean> {
    final /* synthetic */ Category $category;
    final /* synthetic */ CosmeticStudio this$0;
    
    CosmeticStudio$filterAndSortCosmeticOptions$1(final Category $category, final CosmeticStudio $receiver) {
        this.$category = $category;
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final UIComponent it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return !(it instanceof CosmeticOption) || CosmeticStudio.Category.filter$default$50d04712(this.$category, ((CosmeticOption)it).getCosmetic(), this.this$0, null);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UIComponent)p1);
    }
}