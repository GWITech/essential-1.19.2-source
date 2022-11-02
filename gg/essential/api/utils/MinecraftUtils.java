package gg.essential.api.utils;

import kotlin.*;
import gg.essential.universal.wrappers.message.*;
import net.minecraft.util.*;
import java.awt.image.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000:
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u0011
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010	\u001a\u00020
                                                   2\u0006\u0010\u000b\u001a\u00020\fH&J)\u0010	\u001a\u00020
                                                   2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a
                                                   \u0012\u0006\b\u0001\u0012\u00020\u00010\u000e"\u00020\u0001H&¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020
                                                   2\u0006\u0010\u000b\u001a\u00020\u0011H&J\u0010\u0010\u0010\u001a\u00020
                                                   2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\u0010\u001a\u00020
                                                   2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u0013\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/api/utils/MinecraftUtils;", "", "getResourceImage", "Ljava/awt/image/BufferedImage;", "location", "Lnet/minecraft/util/Identifier;", "isDevelopment", "", "isHypixel", "sendChatMessageAndFormat", "", "message", "", "parameters", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "sendMessage", "Lgg/essential/universal/wrappers/message/UTextComponent;", "prefix", "essential-api" })
public interface MinecraftUtils
{
    void sendMessage(@NotNull final UTextComponent p0);
    
    void sendChatMessageAndFormat(@NotNull final String p0);
    
    void sendChatMessageAndFormat(@NotNull final String p0, @NotNull final Object... p1);
    
    void sendMessage(@NotNull final String p0);
    
    void sendMessage(@NotNull final String p0, @NotNull final String p1);
    
    boolean isHypixel();
    
    @Nullable
    BufferedImage getResourceImage(@NotNull final Identifier p0);
    
    boolean isDevelopment();
}
