package gg.essential.gui.screenshot.providers;

import kotlin.*;
import net.minecraft.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider$Companion;", "", "()V", "nextUniqueId", "", "nextResourceLocation", "Lnet/minecraft/util/Identifier;", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    private final synchronized Identifier nextResourceLocation() {
        final String s = "essential";
        final int access$getNextUniqueId$cp = MinecraftWindowedTextureProvider.access$getNextUniqueId$cp();
        MinecraftWindowedTextureProvider.access$setNextUniqueId$cp(access$getNextUniqueId$cp + 1);
        return new Identifier(s, "screenshots/" + access$getNextUniqueId$cp);
    }
    
    public static final /* synthetic */ Identifier access$nextResourceLocation(final Companion $this) {
        return $this.nextResourceLocation();
    }
    
    public Companion(final byte b) {
        this();
    }
}
