package gg.essential.vigilance.gui.settings;

import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0016J\u001c\u0010\u0005\u001a\u00020\u00072\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013" }, d2 = { "Lgg/essential/vigilance/gui/settings/SettingComponent;", "Lgg/essential/elementa/components/UIContainer;", "()V", "lastValue", "", "onValueChange", "Lkotlin/Function1;", "", "changeValue", "newValue", "callListener", "", "closePopups", "instantly", "listener", "setupParentListeners", "parent", "Lgg/essential/elementa/UIComponent;", "Companion", "Vigilance" })
public abstract class SettingComponent extends UIContainer
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private Function1<Object, Unit> onValueChange;
    @Nullable
    private Object lastValue;
    @NotNull
    public static final String DOWN_ARROW_PNG = "/vigilance/arrow-down.png";
    @NotNull
    public static final String UP_ARROW_PNG = "/vigilance/arrow-up.png";
    
    public SettingComponent() {
        super();
        this.onValueChange = (Function1<Object, Unit>)SettingComponent$onValueChange.SettingComponent$onValueChange$1.INSTANCE;
        final UIComponent $this$constrain$iv = this;
        final int $i$f$constrain = 0;
        final UIComponent $this$constrain_u24lambda_u2d0$iv = $this$constrain$iv;
        final int n = 0;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        final int n2 = 0;
        $this$_init__u24lambda_u2d0.setX(UtilitiesKt.pixels$default(23.0f, true, false, 2, null));
        $this$_init__u24lambda_u2d0.setY(new CenterConstraint());
    }
    
    public final void onValueChange(@NotNull final Function1<Object, Unit> listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        this.onValueChange = listener;
    }
    
    public final void changeValue(@Nullable final Object newValue, final boolean callListener) {
        if (!Intrinsics.areEqual(newValue, this.lastValue)) {
            this.lastValue = newValue;
            this.onValueChange.invoke(newValue);
        }
    }
    
    public static /* synthetic */ void changeValue$default(final SettingComponent settingComponent, final Object newValue, boolean callListener, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeValue");
        }
        if ((n & 0x2) != 0x0) {
            callListener = true;
        }
        settingComponent.changeValue(newValue, callListener);
    }
    
    public void closePopups(final boolean instantly) {
    }
    
    public static /* synthetic */ void closePopups$default(final SettingComponent settingComponent, boolean instantly, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closePopups");
        }
        if ((n & 0x1) != 0x0) {
            instantly = false;
        }
        settingComponent.closePopups(instantly);
    }
    
    public void setupParentListeners(@NotNull final UIComponent parent) {
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006" }, d2 = { "Lgg/essential/vigilance/gui/settings/SettingComponent$Companion;", "", "()V", "DOWN_ARROW_PNG", "", "UP_ARROW_PNG", "Vigilance" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
