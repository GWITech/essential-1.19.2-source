package gg.essential.vigilance;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import gg.essential.vigilance.gui.*;
import gg.essential.elementa.utils.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010+\u001a\u00020,J\r\u0010-\u001a\u00020.H\u0000¢\u0006\u0002\b/R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060" }, d2 = { "Lgg/essential/vigilance/VigilanceConfig;", "", "()V", "accent", "Ljava/awt/Color;", "background", "brightDivider", "brightHighlight", "brightText", "button", "buttonHighlight", "componentBackground", "componentBackgroundHighlight", "componentBorder", "componentBorderDark", "componentHighlight", "darkBackground", "darkDivider", "darkHighlight", "darkText", "disabled", "divider", "dividerDark", "highlight", "lightBackground", "mainBackground", "midGray", "midText", "modalBackground", "outline", "primary", "scrollBar", "scrollbar", "searchBarBackground", "success", "text", "textActive", "textDisabled", "textHighlight", "textShadow", "textWarning", "transparent", "warning", "getPalette", "Lgg/essential/vigilance/gui/VigilancePalette;", "setAllInPalette", "", "setAllInPalette$Vigilance", "Vigilance" })
public final class VigilanceConfig
{
    @NotNull
    public static final VigilanceConfig INSTANCE;
    @NotNull
    private static Color brightDivider;
    @NotNull
    private static Color divider;
    @NotNull
    private static Color darkDivider;
    @NotNull
    private static Color outline;
    @NotNull
    private static Color scrollBar;
    @NotNull
    private static Color brightHighlight;
    @NotNull
    private static Color highlight;
    @NotNull
    private static Color darkHighlight;
    @NotNull
    private static Color lightBackground;
    @NotNull
    private static Color background;
    @NotNull
    private static Color darkBackground;
    @NotNull
    private static Color searchBarBackground;
    @NotNull
    private static Color brightText;
    @NotNull
    private static Color midText;
    @NotNull
    private static Color darkText;
    @NotNull
    private static Color modalBackground;
    @NotNull
    private static Color warning;
    @NotNull
    private static Color accent;
    @NotNull
    private static Color success;
    @NotNull
    private static Color transparent;
    @NotNull
    private static Color disabled;
    @NotNull
    private static Color primary;
    @NotNull
    private static Color componentBorderDark;
    @NotNull
    private static Color midGray;
    @NotNull
    private static Color button;
    @NotNull
    private static Color buttonHighlight;
    @NotNull
    private static Color text;
    @NotNull
    private static Color textHighlight;
    @NotNull
    private static Color textDisabled;
    @NotNull
    private static Color textWarning;
    @NotNull
    private static Color textShadow;
    @NotNull
    private static Color componentBackground;
    @NotNull
    private static Color componentBackgroundHighlight;
    @NotNull
    private static Color componentBorder;
    @NotNull
    private static Color componentHighlight;
    @NotNull
    private static Color dividerDark;
    @NotNull
    private static Color scrollbar;
    @NotNull
    private static Color mainBackground;
    @NotNull
    private static Color textActive;
    
    private VigilanceConfig() {
        super();
    }
    
    @NotNull
    public final VigilancePalette getPalette() {
        return VigilancePalette.INSTANCE;
    }
    
    public final void setAllInPalette$Vigilance() {
        VigilancePalette.INSTANCE.getBrightDividerState$Vigilance().set(VigilanceConfig.brightDivider);
        VigilancePalette.INSTANCE.getDividerState$Vigilance().set(VigilanceConfig.divider);
        VigilancePalette.INSTANCE.getDarkDividerState$Vigilance().set(VigilanceConfig.darkDivider);
        VigilancePalette.INSTANCE.getOutlineState$Vigilance().set(VigilanceConfig.outline);
        VigilancePalette.INSTANCE.getScrollBarState$Vigilance().set(VigilanceConfig.scrollBar);
        VigilancePalette.INSTANCE.getBrightHighlightState$Vigilance().set(VigilanceConfig.brightHighlight);
        VigilancePalette.INSTANCE.getHighlightState$Vigilance().set(VigilanceConfig.highlight);
        VigilancePalette.INSTANCE.getDarkHighlightState$Vigilance().set(VigilanceConfig.darkHighlight);
        VigilancePalette.INSTANCE.getLightBackgroundState$Vigilance().set(VigilanceConfig.lightBackground);
        VigilancePalette.INSTANCE.getBackgroundState$Vigilance().set(VigilanceConfig.background);
        VigilancePalette.INSTANCE.getDarkBackgroundState$Vigilance().set(VigilanceConfig.darkBackground);
        VigilancePalette.INSTANCE.getSearchBarBackgroundState$Vigilance().set(VigilanceConfig.searchBarBackground);
        VigilancePalette.INSTANCE.getBrightTextState$Vigilance().set(VigilanceConfig.brightText);
        VigilancePalette.INSTANCE.getMidTextState$Vigilance().set(VigilanceConfig.midText);
        VigilancePalette.INSTANCE.getDarkTextState$Vigilance().set(VigilanceConfig.darkText);
        VigilancePalette.INSTANCE.getModalBackgroundState$Vigilance().set(VigilanceConfig.modalBackground);
        VigilancePalette.INSTANCE.getWarningState$Vigilance().set(VigilanceConfig.warning);
        VigilancePalette.INSTANCE.getAccentState$Vigilance().set(VigilanceConfig.accent);
        VigilancePalette.INSTANCE.getSuccessState$Vigilance().set(VigilanceConfig.success);
        VigilancePalette.INSTANCE.getTransparentState$Vigilance().set(VigilanceConfig.transparent);
        VigilancePalette.INSTANCE.getDisabledState$Vigilance().set(VigilanceConfig.disabled);
        VigilancePalette.INSTANCE.getBgNoAlpha$Vigilance().set(ExtensionsKt.withAlpha(VigilanceConfig.background, 0));
        VigilancePalette.INSTANCE.getPrimary$Vigilance().set(VigilanceConfig.primary);
        VigilancePalette.INSTANCE.getComponentBorderDark$Vigilance().set(VigilanceConfig.componentBorderDark);
        VigilancePalette.INSTANCE.getMidGray$Vigilance().set(VigilanceConfig.midGray);
        VigilancePalette.INSTANCE.getButton$Vigilance().set(VigilanceConfig.button);
        VigilancePalette.INSTANCE.getButtonHighlight$Vigilance().set(VigilanceConfig.buttonHighlight);
        VigilancePalette.INSTANCE.getText$Vigilance().set(VigilanceConfig.text);
        VigilancePalette.INSTANCE.getTextHighlight$Vigilance().set(VigilanceConfig.textHighlight);
        VigilancePalette.INSTANCE.getTextDisabled$Vigilance().set(VigilanceConfig.textDisabled);
        VigilancePalette.INSTANCE.getTextWarning$Vigilance().set(VigilanceConfig.textWarning);
        VigilancePalette.INSTANCE.getComponentBackground$Vigilance().set(VigilanceConfig.componentBackground);
        VigilancePalette.INSTANCE.getComponentBackgroundHighlight$Vigilance().set(VigilanceConfig.componentBackgroundHighlight);
        VigilancePalette.INSTANCE.getComponentBorder$Vigilance().set(VigilanceConfig.componentBorder);
        VigilancePalette.INSTANCE.getComponentHighlight$Vigilance().set(VigilanceConfig.componentHighlight);
        VigilancePalette.INSTANCE.getDividerDark$Vigilance().set(VigilanceConfig.dividerDark);
        VigilancePalette.INSTANCE.getScrollbar$Vigilance().set(VigilanceConfig.scrollbar);
        VigilancePalette.INSTANCE.getTextShadow$Vigilance().set(VigilanceConfig.textShadow);
        VigilancePalette.INSTANCE.getMainBackground$Vigilance().set(VigilanceConfig.mainBackground);
        VigilancePalette.INSTANCE.getTextActive$Vigilance().set(VigilanceConfig.textActive);
    }
    
    static {
        INSTANCE = new VigilanceConfig();
        VigilanceConfig.brightDivider = new Color(151, 151, 151);
        VigilanceConfig.divider = new Color(80, 80, 80);
        VigilanceConfig.darkDivider = new Color(50, 50, 50);
        VigilanceConfig.outline = new Color(48, 48, 49);
        VigilanceConfig.scrollBar = new Color(45, 45, 45);
        VigilanceConfig.brightHighlight = new Color(50, 50, 50);
        VigilanceConfig.highlight = new Color(33, 34, 38);
        VigilanceConfig.darkHighlight = new Color(27, 28, 33);
        VigilanceConfig.lightBackground = new Color(32, 32, 33);
        VigilanceConfig.background = new Color(22, 22, 24);
        VigilanceConfig.darkBackground = new Color(10, 10, 11);
        VigilanceConfig.searchBarBackground = new Color(27, 28, 33);
        VigilanceConfig.brightText = new Color(255, 255, 255);
        VigilanceConfig.midText = new Color(187, 187, 187);
        VigilanceConfig.darkText = new Color(119, 119, 121);
        VigilanceConfig.modalBackground = new Color(0, 0, 0, 100);
        VigilanceConfig.warning = new Color(239, 83, 80);
        VigilanceConfig.accent = new Color(1, 165, 82);
        VigilanceConfig.success = new Color(1, 165, 82);
        VigilanceConfig.transparent = new Color(0, 0, 0, 0);
        VigilanceConfig.disabled = new Color(80, 80, 80);
        VigilanceConfig.primary = new Color(2725887);
        VigilanceConfig.componentBorderDark = new Color(0);
        VigilanceConfig.midGray = new Color(9671571);
        VigilanceConfig.button = new Color(3289650);
        VigilanceConfig.buttonHighlight = new Color(4671303);
        VigilanceConfig.text = new Color(12303291);
        VigilanceConfig.textHighlight = new Color(16777215);
        VigilanceConfig.textDisabled = new Color(6974058);
        VigilanceConfig.textWarning = new Color(16077647);
        VigilanceConfig.textShadow = new Color(1447448);
        VigilanceConfig.componentBackground = new Color(2302755);
        VigilanceConfig.componentBackgroundHighlight = new Color(3092271);
        VigilanceConfig.componentBorder = new Color(4671303);
        VigilanceConfig.componentHighlight = new Color(3158064);
        VigilanceConfig.dividerDark = new Color(2302755);
        VigilanceConfig.scrollbar = new Color(5526612);
        VigilanceConfig.mainBackground = new Color(1579032);
        VigilanceConfig.textActive = new Color(2725887);
    }
}
