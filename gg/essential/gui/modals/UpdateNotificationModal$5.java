package gg.essential.gui.modals;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.config.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ?\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class UpdateNotificationModal$5 extends Lambda implements Function1<Boolean, Unit> {
    public static final UpdateNotificationModal$5 INSTANCE;
    
    UpdateNotificationModal$5() {
        super(1);
    }
    
    public final void invoke(final boolean it) {
        EssentialConfig.INSTANCE.setUpdateModal(!it);
        EssentialConfig.INSTANCE.markDirty();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((boolean)p1);
        return Unit.INSTANCE;
    }
    
    static {
        INSTANCE = new Function1<Boolean, Unit>() {
            public static final UpdateNotificationModal$5 INSTANCE;
            
            UpdateNotificationModal$5() {
                super(1);
            }
            
            public final void invoke(final boolean it) {
                EssentialConfig.INSTANCE.setUpdateModal(!it);
                EssentialConfig.INSTANCE.markDirty();
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke((boolean)p1);
                return Unit.INSTANCE;
            }
        };
    }
}