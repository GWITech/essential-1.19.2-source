package gg.essential.vigilance.data;

import org.jetbrains.annotations.*;
import kotlin.collections.*;
import java.util.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007" }, d2 = { "Lgg/essential/vigilance/data/PropertyAttributes$Companion;", "", "()V", "fromPropertyAnnotation", "Lgg/essential/vigilance/data/PropertyAttributes;", "property", "Lgg/essential/vigilance/data/Property;", "Vigilance" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @Deprecated(message = "Use PropertyAttributesExt instead", replaceWith = @ReplaceWith(expression = "PropertyAttributesExt.fromPropertyAnnotation", imports = { "gg.essential.vigilance.data.Property.PropertyAttributesExt.fromPropertyAnnotation" }))
    @NotNull
    @java.lang.Deprecated
    public final PropertyAttributes fromPropertyAnnotation(@NotNull final Property property) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        return new PropertyAttributes(property.type(), property.name(), property.category(), property.subcategory(), property.description(), property.min(), property.max(), property.minF(), property.maxF(), property.decimalPlaces(), property.increment(), ArraysKt.toList((Object[])property.options()), property.allowAlpha(), property.placeholder(), property.protectedText(), property.triggerActionOnInitialization(), property.hidden());
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
