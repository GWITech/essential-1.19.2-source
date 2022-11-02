package gg.essential.api.gui;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.*;
import kotlin.jvm.*;
import gg.essential.api.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000b
                                                   \u0002\b)
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020>H\u0007R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\b
                                                   \u0010\u000b\u001a\u0004\b\u0006\u0010\u0007"\u0004\b\b\u0010	R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u000e\u0010\u000f"\u0004\b\u0010\u0010\u0011R+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015"\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\rX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001a\u0010\u000f"\u0004\b\u001b\u0010\u0011R+\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001d\u0010\u0007"\u0004\b\u001e\u0010	R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b!\u0010\u000f"\u0004\b"\u0010\u0011R+\u0010#\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\b&\u0010\u000b\u001a\u0004\b$\u0010\u0015"\u0004\b%\u0010\u0017R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\rX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b(\u0010\u000f"\u0004\b)\u0010\u0011R+\u0010*\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\b-\u0010\u000b\u001a\u0004\b+\u0010\u0015"\u0004\b,\u0010\u0017R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120\rX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b/\u0010\u000f"\u0004\b0\u0010\u0011R\u001a\u00101\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b2\u0010\u0015"\u0004\b3\u0010\u0017R+\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\b7\u0010\u000b\u001a\u0004\b5\u0010\u0007"\u0004\b6\u0010	R \u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b9\u0010\u000f"\u0004\b:\u0010\u0011¨\u0006?""" }, d2 = { "Lgg/essential/api/gui/IconButtonBuilder;", "", "()V", "<set-?>", "", "buttonText", "getButtonText", "()Ljava/lang/String;", "setButtonText", "(Ljava/lang/String;)V", "buttonText$delegate", "Lgg/essential/elementa/state/State;", "buttonTextState", "Lgg/essential/elementa/state/State;", "getButtonTextState", "()Lgg/essential/elementa/state/State;", "setButtonTextState", "(Lgg/essential/elementa/state/State;)V", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled$delegate", "enabledState", "getEnabledState", "setEnabledState", "iconResource", "getIconResource", "setIconResource", "iconResource$delegate", "iconResourceState", "getIconResourceState", "setIconResourceState", "iconShadow", "getIconShadow", "setIconShadow", "iconShadow$delegate", "iconShadowState", "getIconShadowState", "setIconShadowState", "textShadow", "getTextShadow", "setTextShadow", "textShadow$delegate", "textShadowState", "getTextShadowState", "setTextShadowState", "tooltipBelowComponent", "getTooltipBelowComponent", "setTooltipBelowComponent", "tooltipText", "getTooltipText", "setTooltipText", "tooltipText$delegate", "tooltipTextState", "getTooltipTextState", "setTooltipTextState", "build", "Lgg/essential/elementa/UIComponent;", "factory", "Lgg/essential/api/gui/EssentialComponentFactory;", "essential-api" })
@ApiStatus.Internal
public final class IconButtonBuilder
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private State<String> iconResourceState;
    @NotNull
    private State<String> tooltipTextState;
    @NotNull
    private State<Boolean> enabledState;
    @NotNull
    private State<String> buttonTextState;
    @NotNull
    private State<Boolean> iconShadowState;
    @NotNull
    private State<Boolean> textShadowState;
    @NotNull
    private final State iconResource$delegate;
    @NotNull
    private final State tooltipText$delegate;
    @NotNull
    private final State enabled$delegate;
    @NotNull
    private final State buttonText$delegate;
    @NotNull
    private final State iconShadow$delegate;
    @NotNull
    private final State textShadow$delegate;
    private boolean tooltipBelowComponent;
    
    public IconButtonBuilder() {
        super();
        this.iconResourceState = new BasicState<String>("");
        this.tooltipTextState = new BasicState<String>("");
        this.enabledState = new BasicState<Boolean>(true);
        this.buttonTextState = new BasicState<String>("");
        this.iconShadowState = new BasicState<Boolean>(true);
        this.textShadowState = new BasicState<Boolean>(true);
        this.iconResource$delegate = this.iconResourceState;
        this.tooltipText$delegate = this.tooltipTextState;
        this.enabled$delegate = this.enabledState;
        this.buttonText$delegate = this.buttonTextState;
        this.iconShadow$delegate = this.iconShadowState;
        this.textShadow$delegate = this.textShadowState;
        this.tooltipBelowComponent = true;
    }
    
    @NotNull
    public final State<String> getIconResourceState() {
        return this.iconResourceState;
    }
    
    public final void setIconResourceState(@NotNull final State<String> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.iconResourceState = <set-?>;
    }
    
    @NotNull
    public final State<String> getTooltipTextState() {
        return this.tooltipTextState;
    }
    
    public final void setTooltipTextState(@NotNull final State<String> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.tooltipTextState = <set-?>;
    }
    
    @NotNull
    public final State<Boolean> getEnabledState() {
        return this.enabledState;
    }
    
    public final void setEnabledState(@NotNull final State<Boolean> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.enabledState = <set-?>;
    }
    
    @NotNull
    public final State<String> getButtonTextState() {
        return this.buttonTextState;
    }
    
    public final void setButtonTextState(@NotNull final State<String> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.buttonTextState = <set-?>;
    }
    
    @NotNull
    public final State<Boolean> getIconShadowState() {
        return this.iconShadowState;
    }
    
    public final void setIconShadowState(@NotNull final State<Boolean> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.iconShadowState = <set-?>;
    }
    
    @NotNull
    public final State<Boolean> getTextShadowState() {
        return this.textShadowState;
    }
    
    public final void setTextShadowState(@NotNull final State<Boolean> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.textShadowState = <set-?>;
    }
    
    @NotNull
    public final String getIconResource() {
        return (String)EssentialComponentFactoryKt.access$getValue(this.iconResource$delegate, this, IconButtonBuilder.$$delegatedProperties[0]);
    }
    
    public final void setIconResource(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        EssentialComponentFactoryKt.access$setValue(this.iconResource$delegate, this, IconButtonBuilder.$$delegatedProperties[0], <set-?>);
    }
    
    @NotNull
    public final String getTooltipText() {
        return (String)EssentialComponentFactoryKt.access$getValue(this.tooltipText$delegate, this, IconButtonBuilder.$$delegatedProperties[1]);
    }
    
    public final void setTooltipText(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        EssentialComponentFactoryKt.access$setValue(this.tooltipText$delegate, this, IconButtonBuilder.$$delegatedProperties[1], <set-?>);
    }
    
    public final boolean getEnabled() {
        return (boolean)EssentialComponentFactoryKt.access$getValue(this.enabled$delegate, this, IconButtonBuilder.$$delegatedProperties[2]);
    }
    
    public final void setEnabled(final boolean <set-?>) {
        EssentialComponentFactoryKt.access$setValue(this.enabled$delegate, this, IconButtonBuilder.$$delegatedProperties[2], <set-?>);
    }
    
    @NotNull
    public final String getButtonText() {
        return (String)EssentialComponentFactoryKt.access$getValue(this.buttonText$delegate, this, IconButtonBuilder.$$delegatedProperties[3]);
    }
    
    public final void setButtonText(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        EssentialComponentFactoryKt.access$setValue(this.buttonText$delegate, this, IconButtonBuilder.$$delegatedProperties[3], <set-?>);
    }
    
    public final boolean getIconShadow() {
        return (boolean)EssentialComponentFactoryKt.access$getValue(this.iconShadow$delegate, this, IconButtonBuilder.$$delegatedProperties[4]);
    }
    
    public final void setIconShadow(final boolean <set-?>) {
        EssentialComponentFactoryKt.access$setValue(this.iconShadow$delegate, this, IconButtonBuilder.$$delegatedProperties[4], <set-?>);
    }
    
    public final boolean getTextShadow() {
        return (boolean)EssentialComponentFactoryKt.access$getValue(this.textShadow$delegate, this, IconButtonBuilder.$$delegatedProperties[5]);
    }
    
    public final void setTextShadow(final boolean <set-?>) {
        EssentialComponentFactoryKt.access$setValue(this.textShadow$delegate, this, IconButtonBuilder.$$delegatedProperties[5], <set-?>);
    }
    
    public final boolean getTooltipBelowComponent() {
        return this.tooltipBelowComponent;
    }
    
    public final void setTooltipBelowComponent(final boolean <set-?>) {
        this.tooltipBelowComponent = <set-?>;
    }
    
    @JvmOverloads
    @NotNull
    public final UIComponent build(@NotNull final EssentialComponentFactory factory) {
        Intrinsics.checkNotNullParameter((Object)factory, "factory");
        return factory.build(this);
    }
    
    public static /* synthetic */ UIComponent build$default(final IconButtonBuilder iconButtonBuilder, EssentialComponentFactory essentialComponentFactory, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            essentialComponentFactory = EssentialAPI.Companion.getEssentialComponentFactory();
        }
        return iconButtonBuilder.build(essentialComponentFactory);
    }
    
    @JvmOverloads
    @NotNull
    public final UIComponent build() {
        return build$default(this, null, 1, null);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)IconButtonBuilder.class, "iconResource", "getIconResource()Ljava/lang/String;", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)IconButtonBuilder.class, "tooltipText", "getTooltipText()Ljava/lang/String;", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)IconButtonBuilder.class, "enabled", "getEnabled()Z", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)IconButtonBuilder.class, "buttonText", "getButtonText()Ljava/lang/String;", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)IconButtonBuilder.class, "iconShadow", "getIconShadow()Z", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)IconButtonBuilder.class, "textShadow", "getTextShadow()Z", 0)) };
    }
}
