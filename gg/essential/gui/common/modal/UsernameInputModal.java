package gg.essential.gui.common.modal;

import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.api.*;
import gg.essential.universal.*;
import gg.essential.util.*;
import java.util.concurrent.*;
import java.util.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.*;
import gg.essential.gui.common.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006""" }, d2 = { "Lgg/essential/gui/common/modal/UsernameInputModal;", "Lgg/essential/gui/common/modal/CancelableInputModal;", "placeholderText", "", "initialText", "(Ljava/lang/String;Ljava/lang/String;)V", "essential" })
public final class UsernameInputModal extends CancelableInputModal
{
    public UsernameInputModal(@NotNull final String placeholderText, @NotNull final String initialText) {
        Intrinsics.checkNotNullParameter((Object)placeholderText, "placeholderText");
        Intrinsics.checkNotNullParameter((Object)initialText, "initialText");
        super(placeholderText, initialText);
        final BasicState validName = new BasicState((T)false);
        final Ref$IntRef fetchCounter = new Ref$IntRef();
        this.getInputTextState().onSetValue((kotlin.jvm.functions.Function1<? super Object, Unit>)new Function1<String, Unit>() {
            final /* synthetic */ BasicState<Boolean> $validName;
            final /* synthetic */ Ref$IntRef $fetchCounter;
            final /* synthetic */ UsernameInputModal this$0;
            
            UsernameInputModal$1() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke(@NotNull final String it) {
                Intrinsics.checkNotNullParameter((Object)it, "it");
                validName.set((kotlin.jvm.functions.Function1<? super Object, ?>)UsernameInputModal$1.UsernameInputModal$1$1.INSTANCE);
                if (it.length() <= 16) {
                    ++fetchCounter.element;
                    final int fetchId = fetchCounter.element;
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
        });
        this.bindConfirmAvailable(validName);
        ExtensionsKt.bindEssentialTooltip$default$5d648aca(this.getPrimaryActionButton(), StateExtensionsKt.and(ExtensionsKt.hoveredState$default$56721d26(this.getPrimaryActionButton(), false, false, 3), (State<Boolean>)StateExtensionsKt.not(validName)), new BasicState("Invalid username"), EssentialTooltip.Position.ABOVE, 0.0f, null, null, 56);
    }
    
    public UsernameInputModal(final String placeholderText) {
        this(placeholderText, "");
    }
}
