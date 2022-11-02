package gg.essential.gui.menu;

import net.minecraft.client.util.*;
import gg.essential.elementa.utils.*;
import gg.essential.universal.*;
import gg.essential.handlers.account.*;
import java.lang.ref.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.menu.full.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.menu.compact.*;
import gg.essential.*;
import java.util.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.account.factory.*;
import gg.essential.util.*;
import java.util.concurrent.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000T
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010
                                                   \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012
                                                    	*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u001e""" }, d2 = { "Lgg/essential/gui/menu/AccountManager;", "", "()V", "accountsList", "Lgg/essential/elementa/utils/ObservableList;", "Lgg/essential/gui/menu/AccountManager$AccountInfo;", "activeSession", "Lgg/essential/elementa/state/BasicState;", "Lnet/minecraft/client/util/Session;", "kotlin.jvm.PlatformType", "getCompactAccountSwitcher", "Lgg/essential/gui/menu/compact/CompactAccountSwitcher;", "sidebarContainer", "Lgg/essential/elementa/components/UIContainer;", "getFullAccountSwitcher", "Lgg/essential/gui/menu/full/FullAccountSwitcher;", "collapsed", "Lgg/essential/elementa/state/State;", "", "login", "", "uuid", "Ljava/util/UUID;", "promptRemove", "name", "", "refreshAccounts", "removeAccount", "AccountInfo", "Companion", "essential" })
public final class AccountManager
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final BasicState<Session> activeSession;
    @NotNull
    private final ObservableList<AccountManager.AccountInfo> accountsList;
    
    public AccountManager() {
        super();
        this.activeSession = new BasicState<Session>(UMinecraft.getMinecraft().getSession());
        this.accountsList = new ObservableList<AccountManager.AccountInfo>(new ArrayList<AccountManager.AccountInfo>());
        this.refreshAccounts();
        WebAccountManager.INSTANCE.setMostRecentAccountManager(new WeakReference<AccountManager>(this));
    }
    
    @NotNull
    public final FullAccountSwitcher getFullAccountSwitcher(@NotNull final State<Boolean> collapsed) {
        Intrinsics.checkNotNullParameter((Object)collapsed, "collapsed");
        return new FullAccountSwitcher(this.activeSession, this.accountsList, collapsed, this);
    }
    
    @NotNull
    public final CompactAccountSwitcher getCompactAccountSwitcher(@NotNull final UIContainer sidebarContainer) {
        Intrinsics.checkNotNullParameter((Object)sidebarContainer, "sidebarContainer");
        return new CompactAccountSwitcher(this.activeSession, this.accountsList, sidebarContainer, this);
    }
    
    private final void refreshAccounts() {
        this.accountsList.clear();
        final List<SessionFactory> sessionFactories = Essential.getInstance().getSessionFactories();
        Intrinsics.checkNotNullExpressionValue((Object)sessionFactories, "getInstance().sessionFactories");
        final Iterable $this$forEach$iv = sessionFactories;
        for (final Object element$iv : $this$forEach$iv) {
            final SessionFactory sessionFactory = (SessionFactory)element$iv;
            final Map $this$filterKeys$iv = sessionFactory.getSessions();
            final LinkedHashMap result$iv = new LinkedHashMap();
            for (final Map.Entry entry$iv : $this$filterKeys$iv.entrySet()) {
                final UUID uuid = entry$iv.getKey();
                final Iterable $this$none$iv = this.accountsList;
                boolean b = false;
                Label_0205: {
                    if ($this$none$iv instanceof Collection && ((Collection)$this$none$iv).isEmpty()) {
                        b = true;
                    }
                    else {
                        for (final Object element$iv2 : $this$none$iv) {
                            final AccountManager.AccountInfo it = (AccountManager.AccountInfo)element$iv2;
                            if (Intrinsics.areEqual((Object)it.getUuid(), (Object)uuid)) {
                                b = false;
                                break Label_0205;
                            }
                        }
                        b = true;
                    }
                }
                if (b && !Intrinsics.areEqual((Object)uuid, (Object)this.activeSession.get().getProfile().getId())) {
                    result$iv.put(entry$iv.getKey(), entry$iv.getValue());
                }
            }
            final Map $this$forEach$iv2 = result$iv;
            for (final Map.Entry it2 : $this$forEach$iv2.entrySet()) {
                final Map.Entry element$iv3 = it2;
                final ObservableList<AccountManager.AccountInfo> accountsList = this.accountsList;
                final UUID uuid2 = it2.getKey();
                final String name = it2.getValue().getProfile().getName();
                Intrinsics.checkNotNullExpressionValue((Object)name, "it.value.profile.name");
                accountsList.add(new AccountManager.AccountInfo(uuid2, name));
            }
        }
    }
    
    public final void login(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        if (!Intrinsics.areEqual((Object)this.activeSession.get().getProfile().getId(), (Object)uuid)) {
            AccountManager.Companion.refreshSession$default$532a872a$6a749132(AccountManager.Companion, uuid, (Function2)new AccountManager$login.AccountManager$login$1(this));
        }
    }
    
    public final void promptRemove(@NotNull final UUID uuid, @NotNull final String name) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "uuid"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* name */
        //     7: ldc_w           "name"
        //    10: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    13: getstatic       gg/essential/util/GuiUtil.INSTANCE:Lgg/essential/util/GuiUtil;
        //    16: new             Lgg/essential/gui/common/modal/DangerConfirmationEssentialModal;
        //    19: dup            
        //    20: ldc_w           "Remove"
        //    23: invokespecial   gg/essential/gui/common/modal/DangerConfirmationEssentialModal.<init>:(Ljava/lang/String;)V
        //    26: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //    29: astore_3        /* $this$configure$iv */
        //    30: aload_3         /* $this$configure$iv */
        //    31: astore          4
        //    33: aload           4
        //    35: astore          $this$configure_u24lambda_u2d0$iv
        //    37: aload           $this$configure_u24lambda_u2d0$iv
        //    39: checkcast       Lgg/essential/gui/common/modal/DangerConfirmationEssentialModal;
        //    42: astore          6
        //    44: astore          7
        //    46: aload           $this$promptRemove_u24lambda_u2d4
        //    48: aload_2         /* name */
        //    49: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //    54: invokevirtual   gg/essential/gui/common/modal/DangerConfirmationEssentialModal.setContentText:(Ljava/lang/String;)V
        //    57: aload           7
        //    59: aload           4
        //    61: checkcast       Lgg/essential/gui/common/modal/DangerConfirmationEssentialModal;
        //    64: new             Lgg/essential/gui/menu/AccountManager$promptRemove$2;
        //    67: dup            
        //    68: aload_0         /* this */
        //    69: aload_1         /* uuid */
        //    70: invokespecial   gg/essential/gui/menu/AccountManager$promptRemove$2.<init>:(Lgg/essential/gui/menu/AccountManager;Ljava/util/UUID;)V
        //    73: checkcast       Lkotlin/jvm/functions/Function0;
        //    76: invokevirtual   gg/essential/gui/common/modal/DangerConfirmationEssentialModal.onPrimaryAction:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    79: checkcast       Lgg/essential/gui/common/modal/Modal;
        //    82: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //    85: pop            
        //    86: return         
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  uuid  
        //  name  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void removeAccount(@NotNull final UUID uuid) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "uuid"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //     9: invokevirtual   gg/essential/Essential.getSessionFactories:()Ljava/util/List;
        //    12: dup            
        //    13: ldc             "getInstance().sessionFactories"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: checkcast       Ljava/lang/Iterable;
        //    21: astore_2        /* $this$filterIsInstance$iv */
        //    22: aload_2         /* $this$filterIsInstance$iv */
        //    23: astore_3       
        //    24: new             Ljava/util/ArrayList;
        //    27: dup            
        //    28: invokespecial   java/util/ArrayList.<init>:()V
        //    31: checkcast       Ljava/util/Collection;
        //    34: astore          destination$iv$iv
        //    36: aload_3         /* $this$filterIsInstanceTo$iv$iv */
        //    37: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    42: astore          6
        //    44: aload           6
        //    46: invokeinterface java/util/Iterator.hasNext:()Z
        //    51: ifeq            84
        //    54: aload           6
        //    56: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    61: astore          element$iv$iv
        //    63: aload           element$iv$iv
        //    65: instanceof      Lgg/essential/gui/account/factory/ManagedSessionFactory;
        //    68: ifeq            44
        //    71: aload           destination$iv$iv
        //    73: aload           element$iv$iv
        //    75: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    80: pop            
        //    81: goto            44
        //    84: aload           destination$iv$iv
        //    86: checkcast       Ljava/util/List;
        //    89: checkcast       Ljava/lang/Iterable;
        //    92: astore_2        /* $this$forEach$iv */
        //    93: aload_2         /* $this$forEach$iv */
        //    94: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    99: astore_3       
        //   100: aload_3        
        //   101: invokeinterface java/util/Iterator.hasNext:()Z
        //   106: ifeq            135
        //   109: aload_3        
        //   110: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   115: astore          element$iv
        //   117: aload           element$iv
        //   119: checkcast       Lgg/essential/gui/account/factory/ManagedSessionFactory;
        //   122: astore          it
        //   124: aload           it
        //   126: aload_1         /* uuid */
        //   127: invokeinterface gg/essential/gui/account/factory/ManagedSessionFactory.remove:(Ljava/util/UUID;)V
        //   132: goto            100
        //   135: aload_0         /* this */
        //   136: invokespecial   gg/essential/gui/menu/AccountManager.refreshAccounts:()V
        //   139: return         
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  uuid  
        //    StackMapTable: 00 04 FF 00 2C 00 07 07 00 02 07 00 BC 07 00 95 07 00 95 07 00 BE 00 07 00 9B 00 00 27 FF 00 0F 00 07 07 00 02 07 00 BC 07 00 95 07 00 9B 07 00 04 00 07 00 9B 00 00 22
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmStatic
    @JvmOverloads
    public static final void refreshCurrentSession$1385ff() {
        AccountManager.Companion.refreshCurrentSession$1385ff();
    }
    
    public static final /* synthetic */ BasicState access$getActiveSession$p(final AccountManager $this) {
        return $this.activeSession;
    }
    
    public static final /* synthetic */ void access$refreshAccounts(final AccountManager $this) {
        $this.refreshAccounts();
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00006
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u0002
                                                       \u0000
                                                       \u0002\u0010\u000b
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062<\b\u0002\u0010\u0007\u001a6\u0012\u0013\u0012\u00110	¢\u0006\f\b
                                                       \u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b
                                                       \u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0007JX\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00062<\b\u0002\u0010\u0007\u001a6\u0012\u0013\u0012\u00110	¢\u0006\f\b
                                                       \u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b
                                                       \u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0007¨\u0006\u0012""" }, d2 = { "Lgg/essential/gui/menu/AccountManager$Companion;", "", "()V", "refreshCurrentSession", "", "force", "", "callback", "Lkotlin/Function2;", "Lnet/minecraft/client/util/Session;", "Lkotlin/ParameterName;", "name", "session", "", "error", "refreshSession", "uuid", "Ljava/util/UUID;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @JvmOverloads
        public final void refreshCurrentSession(final boolean force, @Nullable final Function2<? super Session, ? super String, Unit> callback) {
            final UUID id = UMinecraft.getMinecraft().getSession().getProfile().getId();
            Intrinsics.checkNotNullExpressionValue((Object)id, "getMinecraft().session.profile.id");
            this.refreshSession(id, force, callback);
        }
        
        public static /* synthetic */ void refreshCurrentSession$default$666edfaa$653bc506(final Companion companion, final boolean b) {
            companion.refreshCurrentSession(true, null);
        }
        
        @JvmStatic
        @JvmOverloads
        public final void refreshSession(@NotNull final UUID uuid, final boolean force, @Nullable final Function2<? super Session, ? super String, Unit> callback) {
            Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
            final MinecraftClient mc = UMinecraft.getMinecraft();
            final List<SessionFactory> sessionFactories = Essential.getInstance().getSessionFactories();
            Intrinsics.checkNotNullExpressionValue((Object)sessionFactories, "getInstance().sessionFactories");
            while (true) {
                for (final Object next : sessionFactories) {
                    final SessionFactory it = (SessionFactory)next;
                    if (it.getSessions().containsKey(uuid)) {
                        final SessionFactory sessionFactory = (SessionFactory)next;
                        final SessionFactory sessionFactory2 = sessionFactory;
                        final ManagedSessionFactory factory = (sessionFactory2 instanceof ManagedSessionFactory) ? ((ManagedSessionFactory)sessionFactory2) : null;
                        if (factory == null) {
                            final List<SessionFactory> sessionFactories2 = Essential.getInstance().getSessionFactories();
                            Intrinsics.checkNotNullExpressionValue((Object)sessionFactories2, "getInstance().sessionFactories");
                            while (true) {
                                for (final Object next2 : sessionFactories2) {
                                    final SessionFactory it2 = (SessionFactory)next2;
                                    if (it2.getSessions().containsKey(uuid)) {
                                        final SessionFactory sessionFactory3 = (SessionFactory)next2;
                                        final SessionFactory sessionFactory4 = sessionFactory3;
                                        final InitialSessionFactory initialSessionFactory = (sessionFactory4 instanceof InitialSessionFactory) ? ((InitialSessionFactory)sessionFactory4) : null;
                                        if (initialSessionFactory == null) {
                                            refreshSession$error$default$4f00b92b$1a65acc7(callback, mc, "Failed to refresh session: Unknown account");
                                            return;
                                        }
                                        final InitialSessionFactory initialSession = initialSessionFactory;
                                        final MinecraftClient minecraft = UMinecraft.getMinecraft();
                                        final Session value = initialSession.getSessions().get(uuid);
                                        Intrinsics.checkNotNull((Object)value);
                                        ExtensionsKt.setSession(minecraft, value);
                                        if (callback != null) {
                                            final Session value2 = initialSession.getSessions().get(uuid);
                                            Intrinsics.checkNotNull((Object)value2);
                                            callback.invoke((Object)value2, (Object)null);
                                        }
                                        return;
                                    }
                                }
                                final SessionFactory sessionFactory3 = null;
                                continue;
                            }
                        }
                        CompletableFuture.supplyAsync(Companion::refreshSession$lambda-1).whenCompleteAsync(Companion::refreshSession$lambda-3, ExtensionsKt.getExecutor(mc));
                        return;
                    }
                }
                final SessionFactory sessionFactory = null;
                continue;
            }
        }
        
        public static /* synthetic */ void refreshSession$default$532a872a$6a749132(final Companion companion, final UUID uuid, final Function2 callback) {
            companion.refreshSession(uuid, false, (Function2<? super Session, ? super String, Unit>)callback);
        }
        
        @JvmStatic
        @JvmOverloads
        public final void refreshCurrentSession$1385ff() {
            refreshCurrentSession$default$666edfaa$653bc506(this, true);
        }
        
        private static final void refreshSession$error(final Function2<? super Session, ? super String, Unit> $callback, final MinecraftClient mc, final String message, final Throwable throwable) {
            Essential.logger.error(message, throwable);
            if ($callback != null) {
                final Session session = mc.getSession();
                Intrinsics.checkNotNullExpressionValue((Object)session, "mc.session");
                $callback.invoke((Object)session, (Object)message);
            }
        }
        
        static /* synthetic */ void refreshSession$error$default$4f00b92b$1a65acc7(final Function2 $callback, final MinecraftClient mc, final String message) {
            refreshSession$error((Function2<? super Session, ? super String, Unit>)$callback, mc, message, null);
        }
        
        private static final Session refreshSession$lambda-1(final ManagedSessionFactory $factory, final UUID $uuid, final boolean $force) {
            Intrinsics.checkNotNullParameter((Object)$uuid, "$uuid");
            final Session value = $factory.getSessions().get($uuid);
            Intrinsics.checkNotNull((Object)value);
            return $factory.refresh(value, $force);
        }
        
        private static final void refreshSession$lambda-3(final Function2 $callback, final MinecraftClient $mc, final Session session, final Throwable err) {
            Intrinsics.checkNotNullParameter((Object)$mc, "$mc");
            if (session != null) {
                Essential.logger.info("Successfully refreshed session token.");
                ExtensionsKt.setSession(UMinecraft.getMinecraft(), session);
                if ($callback != null) {
                    $callback.invoke((Object)session, (Object)null);
                }
            }
            else if (err != null) {
                final Throwable it = err;
                refreshSession$error((Function2<? super Session, ? super String, Unit>)$callback, $mc, "Failed to refresh session: " + it.getMessage(), it);
            }
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
