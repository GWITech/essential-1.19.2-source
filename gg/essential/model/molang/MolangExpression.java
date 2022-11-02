package gg.essential.model.molang;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006" }, d2 = { "Lgg/essential/model/molang/MolangExpression;", "", "eval", "", "context", "Lgg/essential/model/molang/MolangContext;", "cosmetics" })
public interface MolangExpression
{
    float eval(@NotNull final MolangContext p0);
}
