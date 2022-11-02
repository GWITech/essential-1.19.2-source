package gg.essential.config;

import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.*;
import kotlin.*;
import kotlin.collections.*;
import gg.essential.connectionmanager.common.packet.telemetry.*;
import java.util.*;
import gg.essential.data.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "", "value", "", "setting", "", "invoke" })
static final class EssentialConfig$sendAbTogglePacket$1 extends Lambda implements Function2<Object, String, Unit> {
    public static final EssentialConfig$sendAbTogglePacket$1 INSTANCE;
    
    EssentialConfig$sendAbTogglePacket$1() {
        super(2);
    }
    
    public final void invoke(@Nullable final Object value, @NotNull final String setting) {
        Intrinsics.checkNotNullParameter((Object)setting, "setting");
        Essential.getInstance().getConnectionManager().getTelemetryManager().enqueue(new ClientTelemetryPacket("AB_FEATURE", MapsKt.mapOf(TuplesKt.to((Object)setting, value))));
        if (value != null) {
            ABTestingData.INSTANCE.addData("Setting:" + setting);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke(p1, (String)p2);
        return Unit.INSTANCE;
    }
    
    static {
        EssentialConfig$sendAbTogglePacket$1.INSTANCE = new EssentialConfig$sendAbTogglePacket$1();
    }
}