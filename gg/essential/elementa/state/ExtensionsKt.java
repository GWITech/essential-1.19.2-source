package gg.essential.elementa.state;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import java.awt.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0010\u0010\u0006\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000f0\u0002\u001a\u0017\u0010\u0006\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\b0\u0002H\u0007¢\u0006\u0002\b\u0010\u001a$\u0010\u000b\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u001a)\u0010\u000b\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0002\b\u0014\u001a\u0010\u0010\u0015\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u001b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u0006\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\b0\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001b\u0010\u000b\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\b0\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016" }, d2 = { "constraint", "Lgg/essential/elementa/constraints/ConstantColorConstraint;", "Lgg/essential/elementa/state/State;", "Ljava/awt/Color;", "getConstraint", "(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;", "percent", "Lgg/essential/elementa/constraints/RelativeConstraint;", "", "getPercent", "(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/RelativeConstraint;", "pixels", "Lgg/essential/elementa/constraints/PixelConstraint;", "getPixels", "(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/PixelConstraint;", "", "percentNumber", "alignOpposite", "", "alignOutside", "pixelsNumber", "toConstraint", "Elementa" })
public final class ExtensionsKt
{
    @NotNull
    public static final PixelConstraint pixels(@NotNull final State<Float> $this$pixels, final boolean alignOpposite, final boolean alignOutside) {
        Intrinsics.checkNotNullParameter((Object)$this$pixels, "<this>");
        return new PixelConstraint(0.0f, alignOpposite, alignOutside).bindValue($this$pixels);
    }
    
    public static /* synthetic */ PixelConstraint pixels$default(final State $this$pixels, boolean alignOpposite, boolean alignOutside, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            alignOpposite = false;
        }
        if ((n & 0x2) != 0x0) {
            alignOutside = false;
        }
        return pixels($this$pixels, alignOpposite, alignOutside);
    }
    
    @JvmName(name = "pixelsNumber")
    @NotNull
    public static final PixelConstraint pixelsNumber(@NotNull final State<Number> $this$pixels, final boolean alignOpposite, final boolean alignOutside) {
        Intrinsics.checkNotNullParameter((Object)$this$pixels, "<this>");
        return new PixelConstraint(0.0f, alignOpposite, alignOutside).bindValue((State<Float>)$this$pixels.map((kotlin.jvm.functions.Function1<? super Number, ?>)ExtensionsKt$pixels.ExtensionsKt$pixels$1.INSTANCE));
    }
    
    public static /* synthetic */ PixelConstraint pixelsNumber$default(final State $this$pixels, boolean alignOpposite, final boolean alignOutside, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            alignOpposite = false;
        }
        return pixelsNumber($this$pixels, alignOpposite, alignOutside);
    }
    
    @NotNull
    public static final PixelConstraint getPixels(@NotNull final State<Number> $this$pixels) {
        Intrinsics.checkNotNullParameter((Object)$this$pixels, "<this>");
        return pixelsNumber($this$pixels, false, false);
    }
    
    @NotNull
    public static final RelativeConstraint percent(@NotNull final State<Float> $this$percent) {
        Intrinsics.checkNotNullParameter((Object)$this$percent, "<this>");
        return new RelativeConstraint(0.0f, 1, null).bindValue($this$percent);
    }
    
    @JvmName(name = "percentNumber")
    @NotNull
    public static final RelativeConstraint percentNumber(@NotNull final State<Number> $this$percent) {
        Intrinsics.checkNotNullParameter((Object)$this$percent, "<this>");
        return new RelativeConstraint(0.0f, 1, null).bindValue((State<Float>)$this$percent.map((kotlin.jvm.functions.Function1<? super Number, ?>)ExtensionsKt$percent.ExtensionsKt$percent$1.INSTANCE));
    }
    
    @NotNull
    public static final RelativeConstraint getPercent(@NotNull final State<Number> $this$percent) {
        Intrinsics.checkNotNullParameter((Object)$this$percent, "<this>");
        return percentNumber($this$percent);
    }
    
    @NotNull
    public static final ConstantColorConstraint toConstraint(@NotNull final State<Color> $this$toConstraint) {
        Intrinsics.checkNotNullParameter((Object)$this$toConstraint, "<this>");
        return new ConstantColorConstraint($this$toConstraint.get()).bindColor($this$toConstraint);
    }
    
    @NotNull
    public static final ConstantColorConstraint getConstraint(@NotNull final State<Color> $this$constraint) {
        Intrinsics.checkNotNullParameter((Object)$this$constraint, "<this>");
        return toConstraint($this$constraint);
    }
}
