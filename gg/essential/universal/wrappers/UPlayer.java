package gg.essential.universal.wrappers;

import kotlin.*;
import net.minecraft.client.network.*;
import gg.essential.universal.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import gg.essential.universal.wrappers.message.*;
import kotlin.jvm.internal.*;
import net.minecraft.text.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J
                                                   \u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010	\u001a\u00020\u0006H\u0007J\b\u0010
                                                   \u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020H\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014""" }, d2 = { "Lgg/essential/universal/wrappers/UPlayer;", "", "()V", "getPlayer", "Lnet/minecraft/client/network/ClientPlayerEntity;", "getPosX", "", "getPosY", "getPosZ", "getPrevPosX", "getPrevPosY", "getPrevPosZ", "getUUID", "Ljava/util/UUID;", "hasPlayer", "", "sendClientSideMessage", "", "message", "Lgg/essential/universal/wrappers/message/UTextComponent;", "universalcraft" })
public final class UPlayer
{
    @NotNull
    public static final UPlayer INSTANCE;
    
    private UPlayer() {
        super();
    }
    
    @JvmStatic
    @Nullable
    public static final ClientPlayerEntity getPlayer() {
        return UMinecraft.getMinecraft().player;
    }
    
    @JvmStatic
    public static final boolean hasPlayer() {
        final UPlayer instance = UPlayer.INSTANCE;
        return getPlayer() != null;
    }
    
    @JvmStatic
    public static final void sendClientSideMessage(@NotNull final UTextComponent message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        final UPlayer instance = UPlayer.INSTANCE;
        final ClientPlayerEntity player = getPlayer();
        Intrinsics.checkNotNull((Object)player);
        player.method_43496((Text)message);
    }
    
    @JvmStatic
    @NotNull
    public static final UUID getUUID() {
        final UUID id = UMinecraft.getMinecraft().getSession().getProfile().getId();
        Intrinsics.checkNotNullExpressionValue((Object)id, "getMinecraft().session.profile.id");
        return id;
    }
    
    @JvmStatic
    public static final double getPosX() {
        final UPlayer instance = UPlayer.INSTANCE;
        final ClientPlayerEntity player = getPlayer();
        final Double n = (player == null) ? null : Double.valueOf(player.method_23317());
        if (n == null) {
            throw new NullPointerException("UPlayer.getPosX() called with no existing Player");
        }
        return n;
    }
    
    @JvmStatic
    public static final double getPosY() {
        final UPlayer instance = UPlayer.INSTANCE;
        final ClientPlayerEntity player = getPlayer();
        final Double n = (player == null) ? null : Double.valueOf(player.method_23318());
        if (n == null) {
            throw new NullPointerException("UPlayer.getPosY() called with no existing Player");
        }
        return n;
    }
    
    @JvmStatic
    public static final double getPosZ() {
        final UPlayer instance = UPlayer.INSTANCE;
        final ClientPlayerEntity player = getPlayer();
        final Double n = (player == null) ? null : Double.valueOf(player.method_23321());
        if (n == null) {
            throw new NullPointerException("UPlayer.getPosZ() called with no existing Player");
        }
        return n;
    }
    
    @JvmStatic
    public static final double getPrevPosX() {
        final UPlayer instance = UPlayer.INSTANCE;
        final ClientPlayerEntity player = getPlayer();
        final Double n = (player == null) ? null : Double.valueOf(player.field_6014);
        if (n == null) {
            throw new NullPointerException("UPlayer.getPrevPosX() called with no existing Player");
        }
        return n;
    }
    
    @JvmStatic
    public static final double getPrevPosY() {
        final UPlayer instance = UPlayer.INSTANCE;
        final ClientPlayerEntity player = getPlayer();
        final Double n = (player == null) ? null : Double.valueOf(player.field_6036);
        if (n == null) {
            throw new NullPointerException("UPlayer.getPrevPosY() called with no existing Player");
        }
        return n;
    }
    
    @JvmStatic
    public static final double getPrevPosZ() {
        final UPlayer instance = UPlayer.INSTANCE;
        final ClientPlayerEntity player = getPlayer();
        final Double n = (player == null) ? null : Double.valueOf(player.field_5969);
        if (n == null) {
            throw new NullPointerException("UPlayer.getPrevPosZ() called with no existing Player");
        }
        return n;
    }
    
    static {
        INSTANCE = new UPlayer();
    }
}
