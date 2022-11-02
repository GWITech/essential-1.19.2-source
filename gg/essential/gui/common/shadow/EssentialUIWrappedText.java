package gg.essential.gui.common.shadow;

import gg.essential.elementa.components.*;
import kotlin.*;
import java.awt.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.font.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001BO\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012
                                                   \b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010	\u001a\u00020\u0005\u0012\b\b\u0002\u0010
                                                   \u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rB_\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0010\b\u0002\u0010\u0006\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010	\u001a\u00020\u0005\u0012\b\b\u0002\u0010
                                                   \u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u000f¨\u0006\u0010""" }, d2 = { "Lgg/essential/gui/common/shadow/EssentialUIWrappedText;", "Lgg/essential/elementa/components/UIWrappedText;", "text", "", "shadow", "", "shadowColor", "Ljava/awt/Color;", "centered", "trimText", "trimmedTextSuffix", "lineSpacing", "", "(Ljava/lang/String;ZLjava/awt/Color;ZZLjava/lang/String;F)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;ZZLjava/lang/String;F)V", "essential" })
public final class EssentialUIWrappedText extends UIWrappedText
{
    @JvmOverloads
    public EssentialUIWrappedText(@NotNull final State<String> text, @NotNull final State<Boolean> shadow, @NotNull final State<Color> shadowColor, final boolean centered, final boolean trimText, @NotNull final String trimmedTextSuffix, final float lineSpacing) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)shadow, "shadow");
        Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
        Intrinsics.checkNotNullParameter((Object)trimmedTextSuffix, "trimmedTextSuffix");
        super(text, shadow, shadowColor, centered, false, lineSpacing, trimmedTextSuffix);
        this.setFontProvider((FontProvider)EssentialTextKt.access$disregardShadows(this.getFontProvider()));
    }
    
    @JvmOverloads
    public EssentialUIWrappedText(@NotNull final String text, final boolean shadow, @Nullable final Color shadowColor, final boolean centered, @NotNull final String trimmedTextSuffix, final float lineSpacing) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)trimmedTextSuffix, "trimmedTextSuffix");
        this(new BasicState<String>(text), new BasicState<Boolean>(shadow), new BasicState<Color>(shadowColor), centered, false, trimmedTextSuffix, lineSpacing);
    }
    
    public EssentialUIWrappedText(String text, boolean shadow, Color shadowColor, boolean centered, String trimmedTextSuffix, float lineSpacing, final int n) {
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
            centered = false;
        }
        if ((n & 0x20) != 0x0) {
            trimmedTextSuffix = "...";
        }
        if ((n & 0x40) != 0x0) {
            lineSpacing = 12.0f;
        }
        this(text, shadow, shadowColor, centered, trimmedTextSuffix, lineSpacing);
    }
    
    @JvmOverloads
    public EssentialUIWrappedText() {
        this(null, false, null, false, null, 0.0f, 127);
    }
}
