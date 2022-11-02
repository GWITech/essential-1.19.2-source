package gg.essential.commands.engine;

import kotlin.*;
import java.lang.reflect.*;
import kotlin.jvm.internal.*;
import java.lang.annotation.*;
import gg.essential.api.commands.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.collections.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020	H\u0016J$\u0010
                                                   \u001a\u00020\u00022
                                                   \u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020	H\u0016J$\u0010\u0010\u001a\u00020\u00022
                                                   \u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J,\u0010\u0011\u001a\u00020\u00022
                                                   \u0010\u000b\u001a\u00060\fj\u0002`2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0013""" }, d2 = { "Lgg/essential/commands/engine/StringArgumentParser;", "Lgg/essential/api/commands/ArgumentParser;", "", "()V", "complete", "", "arguments", "Lgg/essential/api/commands/ArgumentQueue;", "param", "Ljava/lang/reflect/Parameter;", "greedy", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "wordOne", "parse", "quotable", "take", "Lgg/essential/api/commands/Take;", "essential" })
public final class StringArgumentParser implements ArgumentParser<String>
{
    public StringArgumentParser() {
        super();
    }
    
    @Nullable
    @Override
    public String parse(@NotNull final ArgumentQueue arguments, @NotNull final Parameter param) {
        Intrinsics.checkNotNullParameter((Object)arguments, "arguments");
        Intrinsics.checkNotNullParameter((Object)param, "param");
        final Annotation[] annotations = param.getAnnotations();
        Intrinsics.checkNotNullExpressionValue((Object)annotations, "param.annotations");
        if (annotations.length == 0) {
            return arguments.poll();
        }
        final StringBuilder sb = new StringBuilder();
        final String wordOne = arguments.poll();
        final Annotation[] annotations2 = param.getAnnotations();
        Intrinsics.checkNotNullExpressionValue((Object)annotations2, "param.annotations");
        final Object[] $this$firstOrNull$iv = annotations2;
        while (true) {
            for (int i = 0; i < $this$firstOrNull$iv.length; ++i) {
                final Object element$iv = $this$firstOrNull$iv[i];
                final Annotation it = (Annotation)element$iv;
                if (it instanceof Greedy || it instanceof Take || it instanceof Quotable || it instanceof Options) {
                    final Object o = element$iv;
                    final Annotation ann = (Annotation)o;
                    return (ann instanceof Greedy) ? this.greedy(sb, wordOne, arguments) : ((ann instanceof Take) ? this.take(sb, wordOne, arguments, (Take)ann) : ((ann instanceof Quotable) ? this.quotable(sb, wordOne, arguments) : ((ann instanceof Options) ? (ArraysKt.contains((Object[])((Options)ann).value(), (Object)wordOne) ? wordOne : null) : wordOne)));
                }
            }
            final Object o = null;
            continue;
        }
    }
    
    @NotNull
    @Override
    public List<String> complete(@NotNull final ArgumentQueue arguments, @NotNull final Parameter param) {
        Intrinsics.checkNotNullParameter((Object)arguments, "arguments");
        Intrinsics.checkNotNullParameter((Object)param, "param");
        if (!param.isAnnotationPresent((Class<? extends Annotation>)Options.class)) {
            return CollectionsKt.emptyList();
        }
        final Options options = param.getAnnotation(Options.class);
        return ArraysKt.toList((Object[])options.value());
    }
    
    private final String greedy(final StringBuilder sb, final String wordOne, final ArgumentQueue arguments) {
        sb.append(wordOne);
        while (arguments.peek() != null) {
            sb.append(" " + arguments.poll());
        }
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "sb.toString()");
        return string;
    }
    
    private final String take(final StringBuilder sb, final String wordOne, final ArgumentQueue arguments, final Take take) {
        sb.append(wordOne);
        int i;
        for (i = 0; arguments.peek() != null && i < take.value(); ++i) {
            sb.append(" " + arguments.poll());
        }
        if (!take.allowLess() && i < take.value() - 1) {
            throw new IllegalArgumentException("Needed " + take.value() + " words!");
        }
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "sb.toString()");
        return string;
    }
    
    private final String quotable(final StringBuilder sb, final String wordOne, final ArgumentQueue arguments) {
        if (!StringsKt.startsWith$default(wordOne, "\"", false, 2, (Object)null)) {
            sb.append(wordOne);
            final String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue((Object)string, "sb.toString()");
            return string;
        }
        final String substring = wordOne.substring(1);
        Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        while (arguments.peek() != null) {
            final String word = arguments.poll();
            if (StringsKt.endsWith$default(word, "\"", false, 2, (Object)null)) {
                final String substring2 = word.substring(0, word.length() - 1);
                Intrinsics.checkNotNullExpressionValue((Object)substring2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                sb.append(" " + substring2);
                break;
            }
            sb.append(" " + word);
        }
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string2, "sb.toString()");
        return string2;
    }
    
    @Override
    public /* bridge */ Object parse(final ArgumentQueue arguments, final Parameter param) {
        return this.parse(arguments, param);
    }
}
