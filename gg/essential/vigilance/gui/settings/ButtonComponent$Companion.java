package gg.essential.vigilance.gui.settings;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.vigilance.data.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b" }, d2 = { "Lgg/essential/vigilance/gui/settings/ButtonComponent$Companion;", "", "()V", "callbackFromPropertyData", "Lkotlin/Function0;", "", "data", "Lgg/essential/vigilance/data/PropertyData;", "Vigilance" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    private final Function0<Unit> callbackFromPropertyData(final PropertyData data) {
        final PropertyValue value = data.getValue();
        if (!(value instanceof CallablePropertyValue)) {
            throw new IllegalStateException();
        }
        return (Function0<Unit>)new ButtonComponent$Companion$callbackFromPropertyData.ButtonComponent$Companion$callbackFromPropertyData$1(value, data);
    }
    
    public static final /* synthetic */ Function0 access$callbackFromPropertyData(final Companion $this, final PropertyData data) {
        return $this.callbackFromPropertyData(data);
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
