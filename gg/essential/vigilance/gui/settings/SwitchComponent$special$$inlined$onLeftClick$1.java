package gg.essential.vigilance.gui.settings;

import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.state.*;
import java.awt.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.constraints.animation.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class SwitchComponent$special$$inlined$onLeftClick$1 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ SwitchComponent this$0;
    
    public SwitchComponent$special$$inlined$onLeftClick$1(final SwitchComponent this$0) {
        this.this$0 = this$0;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getMouseButton() == 0) {
            final UIComponent $this$_init__u24lambda_u2d10 = $this$onMouseClick;
            final int n = 0;
            USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
            this.this$0.getEnabled$Vigilance().set((kotlin.jvm.functions.Function1<? super Object, ?>)SwitchComponent$2.SwitchComponent$2$1.INSTANCE);
            SettingComponent.changeValue$default(this.this$0, this.this$0.getEnabled$Vigilance().get(), false, 2, null);
            SwitchComponent.access$getBackground(this.this$0).setColor(ExtensionsKt.toConstraint(SwitchComponent.access$getSwitchColor(this.this$0)));
            final UIComponent $this$animate$iv = SwitchComponent.access$getSwitchBox$p(this.this$0);
            final int $i$f$animate = 0;
            final UIComponent $this$animate_u24lambda_u2d0$iv = $this$animate$iv;
            final int n2 = 0;
            final AnimatingConstraints $this$lambda_u2d10_u24lambda_u2d9;
            final AnimatingConstraints anim$iv = $this$lambda_u2d10_u24lambda_u2d9 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
            final int n3 = 0;
            AnimatingConstraints.setXAnimation$default($this$lambda_u2d10_u24lambda_u2d9, Animations.OUT_EXP, 0.5f, SwitchComponent.access$getSwitchPosition(this.this$0), 0.0f, 8, null);
            $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}