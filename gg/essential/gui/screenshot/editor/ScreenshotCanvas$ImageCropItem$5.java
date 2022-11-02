package gg.essential.gui.screenshot.editor;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.*;
import gg.essential.util.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class ScreenshotCanvas$ImageCropItem$5 extends Lambda implements Function1<UIComponent, Unit> {
    public static final ScreenshotCanvas$ImageCropItem$5 INSTANCE;
    
    ScreenshotCanvas$ImageCropItem$5() {
        super(1);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseEnter) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseEnter, "$this$onMouseEnter");
        final Iterable $this$forEach$iv = $this$onMouseEnter.getChildren();
        for (final Object element$iv : $this$forEach$iv) {
            final UIComponent it = (UIComponent)element$iv;
            ExtensionsKt.animateColor$default$7bfe46b2$7cb552a(it, EssentialPalette.TEXT_HIGHLIGHT);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
    
    static {
        INSTANCE = new Function1<UIComponent, Unit>() {
            public static final ScreenshotCanvas$ImageCropItem$5 INSTANCE;
            
            ScreenshotCanvas$ImageCropItem$5() {
                super(1);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseEnter) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseEnter, "$this$onMouseEnter");
                final Iterable $this$forEach$iv = $this$onMouseEnter.getChildren();
                for (final Object element$iv : $this$forEach$iv) {
                    final UIComponent it = (UIComponent)element$iv;
                    ExtensionsKt.animateColor$default$7bfe46b2$7cb552a(it, EssentialPalette.TEXT_HIGHLIGHT);
                }
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke((UIComponent)p1);
                return Unit.INSTANCE;
            }
        };
    }
}