package gg.essential.handlers;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import kotlin.properties.*;
import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0004\b\u0002\u0010\u0003""" }, d2 = { "<anonymous>", "", "invoke", "()Ljava/lang/Boolean;" })
static final class PauseMenuDisplay$init$collapsed$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ State<Boolean> $isCompact;
    final /* synthetic */ ReadWriteProperty<Object, UIContainer> $bottomButton$delegate;
    
    PauseMenuDisplay$init$collapsed$1(final State<Boolean> $isCompact, final ReadWriteProperty<Object, UIContainer> $bottomButton$delegate) {
        this.$isCompact = $isCompact;
        this.$bottomButton$delegate = $bottomButton$delegate;
        super(0);
    }
    
    @NotNull
    public final Boolean invoke() {
        return this.$isCompact.get() ? (PauseMenuDisplay.Companion.getWindow().getHeight() < 250.0f || PauseMenuDisplay.Companion.getWindow().getWidth() < 430.0f) : (PauseMenuDisplay.Companion.getWindow().getWidth() - PauseMenuDisplay.access$init$lambda-1(this.$bottomButton$delegate).getRight() < 136.0f || PauseMenuDisplay.Companion.getWindow().getHeight() - PauseMenuDisplay.access$init$lambda-1(this.$bottomButton$delegate).getBottom() < 28.0f);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}