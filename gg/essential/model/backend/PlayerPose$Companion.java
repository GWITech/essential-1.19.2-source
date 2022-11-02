package gg.essential.model.backend;

import kotlin.*;
import java.util.*;
import gg.essential.model.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import gg.essential.lib.kotgl.matrix.matrices.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\f" }, d2 = { "Lgg/essential/model/backend/PlayerPose$Companion;", "", "()V", "fromMap", "Lgg/essential/model/backend/PlayerPose;", "map", "", "Lgg/essential/model/EnumPart;", "Lgg/essential/model/backend/PlayerPose$Part;", "child", "", "neutral", "cosmetics" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final PlayerPose fromMap(@NotNull final Map<EnumPart, Part> map, final boolean child) {
        Intrinsics.checkNotNullParameter((Object)map, "map");
        return new PlayerPose((Part)MapsKt.getValue((Map)map, (Object)EnumPart.HEAD), (Part)MapsKt.getValue((Map)map, (Object)EnumPart.BODY), (Part)MapsKt.getValue((Map)map, (Object)EnumPart.RIGHT_ARM), (Part)MapsKt.getValue((Map)map, (Object)EnumPart.LEFT_ARM), (Part)MapsKt.getValue((Map)map, (Object)EnumPart.RIGHT_LEG), (Part)MapsKt.getValue((Map)map, (Object)EnumPart.LEFT_LEG), child);
    }
    
    @NotNull
    public final PlayerPose neutral() {
        return new PlayerPose(new Part(0.0f, 0.0f, 0.0f, null, 127), new Part(0.0f, 0.0f, 0.0f, null, 127), new Part(-5.0f, 2.0f, 0.0f, null, 120), new Part(5.0f, 2.0f, 0.0f, null, 120), new Part(-1.9f, 12.0f, 0.1f, null, 120), new Part(1.9f, 12.0f, 0.1f, null, 120), false);
    }
    
    public Companion(final byte b) {
        this();
    }
}
