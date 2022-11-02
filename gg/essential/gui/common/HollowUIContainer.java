package gg.essential.gui.common;

import gg.essential.elementa.components.*;
import kotlin.*;
import gg.essential.elementa.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b""" }, d2 = { "Lgg/essential/gui/common/HollowUIContainer;", "Lgg/essential/elementa/components/UIContainer;", "()V", "isPointInside", "", "x", "", "y", "essential" })
public class HollowUIContainer extends UIContainer
{
    public HollowUIContainer() {
        super();
    }
    
    @Override
    public boolean isPointInside(final float x, final float y) {
        final Iterable $this$any$iv = this.getChildren();
        boolean b;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            b = false;
        }
        else {
            for (final Object element$iv : $this$any$iv) {
                final UIComponent it = (UIComponent)element$iv;
                if (it.isPointInside(x, y)) {
                    b = true;
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
}
