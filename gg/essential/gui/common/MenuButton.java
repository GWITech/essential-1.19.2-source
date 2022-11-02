package gg.essential.gui.common;

import kotlin.reflect.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.shadow.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import kotlin.jvm.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.image.*;
import java.awt.*;
import gg.essential.gui.*;
import kotlin.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import gg.essential.elementa.font.*;
import gg.essential.elementa.utils.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.shader.*;
import gg.essential.universal.*;
import net.minecraft.client.render.*;
import java.util.*;
import gg.essential.elementa.effects.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u009a\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\r
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\r
                                                   \u0002\u0010\b
                                                   \u0002\b\u0006\u0018\u0000 f2\u00020\u0001:\u0003efgB\u008b\u0001\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010	\u001a\u00020
                                                   \u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\u0010\u0014B\u008f\u0001\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010	\u001a\u00020
                                                   \u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\u0010\u0015J(\u0010@\u001a\u00020\u00002\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\b\b\u0002\u0010B\u001a\u00020\f2\b\b\u0002\u0010C\u001a\u00020\fJ\u001a\u0010D\u001a\u00020\u00132\b\b\u0002\u0010B\u001a\u00020\f2\b\b\u0002\u0010C\u001a\u00020\fJ\u0010\u0010E\u001a\u00020\u00132\u0006\u0010F\u001a\u00020GH\u0016J\u0006\u0010H\u001a\u00020\u0013J\u0014\u0010I\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0014\u0010J\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0014\u0010K\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005J\u0014\u0010L\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J"\u0010M\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010N\u001a\u00020\u0013Jo\u0010O\u001a\u00020\u00002\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u00052\b\b\u0002\u0010R\u001a\u00020\u000f2\u000e\b\u0002\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u00052
                                                   \b\u0002\u0010U\u001a\u0004\u0018\u00010\f2
                                                   \b\u0002\u0010V\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010W\u001a\u00020\f2\b\b\u0002\u0010X\u001a\u00020\f2\u000e\b\u0002\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005¢\u0006\u0002\u0010ZJj\u0010[\u001a\u00020\u00002\f\u0010\\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010]\u001a\u00020\u000f2\u000e\b\u0002\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\b\b\u0002\u0010^\u001a\u00020
                                                   2\b\b\u0002\u0010_\u001a\u00020\u000f2\b\b\u0002\u0010`\u001a\u00020\u000f2\b\b\u0002\u0010W\u001a\u00020\f2\b\b\u0002\u0010X\u001a\u00020\f2\b\b\u0002\u0010a\u001a\u00020bJ\u0018\u0010[\u001a\u00020\u00002\u0006\u0010\\u001a\u00020\u00032\b\b\u0002\u0010]\u001a\u00020\u000fJ\u0018\u0010c\u001a\u00020\u00032\u0006\u0010d\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\fH\u0002R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0019\u001a\u00020\fX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0016\u0010\r\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u001a\u001a\u00020\fX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u001b\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0&¢\u0006\b
                                                   \u0000\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R+\u0010*\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030+\u0012\u0004\u0012\u00020\u000f0\u0018¢\u0006\b
                                                   \u0000\u001a\u0004\b*\u0010,R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b1\u00102\u001a\u0004\b/\u00100R(\u00103\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\f0+\u0012\u0004\u0012\u00020\u00030\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002
                                                   \u0000R&\u0010:\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0+\u0012\u0004\u0012\u00020\u000f0\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000RJ\u0010;\u001a>\u00124\u00122\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0+\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060+0+0+\u0012\u0004\u0012\u00020\u00060\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010	\u001a\u00020
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000R6\u0010<\u001a*\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030+0+\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006h""" }, d2 = { "Lgg/essential/gui/common/MenuButton;", "Lgg/essential/elementa/UIComponent;", "buttonText", "", "defaultStyle", "Lgg/essential/elementa/state/State;", "Lgg/essential/gui/common/MenuButton$Style;", "hoverStyle", "disabledStyle", "textAlignment", "Lgg/essential/gui/common/MenuButton$Alignment;", "textXOffset", "", "collapsedText", "truncate", "", "clickSound", "action", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;FLgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;)V", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;FLgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;)V", "availableLabelWidth", "collapsed", "Lgg/essential/elementa/state/MappedState;", "collapsedHeight", "collapsedWidth", "enabled", "getEnabled", "()Z", "enabled$delegate", "Lgg/essential/gui/common/ReadOnlyState;", "enabledState", "hasBottom", "hasLeft", "hasRight", "hasTop", "hoveredStyleOverrides", "Lgg/essential/elementa/state/BasicState;", "getHoveredStyleOverrides", "()Lgg/essential/elementa/state/BasicState;", "iconVisible", "isTruncated", "Lkotlin/Pair;", "()Lgg/essential/elementa/state/MappedState;", "label", "Lgg/essential/elementa/components/UIText;", "getLabel", "()Lgg/essential/elementa/components/UIText;", "label$delegate", "Lkotlin/properties/ReadWriteProperty;", "labelState", "originalHeight", "Lgg/essential/elementa/constraints/HeightConstraint;", "originalWidth", "Lgg/essential/elementa/constraints/WidthConstraint;", "shadowIcon", "Lgg/essential/gui/common/shadow/ShadowIcon;", "styleHover", "styleState", "textState", "tooltip", "Lgg/essential/gui/common/Tooltip;", "tooltipHover", "bindCollapsed", "state", "width", "height", "collapse", "draw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "expand", "rebindDefaultStyle", "rebindDisabledStyle", "rebindEnabled", "rebindHoverStyle", "rebindStyle", "runAction", "setIcon", "icon", "Lgg/essential/gui/image/ImageFactory;", "rightAligned", "color", "Ljava/awt/Color;", "iconWidth", "iconHeight", "xOffset", "yOffset", "visibleState", "(Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;)Lgg/essential/gui/common/MenuButton;", "setTooltip", "tooltipText", "above", "xAlignment", "followCursorX", "followCursorY", "notchSize", "", "truncateLabel", "text", "Alignment", "Companion", "Style", "essential" })
public final class MenuButton extends UIComponent
{
    @NotNull
    public static final Companion Companion;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final State<String> buttonText;
    @NotNull
    private final Alignment textAlignment;
    private final float textXOffset;
    @NotNull
    private final State<String> collapsedText;
    private final boolean truncate;
    private final boolean clickSound;
    @NotNull
    private final Function0<Unit> action;
    @NotNull
    private final BasicState<Boolean> hoveredStyleOverrides;
    @NotNull
    private final State<Boolean> tooltipHover;
    @NotNull
    private final MappedState<Pair<Boolean, Boolean>, Boolean> styleHover;
    @NotNull
    private final MappedState<Boolean, Boolean> collapsed;
    @NotNull
    private final MappedState<Boolean, Boolean> enabledState;
    private float collapsedWidth;
    private float collapsedHeight;
    @NotNull
    private final MappedState<Style, Style> defaultStyle;
    @NotNull
    private final MappedState<Style, Style> hoverStyle;
    @NotNull
    private final MappedState<Style, Style> disabledStyle;
    @NotNull
    private final MappedState<Pair<Boolean, Pair<String, String>>, String> textState;
    @NotNull
    private final State<Float> availableLabelWidth;
    @NotNull
    private final MappedState<Pair<String, Float>, String> labelState;
    @NotNull
    private final MappedState<Pair<String, String>, Boolean> isTruncated;
    @NotNull
    private final MappedState<Pair<Pair<Boolean, Boolean>, Pair<Style, Pair<Style, Style>>>, Style> styleState;
    @NotNull
    private final MappedState<Boolean, Boolean> iconVisible;
    @Nullable
    private ShadowIcon shadowIcon;
    @NotNull
    private WidthConstraint originalWidth;
    @NotNull
    private HeightConstraint originalHeight;
    @NotNull
    private final MappedState<Style, Boolean> hasLeft;
    @NotNull
    private final MappedState<Style, Boolean> hasRight;
    @NotNull
    private final MappedState<Style, Boolean> hasTop;
    @NotNull
    private final MappedState<Style, Boolean> hasBottom;
    @NotNull
    private final ReadOnlyState enabled$delegate;
    @NotNull
    private final ReadWriteProperty label$delegate;
    @NotNull
    private static final Style GRAY;
    @NotNull
    private static final Style DARK_GRAY;
    @NotNull
    private static final Style GREEN;
    @NotNull
    private static final Style BLUE;
    @NotNull
    private static final Style BLUE_DISABLED;
    @NotNull
    private static final Style LIGHT_BLUE;
    @NotNull
    private static final Style RED;
    @NotNull
    private static final Style LIGHT_RED;
    @NotNull
    private static final Style RED_DISABLED;
    
    @JvmOverloads
    public MenuButton(@NotNull final State<String> buttonText, @NotNull final State<Style> defaultStyle, @NotNull final State<Style> hoverStyle, @NotNull final State<Style> disabledStyle, @NotNull final Alignment textAlignment, final float textXOffset, @NotNull final State<String> collapsedText, final boolean truncate, final boolean clickSound, @NotNull final Function0<Unit> action) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "buttonText"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* defaultStyle */
        //     7: ldc             "defaultStyle"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* hoverStyle */
        //    13: ldc             "hoverStyle"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload           disabledStyle
        //    20: ldc             "disabledStyle"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: aload           textAlignment
        //    27: ldc             "textAlignment"
        //    29: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    32: aload           collapsedText
        //    34: ldc             "collapsedText"
        //    36: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    39: aload           action
        //    41: ldc             "action"
        //    43: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    46: aload_0         /* this */
        //    47: invokespecial   gg/essential/elementa/UIComponent.<init>:()V
        //    50: aload_0         /* this */
        //    51: aload_1         /* buttonText */
        //    52: putfield        gg/essential/gui/common/MenuButton.buttonText:Lgg/essential/elementa/state/State;
        //    55: aload_0         /* this */
        //    56: aload           textAlignment
        //    58: putfield        gg/essential/gui/common/MenuButton.textAlignment:Lgg/essential/gui/common/MenuButton$Alignment;
        //    61: aload_0         /* this */
        //    62: fload           textXOffset
        //    64: putfield        gg/essential/gui/common/MenuButton.textXOffset:F
        //    67: aload_0         /* this */
        //    68: aload           collapsedText
        //    70: putfield        gg/essential/gui/common/MenuButton.collapsedText:Lgg/essential/elementa/state/State;
        //    73: aload_0         /* this */
        //    74: iload           truncate
        //    76: putfield        gg/essential/gui/common/MenuButton.truncate:Z
        //    79: aload_0         /* this */
        //    80: iload           clickSound
        //    82: putfield        gg/essential/gui/common/MenuButton.clickSound:Z
        //    85: aload_0         /* this */
        //    86: aload           action
        //    88: putfield        gg/essential/gui/common/MenuButton.action:Lkotlin/jvm/functions/Function0;
        //    91: aload_0         /* this */
        //    92: new             Lgg/essential/elementa/state/BasicState;
        //    95: dup            
        //    96: iconst_0       
        //    97: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   100: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   103: putfield        gg/essential/gui/common/MenuButton.hoveredStyleOverrides:Lgg/essential/elementa/state/BasicState;
        //   106: aload_0         /* this */
        //   107: aload_0         /* this */
        //   108: checkcast       Lgg/essential/elementa/UIComponent;
        //   111: iconst_0       
        //   112: iconst_0       
        //   113: iconst_3       
        //   114: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   117: putfield        gg/essential/gui/common/MenuButton.tooltipHover:Lgg/essential/elementa/state/State;
        //   120: aload_0         /* this */
        //   121: aload_0         /* this */
        //   122: checkcast       Lgg/essential/elementa/UIComponent;
        //   125: iconst_0       
        //   126: iconst_0       
        //   127: iconst_1       
        //   128: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   131: aload_0         /* this */
        //   132: getfield        gg/essential/gui/common/MenuButton.hoveredStyleOverrides:Lgg/essential/elementa/state/BasicState;
        //   135: checkcast       Lgg/essential/elementa/state/State;
        //   138: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   141: putfield        gg/essential/gui/common/MenuButton.styleHover:Lgg/essential/elementa/state/MappedState;
        //   144: aload_0         /* this */
        //   145: new             Lgg/essential/elementa/state/BasicState;
        //   148: dup            
        //   149: iconst_0       
        //   150: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   153: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   156: getstatic       gg/essential/gui/common/MenuButton$collapsed$1.INSTANCE:Lgg/essential/gui/common/MenuButton$collapsed$1;
        //   159: checkcast       Lkotlin/jvm/functions/Function1;
        //   162: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   165: putfield        gg/essential/gui/common/MenuButton.collapsed:Lgg/essential/elementa/state/MappedState;
        //   168: aload_0         /* this */
        //   169: new             Lgg/essential/elementa/state/BasicState;
        //   172: dup            
        //   173: iconst_1       
        //   174: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   177: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   180: getstatic       gg/essential/gui/common/MenuButton$enabledState$1.INSTANCE:Lgg/essential/gui/common/MenuButton$enabledState$1;
        //   183: checkcast       Lkotlin/jvm/functions/Function1;
        //   186: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   189: putfield        gg/essential/gui/common/MenuButton.enabledState:Lgg/essential/elementa/state/MappedState;
        //   192: aload_0         /* this */
        //   193: aload_2         /* defaultStyle */
        //   194: getstatic       gg/essential/gui/common/MenuButton$defaultStyle$1.INSTANCE:Lgg/essential/gui/common/MenuButton$defaultStyle$1;
        //   197: checkcast       Lkotlin/jvm/functions/Function1;
        //   200: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   203: putfield        gg/essential/gui/common/MenuButton.defaultStyle:Lgg/essential/elementa/state/MappedState;
        //   206: aload_0         /* this */
        //   207: aload_3         /* hoverStyle */
        //   208: getstatic       gg/essential/gui/common/MenuButton$hoverStyle$1.INSTANCE:Lgg/essential/gui/common/MenuButton$hoverStyle$1;
        //   211: checkcast       Lkotlin/jvm/functions/Function1;
        //   214: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   217: putfield        gg/essential/gui/common/MenuButton.hoverStyle:Lgg/essential/elementa/state/MappedState;
        //   220: aload_0         /* this */
        //   221: aload           disabledStyle
        //   223: getstatic       gg/essential/gui/common/MenuButton$disabledStyle$1.INSTANCE:Lgg/essential/gui/common/MenuButton$disabledStyle$1;
        //   226: checkcast       Lkotlin/jvm/functions/Function1;
        //   229: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   232: putfield        gg/essential/gui/common/MenuButton.disabledStyle:Lgg/essential/elementa/state/MappedState;
        //   235: aload_0         /* this */
        //   236: aload_0         /* this */
        //   237: getfield        gg/essential/gui/common/MenuButton.collapsed:Lgg/essential/elementa/state/MappedState;
        //   240: aload_0         /* this */
        //   241: getfield        gg/essential/gui/common/MenuButton.buttonText:Lgg/essential/elementa/state/State;
        //   244: aload_0         /* this */
        //   245: getfield        gg/essential/gui/common/MenuButton.collapsedText:Lgg/essential/elementa/state/State;
        //   248: invokevirtual   gg/essential/elementa/state/State.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   251: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   254: getstatic       gg/essential/gui/common/MenuButton$textState$1.INSTANCE:Lgg/essential/gui/common/MenuButton$textState$1;
        //   257: checkcast       Lkotlin/jvm/functions/Function1;
        //   260: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   263: putfield        gg/essential/gui/common/MenuButton.textState:Lgg/essential/elementa/state/MappedState;
        //   266: aload_0         /* this */
        //   267: aload_0         /* this */
        //   268: checkcast       Lgg/essential/elementa/UIComponent;
        //   271: ldc_w           91.0
        //   274: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   277: new             Lgg/essential/gui/common/MenuButton$availableLabelWidth$1;
        //   280: dup            
        //   281: aload_0         /* this */
        //   282: invokespecial   gg/essential/gui/common/MenuButton$availableLabelWidth$1.<init>:(Lgg/essential/gui/common/MenuButton;)V
        //   285: checkcast       Lkotlin/jvm/functions/Function0;
        //   288: invokestatic    gg/essential/util/ExtensionsKt.pollingState:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;
        //   291: putfield        gg/essential/gui/common/MenuButton.availableLabelWidth:Lgg/essential/elementa/state/State;
        //   294: aload_0         /* this */
        //   295: aload_0         /* this */
        //   296: getfield        gg/essential/gui/common/MenuButton.textState:Lgg/essential/elementa/state/MappedState;
        //   299: aload_0         /* this */
        //   300: getfield        gg/essential/gui/common/MenuButton.availableLabelWidth:Lgg/essential/elementa/state/State;
        //   303: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   306: new             Lgg/essential/gui/common/MenuButton$labelState$1;
        //   309: dup            
        //   310: aload_0         /* this */
        //   311: invokespecial   gg/essential/gui/common/MenuButton$labelState$1.<init>:(Lgg/essential/gui/common/MenuButton;)V
        //   314: checkcast       Lkotlin/jvm/functions/Function1;
        //   317: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   320: putfield        gg/essential/gui/common/MenuButton.labelState:Lgg/essential/elementa/state/MappedState;
        //   323: aload_0         /* this */
        //   324: aload_0         /* this */
        //   325: getfield        gg/essential/gui/common/MenuButton.textState:Lgg/essential/elementa/state/MappedState;
        //   328: aload_0         /* this */
        //   329: getfield        gg/essential/gui/common/MenuButton.labelState:Lgg/essential/elementa/state/MappedState;
        //   332: checkcast       Lgg/essential/elementa/state/State;
        //   335: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   338: getstatic       gg/essential/gui/common/MenuButton$isTruncated$1.INSTANCE:Lgg/essential/gui/common/MenuButton$isTruncated$1;
        //   341: checkcast       Lkotlin/jvm/functions/Function1;
        //   344: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   347: putfield        gg/essential/gui/common/MenuButton.isTruncated:Lgg/essential/elementa/state/MappedState;
        //   350: aload_0         /* this */
        //   351: aload_0         /* this */
        //   352: getfield        gg/essential/gui/common/MenuButton.styleHover:Lgg/essential/elementa/state/MappedState;
        //   355: aload_0         /* this */
        //   356: getfield        gg/essential/gui/common/MenuButton.enabledState:Lgg/essential/elementa/state/MappedState;
        //   359: checkcast       Lgg/essential/elementa/state/State;
        //   362: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   365: aload_0         /* this */
        //   366: getfield        gg/essential/gui/common/MenuButton.defaultStyle:Lgg/essential/elementa/state/MappedState;
        //   369: aload_0         /* this */
        //   370: getfield        gg/essential/gui/common/MenuButton.hoverStyle:Lgg/essential/elementa/state/MappedState;
        //   373: aload_0         /* this */
        //   374: getfield        gg/essential/gui/common/MenuButton.disabledStyle:Lgg/essential/elementa/state/MappedState;
        //   377: checkcast       Lgg/essential/elementa/state/State;
        //   380: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   383: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   386: invokevirtual   gg/essential/elementa/state/State.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   389: getstatic       gg/essential/gui/common/MenuButton$styleState$1.INSTANCE:Lgg/essential/gui/common/MenuButton$styleState$1;
        //   392: checkcast       Lkotlin/jvm/functions/Function1;
        //   395: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   398: putfield        gg/essential/gui/common/MenuButton.styleState:Lgg/essential/elementa/state/MappedState;
        //   401: aload_0         /* this */
        //   402: new             Lgg/essential/elementa/state/BasicState;
        //   405: dup            
        //   406: iconst_0       
        //   407: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   410: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   413: getstatic       gg/essential/gui/common/MenuButton$iconVisible$1.INSTANCE:Lgg/essential/gui/common/MenuButton$iconVisible$1;
        //   416: checkcast       Lkotlin/jvm/functions/Function1;
        //   419: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   422: putfield        gg/essential/gui/common/MenuButton.iconVisible:Lgg/essential/elementa/state/MappedState;
        //   425: aload_0         /* this */
        //   426: aload_0         /* this */
        //   427: invokevirtual   gg/essential/gui/common/MenuButton.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   430: invokevirtual   gg/essential/elementa/UIConstraints.getWidth:()Lgg/essential/elementa/constraints/WidthConstraint;
        //   433: putfield        gg/essential/gui/common/MenuButton.originalWidth:Lgg/essential/elementa/constraints/WidthConstraint;
        //   436: aload_0         /* this */
        //   437: aload_0         /* this */
        //   438: invokevirtual   gg/essential/gui/common/MenuButton.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   441: invokevirtual   gg/essential/elementa/UIConstraints.getHeight:()Lgg/essential/elementa/constraints/HeightConstraint;
        //   444: putfield        gg/essential/gui/common/MenuButton.originalHeight:Lgg/essential/elementa/constraints/HeightConstraint;
        //   447: aload_0         /* this */
        //   448: aload_0         /* this */
        //   449: getfield        gg/essential/gui/common/MenuButton.styleState:Lgg/essential/elementa/state/MappedState;
        //   452: getstatic       gg/essential/gui/common/MenuButton$hasLeft$1.INSTANCE:Lgg/essential/gui/common/MenuButton$hasLeft$1;
        //   455: checkcast       Lkotlin/jvm/functions/Function1;
        //   458: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   461: putfield        gg/essential/gui/common/MenuButton.hasLeft:Lgg/essential/elementa/state/MappedState;
        //   464: aload_0         /* this */
        //   465: aload_0         /* this */
        //   466: getfield        gg/essential/gui/common/MenuButton.styleState:Lgg/essential/elementa/state/MappedState;
        //   469: getstatic       gg/essential/gui/common/MenuButton$hasRight$1.INSTANCE:Lgg/essential/gui/common/MenuButton$hasRight$1;
        //   472: checkcast       Lkotlin/jvm/functions/Function1;
        //   475: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   478: putfield        gg/essential/gui/common/MenuButton.hasRight:Lgg/essential/elementa/state/MappedState;
        //   481: aload_0         /* this */
        //   482: aload_0         /* this */
        //   483: getfield        gg/essential/gui/common/MenuButton.styleState:Lgg/essential/elementa/state/MappedState;
        //   486: getstatic       gg/essential/gui/common/MenuButton$hasTop$1.INSTANCE:Lgg/essential/gui/common/MenuButton$hasTop$1;
        //   489: checkcast       Lkotlin/jvm/functions/Function1;
        //   492: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   495: putfield        gg/essential/gui/common/MenuButton.hasTop:Lgg/essential/elementa/state/MappedState;
        //   498: aload_0         /* this */
        //   499: aload_0         /* this */
        //   500: getfield        gg/essential/gui/common/MenuButton.styleState:Lgg/essential/elementa/state/MappedState;
        //   503: getstatic       gg/essential/gui/common/MenuButton$hasBottom$1.INSTANCE:Lgg/essential/gui/common/MenuButton$hasBottom$1;
        //   506: checkcast       Lkotlin/jvm/functions/Function1;
        //   509: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   512: putfield        gg/essential/gui/common/MenuButton.hasBottom:Lgg/essential/elementa/state/MappedState;
        //   515: aload_0         /* this */
        //   516: new             Lgg/essential/gui/common/ReadOnlyState;
        //   519: dup            
        //   520: aload_0         /* this */
        //   521: getfield        gg/essential/gui/common/MenuButton.enabledState:Lgg/essential/elementa/state/MappedState;
        //   524: checkcast       Lgg/essential/elementa/state/State;
        //   527: invokespecial   gg/essential/gui/common/ReadOnlyState.<init>:(Lgg/essential/elementa/state/State;)V
        //   530: putfield        gg/essential/gui/common/MenuButton.enabled$delegate:Lgg/essential/gui/common/ReadOnlyState;
        //   533: aload_0         /* this */
        //   534: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   537: dup            
        //   538: aconst_null    
        //   539: iconst_0       
        //   540: getstatic       gg/essential/gui/EssentialPalette.TEXT_SHADOW:Ljava/awt/Color;
        //   543: iconst_0       
        //   544: iconst_0       
        //   545: iconst_0       
        //   546: bipush          59
        //   548: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   551: aload_0         /* this */
        //   552: getfield        gg/essential/gui/common/MenuButton.labelState:Lgg/essential/elementa/state/MappedState;
        //   555: checkcast       Lgg/essential/elementa/state/State;
        //   558: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   561: checkcast       Lgg/essential/elementa/UIComponent;
        //   564: astore          $this$constrain$iv
        //   566: aload           $this$constrain$iv
        //   568: astore          12
        //   570: aload           12
        //   572: astore          $this$constrain_u24lambda_u2d0$iv
        //   574: aload           $this$constrain_u24lambda_u2d0$iv
        //   576: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   579: astore          14
        //   581: astore          15
        //   583: aload           $this$label_delegate_u24lambda_u2d0
        //   585: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   588: dup            
        //   589: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   592: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   595: iconst_0       
        //   596: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   599: checkcast       Ljava/lang/Number;
        //   602: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   605: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   608: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   611: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   614: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   617: aload           $this$label_delegate_u24lambda_u2d0
        //   619: aload_0         /* this */
        //   620: getfield        gg/essential/gui/common/MenuButton.styleState:Lgg/essential/elementa/state/MappedState;
        //   623: getstatic       gg/essential/gui/common/MenuButton$label$2$1.INSTANCE:Lgg/essential/gui/common/MenuButton$label$2$1;
        //   626: checkcast       Lkotlin/jvm/functions/Function1;
        //   629: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   632: checkcast       Lgg/essential/elementa/state/State;
        //   635: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   638: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   641: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   644: aload           15
        //   646: aload           12
        //   648: aload_0         /* this */
        //   649: getfield        gg/essential/gui/common/MenuButton.collapsed:Lgg/essential/elementa/state/MappedState;
        //   652: aload_0         /* this */
        //   653: getfield        gg/essential/gui/common/MenuButton.iconVisible:Lgg/essential/elementa/state/MappedState;
        //   656: checkcast       Lgg/essential/elementa/state/State;
        //   659: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   662: new             Lgg/essential/gui/common/MenuButton$label$3;
        //   665: dup            
        //   666: aload_0         /* this */
        //   667: invokespecial   gg/essential/gui/common/MenuButton$label$3.<init>:(Lgg/essential/gui/common/MenuButton;)V
        //   670: checkcast       Lkotlin/jvm/functions/Function2;
        //   673: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   676: aload_0         /* this */
        //   677: checkcast       Lgg/essential/elementa/UIComponent;
        //   680: aload_0         /* this */
        //   681: getfield        gg/essential/gui/common/MenuButton.labelState:Lgg/essential/elementa/state/MappedState;
        //   684: getstatic       gg/essential/gui/common/MenuButton$label$4.INSTANCE:Lgg/essential/gui/common/MenuButton$label$4;
        //   687: checkcast       Lkotlin/jvm/functions/Function1;
        //   690: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   693: checkcast       Lgg/essential/elementa/state/State;
        //   696: iconst_0       
        //   697: iconst_0       
        //   698: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   701: iconst_4       
        //   702: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   705: aload_0         /* this */
        //   706: getstatic       gg/essential/gui/common/MenuButton.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   709: iconst_1       
        //   710: aaload         
        //   711: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   714: putfield        gg/essential/gui/common/MenuButton.label$delegate:Lkotlin/properties/ReadWriteProperty;
        //   717: aload_0         /* this */
        //   718: checkcast       Lgg/essential/elementa/UIComponent;
        //   721: astore          $this$constrain$iv
        //   723: aload           $this$constrain$iv
        //   725: astore          12
        //   727: aload           12
        //   729: astore          $this$constrain_u24lambda_u2d0$iv
        //   731: aload           $this$constrain_u24lambda_u2d0$iv
        //   733: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   736: astore          $this$_init__u24lambda_u2d1
        //   738: aload           $this$_init__u24lambda_u2d1
        //   740: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   743: dup            
        //   744: fconst_0       
        //   745: iconst_1       
        //   746: aconst_null    
        //   747: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   750: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   753: bipush          10
        //   755: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   758: checkcast       Ljava/lang/Number;
        //   761: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   764: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   767: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   770: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   773: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   776: aload           $this$_init__u24lambda_u2d1
        //   778: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   781: dup            
        //   782: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   785: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   788: bipush          12
        //   790: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   793: checkcast       Ljava/lang/Number;
        //   796: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   799: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   802: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   805: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   808: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   811: aload_0         /* this */
        //   812: checkcast       Lgg/essential/elementa/UIComponent;
        //   815: astore          $this$onLeftClick$iv
        //   817: aload           $this$onLeftClick$iv
        //   819: new             Lgg/essential/gui/common/MenuButton$special$$inlined$onLeftClick$1;
        //   822: dup            
        //   823: aload_0         /* this */
        //   824: invokespecial   gg/essential/gui/common/MenuButton$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/common/MenuButton;)V
        //   827: checkcast       Lkotlin/jvm/functions/Function2;
        //   830: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   833: pop            
        //   834: aload_0         /* this */
        //   835: getfield        gg/essential/gui/common/MenuButton.collapsed:Lgg/essential/elementa/state/MappedState;
        //   838: new             Lgg/essential/gui/common/MenuButton$7;
        //   841: dup            
        //   842: aload_0         /* this */
        //   843: invokespecial   gg/essential/gui/common/MenuButton$7.<init>:(Lgg/essential/gui/common/MenuButton;)V
        //   846: checkcast       Lkotlin/jvm/functions/Function1;
        //   849: invokevirtual   gg/essential/elementa/state/MappedState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   852: pop            
        //   853: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/State<Ljava/lang/String;>;Lgg/essential/elementa/state/State<Lgg/essential/gui/common/MenuButton$Style;>;Lgg/essential/elementa/state/State<Lgg/essential/gui/common/MenuButton$Style;>;Lgg/essential/elementa/state/State<Lgg/essential/gui/common/MenuButton$Style;>;Lgg/essential/gui/common/MenuButton$Alignment;FLgg/essential/elementa/state/State<Ljava/lang/String;>;ZZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V
        //    MethodParameters:
        //  Name           Flags  
        //  -------------  -----
        //  buttonText     
        //  defaultStyle   
        //  hoverStyle     
        //  disabledStyle  
        //  textAlignment  
        //  textXOffset    
        //  collapsedText  
        //  truncate       
        //  clickSound     
        //  action         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public MenuButton(final State buttonText, State defaultStyle, State hoverStyle, State disabledStyle, Alignment center, float textXOffset, State collapsedText, boolean truncate, boolean clickSound, Function0 action, final int n) {
        if ((n & 0x2) != 0x0) {
            defaultStyle = new BasicState(MenuButton.DARK_GRAY);
        }
        if ((n & 0x4) != 0x0) {
            hoverStyle = new BasicState(MenuButton.GRAY);
        }
        if ((n & 0x8) != 0x0) {
            disabledStyle = defaultStyle.map((Function1)MenuButton$1.INSTANCE);
        }
        if ((n & 0x10) != 0x0) {
            center = Alignment.CENTER;
        }
        if ((n & 0x20) != 0x0) {
            textXOffset = 0.0f;
        }
        if ((n & 0x40) != 0x0) {
            collapsedText = new BasicState(null);
        }
        if ((n & 0x80) != 0x0) {
            truncate = false;
        }
        if ((n & 0x100) != 0x0) {
            clickSound = true;
        }
        if ((n & 0x200) != 0x0) {
            action = (Function0)MenuButton$2.INSTANCE;
        }
        this(buttonText, defaultStyle, hoverStyle, disabledStyle, center, textXOffset, collapsedText, truncate, clickSound, (Function0<Unit>)action);
    }
    
    @NotNull
    public final BasicState<Boolean> getHoveredStyleOverrides() {
        return this.hoveredStyleOverrides;
    }
    
    @NotNull
    public final MappedState<Pair<String, String>, Boolean> isTruncated() {
        return this.isTruncated;
    }
    
    public final boolean getEnabled() {
        return StateExtensionsKt.getValue((State<Boolean>)this.enabled$delegate, this, MenuButton.$$delegatedProperties[0]);
    }
    
    @JvmOverloads
    public MenuButton(@NotNull final String buttonText, @NotNull final State<Style> defaultStyle, @NotNull final State<Style> hoverStyle, @NotNull final State<Style> disabledStyle, @NotNull final Alignment textAlignment, @NotNull final State<String> collapsedText, final boolean truncate, final boolean clickSound, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter((Object)buttonText, "buttonText");
        Intrinsics.checkNotNullParameter((Object)defaultStyle, "defaultStyle");
        Intrinsics.checkNotNullParameter((Object)hoverStyle, "hoverStyle");
        Intrinsics.checkNotNullParameter((Object)disabledStyle, "disabledStyle");
        Intrinsics.checkNotNullParameter((Object)textAlignment, "textAlignment");
        Intrinsics.checkNotNullParameter((Object)collapsedText, "collapsedText");
        Intrinsics.checkNotNullParameter((Object)action, "action");
        this(new BasicState<String>(buttonText), defaultStyle, hoverStyle, disabledStyle, textAlignment, 0.0f, collapsedText, truncate, clickSound, action);
    }
    
    public MenuButton(String buttonText, State defaultStyle, State hoverStyle, State disabledStyle, Alignment center, State collapsedText, boolean truncate, boolean clickSound, Function0 action, final int n) {
        if ((n & 0x1) != 0x0) {
            buttonText = "";
        }
        if ((n & 0x2) != 0x0) {
            defaultStyle = new BasicState(MenuButton.DARK_GRAY);
        }
        if ((n & 0x4) != 0x0) {
            hoverStyle = new BasicState(MenuButton.GRAY);
        }
        if ((n & 0x8) != 0x0) {
            disabledStyle = defaultStyle.map((Function1)MenuButton$3.INSTANCE);
        }
        if ((n & 0x10) != 0x0) {
            center = Alignment.CENTER;
        }
        if ((n & 0x40) != 0x0) {
            collapsedText = new BasicState(null);
        }
        if ((n & 0x80) != 0x0) {
            truncate = true;
        }
        if ((n & 0x100) != 0x0) {
            clickSound = true;
        }
        if ((n & 0x200) != 0x0) {
            action = (Function0)MenuButton$4.INSTANCE;
        }
        this(buttonText, defaultStyle, hoverStyle, disabledStyle, center, collapsedText, truncate, clickSound, (Function0<Unit>)action);
    }
    
    private final UIText getLabel() {
        return (UIText)this.label$delegate.getValue((Object)this, (KProperty)MenuButton.$$delegatedProperties[1]);
    }
    
    public final void runAction() {
        if (this.enabledState.get()) {
            if (this.clickSound) {
                USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
            }
            this.action.invoke();
        }
    }
    
    @NotNull
    public final MenuButton bindCollapsed$b725a81(@NotNull final State<Boolean> state, final float width) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final MenuButton $this$bindCollapsed_u24lambda_u2d3 = this;
        $this$bindCollapsed_u24lambda_u2d3.collapsedWidth = width;
        $this$bindCollapsed_u24lambda_u2d3.collapsedHeight = 0.0f;
        $this$bindCollapsed_u24lambda_u2d3.collapsed.rebind(state);
        return this;
    }
    
    public static /* synthetic */ MenuButton bindCollapsed$default$3bcddc2a$24867a06(final MenuButton menuButton, final State state, final float width) {
        return menuButton.bindCollapsed$b725a81(state, width);
    }
    
    @NotNull
    public final MenuButton rebindDefaultStyle(@NotNull final State<Style> defaultStyle) {
        Intrinsics.checkNotNullParameter((Object)defaultStyle, "defaultStyle");
        final MenuButton $this$rebindDefaultStyle_u24lambda_u2d4 = this;
        $this$rebindDefaultStyle_u24lambda_u2d4.defaultStyle.rebind(defaultStyle);
        return this;
    }
    
    @NotNull
    public final MenuButton rebindHoverStyle(@NotNull final State<Style> hoverStyle) {
        Intrinsics.checkNotNullParameter((Object)hoverStyle, "hoverStyle");
        final MenuButton $this$rebindHoverStyle_u24lambda_u2d5 = this;
        $this$rebindHoverStyle_u24lambda_u2d5.hoverStyle.rebind(hoverStyle);
        return this;
    }
    
    @NotNull
    public final MenuButton rebindDisabledStyle(@NotNull final State<Style> disabledStyle) {
        Intrinsics.checkNotNullParameter((Object)disabledStyle, "disabledStyle");
        final MenuButton $this$rebindDisabledStyle_u24lambda_u2d6 = this;
        $this$rebindDisabledStyle_u24lambda_u2d6.disabledStyle.rebind(disabledStyle);
        return this;
    }
    
    @NotNull
    public final MenuButton rebindStyle(@NotNull final State<Style> defaultStyle, @NotNull final State<Style> hoverStyle) {
        Intrinsics.checkNotNullParameter((Object)defaultStyle, "defaultStyle");
        Intrinsics.checkNotNullParameter((Object)hoverStyle, "hoverStyle");
        final MenuButton $this$rebindStyle_u24lambda_u2d7 = this;
        $this$rebindStyle_u24lambda_u2d7.rebindHoverStyle(hoverStyle).rebindDefaultStyle(defaultStyle);
        return this;
    }
    
    public final void rebindEnabled(@NotNull final State<Boolean> enabled) {
        Intrinsics.checkNotNullParameter((Object)enabled, "enabled");
        this.enabledState.rebind(enabled);
    }
    
    @NotNull
    public final MenuButton setIcon(@NotNull final State<ImageFactory> icon, final boolean rightAligned, @NotNull final State<Color> color, @Nullable final Float iconWidth, @Nullable final Float iconHeight, final float xOffset, final float yOffset, @NotNull final State<Boolean> visibleState) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "icon"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_3         /* color */
        //     8: ldc_w           "color"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload           visibleState
        //    16: ldc_w           "visibleState"
        //    19: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    22: aload_0         /* this */
        //    23: astore          9
        //    25: aload           9
        //    27: checkcast       Lgg/essential/gui/common/MenuButton;
        //    30: astore          $this$setIcon_u24lambda_u2d11
        //    32: aload           $this$setIcon_u24lambda_u2d11
        //    34: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //    37: dup            
        //    38: aload_1         /* icon */
        //    39: new             Lgg/essential/elementa/state/BasicState;
        //    42: dup            
        //    43: iconst_1       
        //    44: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    47: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    50: checkcast       Lgg/essential/elementa/state/State;
        //    53: aload_3         /* color */
        //    54: new             Lgg/essential/elementa/state/BasicState;
        //    57: dup            
        //    58: getstatic       gg/essential/gui/EssentialPalette.TEXT_SHADOW:Ljava/awt/Color;
        //    61: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    64: checkcast       Lgg/essential/elementa/state/State;
        //    67: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V
        //    70: checkcast       Lgg/essential/elementa/UIComponent;
        //    73: astore          $this$constrain$iv
        //    75: aload           $this$constrain$iv
        //    77: astore          12
        //    79: aload           12
        //    81: astore          $this$constrain_u24lambda_u2d0$iv
        //    83: aload           $this$constrain_u24lambda_u2d0$iv
        //    85: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    88: astore          14
        //    90: astore          15
        //    92: aload           iconWidth
        //    94: dup            
        //    95: ifnull          128
        //    98: checkcast       Ljava/lang/Number;
        //   101: invokevirtual   java/lang/Number.floatValue:()F
        //   104: fstore          it
        //   106: aload           $this$setIcon_u24lambda_u2d11_u24lambda_u2d10
        //   108: fload           it
        //   110: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   113: checkcast       Ljava/lang/Number;
        //   116: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   119: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   122: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   125: goto            129
        //   128: pop            
        //   129: aload           iconHeight
        //   131: dup            
        //   132: ifnull          165
        //   135: checkcast       Ljava/lang/Number;
        //   138: invokevirtual   java/lang/Number.floatValue:()F
        //   141: fstore          it
        //   143: aload           $this$setIcon_u24lambda_u2d11_u24lambda_u2d10
        //   145: fload           it
        //   147: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   150: checkcast       Ljava/lang/Number;
        //   153: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   156: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   159: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   162: goto            166
        //   165: pop            
        //   166: aload           15
        //   168: aload           12
        //   170: aload           $this$setIcon_u24lambda_u2d11
        //   172: getfield        gg/essential/gui/common/MenuButton.labelState:Lgg/essential/elementa/state/MappedState;
        //   175: checkcast       Lgg/essential/elementa/state/State;
        //   178: new             Lgg/essential/gui/common/MenuButton$setIcon$1$2;
        //   181: dup            
        //   182: iload_2         /* rightAligned */
        //   183: fload           xOffset
        //   185: aload           $this$setIcon_u24lambda_u2d11
        //   187: fload           yOffset
        //   189: invokespecial   gg/essential/gui/common/MenuButton$setIcon$1$2.<init>:(ZFLgg/essential/gui/common/MenuButton;F)V
        //   192: checkcast       Lkotlin/jvm/functions/Function2;
        //   195: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   198: aload           $this$setIcon_u24lambda_u2d11
        //   200: checkcast       Lgg/essential/elementa/UIComponent;
        //   203: aload           visibleState
        //   205: iconst_0       
        //   206: iload_2         /* rightAligned */
        //   207: ifeq            214
        //   210: iconst_1       
        //   211: goto            215
        //   214: iconst_0       
        //   215: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   218: iconst_4       
        //   219: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   222: checkcast       Lgg/essential/gui/common/shadow/ShadowIcon;
        //   225: putfield        gg/essential/gui/common/MenuButton.shadowIcon:Lgg/essential/gui/common/shadow/ShadowIcon;
        //   228: aload           $this$setIcon_u24lambda_u2d11
        //   230: getfield        gg/essential/gui/common/MenuButton.iconVisible:Lgg/essential/elementa/state/MappedState;
        //   233: aload           visibleState
        //   235: invokevirtual   gg/essential/elementa/state/MappedState.rebind:(Lgg/essential/elementa/state/State;)V
        //   238: aload           9
        //   240: checkcast       Lgg/essential/gui/common/MenuButton;
        //   243: areturn        
        //    Signature:
        //  (Lgg/essential/elementa/state/State<Lgg/essential/gui/image/ImageFactory;>;ZLgg/essential/elementa/state/State<Ljava/awt/Color;>;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State<Ljava/lang/Boolean;>;)Lgg/essential/gui/common/MenuButton;
        //    MethodParameters:
        //  Name          Flags  
        //  ------------  -----
        //  icon          
        //  rightAligned  
        //  color         
        //  iconWidth     
        //  iconHeight    
        //  xOffset       
        //  yOffset       
        //  visibleState  
        //    StackMapTable: 00 06 FF 00 80 00 10 00 00 01 00 00 07 01 3D 02 02 07 01 05 07 00 02 07 00 02 00 07 00 04 00 07 01 63 07 00 02 00 01 07 01 3D 00 FF 00 23 00 10 00 00 01 00 00 00 02 02 07 01 05 07 00 02 07 00 02 00 07 00 04 00 00 07 00 02 00 01 07 01 3D 00 FF 00 2F 00 0B 00 00 00 00 00 00 00 00 07 01 05 07 00 02 07 00 02 00 05 07 00 02 07 00 04 07 00 04 07 01 05 01 FF 00 00 00 0B 00 00 00 00 00 00 00 00 07 01 05 07 00 02 07 00 02 00 06 07 00 02 07 00 04 07 00 04 07 01 05 01 01
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static /* synthetic */ MenuButton setIcon$default$658ebe14(final MenuButton menuButton, final State icon, boolean rightAligned, State color, Float iconWidth, Float iconHeight, float xOffset, float yOffset, State visibleState, final int n) {
        if ((n & 0x2) != 0x0) {
            rightAligned = false;
        }
        if ((n & 0x4) != 0x0) {
            color = new BasicState(EssentialPalette.TEXT_HIGHLIGHT);
        }
        if ((n & 0x8) != 0x0) {
            iconWidth = null;
        }
        if ((n & 0x10) != 0x0) {
            iconHeight = null;
        }
        if ((n & 0x20) != 0x0) {
            xOffset = 0.0f;
        }
        if ((n & 0x40) != 0x0) {
            yOffset = 0.0f;
        }
        if ((n & 0x80) != 0x0) {
            visibleState = new BasicState(true);
        }
        return menuButton.setIcon(icon, rightAligned, color, iconWidth, iconHeight, xOffset, yOffset, visibleState);
    }
    
    @NotNull
    public final MenuButton setTooltip(@NotNull final State<String> tooltipText, final boolean above, @NotNull final State<Boolean> visibleState, @NotNull final Alignment xAlignment, final boolean followCursorX, final boolean followCursorY, final float xOffset, final float yOffset, final int notchSize) {
        Intrinsics.checkNotNullParameter((Object)tooltipText, "tooltipText");
        Intrinsics.checkNotNullParameter((Object)visibleState, "visibleState");
        Intrinsics.checkNotNullParameter((Object)xAlignment, "xAlignment");
        final MenuButton $this$setTooltip_u24lambda_u2d13 = this;
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new EssentialTooltip($this$setTooltip_u24lambda_u2d13, EssentialTooltip.Position.ABOVE, notchSize, true);
        final UIConstraints constraints;
        final UIConstraints $this$setTooltip_u24lambda_u2d13_u24lambda_u2d12 = constraints = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        PositionConstraint positionConstraint;
        if (followCursorX) {
            positionConstraint = new MousePositionConstraint();
        }
        else {
            positionConstraint = ConstraintsKt.boundTo(switch (WhenMappings.$EnumSwitchMapping$0[xAlignment.ordinal()]) {
                case 1,  2 -> UtilitiesKt.getPixels(0);
                case 3 -> new CenterConstraint();
                case 4 -> UtilitiesKt.pixels$default(0, true, false, 2, null);
                default -> throw new NoWhenBranchMatchedException();
            }, this);
        }
        constraints.setX(ConstraintsKt.plus(positionConstraint, UtilitiesKt.getPixels(xOffset)));
        $this$setTooltip_u24lambda_u2d13_u24lambda_u2d12.setY(ConstraintsKt.plus(followCursorY ? new MousePositionConstraint() : ConstraintsKt.boundTo((PositionConstraint)new SiblingConstraint(4.0f, above), this), UtilitiesKt.getPixels(above ? (-yOffset) : yOffset)));
        Tooltip.bindLine$default$e129f13((Tooltip)$this$constrain_u24lambda_u2d0$iv, tooltipText, null).bindVisibility((State<Boolean>)StateExtensionsKt.and((State<Boolean>)StateExtensionsKt.and($this$setTooltip_u24lambda_u2d13.tooltipHover, (State<Boolean>)StateExtensionsKt.not((State<Boolean>)StateExtensionsKt.empty(tooltipText))), visibleState));
        return this;
    }
    
    public static /* synthetic */ MenuButton setTooltip$default$2254d6d0(final MenuButton menuButton, final State tooltipText, boolean above, State visibleState, Alignment center, boolean followCursorX, boolean followCursorY, float xOffset, float yOffset, int notchSize, final int n) {
        if ((n & 0x2) != 0x0) {
            above = true;
        }
        if ((n & 0x4) != 0x0) {
            visibleState = new BasicState(true);
        }
        if ((n & 0x8) != 0x0) {
            center = Alignment.CENTER;
        }
        if ((n & 0x10) != 0x0) {
            followCursorX = false;
        }
        if ((n & 0x20) != 0x0) {
            followCursorY = false;
        }
        if ((n & 0x40) != 0x0) {
            xOffset = 0.0f;
        }
        if ((n & 0x80) != 0x0) {
            yOffset = 1.0f;
        }
        if ((n & 0x100) != 0x0) {
            notchSize = 3;
        }
        return menuButton.setTooltip(tooltipText, above, visibleState, center, followCursorX, followCursorY, xOffset, yOffset, notchSize);
    }
    
    @NotNull
    public final MenuButton setTooltip$1d691561(@NotNull final String tooltipText) {
        Intrinsics.checkNotNullParameter((Object)tooltipText, "tooltipText");
        return setTooltip$default$2254d6d0(this, new BasicState(tooltipText), true, null, null, false, false, 0.0f, 0.0f, 0, 508);
    }
    
    public static /* synthetic */ MenuButton setTooltip$default$406ea034$744fdd8(final MenuButton menuButton, final String tooltip$1d691561) {
        return menuButton.setTooltip$1d691561(tooltip$1d691561);
    }
    
    private final String truncateLabel(final String text, final float width) {
        if (this.truncate && text.length() > 0 && text.length() > 1 && UtilitiesKt.width$default(text, 0.0f, null, 3, null) > width) {
            final List truncated = TextKt.getStringSplitToWidthTruncated$default(text, width, 1.0f, 1, false, false, null, null, 240, null);
            if (!truncated.isEmpty()) {
                return truncated.get(0);
            }
        }
        return text;
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.beforeDraw(matrixStack);
        final Color colour = this.styleState.get().getButtonColor();
        if (colour.getAlpha() != 0) {
            final Companion companion = MenuButton.Companion;
            final double left = this.getLeft() + 1.0;
            final double top = this.getTop() + 1.0;
            final double right = this.getRight() - 1.0;
            final double bottom = this.getBottom() - 1.0;
            final Color baseColor = colour;
            final Color brighter = colour.brighter();
            Intrinsics.checkNotNullExpressionValue((Object)brighter, "colour.brighter()");
            final Color darker = colour.darker().darker();
            Intrinsics.checkNotNullExpressionValue((Object)darker, "colour.darker().darker()");
            companion.drawButton(matrixStack, left, top, right, bottom, baseColor, brighter, ExtensionsKt.withAlpha(darker, 0.5f), this.styleState.get().getOutlineColor(), this.hasTop.get(), this.hasBottom.get(), this.hasLeft.get(), this.hasRight.get());
        }
        super.draw(matrixStack);
    }
    
    @JvmOverloads
    public MenuButton() {
        this(null, null, null, null, null, null, false, false, null, 1023);
    }
    
    public static final /* synthetic */ Style access$getGRAY$cp() {
        return MenuButton.GRAY;
    }
    
    public static final /* synthetic */ Style access$getDARK_GRAY$cp() {
        return MenuButton.DARK_GRAY;
    }
    
    public static final /* synthetic */ Style access$getGREEN$cp() {
        return MenuButton.GREEN;
    }
    
    public static final /* synthetic */ Style access$getBLUE$cp() {
        return MenuButton.BLUE;
    }
    
    public static final /* synthetic */ Style access$getBLUE_DISABLED$cp() {
        return MenuButton.BLUE_DISABLED;
    }
    
    public static final /* synthetic */ Style access$getLIGHT_BLUE$cp() {
        return MenuButton.LIGHT_BLUE;
    }
    
    public static final /* synthetic */ Style access$getRED$cp() {
        return MenuButton.RED;
    }
    
    public static final /* synthetic */ Style access$getLIGHT_RED$cp() {
        return MenuButton.LIGHT_RED;
    }
    
    public static final /* synthetic */ Style access$getRED_DISABLED$cp() {
        return MenuButton.RED_DISABLED;
    }
    
    public static final /* synthetic */ UIText access$getLabel(final MenuButton $this) {
        return $this.getLabel();
    }
    
    public static final /* synthetic */ ShadowIcon access$getShadowIcon$p(final MenuButton $this) {
        return $this.shadowIcon;
    }
    
    public static final /* synthetic */ String access$truncateLabel(final MenuButton $this, final String text, final float width) {
        return $this.truncateLabel(text, width);
    }
    
    public static final /* synthetic */ Alignment access$getTextAlignment$p(final MenuButton $this) {
        return $this.textAlignment;
    }
    
    public static final /* synthetic */ float access$getTextXOffset$p(final MenuButton $this) {
        return $this.textXOffset;
    }
    
    public static final /* synthetic */ void access$setOriginalWidth$p(final MenuButton $this, final WidthConstraint <set-?>) {
        $this.originalWidth = <set-?>;
    }
    
    public static final /* synthetic */ void access$setOriginalHeight$p(final MenuButton $this, final HeightConstraint <set-?>) {
        $this.originalHeight = <set-?>;
    }
    
    public static final /* synthetic */ float access$getCollapsedWidth$p(final MenuButton $this) {
        return $this.collapsedWidth;
    }
    
    public static final /* synthetic */ float access$getCollapsedHeight$p(final MenuButton $this) {
        return 0.0f;
    }
    
    public static final /* synthetic */ WidthConstraint access$getOriginalWidth$p(final MenuButton $this) {
        return $this.originalWidth;
    }
    
    public static final /* synthetic */ HeightConstraint access$getOriginalHeight$p(final MenuButton $this) {
        return $this.originalHeight;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)MenuButton.class, "enabled", "getEnabled()Z", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)MenuButton.class, "label", "getLabel()Lgg/essential/elementa/components/UIText;", 0)) };
        Companion = new Companion((byte)0);
        GRAY = new Style(EssentialPalette.TEXT_HIGHLIGHT, new Color(89, 89, 89), new Color(255, 255, 255));
        DARK_GRAY = new Style(EssentialPalette.TEXT_HIGHLIGHT, new Color(56, 56, 56), new Color(0, 4, 0));
        GREEN = new Style(EssentialPalette.TEXT_HIGHLIGHT, new Color(50, 123, 68), new Color(255, 255, 255));
        BLUE = new Style(EssentialPalette.TEXT_HIGHLIGHT, new Color(39, 70, 115), new Color(0, 4, 0));
        BLUE_DISABLED = new Style(EssentialPalette.TEXT_DISABLED, new Color(30, 42, 60), new Color(0, 4, 0));
        LIGHT_BLUE = new Style(EssentialPalette.TEXT_HIGHLIGHT, new Color(48, 115, 212), new Color(255, 255, 255));
        RED = new Style(EssentialPalette.TEXT_HIGHLIGHT, new Color(159, 68, 68), new Color(0, 4, 0));
        LIGHT_RED = new Style(EssentialPalette.TEXT_HIGHLIGHT, new Color(192, 37, 37), new Color(255, 255, 255));
        RED_DISABLED = new Style(EssentialPalette.TEXT_DISABLED, new Color(64, 27, 27), new Color(0, 4, 0));
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00008
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0013
                                                       \u0002\u0010\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u0006
                                                       \u0002\b\u0004
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jn\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010	\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b
                                                       \u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0016\u0010\u0006¨\u0006*""" }, d2 = { "Lgg/essential/gui/common/MenuButton$Companion;", "", "()V", "BLUE", "Lgg/essential/gui/common/MenuButton$Style;", "getBLUE", "()Lgg/essential/gui/common/MenuButton$Style;", "BLUE_DISABLED", "getBLUE_DISABLED", "DARK_GRAY", "getDARK_GRAY", "GRAY", "getGRAY", "GREEN", "getGREEN", "LIGHT_BLUE", "getLIGHT_BLUE", "LIGHT_RED", "getLIGHT_RED", "RED", "getRED", "RED_DISABLED", "getRED_DISABLED", "drawButton", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "left", "", "top", "right", "bottom", "baseColor", "Ljava/awt/Color;", "highlightColor", "shadowColor", "outlineColor", "hasTop", "", "hasBottom", "hasLeft", "hasRight", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public final void drawButton(@NotNull final UMatrixStack matrixStack, final double left, final double top, final double right, final double bottom, @NotNull final Color baseColor, @NotNull final Color highlightColor, @NotNull final Color shadowColor, @NotNull final Color outlineColor, final boolean hasTop, final boolean hasBottom, final boolean hasLeft, final boolean hasRight) {
            Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
            Intrinsics.checkNotNullParameter((Object)baseColor, "baseColor");
            Intrinsics.checkNotNullParameter((Object)highlightColor, "highlightColor");
            Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
            Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
            final BlendState prevBlendState = BlendState.Companion.active();
            BlendState.NORMAL.activate();
            UGraphics.enableDepth();
            UGraphics.depthFunc(519);
            final UGraphics $this$drawButton_u24lambda_u2d0 = UGraphics.getFromTessellator();
            $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, top, 0.0).color(baseColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, bottom, 0.0).color(baseColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, bottom, 0.0).color(baseColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, top, 0.0).color(baseColor).endVertex();
            $this$drawButton_u24lambda_u2d0.drawDirect();
            $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.TRIANGLE_FAN, VertexFormats.POSITION_COLOR);
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, top, 0.0).color(highlightColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, bottom, 0.0).color(highlightColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left + 1.0, bottom, 0.0).color(highlightColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left + 1.0, top + 1.0, 0.0).color(highlightColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, top + 1.0, 0.0).color(highlightColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, top, 0.0).color(highlightColor).endVertex();
            $this$drawButton_u24lambda_u2d0.drawDirect();
            $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.TRIANGLE_FAN, VertexFormats.POSITION_COLOR);
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, bottom, 0.0).color(shadowColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, top, 0.0).color(shadowColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right - 1.0, top, 0.0).color(shadowColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, right - 1.0, bottom - 2.0, 0.0).color(shadowColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, bottom - 2.0, 0.0).color(shadowColor).endVertex();
            $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, bottom, 0.0).color(shadowColor).endVertex();
            $this$drawButton_u24lambda_u2d0.drawDirect();
            if (hasTop) {
                $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, left - (hasLeft ? 1.0 : 0.0), top - 1.0, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, left - (hasLeft ? 1.0 : 0.0), top, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, right + (hasRight ? 1.0 : 0.0), top, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, right + (hasRight ? 1.0 : 0.0), top - 1.0, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.drawDirect();
            }
            if (hasBottom) {
                $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, left - (hasLeft ? 1.0 : 0.0), bottom, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, left - (hasLeft ? 1.0 : 0.0), bottom + 1.0, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, right + (hasRight ? 1.0 : 0.0), bottom + 1.0, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, right + (hasRight ? 1.0 : 0.0), bottom, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.drawDirect();
            }
            if (hasLeft) {
                $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, left - 1.0, top, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, left - 1.0, bottom, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, bottom, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, left, top, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.drawDirect();
            }
            if (hasRight) {
                $this$drawButton_u24lambda_u2d0.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, top, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, right, bottom, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, right + 1.0, bottom, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.pos(matrixStack, right + 1.0, top, 0.0).color(outlineColor).endVertex();
                $this$drawButton_u24lambda_u2d0.drawDirect();
            }
            UGraphics.disableDepth();
            UGraphics.depthFunc(515);
            prevBlendState.activate();
        }
        
        @NotNull
        public final Style getGRAY() {
            return MenuButton.access$getGRAY$cp();
        }
        
        @NotNull
        public final Style getDARK_GRAY() {
            return MenuButton.access$getDARK_GRAY$cp();
        }
        
        @NotNull
        public final Style getGREEN() {
            return MenuButton.access$getGREEN$cp();
        }
        
        @NotNull
        public final Style getBLUE() {
            return MenuButton.access$getBLUE$cp();
        }
        
        @NotNull
        public final Style getBLUE_DISABLED() {
            return MenuButton.access$getBLUE_DISABLED$cp();
        }
        
        @NotNull
        public final Style getLIGHT_BLUE() {
            return MenuButton.access$getLIGHT_BLUE$cp();
        }
        
        @NotNull
        public final Style getRED() {
            return MenuButton.access$getRED$cp();
        }
        
        @NotNull
        public final Style getLIGHT_RED() {
            return MenuButton.access$getLIGHT_RED$cp();
        }
        
        @NotNull
        public final Style getRED_DISABLED() {
            return MenuButton.access$getRED_DISABLED$cp();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003
                                                       \u0002\u0010"
                                                       \u0002\u0018\u0002
                                                       \u0002\b\r
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010	J	\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J	\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b
                                                       \u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b
                                                       \u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c""" }, d2 = { "Lgg/essential/gui/common/MenuButton$Style;", "", "textColor", "Ljava/awt/Color;", "buttonColor", "outlineColor", "sides", "", "Lgg/essential/elementa/effects/OutlineEffect$Side;", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/util/Set;)V", "getButtonColor", "()Ljava/awt/Color;", "getOutlineColor", "getSides", "()Ljava/util/Set;", "getTextColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "essential" })
    public static final class Style
    {
        @NotNull
        private final Color textColor;
        @NotNull
        private final Color buttonColor;
        @NotNull
        private final Color outlineColor;
        @NotNull
        private final Set<OutlineEffect.Side> sides;
        
        public Style(@NotNull final Color textColor, @NotNull final Color buttonColor, @NotNull final Color outlineColor, @NotNull final Set<? extends OutlineEffect.Side> sides) {
            Intrinsics.checkNotNullParameter((Object)textColor, "textColor");
            Intrinsics.checkNotNullParameter((Object)buttonColor, "buttonColor");
            Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
            Intrinsics.checkNotNullParameter((Object)sides, "sides");
            super();
            this.textColor = textColor;
            this.buttonColor = buttonColor;
            this.outlineColor = outlineColor;
            this.sides = (Set<OutlineEffect.Side>)sides;
        }
        
        public Style(final Color textColor, final Color buttonColor, final Color outlineColor) {
            this(textColor, buttonColor, outlineColor, ArraysKt.toSet((Object[])OutlineEffect.Side.values()));
        }
        
        @NotNull
        public final Color getTextColor() {
            return this.textColor;
        }
        
        @NotNull
        public final Color getButtonColor() {
            return this.buttonColor;
        }
        
        @NotNull
        public final Color getOutlineColor() {
            return this.outlineColor;
        }
        
        @NotNull
        public final Set<OutlineEffect.Side> getSides() {
            return this.sides;
        }
        
        @NotNull
        public final Style copy(@NotNull final Color textColor, @NotNull final Color buttonColor, @NotNull final Color outlineColor, @NotNull final Set<? extends OutlineEffect.Side> sides) {
            Intrinsics.checkNotNullParameter((Object)textColor, "textColor");
            Intrinsics.checkNotNullParameter((Object)buttonColor, "buttonColor");
            Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
            Intrinsics.checkNotNullParameter((Object)sides, "sides");
            return new Style(textColor, buttonColor, outlineColor, sides);
        }
        
        public static /* synthetic */ Style copy$default$562a9903(final Style style, Color textColor, Color buttonColor, Color outlineColor, Set sides, final int n) {
            if ((n & 0x1) != 0x0) {
                textColor = style.textColor;
            }
            if ((n & 0x2) != 0x0) {
                buttonColor = style.buttonColor;
            }
            if ((n & 0x4) != 0x0) {
                outlineColor = style.outlineColor;
            }
            if ((n & 0x8) != 0x0) {
                sides = style.sides;
            }
            return style.copy(textColor, buttonColor, outlineColor, sides);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Style(textColor=" + this.textColor + ", buttonColor=" + this.buttonColor + ", outlineColor=" + this.outlineColor + ", sides=" + this.sides;
        }
        
        @Override
        public int hashCode() {
            int result = this.textColor.hashCode();
            result = result * 31 + this.buttonColor.hashCode();
            result = result * 31 + this.outlineColor.hashCode();
            result = result * 31 + this.sides.hashCode();
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Style)) {
                return false;
            }
            final Style style = (Style)other;
            return Intrinsics.areEqual((Object)this.textColor, (Object)style.textColor) && Intrinsics.areEqual((Object)this.buttonColor, (Object)style.buttonColor) && Intrinsics.areEqual((Object)this.outlineColor, (Object)style.outlineColor) && Intrinsics.areEqual((Object)this.sides, (Object)style.sides);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0016
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0010
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b
                                                       \b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b	\u0010\bj\u0002\b
                                                       j\u0002\b\u000bj\u0002\b\fj\u0002\b¨\u0006\u000e""" }, d2 = { "Lgg/essential/gui/common/MenuButton$Alignment;", "", "constraint", "Lkotlin/Function0;", "Lgg/essential/elementa/constraints/XConstraint;", "noPadding", "(Ljava/lang/String;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getConstraint", "()Lkotlin/jvm/functions/Function0;", "getNoPadding", "LEFT", "LEFT_SMALL_PADDING", "CENTER", "RIGHT", "essential" })
    public enum Alignment
    {
        @NotNull
        private final Function0<XConstraint> constraint;
        @NotNull
        private final Function0<XConstraint> noPadding;
        
        LEFT("LEFT", 0, (Function0<? extends XConstraint>)MenuButton$Alignment$1.INSTANCE, (Function0<? extends XConstraint>)MenuButton$Alignment$2.INSTANCE), 
        LEFT_SMALL_PADDING("LEFT_SMALL_PADDING", 1, (Function0<? extends XConstraint>)MenuButton$Alignment$3.INSTANCE, (Function0<? extends XConstraint>)MenuButton$Alignment$4.INSTANCE), 
        CENTER("CENTER", 2, (Function0<? extends XConstraint>)MenuButton$Alignment$5.INSTANCE, (Function0<? extends XConstraint>)MenuButton$Alignment$6.INSTANCE), 
        RIGHT("RIGHT", 3, (Function0<? extends XConstraint>)MenuButton$Alignment$7.INSTANCE, (Function0<? extends XConstraint>)MenuButton$Alignment$8.INSTANCE);
        
        private static final /* synthetic */ Alignment[] $VALUES;
        
        private Alignment(final String $enum$name, final int $enum$ordinal, final Function0<? extends XConstraint> constraint, final Function0<? extends XConstraint> noPadding) {
            this.constraint = (Function0<XConstraint>)constraint;
            this.noPadding = (Function0<XConstraint>)noPadding;
        }
        
        @NotNull
        public final Function0<XConstraint> getConstraint() {
            return this.constraint;
        }
        
        @NotNull
        public final Function0<XConstraint> getNoPadding() {
            return this.noPadding;
        }
        
        public static Alignment[] values() {
            return Alignment.$VALUES.clone();
        }
        
        public static Alignment valueOf(final String value) {
            return Enum.valueOf(Alignment.class, value);
        }
        
        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[] { Alignment.LEFT, Alignment.LEFT_SMALL_PADDING, Alignment.CENTER, Alignment.RIGHT };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[Alignment.values().length];
            $EnumSwitchMapping$[Alignment.LEFT.ordinal()] = 1;
            $EnumSwitchMapping$[Alignment.LEFT_SMALL_PADDING.ordinal()] = 2;
            $EnumSwitchMapping$[Alignment.CENTER.ordinal()] = 3;
            $EnumSwitchMapping$[Alignment.RIGHT.ordinal()] = 4;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
