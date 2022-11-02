package gg.essential.elementa.markdown.drawables;

import gg.essential.elementa.font.*;
import gg.essential.universal.*;
import gg.essential.elementa.markdown.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.dsl.*;
import java.awt.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007J`\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¨\u0006\u0016" }, d2 = { "Lgg/essential/elementa/markdown/drawables/TextDrawable$Companion;", "", "()V", "drawString", "", "config", "Lgg/essential/elementa/markdown/MarkdownConfig;", "fontProvider", "Lgg/essential/elementa/font/FontProvider;", "string", "", "x", "", "y", "selected", "", "isLink", "isHovered", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "headerConfig", "Lgg/essential/elementa/markdown/HeaderLevelConfig;", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "drawString(matrixStack, config, fontProvider, string, x, y, selected, isLink, isHovered)", imports = {}))
    @java.lang.Deprecated
    public final void drawString(@NotNull final MarkdownConfig config, @NotNull final FontProvider fontProvider, @NotNull final String string, final float x, final float y, final boolean selected, final boolean isLink, final boolean isHovered) {
        Intrinsics.checkNotNullParameter((Object)config, "config");
        Intrinsics.checkNotNullParameter((Object)fontProvider, "fontProvider");
        Intrinsics.checkNotNullParameter((Object)string, "string");
        drawString$default(this, new UMatrixStack(), config, fontProvider, string, x, y, selected, isLink, isHovered, null, 512, null);
    }
    
    @java.lang.Deprecated
    public static /* synthetic */ void drawString$default(final Companion companion, final MarkdownConfig config, final FontProvider fontProvider, final String string, final float x, final float y, boolean selected, boolean isLink, boolean isHovered, final int n, final Object o) {
        if ((n & 0x20) != 0x0) {
            selected = false;
        }
        if ((n & 0x40) != 0x0) {
            isLink = false;
        }
        if ((n & 0x80) != 0x0) {
            isHovered = false;
        }
        companion.drawString(config, fontProvider, string, x, y, selected, isLink, isHovered);
    }
    
    public final void drawString(@NotNull final UMatrixStack matrixStack, @NotNull final MarkdownConfig config, @NotNull final FontProvider fontProvider, @NotNull final String string, final float x, final float y, final boolean selected, final boolean isLink, final boolean isHovered, @Nullable final HeaderLevelConfig headerConfig) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)config, "config");
        Intrinsics.checkNotNullParameter((Object)fontProvider, "fontProvider");
        Intrinsics.checkNotNullParameter((Object)string, "string");
        if (selected) {
            UIBlock.Companion.drawBlockSized(matrixStack, config.getTextConfig().getSelectionBackgroundColor(), x, y, UtilitiesKt.width(string, 1.0f, fontProvider), 9.0);
        }
        final int foregroundColor = isLink ? config.getTextConfig().getLinkColor().getRGB() : (selected ? config.getTextConfig().getSelectionForegroundColor().getRGB() : ((headerConfig != null) ? headerConfig.getFontColor().getRGB() : config.getTextConfig().getColor().getRGB()));
        if (config.getTextConfig().getHasShadow()) {
            fontProvider.drawString(matrixStack, string, new Color(foregroundColor), x, y, 10.0f, 1.0f, true, new Color(config.getTextConfig().getShadowColor().getRGB()));
        }
        else {
            FontProvider.drawString$default(fontProvider, matrixStack, string, new Color(foregroundColor), x, y, 10.0f, 1.0f, false, null, 256, null);
        }
        if (isLink && isHovered) {
            UIBlock.Companion.drawBlockSized(matrixStack, config.getTextConfig().getLinkColor(), x, y + (double)8, UtilitiesKt.width$default(string, 0.0f, null, 3, null), 1.0);
        }
    }
    
    public static /* synthetic */ void drawString$default(final Companion companion, final UMatrixStack matrixStack, final MarkdownConfig config, final FontProvider fontProvider, final String string, final float x, final float y, boolean selected, boolean isLink, boolean isHovered, HeaderLevelConfig headerConfig, final int n, final Object o) {
        if ((n & 0x40) != 0x0) {
            selected = false;
        }
        if ((n & 0x80) != 0x0) {
            isLink = false;
        }
        if ((n & 0x100) != 0x0) {
            isHovered = false;
        }
        if ((n & 0x200) != 0x0) {
            headerConfig = null;
        }
        companion.drawString(matrixStack, config, fontProvider, string, x, y, selected, isLink, isHovered, headerConfig);
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
