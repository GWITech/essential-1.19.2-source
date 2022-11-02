package gg.essential.vigilance.data;

import gg.essential.vigilance.*;
import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import java.lang.reflect.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 C2\u00020\u0001:\u0001CB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010)\u001a\u00020\nH\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J'\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010-\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J'\u0010/\u001a\n 1*\u0004\u0018\u0001H0H0\"\u0004\b\u0000\u001002\f\u00102\u001a\b\u0012\u0004\u0012\u0002H003¢\u0006\u0002\u00104J\b\u00105\u001a\u0004\u0018\u00010\u0001J\u0006\u00106\u001a\u00020 J\u0006\u00107\u001a\u000208J\u0016\u0010'\u001a\u0002H0\"\u0006\b\u0000\u00100\u0018\u0001H\u0086\b¢\u0006\u0002\u00109J\t\u0010:\u001a\u00020;H\u00d6\u0001J\u0006\u0010<\u001a\u00020 J\u0016\u0010=\u001a\u00020\u000e2\u000e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010?J\u0010\u0010@\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\t\u0010A\u001a\u00020BH\u00d6\u0001R*\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006D" }, d2 = { "Lgg/essential/vigilance/data/PropertyData;", "", "attributesExt", "Lgg/essential/vigilance/data/PropertyAttributesExt;", "value", "Lgg/essential/vigilance/data/PropertyValue;", "instance", "Lgg/essential/vigilance/Vigilant;", "(Lgg/essential/vigilance/data/PropertyAttributesExt;Lgg/essential/vigilance/data/PropertyValue;Lgg/essential/vigilance/Vigilant;)V", "attributes", "Lgg/essential/vigilance/data/PropertyAttributes;", "(Lgg/essential/vigilance/data/PropertyAttributes;Lgg/essential/vigilance/data/PropertyValue;Lgg/essential/vigilance/Vigilant;)V", "action", "Lkotlin/Function1;", "", "getAction", "()Lkotlin/jvm/functions/Function1;", "setAction", "(Lkotlin/jvm/functions/Function1;)V", "getAttributes$annotations", "()V", "getAttributes", "()Lgg/essential/vigilance/data/PropertyAttributes;", "<set-?>", "getAttributesExt", "()Lgg/essential/vigilance/data/PropertyAttributesExt;", "dependsOn", "getDependsOn", "()Lgg/essential/vigilance/data/PropertyData;", "setDependsOn", "(Lgg/essential/vigilance/data/PropertyData;)V", "hasDependants", "", "getHasDependants", "()Z", "setHasDependants", "(Z)V", "getInstance", "()Lgg/essential/vigilance/Vigilant;", "getValue", "()Lgg/essential/vigilance/data/PropertyValue;", "component1", "component2", "component3", "copy", "equals", "other", "getAs", "T", "kotlin.jvm.PlatformType", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getAsAny", "getAsBoolean", "getDataType", "Lgg/essential/vigilance/data/PropertyType;", "()Ljava/lang/Object;", "hashCode", "", "isHidden", "setCallbackConsumer", "callback", "Ljava/util/function/Consumer;", "setValue", "toString", "", "Companion", "Vigilance" })
public final class PropertyData
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    @java.lang.Deprecated
    private final PropertyAttributes attributes;
    @NotNull
    private final PropertyValue value;
    @NotNull
    private final Vigilant instance;
    @NotNull
    private PropertyAttributesExt attributesExt;
    @Nullable
    private Function1<Object, Unit> action;
    @Nullable
    private PropertyData dependsOn;
    private boolean hasDependants;
    
    public PropertyData(@NotNull final PropertyAttributes attributes, @NotNull final PropertyValue value, @NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)attributes, "attributes");
        Intrinsics.checkNotNullParameter((Object)value, "value");
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        super();
        this.attributes = attributes;
        this.value = value;
        this.instance = instance;
        this.attributesExt = new PropertyAttributesExt(this.attributes);
    }
    
    @NotNull
    @java.lang.Deprecated
    public final PropertyAttributes getAttributes() {
        return this.attributes;
    }
    
    @Deprecated(message = "Replace with attributesExt", replaceWith = @ReplaceWith(expression = "attributesExt", imports = {}))
    @java.lang.Deprecated
    public static /* synthetic */ void getAttributes$annotations() {
    }
    
    @NotNull
    public final PropertyValue getValue() {
        return this.value;
    }
    
    @NotNull
    public final Vigilant getInstance() {
        return this.instance;
    }
    
    public PropertyData(@NotNull final PropertyAttributesExt attributesExt, @NotNull final PropertyValue value, @NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)attributesExt, "attributesExt");
        Intrinsics.checkNotNullParameter((Object)value, "value");
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        this(PropertyKt.toPropertyAttributes(attributesExt), value, instance);
        this.attributesExt = attributesExt;
    }
    
    @NotNull
    public final PropertyAttributesExt getAttributesExt() {
        return this.attributesExt;
    }
    
    @Nullable
    public final Function1<Object, Unit> getAction() {
        return this.action;
    }
    
    public final void setAction(@Nullable final Function1<Object, Unit> <set-?>) {
        this.action = <set-?>;
    }
    
    @Nullable
    public final PropertyData getDependsOn() {
        return this.dependsOn;
    }
    
    public final void setDependsOn(@Nullable final PropertyData <set-?>) {
        this.dependsOn = <set-?>;
    }
    
    public final boolean getHasDependants() {
        return this.hasDependants;
    }
    
    public final void setHasDependants(final boolean <set-?>) {
        this.hasDependants = <set-?>;
    }
    
    @NotNull
    public final PropertyType getDataType() {
        return this.attributesExt.getType();
    }
    
    public final /* synthetic */  <T> T getValue() {
        final int $i$f$getValue = 0;
        final Object value = this.getValue().getValue(this.getInstance());
        Intrinsics.reifiedOperationMarker(1, "T");
        return (T)value;
    }
    
    @Nullable
    public final Object getAsAny() {
        return this.value.getValue(this.instance);
    }
    
    public final boolean getAsBoolean() {
        final PropertyData this_$iv = this;
        final int $i$f$getValue = 0;
        final Object value = this_$iv.getValue().getValue(this_$iv.getInstance());
        if (value == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        return (boolean)value;
    }
    
    public final <T> T getAs(@NotNull final Class<T> clazz) {
        Intrinsics.checkNotNullParameter((Object)clazz, "clazz");
        return clazz.cast(this.getAsAny());
    }
    
    public final boolean isHidden() {
        boolean b;
        if (this.dependsOn == null) {
            b = false;
        }
        else {
            final PropertyData dependsOn = this.dependsOn;
            Intrinsics.checkNotNull((Object)dependsOn);
            b = !dependsOn.getAsBoolean();
        }
        return b;
    }
    
    public final void setValue(@Nullable final Object value) {
        if (value == null) {
            System.out.println((Object)("null value assigned to property " + this.attributesExt.getName() + ", but Vigilance does not support null values"));
            return;
        }
        if (this.attributesExt.getTriggerActionOnInitialization() || this.value.getInitialized()) {
            final Function1<Object, Unit> action = this.action;
            if (action != null) {
                action.invoke(value);
            }
        }
        this.value.setInitialized(true);
        this.value.setValue(value, this.instance);
        this.instance.markDirty();
    }
    
    public final void setCallbackConsumer(@NotNull final Consumer<Object> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        this.action = (Function1<Object, Unit>)new PropertyData$setCallbackConsumer.PropertyData$setCallbackConsumer$1((Object)callback);
    }
    
    @NotNull
    public final PropertyAttributes component1() {
        return this.attributes;
    }
    
    @NotNull
    public final PropertyValue component2() {
        return this.value;
    }
    
    @NotNull
    public final Vigilant component3() {
        return this.instance;
    }
    
    @NotNull
    public final PropertyData copy(@NotNull final PropertyAttributes attributes, @NotNull final PropertyValue value, @NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)attributes, "attributes");
        Intrinsics.checkNotNullParameter((Object)value, "value");
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        return new PropertyData(attributes, value, instance);
    }
    
    public static /* synthetic */ PropertyData copy$default(final PropertyData propertyData, PropertyAttributes attributes, PropertyValue value, Vigilant instance, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            attributes = propertyData.attributes;
        }
        if ((n & 0x2) != 0x0) {
            value = propertyData.value;
        }
        if ((n & 0x4) != 0x0) {
            instance = propertyData.instance;
        }
        return propertyData.copy(attributes, value, instance);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "PropertyData(attributes=" + this.attributes + ", value=" + this.value + ", instance=" + this.instance + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.attributes.hashCode();
        result = result * 31 + this.value.hashCode();
        result = result * 31 + this.instance.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PropertyData)) {
            return false;
        }
        final PropertyData propertyData = (PropertyData)other;
        return Intrinsics.areEqual((Object)this.attributes, (Object)propertyData.attributes) && Intrinsics.areEqual((Object)this.value, (Object)propertyData.value) && Intrinsics.areEqual((Object)this.instance, (Object)propertyData.instance);
    }
    
    static {
        Companion = new Companion(null);
    }
    
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
}
