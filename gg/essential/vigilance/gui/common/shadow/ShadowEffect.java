package gg.essential.vigilance.gui.common.shadow;

import gg.essential.elementa.effects.*;
import kotlin.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import gg.essential.vigilance.gui.*;
import gg.essential.universal.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import gg.essential.elementa.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\r\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010" }, d2 = { "Lgg/essential/vigilance/gui/common/shadow/ShadowEffect;", "Lgg/essential/elementa/effects/Effect;", "shadowColor", "Ljava/awt/Color;", "(Ljava/awt/Color;)V", "shadowColorState", "Lgg/essential/elementa/state/MappedState;", "beforeDraw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "getDebugInfo", "", "rebindColor", "state", "Lgg/essential/elementa/state/State;", "Vigilance" })
public final class ShadowEffect extends Effect
{
    @NotNull
    private final MappedState<Color, Color> shadowColorState;
    
    public ShadowEffect(@NotNull final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        super();
        this.shadowColorState = new BasicState<Color>(shadowColor).map((kotlin.jvm.functions.Function1<? super Color, ? extends Color>)ShadowEffect$shadowColorState.ShadowEffect$shadowColorState$1.INSTANCE);
    }
    
    public ShadowEffect(Color componentBackground, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            componentBackground = VigilancePalette.INSTANCE.getComponentBackground();
        }
        this(componentBackground);
    }
    
    @Override
    public void beforeDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final UIComponent boundComponent = this.getBoundComponent();
        if (boundComponent instanceof UIBlock) {
            if (boundComponent.getColor().getAlpha() == 0) {
                return;
            }
            final double x = boundComponent.getLeft();
            final double y = boundComponent.getTop();
            final double x2 = boundComponent.getRight();
            final double y2 = boundComponent.getBottom();
            final Color color = this.shadowColorState.get();
            UIBlock.Companion.drawBlock(matrixStack, color, x + 1, y + 1, x2 + 1, y2 + 1);
        }
        else {
            if (!(boundComponent instanceof UIImage)) {
                throw new UnsupportedOperationException(Intrinsics.stringPlus("Shadow effect cannot be applied to ", (Object)this.getDebugInfo()));
            }
            ((UIImage)boundComponent).drawImage(matrixStack, boundComponent.getLeft() + 1.0, boundComponent.getTop() + 1.0, boundComponent.getWidth(), boundComponent.getHeight(), this.shadowColorState.get());
        }
    }
    
    @NotNull
    public final ShadowEffect rebindColor(@NotNull final State<Color> state) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final ShadowEffect $this$rebindColor_u24lambda_u2d0 = this;
        final int n = 0;
        $this$rebindColor_u24lambda_u2d0.shadowColorState.rebind(state);
        return this;
    }
    
    private final String getDebugInfo() {
        return this.getBoundComponent().getComponentName() + ' ' + (Object)this.getBoundComponent().getClass().getName();
    }
    
    public ShadowEffect() {
        this(null, 1, null);
    }
}
