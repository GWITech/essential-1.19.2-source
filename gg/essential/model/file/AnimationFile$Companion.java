package gg.essential.model.file;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.modules.*;
import kotlinx.serialization.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u00c6\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b" }, d2 = { "Lgg/essential/model/file/AnimationFile$Companion;", "", "()V", "json", "Lkotlinx/serialization/json/Json;", "parse", "Lgg/essential/model/file/AnimationFile;", "str", "", "serializer", "Lkotlinx/serialization/KSerializer;", "cosmetics" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @JvmStatic
    @NotNull
    public final AnimationFile parse(@NotNull final String str) {
        Intrinsics.checkNotNullParameter((Object)str, "str");
        final StringFormat stringFormat;
        final StringFormat $this$decodeFromString$iv = stringFormat = (StringFormat)AnimationFile.access$getJson$cp();
        final SerializersModule $this$serializer$iv$iv = $this$decodeFromString$iv.getSerializersModule();
        final KSerializer $this$cast$iv$iv$iv = SerializersKt.serializer($this$serializer$iv$iv, Reflection.typeOf((Class)AnimationFile.class));
        return (AnimationFile)stringFormat.decodeFromString((DeserializationStrategy)$this$cast$iv$iv$iv, str);
    }
    
    @NotNull
    public final KSerializer<AnimationFile> serializer() {
        return (KSerializer<AnimationFile>)serializer.INSTANCE;
    }
    
    public Companion(final byte b) {
        this();
    }
}
