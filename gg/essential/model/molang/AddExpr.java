package gg.essential.model.molang;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0001H\u00c6\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006¨\u0006\u0017" }, d2 = { "Lgg/essential/model/molang/AddExpr;", "Lgg/essential/model/molang/MolangExpression;", "left", "right", "(Lgg/essential/model/molang/MolangExpression;Lgg/essential/model/molang/MolangExpression;)V", "getLeft", "()Lgg/essential/model/molang/MolangExpression;", "getRight", "component1", "component2", "copy", "equals", "", "other", "", "eval", "", "context", "Lgg/essential/model/molang/MolangContext;", "hashCode", "", "toString", "", "cosmetics" })
public final class AddExpr implements MolangExpression
{
    @NotNull
    private final MolangExpression left;
    @NotNull
    private final MolangExpression right;
    
    public AddExpr(@NotNull final MolangExpression left, @NotNull final MolangExpression right) {
        Intrinsics.checkNotNullParameter((Object)left, "left");
        Intrinsics.checkNotNullParameter((Object)right, "right");
        super();
        this.left = left;
        this.right = right;
    }
    
    @Override
    public float eval(@NotNull final MolangContext context) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        return this.left.eval(context) + this.right.eval(context);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "AddExpr(left=" + this.left + ", right=" + this.right + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.left.hashCode();
        result = result * 31 + this.right.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddExpr)) {
            return false;
        }
        final AddExpr addExpr = (AddExpr)other;
        return Intrinsics.areEqual((Object)this.left, (Object)addExpr.left) && Intrinsics.areEqual((Object)this.right, (Object)addExpr.right);
    }
}
