package gg.essential.vigilance.data;

import kotlin.*;
import java.lang.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006" }, d2 = { "Lgg/essential/vigilance/data/PropertyType$CUSTOM;", "Lgg/essential/vigilance/data/PropertyType;", "isFieldValid", "", "field", "Ljava/lang/reflect/Field;", "Vigilance" })
static final class CUSTOM extends PropertyType
{
    CUSTOM(final String $enum$name, final int $enum$ordinal) {
        super($enum$name, $enum$ordinal, Object.class, null);
    }
    
    @Override
    public boolean isFieldValid(@NotNull final Field field) {
        Intrinsics.checkNotNullParameter((Object)field, "field");
        final Property propertyAnnotation = field.getAnnotation(Property.class);
        return !Intrinsics.areEqual((Object)propertyAnnotation.customPropertyInfo(), (Object)Void.class);
    }
}
