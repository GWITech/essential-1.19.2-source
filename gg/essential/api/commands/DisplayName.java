package gg.essential.api.commands;

import kotlin.annotation.*;
import java.lang.annotation.*;
import kotlin.*;

@Target(allowedTargets = { AnnotationTarget.VALUE_PARAMETER })
@Retention(AnnotationRetention.RUNTIME)
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({ ElementType.PARAMETER })
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u001b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/api/commands/DisplayName;", "", "value", "", "()Ljava/lang/String;", "essential-api" })
public @interface DisplayName {
    String value();
}
