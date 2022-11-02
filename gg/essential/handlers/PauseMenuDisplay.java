package gg.essential.handlers;

import org.jetbrains.annotations.*;
import kotlin.reflect.*;
import gg.essential.mixins.ext.client.gui.*;
import gg.essential.*;
import gg.essential.event.essential.*;
import gg.essential.universal.*;
import gg.essential.gui.elementa.*;
import gg.essential.elementa.components.*;
import net.minecraft.client.gui.widget.*;
import gg.essential.elementa.*;
import kotlin.properties.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.state.*;
import kotlin.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.gui.menu.compact.*;
import gg.essential.gui.menu.full.*;
import gg.essential.gui.menu.*;
import gg.essential.util.*;
import gg.essential.gui.common.modal.*;
import gg.essential.config.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.event.gui.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.mixins.transformers.client.gui.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.overlay.*;
import net.minecraft.client.*;
import gg.essential.data.*;
import gg.essential.gui.modals.*;
import gg.essential.gui.notification.*;
import gg.essential.network.connectionmanager.sps.*;
import gg.essential.gui.sps.*;
import net.minecraft.world.level.storage.*;
import java.util.*;
import gg.essential.network.connectionmanager.*;
import net.minecraft.client.network.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000J
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0011
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010	\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020
                                                   H\u0007J\u000e\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0006J-\u0010\u000e\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f*\u00020\f2\u0012\u0010\u0011\u001a
                                                   \u0012\u0006\b\u0001\u0012\u00020\u00130\u0012"\u00020\u0013H\u0002¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006\u0017²\u0006
                                                   \u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006
                                                   \u0010\u001a\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006
                                                   \u0010\u001b\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006
                                                   \u0010\u001c\u001a\u00020\u0019X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/handlers/PauseMenuDisplay;", "", "()V", "init", "", "drawScreen", "", "event", "Lgg/essential/event/gui/GuiDrawScreenEvent;", "guiOpen", "Lgg/essential/event/gui/GuiOpenEvent;", "screen", "Lnet/minecraft/client/gui/screen/Screen;", "refresh", "findButtonByLabel", "Lkotlin/Function0;", "Lnet/minecraft/client/gui/widget/ButtonWidget;", "label", "", "", "(Lnet/minecraft/client/gui/screen/Screen;[Ljava/lang/String;)Lkotlin/jvm/functions/Function0;", "Companion", "MenuType", "essential", "topButton", "Lgg/essential/elementa/components/UIContainer;", "bottomButton", "rightContainer", "leftContainer" })
public final class PauseMenuDisplay
{
    @NotNull
    public static final Companion Companion;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    private boolean init;
    @NotNull
    private static Window window;
    
    public PauseMenuDisplay() {
        super();
    }
    
    public final void init(@NotNull final Screen screen) {
        Intrinsics.checkNotNullParameter((Object)screen, "screen");
        this.init = true;
        if (screen instanceof GuiMainMenu) {
            Essential.EVENT_BUS.post(new InitMainMenuEvent());
        }
        if (EssentialConfig.INSTANCE.getEssentialFull()) {
            final MenuType menuType = (screen instanceof GuiMainMenu) ? MenuType.MAIN : ((UMinecraft.getMinecraft().getCurrentServerEntry() != null) ? MenuType.SERVER : MenuType.SINGLEPLAYER);
            final ReadWriteProperty topButton$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf((T)VanillaButtonConstraint.Companion.constrainTo((T)new UIContainer(), this.findButtonByLabel(screen, "menu.singleplayer", "menu.returnToGame"), (Function1<? super UIConstraints, Unit>)PauseMenuDisplay$init$topButton.PauseMenuDisplay$init$topButton$2.INSTANCE), PauseMenuDisplay.window), null, PauseMenuDisplay.$$delegatedProperties[0]);
            final ReadWriteProperty bottomButton$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf((T)VanillaButtonConstraint.Companion.constrainTo((T)new UIContainer(), this.findButtonByLabel(screen, "menu.quit", "menu.returnToMenu", "menu.disconnect", "replaymod.gui.exit"), (Function1<? super UIConstraints, Unit>)PauseMenuDisplay$init$bottomButton.PauseMenuDisplay$init$bottomButton$2.INSTANCE), PauseMenuDisplay.window), null, PauseMenuDisplay.$$delegatedProperties[1]);
            final State isCompact = ExtensionsKt.pollingState$default$a9b5a09$5bde5825(init$lambda-1((ReadWriteProperty<Object, UIContainer>)bottomButton$delegate), (Function0)PauseMenuDisplay$init$isCompact.PauseMenuDisplay$init$isCompact$1.INSTANCE);
            final State collapsed = ExtensionsKt.pollingState$default$a9b5a09$5bde5825(init$lambda-1((ReadWriteProperty<Object, UIContainer>)bottomButton$delegate), (Function0)new PauseMenuDisplay$init$collapsed.PauseMenuDisplay$init$collapsed$1(isCompact, bottomButton$delegate));
            final State menuVisible = ExtensionsKt.pollingState$default$a9b5a09$5bde5825(init$lambda-1((ReadWriteProperty<Object, UIContainer>)bottomButton$delegate), (Function0)PauseMenuDisplay$init$menuVisible.PauseMenuDisplay$init$menuVisible$1.INSTANCE);
            final UIComponent $this$constrain_u24lambda_u2d0$iv;
            final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIContainer();
            final UIConstraints $this$init_u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$init_u24lambda_u2d2.setHeight(new ChildBasedMaxSizeConstraint());
            final ReadWriteProperty rightContainer$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf((T)StateExtensionsKt.bindConstraints($this$constrain_u24lambda_u2d0$iv, collapsed.zip(isCompact), (kotlin.jvm.functions.Function2<? super UIConstraints, ? super Pair<T, U>, Unit>)new PauseMenuDisplay$init$rightContainer.PauseMenuDisplay$init$rightContainer$3(topButton$delegate, bottomButton$delegate)), PauseMenuDisplay.window), null, PauseMenuDisplay.$$delegatedProperties[2]);
            final UIComponent $this$constrain_u24lambda_u2d0$iv2;
            final UIComponent $this$constrain$iv2 = $this$constrain_u24lambda_u2d0$iv2 = new UIContainer();
            final UIConstraints $this$init_u24lambda_u2d3 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
            $this$init_u24lambda_u2d3.setWidth(UtilitiesKt.getPercent(50));
            $this$init_u24lambda_u2d3.setHeight(UtilitiesKt.getPercent(100));
            final ReadWriteProperty leftContainer$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv2, PauseMenuDisplay.window), null, PauseMenuDisplay.$$delegatedProperties[3]);
            final AccountManager accountManager = new AccountManager();
            StateExtensionsKt.bindParent$default$6fcd5b6b(new CompactRightSideBar(menuType, menuVisible, init$lambda-3((ReadWriteProperty<Object, UIContainer>)rightContainer$delegate), accountManager), init$lambda-3((ReadWriteProperty<Object, UIContainer>)rightContainer$delegate), StateExtensionsKt.and(menuVisible, isCompact), false, null, 12);
            StateExtensionsKt.bindParent$default$6fcd5b6b(new FullRightSideBar(menuType, init$lambda-0((ReadWriteProperty<Object, UIContainer>)topButton$delegate), init$lambda-1((ReadWriteProperty<Object, UIContainer>)bottomButton$delegate), collapsed, (State<Boolean>)StateExtensionsKt.and(menuVisible, (State<Boolean>)StateExtensionsKt.not(isCompact))), init$lambda-3((ReadWriteProperty<Object, UIContainer>)rightContainer$delegate), StateExtensionsKt.and(menuVisible, (State<Boolean>)StateExtensionsKt.not(isCompact)), false, null, 12);
            StateExtensionsKt.bindParent$default$6fcd5b6b(new LeftSideBar(init$lambda-0((ReadWriteProperty<Object, UIContainer>)topButton$delegate), init$lambda-1((ReadWriteProperty<Object, UIContainer>)bottomButton$delegate), menuVisible, collapsed, isCompact, menuType, init$lambda-3((ReadWriteProperty<Object, UIContainer>)rightContainer$delegate), init$lambda-5((ReadWriteProperty<Object, UIContainer>)leftContainer$delegate), accountManager), init$lambda-5((ReadWriteProperty<Object, UIContainer>)leftContainer$delegate), menuVisible, false, null, 12);
        }
        if (!Intrinsics.areEqual((Object)VersionData.INSTANCE.getMajorComponents(VersionData.INSTANCE.getEssentialVersion()), (Object)VersionData.INSTANCE.getMajorComponents(VersionData.INSTANCE.getLastSeenModal())) && EssentialConfig.INSTANCE.getUpdateModal()) {
            GuiUtil.INSTANCE.queueModal(new UpdateNotificationModal());
        }
        final Map<String, Pair<String, Boolean>> abTestingFlags = FeatureFlags.abTestingFlags;
        Intrinsics.checkNotNullExpressionValue((Object)abTestingFlags, "abTestingFlags");
        final Map $this$filterValues$iv = abTestingFlags;
        LinkedHashMap result$iv = new LinkedHashMap();
        final Iterator iterator = $this$filterValues$iv.entrySet().iterator();
        Map.Entry entry$iv = null;
        while (iterator.hasNext()) {
            entry$iv = (Map.Entry)iterator.next();
            final Pair featureData = entry$iv.getValue();
            final Object second = featureData.getSecond();
            Intrinsics.checkNotNullExpressionValue(second, "featureData.second");
            if (second) {
                result$iv.put(entry$iv.getKey(), entry$iv.getValue());
            }
        }
        final Map $this$filterKeys$iv = result$iv;
        result$iv = new LinkedHashMap();
        final Iterator iterator2 = $this$filterKeys$iv.entrySet().iterator();
        while (iterator2.hasNext()) {
            entry$iv = (Map.Entry)iterator2.next();
            final String name = entry$iv.getKey();
            if (!ABTestingData.INSTANCE.hasData("Notified:" + name)) {
                result$iv.put(entry$iv.getKey(), entry$iv.getValue());
            }
        }
        if (!result$iv.isEmpty()) {
            GuiUtil.INSTANCE.queueModal((Modal)new FeaturesEnabledModal());
        }
    }
    
    private final Function0<ButtonWidget> findButtonByLabel(final Screen $this$findButtonByLabel, final String... label) {
        return (Function0<ButtonWidget>)new PauseMenuDisplay$findButtonByLabel.PauseMenuDisplay$findButtonByLabel$1($this$findButtonByLabel, label);
    }
    
    @Subscribe
    public final void guiOpen(@NotNull final GuiOpenEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        this.refresh();
    }
    
    @Subscribe
    public final void drawScreen(@NotNull final GuiDrawScreenEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        if (!(event.getScreen() instanceof GameMenuScreen) && !(event.getScreen() instanceof GuiMainMenu)) {
            return;
        }
        if (event.getScreen() instanceof GameMenuScreen) {
            final Screen screen = event.getScreen();
            if (screen == null) {
                throw new NullPointerException("null cannot be cast to non-null type gg.essential.mixins.transformers.client.gui.GuiScreenAccessor");
            }
            if (((GuiScreenAccessor)screen).essential$getChildren().isEmpty()) {
                return;
            }
        }
        if (!this.init) {
            final Screen screen2 = event.getScreen();
            Intrinsics.checkNotNullExpressionValue((Object)screen2, "event.screen");
            this.init(screen2);
        }
    }
    
    public final void refresh() {
        PauseMenuDisplay.window.clearChildren();
        this.init = false;
    }
    
    private static final UIContainer init$lambda-0(final ReadWriteProperty<Object, UIContainer> $topButton$delegate) {
        return (UIContainer)$topButton$delegate.getValue((Object)null, (KProperty)PauseMenuDisplay.$$delegatedProperties[0]);
    }
    
    private static final UIContainer init$lambda-1(final ReadWriteProperty<Object, UIContainer> $bottomButton$delegate) {
        return (UIContainer)$bottomButton$delegate.getValue((Object)null, (KProperty)PauseMenuDisplay.$$delegatedProperties[1]);
    }
    
    private static final UIContainer init$lambda-3(final ReadWriteProperty<Object, UIContainer> $rightContainer$delegate) {
        return (UIContainer)$rightContainer$delegate.getValue((Object)null, (KProperty)PauseMenuDisplay.$$delegatedProperties[2]);
    }
    
    private static final UIContainer init$lambda-5(final ReadWriteProperty<Object, UIContainer> $leftContainer$delegate) {
        return (UIContainer)$leftContainer$delegate.getValue((Object)null, (KProperty)PauseMenuDisplay.$$delegatedProperties[3]);
    }
    
    public static final int getMinWidth() {
        return PauseMenuDisplay.Companion.getMinWidth();
    }
    
    @JvmStatic
    public static final boolean canRescale(@NotNull final Screen screen) {
        return PauseMenuDisplay.Companion.canRescale(screen);
    }
    
    public static final /* synthetic */ UIContainer access$init$lambda-1(final ReadWriteProperty $bottomButton$delegate) {
        return init$lambda-1((ReadWriteProperty<Object, UIContainer>)$bottomButton$delegate);
    }
    
    public static final /* synthetic */ UIContainer access$init$lambda-0(final ReadWriteProperty $topButton$delegate) {
        return init$lambda-0((ReadWriteProperty<Object, UIContainer>)$topButton$delegate);
    }
    
    public static final /* synthetic */ Window access$getWindow$cp() {
        return PauseMenuDisplay.window;
    }
    
    public static final /* synthetic */ int access$getMinWidth$cp() {
        return 404;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PauseMenuDisplay.class, "topButton", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PauseMenuDisplay.class, "bottomButton", "<v#1>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PauseMenuDisplay.class, "rightContainer", "<v#2>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PauseMenuDisplay.class, "leftContainer", "<v#3>", 0)) };
        Companion = new Companion((byte)0);
        PauseMenuDisplay.window = GuiUtil.INSTANCE.createPersistentLayer(LayerPriority.AboveScreenContent).getWindow();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00006
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0002\b\u0004
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005
                                                       \u0002\u0010\u000b
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u001d\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0001¢\u0006\u0002\b\u0016R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e
                                                       \u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020	X\u0086\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b
                                                       \u0010\u000b"\u0004\b\f\u0010¨\u0006\u0017""" }, d2 = { "Lgg/essential/handlers/PauseMenuDisplay$Companion;", "", "()V", "minWidth", "", "getMinWidth$annotations", "getMinWidth", "()I", "window", "Lgg/essential/elementa/components/Window;", "getWindow", "()Lgg/essential/elementa/components/Window;", "setWindow", "(Lgg/essential/elementa/components/Window;)V", "canRescale", "", "screen", "Lnet/minecraft/client/gui/screen/Screen;", "showInviteOrHostModal", "", "callback", "Lkotlin/Function0;", "showInviteOrHostModal$essential", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final Window getWindow() {
            return PauseMenuDisplay.access$getWindow$cp();
        }
        
        public final int getMinWidth() {
            return PauseMenuDisplay.access$getMinWidth$cp();
        }
        
        @JvmStatic
        public final boolean canRescale(@NotNull final Screen screen) {
            Intrinsics.checkNotNullParameter((Object)screen, "screen");
            return (screen instanceof GuiMainMenu || screen instanceof GameMenuScreen) && EssentialConfig.INSTANCE.getEssentialGuiScale() == 0;
        }
        
        @JvmStatic
        public final void showInviteOrHostModal$essential(@NotNull final Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter((Object)callback, "callback");
            final ConnectionManager connectionManager2 = Essential.getInstance().getConnectionManager();
            Intrinsics.checkNotNullExpressionValue((Object)connectionManager2, "getInstance().connectionManager");
            final ConnectionManager connectionManager = connectionManager2;
            final ServerInfo currentServerData = UMinecraft.getMinecraft().getCurrentServerEntry();
            if (MinecraftClient.getInstance().currentScreen instanceof GuiMainMenu) {
                if (OnboardingData.hasAcceptedTos()) {
                    if (!connectionManager.isAuthenticated()) {
                        GuiUtil.INSTANCE.pushModal((Modal)new NotAuthenticatedModal((Function0)new PauseMenuDisplay$Companion$showInviteOrHostModal.PauseMenuDisplay$Companion$showInviteOrHostModal$2((Function0)callback)));
                    }
                    else {
                        GuiUtil.INSTANCE.pushModal(new WorldSelectionModal((byte)0));
                    }
                }
                else {
                    GuiUtil.INSTANCE.pushModal(new TOSModal(true, (Function0)new PauseMenuDisplay$Companion$showInviteOrHostModal.PauseMenuDisplay$Companion$showInviteOrHostModal$3((Function0)callback), null, 9));
                }
                return;
            }
            if (UMinecraft.getMinecraft().getServer() != null) {
                if (UPnPWrapper.getCompatibility() != UPnPWrapper.UPnPCompatibility.COMPATIBLE) {
                    Notifications.INSTANCE.push("Invite Friends unavailable", "UPnP isn't supported on your router");
                    return;
                }
                if (connectionManager.getSpsManager().getLocalState() == SPSState.OPENING) {
                    Notifications.INSTANCE.push("Invite Friends unavailable", "Please wait for the world to open");
                    return;
                }
            }
            else {
                if (currentServerData == null) {
                    Notifications.INSTANCE.push("Invite Friends unavailable", "You cannot invite friends to this world");
                    return;
                }
                final String serverAddress = currentServerData.address;
                final boolean isSPSServer = connectionManager.getSpsManager().isSpsAddress(serverAddress);
                if (isSPSServer) {
                    Notifications.INSTANCE.push("Invite Friends unavailable", "You cannot invite friends to this world");
                    return;
                }
            }
            if (OnboardingData.hasAcceptedTos()) {
                if (!connectionManager.isAuthenticated()) {
                    GuiUtil.INSTANCE.pushModal((Modal)new NotAuthenticatedModal((Function0)new PauseMenuDisplay$Companion$showInviteOrHostModal.PauseMenuDisplay$Companion$showInviteOrHostModal$5((Function0)callback)));
                    return;
                }
                InviteFriendsModal.show$default$7781189c(InviteFriendsModal.INSTANCE, null, null, false, false, callback, 15);
            }
            else {
                GuiUtil.INSTANCE.pushModal(new TOSModal(true, (Function0)new PauseMenuDisplay$Companion$showInviteOrHostModal.PauseMenuDisplay$Companion$showInviteOrHostModal$6((Function0)callback), null, 9));
            }
        }
        
        public static /* synthetic */ void showInviteOrHostModal$essential$default$577b675f$45cb9dbd(final Companion companion) {
            companion.showInviteOrHostModal$essential((Function0<Unit>)PauseMenuDisplay$Companion$showInviteOrHostModal.PauseMenuDisplay$Companion$showInviteOrHostModal$1.INSTANCE);
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0010
                                                       \u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "Lgg/essential/handlers/PauseMenuDisplay$MenuType;", "", "(Ljava/lang/String;I)V", "MAIN", "SINGLEPLAYER", "SERVER", "essential" })
    public enum MenuType
    {
        MAIN("MAIN", 0), 
        SINGLEPLAYER("SINGLEPLAYER", 1), 
        SERVER("SERVER", 2);
        
        private static final /* synthetic */ MenuType[] $VALUES;
        
        private MenuType(final String $enum$name, final int $enum$ordinal) {
        }
        
        public static MenuType[] values() {
            return MenuType.$VALUES.clone();
        }
        
        public static MenuType valueOf(final String value) {
            return Enum.valueOf(MenuType.class, value);
        }
        
        private static final /* synthetic */ MenuType[] $values() {
            return new MenuType[] { MenuType.MAIN, MenuType.SINGLEPLAYER, MenuType.SERVER };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
