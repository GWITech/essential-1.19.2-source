package gg.essential.gui.overlay;

import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.common.modal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0010
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0007\u0010\b"\u0004\b	\u0010
                                                   R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u000e\u0010\b"\u0004\b\u000f\u0010
                                                   R\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0011\u0010\b"\u0004\b\u0012\u0010
                                                   R\u001a\u0010\u0013\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0014\u0010\b"\u0004\b\u0015\u0010
                                                   R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e""" }, d2 = { "Lgg/essential/gui/overlay/Layer;", "", "priority", "Lgg/essential/gui/overlay/LayerPriority;", "(Lgg/essential/gui/overlay/LayerPriority;)V", "passThroughEvent", "", "getPassThroughEvent$essential", "()Z", "setPassThroughEvent$essential", "(Z)V", "getPriority", "()Lgg/essential/gui/overlay/LayerPriority;", "rendered", "getRendered", "setRendered", "respectsHideGuiSetting", "getRespectsHideGuiSetting", "setRespectsHideGuiSetting", "unlocksMouse", "getUnlocksMouse", "setUnlocksMouse", "window", "Lgg/essential/elementa/components/Window;", "getWindow", "()Lgg/essential/elementa/components/Window;", "pushModal", "", "modal", "Lgg/essential/gui/common/modal/Modal;", "essential" })
public class Layer
{
    @NotNull
    private final LayerPriority priority;
    @NotNull
    private final Window window;
    private boolean rendered;
    private boolean respectsHideGuiSetting;
    private boolean unlocksMouse;
    private boolean passThroughEvent;
    
    public Layer(@NotNull final LayerPriority priority) {
        Intrinsics.checkNotNullParameter((Object)priority, "priority");
        super();
        this.priority = priority;
        this.window = new Window(ElementaVersion.V1, 0, 2, null);
        this.rendered = true;
        this.respectsHideGuiSetting = true;
        this.unlocksMouse = (this.priority == LayerPriority.Modal);
        this.window.onKeyType((Function3<? super UIComponent, ? super Character, ? super Integer, Unit>)new Function3<UIComponent, Character, Integer, Unit>() {
            final /* synthetic */ Layer this$0;
            
            Layer$1() {
                this.this$0 = $receiver;
                super(3);
            }
            
            public final void invoke$69f0f35d(@NotNull final UIComponent $this$onKeyType) {
                Intrinsics.checkNotNullParameter((Object)$this$onKeyType, "$this$onKeyType");
                this.this$0.setPassThroughEvent$essential(true);
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3) {
                final UIComponent $this$onKeyType = (UIComponent)p1;
                ((Character)p2).charValue();
                ((Number)p3).intValue();
                this.invoke$69f0f35d($this$onKeyType);
                return Unit.INSTANCE;
            }
        });
    }
    
    @NotNull
    public final LayerPriority getPriority() {
        return this.priority;
    }
    
    @NotNull
    public final Window getWindow() {
        return this.window;
    }
    
    public final boolean getRendered() {
        return this.rendered;
    }
    
    public final void setRendered(final boolean <set-?>) {
        this.rendered = <set-?>;
    }
    
    public final boolean getRespectsHideGuiSetting() {
        return this.respectsHideGuiSetting;
    }
    
    public final boolean getUnlocksMouse() {
        return this.unlocksMouse;
    }
    
    public final boolean getPassThroughEvent$essential() {
        return this.passThroughEvent;
    }
    
    public final void setPassThroughEvent$essential(final boolean <set-?>) {
        this.passThroughEvent = <set-?>;
    }
    
    public final void pushModal(@NotNull final Modal modal) {
        Intrinsics.checkNotNullParameter((Object)modal, "modal");
        modal.setParent(this.window);
        Modal.fadeIn$default$70fdbc49(modal, null);
    }
}
