package gg.essential.elementa.dsl;

import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.awt.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u001a)\u0010\t\u001a\u00020\n2!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000b0\u0003\u001a)\u0010\f\u001a\u00020\r2!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000b0\u0003\u001a)\u0010\u000e\u001a\u00020\n2!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000b0\u0003\u001a)\u0010\u000f\u001a\u00020\u00102!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000b0\u0003\u001a)\u0010\u0011\u001a\u00020\u00122!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000b0\u0003\u001a)\u0010\u0013\u001a\u00020\u00142!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000b0\u0003¨\u0006\u0015" }, d2 = { "basicColorConstraint", "Lgg/essential/elementa/constraints/ColorConstraint;", "calculator", "Lkotlin/Function1;", "Lgg/essential/elementa/UIComponent;", "Lkotlin/ParameterName;", "name", "component", "Ljava/awt/Color;", "basicHeightConstraint", "Lgg/essential/elementa/constraints/HeightConstraint;", "", "basicRadiusConstraint", "Lgg/essential/elementa/constraints/RadiusConstraint;", "basicTextScaleConstraint", "basicWidthConstraint", "Lgg/essential/elementa/constraints/WidthConstraint;", "basicXConstraint", "Lgg/essential/elementa/constraints/XConstraint;", "basicYConstraint", "Lgg/essential/elementa/constraints/YConstraint;", "Elementa" })
public final class BasicConstraintsKt
{
    @NotNull
    public static final XConstraint basicXConstraint(@NotNull final Function1<? super UIComponent, Float> calculator) {
        Intrinsics.checkNotNullParameter((Object)calculator, "calculator");
        return (XConstraint)new BasicConstraintsKt$basicXConstraint.BasicConstraintsKt$basicXConstraint$1((Function1)calculator);
    }
    
    @NotNull
    public static final YConstraint basicYConstraint(@NotNull final Function1<? super UIComponent, Float> calculator) {
        Intrinsics.checkNotNullParameter((Object)calculator, "calculator");
        return (YConstraint)new BasicConstraintsKt$basicYConstraint.BasicConstraintsKt$basicYConstraint$1((Function1)calculator);
    }
    
    @NotNull
    public static final WidthConstraint basicWidthConstraint(@NotNull final Function1<? super UIComponent, Float> calculator) {
        Intrinsics.checkNotNullParameter((Object)calculator, "calculator");
        return (WidthConstraint)new BasicConstraintsKt$basicWidthConstraint.BasicConstraintsKt$basicWidthConstraint$1((Function1)calculator);
    }
    
    @NotNull
    public static final HeightConstraint basicHeightConstraint(@NotNull final Function1<? super UIComponent, Float> calculator) {
        Intrinsics.checkNotNullParameter((Object)calculator, "calculator");
        return (HeightConstraint)new BasicConstraintsKt$basicHeightConstraint.BasicConstraintsKt$basicHeightConstraint$1((Function1)calculator);
    }
    
    @NotNull
    public static final RadiusConstraint basicRadiusConstraint(@NotNull final Function1<? super UIComponent, Float> calculator) {
        Intrinsics.checkNotNullParameter((Object)calculator, "calculator");
        return (RadiusConstraint)new BasicConstraintsKt$basicRadiusConstraint.BasicConstraintsKt$basicRadiusConstraint$1((Function1)calculator);
    }
    
    @NotNull
    public static final HeightConstraint basicTextScaleConstraint(@NotNull final Function1<? super UIComponent, Float> calculator) {
        Intrinsics.checkNotNullParameter((Object)calculator, "calculator");
        return basicHeightConstraint(calculator);
    }
    
    @NotNull
    public static final ColorConstraint basicColorConstraint(@NotNull final Function1<? super UIComponent, ? extends Color> calculator) {
        Intrinsics.checkNotNullParameter((Object)calculator, "calculator");
        return (ColorConstraint)new BasicConstraintsKt$basicColorConstraint.BasicConstraintsKt$basicColorConstraint$1((Function1)calculator, Color.WHITE);
    }
}
