package gg.essential.model.molang;

import kotlin.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001e\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u00c6\u0003J$\u0010\u000b\u001a\u00020\u00002\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\"\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017" }, d2 = { "Lgg/essential/model/molang/QueryExpr;", "Lgg/essential/model/molang/MolangExpression;", "f", "Lkotlin/Function1;", "Lgg/essential/model/molang/MolangQuery;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "getF", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "", "other", "", "eval", "context", "Lgg/essential/model/molang/MolangContext;", "hashCode", "", "toString", "", "cosmetics" })
public final class QueryExpr implements MolangExpression
{
    @NotNull
    private final Function1<MolangQuery, Float> f;
    
    public QueryExpr(@NotNull final Function1<? super MolangQuery, Float> f) {
        Intrinsics.checkNotNullParameter((Object)f, "f");
        super();
        this.f = (Function1<MolangQuery, Float>)f;
    }
    
    @Override
    public float eval(@NotNull final MolangContext context) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        return ((Number)this.f.invoke((Object)context.getQuery())).floatValue();
    }
    
    @NotNull
    @Override
    public String toString() {
        return "QueryExpr(f=" + this.f + ')';
    }
    
    @Override
    public int hashCode() {
        return this.f.hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof QueryExpr && Intrinsics.areEqual((Object)this.f, (Object)((QueryExpr)other).f));
    }
}
