package gg.essential.vigilance.gui;

import org.jetbrains.annotations.*;
import java.awt.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.vigilance.utils.*;
import kotlin.jvm.internal.*;
import gg.essential.vigilance.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bX\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010g\u001a\u00020\u0015J\u0006\u0010h\u001a\u00020\u0015J\u0006\u0010i\u001a\u00020\u0015J\u0006\u0010j\u001a\u00020\u0015J\u0006\u0010k\u001a\u00020\u0015J\u0006\u0010l\u001a\u00020\u0015J/\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00150n2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020p0n2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020p0nH\u0000¢\u0006\u0002\brJ\u0006\u0010s\u001a\u00020\u0015J\u0006\u0010t\u001a\u00020\u0015J\u0006\u0010u\u001a\u00020\u0015J\u0006\u0010v\u001a\u00020\u0015J\u0006\u0010w\u001a\u00020\u0015J\u0006\u0010x\u001a\u00020\u0015J\u0006\u0010y\u001a\u00020\u0015J\u0006\u0010z\u001a\u00020\u0015J\u0006\u0010{\u001a\u00020\u0015J\u0006\u0010|\u001a\u00020\u0015J\u0006\u0010}\u001a\u00020\u0015J\u0006\u0010~\u001a\u00020\u0015J\u0006\u0010\u007f\u001a\u00020\u0015J\u0007\u0010\u0080\u0001\u001a\u00020\u0015J\u0007\u0010\u0081\u0001\u001a\u00020\u0015J\u0007\u0010\u0082\u0001\u001a\u00020\u0015J\u0007\u0010\u0083\u0001\u001a\u00020\u0015J\u0007\u0010\u0084\u0001\u001a\u00020\u0015J\u0007\u0010\u0085\u0001\u001a\u00020\u0015J\u0007\u0010\u0086\u0001\u001a\u00020\u0015J\u0007\u0010\u0087\u0001\u001a\u00020\u0015J\u0007\u0010\u0088\u0001\u001a\u00020\u0015J\u0007\u0010\u0089\u0001\u001a\u00020\u0015J\u0007\u0010\u008a\u0001\u001a\u00020\u0015J\u0007\u0010\u008b\u0001\u001a\u00020\u0015J\u0007\u0010\u008c\u0001\u001a\u00020\u0015J\u0007\u0010\u008d\u0001\u001a\u00020\u0015J#\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150n2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020p0nH\u0000¢\u0006\u0003\b\u008f\u0001J1\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150n2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020p0n2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020p0nH\u0000¢\u0006\u0003\b\u008f\u0001J\u0007\u0010\u0090\u0001\u001a\u00020\u0015J\u0007\u0010\u0091\u0001\u001a\u00020\u0015J\u0007\u0010\u0092\u0001\u001a\u00020\u0015J\u0007\u0010\u0093\u0001\u001a\u00020\u0015J\u0007\u0010\u0094\u0001\u001a\u00020\u0015J\u0007\u0010\u0095\u0001\u001a\u00020\u0015R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\"\u0010!\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\"\u0010#\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\"\u0010%\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\"\u0010'\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\"\u0010)\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\"\u0010+\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018R\"\u0010-\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0018R\"\u0010/\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0018R\"\u00101\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0018R\"\u00103\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0018R\"\u00105\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0018R\"\u00107\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0018R\"\u00109\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0018R\"\u0010;\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0018R\"\u0010=\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0018R\"\u0010?\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0018R\"\u0010A\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0018R\"\u0010C\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0018R\"\u0010E\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0018R\"\u0010G\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0018R\"\u0010I\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0018R\"\u0010K\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0018R\"\u0010M\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0018R\"\u0010O\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0018R\"\u0010Q\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0018R\"\u0010S\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0018R\"\u0010U\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\u0018R\"\u0010W\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\u0018R\"\u0010Y\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0018R\"\u0010[\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010\u0018R\"\u0010]\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010\u0018R\"\u0010_\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\u0018R\"\u0010a\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\u0018R\"\u0010c\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010\u0018R\"\u0010e\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010\u0018¨\u0006\u0096\u0001" }, d2 = { "Lgg/essential/vigilance/gui/VigilancePalette;", "", "()V", "ARROW_DOWN_7X4", "Lgg/essential/vigilance/utils/ImageFactory;", "getARROW_DOWN_7X4$Vigilance", "()Lgg/essential/vigilance/utils/ImageFactory;", "ARROW_LEFT_4X7", "getARROW_LEFT_4X7$Vigilance", "ARROW_UP_7X4", "getARROW_UP_7X4$Vigilance", "CANCEL_5X", "getCANCEL_5X$Vigilance", "SEARCH_7X", "getSEARCH_7X$Vigilance", "TOGGLE_OFF_4X5", "getTOGGLE_OFF_4X5$Vigilance", "TOGGLE_ON_1X5", "getTOGGLE_ON_1X5$Vigilance", "accentState", "Lgg/essential/elementa/state/BasicState;", "Ljava/awt/Color;", "kotlin.jvm.PlatformType", "getAccentState$Vigilance", "()Lgg/essential/elementa/state/BasicState;", "backgroundState", "getBackgroundState$Vigilance", "bgNoAlpha", "getBgNoAlpha$Vigilance", "brightDividerState", "getBrightDividerState$Vigilance", "brightHighlightState", "getBrightHighlightState$Vigilance", "brightTextState", "getBrightTextState$Vigilance", "button", "getButton$Vigilance", "buttonHighlight", "getButtonHighlight$Vigilance", "componentBackground", "getComponentBackground$Vigilance", "componentBackgroundHighlight", "getComponentBackgroundHighlight$Vigilance", "componentBorder", "getComponentBorder$Vigilance", "componentBorderDark", "getComponentBorderDark$Vigilance", "componentHighlight", "getComponentHighlight$Vigilance", "darkBackgroundState", "getDarkBackgroundState$Vigilance", "darkDividerState", "getDarkDividerState$Vigilance", "darkHighlightState", "getDarkHighlightState$Vigilance", "darkTextState", "getDarkTextState$Vigilance", "disabledState", "getDisabledState$Vigilance", "dividerDark", "getDividerDark$Vigilance", "dividerState", "getDividerState$Vigilance", "highlightState", "getHighlightState$Vigilance", "lightBackgroundState", "getLightBackgroundState$Vigilance", "mainBackground", "getMainBackground$Vigilance", "midGray", "getMidGray$Vigilance", "midTextState", "getMidTextState$Vigilance", "modalBackgroundState", "getModalBackgroundState$Vigilance", "outlineState", "getOutlineState$Vigilance", "primary", "getPrimary$Vigilance", "scrollBarState", "getScrollBarState$Vigilance", "scrollbar", "getScrollbar$Vigilance", "searchBarBackgroundState", "getSearchBarBackgroundState$Vigilance", "successState", "getSuccessState$Vigilance", "text", "getText$Vigilance", "textActive", "getTextActive$Vigilance", "textDisabled", "getTextDisabled$Vigilance", "textHighlight", "getTextHighlight$Vigilance", "textShadow", "getTextShadow$Vigilance", "textWarning", "getTextWarning$Vigilance", "transparentState", "getTransparentState$Vigilance", "warningState", "getWarningState$Vigilance", "getAccent", "getBackground", "getBrightDivider", "getBrightHighlight", "getBrightText", "getButton", "getButtonColor", "Lgg/essential/elementa/state/State;", "hovered", "", "enabled", "getButtonColor$Vigilance", "getButtonHighlight", "getComponentBackground", "getComponentBackgroundHighlight", "getComponentBorder", "getComponentBorderDark", "getComponentHighlight", "getDarkBackground", "getDarkDivider", "getDarkHighlight", "getDarkText", "getDisabled", "getDivider", "getDividerDark", "getHighlight", "getLightBackground", "getMainBackground", "getMidGray", "getMidText", "getModalBackground", "getOutline", "getPrimary", "getScrollBar", "getScrollbar", "getSearchBarBackground", "getSuccess", "getText", "getTextActive", "getTextColor", "getTextColor$Vigilance", "getTextDisabled", "getTextHighlight", "getTextShadow", "getTextWarning", "getTransparent", "getWarning", "Vigilance" })
public final class VigilancePalette
{
    @NotNull
    public static final VigilancePalette INSTANCE;
    @NotNull
    private static final BasicState<Color> brightDividerState;
    @NotNull
    private static final BasicState<Color> dividerState;
    @NotNull
    private static final BasicState<Color> darkDividerState;
    @NotNull
    private static final BasicState<Color> outlineState;
    @NotNull
    private static final BasicState<Color> scrollBarState;
    @NotNull
    private static final BasicState<Color> brightHighlightState;
    @NotNull
    private static final BasicState<Color> highlightState;
    @NotNull
    private static final BasicState<Color> darkHighlightState;
    @NotNull
    private static final BasicState<Color> lightBackgroundState;
    @NotNull
    private static final BasicState<Color> backgroundState;
    @NotNull
    private static final BasicState<Color> darkBackgroundState;
    @NotNull
    private static final BasicState<Color> searchBarBackgroundState;
    @NotNull
    private static final BasicState<Color> brightTextState;
    @NotNull
    private static final BasicState<Color> midTextState;
    @NotNull
    private static final BasicState<Color> darkTextState;
    @NotNull
    private static final BasicState<Color> modalBackgroundState;
    @NotNull
    private static final BasicState<Color> warningState;
    @NotNull
    private static final BasicState<Color> accentState;
    @NotNull
    private static final BasicState<Color> successState;
    @NotNull
    private static final BasicState<Color> transparentState;
    @NotNull
    private static final BasicState<Color> disabledState;
    @NotNull
    private static final BasicState<Color> bgNoAlpha;
    @NotNull
    private static final BasicState<Color> primary;
    @NotNull
    private static final BasicState<Color> componentBorderDark;
    @NotNull
    private static final BasicState<Color> midGray;
    @NotNull
    private static final BasicState<Color> button;
    @NotNull
    private static final BasicState<Color> buttonHighlight;
    @NotNull
    private static final BasicState<Color> text;
    @NotNull
    private static final BasicState<Color> textHighlight;
    @NotNull
    private static final BasicState<Color> textDisabled;
    @NotNull
    private static final BasicState<Color> textWarning;
    @NotNull
    private static final BasicState<Color> componentBackground;
    @NotNull
    private static final BasicState<Color> componentBackgroundHighlight;
    @NotNull
    private static final BasicState<Color> componentBorder;
    @NotNull
    private static final BasicState<Color> componentHighlight;
    @NotNull
    private static final BasicState<Color> dividerDark;
    @NotNull
    private static final BasicState<Color> scrollbar;
    @NotNull
    private static final BasicState<Color> textShadow;
    @NotNull
    private static final BasicState<Color> mainBackground;
    @NotNull
    private static final BasicState<Color> textActive;
    @NotNull
    private static final ImageFactory SEARCH_7X;
    @NotNull
    private static final ImageFactory CANCEL_5X;
    @NotNull
    private static final ImageFactory ARROW_LEFT_4X7;
    @NotNull
    private static final ImageFactory ARROW_UP_7X4;
    @NotNull
    private static final ImageFactory ARROW_DOWN_7X4;
    @NotNull
    private static final ImageFactory TOGGLE_ON_1X5;
    @NotNull
    private static final ImageFactory TOGGLE_OFF_4X5;
    
    private VigilancePalette() {
        super();
    }
    
    @NotNull
    public final Color getBrightDivider() {
        final Color value = VigilancePalette.brightDividerState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "brightDividerState.get()");
        return value;
    }
    
    @NotNull
    public final Color getDivider() {
        final Color value = VigilancePalette.dividerState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "dividerState.get()");
        return value;
    }
    
    @NotNull
    public final Color getDarkDivider() {
        final Color value = VigilancePalette.darkDividerState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "darkDividerState.get()");
        return value;
    }
    
    @NotNull
    public final Color getOutline() {
        final Color value = VigilancePalette.outlineState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "outlineState.get()");
        return value;
    }
    
    @NotNull
    public final Color getScrollBar() {
        final Color value = VigilancePalette.scrollBarState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "scrollBarState.get()");
        return value;
    }
    
    @NotNull
    public final Color getBrightHighlight() {
        final Color value = VigilancePalette.brightHighlightState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "brightHighlightState.get()");
        return value;
    }
    
    @NotNull
    public final Color getHighlight() {
        final Color value = VigilancePalette.highlightState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "highlightState.get()");
        return value;
    }
    
    @NotNull
    public final Color getDarkHighlight() {
        final Color value = VigilancePalette.darkHighlightState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "darkHighlightState.get()");
        return value;
    }
    
    @NotNull
    public final Color getLightBackground() {
        final Color value = VigilancePalette.lightBackgroundState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "lightBackgroundState.get()");
        return value;
    }
    
    @NotNull
    public final Color getBackground() {
        final Color value = VigilancePalette.backgroundState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "backgroundState.get()");
        return value;
    }
    
    @NotNull
    public final Color getDarkBackground() {
        final Color value = VigilancePalette.darkBackgroundState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "darkBackgroundState.get()");
        return value;
    }
    
    @NotNull
    public final Color getSearchBarBackground() {
        final Color value = VigilancePalette.searchBarBackgroundState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "searchBarBackgroundState.get()");
        return value;
    }
    
    @NotNull
    public final Color getBrightText() {
        final Color value = VigilancePalette.brightTextState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "brightTextState.get()");
        return value;
    }
    
    @NotNull
    public final Color getMidText() {
        final Color value = VigilancePalette.midTextState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "midTextState.get()");
        return value;
    }
    
    @NotNull
    public final Color getDarkText() {
        final Color value = VigilancePalette.darkTextState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "darkTextState.get()");
        return value;
    }
    
    @NotNull
    public final Color getModalBackground() {
        final Color value = VigilancePalette.modalBackgroundState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "modalBackgroundState.get()");
        return value;
    }
    
    @NotNull
    public final Color getWarning() {
        final Color value = VigilancePalette.warningState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "warningState.get()");
        return value;
    }
    
    @NotNull
    public final Color getAccent() {
        final Color value = VigilancePalette.accentState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "accentState.get()");
        return value;
    }
    
    @NotNull
    public final Color getSuccess() {
        final Color value = VigilancePalette.successState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "successState.get()");
        return value;
    }
    
    @NotNull
    public final Color getTransparent() {
        final Color value = VigilancePalette.transparentState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "transparentState.get()");
        return value;
    }
    
    @NotNull
    public final Color getDisabled() {
        final Color value = VigilancePalette.disabledState.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "disabledState.get()");
        return value;
    }
    
    @NotNull
    public final Color getPrimary() {
        final Color value = VigilancePalette.primary.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "primary.get()");
        return value;
    }
    
    @NotNull
    public final Color getComponentBorderDark() {
        final Color value = VigilancePalette.componentBorderDark.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "componentBorderDark.get()");
        return value;
    }
    
    @NotNull
    public final Color getMidGray() {
        final Color value = VigilancePalette.midGray.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "midGray.get()");
        return value;
    }
    
    @NotNull
    public final Color getButton() {
        final Color value = VigilancePalette.button.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "button.get()");
        return value;
    }
    
    @NotNull
    public final Color getButtonHighlight() {
        final Color value = VigilancePalette.buttonHighlight.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "buttonHighlight.get()");
        return value;
    }
    
    @NotNull
    public final Color getText() {
        final Color value = VigilancePalette.text.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "text.get()");
        return value;
    }
    
    @NotNull
    public final Color getTextHighlight() {
        final Color value = VigilancePalette.textHighlight.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "textHighlight.get()");
        return value;
    }
    
    @NotNull
    public final Color getTextDisabled() {
        final Color value = VigilancePalette.textDisabled.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "textDisabled.get()");
        return value;
    }
    
    @NotNull
    public final Color getTextWarning() {
        final Color value = VigilancePalette.textWarning.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "textWarning.get()");
        return value;
    }
    
    @NotNull
    public final Color getComponentBackground() {
        final Color value = VigilancePalette.componentBackground.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "componentBackground.get()");
        return value;
    }
    
    @NotNull
    public final Color getComponentBackgroundHighlight() {
        final Color value = VigilancePalette.componentBackgroundHighlight.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "componentBackgroundHighlight.get()");
        return value;
    }
    
    @NotNull
    public final Color getComponentBorder() {
        final Color value = VigilancePalette.componentBorder.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "componentBorder.get()");
        return value;
    }
    
    @NotNull
    public final Color getComponentHighlight() {
        final Color value = VigilancePalette.componentHighlight.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "componentHighlight.get()");
        return value;
    }
    
    @NotNull
    public final Color getDividerDark() {
        final Color value = VigilancePalette.dividerDark.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "dividerDark.get()");
        return value;
    }
    
    @NotNull
    public final Color getScrollbar() {
        final Color value = VigilancePalette.scrollbar.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "scrollbar.get()");
        return value;
    }
    
    @NotNull
    public final Color getTextShadow() {
        final Color value = VigilancePalette.textShadow.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "textShadow.get()");
        return value;
    }
    
    @NotNull
    public final Color getMainBackground() {
        final Color value = VigilancePalette.mainBackground.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "mainBackground.get()");
        return value;
    }
    
    @NotNull
    public final Color getTextActive() {
        final Color value = VigilancePalette.textActive.get();
        Intrinsics.checkNotNullExpressionValue((Object)value, "textActive.get()");
        return value;
    }
    
    @NotNull
    public final BasicState<Color> getBrightDividerState$Vigilance() {
        return VigilancePalette.brightDividerState;
    }
    
    @NotNull
    public final BasicState<Color> getDividerState$Vigilance() {
        return VigilancePalette.dividerState;
    }
    
    @NotNull
    public final BasicState<Color> getDarkDividerState$Vigilance() {
        return VigilancePalette.darkDividerState;
    }
    
    @NotNull
    public final BasicState<Color> getOutlineState$Vigilance() {
        return VigilancePalette.outlineState;
    }
    
    @NotNull
    public final BasicState<Color> getScrollBarState$Vigilance() {
        return VigilancePalette.scrollBarState;
    }
    
    @NotNull
    public final BasicState<Color> getBrightHighlightState$Vigilance() {
        return VigilancePalette.brightHighlightState;
    }
    
    @NotNull
    public final BasicState<Color> getHighlightState$Vigilance() {
        return VigilancePalette.highlightState;
    }
    
    @NotNull
    public final BasicState<Color> getDarkHighlightState$Vigilance() {
        return VigilancePalette.darkHighlightState;
    }
    
    @NotNull
    public final BasicState<Color> getLightBackgroundState$Vigilance() {
        return VigilancePalette.lightBackgroundState;
    }
    
    @NotNull
    public final BasicState<Color> getBackgroundState$Vigilance() {
        return VigilancePalette.backgroundState;
    }
    
    @NotNull
    public final BasicState<Color> getDarkBackgroundState$Vigilance() {
        return VigilancePalette.darkBackgroundState;
    }
    
    @NotNull
    public final BasicState<Color> getSearchBarBackgroundState$Vigilance() {
        return VigilancePalette.searchBarBackgroundState;
    }
    
    @NotNull
    public final BasicState<Color> getBrightTextState$Vigilance() {
        return VigilancePalette.brightTextState;
    }
    
    @NotNull
    public final BasicState<Color> getMidTextState$Vigilance() {
        return VigilancePalette.midTextState;
    }
    
    @NotNull
    public final BasicState<Color> getDarkTextState$Vigilance() {
        return VigilancePalette.darkTextState;
    }
    
    @NotNull
    public final BasicState<Color> getModalBackgroundState$Vigilance() {
        return VigilancePalette.modalBackgroundState;
    }
    
    @NotNull
    public final BasicState<Color> getWarningState$Vigilance() {
        return VigilancePalette.warningState;
    }
    
    @NotNull
    public final BasicState<Color> getAccentState$Vigilance() {
        return VigilancePalette.accentState;
    }
    
    @NotNull
    public final BasicState<Color> getSuccessState$Vigilance() {
        return VigilancePalette.successState;
    }
    
    @NotNull
    public final BasicState<Color> getTransparentState$Vigilance() {
        return VigilancePalette.transparentState;
    }
    
    @NotNull
    public final BasicState<Color> getDisabledState$Vigilance() {
        return VigilancePalette.disabledState;
    }
    
    @NotNull
    public final BasicState<Color> getBgNoAlpha$Vigilance() {
        return VigilancePalette.bgNoAlpha;
    }
    
    @NotNull
    public final BasicState<Color> getPrimary$Vigilance() {
        return VigilancePalette.primary;
    }
    
    @NotNull
    public final BasicState<Color> getComponentBorderDark$Vigilance() {
        return VigilancePalette.componentBorderDark;
    }
    
    @NotNull
    public final BasicState<Color> getMidGray$Vigilance() {
        return VigilancePalette.midGray;
    }
    
    @NotNull
    public final BasicState<Color> getButton$Vigilance() {
        return VigilancePalette.button;
    }
    
    @NotNull
    public final BasicState<Color> getButtonHighlight$Vigilance() {
        return VigilancePalette.buttonHighlight;
    }
    
    @NotNull
    public final BasicState<Color> getText$Vigilance() {
        return VigilancePalette.text;
    }
    
    @NotNull
    public final BasicState<Color> getTextHighlight$Vigilance() {
        return VigilancePalette.textHighlight;
    }
    
    @NotNull
    public final BasicState<Color> getTextDisabled$Vigilance() {
        return VigilancePalette.textDisabled;
    }
    
    @NotNull
    public final BasicState<Color> getTextWarning$Vigilance() {
        return VigilancePalette.textWarning;
    }
    
    @NotNull
    public final BasicState<Color> getComponentBackground$Vigilance() {
        return VigilancePalette.componentBackground;
    }
    
    @NotNull
    public final BasicState<Color> getComponentBackgroundHighlight$Vigilance() {
        return VigilancePalette.componentBackgroundHighlight;
    }
    
    @NotNull
    public final BasicState<Color> getComponentBorder$Vigilance() {
        return VigilancePalette.componentBorder;
    }
    
    @NotNull
    public final BasicState<Color> getComponentHighlight$Vigilance() {
        return VigilancePalette.componentHighlight;
    }
    
    @NotNull
    public final BasicState<Color> getDividerDark$Vigilance() {
        return VigilancePalette.dividerDark;
    }
    
    @NotNull
    public final BasicState<Color> getScrollbar$Vigilance() {
        return VigilancePalette.scrollbar;
    }
    
    @NotNull
    public final BasicState<Color> getTextShadow$Vigilance() {
        return VigilancePalette.textShadow;
    }
    
    @NotNull
    public final BasicState<Color> getMainBackground$Vigilance() {
        return VigilancePalette.mainBackground;
    }
    
    @NotNull
    public final BasicState<Color> getTextActive$Vigilance() {
        return VigilancePalette.textActive;
    }
    
    @NotNull
    public final ImageFactory getSEARCH_7X$Vigilance() {
        return VigilancePalette.SEARCH_7X;
    }
    
    @NotNull
    public final ImageFactory getCANCEL_5X$Vigilance() {
        return VigilancePalette.CANCEL_5X;
    }
    
    @NotNull
    public final ImageFactory getARROW_LEFT_4X7$Vigilance() {
        return VigilancePalette.ARROW_LEFT_4X7;
    }
    
    @NotNull
    public final ImageFactory getARROW_UP_7X4$Vigilance() {
        return VigilancePalette.ARROW_UP_7X4;
    }
    
    @NotNull
    public final ImageFactory getARROW_DOWN_7X4$Vigilance() {
        return VigilancePalette.ARROW_DOWN_7X4;
    }
    
    @NotNull
    public final ImageFactory getTOGGLE_ON_1X5$Vigilance() {
        return VigilancePalette.TOGGLE_ON_1X5;
    }
    
    @NotNull
    public final ImageFactory getTOGGLE_OFF_4X5$Vigilance() {
        return VigilancePalette.TOGGLE_OFF_4X5;
    }
    
    @NotNull
    public final State<Color> getTextColor$Vigilance(@NotNull final State<Boolean> hovered, @NotNull final State<Boolean> enabled) {
        Intrinsics.checkNotNullParameter((Object)hovered, "hovered");
        Intrinsics.checkNotNullParameter((Object)enabled, "enabled");
        return (State)hovered.zip((State<Object>)enabled).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Boolean, Object>, ?>)VigilancePalette$getTextColor.VigilancePalette$getTextColor$1.INSTANCE);
    }
    
    @NotNull
    public final State<Color> getTextColor$Vigilance(@NotNull final State<Boolean> hovered) {
        Intrinsics.checkNotNullParameter((Object)hovered, "hovered");
        return this.getTextColor$Vigilance(hovered, new BasicState<Boolean>(true));
    }
    
    @NotNull
    public final State<Color> getButtonColor$Vigilance(@NotNull final State<Boolean> hovered, @NotNull final State<Boolean> enabled) {
        Intrinsics.checkNotNullParameter((Object)hovered, "hovered");
        Intrinsics.checkNotNullParameter((Object)enabled, "enabled");
        return (State)hovered.zip((State<Object>)enabled).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Boolean, Object>, ?>)VigilancePalette$getButtonColor.VigilancePalette$getButtonColor$1.INSTANCE);
    }
    
    static {
        INSTANCE = new VigilancePalette();
        brightDividerState = new BasicState<Color>(Color.BLACK);
        dividerState = new BasicState<Color>(Color.BLACK);
        darkDividerState = new BasicState<Color>(Color.BLACK);
        outlineState = new BasicState<Color>(Color.BLACK);
        scrollBarState = new BasicState<Color>(Color.BLACK);
        brightHighlightState = new BasicState<Color>(Color.BLACK);
        highlightState = new BasicState<Color>(Color.BLACK);
        darkHighlightState = new BasicState<Color>(Color.BLACK);
        lightBackgroundState = new BasicState<Color>(Color.BLACK);
        backgroundState = new BasicState<Color>(Color.BLACK);
        darkBackgroundState = new BasicState<Color>(Color.BLACK);
        searchBarBackgroundState = new BasicState<Color>(Color.BLACK);
        brightTextState = new BasicState<Color>(Color.BLACK);
        midTextState = new BasicState<Color>(Color.BLACK);
        darkTextState = new BasicState<Color>(Color.BLACK);
        modalBackgroundState = new BasicState<Color>(Color.BLACK);
        warningState = new BasicState<Color>(Color.BLACK);
        accentState = new BasicState<Color>(Color.BLACK);
        successState = new BasicState<Color>(Color.BLACK);
        transparentState = new BasicState<Color>(Color.BLACK);
        disabledState = new BasicState<Color>(Color.BLACK);
        bgNoAlpha = new BasicState<Color>(Color.BLACK);
        primary = new BasicState<Color>(Color.BLACK);
        componentBorderDark = new BasicState<Color>(Color.BLACK);
        midGray = new BasicState<Color>(Color.GRAY);
        button = new BasicState<Color>(Color.BLACK);
        buttonHighlight = new BasicState<Color>(Color.BLACK);
        text = new BasicState<Color>(Color.BLACK);
        textHighlight = new BasicState<Color>(Color.WHITE);
        textDisabled = new BasicState<Color>(Color.BLACK);
        textWarning = new BasicState<Color>(Color.BLACK);
        componentBackground = new BasicState<Color>(Color.BLACK);
        componentBackgroundHighlight = new BasicState<Color>(Color.BLACK);
        componentBorder = new BasicState<Color>(Color.BLACK);
        componentHighlight = new BasicState<Color>(Color.BLACK);
        dividerDark = new BasicState<Color>(Color.BLACK);
        scrollbar = new BasicState<Color>(Color.BLACK);
        textShadow = new BasicState<Color>(Color.BLACK);
        mainBackground = new BasicState<Color>(Color.BLACK);
        textActive = new BasicState<Color>(Color.BLACK);
        SEARCH_7X = new ResourceImageFactory("/vigilance/search_7x7.png", false, 2, null);
        CANCEL_5X = new ResourceImageFactory("/vigilance/cancel_5x5.png", false, 2, null);
        ARROW_LEFT_4X7 = new ResourceImageFactory("/vigilance/arrow-left.png", false, 2, null);
        ARROW_UP_7X4 = new ResourceImageFactory("/vigilance/arrow_up.png", false, 2, null);
        ARROW_DOWN_7X4 = new ResourceImageFactory("/vigilance/arrow_down.png", false, 2, null);
        TOGGLE_ON_1X5 = new ResourceImageFactory("/vigilance/toggle_on.png", false, 2, null);
        TOGGLE_OFF_4X5 = new ResourceImageFactory("/vigilance/toggle_off.png", false, 2, null);
        VigilanceConfig.INSTANCE.setAllInPalette$Vigilance();
    }
}
