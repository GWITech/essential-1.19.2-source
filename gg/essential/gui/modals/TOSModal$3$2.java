package gg.essential.gui.modals;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.data.*;
import gg.essential.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.components.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.util.*;
import gg.essential.gui.common.modal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class TOSModal$3$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ boolean $requiresAuth;
    final /* synthetic */ TOSModal this$0;
    final /* synthetic */ Function0<Unit> $confirmAction;
    
    TOSModal$3$2(final boolean $requiresAuth, final TOSModal $receiver, final Function0<Unit> $confirmAction) {
        this.$requiresAuth = $requiresAuth;
        this.this$0 = $receiver;
        this.$confirmAction = $confirmAction;
        super(0);
    }
    
    public final void invoke() {
        OnboardingData.setAcceptedTos();
        if (this.$requiresAuth && !Essential.getInstance().getConnectionManager().isAuthenticated()) {
            this.this$0.setPrimaryButtonText("Connecting...");
            this.this$0.setRequiresButtonPress$1385ff();
            this.this$0.getPrimaryActionButton().rebindEnabled(StateExtensionsKt.state(false));
            TOSModal.access$getCancelButton(this.this$0).rebindEnabled(StateExtensionsKt.state(false));
            final ConnectionManager connectionManager2 = Essential.getInstance().getConnectionManager();
            Intrinsics.checkNotNullExpressionValue((Object)connectionManager2, "getInstance().connectionManager");
            final ConnectionManager connectionManager = connectionManager2;
            connectionManager.connect().whenCompleteAsync(TOSModal$3$2::invoke$lambda-0, Window.Companion::enqueueRenderOperation);
        }
        else {
            this.$confirmAction.invoke();
            this.this$0.hides();
        }
    }
    
    private static final void invoke$lambda-0(final Function0 $confirmAction, final TOSModal this$0, final ConnectionManager.Status status, final Throwable exception) {
        Intrinsics.checkNotNullParameter((Object)$confirmAction, "$confirmAction");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        if (exception != null || status == ConnectionManager.Status.MOJANG_UNAUTHORIZED) {
            GuiUtil.INSTANCE.pushModal((Modal)new AccountNotValidModal($confirmAction));
        }
        else if (status != ConnectionManager.Status.SUCCESS) {
            GuiUtil.INSTANCE.pushModal((Modal)new NotAuthenticatedModal($confirmAction));
        }
        else {
            $confirmAction.invoke();
        }
        this$0.hides();
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}