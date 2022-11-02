package gg.essential.commands.brigadier;

import com.mojang.brigadier.arguments.*;
import java.lang.reflect.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.commands.engine.*;
import gg.essential.api.commands.*;
import com.mojang.brigadier.*;
import com.mojang.brigadier.exceptions.*;
import kotlin.*;
import gg.essential.util.*;
import net.minecraft.text.*;
import com.mojang.brigadier.context.*;
import java.util.concurrent.*;
import com.mojang.brigadier.suggestion.*;
import gg.essential.commands.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000<
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020
                                                   0	"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0013""" }, d2 = { "Lgg/essential/commands/brigadier/EssentialBrigadierArgument;", "Lcom/mojang/brigadier/arguments/ArgumentType;", "", "parameter", "Ljava/lang/reflect/Parameter;", "kParameter", "Lkotlin/reflect/KParameter;", "(Ljava/lang/reflect/Parameter;Lkotlin/reflect/KParameter;)V", "listSuggestions", "Ljava/util/concurrent/CompletableFuture;", "Lcom/mojang/brigadier/suggestion/Suggestions;", "S", "context", "Lcom/mojang/brigadier/context/CommandContext;", "builder", "Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;", "parse", "reader", "Lcom/mojang/brigadier/StringReader;", "essential" })
public final class EssentialBrigadierArgument implements ArgumentType<Object>
{
    @NotNull
    private final Parameter parameter;
    @Nullable
    private final KParameter kParameter;
    
    public EssentialBrigadierArgument(@NotNull final Parameter parameter, @Nullable final KParameter kParameter) {
        Intrinsics.checkNotNullParameter((Object)parameter, "parameter");
        super();
        this.parameter = parameter;
        this.kParameter = kParameter;
    }
    
    @Nullable
    public Object parse(@NotNull final StringReader reader) {
        Intrinsics.checkNotNullParameter((Object)reader, "reader");
        final Try<Object> parameter$essential;
        final Try this_$iv = parameter$essential = CommandParser.INSTANCE.parseParameter$essential(this.parameter, this.kParameter, (ArgumentQueue)new StringReaderArgumentQueue(reader));
        if (parameter$essential instanceof Failure) {
            final MutableText message = HelpersKt.textLiteral("Invalid argument for type " + this.parameter.getType().getSimpleName());
            throw new CommandSyntaxException((CommandExceptionType)new SimpleCommandExceptionType((Message)message), (Message)message, reader.getString(), reader.getCursor());
        }
        if (parameter$essential instanceof Success) {
            return ((Success)this_$iv).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }
    
    @NotNull
    public <S> CompletableFuture<Suggestions> listSuggestions(@NotNull final CommandContext<S> context, @NotNull final SuggestionsBuilder builder) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        Intrinsics.checkNotNullParameter((Object)builder, "builder");
        final EssentialCommandRegistry instance = EssentialCommandRegistry.INSTANCE;
        final String input = builder.getInput();
        Intrinsics.checkNotNullExpressionValue((Object)input, "builder.input");
        final Object[] $this$forEach$iv = instance.getCompletionOptions(input);
        for (int i = 0; i < $this$forEach$iv.length; ++i) {
            final String it;
            final Object element$iv = it = (String)$this$forEach$iv[i];
            builder.suggest(it);
        }
        final CompletableFuture buildFuture = builder.buildFuture();
        Intrinsics.checkNotNullExpressionValue((Object)buildFuture, "builder.buildFuture()");
        return buildFuture;
    }
}
