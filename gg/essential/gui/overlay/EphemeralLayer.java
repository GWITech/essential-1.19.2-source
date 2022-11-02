package gg.essential.gui.overlay;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.common.modal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\b\u0010	"\u0004\b
                                                   \u0010\u000b¨\u0006\u000f""" }, d2 = { "Lgg/essential/gui/overlay/EphemeralLayer;", "Lgg/essential/gui/overlay/Layer;", "priority", "Lgg/essential/gui/overlay/LayerPriority;", "(Lgg/essential/gui/overlay/LayerPriority;)V", "onClose", "Lkotlin/Function0;", "", "getOnClose", "()Lkotlin/jvm/functions/Function0;", "setOnClose", "(Lkotlin/jvm/functions/Function0;)V", "queueModal", "modal", "Lgg/essential/gui/common/modal/Modal;", "essential" })
public final class EphemeralLayer extends Layer
{
    @NotNull
    private Function0<Unit> onClose;
    
    public EphemeralLayer(@NotNull final LayerPriority priority) {
        Intrinsics.checkNotNullParameter((Object)priority, "priority");
        super(priority);
        this.onClose = (Function0<Unit>)EphemeralLayer$onClose.EphemeralLayer$onClose$1.INSTANCE;
    }
    
    @NotNull
    public final Function0<Unit> getOnClose() {
        return this.onClose;
    }
    
    public final void setOnClose(@NotNull final Function0<Unit> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.onClose = <set-?>;
    }
    
    public final void queueModal(@NotNull final Modal modal) {
        Intrinsics.checkNotNullParameter((Object)modal, "modal");
        if (this.getWindow().getChildren().isEmpty()) {
            this.pushModal(modal);
            return;
        }
        final Function0 orgOnClose = this.onClose;
        this.onClose = (Function0<Unit>)new EphemeralLayer$queueModal.EphemeralLayer$queueModal$1(this, orgOnClose, modal);
    }
}
