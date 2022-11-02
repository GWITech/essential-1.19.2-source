package gg.essential.api;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import gg.essential.api.commands.*;
import gg.essential.api.config.*;
import gg.essential.elementa.components.image.*;
import gg.essential.api.gui.*;
import gg.essential.api.utils.mojang.*;
import gg.essential.api.data.*;
import gg.essential.api.utils.*;
import kotlin.jvm.internal.*;
import org.kodein.di.*;
import org.kodein.type.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010	\u001a\u00020
                                                   H\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u001e""" }, d2 = { "Lgg/essential/api/EssentialAPI$Companion;", "", "()V", "instance", "Lgg/essential/api/EssentialAPI;", "getCommandRegistry", "Lgg/essential/api/commands/CommandRegistry;", "getConfig", "Lgg/essential/api/config/EssentialConfig;", "getDI", "Lgg/essential/api/DI;", "getEssentialComponentFactory", "Lgg/essential/api/gui/EssentialComponentFactory;", "getGuiUtil", "Lgg/essential/api/utils/GuiUtil;", "getImageCache", "Lgg/essential/elementa/components/image/ImageCache;", "getInstance", "getMinecraftUtil", "Lgg/essential/api/utils/MinecraftUtils;", "getMojangAPI", "Lgg/essential/api/utils/mojang/MojangAPI;", "getNotifications", "Lgg/essential/api/gui/Notifications;", "getOnboardingData", "Lgg/essential/api/data/OnboardingData;", "getShutdownHookUtil", "Lgg/essential/api/utils/ShutdownHookUtil;", "getTrustedHostsUtil", "Lgg/essential/api/utils/TrustedHostsUtil;", "essential-api" })
public static final class Companion
{
    static final /* synthetic */ Companion $$INSTANCE;
    @NotNull
    private static final EssentialAPI instance;
    
    private Companion() {
        super();
    }
    
    @JvmStatic
    @NotNull
    public final EssentialAPI getInstance() {
        return Companion.instance;
    }
    
    @JvmStatic
    @NotNull
    public final CommandRegistry getCommandRegistry() {
        return Companion.instance.commandRegistry();
    }
    
    @JvmStatic
    @NotNull
    public final DI getDI() {
        return Companion.instance.di();
    }
    
    @JvmStatic
    @NotNull
    public final Notifications getNotifications() {
        return Companion.instance.notifications();
    }
    
    @JvmStatic
    @NotNull
    public final EssentialConfig getConfig() {
        return Companion.instance.config();
    }
    
    @JvmStatic
    @NotNull
    public final GuiUtil getGuiUtil() {
        return Companion.instance.guiUtil();
    }
    
    @JvmStatic
    @NotNull
    public final MinecraftUtils getMinecraftUtil() {
        return Companion.instance.minecraftUtil();
    }
    
    @JvmStatic
    @NotNull
    public final ShutdownHookUtil getShutdownHookUtil() {
        return Companion.instance.shutdownHookUtil();
    }
    
    @JvmStatic
    @NotNull
    public final ImageCache getImageCache() {
        return Companion.instance.imageCache();
    }
    
    @JvmStatic
    @NotNull
    public final TrustedHostsUtil getTrustedHostsUtil() {
        return Companion.instance.trustedHostsUtil();
    }
    
    @JvmStatic
    @NotNull
    public final EssentialComponentFactory getEssentialComponentFactory() {
        return Companion.instance.componentFactory();
    }
    
    @JvmStatic
    @NotNull
    public final MojangAPI getMojangAPI() {
        return Companion.instance.mojangAPI();
    }
    
    @JvmStatic
    @NotNull
    public final OnboardingData getOnboardingData() {
        return Companion.instance.onboardingData();
    }
    
    static {
        $$INSTANCE = new Companion();
        final DI essentialDI = DiKt.getEssentialDI();
        Intrinsics.checkNotNull((Object)essentialDI);
        final DirectDIAware $this$instance_u24default$iv$iv = (DirectDIAware)DIAwareKt.getDirect((DIAware)essentialDI);
        final Object tag$iv$iv = null;
        instance = (EssentialAPI)$this$instance_u24default$iv$iv.getDirectDI().Instance((TypeToken)new GenericJVMTypeTokenDelegate(TypeTokensJVMKt.typeToken(new TypeReference<EssentialAPI>() {
            public EssentialAPI$Companion$special$$inlined$get$1() {
                super();
            }
        }.getSuperType()), (Class)EssentialAPI.class), tag$iv$iv);
    }
}
