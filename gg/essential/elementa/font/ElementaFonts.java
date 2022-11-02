package gg.essential.elementa.font;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.font.data.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007R\u001c\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0007R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018" }, d2 = { "Lgg/essential/elementa/font/ElementaFonts;", "", "()V", "JETBRAINS_MONO", "Lgg/essential/elementa/font/FontRenderer;", "getJETBRAINS_MONO$annotations", "getJETBRAINS_MONO", "()Lgg/essential/elementa/font/FontRenderer;", "JETBRAINS_MONO_FONT", "Lgg/essential/elementa/font/data/Font;", "MINECRAFT", "getMINECRAFT$annotations", "getMINECRAFT", "MINECRAFT_BOLD", "getMINECRAFT_BOLD$annotations", "getMINECRAFT_BOLD", "MINECRAFT_BOLD_RAW", "MINECRAFT_FIVE", "Lgg/essential/elementa/font/BasicFontRenderer;", "getMINECRAFT_FIVE$annotations", "getMINECRAFT_FIVE", "()Lgg/essential/elementa/font/BasicFontRenderer;", "MINECRAFT_FIVE_FONT", "MINECRAFT_FONT", "Elementa" })
public final class ElementaFonts
{
    @NotNull
    public static final ElementaFonts INSTANCE;
    @NotNull
    private static final Font MINECRAFT_FONT;
    @NotNull
    private static final Font MINECRAFT_BOLD_RAW;
    @NotNull
    private static final Font JETBRAINS_MONO_FONT;
    @NotNull
    private static final Font MINECRAFT_FIVE_FONT;
    @NotNull
    private static final FontRenderer MINECRAFT;
    @NotNull
    private static final FontRenderer MINECRAFT_BOLD;
    @NotNull
    private static final FontRenderer JETBRAINS_MONO;
    @NotNull
    private static final BasicFontRenderer MINECRAFT_FIVE;
    
    private ElementaFonts() {
        super();
    }
    
    @NotNull
    public static final FontRenderer getMINECRAFT() {
        return ElementaFonts.MINECRAFT;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getMINECRAFT$annotations() {
    }
    
    @NotNull
    public static final FontRenderer getMINECRAFT_BOLD() {
        return ElementaFonts.MINECRAFT_BOLD;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getMINECRAFT_BOLD$annotations() {
    }
    
    @NotNull
    public static final FontRenderer getJETBRAINS_MONO() {
        return ElementaFonts.JETBRAINS_MONO;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getJETBRAINS_MONO$annotations() {
    }
    
    @NotNull
    public static final BasicFontRenderer getMINECRAFT_FIVE() {
        return ElementaFonts.MINECRAFT_FIVE;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getMINECRAFT_FIVE$annotations() {
    }
    
    static {
        INSTANCE = new ElementaFonts();
        MINECRAFT_FONT = Font.Companion.fromResource("/fonts/Minecraft-Regular");
        MINECRAFT_BOLD_RAW = Font.Companion.fromResource("/fonts/Minecraft-Bold");
        JETBRAINS_MONO_FONT = Font.Companion.fromResource("/fonts/JetBrainsMono-Regular");
        MINECRAFT_FIVE_FONT = Font.Companion.fromResource("/fonts/Minecraft-Five");
        MINECRAFT = new FontRenderer(ElementaFonts.MINECRAFT_FONT, ElementaFonts.MINECRAFT_BOLD_RAW);
        MINECRAFT_BOLD = new FontRenderer(ElementaFonts.MINECRAFT_BOLD_RAW, null, 2, null);
        JETBRAINS_MONO = new FontRenderer(ElementaFonts.JETBRAINS_MONO_FONT, null, 2, null);
        MINECRAFT_FIVE = new BasicFontRenderer(ElementaFonts.MINECRAFT_FIVE_FONT);
    }
}
