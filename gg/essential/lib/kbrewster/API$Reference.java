package gg.essential.lib.kbrewster;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Reference {
    String apiName();
    
    String apiVersion();
}
