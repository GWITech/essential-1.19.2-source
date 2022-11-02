package gg.essential;

import gg.essential.api.*;
import java.io.*;
import gg.essential.util.lwjgl3.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.key.*;
import gg.essential.cosmetics.*;
import gg.essential.cosmetics.events.*;
import gg.essential.network.client.*;
import gg.essential.gui.studio.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.event.client.*;
import gg.essential.config.*;
import gg.essential.util.swing.*;
import java.util.*;
import gg.essential.gui.account.factory.*;
import gg.essential.event.*;
import gg.essential.elementa.effects.*;
import java.util.concurrent.*;
import gg.essential.elementa.components.image.*;
import gg.essential.commands.*;
import gg.essential.gui.overlay.*;
import gg.essential.handlers.discord.*;
import gg.essential.gui.*;
import gg.essential.util.*;
import gg.essential.network.connectionmanager.subscription.*;
import gg.essential.data.*;
import gg.essential.compatibility.vanilla.difficulty.*;
import gg.essential.universal.*;
import gg.essential.gui.notification.*;
import gg.essential.event.essential.*;
import java.net.*;
import com.google.common.net.*;
import net.minecraft.client.network.*;
import gg.essential.lib.kbrewster.eventbus.invokers.*;
import gg.essential.api.commands.*;
import gg.essential.handlers.*;
import gg.essential.api.utils.*;
import gg.essential.api.gui.*;
import gg.essential.gui.api.*;
import gg.essential.api.utils.mojang.*;
import gg.essential.lib.gson.*;
import org.apache.logging.log4j.core.*;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.config.*;

public class Essential implements EssentialAPI
{
    public static final Gson GSON;
    public static final Logger logger;
    public static final Logger debug;
    private static final InvokerType invoker;
    public static final EventBus EVENT_BUS;
    private static Essential instance;
    private static boolean initialized;
    private final File baseDir;
    public final boolean isNewInstallation;
    private final Lwjgl3Loader lwjgl3;
    @NotNull
    private final ConnectionManager connectionManager;
    private final List<SessionFactory> sessionFactories;
    @NotNull
    private final EssentialKeybindingRegistry keybindingRegistry;
    private ImageCache imageCache;
    private PlayerWearableManager playerWearableManager;
    private final GameProfileManager gameProfileManager;
    private final EssentialSkinManager skinManager;
    private AnimationEffectHandler animationEffectHandler;
    private Map<Object, Boolean> dynamicListeners;
    private final EssentialGameRules gameRules;
    
    public Essential() {
        super();
        this.baseDir = this.createEssentialDir();
        this.isNewInstallation = !new File(this.baseDir, "config.toml").exists();
        this.lwjgl3 = new Lwjgl3Loader(this.baseDir.toPath().resolve("lwjgl3-natives"), GLUtil.INSTANCE.isGL30());
        this.connectionManager = new ConnectionManager(new NetworkHook(), this.baseDir, this.lwjgl3);
        this.sessionFactories = new ArrayList<SessionFactory>();
        this.keybindingRegistry = new EssentialKeybindingRegistry();
        this.gameProfileManager = new GameProfileManager();
        this.skinManager = new EssentialSkinManager(this.gameProfileManager, () -> CosmeticStudio.getInstance() != null);
        this.dynamicListeners = new HashMap<Object, Boolean>();
        this.gameRules = new EssentialGameRules();
    }
    
    public static Essential getInstance() {
        if (Essential.instance == null) {
            Essential.instance = new Essential();
        }
        return Essential.instance;
    }
    
    @NotNull
    public ConnectionManager getConnectionManager() {
        return this.connectionManager;
    }
    
    @NotNull
    public EssentialKeybindingRegistry getKeybindingRegistry() {
        return this.keybindingRegistry;
    }
    
    @Subscribe
    public void initialize(final InitializationEvent event) {
        if (Essential.initialized) {
            return;
        }
        Essential.initialized = true;
        this.init();
    }
    
    @Subscribe
    public void preinit(final PreInitializationEvent event) {
        DI.INSTANCE.startDI();
    }
    
    public void registerListener(final Object o) {
        Essential.EVENT_BUS.register(o);
    }
    
    public void registerListenerRequiresEssential(final Object o) {
        if (EssentialConfig.INSTANCE.getEssentialEnabled()) {
            Essential.EVENT_BUS.register(o);
            this.dynamicListeners.put(o, true);
        }
        else {
            this.dynamicListeners.put(o, false);
        }
    }
    
    public void checkListeners() {
        for (final Map.Entry<Object, Boolean> entry : this.dynamicListeners.entrySet()) {
            if (!EssentialConfig.INSTANCE.getEssentialEnabled()) {
                if (!entry.getValue()) {
                    continue;
                }
                Essential.EVENT_BUS.unregister(entry.getKey());
                entry.setValue(false);
            }
            else {
                if (entry.getValue()) {
                    continue;
                }
                Essential.EVENT_BUS.register(entry.getKey());
                entry.setValue(true);
            }
        }
    }
    
    public GameProfileManager getGameProfileManager() {
        return this.gameProfileManager;
    }
    
    public EssentialSkinManager getSkinManager() {
        return this.skinManager;
    }
    
    private void init() {
        final EssentialConfig essentialConfig = EssentialConfig.INSTANCE;
        try {
            if (Sk1erModUtils.isOldModCorePresent() && essentialConfig.getModCoreWarning()) {
                Essential.logger.error("Old ModCore has been found!! Uh oh!");
                SwingUtil.showOldModCorePopup();
            }
        }
        catch (final Exception ex) {}
        try {
            final MicrosoftAccountSessionFactory obj;
            final MicrosoftAccountSessionFactory microsoftAccountSessionFactory = obj = new MicrosoftAccountSessionFactory(this.baseDir.toPath().resolve("microsoft_accounts.json"));
            Objects.requireNonNull(obj);
            Multithreading.runAsync(obj::refreshRefreshTokensIfNecessary);
            this.sessionFactories.add(microsoftAccountSessionFactory);
            this.sessionFactories.add(new ActiveSessionFactory());
            this.sessionFactories.add(new InitialSessionFactory());
        }
        catch (final Exception e) {
            Essential.logger.error("Failed to load accounts:", (Throwable)e);
        }
        EventHandler.init();
        StencilEffect.Companion.enableStencil();
        essentialConfig.preload();
        this.imageCache = new FileImageCache(new File(this.getBaseDir(), "image-cache"), 1L, TimeUnit.HOURS, true);
        Essential.EVENT_BUS.register(EssentialCommandRegistry.INSTANCE);
        this.keybindingRegistry.refreshBinds();
        this.registerListener(this.keybindingRegistry);
        this.registerListenerRequiresEssential(new NetworkSubscriptionStateHandler());
        this.registerListener(MinecraftUtils.INSTANCE);
        this.registerListenerRequiresEssential(new ServerStatusHandler());
        this.registerListener(GuiUtil.INSTANCE);
        this.registerListener(OverlayManagerImpl.Events.INSTANCE);
        this.registerListener(new PauseMenuDisplay());
        this.registerListenerRequiresEssential(DiscordIntegration.INSTANCE);
        Multithreading.runAsync(UPnPWrapper::checkCompatibility);
        this.registerListener(new GuiOptionsEditor());
        this.registerListener(this.connectionManager);
        this.registerListener(new WindowedFullscreenHandler());
        this.registerListener(this.connectionManager.getSpsManager());
        this.registerListenerRequiresEssential(this.animationEffectHandler = new AnimationEffectHandler());
        this.registerListenerRequiresEssential(this.playerWearableManager = new PlayerWearableManager(this.connectionManager, this.connectionManager.getCosmeticsManager()));
        if (!OptiFineUtil.isLoaded()) {
            this.registerListenerRequiresEssential(ZoomHandler.getInstance());
        }
        this.connectionManager.getSubscriptionManager().addListener(this.gameProfileManager);
        Multithreading.runAsync(() -> {
            if (!OnboardingData.hasAcceptedTos()) {
                return;
            }
            else {
                Essential.logger.info("Connecting to Essential Connection Manager...");
                try {
                    this.connectionManager.connect();
                }
                catch (final Throwable t) {
                    t.printStackTrace();
                }
                return;
            }
        });
        final Net instance = Net.INSTANCE;
        if (this.wasNoraHere()) {
            final String newTitle = "Minecraft " + UMinecraft.getMinecraft().getGameVersion() + " (" + UMinecraft.getMinecraft().getSession().getUsername();
            UMinecraft.getMinecraft().getWindow().setTitle(newTitle);
        }
        this.registerListener(Notifications.INSTANCE);
        this.registerListener(new ReAuthChecker());
        if (OnboardingData.hasAcceptedTos()) {
            Essential.EVENT_BUS.post(new TosAcceptedEvent());
        }
        if (essentialConfig.getEssentialGuiScale() == -1) {
            essentialConfig.setEssentialGuiScale(essentialConfig.getOverrideGuiScale() ? 0 : 5);
            essentialConfig.markDirty();
        }
        if (essentialConfig.getCosmeticArmorSettingOther() == -1) {
            final int cosmeticArmorSetting = essentialConfig.getCosmeticArmorSetting();
            if (cosmeticArmorSetting == 0) {
                essentialConfig.setCosmeticArmorSettingOther(0);
                essentialConfig.setCosmeticArmorSettingSelf(0);
            }
            else if (cosmeticArmorSetting == 1) {
                essentialConfig.setCosmeticArmorSettingOther(0);
                essentialConfig.setCosmeticArmorSettingSelf(2);
            }
            else if (cosmeticArmorSetting == 2) {
                essentialConfig.setCosmeticArmorSettingOther(2);
                essentialConfig.setCosmeticArmorSettingSelf(2);
            }
            essentialConfig.markDirty();
        }
        try {
            InetAddresses.toAddrString(InetAddress.getByAddress(new byte[16]));
            LanServerPinger.class.getName();
            LanServerInfo.class.getName();
        }
        catch (final Throwable e2) {
            e2.printStackTrace();
        }
    }
    
    private File createEssentialDir() {
        final File baseDir = new File(UMinecraft.getMinecraft().runDirectory, "essential");
        if (!baseDir.exists()) {
            baseDir.mkdirs();
        }
        return baseDir;
    }
    
    private static InvokerType determineBestInvokerType() {
        if (System.getProperty("java.vm.name", "").contains("OpenJ9")) {
            return (InvokerType)new ReflectionInvoker();
        }
        try {
            final InvokerType lmfInvoker = new LMFInvoker();
            class Dummy
            {
                Dummy() {
                    super();
                }
                
                public void dummy(final Object obj) {
                }
            }
            lmfInvoker.setup(new Dummy(), Dummy.class, Object.class, Dummy.class.getMethod("dummy", Object.class));
            return lmfInvoker;
        }
        catch (final Throwable e) {
            Essential.logger.error("Could not set up LMFInvoker: ", e);
            return (InvokerType)new ReflectionInvoker();
        }
    }
    
    public boolean wasNoraHere() {
        return System.getProperty("essential.noraWasHere", "false").equals("true");
    }
    
    public List<SessionFactory> getSessionFactories() {
        return this.sessionFactories;
    }
    
    public File getBaseDir() {
        return this.baseDir;
    }
    
    public Lwjgl3Loader getLwjgl3() {
        return this.lwjgl3;
    }
    
    @NotNull
    @Override
    public CommandRegistry commandRegistry() {
        return EssentialCommandRegistry.INSTANCE;
    }
    
    @NotNull
    @Override
    public gg.essential.api.DI di() {
        return DI.INSTANCE;
    }
    
    @NotNull
    @Override
    public gg.essential.api.gui.Notifications notifications() {
        return Notifications.INSTANCE;
    }
    
    @NotNull
    @Override
    public gg.essential.api.config.EssentialConfig config() {
        return EssentialConfig.INSTANCE;
    }
    
    @NotNull
    @Override
    public gg.essential.api.utils.GuiUtil guiUtil() {
        return GuiUtil.INSTANCE;
    }
    
    @NotNull
    @Override
    public gg.essential.api.utils.MinecraftUtils minecraftUtil() {
        return MinecraftUtils.INSTANCE;
    }
    
    @NotNull
    @Override
    public ShutdownHookUtil shutdownHookUtil() {
        return ShutdownHook.INSTANCE;
    }
    
    @NotNull
    @Override
    public ImageCache imageCache() {
        return this.imageCache;
    }
    
    @NotNull
    @Override
    public TrustedHostsUtil trustedHostsUtil() {
        return gg.essential.util.TrustedHostsUtil.INSTANCE;
    }
    
    @NotNull
    @Override
    public EssentialComponentFactory componentFactory() {
        return ComponentFactory.INSTANCE;
    }
    
    @NotNull
    @Override
    public MojangAPI mojangAPI() {
        return (MojangAPI)gg.essential.util.MojangAPI.INSTANCE;
    }
    
    @NotNull
    @Override
    public gg.essential.api.data.OnboardingData onboardingData() {
        return OnboardingData.INSTANCE;
    }
    
    public PlayerWearableManager getPlayerWearableManager() {
        return this.playerWearableManager;
    }
    
    public AnimationEffectHandler getAnimationEffectHandler() {
        return this.animationEffectHandler;
    }
    
    public EssentialGameRules getGameRules() {
        return this.gameRules;
    }
    
    private /* synthetic */ void lambda$init$2() {
        if (!OnboardingData.hasAcceptedTos()) {
            return;
        }
        Essential.logger.info("Connecting to Essential Connection Manager...");
        try {
            this.connectionManager.connect();
        }
        catch (final Throwable t) {
            t.printStackTrace();
        }
    }
    
    private static /* synthetic */ boolean lambda$new$1() {
        return CosmeticStudio.getInstance() != null;
    }
    
    private static /* synthetic */ void lambda$static$0(final Exception e) {
        Essential.logger.error("Error occurred in method: {}", (Object)e.getMessage(), (Object)e);
    }
    
    static {
        GSON = new GsonBuilder().setPrettyPrinting().create();
        logger = LogManager.getLogger("Essential Logger");
        debug = LogManager.getLogger("Essential Logger - Debug");
        invoker = determineBestInvokerType();
        EVENT_BUS = new EventBus(Essential.invoker, e -> Essential.logger.error("Error occurred in method: {}", (Object)e.getMessage(), (Object)e));
        Essential.initialized = false;
        if (MinecraftUtils.INSTANCE.isDevelopment()) {
            final LoggerContext ctx = (LoggerContext)LogManager.getContext(false);
            final Configuration conf = ctx.getConfiguration();
            conf.getLoggerConfig("Essential Logger - Debug").setLevel(Level.ALL);
            ctx.updateLoggers(conf);
        }
    }
}
