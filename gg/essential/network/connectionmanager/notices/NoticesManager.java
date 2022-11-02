package gg.essential.network.connectionmanager.notices;

import gg.essential.notices.model.*;
import gg.essential.network.connectionmanager.*;
import com.google.common.collect.*;
import gg.essential.network.connectionmanager.handler.*;
import gg.essential.network.connectionmanager.notices.handler.*;
import gg.essential.notices.*;
import org.jetbrains.annotations.*;
import java.util.stream.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.connectionmanager.common.packet.response.*;
import gg.essential.*;
import kotlin.collections.*;
import gg.essential.connectionmanager.common.packet.notices.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.*;
import gg.essential.network.cosmetics.*;
import gg.essential.gui.state.*;
import java.util.*;
import java.util.function.*;
import net.minecraft.client.*;
import gg.essential.util.*;
import java.time.*;
import java.time.temporal.*;
import java.util.concurrent.*;
import gg.essential.api.utils.*;

public class NoticesManager implements NetworkedManager
{
    @NotNull
    private final Map<String, Notice> notices;
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final CosmeticNotices cosmeticNotices;
    @NotNull
    private final SaleNoticeManager saleNoticeManager;
    @NotNull
    private final SocialMenuNewFriendRequestNoticeManager socialMenuNewFriendRequestNoticeManager;
    private final List<NoticeListener> listeners;
    
    public NoticesManager(@NotNull final ConnectionManager connectionManager) {
        super();
        this.notices = (Map<String, Notice>)Maps.newConcurrentMap();
        this.cosmeticNotices = new CosmeticNotices();
        this.saleNoticeManager = new SaleNoticeManager();
        this.listeners = new ArrayList<NoticeListener>(Arrays.asList(this.cosmeticNotices, this.saleNoticeManager));
        (this.connectionManager = connectionManager).registerPacketHandler(ServerNoticePopulatePacket.class, new ServerNoticePopulatePacketHandler(this));
        connectionManager.registerPacketHandler(ServerNoticeRemovePacket.class, new ServerNoticeRemovePacketHandler(this));
        this.listeners.add((NoticeListener)new FriendRequestToastNoticeListener(connectionManager, this));
        this.socialMenuNewFriendRequestNoticeManager = new SocialMenuNewFriendRequestNoticeManager(this);
        this.listeners.add((NoticeListener)this.socialMenuNewFriendRequestNoticeManager);
    }
    
    @NotNull
    public List<Notice> getNotices(@NotNull final NoticeType noticeType, @Nullable final Set<String> metadataKeys, @Nullable final Map<String, Object> metadataValues) {
        return this.notices.values().stream().filter(notice -> notice.getType() == noticeType).filter(notice -> {
            if (metadataKeys == null || metadataKeys.isEmpty()) {
                return true;
            }
            else {
                final Map<String, Object> metadata = notice.getMetadata();
                if (metadata.isEmpty()) {
                    return false;
                }
                else {
                    metadataKeys.iterator();
                    final Iterator iterator;
                    while (iterator.hasNext()) {
                        final String metadataKey = iterator.next();
                        if (!metadata.containsKey(metadataKey)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }).filter(notice -> {
            if (metadataValues == null || metadataValues.isEmpty()) {
                return true;
            }
            else {
                final Map<String, Object> metadata2 = notice.getMetadata();
                if (metadata2.isEmpty()) {
                    return false;
                }
                else {
                    metadataValues.entrySet().iterator();
                    final Iterator iterator2;
                    if (iterator2.hasNext()) {
                        final Map.Entry<String, Object> entry = iterator2.next();
                        final Object metadataValue = metadata2.get(entry.getKey());
                        return metadataValue != null && Objects.equals(metadataValue, entry.getValue());
                    }
                    else {
                        return false;
                    }
                }
            }
        }).collect((Collector<? super Notice, ?, List<Notice>>)Collectors.toList());
    }
    
    public void populateNotices(@NotNull final Collection<Notice> notices) {
        for (final Notice notice : notices) {
            this.notices.put(notice.getId(), notice);
            for (final NoticeListener listener : this.listeners) {
                listener.noticeAdded(notice);
            }
        }
    }
    
    public void removeNotices(@Nullable final Set<String> noticeIds) {
        if (noticeIds == null || noticeIds.isEmpty()) {
            for (final Notice value : this.notices.values()) {
                for (final NoticeListener listener : this.listeners) {
                    listener.noticeRemoved(value);
                }
            }
            this.notices.clear();
            return;
        }
        for (final String noticeId : noticeIds) {
            final Notice removed = this.notices.remove(noticeId);
            if (removed == null) {
                continue;
            }
            for (final NoticeListener listener2 : this.listeners) {
                listener2.noticeRemoved(removed);
            }
        }
    }
    
    public void dismissNotice(final String noticeId) {
        this.connectionManager.send(new ClientNoticeDismissPacket(noticeId), packet -> {
            if (packet.isPresent()) {
                final Packet packet2 = packet.get();
                if (packet2 instanceof ResponseActionPacket && ((ResponseActionPacket)packet2).isSuccessful()) {
                    this.notices.remove(noticeId);
                    return;
                }
            }
            Essential.logger.error("Unexpected notice response: " + packet);
        });
    }
    
    public SocialMenuNewFriendRequestNoticeManager getSocialMenuNewFriendRequestNoticeManager() {
        return this.socialMenuNewFriendRequestNoticeManager;
    }
    
    @Override
    public void resetState() {
        this.notices.clear();
        this.listeners.forEach(NoticeListener::resetState);
    }
    
    @Override
    public void onConnected() {
        this.resetState();
        this.connectionManager.send(new ClientNoticeRequestPacket(null, SetsKt.setOf((Object[])NoticeType.values()), null, null));
        this.listeners.forEach(NoticeListener::onConnect);
    }
    
    @NotNull
    public CosmeticNotices getCosmeticNotices() {
        return this.cosmeticNotices;
    }
    
    @NotNull
    public SaleNoticeManager getSaleNoticeManager() {
        return this.saleNoticeManager;
    }
    
    private /* synthetic */ void lambda$dismissNotice$3(final String noticeId, final Optional packet) {
        if (packet.isPresent()) {
            final Packet packet2 = packet.get();
            if (packet2 instanceof ResponseActionPacket && ((ResponseActionPacket)packet2).isSuccessful()) {
                this.notices.remove(noticeId);
                return;
            }
        }
        Essential.logger.error("Unexpected notice response: " + packet);
    }
    
    private static /* synthetic */ boolean lambda$getNotices$2(final Map metadataValues, final Notice notice) {
        if (metadataValues == null || metadataValues.isEmpty()) {
            return true;
        }
        final Map<String, Object> metadata = notice.getMetadata();
        if (metadata.isEmpty()) {
            return false;
        }
        final Iterator iterator = metadataValues.entrySet().iterator();
        if (iterator.hasNext()) {
            final Map.Entry<String, Object> entry = (Map.Entry<String, Object>)iterator.next();
            final Object metadataValue = metadata.get(entry.getKey());
            return metadataValue != null && Objects.equals(metadataValue, entry.getValue());
        }
        return false;
    }
    
    private static /* synthetic */ boolean lambda$getNotices$1(final Set metadataKeys, final Notice notice) {
        if (metadataKeys == null || metadataKeys.isEmpty()) {
            return true;
        }
        final Map<String, Object> metadata = notice.getMetadata();
        if (metadata.isEmpty()) {
            return false;
        }
        for (final String metadataKey : metadataKeys) {
            if (!metadata.containsKey(metadataKey)) {
                return false;
            }
        }
        return true;
    }
    
    private static /* synthetic */ boolean lambda$getNotices$0(final NoticeType noticeType, final Notice notice) {
        return notice.getType() == noticeType;
    }
    
    interface NoticeListener
    {
        void noticeAdded(final Notice p0);
        
        void noticeRemoved(final Notice p0);
        
        void onConnect();
        
        default void resetState() {
        }
    }
    
    public class CosmeticNotices implements NoticeListener
    {
        private final ConcurrentHashMap<String, State<Boolean>> cosmeticToNewStateMap;
        private final State<Boolean> hasAnyNewCosmetics;
        final /* synthetic */ NoticesManager this$0;
        
        public CosmeticNotices(final NoticesManager this$0) {
            this.this$0 = this$0;
            super();
            this.cosmeticToNewStateMap = new ConcurrentHashMap<String, State<Boolean>>();
            this.hasAnyNewCosmetics = new BasicState<Boolean>(false);
        }
        
        public State<Boolean> getNewState(final String cosmeticId) {
            return new WeakState<Boolean>(this.cosmeticToNewStateMap.computeIfAbsent(cosmeticId, ignored -> new BasicState(false)));
        }
        
        private Notice getNotice(final String cosmeticId) {
            final List<Notice> notices = this.this$0.getNotices(NoticeType.NEW_BANNER, null, new HashMap<String, Object>() {
                final /* synthetic */ String val$cosmeticId;
                
                NoticesManager$CosmeticNotices$1() {
                    super();
                }
                
                {
                    ((HashMap<String, String>)this).put("cosmetic_id", cosmeticId);
                }
            });
            if (!notices.isEmpty()) {
                return notices.get(0);
            }
            return null;
        }
        
        public void clearNewState(final String cosmeticId) {
            final State<Boolean> booleanState = this.cosmeticToNewStateMap.get(cosmeticId);
            if (booleanState != null) {
                booleanState.set(false);
            }
            final Notice notice = this.getNotice(cosmeticId);
            if (notice != null) {
                this.this$0.dismissNotice(notice.getId());
            }
            this.updateGlobalState();
        }
        
        private void updateGlobalState() {
            this.hasAnyNewCosmetics.set(this.cosmeticToNewStateMap.entrySet().stream().anyMatch(entry -> {
                if (!entry.getValue().get()) {
                    return false;
                }
                else {
                    final Cosmetic cosmetic = this.this$0.connectionManager.getCosmeticsManager().getCosmetic(entry.getKey());
                    return cosmetic != null && cosmetic.isAvailable();
                }
            }));
        }
        
        public State<Boolean> getHasAnyNewCosmetics() {
            return new WeakState<Boolean>(this.hasAnyNewCosmetics);
        }
        
        @Override
        public void noticeAdded(final Notice notice) {
            if (notice.getType() == NoticeType.NEW_BANNER && notice.getMetadata().containsKey("cosmetic_id")) {
                final String cosmeticId = notice.getMetadata().get("cosmetic_id");
                this.cosmeticToNewStateMap.computeIfAbsent(cosmeticId, ignored -> new BasicState(true)).set(true);
                this.updateGlobalState();
            }
        }
        
        @Override
        public void noticeRemoved(final Notice notice) {
        }
        
        @Override
        public void onConnect() {
            this.resetState();
        }
        
        public void cosmeticAdded(final String id) {
            final State<Boolean> existingState = this.cosmeticToNewStateMap.get(id);
            if (existingState != null && existingState.get()) {
                this.updateGlobalState();
            }
        }
        
        private static /* synthetic */ State lambda$noticeAdded$2(final String ignored) {
            return new BasicState(true);
        }
        
        private /* synthetic */ boolean lambda$updateGlobalState$1(final Map.Entry entry) {
            if (!entry.getValue().get()) {
                return false;
            }
            final Cosmetic cosmetic = this.this$0.connectionManager.getCosmeticsManager().getCosmetic(entry.getKey());
            return cosmetic != null && cosmetic.isAvailable();
        }
        
        private static /* synthetic */ State lambda$getNewState$0(final String ignored) {
            return new BasicState(false);
        }
    }
    
    public class SaleNoticeManager implements NoticeListener
    {
        private final boolean saleSuppressedByJvmFlag;
        private final State<Set<Sale>> currentState;
        private final Map<String, Sale> salesMap;
        private ScheduledFuture<?> nextUpdateFuture;
        
        public SaleNoticeManager() {
            super();
            this.saleSuppressedByJvmFlag = System.getProperty("essential.disableSale", "false").equals("true");
            this.currentState = new BasicState<Set<Sale>>(Collections.emptySet());
            this.salesMap = new HashMap<String, Sale>();
            this.nextUpdateFuture = null;
        }
        
        @Override
        public void noticeAdded(final Notice notice) {
            if (this.saleSuppressedByJvmFlag) {
                return;
            }
            if (notice.getType() == NoticeType.SALE) {
                if (notice.getExpiresAt() == null) {
                    Essential.logger.error("Notice " + notice.getId() + " is type sale but does not have an expiration date set!");
                    return;
                }
                final int discount = notice.getMetadata().get("discount").intValue();
                Set<Integer> packagesSet = null;
                if (notice.getMetadata().containsKey("packages")) {
                    packagesSet = new HashSet<Integer>();
                    for (final Number packages : notice.getMetadata().get("packages")) {
                        packagesSet.add(packages.intValue());
                    }
                    if (packagesSet.isEmpty()) {
                        packagesSet = null;
                    }
                }
                this.salesMap.put(notice.getId(), new Sale(notice.getExpiresAt().toInstant(), (String)notice.getMetadata().get("sale_name"), discount, (Set)packagesSet));
                this.refreshState();
            }
        }
        
        private void refreshState() {
            this.currentState.set(new HashSet<Sale>(this.salesMap.values()));
            this.scheduleUpdate();
        }
        
        private void scheduleUpdate() {
            if (this.nextUpdateFuture != null) {
                this.nextUpdateFuture.cancel(false);
            }
            final Optional<Sale> first = this.salesMap.values().stream().min(Comparator.comparing((Function<? super Sale, ? extends Comparable>)Sale::getExpiration));
            if (first.isPresent()) {
                final Sale sale = first.get();
                this.nextUpdateFuture = Multithreading.schedule(() -> ExtensionsKt.getExecutor(MinecraftClient.getInstance()).execute(() -> {
                    final Instant now = Instant.now();
                    if (this.salesMap.entrySet().removeIf(entry -> entry.getValue().getExpiration().isBefore(now))) {
                        this.refreshState();
                    }
                }), Instant.now().until(sale.getExpiration(), ChronoUnit.MILLIS) + 1000L, TimeUnit.MILLISECONDS);
            }
        }
        
        public State<Set<Sale>> getSaleState() {
            return new WeakState<Set<Sale>>(this.currentState);
        }
        
        @Override
        public void noticeRemoved(final Notice notice) {
            if (notice.getType() == NoticeType.SALE) {
                this.salesMap.remove(notice.getId());
                this.refreshState();
            }
        }
        
        @Override
        public void onConnect() {
        }
        
        private /* synthetic */ void lambda$scheduleUpdate$2() {
            ExtensionsKt.getExecutor(MinecraftClient.getInstance()).execute(() -> {
                final Instant now = Instant.now();
                if (this.salesMap.entrySet().removeIf(entry -> entry.getValue().getExpiration().isBefore(now))) {
                    this.refreshState();
                }
            });
        }
        
        private /* synthetic */ void lambda$scheduleUpdate$1() {
            final Instant now = Instant.now();
            if (this.salesMap.entrySet().removeIf(entry -> entry.getValue().getExpiration().isBefore(now))) {
                this.refreshState();
            }
        }
        
        private static /* synthetic */ boolean lambda$scheduleUpdate$0(final Instant now, final Map.Entry entry) {
            return entry.getValue().getExpiration().isBefore(now);
        }
    }
}
