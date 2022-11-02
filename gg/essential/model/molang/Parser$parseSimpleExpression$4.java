package gg.essential.model.molang;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "<anonymous>", "", "Lgg/essential/model/molang/MolangQuery;", "invoke", "(Lgg/essential/model/molang/MolangQuery;)Ljava/lang/Float;" })
static final class Parser$parseSimpleExpression$4 extends Lambda implements Function1<MolangQuery, Float> {
    public static final Parser$parseSimpleExpression$4 INSTANCE;
    
    Parser$parseSimpleExpression$4() {
        super(1);
    }
    
    @NotNull
    public final Float invoke(@NotNull final MolangQuery $this$$receiver) {
        Intrinsics.checkNotNullParameter((Object)$this$$receiver, "$this$$receiver");
        return $this$$receiver.getAnimTime();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((MolangQuery)p1);
    }
    
    static {
        Parser$parseSimpleExpression$4.INSTANCE = new Parser$parseSimpleExpression$4();
    }
}