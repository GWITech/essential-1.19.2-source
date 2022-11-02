package gg.essential.universal.shader;

import net.minecraft.resource.*;
import kotlin.*;
import java.io.*;
import kotlin.text.*;
import kotlin.jvm.internal.*;
import java.nio.charset.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
final synthetic class MCShader$Companion$fromLegacyShader$factory$1$1 implements Resource$InputSupplier {
    final /* synthetic */ String $tmp0;
    
    MCShader$Companion$fromLegacyShader$factory$1$1(final String $tmp0) {
        this.$tmp0 = $tmp0;
        super();
    }
    
    @NotNull
    public final ByteArrayInputStream get() {
        final String $tmp0;
        final String $this$invoke_u24byteInputStream$iv = $tmp0 = this.$tmp0;
        final Charset utf_8 = Charsets.UTF_8;
        final String s = $tmp0;
        if (s == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        final byte[] bytes = s.getBytes(utf_8);
        Intrinsics.checkNotNullExpressionValue((Object)bytes, "(this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }
    
    public /* bridge */ Object get() {
        return this.get();
    }
}