package gg.essential.util;

import kotlin.*;
import com.mojang.authlib.properties.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import gg.essential.api.utils.*;
import gg.essential.api.utils.mojang.*;
import kotlin.jvm.*;
import kotlin.text.*;
import kotlin.collections.*;

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
