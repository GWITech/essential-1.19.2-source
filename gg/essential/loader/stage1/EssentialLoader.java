package gg.essential.loader.stage1;

import java.net.*;

public final class EssentialLoader extends EssentialLoaderBase
{
    private static EssentialLoader instance;
    
    public static synchronized EssentialLoader getInstance(final String gameVersion) {
        if (EssentialLoader.instance == null) {
            EssentialLoader.instance = new EssentialLoader(gameVersion);
        }
        return EssentialLoader.instance;
    }
    
    private EssentialLoader(final String gameVersion) {
        super("fabric", gameVersion);
    }
    
    @Override
    protected ClassLoader addToClassLoader(final URL stage2Url) {
        return new URLClassLoader(new URL[] { stage2Url }, this.getClass().getClassLoader());
    }
}
