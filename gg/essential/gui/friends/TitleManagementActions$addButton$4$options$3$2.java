package gg.essential.gui.friends;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.util.*;
import java.util.concurrent.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class TitleManagementActions$addButton$4$options$3$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ SocialMenu $gui;
    
    TitleManagementActions$addButton$4$options$3$2(final SocialMenu $gui) {
        this.$gui = $gui;
        super(1);
    }
    
    public final void invoke(@NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final CompletableFuture<UUID> uuid = UUIDUtil.getUUID(it);
        Intrinsics.checkNotNullExpressionValue((Object)uuid, "getUUID(it)");
        ExtensionsKt.thenAcceptOnMainThread((CompletableFuture<Object>)uuid, (kotlin.jvm.functions.Function1<? super Object, Unit>)new TitleManagementActions$addButton$4$options$3$2.TitleManagementActions$addButton$4$options$3$2$1(this.$gui));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((String)p1);
        return Unit.INSTANCE;
    }
}