package gg.essential.commands.engine;

import kotlin.*;
import gg.essential.api.commands.*;
import org.jetbrains.annotations.*;
import java.lang.reflect.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001e
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010	¨\u0006
                                                   """ }, d2 = { "Lgg/essential/commands/engine/DoubleArgumentParser;", "Lgg/essential/api/commands/ArgumentParser;", "", "()V", "parse", "arguments", "Lgg/essential/api/commands/ArgumentQueue;", "param", "Ljava/lang/reflect/Parameter;", "(Lgg/essential/api/commands/ArgumentQueue;Ljava/lang/reflect/Parameter;)Ljava/lang/Double;", "essential" })
public final class DoubleArgumentParser implements ArgumentParser<Double>
{
    public DoubleArgumentParser() {
        super();
    }
    
    @NotNull
    @Override
    public Double parse(@NotNull final ArgumentQueue arguments, @NotNull final Parameter param) {
        Intrinsics.checkNotNullParameter((Object)arguments, "arguments");
        Intrinsics.checkNotNullParameter((Object)param, "param");
        return Double.parseDouble(arguments.poll());
    }
    
    @Override
    public /* bridge */ Object parse(final ArgumentQueue arguments, final Parameter param) {
        return this.parse(arguments, param);
    }
}
