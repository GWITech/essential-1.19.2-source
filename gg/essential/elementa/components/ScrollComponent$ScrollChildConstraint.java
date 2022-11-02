package gg.essential.elementa.components;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016R\u001a\u0010\u0006\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&" }, d2 = { "Lgg/essential/elementa/components/ScrollComponent$ScrollChildConstraint;", "Lgg/essential/elementa/constraints/WidthConstraint;", "Lgg/essential/elementa/constraints/HeightConstraint;", "padding", "", "(Lgg/essential/elementa/components/ScrollComponent;F)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "maxConstraint", "Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;", "getPadding", "()F", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "sumConstraint", "Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;", "getHeightImpl", "component", "getWidthImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class ScrollChildConstraint implements WidthConstraint, HeightConstraint
{
    private final float padding;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    @NotNull
    private final ChildBasedSizeConstraint sumConstraint;
    @NotNull
    private final ChildBasedMaxSizeConstraint maxConstraint;
    final /* synthetic */ ScrollComponent this$0;
    
    public ScrollChildConstraint(final ScrollComponent this$0, final float padding) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this.this$0 = this$0;
        super();
        this.padding = padding;
        this.recalculate = true;
        this.sumConstraint = new ChildBasedSizeConstraint(this.padding);
        this.maxConstraint = new ChildBasedMaxSizeConstraint();
    }
    
    public ScrollChildConstraint(final ScrollComponent scrollComponent, float padding, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        this.this$0 = scrollComponent;
        if ((n & 0x1) != 0x0) {
            padding = 0.0f;
        }
        this(scrollComponent, padding);
    }
    
    public final float getPadding() {
        return this.padding;
    }
    
    @NotNull
    @Override
    public Float getCachedValue() {
        return this.cachedValue;
    }
    
    public void setCachedValue(final float <set-?>) {
        this.cachedValue = <set-?>;
    }
    
    @Override
    public boolean getRecalculate() {
        return this.recalculate;
    }
    
    @Override
    public void setRecalculate(final boolean <set-?>) {
        this.recalculate = <set-?>;
    }
    
    @Nullable
    @Override
    public UIComponent getConstrainTo() {
        return this.constrainTo;
    }
    
    @Override
    public void setConstrainTo(@Nullable final UIComponent <set-?>) {
        this.constrainTo = <set-?>;
    }
    
    @Override
    public float getWidthImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final SizeConstraint sizeConstraint;
        final SizeConstraint constraint = sizeConstraint = (ScrollComponent.access$getHorizontalScrollEnabled$p(this.this$0) ? this.sumConstraint : ((SizeConstraint)this.maxConstraint));
        UIComponent constrainTo;
        if ((constrainTo = this.getConstrainTo()) == null) {
            constrainTo = ScrollComponent.access$getActualHolder$p(this.this$0);
        }
        sizeConstraint.setConstrainTo(constrainTo);
        return constraint.getWidthImpl(component);
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final SizeConstraint sizeConstraint;
        final SizeConstraint constraint = sizeConstraint = (ScrollComponent.access$getVerticalScrollEnabled$p(this.this$0) ? this.sumConstraint : ((SizeConstraint)this.maxConstraint));
        UIComponent constrainTo;
        if ((constrainTo = this.getConstrainTo()) == null) {
            constrainTo = ScrollComponent.access$getActualHolder$p(this.this$0);
        }
        sizeConstraint.setConstrainTo(constrainTo);
        return constraint.getHeightImpl(component);
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        switch (ScrollChildConstraint.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: {
                visitor.visitChildren(ConstraintType.WIDTH);
                break;
            }
            case 2: {
                visitor.visitChildren(ConstraintType.HEIGHT);
                break;
            }
            default: {
                throw new IllegalArgumentException(type.getPrettyName());
            }
        }
    }
    
    @Override
    public /* bridge */ Object getCachedValue() {
        return this.getCachedValue();
    }
    
    @Override
    public /* bridge */ void setCachedValue(final Object <set-?>) {
        this.setCachedValue(((Number)<set-?>).floatValue());
    }
}
