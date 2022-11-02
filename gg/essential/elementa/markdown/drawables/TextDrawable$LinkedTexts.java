package gg.essential.elementa.markdown.drawables;

import kotlin.*;
import java.util.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r" }, d2 = { "Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;", "", "()V", "texts", "", "Lgg/essential/elementa/markdown/drawables/TextDrawable;", "isHovered", "", "linkText", "", "text", "unlinkText", "Companion", "Elementa" })
public static final class LinkedTexts
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Set<TextDrawable> texts;
    
    public LinkedTexts() {
        super();
        this.texts = new LinkedHashSet<TextDrawable>();
    }
    
    public final boolean isHovered() {
        final Iterable $this$any$iv = this.texts;
        final int $i$f$any = 0;
        boolean b;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            b = false;
        }
        else {
            for (final Object element$iv : $this$any$iv) {
                final TextDrawable it = (TextDrawable)element$iv;
                final int n = 0;
                if (TextDrawable.access$isHovered$p(it)) {
                    b = true;
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    public final void linkText(@NotNull final TextDrawable text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this.texts.add(text);
    }
    
    public final void unlinkText(@NotNull final TextDrawable text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this.texts.remove(text);
    }
    
    public static final /* synthetic */ Set access$getTexts$p(final LinkedTexts $this) {
        return $this.texts;
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¨\u0006\u0007" }, d2 = { "Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts$Companion;", "", "()V", "merge", "Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;", "linked1", "linked2", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final LinkedTexts merge(@Nullable final LinkedTexts linked1, @Nullable final LinkedTexts linked2) {
            LinkedTexts linkedTexts;
            if (linked1 == null && linked2 == null) {
                linkedTexts = new LinkedTexts();
            }
            else if (linked1 == null) {
                linkedTexts = linked2;
                Intrinsics.checkNotNull((Object)linked2);
            }
            else if (linked2 == null) {
                linkedTexts = linked1;
            }
            else {
                final Iterable $this$forEach$iv = LinkedTexts.access$getTexts$p(linked2);
                final int $i$f$forEach = 0;
                for (final Object element$iv : $this$forEach$iv) {
                    final TextDrawable it = (TextDrawable)element$iv;
                    final int n = 0;
                    linked1.linkText(it);
                }
                linkedTexts = linked1;
            }
            return linkedTexts;
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
