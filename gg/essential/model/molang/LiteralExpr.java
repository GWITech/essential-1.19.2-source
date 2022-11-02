package gg.essential.model.molang;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014" }, d2 = { "Lgg/essential/model/molang/LiteralExpr;", "Lgg/essential/model/molang/MolangExpression;", "value", "", "(F)V", "getValue", "()F", "component1", "copy", "equals", "", "other", "", "eval", "context", "Lgg/essential/model/molang/MolangContext;", "hashCode", "", "toString", "", "cosmetics" })
public final class LiteralExpr implements MolangExpression
{
    private final float value;
    
    public LiteralExpr(final float value) {
        super();
        this.value = value;
    }
    
    @Override
    public float eval(@NotNull final MolangContext context) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        return this.value;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "LiteralExpr(value=" + this.value + ')';
    }
    
    @Override
    public int hashCode() {
        return Float.hashCode(this.value);
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof LiteralExpr && Intrinsics.areEqual((Object)this.value, (Object)((LiteralExpr)other).value));
    }
}
