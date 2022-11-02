package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/constraints/PaddingConstraint;", "", "getHorizontalPadding", "", "component", "Lgg/essential/elementa/UIComponent;", "getVerticalPadding", "Elementa" })
public interface PaddingConstraint
{
    float getVerticalPadding(@NotNull final UIComponent p0);
    
    float getHorizontalPadding(@NotNull final UIComponent p0);
}
