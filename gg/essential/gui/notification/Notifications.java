package gg.essential.gui.notification;

import org.jetbrains.annotations.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.*;
import gg.essential.config.*;
import gg.essential.elementa.dsl.*;
import gg.essential.util.*;
import gg.essential.gui.overlay.*;
import gg.essential.api.gui.*;
import gg.essential.elementa.*;
import java.util.concurrent.*;
import java.util.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.components.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000`
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b	\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002)*B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0013J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016JU\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00130 ¢\u0006\u0002\b"H\u0016JU\u0010#\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00130 ¢\u0006\u0002\b"H\u0002J+\u0010$\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0017¢\u0006\u0002\b\u0016J6\u0010%\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00130 ¢\u0006\u0002\b"H\u0017¢\u0006\u0002\b\u0016JA\u0010&\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0017¢\u0006\u0002\b\u0016J3\u0010'\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0017¢\u0006\u0002\b\u0016J\u0006\u0010(\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020	X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0016\u0010
                                                   \u001a
                                                    \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006+""" }, d2 = { "Lgg/essential/gui/notification/Notifications;", "Lgg/essential/api/gui/Notifications;", "()V", "beforeFirstDraw", "", "blocked", "getBlocked", "()Z", "layer", "Lgg/essential/gui/overlay/PersistentLayer;", "mc", "Lnet/minecraft/client/MinecraftClient;", "kotlin.jvm.PlatformType", "notifications", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lgg/essential/gui/notification/Notification;", "window", "Lgg/essential/elementa/components/Window;", "addFromQueue", "", "hasActiveNotifications", "hide", "push", "title", "", "message", "duration", "", "action", "Lkotlin/Function0;", "close", "configure", "Lkotlin/Function1;", "Lgg/essential/api/gui/NotificationBuilder;", "Lkotlin/ExtensionFunctionType;", "pushSync", "pushWithAction", "pushWithBuilder", "pushWithDurationActionAndClose", "pushWithDurationAndAction", "show", "DelayedNotification", "NotificationBuilderImpl", "essential" })
public final class Notifications implements gg.essential.api.gui.Notifications
{
    @NotNull
    public static final Notifications INSTANCE;
    private static final MinecraftClient mc;
    @NotNull
    private static final ConcurrentLinkedQueue<Notification> notifications;
    @NotNull
    private static final PersistentLayer layer;
    @NotNull
    private static final Window window;
    private static boolean beforeFirstDraw;
    
    private Notifications() {
        super();
    }
    
    @Override
    public void push(@NotNull final String title, @NotNull final String message) {
        Intrinsics.checkNotNullParameter((Object)title, "title");
        Intrinsics.checkNotNullParameter((Object)message, "message");
        gg.essential.api.gui.Notifications.push$default(this, title, message, 4.0f, (Function0)Notifications$push.Notifications$push$1.INSTANCE, null, null, 48, null);
    }
    
    @JvmName(name = "push")
    @Override
    public void push(@NotNull final String title, @NotNull final String message, @NotNull final Function1<? super NotificationBuilder, Unit> configure) {
        Intrinsics.checkNotNullParameter((Object)title, "title");
        Intrinsics.checkNotNullParameter((Object)message, "message");
        Intrinsics.checkNotNullParameter((Object)configure, "configure");
        gg.essential.api.gui.Notifications.push$default(this, title, message, 0.0f, null, null, configure, 28, null);
    }
    
    @Override
    public void push(@NotNull final String title, @NotNull final String message, final float duration) {
        Intrinsics.checkNotNullParameter((Object)title, "title");
        Intrinsics.checkNotNullParameter((Object)message, "message");
        gg.essential.api.gui.Notifications.push$default(this, title, message, duration, (Function0)Notifications$push.Notifications$push$2.INSTANCE, null, null, 48, null);
    }
    
    @JvmName(name = "push")
    @Override
    public void push(@NotNull final String title, @NotNull final String message, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter((Object)title, "title");
        Intrinsics.checkNotNullParameter((Object)message, "message");
        Intrinsics.checkNotNullParameter((Object)action, "action");
        gg.essential.api.gui.Notifications.push$default(this, title, message, 4.0f, action, null, null, 48, null);
    }
    
    @JvmName(name = "push")
    @Override
    public void push(@NotNull final String title, @NotNull final String message, final float duration, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter((Object)title, "title");
        Intrinsics.checkNotNullParameter((Object)message, "message");
        Intrinsics.checkNotNullParameter((Object)action, "action");
        gg.essential.api.gui.Notifications.push$default(this, title, message, duration, action, (Function0)Notifications$pushWithDurationAndAction.Notifications$pushWithDurationAndAction$1.INSTANCE, null, 32, null);
    }
    
    @JvmName(name = "push")
    @Override
    public void push(@NotNull final String title, @NotNull final String message, final float duration, @NotNull final Function0<Unit> action, @NotNull final Function0<Unit> close) {
        Intrinsics.checkNotNullParameter((Object)title, "title");
        Intrinsics.checkNotNullParameter((Object)message, "message");
        Intrinsics.checkNotNullParameter((Object)action, "action");
        Intrinsics.checkNotNullParameter((Object)close, "close");
        this.push(title, message, duration, action, close, (Function1<? super NotificationBuilder, Unit>)Notifications$pushWithDurationActionAndClose.Notifications$pushWithDurationActionAndClose$1.INSTANCE);
    }
    
    @Override
    public void push(@NotNull final String title, @NotNull final String message, final float duration, @NotNull final Function0<Unit> action, @NotNull final Function0<Unit> close, @NotNull final Function1<? super NotificationBuilder, Unit> configure) {
        Intrinsics.checkNotNullParameter((Object)title, "title");
        Intrinsics.checkNotNullParameter((Object)message, "message");
        Intrinsics.checkNotNullParameter((Object)action, "action");
        Intrinsics.checkNotNullParameter((Object)close, "close");
        Intrinsics.checkNotNullParameter((Object)configure, "configure");
        final MinecraftClient mc = Notifications.mc;
        Intrinsics.checkNotNullExpressionValue((Object)mc, "mc");
        ExtensionsKt.getExecutor(mc).execute(Notifications::push$lambda-0);
    }
    
    private final void pushSync(final String title, final String message, final float duration, final Function0<Unit> action, final Function0<Unit> close, final Function1<? super NotificationBuilder, Unit> configure) {
        if (EssentialConfig.INSTANCE.getDisableAllNotifications() || EssentialConfig.INSTANCE.getStreamerMode()) {
            return;
        }
        final NotificationBuilderImpl notificationBuilderImpl = new NotificationBuilderImpl(title, message, duration, action, close);
        configure.invoke((Object)notificationBuilderImpl);
        final Notification notification = notificationBuilderImpl.build();
        if (Notifications.window.getChildren().size() <= 2) {
            if (!this.getBlocked()) {
                ComponentsKt.childOf((UIComponent)notification, Notifications.window);
                notification.animateIn();
                return;
            }
            ComponentsKt.childOf((UIComponent)new DelayedNotification(), Notifications.window);
        }
        Notifications.notifications.add(notification);
    }
    
    private final void addFromQueue() {
        final Notification notification2 = Notifications.notifications.poll();
        if (notification2 == null) {
            return;
        }
        final Notification notification = notification2;
        ComponentsKt.childOf((UIComponent)notification, Notifications.window);
        notification.animateIn();
    }
    
    private final boolean getBlocked() {
        return Notifications.beforeFirstDraw || Notifications.mc.getOverlay() != null;
    }
    
    public final void hide() {
        Notifications.layer.setRendered(false);
    }
    
    public final void show() {
        Notifications.layer.setRendered(true);
    }
    
    public final boolean hasActiveNotifications() {
        return Notifications.window.getChildren().size() > 0;
    }
    
    private static final void push$lambda-0(final String $title, final String $message, final float $duration, final Function0 $action, final Function0 $close, final Function1 $configure) {
        Intrinsics.checkNotNullParameter((Object)$title, "$title");
        Intrinsics.checkNotNullParameter((Object)$message, "$message");
        Intrinsics.checkNotNullParameter((Object)$action, "$action");
        Intrinsics.checkNotNullParameter((Object)$close, "$close");
        Intrinsics.checkNotNullParameter((Object)$configure, "$configure");
        Notifications.INSTANCE.pushSync($title, $message, $duration, (Function0<Unit>)$action, (Function0<Unit>)$close, (Function1<? super NotificationBuilder, Unit>)$configure);
    }
    
    public static final /* synthetic */ void access$addFromQueue(final Notifications $this) {
        $this.addFromQueue();
    }
    
    public static final /* synthetic */ void access$setBeforeFirstDraw$p$1385ff() {
        Notifications.beforeFirstDraw = false;
    }
    
    public static final /* synthetic */ boolean access$getBlocked(final Notifications $this) {
        return $this.getBlocked();
    }
    
    static {
        INSTANCE = new Notifications();
        mc = MinecraftClient.getInstance();
        notifications = new ConcurrentLinkedQueue<Notification>();
        layer = GuiUtil.INSTANCE.createPersistentLayer(LayerPriority.Notifications);
        window = Notifications.layer.getWindow();
        Notifications.beforeFirstDraw = true;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u0007
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0003
                                                       \u0002\u0010%
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\b
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0015
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020	0\b\u0012\f\u0010
                                                       \u001a\b\u0012\u0004\u0012\u00020	0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\u0006\u00106\u001a\u000207J\u0018\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u0013H\u0016R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a
                                                       \u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020	0\bX\u0096\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\u001c\u0010\u001d"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0096\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b"\u0010#"\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b&\u0010'R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020	0\bX\u0096\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b(\u0010\u001b"\u0004\b)\u0010*R \u0010
                                                       \u001a\b\u0012\u0004\u0012\u00020	0\bX\u0096\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b+\u0010\u001b"\u0004\b,\u0010*R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b-\u0010."\u0004\b/\u00100R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b1\u0010'R\u001a\u0010\u000e\u001a\u00020\rX\u0096\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b2\u00103"\u0004\b4\u00105¨\u0006;""" }, d2 = { "Lgg/essential/gui/notification/Notifications$NotificationBuilderImpl;", "Lgg/essential/api/gui/NotificationBuilder;", "title", "", "message", "duration", "", "onAction", "Lkotlin/Function0;", "", "onClose", "timerEnabled", "Lgg/essential/elementa/state/State;", "", "trimMessage", "(Ljava/lang/String;Ljava/lang/String;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lgg/essential/elementa/state/State;Z)V", "components", "", "Lgg/essential/api/gui/Slot;", "Lgg/essential/elementa/UIComponent;", "getComponents", "()Ljava/util/Map;", "dismissFuture", "Ljava/util/concurrent/CompletableFuture;", "Ljava/lang/Void;", "dismissNotification", "getDismissNotification", "()Lkotlin/jvm/functions/Function0;", "getDuration", "()F", "setDuration", "(F)V", "elementaVersion", "Lgg/essential/elementa/ElementaVersion;", "getElementaVersion", "()Lgg/essential/elementa/ElementaVersion;", "setElementaVersion", "(Lgg/essential/elementa/ElementaVersion;)V", "getMessage", "()Ljava/lang/String;", "getOnAction", "setOnAction", "(Lkotlin/jvm/functions/Function0;)V", "getOnClose", "setOnClose", "getTimerEnabled", "()Lgg/essential/elementa/state/State;", "setTimerEnabled", "(Lgg/essential/elementa/state/State;)V", "getTitle", "getTrimMessage", "()Z", "setTrimMessage", "(Z)V", "build", "Lgg/essential/gui/notification/Notification;", "withCustomComponent", "slot", "component", "essential" })
    public static final class NotificationBuilderImpl implements NotificationBuilder
    {
        @NotNull
        private final String title;
        @NotNull
        private final String message;
        private float duration;
        @NotNull
        private Function0<Unit> onAction;
        @NotNull
        private Function0<Unit> onClose;
        @NotNull
        private State<Boolean> timerEnabled;
        private boolean trimMessage;
        @NotNull
        private final Map<Slot, UIComponent> components;
        @NotNull
        private ElementaVersion elementaVersion;
        @NotNull
        private final CompletableFuture<Void> dismissFuture;
        @NotNull
        private final Function0<Unit> dismissNotification;
        
        public NotificationBuilderImpl(@NotNull final String title, @NotNull final String message, final float duration, @NotNull final Function0<Unit> onAction, @NotNull final Function0<Unit> onClose, @NotNull final State<Boolean> timerEnabled) {
            Intrinsics.checkNotNullParameter((Object)title, "title");
            Intrinsics.checkNotNullParameter((Object)message, "message");
            Intrinsics.checkNotNullParameter((Object)onAction, "onAction");
            Intrinsics.checkNotNullParameter((Object)onClose, "onClose");
            Intrinsics.checkNotNullParameter((Object)timerEnabled, "timerEnabled");
            super();
            this.title = title;
            this.message = message;
            this.duration = duration;
            this.onAction = onAction;
            this.onClose = onClose;
            this.timerEnabled = timerEnabled;
            this.trimMessage = false;
            this.components = new LinkedHashMap<Slot, UIComponent>();
            this.elementaVersion = ElementaVersion.V1;
            this.dismissFuture = new CompletableFuture<Void>();
            this.dismissNotification = (Function0<Unit>)new Notifications$NotificationBuilderImpl$dismissNotification.Notifications$NotificationBuilderImpl$dismissNotification$1(this);
        }
        
        public NotificationBuilderImpl(final String title, final String message, final float duration, final Function0 onAction, final Function0 onClose) {
            this(title, message, duration, (Function0<Unit>)onAction, (Function0<Unit>)onClose, new BasicState<Boolean>(true));
        }
        
        @Override
        public float getDuration() {
            return this.duration;
        }
        
        @Override
        public void setDuration(final float <set-?>) {
            this.duration = <set-?>;
        }
        
        @NotNull
        @Override
        public Function0<Unit> getOnAction() {
            return this.onAction;
        }
        
        @Override
        public void setOnAction(@NotNull final Function0<Unit> <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            this.onAction = <set-?>;
        }
        
        @NotNull
        @Override
        public Function0<Unit> getOnClose() {
            return this.onClose;
        }
        
        @Override
        public void setOnClose(@NotNull final Function0<Unit> <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            this.onClose = <set-?>;
        }
        
        @NotNull
        @Override
        public State<Boolean> getTimerEnabled() {
            return this.timerEnabled;
        }
        
        @Override
        public void setTimerEnabled(@NotNull final State<Boolean> <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            this.timerEnabled = <set-?>;
        }
        
        @Override
        public boolean getTrimMessage() {
            return this.trimMessage;
        }
        
        @Override
        public void setTrimMessage(final boolean <set-?>) {
            this.trimMessage = <set-?>;
        }
        
        @NotNull
        public final Map<Slot, UIComponent> getComponents() {
            return this.components;
        }
        
        @NotNull
        @Override
        public ElementaVersion getElementaVersion() {
            return this.elementaVersion;
        }
        
        @Override
        public void setElementaVersion(@NotNull final ElementaVersion <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            this.elementaVersion = <set-?>;
        }
        
        @NotNull
        @Override
        public Function0<Unit> getDismissNotification() {
            return this.dismissNotification;
        }
        
        @NotNull
        @Override
        public NotificationBuilderImpl withCustomComponent(@NotNull final Slot slot, @NotNull final UIComponent component) {
            Intrinsics.checkNotNullParameter((Object)slot, "slot");
            Intrinsics.checkNotNullParameter((Object)component, "component");
            final NotificationBuilderImpl $this$withCustomComponent_u24lambda_u2d0 = this;
            $this$withCustomComponent_u24lambda_u2d0.components.put(slot, component);
            return this;
        }
        
        @NotNull
        public final Notification build() {
            final Notification it = new Notification(this.message, this.title, this.getTimerEnabled(), this.getDuration(), this.getOnAction(), (Function0<Unit>)new Notifications$NotificationBuilderImpl$build.Notifications$NotificationBuilderImpl$build$1(this), this.getTrimMessage(), this.dismissFuture);
            it.getContent().applyBuilder(this);
            return it;
        }
        
        @Override
        public /* bridge */ NotificationBuilder withCustomComponent(final Slot slot, final UIComponent component) {
            return this.withCustomComponent(slot, component);
        }
        
        public static final /* synthetic */ CompletableFuture access$getDismissFuture$p(final NotificationBuilderImpl $this) {
            return $this.dismissFuture;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0018
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000b
                                                       \u0000
                                                       \u0002\u0010\u0002
                                                       \u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002
                                                       \u0000¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/notification/Notifications$DelayedNotification;", "Lgg/essential/elementa/components/UIContainer;", "()V", "triggered", "", "animationFrame", "", "essential" })
    private static final class DelayedNotification extends UIContainer
    {
        private boolean triggered;
        
        public DelayedNotification() {
            super();
        }
        
        @Override
        public void animationFrame() {
            final Notifications instance = Notifications.INSTANCE;
            Notifications.access$setBeforeFirstDraw$p$1385ff();
            if (!this.triggered && !Notifications.INSTANCE.getBlocked()) {
                this.triggered = true;
                Window.Companion.enqueueRenderOperation((Function0<Unit>)new Notifications$DelayedNotification$animationFrame.Notifications$DelayedNotification$animationFrame$1(this));
            }
            super.animationFrame();
        }
    }
}
