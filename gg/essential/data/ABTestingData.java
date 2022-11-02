package gg.essential.data;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.io.*;
import kotlin.jvm.internal.*;
import kotlin.io.*;
import java.nio.charset.*;
import gg.essential.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000*
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010#
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010
                                                   \u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006""" }, d2 = { "Lgg/essential/data/ABTestingData;", "", "()V", "abFeatures", "", "", "abFile", "Ljava/io/File;", "addData", "", "name", "hasData", "", "essential" })
public final class ABTestingData
{
    @NotNull
    public static final ABTestingData INSTANCE;
    @NotNull
    private static final File abFile;
    @NotNull
    private static final Set<String> abFeatures;
    
    private ABTestingData() {
        super();
    }
    
    public final void addData(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        if (!this.hasData(name)) {
            ABTestingData.abFeatures.add(name);
            FilesKt.appendText$default(ABTestingData.abFile, name + System.lineSeparator(), (Charset)null, 2, (Object)null);
        }
    }
    
    public final boolean hasData(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        return ABTestingData.abFeatures.contains(name);
    }
    
    static {
        INSTANCE = new ABTestingData();
        abFile = new File(Essential.getInstance().getBaseDir(), "expFeatures.json");
        abFeatures = new LinkedHashSet<String>();
        ABTestingData.abFile.createNewFile();
        ABTestingData.abFeatures.addAll(FilesKt.readLines$default(ABTestingData.abFile, (Charset)null, 1, (Object)null));
    }
}
