package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIConstraints;", "it", "Lgg/essential/gui/common/IconButton$Dimension;", "invoke" })
static final class IconButton$1 extends Lambda implements Function2<UIConstraints, Dimension, Unit> {
    public static final IconButton$1 INSTANCE;
    
    IconButton$1() {
        super(2);
    }
    
    public final void invoke(@NotNull final UIConstraints $this$bindConstraints, @NotNull final Dimension it) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it instanceof Dimension.FitWithPadding) {
            $this$bindConstraints.setWidth(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(10.0f)));
            $this$bindConstraints.setHeight(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(10.0f)));
        }
        else if (it instanceof final Dimension.Fixed fixed) {
            $this$bindConstraints.setWidth(UtilitiesKt.getPixels(fixed.getWidth()));
            $this$bindConstraints.setHeight(UtilitiesKt.getPixels(((Dimension.Fixed)it).getHeight()));
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIConstraints)p1, (Dimension)p2);
        return Unit.INSTANCE;
    }
    
    static {
        INSTANCE = new Function2<UIConstraints, Dimension, Unit>() {
            public static final IconButton$1 INSTANCE;
            
            IconButton$1() {
                super(2);
            }
            
            public final void invoke(@NotNull final UIConstraints $this$bindConstraints, @NotNull final Dimension it) {
                Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "$this$bindConstraints");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                if (it instanceof Dimension.FitWithPadding) {
                    $this$bindConstraints.setWidth(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(10.0f)));
                    $this$bindConstraints.setHeight(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(10.0f)));
                }
                else if (it instanceof final Dimension.Fixed fixed2) {
                    $this$bindConstraints.setWidth(UtilitiesKt.getPixels(fixed2.getWidth()));
                    $this$bindConstraints.setHeight(UtilitiesKt.getPixels(((Dimension.Fixed)it).getHeight()));
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIConstraints)p1, (Dimension)p2);
                return Unit.INSTANCE;
            }
        };
    }
}