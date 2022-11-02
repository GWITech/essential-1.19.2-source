package gg.essential.vigilance.data;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.lang.reflect.*;
import kotlin.jvm.internal.*;
import java.awt.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017" }, d2 = { "Lgg/essential/vigilance/data/PropertyType;", "", "type", "Ljava/lang/Class;", "(Ljava/lang/String;ILjava/lang/Class;)V", "getType", "()Ljava/lang/Class;", "isFieldValid", "", "field", "Ljava/lang/reflect/Field;", "SWITCH", "CHECKBOX", "TEXT", "PARAGRAPH", "PERCENT_SLIDER", "SLIDER", "DECIMAL_SLIDER", "NUMBER", "COLOR", "SELECTOR", "BUTTON", "CUSTOM", "Vigilance" })
public enum PropertyType
{
    @NotNull
    private final Class<?> type;
    
    SWITCH("SWITCH", 0, (Class<?>)Boolean.TYPE), 
    CHECKBOX("CHECKBOX", 1, (Class<?>)Boolean.TYPE), 
    TEXT("TEXT", 2, (Class<?>)String.class), 
    PARAGRAPH("PARAGRAPH", 3, (Class<?>)String.class), 
    PERCENT_SLIDER("PERCENT_SLIDER", 4, (Class<?>)Float.TYPE), 
    SLIDER("SLIDER", 5, (Class<?>)Integer.TYPE), 
    DECIMAL_SLIDER("DECIMAL_SLIDER", 6, (Class<?>)Float.TYPE), 
    NUMBER("NUMBER", 7, (Class<?>)Integer.TYPE), 
    COLOR("COLOR", 8, (Class<?>)Color.class), 
    SELECTOR("SELECTOR", 9, (Class<?>)Integer.TYPE), 
    BUTTON("BUTTON", 10, (Class<?>)Void.class), 
    CUSTOM("CUSTOM", 11);
    
    private static final /* synthetic */ PropertyType[] $VALUES;
    
    private PropertyType(final String $enum$name, final int $enum$ordinal, final Class<?> type) {
        this.type = type;
    }
    
    @NotNull
    public final Class<?> getType() {
        return this.type;
    }
    
    public boolean isFieldValid(@NotNull final Field field) {
        Intrinsics.checkNotNullParameter((Object)field, "field");
        return Intrinsics.areEqual((Object)field.getType(), (Object)this.type);
    }
    
    public static PropertyType[] values() {
        return PropertyType.$VALUES.clone();
    }
    
    public static PropertyType valueOf(final String value) {
        return Enum.valueOf(PropertyType.class, value);
    }
    
    private static final /* synthetic */ PropertyType[] $values() {
        return new PropertyType[] { PropertyType.SWITCH, PropertyType.CHECKBOX, PropertyType.TEXT, PropertyType.PARAGRAPH, PropertyType.PERCENT_SLIDER, PropertyType.SLIDER, PropertyType.DECIMAL_SLIDER, PropertyType.NUMBER, PropertyType.COLOR, PropertyType.SELECTOR, PropertyType.BUTTON, PropertyType.CUSTOM };
    }
    
    public PropertyType(final String $enum$name, final int $enum$ordinal, final Class type, final DefaultConstructorMarker $constructor_marker) {
        this($enum$name, $enum$ordinal, type);
    }
    
    static {
        $VALUES = $values();
    }
    
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
}
