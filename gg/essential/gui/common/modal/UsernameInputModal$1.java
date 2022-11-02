package gg.essential.gui.common.modal;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.api.*;
import gg.essential.universal.*;
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
static final class UsernameInputModal$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ BasicState<Boolean> $validName;
    final /* synthetic */ Ref$IntRef $fetchCounter;
    final /* synthetic */ UsernameInputModal this$0;
    
    UsernameInputModal$1(final BasicState<Boolean> $validName, final Ref$IntRef $fetchCounter, final UsernameInputModal $receiver) {
        this.$validName = $validName;
        this.$fetchCounter = $fetchCounter;
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        this.$validName.set((kotlin.jvm.functions.Function1<? super Object, ?>)UsernameInputModal$1.UsernameInputModal$1$1.INSTANCE);
        if (it.length() <= 16) {
            ++this.$fetchCounter.element;
            final int fetchId = this.$fetchCounter.element;
            final CompletableFuture<UUID> uuid = EssentialAPI.Companion.getMojangAPI().getUUID(it);
            if (uuid != null) {
                uuid.whenCompleteAsync(UsernameInputModal$1::invoke$lambda-0, ExtensionsKt.getExecutor(UMinecraft.getMinecraft()));
            }
        }
        else {
            final BasicState<String> inputTextState = this.this$0.getInputTextState();
            final String substring = it.substring(0, 16);
            Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            inputTextState.set(substring);
        }
    }
    
    private static final void invoke$lambda-0(final int $fetchId, final Ref$IntRef $fetchCounter, final BasicState $validName, final UUID uuid, final Throwable t) {
        Intrinsics.checkNotNullParameter((Object)$fetchCounter, "$fetchCounter");
        Intrinsics.checkNotNullParameter((Object)$validName, "$validName");
        if ($fetchId == $fetchCounter.element) {
            $validName.set(uuid != null);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((String)p1);
        return Unit.INSTANCE;
    }
}