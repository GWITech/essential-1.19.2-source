package gg.essential.gui.common;

import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.constraints.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   \b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010\bj\u0002\b
                                                   j\u0002\b\u000bj\u0002\b\fj\u0002\b¨\u0006\u000e""" }, d2 = { "Lgg/essential/gui/common/MenuButton$Alignment;", "", "constraint", "Lkotlin/Function0;", "Lgg/essential/elementa/constraints/XConstraint;", "noPadding", "(Ljava/lang/String;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getConstraint", "()Lkotlin/jvm/functions/Function0;", "getNoPadding", "LEFT", "LEFT_SMALL_PADDING", "CENTER", "RIGHT", "essential" })
public enum Alignment
{
    @NotNull
    private final Function0<XConstraint> constraint;
    @NotNull
    private final Function0<XConstraint> noPadding;
    
    LEFT("LEFT", 0, (Function0<? extends XConstraint>)MenuButton$Alignment$1.INSTANCE, (Function0<? extends XConstraint>)MenuButton$Alignment$2.INSTANCE), 
    LEFT_SMALL_PADDING("LEFT_SMALL_PADDING", 1, (Function0<? extends XConstraint>)MenuButton$Alignment$3.INSTANCE, (Function0<? extends XConstraint>)MenuButton$Alignment$4.INSTANCE), 
    CENTER("CENTER", 2, (Function0<? extends XConstraint>)MenuButton$Alignment$5.INSTANCE, (Function0<? extends XConstraint>)MenuButton$Alignment$6.INSTANCE), 
    RIGHT("RIGHT", 3, (Function0<? extends XConstraint>)MenuButton$Alignment$7.INSTANCE, (Function0<? extends XConstraint>)MenuButton$Alignment$8.INSTANCE);
    
    private static final /* synthetic */ Alignment[] $VALUES;
    
    private Alignment(final String $enum$name, final int $enum$ordinal, final Function0<? extends XConstraint> constraint, final Function0<? extends XConstraint> noPadding) {
        this.constraint = (Function0<XConstraint>)constraint;
        this.noPadding = (Function0<XConstraint>)noPadding;
    }
    
    @NotNull
    public final Function0<XConstraint> getConstraint() {
        return this.constraint;
    }
    
    @NotNull
    public final Function0<XConstraint> getNoPadding() {
        return this.noPadding;
    }
    
    public static Alignment[] values() {
        return Alignment.$VALUES.clone();
    }
    
    public static Alignment valueOf(final String value) {
        return Enum.valueOf(Alignment.class, value);
    }
    
    private static final /* synthetic */ Alignment[] $values() {
        return new Alignment[] { Alignment.LEFT, Alignment.LEFT_SMALL_PADDING, Alignment.CENTER, Alignment.RIGHT };
    }
    
    static {
        $VALUES = $values();
    }
}
