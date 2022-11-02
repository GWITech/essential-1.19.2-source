package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f" }, d2 = { "Lgg/essential/elementa/components/Window$Companion;", "", "()V", "renderOperations", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlin/Function0;", "", "enqueueRenderOperation", "operation", "Ljava/lang/Runnable;", "of", "Lgg/essential/elementa/components/Window;", "component", "Lgg/essential/elementa/UIComponent;", "ofOrNull", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    public final void enqueueRenderOperation(@NotNull final Runnable operation) {
        Intrinsics.checkNotNullParameter((Object)operation, "operation");
        Window.access$getRenderOperations$cp().add(new Window$Companion$enqueueRenderOperation.Window$Companion$enqueueRenderOperation$1(operation));
    }
    
    public final void enqueueRenderOperation(@NotNull final Function0<Unit> operation) {
        Intrinsics.checkNotNullParameter((Object)operation, "operation");
        Window.access$getRenderOperations$cp().add(operation);
    }
    
    @NotNull
    public final Window of(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final Window ofOrNull = this.ofOrNull(component);
        if (ofOrNull == null) {
            throw new IllegalStateException("No window parent? It's possible you haven't called Window.addChild() at this point in time.");
        }
        return ofOrNull;
    }
    
    @Nullable
    public final Window ofOrNull(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final Window cachedWindow$Elementa = component.getCachedWindow$Elementa();
        Window window;
        if (cachedWindow$Elementa == null) {
            final Companion $this$ofOrNull_u24lambda_u2d0 = this;
            final int n = 0;
            UIComponent current;
            for (current = component; !(current instanceof Window) && current.getHasParent() && !Intrinsics.areEqual((Object)current.getParent(), (Object)current); current = current.getParent()) {}
            final UIComponent uiComponent = current;
            window = ((uiComponent instanceof Window) ? ((Window)uiComponent) : null);
        }
        else {
            window = cachedWindow$Elementa;
        }
        return window;
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
