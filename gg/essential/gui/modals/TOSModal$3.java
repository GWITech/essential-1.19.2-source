package gg.essential.gui.modals;

import kotlin.*;
import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.data.*;
import gg.essential.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.components.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.util.*;
import gg.essential.gui.common.modal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke" })
static final class TOSModal$3 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {
    final /* synthetic */ TOSModal this$0;
    final /* synthetic */ boolean $requiresAuth;
    final /* synthetic */ Function0<Unit> $confirmAction;
    
    TOSModal$3(final TOSModal $receiver, final boolean $requiresAuth, final Function0<Unit> $confirmAction) {
        this.this$0 = $receiver;
        this.$requiresAuth = $requiresAuth;
        this.$confirmAction = $confirmAction;
        super(1);
    }
    
    public final void invoke(@NotNull final Pair<Boolean, Boolean> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final boolean ageChecked = (boolean)pair.component1();
        final boolean tosChecked = (boolean)pair.component2();
        this.this$0.setPrimaryButtonAction((Function0<Unit>)((ageChecked && tosChecked) ? new Function0<Unit>() {
            final /* synthetic */ boolean $requiresAuth = TOSModal$3.this.$requiresAuth;
            final /* synthetic */ TOSModal this$0 = TOSModal$3.this.this$0;
            final /* synthetic */ Function0<Unit> $confirmAction = TOSModal$3.this.$confirmAction;
            
            TOSModal$3$2() {
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
        } : ((Function0)new Function0<Unit>() {
            final /* synthetic */ TOSModal this$0 = TOSModal$3.this.this$0;
            
            TOSModal$3$1() {
                super(0);
            }
            
            public final void invoke() {
                TOSModal.access$getAgeCheckboxOutlineColor$p(this.this$0).rebind(TOSModal.access$getAgeCheckbox(this.this$0).isChecked().map((kotlin.jvm.functions.Function1<? super Object, ?>)TOSModal$3$1.TOSModal$3$1$1.INSTANCE));
                TOSModal.access$getTosCheckboxOutlineColor$p(this.this$0).rebind(TOSModal.access$getTosCheckbox(this.this$0).isChecked().map((kotlin.jvm.functions.Function1<? super Object, ?>)TOSModal$3$1.TOSModal$3$1$2.INSTANCE));
            }
            
            public /* bridge */ Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }
        })));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Pair<Boolean, Boolean>)p1);
        return Unit.INSTANCE;
    }
}