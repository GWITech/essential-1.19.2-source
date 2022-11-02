package gg.essential.api.utils.mojang;

import kotlin.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\r\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e
                                                   \u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b	\u0010
                                                   R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010
                                                   R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010
                                                   j\u0002\bj\u0002\b\u000e¨\u0006\u0010""" }, d2 = { "Lgg/essential/api/utils/mojang/Model;", "", "model", "", "type", "variant", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getModel$annotations", "()V", "getModel", "()Ljava/lang/String;", "getType", "getVariant", "STEVE", "ALEX", "Companion", "essential-api" })
public enum Model
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    @java.lang.Deprecated
    private final String model;
    @NotNull
    private final String type;
    @NotNull
    private final String variant;
    
    STEVE("STEVE", 0, "", "default", "classic"), 
    ALEX("ALEX", 1, "slim", "slim", "slim");
    
    private static final /* synthetic */ Model[] $VALUES;
    
    private Model(final String $enum$name, final int $enum$ordinal, final String model, final String type, final String variant) {
        this.model = model;
        this.type = type;
        this.variant = variant;
    }
    
    @NotNull
    @java.lang.Deprecated
    public final String getModel() {
        return this.model;
    }
    
    @Deprecated(message = "This is probably not what you are looking for.")
    @java.lang.Deprecated
    public static /* synthetic */ void getModel$annotations() {
    }
    
    @NotNull
    public final String getType() {
        return this.type;
    }
    
    @NotNull
    public final String getVariant() {
        return this.variant;
    }
    
    public static Model[] values() {
        return Model.$VALUES.clone();
    }
    
    public static Model valueOf(final String value) {
        return Enum.valueOf(Model.class, value);
    }
    
    private static final /* synthetic */ Model[] $values() {
        return new Model[] { Model.STEVE, Model.ALEX };
    }
    
    @JvmStatic
    @Nullable
    public static final Model byType(@NotNull final String str) {
        return Model.Companion.byType(str);
    }
    
    @JvmStatic
    @NotNull
    public static final Model byTypeOrDefault(@NotNull final String str) {
        return Model.Companion.byTypeOrDefault(str);
    }
    
    @JvmStatic
    @Nullable
    public static final Model byVariant(@NotNull final String str) {
        return Model.Companion.byVariant(str);
    }
    
    @JvmStatic
    @NotNull
    public static final Model byVariantOrDefault(@NotNull final String str) {
        return Model.Companion.byVariantOrDefault(str);
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001a
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010	\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006
                                                       """ }, d2 = { "Lgg/essential/api/utils/mojang/Model$Companion;", "", "()V", "byType", "Lgg/essential/api/utils/mojang/Model;", "str", "", "byTypeOrDefault", "byVariant", "byVariantOrDefault", "essential-api" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @Nullable
        public final Model byType(@NotNull final String str) {
            Intrinsics.checkNotNullParameter((Object)str, "str");
            final Model[] values = Model.values();
            for (int i = 0; i < values.length; ++i) {
                final Model it = values[i];
                if (Intrinsics.areEqual((Object)it.getType(), (Object)str)) {
                    return it;
                }
            }
            return null;
        }
        
        @JvmStatic
        @NotNull
        public final Model byTypeOrDefault(@NotNull final String str) {
            Intrinsics.checkNotNullParameter((Object)str, "str");
            Model model;
            if ((model = this.byType(str)) == null) {
                model = Model.STEVE;
            }
            return model;
        }
        
        @JvmStatic
        @Nullable
        public final Model byVariant(@NotNull final String str) {
            Intrinsics.checkNotNullParameter((Object)str, "str");
            final Model[] values = Model.values();
            for (int i = 0; i < values.length; ++i) {
                final Model it = values[i];
                if (StringsKt.equals(it.getVariant(), str, true)) {
                    return it;
                }
            }
            return null;
        }
        
        @JvmStatic
        @NotNull
        public final Model byVariantOrDefault(@NotNull final String str) {
            Intrinsics.checkNotNullParameter((Object)str, "str");
            Model model;
            if ((model = this.byVariant(str)) == null) {
                model = Model.STEVE;
            }
            return model;
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
