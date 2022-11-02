package gg.essential.gui.notification;

import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/notification/Notifications$DelayedNotification;", "Lgg/essential/elementa/components/UIContainer;", "()V", "triggered", "", "animationFrame", "", "essential" })
private static final class DelayedNotification extends UIContainer
{
    private boolean triggered;
    
    public DelayedNotification() {
        super();
    }
    
    @Override
    public void animationFrame() {
        final Notifications instance = Notifications.INSTANCE;
        Notifications.access$setBeforeFirstDraw$p$1385ff();
        if (!this.triggered && !Notifications.access$getBlocked(Notifications.INSTANCE)) {
            this.triggered = true;
            Window.Companion.enqueueRenderOperation((Function0<Unit>)new Notifications$DelayedNotification$animationFrame.Notifications$DelayedNotification$animationFrame$1(this));
        }
        super.animationFrame();
    }
}
