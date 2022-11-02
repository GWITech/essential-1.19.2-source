package gg.essential.elementa.markdown;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.markdown.drawables.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r" }, d2 = { "Lgg/essential/elementa/markdown/MarkdownRenderer;", "", "text", "", "md", "Lgg/essential/elementa/markdown/MarkdownComponent;", "config", "Lgg/essential/elementa/markdown/MarkdownConfig;", "(Ljava/lang/String;Lgg/essential/elementa/markdown/MarkdownComponent;Lgg/essential/elementa/markdown/MarkdownConfig;)V", "impl", "Lgg/essential/elementa/markdown/MarkdownRendererImpl;", "render", "Lgg/essential/elementa/markdown/drawables/DrawableList;", "Elementa" })
public final class MarkdownRenderer
{
    @NotNull
    private final MarkdownRendererImpl impl;
    
    @JvmOverloads
    public MarkdownRenderer(@NotNull final String text, @NotNull final MarkdownComponent md, @NotNull final MarkdownConfig config) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)md, "md");
        Intrinsics.checkNotNullParameter((Object)config, "config");
        super();
        this.impl = new MarkdownRendererImpl(text, md, config);
    }
    
    public MarkdownRenderer(final String text, final MarkdownComponent md, MarkdownConfig config, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x4) != 0x0) {
            config = new MarkdownConfig(null, null, null, null, null, null, null, null, 255, null);
        }
        this(text, md, config);
    }
    
    @NotNull
    public final DrawableList render() {
        return this.impl.render();
    }
    
    @JvmOverloads
    public MarkdownRenderer(@NotNull final String text, @NotNull final MarkdownComponent md) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)md, "md");
        this(text, md, null, 4, null);
    }
}
