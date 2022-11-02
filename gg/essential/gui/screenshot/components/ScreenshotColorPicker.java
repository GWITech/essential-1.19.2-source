package gg.essential.gui.screenshot.components;

import kotlin.reflect.*;
import gg.essential.gui.screenshot.editor.tools.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.media.*;
import java.awt.*;
import kotlin.properties.*;
import gg.essential.elementa.*;
import gg.essential.elementa.components.*;
import net.minecraft.client.render.*;
import gg.essential.elementa.utils.*;
import java.util.*;
import gg.essential.universal.shader.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import gg.essential.universal.*;
import kotlin.jvm.functions.*;
import kotlin.ranges.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0091\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000f
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000e
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\f
                                                   \u0002\b\u0015
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0007*\u0003\u0012<O\u0018\u00002\u00020\u0001:\u0001vB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020
                                                   0	¢\u0006\u0002\u0010\u000bJ\b\u0010c\u001a\u00020dH\u0002J"\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010090	2\u0006\u0010f\u001a\u00020(H\u0002J\u0018\u0010g\u001a\u00020d2\u0006\u0010h\u001a\u00020i2\u0006\u0010f\u001a\u00020(H\u0002J\u0018\u0010j\u001a\u00020d2\u0006\u0010h\u001a\u00020i2\u0006\u0010f\u001a\u00020(H\u0002J\u0018\u0010k\u001a\u00020d2\u0006\u0010h\u001a\u00020i2\u0006\u0010f\u001a\u00020(H\u0002J0\u0010l\u001a\u00020d2\u0006\u0010m\u001a\u00020n2\u0006\u0010h\u001a\u00020i2\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020p2\u0006\u0010r\u001a\u00020BH\u0002J \u0010s\u001a\u00020B2\u0006\u0010o\u001a\u00020\u00102\u0006\u0010q\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0010H\u0002J\u0006\u0010t\u001a\u00020dJ\b\u0010u\u001a\u00020dH\u0002R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b"\u0010\u0016\u001a\u0004\b!\u0010\u001eR\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010$\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b&\u0010\u0016\u001a\u0004\b%\u0010\u001aR\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b+\u0010\u0016\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b.\u0010\u0016\u001a\u0004\b-\u0010\u001aR\u001b\u0010/\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b1\u0010\u0016\u001a\u0004\b0\u0010\u001eR\u000e\u00102\u001a\u00020\u0010X\u0082D¢\u0006\u0002
                                                   \u0000R\u001b\u00103\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b5\u0010\u0016\u001a\u0004\b4\u0010\u001aR\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002070	X\u0082.¢\u0006\u0002
                                                   \u0000R,\u00108\u001a \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001009\u0012\u0004\u0012\u00020\u0010090	X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010;\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b?\u0010\u0016\u001a\u0004\b=\u0010>R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010C\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bE\u0010\u0016\u001a\u0004\bD\u0010\u001aR\u001b\u0010F\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bH\u0010\u0016\u001a\u0004\bG\u0010\u001eR\u000e\u0010I\u001a\u00020\u0010X\u0082D¢\u0006\u0002
                                                   \u0000R\u001b\u0010J\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bL\u0010\u0016\u001a\u0004\bK\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010N\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bR\u0010\u0016\u001a\u0004\bP\u0010QR\u001b\u0010S\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bU\u0010\u0016\u001a\u0004\bT\u0010\u001aR\u001b\u0010V\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bX\u0010\u0016\u001a\u0004\bW\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010Y\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b[\u0010\u0016\u001a\u0004\bZ\u0010\u001aR\u001b\u0010\\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b^\u0010\u0016\u001a\u0004\b]\u0010\u001aR\u001b\u0010_\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\ba\u0010\u0016\u001a\u0004\b`\u0010\u001eR\u0014\u0010b\u001a\b\u0012\u0004\u0012\u00020
                                                   0\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006w""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;", "Lgg/essential/elementa/components/UIContainer;", "penTool", "Lgg/essential/gui/screenshot/editor/tools/PenTool;", "screenshotManager", "Lgg/essential/network/connectionmanager/media/ScreenshotManager;", "screenshotBrowser", "Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "active", "Lgg/essential/elementa/state/State;", "", "(Lgg/essential/gui/screenshot/editor/tools/PenTool;Lgg/essential/network/connectionmanager/media/ScreenshotManager;Lgg/essential/gui/screenshot/components/ScreenshotBrowser;Lgg/essential/elementa/state/State;)V", "activeColorIndex", "Lgg/essential/elementa/state/BasicState;", "", "alpha", "", "alphaArea", "gg/essential/gui/screenshot/components/ScreenshotColorPicker$alphaArea$2", "getAlphaArea", "()Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$alphaArea$2;", "alphaArea$delegate", "Lkotlin/properties/ReadWriteProperty;", "alphaContainer", "Lgg/essential/elementa/components/UIBlock;", "getAlphaContainer", "()Lgg/essential/elementa/components/UIBlock;", "alphaContainer$delegate", "alphaContentContainer", "getAlphaContentContainer", "()Lgg/essential/elementa/components/UIContainer;", "alphaContentContainer$delegate", "alphaSlider", "getAlphaSlider", "alphaSlider$delegate", "brightness", "buttonConnector", "getButtonConnector", "buttonConnector$delegate", "collapsedBlock", "Lgg/essential/elementa/UIComponent;", "getCollapsedBlock", "()Lgg/essential/elementa/UIComponent;", "collapsedBlock$delegate", "colorHistoryBlock", "getColorHistoryBlock", "colorHistoryBlock$delegate", "colorHistoryContainer", "getColorHistoryContainer", "colorHistoryContainer$delegate", "componentCrossDimension", "currentColor", "getCurrentColor", "currentColor$delegate", "currentColorState", "Lgg/essential/gui/screenshot/components/HSBColor;", "hsb", "Lkotlin/Pair;", "hue", "hueArea", "gg/essential/gui/screenshot/components/ScreenshotColorPicker$hueArea$2", "getHueArea", "()Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$hueArea$2;", "hueArea$delegate", "hueColorList", "", "Ljava/awt/Color;", "hueContainer", "getHueContainer", "hueContainer$delegate", "hueSaturationBrightnessRow", "getHueSaturationBrightnessRow", "hueSaturationBrightnessRow$delegate", "hueSaturationSide", "hueSlider", "getHueSlider", "hueSlider$delegate", "saturation", "saturationBrightnessArea", "gg/essential/gui/screenshot/components/ScreenshotColorPicker$saturationBrightnessArea$2", "getSaturationBrightnessArea", "()Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$saturationBrightnessArea$2;", "saturationBrightnessArea$delegate", "saturationBrightnessContainer", "getSaturationBrightnessContainer", "saturationBrightnessContainer$delegate", "saturationBrightnessSelection", "getSaturationBrightnessSelection", "saturationBrightnessSelection$delegate", "selectorBlock", "getSelectorBlock", "selectorBlock$delegate", "selectorContent", "getSelectorContent", "selectorContent$delegate", "selectorInnerContent", "getSelectorInnerContent", "selectorInnerContent$delegate", "showMenu", "cleanupDraw", "", "createMouseDragListener", "component", "drawAlpha", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "drawColorPicker", "drawHueLine", "drawVertex", "graphics", "Lgg/essential/universal/UGraphics;", "x", "", "y", "color", "getColor", "saveColors", "setupDraw", "ColorChoice", "essential" })
public final class ScreenshotColorPicker extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final PenTool penTool;
    @NotNull
    private final ScreenshotManager screenshotManager;
    @NotNull
    private final BasicState<Boolean> showMenu;
    @NotNull
    private final BasicState<Float> hue;
    @NotNull
    private final BasicState<Float> saturation;
    @NotNull
    private final BasicState<Float> brightness;
    @NotNull
    private final BasicState<Float> alpha;
    @NotNull
    private final List<Color> hueColorList;
    private State<HSBColor> currentColorState;
    @NotNull
    private final State<Pair<Pair<Float, Float>, Float>> hsb;
    @NotNull
    private final ReadWriteProperty collapsedBlock$delegate;
    @NotNull
    private final ReadWriteProperty currentColor$delegate;
    @NotNull
    private final ReadWriteProperty buttonConnector$delegate;
    @NotNull
    private final ReadWriteProperty selectorBlock$delegate;
    @NotNull
    private final ReadWriteProperty selectorContent$delegate;
    @NotNull
    private final ReadWriteProperty selectorInnerContent$delegate;
    @NotNull
    private final ReadWriteProperty hueSaturationBrightnessRow$delegate;
    @NotNull
    private final ReadWriteProperty saturationBrightnessContainer$delegate;
    @NotNull
    private final ReadWriteProperty alphaContainer$delegate;
    @NotNull
    private final ReadWriteProperty colorHistoryBlock$delegate;
    @NotNull
    private final ReadWriteProperty colorHistoryContainer$delegate;
    @NotNull
    private final ReadWriteProperty hueContainer$delegate;
    @NotNull
    private final ReadWriteProperty alphaContentContainer$delegate;
    @NotNull
    private final ReadWriteProperty alphaArea$delegate;
    @NotNull
    private final ReadWriteProperty hueArea$delegate;
    @NotNull
    private final ReadWriteProperty saturationBrightnessArea$delegate;
    @NotNull
    private final BasicState<Integer> activeColorIndex;
    
    public ScreenshotColorPicker(@NotNull final PenTool penTool, @NotNull final ScreenshotManager screenshotManager, @NotNull final ScreenshotBrowser screenshotBrowser, @NotNull final State<Boolean> active) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "penTool"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* screenshotManager */
        //     7: ldc             "screenshotManager"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* screenshotBrowser */
        //    13: ldc             "screenshotBrowser"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload           active
        //    20: ldc             "active"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: aload_0         /* this */
        //    26: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    29: aload_0         /* this */
        //    30: aload_1         /* penTool */
        //    31: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.penTool:Lgg/essential/gui/screenshot/editor/tools/PenTool;
        //    34: aload_0         /* this */
        //    35: aload_2         /* screenshotManager */
        //    36: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.screenshotManager:Lgg/essential/network/connectionmanager/media/ScreenshotManager;
        //    39: aload_0         /* this */
        //    40: new             Lgg/essential/elementa/state/BasicState;
        //    43: dup            
        //    44: iconst_0       
        //    45: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    48: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    51: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.showMenu:Lgg/essential/elementa/state/BasicState;
        //    54: aload_0         /* this */
        //    55: new             Lgg/essential/elementa/state/BasicState;
        //    58: dup            
        //    59: fconst_0       
        //    60: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    63: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    66: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.hue:Lgg/essential/elementa/state/BasicState;
        //    69: aload_0         /* this */
        //    70: new             Lgg/essential/elementa/state/BasicState;
        //    73: dup            
        //    74: fconst_1       
        //    75: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    78: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    81: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.saturation:Lgg/essential/elementa/state/BasicState;
        //    84: aload_0         /* this */
        //    85: new             Lgg/essential/elementa/state/BasicState;
        //    88: dup            
        //    89: fconst_1       
        //    90: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    93: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    96: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.brightness:Lgg/essential/elementa/state/BasicState;
        //    99: aload_0         /* this */
        //   100: new             Lgg/essential/elementa/state/BasicState;
        //   103: dup            
        //   104: fconst_1       
        //   105: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   108: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   111: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.alpha:Lgg/essential/elementa/state/BasicState;
        //   114: aload_0         /* this */
        //   115: new             Lkotlin/ranges/IntRange;
        //   118: dup            
        //   119: iconst_0       
        //   120: bipush          69
        //   122: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   125: checkcast       Ljava/lang/Iterable;
        //   128: astore          5
        //   130: astore          12
        //   132: aload           $this$map$iv
        //   134: astore          7
        //   136: new             Ljava/util/ArrayList;
        //   139: dup            
        //   140: aload           $this$map$iv
        //   142: bipush          10
        //   144: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   147: invokespecial   java/util/ArrayList.<init>:(I)V
        //   150: checkcast       Ljava/util/Collection;
        //   153: astore          destination$iv$iv
        //   155: aload           $this$mapTo$iv$iv
        //   157: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   162: astore          10
        //   164: aload           10
        //   166: invokeinterface java/util/Iterator.hasNext:()Z
        //   171: ifeq            221
        //   174: aload           10
        //   176: checkcast       Lkotlin/collections/IntIterator;
        //   179: invokevirtual   kotlin/collections/IntIterator.nextInt:()I
        //   182: istore          item$iv$iv
        //   184: aload           destination$iv$iv
        //   186: astore          13
        //   188: new             Ljava/awt/Color;
        //   191: dup            
        //   192: iload           item$iv$iv
        //   194: i2f            
        //   195: ldc_w           69.0
        //   198: fdiv           
        //   199: fconst_1       
        //   200: ldc_w           0.9
        //   203: invokestatic    java/awt/Color.HSBtoRGB:(FFF)I
        //   206: invokespecial   java/awt/Color.<init>:(I)V
        //   209: aload           13
        //   211: swap           
        //   212: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   217: pop            
        //   218: goto            164
        //   221: aload           destination$iv$iv
        //   223: checkcast       Ljava/util/List;
        //   226: aload           12
        //   228: swap           
        //   229: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.hueColorList:Ljava/util/List;
        //   232: aload_0         /* this */
        //   233: aload_0         /* this */
        //   234: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.hue:Lgg/essential/elementa/state/BasicState;
        //   237: aload_0         /* this */
        //   238: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.saturation:Lgg/essential/elementa/state/BasicState;
        //   241: checkcast       Lgg/essential/elementa/state/State;
        //   244: invokevirtual   gg/essential/elementa/state/BasicState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   247: aload_0         /* this */
        //   248: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.brightness:Lgg/essential/elementa/state/BasicState;
        //   251: checkcast       Lgg/essential/elementa/state/State;
        //   254: invokevirtual   gg/essential/elementa/state/State.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   257: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.hsb:Lgg/essential/elementa/state/State;
        //   260: aload_0         /* this */
        //   261: new             Lgg/essential/elementa/components/UIBlock;
        //   264: dup            
        //   265: aconst_null    
        //   266: iconst_1       
        //   267: aconst_null    
        //   268: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   271: checkcast       Lgg/essential/elementa/UIComponent;
        //   274: astore          $this$constrain$iv
        //   276: aload           $this$constrain$iv
        //   278: astore          7
        //   280: aload           7
        //   282: astore          $this$constrain_u24lambda_u2d0$iv
        //   284: aload           $this$constrain_u24lambda_u2d0$iv
        //   286: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   289: astore          10
        //   291: astore          12
        //   293: aload           $this$collapsedBlock_delegate_u24lambda_u2d1
        //   295: iconst_0       
        //   296: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   299: checkcast       Ljava/lang/Number;
        //   302: iconst_1       
        //   303: iconst_0       
        //   304: iconst_2       
        //   305: aconst_null    
        //   306: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   309: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   312: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   315: aload           $this$collapsedBlock_delegate_u24lambda_u2d1
        //   317: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   320: dup            
        //   321: fconst_1       
        //   322: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //   325: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   328: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   331: aload           $this$collapsedBlock_delegate_u24lambda_u2d1
        //   333: bipush          100
        //   335: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   338: checkcast       Ljava/lang/Number;
        //   341: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   344: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   347: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   350: aload           12
        //   352: aload           7
        //   354: astore          $this$onLeftClick$iv
        //   356: aload           $this$onLeftClick$iv
        //   358: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$special$$inlined$onLeftClick$1;
        //   361: dup            
        //   362: aload_0         /* this */
        //   363: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;)V
        //   366: checkcast       Lkotlin/jvm/functions/Function2;
        //   369: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   372: aload_0         /* this */
        //   373: checkcast       Lgg/essential/elementa/UIComponent;
        //   376: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   379: aload_0         /* this */
        //   380: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   383: iconst_0       
        //   384: aaload         
        //   385: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   388: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.collapsedBlock$delegate:Lkotlin/properties/ReadWriteProperty;
        //   391: aload_0         /* this */
        //   392: new             Lgg/essential/elementa/components/UIBlock;
        //   395: dup            
        //   396: aconst_null    
        //   397: iconst_1       
        //   398: aconst_null    
        //   399: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   402: checkcast       Lgg/essential/elementa/UIComponent;
        //   405: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   408: astore          $this$constrain$iv
        //   410: aload           $this$constrain$iv
        //   412: astore          7
        //   414: aload           7
        //   416: astore          $this$constrain_u24lambda_u2d0$iv
        //   418: aload           $this$constrain_u24lambda_u2d0$iv
        //   420: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   423: astore          10
        //   425: astore          12
        //   427: aload           $this$currentColor_delegate_u24lambda_u2d3
        //   429: bipush          100
        //   431: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   434: checkcast       Ljava/lang/Number;
        //   437: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   440: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   443: bipush          6
        //   445: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   448: checkcast       Ljava/lang/Number;
        //   451: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   454: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   457: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   460: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   463: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   466: aload           $this$currentColor_delegate_u24lambda_u2d3
        //   468: bipush          100
        //   470: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   473: checkcast       Ljava/lang/Number;
        //   476: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   479: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   482: bipush          6
        //   484: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   487: checkcast       Ljava/lang/Number;
        //   490: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   493: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   496: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   499: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   502: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   505: aload           12
        //   507: aload           7
        //   509: aload_0         /* this */
        //   510: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getCollapsedBlock:()Lgg/essential/elementa/UIComponent;
        //   513: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   516: new             Lgg/essential/gui/screenshot/components/CheckerboardBackgroundEffect;
        //   519: dup            
        //   520: invokespecial   gg/essential/gui/screenshot/components/CheckerboardBackgroundEffect.<init>:()V
        //   523: checkcast       Lgg/essential/elementa/effects/Effect;
        //   526: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   529: aload_0         /* this */
        //   530: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   533: iconst_1       
        //   534: aaload         
        //   535: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   538: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.currentColor$delegate:Lkotlin/properties/ReadWriteProperty;
        //   541: aload_0         /* this */
        //   542: new             Lgg/essential/elementa/components/UIBlock;
        //   545: dup            
        //   546: getstatic       gg/essential/gui/EssentialPalette.BUTTON_HIGHLIGHT:Ljava/awt/Color;
        //   549: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   552: checkcast       Lgg/essential/elementa/UIComponent;
        //   555: astore          $this$constrain$iv
        //   557: aload           $this$constrain$iv
        //   559: astore          7
        //   561: aload           7
        //   563: astore          $this$constrain_u24lambda_u2d0$iv
        //   565: aload           $this$constrain_u24lambda_u2d0$iv
        //   567: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   570: astore          10
        //   572: astore          12
        //   574: aload           $this$buttonConnector_delegate_u24lambda_u2d4
        //   576: iconst_0       
        //   577: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   580: checkcast       Ljava/lang/Number;
        //   583: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   586: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   589: aload_0         /* this */
        //   590: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getCollapsedBlock:()Lgg/essential/elementa/UIComponent;
        //   593: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   596: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   599: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   602: aload           $this$buttonConnector_delegate_u24lambda_u2d4
        //   604: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   607: dup            
        //   608: fconst_0       
        //   609: iconst_1       
        //   610: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   613: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   616: aload_0         /* this */
        //   617: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getCollapsedBlock:()Lgg/essential/elementa/UIComponent;
        //   620: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   623: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   626: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   629: aload           $this$buttonConnector_delegate_u24lambda_u2d4
        //   631: bipush          100
        //   633: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   636: checkcast       Ljava/lang/Number;
        //   639: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   642: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   645: aload_0         /* this */
        //   646: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getCollapsedBlock:()Lgg/essential/elementa/UIComponent;
        //   649: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   652: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   655: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   658: aload           $this$buttonConnector_delegate_u24lambda_u2d4
        //   660: iconst_3       
        //   661: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   664: checkcast       Ljava/lang/Number;
        //   667: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   670: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   673: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   676: aload           12
        //   678: aload           7
        //   680: aload_3         /* screenshotBrowser */
        //   681: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getWindow:()Lgg/essential/elementa/components/Window;
        //   684: checkcast       Lgg/essential/elementa/UIComponent;
        //   687: aload_0         /* this */
        //   688: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.showMenu:Lgg/essential/elementa/state/BasicState;
        //   691: checkcast       Lgg/essential/elementa/state/State;
        //   694: iconst_0       
        //   695: aconst_null    
        //   696: bipush          12
        //   698: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   701: aload_0         /* this */
        //   702: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   705: iconst_2       
        //   706: aaload         
        //   707: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   710: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.buttonConnector$delegate:Lkotlin/properties/ReadWriteProperty;
        //   713: aload_0         /* this */
        //   714: new             Lgg/essential/elementa/components/UIBlock;
        //   717: dup            
        //   718: getstatic       gg/essential/gui/EssentialPalette.BUTTON_HIGHLIGHT:Ljava/awt/Color;
        //   721: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   724: checkcast       Lgg/essential/elementa/UIComponent;
        //   727: astore          $this$constrain$iv
        //   729: aload           $this$constrain$iv
        //   731: astore          7
        //   733: aload           7
        //   735: astore          $this$constrain_u24lambda_u2d0$iv
        //   737: aload           $this$constrain_u24lambda_u2d0$iv
        //   739: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   742: astore          10
        //   744: astore          12
        //   746: aload           $this$selectorBlock_delegate_u24lambda_u2d5
        //   748: iconst_0       
        //   749: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   752: checkcast       Ljava/lang/Number;
        //   755: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   758: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   761: aload_0         /* this */
        //   762: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getCollapsedBlock:()Lgg/essential/elementa/UIComponent;
        //   765: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   768: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   771: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   774: aload           $this$selectorBlock_delegate_u24lambda_u2d5
        //   776: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   779: dup            
        //   780: fconst_0       
        //   781: iconst_1       
        //   782: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   785: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   788: aload_0         /* this */
        //   789: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getButtonConnector:()Lgg/essential/elementa/components/UIBlock;
        //   792: checkcast       Lgg/essential/elementa/UIComponent;
        //   795: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   798: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   801: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   804: aload           $this$selectorBlock_delegate_u24lambda_u2d5
        //   806: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   809: dup            
        //   810: fconst_0       
        //   811: iconst_1       
        //   812: aconst_null    
        //   813: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   816: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   819: iconst_4       
        //   820: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   823: checkcast       Ljava/lang/Number;
        //   826: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   829: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   832: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   835: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   838: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   841: aload           $this$selectorBlock_delegate_u24lambda_u2d5
        //   843: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   846: dup            
        //   847: fconst_0       
        //   848: iconst_1       
        //   849: aconst_null    
        //   850: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   853: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   856: iconst_4       
        //   857: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   860: checkcast       Ljava/lang/Number;
        //   863: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   866: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   869: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   872: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   875: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   878: aload           12
        //   880: aload           7
        //   882: aload_3         /* screenshotBrowser */
        //   883: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getWindow:()Lgg/essential/elementa/components/Window;
        //   886: checkcast       Lgg/essential/elementa/UIComponent;
        //   889: aload_0         /* this */
        //   890: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.showMenu:Lgg/essential/elementa/state/BasicState;
        //   893: checkcast       Lgg/essential/elementa/state/State;
        //   896: iconst_0       
        //   897: aconst_null    
        //   898: bipush          12
        //   900: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   903: aload_0         /* this */
        //   904: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   907: iconst_3       
        //   908: aaload         
        //   909: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   912: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.selectorBlock$delegate:Lkotlin/properties/ReadWriteProperty;
        //   915: aload_0         /* this */
        //   916: new             Lgg/essential/elementa/components/UIBlock;
        //   919: dup            
        //   920: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //   923: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   926: checkcast       Lgg/essential/elementa/UIComponent;
        //   929: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   932: astore          $this$constrain$iv
        //   934: aload           $this$constrain$iv
        //   936: astore          7
        //   938: aload           7
        //   940: astore          $this$constrain_u24lambda_u2d0$iv
        //   942: aload           $this$constrain_u24lambda_u2d0$iv
        //   944: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   947: astore          10
        //   949: astore          12
        //   951: aload           $this$selectorContent_delegate_u24lambda_u2d6
        //   953: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   956: dup            
        //   957: fconst_0       
        //   958: iconst_1       
        //   959: aconst_null    
        //   960: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   963: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   966: bipush          6
        //   968: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   971: checkcast       Ljava/lang/Number;
        //   974: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   977: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   980: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   983: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   986: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   989: aload           $this$selectorContent_delegate_u24lambda_u2d6
        //   991: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   994: dup            
        //   995: fconst_0       
        //   996: iconst_1       
        //   997: aconst_null    
        //   998: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1001: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1004: bipush          6
        //  1006: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1009: checkcast       Ljava/lang/Number;
        //  1012: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1015: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1018: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1021: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1024: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1027: aload           12
        //  1029: aload           7
        //  1031: aload_0         /* this */
        //  1032: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getSelectorBlock:()Lgg/essential/elementa/components/UIBlock;
        //  1035: checkcast       Lgg/essential/elementa/UIComponent;
        //  1038: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1041: aload_0         /* this */
        //  1042: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1045: iconst_4       
        //  1046: aaload         
        //  1047: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1050: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.selectorContent$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1053: aload_0         /* this */
        //  1054: new             Lgg/essential/elementa/components/UIContainer;
        //  1057: dup            
        //  1058: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1061: checkcast       Lgg/essential/elementa/UIComponent;
        //  1064: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1067: astore          $this$constrain$iv
        //  1069: aload           $this$constrain$iv
        //  1071: astore          7
        //  1073: aload           7
        //  1075: astore          $this$constrain_u24lambda_u2d0$iv
        //  1077: aload           $this$constrain_u24lambda_u2d0$iv
        //  1079: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1082: astore          10
        //  1084: astore          12
        //  1086: aload           $this$selectorInnerContent_delegate_u24lambda_u2d7
        //  1088: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //  1091: dup            
        //  1092: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //  1095: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1098: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1101: aload           $this$selectorInnerContent_delegate_u24lambda_u2d7
        //  1103: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1106: dup            
        //  1107: fconst_0       
        //  1108: iconst_1       
        //  1109: aconst_null    
        //  1110: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1113: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1116: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1119: aload           12
        //  1121: aload           7
        //  1123: aload_0         /* this */
        //  1124: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getSelectorContent:()Lgg/essential/elementa/components/UIBlock;
        //  1127: checkcast       Lgg/essential/elementa/UIComponent;
        //  1130: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1133: aload_0         /* this */
        //  1134: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1137: iconst_5       
        //  1138: aaload         
        //  1139: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1142: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.selectorInnerContent$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1145: aload_0         /* this */
        //  1146: new             Lgg/essential/elementa/components/UIContainer;
        //  1149: dup            
        //  1150: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1153: checkcast       Lgg/essential/elementa/UIComponent;
        //  1156: astore          $this$constrain$iv
        //  1158: aload           $this$constrain$iv
        //  1160: astore          7
        //  1162: aload           7
        //  1164: astore          $this$constrain_u24lambda_u2d0$iv
        //  1166: aload           $this$constrain_u24lambda_u2d0$iv
        //  1168: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1171: astore          10
        //  1173: astore          12
        //  1175: aload           $this$hueSaturationBrightnessRow_delegate_u24lambda_u2d8
        //  1177: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1180: dup            
        //  1181: fconst_0       
        //  1182: iconst_1       
        //  1183: aconst_null    
        //  1184: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1187: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1190: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1193: aload           $this$hueSaturationBrightnessRow_delegate_u24lambda_u2d8
        //  1195: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //  1198: dup            
        //  1199: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //  1202: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1205: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1208: aload           12
        //  1210: aload           7
        //  1212: aload_0         /* this */
        //  1213: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getSelectorInnerContent:()Lgg/essential/elementa/components/UIContainer;
        //  1216: checkcast       Lgg/essential/elementa/UIComponent;
        //  1219: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1222: aload_0         /* this */
        //  1223: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1226: bipush          6
        //  1228: aaload         
        //  1229: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1232: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.hueSaturationBrightnessRow$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1235: aload_0         /* this */
        //  1236: new             Lgg/essential/elementa/components/UIBlock;
        //  1239: dup            
        //  1240: getstatic       gg/essential/gui/EssentialPalette.BUTTON:Ljava/awt/Color;
        //  1243: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  1246: checkcast       Lgg/essential/elementa/UIComponent;
        //  1249: astore          $this$constrain$iv
        //  1251: aload           $this$constrain$iv
        //  1253: astore          7
        //  1255: aload           7
        //  1257: astore          $this$constrain_u24lambda_u2d0$iv
        //  1259: aload           $this$constrain_u24lambda_u2d0$iv
        //  1261: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1264: astore          10
        //  1266: astore          12
        //  1268: aload           $this$saturationBrightnessContainer_delegate_u24lambda_u2d9
        //  1270: ldc_w           69.0
        //  1273: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1276: checkcast       Ljava/lang/Number;
        //  1279: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1282: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1285: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1288: aload           $this$saturationBrightnessContainer_delegate_u24lambda_u2d9
        //  1290: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //  1293: dup            
        //  1294: fconst_1       
        //  1295: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //  1298: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1301: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1304: aload           12
        //  1306: aload           7
        //  1308: aload_0         /* this */
        //  1309: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getHueSaturationBrightnessRow:()Lgg/essential/elementa/components/UIContainer;
        //  1312: checkcast       Lgg/essential/elementa/UIComponent;
        //  1315: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1318: aload_0         /* this */
        //  1319: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1322: bipush          7
        //  1324: aaload         
        //  1325: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1328: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.saturationBrightnessContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1331: aload_0         /* this */
        //  1332: new             Lgg/essential/elementa/components/UIBlock;
        //  1335: dup            
        //  1336: getstatic       gg/essential/gui/EssentialPalette.BUTTON:Ljava/awt/Color;
        //  1339: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  1342: checkcast       Lgg/essential/elementa/UIComponent;
        //  1345: astore          $this$constrain$iv
        //  1347: aload           $this$constrain$iv
        //  1349: astore          7
        //  1351: aload           7
        //  1353: astore          $this$constrain_u24lambda_u2d0$iv
        //  1355: aload           $this$constrain_u24lambda_u2d0$iv
        //  1357: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1360: astore          10
        //  1362: astore          12
        //  1364: aload           $this$alphaContainer_delegate_u24lambda_u2d10
        //  1366: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1369: dup            
        //  1370: ldc_w           5.0
        //  1373: iconst_0       
        //  1374: iconst_2       
        //  1375: aconst_null    
        //  1376: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1379: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1382: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1385: aload           $this$alphaContainer_delegate_u24lambda_u2d10
        //  1387: ldc_w           9.0
        //  1390: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1393: checkcast       Ljava/lang/Number;
        //  1396: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1399: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1402: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1405: aload           $this$alphaContainer_delegate_u24lambda_u2d10
        //  1407: ldc_w           69.0
        //  1410: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1413: checkcast       Ljava/lang/Number;
        //  1416: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1419: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1422: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1425: aload           12
        //  1427: aload           7
        //  1429: aload_0         /* this */
        //  1430: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getSelectorInnerContent:()Lgg/essential/elementa/components/UIContainer;
        //  1433: checkcast       Lgg/essential/elementa/UIComponent;
        //  1436: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1439: aload_0         /* this */
        //  1440: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1443: bipush          8
        //  1445: aaload         
        //  1446: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1449: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.alphaContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1452: aload_0         /* this */
        //  1453: new             Lgg/essential/elementa/components/UIBlock;
        //  1456: dup            
        //  1457: getstatic       gg/essential/gui/EssentialPalette.BUTTON:Ljava/awt/Color;
        //  1460: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  1463: checkcast       Lgg/essential/elementa/UIComponent;
        //  1466: astore          $this$constrain$iv
        //  1468: aload           $this$constrain$iv
        //  1470: astore          7
        //  1472: aload           7
        //  1474: astore          $this$constrain_u24lambda_u2d0$iv
        //  1476: aload           $this$constrain_u24lambda_u2d0$iv
        //  1478: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1481: astore          10
        //  1483: astore          12
        //  1485: aload           $this$colorHistoryBlock_delegate_u24lambda_u2d11
        //  1487: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1490: dup            
        //  1491: ldc_w           5.0
        //  1494: iconst_0       
        //  1495: iconst_2       
        //  1496: aconst_null    
        //  1497: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1500: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1503: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1506: aload           $this$colorHistoryBlock_delegate_u24lambda_u2d11
        //  1508: ldc_w           9.0
        //  1511: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1514: checkcast       Ljava/lang/Number;
        //  1517: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1520: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1523: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1526: aload           $this$colorHistoryBlock_delegate_u24lambda_u2d11
        //  1528: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1531: dup            
        //  1532: fconst_0       
        //  1533: iconst_1       
        //  1534: aconst_null    
        //  1535: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1538: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1541: iconst_2       
        //  1542: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1545: checkcast       Ljava/lang/Number;
        //  1548: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1551: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1554: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1557: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1560: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1563: aload           12
        //  1565: aload           7
        //  1567: aload_0         /* this */
        //  1568: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getSelectorInnerContent:()Lgg/essential/elementa/components/UIContainer;
        //  1571: checkcast       Lgg/essential/elementa/UIComponent;
        //  1574: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1577: aload_0         /* this */
        //  1578: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1581: bipush          9
        //  1583: aaload         
        //  1584: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1587: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.colorHistoryBlock$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1590: aload_0         /* this */
        //  1591: new             Lgg/essential/elementa/components/UIContainer;
        //  1594: dup            
        //  1595: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1598: checkcast       Lgg/essential/elementa/UIComponent;
        //  1601: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1604: astore          $this$constrain$iv
        //  1606: aload           $this$constrain$iv
        //  1608: astore          7
        //  1610: aload           7
        //  1612: astore          $this$constrain_u24lambda_u2d0$iv
        //  1614: aload           $this$constrain_u24lambda_u2d0$iv
        //  1616: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1619: astore          10
        //  1621: astore          12
        //  1623: aload           $this$colorHistoryContainer_delegate_u24lambda_u2d12
        //  1625: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1628: dup            
        //  1629: fconst_0       
        //  1630: iconst_1       
        //  1631: aconst_null    
        //  1632: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1635: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1638: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1641: aload           $this$colorHistoryContainer_delegate_u24lambda_u2d12
        //  1643: bipush          100
        //  1645: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1648: checkcast       Ljava/lang/Number;
        //  1651: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1654: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1657: iconst_2       
        //  1658: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1661: checkcast       Ljava/lang/Number;
        //  1664: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1667: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1670: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  1673: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1676: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1679: aload           12
        //  1681: aload           7
        //  1683: aload_0         /* this */
        //  1684: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getColorHistoryBlock:()Lgg/essential/elementa/components/UIBlock;
        //  1687: checkcast       Lgg/essential/elementa/UIComponent;
        //  1690: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1693: aload_0         /* this */
        //  1694: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1697: bipush          10
        //  1699: aaload         
        //  1700: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1703: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.colorHistoryContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1706: aload_0         /* this */
        //  1707: new             Lgg/essential/elementa/components/UIBlock;
        //  1710: dup            
        //  1711: getstatic       gg/essential/gui/EssentialPalette.BUTTON:Ljava/awt/Color;
        //  1714: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  1717: checkcast       Lgg/essential/elementa/UIComponent;
        //  1720: astore          $this$constrain$iv
        //  1722: aload           $this$constrain$iv
        //  1724: astore          7
        //  1726: aload           7
        //  1728: astore          $this$constrain_u24lambda_u2d0$iv
        //  1730: aload           $this$constrain_u24lambda_u2d0$iv
        //  1732: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1735: astore          10
        //  1737: astore          12
        //  1739: aload           $this$hueContainer_delegate_u24lambda_u2d13
        //  1741: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1744: dup            
        //  1745: ldc_w           5.0
        //  1748: iconst_0       
        //  1749: iconst_2       
        //  1750: aconst_null    
        //  1751: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1754: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1757: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1760: aload           $this$hueContainer_delegate_u24lambda_u2d13
        //  1762: ldc_w           69.0
        //  1765: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1768: checkcast       Ljava/lang/Number;
        //  1771: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1774: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1777: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1780: aload           $this$hueContainer_delegate_u24lambda_u2d13
        //  1782: ldc_w           9.0
        //  1785: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1788: checkcast       Ljava/lang/Number;
        //  1791: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1794: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1797: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1800: aload           12
        //  1802: aload           7
        //  1804: aload_0         /* this */
        //  1805: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getHueSaturationBrightnessRow:()Lgg/essential/elementa/components/UIContainer;
        //  1808: checkcast       Lgg/essential/elementa/UIComponent;
        //  1811: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1814: aload_0         /* this */
        //  1815: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1818: bipush          11
        //  1820: aaload         
        //  1821: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1824: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.hueContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1827: aload_0         /* this */
        //  1828: new             Lgg/essential/elementa/components/UIContainer;
        //  1831: dup            
        //  1832: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1835: checkcast       Lgg/essential/elementa/UIComponent;
        //  1838: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1841: astore          $this$constrain$iv
        //  1843: aload           $this$constrain$iv
        //  1845: astore          7
        //  1847: aload           7
        //  1849: astore          $this$constrain_u24lambda_u2d0$iv
        //  1851: aload           $this$constrain_u24lambda_u2d0$iv
        //  1853: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1856: astore          10
        //  1858: astore          12
        //  1860: aload           $this$alphaContentContainer_delegate_u24lambda_u2d14
        //  1862: bipush          100
        //  1864: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1867: checkcast       Ljava/lang/Number;
        //  1870: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1873: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1876: iconst_4       
        //  1877: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1880: checkcast       Ljava/lang/Number;
        //  1883: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1886: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1889: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  1892: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1895: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1898: aload           $this$alphaContentContainer_delegate_u24lambda_u2d14
        //  1900: bipush          100
        //  1902: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1905: checkcast       Ljava/lang/Number;
        //  1908: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1911: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1914: iconst_4       
        //  1915: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1918: checkcast       Ljava/lang/Number;
        //  1921: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1924: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1927: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  1930: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1933: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1936: aload           12
        //  1938: aload           7
        //  1940: aload_0         /* this */
        //  1941: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getAlphaContainer:()Lgg/essential/elementa/components/UIBlock;
        //  1944: checkcast       Lgg/essential/elementa/UIComponent;
        //  1947: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1950: aload_0         /* this */
        //  1951: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1954: bipush          12
        //  1956: aaload         
        //  1957: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1960: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.alphaContentContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1963: aload_0         /* this */
        //  1964: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$alphaArea$2;
        //  1967: dup            
        //  1968: aload_0         /* this */
        //  1969: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$alphaArea$2.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;)V
        //  1972: checkcast       Lgg/essential/elementa/UIComponent;
        //  1975: astore          $this$constrain$iv
        //  1977: aload           $this$constrain$iv
        //  1979: astore          7
        //  1981: aload           7
        //  1983: astore          $this$constrain_u24lambda_u2d0$iv
        //  1985: aload           $this$constrain_u24lambda_u2d0$iv
        //  1987: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1990: astore          10
        //  1992: astore          12
        //  1994: aload           $this$alphaArea_delegate_u24lambda_u2d15
        //  1996: bipush          100
        //  1998: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2001: checkcast       Ljava/lang/Number;
        //  2004: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2007: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2010: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2013: aload           $this$alphaArea_delegate_u24lambda_u2d15
        //  2015: bipush          100
        //  2017: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2020: checkcast       Ljava/lang/Number;
        //  2023: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2026: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2029: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  2032: aload           12
        //  2034: aload           7
        //  2036: aload_0         /* this */
        //  2037: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getAlphaContentContainer:()Lgg/essential/elementa/components/UIContainer;
        //  2040: checkcast       Lgg/essential/elementa/UIComponent;
        //  2043: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2046: new             Lgg/essential/gui/screenshot/components/CheckerboardBackgroundEffect;
        //  2049: dup            
        //  2050: invokespecial   gg/essential/gui/screenshot/components/CheckerboardBackgroundEffect.<init>:()V
        //  2053: checkcast       Lgg/essential/elementa/effects/Effect;
        //  2056: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //  2059: aload_0         /* this */
        //  2060: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2063: bipush          13
        //  2065: aaload         
        //  2066: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2069: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.alphaArea$delegate:Lkotlin/properties/ReadWriteProperty;
        //  2072: new             Lgg/essential/elementa/components/UIContainer;
        //  2075: dup            
        //  2076: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  2079: checkcast       Lgg/essential/elementa/UIComponent;
        //  2082: astore          $this$constrain$iv
        //  2084: aload           $this$constrain$iv
        //  2086: astore          7
        //  2088: aload           7
        //  2090: astore          $this$constrain_u24lambda_u2d0$iv
        //  2092: aload           $this$constrain_u24lambda_u2d0$iv
        //  2094: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2097: astore          $this$alphaSlider_delegate_u24lambda_u2d16
        //  2099: aload           $this$alphaSlider_delegate_u24lambda_u2d16
        //  2101: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2104: dup            
        //  2105: fconst_0       
        //  2106: iconst_1       
        //  2107: aconst_null    
        //  2108: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2111: aload_0         /* this */
        //  2112: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.alpha:Lgg/essential/elementa/state/BasicState;
        //  2115: checkcast       Lgg/essential/elementa/state/State;
        //  2118: invokevirtual   gg/essential/elementa/constraints/RelativeConstraint.bindValue:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2121: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2124: iconst_0       
        //  2125: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2128: checkcast       Ljava/lang/Number;
        //  2131: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2134: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2137: bipush          100
        //  2139: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2142: checkcast       Ljava/lang/Number;
        //  2145: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2148: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2151: iconst_1       
        //  2152: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2155: checkcast       Ljava/lang/Number;
        //  2158: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2161: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2164: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2167: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2170: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceIn:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceInConstraint;
        //  2173: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2176: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2179: aload           $this$alphaSlider_delegate_u24lambda_u2d16
        //  2181: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  2184: dup            
        //  2185: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  2188: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  2191: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  2194: aload           $this$alphaSlider_delegate_u24lambda_u2d16
        //  2196: iconst_1       
        //  2197: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2200: checkcast       Ljava/lang/Number;
        //  2203: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2206: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2209: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2212: aload           $this$alphaSlider_delegate_u24lambda_u2d16
        //  2214: bipush          100
        //  2216: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2219: checkcast       Ljava/lang/Number;
        //  2222: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2225: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2228: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  2231: aload           7
        //  2233: new             Lgg/essential/elementa/effects/OutlineEffect;
        //  2236: dup            
        //  2237: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //  2240: fconst_1       
        //  2241: iconst_0       
        //  2242: iconst_0       
        //  2243: aconst_null    
        //  2244: bipush          28
        //  2246: aconst_null    
        //  2247: invokespecial   gg/essential/elementa/effects/OutlineEffect.<init>:(Ljava/awt/Color;FZZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2250: checkcast       Lgg/essential/elementa/effects/Effect;
        //  2253: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //  2256: aload_0         /* this */
        //  2257: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getAlphaArea:()Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$alphaArea$2;
        //  2260: checkcast       Lgg/essential/elementa/UIComponent;
        //  2263: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2266: aload_0         /* this */
        //  2267: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2270: bipush          14
        //  2272: aaload         
        //  2273: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2276: pop            
        //  2277: aload_0         /* this */
        //  2278: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$hueArea$2;
        //  2281: dup            
        //  2282: aload_0         /* this */
        //  2283: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$hueArea$2.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;)V
        //  2286: checkcast       Lgg/essential/elementa/UIComponent;
        //  2289: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2292: astore          $this$constrain$iv
        //  2294: aload           $this$constrain$iv
        //  2296: astore          7
        //  2298: aload           7
        //  2300: astore          $this$constrain_u24lambda_u2d0$iv
        //  2302: aload           $this$constrain_u24lambda_u2d0$iv
        //  2304: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2307: astore          10
        //  2309: astore          12
        //  2311: aload           $this$hueArea_delegate_u24lambda_u2d17
        //  2313: bipush          100
        //  2315: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2318: checkcast       Ljava/lang/Number;
        //  2321: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2324: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2327: iconst_4       
        //  2328: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2331: checkcast       Ljava/lang/Number;
        //  2334: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2337: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2340: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2343: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2346: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2349: aload           $this$hueArea_delegate_u24lambda_u2d17
        //  2351: bipush          100
        //  2353: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2356: checkcast       Ljava/lang/Number;
        //  2359: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2362: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2365: iconst_4       
        //  2366: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2369: checkcast       Ljava/lang/Number;
        //  2372: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2375: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2378: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2381: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2384: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  2387: aload           12
        //  2389: aload           7
        //  2391: aload_0         /* this */
        //  2392: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getHueContainer:()Lgg/essential/elementa/components/UIBlock;
        //  2395: checkcast       Lgg/essential/elementa/UIComponent;
        //  2398: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2401: aload_0         /* this */
        //  2402: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2405: bipush          15
        //  2407: aaload         
        //  2408: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2411: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.hueArea$delegate:Lkotlin/properties/ReadWriteProperty;
        //  2414: new             Lgg/essential/elementa/components/UIContainer;
        //  2417: dup            
        //  2418: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  2421: checkcast       Lgg/essential/elementa/UIComponent;
        //  2424: astore          $this$constrain$iv
        //  2426: aload           $this$constrain$iv
        //  2428: astore          7
        //  2430: aload           7
        //  2432: astore          $this$constrain_u24lambda_u2d0$iv
        //  2434: aload           $this$constrain_u24lambda_u2d0$iv
        //  2436: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2439: astore          $this$hueSlider_delegate_u24lambda_u2d18
        //  2441: aload           $this$hueSlider_delegate_u24lambda_u2d18
        //  2443: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  2446: dup            
        //  2447: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  2450: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2453: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2456: aload           $this$hueSlider_delegate_u24lambda_u2d18
        //  2458: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2461: dup            
        //  2462: fconst_0       
        //  2463: iconst_1       
        //  2464: aconst_null    
        //  2465: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2468: aload_0         /* this */
        //  2469: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.hue:Lgg/essential/elementa/state/BasicState;
        //  2472: checkcast       Lgg/essential/elementa/state/State;
        //  2475: invokevirtual   gg/essential/elementa/constraints/RelativeConstraint.bindValue:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2478: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2481: iconst_0       
        //  2482: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2485: checkcast       Ljava/lang/Number;
        //  2488: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2491: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2494: bipush          100
        //  2496: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2499: checkcast       Ljava/lang/Number;
        //  2502: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2505: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2508: iconst_1       
        //  2509: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2512: checkcast       Ljava/lang/Number;
        //  2515: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2518: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2521: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2524: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2527: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceIn:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceInConstraint;
        //  2530: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  2533: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  2536: aload           $this$hueSlider_delegate_u24lambda_u2d18
        //  2538: bipush          100
        //  2540: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2543: checkcast       Ljava/lang/Number;
        //  2546: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2549: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2552: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2555: aload           $this$hueSlider_delegate_u24lambda_u2d18
        //  2557: iconst_1       
        //  2558: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2561: checkcast       Ljava/lang/Number;
        //  2564: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2567: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2570: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  2573: aload           7
        //  2575: new             Lgg/essential/elementa/effects/OutlineEffect;
        //  2578: dup            
        //  2579: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //  2582: fconst_1       
        //  2583: iconst_0       
        //  2584: iconst_0       
        //  2585: aconst_null    
        //  2586: bipush          28
        //  2588: aconst_null    
        //  2589: invokespecial   gg/essential/elementa/effects/OutlineEffect.<init>:(Ljava/awt/Color;FZZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2592: checkcast       Lgg/essential/elementa/effects/Effect;
        //  2595: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //  2598: aload_0         /* this */
        //  2599: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getHueArea:()Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$hueArea$2;
        //  2602: checkcast       Lgg/essential/elementa/UIComponent;
        //  2605: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2608: aload_0         /* this */
        //  2609: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2612: bipush          16
        //  2614: aaload         
        //  2615: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2618: pop            
        //  2619: aload_0         /* this */
        //  2620: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$saturationBrightnessArea$2;
        //  2623: dup            
        //  2624: aload_0         /* this */
        //  2625: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$saturationBrightnessArea$2.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;)V
        //  2628: checkcast       Lgg/essential/elementa/UIComponent;
        //  2631: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2634: astore          $this$constrain$iv
        //  2636: aload           $this$constrain$iv
        //  2638: astore          7
        //  2640: aload           7
        //  2642: astore          $this$constrain_u24lambda_u2d0$iv
        //  2644: aload           $this$constrain_u24lambda_u2d0$iv
        //  2646: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2649: astore          10
        //  2651: astore          12
        //  2653: aload           $this$saturationBrightnessArea_delegate_u24lambda_u2d19
        //  2655: bipush          100
        //  2657: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2660: checkcast       Ljava/lang/Number;
        //  2663: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2666: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2669: iconst_4       
        //  2670: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2673: checkcast       Ljava/lang/Number;
        //  2676: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2679: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2682: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2685: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2688: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2691: aload           $this$saturationBrightnessArea_delegate_u24lambda_u2d19
        //  2693: bipush          100
        //  2695: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2698: checkcast       Ljava/lang/Number;
        //  2701: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2704: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2707: iconst_4       
        //  2708: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2711: checkcast       Ljava/lang/Number;
        //  2714: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2717: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2720: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2723: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2726: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  2729: aload           12
        //  2731: aload           7
        //  2733: aload_0         /* this */
        //  2734: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getSaturationBrightnessContainer:()Lgg/essential/elementa/components/UIBlock;
        //  2737: checkcast       Lgg/essential/elementa/UIComponent;
        //  2740: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2743: aload_0         /* this */
        //  2744: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2747: bipush          17
        //  2749: aaload         
        //  2750: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2753: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.saturationBrightnessArea$delegate:Lkotlin/properties/ReadWriteProperty;
        //  2756: new             Lgg/essential/elementa/components/UIContainer;
        //  2759: dup            
        //  2760: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  2763: checkcast       Lgg/essential/elementa/UIComponent;
        //  2766: astore          $this$constrain$iv
        //  2768: aload           $this$constrain$iv
        //  2770: astore          7
        //  2772: aload           7
        //  2774: astore          $this$constrain_u24lambda_u2d0$iv
        //  2776: aload           $this$constrain_u24lambda_u2d0$iv
        //  2778: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2781: astore          $this$saturationBrightnessSelection_delegate_u24lambda_u2d20
        //  2783: aload           $this$saturationBrightnessSelection_delegate_u24lambda_u2d20
        //  2785: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2788: dup            
        //  2789: fconst_0       
        //  2790: iconst_1       
        //  2791: aconst_null    
        //  2792: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2795: aload_0         /* this */
        //  2796: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.saturation:Lgg/essential/elementa/state/BasicState;
        //  2799: checkcast       Lgg/essential/elementa/state/State;
        //  2802: invokevirtual   gg/essential/elementa/constraints/RelativeConstraint.bindValue:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2805: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2808: iconst_0       
        //  2809: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2812: checkcast       Ljava/lang/Number;
        //  2815: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2818: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2821: bipush          100
        //  2823: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2826: checkcast       Ljava/lang/Number;
        //  2829: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2832: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2835: iconst_1       
        //  2836: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2839: checkcast       Ljava/lang/Number;
        //  2842: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2845: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2848: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2851: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2854: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceIn:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceInConstraint;
        //  2857: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2860: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2863: aload           $this$saturationBrightnessSelection_delegate_u24lambda_u2d20
        //  2865: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2868: dup            
        //  2869: fconst_0       
        //  2870: iconst_1       
        //  2871: aconst_null    
        //  2872: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2875: aload_0         /* this */
        //  2876: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.brightness:Lgg/essential/elementa/state/BasicState;
        //  2879: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker$saturationBrightnessSelection$2$1.INSTANCE:Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$saturationBrightnessSelection$2$1;
        //  2882: checkcast       Lkotlin/jvm/functions/Function1;
        //  2885: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  2888: checkcast       Lgg/essential/elementa/state/State;
        //  2891: invokevirtual   gg/essential/elementa/constraints/RelativeConstraint.bindValue:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2894: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2897: iconst_0       
        //  2898: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2901: checkcast       Ljava/lang/Number;
        //  2904: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2907: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2910: bipush          100
        //  2912: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2915: checkcast       Ljava/lang/Number;
        //  2918: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2921: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2924: iconst_1       
        //  2925: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2928: checkcast       Ljava/lang/Number;
        //  2931: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2934: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2937: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2940: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2943: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceIn:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceInConstraint;
        //  2946: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  2949: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  2952: aload           $this$saturationBrightnessSelection_delegate_u24lambda_u2d20
        //  2954: iconst_1       
        //  2955: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2958: checkcast       Ljava/lang/Number;
        //  2961: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2964: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2967: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2970: aload           $this$saturationBrightnessSelection_delegate_u24lambda_u2d20
        //  2972: iconst_1       
        //  2973: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2976: checkcast       Ljava/lang/Number;
        //  2979: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2982: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2985: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  2988: aload           7
        //  2990: aload_0         /* this */
        //  2991: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getSaturationBrightnessArea:()Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$saturationBrightnessArea$2;
        //  2994: checkcast       Lgg/essential/elementa/UIComponent;
        //  2997: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  3000: new             Lgg/essential/elementa/effects/OutlineEffect;
        //  3003: dup            
        //  3004: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //  3007: fconst_1       
        //  3008: iconst_0       
        //  3009: iconst_0       
        //  3010: aconst_null    
        //  3011: bipush          28
        //  3013: aconst_null    
        //  3014: invokespecial   gg/essential/elementa/effects/OutlineEffect.<init>:(Ljava/awt/Color;FZZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  3017: checkcast       Lgg/essential/elementa/effects/Effect;
        //  3020: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //  3023: aload_0         /* this */
        //  3024: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  3027: bipush          18
        //  3029: aaload         
        //  3030: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  3033: pop            
        //  3034: aload_0         /* this */
        //  3035: new             Lgg/essential/elementa/state/BasicState;
        //  3038: dup            
        //  3039: iconst_0       
        //  3040: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3043: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  3046: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.activeColorIndex:Lgg/essential/elementa/state/BasicState;
        //  3049: aload_0         /* this */
        //  3050: aload_0         /* this */
        //  3051: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getHueContainer:()Lgg/essential/elementa/components/UIBlock;
        //  3054: checkcast       Lgg/essential/elementa/UIComponent;
        //  3057: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.createMouseDragListener:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/state/State;
        //  3060: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$1;
        //  3063: dup            
        //  3064: aload_0         /* this */
        //  3065: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$1.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;)V
        //  3068: checkcast       Lkotlin/jvm/functions/Function1;
        //  3071: invokevirtual   gg/essential/elementa/state/State.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  3074: pop            
        //  3075: aload_0         /* this */
        //  3076: aload_0         /* this */
        //  3077: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getAlphaContainer:()Lgg/essential/elementa/components/UIBlock;
        //  3080: checkcast       Lgg/essential/elementa/UIComponent;
        //  3083: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.createMouseDragListener:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/state/State;
        //  3086: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$2;
        //  3089: dup            
        //  3090: aload_0         /* this */
        //  3091: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$2.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;)V
        //  3094: checkcast       Lkotlin/jvm/functions/Function1;
        //  3097: invokevirtual   gg/essential/elementa/state/State.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  3100: pop            
        //  3101: aload_0         /* this */
        //  3102: aload_0         /* this */
        //  3103: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getSaturationBrightnessContainer:()Lgg/essential/elementa/components/UIBlock;
        //  3106: checkcast       Lgg/essential/elementa/UIComponent;
        //  3109: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.createMouseDragListener:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/state/State;
        //  3112: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$3;
        //  3115: dup            
        //  3116: aload_0         /* this */
        //  3117: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$3.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;)V
        //  3120: checkcast       Lkotlin/jvm/functions/Function1;
        //  3123: invokevirtual   gg/essential/elementa/state/State.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  3126: pop            
        //  3127: aload_0         /* this */
        //  3128: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getCollapsedBlock:()Lgg/essential/elementa/UIComponent;
        //  3131: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //  3134: aload_0         /* this */
        //  3135: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getCollapsedBlock:()Lgg/essential/elementa/UIComponent;
        //  3138: iconst_0       
        //  3139: iconst_0       
        //  3140: iconst_3       
        //  3141: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //  3144: aload_0         /* this */
        //  3145: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.showMenu:Lgg/essential/elementa/state/BasicState;
        //  3148: checkcast       Lgg/essential/elementa/state/State;
        //  3151: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3154: checkcast       Lgg/essential/elementa/state/State;
        //  3157: invokevirtual   gg/essential/gui/EssentialPalette.getButtonColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //  3160: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  3163: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  3166: invokevirtual   gg/essential/elementa/UIComponent.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //  3169: pop            
        //  3170: aload_0         /* this */
        //  3171: checkcast       Lgg/essential/elementa/UIComponent;
        //  3174: astore          $this$constrain$iv
        //  3176: aload           $this$constrain$iv
        //  3178: astore          7
        //  3180: aload           7
        //  3182: astore          $this$constrain_u24lambda_u2d0$iv
        //  3184: aload           $this$constrain_u24lambda_u2d0$iv
        //  3186: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  3189: astore          $this$_init__u24lambda_u2d21
        //  3191: aload           $this$_init__u24lambda_u2d21
        //  3193: bipush          100
        //  3195: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3198: checkcast       Ljava/lang/Number;
        //  3201: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  3204: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  3207: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  3210: aload           $this$_init__u24lambda_u2d21
        //  3212: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //  3215: dup            
        //  3216: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //  3219: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  3222: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  3225: aload_0         /* this */
        //  3226: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.screenshotManager:Lgg/essential/network/connectionmanager/media/ScreenshotManager;
        //  3229: invokevirtual   gg/essential/network/connectionmanager/media/ScreenshotManager.getEditorColors:()[Lgg/essential/gui/screenshot/components/HSBColor;
        //  3232: dup            
        //  3233: ldc_w           "screenshotManager.editorColors"
        //  3236: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //  3239: astore          5
        //  3241: iconst_0       
        //  3242: istore          6
        //  3244: aload           5
        //  3246: arraylength    
        //  3247: istore          7
        //  3249: iload           6
        //  3251: iload           7
        //  3253: if_icmpge       3321
        //  3256: iload           6
        //  3258: istore          index
        //  3260: aload           5
        //  3262: iload           6
        //  3264: aaload         
        //  3265: astore          colorPreset
        //  3267: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice;
        //  3270: dup            
        //  3271: aload_0         /* this */
        //  3272: new             Lgg/essential/elementa/state/BasicState;
        //  3275: dup            
        //  3276: aload           colorPreset
        //  3278: ldc_w           "colorPreset"
        //  3281: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //  3284: aload           colorPreset
        //  3286: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  3289: checkcast       Lgg/essential/elementa/state/State;
        //  3292: iload           index
        //  3294: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;Lgg/essential/elementa/state/State;I)V
        //  3297: astore          colorChoice
        //  3299: aload           colorChoice
        //  3301: checkcast       Lgg/essential/elementa/UIComponent;
        //  3304: aload_0         /* this */
        //  3305: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getColorHistoryContainer:()Lgg/essential/elementa/components/UIContainer;
        //  3308: checkcast       Lgg/essential/elementa/UIComponent;
        //  3311: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  3314: pop            
        //  3315: iinc            6, 1
        //  3318: goto            3249
        //  3321: aload_0         /* this */
        //  3322: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.activeColorIndex:Lgg/essential/elementa/state/BasicState;
        //  3325: checkcast       Lgg/essential/elementa/state/State;
        //  3328: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$5;
        //  3331: dup            
        //  3332: aload_0         /* this */
        //  3333: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$5.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;)V
        //  3336: checkcast       Lkotlin/jvm/functions/Function1;
        //  3339: invokestatic    gg/essential/gui/common/StateExtensionsKt.onSetValueAndNow:(Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  3342: pop            
        //  3343: aload_0         /* this */
        //  3344: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.hsb:Lgg/essential/elementa/state/State;
        //  3347: aload_0         /* this */
        //  3348: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.alpha:Lgg/essential/elementa/state/BasicState;
        //  3351: checkcast       Lgg/essential/elementa/state/State;
        //  3354: invokevirtual   gg/essential/elementa/state/State.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //  3357: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$6;
        //  3360: dup            
        //  3361: aload_0         /* this */
        //  3362: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$6.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;)V
        //  3365: checkcast       Lkotlin/jvm/functions/Function1;
        //  3368: invokestatic    gg/essential/gui/common/StateExtensionsKt.onSetValueAndNow:(Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  3371: pop            
        //  3372: aload           active
        //  3374: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$7;
        //  3377: dup            
        //  3378: aload_0         /* this */
        //  3379: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$7.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;)V
        //  3382: checkcast       Lkotlin/jvm/functions/Function1;
        //  3385: invokevirtual   gg/essential/elementa/state/State.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  3388: pop            
        //  3389: return         
        //    Signature:
        //  (Lgg/essential/gui/screenshot/editor/tools/PenTool;Lgg/essential/network/connectionmanager/media/ScreenshotManager;Lgg/essential/gui/screenshot/components/ScreenshotBrowser;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;)V
        //    MethodParameters:
        //  Name               Flags  
        //  -----------------  -----
        //  penTool            
        //  screenshotManager  
        //  screenshotBrowser  
        //  active             
        //    StackMapTable: 00 04 FF 00 A4 00 0D 07 00 02 07 00 EE 07 00 F0 07 00 F2 07 00 F4 07 00 DB 00 07 00 DB 07 00 E8 00 07 00 F6 00 07 00 02 00 00 38 FF 0B D3 00 0D 07 00 02 07 00 EE 07 00 F0 07 00 F2 07 00 F4 07 02 4D 01 01 00 00 07 02 4F 00 07 00 02 00 00 FB 00 47
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIComponent getCollapsedBlock() {
        return (UIComponent)this.collapsedBlock$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[0]);
    }
    
    private final UIBlock getCurrentColor() {
        return (UIBlock)this.currentColor$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[1]);
    }
    
    private final UIBlock getButtonConnector() {
        return (UIBlock)this.buttonConnector$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[2]);
    }
    
    private final UIBlock getSelectorBlock() {
        return (UIBlock)this.selectorBlock$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[3]);
    }
    
    private final UIBlock getSelectorContent() {
        return (UIBlock)this.selectorContent$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[4]);
    }
    
    private final UIContainer getSelectorInnerContent() {
        return (UIContainer)this.selectorInnerContent$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[5]);
    }
    
    private final UIContainer getHueSaturationBrightnessRow() {
        return (UIContainer)this.hueSaturationBrightnessRow$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[6]);
    }
    
    private final UIBlock getSaturationBrightnessContainer() {
        return (UIBlock)this.saturationBrightnessContainer$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[7]);
    }
    
    private final UIBlock getAlphaContainer() {
        return (UIBlock)this.alphaContainer$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[8]);
    }
    
    private final UIBlock getColorHistoryBlock() {
        return (UIBlock)this.colorHistoryBlock$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[9]);
    }
    
    private final UIContainer getColorHistoryContainer() {
        return (UIContainer)this.colorHistoryContainer$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[10]);
    }
    
    private final UIBlock getHueContainer() {
        return (UIBlock)this.hueContainer$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[11]);
    }
    
    private final UIContainer getAlphaContentContainer() {
        return (UIContainer)this.alphaContentContainer$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[12]);
    }
    
    private final ScreenshotColorPicker$alphaArea.ScreenshotColorPicker$alphaArea$2 getAlphaArea() {
        return (ScreenshotColorPicker$alphaArea.ScreenshotColorPicker$alphaArea$2)this.alphaArea$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[13]);
    }
    
    private final ScreenshotColorPicker$hueArea.ScreenshotColorPicker$hueArea$2 getHueArea() {
        return (ScreenshotColorPicker$hueArea.ScreenshotColorPicker$hueArea$2)this.hueArea$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[15]);
    }
    
    private final ScreenshotColorPicker$saturationBrightnessArea.ScreenshotColorPicker$saturationBrightnessArea$2 getSaturationBrightnessArea() {
        return (ScreenshotColorPicker$saturationBrightnessArea.ScreenshotColorPicker$saturationBrightnessArea$2)this.saturationBrightnessArea$delegate.getValue((Object)this, (KProperty)ScreenshotColorPicker.$$delegatedProperties[17]);
    }
    
    public final void saveColors() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker.screenshotManager:Lgg/essential/network/connectionmanager/media/ScreenshotManager;
        //     4: aload_0         /* this */
        //     5: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.getColorHistoryContainer:()Lgg/essential/elementa/components/UIContainer;
        //     8: ldc             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice;.class
        //    10: invokevirtual   gg/essential/elementa/components/UIContainer.childrenOfType:(Ljava/lang/Class;)Ljava/util/List;
        //    13: checkcast       Ljava/lang/Iterable;
        //    16: astore_1       
        //    17: astore          7
        //    19: aload_1         /* $this$map$iv */
        //    20: astore_2       
        //    21: new             Ljava/util/ArrayList;
        //    24: dup            
        //    25: aload_1         /* $this$map$iv */
        //    26: bipush          10
        //    28: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    31: invokespecial   java/util/ArrayList.<init>:(I)V
        //    34: checkcast       Ljava/util/Collection;
        //    37: astore_3        /* destination$iv$iv */
        //    38: aload_2         /* $this$mapTo$iv$iv */
        //    39: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    44: astore          4
        //    46: aload           4
        //    48: invokeinterface java/util/Iterator.hasNext:()Z
        //    53: ifeq            98
        //    56: aload           4
        //    58: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    63: astore          item$iv$iv
        //    65: aload_3         /* destination$iv$iv */
        //    66: aload           item$iv$iv
        //    68: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice;
        //    71: astore          6
        //    73: astore          8
        //    75: aload           it
        //    77: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.getContainedColor:()Lgg/essential/elementa/state/State;
        //    80: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //    83: checkcast       Lgg/essential/gui/screenshot/components/HSBColor;
        //    86: aload           8
        //    88: swap           
        //    89: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    94: pop            
        //    95: goto            46
        //    98: aload_3         /* destination$iv$iv */
        //    99: checkcast       Ljava/util/List;
        //   102: aload           7
        //   104: swap           
        //   105: checkcast       Ljava/util/Collection;
        //   108: astore_1        /* $this$toTypedArray$iv */
        //   109: aload_1         /* $this$toTypedArray$iv */
        //   110: astore_2        /* thisCollection$iv */
        //   111: aload_2         /* thisCollection$iv */
        //   112: iconst_0       
        //   113: anewarray       Lgg/essential/gui/screenshot/components/HSBColor;
        //   116: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   121: dup            
        //   122: ldc_w           "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
        //   125: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   128: checkcast       [Lgg/essential/gui/screenshot/components/HSBColor;
        //   131: invokevirtual   gg/essential/network/connectionmanager/media/ScreenshotManager.updateEditorColors:([Lgg/essential/gui/screenshot/components/HSBColor;)V
        //   134: return         
        //    StackMapTable: 00 02 FF 00 2E 00 08 07 00 02 07 00 DB 07 00 DB 07 00 E8 07 00 F6 00 00 07 00 F0 00 00 33
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void drawColorPicker(final UMatrixStack matrixStack, final UIComponent component) {
        final double left = component.getLeft();
        final double top = component.getTop();
        final double right = component.getRight();
        final double bottom = component.getBottom();
        this.setupDraw();
        final UGraphics graphics = UGraphics.getFromTessellator();
        graphics.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
        final int horizontalSize = (int)(right - left);
        int x = 0;
        if (0 <= horizontalSize) {
            while (true) {
                final double curLeft = left + x;
                final double curRight = curLeft + 1.0;
                boolean first = true;
                final int verticalSize = (int)(bottom - top);
                int y = 0;
                if (0 <= verticalSize) {
                    while (true) {
                        final double yPos = top + y;
                        final Color color = this.getColor(x / (float)horizontalSize, 1.0f - y / (float)verticalSize, this.hue.get().floatValue());
                        if (!first) {
                            Intrinsics.checkNotNullExpressionValue((Object)graphics, "graphics");
                            this.drawVertex(graphics, matrixStack, curLeft, yPos, color);
                            this.drawVertex(graphics, matrixStack, curRight, yPos, color);
                        }
                        if (y < horizontalSize) {
                            Intrinsics.checkNotNullExpressionValue((Object)graphics, "graphics");
                            this.drawVertex(graphics, matrixStack, curRight, yPos, color);
                            this.drawVertex(graphics, matrixStack, curLeft, yPos, color);
                        }
                        first = false;
                        if (y == verticalSize) {
                            break;
                        }
                        ++y;
                    }
                }
                if (x == horizontalSize) {
                    break;
                }
                ++x;
            }
        }
        graphics.drawDirect();
        this.cleanupDraw();
    }
    
    private final void drawAlpha(final UMatrixStack matrixStack, final UIComponent component) {
        final double left = component.getLeft();
        final double top = component.getTop();
        final double right = component.getRight();
        final double bottom = component.getBottom();
        final UGraphics graphics = UGraphics.getFromTessellator();
        this.setupDraw();
        graphics.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
        Intrinsics.checkNotNullExpressionValue((Object)graphics, "graphics");
        final UGraphics graphics2 = graphics;
        final double x = left;
        final double y = top;
        State<HSBColor> currentColorState;
        if ((currentColorState = this.currentColorState) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentColorState");
            currentColorState = null;
        }
        this.drawVertex(graphics2, matrixStack, x, y, ExtensionsKt.withAlpha(currentColorState.get().toColor(), 0));
        final UGraphics graphics3 = graphics;
        final double x2 = left;
        final double y2 = bottom;
        State<HSBColor> currentColorState2;
        if ((currentColorState2 = this.currentColorState) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentColorState");
            currentColorState2 = null;
        }
        this.drawVertex(graphics3, matrixStack, x2, y2, ExtensionsKt.withAlpha(currentColorState2.get().toColor(), 0));
        final UGraphics graphics4 = graphics;
        final double x3 = right;
        final double y3 = bottom;
        State<HSBColor> currentColorState3;
        if ((currentColorState3 = this.currentColorState) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentColorState");
            currentColorState3 = null;
        }
        this.drawVertex(graphics4, matrixStack, x3, y3, ExtensionsKt.withAlpha(currentColorState3.get().toColor(), 255));
        final UGraphics graphics5 = graphics;
        final double x4 = right;
        final double y4 = top;
        State<HSBColor> currentColorState4;
        if ((currentColorState4 = this.currentColorState) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentColorState");
            currentColorState4 = null;
        }
        this.drawVertex(graphics5, matrixStack, x4, y4, ExtensionsKt.withAlpha(currentColorState4.get().toColor(), 255));
        graphics.drawDirect();
        this.cleanupDraw();
    }
    
    private final Color getColor(final float x, final float y, final float hue) {
        return new Color(Color.HSBtoRGB(hue, x, y));
    }
    
    private final void drawHueLine(final UMatrixStack matrixStack, final UIComponent component) {
        final double left = component.getLeft();
        final double top = component.getTop();
        final double right = component.getRight();
        final double height = component.getHeight();
        this.setupDraw();
        final UGraphics graphics = UGraphics.getFromTessellator();
        graphics.beginWithDefaultShader(UGraphics.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
        boolean first = true;
        final Iterator<Color> iterator = this.hueColorList.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final int i = n;
            ++n;
            final Color color = iterator.next();
            final double yPos = top + (float)i * height / 69.0;
            if (!first) {
                Intrinsics.checkNotNullExpressionValue((Object)graphics, "graphics");
                this.drawVertex(graphics, matrixStack, left, yPos, color);
                this.drawVertex(graphics, matrixStack, right, yPos, color);
            }
            Intrinsics.checkNotNullExpressionValue((Object)graphics, "graphics");
            this.drawVertex(graphics, matrixStack, right, yPos, color);
            this.drawVertex(graphics, matrixStack, left, yPos, color);
            first = false;
        }
        graphics.drawDirect();
        this.cleanupDraw();
    }
    
    private final void setupDraw() {
        BlendState.NORMAL.activate();
        UGraphics.shadeModel(7425);
    }
    
    private final void cleanupDraw() {
        BlendState.DISABLED.activate();
        UGraphics.shadeModel(7424);
    }
    
    private final void drawVertex(final UGraphics graphics, final UMatrixStack matrixStack, final double x, final double y, final Color color) {
        graphics.pos(matrixStack, x, y, 0.0).color(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f, color.getAlpha() / 255.0f).endVertex();
    }
    
    private final State<Pair<Float, Float>> createMouseDragListener(final UIComponent component) {
        final Ref$BooleanRef mouseHeld = new Ref$BooleanRef();
        final BasicState basicState = new BasicState((T)TuplesKt.to((Object)0.0f, (Object)0.0f));
        final UIComponent $this$onLeftClick$iv = component;
        $this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>(mouseHeld, component, basicState) {
            final /* synthetic */ Ref$BooleanRef $mouseHeld$inlined;
            final /* synthetic */ UIComponent $component$inlined;
            final /* synthetic */ BasicState $basicState$inlined;
            
            public ScreenshotColorPicker$createMouseDragListener$$inlined$onLeftClick$1(final Ref$BooleanRef $mouseHeld$inlined, final UIComponent $component$inlined, final BasicState $basicState$inlined) {
                this.$mouseHeld$inlined = $mouseHeld$inlined;
                this.$component$inlined = $component$inlined;
                this.$basicState$inlined = $basicState$inlined;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                if (it.getMouseButton() == 0) {
                    final UIClickEvent it2 = it;
                    USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
                    this.$mouseHeld$inlined.element = true;
                    createMouseDragListener$updateState(this.$component$inlined, this.$basicState$inlined, it2.getRelativeX(), it2.getRelativeY());
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        });
        component.onMouseRelease((Function1<? super UIComponent, Unit>)new ScreenshotColorPicker$createMouseDragListener.ScreenshotColorPicker$createMouseDragListener$2(mouseHeld));
        component.onMouseDrag((Function4<? super UIComponent, ? super Float, ? super Float, ? super Integer, Unit>)new ScreenshotColorPicker$createMouseDragListener.ScreenshotColorPicker$createMouseDragListener$3(mouseHeld, component, basicState));
        return basicState;
    }
    
    private static final void createMouseDragListener$updateState(final UIComponent $component, final BasicState<Pair<Float, Float>> basicState, final float mouseX, final float mouseY) {
        final UIComponent child = $component.getChildren().get(0);
        final float offsetX = child.getLeft() - $component.getLeft();
        final float offsetY = child.getTop() - $component.getTop();
        basicState.set((Pair<Float, Float>)TuplesKt.to((Object)RangesKt.coerceIn((Comparable)((mouseX - offsetX) / child.getWidth()), RangesKt.rangeTo(0.0f, 1.0f)), (Object)RangesKt.coerceIn((Comparable)((mouseY - offsetY) / child.getHeight()), RangesKt.rangeTo(0.0f, 1.0f))));
    }
    
    public static final /* synthetic */ void access$createMouseDragListener$updateState(final UIComponent $component, final BasicState basicState, final float mouseX, final float mouseY) {
        createMouseDragListener$updateState($component, basicState, mouseX, mouseY);
    }
    
    public static final /* synthetic */ BasicState access$getActiveColorIndex$p(final ScreenshotColorPicker $this) {
        return $this.activeColorIndex;
    }
    
    public static final /* synthetic */ BasicState access$getShowMenu$p(final ScreenshotColorPicker $this) {
        return $this.showMenu;
    }
    
    public static final /* synthetic */ void access$drawAlpha(final ScreenshotColorPicker $this, final UMatrixStack matrixStack, final UIComponent component) {
        $this.drawAlpha(matrixStack, component);
    }
    
    public static final /* synthetic */ void access$drawHueLine(final ScreenshotColorPicker $this, final UMatrixStack matrixStack, final UIComponent component) {
        $this.drawHueLine(matrixStack, component);
    }
    
    public static final /* synthetic */ void access$drawColorPicker(final ScreenshotColorPicker $this, final UMatrixStack matrixStack, final UIComponent component) {
        $this.drawColorPicker(matrixStack, component);
    }
    
    public static final /* synthetic */ BasicState access$getHue$p(final ScreenshotColorPicker $this) {
        return $this.hue;
    }
    
    public static final /* synthetic */ BasicState access$getAlpha$p(final ScreenshotColorPicker $this) {
        return $this.alpha;
    }
    
    public static final /* synthetic */ BasicState access$getSaturation$p(final ScreenshotColorPicker $this) {
        return $this.saturation;
    }
    
    public static final /* synthetic */ BasicState access$getBrightness$p(final ScreenshotColorPicker $this) {
        return $this.brightness;
    }
    
    public static final /* synthetic */ UIContainer access$getColorHistoryContainer(final ScreenshotColorPicker $this) {
        return $this.getColorHistoryContainer();
    }
    
    public static final /* synthetic */ void access$setCurrentColorState$p(final ScreenshotColorPicker $this, final State <set-?>) {
        $this.currentColorState = <set-?>;
    }
    
    public static final /* synthetic */ State access$getCurrentColorState$p(final ScreenshotColorPicker $this) {
        return $this.currentColorState;
    }
    
    public static final /* synthetic */ PenTool access$getPenTool$p(final ScreenshotColorPicker $this) {
        return $this.penTool;
    }
    
    public static final /* synthetic */ UIBlock access$getCurrentColor(final ScreenshotColorPicker $this) {
        return $this.getCurrentColor();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "collapsedBlock", "getCollapsedBlock()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "currentColor", "getCurrentColor()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "buttonConnector", "getButtonConnector()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "selectorBlock", "getSelectorBlock()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "selectorContent", "getSelectorContent()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "selectorInnerContent", "getSelectorInnerContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "hueSaturationBrightnessRow", "getHueSaturationBrightnessRow()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "saturationBrightnessContainer", "getSaturationBrightnessContainer()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "alphaContainer", "getAlphaContainer()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "colorHistoryBlock", "getColorHistoryBlock()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "colorHistoryContainer", "getColorHistoryContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "hueContainer", "getHueContainer()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "alphaContentContainer", "getAlphaContentContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "alphaArea", "getAlphaArea()Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$alphaArea$2;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "alphaSlider", "getAlphaSlider()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "hueArea", "getHueArea()Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$hueArea$2;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "hueSlider", "getHueSlider()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "saturationBrightnessArea", "getSaturationBrightnessArea()Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$saturationBrightnessArea$2;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotColorPicker.class, "saturationBrightnessSelection", "getSaturationBrightnessSelection()Lgg/essential/elementa/components/UIContainer;", 0)) };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000(
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u000b
                                                       \u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020
                                                       0	¢\u0006\b
                                                       \u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                       \u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice;", "Lgg/essential/elementa/components/UIBlock;", "containedColor", "Lgg/essential/elementa/state/State;", "Lgg/essential/gui/screenshot/components/HSBColor;", "index", "", "(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;Lgg/essential/elementa/state/State;I)V", "active", "Lgg/essential/elementa/state/MappedState;", "", "getActive", "()Lgg/essential/elementa/state/MappedState;", "colorBlock", "getColorBlock", "()Lgg/essential/elementa/components/UIBlock;", "colorBlock$delegate", "Lkotlin/properties/ReadWriteProperty;", "getContainedColor", "()Lgg/essential/elementa/state/State;", "getIndex", "()I", "essential" })
    public final class ColorChoice extends UIBlock
    {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
        @NotNull
        private final State<HSBColor> containedColor;
        private final int index;
        @NotNull
        private final MappedState<Integer, Boolean> active;
        final /* synthetic */ ScreenshotColorPicker this$0;
        
        public ColorChoice(@NotNull final ScreenshotColorPicker this$0, final State<HSBColor> containedColor, final int index) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "containedColor"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_0         /* this */
            //     7: aload_1         /* this$0 */
            //     8: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.this$0:Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;
            //    11: aload_0         /* this */
            //    12: aconst_null    
            //    13: iconst_1       
            //    14: aconst_null    
            //    15: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //    18: aload_0         /* this */
            //    19: aload_2         /* containedColor */
            //    20: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.containedColor:Lgg/essential/elementa/state/State;
            //    23: aload_0         /* this */
            //    24: iload_3         /* index */
            //    25: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.index:I
            //    28: aload_0         /* this */
            //    29: aload_0         /* this */
            //    30: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.this$0:Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;
            //    33: invokestatic    gg/essential/gui/screenshot/components/ScreenshotColorPicker.access$getActiveColorIndex$p:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;)Lgg/essential/elementa/state/BasicState;
            //    36: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$active$1;
            //    39: dup            
            //    40: aload_0         /* this */
            //    41: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$active$1.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice;)V
            //    44: checkcast       Lkotlin/jvm/functions/Function1;
            //    47: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
            //    50: putfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.active:Lgg/essential/elementa/state/MappedState;
            //    53: new             Lgg/essential/elementa/components/UIBlock;
            //    56: dup            
            //    57: aload_0         /* this */
            //    58: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.containedColor:Lgg/essential/elementa/state/State;
            //    61: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$colorBlock$2.INSTANCE:Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$colorBlock$2;
            //    64: checkcast       Lkotlin/jvm/functions/Function1;
            //    67: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
            //    70: checkcast       Lgg/essential/elementa/state/State;
            //    73: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
            //    76: checkcast       Lgg/essential/elementa/UIComponent;
            //    79: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //    82: astore          $this$constrain$iv
            //    84: aload           $this$constrain$iv
            //    86: astore          6
            //    88: aload           6
            //    90: astore          $this$constrain_u24lambda_u2d0$iv
            //    92: aload           $this$constrain_u24lambda_u2d0$iv
            //    94: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //    97: astore          $this$colorBlock_delegate_u24lambda_u2d0
            //    99: aload           $this$colorBlock_delegate_u24lambda_u2d0
            //   101: bipush          100
            //   103: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   106: checkcast       Ljava/lang/Number;
            //   109: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //   112: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   115: iconst_2       
            //   116: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   119: checkcast       Ljava/lang/Number;
            //   122: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   125: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   128: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
            //   131: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   134: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   137: aload           $this$colorBlock_delegate_u24lambda_u2d0
            //   139: bipush          100
            //   141: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   144: checkcast       Ljava/lang/Number;
            //   147: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //   150: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   153: iconst_2       
            //   154: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   157: checkcast       Ljava/lang/Number;
            //   160: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   163: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   166: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
            //   169: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   172: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   175: aload           6
            //   177: aload_0         /* this */
            //   178: checkcast       Lgg/essential/elementa/UIComponent;
            //   181: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   184: aload_0         /* this */
            //   185: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   188: iconst_0       
            //   189: aaload         
            //   190: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   193: pop            
            //   194: aload_0         /* this */
            //   195: checkcast       Lgg/essential/elementa/UIComponent;
            //   198: astore          $this$constrain$iv
            //   200: aload           $this$constrain$iv
            //   202: astore          6
            //   204: aload           6
            //   206: astore          $this$constrain_u24lambda_u2d0$iv
            //   208: aload           $this$constrain_u24lambda_u2d0$iv
            //   210: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   213: astore          $this$_init__u24lambda_u2d1
            //   215: aload           $this$_init__u24lambda_u2d1
            //   217: new             Lgg/essential/elementa/constraints/SiblingConstraint;
            //   220: dup            
            //   221: fconst_2       
            //   222: iconst_0       
            //   223: iconst_2       
            //   224: aconst_null    
            //   225: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   228: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //   231: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //   234: aload           $this$_init__u24lambda_u2d1
            //   236: new             Lgg/essential/elementa/constraints/AspectConstraint;
            //   239: dup            
            //   240: fconst_1       
            //   241: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
            //   244: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   247: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   250: aload           $this$_init__u24lambda_u2d1
            //   252: bipush          100
            //   254: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   257: checkcast       Ljava/lang/Number;
            //   260: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //   263: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   266: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   269: aload_0         /* this */
            //   270: aload_0         /* this */
            //   271: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.active:Lgg/essential/elementa/state/MappedState;
            //   274: aload_0         /* this */
            //   275: checkcast       Lgg/essential/elementa/UIComponent;
            //   278: iconst_0       
            //   279: iconst_0       
            //   280: iconst_3       
            //   281: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
            //   284: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
            //   287: getstatic       gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$2.INSTANCE:Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$2;
            //   290: checkcast       Lkotlin/jvm/functions/Function1;
            //   293: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
            //   296: checkcast       Lgg/essential/elementa/state/State;
            //   299: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //   302: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //   305: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
            //   308: pop            
            //   309: aload_0         /* this */
            //   310: checkcast       Lgg/essential/elementa/UIComponent;
            //   313: astore          4
            //   315: aload_0         /* this */
            //   316: getfield        gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice.this$0:Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;
            //   319: astore          5
            //   321: aload           $this$onLeftClick$iv
            //   323: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$special$$inlined$onLeftClick$1;
            //   326: dup            
            //   327: aload           5
            //   329: aload_0         /* this */
            //   330: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;Lgg/essential/gui/screenshot/components/ScreenshotColorPicker$ColorChoice;)V
            //   333: checkcast       Lkotlin/jvm/functions/Function2;
            //   336: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
            //   339: pop            
            //   340: return         
            //    Signature:
            //  (Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;Lgg/essential/elementa/state/State<Lgg/essential/gui/screenshot/components/HSBColor;>;I)V [from metadata: (Lgg/essential/elementa/state/State<Lgg/essential/gui/screenshot/components/HSBColor;>;I)V]
            //  
            //    MethodParameters:
            //  Name            Flags  
            //  --------------  -----
            //  this$0          
            //  containedColor  
            //  index           
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @NotNull
        public final State<HSBColor> getContainedColor() {
            return this.containedColor;
        }
        
        public final int getIndex() {
            return this.index;
        }
        
        static {
            $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ColorChoice.class, "colorBlock", "getColorBlock()Lgg/essential/elementa/components/UIBlock;", 0)) };
        }
    }
}
