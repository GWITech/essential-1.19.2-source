package gg.essential.gui.common;

import gg.essential.elementa.components.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.*;
import gg.essential.elementa.dsl.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0010
                                                   
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\b¢\u0006\u0002\u0010	B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010
                                                   B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\f¢\u0006\u0002\u0010¨\u0006\u000e""" }, d2 = { "Lgg/essential/gui/common/Spacer;", "Lgg/essential/elementa/components/UIContainer;", "width", "", "_desc", "", "(FI)V", "height", "", "(FS)V", "(FF)V", "Lgg/essential/elementa/constraints/WidthConstraint;", "Lgg/essential/elementa/constraints/HeightConstraint;", "(Lgg/essential/elementa/constraints/WidthConstraint;Lgg/essential/elementa/constraints/HeightConstraint;)V", "essential" })
public final class Spacer extends UIContainer
{
    public Spacer(@NotNull final WidthConstraint width, @NotNull final HeightConstraint height) {
        Intrinsics.checkNotNullParameter((Object)width, "width");
        Intrinsics.checkNotNullParameter((Object)height, "height");
        super();
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setWidth(width);
        $this$_init__u24lambda_u2d0.setHeight(height);
    }
    
    public Spacer(WidthConstraint width, HeightConstraint height, final int n) {
        if ((n & 0x1) != 0x0) {
            width = UtilitiesKt.getPixels(0);
        }
        if ((n & 0x2) != 0x0) {
            height = UtilitiesKt.getPixels(0);
        }
        this(width, height);
    }
    
    public Spacer(final byte b) {
        this(UtilitiesKt.getPixels(5.0f), null, 2);
        this.setX(new SiblingConstraint(0.0f, false, 3, null));
    }
    
    public Spacer(final char c) {
        this((byte)0);
    }
    
    public Spacer(final float height, final byte b) {
        this(null, UtilitiesKt.getPixels(height), 1);
        this.setY(new SiblingConstraint(0.0f, false, 3, null));
    }
    
    public Spacer(final float height) {
        this(height, (byte)0);
    }
    
    public Spacer() {
        this(null, null, 3);
    }
}
