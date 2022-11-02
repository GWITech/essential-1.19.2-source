package gg.essential.vigilance.data;

import kotlin.annotation.*;
import java.lang.annotation.*;
import kotlin.*;

@Retention(AnnotationRetention.RUNTIME)
@Target(allowedTargets = { AnnotationTarget.FIELD, AnnotationTarget.FUNCTION })
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({ ElementType.FIELD, ElementType.METHOD })
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u00ea\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0017\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001eR\u000f\u0010\u0016\u001a\u00020\u0017¢\u0006\u0006\u001a\u0004\b\u0016\u0010 R\u000f\u0010\u0007\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010!R\u0017\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e¢\u0006\u0006\u001a\u0004\b\u001d\u0010\"R\u000f\u0010\u0012\u001a\u00020\r¢\u0006\u0006\u001a\u0004\b\u0012\u0010#R\u000f\u0010\u000b\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010!R\u000f\u0010\u001b\u001a\u00020\u0017¢\u0006\u0006\u001a\u0004\b\u001b\u0010 R\u000f\u0010\b\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010!R\u000f\u0010\u0006\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010!R\u000f\u0010\n\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010!R\u000f\u0010\u0013\u001a\u00020\r¢\u0006\u0006\u001a\u0004\b\u0013\u0010#R\u000f\u0010\u000e\u001a\u00020\r¢\u0006\u0006\u001a\u0004\b\u000e\u0010#R\u000f\u0010\u0011\u001a\u00020\u0010¢\u0006\u0006\u001a\u0004\b\u0011\u0010$R\u000f\u0010\f\u001a\u00020\r¢\u0006\u0006\u001a\u0004\b\f\u0010#R\u000f\u0010\u000f\u001a\u00020\u0010¢\u0006\u0006\u001a\u0004\b\u000f\u0010$R\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010!R\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0006\u001a\u0004\b\u0014\u0010%R\u000f\u0010\u0018\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010!R\u000f\u0010\u0019\u001a\u00020\u0017¢\u0006\u0006\u001a\u0004\b\u0019\u0010 R\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0006\u001a\u0004\b\u001c\u0010%R\u000f\u0010\t\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010!R\u000f\u0010\u001a\u001a\u00020\u0017¢\u0006\u0006\u001a\u0004\b\u001a\u0010 R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010&¨\u0006'" }, d2 = { "Lgg/essential/vigilance/data/Property;", "", "type", "Lgg/essential/vigilance/data/PropertyType;", "name", "", "i18nName", "category", "i18nCategory", "subcategory", "i18nSubcategory", "description", "min", "", "max", "minF", "", "maxF", "decimalPlaces", "increment", "options", "", "allowAlpha", "", "placeholder", "protectedText", "triggerActionOnInitialization", "hidden", "searchTags", "customPropertyInfo", "Lkotlin/reflect/KClass;", "Lgg/essential/vigilance/data/PropertyInfo;", "()Z", "()Ljava/lang/String;", "()Ljava/lang/Class;", "()I", "()F", "()[Ljava/lang/String;", "()Lgg/essential/vigilance/data/PropertyType;", "Vigilance" })
public @interface Property {
    PropertyType type();
    
    String name();
    
    String i18nName() default "";
    
    String category();
    
    String i18nCategory() default "";
    
    String subcategory() default "";
    
    String i18nSubcategory() default "";
    
    String description() default "";
    
    int min() default 0;
    
    int max() default 0;
    
    float minF() default 0.0f;
    
    float maxF() default 0.0f;
    
    int decimalPlaces() default 1;
    
    int increment() default 1;
    
    String[] options() default {};
    
    boolean allowAlpha() default true;
    
    String placeholder() default "";
    
    boolean protectedText() default false;
    
    boolean triggerActionOnInitialization() default true;
    
    boolean hidden() default false;
    
    String[] searchTags() default {};
    
    Class<? extends PropertyInfo> customPropertyInfo() default Void.class;
}
