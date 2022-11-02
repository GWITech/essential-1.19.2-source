package gg.essential.model.molang;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.text.*;
import kotlin.ranges.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0012J/\u0010\u0019\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0086\b\u00f8\u0001\u0000J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0003J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020!J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\u0012R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%" }, d2 = { "Lgg/essential/model/molang/Parser;", "", "str", "", "(Ljava/lang/String;)V", "curr", "", "getCurr", "()C", "i", "", "getI", "()I", "setI", "(I)V", "getStr", "()Ljava/lang/String;", "fullyParseExpression", "Lgg/essential/model/molang/MolangExpression;", "parseExpression", "parseLiteral", "Lgg/essential/model/molang/LiteralExpr;", "parseProduct", "parseSimpleExpression", "parseSum", "reads", "", "f", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "char", "s", "Lkotlin/ranges/CharRange;", "skipWhitespace", "", "tryFullyParseExpression", "cosmetics" })
final class Parser
{
    @NotNull
    private final String str;
    private int i;
    
    public Parser(@NotNull final String str) {
        Intrinsics.checkNotNullParameter((Object)str, "str");
        super();
        final String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.str = lowerCase;
    }
    
    @NotNull
    public final String getStr() {
        return this.str;
    }
    
    public final int getI() {
        return this.i;
    }
    
    public final void setI(final int <set-?>) {
        this.i = <set-?>;
    }
    
    public final char getCurr() {
        return this.str.charAt(this.i);
    }
    
    public final boolean reads(final char char) {
        final Parser this_$iv = this;
        boolean b;
        if (this_$iv.getI() >= this_$iv.getStr().length()) {
            b = false;
        }
        else {
            final char it = this_$iv.getCurr();
            if (it == char) {
                this_$iv.setI(this_$iv.getI() + 1);
                this_$iv.skipWhitespace();
                b = true;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final boolean reads(@NotNull final CharRange char) {
        Intrinsics.checkNotNullParameter((Object)char, "char");
        final Parser this_$iv = this;
        boolean b;
        if (this_$iv.getI() >= this_$iv.getStr().length()) {
            b = false;
        }
        else {
            final char it = this_$iv.getCurr();
            final char first = char.getFirst();
            if (it <= char.getLast() && first <= it) {
                this_$iv.setI(this_$iv.getI() + 1);
                this_$iv.skipWhitespace();
                b = true;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final boolean reads(@NotNull final String s) {
        Intrinsics.checkNotNullParameter((Object)s, "s");
        boolean b;
        if (StringsKt.startsWith$default(this.str, s, this.i, false, 4, (Object)null)) {
            this.i += s.length();
            this.skipWhitespace();
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final void skipWhitespace() {
        while (this.reads(' ')) {}
    }
    
    @NotNull
    public final LiteralExpr parseLiteral() {
        final int start = this.i;
        while (this.reads(new CharRange('0', '9'))) {}
        if (this.reads('.')) {
            while (this.reads(new CharRange('0', '9'))) {}
        }
        return new LiteralExpr(Float.parseFloat(StringsKt.replace$default(StringsKt.slice(this.str, RangesKt.until(start, this.i)), " ", "", false, 4, (Object)null)));
    }
    
    @NotNull
    public final MolangExpression parseSimpleExpression() {
        MolangExpression molangExpression;
        if (this.reads('(')) {
            final MolangExpression expression = this.parseExpression();
            this.reads(')');
            molangExpression = expression;
        }
        else {
            final char curr = this.getCurr();
            if ('0' <= curr && curr < ':') {
                molangExpression = this.parseLiteral();
            }
            else if (this.getCurr() == '-') {
                this.reads('-');
                molangExpression = new NegExpr(this.parseSimpleExpression());
            }
            else if (this.reads("math.pi")) {
                molangExpression = new LiteralExpr(3.1415927f);
            }
            else if (this.reads("math.cos(")) {
                final CosExpr cosExpr = new CosExpr(this.parseExpression());
                this.reads(')');
                molangExpression = (MolangExpression)cosExpr;
            }
            else if (this.reads("math.sin(")) {
                final SinExpr sinExpr = new SinExpr(this.parseExpression());
                this.reads(')');
                molangExpression = sinExpr;
            }
            else if (this.reads("query.anim_time")) {
                molangExpression = new QueryExpr((Function1<? super MolangQuery, Float>)Parser$parseSimpleExpression.Parser$parseSimpleExpression$4.INSTANCE);
            }
            else if (this.reads("query.life_time")) {
                molangExpression = new QueryExpr((Function1<? super MolangQuery, Float>)Parser$parseSimpleExpression.Parser$parseSimpleExpression$5.INSTANCE);
            }
            else if (this.reads("query.modified_move_speed")) {
                molangExpression = new QueryExpr((Function1<? super MolangQuery, Float>)Parser$parseSimpleExpression.Parser$parseSimpleExpression$6.INSTANCE);
            }
            else {
                if (!this.reads("query.modified_distance_moved")) {
                    throw new IllegalArgumentException("Unexpected character at index " + this.i);
                }
                molangExpression = new QueryExpr((Function1<? super MolangQuery, Float>)Parser$parseSimpleExpression.Parser$parseSimpleExpression$7.INSTANCE);
            }
        }
        return molangExpression;
    }
    
    @NotNull
    public final MolangExpression parseProduct() {
        MolangExpression left = this.parseSimpleExpression();
        while (true) {
            MolangExpression molangExpression;
            if (this.reads('*')) {
                molangExpression = new MulExpr(left, this.parseSimpleExpression());
            }
            else {
                if (!this.reads('/')) {
                    break;
                }
                molangExpression = new MulExpr(left, new InvExpr(this.parseSimpleExpression()));
            }
            left = molangExpression;
        }
        return left;
    }
    
    @NotNull
    public final MolangExpression parseSum() {
        MolangExpression left = this.parseProduct();
        while (true) {
            MolangExpression molangExpression;
            if (this.reads('+')) {
                molangExpression = new AddExpr(left, this.parseProduct());
            }
            else {
                if (!this.reads('-')) {
                    break;
                }
                molangExpression = new AddExpr(left, new NegExpr(this.parseProduct()));
            }
            left = molangExpression;
        }
        return left;
    }
    
    @NotNull
    public final MolangExpression parseExpression() {
        return this.parseSum();
    }
    
    @NotNull
    public final MolangExpression fullyParseExpression() {
        final MolangExpression expression = this.parseExpression();
        if (this.i < this.str.length()) {
            final StringBuilder append = new StringBuilder().append("Failed to fully parse input, remaining: ");
            final String substring = this.str.substring(this.i);
            Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String).substring(startIndex)");
            throw new IllegalArgumentException(append.append(substring).toString());
        }
        return expression;
    }
    
    @NotNull
    public final MolangExpression tryFullyParseExpression() {
        MolangExpression fullyParseExpression;
        try {
            fullyParseExpression = this.fullyParseExpression();
        }
        catch (final Exception e) {
            throw new MolangParserException("Failed to parse `" + this.str + "`:", e);
        }
        return fullyParseExpression;
    }
}
