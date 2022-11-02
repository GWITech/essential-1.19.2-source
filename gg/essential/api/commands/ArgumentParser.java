package gg.essential.api.commands;

import kotlin.*;
import java.lang.reflect.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020	H\u0016J\u001f\u0010
                                                   \u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020	H&¢\u0006\u0002\u0010\u000b\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\f\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/api/commands/ArgumentParser;", "T", "", "complete", "", "", "arguments", "Lgg/essential/api/commands/ArgumentQueue;", "param", "Ljava/lang/reflect/Parameter;", "parse", "(Lgg/essential/api/commands/ArgumentQueue;Ljava/lang/reflect/Parameter;)Ljava/lang/Object;", "essential-api" })
public interface ArgumentParser<T>
{
    @Nullable
    T parse(@NotNull final ArgumentQueue p0, @NotNull final Parameter p1) throws Exception;
    
    @NotNull
    default List<String> complete(@NotNull final ArgumentQueue arguments, @NotNull final Parameter param) {
        Intrinsics.checkNotNullParameter((Object)arguments, "arguments");
        Intrinsics.checkNotNullParameter((Object)param, "param");
        return CollectionsKt.emptyList();
    }
}
