package gg.essential.gui.common.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.markdown.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0007
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020
                                                   H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006"\u0004\b\u0007\u0010\bR\u001c\u0010	\u001a\u0004\u0018\u00010
                                                   X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u000b\u0010\f"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0011\u0010\u0012"\u0004\b\u0013\u0010\u0014¨\u0006\u001d""" }, d2 = { "Lgg/essential/gui/common/constraints/MarkdownContentWidthConstraint;", "Lgg/essential/elementa/constraints/WidthConstraint;", "()V", "cachedValue", "", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getWidthImpl", "component", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "essential" })
public final class MarkdownContentWidthConstraint implements WidthConstraint
{
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public MarkdownContentWidthConstraint() {
        super();
        this.recalculate = true;
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
        final UIComponent constrainTo = this.getConstrainTo();
        final MarkdownComponent markdownComponent = (constrainTo instanceof MarkdownComponent) ? ((MarkdownComponent)constrainTo) : null;
        if (markdownComponent == null) {
            throw new UnsupportedOperationException("MarkdownContentWidthConstraint can only be constrained to MarkdownComponents");
        }
        final MarkdownComponent markdown = markdownComponent;
        return markdown.getMaxTextLineWidth();
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
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
