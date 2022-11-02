package gg.essential.model.molang;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.json.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0005H\u0002¨\u0006\u0006" }, d2 = { "parseMolangExpression", "Lgg/essential/model/molang/MolangExpression;", "", "Lkotlinx/serialization/json/JsonPrimitive;", "toRadians", "", "cosmetics" })
public final class MolangExpressionKt
{
    private static final float toRadians(final float $this$toRadians) {
        return $this$toRadians / 180.0f * 3.1415927f;
    }
    
    @NotNull
    public static final MolangExpression parseMolangExpression(@NotNull final String $this$parseMolangExpression) {
        Intrinsics.checkNotNullParameter((Object)$this$parseMolangExpression, "<this>");
        return new Parser($this$parseMolangExpression).tryFullyParseExpression();
    }
    
    @NotNull
    public static final MolangExpression parseMolangExpression(@NotNull final JsonPrimitive $this$parseMolangExpression) {
        Intrinsics.checkNotNullParameter((Object)$this$parseMolangExpression, "<this>");
        return $this$parseMolangExpression.isString() ? parseMolangExpression($this$parseMolangExpression.getContent()) : new LiteralExpr(Float.parseFloat($this$parseMolangExpression.getContent()));
    }
    
    public static final /* synthetic */ float access$toRadians(final float $receiver) {
        return toRadians($receiver);
    }
}
