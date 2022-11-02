package gg.essential.util.resource;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.io.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006	\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/util/resource/ResourcePackAdapter$FileMapper;", "", "parentPath", "", "getParentPath", "()Ljava/lang/String;", "map", "Ljava/io/InputStream;", "stream", "essential" })
public interface FileMapper
{
    @NotNull
    String getParentPath();
    
    @NotNull
    InputStream map(@NotNull final InputStream p0);
}
