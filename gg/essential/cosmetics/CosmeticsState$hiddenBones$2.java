package gg.essential.cosmetics;

import kotlin.jvm.functions.*;
import gg.essential.mod.cosmetics.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "", "it", "Lgg/essential/mod/cosmetics/CosmeticSetting;", "invoke" })
static final class CosmeticsState$hiddenBones$2 extends Lambda implements Function1<CosmeticSetting, Iterable<? extends String>> {
    public static final CosmeticsState$hiddenBones$2 INSTANCE;
    
    CosmeticsState$hiddenBones$2() {
        super(1);
    }
    
    @NotNull
    public final Iterable<String> invoke(@NotNull final CosmeticSetting it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it.getData().keySet();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((CosmeticSetting)p1);
    }
    
    static {
        CosmeticsState$hiddenBones$2.INSTANCE = new CosmeticsState$hiddenBones$2();
    }
}