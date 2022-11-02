package gg.essential.elementa.utils;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.impl.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0012\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u0014\u0010\u0000\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r" }, d2 = { "invalidUsageBehavior", "Lgg/essential/elementa/utils/InvalidUsageBehavior;", "getInvalidUsageBehavior", "()Lgg/essential/elementa/utils/InvalidUsageBehavior;", "invalidUsageBehaviorProp", "handleInvalidUsage", "", "message", "", "requireMainThread", "requireState", "state", "", "Elementa" })
public final class InvalidUsageKt
{
    @Nullable
    private static final InvalidUsageBehavior invalidUsageBehaviorProp;
    
    @NotNull
    public static final InvalidUsageBehavior getInvalidUsageBehavior() {
        InvalidUsageBehavior invalidUsageBehaviorProp;
        if ((invalidUsageBehaviorProp = InvalidUsageKt.invalidUsageBehaviorProp) == null) {
            invalidUsageBehaviorProp = (OptionsKt.getDevPropSet() ? InvalidUsageBehavior.THROW : InvalidUsageBehavior.WARN);
        }
        return invalidUsageBehaviorProp;
    }
    
    public static final void handleInvalidUsage(@NotNull final String message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        switch (InvalidUsageKt.WhenMappings.$EnumSwitchMapping$0[getInvalidUsageBehavior().ordinal()]) {
            case 1: {
                return;
            }
            case 2: {
                new IllegalStateException(message).printStackTrace();
                break;
            }
            case 3: {
                final IllegalStateException it = new IllegalStateException(message);
                final int n = 0;
                it.printStackTrace();
                throw it;
            }
        }
    }
    
    public static final void requireState(final boolean state, @NotNull final String message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        if (!state) {
            handleInvalidUsage(message);
        }
    }
    
    public static final void requireMainThread(@NotNull final String message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        requireState(Platform.Companion.getPlatform$Elementa().isCallingFromMinecraftThread(), message);
    }
    
    public static /* synthetic */ void requireMainThread$default(String message, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            message = "This method is not thread-safe and must be called from the main thread. Consider the thread-safety of the calling code and use Window.enqueueRenderOperation if applicable.";
        }
        requireMainThread(message);
    }
    
    static {
        final String property = System.getProperty("elementa.invalid_usage", "");
        InvalidUsageBehavior invalidUsageBehaviorProp2 = null;
        Label_0107: {
            if (property != null) {
                switch (property) {
                    case "warn": {
                        invalidUsageBehaviorProp2 = InvalidUsageBehavior.WARN;
                        break Label_0107;
                    }
                    case "throw": {
                        invalidUsageBehaviorProp2 = InvalidUsageBehavior.THROW;
                        break Label_0107;
                    }
                    case "ignore": {
                        invalidUsageBehaviorProp2 = InvalidUsageBehavior.IGNORE;
                        break Label_0107;
                    }
                    default:
                        break;
                }
            }
            invalidUsageBehaviorProp2 = null;
        }
        invalidUsageBehaviorProp = invalidUsageBehaviorProp2;
    }
}
