package gg.essential.lib.kbrewster.eventbus;

import kotlin.annotation.*;
import java.lang.annotation.*;
import kotlin.*;

@Retention(AnnotationRetention.RUNTIME)
@Target(allowedTargets = { AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER })
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({ ElementType.METHOD })
@Metadata(mv = { 1, 1, 16 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005" }, d2 = { "Lgg/essential/lib/kbrewster/eventbus/Subscribe;", "", "priority", "", "()I", "KeventBus" })
public @interface Subscribe {
    int priority() default 0;
}
