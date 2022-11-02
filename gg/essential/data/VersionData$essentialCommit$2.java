package gg.essential.data;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import kotlin.io.*;
import kotlin.text.*;
import kotlin.collections.*;
import java.net.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class VersionData$essentialCommit$2 extends Lambda implements Function0<String> {
    public static final VersionData$essentialCommit$2 INSTANCE;
    
    VersionData$essentialCommit$2() {
        super(0);
    }
    
    @NotNull
    public final String invoke() {
        final URL resource = VersionData.INSTANCE.getClass().getResource("/assets/essential/version.txt");
        Intrinsics.checkNotNull((Object)resource);
        final String version = new String(TextStreamsKt.readBytes(resource), Charsets.UTF_8);
        final String hash = (String)CollectionsKt.last(StringsKt.split$default((CharSequence)version, new String[] { "+" }, false, 0, 6, (Object)null));
        return StringsKt.startsWith$default(hash, "g", false, 2, (Object)null) ? StringsKt.drop(hash, 1) : (Intrinsics.areEqual((Object)version, (Object)"${version}") ? "dev" : "SNAPSHOT");
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        VersionData$essentialCommit$2.INSTANCE = new VersionData$essentialCommit$2();
    }
}