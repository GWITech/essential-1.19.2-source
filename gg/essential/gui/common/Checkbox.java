package gg.essential.gui.common;

import gg.essential.elementa.components.*;
import kotlin.reflect.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.*;
import gg.essential.util.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.events.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.*;
import gg.essential.universal.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000H
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020	\u0012\b\b\u0002\u0010
                                                   \u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u001e\u001a\u00020\rR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001b\u0010\u001dR\u000e\u0010
                                                   \u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u001f""" }, d2 = { "Lgg/essential/gui/common/Checkbox;", "Lgg/essential/elementa/components/UIBlock;", "initialValue", "", "boxColor", "Lgg/essential/elementa/state/State;", "Ljava/awt/Color;", "checkmarkColor", "checkmarkScaleOffset", "", "playClickSound", "callback", "Lkotlin/Function1;", "", "(ZLgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;FZLkotlin/jvm/functions/Function1;)V", "boxColorState", "Lgg/essential/elementa/state/MappedState;", "getBoxColorState", "()Lgg/essential/elementa/state/MappedState;", "checkmark", "Lgg/essential/gui/common/Checkmark;", "getCheckmark", "()Lgg/essential/gui/common/Checkmark;", "checkmark$delegate", "Lkotlin/properties/ReadWriteProperty;", "checkmarkColorState", "getCheckmarkColorState", "isChecked", "Lgg/essential/elementa/state/BasicState;", "()Lgg/essential/elementa/state/BasicState;", "toggle", "essential" })
public final class Checkbox extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    private final boolean playClickSound;
    @Nullable
    private final Function1<Boolean, Unit> callback;
    @NotNull
    private final BasicState<Boolean> isChecked;
    @NotNull
    private final MappedState<Color, Color> boxColorState;
    @NotNull
    private final MappedState<Color, Color> checkmarkColorState;
    
    public Checkbox(final boolean initialValue, @NotNull final State<Color> boxColor, @NotNull final State<Color> checkmarkColor, final float checkmarkScaleOffset, final boolean playClickSound, @Nullable final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)boxColor, "boxColor");
        Intrinsics.checkNotNullParameter((Object)checkmarkColor, "checkmarkColor");
        super(EssentialPalette.BUTTON);
        this.playClickSound = playClickSound;
        this.callback = (Function1<Boolean, Unit>)callback;
        this.isChecked = StateExtensionsKt.state(initialValue);
        this.boxColorState = boxColor.map((kotlin.jvm.functions.Function1<? super Color, ? extends Color>)Checkbox$boxColorState.Checkbox$boxColorState$1.INSTANCE);
        this.checkmarkColorState = checkmarkColor.map((kotlin.jvm.functions.Function1<? super Color, ? extends Color>)Checkbox$checkmarkColorState.Checkbox$checkmarkColorState$1.INSTANCE);
        UIComponent $this$constrain_u24lambda_u2d0$iv;
        UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setWidth(UtilitiesKt.getPixels(9));
        $this$_init__u24lambda_u2d0.setHeight(new AspectConstraint(0.0f, 1, null));
        $this$_init__u24lambda_u2d0.setColor(gg.essential.elementa.state.ExtensionsKt.toConstraint(ExtensionsKt.hoveredState$default$56721d26(this, false, false, 3).zip(this.boxColorState).map((Function1)Checkbox$1.Checkbox$1$1.INSTANCE)));
        final UIComponent $this$onLeftClick$iv = this;
        $this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>(this) {
            final /* synthetic */ Checkbox this$0;
            
            public Checkbox$special$$inlined$onLeftClick$1(final Checkbox this$0) {
                this.this$0 = this$0;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                if (it.getMouseButton() == 0) {
                    final UIClickEvent click = it;
                    click.stopPropagation();
                    this.this$0.toggle();
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        });
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = new Checkmark(checkmarkScaleOffset, (State<Color>)this.checkmarkColorState));
        final UIConstraints $this$checkmark_delegate_u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$checkmark_delegate_u24lambda_u2d2.setX(new CenterConstraint());
        $this$checkmark_delegate_u24lambda_u2d2.setY(new CenterConstraint());
        ComponentsKt.provideDelegate(StateExtensionsKt.bindParent$default$6fcd5b6b($this$constrain_u24lambda_u2d0$iv, this, this.isChecked, false, null, 12), this, Checkbox.$$delegatedProperties[0]);
    }
    
    public Checkbox(boolean initialValue, State boxColor, State checkmarkColor, float checkmarkScaleOffset, boolean playClickSound, Function1 callback, final int n) {
        if ((n & 0x1) != 0x0) {
            initialValue = false;
        }
        if ((n & 0x2) != 0x0) {
            boxColor = StateExtensionsKt.state(EssentialPalette.BUTTON);
        }
        if ((n & 0x4) != 0x0) {
            checkmarkColor = StateExtensionsKt.state(EssentialPalette.TEXT_HIGHLIGHT);
        }
        if ((n & 0x8) != 0x0) {
            checkmarkScaleOffset = 0.0f;
        }
        if ((n & 0x10) != 0x0) {
            playClickSound = true;
        }
        if ((n & 0x20) != 0x0) {
            callback = null;
        }
        this(initialValue, boxColor, checkmarkColor, checkmarkScaleOffset, playClickSound, (Function1<? super Boolean, Unit>)callback);
    }
    
    @NotNull
    public final BasicState<Boolean> isChecked() {
        return this.isChecked;
    }
    
    @NotNull
    public final MappedState<Color, Color> getBoxColorState() {
        return this.boxColorState;
    }
    
    public final void toggle() {
        this.isChecked.set((kotlin.jvm.functions.Function1<? super Object, ?>)Checkbox$toggle.Checkbox$toggle$1.INSTANCE);
        if (this.playClickSound) {
            USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
        }
        final Function1<Boolean, Unit> callback = this.callback;
        if (callback != null) {
            callback.invoke((Object)this.isChecked.get());
        }
    }
    
    public Checkbox() {
        this(false, null, null, 0.0f, false, null, 63);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Checkbox.class, "checkmark", "getCheckmark()Lgg/essential/gui/common/Checkmark;", 0)) };
    }
}
