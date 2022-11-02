package gg.essential.loader.stage1;

import net.fabricmc.loader.api.entrypoint.*;
import net.fabricmc.loader.api.*;

public class EssentialSetupPreLaunch implements PreLaunchEntrypoint
{
    private final EssentialLoader loader;
    
    public EssentialSetupPreLaunch(final PreLaunchEntrypoint stage0) throws Exception {
        super();
        final FabricLoader fabricLoader = FabricLoader.getInstance();
        final String mcVersion = fabricLoader.getModContainer("minecraft").map(it -> it.getMetadata().getVersion().getFriendlyString()).orElse("unknown");
        (this.loader = EssentialLoader.getInstance("fabric_" + mcVersion)).load(fabricLoader.getGameDir());
    }
    
    public void onPreLaunch() {
        this.loader.initialize();
    }
    
    private static /* synthetic */ String lambda$new$0(final ModContainer it) {
        return it.getMetadata().getVersion().getFriendlyString();
    }
}
