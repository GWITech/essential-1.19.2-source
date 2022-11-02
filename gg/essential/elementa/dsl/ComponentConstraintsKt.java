package gg.essential.elementa.dsl;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;
import java.awt.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u000f" }, d2 = { "componentColorConstraint", "Lgg/essential/elementa/constraints/ColorConstraint;", "boundComponent", "Lgg/essential/elementa/UIComponent;", "componentHeightConstraint", "Lgg/essential/elementa/constraints/HeightConstraint;", "componentRadiusConstraint", "Lgg/essential/elementa/constraints/RadiusConstraint;", "componentTextScaleConstraint", "componentWidthConstraint", "Lgg/essential/elementa/constraints/WidthConstraint;", "componentXConstraint", "Lgg/essential/elementa/constraints/XConstraint;", "componentYConstraint", "Lgg/essential/elementa/constraints/YConstraint;", "Elementa" })
public final class ComponentConstraintsKt
{
    @NotNull
    public static final XConstraint componentXConstraint(@NotNull final UIComponent boundComponent) {
        Intrinsics.checkNotNullParameter((Object)boundComponent, "boundComponent");
        return (XConstraint)new ComponentConstraintsKt$componentXConstraint.ComponentConstraintsKt$componentXConstraint$1(boundComponent);
    }
    
    @NotNull
    public static final YConstraint componentYConstraint(@NotNull final UIComponent boundComponent) {
        Intrinsics.checkNotNullParameter((Object)boundComponent, "boundComponent");
        return (YConstraint)new ComponentConstraintsKt$componentYConstraint.ComponentConstraintsKt$componentYConstraint$1(boundComponent);
    }
    
    @NotNull
    public static final WidthConstraint componentWidthConstraint(@NotNull final UIComponent boundComponent) {
        Intrinsics.checkNotNullParameter((Object)boundComponent, "boundComponent");
        return (WidthConstraint)new ComponentConstraintsKt$componentWidthConstraint.ComponentConstraintsKt$componentWidthConstraint$1(boundComponent);
    }
    
    @NotNull
    public static final HeightConstraint componentHeightConstraint(@NotNull final UIComponent boundComponent) {
        Intrinsics.checkNotNullParameter((Object)boundComponent, "boundComponent");
        return (HeightConstraint)new ComponentConstraintsKt$componentHeightConstraint.ComponentConstraintsKt$componentHeightConstraint$1(boundComponent);
    }
    
    @NotNull
    public static final RadiusConstraint componentRadiusConstraint(@NotNull final UIComponent boundComponent) {
        Intrinsics.checkNotNullParameter((Object)boundComponent, "boundComponent");
        return (RadiusConstraint)new ComponentConstraintsKt$componentRadiusConstraint.ComponentConstraintsKt$componentRadiusConstraint$1(boundComponent);
    }
    
    @NotNull
    public static final HeightConstraint componentTextScaleConstraint(@NotNull final UIComponent boundComponent) {
        Intrinsics.checkNotNullParameter((Object)boundComponent, "boundComponent");
        return componentHeightConstraint(boundComponent);
    }
    
    @NotNull
    public static final ColorConstraint componentColorConstraint(@NotNull final UIComponent boundComponent) {
        Intrinsics.checkNotNullParameter((Object)boundComponent, "boundComponent");
        return (ColorConstraint)new ComponentConstraintsKt$componentColorConstraint.ComponentConstraintsKt$componentColorConstraint$1(boundComponent, Color.WHITE);
    }
}
