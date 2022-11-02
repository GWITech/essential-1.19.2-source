package gg.essential.gui.friends.tabs;

import kotlin.*;
import gg.essential.gui.friends.*;
import gg.essential.gui.friends.state.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000\b&\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\b\u0010#\u001a\u00020$H&J\u0010\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010'R\u001d\u0010	\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0
                                                   ¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010"¨\u0006(""" }, d2 = { "Lgg/essential/gui/friends/tabs/TabComponent;", "Lgg/essential/gui/common/HollowUIContainer;", "tab", "Lgg/essential/gui/friends/Tab;", "gui", "Lgg/essential/gui/friends/SocialMenu;", "selectedTab", "Lgg/essential/elementa/state/State;", "(Lgg/essential/gui/friends/Tab;Lgg/essential/gui/friends/SocialMenu;Lgg/essential/elementa/state/State;)V", "active", "Lgg/essential/elementa/state/MappedState;", "", "getActive", "()Lgg/essential/elementa/state/MappedState;", "getGui", "()Lgg/essential/gui/friends/SocialMenu;", "messengerStates", "Lgg/essential/gui/friends/state/IMessengerStates;", "getMessengerStates", "()Lgg/essential/gui/friends/state/IMessengerStates;", "relationshipStates", "Lgg/essential/gui/friends/state/IRelationshipStates;", "getRelationshipStates", "()Lgg/essential/gui/friends/state/IRelationshipStates;", "stateManager", "Lgg/essential/gui/friends/state/SocialStateManager;", "getStateManager", "()Lgg/essential/gui/friends/state/SocialStateManager;", "getTab", "()Lgg/essential/gui/friends/Tab;", "userLists", "", "Lgg/essential/elementa/components/ScrollComponent;", "getUserLists", "()Ljava/util/List;", "populate", "", "search", "username", "", "essential" })
public abstract class TabComponent extends HollowUIContainer
{
    @NotNull
    private final Tab tab;
    @NotNull
    private final SocialMenu gui;
    @NotNull
    private final SocialStateManager stateManager;
    @NotNull
    private final IMessengerStates messengerStates;
    @NotNull
    private final MappedState<Tab, Boolean> active;
    
    public TabComponent(@NotNull final Tab tab, @NotNull final SocialMenu gui, @NotNull final State<Tab> selectedTab) {
        Intrinsics.checkNotNullParameter((Object)tab, "tab");
        Intrinsics.checkNotNullParameter((Object)gui, "gui");
        Intrinsics.checkNotNullParameter((Object)selectedTab, "selectedTab");
        super();
        this.tab = tab;
        this.gui = gui;
        this.stateManager = this.gui.getSocialStateManager();
        this.messengerStates = this.stateManager.getMessengerStates();
        this.stateManager.getRelationshipStates();
        this.active = selectedTab.map((kotlin.jvm.functions.Function1<? super Tab, ? extends Boolean>)new TabComponent$active.TabComponent$active$1(this));
        StateExtensionsKt.bindParent$default$6fcd5b6b(this, this.gui.getContent(), this.active, false, null, 12);
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setWidth(UtilitiesKt.getPercent(100));
        $this$_init__u24lambda_u2d0.setHeight(UtilitiesKt.getPercent(100));
    }
    
    @NotNull
    protected final Tab getTab() {
        return this.tab;
    }
    
    @NotNull
    protected final SocialMenu getGui() {
        return this.gui;
    }
    
    @NotNull
    public final IMessengerStates getMessengerStates() {
        return this.messengerStates;
    }
    
    @NotNull
    public final MappedState<Tab, Boolean> getActive() {
        return this.active;
    }
    
    @NotNull
    public abstract List<ScrollComponent> getUserLists();
    
    public final void search(@Nullable final String username) {
        String lowerCase2;
        if (username != null) {
            Intrinsics.checkNotNullExpressionValue((Object)(lowerCase2 = username.toLowerCase(Locale.ROOT)), "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        else {
            lowerCase2 = null;
        }
        final String lowerCase = lowerCase2;
        for (final ScrollComponent list : this.getUserLists()) {
            list.filterChildren((Function1<? super UIComponent, Boolean>)new TabComponent$search.TabComponent$search$1(lowerCase));
        }
    }
}
