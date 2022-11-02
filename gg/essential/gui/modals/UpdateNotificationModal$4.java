package gg.essential.gui.modals;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.data.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class UpdateNotificationModal$4 extends Lambda implements Function0<Unit> {
    public static final UpdateNotificationModal$4 INSTANCE;
    
    UpdateNotificationModal$4() {
        super(0);
    }
    
    public final void invoke() {
        VersionData.INSTANCE.updateLastSeenModal();
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
    
    static {
        INSTANCE = new Function0<Unit>() {
            public static final UpdateNotificationModal$4 INSTANCE;
            
            UpdateNotificationModal$4() {
                super(0);
            }
            
            public final void invoke() {
                VersionData.INSTANCE.updateLastSeenModal();
            }
            
            public /* bridge */ Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }
        };
    }
}