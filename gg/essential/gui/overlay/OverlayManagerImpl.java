package gg.essential.gui.overlay;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.common.modal.*;
import java.util.function.*;
import net.minecraft.client.gui.screen.*;
import java.util.*;
import kotlin.ranges.*;
import gg.essential.elementa.components.*;
import kotlin.collections.*;
import gg.essential.event.render.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.event.gui.*;
import net.minecraft.client.gui.widget.*;
import net.minecraft.client.gui.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import gg.essential.mixins.transformers.client.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0094\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0006
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010!
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004?@ABB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001f\u0010\u001b\u001a\u0002H\u001c"\b\b\u0000\u0010\u001c*\u00020	2\u0006\u0010\u001d\u001a\u0002H\u001cH\u0002¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u0004\u0018\u00010	J\b\u0010!\u001a\u0004\u0018\u00010	J\u001e\u0010"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0%H\u0002J\u0018\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0%H\u0002J\u001e\u0010)\u001a\u00020\u00152\u0006\u0010#\u001a\u00020*2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0%H\u0002J\u0016\u0010+\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0%H\u0002J\u001e\u0010,\u001a\u00020\u00152\u0006\u0010#\u001a\u00020-2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0%H\u0002J\b\u0010.\u001a\u00020\u0015H\u0002J\u0010\u0010/\u001a\u00020	2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u00152\u0006\u00100\u001a\u000201H\u0016J\u0010\u00103\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020	H\u0016J\b\u00104\u001a\u00020\u0015H\u0002J\u0017\u00105\u001a\u00020\u00152\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001507H\u0082\bJ\u001c\u00108\u001a\u000209*\u00020	2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0002J\f\u0010=\u001a\u000209*\u00020
                                                   H\u0002J\f\u0010>\u001a\u00020\u0015*\u00020	H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020	\u0012\u0004\u0012\u00020
                                                   \u0018\u00010\bX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020	0\fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020	0\u000eX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0016\u0010\u000f\u001a
                                                    \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006C""" }, d2 = { "Lgg/essential/gui/overlay/OverlayManagerImpl;", "Lgg/essential/gui/overlay/OverlayManager;", "()V", "FAKE_MOUSE_POS", "", "aboveScreenLayer", "Lgg/essential/gui/overlay/PersistentLayer;", "focus", "Lkotlin/Pair;", "Lgg/essential/gui/overlay/Layer;", "Lgg/essential/elementa/UIComponent;", "layers", "", "layersWithTrueMousePos", "", "mc", "Lnet/minecraft/client/MinecraftClient;", "kotlin.jvm.PlatformType", "screenLayer", "Lgg/essential/gui/overlay/OverlayManagerImpl$VanillaScreenLayer;", "cleanupEphemeralLayers", "", "computeLayersWithTrueMousePos", "createEphemeralLayer", "Lgg/essential/gui/overlay/EphemeralLayer;", "priority", "Lgg/essential/gui/overlay/LayerPriority;", "createLayer", "T", "layer", "(Lgg/essential/gui/overlay/Layer;)Lgg/essential/gui/overlay/Layer;", "createPersistentLayer", "getFocusedLayer", "getHoveredLayer", "handleClick", "event", "Lgg/essential/event/gui/GuiClickEvent;", "Lkotlin/ranges/ClosedRange;", "handleDraw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "handleKey", "Lgg/essential/event/gui/GuiKeyTypedEvent;", "handleMouseRelease", "handleScroll", "Lgg/essential/event/gui/MouseScrollEvent;", "propagateFocus", "pushModal", "modal", "Lgg/essential/gui/common/modal/Modal;", "queueModal", "removeLayer", "unlockMouseIfRequired", "withFakeMousePos", "block", "Lkotlin/Function0;", "isAnythingHovered", "", "mouseX", "", "mouseY", "isPassThrough", "unfocus", "Events", "GlobalMouseOverride", "OverlayInteractionScreen", "VanillaScreenLayer", "essential" })
public final class OverlayManagerImpl
{
    @NotNull
    public static final OverlayManagerImpl INSTANCE;
    private static final MinecraftClient mc;
    @NotNull
    private static final List<Layer> layers;
    @NotNull
    private static Set<? extends Layer> layersWithTrueMousePos;
    @Nullable
    private static Pair<? extends Layer, ? extends UIComponent> focus;
    @NotNull
    private static final VanillaScreenLayer screenLayer;
    @NotNull
    private static final PersistentLayer aboveScreenLayer;
    
    private OverlayManagerImpl() {
        super();
    }
    
    @NotNull
    public PersistentLayer createPersistentLayer(@NotNull final LayerPriority priority) {
        Intrinsics.checkNotNullParameter((Object)priority, "priority");
        return this.createLayer(new PersistentLayer(priority));
    }
    
    @NotNull
    public EphemeralLayer createEphemeralLayer(@NotNull final LayerPriority priority) {
        Intrinsics.checkNotNullParameter((Object)priority, "priority");
        return this.createLayer(new EphemeralLayer(priority));
    }
    
    private final <T extends Layer> T createLayer(final T layer) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: getstatic       gg/essential/gui/overlay/OverlayManagerImpl.layers:Ljava/util/List;
        //     6: astore_2       
        //     7: astore          5
        //     9: aload_2         /* $this$indexOfLast$iv */
        //    10: aload_2         /* $this$indexOfLast$iv */
        //    11: invokeinterface java/util/List.size:()I
        //    16: invokeinterface java/util/List.listIterator:(I)Ljava/util/ListIterator;
        //    21: astore_3        /* iterator$iv */
        //    22: aload_3         /* iterator$iv */
        //    23: invokeinterface java/util/ListIterator.hasPrevious:()Z
        //    28: ifeq            77
        //    31: aload_3         /* iterator$iv */
        //    32: invokeinterface java/util/ListIterator.previous:()Ljava/lang/Object;
        //    37: checkcast       Lgg/essential/gui/overlay/Layer;
        //    40: astore          it
        //    42: aload           it
        //    44: invokevirtual   gg/essential/gui/overlay/Layer.getPriority:()Lgg/essential/gui/overlay/LayerPriority;
        //    47: aload_1         /* layer */
        //    48: invokevirtual   gg/essential/gui/overlay/Layer.getPriority:()Lgg/essential/gui/overlay/LayerPriority;
        //    51: checkcast       Ljava/lang/Enum;
        //    54: invokevirtual   gg/essential/gui/overlay/LayerPriority.compareTo:(Ljava/lang/Enum;)I
        //    57: ifgt            64
        //    60: iconst_1       
        //    61: goto            65
        //    64: iconst_0       
        //    65: ifeq            22
        //    68: aload_3         /* iterator$iv */
        //    69: invokeinterface java/util/ListIterator.nextIndex:()I
        //    74: goto            78
        //    77: iconst_m1      
        //    78: istore          6
        //    80: aload           5
        //    82: iload           6
        //    84: iconst_1       
        //    85: iadd           
        //    86: aload_1         /* layer */
        //    87: invokeinterface java/util/List.add:(ILjava/lang/Object;)V
        //    92: aload_1         /* layer */
        //    93: areturn        
        //    Signature:
        //  <T:Lgg/essential/gui/overlay/Layer;>(TT;)TT;
        //    MethodParameters:
        //  Name   Flags  
        //  -----  -----
        //  layer  
        //    StackMapTable: 00 05 FF 00 16 00 06 07 00 02 07 00 76 07 00 81 07 00 8B 00 07 00 81 00 00 FF 00 29 00 06 07 00 02 07 00 76 07 00 81 07 00 8B 07 00 76 07 00 81 00 00 40 01 FF 00 0B 00 06 07 00 02 07 00 76 07 00 81 07 00 8B 00 07 00 81 00 00 40 01
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void removeLayer(@NotNull final Layer layer) {
        Intrinsics.checkNotNullParameter((Object)layer, "layer");
        OverlayManagerImpl.layers.remove(layer);
    }
    
    @NotNull
    public Layer pushModal(@NotNull final Modal modal) {
        Intrinsics.checkNotNullParameter((Object)modal, "modal");
        final EphemeralLayer layer = this.createEphemeralLayer(LayerPriority.Modal);
        layer.pushModal(modal);
        return layer;
    }
    
    public void queueModal(@NotNull final Modal modal) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "modal"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: getstatic       gg/essential/gui/overlay/OverlayManagerImpl.layers:Ljava/util/List;
        //     9: checkcast       Ljava/lang/Iterable;
        //    12: astore_3        /* $this$filterIsInstance$iv */
        //    13: aload_3         /* $this$filterIsInstance$iv */
        //    14: astore          5
        //    16: new             Ljava/util/ArrayList;
        //    19: dup            
        //    20: invokespecial   java/util/ArrayList.<init>:()V
        //    23: checkcast       Ljava/util/Collection;
        //    26: astore          destination$iv$iv
        //    28: aload           $this$filterIsInstanceTo$iv$iv
        //    30: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    35: astore          8
        //    37: aload           8
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifeq            77
        //    47: aload           8
        //    49: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    54: astore          element$iv$iv
        //    56: aload           element$iv$iv
        //    58: instanceof      Lgg/essential/gui/overlay/EphemeralLayer;
        //    61: ifeq            37
        //    64: aload           destination$iv$iv
        //    66: aload           element$iv$iv
        //    68: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    73: pop            
        //    74: goto            37
        //    77: aload           destination$iv$iv
        //    79: checkcast       Ljava/util/List;
        //    82: checkcast       Ljava/lang/Iterable;
        //    85: astore          4
        //    87: aload           4
        //    89: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    94: astore          5
        //    96: aload           5
        //    98: invokeinterface java/util/Iterator.hasNext:()Z
        //   103: ifeq            146
        //   106: aload           5
        //   108: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   113: astore          6
        //   115: aload           6
        //   117: checkcast       Lgg/essential/gui/overlay/EphemeralLayer;
        //   120: astore          it
        //   122: aload           it
        //   124: invokevirtual   gg/essential/gui/overlay/EphemeralLayer.getPriority:()Lgg/essential/gui/overlay/LayerPriority;
        //   127: getstatic       gg/essential/gui/overlay/LayerPriority.Modal:Lgg/essential/gui/overlay/LayerPriority;
        //   130: if_acmpne       137
        //   133: iconst_1       
        //   134: goto            138
        //   137: iconst_0       
        //   138: ifeq            96
        //   141: aload           6
        //   143: goto            147
        //   146: aconst_null    
        //   147: checkcast       Lgg/essential/gui/overlay/EphemeralLayer;
        //   150: dup            
        //   151: ifnonnull       162
        //   154: pop            
        //   155: aload_0         /* this */
        //   156: getstatic       gg/essential/gui/overlay/LayerPriority.Modal:Lgg/essential/gui/overlay/LayerPriority;
        //   159: invokevirtual   gg/essential/gui/overlay/OverlayManagerImpl.createEphemeralLayer:(Lgg/essential/gui/overlay/LayerPriority;)Lgg/essential/gui/overlay/EphemeralLayer;
        //   162: astore_2        /* layer */
        //   163: aload_2         /* layer */
        //   164: aload_1         /* modal */
        //   165: invokevirtual   gg/essential/gui/overlay/EphemeralLayer.queueModal:(Lgg/essential/gui/common/modal/Modal;)V
        //   168: return         
        //    MethodParameters:
        //  Name   Flags  
        //  -----  -----
        //  modal  
        //    StackMapTable: 00 08 FF 00 25 00 09 07 00 02 07 00 C7 00 07 00 BC 00 07 00 BC 07 00 C1 00 07 00 C9 00 00 27 FF 00 12 00 09 07 00 02 07 00 C7 00 07 00 BC 07 00 BC 07 00 C9 07 00 04 00 07 00 C9 00 00 FF 00 28 00 09 07 00 02 07 00 C7 00 07 00 BC 07 00 BC 07 00 C9 07 00 04 07 00 7B 07 00 C9 00 00 40 01 FF 00 07 00 09 07 00 02 07 00 C7 00 07 00 BC 07 00 BC 07 00 C9 07 00 04 00 07 00 C9 00 00 40 07 00 04 4E 07 00 7B
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    public final Layer getHoveredLayer() {
        final float mouseX = (float)(UMouse.Scaled.getX() + 0.5 / UResolution.getScaleFactor());
        final float mouseY = (float)(UMouse.Scaled.getY() + 0.5 / UResolution.getScaleFactor());
        final List<Layer> layers = OverlayManagerImpl.layers;
        final ListIterator<Layer> listIterator = layers.listIterator(layers.size());
        while (listIterator.hasPrevious()) {
            final Layer previous = listIterator.previous();
            final Layer it = previous;
            if (OverlayManagerImpl.INSTANCE.isAnythingHovered(it, mouseX, mouseY)) {
                return previous;
            }
        }
        return null;
    }
    
    @Nullable
    public final Layer getFocusedLayer() {
        final Pair<? extends Layer, ? extends UIComponent> focus = OverlayManagerImpl.focus;
        if (focus != null) {
            final Pair<? extends Layer, ? extends UIComponent> pair2;
            final Pair<? extends Layer, ? extends UIComponent> pair = pair2 = focus;
            final Layer layer = (Layer)pair2.component1();
            final UIComponent component = (UIComponent)pair2.component2();
            final Pair<? extends Layer, ? extends UIComponent> pair3 = Intrinsics.areEqual((Object)layer.getWindow().getFocusedComponent(), (Object)component) ? pair : null;
            if (pair3 != null) {
                return (Layer)pair3.getFirst();
            }
        }
        return null;
    }
    
    private final void cleanupEphemeralLayers() {
        OverlayManagerImpl.screenLayer.getWindow().draw(new UMatrixStack());
        OverlayManagerImpl.layers.removeIf(OverlayManagerImpl::cleanupEphemeralLayers$lambda-4);
    }
    
    private final void unlockMouseIfRequired() {
        final List<Layer> layers = OverlayManagerImpl.layers;
        final ListIterator<Layer> listIterator = layers.listIterator(layers.size());
        while (true) {
            while (listIterator.hasPrevious()) {
                final Layer previous = listIterator.previous();
                final Layer it = previous;
                if (it.getUnlocksMouse()) {
                    final Layer layer2 = previous;
                    final Layer layer3 = layer2;
                    if (layer3 == null) {
                        return;
                    }
                    final Layer layer = layer3;
                    if (UScreen.Companion.getCurrentScreen() == null) {
                        UScreen.Companion.displayScreen(new OverlayInteractionScreen(layer));
                    }
                    return;
                }
            }
            final Layer layer2 = null;
            continue;
        }
    }
    
    private final void computeLayersWithTrueMousePos() {
        final Layer hovered = this.getHoveredLayer();
        Set layersWithTrueMousePos;
        if (hovered != null) {
            final Iterable $this$dropWhile$iv = OverlayManagerImpl.layers;
            boolean yielding$iv = false;
            final ArrayList list$iv = new ArrayList();
            for (final Object item$iv : $this$dropWhile$iv) {
                if (yielding$iv) {
                    list$iv.add(item$iv);
                }
                else {
                    final Layer it = (Layer)item$iv;
                    if (!Intrinsics.areEqual((Object)it, (Object)hovered)) {
                        continue;
                    }
                    list$iv.add(item$iv);
                    yielding$iv = true;
                }
            }
            layersWithTrueMousePos = CollectionsKt.toSet((Iterable)list$iv);
        }
        else {
            layersWithTrueMousePos = CollectionsKt.toSet((Iterable)OverlayManagerImpl.layers);
        }
        OverlayManagerImpl.layersWithTrueMousePos = layersWithTrueMousePos;
    }
    
    private final void propagateFocus() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: checkcast       Ljava/lang/Iterable;
        //     6: astore_2        /* $this$mapNotNull$iv */
        //     7: aload_2         /* $this$mapNotNull$iv */
        //     8: astore          4
        //    10: new             Ljava/util/ArrayList;
        //    13: dup            
        //    14: invokespecial   java/util/ArrayList.<init>:()V
        //    17: checkcast       Ljava/util/Collection;
        //    20: astore          destination$iv$iv
        //    22: aload           $this$mapNotNullTo$iv$iv
        //    24: astore          $this$forEach$iv$iv$iv
        //    26: aload           $this$forEach$iv$iv$iv
        //    28: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    33: astore          8
        //    35: aload           8
        //    37: invokeinterface java/util/Iterator.hasNext:()Z
        //    42: ifeq            114
        //    45: aload           8
        //    47: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    52: astore          element$iv$iv$iv
        //    54: aload           element$iv$iv$iv
        //    56: astore          element$iv$iv
        //    58: aload           element$iv$iv
        //    60: checkcast       Lgg/essential/gui/overlay/Layer;
        //    63: astore          layer
        //    65: aload           layer
        //    67: invokevirtual   gg/essential/gui/overlay/Layer.getWindow:()Lgg/essential/elementa/components/Window;
        //    70: invokevirtual   gg/essential/elementa/components/Window.getFocusedComponent:()Lgg/essential/elementa/UIComponent;
        //    73: dup            
        //    74: ifnull          89
        //    77: astore          it
        //    79: aload           layer
        //    81: aload           it
        //    83: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //    86: goto            91
        //    89: pop            
        //    90: aconst_null    
        //    91: dup            
        //    92: ifnull          110
        //    95: astore          it$iv$iv
        //    97: aload           destination$iv$iv
        //    99: aload           it$iv$iv
        //   101: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   106: pop            
        //   107: goto            35
        //   110: pop            
        //   111: goto            35
        //   114: aload           destination$iv$iv
        //   116: checkcast       Ljava/util/List;
        //   119: astore_1        /* foci */
        //   120: aload_1         /* foci */
        //   121: getstatic       gg/essential/gui/overlay/OverlayManagerImpl.focus:Lkotlin/Pair;
        //   124: invokestatic    kotlin/collections/CollectionsKt.listOfNotNull:(Ljava/lang/Object;)Ljava/util/List;
        //   127: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   130: ifeq            134
        //   133: return         
        //   134: aload_1         /* foci */
        //   135: invokeinterface java/util/List.isEmpty:()Z
        //   140: ifeq            147
        //   143: aconst_null    
        //   144: goto            217
        //   147: aload_1         /* foci */
        //   148: astore_3       
        //   149: aload_3        
        //   150: aload_3        
        //   151: invokeinterface java/util/List.size:()I
        //   156: invokeinterface java/util/List.listIterator:(I)Ljava/util/ListIterator;
        //   161: astore          4
        //   163: aload           4
        //   165: invokeinterface java/util/ListIterator.hasPrevious:()Z
        //   170: ifeq            213
        //   173: aload           4
        //   175: invokeinterface java/util/ListIterator.previous:()Ljava/lang/Object;
        //   180: astore          5
        //   182: aload           5
        //   184: checkcast       Lkotlin/Pair;
        //   187: astore          it
        //   189: aload           it
        //   191: getstatic       gg/essential/gui/overlay/OverlayManagerImpl.focus:Lkotlin/Pair;
        //   194: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   197: ifne            204
        //   200: iconst_1       
        //   201: goto            205
        //   204: iconst_0       
        //   205: ifeq            163
        //   208: aload           5
        //   210: goto            214
        //   213: aconst_null    
        //   214: checkcast       Lkotlin/Pair;
        //   217: putstatic       gg/essential/gui/overlay/OverlayManagerImpl.focus:Lkotlin/Pair;
        //   220: getstatic       gg/essential/gui/overlay/OverlayManagerImpl.focus:Lkotlin/Pair;
        //   223: dup            
        //   224: ifnonnull       229
        //   227: pop            
        //   228: return         
        //   229: invokevirtual   kotlin/Pair.component1:()Ljava/lang/Object;
        //   232: checkcast       Lgg/essential/gui/overlay/Layer;
        //   235: astore_3        /* newLayer */
        //   236: getstatic       gg/essential/gui/overlay/OverlayManagerImpl.layers:Ljava/util/List;
        //   239: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   244: astore          4
        //   246: aload           4
        //   248: invokeinterface java/util/Iterator.hasNext:()Z
        //   253: ifeq            286
        //   256: aload           4
        //   258: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   263: checkcast       Lgg/essential/gui/overlay/Layer;
        //   266: astore          layer
        //   268: aload           layer
        //   270: aload_3         /* newLayer */
        //   271: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   274: ifne            246
        //   277: aload_0         /* this */
        //   278: aload           layer
        //   280: invokespecial   gg/essential/gui/overlay/OverlayManagerImpl.unfocus:(Lgg/essential/gui/overlay/Layer;)V
        //   283: goto            246
        //   286: return         
        //    StackMapTable: 00 10 FF 00 23 00 09 07 00 02 00 07 00 BC 00 07 00 BC 07 00 C1 00 07 00 BC 07 00 C9 00 00 FF 00 35 00 0C 07 00 02 00 07 00 BC 00 07 00 BC 07 00 C1 00 07 00 BC 07 00 C9 07 00 04 07 00 04 07 00 76 00 01 07 01 02 41 07 00 FA 52 07 00 FA F8 00 03 FF 00 13 00 09 07 00 02 07 00 81 07 00 BC 00 07 00 BC 07 00 C1 00 07 00 BC 07 00 C9 00 00 0C FF 00 0F 00 09 07 00 02 07 00 81 07 00 BC 07 00 81 07 00 8B 07 00 04 00 07 00 BC 07 00 C9 00 00 FF 00 28 00 09 07 00 02 07 00 81 07 00 BC 07 00 81 07 00 8B 07 00 04 07 00 FA 07 00 BC 07 00 C9 00 00 40 01 FF 00 07 00 09 07 00 02 07 00 81 07 00 BC 07 00 81 07 00 8B 07 00 04 00 07 00 BC 07 00 C9 00 00 40 07 00 04 FF 00 02 00 09 07 00 02 07 00 81 07 00 BC 00 07 00 04 07 00 04 00 07 00 BC 07 00 C9 00 01 07 00 FA 4B 07 00 FA FF 00 10 00 09 07 00 02 07 00 81 07 00 BC 07 00 76 07 00 C9 07 00 04 00 07 00 BC 07 00 C9 00 00 27
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void handleDraw(final UMatrixStack matrixStack, final LayerPriority priority) {
        this.handleDraw(matrixStack, (ClosedRange<LayerPriority>)RangesKt.rangeTo((Comparable)priority, (Comparable)priority));
    }
    
    private final void handleDraw(final UMatrixStack matrixStack, final ClosedRange<LayerPriority> priority) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: getfield        net/minecraft/client/MinecraftClient.options:Lnet/minecraft/client/option/GameOptions;
        //     6: getfield        net/minecraft/client/option/GameOptions.hudHidden:Z
        //     9: ifeq            25
        //    12: getstatic       gg/essential/gui/overlay/OverlayManagerImpl.mc:Lnet/minecraft/client/MinecraftClient;
        //    15: getfield        net/minecraft/client/MinecraftClient.currentScreen:Lnet/minecraft/client/gui/screen/Screen;
        //    18: ifnonnull       25
        //    21: iconst_1       
        //    22: goto            26
        //    25: iconst_0       
        //    26: istore_3        /* hideGui */
        //    27: getstatic       gg/essential/gui/overlay/OverlayManagerImpl.layers:Ljava/util/List;
        //    30: checkcast       Ljava/lang/Iterable;
        //    33: astore          $this$filter$iv
        //    35: aload           $this$filter$iv
        //    37: astore          7
        //    39: new             Ljava/util/ArrayList;
        //    42: dup            
        //    43: invokespecial   java/util/ArrayList.<init>:()V
        //    46: checkcast       Ljava/util/Collection;
        //    49: astore          destination$iv$iv
        //    51: aload           $this$filterTo$iv$iv
        //    53: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    58: astore          10
        //    60: aload           10
        //    62: invokeinterface java/util/Iterator.hasNext:()Z
        //    67: ifeq            116
        //    70: aload           10
        //    72: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    77: astore          element$iv$iv
        //    79: aload           element$iv$iv
        //    81: checkcast       Lgg/essential/gui/overlay/Layer;
        //    84: astore          it
        //    86: aload_2         /* priority */
        //    87: aload           it
        //    89: invokevirtual   gg/essential/gui/overlay/Layer.getPriority:()Lgg/essential/gui/overlay/LayerPriority;
        //    92: checkcast       Ljava/lang/Comparable;
        //    95: invokeinterface kotlin/ranges/ClosedRange.contains:(Ljava/lang/Comparable;)Z
        //   100: ifeq            60
        //   103: aload           destination$iv$iv
        //   105: aload           element$iv$iv
        //   107: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   112: pop            
        //   113: goto            60
        //   116: aload           destination$iv$iv
        //   118: checkcast       Ljava/util/List;
        //   121: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   126: astore          4
        //   128: aload           4
        //   130: invokeinterface java/util/Iterator.hasNext:()Z
        //   135: ifeq            271
        //   138: aload           4
        //   140: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   145: checkcast       Lgg/essential/gui/overlay/Layer;
        //   148: astore          layer
        //   150: iload_3         /* hideGui */
        //   151: ifeq            162
        //   154: aload           layer
        //   156: invokevirtual   gg/essential/gui/overlay/Layer.getRespectsHideGuiSetting:()Z
        //   159: ifne            170
        //   162: aload           layer
        //   164: invokevirtual   gg/essential/gui/overlay/Layer.getRendered:()Z
        //   167: ifne            197
        //   170: aload_1         /* matrixStack */
        //   171: invokevirtual   gg/essential/universal/UMatrixStack.fork:()Lgg/essential/universal/UMatrixStack;
        //   174: astore          7
        //   176: aload           7
        //   178: astore          it
        //   180: aload           it
        //   182: ldc2_w          -1000000.0
        //   185: ldc2_w          -1000000.0
        //   188: dconst_0       
        //   189: invokevirtual   gg/essential/universal/UMatrixStack.translate:(DDD)V
        //   192: aload           7
        //   194: goto            198
        //   197: aload_1         /* matrixStack */
        //   198: astore          layerMatrixStack
        //   200: getstatic       gg/essential/gui/overlay/OverlayManagerImpl.layersWithTrueMousePos:Ljava/util/Set;
        //   203: aload           layer
        //   205: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   210: ifeq            226
        //   213: aload           layer
        //   215: invokevirtual   gg/essential/gui/overlay/Layer.getWindow:()Lgg/essential/elementa/components/Window;
        //   218: aload           layerMatrixStack
        //   220: invokevirtual   gg/essential/elementa/components/Window.draw:(Lgg/essential/universal/UMatrixStack;)V
        //   223: goto            128
        //   226: invokestatic    gg/essential/universal/UMouse$Raw.getX:()D
        //   229: dstore          orgX$iv
        //   231: invokestatic    gg/essential/universal/UMouse$Raw.getY:()D
        //   234: dstore          orgY$iv
        //   236: getstatic       gg/essential/gui/overlay/OverlayManagerImpl$GlobalMouseOverride.INSTANCE:Lgg/essential/gui/overlay/OverlayManagerImpl$GlobalMouseOverride;
        //   239: ldc2_w          -1000000.0
        //   242: ldc2_w          -1000000.0
        //   245: invokevirtual   gg/essential/gui/overlay/OverlayManagerImpl$GlobalMouseOverride.set:(DD)V
        //   248: aload           layer
        //   250: invokevirtual   gg/essential/gui/overlay/Layer.getWindow:()Lgg/essential/elementa/components/Window;
        //   253: aload           layerMatrixStack
        //   255: invokevirtual   gg/essential/elementa/components/Window.draw:(Lgg/essential/universal/UMatrixStack;)V
        //   258: getstatic       gg/essential/gui/overlay/OverlayManagerImpl$GlobalMouseOverride.INSTANCE:Lgg/essential/gui/overlay/OverlayManagerImpl$GlobalMouseOverride;
        //   261: dload           orgX$iv
        //   263: dload           orgY$iv
        //   265: invokevirtual   gg/essential/gui/overlay/OverlayManagerImpl$GlobalMouseOverride.set:(DD)V
        //   268: goto            128
        //   271: aload_0         /* this */
        //   272: invokespecial   gg/essential/gui/overlay/OverlayManagerImpl.propagateFocus:()V
        //   275: return         
        //    Signature:
        //  (Lgg/essential/universal/UMatrixStack;Lkotlin/ranges/ClosedRange<Lgg/essential/gui/overlay/LayerPriority;>;)V
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  matrixStack  
        //  priority     
        //    StackMapTable: 00 0B 19 40 01 FF 00 21 00 0B 07 00 02 07 01 19 07 01 99 01 00 07 00 BC 00 07 00 BC 07 00 C1 00 07 00 C9 00 00 37 FF 00 0B 00 09 07 00 02 07 01 19 07 01 99 01 07 00 C9 07 00 04 00 07 00 04 07 00 04 00 00 FF 00 21 00 09 07 00 02 07 01 19 07 01 99 01 07 00 C9 07 00 76 00 07 00 04 07 00 04 00 00 07 1A 40 07 01 19 FF 00 1B 00 09 07 00 02 07 01 19 07 01 99 01 07 00 C9 07 00 76 07 01 19 07 00 04 07 00 04 00 00 FF 00 2C 00 09 07 00 02 07 01 19 07 01 99 01 07 00 C9 07 00 04 00 07 00 04 07 00 04 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void handleClick(final GuiClickEvent event, final ClosedRange<LayerPriority> priority) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: checkcast       Ljava/lang/Iterable;
        //     6: astore          $this$filter$iv
        //     8: aload           $this$filter$iv
        //    10: astore          6
        //    12: new             Ljava/util/ArrayList;
        //    15: dup            
        //    16: invokespecial   java/util/ArrayList.<init>:()V
        //    19: checkcast       Ljava/util/Collection;
        //    22: astore          destination$iv$iv
        //    24: aload           $this$filterTo$iv$iv
        //    26: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    31: astore          8
        //    33: aload           8
        //    35: invokeinterface java/util/Iterator.hasNext:()Z
        //    40: ifeq            89
        //    43: aload           8
        //    45: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    50: astore          element$iv$iv
        //    52: aload           element$iv$iv
        //    54: checkcast       Lgg/essential/gui/overlay/Layer;
        //    57: astore          it
        //    59: aload_2         /* priority */
        //    60: aload           it
        //    62: invokevirtual   gg/essential/gui/overlay/Layer.getPriority:()Lgg/essential/gui/overlay/LayerPriority;
        //    65: checkcast       Ljava/lang/Comparable;
        //    68: invokeinterface kotlin/ranges/ClosedRange.contains:(Ljava/lang/Comparable;)Z
        //    73: ifeq            33
        //    76: aload           destination$iv$iv
        //    78: aload           element$iv$iv
        //    80: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    85: pop            
        //    86: goto            33
        //    89: aload           destination$iv$iv
        //    91: checkcast       Ljava/util/List;
        //    94: invokestatic    kotlin/collections/CollectionsKt.asReversed:(Ljava/util/List;)Ljava/util/List;
        //    97: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   102: astore_3       
        //   103: aload_3        
        //   104: invokeinterface java/util/Iterator.hasNext:()Z
        //   109: ifeq            216
        //   112: aload_3        
        //   113: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   118: checkcast       Lgg/essential/gui/overlay/Layer;
        //   121: astore          layer
        //   123: new             Lkotlin/jvm/internal/Ref$BooleanRef;
        //   126: dup            
        //   127: invokespecial   kotlin/jvm/internal/Ref$BooleanRef.<init>:()V
        //   130: astore          consumed
        //   132: aload           consumed
        //   134: iconst_1       
        //   135: putfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //   138: new             Lgg/essential/gui/overlay/OverlayManagerImpl$handleClick$finalHandler$1;
        //   141: dup            
        //   142: aload           consumed
        //   144: invokespecial   gg/essential/gui/overlay/OverlayManagerImpl$handleClick$finalHandler$1.<init>:(Lkotlin/jvm/internal/Ref$BooleanRef;)V
        //   147: checkcast       Lkotlin/jvm/functions/Function2;
        //   150: astore          finalHandler
        //   152: aload           layer
        //   154: invokevirtual   gg/essential/gui/overlay/Layer.getWindow:()Lgg/essential/elementa/components/Window;
        //   157: invokevirtual   gg/essential/elementa/components/Window.getMouseClickListeners:()Ljava/util/List;
        //   160: aload           finalHandler
        //   162: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   167: pop            
        //   168: aload           layer
        //   170: invokevirtual   gg/essential/gui/overlay/Layer.getWindow:()Lgg/essential/elementa/components/Window;
        //   173: aload_1         /* event */
        //   174: invokevirtual   gg/essential/event/gui/GuiClickEvent.getMouseX:()D
        //   177: aload_1         /* event */
        //   178: invokevirtual   gg/essential/event/gui/GuiClickEvent.getMouseY:()D
        //   181: aload_1         /* event */
        //   182: invokevirtual   gg/essential/event/gui/GuiClickEvent.getButton:()I
        //   185: invokevirtual   gg/essential/elementa/components/Window.mouseClick:(DDI)V
        //   188: aload           layer
        //   190: invokevirtual   gg/essential/gui/overlay/Layer.getWindow:()Lgg/essential/elementa/components/Window;
        //   193: invokevirtual   gg/essential/elementa/components/Window.getMouseClickListeners:()Ljava/util/List;
        //   196: aload           finalHandler
        //   198: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //   203: pop            
        //   204: aload           consumed
        //   206: getfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //   209: ifeq            103
        //   212: aload_1         /* event */
        //   213: invokevirtual   gg/essential/event/gui/GuiClickEvent.setCancelled$1385ff:()V
        //   216: aload_0         /* this */
        //   217: invokespecial   gg/essential/gui/overlay/OverlayManagerImpl.propagateFocus:()V
        //   220: return         
        //    Signature:
        //  (Lgg/essential/event/gui/GuiClickEvent;Lkotlin/ranges/ClosedRange<Lgg/essential/gui/overlay/LayerPriority;>;)V
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  event     
        //  priority  
        //    StackMapTable: 00 04 FF 00 21 00 09 07 00 02 07 01 CC 07 01 99 00 07 00 BC 00 07 00 BC 07 00 C1 07 00 C9 00 00 37 FF 00 0D 00 09 07 00 02 07 01 CC 07 01 99 07 00 C9 07 00 04 00 07 00 04 07 00 C1 07 00 C9 00 00 FB 00 70
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void handleMouseRelease(final ClosedRange<LayerPriority> priority) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: checkcast       Ljava/lang/Iterable;
        //     6: astore_3        /* $this$filter$iv */
        //     7: aload_3         /* $this$filter$iv */
        //     8: astore          4
        //    10: new             Ljava/util/ArrayList;
        //    13: dup            
        //    14: invokespecial   java/util/ArrayList.<init>:()V
        //    17: checkcast       Ljava/util/Collection;
        //    20: astore          destination$iv$iv
        //    22: aload           $this$filterTo$iv$iv
        //    24: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    29: astore          6
        //    31: aload           6
        //    33: invokeinterface java/util/Iterator.hasNext:()Z
        //    38: ifeq            87
        //    41: aload           6
        //    43: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    48: astore          element$iv$iv
        //    50: aload           element$iv$iv
        //    52: checkcast       Lgg/essential/gui/overlay/Layer;
        //    55: astore          it
        //    57: aload_1         /* priority */
        //    58: aload           it
        //    60: invokevirtual   gg/essential/gui/overlay/Layer.getPriority:()Lgg/essential/gui/overlay/LayerPriority;
        //    63: checkcast       Ljava/lang/Comparable;
        //    66: invokeinterface kotlin/ranges/ClosedRange.contains:(Ljava/lang/Comparable;)Z
        //    71: ifeq            31
        //    74: aload           destination$iv$iv
        //    76: aload           element$iv$iv
        //    78: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    83: pop            
        //    84: goto            31
        //    87: aload           destination$iv$iv
        //    89: checkcast       Ljava/util/List;
        //    92: invokestatic    kotlin/collections/CollectionsKt.asReversed:(Ljava/util/List;)Ljava/util/List;
        //    95: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   100: astore_2       
        //   101: aload_2        
        //   102: invokeinterface java/util/Iterator.hasNext:()Z
        //   107: ifeq            130
        //   110: aload_2        
        //   111: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   116: checkcast       Lgg/essential/gui/overlay/Layer;
        //   119: astore_3        /* layer */
        //   120: aload_3         /* layer */
        //   121: invokevirtual   gg/essential/gui/overlay/Layer.getWindow:()Lgg/essential/elementa/components/Window;
        //   124: invokevirtual   gg/essential/elementa/components/Window.mouseRelease:()V
        //   127: goto            101
        //   130: return         
        //    Signature:
        //  (Lkotlin/ranges/ClosedRange<Lgg/essential/gui/overlay/LayerPriority;>;)V
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  priority  
        //    StackMapTable: 00 04 FF 00 1F 00 07 07 00 02 07 01 99 00 07 00 BC 07 00 BC 07 00 C1 07 00 C9 00 00 37 FF 00 0D 00 07 07 00 02 07 01 99 07 00 C9 07 00 04 07 00 BC 07 00 C1 07 00 C9 00 00 1C
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void handleKey(final GuiKeyTypedEvent event, final ClosedRange<LayerPriority> priority) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: checkcast       Ljava/lang/Iterable;
        //     6: astore          $this$filter$iv
        //     8: aload           $this$filter$iv
        //    10: astore          5
        //    12: new             Ljava/util/ArrayList;
        //    15: dup            
        //    16: invokespecial   java/util/ArrayList.<init>:()V
        //    19: checkcast       Ljava/util/Collection;
        //    22: astore          destination$iv$iv
        //    24: aload           $this$filterTo$iv$iv
        //    26: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    31: astore          7
        //    33: aload           7
        //    35: invokeinterface java/util/Iterator.hasNext:()Z
        //    40: ifeq            89
        //    43: aload           7
        //    45: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    50: astore          element$iv$iv
        //    52: aload           element$iv$iv
        //    54: checkcast       Lgg/essential/gui/overlay/Layer;
        //    57: astore          it
        //    59: aload_2         /* priority */
        //    60: aload           it
        //    62: invokevirtual   gg/essential/gui/overlay/Layer.getPriority:()Lgg/essential/gui/overlay/LayerPriority;
        //    65: checkcast       Ljava/lang/Comparable;
        //    68: invokeinterface kotlin/ranges/ClosedRange.contains:(Ljava/lang/Comparable;)Z
        //    73: ifeq            33
        //    76: aload           destination$iv$iv
        //    78: aload           element$iv$iv
        //    80: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    85: pop            
        //    86: goto            33
        //    89: aload           destination$iv$iv
        //    91: checkcast       Ljava/util/List;
        //    94: invokestatic    kotlin/collections/CollectionsKt.asReversed:(Ljava/util/List;)Ljava/util/List;
        //    97: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   102: astore_3       
        //   103: aload_3        
        //   104: invokeinterface java/util/Iterator.hasNext:()Z
        //   109: ifeq            157
        //   112: aload_3        
        //   113: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   118: checkcast       Lgg/essential/gui/overlay/Layer;
        //   121: astore          layer
        //   123: aload           layer
        //   125: iconst_0       
        //   126: invokevirtual   gg/essential/gui/overlay/Layer.setPassThroughEvent$essential:(Z)V
        //   129: aload           layer
        //   131: invokevirtual   gg/essential/gui/overlay/Layer.getWindow:()Lgg/essential/elementa/components/Window;
        //   134: aload_1         /* event */
        //   135: invokevirtual   gg/essential/event/gui/GuiKeyTypedEvent.getTypedChar:()C
        //   138: aload_1         /* event */
        //   139: invokevirtual   gg/essential/event/gui/GuiKeyTypedEvent.getKeyCode:()I
        //   142: invokevirtual   gg/essential/elementa/components/Window.keyType:(CI)V
        //   145: aload           layer
        //   147: invokevirtual   gg/essential/gui/overlay/Layer.getPassThroughEvent$essential:()Z
        //   150: ifne            103
        //   153: aload_1         /* event */
        //   154: invokevirtual   gg/essential/event/gui/GuiKeyTypedEvent.setCancelled$1385ff:()V
        //   157: return         
        //    Signature:
        //  (Lgg/essential/event/gui/GuiKeyTypedEvent;Lkotlin/ranges/ClosedRange<Lgg/essential/gui/overlay/LayerPriority;>;)V
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  event     
        //  priority  
        //    StackMapTable: 00 04 FF 00 21 00 08 07 00 02 07 01 FD 07 01 99 00 07 00 BC 07 00 BC 07 00 C1 07 00 C9 00 00 37 FF 00 0D 00 08 07 00 02 07 01 FD 07 01 99 07 00 C9 07 00 04 07 00 BC 07 00 C1 07 00 C9 00 00 35
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void handleScroll(final MouseScrollEvent event, final ClosedRange<LayerPriority> priority) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: checkcast       Ljava/lang/Iterable;
        //     6: astore          $this$filter$iv
        //     8: aload           $this$filter$iv
        //    10: astore          6
        //    12: new             Ljava/util/ArrayList;
        //    15: dup            
        //    16: invokespecial   java/util/ArrayList.<init>:()V
        //    19: checkcast       Ljava/util/Collection;
        //    22: astore          destination$iv$iv
        //    24: aload           $this$filterTo$iv$iv
        //    26: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    31: astore          8
        //    33: aload           8
        //    35: invokeinterface java/util/Iterator.hasNext:()Z
        //    40: ifeq            89
        //    43: aload           8
        //    45: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    50: astore          element$iv$iv
        //    52: aload           element$iv$iv
        //    54: checkcast       Lgg/essential/gui/overlay/Layer;
        //    57: astore          it
        //    59: aload_2         /* priority */
        //    60: aload           it
        //    62: invokevirtual   gg/essential/gui/overlay/Layer.getPriority:()Lgg/essential/gui/overlay/LayerPriority;
        //    65: checkcast       Ljava/lang/Comparable;
        //    68: invokeinterface kotlin/ranges/ClosedRange.contains:(Ljava/lang/Comparable;)Z
        //    73: ifeq            33
        //    76: aload           destination$iv$iv
        //    78: aload           element$iv$iv
        //    80: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    85: pop            
        //    86: goto            33
        //    89: aload           destination$iv$iv
        //    91: checkcast       Ljava/util/List;
        //    94: invokestatic    kotlin/collections/CollectionsKt.asReversed:(Ljava/util/List;)Ljava/util/List;
        //    97: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   102: astore_3       
        //   103: aload_3        
        //   104: invokeinterface java/util/Iterator.hasNext:()Z
        //   109: ifeq            215
        //   112: aload_3        
        //   113: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   118: checkcast       Lgg/essential/gui/overlay/Layer;
        //   121: astore          layer
        //   123: new             Lkotlin/jvm/internal/Ref$BooleanRef;
        //   126: dup            
        //   127: invokespecial   kotlin/jvm/internal/Ref$BooleanRef.<init>:()V
        //   130: astore          consumed
        //   132: aload           consumed
        //   134: iconst_1       
        //   135: putfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //   138: new             Lgg/essential/gui/overlay/OverlayManagerImpl$handleScroll$finalHandler$1;
        //   141: dup            
        //   142: aload           consumed
        //   144: invokespecial   gg/essential/gui/overlay/OverlayManagerImpl$handleScroll$finalHandler$1.<init>:(Lkotlin/jvm/internal/Ref$BooleanRef;)V
        //   147: checkcast       Lkotlin/jvm/functions/Function2;
        //   150: astore          finalHandler
        //   152: aload           layer
        //   154: invokevirtual   gg/essential/gui/overlay/Layer.getWindow:()Lgg/essential/elementa/components/Window;
        //   157: invokevirtual   gg/essential/elementa/components/Window.getMouseScrollListeners:()Ljava/util/List;
        //   160: aload           finalHandler
        //   162: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   167: pop            
        //   168: aload           layer
        //   170: invokevirtual   gg/essential/gui/overlay/Layer.getWindow:()Lgg/essential/elementa/components/Window;
        //   173: aload_1         /* event */
        //   174: invokevirtual   gg/essential/event/gui/MouseScrollEvent.getAmount:()D
        //   177: ldc2_w          -1.0
        //   180: dconst_1       
        //   181: invokestatic    kotlin/ranges/RangesKt.coerceIn:(DDD)D
        //   184: invokevirtual   gg/essential/elementa/components/Window.mouseScroll:(D)V
        //   187: aload           layer
        //   189: invokevirtual   gg/essential/gui/overlay/Layer.getWindow:()Lgg/essential/elementa/components/Window;
        //   192: invokevirtual   gg/essential/elementa/components/Window.getMouseScrollListeners:()Ljava/util/List;
        //   195: aload           finalHandler
        //   197: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //   202: pop            
        //   203: aload           consumed
        //   205: getfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //   208: ifeq            103
        //   211: aload_1         /* event */
        //   212: invokevirtual   gg/essential/event/gui/MouseScrollEvent.setCancelled$1385ff:()V
        //   215: return         
        //    Signature:
        //  (Lgg/essential/event/gui/MouseScrollEvent;Lkotlin/ranges/ClosedRange<Lgg/essential/gui/overlay/LayerPriority;>;)V
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  event     
        //  priority  
        //    StackMapTable: 00 04 FF 00 21 00 09 07 00 02 07 02 14 07 01 99 00 07 00 BC 00 07 00 BC 07 00 C1 07 00 C9 00 00 37 FF 00 0D 00 09 07 00 02 07 02 14 07 01 99 07 00 C9 07 00 04 00 07 00 04 07 00 C1 07 00 C9 00 00 FB 00 6F
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final boolean isAnythingHovered(final Layer $this$isAnythingHovered, final float mouseX, final float mouseY) {
        if ($this$isAnythingHovered instanceof final VanillaScreenLayer vanillaScreenLayer) {
            return vanillaScreenLayer.isAnythingHovered(mouseX, mouseY);
        }
        final UIComponent hoveredFloatingComponent = $this$isAnythingHovered.getWindow().getHoveredFloatingComponent();
        UIComponent uiComponent;
        if (hoveredFloatingComponent == null || (uiComponent = hoveredFloatingComponent.hitTest(mouseX, mouseY)) == null) {
            uiComponent = $this$isAnythingHovered.getWindow().hitTest(mouseX, mouseY);
        }
        final UIComponent hovered = uiComponent;
        return !this.isPassThrough(hovered);
    }
    
    private final boolean isPassThrough(final UIComponent $this$isPassThrough) {
        return $this$isPassThrough instanceof Window || (($this$isPassThrough instanceof UIContainer) ? this.isPassThrough($this$isPassThrough.getParent()) : ($this$isPassThrough instanceof UIBlock && ($this$isPassThrough.getColor().getAlpha() == 0 && this.isPassThrough($this$isPassThrough.getParent()))));
    }
    
    private final void unfocus(final Layer $this$unfocus) {
        if ($this$unfocus instanceof final VanillaScreenLayer vanillaScreenLayer) {
            vanillaScreenLayer.unfocus();
        }
        else {
            $this$unfocus.getWindow().unfocus();
        }
    }
    
    private static final boolean cleanupEphemeralLayers$lambda-4(final Layer layer) {
        Intrinsics.checkNotNullParameter((Object)layer, "layer");
        if (layer instanceof EphemeralLayer && layer.getWindow().getChildren().isEmpty()) {
            ((EphemeralLayer)layer).getOnClose().invoke();
            if (layer.getWindow().getChildren().isEmpty()) {
                final Screen screen = UScreen.Companion.getCurrentScreen();
                if (screen instanceof OverlayInteractionScreen && Intrinsics.areEqual((Object)((OverlayInteractionScreen)screen).getLayer(), (Object)layer)) {
                    UScreen.Companion.displayScreen(null);
                }
                return true;
            }
        }
        return false;
    }
    
    public static final /* synthetic */ boolean access$isPassThrough(final OverlayManagerImpl $this, final UIComponent $receiver) {
        return $this.isPassThrough($receiver);
    }
    
    public static final /* synthetic */ void access$cleanupEphemeralLayers(final OverlayManagerImpl $this) {
        $this.cleanupEphemeralLayers();
    }
    
    public static final /* synthetic */ void access$computeLayersWithTrueMousePos(final OverlayManagerImpl $this) {
        $this.computeLayersWithTrueMousePos();
    }
    
    public static final /* synthetic */ void access$handleDraw(final OverlayManagerImpl $this, final UMatrixStack matrixStack, final LayerPriority priority) {
        $this.handleDraw(matrixStack, priority);
    }
    
    public static final /* synthetic */ Set access$getLayersWithTrueMousePos$p() {
        return OverlayManagerImpl.layersWithTrueMousePos;
    }
    
    public static final /* synthetic */ VanillaScreenLayer access$getScreenLayer$p() {
        return OverlayManagerImpl.screenLayer;
    }
    
    public static final /* synthetic */ PersistentLayer access$getAboveScreenLayer$p() {
        return OverlayManagerImpl.aboveScreenLayer;
    }
    
    public static final /* synthetic */ void access$handleDraw(final OverlayManagerImpl $this, final UMatrixStack matrixStack, final ClosedRange priority) {
        $this.handleDraw(matrixStack, (ClosedRange<LayerPriority>)priority);
    }
    
    public static final /* synthetic */ void access$setLayersWithTrueMousePos$p(final Set <set-?>) {
        OverlayManagerImpl.layersWithTrueMousePos = <set-?>;
    }
    
    public static final /* synthetic */ void access$unlockMouseIfRequired(final OverlayManagerImpl $this) {
        $this.unlockMouseIfRequired();
    }
    
    public static final /* synthetic */ void access$handleClick(final OverlayManagerImpl $this, final GuiClickEvent event, final ClosedRange priority) {
        $this.handleClick(event, (ClosedRange<LayerPriority>)priority);
    }
    
    public static final /* synthetic */ void access$handleMouseRelease(final OverlayManagerImpl $this, final ClosedRange priority) {
        $this.handleMouseRelease((ClosedRange<LayerPriority>)priority);
    }
    
    public static final /* synthetic */ void access$handleKey(final OverlayManagerImpl $this, final GuiKeyTypedEvent event, final ClosedRange priority) {
        $this.handleKey(event, (ClosedRange<LayerPriority>)priority);
    }
    
    public static final /* synthetic */ void access$handleScroll(final OverlayManagerImpl $this, final MouseScrollEvent event, final ClosedRange priority) {
        $this.handleScroll(event, (ClosedRange<LayerPriority>)priority);
    }
    
    public static final /* synthetic */ List access$getLayers$p() {
        return OverlayManagerImpl.layers;
    }
    
    public static final /* synthetic */ MinecraftClient access$getMc$p() {
        return OverlayManagerImpl.mc;
    }
    
    static {
        INSTANCE = new OverlayManagerImpl();
        mc = MinecraftClient.getInstance();
        layers = new ArrayList<Layer>();
        OverlayManagerImpl.layersWithTrueMousePos = SetsKt.emptySet();
        screenLayer = OverlayManagerImpl.INSTANCE.createLayer(new VanillaScreenLayer());
        aboveScreenLayer = OverlayManagerImpl.INSTANCE.createPersistentLayer(LayerPriority.AboveScreen);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000Z
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0006
                                                       \u0000
                                                       \u0002\u0010\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000b
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020	H\u0002J\u0010\u0010
                                                       \u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020	H\u0007J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020	H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020	H\u0002J\u000e\u0010\u001b\u001a\u00020\u001c*\u0004\u0018\u00010\u001dH\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002
                                                       \u0000¨\u0006\u001e""" }, d2 = { "Lgg/essential/gui/overlay/OverlayManagerImpl$Events;", "", "()V", "originalMousePos", "Lkotlin/Pair;", "", "finalDraw", "", "event", "Lgg/essential/event/gui/GuiDrawScreenEvent;", "firstClick", "Lgg/essential/event/gui/GuiClickEvent$Priority;", "firstKey", "Lgg/essential/event/gui/GuiKeyTypedEvent;", "firstScroll", "Lgg/essential/event/gui/MouseScrollEvent;", "handleDraw", "Lgg/essential/event/gui/GuiDrawScreenEvent$Priority;", "handleNonScreenDraw", "Lgg/essential/event/render/RenderTickEvent;", "mouseRelease", "Lgg/essential/event/gui/GuiMouseReleaseEvent;", "nonScreenDraw", "postDraw", "preClick", "Lgg/essential/event/gui/GuiClickEvent;", "preDraw", "isReal", "", "Lnet/minecraft/client/gui/screen/Screen;", "essential" })
    public static final class Events
    {
        @NotNull
        public static final Events INSTANCE;
        @Nullable
        private static Pair<Double, Double> originalMousePos;
        
        private Events() {
            super();
        }
        
        private final void preDraw(final GuiDrawScreenEvent event) {
            OverlayManagerImpl.INSTANCE.cleanupEphemeralLayers();
            OverlayManagerImpl.INSTANCE.computeLayersWithTrueMousePos();
            final OverlayManagerImpl instance = OverlayManagerImpl.INSTANCE;
            final UMatrixStack matrixStack = event.getMatrixStack();
            Intrinsics.checkNotNullExpressionValue((Object)matrixStack, "event.matrixStack");
            instance.handleDraw(matrixStack, LayerPriority.BelowScreenContent);
            if (!OverlayManagerImpl.access$getLayersWithTrueMousePos$p().contains(OverlayManagerImpl.access$getScreenLayer$p())) {
                Events.originalMousePos = (Pair<Double, Double>)new Pair((Object)UMouse.Raw.getX(), (Object)UMouse.Raw.getY());
                GlobalMouseOverride.INSTANCE.set(-1000000.0, -1000000.0);
                event.setMouseX$13462e();
                event.setMouseY$13462e();
            }
        }
        
        private final void postDraw(final GuiDrawScreenEvent event) {
            final Pair<Double, Double> originalMousePos = Events.originalMousePos;
            if (originalMousePos != null) {
                final Pair<Double, Double> pair = originalMousePos;
                final double x = ((Number)pair.component1()).doubleValue();
                final double y = ((Number)pair.component2()).doubleValue();
                GlobalMouseOverride.INSTANCE.set(x, y);
            }
            Events.originalMousePos = null;
            final OverlayManagerImpl instance = OverlayManagerImpl.INSTANCE;
            final UMatrixStack matrixStack = event.getMatrixStack();
            Intrinsics.checkNotNullExpressionValue((Object)matrixStack, "event.matrixStack");
            instance.handleDraw(matrixStack, LayerPriority.AboveScreenContent);
            if (!OverlayManagerImpl.access$getLayersWithTrueMousePos$p().contains(OverlayManagerImpl.access$getAboveScreenLayer$p())) {
                Events.originalMousePos = (Pair<Double, Double>)new Pair((Object)UMouse.Raw.getX(), (Object)UMouse.Raw.getY());
                GlobalMouseOverride.INSTANCE.set(-1000000.0, -1000000.0);
            }
        }
        
        private final void finalDraw(final GuiDrawScreenEvent event) {
            final Pair<Double, Double> originalMousePos = Events.originalMousePos;
            if (originalMousePos != null) {
                final Pair<Double, Double> pair = originalMousePos;
                final double x = ((Number)pair.component1()).doubleValue();
                final double y = ((Number)pair.component2()).doubleValue();
                GlobalMouseOverride.INSTANCE.set(x, y);
            }
            Events.originalMousePos = null;
            final OverlayManagerImpl instance = OverlayManagerImpl.INSTANCE;
            final UMatrixStack matrixStack = event.getMatrixStack();
            Intrinsics.checkNotNullExpressionValue((Object)matrixStack, "event.matrixStack");
            instance.handleDraw(matrixStack, (ClosedRange<LayerPriority>)RangesKt.rangeTo((Comparable)LayerPriority.AboveScreen, (Comparable)LayerPriority.Highest));
        }
        
        private final void nonScreenDraw(final RenderTickEvent event) {
            OverlayManagerImpl.INSTANCE.cleanupEphemeralLayers();
            final OverlayManagerImpl instance = OverlayManagerImpl.INSTANCE;
            OverlayManagerImpl.access$setLayersWithTrueMousePos$p(SetsKt.emptySet());
            final OverlayManagerImpl instance2 = OverlayManagerImpl.INSTANCE;
            final UMatrixStack matrixStack = event.getMatrixStack();
            Intrinsics.checkNotNullExpressionValue((Object)matrixStack, "event.matrixStack");
            instance2.handleDraw(matrixStack, (ClosedRange<LayerPriority>)RangesKt.rangeTo((Comparable)LayerPriority.BelowScreenContent, (Comparable)LayerPriority.Highest));
            OverlayManagerImpl.INSTANCE.unlockMouseIfRequired();
        }
        
        @Subscribe
        public final void handleDraw(@NotNull final GuiDrawScreenEvent.Priority event) {
            Intrinsics.checkNotNullParameter((Object)event, "event");
            if (!this.isReal(event.getScreen())) {
                return;
            }
            this.finalDraw(event);
        }
        
        @Subscribe
        public final void handleDraw(@NotNull final GuiDrawScreenEvent event) {
            Intrinsics.checkNotNullParameter((Object)event, "event");
            if (!this.isReal(event.getScreen())) {
                return;
            }
            if (event.isPre()) {
                this.preDraw(event);
            }
            else {
                this.postDraw(event);
            }
        }
        
        @Subscribe
        public final void handleNonScreenDraw(@NotNull final RenderTickEvent event) {
            Intrinsics.checkNotNullParameter((Object)event, "event");
            if (UScreen.Companion.getCurrentScreen() != null) {
                return;
            }
            this.nonScreenDraw(event);
        }
        
        @Subscribe
        public final void firstClick(@NotNull final GuiClickEvent.Priority event) {
            Intrinsics.checkNotNullParameter((Object)event, "event");
            if (!this.isReal(event.getScreen())) {
                return;
            }
            OverlayManagerImpl.INSTANCE.handleClick(event, (ClosedRange<LayerPriority>)RangesKt.rangeTo((Comparable)LayerPriority.AboveScreen, (Comparable)LayerPriority.Highest));
        }
        
        @Subscribe
        public final void preClick(@NotNull final GuiClickEvent event) {
            Intrinsics.checkNotNullParameter((Object)event, "event");
            if (!this.isReal(event.getScreen())) {
                return;
            }
            OverlayManagerImpl.INSTANCE.handleClick(event, (ClosedRange<LayerPriority>)RangesKt.rangeTo((Comparable)LayerPriority.BelowScreenContent, (Comparable)LayerPriority.AboveScreenContent));
        }
        
        @Subscribe
        public final void mouseRelease(@NotNull final GuiMouseReleaseEvent event) {
            Intrinsics.checkNotNullParameter((Object)event, "event");
            if (!this.isReal(event.getScreen())) {
                return;
            }
            OverlayManagerImpl.INSTANCE.handleMouseRelease((ClosedRange<LayerPriority>)RangesKt.rangeTo((Comparable)LayerPriority.BelowScreenContent, (Comparable)LayerPriority.Highest));
        }
        
        @Subscribe
        public final void firstKey(@NotNull final GuiKeyTypedEvent event) {
            Intrinsics.checkNotNullParameter((Object)event, "event");
            if (!this.isReal(event.getScreen())) {
                return;
            }
            OverlayManagerImpl.INSTANCE.handleKey(event, (ClosedRange<LayerPriority>)RangesKt.rangeTo((Comparable)LayerPriority.BelowScreenContent, (Comparable)LayerPriority.Highest));
        }
        
        @Subscribe
        public final void firstScroll(@NotNull final MouseScrollEvent event) {
            Intrinsics.checkNotNullParameter((Object)event, "event");
            if (!this.isReal(event.getScreen())) {
                return;
            }
            OverlayManagerImpl.INSTANCE.handleScroll(event, (ClosedRange<LayerPriority>)RangesKt.rangeTo((Comparable)LayerPriority.BelowScreenContent, (Comparable)LayerPriority.Highest));
        }
        
        private final boolean isReal(final Screen $this$isReal) {
            return $this$isReal != null && Intrinsics.areEqual((Object)$this$isReal, (Object)UScreen.Companion.getCurrentScreen());
        }
        
        static {
            INSTANCE = new Events();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000 
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000b
                                                       \u0000
                                                       \u0002\u0010\u0007
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u0002
                                                       \u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020	¨\u0006
                                                       """ }, d2 = { "Lgg/essential/gui/overlay/OverlayManagerImpl$VanillaScreenLayer;", "Lgg/essential/gui/overlay/Layer;", "()V", "isAnythingHovered", "", "mouseX", "", "mouseY", "unfocus", "", "essential" })
    private static final class VanillaScreenLayer extends Layer
    {
        public VanillaScreenLayer() {
            super(LayerPriority.AboveScreenContent);
        }
        
        public final boolean isAnythingHovered(final float mouseX, final float mouseY) {
            final Screen currentScreen = UScreen.Companion.getCurrentScreen();
            if (currentScreen == null) {
                return false;
            }
            final Screen screen = currentScreen;
            return screen.method_19355((double)mouseX, (double)mouseY).isPresent();
        }
        
        public final void unfocus() {
            final Screen currentScreen = UScreen.Companion.getCurrentScreen();
            if (currentScreen == null) {
                return;
            }
            final Screen screen = currentScreen;
            final ClickableWidget clickableWidget = (ClickableWidget)screen.method_25399();
            if (clickableWidget == null) {
                return;
            }
            final ClickableWidget focused = clickableWidget;
            if (!focused.isFocused()) {
                return;
            }
            if (focused.method_25407(false)) {
                return;
            }
            screen.method_25395((Element)null);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000,
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0010\u0002
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0000
                                                       \u0002\u0010\f
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J"\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                       2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010""" }, d2 = { "Lgg/essential/gui/overlay/OverlayManagerImpl$OverlayInteractionScreen;", "Lgg/essential/universal/UScreen;", "layer", "Lgg/essential/gui/overlay/Layer;", "(Lgg/essential/gui/overlay/Layer;)V", "getLayer", "()Lgg/essential/gui/overlay/Layer;", "onKeyPressed", "", "keyCode", "", "typedChar", "", "modifiers", "Lgg/essential/universal/UKeyboard$Modifiers;", "onTick", "essential" })
    private static final class OverlayInteractionScreen extends UScreen
    {
        @NotNull
        private final Layer layer;
        
        public OverlayInteractionScreen(@NotNull final Layer layer) {
            Intrinsics.checkNotNullParameter((Object)layer, "layer");
            super(false, 0, 3, null);
            this.layer = layer;
        }
        
        @NotNull
        public final Layer getLayer() {
            return this.layer;
        }
        
        @Override
        public void onKeyPressed(final int keyCode, final char typedChar, @Nullable final UKeyboard$Modifiers modifiers) {
        }
        
        @Override
        public void onTick() {
            if (!OverlayManagerImpl.access$getLayers$p().contains(this.layer)) {
                UScreen.Companion.displayScreen(null);
            }
            super.onTick();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001a
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u0002
                                                       \u0000
                                                       \u0002\u0010\u0006
                                                       \u0002\b\u0002\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b""" }, d2 = { "Lgg/essential/gui/overlay/OverlayManagerImpl$GlobalMouseOverride;", "", "()V", "set", "", "mouseX", "", "mouseY", "essential" })
    private static final class GlobalMouseOverride
    {
        @NotNull
        public static final GlobalMouseOverride INSTANCE;
        
        private GlobalMouseOverride() {
            super();
        }
        
        public final void set(final double mouseX, final double mouseY) {
            final Mouse mouse2 = OverlayManagerImpl.access$getMc$p().mouse;
            if (mouse2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type gg.essential.mixins.transformers.client.MouseHelperAccessor");
            }
            final MouseHelperAccessor mouse = (MouseHelperAccessor)mouse2;
            mouse.setMouseX(mouseX);
            mouse.setMouseY(mouseY);
        }
        
        static {
            INSTANCE = new GlobalMouseOverride();
        }
    }
}
