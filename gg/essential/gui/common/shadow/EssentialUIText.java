package gg.essential.gui.common.shadow;

import java.awt.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.font.*;
import gg.essential.elementa.state.*;
import gg.essential.util.*;
import gg.essential.gui.common.*;
import kotlin.jvm.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.universal.*;
import gg.essential.elementa.utils.*;
import kotlin.collections.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000:
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000\u0018\u00002\u00020\u0001BE\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012
                                                   \b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010	\u001a\u00020\u0005\u0012\b\b\u0002\u0010
                                                   \u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010	\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0019""" }, d2 = { "Lgg/essential/gui/common/shadow/EssentialUIText;", "Lgg/essential/elementa/components/UIText;", "text", "", "shadow", "", "shadowColor", "Ljava/awt/Color;", "centeringContainsShadow", "truncateIfTooSmall", "showTooltipForTruncatedText", "(Ljava/lang/String;ZLjava/awt/Color;ZZZ)V", "fullText", "Lgg/essential/elementa/state/BasicState;", "getTruncateIfTooSmall", "()Z", "truncated", "truncatedState", "animationFrame", "", "draw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "getWidth", "", "essential" })
public final class EssentialUIText extends UIText
{
    private final boolean truncateIfTooSmall;
    @NotNull
    private final BasicState<Boolean> truncatedState;
    private boolean truncated;
    @NotNull
    private final BasicState<String> fullText;
    
    @JvmOverloads
    public EssentialUIText(@NotNull final String text, final boolean shadow, @Nullable final Color shadowColor, final boolean centeringContainsShadow, final boolean truncateIfTooSmall, final boolean showTooltipForTruncatedText) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        super(text, shadow, shadowColor);
        this.truncateIfTooSmall = truncateIfTooSmall;
        this.truncatedState = new BasicState<Boolean>(false);
        this.fullText = new BasicState<String>(text);
        this.setWidth(BasicConstraintsKt.basicWidthConstraint((Function1<? super UIComponent, Float>)new Function1<UIComponent, Float>() {
            final /* synthetic */ EssentialUIText this$0;
            
            EssentialUIText$1() {
                this.this$0 = $receiver;
                super(1);
            }
            
            @NotNull
            public final Float invoke(@NotNull final UIComponent it) {
                Intrinsics.checkNotNullParameter((Object)it, "it");
                return this.this$0.getTextWidth() * this.this$0.getTextScale();
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((UIComponent)p1);
            }
        }));
        FontProvider fontProvider = (FontProvider)EssentialTextKt.access$disregardShadows(this.getFontProvider());
        if (!centeringContainsShadow) {
            fontProvider = (FontProvider)EssentialTextKt.access$disregardBelowLineHeight(fontProvider);
        }
        this.setFontProvider(fontProvider);
        if (this.truncateIfTooSmall && showTooltipForTruncatedText) {
            ExtensionsKt.bindEssentialTooltip$default$5d648aca(this, StateExtensionsKt.and(ExtensionsKt.hoveredState$default$56721d26(this, false, false, 3), this.truncatedState), this.fullText, null, 0.0f, null, null, 60);
        }
    }
    
    public EssentialUIText(String text, boolean shadow, Color shadowColor, boolean centeringContainsShadow, boolean truncateIfTooSmall, boolean showTooltipForTruncatedText, final int n) {
        if ((n & 0x1) != 0x0) {
            text = "";
        }
        if ((n & 0x2) != 0x0) {
            shadow = true;
        }
        if ((n & 0x4) != 0x0) {
            shadowColor = null;
        }
        if ((n & 0x8) != 0x0) {
            centeringContainsShadow = shadow;
        }
        if ((n & 0x10) != 0x0) {
            truncateIfTooSmall = false;
        }
        if ((n & 0x20) != 0x0) {
            showTooltipForTruncatedText = true;
        }
        this(text, shadow, shadowColor, centeringContainsShadow, truncateIfTooSmall, showTooltipForTruncatedText);
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        if (this.truncatedState.get() != this.truncated) {
            Window.Companion.enqueueRenderOperation((Function0<Unit>)new EssentialUIText$animationFrame.EssentialUIText$animationFrame$1(this));
        }
    }
    
    @Override
    public float getWidth() {
        return this.getConstraints().getWidth();
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final float textScale = this.getTextScale();
        final float constrainedWidth = this.getConstraints().getWidth();
        if (this.truncateIfTooSmall && this.getTextWidth() * textScale > constrainedWidth) {
            final WidthConstraint oldWidth = this.getConstraints().getWidth();
            final String text = this.getText();
            String s;
            if ((s = (String)CollectionsKt.getOrNull(TextKt.getStringSplitToWidthTruncated$default(text, constrainedWidth / textScale, textScale, 1, false, false, this.getFontProvider(), null, 160, null), 0)) == null) {
                s = "...";
            }
            final String truncated = s;
            this.setWidth(UtilitiesKt.getPixels(UtilitiesKt.width(truncated, textScale, this.getFontProvider())));
            this.setText(truncated);
            super.draw(matrixStack);
            this.setText(text);
            this.setWidth(oldWidth);
            this.truncated = true;
            this.fullText.set(text);
        }
        else {
            super.draw(matrixStack);
            this.truncated = false;
        }
    }
    
    @JvmOverloads
    public EssentialUIText() {
        this(null, false, null, false, false, false, 63);
    }
    
    public static final /* synthetic */ BasicState access$getTruncatedState$p(final EssentialUIText $this) {
        return $this.truncatedState;
    }
    
    public static final /* synthetic */ boolean access$getTruncated$p(final EssentialUIText $this) {
        return $this.truncated;
    }
}
