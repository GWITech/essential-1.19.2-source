package gg.essential.model.file;

import kotlin.jvm.functions.*;
import kotlinx.serialization.json.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "", "Lkotlinx/serialization/json/JsonBuilder;", "invoke" })
static final class ModelFile$Companion$json$1 extends Lambda implements Function1<JsonBuilder, Unit> {
    public static final ModelFile$Companion$json$1 INSTANCE;
    
    ModelFile$Companion$json$1() {
        super(1);
    }
    
    public final void invoke(@NotNull final JsonBuilder $this$Json) {
        Intrinsics.checkNotNullParameter((Object)$this$Json, "$this$Json");
        $this$Json.setIgnoreUnknownKeys(true);
        $this$Json.setCoerceInputValues(true);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((JsonBuilder)p1);
        return Unit.INSTANCE;
    }
    
    static {
        ModelFile$Companion$json$1.INSTANCE = new ModelFile$Companion$json$1();
    }
}