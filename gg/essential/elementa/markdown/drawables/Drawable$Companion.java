package gg.essential.elementa.markdown.drawables;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.collections.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¨\u0006\u000b" }, d2 = { "Lgg/essential/elementa/markdown/drawables/Drawable$Companion;", "", "()V", "trim", "", "drawable", "Lgg/essential/elementa/markdown/drawables/Drawable;", "drawableList", "Lgg/essential/elementa/markdown/drawables/DrawableList;", "drawables", "", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    public final void trim(@NotNull final DrawableList drawableList) {
        Intrinsics.checkNotNullParameter((Object)drawableList, "drawableList");
        this.trim((List<? extends Drawable>)drawableList);
    }
    
    public final void trim(@NotNull final List<? extends Drawable> drawables) {
        Intrinsics.checkNotNullParameter((Object)drawables, "drawables");
        final Drawable drawable = (Drawable)CollectionsKt.firstOrNull((List)drawables);
        if (drawable != null) {
            final Drawable it = drawable;
            final int n = 0;
            it.setInsertSpaceBefore(false);
        }
        final Drawable drawable2 = (Drawable)CollectionsKt.lastOrNull((List)drawables);
        if (drawable2 != null) {
            final Drawable it = drawable2;
            final int n2 = 0;
            it.setInsertSpaceAfter(false);
        }
    }
    
    public final void trim(@NotNull final Drawable drawable) {
        Intrinsics.checkNotNullParameter((Object)drawable, "drawable");
        if (drawable instanceof DrawableList) {
            ((Drawable)CollectionsKt.first((List)drawable)).setInsertSpaceBefore(false);
            ((Drawable)CollectionsKt.last((List)drawable)).setInsertSpaceAfter(false);
        }
        else {
            drawable.setInsertSpaceBefore(false);
            drawable.setInsertSpaceAfter(false);
        }
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
