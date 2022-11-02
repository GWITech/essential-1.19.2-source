package gg.essential.network.connectionmanager.notices;

import java.util.concurrent.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.*;
import gg.essential.notices.model.*;
import gg.essential.notices.*;
import java.util.*;
import gg.essential.network.cosmetics.*;

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
