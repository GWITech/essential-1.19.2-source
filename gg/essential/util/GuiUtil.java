package gg.essential.util;

import net.minecraft.client.gui.screen.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.common.modal.*;
import gg.essential.gui.overlay.*;
import gg.essential.gui.studio.*;
import gg.essential.gui.friends.*;
import gg.essential.api.gui.*;
import gg.essential.data.*;
import gg.essential.*;
import gg.essential.gui.account.factory.*;
import gg.essential.gui.menu.*;
import kotlin.jvm.functions.*;
import net.minecraft.client.util.*;
import gg.essential.gui.modals.*;
import gg.essential.connectionmanager.common.packet.*;
import kotlin.*;
import kotlin.collections.*;
import gg.essential.connectionmanager.common.packet.telemetry.*;
import java.util.*;
import net.minecraft.client.resource.language.*;
import gg.essential.universal.wrappers.message.*;
import net.minecraft.text.*;
import gg.essential.config.*;
import gg.essential.universal.*;
import gg.essential.event.client.*;
import gg.essential.lib.kbrewster.eventbus.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000X
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010	\u001a\u00020
                                                   H\u0096\u0001J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016J
                                                   \u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0016J\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u0011\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u0011\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0017H\u0096\u0001J\u0012\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007R\u0016\u0010\u0004\u001a
                                                   \u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006 """ }, d2 = { "Lgg/essential/util/GuiUtil;", "Lgg/essential/api/utils/GuiUtil;", "Lgg/essential/gui/overlay/OverlayManager;", "()V", "display", "Ljava/util/Optional;", "Lnet/minecraft/client/gui/screen/Screen;", "createEphemeralLayer", "Lgg/essential/gui/overlay/EphemeralLayer;", "priority", "Lgg/essential/gui/overlay/LayerPriority;", "createPersistentLayer", "Lgg/essential/gui/overlay/PersistentLayer;", "getGuiScale", "", "step", "getScreenName", "", "screen", "openScreen", "", "openedScreen", "pushModal", "Lgg/essential/gui/overlay/Layer;", "modal", "Lgg/essential/gui/common/modal/Modal;", "queueModal", "removeLayer", "layer", "tick", "event", "Lgg/essential/event/client/ClientTickEvent;", "essential" })
public final class GuiUtil implements gg.essential.api.utils.GuiUtil
{
    @NotNull
    public static final GuiUtil INSTANCE;
    private final /* synthetic */ OverlayManagerImpl $$delegate_0;
    @Nullable
    private static Optional<Screen> display;
    
    private GuiUtil() {
        super();
        this.$$delegate_0 = OverlayManagerImpl.INSTANCE;
    }
    
    @NotNull
    public PersistentLayer createPersistentLayer(@NotNull final LayerPriority priority) {
        Intrinsics.checkNotNullParameter((Object)priority, "priority");
        return this.$$delegate_0.createPersistentLayer(priority);
    }
    
    @NotNull
    public Layer pushModal(@NotNull final Modal modal) {
        Intrinsics.checkNotNullParameter((Object)modal, "modal");
        return this.$$delegate_0.pushModal(modal);
    }
    
    public void queueModal(@NotNull final Modal modal) {
        Intrinsics.checkNotNullParameter((Object)modal, "modal");
        this.$$delegate_0.queueModal(modal);
    }
    
    public void removeLayer(@NotNull final Layer layer) {
        Intrinsics.checkNotNullParameter((Object)layer, "layer");
        this.$$delegate_0.removeLayer(layer);
    }
    
    @Override
    public void openScreen(@Nullable final Screen screen) {
        if (screen == null) {
            GuiUtil.display = Optional.empty();
            return;
        }
        final boolean screenRequiresAuth = screen instanceof CosmeticStudio || screen instanceof SocialMenu;
        if (screen instanceof GuiRequiresTOS && (OnboardingData.hasDeniedTos() || !OnboardingData.hasAcceptedTos())) {
            this.pushModal(new TOSModal(screenRequiresAuth, (Function0)new GuiUtil$openScreen.GuiUtil$openScreen$1(screen), null, 8));
        }
        else {
            if (screenRequiresAuth && !Essential.getInstance().getConnectionManager().isAuthenticated()) {
                final List<SessionFactory> sessionFactories = Essential.getInstance().getSessionFactories();
                Intrinsics.checkNotNullExpressionValue((Object)sessionFactories, "getInstance().sessionFactories");
                while (true) {
                    for (final Object next : sessionFactories) {
                        final SessionFactory it = (SessionFactory)next;
                        if (it.getSessions().containsKey(UMinecraft.getMinecraft().getSession().getProfile().getId())) {
                            final SessionFactory sessionFactory = (SessionFactory)next;
                            final SessionFactory sessionFactory2 = sessionFactory;
                            if (((sessionFactory2 instanceof ManagedSessionFactory) ? ((ManagedSessionFactory)sessionFactory2) : null) != null) {
                                AccountManager.Companion.refreshCurrentSession(true, (Function2<? super Session, ? super String, Unit>)new GuiUtil$openScreen.GuiUtil$openScreen$3(screen));
                                return;
                            }
                            this.pushModal((Modal)new NotAuthenticatedModal((Function0)new GuiUtil$openScreen.GuiUtil$openScreen$4(screen)));
                            return;
                        }
                    }
                    final SessionFactory sessionFactory = null;
                    continue;
                }
            }
            Essential.getInstance().getConnectionManager().send(new ClientTelemetryPacket("GUI_OPEN", MapsKt.mapOf(new Pair((Object)"name", (Object)screen.getClass().getName()))));
            GuiUtil.display = Optional.of(screen);
        }
    }
    
    @Nullable
    @Override
    public Screen openedScreen() {
        return UMinecraft.getMinecraft().currentScreen;
    }
    
    @NotNull
    public final String getScreenName(@NotNull final Screen screen) {
        Intrinsics.checkNotNullParameter((Object)screen, "screen");
        final UScreen uScreen = (screen instanceof UScreen) ? ((UScreen)screen) : null;
        if (uScreen != null) {
            final String unlocalizedName = uScreen.getUnlocalizedName();
            if (unlocalizedName != null) {
                final String it = unlocalizedName;
                final String translate = I18n.translate(it, new Object[0]);
                Intrinsics.checkNotNullExpressionValue((Object)translate, "translate(it)");
                return translate;
            }
        }
        final Text title = screen.getTitle();
        if (title != null) {
            final Text it2 = title;
            return new UTextComponent(it2).getUnformattedText();
        }
        final String simpleName = screen.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue((Object)simpleName, "screen.javaClass.simpleName");
        return simpleName;
    }
    
    @Override
    public int getGuiScale() {
        return this.getGuiScale(650);
    }
    
    @Override
    public int getGuiScale(final int step) {
        final int scale = EssentialConfig.INSTANCE.getEssentialGuiScale();
        return (scale == GuiScale.Auto.ordinal()) ? GuiScale.Companion.scaleForScreenSize(step).ordinal() : ((scale == 5) ? -1 : scale);
    }
    
    @Subscribe
    public final void tick(@Nullable final ClientTickEvent event) {
        final Optional<Screen> display = GuiUtil.display;
        if (display != null) {
            final Optional it = display;
            if (it.isPresent()) {
                UMinecraft.getMinecraft().setScreen((Screen)it.get());
            }
            GuiUtil.display = null;
        }
    }
    
    static {
        INSTANCE = new GuiUtil();
    }
}
