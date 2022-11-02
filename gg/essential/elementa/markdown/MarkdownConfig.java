package gg.essential.elementa.markdown;

import kotlin.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import java.awt.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010'\u001a\u00020\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\rH\u00c6\u0003J\t\u0010)\u001a\u00020\u000fH\u00c6\u0003J\t\u0010*\u001a\u00020\u0011H\u00c6\u0003JY\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063" }, d2 = { "Lgg/essential/elementa/markdown/MarkdownConfig;", "", "headerConfig", "Lgg/essential/elementa/markdown/HeaderConfig;", "listConfig", "Lgg/essential/elementa/markdown/ListConfig;", "paragraphConfig", "Lgg/essential/elementa/markdown/ParagraphConfig;", "textConfig", "Lgg/essential/elementa/markdown/TextConfig;", "blockquoteConfig", "Lgg/essential/elementa/markdown/BlockquoteConfig;", "inlineCodeConfig", "Lgg/essential/elementa/markdown/InlineCodeConfig;", "codeBlockConfig", "Lgg/essential/elementa/markdown/CodeBlockConfig;", "urlConfig", "Lgg/essential/elementa/markdown/URLConfig;", "(Lgg/essential/elementa/markdown/HeaderConfig;Lgg/essential/elementa/markdown/ListConfig;Lgg/essential/elementa/markdown/ParagraphConfig;Lgg/essential/elementa/markdown/TextConfig;Lgg/essential/elementa/markdown/BlockquoteConfig;Lgg/essential/elementa/markdown/InlineCodeConfig;Lgg/essential/elementa/markdown/CodeBlockConfig;Lgg/essential/elementa/markdown/URLConfig;)V", "getBlockquoteConfig", "()Lgg/essential/elementa/markdown/BlockquoteConfig;", "getCodeBlockConfig", "()Lgg/essential/elementa/markdown/CodeBlockConfig;", "getHeaderConfig", "()Lgg/essential/elementa/markdown/HeaderConfig;", "getInlineCodeConfig", "()Lgg/essential/elementa/markdown/InlineCodeConfig;", "getListConfig", "()Lgg/essential/elementa/markdown/ListConfig;", "getParagraphConfig", "()Lgg/essential/elementa/markdown/ParagraphConfig;", "getTextConfig", "()Lgg/essential/elementa/markdown/TextConfig;", "getUrlConfig", "()Lgg/essential/elementa/markdown/URLConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elementa" })
public final class MarkdownConfig
{
    @NotNull
    private final HeaderConfig headerConfig;
    @NotNull
    private final ListConfig listConfig;
    @NotNull
    private final ParagraphConfig paragraphConfig;
    @NotNull
    private final TextConfig textConfig;
    @NotNull
    private final BlockquoteConfig blockquoteConfig;
    @NotNull
    private final InlineCodeConfig inlineCodeConfig;
    @NotNull
    private final CodeBlockConfig codeBlockConfig;
    @NotNull
    private final URLConfig urlConfig;
    
    @JvmOverloads
    public MarkdownConfig(@NotNull final HeaderConfig headerConfig, @NotNull final ListConfig listConfig, @NotNull final ParagraphConfig paragraphConfig, @NotNull final TextConfig textConfig, @NotNull final BlockquoteConfig blockquoteConfig, @NotNull final InlineCodeConfig inlineCodeConfig, @NotNull final CodeBlockConfig codeBlockConfig, @NotNull final URLConfig urlConfig) {
        Intrinsics.checkNotNullParameter((Object)headerConfig, "headerConfig");
        Intrinsics.checkNotNullParameter((Object)listConfig, "listConfig");
        Intrinsics.checkNotNullParameter((Object)paragraphConfig, "paragraphConfig");
        Intrinsics.checkNotNullParameter((Object)textConfig, "textConfig");
        Intrinsics.checkNotNullParameter((Object)blockquoteConfig, "blockquoteConfig");
        Intrinsics.checkNotNullParameter((Object)inlineCodeConfig, "inlineCodeConfig");
        Intrinsics.checkNotNullParameter((Object)codeBlockConfig, "codeBlockConfig");
        Intrinsics.checkNotNullParameter((Object)urlConfig, "urlConfig");
        super();
        this.headerConfig = headerConfig;
        this.listConfig = listConfig;
        this.paragraphConfig = paragraphConfig;
        this.textConfig = textConfig;
        this.blockquoteConfig = blockquoteConfig;
        this.inlineCodeConfig = inlineCodeConfig;
        this.codeBlockConfig = codeBlockConfig;
        this.urlConfig = urlConfig;
    }
    
    public MarkdownConfig(HeaderConfig headerConfig, ListConfig listConfig, ParagraphConfig paragraphConfig, TextConfig textConfig, BlockquoteConfig blockquoteConfig, InlineCodeConfig inlineCodeConfig, CodeBlockConfig codeBlockConfig, URLConfig urlConfig, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            headerConfig = new HeaderConfig(null, null, null, null, null, null, null, false, 255, null);
        }
        if ((n & 0x2) != 0x0) {
            listConfig = new ListConfig(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 511, null);
        }
        if ((n & 0x4) != 0x0) {
            paragraphConfig = new ParagraphConfig(0.0f, 0.0f, 0.0f, false, false, 31, null);
        }
        if ((n & 0x8) != 0x0) {
            textConfig = new TextConfig(null, false, null, null, null, null, false, 127, null);
        }
        if ((n & 0x10) != 0x0) {
            blockquoteConfig = new BlockquoteConfig(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, false, 511, null);
        }
        if ((n & 0x20) != 0x0) {
            inlineCodeConfig = new InlineCodeConfig(null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, false, 255, null);
        }
        if ((n & 0x40) != 0x0) {
            codeBlockConfig = new CodeBlockConfig(null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 4095, null);
        }
        if ((n & 0x80) != 0x0) {
            urlConfig = new URLConfig(null, false, null, 0.0f, 0.0f, false, 63, null);
        }
        this(headerConfig, listConfig, paragraphConfig, textConfig, blockquoteConfig, inlineCodeConfig, codeBlockConfig, urlConfig);
    }
    
    @NotNull
    public final HeaderConfig getHeaderConfig() {
        return this.headerConfig;
    }
    
    @NotNull
    public final ListConfig getListConfig() {
        return this.listConfig;
    }
    
    @NotNull
    public final ParagraphConfig getParagraphConfig() {
        return this.paragraphConfig;
    }
    
    @NotNull
    public final TextConfig getTextConfig() {
        return this.textConfig;
    }
    
    @NotNull
    public final BlockquoteConfig getBlockquoteConfig() {
        return this.blockquoteConfig;
    }
    
    @NotNull
    public final InlineCodeConfig getInlineCodeConfig() {
        return this.inlineCodeConfig;
    }
    
    @NotNull
    public final CodeBlockConfig getCodeBlockConfig() {
        return this.codeBlockConfig;
    }
    
    @NotNull
    public final URLConfig getUrlConfig() {
        return this.urlConfig;
    }
    
    @NotNull
    public final HeaderConfig component1() {
        return this.headerConfig;
    }
    
    @NotNull
    public final ListConfig component2() {
        return this.listConfig;
    }
    
    @NotNull
    public final ParagraphConfig component3() {
        return this.paragraphConfig;
    }
    
    @NotNull
    public final TextConfig component4() {
        return this.textConfig;
    }
    
    @NotNull
    public final BlockquoteConfig component5() {
        return this.blockquoteConfig;
    }
    
    @NotNull
    public final InlineCodeConfig component6() {
        return this.inlineCodeConfig;
    }
    
    @NotNull
    public final CodeBlockConfig component7() {
        return this.codeBlockConfig;
    }
    
    @NotNull
    public final URLConfig component8() {
        return this.urlConfig;
    }
    
    @NotNull
    public final MarkdownConfig copy(@NotNull final HeaderConfig headerConfig, @NotNull final ListConfig listConfig, @NotNull final ParagraphConfig paragraphConfig, @NotNull final TextConfig textConfig, @NotNull final BlockquoteConfig blockquoteConfig, @NotNull final InlineCodeConfig inlineCodeConfig, @NotNull final CodeBlockConfig codeBlockConfig, @NotNull final URLConfig urlConfig) {
        Intrinsics.checkNotNullParameter((Object)headerConfig, "headerConfig");
        Intrinsics.checkNotNullParameter((Object)listConfig, "listConfig");
        Intrinsics.checkNotNullParameter((Object)paragraphConfig, "paragraphConfig");
        Intrinsics.checkNotNullParameter((Object)textConfig, "textConfig");
        Intrinsics.checkNotNullParameter((Object)blockquoteConfig, "blockquoteConfig");
        Intrinsics.checkNotNullParameter((Object)inlineCodeConfig, "inlineCodeConfig");
        Intrinsics.checkNotNullParameter((Object)codeBlockConfig, "codeBlockConfig");
        Intrinsics.checkNotNullParameter((Object)urlConfig, "urlConfig");
        return new MarkdownConfig(headerConfig, listConfig, paragraphConfig, textConfig, blockquoteConfig, inlineCodeConfig, codeBlockConfig, urlConfig);
    }
    
    public static /* synthetic */ MarkdownConfig copy$default(final MarkdownConfig markdownConfig, HeaderConfig headerConfig, ListConfig listConfig, ParagraphConfig paragraphConfig, TextConfig textConfig, BlockquoteConfig blockquoteConfig, InlineCodeConfig inlineCodeConfig, CodeBlockConfig codeBlockConfig, URLConfig urlConfig, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            headerConfig = markdownConfig.headerConfig;
        }
        if ((n & 0x2) != 0x0) {
            listConfig = markdownConfig.listConfig;
        }
        if ((n & 0x4) != 0x0) {
            paragraphConfig = markdownConfig.paragraphConfig;
        }
        if ((n & 0x8) != 0x0) {
            textConfig = markdownConfig.textConfig;
        }
        if ((n & 0x10) != 0x0) {
            blockquoteConfig = markdownConfig.blockquoteConfig;
        }
        if ((n & 0x20) != 0x0) {
            inlineCodeConfig = markdownConfig.inlineCodeConfig;
        }
        if ((n & 0x40) != 0x0) {
            codeBlockConfig = markdownConfig.codeBlockConfig;
        }
        if ((n & 0x80) != 0x0) {
            urlConfig = markdownConfig.urlConfig;
        }
        return markdownConfig.copy(headerConfig, listConfig, paragraphConfig, textConfig, blockquoteConfig, inlineCodeConfig, codeBlockConfig, urlConfig);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "MarkdownConfig(headerConfig=" + this.headerConfig + ", listConfig=" + this.listConfig + ", paragraphConfig=" + this.paragraphConfig + ", textConfig=" + this.textConfig + ", blockquoteConfig=" + this.blockquoteConfig + ", inlineCodeConfig=" + this.inlineCodeConfig + ", codeBlockConfig=" + this.codeBlockConfig + ", urlConfig=" + this.urlConfig + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.headerConfig.hashCode();
        result = result * 31 + this.listConfig.hashCode();
        result = result * 31 + this.paragraphConfig.hashCode();
        result = result * 31 + this.textConfig.hashCode();
        result = result * 31 + this.blockquoteConfig.hashCode();
        result = result * 31 + this.inlineCodeConfig.hashCode();
        result = result * 31 + this.codeBlockConfig.hashCode();
        result = result * 31 + this.urlConfig.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkdownConfig)) {
            return false;
        }
        final MarkdownConfig markdownConfig = (MarkdownConfig)other;
        return Intrinsics.areEqual((Object)this.headerConfig, (Object)markdownConfig.headerConfig) && Intrinsics.areEqual((Object)this.listConfig, (Object)markdownConfig.listConfig) && Intrinsics.areEqual((Object)this.paragraphConfig, (Object)markdownConfig.paragraphConfig) && Intrinsics.areEqual((Object)this.textConfig, (Object)markdownConfig.textConfig) && Intrinsics.areEqual((Object)this.blockquoteConfig, (Object)markdownConfig.blockquoteConfig) && Intrinsics.areEqual((Object)this.inlineCodeConfig, (Object)markdownConfig.inlineCodeConfig) && Intrinsics.areEqual((Object)this.codeBlockConfig, (Object)markdownConfig.codeBlockConfig) && Intrinsics.areEqual((Object)this.urlConfig, (Object)markdownConfig.urlConfig);
    }
    
    @JvmOverloads
    public MarkdownConfig(@NotNull final HeaderConfig headerConfig, @NotNull final ListConfig listConfig, @NotNull final ParagraphConfig paragraphConfig, @NotNull final TextConfig textConfig, @NotNull final BlockquoteConfig blockquoteConfig, @NotNull final InlineCodeConfig inlineCodeConfig, @NotNull final CodeBlockConfig codeBlockConfig) {
        Intrinsics.checkNotNullParameter((Object)headerConfig, "headerConfig");
        Intrinsics.checkNotNullParameter((Object)listConfig, "listConfig");
        Intrinsics.checkNotNullParameter((Object)paragraphConfig, "paragraphConfig");
        Intrinsics.checkNotNullParameter((Object)textConfig, "textConfig");
        Intrinsics.checkNotNullParameter((Object)blockquoteConfig, "blockquoteConfig");
        Intrinsics.checkNotNullParameter((Object)inlineCodeConfig, "inlineCodeConfig");
        Intrinsics.checkNotNullParameter((Object)codeBlockConfig, "codeBlockConfig");
        this(headerConfig, listConfig, paragraphConfig, textConfig, blockquoteConfig, inlineCodeConfig, codeBlockConfig, null, 128, null);
    }
    
    @JvmOverloads
    public MarkdownConfig(@NotNull final HeaderConfig headerConfig, @NotNull final ListConfig listConfig, @NotNull final ParagraphConfig paragraphConfig, @NotNull final TextConfig textConfig, @NotNull final BlockquoteConfig blockquoteConfig, @NotNull final InlineCodeConfig inlineCodeConfig) {
        Intrinsics.checkNotNullParameter((Object)headerConfig, "headerConfig");
        Intrinsics.checkNotNullParameter((Object)listConfig, "listConfig");
        Intrinsics.checkNotNullParameter((Object)paragraphConfig, "paragraphConfig");
        Intrinsics.checkNotNullParameter((Object)textConfig, "textConfig");
        Intrinsics.checkNotNullParameter((Object)blockquoteConfig, "blockquoteConfig");
        Intrinsics.checkNotNullParameter((Object)inlineCodeConfig, "inlineCodeConfig");
        this(headerConfig, listConfig, paragraphConfig, textConfig, blockquoteConfig, inlineCodeConfig, null, null, 192, null);
    }
    
    @JvmOverloads
    public MarkdownConfig(@NotNull final HeaderConfig headerConfig, @NotNull final ListConfig listConfig, @NotNull final ParagraphConfig paragraphConfig, @NotNull final TextConfig textConfig, @NotNull final BlockquoteConfig blockquoteConfig) {
        Intrinsics.checkNotNullParameter((Object)headerConfig, "headerConfig");
        Intrinsics.checkNotNullParameter((Object)listConfig, "listConfig");
        Intrinsics.checkNotNullParameter((Object)paragraphConfig, "paragraphConfig");
        Intrinsics.checkNotNullParameter((Object)textConfig, "textConfig");
        Intrinsics.checkNotNullParameter((Object)blockquoteConfig, "blockquoteConfig");
        this(headerConfig, listConfig, paragraphConfig, textConfig, blockquoteConfig, null, null, null, 224, null);
    }
    
    @JvmOverloads
    public MarkdownConfig(@NotNull final HeaderConfig headerConfig, @NotNull final ListConfig listConfig, @NotNull final ParagraphConfig paragraphConfig, @NotNull final TextConfig textConfig) {
        Intrinsics.checkNotNullParameter((Object)headerConfig, "headerConfig");
        Intrinsics.checkNotNullParameter((Object)listConfig, "listConfig");
        Intrinsics.checkNotNullParameter((Object)paragraphConfig, "paragraphConfig");
        Intrinsics.checkNotNullParameter((Object)textConfig, "textConfig");
        this(headerConfig, listConfig, paragraphConfig, textConfig, null, null, null, null, 240, null);
    }
    
    @JvmOverloads
    public MarkdownConfig(@NotNull final HeaderConfig headerConfig, @NotNull final ListConfig listConfig, @NotNull final ParagraphConfig paragraphConfig) {
        Intrinsics.checkNotNullParameter((Object)headerConfig, "headerConfig");
        Intrinsics.checkNotNullParameter((Object)listConfig, "listConfig");
        Intrinsics.checkNotNullParameter((Object)paragraphConfig, "paragraphConfig");
        this(headerConfig, listConfig, paragraphConfig, null, null, null, null, null, 248, null);
    }
    
    @JvmOverloads
    public MarkdownConfig(@NotNull final HeaderConfig headerConfig, @NotNull final ListConfig listConfig) {
        Intrinsics.checkNotNullParameter((Object)headerConfig, "headerConfig");
        Intrinsics.checkNotNullParameter((Object)listConfig, "listConfig");
        this(headerConfig, listConfig, null, null, null, null, null, null, 252, null);
    }
    
    @JvmOverloads
    public MarkdownConfig(@NotNull final HeaderConfig headerConfig) {
        Intrinsics.checkNotNullParameter((Object)headerConfig, "headerConfig");
        this(headerConfig, null, null, null, null, null, null, null, 254, null);
    }
    
    @JvmOverloads
    public MarkdownConfig() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
