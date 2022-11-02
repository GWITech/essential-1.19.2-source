package gg.essential.gui.overlay;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;
import gg.essential.event.render.*;
import kotlin.collections.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.universal.*;
import gg.essential.event.gui.*;
import net.minecraft.client.gui.screen.*;

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
        OverlayManagerImpl.access$cleanupEphemeralLayers(OverlayManagerImpl.INSTANCE);
        OverlayManagerImpl.access$computeLayersWithTrueMousePos(OverlayManagerImpl.INSTANCE);
        final OverlayManagerImpl instance = OverlayManagerImpl.INSTANCE;
        final UMatrixStack matrixStack = event.getMatrixStack();
        Intrinsics.checkNotNullExpressionValue((Object)matrixStack, "event.matrixStack");
        OverlayManagerImpl.access$handleDraw(instance, matrixStack, LayerPriority.BelowScreenContent);
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
        OverlayManagerImpl.access$handleDraw(instance, matrixStack, LayerPriority.AboveScreenContent);
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
        OverlayManagerImpl.access$handleDraw(instance, matrixStack, RangesKt.rangeTo((Comparable)LayerPriority.AboveScreen, (Comparable)LayerPriority.Highest));
    }
    
    private final void nonScreenDraw(final RenderTickEvent event) {
        OverlayManagerImpl.access$cleanupEphemeralLayers(OverlayManagerImpl.INSTANCE);
        final OverlayManagerImpl instance = OverlayManagerImpl.INSTANCE;
        OverlayManagerImpl.access$setLayersWithTrueMousePos$p(SetsKt.emptySet());
        final OverlayManagerImpl instance2 = OverlayManagerImpl.INSTANCE;
        final UMatrixStack matrixStack = event.getMatrixStack();
        Intrinsics.checkNotNullExpressionValue((Object)matrixStack, "event.matrixStack");
        OverlayManagerImpl.access$handleDraw(instance2, matrixStack, RangesKt.rangeTo((Comparable)LayerPriority.BelowScreenContent, (Comparable)LayerPriority.Highest));
        OverlayManagerImpl.access$unlockMouseIfRequired(OverlayManagerImpl.INSTANCE);
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
        OverlayManagerImpl.access$handleClick(OverlayManagerImpl.INSTANCE, event, RangesKt.rangeTo((Comparable)LayerPriority.AboveScreen, (Comparable)LayerPriority.Highest));
    }
    
    @Subscribe
    public final void preClick(@NotNull final GuiClickEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        if (!this.isReal(event.getScreen())) {
            return;
        }
        OverlayManagerImpl.access$handleClick(OverlayManagerImpl.INSTANCE, event, RangesKt.rangeTo((Comparable)LayerPriority.BelowScreenContent, (Comparable)LayerPriority.AboveScreenContent));
    }
    
    @Subscribe
    public final void mouseRelease(@NotNull final GuiMouseReleaseEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        if (!this.isReal(event.getScreen())) {
            return;
        }
        OverlayManagerImpl.access$handleMouseRelease(OverlayManagerImpl.INSTANCE, RangesKt.rangeTo((Comparable)LayerPriority.BelowScreenContent, (Comparable)LayerPriority.Highest));
    }
    
    @Subscribe
    public final void firstKey(@NotNull final GuiKeyTypedEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        if (!this.isReal(event.getScreen())) {
            return;
        }
        OverlayManagerImpl.access$handleKey(OverlayManagerImpl.INSTANCE, event, RangesKt.rangeTo((Comparable)LayerPriority.BelowScreenContent, (Comparable)LayerPriority.Highest));
    }
    
    @Subscribe
    public final void firstScroll(@NotNull final MouseScrollEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        if (!this.isReal(event.getScreen())) {
            return;
        }
        OverlayManagerImpl.access$handleScroll(OverlayManagerImpl.INSTANCE, event, RangesKt.rangeTo((Comparable)LayerPriority.BelowScreenContent, (Comparable)LayerPriority.Highest));
    }
    
    private final boolean isReal(final Screen $this$isReal) {
        return $this$isReal != null && Intrinsics.areEqual((Object)$this$isReal, (Object)UScreen.Companion.getCurrentScreen());
    }
    
    static {
        INSTANCE = new Events();
    }
}
