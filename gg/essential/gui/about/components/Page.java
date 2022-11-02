package gg.essential.gui.about.components;

import gg.essential.elementa.components.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b""" }, d2 = { "Lgg/essential/gui/about/components/Page;", "Lgg/essential/elementa/components/UIContainer;", "name", "Lgg/essential/elementa/state/BasicState;", "", "(Lgg/essential/elementa/state/BasicState;)V", "getName", "()Lgg/essential/elementa/state/BasicState;", "essential" })
public abstract class Page extends UIContainer
{
    @NotNull
    private final BasicState<String> name;
    
    public Page(@NotNull final BasicState<String> name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        super();
        this.name = name;
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setWidth(UtilitiesKt.getPercent(100));
        $this$_init__u24lambda_u2d0.setHeight(new ChildBasedRangeConstraint());
    }
    
    @NotNull
    public final BasicState<String> getName() {
        return this.name;
    }
}
