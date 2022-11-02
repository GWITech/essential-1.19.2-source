package gg.essential.vigilance.data;

import kotlin.*;
import gg.essential.vigilance.*;
import java.lang.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nJ \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\n¨\u0006\u0012" }, d2 = { "Lgg/essential/vigilance/data/PropertyData$Companion;", "", "()V", "fromField", "Lgg/essential/vigilance/data/PropertyData;", "property", "Lgg/essential/vigilance/data/Property;", "field", "Ljava/lang/reflect/Field;", "instance", "Lgg/essential/vigilance/Vigilant;", "propertyAttributes", "Lgg/essential/vigilance/data/PropertyAttributes;", "fromMethod", "method", "Ljava/lang/reflect/Method;", "withValue", "obj", "Vigilance" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final PropertyData fromField(@NotNull final Property property, @NotNull final Field field, @NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        Intrinsics.checkNotNullParameter((Object)field, "field");
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        return new PropertyData(PropertyAttributesExt.Companion.fromPropertyAnnotation(property), new FieldBackedPropertyValue(field), instance);
    }
    
    @NotNull
    public final PropertyData fromField(@NotNull final PropertyAttributes propertyAttributes, @NotNull final Field field, @NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)propertyAttributes, "propertyAttributes");
        Intrinsics.checkNotNullParameter((Object)field, "field");
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        return new PropertyData(propertyAttributes, new FieldBackedPropertyValue(field), instance);
    }
    
    @NotNull
    public final PropertyData fromMethod(@NotNull final Property property, @NotNull final Method method, @NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        Intrinsics.checkNotNullParameter((Object)method, "method");
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        return new PropertyData(PropertyAttributesExt.Companion.fromPropertyAnnotation(property), new MethodBackedPropertyValue(method), instance);
    }
    
    @NotNull
    public final PropertyData withValue(@NotNull final Property property, @Nullable final Object obj, @NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        return new PropertyData(PropertyAttributesExt.Companion.fromPropertyAnnotation(property), (PropertyValue)new ValueBackedPropertyValue(obj), instance);
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
