package gg.essential.gui.about.components;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\b¨\u0006	""" }, d2 = { "Lgg/essential/gui/about/components/LinkPage;", "Lgg/essential/gui/about/components/Page;", "name", "Lgg/essential/elementa/state/BasicState;", "", "link", "(Lgg/essential/elementa/state/BasicState;Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "essential" })
public final class LinkPage extends Page
{
    @NotNull
    private final String link;
    
    public LinkPage(@NotNull final BasicState<String> name, @NotNull final String link) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)link, "link");
        super(name);
        this.link = link;
    }
    
    @NotNull
    public final String getLink() {
        return this.link;
    }
}
