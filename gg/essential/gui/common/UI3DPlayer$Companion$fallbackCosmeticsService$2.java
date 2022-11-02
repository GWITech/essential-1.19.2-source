package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import gg.essential.mod.cosmetics.*;
import kotlin.*;
import gg.essential.*;
import kotlin.jvm.internal.*;
import kotlin.coroutines.*;
import gg.essential.model.backend.*;
import gg.essential.model.backend.minecraft.*;
import gg.essential.mod.cosmetics.database.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lgg/essential/mod/cosmetics/CosmeticsService;", "invoke" })
static final class UI3DPlayer$Companion$fallbackCosmeticsService$2 extends Lambda implements Function0<CosmeticsService> {
    public static final UI3DPlayer$Companion$fallbackCosmeticsService$2 INSTANCE;
    
    UI3DPlayer$Companion$fallbackCosmeticsService$2() {
        super(0);
    }
    
    @NotNull
    public final CosmeticsService invoke() {
        final CosmeticsManager cosmeticsManager2 = Essential.getInstance().getConnectionManager().getCosmeticsManager();
        Intrinsics.checkNotNullExpressionValue((Object)cosmeticsManager2, "getInstance().connectionManager.cosmeticsManager");
        final CosmeticsManager cosmeticsManager = cosmeticsManager2;
        return new CosmeticsService((CoroutineContext)EmptyCoroutineContext.INSTANCE, (RenderBackend)MinecraftRenderBackend.INSTANCE, (CosmeticsDatabase)new UI3DPlayer$Companion$fallbackCosmeticsService$2.UI3DPlayer$Companion$fallbackCosmeticsService$2$1(cosmeticsManager), cosmeticsManager.getAssetProvider().asSuspendingProvider());
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        UI3DPlayer$Companion$fallbackCosmeticsService$2.INSTANCE = new UI3DPlayer$Companion$fallbackCosmeticsService$2();
    }
}