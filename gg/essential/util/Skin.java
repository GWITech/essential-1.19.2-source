package gg.essential.util;

import kotlin.*;
import gg.essential.api.utils.mojang.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import com.mojang.authlib.properties.*;
import kotlin.jvm.*;
import java.util.*;
import gg.essential.api.utils.*;
import kotlin.text.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000(
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J	\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J	\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J	\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   ¨\u0006\u0015""" }, d2 = { "Lgg/essential/util/Skin;", "", "hash", "", "model", "Lgg/essential/api/utils/mojang/Model;", "(Ljava/lang/String;Lgg/essential/api/utils/mojang/Model;)V", "getHash", "()Ljava/lang/String;", "getModel", "()Lgg/essential/api/utils/mojang/Model;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "essential" })
public final class Skin
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String hash;
    @NotNull
    private final Model model;
    
    public Skin(@NotNull final String hash, @NotNull final Model model) {
        Intrinsics.checkNotNullParameter((Object)hash, "hash");
        Intrinsics.checkNotNullParameter((Object)model, "model");
        super();
        this.hash = hash;
        this.model = model;
    }
    
    @NotNull
    public final String getHash() {
        return this.hash;
    }
    
    @NotNull
    public final Model getModel() {
        return this.model;
    }
    
    @NotNull
    public final String component1() {
        return this.hash;
    }
    
    @NotNull
    public final Model component2() {
        return this.model;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Skin(hash=" + this.hash + ", model=" + this.model;
    }
    
    @Override
    public int hashCode() {
        int result = this.hash.hashCode();
        result = result * 31 + this.model.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Skin)) {
            return false;
        }
        final Skin skin = (Skin)other;
        return Intrinsics.areEqual((Object)this.hash, (Object)skin.hash) && this.model == skin.model;
    }
    
    @JvmStatic
    @NotNull
    public static final Skin fromProperty(@NotNull final Property property) {
        return Skin.Companion.fromProperty(property);
    }
    
    @JvmStatic
    @NotNull
    public static final Skin fromApi(@NotNull final gg.essential.api.utils.mojang.Skin skin) {
        return Skin.Companion.fromApi(skin);
    }
    
    @JvmStatic
    @NotNull
    public static final String hashFromUrl(@NotNull final String url) {
        return Skin.Companion.hashFromUrl(url);
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000e
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020	H\u0007J\u0018\u0010
                                                       \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u0010""" }, d2 = { "Lgg/essential/util/Skin$Companion;", "", "()V", "fromApi", "Lgg/essential/util/Skin;", "skin", "Lgg/essential/api/utils/mojang/Skin;", "fromProperty", "property", "Lcom/mojang/authlib/properties/Property;", "fromUrl", "url", "", "model", "Lgg/essential/api/utils/mojang/Model;", "hashFromUrl", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @NotNull
        public final Skin fromProperty(@NotNull final Property property) {
            Intrinsics.checkNotNullParameter((Object)property, "property");
            final byte[] decode = Base64.getDecoder().decode(property.getValue());
            Intrinsics.checkNotNullExpressionValue((Object)decode, "getDecoder().decode(property.value)");
            final JsonHolder skinHolder = new JsonHolder(new String(decode, Charsets.UTF_8)).optJSONObject("textures").optJSONObject("SKIN");
            final String optString = skinHolder.optString("url");
            Intrinsics.checkNotNullExpressionValue((Object)optString, "skinHolder.optString(\"url\")");
            final Model.Companion companion = Model.Companion;
            final String optString2 = skinHolder.optJSONObject("metadata").optString("model");
            Intrinsics.checkNotNullExpressionValue((Object)optString2, "skinHolder.optJSONObject\u2026data\").optString(\"model\")");
            return this.fromUrl(optString, companion.byTypeOrDefault(optString2));
        }
        
        @JvmStatic
        @NotNull
        public final Skin fromApi(@NotNull final gg.essential.api.utils.mojang.Skin skin) {
            Intrinsics.checkNotNullParameter((Object)skin, "skin");
            return new Skin(this.hashFromUrl(skin.getUrl()), Model.Companion.byVariantOrDefault(skin.getVariant()));
        }
        
        @JvmStatic
        @NotNull
        public final Skin fromUrl(@NotNull final String url, @NotNull final Model model) {
            Intrinsics.checkNotNullParameter((Object)url, "url");
            Intrinsics.checkNotNullParameter((Object)model, "model");
            return new Skin(this.hashFromUrl(url), model);
        }
        
        @JvmStatic
        @NotNull
        public final String hashFromUrl(@NotNull final String url) {
            Intrinsics.checkNotNullParameter((Object)url, "url");
            String s;
            if ((s = (String)CollectionsKt.lastOrNull(StringsKt.split$default((CharSequence)url, new String[] { "/" }, false, 0, 6, (Object)null))) == null) {
                s = "";
            }
            return s;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
