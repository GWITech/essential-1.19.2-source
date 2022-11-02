package gg.essential.vigilance.data;

import kotlin.*;
import gg.essential.vigilance.*;
import kotlin.jvm.internal.*;
import java.util.*;
import org.jetbrains.annotations.*;
import java.lang.reflect.*;
import kotlin.reflect.*;
import kotlin.reflect.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000b\u001a\u00020\fH$J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0011J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015" }, d2 = { "Lgg/essential/vigilance/data/PropertyCollector;", "", "()V", "collectedProperties", "", "Lgg/essential/vigilance/data/PropertyData;", "addProperty", "", "propertyData", "collectProperties", "", "instance", "Lgg/essential/vigilance/Vigilant;", "getProperties", "getProperty", "field", "Ljava/lang/reflect/Field;", "getProperty$Vigilance", "propertyName", "", "initialize", "Vigilance" })
public abstract class PropertyCollector
{
    @NotNull
    private final List<PropertyData> collectedProperties;
    
    public PropertyCollector() {
        super();
        this.collectedProperties = new ArrayList<PropertyData>();
    }
    
    public final void initialize(@NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        this.collectedProperties.addAll(this.collectProperties(instance));
    }
    
    @NotNull
    protected abstract List<PropertyData> collectProperties(@NotNull final Vigilant p0);
    
    @NotNull
    public final List<PropertyData> getProperties() {
        return this.collectedProperties;
    }
    
    public final void addProperty(@NotNull final PropertyData propertyData) {
        Intrinsics.checkNotNullParameter((Object)propertyData, "propertyData");
        this.collectedProperties.add(propertyData);
    }
    
    @Nullable
    public final PropertyData getProperty$Vigilance(@NotNull final String propertyName) {
        Intrinsics.checkNotNullParameter((Object)propertyName, "propertyName");
        final Iterable $this$firstOrNull$iv = this.collectedProperties;
        final int $i$f$firstOrNull = 0;
        for (final Object element$iv : $this$firstOrNull$iv) {
            final PropertyData it = (PropertyData)element$iv;
            final int n = 0;
            if ((it.getValue() instanceof FieldBackedPropertyValue && Intrinsics.areEqual((Object)((FieldBackedPropertyValue)it.getValue()).getField$Vigilance().getName(), (Object)propertyName)) || (it.getValue() instanceof KPropertyBackedPropertyValue && Intrinsics.areEqual((Object)((KPropertyBackedPropertyValue)it.getValue()).getProperty$Vigilance().getName(), (Object)propertyName)) || (it.getValue() instanceof MethodBackedPropertyValue && Intrinsics.areEqual((Object)((MethodBackedPropertyValue)it.getValue()).getMethod$Vigilance().getName(), (Object)propertyName))) {
                final Object o = element$iv;
                return (PropertyData)o;
            }
        }
        final Object o = null;
        return (PropertyData)o;
    }
    
    @Nullable
    public final PropertyData getProperty$Vigilance(@NotNull final Field field) {
        Intrinsics.checkNotNullParameter((Object)field, "field");
        final Iterable $this$firstOrNull$iv = this.collectedProperties;
        final int $i$f$firstOrNull = 0;
        for (final Object element$iv : $this$firstOrNull$iv) {
            final PropertyData it = (PropertyData)element$iv;
            final int n = 0;
            if ((it.getValue() instanceof FieldBackedPropertyValue && Intrinsics.areEqual((Object)((FieldBackedPropertyValue)it.getValue()).getField$Vigilance(), (Object)field)) || (it.getValue() instanceof KPropertyBackedPropertyValue && Intrinsics.areEqual((Object)ReflectJvmMapping.getJavaField((KProperty)((KPropertyBackedPropertyValue)it.getValue()).getProperty$Vigilance()), (Object)field))) {
                final Object o = element$iv;
                return (PropertyData)o;
            }
        }
        final Object o = null;
        return (PropertyData)o;
    }
}
