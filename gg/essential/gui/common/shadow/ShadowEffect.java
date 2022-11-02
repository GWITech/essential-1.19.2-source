package gg.essential.gui.common.shadow;

import gg.essential.elementa.effects.*;
import kotlin.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.*;
import gg.essential.elementa.constraints.*;
import gg.essential.universal.*;
import gg.essential.elementa.font.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import gg.essential.elementa.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\r\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0010""" }, d2 = { "Lgg/essential/gui/common/shadow/ShadowEffect;", "Lgg/essential/elementa/effects/Effect;", "shadowColor", "Ljava/awt/Color;", "(Ljava/awt/Color;)V", "shadowColorState", "Lgg/essential/elementa/state/MappedState;", "beforeDraw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "getDebugInfo", "", "rebindColor", "state", "Lgg/essential/elementa/state/State;", "essential" })
public final class ShadowEffect extends Effect
{
    @NotNull
    private final MappedState<Color, Color> shadowColorState;
    
    public ShadowEffect(@NotNull final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        super();
        this.shadowColorState = new BasicState<Color>(shadowColor).map((kotlin.jvm.functions.Function1<? super Color, ? extends Color>)ShadowEffect$shadowColorState.ShadowEffect$shadowColorState$1.INSTANCE);
    }
    
    public ShadowEffect(final byte b) {
        this(EssentialPalette.COMPONENT_BACKGROUND);
    }
    
    @Override
    public void beforeDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final UIComponent boundComponent = this.getBoundComponent();
        if (boundComponent instanceof final EssentialUIText essentialUIText) {
            final String text = essentialUIText.getText();
            if (text.length() == 0 || boundComponent.getColor().getAlpha() <= 10) {
                return;
            }
            final UIConstraints constraints = boundComponent.getConstraints();
            final float scale = constraints.getTextScale();
            final FontProvider fontProvider = constraints.getFontProvider();
            final float x = boundComponent.getLeft();
            final float y = boundComponent.getTop() + ((constraints.getY() instanceof CenterConstraint) ? (fontProvider.getBelowLineHeight() * scale) : 0.0f);
            final Color color = this.shadowColorState.get();
            UGraphics.enableBlend();
            FontProvider.drawString$default(fontProvider, matrixStack, text, color, x + 1.0f, y + 1.0f, 10.0f, scale, false, null, 256, null);
        }
        else if (boundComponent instanceof UIBlock) {
            if (boundComponent.getColor().getAlpha() == 0) {
                return;
            }
            final double x2 = boundComponent.getLeft();
            final double y2 = boundComponent.getTop();
            final double x3 = boundComponent.getRight();
            final double y3 = boundComponent.getBottom();
            final Color color2 = this.shadowColorState.get();
            UIBlock.Companion.drawBlock(matrixStack, color2, x2 + 1.0, y2 + 1.0, x3 + 1.0, y3 + 1.0);
        }
        else {
            if (!(boundComponent instanceof UIImage)) {
                throw new UnsupportedOperationException("Shadow effect cannot be applied to " + this.getDebugInfo());
            }
            ((UIImage)boundComponent).drawImage(matrixStack, boundComponent.getLeft() + 1.0, boundComponent.getTop() + 1.0, boundComponent.getWidth(), boundComponent.getHeight(), this.shadowColorState.get());
        }
    }
    
    @NotNull
    public final ShadowEffect rebindColor(@NotNull final State<Color> state) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final ShadowEffect $this$rebindColor_u24lambda_u2d0 = this;
        $this$rebindColor_u24lambda_u2d0.shadowColorState.rebind(state);
        return this;
    }
    
    private final String getDebugInfo() {
        return this.getBoundComponent().getComponentName() + " " + this.getBoundComponent().getClass().getName();
    }
    
    public ShadowEffect() {
        this((byte)0);
    }
}
