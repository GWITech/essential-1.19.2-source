package gg.essential.api.gui;

import org.jetbrains.annotations.*;
import kotlin.*;
import kotlin.jvm.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH&J]\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010	\u001a\b\u0012\u0004\u0012\u00020\u00030
                                                   2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030
                                                   2\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000fH&J-\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010	\u001a\b\u0012\u0004\u0012\u00020\u00030
                                                   H'¢\u0006\u0002\b\u0002J8\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000fH'¢\u0006\u0002\b\u0002JG\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010	\u001a\b\u0012\u0004\u0012\u00020\u00030
                                                   2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030
                                                   H'¢\u0006\u0002\b\u0002J7\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010	\u001a\b\u0012\u0004\u0012\u00020\u00030
                                                   H'¢\u0006\u0002\b\u0002\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u0014\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/api/gui/Notifications;", "", "push", "", "title", "", "message", "duration", "", "action", "Lkotlin/Function0;", "close", "configure", "Lkotlin/Function1;", "Lgg/essential/api/gui/NotificationBuilder;", "Lkotlin/ExtensionFunctionType;", "pushWithAction", "pushWithBuilder", "pushWithDurationActionAndClose", "pushWithDurationAndAction", "essential-api" })
public interface Notifications
{
    void push(@NotNull final String p0, @NotNull final String p1);
    
    @JvmName(name = "push")
    void push(@NotNull final String p0, @NotNull final String p1, @NotNull final Function1<? super NotificationBuilder, Unit> p2);
    
    default /* synthetic */ void push$default(final Notifications notifications, final String s, final String s2, Function1 function1, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushWithBuilder");
        }
        if ((n & 0x4) != 0x0) {
            function1 = (Function1)Notifications$pushWithBuilder.Notifications$pushWithBuilder$1.INSTANCE;
        }
        notifications.push(s, s2, (Function1<? super NotificationBuilder, Unit>)function1);
    }
    
    void push(@NotNull final String p0, @NotNull final String p1, final float p2);
    
    default /* synthetic */ void push$default(final Notifications notifications, final String s, final String s2, float n, final int n2, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: push");
        }
        if ((n2 & 0x4) != 0x0) {
            n = 4.0f;
        }
        notifications.push(s, s2, n);
    }
    
    @JvmName(name = "push")
    void push(@NotNull final String p0, @NotNull final String p1, @NotNull final Function0<Unit> p2);
    
    default /* synthetic */ void push$default(final Notifications notifications, final String s, final String s2, Function0 function0, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushWithAction");
        }
        if ((n & 0x4) != 0x0) {
            function0 = (Function0)Notifications$pushWithAction.Notifications$pushWithAction$1.INSTANCE;
        }
        notifications.push(s, s2, (Function0<Unit>)function0);
    }
    
    @JvmName(name = "push")
    void push(@NotNull final String p0, @NotNull final String p1, final float p2, @NotNull final Function0<Unit> p3);
    
    default /* synthetic */ void push$default(final Notifications notifications, final String s, final String s2, float n, Function0 function0, final int n2, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushWithDurationAndAction");
        }
        if ((n2 & 0x4) != 0x0) {
            n = 4.0f;
        }
        if ((n2 & 0x8) != 0x0) {
            function0 = (Function0)Notifications$pushWithDurationAndAction.Notifications$pushWithDurationAndAction$1.INSTANCE;
        }
        notifications.push(s, s2, n, (Function0<Unit>)function0);
    }
    
    @JvmName(name = "push")
    void push(@NotNull final String p0, @NotNull final String p1, final float p2, @NotNull final Function0<Unit> p3, @NotNull final Function0<Unit> p4);
    
    default /* synthetic */ void push$default(final Notifications notifications, final String s, final String s2, float n, Function0 function0, Function0 function2, final int n2, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushWithDurationActionAndClose");
        }
        if ((n2 & 0x4) != 0x0) {
            n = 4.0f;
        }
        if ((n2 & 0x8) != 0x0) {
            function0 = (Function0)Notifications$pushWithDurationActionAndClose.Notifications$pushWithDurationActionAndClose$1.INSTANCE;
        }
        if ((n2 & 0x10) != 0x0) {
            function2 = (Function0)Notifications$pushWithDurationActionAndClose.Notifications$pushWithDurationActionAndClose$2.INSTANCE;
        }
        notifications.push(s, s2, n, (Function0<Unit>)function0, (Function0<Unit>)function2);
    }
    
    void push(@NotNull final String p0, @NotNull final String p1, final float p2, @NotNull final Function0<Unit> p3, @NotNull final Function0<Unit> p4, @NotNull final Function1<? super NotificationBuilder, Unit> p5);
    
    default /* synthetic */ void push$default(final Notifications notifications, final String s, final String s2, float n, Function0 function0, Function0 function2, Function1 function3, final int n2, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: push");
        }
        if ((n2 & 0x4) != 0x0) {
            n = 4.0f;
        }
        if ((n2 & 0x8) != 0x0) {
            function0 = (Function0)Notifications$push.Notifications$push$1.INSTANCE;
        }
        if ((n2 & 0x10) != 0x0) {
            function2 = (Function0)Notifications$push.Notifications$push$2.INSTANCE;
        }
        if ((n2 & 0x20) != 0x0) {
            function3 = (Function1)Notifications$push.Notifications$push$3.INSTANCE;
        }
        notifications.push(s, s2, n, (Function0<Unit>)function0, (Function0<Unit>)function2, (Function1<? super NotificationBuilder, Unit>)function3);
    }
}
