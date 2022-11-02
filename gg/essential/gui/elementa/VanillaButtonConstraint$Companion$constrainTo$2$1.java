package gg.essential.gui.elementa;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001"\b\b\u0000\u0010\u0002*\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "T", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class VanillaButtonConstraint$Companion$constrainTo$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ UIConstraints $fallbackConstraint;
    
    VanillaButtonConstraint$Companion$constrainTo$2$1(final UIConstraints $fallbackConstraint) {
        this.$fallbackConstraint = $fallbackConstraint;
        super(0);
    }
    
    public final void invoke() {
        this.$fallbackConstraint.getX().animationFrame();
        this.$fallbackConstraint.getY().animationFrame();
        this.$fallbackConstraint.getWidth().animationFrame();
        this.$fallbackConstraint.getHeight().animationFrame();
        this.$fallbackConstraint.getRadius().animationFrame();
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}