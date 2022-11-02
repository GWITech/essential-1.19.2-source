package gg.essential.universal.shader;

import kotlin.jvm.functions.*;
import net.minecraft.util.*;
import java.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.resource.*;
import java.io.*;
import kotlin.text.*;
import java.nio.charset.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "Ljava/util/Optional;", "Lnet/minecraft/resource/Resource;", "id", "Lnet/minecraft/util/Identifier;", "invoke" })
static final class MCShader$Companion$fromLegacyShader$factory$1 extends Lambda implements Function1<Identifier, Optional<Resource>> {
    final /* synthetic */ String $json;
    final /* synthetic */ String $transformedVertSource;
    final /* synthetic */ String $transformedFragSource;
    
    MCShader$Companion$fromLegacyShader$factory$1(final String $json, final String $transformedVertSource, final String $transformedFragSource) {
        this.$json = $json;
        this.$transformedVertSource = $transformedVertSource;
        this.$transformedFragSource = $transformedFragSource;
        super(1);
    }
    
    @NotNull
    public final Optional<Resource> invoke(@NotNull final Identifier id) {
        Intrinsics.checkNotNullParameter((Object)id, "id");
        final String path = id.getPath();
        Intrinsics.checkNotNullExpressionValue((Object)path, "id.path");
        String s;
        if (StringsKt.endsWith$default(path, ".json", false, 2, (Object)null)) {
            s = this.$json;
        }
        else {
            final String path2 = id.getPath();
            Intrinsics.checkNotNullExpressionValue((Object)path2, "id.path");
            if (StringsKt.endsWith$default(path2, ".vsh", false, 2, (Object)null)) {
                s = this.$transformedVertSource;
            }
            else {
                final String path3 = id.getPath();
                Intrinsics.checkNotNullExpressionValue((Object)path3, "id.path");
                if (!StringsKt.endsWith$default(path3, ".fsh", false, 2, (Object)null)) {
                    throw new FileNotFoundException(id.toString());
                }
                s = this.$transformedFragSource;
            }
        }
        final String content = s;
        return Optional.of(new Resource("__generated__", (Resource$InputSupplier)new MCShader$Companion$fromLegacyShader$factory$1.MCShader$Companion$fromLegacyShader$factory$1$1(content)));
    }
    
    private static final /* synthetic */ ByteArrayInputStream invoke$byteInputStream(final String $this$invoke_u24byteInputStream) {
        final Charset utf_8 = Charsets.UTF_8;
        if ($this$invoke_u24byteInputStream == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        final byte[] bytes = $this$invoke_u24byteInputStream.getBytes(utf_8);
        Intrinsics.checkNotNullExpressionValue((Object)bytes, "(this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Identifier)p1);
    }
}