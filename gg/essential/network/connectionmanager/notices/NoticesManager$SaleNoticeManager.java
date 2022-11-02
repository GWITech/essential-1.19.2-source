package gg.essential.network.connectionmanager.notices;

import gg.essential.gui.state.*;
import gg.essential.elementa.state.*;
import gg.essential.notices.model.*;
import gg.essential.notices.*;
import gg.essential.*;
import java.util.function.*;
import net.minecraft.client.*;
import gg.essential.util.*;
import java.time.*;
import java.time.temporal.*;
import java.util.concurrent.*;
import gg.essential.api.utils.*;
import java.util.*;
import gg.essential.gui.common.*;

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
