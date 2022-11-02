package gg.essential.api.commands;

import kotlin.annotation.*;
import java.lang.annotation.*;
import kotlin.*;

@Target(allowedTargets = { AnnotationTarget.FUNCTION })
@Retention(AnnotationRetention.RUNTIME)
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({ ElementType.METHOD })
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u001b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u0011
                                                   \u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B"\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003R\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007R\u000f\u0010\u0006\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\b¨\u0006	""" }, d2 = { "Lgg/essential/api/commands/SubCommand;", "", "value", "", "aliases", "", "description", "()[Ljava/lang/String;", "()Ljava/lang/String;", "essential-api" })
public @interface SubCommand {
    String value();
    
    String[] aliases() default {};
    
    String description() default "";
}
