package gg.essential.lib.mixinextras.injector;

import java.lang.annotation.*;
import org.spongepowered.asm.mixin.injection.*;

@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ModifyReturnValue {
    String[] method();
    
    At[] at();
    
    Slice[] slice() default {};
    
    boolean remap() default true;
    
    int require() default -1;
    
    int expect() default 1;
    
    int allow() default -1;
}
