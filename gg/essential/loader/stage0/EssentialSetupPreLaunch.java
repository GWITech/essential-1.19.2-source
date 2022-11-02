package gg.essential.loader.stage0;

import net.fabricmc.loader.api.entrypoint.*;
import net.fabricmc.loader.api.*;
import java.net.*;
import java.nio.file.*;

public class EssentialSetupPreLaunch implements PreLaunchEntrypoint
{
    private static final String STAGE1_CLS = "gg.essential.loader.stage1.EssentialSetupPreLaunch";
    private final EssentialLoader loader;
    private final PreLaunchEntrypoint stage1;
    
    public EssentialSetupPreLaunch() {
        super();
        this.loader = new EssentialLoader("fabric");
        try {
            this.stage1 = this.loadStage1((PreLaunchEntrypoint)this);
        }
        catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    private PreLaunchEntrypoint loadStage1(final PreLaunchEntrypoint stage0) throws Exception {
        final Path stage1File = this.loader.loadStage1File(FabricLoader.getInstance().getGameDir());
        final URL stage1Url = stage1File.toUri().toURL();
        final URLClassLoader classLoader = new URLClassLoader(new URL[] { stage1Url }, this.getClass().getClassLoader());
        return (PreLaunchEntrypoint)Class.forName("gg.essential.loader.stage1.EssentialSetupPreLaunch", true, classLoader).getConstructor(PreLaunchEntrypoint.class).newInstance(stage0);
    }
    
    public void onPreLaunch() {
        this.stage1.onPreLaunch();
    }
}
