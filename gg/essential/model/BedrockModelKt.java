package gg.essential.model;

import kotlin.*;
import gg.essential.network.cosmetics.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlinx.coroutines.*;
import kotlin.coroutines.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006""" }, d2 = { "createBlocking", "Lgg/essential/model/BedrockModel;", "cosmetic", "Lgg/essential/network/cosmetics/Cosmetic;", "skinType", "", "essential" })
public final class BedrockModelKt
{
    @NotNull
    public static final BedrockModel createBlocking(@NotNull final Cosmetic cosmetic, @NotNull final String skinType) {
        Intrinsics.checkNotNullParameter((Object)cosmetic, "cosmetic");
        Intrinsics.checkNotNullParameter((Object)skinType, "skinType");
        return (BedrockModel)BuildersKt.runBlocking$default((CoroutineContext)null, (Function2)new BedrockModelKt$createBlocking.BedrockModelKt$createBlocking$1(cosmetic, skinType, (Continuation)null), 1, (Object)null);
    }
}
