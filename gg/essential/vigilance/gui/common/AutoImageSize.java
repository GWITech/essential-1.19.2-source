package gg.essential.vigilance.gui.common;

import gg.essential.elementa.components.image.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.utils.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.resolution.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0001H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013" }, d2 = { "Lgg/essential/vigilance/gui/common/AutoImageSize;", "Lgg/essential/elementa/components/image/CacheableImage;", "component", "Lgg/essential/elementa/UIComponent;", "alwaysOverrideSize", "", "(Lgg/essential/elementa/UIComponent;Z)V", "appearsDefault", "constraint", "Lgg/essential/elementa/constraints/SuperConstraint;", "", "appearsDefaultOrOverridable", "applyTexture", "", "texture", "Lgg/essential/universal/utils/ReleasedDynamicTexture;", "supply", "image", "AutomaticImageSizeConstraint", "Vigilance" })
public final class AutoImageSize implements CacheableImage
{
    @NotNull
    private final UIComponent component;
    private final boolean alwaysOverrideSize;
    
    public AutoImageSize(@NotNull final UIComponent component, final boolean alwaysOverrideSize) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        super();
        this.component = component;
        this.alwaysOverrideSize = alwaysOverrideSize;
    }
    
    public AutoImageSize(final UIComponent component, boolean alwaysOverrideSize, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            alwaysOverrideSize = false;
        }
        this(component, alwaysOverrideSize);
    }
    
    @Override
    public void applyTexture(@Nullable final ReleasedDynamicTexture texture) {
        if (texture == null) {
            return;
        }
        final UIConstraints constraints = this.component.getConstraints();
        if (this.alwaysOverrideSize || (this.appearsDefaultOrOverridable(constraints.getWidth()) && this.appearsDefaultOrOverridable(constraints.getHeight()))) {
            final UIComponent $this$constrain$iv = this.component;
            final int $i$f$constrain = 0;
            final UIComponent $this$constrain_u24lambda_u2d0$iv = $this$constrain$iv;
            final int n = 0;
            final UIConstraints $this$applyTexture_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            final int n2 = 0;
            $this$applyTexture_u24lambda_u2d0.setWidth(new AutomaticImageSizeConstraint(texture.getWidth()));
            $this$applyTexture_u24lambda_u2d0.setHeight(new AutomaticImageSizeConstraint(texture.getHeight()));
        }
    }
    
    private final boolean appearsDefault(final SuperConstraint<Float> constraint) {
        return constraint instanceof PixelConstraint && ((PixelConstraint)constraint).getValue() == 0.0f && !((PixelConstraint)constraint).getAlignOpposite() && !((PixelConstraint)constraint).getAlignOutside();
    }
    
    private final boolean appearsDefaultOrOverridable(final SuperConstraint<Float> constraint) {
        return constraint instanceof AutomaticImageSizeConstraint || this.appearsDefault(constraint);
    }
    
    @Override
    public void supply(@NotNull final CacheableImage image) {
        Intrinsics.checkNotNullParameter((Object)image, "image");
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!" }, d2 = { "Lgg/essential/vigilance/gui/common/AutoImageSize$AutomaticImageSizeConstraint;", "Lgg/essential/elementa/constraints/WidthConstraint;", "Lgg/essential/elementa/constraints/HeightConstraint;", "value", "", "(I)V", "cachedValue", "", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getHeightImpl", "component", "getWidthImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Vigilance" })
    public static final class AutomaticImageSizeConstraint implements WidthConstraint, HeightConstraint
    {
        private final int value;
        private float cachedValue;
        private boolean recalculate;
        @Nullable
        private UIComponent constrainTo;
        
        public AutomaticImageSizeConstraint(final int value) {
            super();
            this.value = value;
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
        public float getHeightImpl(@NotNull final UIComponent component) {
            Intrinsics.checkNotNullParameter((Object)component, "component");
            return (float)this.value;
        }
        
        @Override
        public float getWidthImpl(@NotNull final UIComponent component) {
            Intrinsics.checkNotNullParameter((Object)component, "component");
            return (float)this.value;
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
}
