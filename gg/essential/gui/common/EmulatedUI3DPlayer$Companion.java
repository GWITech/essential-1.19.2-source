package gg.essential.gui.common;

import kotlin.*;
import com.mojang.authlib.*;
import gg.essential.universal.*;
import com.google.common.collect.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/gui/common/EmulatedUI3DPlayer$Companion;", "", "()V", "getLocalGameProfile", "Lcom/mojang/authlib/GameProfile;", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final GameProfile getLocalGameProfile() {
        final MinecraftClient mc = UMinecraft.getMinecraft();
        final GameProfile $this$getLocalGameProfile_u24lambda_u2d0 = mc.getSession().getProfile();
        $this$getLocalGameProfile_u24lambda_u2d0.getProperties().putAll((Multimap)mc.getSessionProperties());
        final GameProfile profile = $this$getLocalGameProfile_u24lambda_u2d0;
        Intrinsics.checkNotNullExpressionValue((Object)profile, "profile");
        return profile;
    }
    
    public Companion(final byte b) {
        this();
    }
}
