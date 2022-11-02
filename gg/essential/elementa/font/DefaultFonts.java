package gg.essential.elementa.font;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011" }, d2 = { "Lgg/essential/elementa/font/DefaultFonts;", "", "()V", "ELEMENTA_MINECRAFT_FONT_RENDERER", "Lgg/essential/elementa/font/FontProvider;", "getELEMENTA_MINECRAFT_FONT_RENDERER$annotations", "getELEMENTA_MINECRAFT_FONT_RENDERER", "()Lgg/essential/elementa/font/FontProvider;", "JETBRAINS_MONO_FONT_RENDERER", "getJETBRAINS_MONO_FONT_RENDERER$annotations", "getJETBRAINS_MONO_FONT_RENDERER", "MINECRAFT_FIVE", "getMINECRAFT_FIVE$annotations", "getMINECRAFT_FIVE", "VANILLA_FONT_RENDERER", "getVANILLA_FONT_RENDERER$annotations", "getVANILLA_FONT_RENDERER", "Elementa" })
public final class DefaultFonts
{
    @NotNull
    public static final DefaultFonts INSTANCE;
    @NotNull
    private static final FontProvider VANILLA_FONT_RENDERER;
    @NotNull
    private static final FontProvider ELEMENTA_MINECRAFT_FONT_RENDERER;
    @NotNull
    private static final FontProvider JETBRAINS_MONO_FONT_RENDERER;
    @NotNull
    private static final FontProvider MINECRAFT_FIVE;
    
    private DefaultFonts() {
        super();
    }
    
    @NotNull
    public static final FontProvider getVANILLA_FONT_RENDERER() {
        return DefaultFonts.VANILLA_FONT_RENDERER;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getVANILLA_FONT_RENDERER$annotations() {
    }
    
    @NotNull
    public static final FontProvider getELEMENTA_MINECRAFT_FONT_RENDERER() {
        return DefaultFonts.ELEMENTA_MINECRAFT_FONT_RENDERER;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getELEMENTA_MINECRAFT_FONT_RENDERER$annotations() {
    }
    
    @NotNull
    public static final FontProvider getJETBRAINS_MONO_FONT_RENDERER() {
        return DefaultFonts.JETBRAINS_MONO_FONT_RENDERER;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getJETBRAINS_MONO_FONT_RENDERER$annotations() {
    }
    
    @NotNull
    public static final FontProvider getMINECRAFT_FIVE() {
        return DefaultFonts.MINECRAFT_FIVE;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getMINECRAFT_FIVE$annotations() {
    }
    
    static {
        INSTANCE = new DefaultFonts();
        VANILLA_FONT_RENDERER = new VanillaFontRenderer();
        ELEMENTA_MINECRAFT_FONT_RENDERER = ElementaFonts.getMINECRAFT();
        JETBRAINS_MONO_FONT_RENDERER = ElementaFonts.getJETBRAINS_MONO();
        MINECRAFT_FIVE = ElementaFonts.getMINECRAFT_FIVE();
    }
}
